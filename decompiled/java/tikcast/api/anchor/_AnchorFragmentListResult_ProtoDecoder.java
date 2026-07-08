package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorFragmentListResult_ProtoDecoder implements C0IMD<AnchorFragmentListResult> {
    public static AnchorFragmentListResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorFragmentListResult anchorFragmentListResult = new AnchorFragmentListResult();
        anchorFragmentListResult.fragmentList = new ArrayList();
        anchorFragmentListResult.postedFragmentList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case 8:
                                        anchorFragmentListResult.roomRevertSwitch = c1516680pZS.LJIIJ();
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        anchorFragmentListResult.highValueInfo = _HighValueInfomation_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        anchorFragmentListResult.postedFragmentList.add(_LiveFragmentDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                anchorFragmentListResult.highlightCollection = _HighlightCollection_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            anchorFragmentListResult.hasMuted = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        anchorFragmentListResult.generateStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    anchorFragmentListResult.fragmentList.add(_LiveFragmentDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorFragmentListResult;
            }
        }
    }

    public static void LJ(AnchorFragmentListResult anchorFragmentListResult) {
        List<LiveFragmentDetail> list = anchorFragmentListResult.fragmentList;
        if (list == null) {
            anchorFragmentListResult.fragmentList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LiveFragmentDetail liveFragmentDetail : anchorFragmentListResult.fragmentList) {
                if (liveFragmentDetail != null) {
                    _LiveFragmentDetail_ProtoDecoder.LJ(liveFragmentDetail);
                }
            }
        }
        HighlightCollection highlightCollection = anchorFragmentListResult.highlightCollection;
        if (highlightCollection != null) {
            _HighlightCollection_ProtoDecoder.LJ(highlightCollection);
        }
        List<LiveFragmentDetail> list2 = anchorFragmentListResult.postedFragmentList;
        if (list2 == null) {
            anchorFragmentListResult.postedFragmentList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (LiveFragmentDetail liveFragmentDetail2 : anchorFragmentListResult.postedFragmentList) {
            if (liveFragmentDetail2 != null) {
                _LiveFragmentDetail_ProtoDecoder.LJ(liveFragmentDetail2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorFragmentListResult anchorFragmentListResult) {
        LJ(anchorFragmentListResult);
    }

    @Override // X.C0IMD
    public final AnchorFragmentListResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorFragmentListResult anchorFragmentListResult, List list) {
    }
}
