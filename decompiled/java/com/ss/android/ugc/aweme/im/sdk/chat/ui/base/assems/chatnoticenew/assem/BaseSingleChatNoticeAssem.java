package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem;

import X.C019F;
import X.C01GW;
import X.C067L;
import X.C06O9;
import X.C09R3;
import X.C127G;
import X.C1366690lfX;
import X.C13BV;
import X.C13LE;
import X.C1434905jX;
import X.C14EU;
import X.C1509305vX;
import X.C1527105yP;
import X.C15561067j;
import X.C1558520qew;
import X.C15586068i;
import X.C1559260qg8;
import X.C1600706On;
import X.C1633506aT;
import X.C1634806ag;
import X.C1637906bB;
import X.C1649006cy;
import X.C1660106el;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C909290Zln;
import X.EnumC738160SxS;
import X.InterfaceC2217461Bqa;
import X.InterfaceC904740ZeS;
import Y.AObjectS55S0000000_2;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSingleChatNoticeAssem extends CommonChatNoticeAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public final C1559260qg8 LLLIIIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLLIIL = new C1559260qg8(new C723590SZx(this, C1527105yP.class, null), checkSupervisorPrepared());
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 460));
    public final C01GW LLLIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 452));
    public final AssemVMLazy LLLILZ;
    public final AssemVMLazy LLLILZJ;
    public final C01GW LLLILZLLLI;
    public LiveEventObserver<FollowStatus> LLLIZZ;
    public final C1634806ag LLLJ;
    public C127G LLLJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseSingleChatNoticeAssem.class, "commonViewModel", "getCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseSingleChatNoticeAssem.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BaseSingleChatNoticeAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS546S0100000_2(c19719912DlLIZ, 461), AFwS229S0000000_2.get$arr$(286), null, true);
        C1637906bB c1637906bBLIZ2 = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLLILZJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS546S0100000_2(c19719912DlLIZ2, 462), AFwS229S0000000_2.get$arr$(287), null, true);
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 451));
        this.LLLJ = new C1634806ag("SingleChatNoticeAssem");
    }

    public abstract void Bp(FollowStatus followStatus);

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract SingleChatNoticeViewModel zp();

    public final C909290Zln Ap() {
        return (C909290Zln) this.LLLIILIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(this.LLLJ, false);
        super.onCreate();
        cp().IQ2(new C1600706On(new C06O9(C452501pT.LIZIZ(new AwS546S0100000_2(this, 453)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 454)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 455)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 456)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 457))), C067L.SINGLE, getContext(), C724240Sb0.LIZ(this), C724240Sb0.LJI(this), C1558520qew.LJIIL(this), Ap(), ((Boolean) this.LLLIL.getValue()).booleanValue(), C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(488)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 458)), null, Vo(C452501pT.LIZIZ(new AwS546S0100000_2(this, 459)), C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(489)))), C13BV.INSTANCE);
        up();
        cp().yQ2(new C15561067j(this, null), true);
        zp().yQ2();
        zp().IQ2();
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.06aQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 96), 4);
        AssemVMLazy assemVMLazy = this.LLLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06aZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 97), 4);
        C1634806ag c1634806ag = this.LLLJ;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_CREATE));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 28)}, defaultViewModelProviderFactory);
                    this.LLLJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final String hp() {
        String secUid;
        IMUser fromUser = Ap().getFromUser();
        return (fromUser == null || (secUid = fromUser.getSecUid()) == null) ? "" : secUid;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final String kp() {
        String uid;
        IMUser fromUser = Ap().getFromUser();
        return (fromUser == null || (uid = fromUser.getUid()) == null) ? "" : uid;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        zp().AQ2();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        super.df1(interfaceC904740ZeS);
        zp().BQ2(interfaceC904740ZeS);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate(C1434905jX c1434905jX) {
        String uid;
        if (Ap().isMessageRequest() && c1434905jX.LIZJ.getFollowStatus() > 0) {
            zp().kP();
        }
        IMUser fromUser = Ap().getFromUser();
        if (fromUser != null) {
            uid = fromUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, c1434905jX.LIZ)) {
            SingleChatNoticeViewModel singleChatNoticeViewModelZp = zp();
            boolean zIsBlock = c1434905jX.LIZJ.isBlock();
            singleChatNoticeViewModelZp.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModelZp), null, null, new C15586068i(zIsBlock, singleChatNoticeViewModelZp, null), 3);
            if (!c1434905jX.LIZJ.isBlock()) {
                Lo(0L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.06aW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1636906b1) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 50), 6);
    }
}
