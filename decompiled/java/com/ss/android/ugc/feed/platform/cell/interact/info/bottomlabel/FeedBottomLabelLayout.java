package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.C0SXP;
import X.C1308910kAL;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomLabelLayout extends LinearLayout {
    public TuxTextView LL;
    public HorizontalScrollView LLILLJJLI;
    public final Integer LLILLL;
    public final boolean LLILZ;

    public FeedBottomLabelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final HorizontalScrollView getScrollView() {
        HorizontalScrollView horizontalScrollView = this.LLILLJJLI;
        if (horizontalScrollView != null) {
            return horizontalScrollView;
        }
        return null;
    }

    public final HorizontalScrollView getScrollViewOrNull() {
        if (this.LLILLJJLI != null) {
            return getScrollView();
        }
        return null;
    }

    public final TuxTextView getTagTextView() {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getTagTextViewOrNull() {
        if (this.LL != null) {
            return getTagTextView();
        }
        return null;
    }

    public final void setScrollView(HorizontalScrollView horizontalScrollView) {
        this.LLILLJJLI = horizontalScrollView;
    }

    public final void setTagTextView(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public FeedBottomLabelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLL = C1308910kAL.LIZJ(R.attr.ee, context);
        this.LLILZ = C0SXP.LIZIZ().enable;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final android.content.Context r12, java.lang.String r13, float r14, android.view.View.OnClickListener r15, com.ss.android.ugc.aweme.feed.model.Aweme r16, java.lang.Integer r17) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.FeedBottomLabelLayout.LIZ(android.content.Context, java.lang.String, float, android.view.View$OnClickListener, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):void");
    }
}
