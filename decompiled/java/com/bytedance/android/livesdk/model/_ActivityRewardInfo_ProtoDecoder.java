package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityRewardInfo_ProtoDecoder implements C0IMD<ActivityRewardInfo> {
    public static ActivityRewardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivityRewardInfo activityRewardInfo = new ActivityRewardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        activityRewardInfo.mStoryTag = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    activityRewardInfo.mBage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityRewardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivityRewardInfo activityRewardInfo) {
        ActivityRewardInfo activityRewardInfo2 = activityRewardInfo;
        ImageModel imageModel = activityRewardInfo2.mBage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = activityRewardInfo2.mStoryTag;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final ActivityRewardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityRewardInfo activityRewardInfo, List list) {
    }
}
