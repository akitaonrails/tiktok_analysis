package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconGuideSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftIconGuideSetting_LiveGiftIconGuideConfig_OptTypeAdapter extends TypeAdapter<LiveGiftIconGuideSetting.LiveGiftIconGuideConfig> {
    public final Gson LIZ;

    public LiveGiftIconGuideSetting_LiveGiftIconGuideConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftIconGuideSetting.LiveGiftIconGuideConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftIconGuideSetting.LiveGiftIconGuideConfig liveGiftIconGuideConfig = new LiveGiftIconGuideSetting.LiveGiftIconGuideConfig(false, 600, 100, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1885244984:
                        if (strLJJJJ.equals("guide_id_kv_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftIconGuideConfig.guideIdKVLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1253556770:
                        if (strLJJJJ.equals("replace_old_magic_bubble_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftIconGuideConfig.replaceOldMagicBubbleGuide = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -834809288:
                        if (strLJJJJ.equals("is_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftIconGuideConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1372828085:
                        if (strLJJJJ.equals("replace_old_ootd_bubble_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftIconGuideConfig.replaceOldOotdBubbleGuide = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2125851551:
                        if (strLJJJJ.equals("guide_info_cache_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftIconGuideConfig.guideInfoCacheDuration = c09cu.LJJIZ();
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
        return liveGiftIconGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftIconGuideSetting.LiveGiftIconGuideConfig liveGiftIconGuideConfig) throws IOException {
        LiveGiftIconGuideSetting.LiveGiftIconGuideConfig liveGiftIconGuideConfig2 = liveGiftIconGuideConfig;
        if (liveGiftIconGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enable");
        c09dl.LJJJJJL(liveGiftIconGuideConfig2.isEnable);
        c09dl.LJIILLIIL("guide_info_cache_duration");
        c09dl.LJJJJ(Integer.valueOf(liveGiftIconGuideConfig2.guideInfoCacheDuration));
        c09dl.LJIILLIIL("guide_id_kv_limit");
        c09dl.LJJJJ(Integer.valueOf(liveGiftIconGuideConfig2.guideIdKVLimit));
        c09dl.LJIILLIIL("replace_old_magic_bubble_guide");
        c09dl.LJJJJJL(liveGiftIconGuideConfig2.replaceOldMagicBubbleGuide);
        c09dl.LJIILLIIL("replace_old_ootd_bubble_guide");
        c09dl.LJJJJJL(liveGiftIconGuideConfig2.replaceOldOotdBubbleGuide);
        c09dl.LJII();
    }
}
