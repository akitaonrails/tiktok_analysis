package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model;

import X.C09CT;
import X.C0QCH;
import X.C123100dR;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageData implements Serializable {
    public static final C0QCH Companion = new Object() { // from class: X.0QCH
    };

    @C09CT("aigc_image")
    public final AIGCImageData aigcImage;

    @C09CT("brand_image")
    public final BrandImageData brandImage;

    @C09CT("insite_image")
    public final InsiteImageData insiteImage;

    @C09CT("offsite_image")
    public final OffsiteImageData offsiteImage;

    @C09CT("original_url")
    public final String originalUrl;

    @C09CT("type")
    public final Integer type;

    public final ImageData copy(Integer num, String str, OffsiteImageData offsiteImageData, InsiteImageData insiteImageData, BrandImageData brandImageData, AIGCImageData aIGCImageData) {
        return new ImageData(num, str, offsiteImageData, insiteImageData, brandImageData, aIGCImageData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) obj;
        return Intrinsics.LJFF(this.type, imageData.type) && Intrinsics.LJFF(this.originalUrl, imageData.originalUrl) && Intrinsics.LJFF(this.offsiteImage, imageData.offsiteImage) && Intrinsics.LJFF(this.insiteImage, imageData.insiteImage) && Intrinsics.LJFF(this.brandImage, imageData.brandImage) && Intrinsics.LJFF(this.aigcImage, imageData.aigcImage);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.originalUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffsiteImageData offsiteImageData = this.offsiteImage;
        int iHashCode3 = (iHashCode2 + (offsiteImageData == null ? 0 : offsiteImageData.hashCode())) * 31;
        InsiteImageData insiteImageData = this.insiteImage;
        int iHashCode4 = (iHashCode3 + (insiteImageData == null ? 0 : insiteImageData.hashCode())) * 31;
        BrandImageData brandImageData = this.brandImage;
        int iHashCode5 = (iHashCode4 + (brandImageData == null ? 0 : brandImageData.hashCode())) * 31;
        AIGCImageData aIGCImageData = this.aigcImage;
        return iHashCode5 + (aIGCImageData != null ? aIGCImageData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", originalUrl=");
        sbLIZ.append(this.originalUrl);
        sbLIZ.append(", offsiteImage=");
        sbLIZ.append(this.offsiteImage);
        sbLIZ.append(", insiteImage=");
        sbLIZ.append(this.insiteImage);
        sbLIZ.append(", brandImage=");
        sbLIZ.append(this.brandImage);
        sbLIZ.append(", aigcImage=");
        sbLIZ.append(this.aigcImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDetailPageImageUrl() {
        String str = this.originalUrl;
        return (!C123100dR.LIZ(str) || str == null) ? getImageUrl() : str;
    }

    public final Integer getImageHeight() {
        AIGCImageData aIGCImageData;
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.height;
            }
            return null;
        }
        if (num.intValue() == 2) {
            InsiteImageData insiteImageData = this.insiteImage;
            if (insiteImageData != null) {
                return insiteImageData.height;
            }
            return null;
        }
        if (num.intValue() == 3) {
            BrandImageData brandImageData = this.brandImage;
            if (brandImageData != null) {
                return brandImageData.height;
            }
            return null;
        }
        if (num.intValue() != 100 || (aIGCImageData = this.aigcImage) == null) {
            return null;
        }
        return aIGCImageData.height;
    }

    public final String getImageSource() {
        Integer num;
        Integer numValueOf;
        Integer num2 = this.type;
        if (num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            return (offsiteImageData == null || (numValueOf = Integer.valueOf(offsiteImageData.offsiteType)) == null || numValueOf.intValue() != 2) ? "outside_picture" : "wikipedia";
        }
        if (num2 == null) {
            return null;
        }
        if (num2.intValue() != 2) {
            if (num2.intValue() == 3) {
                return "tako_brand_picture";
            }
            if (num2.intValue() == 100) {
                return "aigc";
            }
            return null;
        }
        InsiteImageData insiteImageData = this.insiteImage;
        if (insiteImageData == null || (num = insiteImageData.insiteType) == null) {
            return null;
        }
        if (num.intValue() == 2) {
            return "lemon8_picture";
        }
        if (num.intValue() == 3) {
            return "key_frame";
        }
        if (num.intValue() == 1) {
            return "tt_picture";
        }
        return null;
    }

    public final String getImageUrl() {
        AIGCImageData aIGCImageData;
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.url;
            }
            return null;
        }
        if (num.intValue() == 2) {
            InsiteImageData insiteImageData = this.insiteImage;
            if (insiteImageData != null) {
                return insiteImageData.url;
            }
            return null;
        }
        if (num.intValue() == 3) {
            BrandImageData brandImageData = this.brandImage;
            if (brandImageData != null) {
                return brandImageData.url;
            }
            return null;
        }
        if (num.intValue() != 100 || (aIGCImageData = this.aigcImage) == null) {
            return null;
        }
        String str = aIGCImageData.thumbnailUrl;
        return str == null ? aIGCImageData.url : str;
    }

    public final Integer getImageWidth() {
        AIGCImageData aIGCImageData;
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.width;
            }
            return null;
        }
        if (num.intValue() == 2) {
            InsiteImageData insiteImageData = this.insiteImage;
            if (insiteImageData != null) {
                return insiteImageData.width;
            }
            return null;
        }
        if (num.intValue() == 3) {
            BrandImageData brandImageData = this.brandImage;
            if (brandImageData != null) {
                return brandImageData.width;
            }
            return null;
        }
        if (num.intValue() != 100 || (aIGCImageData = this.aigcImage) == null) {
            return null;
        }
        return aIGCImageData.width;
    }

    public final String getShareDesc() {
        InsiteImageData insiteImageData;
        Aweme aweme;
        ShareInfo shareInfo;
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.rootUrl;
            }
            return null;
        }
        if (num.intValue() != 2 || (insiteImageData = this.insiteImage) == null || (aweme = insiteImageData.awemeData) == null || (shareInfo = aweme.getShareInfo()) == null) {
            return null;
        }
        return shareInfo.getShareDesc();
    }

    public final String getShareTitle() {
        InsiteImageData insiteImageData;
        Aweme aweme;
        ShareInfo shareInfo;
        Integer num = this.type;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.title;
            }
            return null;
        }
        if (num.intValue() != 2 || (insiteImageData = this.insiteImage) == null || (aweme = insiteImageData.awemeData) == null || (shareInfo = aweme.getShareInfo()) == null) {
            return null;
        }
        return shareInfo.getShareTitle();
    }

    public final String getShareUrl() {
        Aweme aweme;
        Integer num;
        Integer num2 = this.type;
        if (num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            OffsiteImageData offsiteImageData = this.offsiteImage;
            if (offsiteImageData != null) {
                return offsiteImageData.webUrl;
            }
            return null;
        }
        if (num2.intValue() != 2) {
            return null;
        }
        InsiteImageData insiteImageData = this.insiteImage;
        if (insiteImageData != null && (num = insiteImageData.insiteType) != null && num.intValue() == 2) {
            SearchAwemeInfo searchAwemeInfo = this.insiteImage.searchAwemeInfo;
            if (searchAwemeInfo != null) {
                return searchAwemeInfo.externalJumpUrl;
            }
            return null;
        }
        InsiteImageData insiteImageData2 = this.insiteImage;
        if (insiteImageData2 == null || (aweme = insiteImageData2.awemeData) == null) {
            return null;
        }
        return aweme.getShareUrl();
    }

    public final Pair<Integer, Integer> getImageSize() {
        Integer imageWidth = getImageWidth();
        Integer imageHeight = getImageHeight();
        if (imageWidth == null || imageHeight == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(imageWidth.intValue()), Integer.valueOf(imageHeight.intValue()));
    }

    public ImageData(Integer num, String str, OffsiteImageData offsiteImageData, InsiteImageData insiteImageData, BrandImageData brandImageData, AIGCImageData aIGCImageData) {
        this.type = num;
        this.originalUrl = str;
        this.offsiteImage = offsiteImageData;
        this.insiteImage = insiteImageData;
        this.brandImage = brandImageData;
        this.aigcImage = aIGCImageData;
    }
}
