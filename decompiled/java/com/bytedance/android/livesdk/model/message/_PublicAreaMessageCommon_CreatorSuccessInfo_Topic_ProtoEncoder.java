package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> {
    public static int LIZJ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        int iLIZIZ = 0;
        if (topic == null) {
            return 0;
        }
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, topic.topicActionType) + _Text_ProtoEncoder.LJ(2, topic.topicText) + _Text_ProtoEncoder.LJ(3, topic.topicTips) + C1142340fpg.LJI(4);
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton = topic.actionButton;
        if (actionButton != null) {
            int iLIZJ = _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoEncoder.LIZJ(actionButton);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(5);
        }
        int iLJIIIZ2 = iLJIIIZ + iLIZIZ + C1142340fpg.LJIIIZ(6, topic.tagType) + C1142340fpg.LJIIIZ(7, topic.displayLocation);
        Map<String, String> map = topic.eventTrackingFields;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : topic.eventTrackingFields.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                    iLJIIIZ2 += iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(8);
                }
            }
        }
        return iLJIIIZ2 + C1142340fpg.LJIILL(9, topic.bizName) + C1142340fpg.LJI(10);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        int i = topic.topicActionType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 2, topic.topicText);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 3, topic.topicTips);
        boolean z = topic.hasButton;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton = topic.actionButton;
        if (actionButton != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoEncoder.LIZJ(actionButton));
            _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoEncoder.LIZIZ(c1142350fph, actionButton);
        }
        int i2 = topic.tagType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i2);
        int i3 = topic.displayLocation;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i3);
        Map<String, String> map = topic.eventTrackingFields;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : topic.eventTrackingFields.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(8, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 9, topic.bizName);
        boolean z2 = topic.disableCountFrequencyControl;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        LIZIZ(c1142350fph, topic);
    }
}
