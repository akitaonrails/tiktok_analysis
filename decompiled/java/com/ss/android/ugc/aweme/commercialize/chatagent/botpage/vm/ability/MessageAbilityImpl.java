package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability;

import X.AbstractC321800CjS;
import X.C0PEM;
import X.C1DFB;
import X.C2217381BqS;
import X.C23250099c;
import X.C319820CgG;
import X.C319830CgH;
import X.C319840CgI;
import X.C320570ChT;
import X.C320580ChU;
import X.C320610ChX;
import X.C320620ChY;
import X.C320640Cha;
import X.C320650Chb;
import X.C320760Chm;
import X.C320780Cho;
import X.C320790Chp;
import X.C320870Chx;
import X.C321110CiL;
import X.C321650CjD;
import X.C321780CjQ;
import X.C504670Jqj;
import X.C830490Whz;
import X.EnumC320940Ci4;
import X.InterfaceC320950Ci5;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.AIBotInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.otherpage.sheet.CommerceAgentSevenSheetVM;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageAbilityImpl implements IMessageAbility {
    public final MessageViewModel LL;
    public final CommerceAgentEnterParams LLILLJJLI;
    public final InterfaceC320950Ci5 LLILLL;
    public final Lifecycle LLILZ;
    public final CommerceAgentSevenSheetVM LLILZIL;

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void ZU() {
        CommerceAgentSevenSheetVM commerceAgentSevenSheetVM = this.LLILZIL;
        if (commerceAgentSevenSheetVM != null) {
            commerceAgentSevenSheetVM.setState(AFwS236S0000000_6.get$arr$(428));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final boolean oj() {
        MessageViewModel messageViewModel = this.LL;
        return messageViewModel != null && messageViewModel.oj();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void A02(Message message) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && message != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C320790Chp(messageViewModel, message, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void Zd(Function1<? super CommerceAgentActiveActionItem, Unit> function1) {
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            AssemViewModel.selectSubscribe$default(messageViewModel, new C2217381BqS() { // from class: X.0CiA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C321700CjI) obj).LLJ;
                }
            }, null, null, null, new AwS583S0100000_4(new AwS583S0100000_4(function1, (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 45), 294), 14, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void dL2(Message message) {
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ;
        new C830490Whz();
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null && message != null && (commerceAgentMixFeedLIZIZ = message.LIZIZ()) != null && commerceAgentMixFeedLIZIZ.text != null && messageViewModel.LLILLL != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C320780Cho(messageViewModel, message, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void nn2(Context context) {
        CommerceAgentEnterParams commerceAgentEnterParams;
        C321110CiL c321110CiL;
        if (context == null || (commerceAgentEnterParams = this.LLILLJJLI) == null) {
            return;
        }
        C320760Chm c320760Chm = C320760Chm.LIZ;
        Lifecycle lifecycle = this.LLILZ;
        AIBotInfo aIBotInfo = commerceAgentEnterParams.botInfo;
        long j = aIBotInfo.botId;
        int i = aIBotInfo.botSource;
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(22);
        c320760Chm.getClass();
        C320640Cha c320640Cha = new C320640Cha("inbox", j, i, lifecycle);
        ConcurrentHashMap<String, C320640Cha> concurrentHashMap = C320760Chm.LIZIZ;
        C320610ChX c320610ChX = C320640Cha.LJIIJ;
        concurrentHashMap.put(C320610ChX.LJ(i, j), c320640Cha);
        aFwS232S0000000_4.getClass();
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.LL = this.LLILLJJLI;
            messageViewModel.LLILLL = c320640Cha;
            messageViewModel.LLILLJJLI.LIZ.put(C320610ChX.LJ(c320640Cha.LJ, c320640Cha.LIZLLL), c320640Cha);
            InterfaceC320950Ci5 interfaceC320950Ci5 = this.LLILLL;
            if (interfaceC320950Ci5 != null) {
                messageViewModel.LLILZIL.add(interfaceC320950Ci5);
            }
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(messageViewModel);
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(viewModelScope, c1dfb, null, new C319820CgG(messageViewModel, null), 2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), c1dfb, null, new C320580ChU(messageViewModel, null), 2);
            C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(4125), false);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), c1dfb, null, new C320620ChY(messageViewModel, null), 2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), c1dfb, null, new C320570ChT(messageViewModel, null), 2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), c1dfb, null, new C319830CgH(messageViewModel, null), 2);
            C23250099c.LIZLLL(messageViewModel.getLifecycleScope(), c1dfb, null, new C319840CgI(c320640Cha, null), 2);
            if (!C504670Jqj.LIZIZ(this.LLILLJJLI.autoSendMsgContent) && this.LL.oj()) {
                messageViewModel.setState(AFwS232S0000000_4.get$arr$(217));
            }
        }
        Long lValueOf = Long.valueOf(this.LLILLJJLI.botInfo.botId);
        Integer numValueOf = Integer.valueOf(this.LLILLJJLI.botInfo.botSource);
        synchronized (c320610ChX) {
            if (lValueOf != null && numValueOf != null) {
                c321110CiL = C320640Cha.LJIILLIIL.get(C320610ChX.LJ(numValueOf.intValue(), lValueOf.longValue()));
            } else {
                c321110CiL = null;
            }
        }
        if (c321110CiL != null) {
            for (Message message : c321110CiL.LIZIZ) {
                if (message.LIZJ == 3 && message.serverStatus == 0) {
                    ConcurrentLinkedQueue<AbstractC321800CjS> concurrentLinkedQueue = AbstractC321800CjS.LIZIZ;
                    C321780CjQ.LIZ(EnumC320940Ci4.QUEUE, AFwS232S0000000_4.get$arr$(5), new C320650Chb(c320640Cha, message, false, null));
                }
            }
        }
    }

    public MessageAbilityImpl(MessageViewModel messageViewModel, CommerceAgentEnterParams commerceAgentEnterParams, C321650CjD c321650CjD, Lifecycle lifecycle, CommerceAgentSevenSheetVM commerceAgentSevenSheetVM) {
        this.LL = messageViewModel;
        this.LLILLJJLI = commerceAgentEnterParams;
        this.LLILLL = c321650CjD;
        this.LLILZ = lifecycle;
        this.LLILZIL = commerceAgentSevenSheetVM;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility
    public final void xZ0(String str, boolean z, Map map, CommerceAgentActiveActionItem commerceAgentActiveActionItem, CommerceAgentActiveBotItem commerceAgentActiveBotItem, String str2, int i, int i2, ExtraRequestInfo extraRequestInfo) {
        String string = UUID.randomUUID().toString();
        MessageViewModel messageViewModel = this.LL;
        if (messageViewModel != null) {
            messageViewModel.vQ2(str, z, string, map, commerceAgentActiveActionItem, commerceAgentActiveBotItem, str2, i, i2, extraRequestInfo);
        }
    }
}
