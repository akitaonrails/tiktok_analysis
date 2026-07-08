package com.ss.android.ugc.aweme.im.b2c.notice;

import X.C019F;
import X.C01GW;
import X.C067L;
import X.C06AH;
import X.C06LD;
import X.C06M6;
import X.C06NK;
import X.C06O9;
import X.C06OD;
import X.C09R3;
import X.C11NJ;
import X.C11NZ;
import X.C1239300iM4;
import X.C127G;
import X.C1366690lfX;
import X.C13BV;
import X.C13LE;
import X.C1434905jX;
import X.C14EU;
import X.C1509305vX;
import X.C1527105yP;
import X.C15564067m;
import X.C15578068a;
import X.C1558520qew;
import X.C15586068i;
import X.C1559260qg8;
import X.C1600706On;
import X.C1633406aS;
import X.C1634806ag;
import X.C1635006ai;
import X.C1635206ak;
import X.C1636306av;
import X.C1637806bA;
import X.C1644006cA;
import X.C1649406d2;
import X.C1660106el;
import X.C1671006gW;
import X.C1672406gk;
import X.C1701940uOG;
import X.C1717906o5;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C902340Zaa;
import X.C902380Zae;
import X.C903930Zd9;
import X.C909290Zln;
import X.EnumC1596306Mv;
import X.EnumC1660706er;
import X.EnumC738160SxS;
import X.InterfaceC1601306Ot;
import X.InterfaceC2217461Bqa;
import X.InterfaceC904740ZeS;
import X.InterfaceC905060Zey;
import Y.AObjectS55S0000000_2;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.Collections;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessSingleChatNoticeAssem extends CommonChatNoticeAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public final C1559260qg8 LLLIIIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLLIIL = new C1559260qg8(new C723590SZx(this, C1527105yP.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLLIILIL = new C1559260qg8(new C723590SZx(this, C06M6.class, null), checkSupervisorPrepared());
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 333));
    public final C01GW LLLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 322));
    public final AssemVMLazy LLLILZJ = C06LD.LIZ(this);
    public final AssemVMLazy LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public LiveEventObserver<FollowStatus> LLLJIL;
    public final C11NJ LLLJL;
    public final C1634806ag LLLL;
    public volatile C903930Zd9 LLLLII;
    public C127G LLLLIIIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessSingleChatNoticeAssem.class, "singleChatNoticeViewModel", "getSingleChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/SingleChatNoticeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessSingleChatNoticeAssem.class, "commonViewModel", "getCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessSingleChatNoticeAssem.class, "imConvRepoProvider", "getImConvRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        c09r3.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BusinessSingleChatNoticeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLLILZLLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 334), AFwS229S0000000_2.get$arr$(242), null, true);
        this.LLLIZZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 321));
        this.LLLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 320));
        this.LLLJL = new C11NJ();
        this.LLLL = new C1634806ag("SingleChatNoticeAssem");
    }

    public final C909290Zln Ap() {
        return (C909290Zln) this.LLLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [X.06Os] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(this.LLLL, false);
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1600706On c1600706On = new C1600706On(new C06O9(C452501pT.LIZIZ(new AwS546S0100000_2(this, 324)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 325)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 326)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 327)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 328))), C067L.BUSINESS, getContext(), C724240Sb0.LIZ(this), C724240Sb0.LJI(this), C1558520qew.LJIIL(this), Ap(), ((Boolean) this.LLLILZ.getValue()).booleanValue(), C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(344)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 329)), new InterfaceC1601306Ot() { // from class: X.06Os
            @Override // X.InterfaceC1601306Ot
            public final boolean LIZ() {
                return ((C06M6) this.LIZ.LLLIILIL.getValue()).LL.componentEnable(EnumC1660706er.PRE_SHOWN_STICKER.getId());
            }
        }, Vo(C452501pT.LIZIZ(new AwS546S0100000_2(this, 330)), C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(343))));
        IChatNoticeFlowEngine iChatNoticeFlowEngineIQ2 = cp().IQ2(c1600706On, C13BV.INSTANCE);
        iChatNoticeFlowEngineIQ2.LJIILL(Collections.singleton(EnumC1596306Mv.B2C_DISCLAIMER_POPUP), new AwS546S0100000_2(c1600706On, 323));
        if (C1636306av.LIZ()) {
            iChatNoticeFlowEngineIQ2.LJIILL(Collections.singleton(EnumC1596306Mv.CHAT_BOT_TYPING_NOTICE), new AwS403S0200000_2(c1600706On, this, 17));
        }
        up();
        cp().yQ2(new C15564067m(this, null), true);
        zp().yQ2();
        zp().IQ2();
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.06aU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 167), 4);
        AssemVMLazy assemVMLazy = this.LLLILZLLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06aa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILLJJLI;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 165), 4);
        C11NZ<InterfaceC904740ZeS> c11nzS9 = bp().s9();
        if (c11nzS9 != null) {
            this.LLLJL.LIZ(C1239300iM4.LJ(c11nzS9.LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1633406aS(zp())));
        }
        this.LLLJL.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLLIZZ.getValue()).LIZ(Ap().getConversationId()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C15578068a(zp())));
        C1634806ag c1634806ag = this.LLLL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_CREATE));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C902380Zae c902380ZaeLIZ;
        this.LLLJL.LJ();
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        if (C1717906o5.LIZ()) {
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ == null || (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) == null) {
                return;
            }
            c902380ZaeLIZ.LJIIL(Ap().getConversationId());
        }
    }

    public final SingleChatNoticeViewModel zp() {
        AssemVMLazy assemVMLazy = this.LLLILZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIIL;
        return (SingleChatNoticeViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLIIIILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLIIIILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 43)}, defaultViewModelProviderFactory);
                    this.LLLLIIIILLL = c127g2;
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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        zp().AQ2();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final void up() {
        C902380Zae c902380ZaeLIZ;
        super.up();
        SingleChatNoticeViewModel singleChatNoticeViewModelZp = zp();
        if (!C06NK.LIZ()) {
            singleChatNoticeViewModelZp.CQ2(new C1644006cA(No(), Ap()));
            if (((C06M6) this.LLLIILIL.getValue()).LL.componentEnable(EnumC1660706er.PRE_SHOWN_STICKER.getId())) {
                tp();
            }
        }
        if (C1635006ai.LIZ() && !C1636306av.LIZ()) {
            final C1671006gW c1671006gWAp = ap();
            final C1635206ak c1635206ak = new C1635206ak(cp());
            singleChatNoticeViewModelZp.CQ2(new C06OD<C06AH>(c1671006gWAp, c1635206ak) { // from class: X.06bE
                public final C1671006gW LLILLL;
                public final InterfaceC1638406bG LLILZ;

                @Override // X.C06OD
                public final void LIZLLL() {
                    this.LLILLL.LIZIZ();
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C06AH c06ah = (C06AH) c06oo;
                    C1671006gW c1671006gW = this.LLILLL;
                    c1671006gW.LJ(C1383370m6R.LJIIJ(2131827471), C1383370m6R.LJIIJ(2131827472), new AwS546S0100000_2(c1671006gW, 968), AFwS229S0000000_2.get$arr$(596));
                    IRemindUsersAnalytics.LIZ.getClass();
                    IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
                    if (iRemindUsersAnalyticsLIZ != null) {
                        iRemindUsersAnalyticsLIZ.LIZIZ(C0I0B.LJFF.LIZIZ());
                    }
                    String str = c06ah.LIZJ.noticeCode;
                    if (str != null) {
                        this.LLILZ.LIZ(2, str);
                    }
                    return c1671006gW;
                }

                {
                    super(EnumC1596306Mv.BUSINESS_MESSAGE_REQUEST_STRAIGHT_TO_INBOX);
                    this.LLILLL = c1671006gWAp;
                    this.LLILZ = c1635206ak;
                }

                @Override // X.C06OD
                public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                    return true;
                }
            });
        }
        singleChatNoticeViewModelZp.CQ2(new C1672406gk(Ap(), ap()));
        if (C1717906o5.LIZ()) {
            singleChatNoticeViewModelZp.CQ2(new C1649406d2(Ap(), EnumC1596306Mv.STORY_FRIEND_ANNIVERSARY_FROM_INBOX, new AwS546S0100000_2(this, 331)));
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ == null || (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) == null) {
                return;
            }
            c902380ZaeLIZ.LJIIIIZZ(Ap().getConversationId(), new AwS546S0100000_2(this, 332));
            c902380ZaeLIZ.LJI(null, null);
        }
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
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModelZp), null, null, new C15586068i(c1434905jX.LIZJ.isBlock(), singleChatNoticeViewModelZp, null), 3);
            if (!c1434905jX.LIZJ.isBlock()) {
                Lo(0L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (((C06M6) this.LLLIILIL.getValue()).LL.componentEnable(EnumC1660706er.PRE_SHOWN_STICKER.getId())) {
            C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.06aY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1636906b1) obj).LL;
                }
            }, null, new AwS616S0100000_2(this, 36), 6);
        }
    }
}
