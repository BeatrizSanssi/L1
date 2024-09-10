# Use the official Node.js image for building the frontend
FROM node:18 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the package.json and package-lock.json
COPY package*.json ./

# Install the frontend dependencies
RUN npm install

# Copy the source code to the container
COPY ./ /app/static/

# Build the frontend application (if needed, like React or Vue)
# If you are not building, skip this step
# RUN npm run build

# Serve the static files using an Express server
CMD ["node", "server.js"]