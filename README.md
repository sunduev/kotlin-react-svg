# kotlin-react-svg

Attempt to use `@svgr/webpack` loader

Executing `gradlew browserDevelopmentWebpack` gives an error
```
ERROR in .../build/processedResources/Js/main/img/svg/file.svg
Module not found: Error: Can't resolve 'react' in ...
```

### Just some thoughts
_(far from expert and even any sense)_

If I get it correct, `svgr` should transform given svg to React Component that actually tries to `import * from "react"` in file..

Maybe this file doesn't "see" react module..
