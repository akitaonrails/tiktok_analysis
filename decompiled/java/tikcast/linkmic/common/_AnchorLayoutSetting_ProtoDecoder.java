package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorLayoutSetting_ProtoDecoder implements C0IMD<AnchorLayoutSetting> {
    public static AnchorLayoutSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLayoutSetting anchorLayoutSetting = new AnchorLayoutSetting();
        anchorLayoutSetting.panelLayoutTypeSetting = new ArrayList();
        anchorLayoutSetting.layoutStyleSettings = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            anchorLayoutSetting.panelLayoutTypeSetting.add(_AnchorPanelLayoutTypeSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        anchorLayoutSetting.layoutStyleSettings.add(_AnchorLayoutStyleSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    anchorLayoutSetting.latestLayoutStyle = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLayoutSetting;
            }
        }
    }

    public static void LJ(AnchorLayoutSetting anchorLayoutSetting) {
        List<AnchorLayoutStyleSetting> list = anchorLayoutSetting.layoutStyleSettings;
        if (list == null) {
            anchorLayoutSetting.layoutStyleSettings = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<AnchorLayoutStyleSetting> it2 = anchorLayoutSetting.layoutStyleSettings.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<AnchorPanelLayoutTypeSetting> list2 = anchorLayoutSetting.panelLayoutTypeSetting;
        if (list2 == null) {
            anchorLayoutSetting.panelLayoutTypeSetting = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<AnchorPanelLayoutTypeSetting> it3 = anchorLayoutSetting.panelLayoutTypeSetting.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorLayoutSetting anchorLayoutSetting) {
        LJ(anchorLayoutSetting);
    }

    @Override // X.C0IMD
    public final AnchorLayoutSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLayoutSetting anchorLayoutSetting, List list) {
    }
}
