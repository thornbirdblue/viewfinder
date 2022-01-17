# Viewfinder bash initialization script for dev instances.
#
# Usage (I think .bash_profile is the correct place for this if you want
# it in all your shells.  It's important to use the source command instead
# of executing it directly):
#   source ~/path/to/viewfinder/scripts/viewfinder.bash
#
# Support for non-bash shells is left as an exercise for the reader.

# Get the root of the hg checkout.
ROOT=$(dirname $(dirname ${BASH_SOURCE[0]}))

# Convert to absolute path
ROOT=$(cd $ROOT; pwd)

# VF_HOME is used to set the later variables and also in .hgrc
export VF_HOME=$ROOT

# Python environment.
export PATH=$VF_HOME/third_party/gyp:~/envs/vf-dev/bin:$PATH:~/android_sdk/tools:~/android_sdk/platform-tools:~/android-ndk
export PYTHONPATH=$VF_HOME/third_party/gyp/pylib/gyp:$VF_HOME/pythonpath:$PYTHONPATH

# AWS configuration.  See
# https://sites.google.com/a/viewfinder.co/development/developer-setup/getting-started-with-ec2
export EC2_HOME=$VF_HOME/third_party/aws/ec2-api-tools
export EC2_PRIVATE_KEY=~/.certs/pk-aws.pem
export EC2_CERT=~/.certs/cert-aws.pem
export JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
export PATH=$EC2_HOME/bin:$PATH
export ANDROID_HOME=
# Additional scripts.  Optional but convenient.
export PATH=$VF_HOME/scripts:$PATH
