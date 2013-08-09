class BookReview
  include Mongoid::Document

  field :_id, type:ObjectId
  field :b_id, type: Integer
  field :b_reviews, type: Array
end
