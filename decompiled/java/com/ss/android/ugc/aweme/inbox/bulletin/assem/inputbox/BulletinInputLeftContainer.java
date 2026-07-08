package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0OLV;
import X.C0OSF;
import X.C0OWM;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1618770sE7;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C443090HZb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C620650OVz;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS333S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputLeftContainer extends UISlotAssem implements InterfaceC623330Ocd {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.CONTAINER_LEFT;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final List<C443090HZb> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputLeftContainer.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a68;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
    }

    public BulletinInputLeftContainer() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 416), AFwS240S0000000_9.get$arr$(237), null, true);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), new AwS553S0100000_9(this, 414), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(238), new AwS553S0100000_9((AbstractC738140SxQ) this, 417), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 415));
        this.LLJJJ = C1697810uHb.LJIILJJIL(new C443090HZb(C1618770sE7.LIZJ(2131828058), new AwS553S0100000_9(this, 411), R.raw.icon_camera, null, 0, null, 0, false, false, null, 1016), new C443090HZb(C1618770sE7.LIZJ(2131828059), new AwS553S0100000_9(this, 412), R.raw.icon_image_square, null, 0, null, 0, false, false, null, 1016), new C443090HZb(C1618770sE7.LIZJ(2131828060), new AwS553S0100000_9(this, 413), R.raw.icon_post, null, 0, null, 0, false, false, null, 1016));
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
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
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OW3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 141), 28, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0OW0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZLL;
            }
        }, null, new AwS623S0100000_9(this, 53), 6);
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OW4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0OW5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, null, AFwS333S0000000_9.get$arr$(1), 12);
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }
}
