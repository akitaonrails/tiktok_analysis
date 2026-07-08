package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C054T;
import X.C06RM;
import X.C09R3;
import X.C0I20;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C1383370m6R;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1633506aT;
import X.C1637806bA;
import X.C1637906bB;
import X.C1865360ydq;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2273121DyA;
import X.C2274381E0m;
import X.C23250099c;
import X.C289840BXq;
import X.C441201ne;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457040Hw6;
import X.C457290HwV;
import X.C457300HwW;
import X.C457400Hwg;
import X.C457780HxI;
import X.C457810HxL;
import X.C463000IDq;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC457820HxM;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456690HvX;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.AObjectS381S0100000_6;
import Y.AObjectS59S0000000_6;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModelProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.common.experiment.IMGuideSendOnAlbumUpdateConfig;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleChatroomInputAssem extends BaseChatInputAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C1559260qg8 LLJZIJLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLL;
    public final AssemVMLazy LLLF;
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;
    public final AssemVMLazy LLLFZ;
    public final AssemVMLazy LLLI;
    public final C01GW LLLII;
    public final C736950SvV LLLIIII;
    public final C01GW LLLIIIIL;
    public volatile IInputFieldAbility LLLIIIL;
    public volatile InterfaceC456690HvX LLLIIL;
    public volatile C0I20 LLLIILIL;
    public C127G LLLIL;
    public InterfaceC665370Q7z LLLILZ;
    public C0QSJ LLLILZJ;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C457780HxI chatHierarchyData;
        IMInputViewUIAbility iMInputViewUIAbility;
        super.onCreate();
        C457780HxI chatHierarchyData2 = getChatHierarchyData();
        if (chatHierarchyData2 != null) {
            tp();
            if (SingleChatInputViewModel.vQ2(chatHierarchyData2.LL.getConversationId()) && (iMInputViewUIAbility = (IMInputViewUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMInputViewUIAbility.class, null)) != null) {
                iMInputViewUIAbility.eQ1();
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457300HwW(this, null), 3);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(this));
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIIIZZ, (InterfaceC494301wD) this.LLLIIIIL.getValue(), IAutoFilledInputContentAbility.class, null, null);
        }
        IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
        if (iMMediaServiceInternalBridgeLIZ != null) {
            iMMediaServiceInternalBridgeLIZ.LIZ();
        }
        AssemVMLazy assemVMLazy = this.LLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Hwe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C457970Hxb) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 33), 6);
        Context context = getContext();
        if (context == null || (chatHierarchyData = getChatHierarchyData()) == null || !((IMGuideSendOnAlbumUpdateConfig) C054T.LIZIZ.getValue()).isEnabled || chatHierarchyData.LLILLJJLI || !chatHierarchyData.LL.isFullScreen()) {
            return;
        }
        ((IAlbumUpdateGuideViewModel) this.LLLIIII.getValue()).vQ2(context, chatHierarchyData.LL.getConversationId());
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleChatroomInputAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SingleChatroomInputAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SingleChatroomInputAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SingleChatroomInputAssem.class, "chatNoticeStateVM", "getChatNoticeStateVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatNoticeStateVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SingleChatroomInputAssem.class, "chatCommonVM", "getChatCommonVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SingleChatroomInputAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SingleChatroomInputAssem.class, "chatroomCameraVM", "getChatroomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SingleChatroomInputAssem.class, "effectRecommendationState", "getEffectRecommendationState()Lcom/ss/android/ugc/aweme/recommendation/IEffectRecommendationState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(SingleChatroomInputAssem.class, "replyStateAbility", "getReplyStateAbility()Lcom/ss/android/ugc/aweme/im/replyarea/ability/IReplyStateAbility;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public SingleChatroomInputAssem() {
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        Function0<ViewModelProvider.Factory> awS550S0100000_6 = null;
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SendMessageVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS550S0100000_6(c19719912DlLIZ, 307), AFwS236S0000000_6.get$arr$(174), null, true);
        C1637906bB c1637906bBLIZ2 = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS550S0100000_6(c19719912DlLIZ2, 308), AFwS236S0000000_6.get$arr$(175), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatNoticeStateVM.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ3, 309), AFwS236S0000000_6.get$arr$(176), null, true);
        C1637906bB c1637906bBLIZ3 = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bBLIZ3, new AwS550S0100000_6(c19719912DlLIZ4, 301), AFwS236S0000000_6.get$arr$(170), null, true);
        C1637906bB c1637906bBLIZ4 = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLLFZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bBLIZ4, new AwS550S0100000_6(c19719912DlLIZ5, 302), AFwS236S0000000_6.get$arr$(172), null, true);
        C1637906bB c1637906bBLIZ5 = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bBLIZ5, new AwS550S0100000_6(c19719912DlLIZ6, 306), AFwS236S0000000_6.get$arr$(173), null, true);
        this.LLLII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(89));
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IAlbumUpdateGuideViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            awS550S0100000_6 = new AwS550S0100000_6(defaultViewModelProviderFactory, 304);
        }
        this.LLLIIII = new C736950SvV(C13LE.LIZ(IAlbumUpdateGuideViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), awS550S0100000_6 == null ? C1220000hqw.LIZ(this) : awS550S0100000_6, AFwS236S0000000_6.get$arr$(171), new AwS550S0100000_6((AbstractC738140SxQ) this, 303), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 305));
    }

    public final C457780HxI getChatHierarchyData() {
        return (C457780HxI) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_PANEL, new AwS585S0100000_6(this, 99));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_FIELD, new AwS585S0100000_6(this, 100));
        if (C2273121DyA.LIZIZ()) {
            C457400Hwg.LIZ(this);
        } else {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_TOP_AREA, new AwS585S0100000_6(this, 101));
            if (C06RM.LIZ()) {
                if (C289840BXq.LIZIZ()) {
                    AssemVMLazy assemVMLazy = this.LLLFZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
                    C441201ne.LIZ(this, new C463000IDq(((PanelStateViewModel) assemVMLazy.getValue()).LLIZ, 30), "TypingRecommendationPanelAssem", new AwS585S0100000_6(this, 102));
                } else {
                    C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 103));
                }
            }
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, new AwS585S0100000_6(this, 104));
        if (C1865360ydq.LIZ() && C2274381E0m.LIZIZ.LJFF(false)) {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_LEFT_AREA, new AwS585S0100000_6(this, 105));
        }
        if (tp().xQ2().LJIJ()) {
            C441201ne.LIZ(this, new C463000IDq(tp().xQ2().LJIILIIL, 31), "VoiceFieldAssem", new AwS585S0100000_6(this, 98));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
        C457040Hw6.LIZLLL((View) this.LLJJJ.getValue());
        C457040Hw6.LIZIZ(ip());
        C457040Hw6.LIZ((View) this.LLJJIJIL.getValue());
        C457040Hw6.LIZJ((View) this.LLJJIJI.getValue());
    }

    public final C0QSJ mp() {
        C0QSJ c0qsj = this.LLLILZJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLILZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLILZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLILZJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final IInputFieldAbility op() {
        IInputFieldAbility iInputFieldAbility;
        IInputFieldAbility iInputFieldAbility2 = this.LLLIIIL;
        if (iInputFieldAbility2 == null) {
            synchronized (this) {
                iInputFieldAbility2 = this.LLLIIIL;
                if (iInputFieldAbility2 == null) {
                    C0QSJ c0qsjMp = mp();
                    if (c0qsjMp != null) {
                        iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
                        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
                    } else {
                        iInputFieldAbility = null;
                    }
                    this.LLLIIIL = iInputFieldAbility;
                    return iInputFieldAbility;
                }
            }
        }
        return iInputFieldAbility2;
    }

    public final C0I20 sp() {
        C0I20 c0i20;
        C0I20 c0i202 = this.LLLIILIL;
        if (c0i202 == null) {
            synchronized (this) {
                c0i202 = this.LLLIILIL;
                if (c0i202 == null) {
                    C0QSJ c0qsjMp = mp();
                    if (c0qsjMp != null) {
                        c0i20 = (C0I20) c0qsjMp.getAbility(C0I20.class);
                        C687700QyG.LJ(c0i20, C0I20.class);
                    } else {
                        c0i20 = null;
                    }
                    this.LLLIILIL = c0i20;
                    return c0i20;
                }
            }
        }
        return c0i202;
    }

    public final SingleChatInputViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (SingleChatInputViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 3), ChatCommonViewModel.class, new AObjectS59S0000000_6(this, 7), IAlbumUpdateGuideViewModel.class, new AObjectS59S0000000_6(this, 8)}, defaultViewModelProviderFactory);
                    this.LLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(this));
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIIIIZZ, IAutoFilledInputContentAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem, com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457290HwV(this, null), 3);
    }
}
