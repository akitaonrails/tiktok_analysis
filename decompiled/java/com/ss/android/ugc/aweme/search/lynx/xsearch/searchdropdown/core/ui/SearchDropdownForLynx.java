package com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui;

import X.C1311380kEK;
import X.C1313130kH9;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class SearchDropdownForLynx extends UISimpleView<AndroidView> {
    public final LynxSearchDropdown LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public final C1311380kEK LLILZ;
    public final C1313130kH9 LLILZIL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void requestLayout() {
        super.requestLayout();
        if (this.LL.getTransitionAnimator() != null || this.LL.enableLayoutAnimation()) {
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1311380kEK getTouchEventDispatcher() {
        return this.LLILZ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kH9, android.view.View, android.view.ViewGroup] */
    public SearchDropdownForLynx(s sVar, LynxSearchDropdown lynxSearchDropdown) {
        super(sVar);
        this.LL = lynxSearchDropdown;
        this.LLILLL = 300L;
        ?? r2 = new AndroidView(sVar) { // from class: X.0kH9
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
            
                if (r10.getAction() != 1) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
            
                r4.mContext.LLIZ.LIZIZ(new X.C1298700jts(r4.getSign(), "dismiss"));
             */
            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouchEvent(android.view.MotionEvent r10) {
                /*
                    r9 = this;
                    if (r10 != 0) goto L7
                    boolean r0 = super.onTouchEvent(r10)
                    return r0
                L7:
                    com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui.SearchDropdownForLynx r4 = r2
                    r4.getClass()
                    float r8 = r10.getX()
                    float r7 = r10.getY()
                    java.util.List<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r4.mChildren
                    java.util.Iterator r3 = r0.iterator()
                L1a:
                    boolean r0 = r3.hasNext()
                    r5 = 1
                    r6 = 0
                    if (r0 == 0) goto La1
                    java.lang.Object r2 = r3.next()
                    com.lynx.tasm.behavior.ui.LynxBaseUI r2 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r2
                    int r1 = r4.getLeft()
                    int r0 = r2.getLeft()
                    int r1 = r1 + r0
                    float r1 = (float) r1
                    float r0 = r2.getTranslationX()
                    float r1 = r1 + r0
                    int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                    if (r0 >= 0) goto L1a
                    int r0 = r4.getLeft()
                    float r1 = (float) r0
                    int r0 = r2.getLeft()
                    float r0 = (float) r0
                    float r1 = r1 + r0
                    float r0 = r2.getTranslationX()
                    float r1 = r1 + r0
                    int r0 = r2.getWidth()
                    float r0 = (float) r0
                    float r1 = r1 + r0
                    int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                    if (r0 <= 0) goto L1a
                    int r1 = r4.getTop()
                    int r0 = r2.getTop()
                    int r1 = r1 + r0
                    float r1 = (float) r1
                    float r0 = r2.getTranslationY()
                    float r1 = r1 + r0
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r0 >= 0) goto L1a
                    int r0 = r4.getTop()
                    float r1 = (float) r0
                    int r0 = r2.getTop()
                    float r0 = (float) r0
                    float r1 = r1 + r0
                    float r0 = r2.getTranslationY()
                    float r1 = r1 + r0
                    int r0 = r2.getHeight()
                    float r0 = (float) r0
                    float r1 = r1 + r0
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r0 <= 0) goto L1a
                    int r0 = r4.getLeft()
                    float r3 = (float) r0
                    int r0 = r4.getTop()
                    float r2 = (float) r0
                    float r1 = -r3
                    float r0 = -r2
                    r10.offsetLocation(r1, r0)
                    X.0kEK r0 = r4.LLILZ
                    if (r0 == 0) goto L9c
                    boolean r0 = r0.LJIJJ(r10, r4)
                    if (r0 != r5) goto L9c
                    r6 = 1
                L9c:
                    r10.offsetLocation(r3, r2)
                    if (r6 != 0) goto Lb9
                La1:
                    int r0 = r10.getAction()
                    if (r0 != r5) goto Lb9
                    j27.s r0 = r4.mContext
                    X.0jtu r3 = r0.LLIZ
                    X.0jts r2 = new X.0jts
                    int r1 = r4.getSign()
                    java.lang.String r0 = "dismiss"
                    r2.<init>(r1, r0)
                    r3.LIZIZ(r2)
                Lb9:
                    boolean r0 = super.onTouchEvent(r10)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1313130kH9.onTouchEvent(android.view.MotionEvent):boolean");
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                this.measureChildren();
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                this.layout();
            }
        };
        this.LLILZIL = r2;
        r2.addView(this.mView, -1, -1);
        r2.setClickable(true);
        this.LLILZ = new C1311380kEK(sVar.LJIILIIL());
    }
}
