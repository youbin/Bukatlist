class Book
  require 'autoinc'
  include Mongoid::Document
  include Mongoid::Autoinc

  field :_id, type: ObjectId
  field :b_id, type: Integer
  field :b_title, type: String
  field :b_thumb, type: String
  field :b_totalStar, type: Integer
  field :b_starNum, type: Integer
  field :b_likeCount, type: Integer
  field :b_belongCount, type: Integer
  auto_increment :_id
end


