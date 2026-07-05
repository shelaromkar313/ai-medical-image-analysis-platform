# Medical Image Analysis Frontend

React + TypeScript frontend for the Medical Image Analysis Platform.

## Technology Stack

- React 18
- TypeScript
- Material UI (MUI)
- Tailwind CSS
- Redux Toolkit
- React Router
- Recharts

## Prerequisites

- Node.js 18+
- npm or yarn

## Installation

1. Navigate to frontend directory
```bash
cd frontend
```

2. Install dependencies
```bash
npm install
```

3. Start development server
```bash
npm run dev
```

The application will be available at http://localhost:5173

## Build for Production

```bash
npm run build
```

## Project Structure

```
src/
├── components/       # Reusable components
├── pages/           # Page components
├── layouts/         # Layout components
├── services/        # API services
├── store/           # Redux store
├── styles/          # Global styles
├── types/           # TypeScript types
├── utils/           # Utility functions
└── assets/          # Static assets
```

## Docker Build

```bash
docker build -t medical-ai/frontend .
```
