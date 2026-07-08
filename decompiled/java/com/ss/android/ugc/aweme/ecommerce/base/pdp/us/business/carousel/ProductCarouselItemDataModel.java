package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C033W;
import X.C09CT;
import X.C13BV;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElementsExtension;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.LynxOverlay;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ProductCarouselItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ReviewPageControlColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductCarouselItemDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("carousel_elements")
    public final List<CarouselElement> carouselElements;

    @C09CT("carousel_elements_extension")
    public final CarouselElementsExtension carouselElementsExtension;

    @C09CT("carousel_widget_map")
    public final Map<String, CarouselWidget> carouselWidgetDataMap;

    @C09CT("creator_video_entrance")
    public final ECRichText creatorVideoEntrance;

    @C09CT("enable_header_mirror_bg")
    public final Boolean enableHeaderMirrorBg;

    @C09CT("lynx_overlay")
    public final LynxOverlay lynxOverlay;

    @C09CT("promo_sticker")
    public final PromoSticker promoSticker;

    @C09CT("waist_banner")
    public final PromotionWaist promotionWaistBanner;

    @C09CT("header_ui_refactor_enable")
    public final Boolean refactorEnabled;

    @C09CT("review")
    public String reviewContainerData;

    @C09CT("review_page_control_color")
    public final ReviewPageControlColor reviewPageControlColor;

    @C09CT("review_placement_index")
    public final Integer reviewPlacementIndex;

    @C09CT("review_schema")
    public final String reviewSchema;

    @C09CT("skc_carousel_elements")
    public final Map<String, List<CarouselElement>> skcCarouselElements;
    public static final Parcelable.Creator<ProductCarouselItemDataModel> CREATOR = new Parcelable.Creator<ProductCarouselItemDataModel>() { // from class: X.0vxC
        @Override // android.os.Parcelable.Creator
        public final ProductCarouselItemDataModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ReviewPageControlColor reviewPageControlColorCreateFromParcel;
            PromoSticker promoStickerCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            CarouselElementsExtension carouselElementsExtensionCreateFromParcel;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            PromotionWaist promotionWaistCreateFromParcel;
            LynxOverlay lynxOverlayCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                reviewPageControlColorCreateFromParcel = null;
            } else {
                reviewPageControlColorCreateFromParcel = ReviewPageControlColor.CREATOR.createFromParcel(parcel);
            }
            ReviewPageControlColor reviewPageControlColor = reviewPageControlColorCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ProductCarouselItemDataModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                promoStickerCreateFromParcel = null;
            } else {
                promoStickerCreateFromParcel = PromoSticker.CREATOR.createFromParcel(parcel);
            }
            PromoSticker promoSticker = promoStickerCreateFromParcel;
            boolean z2 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CarouselElement.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                carouselElementsExtensionCreateFromParcel = null;
            } else {
                carouselElementsExtensionCreateFromParcel = CarouselElementsExtension.CREATOR.createFromParcel(parcel);
            }
            CarouselElementsExtension carouselElementsExtension = carouselElementsExtensionCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    String string3 = parcel.readString();
                    int i5 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList2.add(CarouselElement.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap.put(string3, arrayList2);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i7 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap2.put(parcel.readString(), CarouselWidget.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                promotionWaistCreateFromParcel = null;
            } else {
                promotionWaistCreateFromParcel = PromotionWaist.CREATOR.createFromParcel(parcel);
            }
            PromotionWaist promotionWaist = promotionWaistCreateFromParcel;
            if (parcel.readInt() == 0) {
                lynxOverlayCreateFromParcel = null;
            } else {
                lynxOverlayCreateFromParcel = LynxOverlay.CREATOR.createFromParcel(parcel);
            }
            return new ProductCarouselItemDataModel(string, string2, numValueOf, reviewPageControlColor, eCRichText, promoSticker, boolValueOf, boolValueOf2, arrayList, carouselElementsExtension, linkedHashMap, linkedHashMap2, promotionWaist, lynxOverlayCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductCarouselItemDataModel[] newArray(int i) {
            return new ProductCarouselItemDataModel[i];
        }
    };
    public static final int $stable = 8;

    public ProductCarouselItemDataModel() {
        this(null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCarouselItemDataModel)) {
            return false;
        }
        ProductCarouselItemDataModel productCarouselItemDataModel = (ProductCarouselItemDataModel) obj;
        return Intrinsics.LJFF(this.reviewContainerData, productCarouselItemDataModel.reviewContainerData) && Intrinsics.LJFF(this.reviewSchema, productCarouselItemDataModel.reviewSchema) && Intrinsics.LJFF(this.reviewPlacementIndex, productCarouselItemDataModel.reviewPlacementIndex) && Intrinsics.LJFF(this.reviewPageControlColor, productCarouselItemDataModel.reviewPageControlColor) && Intrinsics.LJFF(this.creatorVideoEntrance, productCarouselItemDataModel.creatorVideoEntrance) && Intrinsics.LJFF(this.promoSticker, productCarouselItemDataModel.promoSticker) && Intrinsics.LJFF(this.refactorEnabled, productCarouselItemDataModel.refactorEnabled) && Intrinsics.LJFF(this.enableHeaderMirrorBg, productCarouselItemDataModel.enableHeaderMirrorBg) && Intrinsics.LJFF(this.carouselElements, productCarouselItemDataModel.carouselElements) && Intrinsics.LJFF(this.carouselElementsExtension, productCarouselItemDataModel.carouselElementsExtension) && Intrinsics.LJFF(this.skcCarouselElements, productCarouselItemDataModel.skcCarouselElements) && Intrinsics.LJFF(this.carouselWidgetDataMap, productCarouselItemDataModel.carouselWidgetDataMap) && Intrinsics.LJFF(this.promotionWaistBanner, productCarouselItemDataModel.promotionWaistBanner) && Intrinsics.LJFF(this.lynxOverlay, productCarouselItemDataModel.lynxOverlay);
    }

    public final int hashCode() {
        String str = this.reviewContainerData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reviewSchema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.reviewPlacementIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ReviewPageControlColor reviewPageControlColor = this.reviewPageControlColor;
        int iHashCode4 = (iHashCode3 + (reviewPageControlColor == null ? 0 : reviewPageControlColor.hashCode())) * 31;
        ECRichText eCRichText = this.creatorVideoEntrance;
        int iHashCode5 = (iHashCode4 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PromoSticker promoSticker = this.promoSticker;
        int iHashCode6 = (iHashCode5 + (promoSticker == null ? 0 : promoSticker.hashCode())) * 31;
        Boolean bool = this.refactorEnabled;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableHeaderMirrorBg;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<CarouselElement> list = this.carouselElements;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        CarouselElementsExtension carouselElementsExtension = this.carouselElementsExtension;
        int iHashCode10 = (iHashCode9 + (carouselElementsExtension == null ? 0 : carouselElementsExtension.hashCode())) * 31;
        Map<String, List<CarouselElement>> map = this.skcCarouselElements;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, CarouselWidget> map2 = this.carouselWidgetDataMap;
        int iHashCode12 = (iHashCode11 + (map2 == null ? 0 : map2.hashCode())) * 31;
        PromotionWaist promotionWaist = this.promotionWaistBanner;
        int iHashCode13 = (iHashCode12 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31;
        LynxOverlay lynxOverlay = this.lynxOverlay;
        return iHashCode13 + (lynxOverlay != null ? lynxOverlay.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCarouselItemDataModel(reviewContainerData=" + this.reviewContainerData + ", reviewSchema=" + this.reviewSchema + ", reviewPlacementIndex=" + this.reviewPlacementIndex + ", reviewPageControlColor=" + this.reviewPageControlColor + ", creatorVideoEntrance=" + this.creatorVideoEntrance + ", promoSticker=" + this.promoSticker + ", refactorEnabled=" + this.refactorEnabled + ", enableHeaderMirrorBg=" + this.enableHeaderMirrorBg + ", carouselElements=" + this.carouselElements + ", carouselElementsExtension=" + this.carouselElementsExtension + ", skcCarouselElements=" + this.skcCarouselElements + ", carouselWidgetDataMap=" + this.carouselWidgetDataMap + ", promotionWaistBanner=" + this.promotionWaistBanner + ", lynxOverlay=" + this.lynxOverlay + ')';
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        return C13BV.INSTANCE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reviewContainerData);
        parcel.writeString(this.reviewSchema);
        Integer num = this.reviewPlacementIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ReviewPageControlColor reviewPageControlColor = this.reviewPageControlColor;
        if (reviewPageControlColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewPageControlColor.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.creatorVideoEntrance, i);
        PromoSticker promoSticker = this.promoSticker;
        if (promoSticker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoSticker.writeToParcel(parcel, i);
        }
        Boolean bool = this.refactorEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.enableHeaderMirrorBg;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<CarouselElement> list = this.carouselElements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CarouselElement> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        CarouselElementsExtension carouselElementsExtension = this.carouselElementsExtension;
        if (carouselElementsExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carouselElementsExtension.writeToParcel(parcel, i);
        }
        Map<String, List<CarouselElement>> map = this.skcCarouselElements;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, List<CarouselElement>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                List<CarouselElement> value = entry.getValue();
                parcel.writeInt(value.size());
                Iterator<CarouselElement> it3 = value.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
        }
        Map<String, CarouselWidget> map2 = this.carouselWidgetDataMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, CarouselWidget> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
        }
        PromotionWaist promotionWaist = this.promotionWaistBanner;
        if (promotionWaist == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaist.writeToParcel(parcel, i);
        }
        LynxOverlay lynxOverlay = this.lynxOverlay;
        if (lynxOverlay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lynxOverlay.schema);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCarouselItemDataModel(String str, String str2, Integer num, ReviewPageControlColor reviewPageControlColor, ECRichText eCRichText, PromoSticker promoSticker, Boolean bool, Boolean bool2, List<CarouselElement> list, CarouselElementsExtension carouselElementsExtension, Map<String, ? extends List<CarouselElement>> map, Map<String, CarouselWidget> map2, PromotionWaist promotionWaist, LynxOverlay lynxOverlay) {
        this.reviewContainerData = str;
        this.reviewSchema = str2;
        this.reviewPlacementIndex = num;
        this.reviewPageControlColor = reviewPageControlColor;
        this.creatorVideoEntrance = eCRichText;
        this.promoSticker = promoSticker;
        this.refactorEnabled = bool;
        this.enableHeaderMirrorBg = bool2;
        this.carouselElements = list;
        this.carouselElementsExtension = carouselElementsExtension;
        this.skcCarouselElements = map;
        this.carouselWidgetDataMap = map2;
        this.promotionWaistBanner = promotionWaist;
        this.lynxOverlay = lynxOverlay;
    }
}
