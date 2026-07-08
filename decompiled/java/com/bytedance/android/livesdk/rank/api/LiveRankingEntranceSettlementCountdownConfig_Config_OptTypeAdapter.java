package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceSettlementCountdownConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceSettlementCountdownConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceSettlementCountdownConfig.Config> {
    public final Gson LIZ;

    public LiveRankingEntranceSettlementCountdownConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceSettlementCountdownConfig.Config read(C09CU c09cu) {
        LiveRankingEntranceSettlementCountdownConfig.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankingEntranceSettlementCountdownConfig.Config(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "ranking_settlement_countdown_config_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankingSettlementCountdownConfigList = C473040Igo.LIZ(this.LIZ, c09cu, LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig.class);
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
    public final void write(C09DL c09dl, LiveRankingEntranceSettlementCountdownConfig.Config config) {
        LiveRankingEntranceSettlementCountdownConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ranking_settlement_countdown_config_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.rankingSettlementCountdownConfigList, LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig.class);
        c09dl.LJII();
    }
}
