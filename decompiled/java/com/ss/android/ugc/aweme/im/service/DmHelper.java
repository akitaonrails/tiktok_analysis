package com.ss.android.ugc.aweme.im.service;

import X.C051M;
import X.C05QS;
import X.C069A;
import X.C069P;
import X.C06AL;
import X.C06AM;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YA1;
import X.C0YA6;
import X.C0YSQ;
import X.C0YT6;
import X.C0YT7;
import X.C0YTA;
import X.C0YTC;
import X.C0YU9;
import X.C0YZJ;
import X.C0Z53;
import X.C13BV;
import X.C1440005kM;
import X.C1461005nk;
import X.C1461805ns;
import X.C1462005nu;
import X.C15579068b;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2507909sD;
import X.C461720I8s;
import X.C869590Y9l;
import X.C876890Yad;
import X.C879170YeJ;
import X.C879340Yea;
import X.C879350Yeb;
import X.C879390Yef;
import X.C892130YzD;
import X.C894660Z7w;
import X.C898270ZLt;
import X.C914130Ztb;
import X.EnumC1461905nt;
import X.InterfaceC876880Yac;
import X.InterfaceC876950Yaj;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DmHelper implements IDmHelper {
    public static final DmHelper LIZIZ = new DmHelper();
    public static final Gson LIZJ = C051M.LIZ;
    public static final String LIZLLL = (String) C2507909sD.LIZ.getValue();
    public static final C0YZJ LJ = new Object() { // from class: X.0YZJ
        public final C01GW LIZ = C452501pT.LIZIZ(new C0YZI());
    };

    public static final class Service implements IDmHelper {
        public final /* synthetic */ DmHelper LIZIZ = DmHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final LastMessageProperty LIZ(C0Y8T c0y8t) {
            return this.LIZIZ.LIZ(c0y8t);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LIZIZ(List<C0Y8T> list) {
            this.LIZIZ.LIZIZ(list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LIZJ(String str) {
            this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LIZLLL(int i, C0YA6 c0ya6) {
            this.LIZIZ.LIZLLL(i, c0ya6);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LJ(String str) {
            this.LIZIZ.LJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final String LJFF(C0Y8T c0y8t, LastMessageProperty lastMessageProperty) {
            return this.LIZIZ.LJFF(c0y8t, lastMessageProperty);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final LastMessageProperty LJI(C0Y8T c0y8t) {
            return this.LIZIZ.LJI(c0y8t);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LJII(IMUser iMUser) {
            this.LIZIZ.LJII(iMUser);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final LastMessageProperty LJIIIIZZ(C0Y8T c0y8t) {
            return this.LIZIZ.LJIIIIZZ(c0y8t);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LJIIIZ(String str, String str2, String str3, String str4) {
            this.LIZIZ.LJIIIZ(str, str2, str3, str4);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LJIIJ(C869590Y9l c869590Y9l, Map<String, ? extends List<? extends C0YA1>> map, Map<String, ? extends List<? extends C0YA1>> map2) {
            this.LIZIZ.LJIIJ(c869590Y9l, map, map2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final boolean LJIIJJI(C0Y8T c0y8t, LastMessageProperty lastMessageProperty) {
            return this.LIZIZ.LJIIJJI(c0y8t, lastMessageProperty);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LJIIL(String str, String str2, InterfaceC876880Yac interfaceC876880Yac) {
            this.LIZIZ.LJIIL(str, str2, interfaceC876880Yac);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final void LLILZ(C869590Y9l c869590Y9l) {
            this.LIZIZ.LLILZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
        public final Gson getGson() {
            this.LIZIZ.getClass();
            return DmHelper.LIZJ;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final Gson getGson() {
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final LastMessageProperty LIZ(C0Y8T c0y8t) {
        Map<String, String> localExt;
        String str;
        if (c0y8t == null || (localExt = c0y8t.getLocalExt()) == null || (str = localExt.get("a:s_latest_message_property")) == null) {
            return null;
        }
        try {
            return (LastMessageProperty) LIZJ.LJII(str, LastMessageProperty.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.logException(e);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LIZIZ(List<C0Y8T> list) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C06AM(list, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZLLL().LIZIZ(str);
        C879350Yeb.LIZ.getClass();
        C879350Yeb.LIZ(str, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LJ(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null) {
            LIZIZ.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C06AL(c0y8tLIZ, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final LastMessageProperty LJI(C0Y8T c0y8t) {
        Map<String, String> localExt;
        if (c0y8t == null || (localExt = c0y8t.getLocalExt()) == null) {
            return null;
        }
        if (localExt.get("a:s_latest_unread_message_property") != null) {
            return LJIIIIZZ(c0y8t);
        }
        if (Intrinsics.LJFF(localExt.get("a:s_latest_unread_message_property_inited"), "1")) {
            return null;
        }
        return LIZ(c0y8t);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LJII(IMUser iMUser) {
        String uid;
        String uid2;
        EventLiveData<FollowStatus> relationObservable;
        if (iMUser != null && (uid = iMUser.getUid()) != null && (uid2 = iMUser.getUid()) != null && uid2.length() != 0) {
            IIMLightInteractService.IMessageAfterFollowBackKeva.LIZ.getClass();
            IIMLightInteractService.IMessageAfterFollowBackKeva value = C15579068b.LIZIZ.getValue();
            if (value == null) {
                return;
            }
            value.LIZIZ(value.LIZ(), uid);
            if (value.LIZLLL(value.LIZ(), uid)) {
                C1440005kM.LIZ(new C879340Yea(uid));
                IMFriendsService.LIZ.getClass();
                IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ != null && (relationObservable = iMFriendsServiceLIZ.getRelationObservable()) != null) {
                    relationObservable.postValue(new FollowStatus(uid, iMUser.getFollowStatus()));
                }
            }
            IRemindUsersViewHelper.LIZ.getClass();
            IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
            if (iRemindUsersViewHelperLIZ != null) {
                iRemindUsersViewHelperLIZ.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final LastMessageProperty LJIIIIZZ(C0Y8T c0y8t) {
        Map<String, String> localExt;
        String str;
        if (c0y8t == null || (localExt = c0y8t.getLocalExt()) == null || (str = localExt.get("a:s_latest_unread_message_property")) == null) {
            return null;
        }
        try {
            return (LastMessageProperty) LIZJ.LJII(str, LastMessageProperty.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.logException(e);
            }
            return null;
        }
    }

    public final Map<String, String> LJIILJJIL(C0Y8T c0y8t) {
        Integer mark_read;
        Integer mark_read2;
        LastMessageProperty lastMessagePropertyLIZ = LIZ(c0y8t);
        if (lastMessagePropertyLIZ != null && ((mark_read2 = lastMessagePropertyLIZ.getMark_read()) == null || mark_read2.intValue() != 1)) {
            lastMessagePropertyLIZ.setMark_read(1);
            try {
                Map<String, String> localExt = c0y8t.getLocalExt();
                LIZIZ.getClass();
                localExt.put("a:s_latest_message_property", LIZJ.LJIILL(lastMessagePropertyLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLastMessagePropertyReadInLocalExt toJson error: ");
                sbLIZ.append(e);
                sbLIZ.append(", lastMessageProperty: ");
                sbLIZ.append(lastMessagePropertyLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        LastMessageProperty lastMessagePropertyLJIIIIZZ = LJIIIIZZ(c0y8t);
        if (lastMessagePropertyLJIIIIZZ != null && ((mark_read = lastMessagePropertyLJIIIIZZ.getMark_read()) == null || mark_read.intValue() != 1)) {
            lastMessagePropertyLJIIIIZZ.setMark_read(1);
            try {
                Map<String, String> localExt2 = c0y8t.getLocalExt();
                LIZIZ.getClass();
                localExt2.put("a:s_latest_unread_message_property", LIZJ.LJIILL(lastMessagePropertyLJIIIIZZ));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLastMessagePropertyReadInLocalExt unread toJson error: ");
                sbLIZ2.append(e2);
                sbLIZ2.append(", unreadProperty: ");
                sbLIZ2.append(lastMessagePropertyLJIIIIZZ);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return c0y8t.getLocalExt();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        LJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LIZLLL(int i, C0YA6 c0ya6) {
        if (c0ya6 == null) {
            return;
        }
        LJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final String LJFF(C0Y8T c0y8t, LastMessageProperty lastMessageProperty) {
        IMUser iMUserLIZ;
        String strLIZ;
        if (lastMessageProperty == null) {
            return null;
        }
        if (!c0y8t.isGroupChat() && !c0y8t.isSingleChat()) {
            return null;
        }
        LJ.getClass();
        if (c0y8t.getUnreadCount() > 0) {
            return null;
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ == null || !iDmHelperLIZ.LJIIJJI(c0y8t, lastMessageProperty)) {
            return null;
        }
        String str = "";
        if (c0y8t.isGroupChat() && lastMessageProperty.getIdempotent_id() != null) {
            C1461005nk c1461005nk = C1461005nk.LIZ;
            EnumC1461905nt enumC1461905nt = EnumC1461905nt.AT_MOST_DB;
            String conversationId = c0y8t.getConversationId();
            String idempotent_id = lastMessageProperty.getIdempotent_id();
            if (idempotent_id == null) {
                idempotent_id = "";
            }
            C1462005nu c1462005nuLIZIZ = c1461005nk.LIZIZ(enumC1461905nt, new C1461805ns(conversationId, idempotent_id, lastMessageProperty.getSender_sec_uid()), null);
            if (c1462005nuLIZIZ != null && (iMUserLIZ = C05QS.LIZ(c1462005nuLIZIZ)) != null && (strLIZ = C892130YzD.LIZ(iMUserLIZ, c0y8t.getConversationId())) != null) {
                str = strLIZ;
            }
        }
        String key = lastMessageProperty.getKey();
        if (key == null) {
            return null;
        }
        if (C879170YeJ.LIZLLL(key)) {
            String str2 = C879170YeJ.LIZIZ(key).LIZ;
            if (str.length() == 0) {
                C0I0B.LJFF.LIZJ();
                return C894660Z7w.LIZ().getString(2131845789, str2);
            }
            C0I0B.LJFF.LIZJ();
            return C894660Z7w.LIZ().getString(2131845788, str, str2);
        }
        if (!C879170YeJ.LIZJ(key)) {
            return null;
        }
        if (str.length() == 0) {
            C0I0B.LJFF.LIZJ();
            return C894660Z7w.LIZ().getString(2131826313);
        }
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131826312, str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final boolean LJIIJJI(C0Y8T c0y8t, LastMessageProperty lastMessageProperty) {
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage == null) {
            return false;
        }
        if (C0YU9.LIZ(lastMessageProperty) <= lastShowMessage.getCreatedAt()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LJIIJ(C869590Y9l c869590Y9l, Map<String, ? extends List<? extends C0YA1>> map, Map<String, ? extends List<? extends C0YA1>> map2) {
        if (c869590Y9l == null) {
            return;
        }
        C0YZJ c0yzj = LJ;
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            linkedHashMap.put(key, value);
        }
        if (map2 == null) {
            map2 = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        Iterator<T> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 == null) {
                value2 = C13BV.INSTANCE;
            }
            linkedHashMap2.put(key2, value2);
        }
        c0yzj.getClass();
        String strLIZIZ = C461720I8s.LIZIZ();
        strLIZIZ.toString();
        if (TextUtils.equals(strLIZIZ, String.valueOf(c869590Y9l.getSender()))) {
            try {
                Map mapLIZ = C0YT6.LIZ(linkedHashMap2);
                Map mapLIZ2 = C0YT6.LIZ(linkedHashMap);
                ArrayList arrayList = new ArrayList();
                List<C0YT7> listLIZIZ = C0YT6.LIZIZ(mapLIZ, mapLIZ2, C0YTC.REMOVE);
                List<C0YT7> listLIZIZ2 = C0YT6.LIZIZ(mapLIZ2, mapLIZ, C0YTC.ADD);
                arrayList.addAll(listLIZIZ);
                arrayList.addAll(listLIZIZ2);
                C0YTA c0yta = new C0YTA(arrayList);
                if (!c0yta.LIZ.isEmpty()) {
                    PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                    if (pushFeatureLIZ != null) {
                        pushFeatureLIZ.LJI(c869590Y9l, c0yta);
                    }
                    C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(c869590Y9l.getConversationId(), new C914130Ztb(c0yta, c0yzj, c869590Y9l, 1));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LJIIL(String str, String str2, InterfaceC876880Yac interfaceC876880Yac) {
        boolean z = true;
        if (str != null && str.length() > 0) {
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LIZLLL().LIZIZ(str);
            C879350Yeb.LIZ.getClass();
            if (str != null && str.length() != 0) {
                C0I0B.LJFF.LIZJ();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C894660Z7w.LIZ(), "aweme://user/profile/");
                smartRouteBuildRoute.withParam("uid", str);
                smartRouteBuildRoute.withParam("sec_user_id", C069P.LIZ().LIZLLL().LIZ(str));
                smartRouteBuildRoute.withParam("enter_method", (String) null);
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                if (z) {
                    smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
                    smartRouteBuildRoute.withParam("previous_page", "message");
                    smartRouteBuildRoute.withParam("enter_from", "chat");
                    smartRouteBuildRoute.withParam("extra_from_pre_page", "message");
                } else {
                    smartRouteBuildRoute.withParam("previous_page_position", "other_places");
                    smartRouteBuildRoute.withParam("extra_from_pre_page", str2);
                    smartRouteBuildRoute.withParam("enter_from", str2);
                }
                if (interfaceC876880Yac != null) {
                    smartRouteBuildRoute.withParam("recommend_enter_profile_params", interfaceC876880Yac);
                }
                smartRouteBuildRoute.open();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            java.lang.String r5 = "a:s_last_read_message_reaction_timestamp"
            boolean r0 = r9 instanceof X.C06AN
            if (r0 == 0) goto L51
            r4 = r9
            X.06AN r4 = (X.C06AN) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L14:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L95
            java.lang.Object r8 = r4.LLILLJJLI
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r7 = r4.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r3)
        L2c:
            X.0YA1 r3 = (X.C0YA1) r3
            if (r3 == 0) goto L92
            long r0 = r3.createTimeMicros
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            long r3 = r0.longValue()
            goto L57
        L3b:
            X.C155000ia.LIZIZ(r3)
            X.0YNZ r0 = X.InterfaceC873120YNa.LIZ
            X.0YNa r0 = X.C0YNZ.LIZ(r0)
            r4.LL = r7
            r4.LLILLJJLI = r8
            r4.LLILZIL = r1
            X.0YA1 r3 = r0.LIZIZ(r7)
            if (r3 != r2) goto L2c
            return r2
        L51:
            X.06AN r4 = new X.06AN
            r4.<init>(r6, r9)
            goto L14
        L57:
            com.ss.android.ugc.aweme.im.service.DmHelper r0 = com.ss.android.ugc.aweme.im.service.DmHelper.LIZIZ     // Catch: java.lang.Throwable -> L7d
            r0.getClass()     // Catch: java.lang.Throwable -> L7d
            com.google.gson.Gson r2 = com.ss.android.ugc.aweme.im.service.DmHelper.LIZJ     // Catch: java.lang.Throwable -> L7d
            com.ss.android.ugc.aweme.im.common.model.LastReadMessageReactionTimestamp r1 = new com.ss.android.ugc.aweme.im.common.model.LastReadMessageReactionTimestamp     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r0 = X.C2286608xc.LJFF(r3)     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r2.LJIILL(r1)     // Catch: java.lang.Throwable -> L7d
            X.C0YNP.LJIIIIZZ(r7, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L71
            goto L73
        L71:
            r1 = 0
            goto L79
        L73:
            java.lang.Object r1 = r8.put(r5, r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7d
        L79:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7d
            goto L89
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L89:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L92
            r0.getMessage()
        L92:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.DmHelper.LJIILIIL(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IDmHelper
    public final void LJIIIZ(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str4 != null && C879390Yef.LJ(str4)) {
            C0I0B.LJFF.LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C894660Z7w.LIZ(), "aweme://webview");
            String strLIZIZ = LIZLLL;
            if (str != null) {
                LIZIZ.getClass();
                if (PatternProtector.compile("[0-9]*").matcher(str).matches()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append("&id=");
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            smartRouteBuildRoute.withParam("url", strLIZIZ);
            smartRouteBuildRoute.open();
            return;
        }
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZLLL().LIZIZ(str);
        C879350Yeb.LIZ.getClass();
        C879350Yeb.LIZIZ(str, str2, str3, str4);
    }
}
