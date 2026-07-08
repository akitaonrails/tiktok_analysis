package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.CreatorSuccessInfo> {
    public static int LIZJ(PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = creatorSuccessInfo.tags;
        int iLIZ = 0;
        if (list != null && !list.isEmpty()) {
            i = 0;
            for (int i2 = 0; i2 < creatorSuccessInfo.tags.size(); i2++) {
                PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem = (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) ListProtector.get(creatorSuccessInfo.tags, i2);
                if (tagItem == null) {
                    iLIZIZ3 = 0;
                } else {
                    int iLIZJ = _PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoEncoder.LIZJ(tagItem);
                    iLIZIZ3 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
                }
                i += iLIZIZ3;
            }
        } else {
            i = 0;
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = creatorSuccessInfo.topic;
        if (topic == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ2 = _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZJ(topic);
            iLIZIZ = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(2);
        }
        int i3 = i + iLIZIZ;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> list2 = creatorSuccessInfo.topicList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < creatorSuccessInfo.topicList.size(); i4++) {
                PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic2 = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) ListProtector.get(creatorSuccessInfo.topicList, i4);
                if (topic2 == null) {
                    iLIZIZ2 = 0;
                } else {
                    int iLIZJ3 = _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZJ(topic2);
                    iLIZIZ2 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(3);
                }
                i3 += iLIZIZ2;
            }
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl = creatorSuccessInfo.frequencyControl;
        if (frequencyControl != null) {
            int iLIZIZ4 = _PublicAreaMessageCommon_CreatorSuccessInfo_FrequencyControl_ProtoEncoder.LIZIZ(frequencyControl);
            iLIZ = C1142350fph.LIZ(4) + iLIZIZ4 + C1142350fph.LIZIZ(iLIZIZ4);
        }
        return i3 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = creatorSuccessInfo.tags;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < creatorSuccessInfo.tags.size(); i++) {
                PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem = (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) ListProtector.get(creatorSuccessInfo.tags, i);
                if (tagItem != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoEncoder.LIZJ(tagItem));
                    _PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoEncoder.LIZIZ(c1142350fph, tagItem);
                }
            }
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = creatorSuccessInfo.topic;
        if (topic != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZJ(topic));
            _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZIZ(c1142350fph, topic);
        }
        List<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> list2 = creatorSuccessInfo.topicList;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < creatorSuccessInfo.topicList.size(); i2++) {
                PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic2 = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) ListProtector.get(creatorSuccessInfo.topicList, i2);
                if (topic2 != null) {
                    c1142350fph.LIZLLL(3, 2);
                    c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZJ(topic2));
                    _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoEncoder.LIZIZ(c1142350fph, topic2);
                }
            }
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl = creatorSuccessInfo.frequencyControl;
        if (frequencyControl != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_FrequencyControl_ProtoEncoder.LIZIZ(frequencyControl));
            C1142340fpg.LJFF(c1142350fph, 1, frequencyControl.frequencyControlKey);
            long j = frequencyControl.windowSize;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJFF(j);
            long j2 = frequencyControl.limitInWindow;
            c1142350fph.LIZLLL(3, 0);
            c1142350fph.LJFF(j2);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        LIZIZ(c1142350fph, creatorSuccessInfo);
    }
}
