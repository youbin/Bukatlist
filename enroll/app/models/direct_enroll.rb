class DirectEnroll
  include Mongoid::Document
  field :title, type: String
  field :category, type: String
  field :author, type: String
  field :translator, type: String
  field :publisher, type: String
  field :date, type: String
end
