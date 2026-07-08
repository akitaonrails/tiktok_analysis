package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AIScriptTipSwitch_ProtoDecoder implements C0IMD<AIScriptTipSwitch> {
    public static AIScriptTipSwitch LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AIScriptTipSwitch aIScriptTipSwitch = new AIScriptTipSwitch();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            aIScriptTipSwitch.subType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        aIScriptTipSwitch.valueV2 = c1516680pZS.LJIIJ();
                    }
                } else {
                    aIScriptTipSwitch.value = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aIScriptTipSwitch;
            }
        }
    }

    @Override // X.C0IMD
    public final AIScriptTipSwitch LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AIScriptTipSwitch aIScriptTipSwitch) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AIScriptTipSwitch aIScriptTipSwitch, List list) {
    }
}
