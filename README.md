# README

This is an example of ${VAR} and ${ENV} interpolation.

## Usage

### TOML
```toml
[env]
VAR = "value"
```

### YAML
```yaml
env:
  VAR: "value"
```

## Environment Variable Interpolation

The CLI tool supports environment variable interpolation using `${ENV.VAR_NAME}` syntax.

Example:
```bash
CLI_VAR="example_value"
cli-tool --config .cli-tool.yaml
```

In the configuration file, you can use `${ENV.CLI_VAR}` to reference the environment variable.

## Schema Validation

The configuration files (TOML and YAML) should be validated against a schema to ensure correctness.

## CLI Tool Configuration

The CLI tool loads its configuration from a file named `.cli-tool.yaml` in the current working directory. This file should contain the configuration options for the tool.

Example `.cli-tool.yaml` file:
```yaml
# .cli-tool.yaml
option1: value1
option2: value2
env:
  CLI_VAR: "example_value"
```

The CLI tool will read the configuration file and use the values to configure the tool. If the configuration file is not found, the tool will use default values.

## Notes

- When using the `dry-run` mode, the tool will simulate actions without making any changes to the system.
- The `.cache` directory is used to store temporary data and can be safely deleted if needed.
- When merging nested dictionaries, the CLI tool will recursively merge the values, with values from the latter dictionary taking precedence over the former.