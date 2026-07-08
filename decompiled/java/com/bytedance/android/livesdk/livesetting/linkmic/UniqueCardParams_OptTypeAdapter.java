package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class UniqueCardParams_OptTypeAdapter extends TypeAdapter<UniqueCardParams> {
    public final Gson LIZ;

    public UniqueCardParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UniqueCardParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UniqueCardParams uniqueCardParams = new UniqueCardParams(300L, 10000L, 0.52f, Mp4ScreenVideoLoadTimeout.CONTROL, 200L, true, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1098333718:
                        if (strLJJJJ.equals("check_linked_user_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.checkLinkedUserInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -941671417:
                        if (strLJJJJ.equals("first_frame_hide_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.firstFrameHideDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -215831205:
                        if (strLJJJJ.equals("radio_mode_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.radioModeEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -182002984:
                        if (strLJJJJ.equals("check_sei_area_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.checkSeiAreaInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 801958851:
                        if (strLJJJJ.equals("check_link_mic_room_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.checkLinkmicRoomInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1097916370:
                        if (strLJJJJ.equals("check_sei_area_percent")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.checkSeiAreaPercent = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1821665492:
                        if (strLJJJJ.equals("update_volume_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uniqueCardParams.updateVolumeInterval = c09cu.LJJJ();
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
        return uniqueCardParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UniqueCardParams uniqueCardParams) throws IOException {
        UniqueCardParams uniqueCardParams2 = uniqueCardParams;
        if (uniqueCardParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("check_link_mic_room_interval");
        c09dl.LJJIZ(uniqueCardParams2.checkLinkmicRoomInterval);
        c09dl.LJIILLIIL("check_sei_area_interval");
        c09dl.LJJIZ(uniqueCardParams2.checkSeiAreaInterval);
        c09dl.LJIILLIIL("check_sei_area_percent");
        c09dl.LJJJJ(Float.valueOf(uniqueCardParams2.checkSeiAreaPercent));
        c09dl.LJIILLIIL("check_linked_user_interval");
        c09dl.LJJIZ(uniqueCardParams2.checkLinkedUserInterval);
        c09dl.LJIILLIIL("update_volume_interval");
        c09dl.LJJIZ(uniqueCardParams2.updateVolumeInterval);
        c09dl.LJIILLIIL("radio_mode_enable");
        c09dl.LJJJJJL(uniqueCardParams2.radioModeEnable);
        c09dl.LJIILLIIL("first_frame_hide_delay");
        c09dl.LJJIZ(uniqueCardParams2.firstFrameHideDelay);
        c09dl.LJII();
    }
}
