package com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm;

import X.C01GW;
import X.C054G;
import X.C05OT;
import X.C05OY;
import X.C05OZ;
import X.C05YD;
import X.C069P;
import X.C0PEM;
import X.C1227904rF;
import X.C1336205Ku;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C461720I8s;
import X.C706070Rmn;
import X.C706080Rmo;
import X.C786410Ut5;
import X.C897370ZIh;
import X.InterfaceC1345705Ol;
import X.InterfaceC1513805wG;
import X.InterfaceC1725106pF;
import X.InterfaceC897380ZIi;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;
import com.ss.android.ugc.aweme.im.service.service.IMufAffinityScoreRepositoryInitializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MufAffinityScoreRepository {
    public static final C01GW<MufAffinityScoreRepository> LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(479));
    public final Set<String> LIZ = new LinkedHashSet();
    public final int LIZIZ = LIZ();
    public final InterfaceC1725106pF LIZJ;
    public final InterfaceC1345705Ol LIZLLL;
    public final C05YD<Boolean> LJ;
    public final C054G LJFF;
    public final Keva LJI;
    public final Map<String, Map<String, Double>> LJII;

    public static final class Service implements IMufAffinityScoreRepositoryInitializer {
        @Override // com.ss.android.ugc.aweme.im.service.service.IMufAffinityScoreRepositoryInitializer
        public final void init() {
            MufAffinityScoreRepository.LJIIIIZZ.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.05OW] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJFF() {
        this.LIZ.clear();
        Iterator<Map.Entry<String, Double>> it2 = LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            this.LIZLLL.LJIIIZ(key, new C05OZ() { // from class: X.05OW
                @Override // X.C05OZ
                public final void LIZ(IMUser iMUser) {
                    String strJ4;
                    if (iMUser != null && iMUser.getUid() != null) {
                        if (iMUser.isBlock() || iMUser.isBlocked() || iMUser.getFollowStatus() != 2) {
                            MufAffinityScoreRepository mufAffinityScoreRepository = this.LIZ;
                            String strValueOf = String.valueOf(iMUser.getUid());
                            Map<String, Double> mapLIZIZ = mufAffinityScoreRepository.LIZIZ();
                            if (!mapLIZIZ.isEmpty() && mapLIZIZ.containsKey(strValueOf)) {
                                if (mapLIZIZ.size() - 1 < MufAffinityScoreRepository.LIZ()) {
                                    C23250099c.LIZLLL(mufAffinityScoreRepository.LJFF, null, null, new C05OO(mufAffinityScoreRepository, null), 3);
                                } else {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZIZ);
                                    linkedHashMap.remove(strValueOf);
                                    String strLIZIZ = C461720I8s.LIZIZ();
                                    if (!Intrinsics.LJFF(strLIZIZ, "-1") && (strJ4 = C786410Ut5.j4("uid_list_%s", new Object[]{strLIZIZ})) != null) {
                                        ((ConcurrentHashMap) mufAffinityScoreRepository.LJII).put(strJ4, linkedHashMap);
                                        Keva keva = mufAffinityScoreRepository.LJI;
                                        C1227904rF.LIZ.getClass();
                                        keva.storeString(strJ4, C1227904rF.LJI(linkedHashMap));
                                    }
                                }
                            }
                            this.LIZ.LIZLLL.LJIIJJI(iMUser.getUid(), this);
                            C19719512Dh.LIZ(this.LIZ.LIZ).remove(iMUser.getUid());
                        }
                    }
                }
            });
            this.LIZ.add(key);
        }
    }

    public MufAffinityScoreRepository() {
        IMContactApi.LIZ.getClass();
        InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
        this.LIZJ = interfaceC1725106pFLIZ;
        this.LIZLLL = C1336205Ku.LIZ(false).getImUserService();
        this.LJ = interfaceC1725106pFLIZ.LJJII();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LJFF = c054gLIZ;
        this.LJI = Keva.getRepo("muf_affinity_score_keva");
        this.LJII = new ConcurrentHashMap();
        C23250099c.LIZLLL(c054gLIZ, null, null, new C05OT(this, null), 3);
    }

    public static int LIZ() {
        int i;
        if (C05OY.LIZ()) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            i = C897370ZIh.LIZ().LJIJI().LIZJ;
        } else {
            i = 0;
        }
        return ((Number) C13LP.LJJLJ(C1697810uHb.LJIIJJI(Integer.valueOf(C706070Rmn.LIZ().enableLike == 1 ? C706070Rmn.LIZ().topKAffinityRanking : 0), Integer.valueOf(C706080Rmo.LIZ().topKAffinityRanking > 0 ? C706080Rmo.LIZ().topKAffinityRanking : 0), Integer.valueOf(((InterfaceC1513805wG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJLIIIJLJLI()), Integer.valueOf(i)))).intValue();
    }

    public final Map<String, Double> LIZIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        String strJ4 = Intrinsics.LJFF(strLIZIZ, "-1") ? null : C786410Ut5.j4("uid_list_%s", new Object[]{strLIZIZ});
        if (strJ4 == null) {
            return C2097608Jq.LJ();
        }
        Map<String, Double> map = (Map) ((ConcurrentHashMap) this.LJII).get(strJ4);
        if (map != null) {
            return map;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String string = this.LJI.getString(strJ4, null);
            Type type = new TypeToken<Map<String, ? extends Double>>() { // from class: X.050Q
            }.getType();
            c1227904rF.getClass();
            Map mapLJ = (Map) C1227904rF.LIZJ(string, type);
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            ((ConcurrentHashMap) this.LJII).put(strJ4, mapLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJI.erase(strJ4);
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C05OS
            if (r0 == 0) goto L6c
            r3 = r7
            X.05OS r3 = (X.C05OS) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r5 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r4 = 1
            if (r0 == 0) goto L58
            if (r0 != r4) goto L72
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r3 = r3.LL
            X.C155000ia.LIZIZ(r5)
        L24:
            r3.getClass()
            java.lang.String r2 = X.C461720I8s.LIZIZ()
            java.lang.String r0 = "-1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L55
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            r1[r0] = r2
            java.lang.String r0 = "uid_list_%s"
            java.lang.String r2 = X.C786410Ut5.j4(r0, r1)
            if (r2 == 0) goto L55
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> r0 = r3.LJII
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r2, r5)
            com.bytedance.keva.Keva r1 = r3.LJI
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1227904rF.LJI(r5)
            r1.storeString(r2, r0)
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            X.C155000ia.LIZIZ(r5)
            r3.LL = r6
            r3.LLILZ = r4
            X.06pF r1 = r6.LIZJ
            int r0 = r6.LIZIZ
            java.lang.Object r5 = r1.LJJIIJ(r0, r3)
            if (r5 != r2) goto L6a
            return r2
        L6a:
            r3 = r6
            goto L24
        L6c:
            X.05OS r3 = new X.05OS
            r3.<init>(r6, r7)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository.LJ(X.05Vn):java.lang.Object");
    }

    public static int LIZJ(MufAffinityScoreRepository mufAffinityScoreRepository, String str) {
        Map<String, Double> mapLIZIZ = mufAffinityScoreRepository.LIZIZ();
        if (mapLIZIZ.containsKey(str) && !Intrinsics.LIZIZ(mapLIZIZ.get(str), 0.0d)) {
            int i = 0;
            for (Object obj : mapLIZIZ.keySet()) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (!Intrinsics.LJFF(obj, str)) {
                        i = i2;
                    } else {
                        return i;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return -1;
    }

    public final List<String> LIZLLL(int i, boolean z) {
        List listLL = C13LP.LL(LIZIZ().entrySet(), i);
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLL) {
                if (((Number) ((Map.Entry) obj).getValue()).doubleValue() > 0.0d) {
                    arrayList.add(obj);
                }
            }
            listLL = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Map.Entry) it2.next()).getKey());
        }
        return arrayList2;
    }
}
