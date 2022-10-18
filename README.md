# kotlin-react-svg

Reproduce error while using `@svgr/webpack` loader.

Executing `gradlew browserDevelopmentWebpack` gives an error:
```
ERROR in .../build/processedResources/Js/main/img/svg/file.svg
Module not found: Error: Can't resolve 'react' in ...
```

Fixed in commit [svgr fix](https://github.com/sunduev/kotlin-react-svg/commit/80426d9043f91d403157aab9f62243d6009abaaf)
