package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_Config_OptTypeAdapter extends TypeAdapter<LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config> {
    public final Gson LIZ;

    public LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config config = new LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config(new int[0], false, -1, -1, -1, -1, -1, -1, -1, -1, -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1403433093:
                        if (strLJJJJ.equals("nick_name_text_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.nickNameTextSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        config = config;
                        break;
                    case -1099819532:
                        if (strLJJJJ.equals("show_at_last_one_top_viewer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.showAtLastOneViewer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        config = config;
                        break;
                    case -1096895144:
                        if (strLJJJJ.equals("follow_left_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.followLeftMargin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        config = config;
                        break;
                    case -596811053:
                        if (strLJJJJ.equals("nick_name_max_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.nickNameMaxWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        config = config;
                        break;
                    case 108280125:
                        if (strLJJJJ.equals("range")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.range = (int[]) this.LIZ.LJIIJ(int[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        config = config;
                        break;
                    case 147245116:
                        if (strLJJJJ.equals("skylight_left_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.skylightLeftMargin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 175667521:
                        if (strLJJJJ.equals("nick_name_min_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.nickNameMinWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 920202449:
                        if (strLJJJJ.equals("variable_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.variableMargin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1196697755:
                        if (strLJJJJ.equals("skylight_right_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.skylightRightMargin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1283055359:
                        if (strLJJJJ.equals("follow_right_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.followRightMargin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1494493877:
                        if (strLJJJJ.equals("follow_area_min_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.followAreaMinWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
            config = config;
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config config) throws IOException {
        LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("range");
        this.LIZ.LJIIJ(int[].class).write(c09dl, config2.range);
        c09dl.LJIILLIIL("show_at_last_one_top_viewer");
        c09dl.LJJJJJL(config2.showAtLastOneViewer);
        c09dl.LJIILLIIL("variable_margin");
        c09dl.LJJJJ(Integer.valueOf(config2.variableMargin));
        c09dl.LJIILLIIL("nick_name_max_width");
        c09dl.LJJJJ(Integer.valueOf(config2.nickNameMaxWidth));
        c09dl.LJIILLIIL("nick_name_min_width");
        c09dl.LJJJJ(Integer.valueOf(config2.nickNameMinWidth));
        c09dl.LJIILLIIL("nick_name_text_size");
        c09dl.LJJJJ(Integer.valueOf(config2.nickNameTextSize));
        c09dl.LJIILLIIL("follow_left_margin");
        c09dl.LJJJJ(Integer.valueOf(config2.followLeftMargin));
        c09dl.LJIILLIIL("follow_right_margin");
        c09dl.LJJJJ(Integer.valueOf(config2.followRightMargin));
        c09dl.LJIILLIIL("skylight_left_margin");
        c09dl.LJJJJ(Integer.valueOf(config2.skylightLeftMargin));
        c09dl.LJIILLIIL("skylight_right_margin");
        c09dl.LJJJJ(Integer.valueOf(config2.skylightRightMargin));
        c09dl.LJIILLIIL("follow_area_min_width");
        c09dl.LJJJJ(Integer.valueOf(config2.followAreaMinWidth));
        c09dl.LJII();
    }
}
