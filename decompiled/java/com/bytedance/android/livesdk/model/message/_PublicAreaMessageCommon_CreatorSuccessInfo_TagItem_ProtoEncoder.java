package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> {
    public static int LIZJ(PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem) {
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, tagItem.tagType) + _Text_ProtoEncoder.LJ(2, tagItem.tagText) + C1142340fpg.LJIIL(3, tagItem.tagValue) + C1142340fpg.LJIIIZ(4, tagItem.displayLocation);
        Map<String, String> map = tagItem.eventTrackingFields;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : tagItem.eventTrackingFields.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                    iLJIIIZ += iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(5);
                }
            }
        }
        return iLJIIIZ + C1142340fpg.LJIILL(6, tagItem.bizName) + C1142340fpg.LJI(10) + C1142340fpg.LJI(11);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem) {
        int i = tagItem.tagType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 2, tagItem.tagText);
        long j = tagItem.tagValue;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
        int i2 = tagItem.displayLocation;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i2);
        Map<String, String> map = tagItem.eventTrackingFields;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : tagItem.eventTrackingFields.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(5, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 6, tagItem.bizName);
        boolean z = tagItem.disableCountFrequencyControl;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = tagItem.disableCrmClick;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem) {
        LIZIZ(c1142350fph, tagItem);
    }
}
