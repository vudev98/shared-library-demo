#!/usr/bin/env groovy

def call(Map config=[:] ) {
   echo "Greeting! Lord ${config.name}! Shall the ${config.pipeline} pipeline begin?" 
}