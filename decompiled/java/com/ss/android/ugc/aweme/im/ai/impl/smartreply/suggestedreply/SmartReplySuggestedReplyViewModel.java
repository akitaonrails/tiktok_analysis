package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply;

import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C054L;
import X.C0Y8T;
import X.C0YSQ;
import X.C11NJ;
import X.C13LE;
import X.C13LP;
import X.C1507705vH;
import X.C1508405vO;
import X.C1559260qg8;
import X.C1598406Nq;
import X.C1684506ih;
import X.C1736806r8;
import X.C1807670x8n;
import X.C1DEV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C230000ug;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C869590Y9l;
import X.C909290Zln;
import X.EnumC1705606m6;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.ISmartReplyEtParamsAbility;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteractOption;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteraction;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.message.content.SuggestedReplyData;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartReplySuggestedReplyViewModel extends AssemViewModel<C230000ug> implements ISmartReplyEtParamsAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final IInputFieldAbility LL;
    public final ChatroomEventAbility LLILLJJLI;
    public final MessagePowerListAbility LLILLL;
    public final Map<String, String> LLILZ = new LinkedHashMap();
    public final C1559260qg8 LLILZIL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public volatile AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public final C054G LLIZ;
    public final C11NJ LLIZLLLIL;
    public final C1DEV LLJ;
    public volatile AnonymousClass0956 LLJI;
    public volatile C869590Y9l LLJIJIL;
    public volatile boolean LLJILJIL;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile C869590Y9l LLJJ;
    public volatile String LLJJI;
    public volatile String LLJJIII;
    public volatile C1508405vO LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public volatile C1598406Nq LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SmartReplySuggestedReplyViewModel.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C230000ug(null);
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.ISmartReplyEtParamsAbility
    public final void uI0() {
        ((LinkedHashMap) this.LLILZ).clear();
    }

    public final void xQ2() {
        SessionInfo sessionInfo;
        C869590Y9l c869590Y9l = this.LLJIJIL;
        if (c869590Y9l == null) {
            return;
        }
        this.LLJIJIL = null;
        C457780HxI c457780HxI = (C457780HxI) this.LLILZIL.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null) {
            return;
        }
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZLLL(48);
        c1684506ih.LIZ(sessionInfo);
        c1684506ih.LIZJ = c869590Y9l.getUuid();
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            String conversationId = c869590Y9l.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            fakeMsgOperatorService.LIZ(conversationId, c1684506ih, sessionInfo.getUuid(), null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteFakeSuggestReplyMsg done uuid = ");
        sbLIZ.append(c869590Y9l.getUuid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.ISmartReplyEtParamsAbility
    public final Map<String, String> zF2() {
        return C2097608Jq.LJIIZILJ(this.LLILZ);
    }

    public final String zQ2() {
        C457780HxI c457780HxI = (C457780HxI) this.LLILZIL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (!(sessionInfo instanceof C909290Zln) || sessionInfo == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    public final void wQ2() {
        xQ2();
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = null;
    }

    public final C0Y8T yQ2() {
        String strZQ2 = zQ2();
        if (strZQ2 != null) {
            return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strZQ2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.util.List<? extends X.C869590Y9l> r21, X.InterfaceC1364105Vn<? super java.lang.Boolean> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel.vQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    public SmartReplySuggestedReplyViewModel(IInputFieldAbility iInputFieldAbility, ChatroomEventAbility chatroomEventAbility, MessagePowerListAbility messagePowerListAbility) {
        this.LL = iInputFieldAbility;
        this.LLILLJJLI = chatroomEventAbility;
        this.LLILLL = messagePowerListAbility;
        C1598406Nq c1598406Nq = this.LLJJIJIL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLJJIJIL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLJJIJIL = c1598406Nq;
                }
            }
        }
        this.LLIZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LLIZLLLIL = new C11NJ();
        this.LLJ = C2191201ApK.LIZ();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 288));
    }

    public static C1736806r8 AQ2(String str, DMBotInteraction dMBotInteraction, String str2, String str3, C0Y8T c0y8t) {
        SuggestedReplyData suggestedReplyData;
        List listLLIIII;
        boolean z;
        if (dMBotInteraction != null) {
            C054L.LIZ.getClass();
            Integer num = dMBotInteraction.type;
            int value = EnumC1705606m6.INTERACTION_TYPE_SUGGESTED_REPLY.getValue();
            if (num != null && num.intValue() == value) {
                List<DMBotInteractOption> list = dMBotInteraction.options;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<DMBotInteractOption> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str4 = it2.next().text;
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    listLLIIII = C13LP.LLIIII(arrayList);
                } else {
                    listLLIIII = null;
                }
                if (listLLIIII != null && !listLLIIII.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                suggestedReplyData = new SuggestedReplyData(listLLIIII, z, false);
            } else {
                suggestedReplyData = new SuggestedReplyData(Collections.emptyList(), false, false);
            }
            System.currentTimeMillis();
            C1507705vH c1507705vH = new C1507705vH(suggestedReplyData);
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(48);
            c1684506ih.LIZLLL = 0L;
            c1684506ih.LIZJ = str;
            c1684506ih.LJFF = c1507705vH;
            C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
            if (lastShowMessage != null) {
                c1684506ih.LJ = lastShowMessage;
            }
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
            if (fakeMsgOperatorService == null) {
                return null;
            }
            return fakeMsgOperatorService.LIZIZ(str2, c1684506ih, str3, null, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Api response.interactions transform toSuggestedReplyData  invalid = ");
        sbLIZ.append(dMBotInteraction);
        C2188811AlT.LIZIZ(sbLIZ);
        return null;
    }
}
