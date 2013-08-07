class BookDetail < Book
  include Mongoid::Document

  belongs_to :book

  field :b_id, type: Integer
  field :b_title, type: String
  field :b_category, type: String
  field :b_author, type: String
  field :b_translator, type: String
  field :b_publisher, type: String
  field :b_publishDate, type: Time
  field :b_date, type: Time
end

