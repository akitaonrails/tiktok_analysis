package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveShowResolutionSelectionSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveShowResolutionSelectionSetting_LiveShowResolutionSelectionConfig_OptTypeAdapter extends TypeAdapter<LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig> {
    public final Gson LIZ;

    public LiveShowResolutionSelectionSetting_LiveShowResolutionSelectionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig read(C09CU c09cu) {
        LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig liveShowResolutionSelectionConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveShowResolutionSelectionConfig = new LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_resolution_selection")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveShowResolutionSelectionConfig.setEnableResolutionSelection(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "persist_across_rooms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveShowResolutionSelectionConfig.setPersistAcrossRooms(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveShowResolutionSelectionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig liveShowResolutionSelectionConfig) throws IOException {
        LiveShowResolutionSelectionSetting.LiveShowResolutionSelectionConfig liveShowResolutionSelectionConfig2 = liveShowResolutionSelectionConfig;
        if (liveShowResolutionSelectionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_resolution_selection");
        c09dl.LJJJJJL(liveShowResolutionSelectionConfig2.getEnableResolutionSelection());
        c09dl.LJIILLIIL("persist_across_rooms");
        c09dl.LJJJJJL(liveShowResolutionSelectionConfig2.getPersistAcrossRooms());
        c09dl.LJII();
    }
}
