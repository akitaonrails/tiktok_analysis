package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterLopInfo_ProtoDecoder implements C0IMD<RealtimeLiveCenterLopInfo> {
    public static RealtimeLiveCenterLopInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo = new RealtimeLiveCenterLopInfo();
        realtimeLiveCenterLopInfo.featureGuidanceList = new ArrayList();
        realtimeLiveCenterLopInfo.taskList = new ArrayList();
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
                                    realtimeLiveCenterLopInfo.featureGuidanceList.add(_RealtimeLiveCenterLopInfo_FeatureGuidance_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                realtimeLiveCenterLopInfo.taskList.add(_RealtimeLiveCenterLopInfo_Task_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            realtimeLiveCenterLopInfo.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        realtimeLiveCenterLopInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    realtimeLiveCenterLopInfo.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterLopInfo;
            }
        }
    }

    public static void LJ(RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo) {
        ImageModel imageModel;
        List<RealtimeLiveCenterLopInfo.Task> list = realtimeLiveCenterLopInfo.taskList;
        if (list == null) {
            realtimeLiveCenterLopInfo.taskList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<RealtimeLiveCenterLopInfo.Task> it2 = realtimeLiveCenterLopInfo.taskList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<RealtimeLiveCenterLopInfo.FeatureGuidance> list2 = realtimeLiveCenterLopInfo.featureGuidanceList;
        if (list2 == null) {
            realtimeLiveCenterLopInfo.featureGuidanceList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (RealtimeLiveCenterLopInfo.FeatureGuidance featureGuidance : realtimeLiveCenterLopInfo.featureGuidanceList) {
            if (featureGuidance != null && (imageModel = featureGuidance.icon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo) {
        LJ(realtimeLiveCenterLopInfo);
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterLopInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo, List list) {
    }
}
