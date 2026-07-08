package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveToolbarExpandAndCommentSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveToolbarExpandAndCommentSetting_Config_OptTypeAdapter extends TypeAdapter<LiveToolbarExpandAndCommentSetting.Config> {
    public final Gson LIZ;

    public LiveToolbarExpandAndCommentSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveToolbarExpandAndCommentSetting.Config read(C09CU c09cu) {
        LiveToolbarExpandAndCommentSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveToolbarExpandAndCommentSetting.Config(false, Boolean.FALSE);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_toolbar_expand")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.enableToolbarExpand = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_comment_force_icon")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.enableCommentForceIcon = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveToolbarExpandAndCommentSetting.Config config) throws IOException {
        LiveToolbarExpandAndCommentSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_toolbar_expand");
        c09dl.LJJJJJL(config2.enableToolbarExpand);
        c09dl.LJIILLIIL("enable_comment_force_icon");
        c09dl.LJJJ(config2.enableCommentForceIcon);
        c09dl.LJII();
    }
}
