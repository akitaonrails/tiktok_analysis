package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.DynamicListConfig;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DynamicListConfig_SectionConfig_ProtoDecoder implements C0IMD<DynamicListConfig.SectionConfig> {
    public static DynamicListConfig.SectionConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DynamicListConfig.SectionConfig sectionConfig = new DynamicListConfig.SectionConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sectionConfig.initialData = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    sectionConfig.schema = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sectionConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final DynamicListConfig.SectionConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(DynamicListConfig.SectionConfig sectionConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DynamicListConfig.SectionConfig sectionConfig, List list) {
    }
}
