package com.ss.android.ugc.aweme.search.pages.result.nimble.ui;

import X.C01GW;
import X.C01V8;
import X.C07E5;
import X.C452501pT;
import X.C684920Qtm;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleCardAssem extends ReusedUISlotAssem<SearchNimbleCardAssem> implements InterfaceC712990Rxx<C684920Qtm> {
    public final int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 565));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 564));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 561));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez1;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C01V8.LIZ((C01V8) this.LLJLILLLLZIIL.getValue(), "inflate_cost", null, new AwS554S0100000_10(this, 562), 2);
    }

    public SearchNimbleCardAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C01V8.LIZ((C01V8) this.LLJLILLLLZIIL.getValue(), null, null, new AwS411S0200000_10(this, view, 43), 3);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C684920Qtm c684920Qtm) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C684920Qtm c684920Qtm) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C684920Qtm c684920Qtm) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
