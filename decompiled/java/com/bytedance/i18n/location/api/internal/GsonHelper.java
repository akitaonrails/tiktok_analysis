package com.bytedance.i18n.location.api.internal;

import X.C01GW;
import X.C09CU;
import X.C09DL;
import X.C1798620wuC;
import X.C452501pT;
import com.bytedance.i18n.location.api.Address;
import com.bytedance.i18n.location.api.AreaModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonHelper {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(342));

    /* JADX INFO: loaded from: classes19.dex */
    public static final class AddressTypeAdapter extends TypeAdapter<Address> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static AreaModel LIZ(C09CU c09cu) {
            long jLJJJ;
            String strLJJJZ;
            String strLJJJZ2;
            String strLJJJZ3 = "";
            String strLJJJZ4 = null;
            try {
                c09cu.LIZIZ();
                jLJJJ = 0;
                strLJJJZ = null;
                strLJJJZ2 = "";
                while (c09cu.LJIIZILJ()) {
                    try {
                        String strLJJJJ = c09cu.LJJJJ();
                        if (strLJJJJ != null) {
                            switch (strLJJJJ.hashCode()) {
                                case -1790367881:
                                    if (strLJJJJ.equals("GeoNameID")) {
                                        jLJJJ = c09cu.LJJJ();
                                    }
                                    break;
                                case -45093181:
                                    if (strLJJJJ.equals("ASCIName")) {
                                        strLJJJZ3 = c09cu.LJJJZ();
                                    }
                                    break;
                                case 2105869:
                                    if (strLJJJJ.equals("Code")) {
                                        strLJJJZ4 = c09cu.LJJJZ();
                                    }
                                    break;
                                case 2420395:
                                    if (strLJJJJ.equals("Name")) {
                                        strLJJJZ2 = c09cu.LJJJZ();
                                    }
                                    break;
                                case 2003063206:
                                    if (strLJJJJ.equals("LocalID")) {
                                        strLJJJZ = c09cu.LJJJZ();
                                    }
                                    break;
                            }
                        }
                        c09cu.LJJZ();
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                        C1798620wuC.LIZJ("GsonHelper", "readAreaModel: failed to read area model", e);
                    }
                }
                c09cu.LJII();
            } catch (IOException e2) {
                e = e2;
                jLJJJ = 0;
                strLJJJZ = null;
                strLJJJZ2 = "";
            }
            return new AreaModel(strLJJJZ4, Long.valueOf(jLJJJ), strLJJJZ3, strLJJJZ2, strLJJJZ);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.google.gson.TypeAdapter
        public final Address read(C09CU c09cu) {
            AreaModel areaModelLIZ;
            AreaModel areaModelLIZ2;
            AreaModel areaModelLIZ3;
            AreaModel areaModelLIZ4;
            if (c09cu == null) {
                return new Address(null, null, null, null, null, null, null, null, null);
            }
            AreaModel areaModelLIZ5 = null;
            try {
                c09cu.LIZIZ();
                areaModelLIZ = null;
                areaModelLIZ2 = null;
                areaModelLIZ3 = null;
                areaModelLIZ4 = null;
                while (c09cu.LJIIZILJ()) {
                    try {
                        String strLJJJJ = c09cu.LJJJJ();
                        if (strLJJJJ != null) {
                            switch (strLJJJJ.hashCode()) {
                                case -1672482954:
                                    if (strLJJJJ.equals("Country")) {
                                        areaModelLIZ = LIZ(c09cu);
                                    }
                                    break;
                                case 2100619:
                                    if (strLJJJJ.equals("City")) {
                                        areaModelLIZ3 = LIZ(c09cu);
                                    }
                                    break;
                                case 353605550:
                                    if (strLJJJJ.equals("District")) {
                                        areaModelLIZ4 = LIZ(c09cu);
                                    }
                                    break;
                                case 1600540052:
                                    if (strLJJJJ.equals("Continent")) {
                                        areaModelLIZ5 = LIZ(c09cu);
                                    }
                                    break;
                                case 2025269340:
                                    if (strLJJJJ.equals("AdminArea")) {
                                        areaModelLIZ2 = LIZ(c09cu);
                                    }
                                    break;
                            }
                        }
                        c09cu.LJJZ();
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                        C1798620wuC.LIZJ("GsonHelper", "read: failed to read address", e);
                    }
                }
                c09cu.LJII();
            } catch (IOException e2) {
                e = e2;
                areaModelLIZ = null;
                areaModelLIZ2 = null;
                areaModelLIZ3 = null;
                areaModelLIZ4 = null;
            }
            return new Address(areaModelLIZ5, areaModelLIZ, areaModelLIZ2, null, areaModelLIZ3, areaModelLIZ4, null, null, null);
        }

        public static void LIZIZ(C09DL c09dl, AreaModel areaModel) {
            if (areaModel != null) {
                try {
                    c09dl.LJIILLIIL("Code");
                    c09dl.LJJJJJ(areaModel.code);
                    c09dl.LJIILLIIL("GeoNameID");
                    c09dl.LJJJJ(areaModel.geoNameId);
                    c09dl.LJIILLIIL("ASCIName");
                    c09dl.LJJJJJ(areaModel.asciiName);
                    c09dl.LJIILLIIL("Name");
                    c09dl.LJJJJJ(areaModel.name);
                    c09dl.LJIILLIIL("LocalID");
                    c09dl.LJJJJJ(areaModel.localId);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                    C1798620wuC.LIZJ("GsonHelper", "writeAreaModel: failed to write area model", e);
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Address address) {
            Address address2 = address;
            if (c09dl != null) {
                try {
                    c09dl.LIZLLL();
                    if (address2 != null) {
                        LIZIZ(c09dl, address2.continent);
                        LIZIZ(c09dl, address2.country);
                        LIZIZ(c09dl, address2.adminArea);
                        LIZIZ(c09dl, address2.city);
                        LIZIZ(c09dl, address2.district);
                    }
                    c09dl.LJII();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                    C1798620wuC.LIZJ("GsonHelper", "write: failed to write address", e);
                }
            }
        }
    }
}
