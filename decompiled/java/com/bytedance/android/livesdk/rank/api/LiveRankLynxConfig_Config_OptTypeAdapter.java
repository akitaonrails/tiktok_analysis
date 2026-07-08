package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankLynxConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankLynxConfig.Config> {
    public final Gson LIZ;

    public LiveRankLynxConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankLynxConfig.Config read(C09CU c09cu) {
        LiveRankLynxConfig.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankLynxConfig.Config(new HashMap());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "rank_schema_config_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankSchemaConfigList = (HashMap) this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, HashMap<Long, String>>>() { // from class: X.00Vj
                        }).read(c09cu);
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
    public final void write(C09DL c09dl, LiveRankLynxConfig.Config config) {
        LiveRankLynxConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_schema_config_list");
        this.LIZ.LJIIIZ(new TypeToken<HashMap<Integer, HashMap<Long, String>>>() { // from class: X.00Vk
        }).write(c09dl, config2.rankSchemaConfigList);
        c09dl.LJII();
    }
}
