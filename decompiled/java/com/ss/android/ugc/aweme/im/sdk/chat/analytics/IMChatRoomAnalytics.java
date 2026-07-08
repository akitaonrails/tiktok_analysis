package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AbstractC2252651DEx;
import X.C05RV;
import X.C098200Yq;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z7J;
import X.C1530005ys;
import X.C189200o6;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2296808zG;
import X.C23250099c;
import X.C830490Whz;
import X.C866530Xz1;
import X.C894150Z5x;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC876950Yaj;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatRoomAnalytics implements IIMChatRoomAnalytics {
    public static final IMChatRoomAnalytics LIZIZ = new IMChatRoomAnalytics();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IIMChatRoomAnalytics {
        public final /* synthetic */ IMChatRoomAnalytics LIZIZ = IMChatRoomAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final int LIZ(SessionInfo sessionInfo) {
            return this.LIZIZ.LIZ(sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final void LIZIZ(long j, SessionInfo sessionInfo, int i, long j2, int i2, List<? extends RecyclerView.ViewHolder> list, String str, boolean z, boolean z2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(j, sessionInfo, i, j2, i2, list, str, z, z2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final String LIZJ(SessionInfo sessionInfo) {
            return this.LIZIZ.LIZJ(sessionInfo);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final void LIZLLL(String str, String str2) {
            this.LIZIZ.LIZLLL(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final Object LJ(IMUser iMUser, String str, Map<String, String> map, C0Y8T c0y8t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LIZIZ.LJ(iMUser, str, map, c0y8t, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
        public final void LJFF(EnterChatParams enterChatParams, String str, InterfaceC876950Yaj interfaceC876950Yaj, C866530Xz1 c866530Xz1, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str2, AbstractC2252651DEx abstractC2252651DEx, boolean z2, boolean z3, IMUser iMUser, Function1 function1) {
            this.LIZIZ.LJFF(enterChatParams, str, interfaceC876950Yaj, c866530Xz1, interfaceC1493105sv, z, str2, abstractC2252651DEx, z2, z3, iMUser, function1);
        }
    }

    public static JSONObject LJII(SessionInfo sessionInfo) throws JSONException {
        if (sessionInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("conversation_id", sessionInfo.getConversationId());
        jSONObject.put("enter_method", sessionInfo.getEnterMethod());
        jSONObject.put("chat_process_id", sessionInfo.getUuid());
        for (Map.Entry entry : C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId())).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    public final int LIZ(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            return -1;
        }
        int chatType = sessionInfo.getChatType();
        if (chatType != 0) {
            if (chatType != 1) {
                if (chatType != 3) {
                    return -1;
                }
                return 1;
            }
            return 3;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    public final String LIZJ(SessionInfo sessionInfo) {
        IIMAnalyticsUtil iIMAnalyticsUtil;
        String strLJ;
        if (sessionInfo == null || (iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class)) == null || (strLJ = iIMAnalyticsUtil.LJ(sessionInfo)) == null) {
            return "";
        }
        return strLJ;
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    public final void LIZLLL(String str, String str2) {
        String mobValue;
        C05RV c05rvLIZJ;
        Pair[] pairArr = new Pair[3];
        NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
        if (noticeFeatureLIZ != null && (c05rvLIZJ = noticeFeatureLIZ.LIZJ()) != null) {
            mobValue = c05rvLIZJ.getMobValue();
        } else {
            mobValue = null;
        }
        pairArr[0] = new Pair("inbox_mode", mobValue);
        pairArr[1] = new Pair("enter_from", str);
        pairArr[2] = new Pair("action", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("change_chat_tag_in_chatroom", mapLJIIIIZZ);
    }

    public static void LJIIJ(IMChatRoomAnalytics iMChatRoomAnalytics, SessionInfo sessionInfo, long j, int i) {
        C0I0B.LJFF.LIZIZ();
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(377);
        iMChatRoomAnalytics.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", sessionInfo.getEnterFromForMob()), new Pair("enter_method", sessionInfo.getEnterMethod()), new Pair("chat_type", iMChatRoomAnalytics.LIZJ(sessionInfo)), new Pair("conversation_id", sessionInfo.getConversationId()), new Pair("unread_cnt", String.valueOf(sessionInfo.getUnreadCount())), new Pair("duration", String.valueOf(j)), new Pair("enter_chat_view_type", String.valueOf(i)), new Pair("process_id", sessionInfo.getUuid()));
        mapLJIIJ.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId())));
        C20684815ws.LJIILLIIL("leave_chat", mapLJIIJ);
        try {
            aFwS248S0000000_14.invoke(sessionInfo);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r7 r11 r12
      0x0032: PHI (r7v7 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) = 
      (r7v3 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
      (r7v9 com.ss.android.ugc.aweme.im.contacts.api.model.IMUser)
     binds: [B:72:0x0136, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r11v4 java.util.Map<java.lang.String, java.lang.String>) = (r11v1 java.util.Map<java.lang.String, java.lang.String>), (r11v5 java.util.Map<java.lang.String, java.lang.String>) binds: [B:72:0x0136, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r12v4 X.0Y8T) = (r12v1 X.0Y8T), (r12v5 X.0Y8T) binds: [B:72:0x0136, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, X.C0Y8T r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics.LJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, java.lang.String, java.util.Map, X.0Y8T, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(boolean r8, java.util.Map<java.lang.String, java.lang.String> r9, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r10, X.C0Y8T r11, java.lang.String r12, boolean r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof X.C895870ZCn
            if (r0 == 0) goto Laf
            r3 = r14
            X.0ZCn r3 = (X.C895870ZCn) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r1 = r3.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r5 = 1
            java.lang.String r2 = "1"
            java.lang.String r6 = "0"
            if (r0 == 0) goto L62
            if (r0 != r5) goto Lb6
            boolean r8 = r3.LL
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r10 = r3.LLILLL
            java.lang.Object r9 = r3.LLILLJJLI
            java.util.Map r9 = (java.util.Map) r9
            X.C155000ia.LIZIZ(r1)
        L2e:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            if (r1 != 0) goto L60
            if (r10 == 0) goto L5d
        L34:
            boolean r0 = r10.isBlock()
            if (r0 != 0) goto L41
            boolean r0 = r10.isBlocked()
            if (r0 != 0) goto L41
            r2 = r6
        L41:
            java.lang.String r0 = "is_block"
            r9.put(r0, r2)
            if (r8 != 0) goto L5d
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r10.getImUserBizInfo()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L5d
            java.lang.String r1 = r0.userTags
            if (r1 == 0) goto L5d
            java.lang.String r0 = "other_user_account_type"
            r9.put(r0, r1)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            r10 = r1
            goto L34
        L62:
            X.C155000ia.LIZIZ(r1)
            if (r11 == 0) goto L8e
            boolean r0 = r11.isMute()
            if (r0 == 0) goto Lad
            r1 = r2
        L6e:
            java.lang.String r0 = "is_mute"
            r9.put(r0, r1)
            boolean r0 = r11.isStickTop()
            if (r0 != 0) goto Lab
            if (r13 != 0) goto Lab
            r1 = r6
        L7c:
            java.lang.String r0 = "is_top"
            r9.put(r0, r1)
            boolean r0 = X.C882340YjQ.LJFF(r11)
            if (r0 == 0) goto L8e
            java.lang.String r1 = "chat_tags"
            java.lang.String r0 = "help_requested"
            r9.put(r1, r0)
        L8e:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            r3.LLILLJJLI = r9
            r3.LLILLL = r10
            r3.LL = r8
            r3.LLILZLL = r5
            r0 = 0
            java.lang.Object r1 = r1.LJIJ(r12, r0, r3)
            if (r1 != r4) goto L2e
            return r4
        Lab:
            r1 = r2
            goto L7c
        Lad:
            r1 = r6
            goto L6e
        Laf:
            X.0ZCn r3 = new X.0ZCn
            r3.<init>(r7, r14)
            goto L12
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics.LJI(boolean, java.util.Map, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.0Y8T, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    public final void LIZIZ(long j, SessionInfo sessionInfo, int i, long j2, int i2, List<? extends RecyclerView.ViewHolder> list, String str, boolean z, boolean z2, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C894150Z5x(j, sessionInfo, i, j2, i2, str, z, z2, list, interfaceC1493105sv, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics
    public final void LJFF(EnterChatParams enterChatParams, String str, InterfaceC876950Yaj interfaceC876950Yaj, C866530Xz1 c866530Xz1, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str2, AbstractC2252651DEx abstractC2252651DEx, boolean z2, boolean z3, IMUser iMUser, Function1 function1) {
        C830490Whz c830490Whz = new C830490Whz();
        String groupId = enterChatParams.getGroupId();
        String str3 = "";
        if (groupId == null) {
            groupId = "";
        }
        c830490Whz.put("group_id", groupId);
        c830490Whz.put("follow_status", String.valueOf(enterChatParams.getFollowStatusRelation()));
        String storyType = enterChatParams.getStoryType();
        if (storyType == null) {
            storyType = "";
        }
        c830490Whz.put("story_type", storyType);
        String storyCollectionId = enterChatParams.getStoryCollectionId();
        if (storyCollectionId != null) {
            str3 = storyCollectionId;
        }
        c830490Whz.put("story_collection_id", str3);
        c830490Whz.put("active_status", String.valueOf(enterChatParams.getActivityStatus().getValue()));
        C23250099c.LIZLLL(C2296808zG.LIZ(abstractC2252651DEx), null, null, new C0Z7J(enterChatParams, str, c830490Whz, interfaceC876950Yaj, c866530Xz1, interfaceC1493105sv, z, str2, z2, z3, iMUser, function1, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x050e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams r41, java.lang.String r42, java.util.Map<java.lang.String, java.lang.String> r43, X.InterfaceC876950Yaj r44, X.AbstractC879060Ye8 r45, X.InterfaceC1493105sv r46, boolean r47, java.lang.String r48, com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r49, boolean r50, boolean r51, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r52, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> r53, X.InterfaceC1364105Vn<? super kotlin.Unit> r54) {
        /*
            Method dump skipped, instruction units count: 1667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics.LJIIIIZZ(com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams, java.lang.String, java.util.Map, X.0Yaj, X.0Ye8, X.05sv, boolean, java.lang.String, com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature, boolean, boolean, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
