# Create image based on the official node 14 image from dockerhub
FROM node:14

# Create directory where our app will be placed
RUN mkdir -p /usr/src/app

# Change directory so that our command run from this new directory
WORKDIR /usr/src/app

# Copy dependency and app code
COPY package*.json app.js ./

# Install dependencies
RUN npm install

#Expose the sport the app runs in
EXPOSE 3000

# Provide the instruction to start application or Entrypoint to start the application
ENTRYPOINT ["node"]

#Specifies what command to run within the container.
#CMD [ "node","app.js"]
CMD [ "app.js"]
