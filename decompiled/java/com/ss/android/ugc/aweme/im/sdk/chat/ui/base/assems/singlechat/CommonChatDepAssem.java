package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C06M6;
import X.C09R3;
import X.C0HV6;
import X.C0I20;
import X.C0QSJ;
import X.C0ZO9;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C899550ZQr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC441960HUs;
import X.InterfaceC456460HvA;
import X.InterfaceC456500HvE;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS407S0100000_33;
import Y.AObjectS80S0000000_33;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class CommonChatDepAssem extends AbstractC738140SxQ implements InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C736950SvV LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommonChatDepAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommonChatDepAssem.class, "chatroomCameraVM", "getChatroomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommonChatDepAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CommonChatDepAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CommonChatDepAssem.class, "typingRecommendationVM", "getTypingRecommendationVM()Lcom/ss/android/ugc/aweme/viewmodel/ITypingRecommendationVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(CommonChatDepAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(CommonChatDepAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public CommonChatDepAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C06M6.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ, 212), AFwS279S0000000_33.get$arr$(166), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ2, 213), AFwS278S0000000_32.get$arr$(57), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SendMessageVM.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ3, 214), AFwS279S0000000_33.get$arr$(167), null, true);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 208);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MessageReplyVM.class);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(169);
        this.LLILZIL = new C736950SvV(c19719912DlLIZ4, new AwS576S0100000_32((Function0) awS576S0100000_32, 217), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS279S0000000_33, new AwS577S0100000_33((AbstractC738140SxQ) this, 2407), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(ActionBarViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ5, 215), AFwS279S0000000_33.get$arr$(168), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(ITypingRecommendationVM.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ6, 216), AFwS279S0000000_33.get$arr$(163), null, true);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 209));
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ7, 210), AFwS279S0000000_33.get$arr$(164), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS576S0100000_32(c19719912DlLIZ8, 211), AFwS279S0000000_33.get$arr$(165), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ActionBarViewModel.class, new AObjectS80S0000000_33(this, 8), ITypingRecommendationVM.class, new AObjectS80S0000000_33(this, 9), SingleChatInputViewModel.class, new AObjectS407S0100000_33(this, 1)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        c0qsjLIZIZ.unbindAbility(assemVMLazy.getValue(), InterfaceC456500HvE.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL.getValue(), SessionInfo.class);
        c0qsjLIZIZ.unbindAbility(this.LLILLJJLI.getValue(), IInputFieldAbility.class);
        c0qsjLIZIZ.unbindAbility(((SingleChatInputViewModel) this.LLJI.getValue()).xQ2(), C0HV6.class);
        c0qsjLIZIZ.unbindAbility(C0ZO9.LIZLLL, C899550ZQr.class);
        c0qsjLIZIZ.unbindAbility(this.LLILLL.getValue(), InterfaceC456680HvW.class);
        c0qsjLIZIZ.unbindAbility(this.LLILZIL.getValue(), C0I20.class);
        c0qsjLIZIZ.unbindAbility(this.LLILZ.getValue(), InterfaceC456460HvA.class);
        c0qsjLIZIZ.unbindAbility(this.LLJ.getValue(), InterfaceC441960HUs.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZ.getValue(), InterfaceC456690HvX.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        c0qsjLIZIZ.bindAbility(assemVMLazy.getValue(), InterfaceC456500HvE.class);
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL.getValue(), SessionInfo.class);
        c0qsjLIZIZ.bindAbility(this.LLILLJJLI.getValue(), IInputFieldAbility.class);
        c0qsjLIZIZ.bindAbility(((SingleChatInputViewModel) this.LLJI.getValue()).xQ2(), C0HV6.class);
        c0qsjLIZIZ.bindAbility(C0ZO9.LIZLLL, C899550ZQr.class);
        c0qsjLIZIZ.bindAbility(this.LLILLL.getValue(), InterfaceC456680HvW.class);
        c0qsjLIZIZ.bindAbility(this.LLILZIL.getValue(), C0I20.class);
        c0qsjLIZIZ.bindAbility(this.LLILZ.getValue(), InterfaceC456460HvA.class);
        c0qsjLIZIZ.bindAbility(this.LLJ.getValue(), InterfaceC441960HUs.class);
        c0qsjLIZIZ.bindAbility(this.LLIZ.getValue(), InterfaceC456690HvX.class);
    }
}
