package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TrayStayAfterComboConfig_OptTypeAdapter extends TypeAdapter<TrayStayAfterComboConfig> {
    public final Gson LIZ;

    public TrayStayAfterComboConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TrayStayAfterComboConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TrayStayAfterComboConfig trayStayAfterComboConfig = new TrayStayAfterComboConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1947315872:
                        if (strLJJJJ.equals("stay_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                trayStayAfterComboConfig._stayType = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1435239934:
                        if (strLJJJJ.equals("first_send_extends_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                trayStayAfterComboConfig._firstSendExtendsDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 866892414:
                        if (strLJJJJ.equals("fix_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                trayStayAfterComboConfig._fixDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1646458260:
                        if (strLJJJJ.equals("dynamic_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                trayStayAfterComboConfig._dynamicDuration = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return trayStayAfterComboConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TrayStayAfterComboConfig trayStayAfterComboConfig) {
        TrayStayAfterComboConfig trayStayAfterComboConfig2 = trayStayAfterComboConfig;
        if (trayStayAfterComboConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("stay_type");
        c09dl.LJJJJJ(trayStayAfterComboConfig2._stayType);
        c09dl.LJIILLIIL("fix_duration");
        c09dl.LJJJJ(Integer.valueOf(trayStayAfterComboConfig2._fixDuration));
        c09dl.LJIILLIIL("dynamic_duration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, trayStayAfterComboConfig2._dynamicDuration, Integer.TYPE);
        c09dl.LJIILLIIL("first_send_extends_duration");
        c09dl.LJJJJ(Integer.valueOf(trayStayAfterComboConfig2._firstSendExtendsDuration));
        c09dl.LJII();
    }
}
