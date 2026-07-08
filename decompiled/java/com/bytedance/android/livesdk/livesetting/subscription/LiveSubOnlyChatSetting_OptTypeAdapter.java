package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSubOnlyChatSetting_OptTypeAdapter extends TypeAdapter<LiveSubOnlyChatSetting> {
    public final Gson LIZ;

    public LiveSubOnlyChatSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubOnlyChatSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubOnlyChatSetting liveSubOnlyChatSetting = new LiveSubOnlyChatSetting(1, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1672660538) {
                    if (iHashCode != -354159301) {
                        if (iHashCode == 449890974 && strLJJJJ.equals("animation_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubOnlyChatSetting.setAnimationEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("on_live_switch_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveSubOnlyChatSetting.setOnLiveSwitchEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("on_live_setting_switch_frequency_min")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSubOnlyChatSetting.setOnLiveSwitchFrequencyMin(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveSubOnlyChatSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubOnlyChatSetting liveSubOnlyChatSetting) throws IOException {
        LiveSubOnlyChatSetting liveSubOnlyChatSetting2 = liveSubOnlyChatSetting;
        if (liveSubOnlyChatSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("on_live_setting_switch_frequency_min");
        c09dl.LJJJJ(Integer.valueOf(liveSubOnlyChatSetting2.getOnLiveSwitchFrequencyMin()));
        c09dl.LJIILLIIL("on_live_switch_enable");
        c09dl.LJJJJJL(liveSubOnlyChatSetting2.getOnLiveSwitchEnable());
        c09dl.LJIILLIIL("animation_enable");
        c09dl.LJJJJJL(liveSubOnlyChatSetting2.getAnimationEnable());
        c09dl.LJII();
    }
}
