package com.ss.android.ugc.aweme.social.thought.api;

import X.AbstractC848400XPy;
import X.AnonymousClass0951;
import X.C01GW;
import X.C054G;
import X.C05M8;
import X.C05MA;
import X.C05MB;
import X.C095G;
import X.C09A1;
import X.C09IC;
import X.C0PEM;
import X.C0XQ7;
import X.C1325205Go;
import X.C1325305Gp;
import X.C1326005Gw;
import X.C13LN;
import X.C1439905kL;
import X.C1BNE;
import X.C1DEK;
import X.C1DFB;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C341180DZc;
import X.C452501pT;
import X.EnumC1325405Gq;
import X.InterfaceC1325705Gt;
import X.InterfaceC332260D0u;
import X.InterfaceC427710Gpt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialThoughtDataCenter implements ISocialThoughtDataCenterService {
    public static final C01GW<Gson> LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(661));
    public static final ConcurrentHashMap<String, ThoughtInfo> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC332260D0u<ThoughtInfo>> LIZJ = new ConcurrentHashMap<>();
    public static final C054G LIZLLL;
    public static volatile boolean LJ;
    public static volatile String LJFF;
    public static final ConcurrentHashMap<String, InterfaceC1325705Gt> LJI;
    public static final C054G LJII;
    public static final C054G LJIIIIZZ;
    public static final C1DEK LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile ThoughtInfo LJIIJJI;

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LIZ() {
        LJIIJJI = null;
    }

    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFB c1dfb = C0PEM.LIZJ;
        LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, c1dfb));
        LJI = new ConcurrentHashMap<>();
        LJII = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c1dfb));
        LJIIIIZZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2107308Nj.LIZ.LLIILII()));
        LJIIIZ = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final ThoughtInfo LJIIIIZZ() {
        ThoughtInfo thoughtInfo = LJIIJJI;
        if (thoughtInfo == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = thoughtInfo.createTimeMs;
        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < 3600000) {
            return thoughtInfo;
        }
        LJIIJJI = null;
        return null;
    }

    public SocialThoughtDataCenter() {
        if (!LJ) {
            LJ = true;
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(new InterfaceC427710Gpt() { // from class: X.05M9
                @Override // X.InterfaceC427710Gpt
                public final void LLLLLLZZ(int i, User user, User user2) {
                    String uid;
                    String uid2;
                    boolean z;
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    String str = "";
                    if (uid == null) {
                        uid = "";
                    }
                    if (user2 == null || (uid2 = user2.getUid()) == null) {
                        uid2 = "";
                    }
                    String str2 = SocialThoughtDataCenter.LJFF;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (uid2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !Intrinsics.LJFF(uid2, str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DC.userChangeListener.onChanged: type=");
                        sbLIZ.append(i);
                        sbLIZ.append(" oldUid=");
                        sbLIZ.append(uid);
                        sbLIZ.append(" newUid=");
                        sbLIZ.append(uid2);
                        sbLIZ.append(" currentlyServing=");
                        sbLIZ.append(str);
                        sbLIZ.append(" memCacheSize=");
                        ConcurrentHashMap<String, ThoughtInfo> concurrentHashMap = SocialThoughtDataCenter.LIZIZ;
                        sbLIZ.append(concurrentHashMap.size());
                        sbLIZ.append(" flowMapSize=");
                        ConcurrentHashMap<String, InterfaceC332260D0u<ThoughtInfo>> concurrentHashMap2 = SocialThoughtDataCenter.LIZJ;
                        sbLIZ.append(concurrentHashMap2.size());
                        sbLIZ.append(" -> CLEAR ALL (real account switch)");
                        C2188811AlT.LIZIZ(sbLIZ);
                        concurrentHashMap.clear();
                        Iterator<T> it2 = concurrentHashMap2.values().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC332260D0u) it2.next()).setValue(null);
                        }
                        SocialThoughtDataCenter.LIZJ.clear();
                        this.LL.getClass();
                        SocialThoughtDataCenter.LJIIJJI = null;
                        SocialThoughtDataCenter.LJFF = null;
                        this.LL.getClass();
                        SocialThoughtDataCenter.LJIILL(uid2);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DC.userChangeListener.onChanged: type=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" oldUid=");
                    sbLIZ2.append(uid);
                    sbLIZ2.append(" newUid=");
                    sbLIZ2.append(uid2);
                    sbLIZ2.append(" currentlyServing=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" -> SKIP clear (not a real account switch)");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            });
        }
        LJIILL(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (LJIIJ) {
            return;
        }
        LJIIJ = true;
        C23250099c.LIZLLL(LJII, null, null, new C05MB(this, null), 3);
    }

    public static Keva LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_thought_dc_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static InterfaceC332260D0u LJIILIIL(String str) {
        InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0uPutIfAbsent;
        ConcurrentHashMap<String, InterfaceC332260D0u<ThoughtInfo>> concurrentHashMap = LIZJ;
        InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
        if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(null)))) != null) {
            interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
        }
        return interfaceC332260D0uLIZ;
    }

    public static void LJIILL(String str) {
        if (str.length() == 0 || Intrinsics.LJFF(LJFF, str)) {
            return;
        }
        LJFF = str;
        C23250099c.LIZLLL(LIZLLL, null, null, new C05M8(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final ThoughtInfo LIZIZ(String str) {
        ThoughtInfo thoughtInfo = LIZIZ.get(str);
        if (thoughtInfo == null) {
            return null;
        }
        if (thoughtInfo.isExpired()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DC.peekThought: cached EXPIRED uid=");
            sbLIZ.append(str);
            sbLIZ.append(" thoughtId=");
            sbLIZ.append(thoughtInfo.thoughtId);
            sbLIZ.append(" createTimeMs=");
            sbLIZ.append(thoughtInfo.createTimeMs);
            sbLIZ.append(" now=");
            sbLIZ.append(System.currentTimeMillis());
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJ(str, "peek-expired");
            return null;
        }
        String str2 = thoughtInfo.authorUid;
        if (str2 != null && str2.length() != 0 && !Intrinsics.LJFF(thoughtInfo.authorUid, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("DC.peekThought: AUTHOR_UID MISMATCH key=");
            sbLIZ2.append(str);
            sbLIZ2.append(" cached.authorUid=");
            sbLIZ2.append(thoughtInfo.authorUid);
            sbLIZ2.append(" thoughtId=");
            sbLIZ2.append(thoughtInfo.thoughtId);
            sbLIZ2.append(", drop");
            C2188811AlT.LIZIZ(sbLIZ2);
            LJIIJ(str, "peek-cross-uid");
            return null;
        }
        return thoughtInfo;
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DC.removeThoughtCacheByUid: uid=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIJ(str, "removeByUid");
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LJ(String str) {
        Object next;
        String str2;
        Iterator<T> it2 = LIZIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((ThoughtInfo) ((Map.Entry) next).getValue()).thoughtId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (str2 = (String) entry.getKey()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DC.removeThoughtCacheByTid: tid=");
            sbLIZ.append(str);
            sbLIZ.append(" -> uid=");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("removeByTid:");
            sbLIZ2.append(str);
            LJIIJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C05MD
            if (r0 == 0) goto L24
            r4 = r7
            X.05MD r4 = (X.C05MD) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            java.lang.Object r6 = r4.LL
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            goto L50
        L24:
            X.05MD r4 = new X.05MD
            r4.<init>(r5, r7)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L3e
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L3e:
            com.ss.android.ugc.aweme.social.thought.api.ThoughtApi r1 = com.ss.android.ugc.aweme.social.thought.api.ThoughtApi.LIZIZ     // Catch: java.lang.Exception -> Lad
            com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtRequest r0 = new com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtRequest     // Catch: java.lang.Exception -> Lad
            r0.<init>(r6)     // Catch: java.lang.Exception -> Lad
            r4.LL = r6     // Catch: java.lang.Exception -> Lad
            r4.LLILZ = r2     // Catch: java.lang.Exception -> Lad
            java.lang.Object r1 = r1.batchGetThought(r0, r4)     // Catch: java.lang.Exception -> Lad
            if (r1 != r3) goto L53
            return r3
        L50:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lad
        L53:
            com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtResponse r1 = (com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtResponse) r1     // Catch: java.lang.Exception -> Lad
            java.util.List r4 = r1.getThoughtInfos()     // Catch: java.lang.Exception -> Lad
            if (r4 != 0) goto L5d
            X.13BV r4 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> Lad
        L5d:
            X.13DB r3 = new X.13DB
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult r0 = (com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult) r0
            java.lang.String r1 = r0.userId
            if (r1 == 0) goto L66
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r0 = r0.thoughtInfo
            if (r0 == 0) goto L66
            r5.LJII(r1, r0)
            r3.add(r1)
            goto L66
        L81:
            java.util.Set r3 = r3.build()
            X.07ik r2 = new X.07ik
            r2.<init>(r6)
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 310(0x136, float:4.34E-43)
            r1.<init>(r3, r0)
            X.08QU r0 = X.C09RB.LJIIJ(r2, r1)
            X.08QT r2 = new X.08QT
            r2.<init>(r0)
        L9a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "fetch-no-result"
            r5.LJIIJ(r1, r0)
            goto L9a
        Lac:
            return r4
        Lad:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LJFF(String str, C341180DZc c341180DZc) {
        LJIIIZ.LJIIIIZZ(new C1326005Gw(str, c341180DZc));
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final AnonymousClass0951 LJI(String str, boolean z) {
        String str2;
        InterfaceC332260D0u interfaceC332260D0uLJIILIIL = LJIILIIL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DC.getThoughtInfoFlow: REQUEST uid=");
        sbLIZ.append(str);
        sbLIZ.append(" currentValueId=");
        ThoughtInfo thoughtInfo = (ThoughtInfo) interfaceC332260D0uLJIILIIL.getValue();
        if (thoughtInfo != null) {
            str2 = thoughtInfo.thoughtId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" force=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(LIZLLL, null, null, new C05MA(z, this, str, interfaceC332260D0uLJIILIIL, null), 3);
        return C09IC.LIZIZ(interfaceC332260D0uLJIILIIL);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LJII(String str, ThoughtInfo thoughtInfo) {
        LJIILLIIL(str, thoughtInfo, EnumC1325405Gq.LL);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService
    public final void LJIIIZ(String str, ThoughtInfo thoughtInfo) {
        String str2 = str;
        if (!C1439905kL.LIZ() || thoughtInfo == null) {
            return;
        }
        if ((str2 != null && str2.length() > 0) || ((str2 = thoughtInfo.authorUid) != null && str2.length() > 0)) {
            String str3 = thoughtInfo.authorUid;
            if (str3 != null && str3.length() > 0 && !Intrinsics.LJFF(str3, str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DC.ingestServerThought: REJECT cross-uid target=");
                sbLIZ.append(str2);
                sbLIZ.append(" payload.authorUid=");
                sbLIZ.append(str3);
                sbLIZ.append(" thoughtId=");
                sbLIZ.append(thoughtInfo.thoughtId);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            LJII(str2, thoughtInfo.copy(thoughtInfo.thoughtId, thoughtInfo.textContent, thoughtInfo.createTimeMs, thoughtInfo.privacySetting, thoughtInfo.interactionPreview, thoughtInfo.viewerInteraction, str2, thoughtInfo.isPublishing));
        }
    }

    public final void LJIIJ(String str, String str2) {
        boolean z;
        String str3;
        ThoughtInfo value;
        boolean z2 = true;
        if (LIZIZ.remove(str) != null) {
            z = true;
        } else {
            z = false;
        }
        ConcurrentHashMap<String, InterfaceC332260D0u<ThoughtInfo>> concurrentHashMap = LIZJ;
        if (concurrentHashMap.get(str) == null) {
            z2 = false;
        }
        InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0u = concurrentHashMap.get(str);
        if (interfaceC332260D0u != null && (value = interfaceC332260D0u.getValue()) != null) {
            str3 = value.thoughtId;
        } else {
            str3 = null;
        }
        InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0u2 = concurrentHashMap.get(str);
        if (interfaceC332260D0u2 != null) {
            interfaceC332260D0u2.setValue(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DC.clearInternal: uid=");
        sbLIZ.append(str);
        sbLIZ.append(" reason=");
        sbLIZ.append(str2);
        sbLIZ.append(" hadMemory=");
        sbLIZ.append(z);
        sbLIZ.append(" flowExisted=");
        sbLIZ.append(z2);
        sbLIZ.append(" previousFlowThoughtId=");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(LIZLLL, null, null, new C1325205Go(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C05ME
            if (r0 == 0) goto L3f
            r4 = r7
            X.05ME r4 = (X.C05ME) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L47
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = X.C13LP.LJJJLL(r3)
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult r0 = (com.ss.android.ugc.aweme.social.thought.api.model.ThoughtQueryResult) r0
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r0 = r0.thoughtInfo
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LIZLLL(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L3f:
            X.05ME r4 = new X.05ME
            r4.<init>(r5, r7)
            goto L12
        L45:
            r0 = 0
            return r0
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter.LJIIJJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C1326005Gw r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter.LJIILJJIL(X.05Gw, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void LJIILLIIL(String str, ThoughtInfo thoughtInfo, EnumC1325405Gq enumC1325405Gq) {
        Long l;
        long jLongValue;
        String strLL;
        InterfaceC332260D0u<ThoughtInfo> interfaceC332260D0u;
        ThoughtInfo value;
        ThoughtInfo thoughtInfoCopy = thoughtInfo;
        String str2 = str;
        if (thoughtInfoCopy.isExpired()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DC.updateThought: SKIP expired uid=");
            sbLIZ.append(str2);
            sbLIZ.append(" thoughtId=");
            sbLIZ.append(thoughtInfoCopy.thoughtId);
            sbLIZ.append(" createTimeMs=");
            sbLIZ.append(thoughtInfoCopy.createTimeMs);
            sbLIZ.append(" now=");
            sbLIZ.append(System.currentTimeMillis());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (str2.length() == 0 && (str2 = thoughtInfoCopy.authorUid) == null) {
            return;
        }
        if (!Intrinsics.LJFF(thoughtInfoCopy.authorUid, str2)) {
            String str3 = thoughtInfoCopy.authorUid;
            if (str3 != null && str3.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DC.updateThought: NORMALIZE caller passed authorUid=");
                sbLIZ2.append(thoughtInfoCopy.authorUid);
                sbLIZ2.append(" but storing under targetUid=");
                sbLIZ2.append(str2);
                sbLIZ2.append(" (will overwrite to key)");
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            thoughtInfoCopy = thoughtInfoCopy.copy(thoughtInfoCopy.thoughtId, thoughtInfoCopy.textContent, thoughtInfoCopy.createTimeMs, thoughtInfoCopy.privacySetting, thoughtInfoCopy.interactionPreview, thoughtInfoCopy.viewerInteraction, str2, thoughtInfoCopy.isPublishing);
        }
        ConcurrentHashMap<String, ThoughtInfo> concurrentHashMap = LIZIZ;
        synchronized (concurrentHashMap) {
            try {
                ThoughtInfo thoughtInfo2 = concurrentHashMap.get(str2);
                if (enumC1325405Gq == EnumC1325405Gq.LL && (interfaceC332260D0u = LIZJ.get(str2)) != null && (value = interfaceC332260D0u.getValue()) != null && value.isPublishing()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("DC.updateThought: REJECT in-flight uid=");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" pending.thoughtId=");
                    sbLIZ3.append(value.thoughtId);
                    sbLIZ3.append(" pending.createTimeMs=");
                    sbLIZ3.append(value.createTimeMs);
                    sbLIZ3.append(" incoming.thoughtId=");
                    sbLIZ3.append(thoughtInfoCopy.thoughtId);
                    sbLIZ3.append(" incoming.createTimeMs=");
                    sbLIZ3.append(thoughtInfoCopy.createTimeMs);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                }
                long jLongValue2 = 0;
                if (thoughtInfo2 == null || (l = thoughtInfo2.createTimeMs) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = l.longValue();
                }
                Long l2 = thoughtInfoCopy.createTimeMs;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                if (thoughtInfo2 != null && jLongValue2 < jLongValue) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("DC.updateThought: REJECT stale uid=");
                    sbLIZ4.append(str2);
                    sbLIZ4.append(" source=");
                    sbLIZ4.append(enumC1325405Gq);
                    sbLIZ4.append(" incoming.thoughtId=");
                    sbLIZ4.append(thoughtInfoCopy.thoughtId);
                    sbLIZ4.append(" incoming.createTimeMs=");
                    sbLIZ4.append(jLongValue2);
                    sbLIZ4.append(" cached.thoughtId=");
                    sbLIZ4.append(thoughtInfo2.thoughtId);
                    sbLIZ4.append(" cached.createTimeMs=");
                    sbLIZ4.append(jLongValue);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    return;
                }
                concurrentHashMap.put(str2, thoughtInfoCopy);
                InterfaceC332260D0u interfaceC332260D0uLJIILIIL = LJIILIIL(str2);
                int iIntValue = ((Number) interfaceC332260D0uLJIILIIL.LIZLLL().getValue()).intValue();
                interfaceC332260D0uLJIILIIL.setValue(thoughtInfoCopy);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("DC.updateThought: WROTE targetUid=");
                sbLIZ5.append(str2);
                sbLIZ5.append(" source=");
                sbLIZ5.append(enumC1325405Gq);
                sbLIZ5.append(" thoughtId=");
                sbLIZ5.append(thoughtInfoCopy.thoughtId);
                sbLIZ5.append(" text=");
                String str4 = thoughtInfoCopy.textContent;
                if (str4 != null) {
                    strLL = C13LN.LL(40, str4);
                } else {
                    strLL = null;
                }
                sbLIZ5.append(strLL);
                sbLIZ5.append(" subscriberCount=");
                sbLIZ5.append(iIntValue);
                C2188811AlT.LIZIZ(sbLIZ5);
                C23250099c.LIZLLL(LIZLLL, null, null, new C1325305Gp(this, str2, thoughtInfoCopy, null), 3);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
    }
}
