package com.bytedance.android.livesdk.livesetting.slot;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoContent_OptTypeAdapter extends TypeAdapter<GeckoContent> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GeckoContent read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GeckoContent geckoContent = new GeckoContent(0, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoContent.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1283380936:
                        if (strLJJJJ.equals("msg_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoContent.msgType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1139288251:
                        if (strLJJJJ.equals("ribbon_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoContent.ribbonFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -283171345:
                        if (strLJJJJ.equals("animation_video_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                geckoContent.videoFileName = c09cu.LJJJZ();
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
        return geckoContent;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GeckoContent geckoContent) {
        GeckoContent geckoContent2 = geckoContent;
        if (geckoContent2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("msg_type");
        c09dl.LJJJJ(Integer.valueOf(geckoContent2.msgType));
        c09dl.LJIILLIIL("ribbon_file_name");
        c09dl.LJJJJJ(geckoContent2.ribbonFileName);
        c09dl.LJIILLIIL("animation_video_file_name");
        c09dl.LJJJJJ(geckoContent2.videoFileName);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(geckoContent2.geckoChannel);
        c09dl.LJII();
    }
}
