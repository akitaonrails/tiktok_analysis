package com.ss.android.ugc.aweme.poi.detail.container.newarchi.data;

import X.AbstractC1180940gpw;
import X.C00I4;
import X.C040J;
import X.C080U;
import X.C098200Yq;
import X.C09CT;
import X.C1173170gdP;
import X.C1180000goQ;
import X.C11NZ;
import X.C1201190hMb;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C1494600ozq;
import X.C1515820pY4;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1893310zMv;
import X.C19719612Di;
import X.C2188811AlT;
import X.C2365509Or;
import X.C325850Cpz;
import X.C786410Ut5;
import X.InterfaceC1196330hEl;
import X.InterfaceC1201180hMa;
import X.InterfaceC1485705rj;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1891350zJl;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DialogContent;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DisclaimerData;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.DeprecatedPageInfo;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.ss.android.ugc.aweme.slash.data.SlashComponentBaseModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiDetailApi {
    public static final C325850Cpz LIZ = C325850Cpz.LIZ;

    public static final class ChartsBasicData extends AbstractC1180940gpw implements Serializable {
        public static final C1173170gdP Companion = new Object() { // from class: X.0gdP
        };

        @C09CT("chart_contents")
        public final List<ChartContent> chartContents;

        @C09CT("chart_tabs")
        public final List<ChartTab> chartTabs;

        @C09CT("chart_ui_type")
        public final Integer chartUIType;

        public ChartsBasicData() {
            this(null, null, null);
        }

        public final ChartsBasicData copy(List<ChartTab> list, List<ChartContent> list2, Integer num) {
            return new ChartsBasicData(list, list2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChartsBasicData)) {
                return false;
            }
            ChartsBasicData chartsBasicData = (ChartsBasicData) obj;
            return Intrinsics.LJFF(this.chartTabs, chartsBasicData.chartTabs) && Intrinsics.LJFF(this.chartContents, chartsBasicData.chartContents) && Intrinsics.LJFF(this.chartUIType, chartsBasicData.chartUIType);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            List<ChartTab> list = this.chartTabs;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<ChartContent> list2 = this.chartContents;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.chartUIType;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartsBasicData(chartTabs=");
            sbLIZ.append(this.chartTabs);
            sbLIZ.append(", chartContents=");
            sbLIZ.append(this.chartContents);
            sbLIZ.append(", chartUIType=");
            sbLIZ.append(this.chartUIType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean hasChartsBasicData$poi_release() {
            List<ChartContent> list;
            List<ChartTab> list2 = this.chartTabs;
            return list2 != null && list2.size() > 0 && (list = this.chartContents) != null && list.size() > 0;
        }

        public final List<ChartContent> getChartContents() {
            return this.chartContents;
        }

        public final List<ChartTab> getChartTabs() {
            return this.chartTabs;
        }

        public final Integer getChartUIType() {
            return this.chartUIType;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            if (baseComponentData instanceof ChartsBasicData) {
                List<ChartTab> list = this.chartTabs;
                Integer numValueOf4 = null;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                ChartsBasicData chartsBasicData = (ChartsBasicData) baseComponentData;
                List<ChartTab> list2 = chartsBasicData.chartTabs;
                if (list2 != null) {
                    numValueOf2 = Integer.valueOf(list2.size());
                } else {
                    numValueOf2 = null;
                }
                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                    List<ChartContent> list3 = this.chartContents;
                    if (list3 != null) {
                        numValueOf3 = Integer.valueOf(list3.size());
                    } else {
                        numValueOf3 = null;
                    }
                    List<ChartContent> list4 = chartsBasicData.chartContents;
                    if (list4 != null) {
                        numValueOf4 = Integer.valueOf(list4.size());
                    }
                    if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                        List<ChartTab> list5 = this.chartTabs;
                        if (list5 != null) {
                            List list6 = chartsBasicData.chartTabs;
                            if (list6 == null) {
                                list6 = C13BV.INSTANCE;
                            }
                            Iterator<ChartTab> it2 = list5.iterator();
                            Iterator it3 = list6.iterator();
                            ArrayList arrayList = new ArrayList(Math.min(C15438062q.LJIJJ(list5, 10), C15438062q.LJIJJ(list6, 10)));
                            while (it2.hasNext() && it3.hasNext()) {
                                arrayList.add(Boolean.valueOf(it2.next().areContentsTheSame$poi_release(it3.next())));
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (!((Boolean) it4.next()).booleanValue()) {
                                    }
                                }
                            }
                        }
                        List<ChartContent> list7 = this.chartContents;
                        if (list7 != null) {
                            List list8 = chartsBasicData.chartContents;
                            if (list8 == null) {
                                list8 = C13BV.INSTANCE;
                            }
                            Iterator<ChartContent> it5 = list7.iterator();
                            Iterator it6 = list8.iterator();
                            ArrayList arrayList2 = new ArrayList(Math.min(C15438062q.LJIJJ(list7, 10), C15438062q.LJIJJ(list8, 10)));
                            while (it5.hasNext() && it6.hasNext()) {
                                arrayList2.add(Boolean.valueOf(it5.next().areContentsTheSame((ChartContent) it6.next())));
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    if (!((Boolean) it7.next()).booleanValue()) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public ChartsBasicData(List<ChartTab> list, List<ChartContent> list2, Integer num) {
            this.chartTabs = list;
            this.chartContents = list2;
            this.chartUIType = num;
        }
    }

    public static final class PoiDetailLynxResponse extends BaseComponentData implements Serializable {
        public final Map<String, String> LL;

        @C09CT("business_data")
        public final String businessData;

        @C09CT("show_bottom_bar_when_disappear")
        public final Boolean showBottomBarWhenDisappear;

        @C09CT("url")
        public final String url;

        public PoiDetailLynxResponse() {
            this(null, null, null, null);
        }

        public final PoiDetailLynxResponse copy(String str, String str2, Boolean bool, Map<String, String> map) {
            return new PoiDetailLynxResponse(str, str2, bool, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailLynxResponse)) {
                return false;
            }
            PoiDetailLynxResponse poiDetailLynxResponse = (PoiDetailLynxResponse) obj;
            return Intrinsics.LJFF(this.url, poiDetailLynxResponse.url) && Intrinsics.LJFF(this.businessData, poiDetailLynxResponse.businessData) && Intrinsics.LJFF(this.showBottomBarWhenDisappear, poiDetailLynxResponse.showBottomBarWhenDisappear) && Intrinsics.LJFF(this.LL, poiDetailLynxResponse.LL);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.businessData;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.showBottomBarWhenDisappear;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, String> map = this.LL;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiDetailLynxResponse(url=");
            sbLIZ.append(this.url);
            sbLIZ.append(", businessData=");
            sbLIZ.append(this.businessData);
            sbLIZ.append(", showBottomBarWhenDisappear=");
            sbLIZ.append(this.showBottomBarWhenDisappear);
            sbLIZ.append(", attachedDataList=");
            sbLIZ.append(this.LL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean hasLynxData() {
            return C123100dR.LIZ(this.url);
        }

        public final Map<String, String> getAttachedDataList() {
            return this.LL;
        }

        public final String getBusinessData() {
            return this.businessData;
        }

        public final Boolean getShowBottomBarWhenDisappear() {
            return this.showBottomBarWhenDisappear;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            BaseComponentData baseComponentData;
            boolean zAreItemTheSame = super.areItemTheSame(interfaceC1891350zJl);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiLynxCell areItemTheSame ");
            sbLIZ.append(zAreItemTheSame);
            sbLIZ.append(" , instanceId:");
            sbLIZ.append(this.instanceId);
            sbLIZ.append(", otherInstanceId:");
            String str = null;
            if ((interfaceC1891350zJl instanceof PoiDetailLynxResponse) && (baseComponentData = (BaseComponentData) interfaceC1891350zJl) != null) {
                str = baseComponentData.instanceId;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return zAreItemTheSame;
        }

        public PoiDetailLynxResponse(String str, String str2, Boolean bool, Map<String, String> map) {
            this.url = str;
            this.businessData = str2;
            this.showBottomBarWhenDisappear = bool;
            this.LL = map;
        }
    }

    public static final class PoiDetailProductModel implements Serializable, InterfaceC1891350zJl {

        @C09CT("click_url")
        public final String clickUrl;

        @C09CT("compliance_theme")
        public final Integer complianceTheme;

        @C09CT("cta")
        public final String cta;

        @C09CT("first_category")
        public final String firstCategory;

        @C09CT("is_close_loop")
        public final boolean isCloseLoop;

        @C09CT("price_fallback_msg")
        public final String priceFallbackMsg;

        @C09CT("price_information")
        public final PriceInformation priceInformation;

        @C09CT("product_id")
        public final String productId;

        @C09CT("product_img_url")
        public final UrlModel productImage;

        @C09CT("product_name")
        public final String productName;

        @C09CT("product_sub_tag")
        public final String productSubTag;

        @C09CT("product_type")
        public final String productType;

        @C09CT("selling_points")
        public final List<String> sellingPoints;

        @C09CT("track_info")
        public final String trackInfo;

        @C09CT("ttoclid")
        public final String ttoclid;

        public PoiDetailProductModel() {
            this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null);
        }

        public final PoiDetailProductModel copy(String str, String str2, UrlModel urlModel, String str3, List<String> list, PriceInformation priceInformation, String str4, String str5, boolean z, String str6, String str7, String str8, Integer num, String str9, String str10) {
            return new PoiDetailProductModel(str, str2, urlModel, str3, list, priceInformation, str4, str5, z, str6, str7, str8, num, str9, str10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailProductModel)) {
                return false;
            }
            PoiDetailProductModel poiDetailProductModel = (PoiDetailProductModel) obj;
            return Intrinsics.LJFF(this.productId, poiDetailProductModel.productId) && Intrinsics.LJFF(this.productName, poiDetailProductModel.productName) && Intrinsics.LJFF(this.productImage, poiDetailProductModel.productImage) && Intrinsics.LJFF(this.productSubTag, poiDetailProductModel.productSubTag) && Intrinsics.LJFF(this.sellingPoints, poiDetailProductModel.sellingPoints) && Intrinsics.LJFF(this.priceInformation, poiDetailProductModel.priceInformation) && Intrinsics.LJFF(this.cta, poiDetailProductModel.cta) && Intrinsics.LJFF(this.trackInfo, poiDetailProductModel.trackInfo) && this.isCloseLoop == poiDetailProductModel.isCloseLoop && Intrinsics.LJFF(this.clickUrl, poiDetailProductModel.clickUrl) && Intrinsics.LJFF(this.firstCategory, poiDetailProductModel.firstCategory) && Intrinsics.LJFF(this.ttoclid, poiDetailProductModel.ttoclid) && Intrinsics.LJFF(this.complianceTheme, poiDetailProductModel.complianceTheme) && Intrinsics.LJFF(this.productType, poiDetailProductModel.productType) && Intrinsics.LJFF(this.priceFallbackMsg, poiDetailProductModel.priceFallbackMsg);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.productId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.productName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlModel urlModel = this.productImage;
            int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            String str3 = this.productSubTag;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.sellingPoints;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            PriceInformation priceInformation = this.priceInformation;
            int iHashCode6 = (iHashCode5 + (priceInformation == null ? 0 : priceInformation.hashCode())) * 31;
            String str4 = this.cta;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.trackInfo;
            int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isCloseLoop)) * 31;
            String str6 = this.clickUrl;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.firstCategory;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.ttoclid;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num = this.complianceTheme;
            int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            String str9 = this.productType;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.priceFallbackMsg;
            return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
        }

        public String toString() {
            return "PoiDetailProductModel(productId=" + this.productId + ", productName=" + this.productName + ", productImage=" + this.productImage + ", productSubTag=" + this.productSubTag + ", sellingPoints=" + this.sellingPoints + ", priceInformation=" + this.priceInformation + ", cta=" + this.cta + ", trackInfo=" + this.trackInfo + ", isCloseLoop=" + this.isCloseLoop + ", clickUrl=" + this.clickUrl + ", firstCategory=" + this.firstCategory + ", ttoclid=" + this.ttoclid + ", complianceTheme=" + this.complianceTheme + ", productType=" + this.productType + ", priceFallbackMsg=" + this.priceFallbackMsg + ')';
        }

        public final boolean isHotelCategory() {
            return Intrinsics.LJFF(this.firstCategory, "1");
        }

        public final String getClickUrl() {
            return this.clickUrl;
        }

        public final Integer getComplianceTheme() {
            return this.complianceTheme;
        }

        public final String getCta() {
            return this.cta;
        }

        public final String getFirstCategory() {
            return this.firstCategory;
        }

        public final String getPriceFallbackMsg() {
            return this.priceFallbackMsg;
        }

        public final PriceInformation getPriceInformation() {
            return this.priceInformation;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final UrlModel getProductImage() {
            return this.productImage;
        }

        public final String getProductName() {
            return this.productName;
        }

        public final String getProductSubTag() {
            return this.productSubTag;
        }

        public final String getProductType() {
            return this.productType;
        }

        public final List<String> getSellingPoints() {
            return this.sellingPoints;
        }

        public final String getTrackInfo() {
            return this.trackInfo;
        }

        public final String getTtoclid() {
            return this.ttoclid;
        }

        public final boolean isCloseLoop() {
            return this.isCloseLoop;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            PoiDetailProductModel poiDetailProductModel;
            String str = this.productId;
            String str2 = null;
            if ((interfaceC1891350zJl instanceof PoiDetailProductModel) && (poiDetailProductModel = (PoiDetailProductModel) interfaceC1891350zJl) != null) {
                str2 = poiDetailProductModel.productId;
            }
            return Intrinsics.LJFF(str, str2);
        }

        public PoiDetailProductModel(String str, String str2, UrlModel urlModel, String str3, List<String> list, PriceInformation priceInformation, String str4, String str5, boolean z, String str6, String str7, String str8, Integer num, String str9, String str10) {
            this.productId = str;
            this.productName = str2;
            this.productImage = urlModel;
            this.productSubTag = str3;
            this.sellingPoints = list;
            this.priceInformation = priceInformation;
            this.cta = str4;
            this.trackInfo = str5;
            this.isCloseLoop = z;
            this.clickUrl = str6;
            this.firstCategory = str7;
            this.ttoclid = str8;
            this.complianceTheme = num;
            this.productType = str9;
            this.priceFallbackMsg = str10;
        }
    }

    public static final class PoiGuidesBasicData extends BaseComponentData implements Serializable {

        @C09CT("poi_guides")
        public final List<PoiGuide> poiGuides;

        @C09CT("title")
        public final String title;

        public PoiGuidesBasicData() {
            this(null, null);
        }

        public final PoiGuidesBasicData copy(String str, List<PoiGuide> list) {
            return new PoiGuidesBasicData(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiGuidesBasicData)) {
                return false;
            }
            PoiGuidesBasicData poiGuidesBasicData = (PoiGuidesBasicData) obj;
            return Intrinsics.LJFF(this.title, poiGuidesBasicData.title) && Intrinsics.LJFF(this.poiGuides, poiGuidesBasicData.poiGuides);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<PoiGuide> list = this.poiGuides;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiGuidesBasicData(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", poiGuides=");
            sbLIZ.append(this.poiGuides);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean hasGuidesBasicData$poi_release() {
            List<PoiGuide> list = this.poiGuides;
            return list != null && (list.isEmpty() ^ true);
        }

        public final List<PoiGuide> getPoiGuides() {
            return this.poiGuides;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean areContentsTheSame(com.ss.android.ugc.aweme.slash.component.BaseComponentData r10) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiGuidesBasicData.areContentsTheSame(com.ss.android.ugc.aweme.slash.component.BaseComponentData):boolean");
        }

        public PoiGuidesBasicData(String str, List<PoiGuide> list) {
            this.title = str;
            this.poiGuides = list;
        }
    }

    public static final class PoiMultiMerchantProductShelvesResponse extends BaseComponentData implements Serializable {
        public String LL;

        @C09CT("compliance_theme")
        public final Integer complianceTheme;

        @C09CT("log_id")
        public final String logId;

        @C09CT("modal_view_title")
        public final String modalViewTitle;

        @C09CT("product_shelves")
        public final List<PoiDetailMerchantProductShelf> productShelves;

        @C09CT("should_show_disclaimer")
        public final Boolean shouldShowDisclaimer;

        @C09CT("style")
        public final Integer style;

        @C09CT("subtitle")
        public final String subtitle;

        @C09CT("title")
        public final String title;

        @C09CT("view_all_cta")
        public final String viewAllCta;

        @C09CT("view_all_popup_threshold")
        public final Integer viewAllPopupThreshold;

        @C09CT("view_all_threshold")
        public final Integer viewAllThreshold;

        public PoiMultiMerchantProductShelvesResponse() {
            this(3, 5, null, null, null, null, null, null, Boolean.TRUE, null, Integer.valueOf(C00I4.PRODUCT_GRID.getValue()));
        }

        public final PoiMultiMerchantProductShelvesResponse copy(Integer num, Integer num2, String str, String str2, String str3, String str4, List<PoiDetailMerchantProductShelf> list, String str5, Boolean bool, Integer num3, Integer num4) {
            return new PoiMultiMerchantProductShelvesResponse(num, num2, str, str2, str3, str4, list, str5, bool, num3, num4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiMultiMerchantProductShelvesResponse)) {
                return false;
            }
            PoiMultiMerchantProductShelvesResponse poiMultiMerchantProductShelvesResponse = (PoiMultiMerchantProductShelvesResponse) obj;
            return Intrinsics.LJFF(this.viewAllThreshold, poiMultiMerchantProductShelvesResponse.viewAllThreshold) && Intrinsics.LJFF(this.viewAllPopupThreshold, poiMultiMerchantProductShelvesResponse.viewAllPopupThreshold) && Intrinsics.LJFF(this.viewAllCta, poiMultiMerchantProductShelvesResponse.viewAllCta) && Intrinsics.LJFF(this.title, poiMultiMerchantProductShelvesResponse.title) && Intrinsics.LJFF(this.subtitle, poiMultiMerchantProductShelvesResponse.subtitle) && Intrinsics.LJFF(this.modalViewTitle, poiMultiMerchantProductShelvesResponse.modalViewTitle) && Intrinsics.LJFF(this.productShelves, poiMultiMerchantProductShelvesResponse.productShelves) && Intrinsics.LJFF(this.logId, poiMultiMerchantProductShelvesResponse.logId) && Intrinsics.LJFF(this.shouldShowDisclaimer, poiMultiMerchantProductShelvesResponse.shouldShowDisclaimer) && Intrinsics.LJFF(this.complianceTheme, poiMultiMerchantProductShelvesResponse.complianceTheme) && Intrinsics.LJFF(this.style, poiMultiMerchantProductShelvesResponse.style);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            Integer num = this.viewAllThreshold;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.viewAllPopupThreshold;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.viewAllCta;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.modalViewTitle;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<PoiDetailMerchantProductShelf> list = this.productShelves;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.logId;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.shouldShowDisclaimer;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num3 = this.complianceTheme;
            int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.style;
            return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiMultiMerchantProductShelvesResponse(viewAllThreshold=" + this.viewAllThreshold + ", viewAllPopupThreshold=" + this.viewAllPopupThreshold + ", viewAllCta=" + this.viewAllCta + ", title=" + this.title + ", subtitle=" + this.subtitle + ", modalViewTitle=" + this.modalViewTitle + ", productShelves=" + this.productShelves + ", logId=" + this.logId + ", shouldShowDisclaimer=" + this.shouldShowDisclaimer + ", complianceTheme=" + this.complianceTheme + ", style=" + this.style + ')';
        }

        public final boolean hasMultiMerchantShelves$poi_release() {
            List<PoiDetailMerchantProductShelf> list = this.productShelves;
            return list != null && list.size() > 0;
        }

        public final String poiProductHasPrice$poi_release() {
            String str = this.LL;
            if (str != null) {
                return str;
            }
            List<PoiDetailMerchantProductShelf> list = this.productShelves;
            String str2 = "-1";
            if (list != null) {
                Iterator<PoiDetailMerchantProductShelf> it2 = list.iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<PoiDetailProductModel> list2 = it2.next().products;
                    if (list2 != null) {
                        Iterator it3 = C13LP.LJJJJLI(list2).iterator();
                        while (it3.hasNext()) {
                            if (((PoiDetailProductModel) it3.next()).getPriceInformation() != null) {
                                str2 = "1";
                                break loop0;
                            }
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                    }
                }
            }
            this.LL = str2;
            return str2;
        }

        public final Integer getComplianceTheme() {
            return this.complianceTheme;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final String getModalViewTitle() {
            return this.modalViewTitle;
        }

        public final List<PoiDetailMerchantProductShelf> getProductShelves() {
            return this.productShelves;
        }

        public final Boolean getShouldShowDisclaimer() {
            return this.shouldShowDisclaimer;
        }

        public final Integer getStyle() {
            return this.style;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getViewAllCta() {
            return this.viewAllCta;
        }

        public final Integer getViewAllPopupThreshold() {
            return this.viewAllPopupThreshold;
        }

        public final Integer getViewAllThreshold() {
            return this.viewAllThreshold;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            ArrayList arrayList;
            if (baseComponentData instanceof PoiMultiMerchantProductShelvesResponse) {
                List<PoiDetailMerchantProductShelf> list = this.productShelves;
                ArrayList arrayList2 = null;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<PoiDetailMerchantProductShelf> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().merchantId);
                    }
                } else {
                    arrayList = null;
                }
                List<PoiDetailMerchantProductShelf> list2 = ((PoiMultiMerchantProductShelvesResponse) baseComponentData).productShelves;
                if (list2 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<PoiDetailMerchantProductShelf> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().merchantId);
                    }
                }
                if (Intrinsics.LJFF(arrayList, arrayList2)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public PoiMultiMerchantProductShelvesResponse(Integer num, Integer num2, String str, String str2, String str3, String str4, List<PoiDetailMerchantProductShelf> list, String str5, Boolean bool, Integer num3, Integer num4) {
            this.viewAllThreshold = num;
            this.viewAllPopupThreshold = num2;
            this.viewAllCta = str;
            this.title = str2;
            this.subtitle = str3;
            this.modalViewTitle = str4;
            this.productShelves = list;
            this.logId = str5;
            this.shouldShowDisclaimer = bool;
            this.complianceTheme = num3;
            this.style = num4;
        }
    }

    public static final class PoiProductShelvesResponse extends BaseComponentData implements Serializable {
        public String LL;

        @C09CT("compliance_theme")
        public final Integer complianceTheme;

        @C09CT("first_page_track_info")
        public final String firstPageTrackInfo;

        @C09CT("log_id")
        public final String logId;

        @C09CT("modal_view_title")
        public final String modalViewTitle;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("privacy_popup")
        public final PrivacyPopupModel privacyPopupModel;

        @C09CT("product_shelves")
        public final List<PoiDetailProductShelf> productShelves;

        @C09CT("product_show_in_shelf_track_info")
        public final String productShowInShelfTrackInfo;

        @C09CT("should_show_disclaimer")
        public final Boolean shouldShowDisclaimer;

        @C09CT("subtitle")
        public final String subtitle;

        @C09CT("title")
        public final String title;

        @C09CT("view_all_cta")
        public final String viewAllCta;

        @C09CT("view_all_popup_threshold")
        public final Integer viewAllPopupThreshold;

        @C09CT("view_all_threshold")
        public final Integer viewAllThreshold;

        public PoiProductShelvesResponse() {
            this(3, 5, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null);
        }

        public final PoiProductShelvesResponse copy(Integer num, Integer num2, String str, String str2, String str3, String str4, List<PoiDetailProductShelf> list, String str5, String str6, String str7, Boolean bool, String str8, Integer num3, PrivacyPopupModel privacyPopupModel) {
            return new PoiProductShelvesResponse(num, num2, str, str2, str3, str4, list, str5, str6, str7, bool, str8, num3, privacyPopupModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiProductShelvesResponse)) {
                return false;
            }
            PoiProductShelvesResponse poiProductShelvesResponse = (PoiProductShelvesResponse) obj;
            return Intrinsics.LJFF(this.viewAllThreshold, poiProductShelvesResponse.viewAllThreshold) && Intrinsics.LJFF(this.viewAllPopupThreshold, poiProductShelvesResponse.viewAllPopupThreshold) && Intrinsics.LJFF(this.viewAllCta, poiProductShelvesResponse.viewAllCta) && Intrinsics.LJFF(this.title, poiProductShelvesResponse.title) && Intrinsics.LJFF(this.subtitle, poiProductShelvesResponse.subtitle) && Intrinsics.LJFF(this.modalViewTitle, poiProductShelvesResponse.modalViewTitle) && Intrinsics.LJFF(this.productShelves, poiProductShelvesResponse.productShelves) && Intrinsics.LJFF(this.firstPageTrackInfo, poiProductShelvesResponse.firstPageTrackInfo) && Intrinsics.LJFF(this.productShowInShelfTrackInfo, poiProductShelvesResponse.productShowInShelfTrackInfo) && Intrinsics.LJFF(this.logId, poiProductShelvesResponse.logId) && Intrinsics.LJFF(this.shouldShowDisclaimer, poiProductShelvesResponse.shouldShowDisclaimer) && Intrinsics.LJFF(this.poiId, poiProductShelvesResponse.poiId) && Intrinsics.LJFF(this.complianceTheme, poiProductShelvesResponse.complianceTheme) && Intrinsics.LJFF(this.privacyPopupModel, poiProductShelvesResponse.privacyPopupModel);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            Integer num = this.viewAllThreshold;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.viewAllPopupThreshold;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.viewAllCta;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.modalViewTitle;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<PoiDetailProductShelf> list = this.productShelves;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.firstPageTrackInfo;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.productShowInShelfTrackInfo;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.logId;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.shouldShowDisclaimer;
            int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str8 = this.poiId;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num3 = this.complianceTheme;
            int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
            PrivacyPopupModel privacyPopupModel = this.privacyPopupModel;
            return iHashCode13 + (privacyPopupModel != null ? privacyPopupModel.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiProductShelvesResponse(viewAllThreshold=" + this.viewAllThreshold + ", viewAllPopupThreshold=" + this.viewAllPopupThreshold + ", viewAllCta=" + this.viewAllCta + ", title=" + this.title + ", subtitle=" + this.subtitle + ", modalViewTitle=" + this.modalViewTitle + ", productShelves=" + this.productShelves + ", firstPageTrackInfo=" + this.firstPageTrackInfo + ", productShowInShelfTrackInfo=" + this.productShowInShelfTrackInfo + ", logId=" + this.logId + ", shouldShowDisclaimer=" + this.shouldShowDisclaimer + ", poiId=" + this.poiId + ", complianceTheme=" + this.complianceTheme + ", privacyPopupModel=" + this.privacyPopupModel + ')';
        }

        public final boolean hasShelvesContent$poi_release() {
            List<PoiDetailProductShelf> list = this.productShelves;
            return list != null && list.size() > 0;
        }

        public final String poiProductHasPrice$poi_release() {
            Object c098200Yq;
            String str = this.LL;
            if (str != null) {
                return str;
            }
            String str2 = this.firstPageTrackInfo;
            if (str2 != null) {
                try {
                    this.LL = new JSONObject(str2).optString("poi_product_has_price");
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            return this.LL;
        }

        public final Integer getComplianceTheme() {
            return this.complianceTheme;
        }

        public final String getFirstPageTrackInfo() {
            return this.firstPageTrackInfo;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final String getModalViewTitle() {
            return this.modalViewTitle;
        }

        public final String getPoiId() {
            return this.poiId;
        }

        public final PrivacyPopupModel getPrivacyPopupModel() {
            return this.privacyPopupModel;
        }

        public final List<PoiDetailProductShelf> getProductShelves() {
            return this.productShelves;
        }

        public final String getProductShowInShelfTrackInfo() {
            return this.productShowInShelfTrackInfo;
        }

        public final Boolean getShouldShowDisclaimer() {
            return this.shouldShowDisclaimer;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getViewAllCta() {
            return this.viewAllCta;
        }

        public final Integer getViewAllPopupThreshold() {
            return this.viewAllPopupThreshold;
        }

        public final Integer getViewAllThreshold() {
            return this.viewAllThreshold;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            ArrayList arrayList;
            ?? arrayList2;
            List<PoiDetailProductModel> list;
            String productId;
            ?? arrayList3;
            List<PoiDetailProductModel> list2;
            String productId2;
            if (baseComponentData instanceof PoiProductShelvesResponse) {
                List<PoiDetailProductShelf> list3 = this.productShelves;
                ArrayList arrayList4 = null;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (PoiDetailProductShelf poiDetailProductShelf : list3) {
                        if (poiDetailProductShelf != null && (list2 = poiDetailProductShelf.products) != null) {
                            arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            for (PoiDetailProductModel poiDetailProductModel : list2) {
                                if (poiDetailProductModel != null) {
                                    productId2 = poiDetailProductModel.getProductId();
                                } else {
                                    productId2 = null;
                                }
                                arrayList3.add(productId2);
                            }
                        } else {
                            arrayList3 = C13BV.INSTANCE;
                        }
                        C19719612Di.LJJI(arrayList3, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                List<PoiDetailProductShelf> list4 = ((PoiProductShelvesResponse) baseComponentData).productShelves;
                if (list4 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (PoiDetailProductShelf poiDetailProductShelf2 : list4) {
                        if (poiDetailProductShelf2 != null && (list = poiDetailProductShelf2.products) != null) {
                            arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (PoiDetailProductModel poiDetailProductModel2 : list) {
                                if (poiDetailProductModel2 != null) {
                                    productId = poiDetailProductModel2.getProductId();
                                } else {
                                    productId = null;
                                }
                                arrayList2.add(productId);
                            }
                        } else {
                            arrayList2 = C13BV.INSTANCE;
                        }
                        C19719612Di.LJJI(arrayList2, arrayList5);
                    }
                    arrayList4 = arrayList5;
                }
                if (Intrinsics.LJFF(arrayList, arrayList4)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public PoiProductShelvesResponse(Integer num, Integer num2, String str, String str2, String str3, String str4, List<PoiDetailProductShelf> list, String str5, String str6, String str7, Boolean bool, String str8, Integer num3, PrivacyPopupModel privacyPopupModel) {
            this.viewAllThreshold = num;
            this.viewAllPopupThreshold = num2;
            this.viewAllCta = str;
            this.title = str2;
            this.subtitle = str3;
            this.modalViewTitle = str4;
            this.productShelves = list;
            this.firstPageTrackInfo = str5;
            this.productShowInShelfTrackInfo = str6;
            this.logId = str7;
            this.shouldShowDisclaimer = bool;
            this.poiId = str8;
            this.complianceTheme = num3;
            this.privacyPopupModel = privacyPopupModel;
        }
    }

    public static final class PoiRecommendDishesGroupInfo extends BaseComponentData implements Serializable {
        public static final C1180000goQ Companion = new Object() { // from class: X.0goQ
        };

        @C09CT("category_title")
        public final String categoryTitle;

        @C09CT("display_type")
        public final Integer displayType;

        @C09CT("more_button_click_event")
        public final String moreButtonClickEvent;

        @C09CT("more_button_icon")
        public final String moreButtonIcon;

        @C09CT("more_button_text")
        public final String moreButtonText;

        @C09CT("need_show_bottom_divider")
        public final boolean needShowBottomDivider;

        @C09CT("recommend_dishes")
        public final ArrayList<RecommendedDish> recommendDishes;

        @C09CT("title")
        public final String title;

        public PoiRecommendDishesGroupInfo() {
            this(null, null, null, null, null, null, null, true);
        }

        public final PoiRecommendDishesGroupInfo copy(String str, Integer num, ArrayList<RecommendedDish> arrayList, String str2, String str3, String str4, String str5, boolean z) {
            return new PoiRecommendDishesGroupInfo(str, num, arrayList, str2, str3, str4, str5, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiRecommendDishesGroupInfo)) {
                return false;
            }
            PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiRecommendDishesGroupInfo) obj;
            return Intrinsics.LJFF(this.title, poiRecommendDishesGroupInfo.title) && Intrinsics.LJFF(this.displayType, poiRecommendDishesGroupInfo.displayType) && Intrinsics.LJFF(this.recommendDishes, poiRecommendDishesGroupInfo.recommendDishes) && Intrinsics.LJFF(this.categoryTitle, poiRecommendDishesGroupInfo.categoryTitle) && Intrinsics.LJFF(this.moreButtonText, poiRecommendDishesGroupInfo.moreButtonText) && Intrinsics.LJFF(this.moreButtonClickEvent, poiRecommendDishesGroupInfo.moreButtonClickEvent) && Intrinsics.LJFF(this.moreButtonIcon, poiRecommendDishesGroupInfo.moreButtonIcon) && this.needShowBottomDivider == poiRecommendDishesGroupInfo.needShowBottomDivider;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.displayType;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ArrayList<RecommendedDish> arrayList = this.recommendDishes;
            int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str2 = this.categoryTitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.moreButtonText;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.moreButtonClickEvent;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.moreButtonIcon;
            return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needShowBottomDivider);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiRecommendDishesGroupInfo(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", displayType=");
            sbLIZ.append(this.displayType);
            sbLIZ.append(", recommendDishes=");
            sbLIZ.append(this.recommendDishes);
            sbLIZ.append(", categoryTitle=");
            sbLIZ.append(this.categoryTitle);
            sbLIZ.append(", moreButtonText=");
            sbLIZ.append(this.moreButtonText);
            sbLIZ.append(", moreButtonClickEvent=");
            sbLIZ.append(this.moreButtonClickEvent);
            sbLIZ.append(", moreButtonIcon=");
            sbLIZ.append(this.moreButtonIcon);
            sbLIZ.append(", needShowBottomDivider=");
            sbLIZ.append(this.needShowBottomDivider);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean hasRecommendDishes$poi_release() {
            ArrayList<RecommendedDish> arrayList = this.recommendDishes;
            return arrayList != null && (arrayList.isEmpty() ^ true);
        }

        public final boolean isAiSummaryRecommendDishes$poi_release() {
            Integer num = this.displayType;
            return num != null && num.intValue() == 3;
        }

        public final boolean isNoPictureTypeRecommendDishes$poi_release() {
            Integer num = this.displayType;
            return num != null && num.intValue() == 2;
        }

        public final boolean isPictureTypeRecommendDishes$poi_release() {
            Integer num = this.displayType;
            return num != null && num.intValue() == 1;
        }

        public final String getCategoryTitle() {
            return this.categoryTitle;
        }

        public final Integer getDisplayType() {
            return this.displayType;
        }

        public final String getMoreButtonClickEvent() {
            return this.moreButtonClickEvent;
        }

        public final String getMoreButtonIcon() {
            return this.moreButtonIcon;
        }

        public final String getMoreButtonText() {
            return this.moreButtonText;
        }

        public final boolean getNeedShowBottomDivider() {
            return this.needShowBottomDivider;
        }

        public final ArrayList<RecommendedDish> getRecommendDishes() {
            return this.recommendDishes;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            Integer numValueOf;
            Integer numValueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            RecommendedDish recommendedDish;
            if (baseComponentData instanceof PoiRecommendDishesGroupInfo) {
                ArrayList<RecommendedDish> arrayList3 = this.recommendDishes;
                if (arrayList3 != null) {
                    numValueOf = Integer.valueOf(arrayList3.size());
                } else {
                    numValueOf = null;
                }
                PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiRecommendDishesGroupInfo) baseComponentData;
                ArrayList<RecommendedDish> arrayList4 = poiRecommendDishesGroupInfo.recommendDishes;
                if (arrayList4 != null) {
                    numValueOf2 = Integer.valueOf(arrayList4.size());
                } else {
                    numValueOf2 = null;
                }
                if (Intrinsics.LJFF(numValueOf, numValueOf2) && Intrinsics.LJFF(this.title, poiRecommendDishesGroupInfo.title)) {
                    ArrayList<RecommendedDish> arrayList5 = this.recommendDishes;
                    if (arrayList5 != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                        Iterator<RecommendedDish> it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getDishId());
                        }
                    } else {
                        arrayList = null;
                    }
                    ArrayList<RecommendedDish> arrayList6 = poiRecommendDishesGroupInfo.recommendDishes;
                    if (arrayList6 != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                        Iterator<RecommendedDish> it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(it3.next().getDishId());
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (Intrinsics.LJFF(arrayList, arrayList2)) {
                        ArrayList<RecommendedDish> arrayList7 = this.recommendDishes;
                        if (arrayList7 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            int i = 0;
                            for (RecommendedDish recommendedDish2 : arrayList7) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    RecommendedDish recommendedDish3 = recommendedDish2;
                                    ArrayList<RecommendedDish> arrayList9 = poiRecommendDishesGroupInfo.recommendDishes;
                                    if (arrayList9 == null || (recommendedDish = (RecommendedDish) C13LP.LJJJLZIJ(i, arrayList9)) == null || !recommendedDish3.areContentsTheSame(recommendedDish)) {
                                        arrayList8.add(recommendedDish2);
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            if (arrayList8.isEmpty()) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public PoiRecommendDishesGroupInfo(String str, Integer num, ArrayList<RecommendedDish> arrayList, String str2, String str3, String str4, String str5, boolean z) {
            this.title = str;
            this.displayType = num;
            this.recommendDishes = arrayList;
            this.categoryTitle = str2;
            this.moreButtonText = str3;
            this.moreButtonClickEvent = str4;
            this.moreButtonIcon = str5;
            this.needShowBottomDivider = z;
        }
    }

    @InterfaceC1501200pAU("/tiktok/poi/multi_medium/list/v1")
    C11NZ<PoiTopVideosLoadMoreResponse> LIZ(@InterfaceC1501120pAM("poi_id") String str, @InterfaceC1501120pAM("cursor") String str2, @InterfaceC1501120pAM("data_version") String str3, @InterfaceC1501120pAM("size") Integer num, @InterfaceC1501120pAM("tab_code") String str4, @InterfaceC1501120pAM("layout_style") Integer num2);

    @InterfaceC1501200pAU("/tiktok/poi/construct_message/v1")
    C11NZ<PoiShareMessageResponse> LIZIZ(@InterfaceC1501120pAM("poi_id") String str);

    @InterfaceC1501200pAU("/tiktok/poi/ai/subsummary/videos/get/v1")
    C11NZ<PoiAiSummaryVideosInfo> LIZJ(@InterfaceC1501120pAM("poi_id") String str, @InterfaceC1501120pAM("dimension_key") String str2, @InterfaceC1501120pAM("cursor") String str3, @InterfaceC1501120pAM("aweme_ids") String str4, @InterfaceC1501120pAM("filter_aweme_ids") String str5, @InterfaceC1501120pAM("data_version") String str6);

    @InterfaceC1501200pAU("/tiktok/poi/slash/v1")
    C11NZ<PoiDetailDataModel> getPoiDetailData(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("slash_param") String str2, @InterfaceC1501120pAM("service_type") String str3, @InterfaceC1501120pAM("poi_id") String str4, @InterfaceC1501120pAM("group_id") String str5, @InterfaceC1501120pAM("enter_from") String str6, @InterfaceC1501120pAM("ad_click_id") String str7, @InterfaceC1501120pAM("poi_review_scene") int i, @InterfaceC1501120pAM("poi_review_count") int i2, @InterfaceC1501120pAM("poi_review_cursor") long j, @InterfaceC1501120pAM("region_discovery_scene") int i3, @InterfaceC1501120pAM("region_discovery_sub_scene") Integer num, @InterfaceC1501120pAM("region_discovery_tab_code") String str8, @InterfaceC1501120pAM("poi_video_list_cursor") long j2, @InterfaceC1501120pAM("poi_video_list_search_id") String str9, @InterfaceC1501120pAM("poi_merged_list_count") int i4, @InterfaceC1501120pAM("has_more_aweme") int i5, @InterfaceC1501120pAM("has_more_review") int i6, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC1501120pAM("privacy_auth_status_query_required") boolean z);

    @C040J
    @InterfaceC1501200pAU
    C11NZ<C1515820pY4<PoiDetailDataModel>> getPoiDetailDataByChunk(@InterfaceC1485705rj String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("slash_param") String str3, @InterfaceC1501120pAM("service_type") String str4, @InterfaceC1501120pAM("poi_id") String str5, @InterfaceC1501120pAM("group_id") String str6, @InterfaceC1501120pAM("enter_from") String str7, @InterfaceC1501120pAM("ad_click_id") String str8, @InterfaceC1501120pAM("poi_review_scene") int i, @InterfaceC1501120pAM("poi_review_count") int i2, @InterfaceC1501120pAM("poi_review_cursor") long j, @InterfaceC1501120pAM("region_discovery_scene") int i3, @InterfaceC1501120pAM("region_discovery_sub_scene") int i4, @InterfaceC1501120pAM("region_discovery_tab_code") String str9, @InterfaceC1501120pAM("poi_video_list_cursor") long j2, @InterfaceC1501120pAM("poi_video_list_search_id") String str10, @InterfaceC1501120pAM("poi_merged_list_count") int i5, @InterfaceC1501120pAM("has_more_aweme") int i6, @InterfaceC1501120pAM("has_more_review") int i7, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj, @InterfaceC1501120pAM("privacy_auth_status_query_required") boolean z);

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiAiSummaryVideosInfo extends BaseResponse implements Serializable {

        @C09CT("cursor")
        public final String cursor;

        @C09CT("data_version")
        public final String dataVersion;

        @C09CT("has_more")
        public final Boolean hasMore;

        @C09CT("videos")
        public final List<PoiAiSubSummarySourceItem> videoInfoList;

        public PoiAiSummaryVideosInfo() {
            this(null, null, null, null);
        }

        public final PoiAiSummaryVideosInfo copy(Boolean bool, String str, String str2, List<PoiAiSubSummarySourceItem> list) {
            return new PoiAiSummaryVideosInfo(bool, str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiAiSummaryVideosInfo)) {
                return false;
            }
            PoiAiSummaryVideosInfo poiAiSummaryVideosInfo = (PoiAiSummaryVideosInfo) obj;
            return Intrinsics.LJFF(this.hasMore, poiAiSummaryVideosInfo.hasMore) && Intrinsics.LJFF(this.cursor, poiAiSummaryVideosInfo.cursor) && Intrinsics.LJFF(this.dataVersion, poiAiSummaryVideosInfo.dataVersion) && Intrinsics.LJFF(this.videoInfoList, poiAiSummaryVideosInfo.videoInfoList);
        }

        public int hashCode() {
            Boolean bool = this.hasMore;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.cursor;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.dataVersion;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PoiAiSubSummarySourceItem> list = this.videoInfoList;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiAiSummaryVideosInfo(hasMore=");
            sbLIZ.append(this.hasMore);
            sbLIZ.append(", cursor=");
            sbLIZ.append(this.cursor);
            sbLIZ.append(", dataVersion=");
            sbLIZ.append(this.dataVersion);
            sbLIZ.append(", videoInfoList=");
            sbLIZ.append(this.videoInfoList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final String getDataVersion() {
            return this.dataVersion;
        }

        public final Boolean getHasMore() {
            return this.hasMore;
        }

        public final List<PoiAiSubSummarySourceItem> getVideoInfoList() {
            return this.videoInfoList;
        }

        public PoiAiSummaryVideosInfo(Boolean bool, String str, String str2, List<PoiAiSubSummarySourceItem> list) {
            this.hasMore = bool;
            this.cursor = str;
            this.dataVersion = str2;
            this.videoInfoList = list;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiShareMessageResponse extends BaseResponse implements Serializable {

        @C09CT("content_pb")
        public final String contentPb;

        public PoiShareMessageResponse() {
            this(null);
        }

        public final PoiShareMessageResponse copy(String str) {
            return new PoiShareMessageResponse(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiShareMessageResponse) && Intrinsics.LJFF(this.contentPb, ((PoiShareMessageResponse) obj).contentPb);
        }

        public int hashCode() {
            String str = this.contentPb;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiShareMessageResponse(contentPb=");
            sbLIZ.append(this.contentPb);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getContentPb() {
            return this.contentPb;
        }

        public PoiShareMessageResponse(String str) {
            this.contentPb = str;
        }
    }

    public static final class ChartContent implements Serializable, InterfaceC1891350zJl {

        @C09CT("chart_type")
        public final Integer chartType;

        @C09CT("poi_list")
        public final List<ChartPoi> poiInfoList;

        @C09CT("view_all_cta")
        public final String viewAll;

        public ChartContent() {
            this(null, null, null);
        }

        public final ChartContent copy(List<ChartPoi> list, Integer num, String str) {
            return new ChartContent(list, num, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChartContent)) {
                return false;
            }
            ChartContent chartContent = (ChartContent) obj;
            return Intrinsics.LJFF(this.poiInfoList, chartContent.poiInfoList) && Intrinsics.LJFF(this.chartType, chartContent.chartType) && Intrinsics.LJFF(this.viewAll, chartContent.viewAll);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            List<ChartPoi> list = this.poiInfoList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.chartType;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.viewAll;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartContent(poiInfoList=");
            sbLIZ.append(this.poiInfoList);
            sbLIZ.append(", chartType=");
            sbLIZ.append(this.chartType);
            sbLIZ.append(", viewAll=");
            sbLIZ.append(this.viewAll);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Integer getChartType() {
            return this.chartType;
        }

        public final List<ChartPoi> getPoiInfoList() {
            return this.poiInfoList;
        }

        public final String getViewAll() {
            return this.viewAll;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            Integer numValueOf;
            if (interfaceC1891350zJl instanceof ChartContent) {
                ChartContent chartContent = (ChartContent) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.chartType, chartContent.chartType) && Intrinsics.LJFF(this.viewAll, chartContent.viewAll)) {
                    List<ChartPoi> list = this.poiInfoList;
                    Integer numValueOf2 = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    List<ChartPoi> list2 = chartContent.poiInfoList;
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        List<ChartPoi> list3 = this.poiInfoList;
                        if (list3 != null) {
                            List list4 = chartContent.poiInfoList;
                            if (list4 == null) {
                                list4 = C13BV.INSTANCE;
                            }
                            Iterator<ChartPoi> it2 = list3.iterator();
                            Iterator it3 = list4.iterator();
                            ArrayList arrayList = new ArrayList(Math.min(C15438062q.LJIJJ(list3, 10), C15438062q.LJIJJ(list4, 10)));
                            while (it2.hasNext() && it3.hasNext()) {
                                arrayList.add(Boolean.valueOf(it2.next().areContentsTheSame((ChartPoi) it3.next())));
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (!((Boolean) it4.next()).booleanValue()) {
                                    }
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            if ((interfaceC1891350zJl instanceof ChartContent) && Intrinsics.LJFF(this.chartType, ((ChartContent) interfaceC1891350zJl).chartType)) {
                return true;
            }
            return false;
        }

        public ChartContent(List<ChartPoi> list, Integer num, String str) {
            this.poiInfoList = list;
            this.chartType = num;
            this.viewAll = str;
        }
    }

    public static final class ChartPoi implements Serializable, InterfaceC1891350zJl {

        @C09CT("average_price_dollar_sign")
        public final PoiDetailTag averagePriceTag;

        @C09CT("chart_info")
        public final ChartInfo chartInfo;

        @C09CT("highlight_tags")
        public final List<String> highLightTag;

        @C09CT("head_imgs")
        public final List<UrlModel> img;

        @C09CT("local_service_key_category")
        public final String localServiceKeyCategory;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("poi_tags")
        public final List<String> poiTags;

        @C09CT("poi_review_summary")
        public final ChartPoiReviewInfo reviewsInfo;

        public ChartPoi() {
            this(null, null, null, null, null, null, null, null, null);
        }

        public final ChartPoi copy(String str, String str2, ChartInfo chartInfo, ChartPoiReviewInfo chartPoiReviewInfo, List<? extends UrlModel> list, List<String> list2, List<String> list3, PoiDetailTag poiDetailTag, String str3) {
            return new ChartPoi(str, str2, chartInfo, chartPoiReviewInfo, list, list2, list3, poiDetailTag, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChartPoi)) {
                return false;
            }
            ChartPoi chartPoi = (ChartPoi) obj;
            return Intrinsics.LJFF(this.poiId, chartPoi.poiId) && Intrinsics.LJFF(this.poiName, chartPoi.poiName) && Intrinsics.LJFF(this.chartInfo, chartPoi.chartInfo) && Intrinsics.LJFF(this.reviewsInfo, chartPoi.reviewsInfo) && Intrinsics.LJFF(this.img, chartPoi.img) && Intrinsics.LJFF(this.highLightTag, chartPoi.highLightTag) && Intrinsics.LJFF(this.poiTags, chartPoi.poiTags) && Intrinsics.LJFF(this.averagePriceTag, chartPoi.averagePriceTag) && Intrinsics.LJFF(this.localServiceKeyCategory, chartPoi.localServiceKeyCategory);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.poiId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.poiName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ChartInfo chartInfo = this.chartInfo;
            int iHashCode3 = (iHashCode2 + (chartInfo == null ? 0 : chartInfo.hashCode())) * 31;
            ChartPoiReviewInfo chartPoiReviewInfo = this.reviewsInfo;
            int iHashCode4 = (iHashCode3 + (chartPoiReviewInfo == null ? 0 : chartPoiReviewInfo.hashCode())) * 31;
            List<UrlModel> list = this.img;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.highLightTag;
            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.poiTags;
            int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
            PoiDetailTag poiDetailTag = this.averagePriceTag;
            int iHashCode8 = (iHashCode7 + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
            String str3 = this.localServiceKeyCategory;
            return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartPoi(poiId=");
            sbLIZ.append(this.poiId);
            sbLIZ.append(", poiName=");
            sbLIZ.append(this.poiName);
            sbLIZ.append(", chartInfo=");
            sbLIZ.append(this.chartInfo);
            sbLIZ.append(", reviewsInfo=");
            sbLIZ.append(this.reviewsInfo);
            sbLIZ.append(", img=");
            sbLIZ.append(this.img);
            sbLIZ.append(", highLightTag=");
            sbLIZ.append(this.highLightTag);
            sbLIZ.append(", poiTags=");
            sbLIZ.append(this.poiTags);
            sbLIZ.append(", averagePriceTag=");
            sbLIZ.append(this.averagePriceTag);
            sbLIZ.append(", localServiceKeyCategory=");
            sbLIZ.append(this.localServiceKeyCategory);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiDetailTag getAveragePriceTag() {
            return this.averagePriceTag;
        }

        public final ChartInfo getChartInfo() {
            return this.chartInfo;
        }

        public final List<String> getHighLightTag() {
            return this.highLightTag;
        }

        public final List<UrlModel> getImg() {
            return this.img;
        }

        public final String getLocalServiceKeyCategory() {
            return this.localServiceKeyCategory;
        }

        public final String getPoiId() {
            return this.poiId;
        }

        public final String getPoiName() {
            return this.poiName;
        }

        public final List<String> getPoiTags() {
            return this.poiTags;
        }

        public final ChartPoiReviewInfo getReviewsInfo() {
            return this.reviewsInfo;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            Integer numValueOf;
            if (interfaceC1891350zJl instanceof ChartPoi) {
                ChartPoi chartPoi = (ChartPoi) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.poiId, chartPoi.poiId) && Intrinsics.LJFF(this.poiName, chartPoi.poiName) && Intrinsics.LJFF(this.chartInfo, chartPoi.chartInfo) && Intrinsics.LJFF(this.reviewsInfo, chartPoi.reviewsInfo)) {
                    List<UrlModel> list = this.img;
                    Integer numValueOf2 = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    List<UrlModel> list2 = chartPoi.img;
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        List<UrlModel> list3 = this.img;
                        if (list3 != null) {
                            List list4 = chartPoi.img;
                            if (list4 == null) {
                                list4 = C13BV.INSTANCE;
                            }
                            Iterator<UrlModel> it2 = list3.iterator();
                            Iterator it3 = list4.iterator();
                            ArrayList arrayList = new ArrayList(Math.min(C15438062q.LJIJJ(list3, 10), C15438062q.LJIJJ(list4, 10)));
                            while (it2.hasNext() && it3.hasNext()) {
                                arrayList.add(Boolean.valueOf(Intrinsics.LJFF(it2.next().getUri(), ((UrlModel) it3.next()).getUri())));
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (!((Boolean) it4.next()).booleanValue()) {
                                    }
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            if ((interfaceC1891350zJl instanceof ChartPoi) && Intrinsics.LJFF(this.poiId, ((ChartPoi) interfaceC1891350zJl).poiId)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChartPoi(String str, String str2, ChartInfo chartInfo, ChartPoiReviewInfo chartPoiReviewInfo, List<? extends UrlModel> list, List<String> list2, List<String> list3, PoiDetailTag poiDetailTag, String str3) {
            this.poiId = str;
            this.poiName = str2;
            this.chartInfo = chartInfo;
            this.reviewsInfo = chartPoiReviewInfo;
            this.img = list;
            this.highLightTag = list2;
            this.poiTags = list3;
            this.averagePriceTag = poiDetailTag;
            this.localServiceKeyCategory = str3;
        }
    }

    public static final class ChartsBasicDataModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final ChartsBasicData data;

        public ChartsBasicDataModel() {
            this(null);
        }

        public final ChartsBasicDataModel copy(ChartsBasicData chartsBasicData) {
            return new ChartsBasicDataModel(chartsBasicData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChartsBasicDataModel) && Intrinsics.LJFF(this.data, ((ChartsBasicDataModel) obj).data);
        }

        public int hashCode() {
            ChartsBasicData chartsBasicData = this.data;
            if (chartsBasicData == null) {
                return 0;
            }
            return chartsBasicData.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartsBasicDataModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final ChartsBasicData getData() {
            return this.data;
        }

        public ChartsBasicDataModel(ChartsBasicData chartsBasicData) {
            super(null, null);
            this.data = chartsBasicData;
        }
    }

    public static final class DiscoveryInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiDiscoveryApi$PoiDiscoveryCardListResponse data;

        public DiscoveryInfoModel() {
            this(null);
        }

        public final DiscoveryInfoModel copy(PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
            return new DiscoveryInfoModel(poiDiscoveryApi$PoiDiscoveryCardListResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DiscoveryInfoModel) && Intrinsics.LJFF(this.data, ((DiscoveryInfoModel) obj).data);
        }

        public int hashCode() {
            PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = this.data;
            if (poiDiscoveryApi$PoiDiscoveryCardListResponse == null) {
                return 0;
            }
            return poiDiscoveryApi$PoiDiscoveryCardListResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DiscoveryInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiDiscoveryApi$PoiDiscoveryCardListResponse getData() {
            return this.data;
        }

        public DiscoveryInfoModel(PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
            super(null, null);
            this.data = poiDiscoveryApi$PoiDiscoveryCardListResponse;
        }
    }

    public static final class HeadInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiListApi.PoiDetailResponse data;

        public HeadInfoModel() {
            this(null);
        }

        public final HeadInfoModel copy(PoiListApi.PoiDetailResponse poiDetailResponse) {
            return new HeadInfoModel(poiDetailResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeadInfoModel) && Intrinsics.LJFF(this.data, ((HeadInfoModel) obj).data);
        }

        public int hashCode() {
            PoiListApi.PoiDetailResponse poiDetailResponse = this.data;
            if (poiDetailResponse == null) {
                return 0;
            }
            return poiDetailResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HeadInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiListApi.PoiDetailResponse getData() {
            return this.data;
        }

        public HeadInfoModel(PoiListApi.PoiDetailResponse poiDetailResponse) {
            super(null, null);
            this.data = poiDetailResponse;
        }
    }

    public static final class MultiMerchantProductShelvesInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiMultiMerchantProductShelvesResponse data;

        public MultiMerchantProductShelvesInfoModel() {
            this(null);
        }

        public final MultiMerchantProductShelvesInfoModel copy(PoiMultiMerchantProductShelvesResponse poiMultiMerchantProductShelvesResponse) {
            return new MultiMerchantProductShelvesInfoModel(poiMultiMerchantProductShelvesResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiMerchantProductShelvesInfoModel) && Intrinsics.LJFF(this.data, ((MultiMerchantProductShelvesInfoModel) obj).data);
        }

        public int hashCode() {
            PoiMultiMerchantProductShelvesResponse poiMultiMerchantProductShelvesResponse = this.data;
            if (poiMultiMerchantProductShelvesResponse == null) {
                return 0;
            }
            return poiMultiMerchantProductShelvesResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiMerchantProductShelvesInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiMultiMerchantProductShelvesResponse getData() {
            return this.data;
        }

        public MultiMerchantProductShelvesInfoModel(PoiMultiMerchantProductShelvesResponse poiMultiMerchantProductShelvesResponse) {
            super(null, null);
            this.data = poiMultiMerchantProductShelvesResponse;
        }

        public final void insertPageInfo(DeprecatedPageInfo deprecatedPageInfo) {
            String imprId;
            if (deprecatedPageInfo == null) {
                return;
            }
            setPageInfo(deprecatedPageInfo);
            LogPbBean logPbBean = deprecatedPageInfo.logPb;
            if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                insertLogId2Extra(this.data, imprId);
            }
        }

        private final void insertLogId2Extra(BaseResponse baseResponse, String str) {
            if (baseResponse == null) {
                return;
            }
            if (baseResponse.extra == null) {
                baseResponse.extra = new BaseResponse.ServerTimeExtra();
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
            if (serverTimeExtra != null) {
                serverTimeExtra.logid = str;
            }
        }
    }

    public static final class PoiDetailDataModel extends BaseResponse implements InterfaceC1201180hMa, InterfaceC1196330hEl {
        public final boolean LL;
        public String LLILLJJLI;
        public C1494600ozq<?> LLILLL;

        @C09CT("log_pb")
        public final LogPbBean logPb;

        @C09CT("nodes")
        public final NodesModel nodes;

        @C09CT("page_info")
        public final PageInfo pageInfo;

        public PoiDetailDataModel() {
            this(null, null, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailDataModel)) {
                return false;
            }
            PoiDetailDataModel poiDetailDataModel = (PoiDetailDataModel) obj;
            return Intrinsics.LJFF(this.pageInfo, poiDetailDataModel.pageInfo) && Intrinsics.LJFF(this.nodes, poiDetailDataModel.nodes) && Intrinsics.LJFF(this.logPb, poiDetailDataModel.logPb) && this.LL == poiDetailDataModel.LL;
        }

        @Override // X.InterfaceC1201180hMa
        public final /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public final int hashCode() {
            PageInfo pageInfo = this.pageInfo;
            int iHashCode = (pageInfo == null ? 0 : pageInfo.hashCode()) * 31;
            NodesModel nodesModel = this.nodes;
            int iHashCode2 = (iHashCode + (nodesModel == null ? 0 : nodesModel.hashCode())) * 31;
            LogPbBean logPbBean = this.logPb;
            return ((iHashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LL);
        }

        @Override // X.InterfaceC1196330hEl
        public final void setPreloadRealNetDurationMs(long j) {
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiDetailDataModel(pageInfo=");
            sbLIZ.append(this.pageInfo);
            sbLIZ.append(", nodes=");
            sbLIZ.append(this.nodes);
            sbLIZ.append(", logPb=");
            sbLIZ.append(this.logPb);
            sbLIZ.append(", isChunkLoading=");
            sbLIZ.append(this.LL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1196330hEl
        public final String getPreloadFlag() {
            return this.LLILLJJLI;
        }

        @Override // X.InterfaceC1201180hMa
        public final C1494600ozq<?> getRequestInfo() {
            return this.LLILLL;
        }

        @Override // X.InterfaceC1196330hEl
        public final void setPreloadFlag(String str) {
            this.LLILLJJLI = str;
        }

        @Override // X.InterfaceC1201180hMa
        public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
            this.LLILLL = c1494600ozq;
        }

        public PoiDetailDataModel(PageInfo pageInfo, NodesModel nodesModel, LogPbBean logPbBean, boolean z) {
            this.pageInfo = pageInfo;
            this.nodes = nodesModel;
            this.logPb = logPbBean;
            this.LL = z;
        }
    }

    public static final class PoiGuide implements Serializable, InterfaceC1891350zJl {

        @C09CT("guide_id")
        public final String guideId;

        @C09CT("guide_title")
        public final String guideTitle;

        @C09CT("img")
        public final UrlStruct img;

        @C09CT("item_id_list")
        public final List<String> itemIdList;

        public PoiGuide() {
            this(null, null, null, null);
        }

        public final PoiGuide copy(String str, String str2, UrlStruct urlStruct, List<String> list) {
            return new PoiGuide(str, str2, urlStruct, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiGuide)) {
                return false;
            }
            PoiGuide poiGuide = (PoiGuide) obj;
            return Intrinsics.LJFF(this.guideId, poiGuide.guideId) && Intrinsics.LJFF(this.guideTitle, poiGuide.guideTitle) && Intrinsics.LJFF(this.img, poiGuide.img) && Intrinsics.LJFF(this.itemIdList, poiGuide.itemIdList);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.guideId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.guideTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlStruct urlStruct = this.img;
            int iHashCode3 = (iHashCode2 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
            List<String> list = this.itemIdList;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiGuide(guideId=");
            sbLIZ.append(this.guideId);
            sbLIZ.append(", guideTitle=");
            sbLIZ.append(this.guideTitle);
            sbLIZ.append(", img=");
            sbLIZ.append(this.img);
            sbLIZ.append(", itemIdList=");
            sbLIZ.append(this.itemIdList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getGuideId() {
            return this.guideId;
        }

        public final String getGuideTitle() {
            return this.guideTitle;
        }

        public final UrlStruct getImg() {
            return this.img;
        }

        public final List<String> getItemIdList() {
            return this.itemIdList;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        public PoiGuide(String str, String str2, UrlStruct urlStruct, List<String> list) {
            this.guideId = str;
            this.guideTitle = str2;
            this.img = urlStruct;
            this.itemIdList = list;
        }
    }

    public static final class PoiGuideBasicDataModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiGuidesBasicData data;

        public PoiGuideBasicDataModel() {
            this(null);
        }

        public final PoiGuideBasicDataModel copy(PoiGuidesBasicData poiGuidesBasicData) {
            return new PoiGuideBasicDataModel(poiGuidesBasicData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiGuideBasicDataModel) && Intrinsics.LJFF(this.data, ((PoiGuideBasicDataModel) obj).data);
        }

        public int hashCode() {
            PoiGuidesBasicData poiGuidesBasicData = this.data;
            if (poiGuidesBasicData == null) {
                return 0;
            }
            return poiGuidesBasicData.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiGuideBasicDataModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiGuidesBasicData getData() {
            return this.data;
        }

        public PoiGuideBasicDataModel(PoiGuidesBasicData poiGuidesBasicData) {
            super(null, null);
            this.data = poiGuidesBasicData;
        }
    }

    public static final class PoiMergedListModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiListApi.PoiMergedListResponse data;

        public PoiMergedListModel() {
            this(null);
        }

        public final PoiMergedListModel copy(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
            return new PoiMergedListModel(poiMergedListResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiMergedListModel) && Intrinsics.LJFF(this.data, ((PoiMergedListModel) obj).data);
        }

        public int hashCode() {
            PoiListApi.PoiMergedListResponse poiMergedListResponse = this.data;
            if (poiMergedListResponse == null) {
                return 0;
            }
            return poiMergedListResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiMergedListModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiListApi.PoiMergedListResponse getData() {
            return this.data;
        }

        public PoiMergedListModel(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
            super(null, null);
            this.data = poiMergedListResponse;
        }
    }

    public static final class PoiMultiMediumTab extends BaseResponse implements Serializable {

        @C09CT("tab_code")
        public final String tabCode;

        @C09CT("tab_name")
        public final String tabName;

        public PoiMultiMediumTab() {
            this(null, null);
        }

        public final PoiMultiMediumTab copy(String str, String str2) {
            return new PoiMultiMediumTab(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiMultiMediumTab)) {
                return false;
            }
            PoiMultiMediumTab poiMultiMediumTab = (PoiMultiMediumTab) obj;
            return Intrinsics.LJFF(this.tabCode, poiMultiMediumTab.tabCode) && Intrinsics.LJFF(this.tabName, poiMultiMediumTab.tabName);
        }

        public int hashCode() {
            String str = this.tabCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tabName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiMultiMediumTab(tabCode=");
            sbLIZ.append(this.tabCode);
            sbLIZ.append(", tabName=");
            sbLIZ.append(this.tabName);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getTabCode() {
            return this.tabCode;
        }

        public final String getTabName() {
            return this.tabName;
        }

        public PoiMultiMediumTab(String str, String str2) {
            this.tabCode = str;
            this.tabName = str2;
        }
    }

    public static final class PoiTopVideosLoadMoreResponse extends BaseResponse implements Serializable {

        @C09CT("categories")
        public final List<PoiCategoryItems> categories;

        @C09CT("next_cursor")
        public final String cursor;

        @C09CT("data_version")
        public final String dataVersion;

        @C09CT("has_more")
        public final Boolean hasMore;

        @C09CT("layout_style")
        public final Integer layoutStyle;

        @C09CT("item_list")
        public final List<PoiListApi.PoiMergedListItem> listItems;

        @C09CT("post_bottom_bar_style")
        public final Integer postBottomBarStyle;

        @C09CT("tab_list")
        public final List<PoiMultiMediumTab> tabList;

        @C09CT("title")
        public final String title;

        public PoiTopVideosLoadMoreResponse() {
            this(null, null, null, null, null, null, null, null, null);
        }

        public final PoiTopVideosLoadMoreResponse copy(List<PoiListApi.PoiMergedListItem> list, String str, Boolean bool, String str2, List<PoiMultiMediumTab> list2, String str3, Integer num, Integer num2, List<PoiCategoryItems> list3) {
            return new PoiTopVideosLoadMoreResponse(list, str, bool, str2, list2, str3, num, num2, list3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiTopVideosLoadMoreResponse)) {
                return false;
            }
            PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse = (PoiTopVideosLoadMoreResponse) obj;
            return Intrinsics.LJFF(this.listItems, poiTopVideosLoadMoreResponse.listItems) && Intrinsics.LJFF(this.cursor, poiTopVideosLoadMoreResponse.cursor) && Intrinsics.LJFF(this.hasMore, poiTopVideosLoadMoreResponse.hasMore) && Intrinsics.LJFF(this.dataVersion, poiTopVideosLoadMoreResponse.dataVersion) && Intrinsics.LJFF(this.tabList, poiTopVideosLoadMoreResponse.tabList) && Intrinsics.LJFF(this.title, poiTopVideosLoadMoreResponse.title) && Intrinsics.LJFF(this.postBottomBarStyle, poiTopVideosLoadMoreResponse.postBottomBarStyle) && Intrinsics.LJFF(this.layoutStyle, poiTopVideosLoadMoreResponse.layoutStyle) && Intrinsics.LJFF(this.categories, poiTopVideosLoadMoreResponse.categories);
        }

        public int hashCode() {
            List<PoiListApi.PoiMergedListItem> list = this.listItems;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.cursor;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.hasMore;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.dataVersion;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PoiMultiMediumTab> list2 = this.tabList;
            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.postBottomBarStyle;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.layoutStyle;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<PoiCategoryItems> list3 = this.categories;
            return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiTopVideosLoadMoreResponse(listItems=");
            sbLIZ.append(this.listItems);
            sbLIZ.append(", cursor=");
            sbLIZ.append(this.cursor);
            sbLIZ.append(", hasMore=");
            sbLIZ.append(this.hasMore);
            sbLIZ.append(", dataVersion=");
            sbLIZ.append(this.dataVersion);
            sbLIZ.append(", tabList=");
            sbLIZ.append(this.tabList);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", postBottomBarStyle=");
            sbLIZ.append(this.postBottomBarStyle);
            sbLIZ.append(", layoutStyle=");
            sbLIZ.append(this.layoutStyle);
            sbLIZ.append(", categories=");
            sbLIZ.append(this.categories);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<PoiCategoryItems> getCategories() {
            return this.categories;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final String getDataVersion() {
            return this.dataVersion;
        }

        public final Boolean getHasMore() {
            return this.hasMore;
        }

        public final Integer getLayoutStyle() {
            return this.layoutStyle;
        }

        public final List<PoiListApi.PoiMergedListItem> getListItems() {
            return this.listItems;
        }

        public final Integer getPostBottomBarStyle() {
            return this.postBottomBarStyle;
        }

        public final List<PoiMultiMediumTab> getTabList() {
            return this.tabList;
        }

        public final String getTitle() {
            return this.title;
        }

        public PoiTopVideosLoadMoreResponse(List<PoiListApi.PoiMergedListItem> list, String str, Boolean bool, String str2, List<PoiMultiMediumTab> list2, String str3, Integer num, Integer num2, List<PoiCategoryItems> list3) {
            this.listItems = list;
            this.cursor = str;
            this.hasMore = bool;
            this.dataVersion = str2;
            this.tabList = list2;
            this.title = str3;
            this.postBottomBarStyle = num;
            this.layoutStyle = num2;
            this.categories = list3;
        }
    }

    public static final class PrivacyPopupModel extends BaseResponse implements Serializable {

        @C09CT("auth_status")
        public final Integer authStatus;

        @C09CT("exposure_count")
        public final Integer exposureCount;

        @C09CT("auth_popup")
        public final PrivacyPopupData popup;

        public PrivacyPopupModel() {
            this(null, null, null);
        }

        public final PrivacyPopupModel copy(Integer num, Integer num2, PrivacyPopupData privacyPopupData) {
            return new PrivacyPopupModel(num, num2, privacyPopupData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivacyPopupModel)) {
                return false;
            }
            PrivacyPopupModel privacyPopupModel = (PrivacyPopupModel) obj;
            return Intrinsics.LJFF(this.authStatus, privacyPopupModel.authStatus) && Intrinsics.LJFF(this.exposureCount, privacyPopupModel.exposureCount) && Intrinsics.LJFF(this.popup, privacyPopupModel.popup);
        }

        public int hashCode() {
            Integer num = this.authStatus;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.exposureCount;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            PrivacyPopupData privacyPopupData = this.popup;
            return iHashCode2 + (privacyPopupData != null ? privacyPopupData.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PrivacyPopupModel(authStatus=");
            sbLIZ.append(this.authStatus);
            sbLIZ.append(", exposureCount=");
            sbLIZ.append(this.exposureCount);
            sbLIZ.append(", popup=");
            sbLIZ.append(this.popup);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Integer getAuthStatus() {
            return this.authStatus;
        }

        public final Integer getExposureCount() {
            return this.exposureCount;
        }

        public final PrivacyPopupData getPopup() {
            return this.popup;
        }

        public PrivacyPopupModel(Integer num, Integer num2, PrivacyPopupData privacyPopupData) {
            this.authStatus = num;
            this.exposureCount = num2;
            this.popup = privacyPopupData;
        }
    }

    public static final class ProductShelvesInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiProductShelvesResponse data;

        public ProductShelvesInfoModel() {
            this(null);
        }

        public final ProductShelvesInfoModel copy(PoiProductShelvesResponse poiProductShelvesResponse) {
            return new ProductShelvesInfoModel(poiProductShelvesResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductShelvesInfoModel) && Intrinsics.LJFF(this.data, ((ProductShelvesInfoModel) obj).data);
        }

        public int hashCode() {
            PoiProductShelvesResponse poiProductShelvesResponse = this.data;
            if (poiProductShelvesResponse == null) {
                return 0;
            }
            return poiProductShelvesResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ProductShelvesInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiProductShelvesResponse getData() {
            return this.data;
        }

        public ProductShelvesInfoModel(PoiProductShelvesResponse poiProductShelvesResponse) {
            super(null, null);
            this.data = poiProductShelvesResponse;
        }

        public final void insertPageInfo(DeprecatedPageInfo deprecatedPageInfo) {
            String imprId;
            if (deprecatedPageInfo == null) {
                return;
            }
            setPageInfo(deprecatedPageInfo);
            LogPbBean logPbBean = deprecatedPageInfo.logPb;
            if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                insertLogId2Extra(this.data, imprId);
            }
        }

        private final void insertLogId2Extra(BaseResponse baseResponse, String str) {
            if (baseResponse == null) {
                return;
            }
            if (baseResponse.extra == null) {
                baseResponse.extra = new BaseResponse.ServerTimeExtra();
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
            if (serverTimeExtra != null) {
                serverTimeExtra.logid = str;
            }
        }
    }

    public static final class RecommendDishesInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiRecommendDishesGroupInfo data;

        public RecommendDishesInfoModel() {
            this(null);
        }

        public final RecommendDishesInfoModel copy(PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo) {
            return new RecommendDishesInfoModel(poiRecommendDishesGroupInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecommendDishesInfoModel) && Intrinsics.LJFF(this.data, ((RecommendDishesInfoModel) obj).data);
        }

        public int hashCode() {
            PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = this.data;
            if (poiRecommendDishesGroupInfo == null) {
                return 0;
            }
            return poiRecommendDishesGroupInfo.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RecommendDishesInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiRecommendDishesGroupInfo getData() {
            return this.data;
        }

        public RecommendDishesInfoModel(PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo) {
            super(null, null);
            this.data = poiRecommendDishesGroupInfo;
        }
    }

    public static final class RecommendedDish implements Serializable, InterfaceC1891350zJl {

        @C09CT("crop_images")
        public final List<UrlModel> cropImages;

        @C09CT("desc")
        public final String desc;

        @C09CT("dish_id")
        public final String dishId;

        @C09CT("images")
        public final List<UrlModel> images;

        @C09CT("like_num")
        public final long likeNum;

        @C09CT("name")
        public final String name;

        @C09CT("price_currency")
        public final String priceCurrency;

        @C09CT("price_num")
        public final String priceNum;

        @C09CT("user_liked")
        public final boolean userLiked;

        public RecommendedDish() {
            this(null, null, null, null, 0L, false, null, null, null);
        }

        public final RecommendedDish copy(String str, List<? extends UrlModel> list, String str2, String str3, long j, boolean z, String str4, String str5, List<? extends UrlModel> list2) {
            return new RecommendedDish(str, list, str2, str3, j, z, str4, str5, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendedDish)) {
                return false;
            }
            RecommendedDish recommendedDish = (RecommendedDish) obj;
            return Intrinsics.LJFF(this.dishId, recommendedDish.dishId) && Intrinsics.LJFF(this.images, recommendedDish.images) && Intrinsics.LJFF(this.name, recommendedDish.name) && Intrinsics.LJFF(this.desc, recommendedDish.desc) && this.likeNum == recommendedDish.likeNum && this.userLiked == recommendedDish.userLiked && Intrinsics.LJFF(this.priceNum, recommendedDish.priceNum) && Intrinsics.LJFF(this.priceCurrency, recommendedDish.priceCurrency) && Intrinsics.LJFF(this.cropImages, recommendedDish.cropImages);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.dishId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<UrlModel> list = this.images;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.desc;
            int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.likeNum)) * 31) + C786410Ut5.Z2(this.userLiked)) * 31;
            String str4 = this.priceNum;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.priceCurrency;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<UrlModel> list2 = this.cropImages;
            return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RecommendedDish(dishId=");
            sbLIZ.append(this.dishId);
            sbLIZ.append(", images=");
            sbLIZ.append(this.images);
            sbLIZ.append(", name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", desc=");
            sbLIZ.append(this.desc);
            sbLIZ.append(", likeNum=");
            sbLIZ.append(this.likeNum);
            sbLIZ.append(", userLiked=");
            sbLIZ.append(this.userLiked);
            sbLIZ.append(", priceNum=");
            sbLIZ.append(this.priceNum);
            sbLIZ.append(", priceCurrency=");
            sbLIZ.append(this.priceCurrency);
            sbLIZ.append(", cropImages=");
            sbLIZ.append(this.cropImages);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<UrlModel> getCropImages() {
            return this.cropImages;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getDishId() {
            return this.dishId;
        }

        public final List<UrlModel> getImages() {
            return this.images;
        }

        public final long getLikeNum() {
            return this.likeNum;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPriceCurrency() {
            return this.priceCurrency;
        }

        public final String getPriceNum() {
            return this.priceNum;
        }

        public final boolean getUserLiked() {
            return this.userLiked;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            if (!(interfaceC1891350zJl instanceof RecommendedDish)) {
                return false;
            }
            RecommendedDish recommendedDish = (RecommendedDish) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(this.dishId, recommendedDish.dishId)) {
                return false;
            }
            List<UrlModel> list = this.images;
            ArrayList arrayList4 = null;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<UrlModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getUri());
                }
            } else {
                arrayList = null;
            }
            List<UrlModel> list2 = recommendedDish.images;
            if (list2 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<UrlModel> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().getUri());
                }
            } else {
                arrayList2 = null;
            }
            if (!Intrinsics.LJFF(arrayList, arrayList2) || !Intrinsics.LJFF(this.name, recommendedDish.name) || !Intrinsics.LJFF(this.desc, recommendedDish.desc) || this.likeNum != recommendedDish.likeNum || this.userLiked != recommendedDish.userLiked || !Intrinsics.LJFF(this.priceNum, recommendedDish.priceNum) || !Intrinsics.LJFF(this.priceCurrency, recommendedDish.priceCurrency)) {
                return false;
            }
            List<UrlModel> list3 = this.cropImages;
            if (list3 != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<UrlModel> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().getUri());
                }
            } else {
                arrayList3 = null;
            }
            List<UrlModel> list4 = recommendedDish.cropImages;
            if (list4 != null) {
                arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<UrlModel> it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(it5.next().getUri());
                }
            }
            if (!Intrinsics.LJFF(arrayList3, arrayList4)) {
                return false;
            }
            return true;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            if (!(interfaceC1891350zJl instanceof RecommendedDish)) {
                return false;
            }
            return Intrinsics.LJFF(this.dishId, ((RecommendedDish) interfaceC1891350zJl).dishId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RecommendedDish(String str, List<? extends UrlModel> list, String str2, String str3, long j, boolean z, String str4, String str5, List<? extends UrlModel> list2) {
            this.dishId = str;
            this.images = list;
            this.name = str2;
            this.desc = str3;
            this.likeNum = j;
            this.userLiked = z;
            this.priceNum = str4;
            this.priceCurrency = str5;
            this.cropImages = list2;
        }
    }

    public static final class ReviewsInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiReviewsApi.PoiReviewListResponse data;

        public ReviewsInfoModel() {
            this(null);
        }

        public final ReviewsInfoModel copy(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
            return new ReviewsInfoModel(poiReviewListResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsInfoModel) && Intrinsics.LJFF(this.data, ((ReviewsInfoModel) obj).data);
        }

        public int hashCode() {
            PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.data;
            if (poiReviewListResponse == null) {
                return 0;
            }
            return poiReviewListResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReviewsInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiReviewsApi.PoiReviewListResponse getData() {
            return this.data;
        }

        public ReviewsInfoModel(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
            super(null, null);
            this.data = poiReviewListResponse;
        }
    }

    public static final class SlashParam implements Serializable {

        @C09CT("is_event")
        public final Boolean isEvent;

        @C09CT("node_update_list")
        public final List<NodeUpdate> nodeUpdateList;

        @C09CT("page_id")
        public final String pageId;

        public SlashParam() {
            this(null, null, null);
        }

        public final Boolean isEvent() {
            return this.isEvent;
        }

        public SlashParam(Boolean bool, String str, List<NodeUpdate> list) {
            this.isEvent = bool;
            this.pageId = str;
            this.nodeUpdateList = list;
        }
    }

    public static final class WriteReviewEntranceModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiReviewsApi.PoiReviewListResponse data;

        public WriteReviewEntranceModel() {
            this(null);
        }

        public final WriteReviewEntranceModel copy(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
            return new WriteReviewEntranceModel(poiReviewListResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WriteReviewEntranceModel) && Intrinsics.LJFF(this.data, ((WriteReviewEntranceModel) obj).data);
        }

        public int hashCode() {
            PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = this.data;
            if (poiReviewListResponse == null) {
                return 0;
            }
            return poiReviewListResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WriteReviewEntranceModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiReviewsApi.PoiReviewListResponse getData() {
            return this.data;
        }

        public WriteReviewEntranceModel(PoiReviewsApi.PoiReviewListResponse poiReviewListResponse) {
            super(null, null);
            this.data = poiReviewListResponse;
        }
    }

    public static final class YmalInfoModel extends SlashComponentBaseModel {

        @C09CT("data")
        public final PoiListApi.PoiYMALResponse data;

        public YmalInfoModel() {
            this(null);
        }

        public final YmalInfoModel copy(PoiListApi.PoiYMALResponse poiYMALResponse) {
            return new YmalInfoModel(poiYMALResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YmalInfoModel) && Intrinsics.LJFF(this.data, ((YmalInfoModel) obj).data);
        }

        public int hashCode() {
            PoiListApi.PoiYMALResponse poiYMALResponse = this.data;
            if (poiYMALResponse == null) {
                return 0;
            }
            return poiYMALResponse.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("YmalInfoModel(data=");
            sbLIZ.append(this.data);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiListApi.PoiYMALResponse getData() {
            return this.data;
        }

        public YmalInfoModel(PoiListApi.PoiYMALResponse poiYMALResponse) {
            super(null, null);
            this.data = poiYMALResponse;
        }
    }

    public static final class ChartTab implements Serializable {

        @C09CT("chart_type")
        public final Integer chartType;

        @C09CT("tab_name")
        public final String tabName;

        public ChartTab() {
            this(null, null);
        }

        public int hashCode() {
            String str = this.tabName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.chartType;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartTab(tabName=");
            sbLIZ.append(this.tabName);
            sbLIZ.append(", chartType=");
            sbLIZ.append(this.chartType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean areContentsTheSame$poi_release(Object obj) {
            if (obj instanceof ChartTab) {
                ChartTab chartTab = (ChartTab) obj;
                if (Intrinsics.LJFF(this.tabName, chartTab.tabName) && Intrinsics.LJFF(this.chartType, chartTab.chartType)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public ChartTab(String str, Integer num) {
            this.tabName = str;
            this.chartType = num;
        }
    }

    public static final class NodeUpdate implements Serializable {

        @C09CT("node")
        public final String node;

        public NodeUpdate() {
            this(null);
        }

        public NodeUpdate(String str) {
            this.node = str;
        }
    }

    public static final class NodesModel implements Serializable {

        @C09CT("poi_head_info")
        public final HeadInfoModel basicInfo;

        @C09CT("region_discovery")
        public final DiscoveryInfoModel discoveryModel;

        @C09CT("poi_merged_list")
        public final PoiMergedListModel mergedListModel;

        @C09CT("multi_merchant_product_shelf")
        public final MultiMerchantProductShelvesInfoModel multiMerchantProductShelvesInfoModel;

        @C09CT("poi_charts_card_v2")
        public final ChartsBasicDataModel poiChartsCard;

        @C09CT("poi_guides_card")
        public final PoiGuideBasicDataModel poiGuidesCard;

        @C09CT("product_shelf")
        public final ProductShelvesInfoModel productShelvesInfoModel;

        @C09CT("poi_recommend_dish")
        public final RecommendDishesInfoModel recommendDishesInfoModel;

        @C09CT("poi_review")
        public final ReviewsInfoModel reviewsModel;

        @C09CT("poi_write_review_entrance")
        public final ReviewsInfoModel writeReviewEntranceModel;

        @C09CT("poi_ymal")
        public final YmalInfoModel ymalModel;

        public NodesModel() {
            this(null, null, null, null, null, null, null, null, null, null, null);
        }

        public final void insertPageInfo(DeprecatedPageInfo deprecatedPageInfo) {
            String imprId;
            PoiListApi.PoiDetailResponse data;
            PoiGuidesBasicData data2;
            ChartsBasicData data3;
            PoiProductShelvesResponse data4;
            PoiMultiMerchantProductShelvesResponse data5;
            PoiRecommendDishesGroupInfo data6;
            PoiListApi.PoiYMALResponse data7;
            PoiReviewsApi.PoiReviewListResponse data8;
            PoiReviewsApi.PoiReviewListResponse data9;
            PoiDiscoveryApi$PoiDiscoveryCardListResponse data10;
            if (deprecatedPageInfo == null) {
                return;
            }
            HeadInfoModel headInfoModel = this.basicInfo;
            if (headInfoModel != null) {
                headInfoModel.setPageInfo(deprecatedPageInfo);
            }
            PoiGuideBasicDataModel poiGuideBasicDataModel = this.poiGuidesCard;
            if (poiGuideBasicDataModel != null) {
                poiGuideBasicDataModel.setPageInfo(deprecatedPageInfo);
            }
            ChartsBasicDataModel chartsBasicDataModel = this.poiChartsCard;
            if (chartsBasicDataModel != null) {
                chartsBasicDataModel.setPageInfo(deprecatedPageInfo);
            }
            ProductShelvesInfoModel productShelvesInfoModel = this.productShelvesInfoModel;
            if (productShelvesInfoModel != null) {
                productShelvesInfoModel.setPageInfo(deprecatedPageInfo);
            }
            MultiMerchantProductShelvesInfoModel multiMerchantProductShelvesInfoModel = this.multiMerchantProductShelvesInfoModel;
            if (multiMerchantProductShelvesInfoModel != null) {
                multiMerchantProductShelvesInfoModel.setPageInfo(deprecatedPageInfo);
            }
            RecommendDishesInfoModel recommendDishesInfoModel = this.recommendDishesInfoModel;
            if (recommendDishesInfoModel != null) {
                recommendDishesInfoModel.setPageInfo(deprecatedPageInfo);
            }
            YmalInfoModel ymalInfoModel = this.ymalModel;
            if (ymalInfoModel != null) {
                ymalInfoModel.setPageInfo(deprecatedPageInfo);
            }
            ReviewsInfoModel reviewsInfoModel = this.writeReviewEntranceModel;
            if (reviewsInfoModel != null) {
                reviewsInfoModel.setPageInfo(deprecatedPageInfo);
            }
            ReviewsInfoModel reviewsInfoModel2 = this.reviewsModel;
            if (reviewsInfoModel2 != null) {
                reviewsInfoModel2.setPageInfo(deprecatedPageInfo);
            }
            DiscoveryInfoModel discoveryInfoModel = this.discoveryModel;
            if (discoveryInfoModel != null) {
                discoveryInfoModel.setPageInfo(deprecatedPageInfo);
            }
            PoiMergedListModel poiMergedListModel = this.mergedListModel;
            if (poiMergedListModel != null) {
                poiMergedListModel.setPageInfo(deprecatedPageInfo);
            }
            LogPbBean logPbBean = deprecatedPageInfo.logPb;
            if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                HeadInfoModel headInfoModel2 = this.basicInfo;
                PoiListApi.PoiMergedListResponse data11 = null;
                if (headInfoModel2 != null) {
                    data = headInfoModel2.getData();
                } else {
                    data = null;
                }
                insertLogId2Extra(data, imprId);
                PoiGuideBasicDataModel poiGuideBasicDataModel2 = this.poiGuidesCard;
                if (poiGuideBasicDataModel2 != null) {
                    data2 = poiGuideBasicDataModel2.getData();
                } else {
                    data2 = null;
                }
                insertLogId2Extra(data2, imprId);
                ChartsBasicDataModel chartsBasicDataModel2 = this.poiChartsCard;
                if (chartsBasicDataModel2 != null) {
                    data3 = chartsBasicDataModel2.getData();
                } else {
                    data3 = null;
                }
                insertLogId2Extra(data3, imprId);
                ProductShelvesInfoModel productShelvesInfoModel2 = this.productShelvesInfoModel;
                if (productShelvesInfoModel2 != null) {
                    data4 = productShelvesInfoModel2.getData();
                } else {
                    data4 = null;
                }
                insertLogId2Extra(data4, imprId);
                MultiMerchantProductShelvesInfoModel multiMerchantProductShelvesInfoModel2 = this.multiMerchantProductShelvesInfoModel;
                if (multiMerchantProductShelvesInfoModel2 != null) {
                    data5 = multiMerchantProductShelvesInfoModel2.getData();
                } else {
                    data5 = null;
                }
                insertLogId2Extra(data5, imprId);
                RecommendDishesInfoModel recommendDishesInfoModel2 = this.recommendDishesInfoModel;
                if (recommendDishesInfoModel2 != null) {
                    data6 = recommendDishesInfoModel2.getData();
                } else {
                    data6 = null;
                }
                insertLogId2Extra(data6, imprId);
                YmalInfoModel ymalInfoModel2 = this.ymalModel;
                if (ymalInfoModel2 != null) {
                    data7 = ymalInfoModel2.getData();
                } else {
                    data7 = null;
                }
                insertLogId2Extra(data7, imprId);
                ReviewsInfoModel reviewsInfoModel3 = this.writeReviewEntranceModel;
                if (reviewsInfoModel3 != null) {
                    data8 = reviewsInfoModel3.getData();
                } else {
                    data8 = null;
                }
                insertLogId2Extra(data8, imprId);
                ReviewsInfoModel reviewsInfoModel4 = this.reviewsModel;
                if (reviewsInfoModel4 != null) {
                    data9 = reviewsInfoModel4.getData();
                } else {
                    data9 = null;
                }
                insertLogId2Extra(data9, imprId);
                DiscoveryInfoModel discoveryInfoModel2 = this.discoveryModel;
                if (discoveryInfoModel2 != null) {
                    data10 = discoveryInfoModel2.getData();
                } else {
                    data10 = null;
                }
                insertLogId2Extra(data10, imprId);
                PoiMergedListModel poiMergedListModel2 = this.mergedListModel;
                if (poiMergedListModel2 != null) {
                    data11 = poiMergedListModel2.getData();
                }
                insertLogId2Extra(data11, imprId);
                C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
                PageFinder pageFinderVia = PageFinder.via(this);
                JSONObject jSONObject = new JSONObject();
                C2365509Or.LIZLLL(jSONObject, "poi_detail_request_id", imprId);
                c1893310zMv.LJIILIIL(pageFinderVia, jSONObject, true);
            }
        }

        public final NodesModel mergeChunk(NodesModel nodesModel) {
            if (nodesModel == null) {
                return this;
            }
            HeadInfoModel headInfoModel = this.basicInfo;
            if (headInfoModel == null) {
                headInfoModel = nodesModel.basicInfo;
            }
            PoiGuideBasicDataModel poiGuideBasicDataModel = this.poiGuidesCard;
            if (poiGuideBasicDataModel == null) {
                poiGuideBasicDataModel = nodesModel.poiGuidesCard;
            }
            ChartsBasicDataModel chartsBasicDataModel = this.poiChartsCard;
            if (chartsBasicDataModel == null) {
                chartsBasicDataModel = nodesModel.poiChartsCard;
            }
            ProductShelvesInfoModel productShelvesInfoModel = this.productShelvesInfoModel;
            if (productShelvesInfoModel == null) {
                productShelvesInfoModel = nodesModel.productShelvesInfoModel;
            }
            MultiMerchantProductShelvesInfoModel multiMerchantProductShelvesInfoModel = this.multiMerchantProductShelvesInfoModel;
            if (multiMerchantProductShelvesInfoModel == null) {
                multiMerchantProductShelvesInfoModel = nodesModel.multiMerchantProductShelvesInfoModel;
            }
            RecommendDishesInfoModel recommendDishesInfoModel = this.recommendDishesInfoModel;
            if (recommendDishesInfoModel == null) {
                recommendDishesInfoModel = nodesModel.recommendDishesInfoModel;
            }
            YmalInfoModel ymalInfoModel = this.ymalModel;
            if (ymalInfoModel == null) {
                ymalInfoModel = nodesModel.ymalModel;
            }
            ReviewsInfoModel reviewsInfoModel = this.writeReviewEntranceModel;
            if (reviewsInfoModel == null) {
                reviewsInfoModel = nodesModel.writeReviewEntranceModel;
            }
            ReviewsInfoModel reviewsInfoModel2 = this.reviewsModel;
            if (reviewsInfoModel2 == null) {
                reviewsInfoModel2 = nodesModel.reviewsModel;
            }
            DiscoveryInfoModel discoveryInfoModel = this.discoveryModel;
            if (discoveryInfoModel == null) {
                discoveryInfoModel = nodesModel.discoveryModel;
            }
            PoiMergedListModel poiMergedListModel = this.mergedListModel;
            if (poiMergedListModel == null) {
                poiMergedListModel = nodesModel.mergedListModel;
            }
            return new NodesModel(headInfoModel, poiGuideBasicDataModel, chartsBasicDataModel, productShelvesInfoModel, multiMerchantProductShelvesInfoModel, recommendDishesInfoModel, ymalInfoModel, reviewsInfoModel, reviewsInfoModel2, discoveryInfoModel, poiMergedListModel);
        }

        private final void insertLogId2Extra(BaseResponse baseResponse, String str) {
            if (baseResponse == null) {
                return;
            }
            if (baseResponse.extra == null) {
                baseResponse.extra = new BaseResponse.ServerTimeExtra();
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
            if (serverTimeExtra != null) {
                serverTimeExtra.logid = str;
            }
        }

        public NodesModel(HeadInfoModel headInfoModel, PoiGuideBasicDataModel poiGuideBasicDataModel, ChartsBasicDataModel chartsBasicDataModel, ProductShelvesInfoModel productShelvesInfoModel, MultiMerchantProductShelvesInfoModel multiMerchantProductShelvesInfoModel, RecommendDishesInfoModel recommendDishesInfoModel, YmalInfoModel ymalInfoModel, ReviewsInfoModel reviewsInfoModel, ReviewsInfoModel reviewsInfoModel2, DiscoveryInfoModel discoveryInfoModel, PoiMergedListModel poiMergedListModel) {
            this.basicInfo = headInfoModel;
            this.poiGuidesCard = poiGuideBasicDataModel;
            this.poiChartsCard = chartsBasicDataModel;
            this.productShelvesInfoModel = productShelvesInfoModel;
            this.multiMerchantProductShelvesInfoModel = multiMerchantProductShelvesInfoModel;
            this.recommendDishesInfoModel = recommendDishesInfoModel;
            this.ymalModel = ymalInfoModel;
            this.writeReviewEntranceModel = reviewsInfoModel;
            this.reviewsModel = reviewsInfoModel2;
            this.discoveryModel = discoveryInfoModel;
            this.mergedListModel = poiMergedListModel;
        }
    }

    public static final class PoiDetailProductShelf implements Serializable {

        @C09CT("products")
        public final List<PoiDetailProductModel> products;

        public PoiDetailProductShelf() {
            this(null);
        }

        public PoiDetailProductShelf(List<PoiDetailProductModel> list) {
            this.products = list;
        }
    }

    public static final class EventModel implements Serializable {

        @C09CT("service_type")
        public final String serviceType;

        @C09CT("slash_param")
        public final SlashParam slashParam;

        public EventModel() {
            this(null, null);
        }

        public EventModel(String str, SlashParam slashParam) {
            this.serviceType = str;
            this.slashParam = slashParam;
        }
    }

    public static final class Events implements Serializable {

        @C09CT("change_tab")
        public final EventModel changeTab;

        @C09CT("load_more")
        public final EventModel loadMore;

        public Events() {
            this(null, null);
        }

        public Events(EventModel eventModel, EventModel eventModel2) {
            this.changeTab = eventModel;
            this.loadMore = eventModel2;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ChartPoiReviewInfo implements Serializable {

        @C09CT("max_score")
        public final Float maxScore;

        @C09CT("score")
        public final Float score;

        @C09CT("total_count")
        public final Long totalCount;

        public ChartPoiReviewInfo() {
            this(null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChartPoiReviewInfo)) {
                return false;
            }
            ChartPoiReviewInfo chartPoiReviewInfo = (ChartPoiReviewInfo) obj;
            return Intrinsics.LJFF(this.maxScore, chartPoiReviewInfo.maxScore) && Intrinsics.LJFF(this.score, chartPoiReviewInfo.score) && Intrinsics.LJFF(this.totalCount, chartPoiReviewInfo.totalCount);
        }

        public int hashCode() {
            Float f = this.maxScore;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.score;
            int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Long l = this.totalCount;
            return iHashCode2 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChartPoiReviewInfo(maxScore=");
            sbLIZ.append(this.maxScore);
            sbLIZ.append(", score=");
            sbLIZ.append(this.score);
            sbLIZ.append(", totalCount=");
            sbLIZ.append(this.totalCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ChartPoiReviewInfo(Float f, Float f2, Long l) {
            this.maxScore = f;
            this.score = f2;
            this.totalCount = l;
        }
    }

    public static final class PoiCategoryItems implements Serializable {

        @C09CT("item_list")
        public final List<PoiListApi.PoiMergedListItem> itemList;

        @C09CT("name")
        public final String name;

        @C09CT("pic_tab_typecode")
        public final Integer picTabTypeCode;

        public PoiCategoryItems() {
            this(null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCategoryItems)) {
                return false;
            }
            PoiCategoryItems poiCategoryItems = (PoiCategoryItems) obj;
            return Intrinsics.LJFF(this.name, poiCategoryItems.name) && Intrinsics.LJFF(this.picTabTypeCode, poiCategoryItems.picTabTypeCode) && Intrinsics.LJFF(this.itemList, poiCategoryItems.itemList);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.picTabTypeCode;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<PoiListApi.PoiMergedListItem> list = this.itemList;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiCategoryItems(name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", picTabTypeCode=");
            sbLIZ.append(this.picTabTypeCode);
            sbLIZ.append(", itemList=");
            sbLIZ.append(this.itemList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiCategoryItems(String str, Integer num, List<PoiListApi.PoiMergedListItem> list) {
            this.name = str;
            this.picTabTypeCode = num;
            this.itemList = list;
        }
    }

    public static final class PrivacyPopupData implements Serializable {

        @C09CT("button")
        public final String button;

        @C09CT("body")
        public final DisclaimerData disclaimerData;

        @C09CT("title")
        public final String title;

        public PrivacyPopupData() {
            this(null, null, null);
        }

        public PrivacyPopupData(String str, DisclaimerData disclaimerData, String str2) {
            this.title = str;
            this.disclaimerData = disclaimerData;
            this.button = str2;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiAiSubSummarySourceItem {

        @C09CT("video")
        public final Aweme aweme;

        @C09CT("aweme_id")
        public final String awemeId;

        @C09CT("source_type")
        public final Integer sourceType;

        @C09CT("start_ms")
        public final Long startMs;

        public PoiAiSubSummarySourceItem() {
            this(null, null, null, null);
        }

        public PoiAiSubSummarySourceItem(String str, Aweme aweme, Long l, Integer num) {
            this.awemeId = str;
            this.aweme = aweme;
            this.startMs = l;
            this.sourceType = num;
        }
    }

    public static final class PromotionInfo implements Serializable {

        @C09CT("coupon_code")
        public final String couponCode;

        @C09CT("tag")
        public final String tag;

        @C09CT("template_id")
        public final String templateId;

        @C09CT("url")
        public final String url;

        public PromotionInfo(String str, String str2, String str3, String str4) {
            this.templateId = str;
            this.tag = str2;
            this.couponCode = str3;
            this.url = str4;
        }
    }

    public static final class PriceInformation implements Serializable {

        @C09CT("currency")
        public final String currency;

        @C09CT("currency_symbol")
        public final String currencySymbol;

        @C09CT("description")
        public final String description;

        @C09CT("discount_num")
        public final Double discountNum;

        @C09CT("discount_tag")
        public final String discountTag;

        @C09CT("discount_type")
        public final String discountType;

        @C09CT("offer_price")
        public final String offerPrice;

        @C09CT("offer_price_num")
        public final Double offerPriceNum;

        @C09CT("original_price")
        public final String originalPrice;

        @C09CT("original_price_num")
        public final Double originalPriceNum;

        @C09CT("save_amount")
        public final String saveAmount;

        public PriceInformation() {
            this(null, null, null, null, null, null, null, null, null, null, null);
        }

        public PriceInformation(String str, String str2, String str3, String str4, Double d, Double d2, String str5, String str6, String str7, String str8, Double d3) {
            this.offerPrice = str;
            this.originalPrice = str2;
            this.currencySymbol = str3;
            this.description = str4;
            this.originalPriceNum = d;
            this.offerPriceNum = d2;
            this.currency = str5;
            this.discountTag = str6;
            this.discountType = str7;
            this.saveAmount = str8;
            this.discountNum = d3;
        }
    }

    public static final class PoiDetailMerchantProductShelf implements Serializable {

        @C09CT("cta_text")
        public final String ctaText;

        @C09CT("expand_cta")
        public final String expandCta;

        @C09CT("fold_cta")
        public final String foldCta;

        @C09CT("logo_url")
        public final UrlModel logoUrl;

        @C09CT("merchant_id")
        public final String merchantId;

        @C09CT("merchant_name")
        public final String merchantName;

        @C09CT("modal_view_title")
        public final String modalViewTitle;

        @C09CT("price_disclaimer")
        public final DialogContent priceDisclaimer;

        @C09CT("price_info")
        public final PriceInformation priceInfo;

        @C09CT("products")
        public final List<PoiDetailProductModel> products;

        @C09CT("promotion_info")
        public final PromotionInfo promotionInfo;

        @C09CT("shop_url")
        public final String shopUrl;

        @C09CT("subtitle")
        public final String subtitle;

        @C09CT("ttoclid")
        public final String ttoclid;

        @C09CT("view_all_cta")
        public final String viewAllCta;

        @C09CT("view_all_threshold")
        public final Integer viewAllThreshold;

        public PoiDetailMerchantProductShelf(String str, String str2, UrlModel urlModel, PriceInformation priceInformation, String str3, String str4, String str5, String str6, List<PoiDetailProductModel> list, String str7, String str8, String str9, Integer num, DialogContent dialogContent, PromotionInfo promotionInfo, String str10) {
            this.merchantId = str;
            this.merchantName = str2;
            this.logoUrl = urlModel;
            this.priceInfo = priceInformation;
            this.ctaText = str3;
            this.viewAllCta = str4;
            this.expandCta = str5;
            this.foldCta = str6;
            this.products = list;
            this.shopUrl = str7;
            this.subtitle = str8;
            this.modalViewTitle = str9;
            this.viewAllThreshold = num;
            this.priceDisclaimer = dialogContent;
            this.promotionInfo = promotionInfo;
            this.ttoclid = str10;
        }
    }
}
