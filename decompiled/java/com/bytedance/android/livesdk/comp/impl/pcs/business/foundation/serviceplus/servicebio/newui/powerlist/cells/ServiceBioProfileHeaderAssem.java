package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.C019F;
import X.C1119920fFW;
import X.C13LE;
import X.C1558840qfS;
import X.C1559260qg8;
import X.C1637806bA;
import X.C16F5;
import X.C1822340xWS;
import X.C1823290xXz;
import X.C1825630xbl;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ServiceBioProfileHeaderAssem extends ServiceBioBaseAssemCell implements InterfaceC712990Rxx<C1822340xWS> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1823290xXz.class, null), checkSupervisorPrepared());
    public View LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public C16F5 LLJLLL;
    public View LLJZ;
    public C16F5 LLJZIJLIL;
    public View LLL;
    public C16F5 LLLF;
    public final int LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ServiceBioProfileHeaderAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/newui/viewmodel/PcsServiceBioVMV2;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ServiceBioProfileHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVMV2.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1558840qfS(c19719912DlLIZ), null, new C1825630xbl());
        this.LLLFF = R.layout.gv_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final View op() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cpl) : null;
            this.LLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View sp() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cpx) : null;
            this.LLJZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View tp() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ct7) : null;
            this.LLJLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioBaseAssemCell
    public final int getLayoutId() {
        return this.LLLFF;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(final View view) {
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new Runnable() { // from class: X.0xYL
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ServiceBioProfileHeaderAssem@9ba9.onViewAttached$$inlined$doOnPreDraw$1");
                try {
                    C1822520xWk c1822520xWk = ((C1823290xXz) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI;
                    if (c1822520xWk != null) {
                        c1822520xWk.invoke();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ServiceBioProfileHeaderAssem@9ba9.onViewAttached$$inlined$doOnPreDraw$1");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010e, code lost:
    
        if (r5 != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[PHI: r1
      0x0069: PHI (r1v38 android.view.View) = (r1v37 android.view.View), (r1v40 android.view.View) binds: [B:25:0x0056, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4 A[PHI: r0
      0x00b4: PHI (r0v15 android.view.View) = (r0v14 android.view.View), (r0v48 android.view.View) binds: [B:52:0x00a4, B:57:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[PHI: r2
      0x0018: PHI (r2v1 android.view.View) = (r2v0 android.view.View), (r2v11 android.view.View) binds: [B:3:0x0005, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1822340xWS r10) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioProfileHeaderAssem.up(java.lang.Object):void");
    }

    public final void up(C16F5 c16f5) {
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(13.0f, 500, getContentView().getContext()));
            c16f5.setTextSize(1, 12.0f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1822340xWS c1822340xWS) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1822340xWS c1822340xWS) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
