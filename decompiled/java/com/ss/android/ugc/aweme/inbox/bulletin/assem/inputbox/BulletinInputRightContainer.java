package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OLV;
import X.C0OPA;
import X.C0OPQ;
import X.C0OSF;
import X.C0OWM;
import X.C0P4T;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
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
import X.ViewOnTouchListenerC620870OWv;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinVoiceRecordUiAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS333S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputRightContainer extends UISlotAssem implements InterfaceC623330Ocd {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.CONTAINER_RIGHT;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputRightContainer.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinInputRightContainer.class, "voiceRecordVm", "getVoiceRecordVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinVoiceRecordViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a69;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
    }

    public BulletinInputRightContainer() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 418);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(241), new AwS553S0100000_9((AbstractC738140SxQ) this, 422), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 420), AFwS240S0000000_9.get$arr$(239), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinVoiceRecordViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 421), AFwS240S0000000_9.get$arr$(240), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 419));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 423));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 424));
    }

    public final BulletinVoiceRecordUiAbility hp() {
        return (BulletinVoiceRecordUiAbility) this.LLJJJJ.getValue();
    }

    public final void ip() {
        C0OLV c0olv = (C0OLV) this.LLJJIII.getValue();
        if (c0olv == null) {
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        String str = c0olv.LL;
        Pair[] pairArr = new Pair[2];
        String str2 = c0olv.LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("previous_page", str2);
        pairArr[1] = new Pair("enter_method", "voice");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c0opq.getClass();
        C0OPQ.LJIIJ(str, mapLJIIIIZZ);
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
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0OW6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 142), 28, null);
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OWA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0OWB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, null, AFwS333S0000000_9.get$arr$(2), 12);
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.d5r);
        boolean zLIZ = C0OPA.LIZ();
        if (tuxIconView != null && zLIZ) {
            tuxIconView.setOnTouchListener(new ViewOnTouchListenerC620870OWv(new AwS553S0100000_9(this, 1675), new AwS553S0100000_9(this, 1676), new AwS553S0100000_9(this, 1677), new AwS553S0100000_9(this, 1678), new AwS553S0100000_9(this, 1679), new AwS588S0100000_9(this, 477)));
            C786410Ut5.y3(tuxIconView.getViewTreeObserver(), new C0P4T(tuxIconView, this, 1));
        }
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
