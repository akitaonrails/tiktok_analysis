package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class RivalSectionExtraConfig_OptTypeAdapter extends TypeAdapter<RivalSectionExtraConfig> {
    public final Gson LIZ;

    public RivalSectionExtraConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RivalSectionExtraConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RivalSectionExtraConfig rivalSectionExtraConfig = new RivalSectionExtraConfig(0, 0L, false, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1991482060:
                        if (strLJJJJ.equals("enable_cohost_friend_online_append")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionExtraConfig.enableFriendOnlineAppend = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1432212254:
                        if (strLJJJJ.equals("refresh_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionExtraConfig.refreshTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1816824233:
                        if (strLJJJJ.equals("refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionExtraConfig.refreshInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1993491938:
                        if (strLJJJJ.equals("invalid_percentage")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rivalSectionExtraConfig.invalidPercentage = c09cu.LJJIZ();
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
        return rivalSectionExtraConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RivalSectionExtraConfig rivalSectionExtraConfig) throws IOException {
        RivalSectionExtraConfig rivalSectionExtraConfig2 = rivalSectionExtraConfig;
        if (rivalSectionExtraConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("refresh_times");
        c09dl.LJJJJ(Integer.valueOf(rivalSectionExtraConfig2.refreshTimes));
        c09dl.LJIILLIIL("refresh_interval");
        c09dl.LJJIZ(rivalSectionExtraConfig2.refreshInterval);
        c09dl.LJIILLIIL("enable_cohost_friend_online_append");
        c09dl.LJJJJJL(rivalSectionExtraConfig2.enableFriendOnlineAppend);
        c09dl.LJIILLIIL("invalid_percentage");
        c09dl.LJJJJ(Integer.valueOf(rivalSectionExtraConfig2.invalidPercentage));
        c09dl.LJII();
    }
}
