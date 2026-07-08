package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class NearByEntranceConfig_OptTypeAdapter extends TypeAdapter<NearByEntranceConfig> {
    public final Gson LIZ;

    public NearByEntranceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NearByEntranceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NearByEntranceConfig nearByEntranceConfig = new NearByEntranceConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1711208594:
                        if (strLJJJJ.equals("data_update_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.dataUpdateTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.entranceEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -481649791:
                        if (strLJJJJ.equals("nearby_reject_location_max_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.rejectMaxTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 766946664:
                        if (strLJJJJ.equals("enable_banner")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.enableBanner = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1113807035:
                        if (strLJJJJ.equals("enable_nearby")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.enableNearby = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1954931361:
                        if (strLJJJJ.equals("enable_request_location")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                nearByEntranceConfig.enableRequestLocation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return nearByEntranceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NearByEntranceConfig nearByEntranceConfig) throws IOException {
        NearByEntranceConfig nearByEntranceConfig2 = nearByEntranceConfig;
        if (nearByEntranceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(nearByEntranceConfig2.entranceEnable);
        c09dl.LJIILLIIL("data_update_time");
        c09dl.LJJIZ(nearByEntranceConfig2.dataUpdateTime);
        c09dl.LJIILLIIL("enable_request_location");
        c09dl.LJJJJJL(nearByEntranceConfig2.enableRequestLocation);
        c09dl.LJIILLIIL("nearby_reject_location_max_times");
        c09dl.LJJJJ(Integer.valueOf(nearByEntranceConfig2.rejectMaxTimes));
        c09dl.LJIILLIIL("enable_banner");
        c09dl.LJJJJJL(nearByEntranceConfig2.enableBanner);
        c09dl.LJIILLIIL("enable_nearby");
        c09dl.LJJJJJL(nearByEntranceConfig2.enableNearby);
        c09dl.LJII();
    }
}
