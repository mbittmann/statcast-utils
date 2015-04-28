# statcast-utils

A simple utility for parsing MLB statcast 'game_events.json' files with clojure + lein.

## Usage
Use lein or run against uberjar
	$ lein run [args]
    $ java -jar statcast-utils-0.1.0-standalone.jar [args]

## Options

* ':url' -
  The url to the game_events.json file

* ':inning' -
  The inning number

## Examples
$lein run "http://gd2.mlb.com/components/game/mlb/year_2015/month_04/day_21/gid_2015_04_21_slnmlb_wasmlb_1/game_events.json" 10


...

### Bugs

...


## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
