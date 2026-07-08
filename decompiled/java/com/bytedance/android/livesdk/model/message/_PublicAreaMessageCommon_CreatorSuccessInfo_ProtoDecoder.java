package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.CreatorSuccessInfo> {
    public static PublicAreaMessageCommon.CreatorSuccessInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo = new PublicAreaMessageCommon.CreatorSuccessInfo();
        creatorSuccessInfo.topicList = new ArrayList();
        creatorSuccessInfo.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                creatorSuccessInfo.frequencyControl = _PublicAreaMessageCommon_CreatorSuccessInfo_FrequencyControl_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            creatorSuccessInfo.topicList.add(_PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        creatorSuccessInfo.topic = _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    creatorSuccessInfo.tags.add(_PublicAreaMessageCommon_CreatorSuccessInfo_TagItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return creatorSuccessInfo;
            }
        }
    }

    public static void LJ(PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = creatorSuccessInfo.tags;
        if (list == null) {
            creatorSuccessInfo.tags = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem : creatorSuccessInfo.tags) {
                if (tagItem != null) {
                    Text text = tagItem.tagText;
                    if (text != null) {
                        _Text_ProtoDecoder.LJ(text);
                    }
                    if (tagItem.eventTrackingFields == null) {
                        tagItem.eventTrackingFields = new HashMap();
                    }
                }
            }
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = creatorSuccessInfo.topic;
        if (topic != null) {
            _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoDecoder.LJ(topic);
        }
        List<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> list2 = creatorSuccessInfo.topicList;
        if (list2 == null) {
            creatorSuccessInfo.topicList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic2 : creatorSuccessInfo.topicList) {
            if (topic2 != null) {
                _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoDecoder.LJ(topic2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        LJ(creatorSuccessInfo);
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.CreatorSuccessInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo, List list) {
    }
}
