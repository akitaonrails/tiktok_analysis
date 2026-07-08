package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionContributorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BeansArtifacts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BeansArtifacts_AnchorInfo_ProtoDecoder implements C0IMD<BeansArtifacts.AnchorInfo> {
    public static BeansArtifacts.AnchorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BeansArtifacts.AnchorInfo anchorInfo = new BeansArtifacts.AnchorInfo();
        anchorInfo.contributors = new ArrayList();
        anchorInfo.gifts = new ArrayList();
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
                                    anchorInfo.contributors.add(_CompetitionContributorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                anchorInfo.version = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            anchorInfo.gifts.add(_BeansArtifacts_AnchorInfo_GiftInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        anchorInfo.numberComments = c1516680pZS.LJIIJJI();
                    }
                } else {
                    anchorInfo.anchorId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorInfo;
            }
        }
    }

    public static void LJ(BeansArtifacts.AnchorInfo anchorInfo) {
        List<BeansArtifacts.AnchorInfo.GiftInfo> list = anchorInfo.gifts;
        if (list == null) {
            anchorInfo.gifts = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<BeansArtifacts.AnchorInfo.GiftInfo> it2 = anchorInfo.gifts.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<CompetitionContributorInfo> list2 = anchorInfo.contributors;
        if (list2 == null) {
            anchorInfo.contributors = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (CompetitionContributorInfo competitionContributorInfo : anchorInfo.contributors) {
            if (competitionContributorInfo != null) {
                _CompetitionContributorInfo_ProtoDecoder.LJ(competitionContributorInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BeansArtifacts.AnchorInfo anchorInfo) {
        LJ(anchorInfo);
    }

    @Override // X.C0IMD
    public final BeansArtifacts.AnchorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BeansArtifacts.AnchorInfo anchorInfo, List list) {
    }
}
