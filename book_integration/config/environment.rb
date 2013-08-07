# Load the Rails application.
require File.expand_path('../application', __FILE__)

# Initialize the Rails application.
BookIntegration::Application.initialize!

config.frameworks += [:active_record, :active_resouce, :action_mailer]
