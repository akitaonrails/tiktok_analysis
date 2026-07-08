package com.ss.android.ugc.aweme.friendstab.nonpersonalized;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import Y.AObserverS213S0100000_9;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsNonPersonalizedAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsNonPersonalizedAssem.class, "nonPersonalizedVM", "getNonPersonalizedVM()Lcom/ss/android/ugc/aweme/friendstab/nonpersonalized/FriendsNonPersonalizedVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsNonPersonalizedAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsNonPersonalizedVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 159), AFwS240S0000000_9.get$arr$(104), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIII().observe(this, new AObserverS213S0100000_9(this, 4));
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0Nsf
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C00GO) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C00GO) obj).LL = (Boolean) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 31), 4);
    }
}
