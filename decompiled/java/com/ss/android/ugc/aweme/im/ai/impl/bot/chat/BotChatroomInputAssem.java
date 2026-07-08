package com.ss.android.ugc.aweme.im.ai.impl.bot.chat;

import X.C019F;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C15390060u;
import X.C1633506aT;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2273121DyA;
import X.C457040Hw6;
import X.C457400Hwg;
import X.C457810HxL;
import X.C687700QyG;
import X.C724750Sbp;
import X.EnumC457820HxM;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS381S0100000_6;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BotChatroomInputAssem extends BaseChatInputAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final AssemVMLazy LLJZIJLIL;
    public final AssemVMLazy LLL;
    public volatile IInputFieldAbility LLLF;
    public C127G LLLFF;
    public InterfaceC665370Q7z LLLFFI;
    public C0QSJ LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotChatroomInputAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BotChatroomInputAssem.class, "singleChatInputVM", "getSingleChatInputVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewmodel/SingleChatInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BotChatroomInputAssem.class, "sendMessageVM", "getSendMessageVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendMessageVM;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BotChatroomInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleChatInputViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 101), AFwS236S0000000_6.get$arr$(74), null, true);
        C1637906bB c1637906bBLIZ = C1633506aT.LIZ();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SendMessageVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ, new AwS550S0100000_6(c19719912DlLIZ2, 102), AFwS236S0000000_6.get$arr$(75), null, true);
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

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_PANEL, AFwS236S0000000_6.get$arr$(72));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_FIELD, new AwS585S0100000_6(this, 63));
        if (C15390060u.LL.LJJIIZI()) {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, AFwS236S0000000_6.get$arr$(73));
        }
        if (C2273121DyA.LIZIZ()) {
            C457400Hwg.LIZ(this);
        } else {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_TOP_AREA, new AwS585S0100000_6(this, 64));
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, new AwS585S0100000_6(this, 65));
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
        C457040Hw6.LIZLLL((View) this.LLJJJ.getValue());
        C457040Hw6.LIZIZ(ip());
        C457040Hw6.LIZ((View) this.LLJJIJIL.getValue());
        C457040Hw6.LIZJ((View) this.LLJJIJI.getValue());
    }

    public final C0QSJ mp() {
        C0QSJ c0qsj = this.LLLFZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFFI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLFFI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLFZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SingleChatInputViewModel.class, new AObjectS381S0100000_6(this, 11)}, defaultViewModelProviderFactory);
                    this.LLLFF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }
}
