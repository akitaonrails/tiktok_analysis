package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchStartAnimationRuleSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class MatchStartAnimationRuleSetting_Configs_OptTypeAdapter extends TypeAdapter<MatchStartAnimationRuleSetting.Configs> {
    public final Gson LIZ;

    public MatchStartAnimationRuleSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MatchStartAnimationRuleSetting.Configs read(C09CU c09cu) {
        MatchStartAnimationRuleSetting.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new MatchStartAnimationRuleSetting.Configs(MatchStartAnimationRuleSetting.INSTANCE.defaultRules());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "rules")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.rules = C473040Igo.LIZIZ(this.LIZ, c09cu, MatchStartAnimationRuleSetting.RuleConfig.class);
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
    public final void write(C09DL c09dl, MatchStartAnimationRuleSetting.Configs configs) {
        MatchStartAnimationRuleSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rules");
        C473040Igo.LJ(this.LIZ, c09dl, configs2.rules, MatchStartAnimationRuleSetting.RuleConfig.class);
        c09dl.LJII();
    }
}
