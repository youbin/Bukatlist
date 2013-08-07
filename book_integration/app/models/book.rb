class Book
  include Mongoid::Document

  has_one :bookDetail

  field :b_id, type: Integer
  field :b_title, type: String
  field :b_thumb, type: String
  field :b_totalStar, type: Integer
  field :b_starNum, type: Integer
  field :b_likeCount, type: Integer
  field :b_belongCount, type: Integer
end

