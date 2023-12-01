package com.example.qazspotting.presentation.onboarding.components


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.qazspotting.R
import com.example.qazspotting.presentation.Dimentions
import com.example.qazspotting.presentation.onboarding.Page
import com.example.qazspotting.presentation.onboarding.pages
import com.example.qazspotting.presentation.theme.ui.QazSpottingTheme

@SuppressLint("PrivateResource")
@Composable
fun OnBoardingPage(
    modifier: Modifier,
    page: Page,
) {

    Column(modifier = modifier) {
        Image(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(
            modifier = Modifier
                .height(
                    Dimentions.mediumPadding1
                ))
        Text(
            text = page.title,
            modifier = Modifier
                .padding(horizontal = Dimentions.mediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.black)
        )

        Text(
            text = page.description,
            modifier = Modifier
                .padding(horizontal = Dimentions.mediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.black)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    QazSpottingTheme {
        OnBoardingPage(page = pages[0], modifier = Modifier)
    }
}















