# Progress Bars

For long-running operations, you can implement progress bars to enhance user experience. Consider using libraries like `progress` or `ora` to display progress in the terminal.

## Example

```javascript
const ProgressBar = require('progress');

const bar = new ProgressBar(':bar', { total: 100 });

const timer = setInterval(() => {
  bar.tick();
  if (bar.complete) {
    clearInterval(timer);
    console.log('Done!');
  }
}, 100);
```
