package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsV3RepostCardPhotoContentLayout extends FrameLayout {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        return true;
    }

    public FriendsV3RepostCardPhotoContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
