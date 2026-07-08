package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCapsuleStyleItemConfig_OptTypeAdapter extends TypeAdapter<LiveCapsuleStyleItemConfig> {
    public final Gson LIZ;

    public LiveCapsuleStyleItemConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCapsuleStyleItemConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCapsuleStyleItemConfig liveCapsuleStyleItemConfig = new LiveCapsuleStyleItemConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2117556567:
                        if (strLJJJJ.equals("trim_space")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.trimSpace = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1924829930:
                        if (strLJJJJ.equals("balancer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.balancer = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1868317980:
                        if (strLJJJJ.equals("capsule_radius")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.capsuleRadius = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1803395834:
                        if (strLJJJJ.equals("capsule_min_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.capsuleMinHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1397376328:
                        if (strLJJJJ.equals("max_text_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.maxTextSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1170207422:
                        if (strLJJJJ.equals("shrink_text_size_line_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.shrinkTextSizeLineThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 204925104:
                        if (strLJJJJ.equals("shrink_mode_margin_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.shrinkModeMarginEnd = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 424929830:
                        if (strLJJJJ.equals("min_text_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.minTextSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 540742283:
                        if (strLJJJJ.equals("shrink_text_size_action_width_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.shrinkTextSizeActionWidthThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 613316341:
                        if (strLJJJJ.equals("content_max_line")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.contentMaxLine = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 665750108:
                        if (strLJJJJ.equals("display_name_truncate_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.displayNameTruncateType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 890955540:
                        if (strLJJJJ.equals("ellipsis_char_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.ellipsisCharCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1311000674:
                        if (strLJJJJ.equals("action_max_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.actionMaxWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1444590634:
                        if (strLJJJJ.equals("display_name_min_char_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.displayNameMinCharCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1971500746:
                        if (strLJJJJ.equals("margin_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCapsuleStyleItemConfig.marginEnd = c09cu.LJJIZ();
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
        return liveCapsuleStyleItemConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCapsuleStyleItemConfig liveCapsuleStyleItemConfig) throws IOException {
        LiveCapsuleStyleItemConfig liveCapsuleStyleItemConfig2 = liveCapsuleStyleItemConfig;
        if (liveCapsuleStyleItemConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_text_size");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.maxTextSize));
        c09dl.LJIILLIIL("min_text_size");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.minTextSize));
        c09dl.LJIILLIIL("content_max_line");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.contentMaxLine));
        c09dl.LJIILLIIL("shrink_text_size_line_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.shrinkTextSizeLineThreshold));
        c09dl.LJIILLIIL("action_max_width");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.actionMaxWidth));
        c09dl.LJIILLIIL("shrink_text_size_action_width_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.shrinkTextSizeActionWidthThreshold));
        c09dl.LJIILLIIL("display_name_min_char_count");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.displayNameMinCharCount));
        c09dl.LJIILLIIL("display_name_truncate_type");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.displayNameTruncateType));
        c09dl.LJIILLIIL("ellipsis_char_count");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.ellipsisCharCount));
        c09dl.LJIILLIIL("capsule_min_height");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.capsuleMinHeight));
        c09dl.LJIILLIIL("shrink_mode_margin_end");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.shrinkModeMarginEnd));
        c09dl.LJIILLIIL("margin_end");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.marginEnd));
        c09dl.LJIILLIIL("capsule_radius");
        c09dl.LJJJJ(Integer.valueOf(liveCapsuleStyleItemConfig2.capsuleRadius));
        c09dl.LJIILLIIL("balancer");
        c09dl.LJJJJ(Float.valueOf(liveCapsuleStyleItemConfig2.balancer));
        c09dl.LJIILLIIL("trim_space");
        c09dl.LJJJJJL(liveCapsuleStyleItemConfig2.trimSpace);
        c09dl.LJII();
    }
}
