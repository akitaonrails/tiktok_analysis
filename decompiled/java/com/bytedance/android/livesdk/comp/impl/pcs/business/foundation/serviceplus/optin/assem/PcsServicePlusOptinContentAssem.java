package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.C019F;
import X.C09JN;
import X.C09R3;
import X.C0KBP;
import X.C0QSJ;
import X.C1097400efC;
import X.C1142204dQ;
import X.C1148710fzx;
import X.C11O8;
import X.C127G;
import X.C12954055c;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1617706Vb;
import X.C1637806bA;
import X.C1808280x9m;
import X.C1822260xWK;
import X.C1823620xYW;
import X.C1826760xda;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableLiveJourneyTaskReport;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinContentAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C1822260xWK LLJJIII;
    public ViewGroup LLJJIJI;
    public C1148710fzx LLJJIJIIJIL;
    public volatile IPcsServiceOptInTargetPageAbility LLJJIJIL;
    public C127G LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinContentAssem.class, "targetPageAbility", "getTargetPageAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/ability/IPcsServiceOptInTargetPageAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PcsServicePlusOptinContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PcsServicePlusOptinContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12954055c(c19719912DlLIZ), new C1617706Vb(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz7;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PcsServicePlusOptinScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsServicePlusOptinScope.class);
        return arrayList;
    }

    public final C1822260xWK hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1822260xWK.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility ip() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility r0 = r4.LLJJIJIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility r0 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJJ     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinScope> r1 = com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJ = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility> r0 = com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility r0 = (com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinContentAssem.ip():com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility");
    }

    public final PcsServicePlusOptinVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PcsServicePlusOptinVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsServicePlusOptinVM.class, new Function0(this) { // from class: X.0xWG
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsServicePlusOptinContentAssem.LLJJJJJIL;
                            return new PcsServicePlusOptinVM(new C518720KVy(C1807670x8n.LJJIIJZLJL()), new C1822230xWH());
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1148710fzx c1148710fzx = this.LLJJIJIIJIL;
        if (c1148710fzx != null) {
            C1097400efC.LIZJ(c1148710fzx);
        }
    }

    public final void lp(String str) {
        ((InterfaceC517590KRp) C1826760xda.LIZ.getValue()).LIZJ(str, new C0KBP(kp().LLILZIL));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String showEntrance;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        super.onViewCreated(view);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.b9s);
        C723850SaN.LIZLLL(this, new C1142204dQ(this));
        C1822260xWK c1822260xWKHp = hp();
        if (c1822260xWKHp != null) {
            c1822260xWKHp.LLILZ = true;
        }
        C736680Sv4.LJIIIZ(this, kp(), new C2217381BqS() { // from class: X.0xYl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0xYh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LL;
            }
        }, null, new C1823620xYW(this), 12);
        if (LiveEnableLiveJourneyTaskReport.INSTANCE.isEnable()) {
            PcsServicePlusOptinVM pcsServicePlusOptinVMKp = kp();
            C11O8 c11o8LJJJLZIJ = pcsServicePlusOptinVMKp.LL.LIZ().LJL(pcsServicePlusOptinVMKp.LLILLJJLI.LIZIZ()).LJJJLZIJ(pcsServicePlusOptinVMKp.LLILLJJLI.LIZ());
            C1822260xWK c1822260xWKWQ2 = pcsServicePlusOptinVMKp.wQ2();
            if (c1822260xWKWQ2 == null || (pcsServicePlusOptinPageParams = c1822260xWKWQ2.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams.getShowEntrance()) == null) {
                showEntrance = "";
            }
            C1808280x9m.LJFF(c11o8LJJJLZIJ, showEntrance, "/live_center/task/event_report/", null, 12).LJJLL(new C09JN() { // from class: X.00Re
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PcsServicePlusOptinVM@665b.finishSmbTask$1");
                    C20441214yg.LIZIZ("PcsServicePlusOptinVM", "finish task");
                    C1C7U.LIZIZ("PcsServicePlusOptinVM@665b.finishSmbTask$1");
                }
            }, new C09JN() { // from class: X.00ME
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PcsServicePlusOptinVM@665b.finishSmbTask$2");
                    C1C7U.LIZIZ("PcsServicePlusOptinVM@665b.finishSmbTask$2");
                }
            });
        }
    }
}
