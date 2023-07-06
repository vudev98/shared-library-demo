#!/usr/bin/env groovy

def call(Map config [:] ) {
  sh "echo Greeting! Lord ${config.name}! Shall the ${config.pipeline} pipeline begine?" 
}