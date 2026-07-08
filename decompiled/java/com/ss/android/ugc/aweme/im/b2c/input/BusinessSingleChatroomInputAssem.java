package com.ss.android.ugc.aweme.im.b2c.input;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C054T;
import X.C06M6;
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
import X.C457310HwX;
import X.C457400Hwg;
import X.C457780HxI;
import X.C457810HxL;
import X.C459060HzM;
import X.C463000IDq;
import X.C687700QyG;
import X.C723590SZx;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
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
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.common.experiment.IMGuideSendOnAlbumUpdateConfig;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaCreationBridgeApi;
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

/* JADX INFO: loaded from: classes7.dex */
public final class BusinessSingleChatroomInputAssem extends BaseChatInputAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public final C1559260qg8 LLJZIJLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLL = new C1559260qg8(new C723590SZx(this, C06M6.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLLF;
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;
    public final C736950SvV LLLFZ;
    public final AssemVMLazy LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public volatile IInputFieldAbility LLLIIIIL;
    public volatile InterfaceC456690HvX LLLIIIL;
    public volatile C0I20 LLLIIL;
    public C127G LLLIILIL;
    public InterfaceC665370Q7z LLLIL;
    public C0QSJ LLLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "chatNoticeStateVM", "getChatNoticeStateVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatNoticeStateVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "inputFieldAbility", "getInputFieldAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "effectRecommendationState", "getEffectRecommendationState()Lcom/ss/android/ugc/aweme/recommendation/IEffectRecommendationState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "replyStateAbility", "getReplyStateAbility()Lcom/ss/android/ugc/aweme/im/replyarea/ability/IReplyStateAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(BusinessSingleChatroomInputAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

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

    public BusinessSingleChatroomInputAssem() {
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        Function0<ViewModelProvider.Factory> awS550S0100000_6 = null;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatNoticeStateVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 129), AFwS236S0000000_6.get$arr$(79), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 130), AFwS236S0000000_6.get$arr$(80), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SendMessageVM.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 131), AFwS236S0000000_6.get$arr$(81), null, true);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) PluggableExtentionKt.pluggableSpiForReal(IAlbumUpdateGuideViewModelProvider.class);
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            awS550S0100000_6 = new AwS550S0100000_6(defaultViewModelProviderFactory, 127);
        }
        this.LLLFZ = new C736950SvV(C13LE.LIZ(IAlbumUpdateGuideViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), awS550S0100000_6 == null ? C1220000hqw.LIZ(this) : awS550S0100000_6, AFwS236S0000000_6.get$arr$(83), new AwS550S0100000_6((AbstractC738140SxQ) this, 133), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ4, 132), AFwS236S0000000_6.get$arr$(82), null, true);
        this.LLLII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 128));
        this.LLLIIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(58));
    }

    public final C457780HxI getChatHierarchyData() {
        return (C457780HxI) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_PANEL, new AwS585S0100000_6(this, 67));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_FIELD, new AwS585S0100000_6(this, 68));
        if (C2273121DyA.LIZIZ()) {
            C457400Hwg.LIZ(this);
        } else {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_TOP_AREA, new AwS585S0100000_6(this, 69));
            if (C06RM.LIZ()) {
                if (C289840BXq.LIZIZ()) {
                    AssemVMLazy assemVMLazy = this.LLLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
                    C441201ne.LIZ(this, new C463000IDq(((PanelStateViewModel) assemVMLazy.getValue()).LLIZ, 3), "TypingRecommendationPanelAssem", new AwS585S0100000_6(this, 70));
                } else {
                    C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 71));
                }
            }
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, new AwS585S0100000_6(this, 72));
        if (C1865360ydq.LIZ() && C2274381E0m.LIZIZ.LJFF(false)) {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_LEFT_AREA, new AwS585S0100000_6(this, 73));
        }
        if (tp().xQ2().LJIJ()) {
            C441201ne.LIZ(this, new C463000IDq(tp().xQ2().LJIILIIL, 4), "VoiceFieldAssem", new AwS585S0100000_6(this, 66));
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
        C0QSJ c0qsj = this.LLLILZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLILZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final IInputFieldAbility op() {
        IInputFieldAbility iInputFieldAbility;
        IInputFieldAbility iInputFieldAbility2 = this.LLLIIIIL;
        if (iInputFieldAbility2 == null) {
            synchronized (this) {
                iInputFieldAbility2 = this.LLLIIIIL;
                if (iInputFieldAbility2 == null) {
                    C0QSJ c0qsjMp = mp();
                    if (c0qsjMp != null) {
                        iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
                        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
                    } else {
                        iInputFieldAbility = null;
                    }
                    this.LLLIIIIL = iInputFieldAbility;
                    return iInputFieldAbility;
                }
            }
        }
        return iInputFieldAbility2;
    }

    public final C0I20 sp() {
        C0I20 c0i20;
        C0I20 c0i202 = this.LLLIIL;
        if (c0i202 == null) {
            synchronized (this) {
                c0i202 = this.LLLIIL;
                if (c0i202 == null) {
                    C0QSJ c0qsjMp = mp();
                    if (c0qsjMp != null) {
                        c0i20 = (C0I20) c0qsjMp.getAbility(C0I20.class);
                        C687700QyG.LJ(c0i20, C0I20.class);
                    } else {
                        c0i20 = null;
                    }
                    this.LLLIIL = c0i20;
                    return c0i20;
                }
            }
        }
        return c0i202;
    }

    public final SingleChatInputViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
        return (SingleChatInputViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIILIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIILIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 7), IAlbumUpdateGuideViewModel.class, new AObjectS59S0000000_6(this, 11)}, defaultViewModelProviderFactory);
                    this.LLLIILIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        IMInputViewUIAbility iMInputViewUIAbility;
        super.onCreate();
        tp();
        if (SingleChatInputViewModel.vQ2(getChatHierarchyData().LL.getConversationId()) && (iMInputViewUIAbility = (IMInputViewUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMInputViewUIAbility.class, null)) != null) {
            iMInputViewUIAbility.eQ1();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457310HwX(this, null), 3);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(this));
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIIIZZ, (InterfaceC494301wD) this.LLLII.getValue(), IAutoFilledInputContentAbility.class, null, null);
        }
        IMMediaCreationBridgeApi.LIZ.getClass();
        IMMediaCreationBridgeApi value = C459060HzM.LIZIZ.getValue();
        if (value != null) {
            value.LIZ();
        }
        Context context = getContext();
        if (context == null || !((IMGuideSendOnAlbumUpdateConfig) C054T.LIZIZ.getValue()).isEnabled || getChatHierarchyData().LLILLJJLI || !getChatHierarchyData().LL.isFullScreen()) {
            return;
        }
        ((IAlbumUpdateGuideViewModel) this.LLLFZ.getValue()).vQ2(context, getChatHierarchyData().LL.getConversationId());
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(this));
        if (interfaceC665370Q7zLJIIIIZZ != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIIIIZZ, IAutoFilledInputContentAbility.class, null);
        }
    }
}
