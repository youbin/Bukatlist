json.array!(@books) do |book|
  json.extract! book, :_id, :b_id, :b_title, :b_thumb, :b_totalStar, :b_starNum, :b_likeCount, :b_belongCount
  json.url book_url(book, format: :json)
end
