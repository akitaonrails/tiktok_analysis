package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestTrackingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class CohostWithGuestTrackingSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestTrackingSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestTrackingSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestTrackingSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestTrackingSetting.Configs configs = new CohostWithGuestTrackingSetting.Configs(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -712579184) {
                    if (iHashCode != 345118558) {
                        if (iHashCode == 1682986554 && strLJJJJ.equals("feed_tracking_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isFeedTrackingEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("follow_user_role_enabled")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.isFollowUserRoleEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("get_guest_log_global_enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.isGetGuestLogGlobalEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestTrackingSetting.Configs configs) throws IOException {
        CohostWithGuestTrackingSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("get_guest_log_global_enabled");
        c09dl.LJJJJJL(configs2.isGetGuestLogGlobalEnabled);
        c09dl.LJIILLIIL("feed_tracking_enabled");
        c09dl.LJJJJJL(configs2.isFeedTrackingEnabled);
        c09dl.LJIILLIIL("follow_user_role_enabled");
        c09dl.LJJJJJL(configs2.isFollowUserRoleEnabled);
        c09dl.LJII();
    }
}
