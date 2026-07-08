package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventPreviewRefreshSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePaidEventPreviewRefreshSetting_PreviewRefreshConfig_OptTypeAdapter extends TypeAdapter<LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig> {
    public final Gson LIZ;

    public LivePaidEventPreviewRefreshSetting_PreviewRefreshConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig previewRefreshConfig = new LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    previewRefreshConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "re_enter_room")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    previewRefreshConfig.reEnterRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return previewRefreshConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig previewRefreshConfig) throws IOException {
        LivePaidEventPreviewRefreshSetting.PreviewRefreshConfig previewRefreshConfig2 = previewRefreshConfig;
        if (previewRefreshConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(previewRefreshConfig2.enable);
        c09dl.LJIILLIIL("re_enter_room");
        c09dl.LJJJJJL(previewRefreshConfig2.reEnterRoom);
        c09dl.LJII();
    }
}
