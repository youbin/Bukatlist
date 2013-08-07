json.array!(@book_details) do |book_detail|
  json.extract! book_detail, :b_id, :b_title, :b_category, :b_author, :b_translator, :b_publisher, :b_publishDate, :b_date
  json.url book_detail_url(book_detail, format: :json)
end
