package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.AnchorSettingInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSettingInfo_AnchorLastLayoutSetting_ProtoDecoder implements C0IMD<AnchorSettingInfo.AnchorLastLayoutSetting> {
    public static AnchorSettingInfo.AnchorLastLayoutSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSettingInfo.AnchorLastLayoutSetting anchorLastLayoutSetting = new AnchorSettingInfo.AnchorLastLayoutSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorLastLayoutSetting.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorLastLayoutSetting.scene = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLastLayoutSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorSettingInfo.AnchorLastLayoutSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorSettingInfo.AnchorLastLayoutSetting anchorLastLayoutSetting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSettingInfo.AnchorLastLayoutSetting anchorLastLayoutSetting, List list) {
    }
}
