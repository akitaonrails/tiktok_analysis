package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_ProtoDecoder implements C0IMD<FansEventData> {
    public static FansEventData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData fansEventData = new FansEventData();
        fansEventData.triggerTaskTypes = new ArrayList();
        fansEventData.triggerNewTaskTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    if (iLJI != 102) {
                        switch (iLJI) {
                            case 1:
                                fansEventData.newFansData = _FansEventData_NewFansData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                fansEventData.taskCompleteData = _FansEventData_TaskCompleteData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                fansEventData.getUnclaimedPoints = _FansEventData_GetUnclaimedPoints_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                fansEventData.teamRankUpdate = _FansEventData_TeamRankUpdate_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                fansEventData.expChangeData = _FansEventData_ExpChangeData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                fansEventData.entranceGuidanceData = _FansEventData_EntranceGuidanceData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 7:
                                fansEventData.personalizedGiftData = _FansEventData_PersonalisedGift_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        fansEventData.triggerNewTaskTypes.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    fansEventData.triggerTaskTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansEventData;
            }
        }
    }

    public static void LJ(FansEventData fansEventData) {
        Text text;
        FansEventData.GetUnclaimedPoints getUnclaimedPoints = fansEventData.getUnclaimedPoints;
        if (getUnclaimedPoints != null && (text = getUnclaimedPoints.afterDailyTasksFinished) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        FansEventData.EntranceGuidanceData entranceGuidanceData = fansEventData.entranceGuidanceData;
        if (entranceGuidanceData != null) {
            Text text2 = entranceGuidanceData.text;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            ImageModel imageModel = entranceGuidanceData.icon;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            EntranceGuidanceContainer entranceGuidanceContainer = entranceGuidanceData.entranceGuidanceContainer;
            if (entranceGuidanceContainer != null) {
                Text text3 = entranceGuidanceContainer.text;
                if (text3 != null) {
                    _Text_ProtoDecoder.LJ(text3);
                }
                if (entranceGuidanceContainer.extra == null) {
                    entranceGuidanceContainer.extra = new HashMap();
                }
            }
        }
        if (fansEventData.triggerTaskTypes == null) {
            fansEventData.triggerTaskTypes = new ArrayList();
        }
        if (fansEventData.triggerNewTaskTypes == null) {
            fansEventData.triggerNewTaskTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansEventData fansEventData) {
        LJ(fansEventData);
    }

    @Override // X.C0IMD
    public final FansEventData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData fansEventData, List list) {
    }
}
