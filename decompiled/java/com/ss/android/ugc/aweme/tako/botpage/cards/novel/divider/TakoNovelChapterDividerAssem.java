package com.ss.android.ugc.aweme.tako.botpage.cards.novel.divider;

import X.C00XJ;
import X.C1308910kAL;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoNovelChapterDividerAssem extends ReusedUISlotAssem<TakoNovelChapterDividerAssem> implements InterfaceC712990Rxx<C00XJ> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmg;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C00XJ c00xj) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(c00xj.LL, getContentView().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        View contentView = getContentView();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), iIntValue, C418440Gaw.LIZIZ(Double.valueOf(1.5d)), C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
        gradientDrawable.setShape(2);
        contentView.setBackground(gradientDrawable);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C00XJ c00xj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C00XJ c00xj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
