package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactioncontainer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ReactionContainerFrameLayout extends FrameLayout {
    public ReactionContainerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ReactionContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
