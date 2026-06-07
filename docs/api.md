# API Documentation

## Overview

This project provides a CLI tool with the following commands:

- `init`: Initialize a new project.
- `build`: Build the project.
- `test`: Run tests.
- `deploy`: Deploy the project.

## Commands

### `init`

Initializes a new project in the current directory.

#### Usage
```bash
cli init
```

#### Options
- `--name`: Specify the project name.
- `--template`: Specify a template to use.

### `build`

Builds the project.

#### Usage
```bash
cli build
```

#### Options
- `--clean`: Clean the build directory before building.

### `test`

Runs tests for the project.

#### Usage
```bash
cli test
```

#### Options
- `--watch`: Watch for changes and re-run tests.

### `deploy`

Deploys the project.

#### Usage
```bash
cli deploy
```

#### Options
- `--env`: Specify the environment to deploy to (e.g., `dev`, `prod`).

## Progress Bar

A progress bar is displayed during long-running operations such as `build` and `test` to provide visual feedback on the operation's progress.