package com.ss.android.ugc.playerkit.radar;

import X.AbstractC1478150oZJ;
import X.C1472910oQr;
import X.C1473020oR2;
import X.C1475000oUE;
import X.C2188811AlT;
import X.C603840NmI;
import X.InterfaceC1472180oPg;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class SimRadar {
    public static final Map<String, Object> groups = new C603840NmI(10);
    public static final InterfaceC1472180oPg defaultGroup = new InterfaceC1472180oPg() { // from class: X.0oQs
        @Override // X.InterfaceC1472180oPg
        public final /* synthetic */ void LIZIZ(String str) {
        }

        @Override // X.InterfaceC1472180oPg
        public final InterfaceC1478220oZQ LIZ(String str) {
            return new InterfaceC1478220oZQ() { // from class: X.0oQu
                @Override // X.InterfaceC1478220oZQ
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.InterfaceC1478220oZQ
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.InterfaceC1478220oZQ
                public final /* synthetic */ void LIZJ() {
                }

                @Override // X.InterfaceC1478220oZQ
                public final /* synthetic */ void end() {
                }
            };
        }
    };

    public static C1472910oQr analyzer() {
        return C1472910oQr.LIZ;
    }

    public static synchronized InterfaceC1472180oPg traceGroup(String str) {
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ != null) {
            iRadarTransmitterLJIIIZ.tracer();
        }
        return defaultGroup;
    }

    public static void keyScan(String str, String str2, Object... objArr) {
        IRadarTransmitter iRadarTransmitterLJIIIZ;
        IRadarTransmitter iRadarTransmitterLJIIIZ2;
        if (C1473020oR2.LIZJ()) {
            String strLIZLLL = C1473020oR2.LIZLLL(str2, str, objArr);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SIM-RADAR-");
            sbLIZ.append("K");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!C1473020oR2.LIZIZ() && (iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ()) != null && iRadarTransmitterLJIIIZ.remoteTransmitEnabled() && (iRadarTransmitterLJIIIZ2 = C1475000oUE.LJIIIZ()) != null) {
                iRadarTransmitterLJIIIZ2.transmitI(strLIZIZ, strLIZLLL);
            }
        }
    }

    public static void warnScan(String str, String str2, Object... objArr) {
        IRadarTransmitter iRadarTransmitterLJIIIZ;
        IRadarTransmitter iRadarTransmitterLJIIIZ2;
        if (C1473020oR2.LIZJ()) {
            String strLIZLLL = C1473020oR2.LIZLLL(str2, str, objArr);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SIM-RADAR-");
            sbLIZ.append("KE");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!C1473020oR2.LIZIZ() && (iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ()) != null && iRadarTransmitterLJIIIZ.remoteTransmitEnabled() && (iRadarTransmitterLJIIIZ2 = C1475000oUE.LJIIIZ()) != null) {
                iRadarTransmitterLJIIIZ2.transmitW(strLIZIZ, strLIZLLL);
            }
            InterfaceC1472180oPg interfaceC1472180oPgTraceGroup = traceGroup("SimError");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(":");
            sbLIZ2.append(str2);
            interfaceC1472180oPgTraceGroup.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void errorScan(String str, String str2, AbstractC1478150oZJ abstractC1478150oZJ, Object... objArr) {
        IRadarTransmitter iRadarTransmitterLJIIIZ;
        IRadarTransmitter iRadarTransmitterLJIIIZ2;
        if (C1473020oR2.LIZJ()) {
            String strLIZLLL = C1473020oR2.LIZLLL(str2, str, objArr);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SIM-RADAR-");
            sbLIZ.append("KE");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!C1473020oR2.LIZIZ() && (iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ()) != null && iRadarTransmitterLJIIIZ.remoteTransmitEnabled() && (iRadarTransmitterLJIIIZ2 = C1475000oUE.LJIIIZ()) != null) {
                iRadarTransmitterLJIIIZ2.transmitE(strLIZIZ, strLIZLLL, abstractC1478150oZJ);
            }
            InterfaceC1472180oPg interfaceC1472180oPgTraceGroup = traceGroup("SimError");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(":");
            sbLIZ2.append(str2);
            interfaceC1472180oPgTraceGroup.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
