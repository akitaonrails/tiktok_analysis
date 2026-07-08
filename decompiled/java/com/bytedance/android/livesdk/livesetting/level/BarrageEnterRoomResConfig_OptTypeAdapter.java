package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BarrageEnterRoomResConfig_OptTypeAdapter extends TypeAdapter<BarrageEnterRoomResConfig> {
    @Override // com.google.gson.TypeAdapter
    public final BarrageEnterRoomResConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BarrageEnterRoomResConfig barrageEnterRoomResConfig = new BarrageEnterRoomResConfig(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1321694675) {
                    if (iHashCode != -852641555) {
                        if (iHashCode == 98615255 && strLJJJJ.equals("grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageEnterRoomResConfig.level = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("barrage_background")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            barrageEnterRoomResConfig.background = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("gecko_channel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        barrageEnterRoomResConfig.barrageChannel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return barrageEnterRoomResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BarrageEnterRoomResConfig barrageEnterRoomResConfig) {
        BarrageEnterRoomResConfig barrageEnterRoomResConfig2 = barrageEnterRoomResConfig;
        if (barrageEnterRoomResConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("grade");
        c09dl.LJJJJ(Integer.valueOf(barrageEnterRoomResConfig2.level));
        c09dl.LJIILLIIL("barrage_background");
        c09dl.LJJJJJ(barrageEnterRoomResConfig2.background);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(barrageEnterRoomResConfig2.barrageChannel);
        c09dl.LJII();
    }
}
