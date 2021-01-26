package com.example.rb_assign1_repo

import android.graphics.BitmapFactory
import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        val termsTxtView = findViewById<TextView>(R.id.termsTxtView);
        val memberAlreadyTxtView = findViewById<TextView>(R.id.alreadyMemberTxtView);

        fun makeSpannable(text: String, style: StyleSpan, start: Int, end: Int, span: Int = 34) : SpannableString {
            val spannable = SpannableString(text)
            spannable.setSpan( style, start, end, span)
            return spannable
        }
        termsTxtView.text = makeSpannable(
                termsTxtView.text.toString(),
                StyleSpan(Typeface.BOLD),
                20,
                termsTxtView.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        memberAlreadyTxtView.text = makeSpannable(
                memberAlreadyTxtView.text.toString(),
                StyleSpan(Typeface.BOLD),
                25,
                memberAlreadyTxtView.length(),
                Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

    }
}

