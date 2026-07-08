package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestNoticeboardEditorConfig_OptTypeAdapter extends TypeAdapter<MultiGuestNoticeboardEditorConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestNoticeboardEditorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestNoticeboardEditorConfig multiGuestNoticeboardEditorConfig = new MultiGuestNoticeboardEditorConfig(60, 30, 30, 20, 720, 1280, 6, 20, 100);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1927548586:
                        if (strLJJJJ.equals("text_sticker_count_limited")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.textStickerCountLimited = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1149604158:
                        if (strLJJJJ.equals("history_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.historyExpireTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1131498257:
                        if (strLJJJJ.equals("template_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.templateMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -800066423:
                        if (strLJJJJ.equals("history_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.historyMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -338172434:
                        if (strLJJJJ.equals("canvas_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.canvasHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 194639956:
                        if (strLJJJJ.equals("template_preload_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.templatePreloadCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1440677165:
                        if (strLJJJJ.equals("text_input_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.textInputMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1724956776:
                        if (strLJJJJ.equals("template_quick_select_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.templateQuickSelectMaxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2081268767:
                        if (strLJJJJ.equals("canvas_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestNoticeboardEditorConfig.canvasWidth = c09cu.LJJIZ();
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
        return multiGuestNoticeboardEditorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestNoticeboardEditorConfig multiGuestNoticeboardEditorConfig) {
        MultiGuestNoticeboardEditorConfig multiGuestNoticeboardEditorConfig2 = multiGuestNoticeboardEditorConfig;
        if (multiGuestNoticeboardEditorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("text_input_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.textInputMaxCount));
        c09dl.LJIILLIIL("history_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.historyMaxCount));
        c09dl.LJIILLIIL("history_expire_time");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.historyExpireTime));
        c09dl.LJIILLIIL("text_sticker_count_limited");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.textStickerCountLimited));
        c09dl.LJIILLIIL("canvas_width");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.canvasWidth));
        c09dl.LJIILLIIL("canvas_height");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.canvasHeight));
        c09dl.LJIILLIIL("template_preload_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.templatePreloadCount));
        c09dl.LJIILLIIL("template_quick_select_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.templateQuickSelectMaxCount));
        c09dl.LJIILLIIL("template_max_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestNoticeboardEditorConfig2.templateMaxCount));
        c09dl.LJII();
    }
}
