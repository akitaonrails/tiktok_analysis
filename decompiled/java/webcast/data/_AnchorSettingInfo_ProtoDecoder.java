package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.AnchorSettingInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSettingInfo_ProtoDecoder implements C0IMD<AnchorSettingInfo> {
    public static AnchorSettingInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSettingInfo anchorSettingInfo = new AnchorSettingInfo();
        anchorSettingInfo.lastLayoutSettings = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorSettingInfo.lastLayoutSettings.add(_AnchorSettingInfo_AnchorLastLayoutSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSettingInfo;
            }
        }
    }

    public static void LJ(AnchorSettingInfo anchorSettingInfo) {
        List<AnchorSettingInfo.AnchorLastLayoutSetting> list = anchorSettingInfo.lastLayoutSettings;
        if (list == null) {
            anchorSettingInfo.lastLayoutSettings = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AnchorSettingInfo.AnchorLastLayoutSetting> it2 = anchorSettingInfo.lastLayoutSettings.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorSettingInfo anchorSettingInfo) {
        LJ(anchorSettingInfo);
    }

    @Override // X.C0IMD
    public final AnchorSettingInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSettingInfo anchorSettingInfo, List list) {
    }
}
