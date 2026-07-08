package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ReferralFeedBanner extends C1893670zNV {
    public List<LynxFeedBannerPicture> LJII;

    @C09CT("age_gate_popup_view")
    public AgeGatePopup ageGate;

    @C09CT("attribute_info")
    public final AttributeInfo attributeInfo;

    @C09CT("banner_type")
    public int bannerType;

    @C09CT("ec_referral_feedbanner_pictures")
    public final List<ECReferralFeedPicture> ecReferralFeedPictures;

    @C09CT("event_params")
    public Map<String, String> eventParams;

    @C09CT("feed_banner_special_card_pictures")
    public List<FeedBannerSpecialCardPicture> feedBannerSpecialCardPicture;

    @C09CT("feed_common_pictures")
    public final List<FeedCommonPicture> feedCommonPictures;

    @C09CT("hint")
    public String hint;

    @C09CT("lynx_feed_banner_pictures")
    public List<? extends Map<String, Object>> lynxFeedBannerPicture;

    @C09CT("need_age_gate")
    public boolean needAgeGate;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("pictures")
    public final List<Picture> pictures;

    @C09CT("popup_callback")
    public String popupCallback;

    @C09CT("videos")
    public final List<Video> videos;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralFeedBanner)) {
            return false;
        }
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) obj;
        return this.bannerType == referralFeedBanner.bannerType && Intrinsics.LJFF(this.eventParams, referralFeedBanner.eventParams) && Intrinsics.LJFF(this.videos, referralFeedBanner.videos) && Intrinsics.LJFF(this.pictures, referralFeedBanner.pictures) && Intrinsics.LJFF(this.feedCommonPictures, referralFeedBanner.feedCommonPictures) && Intrinsics.LJFF(this.ecReferralFeedPictures, referralFeedBanner.ecReferralFeedPictures) && this.needAgeGate == referralFeedBanner.needAgeGate && Intrinsics.LJFF(this.ageGate, referralFeedBanner.ageGate) && Intrinsics.LJFF(this.popupCallback, referralFeedBanner.popupCallback) && Intrinsics.LJFF(this.hint, referralFeedBanner.hint) && Intrinsics.LJFF(this.notificationId, referralFeedBanner.notificationId) && Intrinsics.LJFF(this.notificationName, referralFeedBanner.notificationName) && Intrinsics.LJFF(this.attributeInfo, referralFeedBanner.attributeInfo) && Intrinsics.LJFF(this.feedBannerSpecialCardPicture, referralFeedBanner.feedBannerSpecialCardPicture) && Intrinsics.LJFF(this.lynxFeedBannerPicture, referralFeedBanner.lynxFeedBannerPicture) && Intrinsics.LJFF(this.LJII, referralFeedBanner.LJII);
    }

    public final int hashCode() {
        int i = this.bannerType * 31;
        Map<String, String> map = this.eventParams;
        int iHashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
        List<Video> list = this.videos;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Picture> list2 = this.pictures;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FeedCommonPicture> list3 = this.feedCommonPictures;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ECReferralFeedPicture> list4 = this.ecReferralFeedPictures;
        int iHashCode5 = (((((((((((iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31) + C786410Ut5.Z2(this.needAgeGate)) * 31) + this.ageGate.hashCode()) * 31) + this.popupCallback.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.notificationId.hashCode()) * 31;
        String str = this.notificationName;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        AttributeInfo attributeInfo = this.attributeInfo;
        int iHashCode7 = (iHashCode6 + (attributeInfo == null ? 0 : attributeInfo.hashCode())) * 31;
        List<FeedBannerSpecialCardPicture> list5 = this.feedBannerSpecialCardPicture;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<? extends Map<String, Object>> list6 = this.lynxFeedBannerPicture;
        int iHashCode9 = (iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<LynxFeedBannerPicture> list7 = this.LJII;
        return iHashCode9 + (list7 != null ? list7.hashCode() : 0);
    }

    public final String toString() {
        return "ReferralFeedBanner(bannerType=" + this.bannerType + ", eventParams=" + this.eventParams + ", videos=" + this.videos + ", pictures=" + this.pictures + ", feedCommonPictures=" + this.feedCommonPictures + ", ecReferralFeedPictures=" + this.ecReferralFeedPictures + ", needAgeGate=" + this.needAgeGate + ", ageGate=" + this.ageGate + ", popupCallback=" + this.popupCallback + ", hint=" + this.hint + ", notificationId=" + this.notificationId + ", notificationName=" + this.notificationName + ", attributeInfo=" + this.attributeInfo + ", feedBannerSpecialCardPicture=" + this.feedBannerSpecialCardPicture + ", lynxFeedBannerPicture=" + this.lynxFeedBannerPicture + ", lynxFeedBannerPictureForClient=" + this.LJII + ')';
    }

    public ReferralFeedBanner(int i, Map<String, String> map, List<Video> list, List<Picture> list2, List<FeedCommonPicture> list3, List<ECReferralFeedPicture> list4, boolean z, AgeGatePopup ageGatePopup, String str, String str2, String str3, String str4, AttributeInfo attributeInfo, List<FeedBannerSpecialCardPicture> list5, List<? extends Map<String, Object>> list6, List<LynxFeedBannerPicture> list7) {
        this.bannerType = i;
        this.eventParams = map;
        this.videos = list;
        this.pictures = list2;
        this.feedCommonPictures = list3;
        this.ecReferralFeedPictures = list4;
        this.needAgeGate = z;
        this.ageGate = ageGatePopup;
        this.popupCallback = str;
        this.hint = str2;
        this.notificationId = str3;
        this.notificationName = str4;
        this.attributeInfo = attributeInfo;
        this.feedBannerSpecialCardPicture = list5;
        this.lynxFeedBannerPicture = list6;
        this.LJII = list7;
    }
}
