/*
 * Copyright 2019 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */

@file:Suppress("NOTHING_TO_INLINE")

package splitties.views.dsl.constraintlayout

import android.view.View
import androidx.annotation.Px
import splitties.views.*
import splitties.views.dsl.core.*
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams as LP

inline fun LP.centerHorizontally(@Px margin: Int) {
    startToStart = parentId
    endToEnd = parentId
    horizontalMargin = margin
}

inline fun LP.centerVertically(@Px margin: Int) {
    topToTop = parentId
    bottomToBottom = parentId
    verticalMargin = margin
}

inline fun LP.centerInParent(@Px margin: Int) {
    centerHorizontally()
    centerVertically()
    this.margin = margin
}

inline fun LP.centerInParent(@Px horizontalMargin: Int, @Px verticalMargin: Int) {
    centerHorizontally()
    centerVertically()
    this.horizontalMargin = horizontalMargin
    this.verticalMargin = verticalMargin
}

inline fun LP.topOfParent(@Px margin: Int) {
    topToTop = parentId
    topMargin = margin
}

inline fun LP.bottomOfParent(@Px margin: Int) {
    bottomToBottom = parentId
    bottomMargin = margin
}

inline fun LP.startOfParent(@Px margin: Int) {
    startToStart = parentId
    startMargin = margin
}

inline fun LP.endOfParent(@Px margin: Int) {
    endToEnd = parentId
    endMargin = margin
}

inline fun LP.leftOfParent(@Px margin: Int) {
    leftToLeft = parentId
    leftMargin = margin
}

inline fun LP.rightOfParent(@Px margin: Int) {
    rightToRight = parentId
    rightMargin = margin
}

inline fun LP.centerOn(view: View, @Px margin: Int) {
    val id = view.existingOrNewId
    topToTop = id
    leftToLeft = id
    bottomToBottom = id
    rightToRight = id
    this.margin = margin
}

inline fun LP.centerOn(
    view: View,
    @Px horizontalMargin: Int,
    @Px verticalMargin: Int
) {
    val id = view.existingOrNewId
    topToTop = id
    leftToLeft = id
    bottomToBottom = id
    rightToRight = id
    this.horizontalMargin = horizontalMargin
    this.verticalMargin = verticalMargin
}


inline fun LP.before(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneEndMargin
) = endToStartOf(view, margin, goneMargin)

inline fun LP.above(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneBottomMargin
) = bottomToTopOf(view, margin, goneMargin)

inline fun LP.after(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneStartMargin
) = startToEndOf(view, margin, goneMargin)

inline fun LP.below(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneTopMargin
) = topToBottomOf(view, margin, goneMargin)


inline fun LP.topToTopOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneTopMargin
) {
    topToTop = view.existingOrNewId
    topMargin = margin
    goneTopMargin = goneMargin
}

inline fun LP.topToBottomOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneTopMargin
) {
    topToBottom = view.existingOrNewId
    topMargin = margin
    goneTopMargin = goneMargin
}

inline fun LP.bottomToTopOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneBottomMargin
) {
    bottomToTop = view.existingOrNewId
    bottomMargin = margin
    goneBottomMargin = goneMargin
}

inline fun LP.bottomToBottomOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneBottomMargin
) {
    bottomToBottom = view.existingOrNewId
    bottomMargin = margin
    goneBottomMargin = goneMargin
}

inline fun LP.startToStartOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneStartMargin
) {
    startToStart = view.existingOrNewId
    startMargin = margin
    goneStartMargin = goneMargin
}

inline fun LP.startToEndOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneStartMargin
) {
    startToEnd = view.existingOrNewId
    startMargin = margin
    goneStartMargin = goneMargin
}

inline fun LP.endToStartOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneEndMargin
) {
    endToStart = view.existingOrNewId
    endMargin = margin
    goneEndMargin = goneMargin
}

inline fun LP.endToEndOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneEndMargin
) {
    endToEnd = view.existingOrNewId
    endMargin = margin
    goneEndMargin = goneMargin
}

inline fun LP.leftToLeftOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneLeftMargin
) {
    leftToLeft = view.existingOrNewId
    leftMargin = margin
    goneLeftMargin = goneMargin
}

inline fun LP.leftToRightOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneLeftMargin
) {
    leftToRight = view.existingOrNewId
    leftMargin = margin
    goneLeftMargin = goneMargin
}

inline fun LP.rightToRightOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneRightMargin
) {
    rightToRight = view.existingOrNewId
    rightMargin = margin
    goneRightMargin = goneMargin
}

inline fun LP.rightToLeftOf(
    view: View,
    @Px margin: Int,
    @Px goneMargin: Int = goneRightMargin
) {
    rightToLeft = view.existingOrNewId
    rightMargin = margin
    goneRightMargin = goneMargin
}


inline fun LP.alignVerticallyOn(view: View, @Px margin: Int) {
    val id = view.existingOrNewId
    topToTop = id
    bottomToBottom = id
    verticalMargin = margin
}

inline fun LP.alignHorizontallyOn(view: View, @Px margin: Int) {
    val id = view.existingOrNewId
    leftToLeft = id
    rightToRight = id
    horizontalMargin = margin
}
