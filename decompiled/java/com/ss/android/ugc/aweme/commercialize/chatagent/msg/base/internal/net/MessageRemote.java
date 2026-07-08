package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C01GW;
import X.C099R;
import X.C09CT;
import X.C2097908Jt;
import X.C321020CiC;
import X.C321070CiH;
import X.C321090CiJ;
import X.C321270Cib;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageRemote {
    public static final MessageRemote LIZ = new MessageRemote();
    public static final C01GW LIZIZ;
    public static final CommerceAgentApi LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(960));
        LIZIZ = c01gwLIZIZ;
        LIZJ = (CommerceAgentApi) c01gwLIZIZ.getValue();
    }

    public static final class ExtraInfo {

        @C09CT("server_extra")
        public final String serverExtra;

        public ExtraInfo() {
            this(null);
        }

        public ExtraInfo(String str) {
            this.serverExtra = str;
        }
    }

    public static C321070CiH LIZIZ(C321020CiC c321020CiC) {
        String json;
        String str;
        new AwS548S0100000_4(c321020CiC, 27);
        int i = c321020CiC.LIZ;
        Message message = c321020CiC.LIZIZ;
        String str2 = message.uuid;
        String str3 = message.msgId;
        int i2 = message.msgType;
        if (c321020CiC.LIZIZ()) {
            CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = c321020CiC.LIZIZ.LIZIZ();
            if (commerceAgentMixFeedLIZIZ == null || (str = commerceAgentMixFeedLIZIZ.text) == null) {
                str = "";
            }
            json = GsonProtectorUtils.toJson(C321270Cib.LIZ(), C2097908Jt.LIZJ(new Pair("text", str)));
        } else {
            json = null;
        }
        return new C321070CiH(i, str2, str3, i2, c321020CiC.LIZIZ.LJI, json, c321020CiC.LIZLLL);
    }

    public static Object LIZJ(C321070CiH c321070CiH, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        BotConfig botConfig = C321090CiJ.LIZ;
        Object objCommerceOpChunk = null;
        if (botConfig != null) {
            str = botConfig.extra;
        } else {
            str = null;
        }
        String json = GsonProtectorUtils.toJson(C321270Cib.LIZ(), new ExtraInfo(str));
        CommerceAgentApi commerceAgentApi = LIZJ;
        if (commerceAgentApi != null && (objCommerceOpChunk = commerceAgentApi.commerceOpChunk(c321070CiH.LIZ, c321070CiH.LIZIZ, c321070CiH.LIZJ, c321070CiH.LIZLLL, c321070CiH.LJ, c321070CiH.LJFF, c321070CiH.LJI, json, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objCommerceOpChunk;
        }
        return objCommerceOpChunk;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:23:0x0055, B:24:0x0058, B:22:0x0049, B:26:0x005c, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:33:0x0083, B:35:0x0093, B:36:0x0098, B:15:0x0033, B:17:0x0037), top: B:40:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:23:0x0055, B:24:0x0058, B:22:0x0049, B:26:0x005c, B:28:0x0075, B:30:0x0079, B:31:0x007d, B:33:0x0083, B:35:0x0093, B:36:0x0098, B:15:0x0033, B:17:0x0037), top: B:40:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r11, long r12, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C321060CiG
            if (r0 == 0) goto L22
            r9 = r15
            X.0CiG r9 = (X.C321060CiG) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r3 = r9.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote r2 = r9.LL
            goto L55
        L22:
            X.0CiG r9 = new X.0CiG
            r9.<init>(r10, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.CommerceAgentApi r3 = com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote.LIZJ     // Catch: java.lang.Exception -> L99
            if (r3 == 0) goto L48
            r9.LL = r10     // Catch: java.lang.Exception -> L99
            r9.LLILZ = r0     // Catch: java.lang.Exception -> L99
            r8 = 2
            r4 = r14
            r6 = r12
            r5 = r11
            java.lang.Object r3 = r3.commerceLoadMoreMsgByConversation(r4, r5, r6, r8, r9)     // Catch: java.lang.Exception -> L99
            if (r3 != r2) goto L46
            return r2
        L46:
            r2 = r10
            goto L58
        L48:
            r2 = r10
        L49:
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse r3 = new com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse     // Catch: java.lang.Exception -> L99
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 7
            r9 = r4
            r3.<init>(r4, r5, r7, r8, r9)     // Catch: java.lang.Exception -> L99
            goto L5c
        L55:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L99
        L58:
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse r3 = (com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse) r3     // Catch: java.lang.Exception -> L99
            if (r3 == 0) goto L49
        L5c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "message remote status code "
            r1.append(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r3.statusCode     // Catch: java.lang.Exception -> L99
            r1.append(r0)     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L99
            r2.getClass()     // Catch: java.lang.Exception -> L99
            int r0 = r3.statusCode     // Catch: java.lang.Exception -> L99
            if (r0 != 0) goto L93
            java.util.List<com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message> r0 = r3.messages     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L92
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L99
        L7d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message r1 = (com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message) r1     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = r1.msgContent     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed r0 = X.C321050CiF.LIZ(r0)     // Catch: java.lang.Exception -> L99
            r1.LJIILJJIL = r0     // Catch: java.lang.Exception -> L99
            goto L7d
        L92:
            return r3
        L93:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Exception -> L99
            r0.<init>(r1)     // Catch: java.lang.Exception -> L99
            throw r0     // Catch: java.lang.Exception -> L99
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse r0 = new com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.LoadMoreMsgByConversationResponse
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 7
            r6 = r1
            r0.<init>(r1, r2, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote.LIZ(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
