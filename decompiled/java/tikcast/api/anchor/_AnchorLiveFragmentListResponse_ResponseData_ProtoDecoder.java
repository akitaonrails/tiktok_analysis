package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder implements C0IMD<AnchorLiveFragmentListResponse.ResponseData> {
    public static AnchorLiveFragmentListResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLiveFragmentListResponse.ResponseData responseData = new AnchorLiveFragmentListResponse.ResponseData();
        responseData.postDetailList = new ArrayList();
        responseData.fragmentList = new ArrayList();
        responseData.roomMap = new HashMap();
        responseData.highlightReminder = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        AnchorFragmentListResult anchorFragmentListResultLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        anchorFragmentListResultLIZLLL = _AnchorFragmentListResult_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (anchorFragmentListResultLIZLLL != null) {
                                        responseData.roomMap.put(strLIZLLL, anchorFragmentListResultLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 2:
                        responseData.postDetailList.add(_AnchorLiveFragmentPostDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        responseData.fragmentList.add(_LiveFragmentDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        responseData.showTemplate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        responseData.showBeansGiftText = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        responseData.highlightReminder.add(_HighlightReminder_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        responseData.showInboxSubPopUp = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        responseData.userRevertSwitch = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.showAutoPostNotice = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(AnchorLiveFragmentListResponse.ResponseData responseData) {
        Map<String, AnchorFragmentListResult> map = responseData.roomMap;
        if (map == null) {
            responseData.roomMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<String, AnchorFragmentListResult>> it2 = responseData.roomMap.entrySet().iterator();
            while (it2.hasNext()) {
                AnchorFragmentListResult value = it2.next().getValue();
                if (value != null) {
                    _AnchorFragmentListResult_ProtoDecoder.LJ(value);
                }
            }
        }
        List<AnchorLiveFragmentPostDetail> list = responseData.postDetailList;
        if (list == null) {
            responseData.postDetailList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<AnchorLiveFragmentPostDetail> it3 = responseData.postDetailList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<LiveFragmentDetail> list2 = responseData.fragmentList;
        if (list2 == null) {
            responseData.fragmentList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (LiveFragmentDetail liveFragmentDetail : responseData.fragmentList) {
                if (liveFragmentDetail != null) {
                    _LiveFragmentDetail_ProtoDecoder.LJ(liveFragmentDetail);
                }
            }
        }
        List<HighlightReminder> list3 = responseData.highlightReminder;
        if (list3 == null) {
            responseData.highlightReminder = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<HighlightReminder> it4 = responseData.highlightReminder.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorLiveFragmentListResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final AnchorLiveFragmentListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLiveFragmentListResponse.ResponseData responseData, List list) {
    }
}
