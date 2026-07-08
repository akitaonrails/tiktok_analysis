package com.ss.android.ugc.aweme.tako.botpage.components.botmarket;

import X.C01GW;
import X.C0H5X;
import X.C452501pT;
import X.C723830SaL;
import X.C786410Ut5;
import X.EnumC992600bwA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes17.dex */
public final class TakoBotMarketAssem extends ReusedUISlotAssem<TakoBotMarketAssem> implements InterfaceC712990Rxx<C0H5X> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 581));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 580));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fk5;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 274));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0H5X c0h5x) {
        Integer num;
        BotMarketInfo botMarketInfoLJLLLL = c0h5x.LJLLLL();
        if (botMarketInfoLJLLLL != null) {
            num = botMarketInfoLJLLLL.style;
        } else {
            num = null;
        }
        int style = EnumC992600bwA.LIST.getStyle();
        if (num != null && num.intValue() == style) {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJL.getValue());
            return;
        }
        int style2 = EnumC992600bwA.HUB.getStyle();
        if (num == null || num.intValue() != style2) {
            return;
        }
        C786410Ut5.LJZ(0, (FrameLayout) this.LLJL.getValue());
        C786410Ut5.LJZ(8, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0H5X c0h5x) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0H5X c0h5x) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
