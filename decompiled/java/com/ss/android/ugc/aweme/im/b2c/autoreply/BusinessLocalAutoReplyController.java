package com.ss.android.ugc.aweme.im.b2c.autoreply;

import X.C909290Zln;
import X.InterfaceC1738006rK;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply;
import com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.ISendMessageTransientAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLocalAutoReplyController implements ISendMessageTransientAbility {
    public final SessionInfo LL;
    public final List<InterfaceC1738006rK<?>> LLILLJJLI = new ArrayList();
    public final ConcurrentHashMap<String, List<BusinessAutoMessage>> LLILLL = new ConcurrentHashMap<>();
    public final List<KeywordReply> LLILZ = new ArrayList();
    public final List<SuggestedQuestion> LLILZIL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.ISendMessageTransientAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String V40() {
        /*
            r12 = this;
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply> r0 = r12.LLILZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
            boolean r0 = r4.hasNext()
            r6 = 0
            r3 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply r0 = (com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply) r0
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r0 = r0.replies
            if (r0 == 0) goto L44
            int r0 = r0.size()
        L1e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L22:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply r0 = (com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply) r0
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r0 = r0.replies
            if (r0 == 0) goto L42
            int r0 = r0.size()
        L36:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L22
            r2 = r1
            goto L22
        L42:
            r0 = 0
            goto L36
        L44:
            r0 = 0
            goto L1e
        L46:
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion> r0 = r12.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion r0 = (com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion) r0
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r0 = r0.replies
            if (r0 == 0) goto L91
            int r0 = r0.size()
        L62:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L66:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion r0 = (com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion) r0
            java.util.List<com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage> r0 = r0.replies
            if (r0 == 0) goto L86
            int r0 = r0.size()
        L7a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L66
            r2 = r1
            goto L66
        L86:
            r0 = 0
            goto L7a
        L88:
            if (r2 == 0) goto L93
            int r0 = r2.intValue()
            if (r0 <= 0) goto L93
            goto L9b
        L91:
            r0 = 0
            goto L62
        L93:
            r0 = 0
            goto L9b
        L95:
            if (r2 == 0) goto L46
            int r0 = r2.intValue()
        L9b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lc7
            int r1 = r1.intValue()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
        Lae:
            if (r3 >= r1) goto Lba
            java.lang.String r0 = X.C1017903yT.LIZ()
            r4.add(r0)
            int r3 = r3 + 1
            goto Lae
        Lba:
            java.lang.String r5 = ","
            r8 = 0
            r11 = 62
            r7 = r6
            r9 = r6
            r10 = r6
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.autoreply.BusinessLocalAutoReplyController.V40():java.lang.String");
    }

    public BusinessLocalAutoReplyController(C909290Zln c909290Zln) {
        this.LL = c909290Zln;
    }
}
