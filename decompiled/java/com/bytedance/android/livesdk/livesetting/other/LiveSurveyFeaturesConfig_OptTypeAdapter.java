package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSurveyFeaturesConfig_OptTypeAdapter extends TypeAdapter<LiveSurveyFeaturesConfig> {
    public final Gson LIZ;

    public LiveSurveyFeaturesConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSurveyFeaturesConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSurveyFeaturesConfig liveSurveyFeaturesConfig = new LiveSurveyFeaturesConfig(false, false, false, 100, 50, 10800L, 100, 10800L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1906845830:
                        if (strLJJJJ.equals("max_fyp_aweme_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.maxFypAwemeCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1555844861:
                        if (strLJJJJ.equals("max_live_room_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.maxLiveRoomCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -507086560:
                        if (strLJJJJ.equals("max_live_room_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.maxLiveRoomDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1123445178:
                        if (strLJJJJ.equals("enable_global_survey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.enableGlobalSurvey = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1208262326:
                        if (strLJJJJ.equals("max_fyp_live_card_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.maxFypLiveCardCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1631665119:
                        if (strLJJJJ.equals("enable_light_survey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.enableLightSurvey = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1897122445:
                        if (strLJJJJ.equals("max_fyp_live_card_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.maxFypLiveCardDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2146522393:
                        if (strLJJJJ.equals("enable_full_screen_survey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSurveyFeaturesConfig.enableFullScreenSurvey = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveSurveyFeaturesConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSurveyFeaturesConfig liveSurveyFeaturesConfig) throws IOException {
        LiveSurveyFeaturesConfig liveSurveyFeaturesConfig2 = liveSurveyFeaturesConfig;
        if (liveSurveyFeaturesConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_global_survey");
        c09dl.LJJJJJL(liveSurveyFeaturesConfig2.enableGlobalSurvey);
        c09dl.LJIILLIIL("enable_full_screen_survey");
        c09dl.LJJJJJL(liveSurveyFeaturesConfig2.enableFullScreenSurvey);
        c09dl.LJIILLIIL("enable_light_survey");
        c09dl.LJJJJJL(liveSurveyFeaturesConfig2.enableLightSurvey);
        c09dl.LJIILLIIL("max_fyp_aweme_count");
        c09dl.LJJJJ(Integer.valueOf(liveSurveyFeaturesConfig2.maxFypAwemeCount));
        c09dl.LJIILLIIL("max_fyp_live_card_count");
        c09dl.LJJJJ(Integer.valueOf(liveSurveyFeaturesConfig2.maxFypLiveCardCount));
        c09dl.LJIILLIIL("max_fyp_live_card_duration");
        c09dl.LJJIZ(liveSurveyFeaturesConfig2.maxFypLiveCardDuration);
        c09dl.LJIILLIIL("max_live_room_count");
        c09dl.LJJJJ(Integer.valueOf(liveSurveyFeaturesConfig2.maxLiveRoomCount));
        c09dl.LJIILLIIL("max_live_room_duration");
        c09dl.LJJIZ(liveSurveyFeaturesConfig2.maxLiveRoomDuration);
        c09dl.LJII();
    }
}
