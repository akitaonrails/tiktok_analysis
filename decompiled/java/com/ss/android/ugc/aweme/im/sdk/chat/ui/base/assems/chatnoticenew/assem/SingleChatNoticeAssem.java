package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem;

import X.C069A;
import X.C06LD;
import X.C06NK;
import X.C06OD;
import X.C06OO;
import X.C0PEM;
import X.C1171750gb7;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C13LE;
import X.C14EU;
import X.C1634906ah;
import X.C1636306av;
import X.C1640206bY;
import X.C1640406ba;
import X.C1644006cA;
import X.C1649406d2;
import X.C1672406gk;
import X.C1675106hB;
import X.C1684506ih;
import X.C1690706jh;
import X.C1698906l1;
import X.C1717906o5;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C461720I8s;
import X.C724240Sb0;
import X.C814420VxA;
import X.C824390WVp;
import X.C902340Zaa;
import X.C902380Zae;
import X.C909290Zln;
import X.EnumC1596306Mv;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS72S1300000_2;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleChatNoticeAssem extends BaseSingleChatNoticeAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIIILLL;
    public final AssemVMLazy LLLL = C06LD.LIZ(this);
    public boolean LLLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleChatNoticeAssem.class, "singleChatNoticeViewModel", "getSingleChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/SingleChatNoticeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLIIIILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem
    public final void up() {
        C902380Zae c902380ZaeLIZ;
        final Context context;
        super.up();
        SingleChatNoticeViewModel singleChatNoticeViewModelEp = Ep();
        if (!C06NK.LIZ()) {
            singleChatNoticeViewModelEp.CQ2(new C1644006cA(No(), Ap()));
            tp();
            if (C1171750gb7.LIZ() && !((Boolean) this.LLLIL.getValue()).booleanValue() && (context = getContext()) != null) {
                final C909290Zln c909290ZlnAp = Ap();
                final Fragment fragmentLJI = C724240Sb0.LJI(this);
                singleChatNoticeViewModelEp.CQ2(new C06OD<C06OO>(context, fragmentLJI, c909290ZlnAp) { // from class: X.06d3
                    public final SessionInfo LLILLL;
                    public final C1686306iz LLILZ;

                    @Override // X.C06OD
                    public final void LIZLLL() {
                        C1686306iz c1686306iz = this.LLILZ;
                        TuxSheet tuxSheet = c1686306iz.LLILZ;
                        if (tuxSheet == null || tuxSheet.isStateSaved()) {
                            return;
                        }
                        TuxSheet tuxSheet2 = c1686306iz.LLILZ;
                        if (tuxSheet2 != null) {
                            tuxSheet2.dismiss();
                        }
                        c1686306iz.LLILZ = null;
                        c1686306iz.LLZLI();
                    }

                    @Override // X.C06OD
                    public final Object LJI(C06OO c06oo) {
                        C1686306iz c1686306iz = this.LLILZ;
                        c1686306iz.LIZIZ();
                        return c1686306iz;
                    }

                    @Override // X.C06OD
                    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                        boolean z;
                        if ((this.LL.isDebugMode() || this.LLILZ.LIZ()) && this.LLILLL.isSingleChat()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }

                    {
                        super(EnumC1596306Mv.COLLABORATIVE_COLLECTION_POP_UP);
                        this.LLILLL = c909290ZlnAp;
                        c909290ZlnAp.getEnterFromForMob();
                        this.LLILZ = new C1686306iz(context, fragmentLJI);
                    }
                });
            }
        }
        singleChatNoticeViewModelEp.CQ2(new C1672406gk(Ap(), ap()));
        if (C1717906o5.LIZ()) {
            singleChatNoticeViewModelEp.CQ2(new C1649406d2(Ap(), EnumC1596306Mv.STORY_FRIEND_ANNIVERSARY_FROM_INBOX, new AwS546S0100000_2(this, 485)));
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) != null) {
                c902380ZaeLIZ.LJIIIIZZ(Ap().getConversationId(), new AwS546S0100000_2(this, 486));
                c902380ZaeLIZ.LJI(null, null);
            }
        }
        AssemVMLazy assemVMLazy = this.LLLILZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseSingleChatNoticeAssem.LLLJL;
        if (((ChatRoomCameraVM) assemVMLazy.getValue()).Ei0() && !C1636306av.LIZ()) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            singleChatNoticeViewModelEp.CQ2(new C1698906l1(fragmentLJI2 != null ? fragmentLJI2.getActivity() : null, Ap(), ip()));
        }
        if (C1636306av.LIZ()) {
            return;
        }
        C1675106hB.LIZ.getClass();
        if (!C1675106hB.LIZIZ() || ((Boolean) this.LLLIL.getValue()).booleanValue()) {
            return;
        }
        C909290Zln c909290ZlnAp2 = Ap();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streaks_inline_push_uuid_");
        sbLIZ.append(strValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(c909290ZlnAp2);
        c1684506ih.LIZJ = strLIZIZ;
        c1684506ih.LIZLLL(23);
        c1684506ih.LIZJ(getContext());
        singleChatNoticeViewModelEp.CQ2(new C1690706jh(LJJIJL().getContext(), c909290ZlnAp2, new AwS72S1300000_2(c909290ZlnAp2, this, c1684506ih, strLIZIZ, 7)));
    }

    public final SingleChatNoticeViewModel Ep() {
        AssemVMLazy assemVMLazy = this.LLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIIIILLL;
        return (SingleChatNoticeViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C902380Zae c902380ZaeLIZ;
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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        SingleChatNoticeViewModel singleChatNoticeViewModelEp = Ep();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModelEp), C0PEM.LIZJ.plus(singleChatNoticeViewModelEp.LLIZ), null, new C1640406ba(this.LLLLII, getContext(), singleChatNoticeViewModelEp, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem
    public final SingleChatNoticeViewModel zp() {
        return Ep();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem
    public final void Bp(FollowStatus followStatus) {
        if (followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 2) {
            Ep().xQ2(EnumC1596306Mv.MATCHED_FRIEND);
            if (followStatus.getFollowStatus() == 2) {
                Ep().xQ2(EnumC1596306Mv.MESSAGE_REQUEST_BANNER);
            }
        }
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            iRemindUsersViewHelperLIZ.LIZJ(followStatus.getFollowStatus());
        }
        Ep().xQ2(EnumC1596306Mv.PERMISSION_MESSAGE);
        Lo(300L);
    }

    @C14EU
    public final void onAIGroupShotPublished(IMMediaPublishEvent.AIGroupShotPhotoPublishEvent aIGroupShotPhotoPublishEvent) {
        Ep().xQ2(EnumC1596306Mv.GROUP_SHOT_GET_STARTED_PROMOTION);
    }

    @C14EU
    public final void onStreaksPushClickTurnOnButtonEvent(C1634906ah c1634906ah) {
        String string;
        boolean z = c1634906ah.LIZ;
        this.LLLLII = z;
        if (!z) {
            SingleChatNoticeViewModel singleChatNoticeViewModelEp = Ep();
            Context context = getContext();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            String string2 = null;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModelEp), C0PEM.LIZJ.plus(singleChatNoticeViewModelEp.LLIZ), null, new C1640206bY(singleChatNoticeViewModelEp, null), 2);
            if (context != null) {
                string = context.getString(2131849174);
                string2 = context.getString(2131849173);
            } else {
                string = null;
            }
            if (c19egLIZ != null) {
                C1389910mGz c1389910mGz = new C1389910mGz(c19egLIZ);
                c1389910mGz.LIZ.LIZLLL = 2;
                c1389910mGz.LJI(R.style.y0);
                c1389910mGz.LIZ.LIZIZ = 0;
                c1389910mGz.LJIIJ(string);
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LJI = string2;
                c1360890lWB.LJIIIIZZ = new ACListenerS137S0100000_2(context, 74);
                c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
                c1389910mGz.LJIIJJI();
                return;
            }
            return;
        }
        C824390WVp.LJ(getContext());
    }
}
