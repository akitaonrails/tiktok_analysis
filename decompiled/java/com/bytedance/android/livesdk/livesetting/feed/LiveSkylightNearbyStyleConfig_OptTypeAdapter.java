package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSkylightNearbyStyleConfig_OptTypeAdapter extends TypeAdapter<LiveSkylightNearbyStyleConfig> {
    public final Gson LIZ;

    public LiveSkylightNearbyStyleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSkylightNearbyStyleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSkylightNearbyStyleConfig liveSkylightNearbyStyleConfig = new LiveSkylightNearbyStyleConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -653720905) {
                    if (iHashCode != -450186987) {
                        if (iHashCode == 109780401 && strLJJJJ.equals("style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSkylightNearbyStyleConfig.setStyle(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("use_ip_location")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveSkylightNearbyStyleConfig.setUseIpLocation(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("show_location")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSkylightNearbyStyleConfig.setShowLocation(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveSkylightNearbyStyleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSkylightNearbyStyleConfig liveSkylightNearbyStyleConfig) throws IOException {
        LiveSkylightNearbyStyleConfig liveSkylightNearbyStyleConfig2 = liveSkylightNearbyStyleConfig;
        if (liveSkylightNearbyStyleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("style");
        c09dl.LJJJJ(Integer.valueOf(liveSkylightNearbyStyleConfig2.getStyle()));
        c09dl.LJIILLIIL("show_location");
        c09dl.LJJJJJL(liveSkylightNearbyStyleConfig2.getShowLocation());
        c09dl.LJIILLIIL("use_ip_location");
        c09dl.LJJJJJL(liveSkylightNearbyStyleConfig2.getUseIpLocation());
        c09dl.LJII();
    }
}
