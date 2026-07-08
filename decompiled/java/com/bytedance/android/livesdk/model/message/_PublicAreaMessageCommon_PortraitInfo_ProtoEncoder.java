package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.PortraitInfo> {
    public static int LIZJ(PublicAreaMessageCommon.PortraitInfo portraitInfo) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        List<PublicAreaMessageCommon.PortraitInfo.UserMetrics> list = portraitInfo.userMetrics;
        if (list != null && !list.isEmpty()) {
            i = 0;
            for (int i2 = 0; i2 < portraitInfo.userMetrics.size(); i2++) {
                PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics = (PublicAreaMessageCommon.PortraitInfo.UserMetrics) ListProtector.get(portraitInfo.userMetrics, i2);
                if (userMetrics == null) {
                    iLIZIZ2 = 0;
                } else {
                    int iLJIIIZ = C1142340fpg.LJIIIZ(1, userMetrics.type) + C1142340fpg.LJIILL(2, userMetrics.metricsValue);
                    iLIZIZ2 = iLJIIIZ + C1142350fph.LIZIZ(iLJIIIZ) + C1142350fph.LIZ(1);
                }
                i += iLIZIZ2;
            }
        } else {
            i = 0;
        }
        List<PublicAreaMessageCommon.PortraitInfo.PortraitTag> list2 = portraitInfo.portraitTag;
        if (list2 != null && !list2.isEmpty()) {
            for (int i3 = 0; i3 < portraitInfo.portraitTag.size(); i3++) {
                PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag = (PublicAreaMessageCommon.PortraitInfo.PortraitTag) ListProtector.get(portraitInfo.portraitTag, i3);
                if (portraitTag == null) {
                    iLIZIZ = 0;
                } else {
                    int iLIZJ = _PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoEncoder.LIZJ(portraitTag);
                    iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(2);
                }
                i += iLIZIZ;
            }
        }
        return i;
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.PortraitInfo portraitInfo) {
        List<PublicAreaMessageCommon.PortraitInfo.UserMetrics> list = portraitInfo.userMetrics;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < portraitInfo.userMetrics.size(); i++) {
                PublicAreaMessageCommon.PortraitInfo.UserMetrics userMetrics = (PublicAreaMessageCommon.PortraitInfo.UserMetrics) ListProtector.get(portraitInfo.userMetrics, i);
                if (userMetrics != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIIZ(1, userMetrics.type) + C1142340fpg.LJIILL(2, userMetrics.metricsValue));
                    int i2 = userMetrics.type;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LIZJ(i2);
                    C1142340fpg.LJFF(c1142350fph, 2, userMetrics.metricsValue);
                }
            }
        }
        List<PublicAreaMessageCommon.PortraitInfo.PortraitTag> list2 = portraitInfo.portraitTag;
        if (list2 != null && !list2.isEmpty()) {
            for (int i3 = 0; i3 < portraitInfo.portraitTag.size(); i3++) {
                PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag = (PublicAreaMessageCommon.PortraitInfo.PortraitTag) ListProtector.get(portraitInfo.portraitTag, i3);
                if (portraitTag != null) {
                    c1142350fph.LIZLLL(2, 2);
                    c1142350fph.LJ(_PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoEncoder.LIZJ(portraitTag));
                    _PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoEncoder.LIZIZ(c1142350fph, portraitTag);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.PortraitInfo portraitInfo) {
        LIZIZ(c1142350fph, portraitInfo);
    }
}
