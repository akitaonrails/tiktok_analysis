package com.ss.android.ugc.aweme.minis.revisitedu;

import X.AbstractC19484711Kz;
import X.C07Z2;
import X.C07Z3;
import X.C07Z8;
import X.C07ZA;
import X.C11S5;
import X.C1395720mQM;
import X.C1395750mQP;
import X.C13LQ;
import X.C1591330rVr;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1781330wSJ;
import X.C1781380wSO;
import X.C1799220wvA;
import X.C1799840wwA;
import X.C1799850wwB;
import X.C1799860wwC;
import X.C1799890wwF;
import X.C1800000wwQ;
import X.C1886007a6;
import X.C1898007c2;
import X.C1898107c3;
import X.C1954807lC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.EnumC1395730mQN;
import X.EnumC1781360wSM;
import X.EnumC1799930wwJ;
import X.EnumC1800020wwS;
import X.InterfaceC1591340rVs;
import X.InterfaceC1781390wSP;
import X.InterfaceC1799230wvB;
import X.InterfaceC1799250wvD;
import X.InterfaceC1799880wwE;
import X.InterfaceC1799900wwG;
import X.InterfaceC19474811He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.MinisRegisteredRewardTask;
import com.ss.android.ugc.aweme.minis.request.MinisRewardConfigItem;
import com.ss.android.ugc.aweme.minis.request.MinisRewardConfigResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRevisitMissionService implements IMinisRevisitMissionService {
    public static final List<EnumC1799930wwJ> LJII = C13LQ.LJJLL(EnumC1799930wwJ.values());
    public static final List<EnumC1395730mQN> LJIIIIZZ = C1697810uHb.LJIIJJI(EnumC1395730mQN.MINIS_CENTER, EnumC1395730mQN.PROFILE_RICH_CARD);
    public final C1800000wwQ LIZ;
    public final InterfaceC1799880wwE LIZIZ;
    public final InterfaceC1799900wwG LIZJ;
    public final InterfaceC1591340rVs LIZLLL;
    public final InterfaceC1781390wSP LJ;
    public final C1799220wvA LJFF;
    public final C07Z3 LJI;

    public MinisRevisitMissionService() {
        C1800000wwQ c1800000wwQ = new C1800000wwQ();
        C1395750mQP c1395750mQP = new C1395750mQP();
        C1799890wwF c1799890wwF = C1799890wwF.LIZ;
        C1591330rVr c1591330rVr = new InterfaceC1591340rVs() { // from class: X.0rVr
            @Override // X.InterfaceC1591340rVs
            public final boolean LIZ() {
                C1591070rVR.LIZ.getClass();
                return C1591070rVR.LIZ();
            }
        };
        C1781380wSO c1781380wSO = new InterfaceC1781390wSP() { // from class: X.0wSO
            @Override // X.InterfaceC1781390wSP
            public final Set<EnumC1781360wSM> LIZ(String str) {
                String str2;
                if (a0.LJJJIL(str)) {
                    return C08CX.INSTANCE;
                }
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp == null) {
                    return C08CX.INSTANCE;
                }
                if (!Intrinsics.LJFF(minisMetaResp.clientKey, str)) {
                    return C08CX.INSTANCE;
                }
                List<MinisRegisteredRewardTask> list = minisMetaResp.registeredRewardTasks;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (MinisRegisteredRewardTask minisRegisteredRewardTask : list) {
                        C1781370wSN c1781370wSN = EnumC1781360wSM.Companion;
                        if (minisRegisteredRewardTask != null) {
                            str2 = minisRegisteredRewardTask.taskType;
                        } else {
                            str2 = null;
                        }
                        c1781370wSN.getClass();
                        EnumC1781360wSM[] enumC1781360wSMArrValues = EnumC1781360wSM.values();
                        int length = enumC1781360wSMArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                EnumC1781360wSM enumC1781360wSM = enumC1781360wSMArrValues[i];
                                if (Intrinsics.LJFF(enumC1781360wSM.getServerValue(), str2)) {
                                    arrayList.add(enumC1781360wSM);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    Set<EnumC1781360wSM> setLLIIJI = C13LP.LLIIJI(arrayList);
                    if (setLLIIJI != null) {
                        return setLLIIJI;
                    }
                }
                return C08CX.INSTANCE;
            }
        };
        C1799220wvA c1799220wvA = new C1799220wvA();
        this.LJI = new C07Z3();
        this.LIZ = c1800000wwQ;
        this.LIZIZ = c1395750mQP;
        this.LIZJ = c1799890wwF;
        this.LIZLLL = c1591330rVr;
        this.LJ = c1781380wSO;
        this.LJFF = c1799220wvA;
    }

    public static String LJIIJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final C1799850wwB LIZIZ(String str) {
        EnumC1800020wwS enumC1800020wwS;
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return new C1799850wwB(0);
        }
        this.LIZ.getClass();
        C1799840wwA c1799840wwALIZ = C1800000wwQ.LIZ();
        if (!c1799840wwALIZ.LIZ) {
            return new C1799850wwB(0);
        }
        C07ZA c07zaLJIIIZ = LJIIIZ(strLJIIJ, c1799840wwALIZ, C1886007a6.LIZ(this.LIZ.LIZ.LIZ()), this.LIZJ.currentTimeMillis());
        if (c07zaLJIIIZ == null) {
            enumC1800020wwS = EnumC1800020wwS.INVISIBLE;
        } else {
            enumC1800020wwS = c1799840wwALIZ.LIZIZ;
        }
        return new C1799850wwB(c07zaLJIIIZ, enumC1800020wwS);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final C07ZA LJII(String str) {
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return null;
        }
        this.LIZ.getClass();
        C1799840wwA c1799840wwALIZ = C1800000wwQ.LIZ();
        if (!c1799840wwALIZ.LIZ) {
            return null;
        }
        return LJIIIZ(strLJIIJ, c1799840wwALIZ, C1886007a6.LIZ(this.LIZ.LIZ.LIZ()), this.LIZJ.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final boolean LIZJ(String str, String str2) {
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return false;
        }
        EnumC1395730mQN.Companion.getClass();
        EnumC1395730mQN enumC1395730mQNLIZ = C1395720mQM.LIZ(str2);
        if (enumC1395730mQNLIZ == null) {
            return false;
        }
        return this.LJI.LIZ(enumC1395730mQNLIZ.getRewardMissionType(), strLJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final void LIZLLL(EnumC1799930wwJ enumC1799930wwJ, String str) {
        String string;
        C07Z3 c07z3 = this.LJI;
        c07z3.getClass();
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            synchronized (c07z3.LIZ) {
                try {
                    c07z3.LIZIZ = new C07Z2(enumC1799930wwJ, string);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final void LJ(EnumC1395730mQN enumC1395730mQN, String str) {
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return;
        }
        this.LIZIZ.LIZLLL(enumC1395730mQN, strLJIIJ, this.LIZJ.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r2 = LJIIJ(r7)
            r3 = 0
            if (r2 != 0) goto L8
            return r3
        L8:
            X.0mQM r0 = X.EnumC1395730mQN.Companion
            r0.getClass()
            X.0mQN r1 = X.C1395720mQM.LIZ(r8)
            if (r1 != 0) goto L14
            return r3
        L14:
            X.0wvA r0 = r6.LJFF
            X.0wSM r5 = r1.getRewardTaskType()
            r0.getClass()
            java.lang.String r4 = X.C1799220wvA.LIZJ(r2)
            if (r4 != 0) goto L72
            r0 = r3
        L24:
            if (r0 == 0) goto L6d
            java.lang.String r1 = r0.LIZJ
            r4 = 1
            if (r1 == 0) goto L70
            java.lang.CharSequence r1 = kotlin.text.a0.LJLIIIL(r1)
            java.lang.String r2 = r1.toString()
            if (r2 == 0) goto L70
            int r1 = r2.length()
            if (r1 <= 0) goto L6e
            r1 = 1
        L3c:
            if (r1 == 0) goto L70
        L3e:
            if (r2 == 0) goto L6d
            java.lang.String r0 = r0.LIZLLL
            if (r0 == 0) goto L58
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L58
            int r0 = r1.length()
            if (r0 > 0) goto L55
            r4 = 0
        L55:
            if (r4 == 0) goto L58
            r3 = r1
        L58:
            if (r3 == 0) goto L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = " ×"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L6d:
            return r3
        L6e:
            r1 = 0
            goto L3c
        L70:
            r2 = r3
            goto L3e
        L72:
            java.lang.Object r2 = r0.LIZJ
            monitor-enter(r2)
            java.util.Map<X.07c3, X.0wSJ> r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L87
            X.07c3 r0 = new X.07c3     // Catch: java.lang.Throwable -> L87
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L87
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L87
            X.0wSJ r0 = (X.C1781330wSJ) r0     // Catch: java.lang.Throwable -> L87
            monitor-exit(r2)
            goto L24
        L86:
            return r2
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.revisitedu.MinisRevisitMissionService.LJFF(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final C1898007c2 LJI(String str, String str2) {
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return new C1898007c2(false, null, null, 30);
        }
        EnumC1395730mQN.Companion.getClass();
        EnumC1395730mQN enumC1395730mQNLIZ = C1395720mQM.LIZ(str2);
        if (enumC1395730mQNLIZ == null) {
            return new C1898007c2(false, null, null, 30);
        }
        if (!this.LJI.LIZ(enumC1395730mQNLIZ.getRewardMissionType(), strLJIIJ)) {
            return new C1898007c2(false, null, null, 30);
        }
        return new C1898007c2(true, enumC1395730mQNLIZ.getScene(), enumC1395730mQNLIZ.getRewardTaskType(), 24);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final void LJIIIIZZ(EnumC1799930wwJ enumC1799930wwJ, String str) {
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ == null) {
            return;
        }
        this.LIZIZ.LIZ(enumC1799930wwJ, strLJIIJ, this.LIZJ.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService
    public final void LIZ(String str, EnumC1781360wSM enumC1781360wSM, InterfaceC1799250wvD interfaceC1799250wvD) {
        Object obj;
        boolean z;
        String strLJIIJ = LJIIJ(str);
        if (strLJIIJ != null) {
            this.LIZ.getClass();
            if (!C1800000wwQ.LIZ().LIZ) {
                interfaceC1799250wvD.LIZ(null);
                return;
            }
            if (!this.LJ.LIZ(strLJIIJ).contains(enumC1781360wSM)) {
                interfaceC1799250wvD.LIZ(null);
                return;
            }
            final C1799220wvA c1799220wvA = this.LJFF;
            c1799220wvA.getClass();
            String strLIZJ = C1799220wvA.LIZJ(strLJIIJ);
            if (strLIZJ == null) {
                c1799220wvA.LIZIZ(interfaceC1799250wvD, null);
                return;
            }
            final C1898107c3 c1898107c3 = new C1898107c3(strLIZJ, enumC1781360wSM);
            synchronized (c1799220wvA.LIZJ) {
                try {
                    obj = ((LinkedHashMap) c1799220wvA.LIZLLL).get(c1898107c3);
                    z = false;
                    if (obj == null) {
                        List list = (List) ((LinkedHashMap) c1799220wvA.LJ).get(c1898107c3);
                        if (list == null) {
                            c1799220wvA.LJ.put(c1898107c3, C1697810uHb.LJIILJJIL(interfaceC1799250wvD));
                            z = true;
                        } else {
                            list.add(interfaceC1799250wvD);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1781330wSJ c1781330wSJ = (C1781330wSJ) obj;
            if (c1781330wSJ != null) {
                c1799220wvA.LIZIZ(interfaceC1799250wvD, c1781330wSJ);
                return;
            }
            if (!z) {
                return;
            }
            InterfaceC1799230wvB interfaceC1799230wvB = c1799220wvA.LIZ;
            if (interfaceC1799230wvB == null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchRewardInfo, api unavailable, key:");
                sbLIZ.append(c1898107c3);
                C2188811AlT.LIZIZ(sbLIZ);
                c1799220wvA.LIZ(c1898107c3, null);
                return;
            }
            AbstractC19484711Kz.LJIJJ(interfaceC1799230wvB.LIZ(strLIZJ, enumC1781360wSM.getServerValue())).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<MinisRewardConfigResponse>() { // from class: X.0wSI
                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th2) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchRewardInfo, onError:");
                    sbLIZ2.append(th2);
                    sbLIZ2.append(", key:");
                    sbLIZ2.append(c1898107c3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c1799220wvA.LIZ(c1898107c3, null);
                }

                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchRewardInfo, onSubscribe, key:");
                    sbLIZ2.append(c1898107c3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.InterfaceC19474811He
                public final void onSuccess(MinisRewardConfigResponse minisRewardConfigResponse) {
                    Object next;
                    boolean z2;
                    MinisRewardConfigResponse minisRewardConfigResponse2 = minisRewardConfigResponse;
                    C1799220wvA c1799220wvA2 = c1799220wvA;
                    EnumC1781360wSM enumC1781360wSM2 = c1898107c3.LIZIZ;
                    c1799220wvA2.getClass();
                    Integer num = minisRewardConfigResponse2.statusCode;
                    C1781330wSJ c1781330wSJ2 = null;
                    if (num != null && num.intValue() != 0) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchRewardInfo, error response, statusCode:");
                        sbLIZ2.append(minisRewardConfigResponse2.statusCode);
                        sbLIZ2.append(", statusMsg:");
                        sbLIZ2.append(minisRewardConfigResponse2.statusMsg);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        List<MinisRewardConfigItem> list2 = minisRewardConfigResponse2.rewardConfigs;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (MinisRewardConfigItem minisRewardConfigItem : list2) {
                                if (minisRewardConfigItem != null) {
                                    arrayList.add(minisRewardConfigItem);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(((MinisRewardConfigItem) next).rewardScene, enumC1781360wSM2.getServerValue())) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            MinisRewardConfigItem minisRewardConfigItem2 = (MinisRewardConfigItem) next;
                            if (minisRewardConfigItem2 != null) {
                                String strLIZJ2 = C1799220wvA.LIZJ(minisRewardConfigItem2.rewardName);
                                String strLIZJ3 = C1799220wvA.LIZJ(minisRewardConfigItem2.rewardAmount);
                                String strLIZJ4 = C1799220wvA.LIZJ(minisRewardConfigItem2.rewardIconUrl);
                                if (strLIZJ2 != null || strLIZJ3 != null || strLIZJ4 != null) {
                                    c1781330wSJ2 = new C1781330wSJ(enumC1781360wSM2, strLIZJ4, strLIZJ2, strLIZJ3, minisRewardConfigItem2.configVersion);
                                }
                            }
                        }
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fetchRewardInfo, onSuccess, hasReward:");
                    if (c1781330wSJ2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ3.append(z2);
                    sbLIZ3.append(", key:");
                    sbLIZ3.append(c1898107c3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    c1799220wvA.LIZ(c1898107c3, c1781330wSJ2);
                }
            });
            return;
        }
        interfaceC1799250wvD.LIZ(null);
    }

    public final C07ZA LJIIIZ(String str, C1799840wwA c1799840wwA, String str2, long j) {
        int i;
        for (EnumC1799930wwJ enumC1799930wwJ : LJII) {
            C07Z8 c07z8 = c1799840wwA.LJ.get(enumC1799930wwJ);
            if (c07z8 == null) {
                c07z8 = new C07Z8(enumC1799930wwJ, false, null, null, 0, 126);
            }
            if (c1799840wwA.LIZ) {
                C07Z8 c07z82 = c1799840wwA.LJ.get(enumC1799930wwJ);
                if (c07z82 == null) {
                    i = 1;
                    c07z82 = new C07Z8(enumC1799930wwJ, false, null, null, 0, 126);
                } else {
                    i = 1;
                }
                if (c07z82.LIZIZ) {
                    String strLIZ = C1886007a6.LIZ(str2);
                    if (!c07z82.LIZLLL.contains("*") && !c07z82.LIZLLL.contains(strLIZ) && (c07z82.LIZJ.contains("*") || c07z82.LIZJ.contains(strLIZ))) {
                        int[] iArr = C1799860wwC.LIZ;
                        int i2 = iArr[enumC1799930wwJ.ordinal()];
                        if (i2 != i) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new C1954807lC();
                                }
                            } else if (!this.LIZLLL.LIZ()) {
                                continue;
                            }
                        }
                        if (this.LJ.LIZ(str).contains(enumC1799930wwJ.getRewardTaskType())) {
                            int i3 = iArr[enumC1799930wwJ.ordinal()];
                            if (i3 != i) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        if (!this.LIZIZ.LJII(str) && !this.LIZIZ.LIZJ(EnumC1799930wwJ.ADD_TO_HOME_SCREEN, str)) {
                                            return new C07ZA(enumC1799930wwJ, str, c07z8.LJFF);
                                        }
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else if (this.LIZIZ.LJFF(EnumC1395730mQN.FEED_SIDEBAR, c07z8.LJ, j)) {
                                    return new C07ZA(enumC1799930wwJ, str, c07z8.LJFF);
                                }
                            } else {
                                List<EnumC1395730mQN> list = LJIIIIZZ;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator<EnumC1395730mQN> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (!this.LIZIZ.LJFF(it2.next(), c07z8.LJ, j)) {
                                            break;
                                        }
                                    }
                                }
                                return new C07ZA(enumC1799930wwJ, str, c07z8.LJFF);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
