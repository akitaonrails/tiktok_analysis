package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicExtraInfo_ProtoDecoder implements C0IMD<TopicExtraInfo> {
    public static TopicExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopicExtraInfo topicExtraInfo = new TopicExtraInfo();
        topicExtraInfo.allRivalsAvatar = new ArrayList();
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
                                topicExtraInfo.allRivalsAvatar.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            topicExtraInfo.allRivals = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        topicExtraInfo.endTimeSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    topicExtraInfo.startTimeSec = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topicExtraInfo;
            }
        }
    }

    public static void LJ(TopicExtraInfo topicExtraInfo) {
        List<ImageModel> list = topicExtraInfo.allRivalsAvatar;
        if (list == null) {
            topicExtraInfo.allRivalsAvatar = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : topicExtraInfo.allRivalsAvatar) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopicExtraInfo topicExtraInfo) {
        LJ(topicExtraInfo);
    }

    @Override // X.C0IMD
    public final TopicExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicExtraInfo topicExtraInfo, List list) {
    }
}
