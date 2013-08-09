class BookDetail
  include Mongoid::Document

  field :_id, type:ObjectId
  field :b_id, type: Integer
  field :b_title, type:String
  field :b_category, type: String
  field :b_author, type: String
  field :b_translator, type: String
  field :b_publisher, type: String
  field :b_publishDate, type: DateTime
  field :b_date, type: Date
end
