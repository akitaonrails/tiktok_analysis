package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C123100dR;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBookingContent implements Serializable, InterfaceC1891350zJl {

    @C09CT("logo_url")
    public final UrlModel logoUrl;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_name")
    public final String merchantName;

    @C09CT("third_id")
    public final String thirdId;

    @C09CT("ttoclid")
    public final String ttoclid;

    @C09CT("url")
    public final String url;

    public PoiBookingContent() {
        this(null, null, null, null, null, null);
    }

    public final PoiBookingContent copy(String str, String str2, String str3, UrlModel urlModel, String str4, String str5) {
        return new PoiBookingContent(str, str2, str3, urlModel, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiBookingContent)) {
            return false;
        }
        PoiBookingContent poiBookingContent = (PoiBookingContent) obj;
        return Intrinsics.LJFF(this.thirdId, poiBookingContent.thirdId) && Intrinsics.LJFF(this.url, poiBookingContent.url) && Intrinsics.LJFF(this.merchantId, poiBookingContent.merchantId) && Intrinsics.LJFF(this.logoUrl, poiBookingContent.logoUrl) && Intrinsics.LJFF(this.merchantName, poiBookingContent.merchantName) && Intrinsics.LJFF(this.ttoclid, poiBookingContent.ttoclid);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.thirdId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.logoUrl;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.merchantName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ttoclid;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiBookingContent(thirdId=");
        sbLIZ.append(this.thirdId);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", logoUrl=");
        sbLIZ.append(this.logoUrl);
        sbLIZ.append(", merchantName=");
        sbLIZ.append(this.merchantName);
        sbLIZ.append(", ttoclid=");
        sbLIZ.append(this.ttoclid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isValid() {
        return C123100dR.LIZ(this.url);
    }

    public final String id() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.thirdId);
        sbLIZ.append(this.merchantId);
        sbLIZ.append(this.merchantName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getThirdId() {
        return this.thirdId;
    }

    public final String getTtoclid() {
        return this.ttoclid;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        PoiBookingContent poiBookingContent;
        if (interfaceC1891350zJl instanceof PoiBookingContent) {
            poiBookingContent = (PoiBookingContent) interfaceC1891350zJl;
        } else {
            poiBookingContent = null;
        }
        if (poiBookingContent == null || !Intrinsics.LJFF(this.thirdId, poiBookingContent.thirdId) || !Intrinsics.LJFF(this.merchantId, poiBookingContent.merchantId) || !Intrinsics.LJFF(this.merchantName, poiBookingContent.merchantName)) {
            return false;
        }
        return true;
    }

    public PoiBookingContent(String str, String str2, String str3, UrlModel urlModel, String str4, String str5) {
        this.thirdId = str;
        this.url = str2;
        this.merchantId = str3;
        this.logoUrl = urlModel;
        this.merchantName = str4;
        this.ttoclid = str5;
    }
}
