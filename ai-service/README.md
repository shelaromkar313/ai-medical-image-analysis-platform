# AI Service - Medical Image Analysis

FastAPI-based microservice for ML/DL model inference.

## Technology Stack

- Python 3.11
- FastAPI
- TensorFlow
- PyTorch
- OpenCV
- Scikit-learn

## Prerequisites

- Python 3.11
- pip

## Installation

1. Navigate to ai-service directory
```bash
cd ai-service
```

2. Create virtual environment
```bash
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate
```

3. Install dependencies
```bash
pip install -r requirements.txt
```

4. Run the service
```bash
python main.py
```

The API will be available at http://localhost:8000

## API Documentation

Access interactive API docs at: http://localhost:8000/docs

## Project Structure

```
├── models/           # Trained ML/DL models
├── api/              # API endpoints
├── services/         # Business logic
├── utils/            # Utility functions
├── preprocessing/    # Image preprocessing
├── explainability/   # XAI implementations
└── tests/            # Test files
```

## Running Tests

```bash
pytest
```

## Docker Build

```bash
docker build -t medical-ai/ai-service .
```
