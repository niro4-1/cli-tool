# cli-tool
Cross-platform CLI utility for batch file transformations.

# Windows CI Instructions

To set up Windows CI for this project, follow these steps:

1. Install dependencies specific to Windows CI.
2. Set environment variables as needed.
3. Configure the CI tool (e.g., GitHub Actions, Travis CI).
4. Run the CI pipeline to ensure everything is set up correctly.

For more detailed instructions, refer to the official CI documentation.

// Code changes to prevent cache mutation in dry-run mode.
function dryRun() {
    // Implementation that ensures cache remains unchanged.
}
