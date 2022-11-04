val textView = TextView(this)
textView.apply {
    visibility = View.VISIBLE
    text = "Hello world !"
    textSize = 19f
    maxLines = 3
}
//au lieu de 
/*TextView textView = new TextView(this);
textView.setVisibility(View.VISIBLE);
textView.setText("Hello world !");
textView.setTextSize(19f);
textView.setMaxLines(3); */



