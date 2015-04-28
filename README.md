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
Found response content type:  application/json
Top:
	Pete Kozma singles on a line drive to left fielder Jayson Werth.  
	Jon Jay lines out to center fielder Denard Span.  
	Yadier Molina strikes out swinging.  Pete Kozma steals (1) 2nd base.  
	Kolten Wong grounds out, second baseman Danny Espinosa to first baseman Ryan Zimmerman.  
Bottom:
	Bryce Harper strikes out swinging, catcher Yadier Molina to first baseman Matt Adams.  
	Ryan Zimmerman lines out to center fielder Jon Jay.  
	Yunel Escobar homers (2) on a line drive to left center field.

...

### Bugs

...


## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
