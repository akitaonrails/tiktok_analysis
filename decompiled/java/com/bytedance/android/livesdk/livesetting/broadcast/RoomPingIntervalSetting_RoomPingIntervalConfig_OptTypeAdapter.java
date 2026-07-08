package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.RoomPingIntervalSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class RoomPingIntervalSetting_RoomPingIntervalConfig_OptTypeAdapter extends TypeAdapter<RoomPingIntervalSetting.RoomPingIntervalConfig> {
    @Override // com.google.gson.TypeAdapter
    public final RoomPingIntervalSetting.RoomPingIntervalConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RoomPingIntervalSetting.RoomPingIntervalConfig roomPingIntervalConfig = new RoomPingIntervalSetting.RoomPingIntervalConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -971800030) {
                    if (iHashCode != 98629247) {
                        if (iHashCode == 1151426374 && strLJJJJ.equals("decrease_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                roomPingIntervalConfig.decreaseInternal = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("group")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            roomPingIntervalConfig.group = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("increase_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        roomPingIntervalConfig.increaseInternal = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return roomPingIntervalConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RoomPingIntervalSetting.RoomPingIntervalConfig roomPingIntervalConfig) throws IOException {
        RoomPingIntervalSetting.RoomPingIntervalConfig roomPingIntervalConfig2 = roomPingIntervalConfig;
        if (roomPingIntervalConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJ(Integer.valueOf(roomPingIntervalConfig2.group));
        c09dl.LJIILLIIL("decrease_interval");
        c09dl.LJJIZ(roomPingIntervalConfig2.decreaseInternal);
        c09dl.LJIILLIIL("increase_interval");
        c09dl.LJJIZ(roomPingIntervalConfig2.increaseInternal);
        c09dl.LJII();
    }
}
