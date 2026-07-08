package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchArchitectureLiveTypeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMiddleTouchArchitectureLiveTypeSetting_MiddleTouchEnableSwitch_OptTypeAdapter extends TypeAdapter<LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch> {
    public final Gson LIZ;

    public LiveMiddleTouchArchitectureLiveTypeSetting_MiddleTouchEnableSwitch_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch middleTouchEnableSwitch = new LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1425356425) {
                    if (iHashCode != -402186809) {
                        if (iHashCode == -388570512 && strLJJJJ.equals("game_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                middleTouchEnableSwitch.gameEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("video_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            middleTouchEnableSwitch.videoEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("ecomerce_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        middleTouchEnableSwitch.ecEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return middleTouchEnableSwitch;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch middleTouchEnableSwitch) throws IOException {
        LiveMiddleTouchArchitectureLiveTypeSetting.MiddleTouchEnableSwitch middleTouchEnableSwitch2 = middleTouchEnableSwitch;
        if (middleTouchEnableSwitch2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("video_enable");
        c09dl.LJJJJJL(middleTouchEnableSwitch2.videoEnable);
        c09dl.LJIILLIIL("game_enable");
        c09dl.LJJJJJL(middleTouchEnableSwitch2.gameEnable);
        c09dl.LJIILLIIL("ecomerce_enable");
        c09dl.LJJJJJL(middleTouchEnableSwitch2.ecEnable);
        c09dl.LJII();
    }
}
