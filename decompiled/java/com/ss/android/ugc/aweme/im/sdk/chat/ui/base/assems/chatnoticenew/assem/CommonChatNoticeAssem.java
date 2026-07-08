package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem;

import X.AbstractC1643906c9;
import X.AbstractC738140SxQ;
import X.AnonymousClass0629;
import X.AnonymousClass0690;
import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C05YD;
import X.C069P;
import X.C06AH;
import X.C06AJ;
import X.C06AO;
import X.C06IT;
import X.C06LV;
import X.C06NH;
import X.C06NI;
import X.C06NK;
import X.C06OD;
import X.C06YT;
import X.C09IC;
import X.C09R3;
import X.C0HK0;
import X.C0HV6;
import X.C0I0B;
import X.C0IBF;
import X.C0QSJ;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z1S;
import X.C0ZL4;
import X.C11NJ;
import X.C11NZ;
import X.C1220000hqw;
import X.C1239300iM4;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1509305vX;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15607069d;
import X.C1601606Ow;
import X.C1601706Ox;
import X.C1629106Zl;
import X.C1629506Zp;
import X.C1629606Zq;
import X.C1632706aL;
import X.C1634506ad;
import X.C1634706af;
import X.C1635306al;
import X.C1635406am;
import X.C1636306av;
import X.C1636506ax;
import X.C1636706az;
import X.C1637806bA;
import X.C1637906bB;
import X.C1638706bJ;
import X.C1643806c8;
import X.C1645106cL;
import X.C1671006gW;
import X.C1684506ih;
import X.C1686406j0;
import X.C1690806ji;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1714406nW;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C426750GoL;
import X.C447810HhD;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C454640HsE;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C738120SxO;
import X.C786410Ut5;
import X.C824390WVp;
import X.C882340YjQ;
import X.EnumC15556067e;
import X.EnumC1596306Mv;
import X.EnumC899370ZPz;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC452460Hoi;
import X.InterfaceC453190Hpt;
import X.InterfaceC456120Huc;
import X.InterfaceC665370Q7z;
import X.InterfaceC876950Yaj;
import X.InterfaceC904740ZeS;
import Y.AAListenerS315S0100000_2;
import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import Y.AObjectS55S0000000_2;
import Y.ARunnableS102S0100000_2;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotTemplateSelectionVM;
import com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.common.protocol.OnInputHeightChangeListener;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.IMChatNoticeHandlerFactory;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSuggestedStickersAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContentExtKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.LongPressViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.assem.IStickerRecommendBannerStateAbility;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CommonChatNoticeAssem extends UIContentAssem implements ChatNoticeAbility, InterfaceC453190Hpt, IStickerRecommendBannerStateAbility, OnInputHeightChangeListener, StreakWheeDriveTrafficCardDataAbility, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS546S0100000_2(this, 480));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 474));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 472));
    public final C01GW LLJILJIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 477));
    public final C01GW LLJILJILJ = C1509305vX.LIZ(new AwS546S0100000_2(this, 479));
    public final C01GW LLJILLL = C1509305vX.LIZ(new AwS546S0100000_2(this, 468));
    public final C01GW LLJJ = C1509305vX.LIZ(new AwS546S0100000_2(this, 469));
    public final AssemVMLazy LLJJI = C06IT.LIZ(this);
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C736950SvV LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C11NJ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public final C2252321DDq LLJZ;
    public final AssemVMLazy LLJZIJLIL;
    public volatile C06LV LLL;
    public volatile InterfaceC452460Hoi LLLF;
    public volatile C15607069d LLLFF;
    public volatile ChatroomEventAbility LLLFFI;
    public volatile C0HV6 LLLFZ;
    public C127G LLLI;
    public InterfaceC665370Q7z LLLII;
    public C0QSJ LLLIIII;

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract String hp();

    public abstract String kp();

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        String conversationId;
        C05YD<Boolean> c05ydLJIIL;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, ChatNoticeAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IStickerRecommendBannerStateAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, StreakWheeDriveTrafficCardDataAbility.class, null, null);
        }
        SessionInfo sessionInfo = (SessionInfo) this.LLJ.getValue();
        if (sessionInfo != null) {
            C1671006gW c1671006gWAp = ap();
            Intrinsics.LJFF(this.LLJI.getValue(), Boolean.TRUE);
            c1671006gWAp.getClass();
            if (sessionInfo.isReportPage()) {
                C786410Ut5.f0(c1671006gWAp, 8);
            } else {
                c1671006gWAp.LLILLJJLI = sessionInfo;
            }
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.069D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 98), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.069Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 99), 6);
        if (!Intrinsics.LJFF(this.LLJI.getValue(), Boolean.TRUE)) {
            C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.069C
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C069B) obj).LL);
                }
            }, C736820SvI.LJ(), new AwS616S0100000_2(this, 100), 4);
        }
        EventBus.LIZLLL().LJIJJ(this);
        Lo(0L);
        C11NZ<InterfaceC904740ZeS> c11nzS9 = bp().s9();
        if (c11nzS9 != null) {
            this.LLJLIL.LIZ(C1239300iM4.LJ(c11nzS9.LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C06AO(this)));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1629506Zp(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1629606Zq(this, null), 3);
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        if (c454640HsE.LIZIZ().getImSocialAvatarService().isEnabled()) {
            if (!(c454640HsE.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue() instanceof C0HK0)) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1601606Ow(this, null), 3);
            }
            SessionInfo sessionInfo2 = (SessionInfo) this.LLJ.getValue();
            if (sessionInfo2 != null && (conversationId = sessionInfo2.getConversationId()) != null && ((c05ydLJIIL = c454640HsE.LIZIZ().getImAvatarDuoService().LJIIL(conversationId)) == null || !c05ydLJIIL.getValue().booleanValue())) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1601706Ox(conversationId, this, null), 3);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        SuggestedEmojiViewModel suggestedEmojiViewModel = (SuggestedEmojiViewModel) assemVMLazy.getValue();
        LifecycleRegistry lifecycle = getLifecycle();
        suggestedEmojiViewModel.LLILLJJLI = this;
        lifecycle.addObserver(suggestedEmojiViewModel.LLILZLL);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommonChatNoticeAssem.class, "commonChatNoticeViewModel", "getCommonChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/prompts/api/chatnotice/flow/base/viewmodel/ICommonChatNoticeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommonChatNoticeAssem.class, "chatNoticeStateVM", "getChatNoticeStateVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatNoticeStateVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommonChatNoticeAssem.class, "commonViewModel", "getCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CommonChatNoticeAssem.class, "longPressViewModel", "getLongPressViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/LongPressViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CommonChatNoticeAssem.class, "suggestedEmojiViewModel", "getSuggestedEmojiViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/suggestedemoji/SuggestedEmojiViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(CommonChatNoticeAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(CommonChatNoticeAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(CommonChatNoticeAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(CommonChatNoticeAssem.class, "cameraVM", "getCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(CommonChatNoticeAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(CommonChatNoticeAssem.class, "messageListFooterViewModel", "getMessageListFooterViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/mesagelist/MessageListFooterViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(CommonChatNoticeAssem.class, "typingRecommendStickerAnalytics", "getTypingRecommendStickerAnalytics()Lcom/ss/android/ugc/aweme/analytics/ITypingRecommendStickerAnalytics;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(CommonChatNoticeAssem.class, "imUserFetcher", "getImUserFetcher()Lcom/ss/android/ugc/aweme/im/chatroom/api/IMUserFetcher;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(CommonChatNoticeAssem.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(CommonChatNoticeAssem.class, "recordInputAbility", "getRecordInputAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/record/interfaces/IRecordInputAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(CommonChatNoticeAssem.class, "typingRecommendationVM", "getTypingRecommendationVM()Lcom/ss/android/ugc/aweme/viewmodel/ITypingRecommendationVM;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16};
    }

    public CommonChatNoticeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatNoticeStateVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 464), AFwS229S0000000_2.get$arr$(289), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 467), AFwS229S0000000_2.get$arr$(290), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LongPressViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 470), AFwS229S0000000_2.get$arr$(291), null, true);
        this.LLJJIJIL = C1636706az.LIZ(this);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 473), AFwS229S0000000_2.get$arr$(292), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(InputFieldVM.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 475), AFwS229S0000000_2.get$arr$(294), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ6, 481), AFwS229S0000000_2.get$arr$(295), null, true);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ7, 482), AFwS229S0000000_2.get$arr$(296), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(SendMessageVM.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ8, 483), AFwS229S0000000_2.get$arr$(297), null, true);
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(MessageListFooterViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ9, 484), AFwS229S0000000_2.get$arr$(298), null, true);
        this.LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(AIGroupShotTemplateSelectionVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS229S0000000_2.get$arr$(293), new AwS546S0100000_2((AbstractC738140SxQ) this, 476), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJL = C452501pT.LIZIZ(new C1638706bJ(this));
        this.LLJLIL = new C11NJ();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 466));
        this.LLJLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 465));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 471));
        this.LLJZ = C1BNE.LIZ(Boolean.FALSE);
        C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(ITypingRecommendationVM.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ10), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ10, 463), AFwS229S0000000_2.get$arr$(288), null, true);
    }

    public final C0QSJ Jo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIIII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLIIII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final ViewGroup No() {
        return (ViewGroup) this.LLJILLL.getValue();
    }

    public final ViewGroup Oo() {
        return (ViewGroup) this.LLJJ.getValue();
    }

    public final C457780HxI So() {
        return (C457780HxI) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC453190Hpt
    public final void Un() {
        this.LLJZ.setValue(Boolean.TRUE);
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        ((ITypingRecommendationVM) assemVMLazy.getValue()).FQ2();
    }

    public final ChatNoticeStateVM Zo() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (ChatNoticeStateVM) assemVMLazy.getValue();
    }

    public final C1671006gW ap() {
        return (C1671006gW) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.assem.IStickerRecommendBannerStateAbility
    public final AnonymousClass0951 b11() {
        return C09IC.LIZIZ(this.LLJZ);
    }

    public final ChatroomEventAbility bp() {
        ChatroomEventAbility chatroomEventAbility;
        ChatroomEventAbility chatroomEventAbility2 = this.LLLFFI;
        if (chatroomEventAbility2 == null) {
            synchronized (this) {
                chatroomEventAbility2 = this.LLLFFI;
                if (chatroomEventAbility2 == null) {
                    C0QSJ c0qsjJo = Jo();
                    if (c0qsjJo != null) {
                        chatroomEventAbility = (ChatroomEventAbility) c0qsjJo.getAbility(ChatroomEventAbility.class);
                        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
                    } else {
                        chatroomEventAbility = null;
                    }
                    this.LLLFFI = chatroomEventAbility;
                    return chatroomEventAbility;
                }
            }
        }
        return chatroomEventAbility2;
    }

    public final ICommonChatNoticeViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (ICommonChatNoticeViewModel) assemVMLazy.getValue();
    }

    public final MessageListFooterViewModel dp() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (MessageListFooterViewModel) assemVMLazy.getValue();
    }

    public final PanelStateViewModel ep() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    public final ViewGroup ip() {
        return (ViewGroup) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC453190Hpt
    public final void ud() {
        this.LLJZ.setValue(Boolean.FALSE);
    }

    public void up() {
        C1690806ji c1690806jiLIZIZ;
        final SessionInfo sessionInfo = (SessionInfo) this.LLJ.getValue();
        if (sessionInfo == null) {
            return;
        }
        Boolean bool = (Boolean) this.LLJI.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ICommonChatNoticeViewModel iCommonChatNoticeViewModelCp = cp();
        if (!C06NK.LIZ()) {
            IMChatNoticeHandlerFactory.LIZ.getClass();
            IMChatNoticeHandlerFactory value = C1632706aL.LIZIZ.getValue();
            if (value != null && (c1690806jiLIZIZ = value.LIZIZ(LJJIJL().getContext(), zBooleanValue, sessionInfo)) != null) {
                iCommonChatNoticeViewModelCp.HQ2(c1690806jiLIZIZ);
            }
        }
        if (!C1636306av.LIZ()) {
            final C1671006gW c1671006gWAp = ap();
            iCommonChatNoticeViewModelCp.HQ2(new C06OD<C06AJ>(sessionInfo, c1671006gWAp) { // from class: X.06NB
                public final SessionInfo LLILLL;
                public final C1671006gW LLILZ;

                @Override // X.C06OD
                public final void LIZLLL() {
                    this.LLILZ.LIZIZ();
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C1671006gW c1671006gW = this.LLILZ;
                    C1670806gU.LIZIZ(c1671006gW, ((C06AJ) c06oo).LIZJ);
                    return c1671006gW;
                }

                {
                    super(EnumC1596306Mv.PERMISSION_MESSAGE);
                    this.LLILLL = sessionInfo;
                    this.LLILZ = c1671006gWAp;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
                @Override // X.C06OD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJII(X.C06OO r4, X.InterfaceC1364105Vn r5) {
                    /*
                        r3 = this;
                        X.06AJ r4 = (X.C06AJ) r4
                        X.06Mv r0 = r3.LL
                        boolean r0 = r0.isDebugMode()
                        r2 = 1
                        if (r0 != 0) goto L28
                        com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r3.LLILLL
                        java.lang.String r0 = r0.getConversationId()
                        boolean r0 = X.C879390Yef.LJFF(r0)
                        if (r0 != 0) goto L27
                        com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r3.LLILLL
                        boolean r0 = r1 instanceof X.C909290Zln
                        if (r0 == 0) goto L2d
                        X.0Zln r1 = (X.C909290Zln) r1
                        if (r1 == 0) goto L2d
                        boolean r0 = r1.isTCM()
                        if (r0 != r2) goto L2d
                    L27:
                        r2 = 0
                    L28:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                        return r0
                    L2d:
                        java.lang.String r0 = r4.LIZLLL
                        boolean r0 = X.C06N7.LIZ(r0)
                        if (r0 != 0) goto L27
                        goto L28
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06NB.LJII(X.06OO, X.05Vn):java.lang.Object");
                }
            });
            final C1671006gW c1671006gWAp2 = ap();
            final C1635306al c1635306al = new C1635306al(iCommonChatNoticeViewModelCp);
            iCommonChatNoticeViewModelCp.HQ2(new C06OD<C06AH>(c1671006gWAp2, c1635306al) { // from class: X.06NW
                public final C1671006gW LLILLL;
                public final InterfaceC1638406bG LLILZ;
                public C1732606qS LLILZIL;

                @Override // X.C06OD
                public final void LIZLLL() {
                    C1732606qS c1732606qS = this.LLILZIL;
                    if (c1732606qS != null) {
                        c1732606qS.dismiss();
                    }
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C1671006gW c1671006gW = this.LLILLL;
                    String str = ((C06AH) c06oo).LIZJ.noticeCode;
                    if (str == null) {
                        str = "";
                    }
                    C1732606qS c1732606qSLIZ = C1670806gU.LIZ(c1671006gW, str, this.LLILZ);
                    this.LLILZIL = c1732606qSLIZ;
                    return c1732606qSLIZ;
                }

                {
                    super(EnumC1596306Mv.READ_RECEIPT_TOP);
                    this.LLILLL = c1671006gWAp2;
                    this.LLILZ = c1635306al;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
                @Override // X.C06OD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJII(X.C06OO r2, X.InterfaceC1364105Vn r3) {
                    /*
                        r1 = this;
                        X.06AH r2 = (X.C06AH) r2
                        X.06Mv r0 = r1.LL
                        boolean r0 = r0.isDebugMode()
                        if (r0 != 0) goto L1e
                        com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r2.LIZJ
                        java.lang.String r0 = r0.noticeCode
                        if (r0 != 0) goto L12
                        java.lang.String r0 = ""
                    L12:
                        boolean r0 = X.C1651506dN.LIZIZ(r0)
                        if (r0 != 0) goto L1e
                        r0 = 0
                    L19:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L1e:
                        r0 = 1
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06NW.LJII(X.06OO, X.05Vn):java.lang.Object");
                }
            });
        }
        final C1671006gW c1671006gWAp3 = ap();
        iCommonChatNoticeViewModelCp.HQ2(new C06OD<C06AH>(c1671006gWAp3) { // from class: X.06bH
            public final C1671006gW LLILLL;

            @Override // X.C06OD
            public final void LIZLLL() {
                this.LLILLL.LIZIZ();
            }

            {
                super(EnumC1596306Mv.PERMISSION_REMINDER_BANNER);
                this.LLILLL = c1671006gWAp3;
            }

            @Override // X.C06OD
            public final Object LJI(C06OO c06oo) {
                C1671006gW c1671006gW = this.LLILLL;
                IMNoticeMsgStruct iMNoticeMsgStruct = ((C06AH) c06oo).LIZJ;
                c1671006gW.LJI("perm_on_reminder_banner");
                C786410Ut5.f0(c1671006gW, 0);
                C197039127h topSetButton = c1671006gW.getTopSetButton();
                if (topSetButton != null) {
                    C786410Ut5.U8(topSetButton, new ACListenerS137S0100000_2(c1671006gW, 87));
                    C786410Ut5.LLLLLLJ(topSetButton, 0);
                    IRemindUsersAnalytics.LIZ.getClass();
                    IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
                    if (iRemindUsersAnalyticsLIZ != null) {
                        iRemindUsersAnalyticsLIZ.LIZ("chat_page", "chat_room", C0I0B.LJFF.LIZIZ());
                    }
                }
                TuxIconView topCloseView = c1671006gW.getTopCloseView();
                if (topCloseView != null) {
                    C786410Ut5.a9(topCloseView, new ACListenerS137S0100000_2(c1671006gW, 88));
                    C786410Ut5.LLLLLLZZ(topCloseView, 0);
                }
                TuxTextView topTipText = c1671006gW.getTopTipText();
                if (topTipText != null) {
                    String tips = SystemContentExtKt.toSystemContent(iMNoticeMsgStruct).getTips();
                    if (tips == null) {
                        tips = "";
                    }
                    topTipText.setText(tips);
                    topTipText.setTuxFont(42);
                    C786410Ut5.LLLLZLL(topTipText, 0);
                }
                return c1671006gW;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
            @Override // X.C06OD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJII(X.C06OO r3, X.InterfaceC1364105Vn r4) {
                /*
                    r2 = this;
                    X.06Mv r0 = r2.LL
                    boolean r0 = r0.isDebugMode()
                    if (r0 != 0) goto L17
                    r1 = 0
                    com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r1)
                    com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r0 = r0.getImPrivacySettings()
                    boolean r0 = r0.LJI()
                    if (r0 == 0) goto L18
                L17:
                    r1 = 1
                L18:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1638506bH.LJII(X.06OO, X.05Vn):java.lang.Object");
            }
        });
        if (!C1636306av.LIZ()) {
            final ViewGroup viewGroupNo = No();
            iCommonChatNoticeViewModelCp.HQ2(new AbstractC1643906c9<C06AH, C1714406nW>(viewGroupNo, sessionInfo) { // from class: X.06gw
                public final SessionInfo LLILZLL;

                @Override // X.C06OD
                public final void LIZLLL() {
                    C1714406nW c1714406nW = (C1714406nW) this.LLILZIL;
                    if (c1714406nW != null) {
                        c1714406nW.LIZ();
                    }
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C06AH c06ah = (C06AH) c06oo;
                    C1714406nW c1714406nW = (C1714406nW) this.LLILZIL;
                    if (c1714406nW != null) {
                        if (Intrinsics.LJFF(c06ah.LIZJ.noticeCode, "sender_permission_off")) {
                            IComplianceServiceProvider.LIZ.getClass();
                            IComplianceServiceProvider value2 = C1714606nY.LIZIZ.getValue();
                            if (value2 != null && value2.LIZ()) {
                                c1714406nW.LJ();
                            } else {
                                c1714406nW.LIZLLL();
                            }
                        }
                        c1714406nW.LIZIZ("show_chat_page_banner");
                        C786410Ut5.LJLLLLLL(0, c1714406nW);
                        return c1714406nW;
                    }
                    return null;
                }

                {
                    EnumC1596306Mv enumC1596306Mv = EnumC1596306Mv.PERMISSION_OFF;
                    this.LLILZLL = sessionInfo;
                }

                @Override // X.C06OD
                public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                    boolean z;
                    if (!this.LL.isDebugMode() && !this.LLILZLL.isSingleChat()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
        final ViewGroup viewGroupIp = ip();
        final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(sessionInfo, 478);
        final C1635406am c1635406am = new C1635406am(iCommonChatNoticeViewModelCp);
        iCommonChatNoticeViewModelCp.HQ2(new AbstractC1643906c9<C06AH, C1643806c8>(viewGroupIp, awS546S0100000_2, c1635406am) { // from class: X.06c7
            public final Function0<Unit> LLILZLL;
            public final InterfaceC1638406bG LLIZ;

            @Override // X.C06OD
            public final void LIZLLL() {
                C1643806c8 c1643806c8 = (C1643806c8) this.LLILZIL;
                if (c1643806c8 != null) {
                    int visibility = c1643806c8.getVisibility();
                    c1643806c8.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c1643806c8);
                    c1643806c8.LLZLI();
                }
            }

            @Override // X.C06OD
            public final Object LJI(C06OO c06oo) {
                C1643806c8 c1643806c8 = (C1643806c8) this.LLILZIL;
                if (c1643806c8 != null) {
                    InterfaceC1638406bG interfaceC1638406bG = this.LLIZ;
                    Animator animator = c1643806c8.LLJI;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1643806c8, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.addListener(new AAListenerS315S0100000_2(c1643806c8, 2));
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    c1643806c8.LLJI = objectAnimatorOfFloat;
                    int visibility = c1643806c8.getVisibility();
                    c1643806c8.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1643806c8);
                    C786410Ut5.I7(new ACListenerS106S0200000_2(c1643806c8, interfaceC1638406bG, 20), c1643806c8.LLJ);
                }
                this.LLILZLL.invoke();
                return this.LLILZIL;
            }

            @Override // X.C06OD
            public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                return true;
            }

            {
                EnumC1596306Mv enumC1596306Mv = EnumC1596306Mv.BRIC_RECALLED_USERS;
                this.LLILZLL = awS546S0100000_2;
                this.LLIZ = c1635406am;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final void DQ0() {
        cp().CQ2();
    }

    public final void Go() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06YT(this, sp() && !mp(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final void Oi1() {
        C786410Ut5.R4(0.0f, ip());
        C786410Ut5.R4(0.0f, Oo());
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final void f81() {
        C786410Ut5.R4(1.0f, ip());
        C786410Ut5.R4(1.0f, Oo());
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS55S0000000_2(this, 31), IIMessageListViewModel.class, new AObjectS55S0000000_2(this, 29), AIGroupShotTemplateSelectionVM.class, new AObjectS55S0000000_2(this, 32), ITypingRecommendationVM.class, new AObjectS55S0000000_2(this, 30)}, defaultViewModelProviderFactory);
                    this.LLLI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final boolean mp() {
        if (!C0Z1S.LIZ()) {
            return false;
        }
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LIZ().LJJIII() == EnumC899370ZPz.DISABLED;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final boolean ny() {
        return cp().ny();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        cp().KQ2();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, ChatNoticeAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IStickerRecommendBannerStateAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, StreakWheeDriveTrafficCardDataAbility.class, null);
        }
        EventBus.LIZLLL().LJJI(this);
        this.LLJLIL.LJ();
        IMSuggestedStickersAnalytics.LIZIZ.LIZ(C0I0B.LJFF.LIZIZ());
        this.LLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        cp().GQ2(getContext(), this.LLJLLL);
        this.LLJLLL = false;
    }

    public final boolean sp() {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxISo = So();
        if (c457780HxISo == null || (sessionInfo = c457780HxISo.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) {
            return false;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
        return Intrinsics.LJFF(c0y8tLIZ != null ? C882340YjQ.LIZJ(c0y8tLIZ) : null, "chat_request_state");
    }

    public final void tp() {
        SessionInfo sessionInfo;
        C1645106cL c1645106cLLIZJ;
        if (getContext() == null || (sessionInfo = (SessionInfo) this.LLJ.getValue()) == null) {
            return;
        }
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZ(sessionInfo);
        c1684506ih.LIZJ = "aimoji_list_banner";
        c1684506ih.LIZLLL(32);
        c1684506ih.LIZJ(getContext());
        IMChatNoticeHandlerFactory.LIZ.getClass();
        IMChatNoticeHandlerFactory value = C1632706aL.LIZIZ.getValue();
        if (value == null || (c1645106cLLIZJ = value.LIZJ(No(), sessionInfo, sessionInfo.getConversationId(), new AwS368S0200000_2(c1684506ih, this, 44), new AwS368S0200000_2(c1684506ih, this, 45))) == null) {
            return;
        }
        cp().HQ2(c1645106cLLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility
    public final C06LV es() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility
    public final void Cm2(C06LV c06lv) {
        this.LLL = c06lv;
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final void Ff0(EnumC1596306Mv enumC1596306Mv) {
        cp().BQ2(enumC1596306Mv);
    }

    public final <T> T Ho(Function0<? extends T> function0) {
        try {
            if (C1636506ax.LIZ(C724240Sb0.LJI(this))) {
                return function0.invoke();
            }
            return null;
        } catch (C738120SxO e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void Lo(long j) {
        EnumC15556067e enumC15556067e;
        ICommonChatNoticeViewModel iCommonChatNoticeViewModelCp = cp();
        if (C824390WVp.LIZJ(getContext())) {
            enumC15556067e = EnumC15556067e.PUSH_STATUS_ON;
        } else {
            enumC15556067e = EnumC15556067e.PUSH_STATUS_OFF;
        }
        iCommonChatNoticeViewModelCp.DQ2(enumC15556067e, kp(), hp(), j);
    }

    public void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        cp().df1(interfaceC904740ZeS);
    }

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility
    public final ViewGroup e50(C06NH c06nh) {
        int i = C06NI.LIZ[c06nh.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Oo();
                }
                throw new C1954807lC();
            }
            return ap();
        }
        return No();
    }

    @Override // com.ss.android.ugc.aweme.im.common.protocol.OnInputHeightChangeListener
    public final void ee2(int i) {
        C426750GoL.LJIIIZ(Oo(), null, null, null, Integer.valueOf(i), false, 23);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void hideSuggestedAimojiBanner(C1634506ad c1634506ad) {
        if (c1634506ad.LIZ) {
            cp().BQ2(EnumC1596306Mv.AI_MOJI_SUGGESTED);
        }
    }

    public final void lp(InterfaceC456120Huc interfaceC456120Huc) {
        C1629106Zl c1629106Zl = C1629106Zl.LL;
        if (!Intrinsics.LJFF(interfaceC456120Huc, c1629106Zl)) {
            cp().AQ2();
        }
        if (interfaceC456120Huc instanceof C447810HhD) {
            SessionInfo sessionInfo = (SessionInfo) this.LLJ.getValue();
            if (sessionInfo != null) {
                sessionInfo.setShowKeyBoardByDefault(false);
            }
        } else {
            ICommonChatNoticeViewModel iCommonChatNoticeViewModelCp = cp();
            EnumC1596306Mv enumC1596306Mv = EnumC1596306Mv.TYPING_RECOMMENDATION;
            iCommonChatNoticeViewModelCp.JQ2(enumC1596306Mv);
            cp().BQ2(enumC1596306Mv);
        }
        if (Intrinsics.LJFF(interfaceC456120Huc, c1629106Zl)) {
            cp().LQ2();
        }
    }

    @C14EU
    public final void onDMPushClickEnterSystemNotificationsEvent(C1686406j0 c1686406j0) {
        this.LLJLLL = true;
        C824390WVp.LJ(getContext());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRequestStateNoticeCodeUpdated(AnonymousClass0690 anonymousClass0690) {
        String conversationId;
        SessionInfo sessionInfo;
        String str = anonymousClass0690.LIZ;
        C457780HxI c457780HxISo = So();
        if (c457780HxISo != null && (sessionInfo = c457780HxISo.LL) != null) {
            conversationId = sessionInfo.getConversationId();
        } else {
            conversationId = null;
        }
        if (Intrinsics.LJFF(str, conversationId)) {
            Go();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, OnInputHeightChangeListener.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, OnInputHeightChangeListener.class, this);
                    }
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.06aP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C069B) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(this, 95), 4);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS102S0100000_2(this, 55));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object op(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1601806Oy
            if (r0 == 0) goto L80
            r6 = r8
            X.06Oy r6 = (X.C1601806Oy) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 != r3) goto L8b
            X.C155000ia.LIZIZ(r2)
        L23:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
            if (r2 == 0) goto L93
            X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r0 = X.C1668706g9.LIZIZ
            if (r0 == 0) goto L86
            X.06nD r1 = r0.LJFF()
            if (r1 == 0) goto L86
            boolean r0 = r1.LJI(r2)
            if (r0 != 0) goto L42
            boolean r0 = r1.LIZ(r2)
            if (r0 == 0) goto L43
        L42:
            r4 = 1
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L48:
            X.C155000ia.LIZIZ(r2)
            X.0HxI r0 = r7.So()
            r2 = 0
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r0.LL
        L54:
            boolean r0 = r1 instanceof X.C909290Zln
            if (r0 == 0) goto L93
            X.0Zln r1 = (X.C909290Zln) r1
            if (r1 == 0) goto L93
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r1.getFromUser()
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto L93
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r0 = r0.LJ()
            r6.LLILLL = r3
            java.lang.Object r2 = r0.LJIJ(r1, r2, r6)
            if (r2 != r5) goto L23
            return r5
        L7e:
            r1 = r2
            goto L54
        L80:
            X.06Oy r6 = new X.06Oy
            r6.<init>(r7, r8)
            goto L12
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem.op(X.05Vn):java.lang.Object");
    }

    public final C1634706af Vo(C01GW c01gw, C01GW c01gw2) {
        return new C1634706af(C452501pT.LIZIZ(new AwS546S0100000_2(this, 1028)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1030)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1032)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1008)), c01gw2, c01gw, C452501pT.LIZIZ(new AwS546S0100000_2(this, 1010)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1012)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1014)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1016)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1018)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1021)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1023)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1024)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1025)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1026)), C452501pT.LIZIZ(new AwS546S0100000_2(this, 1027)));
    }

    public final void yp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean zLJIIIZ;
        SessionInfo sessionInfo;
        String conversationId;
        C0Y8T c0y8tLIZ;
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIIIL;
        ((IIMessageListViewModel) assemVMLazy.getValue()).vQ2("notice", !z);
        C457780HxI c457780HxISo = So();
        if (c457780HxISo != null && (sessionInfo = c457780HxISo.LL) != null && (conversationId = sessionInfo.getConversationId()) != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId)) != null) {
            IMAIServiceAPI.LIZ.getClass();
            zLJIIIZ = AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ);
        } else {
            zLJIIIZ = false;
        }
        if (z3 && !zLJIIIZ) {
            this.LLJJIJIIJIL.getValue().setStateImmediate(new AwS581S0100000_2(C0ZL4.DISABLED, 673));
        } else {
            this.LLJJIJIIJIL.getValue().setStateImmediate(new AwS581S0100000_2(C0ZL4.FULL, 673));
        }
        if (z) {
            PanelStateViewModel panelStateViewModelEp = ep();
            panelStateViewModelEp.jt(C1629106Zl.LL, panelStateViewModelEp.Ke().getValue().intValue());
            IMInputViewUIAbility iMInputViewUIAbility = (IMInputViewUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMInputViewUIAbility.class, null);
            if (iMInputViewUIAbility != null) {
                iMInputViewUIAbility.eQ1();
            }
        } else {
            IMInputViewUIAbility iMInputViewUIAbility2 = (IMInputViewUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMInputViewUIAbility.class, null);
            if (iMInputViewUIAbility2 != null) {
                iMInputViewUIAbility2.fy1();
            }
        }
        if (z2) {
            PanelStateViewModel panelStateViewModelEp2 = ep();
            panelStateViewModelEp2.jt(C1629106Zl.LL, panelStateViewModelEp2.Ke().getValue().intValue());
        }
        if (z5) {
            ChatRoomCameraVM chatRoomCameraVM = (ChatRoomCameraVM) this.LLJJJJJIL.getValue();
            chatRoomCameraVM.LLIZ = true;
            chatRoomCameraVM.LLIZLLLIL.setValue(C0IBF.FEATURE_STATUS_HIDE);
            chatRoomCameraVM.setStateImmediate(AFwS229S0000000_2.get$arr$(870));
        }
        ChatNoticeStateVM.vQ2(Zo(), Boolean.valueOf(z4), null, 2);
    }
}
