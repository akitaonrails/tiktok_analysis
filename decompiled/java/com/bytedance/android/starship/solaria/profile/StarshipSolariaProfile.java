package com.bytedance.android.starship.solaria.profile;

import X.C01GW;
import X.C04TD;
import X.C074H;
import X.C07K9;
import X.C09JN;
import X.C1097900eg0;
import X.C1097920eg2;
import X.C1103580epA;
import X.C1103670epJ;
import X.C1103770epT;
import X.C11NZ;
import X.C11S5;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC1103750epR;
import X.InterfaceC1294060jmO;
import X.InterfaceC1487280oo2;
import X.InterfaceC19483011Ki;
import Y.ARunnableS117S0100000_17;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.repository.ProfileGroupConfig;
import com.bytedance.android.starship.solaria.profile.repository.ProfileQueryParams;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileApi;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileModel;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileResponse;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class StarshipSolariaProfile implements IStarshipSolariaProfile {
    public volatile SolariaProfileModel LIZIZ;
    public volatile SolariaProfileModel LIZJ;
    public volatile Map<String, String> LIZLLL;
    public final List<InterfaceC1103750epR> LIZ = new CopyOnWriteArrayList();
    public final boolean LJ = ((Boolean) C07K9.LIZJ.getValue()).booleanValue();

    public static IStarshipSolariaProfile LJII() {
        Object objLIZ = C04TD.LIZ(IStarshipSolariaProfile.class, false);
        if (objLIZ != null) {
            return (IStarshipSolariaProfile) objLIZ;
        }
        if (C04TD.LJII == null) {
            synchronized (IStarshipSolariaProfile.class) {
                if (C04TD.LJII == null) {
                    C04TD.LJII = new StarshipSolariaProfile();
                }
            }
        }
        return C04TD.LJII;
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    @InterfaceC1294060jmO
    public final Map<String, String> LIZJ() {
        return LJI("legacy_cold_start_profiles");
    }

    public final SolariaProfileModel LJIIIIZZ() {
        Map<String, String> map;
        SolariaProfileModel solariaProfileModel = this.LIZIZ;
        return (solariaProfileModel == null || (map = solariaProfileModel.profileDataMap) == null || !(map.isEmpty() ^ true)) ? this.LIZJ : this.LIZIZ;
    }

    public StarshipSolariaProfile() {
        ((Boolean) C07K9.LIZLLL.getValue()).booleanValue();
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0eg4
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("StarshipSolariaProfile@cc7d.<init>$1");
                try {
                    StarshipSolariaProfile starshipSolariaProfile = this.LL;
                    C1097900eg0.LIZ.getClass();
                    starshipSolariaProfile.LIZJ = (SolariaProfileModel) C1097900eg0.LIZLLL.getValue();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("StarshipSolariaProfile@cc7d.<init>$1");
            }
        });
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    public final void LJFF() throws JSONException {
        C11NZ<n> c11nzFetchProfiles;
        List<ProfileGroupConfig> list;
        boolean zLJI = MethodIDManager.LJI(71756);
        C1097900eg0 c1097900eg0 = C1097900eg0.LIZ;
        final C1103580epA c1103580epA = new C1103580epA(this);
        c1097900eg0.getClass();
        boolean zLJI2 = MethodIDManager.LJI(71755);
        C1097920eg2.LIZ().put("START_TIME", System.currentTimeMillis());
        if (((Boolean) C074H.LIZIZ.getValue()).booleanValue()) {
            SolariaProfileModel solariaProfileModel = (SolariaProfileModel) C1097900eg0.LIZLLL.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (solariaProfileModel != null && (list = solariaProfileModel.groupList) != null) {
                for (ProfileGroupConfig profileGroupConfig : list) {
                    String str = profileGroupConfig.groupName;
                    if (str != null && str.length() != 0) {
                        String str2 = profileGroupConfig.groupName;
                        Long l = profileGroupConfig.version;
                        linkedHashMap.put(str2, Long.valueOf(l != null ? l.longValue() : 0L));
                    }
                }
            }
            c11nzFetchProfiles = ((SolariaProfileApi) C1103770epT.LIZ.getValue()).fetchProfiles(new ProfileQueryParams(linkedHashMap));
        } else {
            c11nzFetchProfiles = ((SolariaProfileApi) C1103770epT.LIZ.getValue()).fetchProfiles();
        }
        c11nzFetchProfiles.LJL(C11S5.LIZ()).LJJLIIIJL(3L, new InterfaceC19483011Ki() { // from class: X.0ep8
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                C1097900eg0.LIZJ++;
                return true;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0efy
            /* JADX WARN: Type inference failed for: r1v13, types: [T, com.bytedance.android.starship.solaria.profile.repository.SolariaProfileModel] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws JSONException {
                SolariaProfileModel solariaProfileModel2;
                int size;
                n nVar = (n) obj;
                C1097900eg0.LIZ.getClass();
                if (nVar.LJJIJIIJIL("data")) {
                    SolariaProfileResponse solariaProfileResponse = (SolariaProfileResponse) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) nVar, SolariaProfileResponse.class);
                    C259800zU c259800zU = new C259800zU();
                    T t = (T) solariaProfileResponse.getData();
                    if (t == null) {
                        t = (T) new SolariaProfileModel(null, null);
                    }
                    c259800zU.element = t;
                    SolariaProfileModel solariaProfileModel3 = (SolariaProfileModel) C1097900eg0.LIZLLL.getValue();
                    if (solariaProfileModel3 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Map<String, String> map = solariaProfileModel3.profileDataMap;
                        if (map != null) {
                            linkedHashMap2.putAll(map);
                        }
                        Map<String, String> map2 = ((SolariaProfileModel) c259800zU.element).profileDataMap;
                        if (map2 != null) {
                            linkedHashMap2.putAll(map2);
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        List<ProfileGroupConfig> list2 = solariaProfileModel3.groupList;
                        if (list2 != null) {
                            linkedHashSet.addAll(list2);
                        }
                        List<ProfileGroupConfig> list3 = ((SolariaProfileModel) c259800zU.element).groupList;
                        if (list3 != null) {
                            for (ProfileGroupConfig profileGroupConfig2 : list3) {
                                Long l2 = profileGroupConfig2.version;
                                if (l2 != null && l2.longValue() == -1) {
                                    linkedHashSet.remove(profileGroupConfig2);
                                } else {
                                    if (linkedHashSet.contains(profileGroupConfig2)) {
                                        linkedHashSet.remove(profileGroupConfig2);
                                    }
                                    linkedHashSet.add(profileGroupConfig2);
                                }
                            }
                        }
                        ?? r1 = (T) new SolariaProfileModel(linkedHashMap2, C13LP.LLIIII(linkedHashSet));
                        r1.setNewStruck$solaria_release(Boolean.TRUE);
                        r1.getFlatGroup$solaria_release();
                        c259800zU.element = r1;
                    }
                    SolariaProfileModel solariaProfileModel4 = (SolariaProfileModel) c259800zU.element;
                    Map<String, HashSet<String>> flatGroup$solaria_release = solariaProfileModel4.getFlatGroup$solaria_release();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator<Map.Entry<String, HashSet<String>>> it2 = flatGroup$solaria_release.entrySet().iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getValue(), linkedHashSet2);
                    }
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    Map<String, String> map3 = solariaProfileModel4.profileDataMap;
                    if (map3 != null) {
                        for (Map.Entry<String, String> entry : map3.entrySet()) {
                            if (!linkedHashSet2.contains(entry.getKey())) {
                                linkedHashSet3.add(entry.getKey());
                            }
                        }
                    }
                    if (!linkedHashSet3.isEmpty()) {
                        C1103670epJ.LJII = linkedHashSet3;
                    }
                    solariaProfileModel2 = (SolariaProfileModel) c259800zU.element;
                } else {
                    solariaProfileModel2 = new SolariaProfileModel(null, null);
                    solariaProfileModel2.setProfileDataMap((Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), nVar, new TypeToken<Map<String, ? extends String>>() { // from class: X.04XR
                    }.getType()));
                    solariaProfileModel2.setNewStruck$solaria_release(Boolean.FALSE);
                }
                try {
                    ((Keva) C1097900eg0.LIZIZ.getValue()).storeString("profile_entry", C7740030o.LIZ().getGson().LJIILLIIL(solariaProfileModel2, SolariaProfileModel.class));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                JSONObject jSONObjectLIZ = C1097920eg2.LIZ();
                Map<String, String> map4 = solariaProfileModel2.profileDataMap;
                if (map4 != null) {
                    size = map4.size();
                } else {
                    size = 0;
                }
                jSONObjectLIZ.put("profile_cnt", size);
                return solariaProfileModel2;
            }
        }).LJJLL(new C09JN() { // from class: X.0ep9
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("SolariaProfileRepository@75bc.fetchPortraits$disposable$3");
                boolean zLJI3 = MethodIDManager.LJI(196610);
                boolean zLJI4 = MethodIDManager.LJI(196610);
                c1103580epA.invoke(obj);
                C1097920eg2.LIZ().put("retry_count", C1097900eg0.LIZJ);
                if (C793770VBv.LIZJ("starship_solaria_profile_monitor")) {
                    long jOptLong = C1097920eg2.LIZ().optLong("START_TIME");
                    C238400w2 c238400w2 = new C238400w2();
                    if (jOptLong != 0) {
                        c238400w2.element = System.currentTimeMillis() - jOptLong;
                    }
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS117S0100000_17(c238400w2, 296));
                }
                if (zLJI4) {
                    MethodIDManager.LJ();
                }
                if (zLJI3) {
                    MethodIDManager.LJ();
                }
                C1C7U.LIZIZ("SolariaProfileRepository@75bc.fetchPortraits$disposable$3");
            }
        }, new C09JN() { // from class: X.0epE
            @Override // X.C09JN
            public final void accept(Object obj) {
                final int errorCode;
                C1C7U.LIZ("SolariaProfileRepository@75bc.fetchPortraits$disposable$4");
                Throwable th = (Throwable) obj;
                c1103580epA.invoke(null);
                if (th instanceof C1494430ozZ) {
                    errorCode = ((C1494430ozZ) th).getStatusCode();
                } else if (th instanceof C23112093u) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = -1;
                }
                final String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                if (C793770VBv.LIZJ("starship_solaria_profile_monitor")) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0epD
                        public final void LIZ() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                int i = errorCode;
                                String str3 = message;
                                if (i == 0) {
                                    i = -1;
                                }
                                jSONObject.put("error_code", i);
                                jSONObject.put("error_reason", str3);
                                jSONObject.put("is_new_sdk", C1103790epV.LIZ());
                                C793770VBv.LJII("starship_solaria_profile_monitor", jSONObject, null, null);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SolariaProfileMonitor@5223.uploadErrorMonitor$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SolariaProfileMonitor@5223.uploadErrorMonitor$1");
                        }
                    });
                }
                C1C7U.LIZIZ("SolariaProfileRepository@75bc.fetchPortraits$disposable$4");
            }
        });
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        C1097900eg0.LIZ.getClass();
        this.LIZJ = (SolariaProfileModel) C1097900eg0.LIZLLL.getValue();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    public final boolean LIZ(String str) {
        SolariaProfileModel solariaProfileModelLJIIIIZZ;
        Map<String, String> map;
        if (str == null || (solariaProfileModelLJIIIIZZ = LJIIIIZZ()) == null || (map = solariaProfileModelLJIIIIZZ.profileDataMap) == null) {
            return false;
        }
        return map.containsKey(str);
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    public final void LIZIZ(InterfaceC1103750epR interfaceC1103750epR) {
        ((CopyOnWriteArrayList) this.LIZ).add(interfaceC1103750epR);
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    @InterfaceC1294060jmO
    public final String LIZLLL(String str) {
        return LJ("legacy_cold_start_profiles", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    public final Map<String, String> LJI(String str) {
        ?? linkedHashMap;
        String str2;
        String str3;
        ?? r3;
        SolariaProfileModel solariaProfileModelLJIIIIZZ = LJIIIIZZ();
        if (solariaProfileModelLJIIIIZZ == null) {
            return null;
        }
        HashSet<String> hashSet = solariaProfileModelLJIIIIZZ.getFlatGroup$solaria_release().get(str);
        if (hashSet == null) {
            r3 = 0;
        } else {
            if (Intrinsics.LJFF(str, "legacy_cold_start_profiles")) {
                linkedHashMap = this.LIZLLL;
                if (linkedHashMap == 0 || !(!linkedHashMap.isEmpty())) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str4 : hashSet) {
                        Map<String, String> map = solariaProfileModelLJIIIIZZ.profileDataMap;
                        if (map != null && (str3 = map.get(str4)) != null) {
                            linkedHashMap.put(str4, str3);
                        }
                    }
                    this.LIZLLL = linkedHashMap;
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                for (String str5 : hashSet) {
                    Map<String, String> map2 = solariaProfileModelLJIIIIZZ.profileDataMap;
                    if (map2 != null && (str2 = map2.get(str5)) != null) {
                        linkedHashMap.put(str5, str2);
                    }
                }
            }
            C01GW c01gw = C1103670epJ.LIZ;
            C1103670epJ.LJI = true;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1103670epJ.LJ.getValue();
            r3 = linkedHashMap;
            if (C1103670epJ.LJI) {
                AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(str);
                if (atomicInteger == null) {
                    concurrentHashMap.put(str, new AtomicInteger(1));
                    r3 = linkedHashMap;
                } else {
                    atomicInteger.incrementAndGet();
                    r3 = linkedHashMap;
                }
            }
        }
        if (!this.LJ && (r3 == 0 || r3.isEmpty())) {
            SolariaProfileModel solariaProfileModelLJIIIIZZ2 = LJIIIIZZ();
            if (solariaProfileModelLJIIIIZZ2 == null) {
                return null;
            }
            return solariaProfileModelLJIIIIZZ2.profileDataMap;
        }
        return r3;
    }

    @Override // com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile
    public final String LJ(String str, String str2) {
        SolariaProfileModel solariaProfileModelLJIIIIZZ;
        boolean zContains;
        String str3;
        if (str2 != null && (solariaProfileModelLJIIIIZZ = LJIIIIZZ()) != null) {
            HashSet<String> hashSet = solariaProfileModelLJIIIIZZ.getFlatGroup$solaria_release().get(str);
            if (hashSet != null) {
                zContains = hashSet.contains(str2);
            } else {
                zContains = false;
            }
            if (zContains) {
                C01GW c01gw = C1103670epJ.LIZ;
                C1103670epJ.LJI = true;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1103670epJ.LJ.getValue();
                if (C1103670epJ.LJI) {
                    AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(str);
                    if (atomicInteger == null) {
                        concurrentHashMap.put(str, new AtomicInteger(1));
                    } else {
                        atomicInteger.incrementAndGet();
                    }
                }
            } else if (this.LJ) {
                return null;
            }
            Map<String, String> map = solariaProfileModelLJIIIIZZ.profileDataMap;
            if (map != null && (str3 = map.get(str2)) != null) {
                C01GW c01gw2 = C1103670epJ.LIZ;
                C1103670epJ.LJI = true;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C1103670epJ.LIZLLL.getValue();
                if (C1103670epJ.LJI) {
                    AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap2.get(str2);
                    if (atomicInteger2 == null) {
                        concurrentHashMap2.put(str2, new AtomicInteger(1));
                    } else {
                        atomicInteger2.incrementAndGet();
                        return str3;
                    }
                }
                return str3;
            }
        }
        return null;
    }
}
