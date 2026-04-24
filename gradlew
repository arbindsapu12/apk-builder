#!/usr/bin/env sh

# Gradle start script

DIR="$(cd "$(dirname "$0")" && pwd)"

"$DIR/gradle/wrapper/gradle-wrapper.jar" "$@"
