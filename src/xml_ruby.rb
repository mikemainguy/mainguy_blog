
require "rexml/element"
require 'rubygems'
require 'rexml/parsers/pullparser'
require 'rexml/document'


total_count = 0
entry_count = 0
start = Time.new
#data = .read
puts Time.new-start
output =""
enddoc = ""
1.times  do
  enddoc = REXML::Document.new open("../data/test_file.xml")
end

100.times do
  output << enddoc.elements['//crow/text()'].to_s
end
puts "#{Time.new-start} #{enddoc.elements['//crow/text()']} #{output}"

