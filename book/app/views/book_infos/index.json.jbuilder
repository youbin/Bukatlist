json.array!(@book_infos) do |book_info|
  json.extract! book_info, :b_id, :b_title, :b_thumb, :b_totalStar, :b_starNum, :b_likeCount, :b_belongCount
  json.url book_info_url(book_info, format: :json)
end
