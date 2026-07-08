package defpackage;

import X.C098200Yq;
import X.C0NDE;
import X.C0NE1;
import X.C0NEU;
import X.C0NEW;
import X.C0VSJ;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2280811EPf;
import X.C590420NDs;
import X.C590440NDu;
import X.C590480NDy;
import X.C797930VRv;
import X.C844470XAv;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 {
    public static final x0 LIZ = new x0();
    public static final String LIZIZ = ",";
    public static final String LIZJ = ":";
    public static final HashMap<String, Integer> LIZLLL = new HashMap<>();

    public static int LJ() {
        Object c098200Yq;
        if (!((Boolean) C2280811EPf.LJII.getValue()).booleanValue()) {
            return -1;
        }
        try {
            C590420NDs.LIZ.getClass();
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590420NDs.LJ(), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList2.add(numLJIIJJI);
                }
            }
            c098200Yq = Integer.valueOf((int) C13LP.LJJJ(arrayList2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static void LJIIIIZZ() {
        String strLIZJ;
        File[] fileArrListFiles;
        C590420NDs.LIZ.getClass();
        C590420NDs.LJIIZILJ("");
        int value = C0NEW.ORIGIN.getValue();
        C844470XAv.LIZ.getClass();
        if (C844470XAv.LIZ() == null || (strLIZJ = C0NEU.LIZJ()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(File.separator);
        sbLIZ.append("feedCache");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length != 0) {
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            int length = fileArrListFiles.length;
            int i2 = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                if (value == C0NEW.ORIGIN.getValue() && "feed.pb".equals(file.getName())) {
                    C797930VRv.LIZIZ("cleanCacheFeedWithTag delete origin pb and json");
                    file.delete();
                    i2++;
                }
                arrayList.add(Unit.LIZ);
                i++;
            }
            i = i2;
        }
        C0NDE.LIZ.getClass();
        C0NDE.LJFF(1, C0NDE.LIZLLL(), Integer.valueOf(i));
    }

    public static void LJIIIZ() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590440NDu.LIZ(), new String[]{LIZIZ}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        C590420NDs.LIZ.getClass();
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(C590420NDs.LIZIZ(), new String[]{LIZIZ}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listLJJLIIIJILLIZJL2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            Object objLJJJJZI = C13LP.LJJJJZI(a0.LJJLIIIJILLIZJL((String) obj3, new String[]{LIZJ}, 0, 6));
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), objLJJJJZI)) {
                            arrayList3.add(obj3);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        C590420NDs c590420NDs = C590420NDs.LIZ;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, LIZIZ, null, null, 0, null, null, 62);
        c590420NDs.getClass();
        C590420NDs.LJI().storeString("aid_and_gid_mapping_string", strLJJLIIIJ);
    }

    public static void LIZ(String str) {
        if (str != null && str.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{LIZJ}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 2) {
                C590420NDs.LIZ.getClass();
                String strLIZIZ = C590420NDs.LIZIZ();
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(LIZIZ);
                    sbLIZ.append(str);
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
                C590420NDs.LJI().storeString("aid_and_gid_mapping_string", str);
            }
        }
    }

    public static int LIZIZ(String str) {
        if (str.length() == 0) {
            return 0;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{LIZIZ}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public static String LIZJ(String str, String str2) {
        if (str.length() != 0 && str2.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{LIZIZ}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str2, new String[]{LIZIZ}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!listLJJLIIIJILLIZJL2.contains(obj2)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                return "";
            }
            if (arrayList2.size() == 1) {
                return (String) C13LP.LJJJJZI(arrayList2);
            }
            return C13LP.LJJLIIIJ(arrayList2, LIZIZ, null, null, 0, null, null, 62);
        }
        return str;
    }

    public static String LIZLLL(String str, String str2) {
        if (str.length() == 0) {
            return str;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{LIZIZ}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str2, new String[]{LIZIZ}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (listLJJLIIIJILLIZJL2.contains(obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return "";
        }
        if (arrayList2.size() == 1) {
            return (String) C13LP.LJJJJZI(arrayList2);
        }
        return C13LP.LJJLIIIJ(arrayList2, LIZIZ, null, null, 0, null, null, 62);
    }

    public static boolean LJFF(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{LIZIZ}, 0, 6).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{LIZJ}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                    String str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                    if (objLJJJLZIJ != null && str3 != null && u.LJJIIJZLJL(str2, str3, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String LJI(String str, String str2) {
        if (!a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{LIZIZ}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{LIZIZ}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL2) {
                String str3 = (String) obj;
                int iLJJJ = a0.LJJJ(str3, LIZJ, 0, false, 6);
                if (iLJJJ <= 0 || !setLLIIJI.contains(str3.substring(0, iLJJJ))) {
                    arrayList2.add(obj);
                }
            }
            return C13LP.LJJLIIIJ(arrayList2, LIZIZ, null, null, 0, null, null, 62);
        }
        return str;
    }

    public final synchronized void LJII(int i, String str) {
        Pair pair;
        C590480NDy c590480NDy = C590480NDy.LIZ;
        C0NE1 c0ne1 = C0NE1.REMOVE;
        c590480NDy.getClass();
        C590480NDy.LJIILL(str, c0ne1);
        C0NEW c0new = C0NEW.DB;
        if (i == c0new.getValue()) {
            C590420NDs.LIZ.getClass();
            pair = new Pair(C590420NDs.LJIILIIL(), "");
        } else if (i == C0NEW.ORIGIN.getValue()) {
            C590420NDs.LIZ.getClass();
            pair = new Pair(C590420NDs.LJIIJ(), "");
        } else {
            return;
        }
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        if (str2.length() == 0 && str3.length() == 0) {
            return;
        }
        String strLIZJ = LIZJ(str2, str);
        if (i == c0new.getValue()) {
            C590420NDs.LIZ.getClass();
            C590420NDs.LJIJ(strLIZJ);
        } else if (i == C0NEW.ORIGIN.getValue()) {
            C590420NDs.LIZ.getClass();
            C590420NDs.LJIIZILJ(strLIZJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeVideoGroup ");
        sbLIZ.append(i);
        sbLIZ.append(" groupId ");
        sbLIZ.append(str);
        sbLIZ.append(" before: ");
        sbLIZ.append(str2);
        sbLIZ.append(" after: ");
        sbLIZ.append(strLIZJ);
        C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
