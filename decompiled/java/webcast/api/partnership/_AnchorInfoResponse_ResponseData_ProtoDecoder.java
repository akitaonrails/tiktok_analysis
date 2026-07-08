package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.game.model._PartnershipBriefDrops_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGameEvent_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_ResponseData_ProtoDecoder implements C0IMD<AnchorInfoResponse.ResponseData> {
    public static AnchorInfoResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.ResponseData responseData = new AnchorInfoResponse.ResponseData();
        responseData.punishInfo = new ArrayList();
        responseData.priceUpdateList = new ArrayList();
        responseData.enableDropsList = new ArrayList();
        responseData.enableEventList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.punishInfo.add(_AnchorInfoResponse_PunishInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        responseData.priceUpdateList.add(_AnchorInfoResponse_TaskPriceUpdate_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        responseData.labelFilterInfo = _AnchorInfoResponse_LabelFilterInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.taxpayoutconfirm = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        responseData.enableEventList.add(_PartnershipGameEvent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        responseData.enableDropsList.add(_PartnershipBriefDrops_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        responseData.toggleStatus = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        responseData.shootPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.businessPartnership = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        responseData.dropsEntrance = _AnchorInfoResponse_DropsEntrance_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        responseData.partnershipInfo = _AnchorInfoResponse_PartnershipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        responseData.toggleInfo = _AnchorInfoResponse_ToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        responseData.liveTakeDecouple = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        responseData.cameraPartnershipInfo = _AnchorInfoResponse_CameraPartnershipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        responseData.isOrgAccount = C1516700pZU.LIZ(c1516680pZS);
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

    public static void LJ(AnchorInfoResponse.ResponseData responseData) {
        List<AnchorInfoResponse.PunishInfo> list = responseData.punishInfo;
        if (list == null) {
            responseData.punishInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<AnchorInfoResponse.PunishInfo> it2 = responseData.punishInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<AnchorInfoResponse.TaskPriceUpdate> list2 = responseData.priceUpdateList;
        if (list2 == null) {
            responseData.priceUpdateList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<AnchorInfoResponse.TaskPriceUpdate> it3 = responseData.priceUpdateList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<PartnershipGameEvent> list3 = responseData.enableEventList;
        if (list3 == null) {
            responseData.enableEventList = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<PartnershipGameEvent> it4 = responseData.enableEventList.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        List<PartnershipBriefDrops> list4 = responseData.enableDropsList;
        if (list4 == null) {
            responseData.enableDropsList = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<PartnershipBriefDrops> it5 = responseData.enableDropsList.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
        AnchorInfoResponse.DropsEntrance dropsEntrance = responseData.dropsEntrance;
        if (dropsEntrance != null) {
            _AnchorInfoResponse_DropsEntrance_ProtoDecoder.LJ(dropsEntrance);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorInfoResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.ResponseData responseData, List list) {
    }
}
