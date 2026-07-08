package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class CrossScreenSettingParams_OptTypeAdapter extends TypeAdapter<CrossScreenSettingParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CrossScreenSettingParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CrossScreenSettingParams crossScreenSettingParams = new CrossScreenSettingParams(1, 1, 1, 1, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2043631946:
                        if (strLJJJJ.equals("sticker_queue_insert_by_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.insertByPriority = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -935858915:
                        if (strLJJJJ.equals("ignore_public_screen_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.ignorePublicScreenMessage = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -735763549:
                        if (strLJJJJ.equals("guest_resource_preload_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.guestPreloadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -431960031:
                        if (strLJJJJ.equals("ignore_extra_trays")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.ignoreExtraTrays = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 104228390:
                        if (strLJJJJ.equals("anchor_resource_preload_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.anchorPreloadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 418633877:
                        if (strLJJJJ.equals("check_camera_for_action_variant")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                crossScreenSettingParams.checkCameraForAction = c09cu.LJJIZ();
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
        return crossScreenSettingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CrossScreenSettingParams crossScreenSettingParams) throws IOException {
        CrossScreenSettingParams crossScreenSettingParams2 = crossScreenSettingParams;
        if (crossScreenSettingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ignore_extra_trays");
        c09dl.LJJJJ(Integer.valueOf(crossScreenSettingParams2.ignoreExtraTrays));
        c09dl.LJIILLIIL("ignore_public_screen_message");
        c09dl.LJJJJ(Integer.valueOf(crossScreenSettingParams2.ignorePublicScreenMessage));
        c09dl.LJIILLIIL("sticker_queue_insert_by_priority");
        c09dl.LJJJJ(Integer.valueOf(crossScreenSettingParams2.insertByPriority));
        c09dl.LJIILLIIL("check_camera_for_action_variant");
        c09dl.LJJJJ(Integer.valueOf(crossScreenSettingParams2.checkCameraForAction));
        c09dl.LJIILLIIL("anchor_resource_preload_delay");
        c09dl.LJJIZ(crossScreenSettingParams2.anchorPreloadDelay);
        c09dl.LJIILLIIL("guest_resource_preload_delay");
        c09dl.LJJIZ(crossScreenSettingParams2.guestPreloadDelay);
        c09dl.LJII();
    }
}
