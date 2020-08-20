## Usage

Fork the repository and checkout locally.

Then you can test executing the release by

```
$ cd shaper-core
$ ./gradlew release
```

Only releasing the parent/root-project

```
$ ./gradlew :release
```

Only releasing one sub-project

```
$ ./gradlew :server:release
```
