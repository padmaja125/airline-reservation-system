# Speech Recognition with Spring Boot

This project demonstrates how to integrate speech recognition capabilities into a Spring Boot application using CMU Sphinx and Google Cloud Speech API.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Introduction

This project provides a Spring Boot application that performs speech recognition. It includes both offline recognition using CMU Sphinx and cloud-based recognition using Google Cloud Speech API.

## Features

- **CMU Sphinx**: Offline speech recognition.
- **Google Cloud Speech API**: Cloud-based speech recognition for higher accuracy and language support.
- RESTful API for speech recognition.

## Prerequisites

- Java Development Kit (JDK) 11 or higher.
- Maven 3.6 or higher.
- Google Cloud account and API key (if using Google Cloud Speech API).

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/speech-recognition-spring-boot.git
    cd speech-recognition-spring-boot
    ```

2. **Configure Google Cloud Speech API**:
    - Set up a Google Cloud project.
    - Enable the Google Cloud Speech API.
    - Download the service account key and set the environment variable:
        ```bash
        export GOOGLE_APPLICATION_CREDENTIALS="path/to/your/service-account-file.json"
        ```

3. **Build the project**:
    ```bash
    mvn clean install
    ```

## Usage

1. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

2. **Access the API**:
    - Use a tool like `curl` or Postman to test the endpoints.

## Endpoints

### CMU Sphinx

- **Recognize Speech**: `/api/speech/recognize`
    ```bash
    GET /api/speech/recognize
    ```

### Google Cloud Speech API

- **Recognize Speech from File**: `/api/google-speech/recognize`
    ```bash
    POST /api/google-speech/recognize
    ```

    **Request Body**:
    ```json
    {
        "filePath": "path/to/audio/file.wav"
    }
    ```

## Configuration

### CMU Sphinx Configuration

Modify the `SpeechRecognitionService` class if you need to change the acoustic model, dictionary, or language model paths.

### Google Cloud Speech API Configuration

Ensure your Google Cloud credentials are set correctly:
```bash
export GOOGLE_APPLICATION_CREDENTIALS="path/to/your/service-account-file.json"
Contributing
Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a new Pull Request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements
CMU Sphinx
Google Cloud Speech API
