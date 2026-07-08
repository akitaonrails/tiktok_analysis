package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC652490PiZ;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardVideoShootAssem extends ReusedUISlotAssem<SearchCardVideoShootAssem> implements InterfaceC712990Rxx<InterfaceC652490PiZ> {
    public FrameLayout LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f12;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
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
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ua6);
        this.LLJJLIIIJLLLLLLLZ = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 0), frameLayout);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC652490PiZ interfaceC652490PiZ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC652490PiZ interfaceC652490PiZ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC652490PiZ interfaceC652490PiZ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
