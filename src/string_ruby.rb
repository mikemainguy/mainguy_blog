def print_comma(*data)
  data.compact.join(',')
end
puts print_comma "Test1","Test2","Test3"
puts print_comma "Test1",nil,"Test3","Test4"

class Array
  def comma_join
    self.compact.join(',')
  end
end

puts ["Test1","Test2","Test3"].comma_join
puts ["Test1",nil,"Test3","Test4"].comma_join


