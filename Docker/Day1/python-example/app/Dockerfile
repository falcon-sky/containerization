# Create image based on the official python 3.8 image from dockerhub
FROM python:3.8

# Create directory where our app will be placed
RUN mkdir -p /usr/src/app

# Change directory so that our command run from this new directory
WORKDIR /usr/src/app

# Copy dependency and app code
COPY . /usr/src/app

# Install required dependency
RUN pip3 install -r requirements.txt

# Provide the instruction to start application or Entrypoint to start the application
ENTRYPOINT ["python"]

#Specifies what command to run within the container.
CMD ["app.py"]
