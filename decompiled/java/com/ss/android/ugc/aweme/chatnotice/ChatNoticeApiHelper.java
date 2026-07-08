package com.ss.android.ugc.aweme.chatnotice;

import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatNoticeApiHelper implements IChatNoticeApiHelper {
    public static final /* synthetic */ int LIZJ = 0;
    public TikTokImApi LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper
    public final void LIZ(TikTokImApi tikTokImApi) {
        this.LIZIZ = tikTokImApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r11, int r12, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r13, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C06IO
            if (r0 == 0) goto L20
            r9 = r14
            X.06IO r9 = (X.C06IO) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.06IO r9 = new X.06IO
            r9.<init>(r10, r14)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4e
            goto L52
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.im.common.api.TikTokImApi r3 = r10.LIZIZ
            if (r3 != 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.String r5 = "dm_chat"
            java.lang.String r7 = r13.getConversationId()     // Catch: java.lang.Exception -> L4e
            r8 = 0
            r9.LLILLL = r0     // Catch: java.lang.Exception -> L4e
            r6 = r12
            r4 = r11
            java.lang.Object r0 = r3.acknowledgeNoticeRead(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L4e
            if (r0 != r2) goto L52
            return r2
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper.LIZIZ(java.lang.String, int, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC15556067e r31, java.lang.String r32, java.lang.String r33, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function1 r36, X.InterfaceC1364105Vn r37) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper.LIZJ(X.067e, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
