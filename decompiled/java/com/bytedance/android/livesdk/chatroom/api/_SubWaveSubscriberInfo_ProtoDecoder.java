package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveSubscriberInfo_ProtoDecoder implements C0IMD<SubWaveSubscriberInfo> {
    public static SubWaveSubscriberInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubWaveSubscriberInfo subWaveSubscriberInfo = new SubWaveSubscriberInfo();
        subWaveSubscriberInfo.badgeList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    subWaveSubscriberInfo.badgeList.add(_BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                subWaveSubscriberInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            subWaveSubscriberInfo.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subWaveSubscriberInfo.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subWaveSubscriberInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveSubscriberInfo;
            }
        }
    }

    public static void LJ(SubWaveSubscriberInfo subWaveSubscriberInfo) {
        ImageModel imageModel = subWaveSubscriberInfo.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<BadgeStruct> list = subWaveSubscriberInfo.badgeList;
        if (list == null) {
            subWaveSubscriberInfo.badgeList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BadgeStruct badgeStruct : subWaveSubscriberInfo.badgeList) {
            if (badgeStruct != null) {
                _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubWaveSubscriberInfo subWaveSubscriberInfo) {
        LJ(subWaveSubscriberInfo);
    }

    @Override // X.C0IMD
    public final SubWaveSubscriberInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveSubscriberInfo subWaveSubscriberInfo, List list) {
    }
}
