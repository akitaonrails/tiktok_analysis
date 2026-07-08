package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.match.GroupLiveMemberMatchOptimizationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupLiveMemberMatchOptimizationSetting_Configs_OptTypeAdapter extends TypeAdapter<GroupLiveMemberMatchOptimizationSetting.Configs> {
    public final Gson LIZ;

    public GroupLiveMemberMatchOptimizationSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GroupLiveMemberMatchOptimizationSetting.Configs read(C09CU c09cu) {
        GroupLiveMemberMatchOptimizationSetting.Configs configs = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            configs = new GroupLiveMemberMatchOptimizationSetting.Configs(true, "aweme://roma_redirect/?spark_page=group_live_member_pk_contributor_list_page");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "member_pk_match_optimization_contributors_page")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.contributorsPageLink = c09cu.LJJJZ();
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
    public final void write(C09DL c09dl, GroupLiveMemberMatchOptimizationSetting.Configs configs) throws IOException {
        GroupLiveMemberMatchOptimizationSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(configs2.enable);
        c09dl.LJIILLIIL("member_pk_match_optimization_contributors_page");
        c09dl.LJJJJJ(configs2.contributorsPageLink);
        c09dl.LJII();
    }
}
