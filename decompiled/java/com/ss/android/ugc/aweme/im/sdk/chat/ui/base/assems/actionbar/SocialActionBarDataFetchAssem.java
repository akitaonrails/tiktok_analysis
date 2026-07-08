package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0C64;
import X.C0YSQ;
import X.C0ZFW;
import X.C0ZLZ;
import X.C0ZNY;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1229100i5c;
import X.C127G;
import X.C13IQ;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1576040r7C;
import X.C1605206Qg;
import X.C1637806bA;
import X.C1637906bB;
import X.C1657306eJ;
import X.C1770850wBP;
import X.C1865360ydq;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C23250099c;
import X.C289880BXu;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457780HxI;
import X.C5182020e;
import X.C687700QyG;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C908460ZkS;
import X.C908470ZkT;
import X.C908480ZkU;
import X.C908490ZkV;
import X.C908500ZkW;
import X.C908510ZkX;
import X.C908520ZkY;
import X.C909010ZlL;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456940Hvw;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC876950Yaj;
import Y.AObjectS67S0000000_14;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.LiveEventActionBarViewModel;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.effect.CategoryEffectViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SocialActionBarDataFetchAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 711));
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C127G LLJJ;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        SocialActionBarDataFetchAssem socialActionBarDataFetchAssem = this;
        super.onCreate();
        if (socialActionBarDataFetchAssem.mo().isGroupChat()) {
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatVM.class);
            AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(socialActionBarDataFetchAssem, C724750Sbp.LJIIJ(socialActionBarDataFetchAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 637), AFwS248S0000000_14.get$arr$(554), null, true);
            socialActionBarDataFetchAssem.uo(C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(socialActionBarDataFetchAssem.mo().getConversationId())));
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            AssemViewModel value = assemVMLazyLIZ.getValue();
            C1657306eJ c1657306eJ = new C2217381BqS() { // from class: X.06eJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1657506eL) obj).LLILZ);
                }
            };
            AwS628S0100000_14 awS628S0100000_14 = new AwS628S0100000_14(socialActionBarDataFetchAssem, 105);
            socialActionBarDataFetchAssem = socialActionBarDataFetchAssem;
            C736680Sv4.LJIIIIZZ(socialActionBarDataFetchAssem, value, c1657306eJ, null, awS628S0100000_14, 6);
        }
        if (!C289880BXu.LIZ() || ((Boolean) ((MessageListViewModel) socialActionBarDataFetchAssem.lo()).LLIZ.getValue()).booleanValue()) {
            socialActionBarDataFetchAssem.so();
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialActionBarDataFetchAssem), null, null, new C908500ZkW(socialActionBarDataFetchAssem, null), 3);
        }
        SocialActionBarLightInteractionViewModel.vQ2(socialActionBarDataFetchAssem.ko(), null, null, null, 7);
        AssemVMLazy assemVMLazy = socialActionBarDataFetchAssem.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJI;
        C736680Sv4.LJIIIIZZ(socialActionBarDataFetchAssem, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZkZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LL;
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(socialActionBarDataFetchAssem, 154), 4);
        if (C1576040r7C.LIZJ()) {
            if (socialActionBarDataFetchAssem.mo().isSingleChat()) {
                socialActionBarDataFetchAssem.oo().vQ2(socialActionBarDataFetchAssem.mo().getSingleChatFromUserId(), socialActionBarDataFetchAssem.mo().getConversationId(), false);
            } else if (C1576040r7C.LIZIZ() && !C1229100i5c.LIZ.LJIIJJI(socialActionBarDataFetchAssem.mo().getConversationId())) {
                socialActionBarDataFetchAssem.oo().vQ2("", socialActionBarDataFetchAssem.mo().getConversationId(), true);
            }
            C736680Sv4.LJIIIIZZ(socialActionBarDataFetchAssem, socialActionBarDataFetchAssem.oo(), new C2217381BqS() { // from class: X.0ZVG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C908580Zke) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS616S0100000_2(socialActionBarDataFetchAssem, 155), 4);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialActionBarDataFetchAssem), null, null, new C908510ZkX(socialActionBarDataFetchAssem, null), 3);
        InterfaceC456940Hvw imAvatarDuoService = IMStickerApi.LIZ.LIZIZ().getImAvatarDuoService();
        if (imAvatarDuoService.isEnabled()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialActionBarDataFetchAssem), null, null, new C908480ZkU(imAvatarDuoService, socialActionBarDataFetchAssem, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialActionBarDataFetchAssem), null, null, new C908490ZkV(imAvatarDuoService, socialActionBarDataFetchAssem, null), 3);
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialActionBarDataFetchAssem.class, "chatCameraVM", "getChatCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "commonViewModel", "getCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "lightInteractionActionBarVM", "getLightInteractionActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/common/viewmodel/SocialActionBarLightInteractionViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "categoryEffectViewModel", "getCategoryEffectViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/actionbar/effect/CategoryEffectViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "interactionCardVM", "getInteractionCardVM()Lcom/ss/android/ugc/aweme/im/interactioncard/viewmodel/InteractionCardViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "messageListVM", "getMessageListVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "liveEventActionBarVM", "getLiveEventActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/common/viewmodel/LiveEventActionBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(SocialActionBarDataFetchAssem.class, "greetingCardViewModel", "getGreetingCardViewModel()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(SocialActionBarDataFetchAssem.class, "groupChatVM", "<v#0>", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217401BqU};
    }

    public SocialActionBarDataFetchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 401), AFwS248S0000000_14.get$arr$(182), null, true);
        this.LLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 395));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 402), AFwS248S0000000_14.get$arr$(183), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SocialActionBarLightInteractionViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 403), AFwS248S0000000_14.get$arr$(184), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(CategoryEffectViewModel.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 404), AFwS248S0000000_14.get$arr$(185), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ5, 405), AFwS248S0000000_14.get$arr$(176), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(InteractionCardViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ6, 396), AFwS248S0000000_14.get$arr$(177), null, true);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ7, 397), AFwS248S0000000_14.get$arr$(178), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(ActionBarViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ8, 398), AFwS248S0000000_14.get$arr$(179), null, true);
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(LiveEventActionBarViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ9, 399), AFwS248S0000000_14.get$arr$(180), null, true);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(202);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(IVibeFeedEntranceViewModel.class), aFwS201S0000000_14, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(175), new AwS558S0100000_14((AbstractC738140SxQ) this, 710), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(GreetingCardViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ10), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ10, 400), AFwS248S0000000_14.get$arr$(181), null, true);
    }

    public final CategoryEffectViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (CategoryEffectViewModel) assemVMLazy.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C457780HxI m236do() {
        return (C457780HxI) this.LL.getValue();
    }

    public final ChatRoomCameraVM fo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ChatRoomCameraVM) assemVMLazy.getValue();
    }

    public final SocialActionBarLightInteractionViewModel ko() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (SocialActionBarLightInteractionViewModel) assemVMLazy.getValue();
    }

    public final IIMessageListViewModel lo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (IIMessageListViewModel) assemVMLazy.getValue();
    }

    public final SessionInfo mo() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    public final IVibeFeedEntranceViewModel oo() {
        return (IVibeFeedEntranceViewModel) this.LLJILJILJ.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 29), IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 26), ActionBarViewModel.class, new AObjectS67S0000000_14(this, 27), IVibeFeedEntranceViewModel.class, new AObjectS67S0000000_14(this, 28)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ko();
        SocialActionBarLightInteractionViewModel.yQ2().LIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Context context;
        Context context2;
        super.onResume();
        if (!C289880BXu.LIZ()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_effect_camera_entrance_on_action_bar", true) <= 0 || !bo().LL || (context = getContext()) == null) {
                return;
            }
            ko().LLJ = bo().LLILLL;
            bo().vQ2(context);
            bo().LL = false;
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_effect_camera_entrance_on_action_bar", true) <= 0 || !bo().LL || !((Boolean) ((MessageListViewModel) lo()).LLIZ.getValue()).booleanValue() || (context2 = getContext()) == null) {
            return;
        }
        ko().LLJ = bo().LLILLL;
        bo().vQ2(context2);
        bo().LL = false;
    }

    public final void so() {
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_effect_camera_entrance_on_action_bar", true) <= 0 || !C1865360ydq.LIZ()) {
            return;
        }
        boolean zIsSingleChat = mo().isSingleChat();
        if (C0ZNY.LIZ.LIZLLL(mo().getConversationId(), true) && mo().isGroupChat()) {
            z = true;
        }
        if (zIsSingleChat || z) {
            if (!C289880BXu.LIZ() || ((Boolean) ((MessageListViewModel) lo()).LLIZ.getValue()).booleanValue()) {
                int i = C909010ZlL.LIZ[fo().getState().LL.ordinal()];
                if (i == 1 || i == 2) {
                    return;
                }
                ko().LLJ = bo().LLILLL;
                Context context = getContext();
                if (context != null) {
                    bo().vQ2(context);
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C908470ZkT(this, null), 3);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C908460ZkS(this, null), 3);
            }
        }
    }

    public final Map<String, String> ho(ActionBarButtonConf actionBarButtonConf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = actionBarButtonConf.buttonId;
        if (str != null) {
            linkedHashMap.put("button_id", str);
            linkedHashMap.put("conversation_id", mo().getConversationId());
        }
        return linkedHashMap;
    }

    public final void uo(boolean z) {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        ActionBarViewModel actionBarViewModel = (ActionBarViewModel) assemVMLazy.getValue();
        ActionBarViewModelImpl actionBarViewModelImpl = (ActionBarViewModelImpl) actionBarViewModel;
        actionBarViewModelImpl.MA1(new C908520ZkY(new C1605206Qg(0), new C0ZLZ() { // from class: X.0Zkb
            @Override // X.C0ZLZ
            public final String getId() {
                return "chat_valid";
            }
        }), z);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
