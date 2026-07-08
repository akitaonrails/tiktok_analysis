package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter extends TypeAdapter<LiveMatchAudienceIdentifyOptSettingsData> {
    public final Gson LIZ;

    public LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchAudienceIdentifyOptSettingsData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData = new LiveMatchAudienceIdentifyOptSettingsData(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1531404538:
                        if (strLJJJJ.equals("enable_sei_fallback")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAudienceIdentifyOptSettingsData.enable_sei_fallback = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1179020207:
                        if (strLJJJJ.equals("enable_open_message_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAudienceIdentifyOptSettingsData.enable_open_message_cache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1108426868:
                        if (strLJJJJ.equals("enable_block_match_open_msg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAudienceIdentifyOptSettingsData.enable_block_match_open_msg = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1984162026:
                        if (strLJJJJ.equals("enable_armies_fallback")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAudienceIdentifyOptSettingsData.enable_armies_fallback = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveMatchAudienceIdentifyOptSettingsData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData) throws IOException {
        LiveMatchAudienceIdentifyOptSettingsData liveMatchAudienceIdentifyOptSettingsData2 = liveMatchAudienceIdentifyOptSettingsData;
        if (liveMatchAudienceIdentifyOptSettingsData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_open_message_cache");
        c09dl.LJJJJJL(liveMatchAudienceIdentifyOptSettingsData2.enable_open_message_cache);
        c09dl.LJIILLIIL("enable_sei_fallback");
        c09dl.LJJJJJL(liveMatchAudienceIdentifyOptSettingsData2.enable_sei_fallback);
        c09dl.LJIILLIIL("enable_armies_fallback");
        c09dl.LJJJJJL(liveMatchAudienceIdentifyOptSettingsData2.enable_armies_fallback);
        c09dl.LJIILLIIL("enable_block_match_open_msg");
        c09dl.LJJJJJL(liveMatchAudienceIdentifyOptSettingsData2.enable_block_match_open_msg);
        c09dl.LJII();
    }
}
