package com.ss.android.ugc.aweme.im.b2c.replies.router;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes20.dex */
public final class IMQuickReplyManagePageAction implements IRouteAction {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[PHI: r9
      0x002a: PHI (r9v8 java.lang.String) = (r9v0 java.lang.String), (r9v9 java.lang.String) binds: [B:16:0x0028, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[PHI: r9
      0x0032: PHI (r9v7 java.lang.String) = (r9v0 java.lang.String), (r9v8 java.lang.String) binds: [B:16:0x0028, B:18:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[PHI: r9 r10
      0x0035: PHI (r9v1 java.lang.String) = (r9v7 java.lang.String), (r9v8 java.lang.String) binds: [B:20:0x0033, B:18:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r10v0 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:20:0x0033, B:18:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d A[PHI: r9 r10
      0x003d: PHI (r9v6 java.lang.String) = (r9v1 java.lang.String), (r9v7 java.lang.String) binds: [B:22:0x003b, B:20:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r10v5 java.lang.String) = (r10v0 java.lang.String), (r10v6 java.lang.String) binds: [B:22:0x003b, B:20:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[PHI: r9 r10 r11
      0x0040: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String) binds: [B:22:0x003b, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:22:0x003b, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r11v4 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:22:0x003b, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[PHI: r9 r10 r11
      0x00b8: PHI (r9v2 java.lang.String) = (r9v5 java.lang.String), (r9v6 java.lang.String) binds: [B:26:0x0046, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r10v1 java.lang.String) = (r10v4 java.lang.String), (r10v5 java.lang.String) binds: [B:26:0x0046, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r11v1 java.lang.String) = (r11v4 java.lang.String), (r11v5 java.lang.String) binds: [B:26:0x0046, B:24:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(android.content.Context r16, java.lang.String r17, android.os.Bundle r18) {
        /*
            r15 = this;
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            r4 = 0
            if (r0 == 0) goto Lbc
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto Lbc
            android.app.Activity r5 = X.C1388190mED.LIZ(r0)
        L11:
            boolean r0 = r5 instanceof X.C19EG
            if (r0 == 0) goto Lb3
            X.19EG r5 = (X.C19EG) r5
            if (r5 == 0) goto Lb3
            java.lang.String r12 = ""
            r2 = r18
            if (r2 == 0) goto L27
            java.lang.String r0 = "biz_uid"
            java.lang.String r9 = r2.getString(r0)
            if (r9 != 0) goto L2a
        L27:
            r9 = r12
            if (r2 == 0) goto L32
        L2a:
            java.lang.String r0 = "to_user_id"
            java.lang.String r10 = r2.getString(r0)
            if (r10 != 0) goto L35
        L32:
            r10 = r12
            if (r2 == 0) goto L3d
        L35:
            java.lang.String r0 = "enter_from"
            java.lang.String r11 = r2.getString(r0)
            if (r11 != 0) goto L40
        L3d:
            r11 = r12
            if (r2 == 0) goto Lb8
        L40:
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto Lb8
            r12 = r0
        L49:
            java.lang.String r0 = "open_add_panel"
            java.lang.String r0 = r2.getString(r0)
        L4f:
            java.lang.String r1 = "1"
            boolean r13 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r2 == 0) goto Lb6
            java.lang.String r0 = "fetch_Latest_data"
            java.lang.String r0 = r2.getString(r0)
        L5d:
            boolean r14 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            int r0 = r9.length()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig r8 = new com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.0mIc r7 = new X.0mIc
            r7.<init>(r3, r3)
            X.0iCX r0 = com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment.LLJJLIIIJLLLLLLLZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment r6 = new com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment
            r6.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "key_quick_reply_manage_config"
            X.C786410Ut5.LJJIJL(r1, r0, r8)
            r6.setArguments(r1)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJJIJI = r6
            r0 = 4
            r7.LJIIIIZZ(r0)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJLLL = r3
            r0 = 2131100619(0x7f0603cb, float:1.7813625E38)
            java.lang.Integer r1 = X.C1308910kAL.LIZJ(r0, r5)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJI = r1
            r0 = 16
            r7.LJI(r0)
            com.bytedance.tux.sheet.sheet.TuxSheet r1 = r7.LIZ
            r1.LLJLL = r2
            r1.LLJLILLLLZIIL = r3
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            r1.show(r0, r4)
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lb6:
            r0 = r4
            goto L5d
        Lb8:
            if (r2 != 0) goto L49
            r0 = r4
            goto L4f
        Lbc:
            r5 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b2c.replies.router.IMQuickReplyManagePageAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
