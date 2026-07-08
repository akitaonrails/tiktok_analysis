package com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva;

import X.C0XQ7;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageAfterFollowBackKeva implements IIMLightInteractService.IMessageAfterFollowBackKeva {
    public static final MessageAfterFollowBackKeva LIZIZ = new MessageAfterFollowBackKeva();

    public static final class Service implements IIMLightInteractService.IMessageAfterFollowBackKeva {
        public final /* synthetic */ MessageAfterFollowBackKeva LIZIZ = MessageAfterFollowBackKeva.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
        public final Keva LIZ() {
            return this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
        public final void LIZIZ(Keva keva, String str) {
            this.LIZIZ.LIZIZ(keva, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
        public final boolean LIZJ(String str) {
            return this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
        public final boolean LIZLLL(Keva keva, String str) {
            return this.LIZIZ.LIZLLL(keva, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
    public final Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_button_text_repo");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
    public final boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        Keva kevaLIZ = LIZIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_has_chat_history");
        sbLIZ.append(str);
        return kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
    public final void LIZIZ(Keva keva, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_has_entered_chatroom");
        sbLIZ.append(str);
        if (!keva.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_has_entered_chatroom");
            sbLIZ2.append(str);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService.IMessageAfterFollowBackKeva
    public final boolean LIZLLL(Keva keva, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_double_follow_time_stamp");
        sbLIZ.append(str);
        if (keva.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_double_follow_time_stamp");
            sbLIZ2.append(str);
            if (keva.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L) != -1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("key_double_follow_time_stamp");
                sbLIZ3.append(str);
                keva.storeLong(C2188811AlT.LIZIZ(sbLIZ3), -1L);
                return true;
            }
            return false;
        }
        return false;
    }

    public final long LJ(Keva keva, String str) {
        if (keva == null) {
            keva = LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_double_follow_time_stamp");
        sbLIZ.append(str);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public final boolean LJFF(Keva keva, String str) {
        if (keva == null) {
            keva = LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_has_entered_chatroom");
        sbLIZ.append(str);
        return keva.contains(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJII(long j, Keva keva, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_double_follow_time_stamp");
        sbLIZ.append(str);
        if (keva.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key_double_follow_time_stamp");
        sbLIZ2.append(str);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r3, boolean r4, int r5, com.bytedance.keva.Keva r6) {
        /*
            if (r4 != 0) goto L1c
            r0 = 4
            if (r5 == r0) goto L1c
            r2 = 1
            if (r5 == r2) goto L1c
        L8:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "follow_action_tag"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.storeInt(r0, r2)
            return
        L1c:
            r2 = 2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva.LJI(java.lang.String, boolean, int, com.bytedance.keva.Keva):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(int r3, int r4, java.lang.String r5, com.bytedance.keva.Keva r6, long r7) {
        /*
            r2 = 1
            if (r3 == r2) goto L20
            r0 = 2
            if (r3 == r0) goto L19
            r0 = 4
            if (r3 == r0) goto L20
        L9:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IMAFListManager> r0 = com.ss.android.ugc.aweme.im.service.service.IMAFListManager.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.im.service.service.IMAFListManager r0 = (com.ss.android.ugc.aweme.im.service.service.IMAFListManager) r0
            r0.LIZLLL(r3, r5)
            return
        L19:
            LJII(r7, r6, r5)
            LJI(r5, r2, r4, r6)
            goto L9
        L20:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "key_single_follow_status"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L47
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r6.storeBoolean(r0, r2)
        L47:
            r0 = 0
            LJI(r5, r0, r4, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva.LJIIIIZZ(int, int, java.lang.String, com.bytedance.keva.Keva, long):void");
    }
}
