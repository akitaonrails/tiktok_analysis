package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftConfig_OptTypeAdapter extends TypeAdapter<GiftConfig> {
    public final Gson LIZ;

    public GiftConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftConfig giftConfig = new GiftConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2103107547:
                        if (strLJJJJ.equals("receive_msg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._receiveMsgConfig = (ReceiveMsgConfig) this.LIZ.LJIIJ(ReceiveMsgConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1129822395:
                        if (strLJJJJ.equals("tray_combo")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._trayComboConfig = (TrayComboConfig) this.LIZ.LJIIJ(TrayComboConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -143668406:
                        if (strLJJJJ.equals("msg_enqueue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._msgEnqueueConfig = (MsgEnqueueConfig) this.LIZ.LJIIJ(MsgEnqueueConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -103715218:
                        if (strLJJJJ.equals("tray_stay_after_combo")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._trayStayAfterComboConfig = (TrayStayAfterComboConfig) this.LIZ.LJIIJ(TrayStayAfterComboConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349497446:
                        if (strLJJJJ.equals("tray_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._trayShowConfig = (TrayShowConfig) this.LIZ.LJIIJ(TrayShowConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1588999809:
                        if (strLJJJJ.equals("tray_dismiss")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftConfig._trayDismissConfig = (TrayDismissConfig) this.LIZ.LJIIJ(TrayDismissConfig.class).read(c09cu);
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
        return giftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftConfig giftConfig) {
        GiftConfig giftConfig2 = giftConfig;
        if (giftConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("receive_msg");
        this.LIZ.LJIIJ(ReceiveMsgConfig.class).write(c09dl, giftConfig2._receiveMsgConfig);
        c09dl.LJIILLIIL("msg_enqueue");
        this.LIZ.LJIIJ(MsgEnqueueConfig.class).write(c09dl, giftConfig2._msgEnqueueConfig);
        c09dl.LJIILLIIL("tray_show");
        this.LIZ.LJIIJ(TrayShowConfig.class).write(c09dl, giftConfig2._trayShowConfig);
        c09dl.LJIILLIIL("tray_combo");
        this.LIZ.LJIIJ(TrayComboConfig.class).write(c09dl, giftConfig2._trayComboConfig);
        c09dl.LJIILLIIL("tray_stay_after_combo");
        this.LIZ.LJIIJ(TrayStayAfterComboConfig.class).write(c09dl, giftConfig2._trayStayAfterComboConfig);
        c09dl.LJIILLIIL("tray_dismiss");
        this.LIZ.LJIIJ(TrayDismissConfig.class).write(c09dl, giftConfig2._trayDismissConfig);
        c09dl.LJII();
    }
}
