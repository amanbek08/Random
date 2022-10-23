// use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Cafe 7", "McDonalds", "Burger King"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(id.cafe_list)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->
            if (position == 0){
                val intent = Intent(this, Reserve1Activity::class.java)
                startActivity(intent)
            }
            if (position == 1){
                Toast.makeText(baseContext, "McDonalds", Toast.LENGTH_SHORT).show()
            }

            if (position == 2){
                Toast.makeText(baseContext, "Burger King", Toast.LENGTH_SHORT).show()
            }
        }
