package com.ss.android.ugc.aweme.detailpage.audit.assem;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C0HZQ;
import X.C1227300i2i;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.detailpage.audit.view.AuditRequestCell;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestListAssem extends UIListContentAssem<AuditRequestListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuditRequestListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/audit/viewmodel/AuditRequestListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AuditRequestListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuditRequestListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 992), AFwS257S0000000_19.get$arr$(137), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 989));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 991));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 988));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 10;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        c20603715jn.LIZLLL = iMStyleViewBridgeApiLIZ != null ? iMStyleViewBridgeApiLIZ.LIZIZ() : null;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final AuditRequestListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (AuditRequestListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(AuditRequestCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.LJ(0, (View) this.LLJI.getValue());
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0hnU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0hnR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS668S0100000_19(this, 48), 8);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hnX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1218060hno) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 277), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hnZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(47), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hna
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(48), 4);
        View viewLJJIJL = LJJIJL();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewLJJIJL.setBackground(c384050F3z.LIZ(viewLJJIJL.getContext()));
        ((C0HZQ) this.LLJIJIL.getValue()).setInterceptToggleListener(new AwS563S0100000_19(this, 990));
    }
}
