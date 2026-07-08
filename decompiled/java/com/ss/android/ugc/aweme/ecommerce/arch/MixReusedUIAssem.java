package com.ss.android.ugc.aweme.ecommerce.arch;

import X.AbstractC677840QiM;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C13LE;
import X.C2217401BqU;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MixReusedUIAssem<RECEIVER extends C03H5, VO extends AbstractC677840QiM> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<VO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10((MixReusedUIAssem) this, 19));

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(MixReusedUIAssem.class, "vm", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(MixReusedUIAssem.class, "vm", "<v#1>", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final MixPageViewModel op() {
        return (MixPageViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
