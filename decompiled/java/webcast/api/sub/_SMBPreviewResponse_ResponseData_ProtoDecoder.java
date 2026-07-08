package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.IconInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBBasicInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api._SMBBasicInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SMBCourse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SMBVerificationInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBPreviewResponse_ResponseData_ProtoDecoder implements C0IMD<SMBPreviewResponse.ResponseData> {
    public static SMBPreviewResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBPreviewResponse.ResponseData responseData = new SMBPreviewResponse.ResponseData();
        responseData.formInfoList = new ArrayList();
        responseData.subInfo = new ArrayList();
        responseData.courseList = new ArrayList();
        responseData.skuOrder = new ArrayList();
        responseData.bookingInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.anchorBasicInfo = _SMBBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        responseData.anchorData = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        responseData.displaySwitch = _PreviewDisplay_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.dmInfo = _DMInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.formInfo = _FormInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.subInfo.add(_SMBPreviewResponse_SubInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        responseData.formInfoList.add(_FormInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        responseData.skuOrder.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.courseList.add(_SMBCourse_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        responseData.subscriptionType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        responseData.verificationInfo = _SMBVerificationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        responseData.smbServicePinInfo = _SMBServicePinInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        responseData.bookingInfoList.add(_BookingInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        responseData.displayHeaderDmBtn = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        responseData.thirdPartyLinkInfo = _ThirdPartyLinkDisplayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
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

    public static void LJ(SMBPreviewResponse.ResponseData responseData) {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo;
        SMBBasicInfo sMBBasicInfo = responseData.anchorBasicInfo;
        if (sMBBasicInfo != null) {
            IconInfo iconInfo = sMBBasicInfo.emailIcon;
            if (iconInfo != null) {
                ImageModel imageModel = iconInfo.lightImage;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                ImageModel imageModel2 = iconInfo.darkImage;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
            IconInfo iconInfo2 = sMBBasicInfo.phoneIcon;
            if (iconInfo2 != null) {
                ImageModel imageModel3 = iconInfo2.lightImage;
                if (imageModel3 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel3);
                }
                ImageModel imageModel4 = iconInfo2.darkImage;
                if (imageModel4 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel4);
                }
            }
        }
        User user = responseData.anchorData;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        DMInfo dMInfo = responseData.dmInfo;
        if (dMInfo != null) {
            _DMInfo_ProtoDecoder.LJ(dMInfo);
        }
        List<SMBPreviewResponse.SubInfo> list = responseData.subInfo;
        if (list == null) {
            responseData.subInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<SMBPreviewResponse.SubInfo> it2 = responseData.subInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<FormInfo> list2 = responseData.formInfoList;
        if (list2 == null) {
            responseData.formInfoList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<FormInfo> it3 = responseData.formInfoList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (responseData.skuOrder == null) {
            responseData.skuOrder = new ArrayList();
        }
        List<SMBCourse> list3 = responseData.courseList;
        if (list3 == null) {
            responseData.courseList = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (SMBCourse sMBCourse : responseData.courseList) {
                if (sMBCourse != null) {
                    _SMBCourse_ProtoDecoder.LJ(sMBCourse);
                }
            }
        }
        SMBVerificationInfo sMBVerificationInfo = responseData.verificationInfo;
        if (sMBVerificationInfo != null && (sMBIndustryVerificationInfo = sMBVerificationInfo.industryVerificationInfo) != null && sMBIndustryVerificationInfo.blockedReasons == null) {
            sMBIndustryVerificationInfo.blockedReasons = new ArrayList();
        }
        SMBServicePinInfo sMBServicePinInfo = responseData.smbServicePinInfo;
        if (sMBServicePinInfo != null) {
            _SMBServicePinInfo_ProtoDecoder.LJ(sMBServicePinInfo);
        }
        List<BookingInfo> list4 = responseData.bookingInfoList;
        if (list4 == null) {
            responseData.bookingInfoList = new ArrayList();
        } else {
            if (list4.isEmpty()) {
                return;
            }
            Iterator<BookingInfo> it4 = responseData.bookingInfoList.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBPreviewResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final SMBPreviewResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBPreviewResponse.ResponseData responseData, List list) {
    }
}
