package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import X.C09EF;
import X.C0Y8T;
import X.C0YSQ;
import X.C13LP;
import X.C15438062q;
import X.InterfaceC876950Yaj;
import Y.AComparatorS21S0000000_2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetTaskData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakLynxDataUtils {
    public static final StreakLynxDataUtils LIZ = new StreakLynxDataUtils();
    public static final Object LIZIZ = new Object();
    public static final ConcurrentHashMap<String, Function0<Pair<String, Object>>> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ() {
        synchronized (LIZIZ) {
            try {
                LIZJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final class StreakLynxConversationDataBuilder {
        public final String LIZ;
        public final C0Y8T LIZJ;
        public String LJ;
        public boolean LJFF;
        public final JSONObject LIZIZ = new JSONObject();
        public String LIZLLL = "";

        public StreakLynxConversationDataBuilder(String str) {
            this.LIZ = str;
            this.LIZJ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super org.json.JSONObject> r11) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.StreakLynxConversationDataBuilder.LIZ(X.05Vn):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.StreakLynxConversationDataBuilder> r10) throws org.json.JSONException {
            /*
                r9 = this;
                boolean r0 = r10 instanceof X.C06KY
                if (r0 == 0) goto L89
                r3 = r10
                X.06KY r3 = (X.C06KY) r3
                int r2 = r3.LLILZLL
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L89
                int r2 = r2 - r1
                r3.LLILZLL = r2
            L12:
                java.lang.Object r0 = r3.LLILZ
                java.lang.Object r4 = X.C099R.LJFF()
                int r1 = r3.LLILZLL
                r2 = 1
                if (r1 == 0) goto L30
                if (r1 != r2) goto L8f
                java.lang.Object r6 = r3.LLILLL
                org.json.JSONObject r6 = (org.json.JSONObject) r6
                java.lang.Object r5 = r3.LLILLJJLI
                java.lang.String r5 = (java.lang.String) r5
                com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder r1 = r3.LL
                X.C155000ia.LIZIZ(r0)
            L2c:
                r6.put(r5, r0)
                return r1
            L30:
                X.C155000ia.LIZIZ(r0)
                X.0ZFW r8 = X.C0ZFW.LIZ
                r7 = 0
                if (r8 == 0) goto L85
                X.0Y8T r0 = r9.LIZJ
                java.lang.String r5 = r8.LJIILLIIL(r0)
            L3e:
                org.json.JSONObject r6 = r9.LIZIZ
                if (r8 == 0) goto L83
                X.0Y8T r0 = r9.LIZJ
                java.lang.String r1 = r8.LJIIJ(r0)
            L48:
                java.lang.String r0 = "group_name"
                r6.put(r0, r1)
                org.json.JSONObject r1 = r9.LIZIZ
                java.lang.String r0 = "group_avatar_url"
                r1.put(r0, r5)
                org.json.JSONObject r1 = r9.LIZIZ
                if (r8 == 0) goto L62
                java.lang.String r0 = r9.LIZ
                int r0 = X.C0ZFW.LJJII(r0)
                java.lang.Integer r7 = X.C2286608xc.LJ(r0)
            L62:
                java.lang.String r0 = "conv_size"
                r1.put(r0, r7)
                org.json.JSONObject r1 = r9.LIZIZ
                java.lang.String r0 = "conv_avatar"
                r1.put(r0, r5)
                org.json.JSONObject r6 = r9.LIZIZ
                java.lang.String r0 = r9.LIZ
                r3.LL = r9
                java.lang.String r5 = "conv_members"
                r3.LLILLJJLI = r5
                r3.LLILLL = r6
                r3.LLILZLL = r2
                java.lang.Object r0 = r9.LIZIZ(r0, r3)
                if (r0 != r4) goto L87
                return r4
            L83:
                r1 = r7
                goto L48
            L85:
                r5 = r7
                goto L3e
            L87:
                r1 = r9
                goto L2c
            L89:
                X.06KY r3 = new X.06KY
                r3.<init>(r9, r10)
                goto L12
            L8f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.StreakLynxConversationDataBuilder.LIZJ(X.05Vn):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZIZ(java.lang.String r10, X.InterfaceC1364105Vn<? super org.json.JSONArray> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof X.C1589006Ka
                if (r0 == 0) goto L8f
                r4 = r11
                X.06Ka r4 = (X.C1589006Ka) r4
                int r2 = r4.LLILLL
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L8f
                int r2 = r2 - r1
                r4.LLILLL = r2
            L12:
                java.lang.Object r1 = r4.LL
                java.lang.Object r3 = X.C099R.LJFF()
                int r0 = r4.LLILLL
                r2 = 1
                if (r0 == 0) goto L70
                if (r0 != r2) goto L96
                X.C155000ia.LIZIZ(r1)
            L22:
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L9e
                java.util.ArrayList r8 = new java.util.ArrayList
                r7 = 10
                int r0 = X.C15438062q.LJIJJ(r1, r7)
                r8.<init>(r0)
                java.util.Iterator r6 = r1.iterator()
            L35:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto La0
                java.lang.Object r5 = r6.next()
                com.ss.android.ugc.aweme.im.common.model.BaseContact r5 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r5
                com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder$StreakGroupMemberInfo r4 = new com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder$StreakGroupMemberInfo
                java.lang.String r3 = r5.getUid()
                java.lang.String r2 = ""
                if (r3 != 0) goto L4c
                r3 = r2
            L4c:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.getAvatarThumb()
                if (r0 == 0) goto L61
                java.util.List r1 = r0.getUrlList()
                if (r1 == 0) goto L61
                r0 = 0
                java.lang.Object r1 = X.C13LP.LJJJLZIJ(r0, r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L62
            L61:
                r1 = r2
            L62:
                java.lang.String r0 = r5.getDisplayName()
                if (r0 == 0) goto L69
                r2 = r0
            L69:
                r4.<init>(r3, r1, r2)
                r8.add(r4)
                goto L35
            L70:
                X.C155000ia.LIZIZ(r1)
                java.util.List r1 = X.C0ZFW.LJJ(r10, r2)
                if (r1 == 0) goto L9e
                X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
                r0.getClass()
                com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
                X.06pF r0 = r0.LIZ()
                r4.LLILLL = r2
                java.lang.Object r1 = r0.LJJIIZI(r1)
                if (r1 != r3) goto L22
                return r3
            L8f:
                X.06Ka r4 = new X.06Ka
                r4.<init>(r9, r11)
                goto L12
            L96:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L9e:
                r2 = 0
                goto La4
            La0:
                java.util.List r2 = X.C13LP.LL(r8, r7)
            La4:
                org.json.JSONArray r1 = new org.json.JSONArray
                com.google.gson.Gson r0 = X.C09EF.LIZ
                java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r2)
                r1.<init>(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.StreakLynxConversationDataBuilder.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
        }

        public static final class StreakGroupMemberInfo {

            @C09CT("avatar_url")
            public final String avatarUrl;

            @C09CT("nick_name")
            public final String nickName;

            @C09CT("uid")
            public final String uid;

            public StreakGroupMemberInfo(String str, String str2, String str3) {
                this.uid = str;
                this.avatarUrl = str2;
                this.nickName = str3;
            }
        }
    }

    public static JSONArray LIZJ(StreakPetData streakPetData) {
        Map<String, StreakPetTaskData> map;
        Set<Map.Entry<String, StreakPetTaskData>> setEntrySet;
        List listLJLLLL;
        if (streakPetData != null && (map = streakPetData.tasks) != null && (setEntrySet = map.entrySet()) != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS21S0000000_2(6), setEntrySet)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
            return new JSONArray(GsonProtectorUtils.toJson(C09EF.LIZ, arrayList));
        }
        return new JSONArray();
    }

    public static JSONObject LJI(StreakPetData streakPetData) throws JSONException {
        Map<String, String> map;
        JSONObject jSONObject = new JSONObject();
        if (streakPetData != null && (map = streakPetData.experimentMap) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.String, ? extends org.json.JSONObject>> r8) throws org.json.JSONException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1580706Gv
            if (r0 == 0) goto L3f
            r5 = r8
            X.06Gv r5 = (X.C1580706Gv) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L45
            java.lang.Object r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r4)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder r0 = new com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder
            r0.<init>(r7)
            java.lang.String r1 = "conversation_info"
            r5.LL = r1
            r5.LLILZ = r2
            java.lang.Object r4 = r0.LIZ(r5)
            if (r4 != r3) goto L24
            return r3
        L3f:
            X.06Gv r5 = new X.06Gv
            r5.<init>(r6, r8)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r18, com.ss.android.ugc.aweme.im.streak.api.StreakData r19, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r20, X.C06H2 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, java.lang.String r27, X.InterfaceC1364105Vn r28) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.im.streak.api.StreakData, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, X.06H2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r22, com.ss.android.ugc.aweme.im.streak.api.StreakData r23, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r24, X.C06H2 r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.Integer r33, com.ss.android.ugc.aweme.im.streak.impl.model.StreakEntryInfo r34, X.InterfaceC1364105Vn<? super org.json.JSONObject> r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils.LJ(java.lang.String, com.ss.android.ugc.aweme.im.streak.api.StreakData, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, X.06H2, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.im.streak.impl.model.StreakEntryInfo, X.05Vn):java.lang.Object");
    }
}
