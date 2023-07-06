#!/usr/bin/env groovy

def greeting(Map config [:] ) {
  sh "echo Greeting! Lord ${config.name}! Shall the ${config.pipeline} pipeline begine?" 
}