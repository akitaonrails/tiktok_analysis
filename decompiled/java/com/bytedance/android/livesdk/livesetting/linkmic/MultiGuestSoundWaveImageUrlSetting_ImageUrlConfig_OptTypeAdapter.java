package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSoundWaveImageUrlSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestSoundWaveImageUrlSetting_ImageUrlConfig_OptTypeAdapter extends TypeAdapter<MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig> {
    public final Gson LIZ;

    public MultiGuestSoundWaveImageUrlSetting_ImageUrlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig imageUrlConfig = new MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig(null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "image_name_to_url_map")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    imageUrlConfig.imageNameToUrlMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return imageUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig imageUrlConfig) {
        MultiGuestSoundWaveImageUrlSetting.ImageUrlConfig imageUrlConfig2 = imageUrlConfig;
        if (imageUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("image_name_to_url_map");
        C473040Igo.LJ(this.LIZ, c09dl, imageUrlConfig2.imageNameToUrlMap, String.class);
        c09dl.LJII();
    }
}
