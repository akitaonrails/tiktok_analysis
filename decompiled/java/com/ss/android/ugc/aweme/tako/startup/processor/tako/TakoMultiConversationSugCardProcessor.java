package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C1862620yZQ;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiConversationSugCardProcessor implements ITakoNormalProcessorProtocol, ITakoEnterAction {
    public final int LL = 97;
    public final List<String> LLILLJJLI = Collections.singletonList("fetch_sug");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Wd(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r5, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r6) {
        /*
            r4 = this;
            X.0CoI r0 = X.C324800CoI.LIZ
            r0.getClass()
            boolean r0 = X.C324800CoI.LIZ()
            if (r0 == 0) goto L50
            boolean r3 = X.C1861390yXR.LJII(r6)
        Lf:
            boolean r0 = X.C1862270yYr.LIZ(r6)
            if (r0 != 0) goto L29
            boolean r0 = X.C2276501E8q.LIZ()
            if (r0 == 0) goto L4f
            java.lang.String r1 = r6.enterFrom
            if (r1 != 0) goto L21
            java.lang.String r1 = ""
        L21:
            java.lang.String r0 = "notification_page_tikbot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
        L29:
            X.0Cox r1 = X.C325210Cox.LIZ
            java.lang.String r0 = r6.processId
            r1.getClass()
            boolean r0 = X.C325210Cox.LIZ(r0)
            if (r0 == 0) goto L4f
            boolean r0 = X.C324800CoI.LIZ()
            if (r0 == 0) goto L4f
            java.lang.String r2 = r6.processId
            kotlin.jvm.internal.AwS39S0010000_27 r1 = new kotlin.jvm.internal.AwS39S0010000_27
            r0 = 22
            r1.<init>(r3, r0)
            X.C325210Cox.LIZJ(r2, r1)
            if (r3 != 0) goto L4f
            java.lang.String r0 = r6.processId
            X.C325210Cox.LIZIZ(r0)
        L4f:
            return r3
        L50:
            r3 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoMultiConversationSugCardProcessor.Wd(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, com.ss.android.ugc.aweme.tako.model.TakoEnterParams):boolean");
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean TS(androidx.fragment.app.Fragment r5, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r6, X.C1862660yZU r7, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r8, X.C14FD r9) {
        /*
            r4 = this;
            X.0ya1 r0 = X.C1862990ya1.LIZ
            r0.getClass()
            boolean r0 = X.C1862990ya1.LIZIZ()
            r1 = 1
            if (r0 == 0) goto L11
            boolean r0 = r7.LJII
            if (r0 == 0) goto L11
            return r1
        L11:
            boolean r0 = r7.LJIIIZ
            r3 = 0
            if (r0 == 0) goto L17
            return r3
        L17:
            boolean r0 = r8.DG()
            if (r0 == 0) goto L1e
            return r1
        L1e:
            boolean r0 = X.C1862270yYr.LIZ(r6)
            if (r0 != 0) goto L38
            boolean r0 = X.C2276501E8q.LIZ()
            if (r0 == 0) goto L6b
            java.lang.String r1 = r6.enterFrom
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            java.lang.String r0 = "notification_page_tikbot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6b
        L38:
            X.0Cox r1 = X.C325210Cox.LIZ
            java.lang.String r0 = r6.processId
            r1.getClass()
            boolean r0 = X.C325210Cox.LIZ(r0)
            if (r0 == 0) goto L6b
            boolean r0 = X.C1863680yb8.LIZLLL()
            if (r0 == 0) goto L4e
            r8.sI0(r3)
        L4e:
            java.lang.String r2 = r6.processId
            kotlin.jvm.internal.AwS393S0200000_27 r1 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 60
            r1.<init>(r6, r4, r0)
            if (r2 == 0) goto L64
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug> r0 = X.C325210Cox.LIZIZ
            java.lang.Object r0 = r0.remove(r2)
            if (r0 == 0) goto L65
            r1.invoke(r0)
        L64:
            return r3
        L65:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug, kotlin.Unit>> r0 = X.C325210Cox.LIZLLL
            r0.put(r2, r1)
            return r3
        L6b:
            X.0CoI r0 = X.C324800CoI.LIZ
            r0.getClass()
            boolean r2 = X.C324800CoI.LIZ()
            java.lang.String r1 = "0"
            r0 = 0
            r8.Tk2(r1, r0, r2, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoMultiConversationSugCardProcessor.TS(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, X.0yZU, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, X.14FD):boolean");
    }
}
