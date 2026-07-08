package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class EnterRoomLimitDispatchDurationConfig_OptTypeAdapter extends TypeAdapter<EnterRoomLimitDispatchDurationConfig> {
    public final Gson LIZ;

    public EnterRoomLimitDispatchDurationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EnterRoomLimitDispatchDurationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDurationConfig = new EnterRoomLimitDispatchDurationConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1992012396) {
                    if (iHashCode != -1609594047) {
                        if (iHashCode == -650436073 && strLJJJJ.equals("till_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                enterRoomLimitDispatchDurationConfig.setTillTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enabled")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            enterRoomLimitDispatchDurationConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        enterRoomLimitDispatchDurationConfig.setDuration(c09cu.LJJJ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return enterRoomLimitDispatchDurationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDurationConfig) throws IOException {
        EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDurationConfig2 = enterRoomLimitDispatchDurationConfig;
        if (enterRoomLimitDispatchDurationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(enterRoomLimitDispatchDurationConfig2.getEnabled());
        c09dl.LJIILLIIL("duration");
        c09dl.LJJIZ(enterRoomLimitDispatchDurationConfig2.getDuration());
        c09dl.LJIILLIIL("till_time");
        c09dl.LJJIZ(enterRoomLimitDispatchDurationConfig2.getTillTime());
        c09dl.LJII();
    }
}
