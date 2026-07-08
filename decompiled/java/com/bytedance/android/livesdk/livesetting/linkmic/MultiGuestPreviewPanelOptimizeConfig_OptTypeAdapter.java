package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPreviewPanelOptimizeConfig_OptTypeAdapter extends TypeAdapter<MultiGuestPreviewPanelOptimizeConfig> {
    public final Gson LIZ;

    public MultiGuestPreviewPanelOptimizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestPreviewPanelOptimizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestPreviewPanelOptimizeConfig multiGuestPreviewPanelOptimizeConfig = new MultiGuestPreviewPanelOptimizeConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1818014218) {
                    if (iHashCode != -1344837302) {
                        if (iHashCode == 1677568778 && strLJJJJ.equals("enable_video_audio_memory")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestPreviewPanelOptimizeConfig.enableVideoAudioMemory = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_shake")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestPreviewPanelOptimizeConfig.enableShake = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("remove_count_down_preview")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestPreviewPanelOptimizeConfig.removeCountDownPreview = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestPreviewPanelOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestPreviewPanelOptimizeConfig multiGuestPreviewPanelOptimizeConfig) throws IOException {
        MultiGuestPreviewPanelOptimizeConfig multiGuestPreviewPanelOptimizeConfig2 = multiGuestPreviewPanelOptimizeConfig;
        if (multiGuestPreviewPanelOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("remove_count_down_preview");
        c09dl.LJJJJJL(multiGuestPreviewPanelOptimizeConfig2.removeCountDownPreview);
        c09dl.LJIILLIIL("enable_video_audio_memory");
        c09dl.LJJJJJL(multiGuestPreviewPanelOptimizeConfig2.enableVideoAudioMemory);
        c09dl.LJIILLIIL("enable_shake");
        c09dl.LJJJJJL(multiGuestPreviewPanelOptimizeConfig2.enableShake);
        c09dl.LJII();
    }
}
