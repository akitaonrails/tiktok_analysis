package com.ss.android.ugc.aweme.ecommerce.base.review.repo;

import X.C040I;
import X.C09CT;
import X.C0X52;
import X.C11NZ;
import X.C1405670mgP;
import X.C1760770vv9;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public interface ReviewApi {
    public static final C1760770vv9 LIZ = C1760770vv9.LIZ;

    public static final class ListShopReviewRequest {

        @C09CT("cursor")
        public final int cursor;

        @C09CT("filter_id")
        public final String filterId;

        @C09CT("global_base_review")
        public final Boolean globalBaseReview;

        @C09CT("kol_id")
        public final String kolId;

        @C09CT("need_count")
        public final Boolean needCount;

        @C09CT("need_filter")
        public final boolean needFilter;

        @C09CT("product_id")
        public final String productId;

        @C09CT("product_source_info")
        public final Integer productSourceInfo;

        @C09CT("seller_id")
        public final String sellerId;

        @C09CT("size")
        public final int size;

        @C09CT("sort_type")
        public final Integer sortType;

        @C09CT("traffic_source_list")
        public final int[] trafficSourceList;

        public final int hashCode() {
            int iHashCode = ((((((((this.productId.hashCode() * 31) + this.sellerId.hashCode()) * 31) + C786410Ut5.Z2(this.needFilter)) * 31) + this.size) * 31) + this.cursor) * 31;
            String str = this.filterId;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.kolId;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            int i = iHashCode3 * 31;
            int[] iArr = this.trafficSourceList;
            if (iArr != null) {
                for (int i2 : iArr) {
                    iHashCode3 += i2;
                }
            } else {
                iHashCode3 = 0;
            }
            int i3 = (i + iHashCode3) * 31;
            Boolean bool = this.needCount;
            int iHashCode4 = (i3 + (bool != null ? bool.hashCode() : 0)) * 31;
            Integer num = this.productSourceInfo;
            int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.sortType;
            int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Boolean bool2 = this.globalBaseReview;
            return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(ListShopReviewRequest.class, cls)) {
                return false;
            }
            ListShopReviewRequest listShopReviewRequest = (ListShopReviewRequest) obj;
            if (Intrinsics.LJFF(this.productId, listShopReviewRequest.productId) && Intrinsics.LJFF(this.sellerId, listShopReviewRequest.sellerId) && this.needFilter == listShopReviewRequest.needFilter && this.size == listShopReviewRequest.size && this.cursor == listShopReviewRequest.cursor && Intrinsics.LJFF(this.filterId, listShopReviewRequest.filterId) && Intrinsics.LJFF(this.kolId, listShopReviewRequest.kolId) && Arrays.equals(this.trafficSourceList, listShopReviewRequest.trafficSourceList) && Intrinsics.LJFF(this.needCount, listShopReviewRequest.needCount) && Intrinsics.LJFF(this.productSourceInfo, listShopReviewRequest.productSourceInfo) && Intrinsics.LJFF(this.sortType, listShopReviewRequest.sortType) && Intrinsics.LJFF(this.globalBaseReview, listShopReviewRequest.globalBaseReview)) {
                return true;
            }
            return false;
        }

        public ListShopReviewRequest(String str, String str2, boolean z, int i, int i2, String str3, String str4, int[] iArr, Boolean bool, Integer num, Integer num2, Boolean bool2) {
            this.productId = str;
            this.sellerId = str2;
            this.needFilter = z;
            this.size = i;
            this.cursor = i2;
            this.filterId = str3;
            this.kolId = str4;
            this.trafficSourceList = iArr;
            this.needCount = bool;
            this.productSourceInfo = num;
            this.sortType = num2;
            this.globalBaseReview = bool2;
        }
    }

    public static final class ReviewRequest {

        @C09CT("clicked_review_id")
        public final String clickedReviewId;

        @C09CT("cursor")
        public final int cursor;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("filter_id")
        public final String filterId;

        @C09CT("filter_type")
        public final Integer filterType;

        @C09CT("global_base_review")
        public final Boolean globalBaseReview;

        @C09CT("need_count")
        public final Boolean needCount;

        @C09CT("need_filter")
        public final boolean needFilter;

        @C09CT("page_source")
        public final Integer pageSource;

        @C09CT("product_id")
        public final String productId;

        @C09CT("review_page_request_params")
        public final String reviewPageRequestParams;

        @C09CT("seller_id")
        public final String sellerId;

        @C09CT("size")
        public final int size;

        @C09CT("sort_type")
        public final Integer sortType;

        public final int hashCode() {
            int iHashCode = this.productId.hashCode() * 31;
            String str = this.filterId;
            int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.size) * 31) + this.cursor) * 31) + C786410Ut5.Z2(this.needFilter)) * 31;
            Integer num = this.sortType;
            int iIntValue = (iHashCode2 + (num != null ? num.intValue() : 0)) * 31;
            String str2 = this.clickedReviewId;
            int iHashCode3 = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.needCount;
            int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.globalBaseReview;
            int iHashCode5 = (iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num2 = this.pageSource;
            int iIntValue2 = (iHashCode5 + (num2 != null ? num2.intValue() : 0)) * 31;
            String str3 = this.reviewPageRequestParams;
            return iIntValue2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(ReviewRequest.class, cls)) {
                return false;
            }
            ReviewRequest reviewRequest = (ReviewRequest) obj;
            if (Intrinsics.LJFF(this.productId, reviewRequest.productId) && Intrinsics.LJFF(this.filterId, reviewRequest.filterId) && this.size == reviewRequest.size && this.cursor == reviewRequest.cursor && this.needFilter == reviewRequest.needFilter && Intrinsics.LJFF(this.sortType, reviewRequest.sortType) && Intrinsics.LJFF(this.clickedReviewId, reviewRequest.clickedReviewId) && Intrinsics.LJFF(this.needCount, reviewRequest.needCount) && Intrinsics.LJFF(this.globalBaseReview, reviewRequest.globalBaseReview) && Intrinsics.LJFF(this.pageSource, reviewRequest.pageSource) && Intrinsics.LJFF(this.filterType, reviewRequest.filterType) && Intrinsics.LJFF(this.enterFrom, reviewRequest.enterFrom) && Intrinsics.LJFF(this.reviewPageRequestParams, reviewRequest.reviewPageRequestParams)) {
                return true;
            }
            return false;
        }

        public ReviewRequest(String str, String str2, int i, int i2, boolean z, Integer num, String str3, Boolean bool, String str4, Boolean bool2, Integer num2, Integer num3, String str5, String str6) {
            this.productId = str;
            this.filterId = str2;
            this.size = i;
            this.cursor = i2;
            this.needFilter = z;
            this.sortType = num;
            this.clickedReviewId = str3;
            this.needCount = bool;
            this.sellerId = str4;
            this.globalBaseReview = bool2;
            this.pageSource = num2;
            this.filterType = num3;
            this.enterFrom = str5;
            this.reviewPageRequestParams = str6;
        }
    }

    @InterfaceC1501240pAY("/api/v1/shop_review/list")
    C11NZ<Response<n>> LIZ(@C040I ListShopReviewRequest listShopReviewRequest);

    @InterfaceC1501240pAY("api/v1/review/digg")
    C11NZ<Object> LIZIZ(@C040I ReviewDiggRequest reviewDiggRequest);

    @InterfaceC1501240pAY("/api/v1/shop_review/list")
    C11NZ<Response<ListShopReviewData>> LIZJ(@C040I ListShopReviewRequest listShopReviewRequest);

    @InterfaceC1501240pAY("api/v1/review/trans")
    Object LIZLLL(@C040I ReviewTransRequest reviewTransRequest, InterfaceC1364105Vn<? super ReviewTransResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/review/list")
    Object LJ(@C040I ReviewRequest reviewRequest, InterfaceC1364105Vn<? super C0X52<Response<Map<String, Object>>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/review/cancel_digg")
    C11NZ<Object> LJFF(@C040I ReviewDiggRequest reviewDiggRequest);

    @InterfaceC1501240pAY("api/v1/review/list")
    C11NZ<Response<ListReviewData>> LJI(@C040I ReviewRequest reviewRequest);

    @InterfaceC1501240pAY("api/v1/review/list")
    C11NZ<Response<n>> LJII(@C040I ReviewRequest reviewRequest);

    @InterfaceC1501240pAY("api/v1/review/list")
    C11NZ<String> LJIIIIZZ(@C040I ReviewRequest reviewRequest);

    public static final class ReviewDiggRequest {

        @C09CT("main_review_id")
        public final String reviewId;

        public ReviewDiggRequest(String str) {
            this.reviewId = str;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ReviewTransRequest {

        @C09CT("review_ids")
        public final List<String> reviewId;

        @C09CT("trans_units")
        public final List<TransUnit> transUnits;

        public ReviewTransRequest() {
            this(null, null);
        }

        public ReviewTransRequest(List<String> list, List<TransUnit> list2) {
            this.reviewId = list;
            this.transUnits = list2;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TransUnit implements Parcelable {

        @C09CT("review_id")
        public final String reviewId;

        @C09CT("see_original")
        public final Integer seeOriginal;
        public static final Parcelable.Creator<TransUnit> CREATOR = new Parcelable.Creator<TransUnit>() { // from class: X.0mgR
            @Override // android.os.Parcelable.Creator
            public final ReviewApi.TransUnit createFromParcel(Parcel parcel) {
                Integer numValueOf;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new ReviewApi.TransUnit(string, numValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewApi.TransUnit[] newArray(int i) {
                return new ReviewApi.TransUnit[i];
            }
        };
        public static final int $stable = 8;

        public TransUnit() {
            this(null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransUnit)) {
                return false;
            }
            TransUnit transUnit = (TransUnit) obj;
            return Intrinsics.LJFF(this.reviewId, transUnit.reviewId) && Intrinsics.LJFF(this.seeOriginal, transUnit.seeOriginal);
        }

        public final int hashCode() {
            String str = this.reviewId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.seeOriginal;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TransUnit(reviewId=");
            sbLIZ.append(this.reviewId);
            sbLIZ.append(", seeOriginal=");
            sbLIZ.append(this.seeOriginal);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            parcel.writeString(this.reviewId);
            Integer num = this.seeOriginal;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public TransUnit(String str, Integer num) {
            this.reviewId = str;
            this.seeOriginal = num;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ReviewTransResponse implements Parcelable {

        @C09CT("code")
        public final int code;

        @C09CT("items")
        public final List<ReviewTransData> items;

        @C09CT("message")
        public final String message;
        public static final C1405670mgP Companion = new Object() { // from class: X.0mgP
        };
        public static final Parcelable.Creator<ReviewTransResponse> CREATOR = new Parcelable.Creator<ReviewTransResponse>() { // from class: X.0mgO
            @Override // android.os.Parcelable.Creator
            public final ReviewApi.ReviewTransResponse createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int i = parcel.readInt();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        arrayList.add(ReviewTransData.CREATOR.createFromParcel(parcel));
                    }
                }
                return new ReviewApi.ReviewTransResponse(i, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewApi.ReviewTransResponse[] newArray(int i) {
                return new ReviewApi.ReviewTransResponse[i];
            }
        };
        public static final int $stable = 8;

        public ReviewTransResponse() {
            this(-1, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewTransResponse)) {
                return false;
            }
            ReviewTransResponse reviewTransResponse = (ReviewTransResponse) obj;
            return this.code == reviewTransResponse.code && Intrinsics.LJFF(this.message, reviewTransResponse.message) && Intrinsics.LJFF(this.items, reviewTransResponse.items);
        }

        public final int hashCode() {
            int i = this.code * 31;
            String str = this.message;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            List<ReviewTransData> list = this.items;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReviewTransResponse(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", message=");
            sbLIZ.append(this.message);
            sbLIZ.append(", items=");
            sbLIZ.append(this.items);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            List<ReviewTransData> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewTransData> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }

        public ReviewTransResponse(int i, String str, List<ReviewTransData> list) {
            this.code = i;
            this.message = str;
            this.items = list;
        }
    }
}
