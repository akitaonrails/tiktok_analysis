package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C01GW;
import X.C21652419oY;
import X.C452501pT;
import X.C723830SaL;
import X.C900030ZSn;
import X.EnumC900290ZTn;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardCenterAssem extends ReusedUISlotAssem<DynamicCardCenterAssem> implements InterfaceC712990Rxx<C900030ZSn> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 520));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 519));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 521));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C21652419oY c21652419oY = (C21652419oY) this.LLJLIL.getValue();
        c21652419oY.getClass();
        c21652419oY.LL = EnumC900290ZTn.REFACTOR;
        c21652419oY.setDefaultOnLongPressAction(new AwS415S0200000_14(c21652419oY, this, 34));
        c21652419oY.setDefaultOnDoubleTapAction(new AwS415S0200000_14(c21652419oY, this, 35));
        C723830SaL.LIZ(this, null, new AwS593S0100000_14(this, 56));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C900030ZSn c900030ZSn) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C900030ZSn c900030ZSn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C900030ZSn c900030ZSn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
