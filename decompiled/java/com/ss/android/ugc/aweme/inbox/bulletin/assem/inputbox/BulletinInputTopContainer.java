package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0IDG;
import X.C0OLV;
import X.C0OSF;
import X.C0OWM;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C619990OTl;
import X.C620650OVz;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinQuickPostCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputTopContainer extends UISlotAssem implements InterfaceC623330Ocd {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public final C736950SvV LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public List<BulletinPublishAction> LLJJJ;
    public final C01GW LLJJJIL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.QUICK_PUBLISH;
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputTopContainer.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a6_;
    }

    public BulletinInputTopContainer() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 426);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(243), new AwS553S0100000_9((AbstractC738140SxQ) this, 428), new C451610HnL(this, true, true), new C723700Sa8(this));
        new AwS553S0100000_9(this, 425);
        C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9.get$arr$(244);
        new AwS553S0100000_9((AbstractC738140SxQ) this, 429);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 427), AFwS240S0000000_9.get$arr$(242), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 430));
    }

    public final boolean hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return ((C619990OTl) assemVMLazy.getValue().getState()).LL == C0OSF.NORMAL && ((C619990OTl) this.LLJJIJIL.getValue().getState()).LLILLJJLI == C0OWM.HIDE;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ip() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.snk) : null;
            this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return ip();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIp;
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIp2 = ip();
        if (viewOnAttachStateChangeListenerC20604515jvIp2 != null) {
            viewOnAttachStateChangeListenerC20604515jvIp2.LJIILJJIL(BulletinQuickPostCell.class);
            viewOnAttachStateChangeListenerC20604515jvIp2.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jvIp2.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jvIp2.addItemDecoration(new C0IDG(9));
        }
        if (!hp() && (viewOnAttachStateChangeListenerC20604515jvIp = ip()) != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvIp);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OVu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZIL;
            }
        }, null, new AwS623S0100000_9(this, 54), 6);
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OVw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0OVx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, null, new AwS658S0100000_9(this, 7), 12);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    public final void kp(C0OSF c0osf, C0OWM c0owm) {
        boolean z;
        boolean z2;
        int i = 0;
        if (c0osf == C0OSF.NORMAL && c0owm == C0OWM.HIDE) {
            z = true;
        } else {
            z = false;
        }
        List<BulletinPublishAction> list = this.LLJJJ;
        if (list != null && !list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = !z2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIp = ip();
        if (viewOnAttachStateChangeListenerC20604515jvIp != null) {
            if (!z || !z3) {
                i = 8;
            }
            C786410Ut5.LLF(i, viewOnAttachStateChangeListenerC20604515jvIp);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        if (c620650OVz.LJ() && enumC617880OLi == EnumC617880OLi.PREPARE) {
            kp(c620650OVz.LIZLLL, c620650OVz.LIZIZ);
            return;
        }
        C0OWM c0owm = c620650OVz.LIZ;
        C0OWM c0owm2 = C0OWM.HIDE;
        if (((c0owm == c0owm2 || c620650OVz.LIZIZ != c0owm2) && !c620650OVz.LIZJ()) || enumC617880OLi != EnumC617880OLi.COMPLETE) {
            return;
        }
        kp(c620650OVz.LIZLLL, c620650OVz.LIZIZ);
    }
}
