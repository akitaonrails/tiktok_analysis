package zmj;

import X.AbstractC2252991DGf;
import X.C01TT;
import X.C13LP;
import X.C1655520tBO;
import X.C1660750tJp;
import X.C1697810uHb;
import X.C1778370wNX;
import X.C1954807lC;
import X.C1997307s3;
import X.C1997407s4;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C2253021DGi;
import X.C2253031DGj;
import X.C2253061DGm;
import X.C2253181DGy;
import X.EnumC1778340wNU;
import X.EnumC1997107s1;
import X.EnumC1997207s2;
import X.InterfaceC1463990oCT;
import X.InterfaceC1659000tH0;
import X.InterfaceC1660900tK4;
import X.InterfaceC1997507s5;
import X.InterfaceC2253001DGg;
import X.InterfaceC2253051DGl;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class j implements InterfaceC1660900tK4 {
    public final C2253061DGm LIZ;
    public final C2253181DGy LIZIZ;
    public final InterfaceC1997507s5 LIZJ;
    public final Map<String, C1997407s4> LIZLLL = new LinkedHashMap();
    public final Map<String, C1997407s4> LJ = new LinkedHashMap();
    public InterfaceC1659000tH0 LJFF;

    public final void LIZIZ(C2253021DGi c2253021DGi) {
        EnumC1997107s1 enumC1997107s1;
        EnumC1997207s2 enumC1997207s2;
        String actionName;
        C1997407s4 c1997407s4;
        String string = c2253021DGi.toString();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: handle SensitiveApiEvent: ");
        sbLIZ.append(string);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (!((LinkedHashMap) this.LJ).keySet().contains(c2253021DGi.LIZ)) {
            return;
        }
        boolean zLIZ = false;
        if (Intrinsics.LJFF(c2253021DGi.LIZ, "type_scene_cover")) {
            InterfaceC2253051DGl interfaceC2253051DGl = c2253021DGi.LIZJ.LIZ;
            if (interfaceC2253051DGl != null) {
                actionName = interfaceC2253051DGl.getActionName();
            } else {
                actionName = null;
            }
            if (Intrinsics.LJFF(actionName, "action_name_start_preview") && (c1997407s4 = (C1997407s4) ((LinkedHashMap) this.LJ).get("type_activity_lifecycle")) != null && c1997407s4.LIZ != EnumC1997107s1.ALLOW_OPEN_CAMERA) {
                this.LIZ.LIZ.YM2(true);
            }
        }
        String str = c2253021DGi.LIZ;
        C1660750tJp c1660750tJp = c2253021DGi.LIZIZ;
        C1997407s4 c1997407s42 = (C1997407s4) ((LinkedHashMap) this.LJ).get(str);
        if (c1997407s42 != null) {
            int i = c1660750tJp.LIZ;
            if (i != 1) {
                if (i != 2) {
                    EnumC1997107s1 enumC1997107s12 = c1997407s42.LIZ;
                    enumC1997107s1 = EnumC1997107s1.ALLOW_OPEN_CAMERA;
                    if (enumC1997107s12 != enumC1997107s1) {
                        enumC1997107s1 = EnumC1997107s1.DISALLOW_OPEN_CAMERA;
                    }
                } else {
                    enumC1997107s1 = EnumC1997107s1.DISALLOW_OPEN_CAMERA;
                }
            } else {
                enumC1997107s1 = EnumC1997107s1.ALLOW_OPEN_CAMERA;
            }
            int i2 = c1660750tJp.LIZIZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    EnumC1997207s2 enumC1997207s22 = c1997407s42.LIZIZ;
                    enumC1997207s2 = EnumC1997207s2.ALLOW_OPEN_MIC;
                    if (enumC1997207s22 != enumC1997207s2) {
                        enumC1997207s2 = EnumC1997207s2.DISALLOW_OPEN_MIC;
                    }
                } else {
                    enumC1997207s2 = EnumC1997207s2.DISALLOW_OPEN_MIC;
                }
            } else {
                enumC1997207s2 = EnumC1997207s2.ALLOW_OPEN_MIC;
            }
            this.LJ.put(str, new C1997407s4(enumC1997107s1, enumC1997207s2));
        }
        C2253031DGj c2253031DGj = c2253021DGi.LIZJ;
        InterfaceC2253051DGl interfaceC2253051DGl2 = c2253031DGj.LIZ;
        if (interfaceC2253051DGl2 != null) {
            zLIZ = this.LIZJ.LIZ(interfaceC2253051DGl2.LIZIZ(), this.LJ);
        }
        if (!zLIZ) {
            String strLIZIZ = "---------SensitiveApiAction not allowed---------\n";
            for (Map.Entry entry : ((LinkedHashMap) this.LJ).entrySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append((String) entry.getKey());
                sbLIZ2.append(": ");
                sbLIZ2.append(entry.getValue());
                sbLIZ2.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SensitiveApiManagement: reject SensitiveApiEvent: current context is ");
            sbLIZ3.append(strLIZIZ);
            interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        String strLIZIZ2 = "+++++++++SensitiveApiAction allowed+++++++++\n";
        for (Map.Entry entry2 : ((LinkedHashMap) this.LJ).entrySet()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            sbLIZ4.append((String) entry2.getKey());
            sbLIZ4.append(": ");
            sbLIZ4.append(entry2.getValue());
            sbLIZ4.append('\n');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("SensitiveApiManagement: approve SensitiveApiEvent: current context is ");
        sbLIZ5.append(strLIZIZ2);
        interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ5));
        this.LIZ.getClass();
        C01TT.LIZLLL(new AwS579S0100000_35(c2253031DGj, 431));
    }

    public final void LIZ(C1997407s4 c1997407s4, AbstractC2252991DGf abstractC2252991DGf) {
        this.LIZLLL.put(abstractC2252991DGf.getType(), c1997407s4);
        this.LJ.put(abstractC2252991DGf.getType(), c1997407s4);
        ((ArrayList) abstractC2252991DGf.LIZ).add(new InterfaceC2253001DGg() { // from class: X.1DGn
            @Override // X.InterfaceC2253001DGg
            public final void LIZ(C2253021DGi c2253021DGi) {
                try {
                    this.LIZ.LIZIZ(c2253021DGi);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    AbstractC2253041DGk abstractC2253041DGkLIZ = this.LIZ.LIZIZ.LIZ(new C2253101DGq(false), "action_name_stop_preview");
                    C2253061DGm c2253061DGm = this.LIZ.LIZ;
                    C2253031DGj c2253031DGj = new C2253031DGj(abstractC2253041DGkLIZ, C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_ADD_STREAM, EnumC1641610sox.PAGE_INVISIBLE));
                    c2253061DGm.getClass();
                    C01TT.LIZLLL(new AwS579S0100000_35(c2253031DGj, 431));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stream onError: ");
                    sbLIZ.append(e.getStackTrace());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SensitiveApiManagement: onError: ");
                    sbLIZ2.append(strLIZIZ);
                    interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        });
    }

    public final void LIZJ(EnumC1778340wNU enumC1778340wNU, Cert cert) {
        List listSingletonList;
        InterfaceC1659000tH0 interfaceC1659000tH0;
        String strLIZIZ;
        int i = C1778370wNX.LIZ[enumC1778340wNU.ordinal()];
        if (i != 1) {
            if (i == 2) {
                listSingletonList = Collections.singletonList(2);
            } else {
                throw new C1954807lC();
            }
        } else {
            listSingletonList = Collections.singletonList(0);
        }
        if (!this.LIZJ.LIZ(listSingletonList, this.LJ) && !C13LP.LJJJJ(cert, C1697810uHb.LJIIJJI(C1655520tBO.LIZ, C1655520tBO.LIZIZ)) && (interfaceC1659000tH0 = this.LJFF) != null) {
            String strLIZIZ2 = "";
            if (!listSingletonList.contains(0)) {
                strLIZIZ = "";
            } else {
                Map<String, C1997407s4> map = this.LJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (((C1997407s4) entry.getValue()).LIZ != EnumC1997107s1.ALLOW_OPEN_CAMERA) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("camera: ");
                sbLIZ.append(C13LP.LJJLIIIJ(setKeySet, ",", null, null, 0, null, null, 62));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (listSingletonList.contains(2)) {
                Map<String, C1997407s4> map2 = this.LJ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                    if (((C1997407s4) entry2.getValue()).LIZIZ != EnumC1997207s2.ALLOW_OPEN_MIC) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Set setKeySet2 = linkedHashMap2.keySet();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mic: ");
                sbLIZ2.append(C13LP.LJJLIIIJ(setKeySet2, ",", null, null, 0, null, null, 62));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" | ");
            sbLIZ3.append(strLIZIZ2);
            interfaceC1659000tH0.LIZ(cert, C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public j(C2253061DGm c2253061DGm, C2253181DGy c2253181DGy, C1997307s3 c1997307s3) {
        this.LIZ = c2253061DGm;
        this.LIZIZ = c2253181DGy;
        this.LIZJ = c1997307s3;
    }
}
