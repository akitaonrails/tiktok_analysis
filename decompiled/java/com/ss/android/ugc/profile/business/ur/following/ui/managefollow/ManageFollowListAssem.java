package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C019F;
import X.C01GW;
import X.C1076010e6h;
import X.C13LE;
import X.C15EJ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ManageFollowListAssem extends UIListContentAssem<ManageFollowVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public int LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageFollowListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/following/ui/managefollow/ManageFollowVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageFollowListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageFollowVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 331), AFwS232S0000000_4.get$arr$(109), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 329));
        this.LLJI = -1;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2196));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 328));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 330));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final ManageFollowVM ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ManageFollowVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c1076010e6h.LIZIZ().LIZ().removeObserver((Observer) this.LLJILJIL.getValue());
        c1076010e6h.LIZIZ().getRelationObservable().removeObserver((Observer) this.LLJILJILJ.getValue());
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(ManageFollowCell.class);
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c1076010e6h.LIZIZ().LIZ().observe(this, (Observer) this.LLJILJIL.getValue());
        c1076010e6h.LIZIZ().getRelationObservable().observeForever((Observer) this.LLJILJILJ.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Daf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C339250DRr) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 32), 6);
        Go().setItemAnimator(new C15EJ());
    }
}
