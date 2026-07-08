package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class CoHostSeiTalkSettingConfig_OptTypeAdapter extends TypeAdapter<CoHostSeiTalkSettingConfig> {
    public final Gson LIZ;

    public CoHostSeiTalkSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostSeiTalkSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig = new CoHostSeiTalkSettingConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, 20);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1892097058) {
                    if (iHashCode != 626689136) {
                        if (iHashCode == 1689090144 && strLJJJJ.equals("talk_sei_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                coHostSeiTalkSettingConfig.seiInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("min_audio_volume")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            coHostSeiTalkSettingConfig.minAudioVolume = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("talk_sei_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        coHostSeiTalkSettingConfig.seiTalkEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return coHostSeiTalkSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig) throws IOException {
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig2 = coHostSeiTalkSettingConfig;
        if (coHostSeiTalkSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("talk_sei_enable");
        c09dl.LJJJJJL(coHostSeiTalkSettingConfig2.seiTalkEnable);
        c09dl.LJIILLIIL("talk_sei_interval");
        c09dl.LJJJJ(Integer.valueOf(coHostSeiTalkSettingConfig2.seiInterval));
        c09dl.LJIILLIIL("min_audio_volume");
        c09dl.LJJJJ(Integer.valueOf(coHostSeiTalkSettingConfig2.minAudioVolume));
        c09dl.LJII();
    }
}
