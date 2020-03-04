# Google-Sheets-as-Database-2

Google-Sheets-as-Database-2 is an android app which demonstrates google sheets to be used as a database

## Pre-requisite

Make sure you have a google sheet created with name and country as the title in row 1 of your sheet.

| name | country|
| ----|:-----:|
| A | X |
| B | Y |
| C | Z |

## Usage
Make sure to have read/write access of sheet for the respective task of reading/write. To read content from file replace your sheet id in ```Constant``` class

```kotlin
const val SHEET_ID = "YOUR SPREAD SHEET ID"
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update the tests as appropriate.
