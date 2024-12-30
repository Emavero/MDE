# Training script for the pipeline: test_pipeline
import argparse
import os

def train(algorithm, params):
    print(f"Training model using {algorithm} with parameters:")
    for key, value in params.items():
        print(f"  {key}: {value}")
    # Placeholder for actual training logic
    print("Training complete!")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Train a machine learning model.")
    parser.add_argument("--algorithm", type=str, required=True, help="Algorithm to use for training.")
    
    # Add parameters as arguments
    parser.add_argument("--n_estimators", type=str, default="100", help="n_estimators parameter.")

    args = parser.parse_args()
    params = {
        "n_estimators": args.n_estimators,
    }

    train(args.algorithm, params)
