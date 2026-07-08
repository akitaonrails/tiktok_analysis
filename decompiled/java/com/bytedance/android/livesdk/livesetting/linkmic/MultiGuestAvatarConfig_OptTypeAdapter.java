package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAvatarConfig_OptTypeAdapter extends TypeAdapter<MultiGuestAvatarConfig> {
    public final Gson LIZ;

    public MultiGuestAvatarConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestAvatarConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestAvatarConfig multiGuestAvatarConfig = new MultiGuestAvatarConfig(true, true, 180L, 30, 5, 20L, 60L, 180L, 0, 0, 0, true, 540);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1765033735:
                        if (strLJJJJ.equals("fake_progress_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.fakeProgressTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1708820611:
                        if (strLJJJJ.equals("download_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.downloadMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1272777653:
                        if (strLJJJJ.equals("picture_aim_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.sample_picture_aim_width = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -240268829:
                        if (strLJJJJ.equals("mock_avatar_style_im")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.mockAvatarStyleIM = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 223787940:
                        if (strLJJJJ.equals("mock_avatar_download_fail")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.mockAvatarDownloadFail = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 333172966:
                        if (strLJJJJ.equals("stylized_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.stylizedTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 514400689:
                        if (strLJJJJ.equals("cache_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.cacheDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1150583326:
                        if (strLJJJJ.equals("create_avatar_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.createAvatarTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1214336072:
                        if (strLJJJJ.equals("enable_camera_picture_downsampling")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.enableCameraPictureDownSampling = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1549623054:
                        if (strLJJJJ.equals("avatar_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.avatarMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1751801056:
                        if (strLJJJJ.equals("cache_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.cacheEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1811392309:
                        if (strLJJJJ.equals("mock_avatar_result_im")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestAvatarConfig.mockAvatarResultIM = c09cu.LJJIZ();
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
        return multiGuestAvatarConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestAvatarConfig multiGuestAvatarConfig) throws IOException {
        MultiGuestAvatarConfig multiGuestAvatarConfig2 = multiGuestAvatarConfig;
        if (multiGuestAvatarConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(multiGuestAvatarConfig2.enable);
        c09dl.LJIILLIIL("cache_enable");
        c09dl.LJJJJJL(multiGuestAvatarConfig2.cacheEnable);
        c09dl.LJIILLIIL("cache_duration");
        c09dl.LJJIZ(multiGuestAvatarConfig2.cacheDuration);
        c09dl.LJIILLIIL("avatar_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.avatarMaxCount));
        c09dl.LJIILLIIL("download_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.downloadMaxCount));
        c09dl.LJIILLIIL("fake_progress_timeout");
        c09dl.LJJIZ(multiGuestAvatarConfig2.fakeProgressTimeout);
        c09dl.LJIILLIIL("stylized_timeout");
        c09dl.LJJIZ(multiGuestAvatarConfig2.stylizedTimeout);
        c09dl.LJIILLIIL("create_avatar_timeout");
        c09dl.LJJIZ(multiGuestAvatarConfig2.createAvatarTimeout);
        c09dl.LJIILLIIL("mock_avatar_style_im");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.mockAvatarStyleIM));
        c09dl.LJIILLIIL("mock_avatar_result_im");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.mockAvatarResultIM));
        c09dl.LJIILLIIL("mock_avatar_download_fail");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.mockAvatarDownloadFail));
        c09dl.LJIILLIIL("enable_camera_picture_downsampling");
        c09dl.LJJJJJL(multiGuestAvatarConfig2.enableCameraPictureDownSampling);
        c09dl.LJIILLIIL("picture_aim_width");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAvatarConfig2.sample_picture_aim_width));
        c09dl.LJII();
    }
}
