package com.ss.android.ugc.aweme.pcs.course.videopublishpage.ui;

import X.C723850SaN;
import X.C786410Ut5;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PcsCoursePublishMainAssem extends UISlotAssem {
    public FrameLayout LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hft;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cb_);
        this.LLJJI = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.06K4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    int height = view.getRootView().getHeight();
                    int i = height - rect.bottom;
                    if (i > ((double) height) * 0.15d) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                        marginLayoutParams.bottomMargin = i;
                        C786410Ut5.X5(marginLayoutParams, frameLayout);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                        marginLayoutParams2.bottomMargin = 0;
                        C786410Ut5.X5(marginLayoutParams2, frameLayout);
                    }
                }
            });
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 567));
    }
}
