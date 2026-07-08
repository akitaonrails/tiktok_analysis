package tikcast.api.privilege;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegePrompt_ProtoDecoder implements C0IMD<PrivilegePrompt> {
    public static PrivilegePrompt LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PrivilegePrompt privilegePrompt = new PrivilegePrompt();
        privilegePrompt.placeholderMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        PrivilegePlaceholder privilegePlaceholderLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    privilegePlaceholderLIZLLL = _PrivilegePlaceholder_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (privilegePlaceholderLIZLLL != null) {
                                privilegePrompt.placeholderMap.put(strLIZLLL, privilegePlaceholderLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    privilegePrompt.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return privilegePrompt;
            }
        }
    }

    public static void LJ(PrivilegePrompt privilegePrompt) {
        Map<String, PrivilegePlaceholder> map = privilegePrompt.placeholderMap;
        if (map == null) {
            privilegePrompt.placeholderMap = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, PrivilegePlaceholder>> it2 = privilegePrompt.placeholderMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PrivilegePrompt privilegePrompt) {
        LJ(privilegePrompt);
    }

    @Override // X.C0IMD
    public final PrivilegePrompt LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegePrompt privilegePrompt, List list) {
    }
}
