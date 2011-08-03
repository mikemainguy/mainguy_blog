start = Time.new

require 'rubygems'
require 'simple-rss'
require 'open-uri'

total_count = 0
entry_count = 0

data= open("http://mikemainguy.blogspot.com/feeds/posts/default").read
puts Time.new-start
rss = SimpleRSS.parse data
rss.items.each do |item|
  entry_count+=1
  total_count+= item.content.split(" ").count
end

puts "#{total_count}/#{entry_count}=#{total_count/entry_count}"
puts "#{Time.new - start}"
