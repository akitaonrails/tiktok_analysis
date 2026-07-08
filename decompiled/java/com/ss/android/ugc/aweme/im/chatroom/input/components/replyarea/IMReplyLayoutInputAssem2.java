package com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea;

import X.C019F;
import X.C01GW;
import X.C0HVA;
import X.C0I85;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C343020Dca;
import X.C432670Gxt;
import X.C452501pT;
import X.C457780HxI;
import X.C459000HzG;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMReplyLayoutInputAssem2 extends IMUISlotViewAssem implements C0HVA, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMReplyLayoutInputAssem2.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMReplyLayoutInputAssem2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GreetingCardViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 143), AFwS236S0000000_6.get$arr$(91), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 142));
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C0I85 ip() {
        return (C0I85) this.LLJJIJI.getValue();
    }

    public final GreetingCardViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (GreetingCardViewModel) assemVMLazy.getValue();
    }

    public final boolean lp() {
        SessionInfo sessionInfo;
        SessionInfo sessionInfo2;
        C457780HxI c457780HxI = (C457780HxI) this.LLJJI.getValue();
        if (c457780HxI != null && (sessionInfo2 = c457780HxI.LL) != null && sessionInfo2.isHighRiskConversation()) {
            return true;
        }
        C457780HxI c457780HxI2 = (C457780HxI) this.LLJJI.getValue();
        return (c457780HxI2 == null || (sessionInfo = c457780HxI2.LL) == null || !sessionInfo.isMediaMsgMasking()) ? false : true;
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        return ip();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public final void mp(C869590Y9l c869590Y9l) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MessageListQuotedMessageClickAbility.class, null);
        if (messageListQuotedMessageClickAbility != null) {
            messageListQuotedMessageClickAbility.KZ0(c869590Y9l.getMsgId(), Long.valueOf(c869590Y9l.getMsgType()), c869590Y9l.getMsgId(), c869590Y9l.getMsgId());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated Assem hash=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, ip());
        }
        C0I85 c0i85Ip = ip();
        ViewGroup.LayoutParams layoutParams = c0i85Ip.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        c0i85Ip.requestLayout();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C343020Dca(this, null), 3);
    }

    public final String op(int i) {
        return LJJIJL().getContext().getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:397:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x096f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0I8N hp(X.C869590Y9l r25, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r26) {
        /*
            Method dump skipped, instruction units count: 2417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2.hp(X.0Y9l, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser):X.0I8N");
    }
}
