package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft;

import X.AbstractC738140SxQ;
import X.AbstractC879060Ye8;
import X.C019F;
import X.C01GW;
import X.C0I1J;
import X.C0I32;
import X.C0I33;
import X.C0I34;
import X.C0I3C;
import X.C0I7E;
import X.C0WZX;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C454980Hsm;
import X.C457780HxI;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C869590Y9l;
import X.EnumC452301pR;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageDraftAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS550S0100000_6(this, 248));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLL;
    public final C736950SvV LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageDraftAssem.class, "draftVM", "getDraftVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/draft/MessageDraftVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public MessageDraftAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageDraftVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 250), AFwS236S0000000_6.get$arr$(127), null, true);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 249);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageReplyVM.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(128);
        this.LLILZ = new C736950SvV(c19719912DlLIZ2, new AwS550S0100000_6(awS550S0100000_6, 251), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) this, 252), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 247));
    }

    public final MessageDraftVM bo() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (MessageDraftVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (this.LLILLJJLI.getValue() == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0I33(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0I32(this, null), 3);
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILZIL.getValue();
        if (abstractC879060Ye8 != null) {
            MessageDraftVM messageDraftVMBo = bo();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageDraftVMBo), messageDraftVMBo.LL, null, new C0I34(abstractC879060Ye8, messageDraftVMBo, null), 2);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C869590Y9l c869590Y9l;
        super.onPause();
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILZIL.getValue();
        if (abstractC879060Ye8 != null) {
            C454980Hsm c454980Hsm = (C454980Hsm) ((MessageReplyVM) this.LLILZ.getValue()).LLILZ.getValue();
            if ((c454980Hsm != null ? c454980Hsm.LIZIZ : null) != C0I3C.STORY_VIEWER_LIST_REPLY) {
                MessageDraftVM messageDraftVMBo = bo();
                C454980Hsm c454980Hsm2 = (C454980Hsm) ((MessageReplyVM) this.LLILZ.getValue()).LLILZ.getValue();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageDraftVMBo), messageDraftVMBo.LL, null, new C0I1J(C2204961BRm.LLZLLLL((C0I7E) this.LL.getValue(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMeay1PRdJ2g/OBTJHB+FOsnwyXf+yG/MbtthZz3WWM0lRKtPHMe1SZLJX", null)), messageDraftVMBo, abstractC879060Ye8, (c454980Hsm2 == null || (c869590Y9l = c454980Hsm2.LIZ) == null) ? null : Long.valueOf(c869590Y9l.getMsgId()), null), 2);
            }
        }
    }
}
