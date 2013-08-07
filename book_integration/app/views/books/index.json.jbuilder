json.array!(@books) do |book|
  json.extract! book, :b_id, :b_title, :b_thumb, :b_totalStar, :b_starNum, :b_likeCount, :b_belongCount, :b_category, :b_author, :b_translator, :b_publisher, :b_publishDate, :b_date
  json.url book_url(book, format: :json)
end
