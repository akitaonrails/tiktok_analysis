package com.tiktok.myna.render.render.elements;

import X.C01GW;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1893407bI;
import X.C21329618da;
import X.C2188811AlT;
import X.C2332809Cc;
import X.C452501pT;
import X.InterfaceC1547330qMt;
import X.InterfaceC1631620sYq;
import X.InterfaceC21330018de;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.b;
import com.google.gson.internal.w;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.v;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaElementTypeAdapter extends TypeAdapter<InterfaceC21330018de> {
    public final Gson LIZ;
    public final v LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 434));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 435));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 437));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 432));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 433));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 436));

    public static boolean LIZIZ(List list) {
        Map<String, InterfaceC1547330qMt> action;
        C21329618da c21329618da;
        C21329618da c21329618da2;
        Map<String, String> map;
        Map<String, String> map2;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MynaElement mynaElement = (MynaElement) it2.next();
            Map<String, InterfaceC1547330qMt> action2 = mynaElement.getAction();
            if ((action2 != null && action2.get("bind_tap") != null) || (((action = mynaElement.getAction()) != null && action.get("bind_long_press") != null) || (((c21329618da = mynaElement.bindInfo) != null && (map2 = c21329618da.LJFF) != null && map2.get("bind_tap") != null) || ((c21329618da2 = mynaElement.bindInfo) != null && (map = c21329618da2.LJFF) != null && map.get("bind_long_press") != null)))) {
                return true;
            }
            List<MynaElement> elements = mynaElement.getElements();
            if (elements != null && LIZIZ(elements)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MynaElement mynaElement = (MynaElement) it2.next();
            if (!Intrinsics.LJFF(mynaElement.getType(), "inline-text") && !Intrinsics.LJFF(mynaElement.getType(), "inline-block") && !Intrinsics.LJFF(mynaElement.getType(), "inline-image")) {
                return true;
            }
            List<MynaElement> elements = mynaElement.getElements();
            if (elements != null && LIZJ(elements)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0082 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r54v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r55v0, types: [java.util.Map] */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tiktok.myna.render.render.MynaElement read(X.C09CU r61) {
        /*
            Method dump skipped, instruction units count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.myna.render.render.elements.MynaElementTypeAdapter.read(X.09CU):com.tiktok.myna.render.render.MynaElement");
    }

    public MynaElementTypeAdapter(Gson gson, v vVar) {
        this.LIZ = gson;
        this.LIZIZ = vVar;
    }

    public static n LIZ(n nVar, String str) {
        n nVar2;
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (!(kVarLJJIIZ instanceof n) || (nVar2 = (n) kVarLJJIIZ) == null) {
            n nVar3 = new n();
            nVar.LJJIFFI(str, nVar3);
            return nVar3;
        }
        return nVar2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InterfaceC21330018de interfaceC21330018de) {
        MynaElement mynaElement;
        n nVar;
        boolean z;
        InterfaceC21330018de interfaceC21330018de2 = interfaceC21330018de;
        if ((interfaceC21330018de2 instanceof MynaElement) && (mynaElement = (MynaElement) interfaceC21330018de2) != null) {
            b bVar = new b();
            ((TypeAdapter) this.LIZJ.getValue()).write(bVar, mynaElement);
            k kVarLJJJZ = bVar.LJJJZ();
            if ((kVarLJJJZ instanceof n) && (nVar = (n) kVarLJJJZ) != null) {
                C21329618da c21329618da = mynaElement.bindInfo;
                if (c21329618da != null) {
                    Map<String, String> map = c21329618da.LIZ;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(':');
                            sbLIZ.append(entry.getKey());
                            nVar.LJJIIJ(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
                        }
                    }
                    String str = c21329618da.LJII;
                    if (str != null && str.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        LIZ(nVar, "style").LJJIIJ(":display", c21329618da.LJII);
                    }
                    String str2 = c21329618da.LJIIIIZZ;
                    if (str2 != null && str2.length() != 0) {
                        LIZ(nVar, "style").LJJIIJ("display", c21329618da.LJIIIIZZ);
                    }
                    LJFF(nVar, "attr", c21329618da.LIZIZ);
                    LJFF(nVar, "style", c21329618da.LIZJ);
                    LJFF(nVar, "active_style", c21329618da.LIZLLL);
                    LJFF(nVar, "actions", c21329618da.LJFF);
                    LJFF(nVar, "storage", c21329618da.LJI);
                    MynaBindForConfig mynaBindForConfig = c21329618da.LJ;
                    if (mynaBindForConfig != null) {
                        n nVar2 = new n();
                        if (mynaBindForConfig.target.length() > 0) {
                            nVar2.LJJIIJ("items", mynaBindForConfig.target);
                        }
                        if (mynaBindForConfig.itemKey.length() > 0 && !Intrinsics.LJFF(mynaBindForConfig.itemKey, "item")) {
                            nVar2.LJJIIJ("item", mynaBindForConfig.itemKey);
                        }
                        if (mynaBindForConfig.indexKey.length() > 0 && !Intrinsics.LJFF(mynaBindForConfig.indexKey, "index")) {
                            nVar2.LJJIIJ("index", mynaBindForConfig.indexKey);
                        }
                        if (mynaBindForConfig.start.length() > 0) {
                            nVar2.LJJIIJ("start", mynaBindForConfig.start);
                        }
                        if (mynaBindForConfig.end.length() > 0) {
                            nVar2.LJJIIJ("end", mynaBindForConfig.end);
                        }
                        nVar.LJJIFFI("for", nVar2);
                    }
                    String str3 = c21329618da.LJIIIZ;
                    if (str3 != null) {
                        nVar.LJJIIJ("if", str3);
                    }
                    String str4 = c21329618da.LJIIJ;
                    if (str4 != null) {
                        nVar.LJJIIJ("elif", str4);
                    }
                    String str5 = c21329618da.LJIIJJI;
                    if (str5 != null) {
                        nVar.LJJIIJ("else", str5);
                    }
                }
                w.LIZIZ(nVar, c09dl);
                return;
            }
            c09dl.LJIJJ();
            return;
        }
        c09dl.LJIJJ();
    }

    public static void LJFF(n nVar, String str, Map map) {
        if (map != null && (!map.isEmpty())) {
            n nVarLIZ = LIZ(nVar, str);
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(':');
                sbLIZ.append((String) entry.getKey());
                nVarLIZ.LJJIIJ(C2188811AlT.LIZIZ(sbLIZ), (String) entry.getValue());
            }
        }
    }

    public final Map<String, Object> LJ(C09CU c09cu, HashMap<String, String> map, InterfaceC1631620sYq<? super String, ? super Boolean, ? super String, Unit> interfaceC1631620sYq) {
        int i;
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ == null) {
            i = -1;
        } else {
            i = C2332809Cc.LIZ[c09d6LJJLIIIJ.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                c09cu.LJJZ();
                return null;
            }
            c09cu.LJJJJJL();
            return null;
        }
        TypeAdapter typeAdapter = (TypeAdapter) this.LJ.getValue();
        HashMap map2 = new HashMap();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (C1893407bI.LIZ(strLJJJJ)) {
                String strSubstring = strLJJJJ.substring(1);
                if (c09cu.LJJLIIIJ() == C09D6.STRING) {
                    String strLJJJZ = c09cu.LJJJZ();
                    if (strLJJJZ.length() > 0) {
                        map.put(strSubstring, strLJJJZ);
                        if (interfaceC1631620sYq != null) {
                            interfaceC1631620sYq.invoke(strSubstring, Boolean.TRUE, strLJJJZ);
                        }
                    }
                } else {
                    c09cu.LJJZ();
                }
            } else {
                map2.put(strLJJJJ, typeAdapter.read(c09cu));
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(strLJJJJ, Boolean.FALSE, null);
                }
            }
        }
        c09cu.LJII();
        return map2;
    }
}
