package com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse;

import X.C01GW;
import X.C0ZTH;
import X.C1509305vX;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class CollapseInlineAssem extends ReusedUISlotAssem<CollapseInlineAssem> implements InterfaceC712990Rxx<C0ZTH> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 590));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 589));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 588));
    public final C01GW LLJLILLLLZIIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(194));
    public final C01GW LLJLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(193));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl9;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZTH c0zth) {
        String quantityString;
        C419910GdJ c419910GdJ;
        C0ZTH c0zth2 = c0zth;
        TuxTextView tuxTextView = (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
        int i = c0zth2.LLILLL;
        if (c0zth2.LLILLJJLI) {
            quantityString = tuxTextView.getContext().getResources().getQuantityString(2131755134, i, Integer.valueOf(i));
        } else {
            quantityString = tuxTextView.getContext().getResources().getQuantityString(2131755135, i, Integer.valueOf(i));
        }
        tuxTextView.setText(quantityString);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.h9(tuxTextView, new ACListenerS149S0100000_14(c0zth2, 70));
        TuxIconView tuxIconView = (TuxIconView) this.LLJL.getValue();
        if (c0zth2.LLILLJJLI) {
            c419910GdJ = (C419910GdJ) this.LLJLILLLLZIIL.getValue();
        } else {
            c419910GdJ = (C419910GdJ) this.LLJLL.getValue();
        }
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.I7(new ACListenerS149S0100000_14(c0zth2, 71), (View) this.LLJLIL.getValue());
        C426750GoL.LJIIL(getContentView(), null, null, null, Integer.valueOf(c0zth2.LLILZIL.getPaddingDp()), 23);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZTH c0zth) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZTH c0zth) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
