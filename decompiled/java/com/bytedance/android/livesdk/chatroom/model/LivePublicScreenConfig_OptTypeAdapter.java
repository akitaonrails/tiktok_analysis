package com.bytedance.android.livesdk.chatroom.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LivePublicScreenConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePublicScreenConfig livePublicScreenConfig = new LivePublicScreenConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1479957841:
                        if (strLJJJJ.equals("fold_message_show_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.foldMessageShowMode = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -710683224:
                        if (strLJJJJ.equals("consume_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.consumeInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -707614165:
                        if (strLJJJJ.equals("max_message_in_recyclerview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.maxMessageInRecyclerview = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -14936999:
                        if (strLJJJJ.equals("consume_count_per_loop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.consumeCountPerLoop = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 256225795:
                        if (strLJJJJ.equals("anim_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.animStyle = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 914387396:
                        if (strLJJJJ.equals("others_buffer_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.othersBufferSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1091613861:
                        if (strLJJJJ.equals("ms_per_inch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.msPerInch = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1096987638:
                        if (strLJJJJ.equals("fold_message_scroll_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.foldMessageScrollType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1413868308:
                        if (strLJJJJ.equals("first_loop_consume_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenConfig.firstLoopConsumeDelay = c09cu.LJJIZ();
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
        return livePublicScreenConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePublicScreenConfig livePublicScreenConfig) {
        LivePublicScreenConfig livePublicScreenConfig2 = livePublicScreenConfig;
        if (livePublicScreenConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("consume_count_per_loop");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.consumeCountPerLoop));
        c09dl.LJIILLIIL("consume_interval");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.consumeInterval));
        c09dl.LJIILLIIL("first_loop_consume_delay");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.firstLoopConsumeDelay));
        c09dl.LJIILLIIL("fold_message_scroll_type");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.foldMessageScrollType));
        c09dl.LJIILLIIL("fold_message_show_mode");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.foldMessageShowMode));
        c09dl.LJIILLIIL("ms_per_inch");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.msPerInch));
        c09dl.LJIILLIIL("anim_style");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.animStyle));
        c09dl.LJIILLIIL("others_buffer_size");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.othersBufferSize));
        c09dl.LJIILLIIL("max_message_in_recyclerview");
        c09dl.LJJJJ(Integer.valueOf(livePublicScreenConfig2.maxMessageInRecyclerview));
        c09dl.LJII();
    }
}
