cmake_minimum_required(VERSION 3.10)
project(native-sample LANGUAGES C CXX)

add_library(native-sample SHARED src/main/cpp/native-sample.cpp)

find_library(LOG_LIB log)

target_link_libraries(native-sample PRIVATE ${LOG_LIB})
