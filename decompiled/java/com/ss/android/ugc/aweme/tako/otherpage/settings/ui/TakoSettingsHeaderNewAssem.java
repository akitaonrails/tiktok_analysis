package com.ss.android.ugc.aweme.tako.otherpage.settings.ui;

import X.C002K;
import X.C1852920yJm;
import X.C1857690yRT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C497820Jfg;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoSettingsHeaderNewAssem extends ReusedUISlotAssem<TakoSettingsHeaderNewAssem> implements InterfaceC712990Rxx<C002K> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fln;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int marginStart;
        int marginEnd;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        TextView textView = (TextView) view.findViewById(R.id.xc8);
        ImageView imageView = (ImageView) view.findViewById(R.id.xc6);
        textView.setText(C1852920yJm.LIZ.botName);
        if (imageView != null) {
            C1857690yRT.LJI(imageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), R.attr.a02, 0, Float.valueOf(0.825f), 8);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i = marginLayoutParams2.topMargin;
        } else {
            i = 0;
        }
        int iLIZJ = i + C497820Jfg.LIZJ(view.getContext());
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        C426750GoL.LJIIIZ(view, Integer.valueOf(marginStart), Integer.valueOf(iLIZJ), Integer.valueOf(marginEnd), Integer.valueOf(i2), false, 16);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C002K c002k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C002K c002k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C002K c002k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
