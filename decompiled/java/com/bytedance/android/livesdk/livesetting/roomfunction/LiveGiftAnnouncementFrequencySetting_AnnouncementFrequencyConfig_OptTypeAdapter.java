package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter extends TypeAdapter<LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig> {
    public final Gson LIZ;

    public LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig = new LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig(false, false, 1, 1, 50, 0.8f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1211256848:
                        if (strLJJJJ.equals("live_close_toggle_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.closeToggleEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -777377864:
                        if (strLJJJJ.equals("live_disable_min_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.disableMinCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 183273449:
                        if (strLJJJJ.equals("live_frequency_control_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.frequencyControlEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 258568985:
                        if (strLJJJJ.equals("live_frequency_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.frequencyCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 532379466:
                        if (strLJJJJ.equals("live_frequency_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.frequencyDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 595951073:
                        if (strLJJJJ.equals("live_disable_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                announcementFrequencyConfig.disableRatio = (float) c09cu.LJJIL();
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
        return announcementFrequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig) throws IOException {
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig announcementFrequencyConfig2 = announcementFrequencyConfig;
        if (announcementFrequencyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_close_toggle_enabled");
        c09dl.LJJJJJL(announcementFrequencyConfig2.closeToggleEnabled);
        c09dl.LJIILLIIL("live_frequency_control_enabled");
        c09dl.LJJJJJL(announcementFrequencyConfig2.frequencyControlEnabled);
        c09dl.LJIILLIIL("live_frequency_count");
        c09dl.LJJJJ(Integer.valueOf(announcementFrequencyConfig2.frequencyCount));
        c09dl.LJIILLIIL("live_frequency_duration");
        c09dl.LJJJJ(Integer.valueOf(announcementFrequencyConfig2.frequencyDuration));
        c09dl.LJIILLIIL("live_disable_min_count");
        c09dl.LJJJJ(Integer.valueOf(announcementFrequencyConfig2.disableMinCount));
        c09dl.LJIILLIIL("live_disable_ratio");
        c09dl.LJJJJ(Float.valueOf(announcementFrequencyConfig2.disableRatio));
        c09dl.LJII();
    }
}
