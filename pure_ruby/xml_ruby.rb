

require 'rubygems'
require 'rexml/parsers/pullparser'
require 'rexml/document'


total_count = 0
entry_count = 0
start = Time.new
data =       open("../data/test_file.xml").read
puts Time.new-start
output =""
enddoc = nil
100.times  do
  enddoc = REXML::Document.new data

end


puts Time.new-start

