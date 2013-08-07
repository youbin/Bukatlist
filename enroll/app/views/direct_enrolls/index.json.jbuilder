json.array!(@direct_enrolls) do |direct_enroll|
  json.extract! direct_enroll, :title, :category, :author, :translator, :publisher, :date
  json.url direct_enroll_url(direct_enroll, format: :json)
end
