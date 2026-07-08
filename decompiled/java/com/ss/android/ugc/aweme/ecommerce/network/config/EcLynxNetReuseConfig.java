package com.ss.android.ugc.aweme.ecommerce.network.config;

import X.C09CT;
import X.C0C64;
import X.C0XLM;
import X.C13BV;
import X.C13LP;
import X.C1507470pKb;
import X.C1507500pKe;
import X.C1507540pKi;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class EcLynxNetReuseConfig {
    public static final EcLynxNetReuseConfig LIZ = new EcLynxNetReuseConfig();
    public static final C1507470pKb<String, EcLynxNetReuseConfigModel> LIZIZ = new C1507470pKb<>(8, Float.valueOf(0.25f));
    public static final EcLynxNetReuseConfigModel[] LIZJ;
    public static final Set<String> LIZLLL;

    static {
        EcLynxNetReuseConfigModel[] ecLynxNetReuseConfigModelArr = new EcLynxNetReuseConfigModel[0];
        EcLynxNetReuseConfigModel[] ecLynxNetReuseConfigModelArr2 = (EcLynxNetReuseConfigModel[]) C0C64.LJIILLIIL().LJJII(EcLynxNetReuseConfigModel[].class, ecLynxNetReuseConfigModelArr, "ec_lynx_net_reuse_config", true);
        if (ecLynxNetReuseConfigModelArr2 != null) {
            ecLynxNetReuseConfigModelArr = ecLynxNetReuseConfigModelArr2;
        }
        LIZJ = ecLynxNetReuseConfigModelArr;
        ArrayList arrayList = new ArrayList();
        for (EcLynxNetReuseConfigModel ecLynxNetReuseConfigModel : ecLynxNetReuseConfigModelArr) {
            String str = ecLynxNetReuseConfigModel.path;
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        LIZLLL = C13LP.LLIIJI(arrayList);
    }

    public static EcLynxNetReuseConfigModel LIZIZ(String str) {
        Object next;
        if (str == null) {
            return null;
        }
        Iterator<T> it2 = LIZIZ.LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ((Map.Entry) next).getKey());
                sbLIZ.append('_');
                if (u.LJJIIJZLJL(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (EcLynxNetReuseConfigModel) entry.getValue();
    }

    public static C1507500pKe LIZ(EcLynxNetReuseConfig ecLynxNetReuseConfig, String str, C0XLM c0xlm) {
        boolean z;
        C1507540pKi c1507540pKi;
        boolean z2;
        C1507540pKi c1507540pKi2;
        ecLynxNetReuseConfig.getClass();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (EcLynxNetReuseConfigModel ecLynxNetReuseConfigModel : LIZJ) {
            if (Intrinsics.LJFF(str, ecLynxNetReuseConfigModel.path)) {
                List<String> list = ecLynxNetReuseConfigModel.matchAnd;
                if (list == null) {
                    c1507540pKi = new C1507540pKi(true, C13BV.INSTANCE);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : list) {
                        LIZ.getClass();
                        if (LIZJ(str2, c0xlm, null)) {
                            arrayList.add(str2);
                        }
                    }
                    if (arrayList.size() == list.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1507540pKi = new C1507540pKi(z2, arrayList);
                }
                if (c1507540pKi.LIZ) {
                    List<String> list2 = ecLynxNetReuseConfigModel.matchOr;
                    if (list2 == null) {
                        c1507540pKi2 = new C1507540pKi(true, C13BV.INSTANCE);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str3 : list2) {
                            LIZ.getClass();
                            if (LIZJ(str3, c0xlm, null)) {
                                arrayList2.add(str3);
                            }
                        }
                        c1507540pKi2 = new C1507540pKi(!arrayList2.isEmpty(), arrayList2);
                    }
                    if (c1507540pKi2.LIZ) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(c1507540pKi.LIZIZ);
                        linkedHashSet.addAll(c1507540pKi2.LIZIZ);
                        C1507500pKe c1507500pKe = new C1507500pKe(ecLynxNetReuseConfigModel, C13LP.LLIIII(linkedHashSet));
                        EcLynxNetReuseConfig ecLynxNetReuseConfig2 = LIZ;
                        String str4 = c1507500pKe.LIZJ;
                        ecLynxNetReuseConfig2.getClass();
                        LIZIZ.LIZJ(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(str, str4), "_", null, null, 0, null, null, 62), ecLynxNetReuseConfigModel);
                        return c1507500pKe;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static boolean LIZJ(String str, C0XLM c0xlm, String str2) {
        if (c0xlm != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 2, 2);
            String str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
            if (listLJJLIIIJILLIZJL.size() == 2) {
                String str4 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                String strLIZJ = c0xlm.LIZJ(str3);
                if (strLIZJ != null && strLIZJ.length() != 0 && a0.LJJIIZI(strLIZJ, str4, false)) {
                    return true;
                }
            } else {
                String strLIZJ2 = c0xlm.LIZJ(str3);
                if (strLIZJ2 != null && strLIZJ2.length() != 0) {
                    return true;
                }
            }
        }
        if (str2 != null && str2.length() != 0 && a0.LJJIIZI(str2, str, false)) {
            return true;
        }
        return false;
    }

    public static final class EcLynxNetReuseConfigModel {

        @C09CT("match_and")
        public final List<String> matchAnd;

        @C09CT("match_or")
        public final List<String> matchOr;

        @C09CT("path")
        public final String path;

        @C09CT("timeout")
        public final long timeout;

        @C09CT("use_only_once")
        public final boolean useOnlyOnce;

        public EcLynxNetReuseConfigModel() {
            this("", null, null, 10000L, true);
        }

        public EcLynxNetReuseConfigModel(String str, List<String> list, List<String> list2, long j, boolean z) {
            this.path = str;
            this.matchOr = list;
            this.matchAnd = list2;
            this.timeout = j;
            this.useOnlyOnce = z;
        }
    }
}
