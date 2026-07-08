package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.PortraitInfo> {
    public static PublicAreaMessageCommon.PortraitInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.PortraitInfo portraitInfo = new PublicAreaMessageCommon.PortraitInfo();
        portraitInfo.portraitTag = new ArrayList();
        portraitInfo.userMetrics = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        portraitInfo.portraitTag.add(_PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    portraitInfo.userMetrics.add(_PublicAreaMessageCommon_PortraitInfo_UserMetrics_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portraitInfo;
            }
        }
    }

    public static void LJ(PublicAreaMessageCommon.PortraitInfo portraitInfo) {
        List<PublicAreaMessageCommon.PortraitInfo.UserMetrics> list = portraitInfo.userMetrics;
        if (list == null) {
            portraitInfo.userMetrics = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PublicAreaMessageCommon.PortraitInfo.UserMetrics> it2 = portraitInfo.userMetrics.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PublicAreaMessageCommon.PortraitInfo.PortraitTag> list2 = portraitInfo.portraitTag;
        if (list2 == null) {
            portraitInfo.portraitTag = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<PublicAreaMessageCommon.PortraitInfo.PortraitTag> it3 = portraitInfo.portraitTag.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.PortraitInfo portraitInfo) {
        LJ(portraitInfo);
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.PortraitInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.PortraitInfo portraitInfo, List list) {
    }
}
