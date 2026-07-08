package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSeiTalkSettingConfig_OptTypeAdapter extends TypeAdapter<LiveSeiTalkSettingConfig> {
    public final Gson LIZ;

    public LiveSeiTalkSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSeiTalkSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig = new LiveSeiTalkSettingConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, false, 20);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2063145354:
                        if (strLJJJJ.equals("talk_wave_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSeiTalkSettingConfig.talkWaveEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1892097058:
                        if (strLJJJJ.equals("talk_sei_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSeiTalkSettingConfig.seiTalkEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 626689136:
                        if (strLJJJJ.equals("min_audio_volume")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSeiTalkSettingConfig.volumeThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1689090144:
                        if (strLJJJJ.equals("talk_sei_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSeiTalkSettingConfig.seiInterval = c09cu.LJJIZ();
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
        return liveSeiTalkSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSeiTalkSettingConfig liveSeiTalkSettingConfig) throws IOException {
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig2 = liveSeiTalkSettingConfig;
        if (liveSeiTalkSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("talk_sei_enable");
        c09dl.LJJJJJL(liveSeiTalkSettingConfig2.seiTalkEnable);
        c09dl.LJIILLIIL("talk_sei_interval");
        c09dl.LJJJJ(Integer.valueOf(liveSeiTalkSettingConfig2.seiInterval));
        c09dl.LJIILLIIL("talk_wave_enable");
        c09dl.LJJJJJL(liveSeiTalkSettingConfig2.talkWaveEnable);
        c09dl.LJIILLIIL("min_audio_volume");
        c09dl.LJJJJ(Integer.valueOf(liveSeiTalkSettingConfig2.volumeThreshold));
        c09dl.LJII();
    }
}
