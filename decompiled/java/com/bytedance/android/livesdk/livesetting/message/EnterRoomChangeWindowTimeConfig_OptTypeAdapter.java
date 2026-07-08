package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class EnterRoomChangeWindowTimeConfig_OptTypeAdapter extends TypeAdapter<EnterRoomChangeWindowTimeConfig> {
    public final Gson LIZ;

    public EnterRoomChangeWindowTimeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EnterRoomChangeWindowTimeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTimeConfig = new EnterRoomChangeWindowTimeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != -650436073) {
                        if (iHashCode == 1914774972 && strLJJJJ.equals("window_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomChangeWindowTimeConfig.setWindowTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("till_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            enterRoomChangeWindowTimeConfig.setTillTime(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        enterRoomChangeWindowTimeConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return enterRoomChangeWindowTimeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTimeConfig) throws IOException {
        EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTimeConfig2 = enterRoomChangeWindowTimeConfig;
        if (enterRoomChangeWindowTimeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(enterRoomChangeWindowTimeConfig2.getEnabled());
        c09dl.LJIILLIIL("window_time");
        c09dl.LJJIZ(enterRoomChangeWindowTimeConfig2.getWindowTime());
        c09dl.LJIILLIIL("till_time");
        c09dl.LJJIZ(enterRoomChangeWindowTimeConfig2.getTillTime());
        c09dl.LJII();
    }
}
