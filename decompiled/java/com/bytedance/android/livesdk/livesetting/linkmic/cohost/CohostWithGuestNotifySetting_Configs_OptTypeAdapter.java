package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestNotifySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestNotifySetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestNotifySetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestNotifySetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestNotifySetting.Configs read(C09CU c09cu) {
        CohostWithGuestNotifySetting.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new CohostWithGuestNotifySetting.Configs(true, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "cohost_linked")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.coHostLinked = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "cohost_widget_create_for_audience")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.cohostWidgetCreatedForAudience = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestNotifySetting.Configs configs) throws IOException {
        CohostWithGuestNotifySetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cohost_linked");
        c09dl.LJJJJJL(configs2.coHostLinked);
        c09dl.LJIILLIIL("cohost_widget_create_for_audience");
        c09dl.LJJJJJL(configs2.cohostWidgetCreatedForAudience);
        c09dl.LJII();
    }
}
