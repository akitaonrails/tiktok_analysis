package com.ss.android.ugc.aweme.ecommerce.search.vision.result;

import X.C14KQ;
import X.C676190Qfh;
import X.InterfaceC680580Qmm;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchBottomPanelViewModel extends ViewModel implements InterfaceC680580Qmm {
    public static final /* synthetic */ int LLJ = 0;
    public FrameLayout LL;
    public C676190Qfh LLILLJJLI;
    public FrameLayout LLILLL;
    public RectF LLILZ;
    public int LLILZLL;
    public int LLIZ;
    public final int[] LLILZIL = new int[2];
    public int LLIZLLLIL = 4;

    @Override // X.InterfaceC680580Qmm
    public final void Mi2() {
    }

    @Override // X.InterfaceC680580Qmm
    public final int[] rJ1() {
        int[] iArr = new int[2];
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    @Override // X.InterfaceC680580Qmm
    public final int AT0() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC680580Qmm
    public final int Hj1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC680580Qmm
    public final int getBottomHeight() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC680580Qmm
    public final boolean p90(Context context, MotionEvent motionEvent) {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(this.LLILZIL);
        }
        int i = this.LLILZIL[1];
        RectF rectF = this.LLILZ;
        if (rectF == null) {
            rectF = new RectF(0.0f, i, C14KQ.LJIIIIZZ(context), i + this.LLILZLL);
        }
        this.LLILZ = rectF;
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }
}
