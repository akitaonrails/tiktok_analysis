package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C123100dR;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C457530Hwt;
import X.C457540Hwu;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C909290Zln;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ExtraInputContentProcessAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExtraInputContentProcessAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ExtraInputContentProcessAssem.class, "messageDraftVM", "getMessageDraftVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/draft/MessageDraftVM;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ExtraInputContentProcessAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 253), AFwS236S0000000_6.get$arr$(129), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageDraftVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 254), AFwS236S0000000_6.get$arr$(130), null, true);
    }

    public final C909290Zln bo() {
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (sessionInfo instanceof C909290Zln) {
            return (C909290Zln) sessionInfo;
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        String inputAutoFillContent;
        super.onParentViewCreated();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457530Hwt(this, null), 3);
        C909290Zln c909290ZlnBo = bo();
        if (c909290ZlnBo == null || (inputAutoFillContent = c909290ZlnBo.getInputAutoFillContent()) == null || !C123100dR.LIZ(inputAutoFillContent)) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457540Hwu(this, inputAutoFillContent, null), 3);
    }
}
