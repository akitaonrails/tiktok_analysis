package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.C019F;
import X.C1214660hiK;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1781880wTC;
import X.C1823290xXz;
import X.C1825610xbj;
import X.C1836840xtq;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioCourseAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1781880wTC> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public C1836840xtq LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public final int LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioCourseAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioCourseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1214660hiK(c19719912DlLIZ), null, new C1825610xbj());
        this.LLJLLIL = R.layout.gv7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TuxTextView op() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zge) : null;
            this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLJLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1781880wTC r10) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCourseAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1781880wTC c1781880wTC) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1781880wTC c1781880wTC) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
