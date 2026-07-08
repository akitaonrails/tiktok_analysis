package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C1405640mgM;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1752690vi7;
import X.InterfaceC997603vC;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSourceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTags;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTranslation;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewItemStruct implements Parcelable, InterfaceC997603vC {
    public int brickName = EnumC1752690vi7.REVIEW.getValue();

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("digg_count")
    public final Integer diggCount;

    @C09CT("is_anonymous")
    public final Boolean isAnonymous;

    @C09CT("is_digged")
    public final Boolean isDigged;

    @C09CT("is_hidden_digg_area")
    public final Boolean isHiddenDiggArea;

    @C09CT("is_local")
    public final boolean isLocal;

    @C09CT("is_owner")
    public final Boolean isOwner;

    @C09CT("is_updated")
    public final boolean isUpdated;

    @C09CT("third_party_popup_button_text")
    public final String popupButtonText;

    @C09CT("third_party_popup_content")
    public final String popupContent;

    @C09CT("third_party_popup_title")
    public final String popupTitle;

    @C09CT("review")
    public final MainReview review;

    @C09CT("review_hint_text")
    public final String reviewHintText;

    @C09CT("review_incentive_name")
    public final String reviewIncentiveName;

    @C09CT("link")
    public final String reviewLink;

    @C09CT("review_source_info")
    public final ReviewSourceInfo reviewSourceInfo;

    @C09CT("review_source_name")
    public final String reviewSourceName;

    @C09CT("review_source_type")
    public final Integer reviewSourceType;

    @C09CT("seller_name")
    public final String sellerName;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_specification")
    public final String specification;

    @C09CT("review_tags")
    public final List<ReviewTags> tags;

    @C09CT("translation")
    public final ReviewTranslation translation;

    @C09CT("review_user")
    public final User user;
    public static final Parcelable.Creator<ReviewItemStruct> CREATOR = new Parcelable.Creator<ReviewItemStruct>() { // from class: X.0mhe
        @Override // android.os.Parcelable.Creator
        public final ReviewItemStruct createFromParcel(Parcel parcel) {
            ReviewItemStruct.MainReview mainReviewCreateFromParcel;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            ReviewItemStruct.User userCreateFromParcel;
            ArrayList arrayList;
            boolean z4;
            Boolean boolValueOf4;
            Integer numValueOf2;
            ReviewSourceInfo reviewSourceInfoCreateFromParcel;
            boolean z5;
            boolean z6;
            ReviewTranslation reviewTranslationCreateFromParcel;
            if (parcel.readInt() == 0) {
                mainReviewCreateFromParcel = null;
            } else {
                mainReviewCreateFromParcel = ReviewItemStruct.MainReview.CREATOR.createFromParcel(parcel);
            }
            ReviewItemStruct.MainReview mainReview = mainReviewCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
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
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                userCreateFromParcel = null;
            } else {
                userCreateFromParcel = ReviewItemStruct.User.CREATOR.createFromParcel(parcel);
            }
            ReviewItemStruct.User user = userCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewTags.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                reviewSourceInfoCreateFromParcel = null;
            } else {
                reviewSourceInfoCreateFromParcel = ReviewSourceInfo.CREATOR.createFromParcel(parcel);
            }
            ReviewSourceInfo reviewSourceInfo = reviewSourceInfoCreateFromParcel;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                reviewTranslationCreateFromParcel = null;
            } else {
                reviewTranslationCreateFromParcel = ReviewTranslation.CREATOR.createFromParcel(parcel);
            }
            return new ReviewItemStruct(mainReview, string, string2, numValueOf, boolValueOf, boolValueOf2, boolValueOf3, user, arrayList, boolValueOf4, numValueOf2, string3, string4, reviewSourceInfo, string5, z5, z6, reviewTranslationCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewItemStruct[] newArray(int i) {
            return new ReviewItemStruct[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewItemStruct)) {
            return false;
        }
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        return Intrinsics.LJFF(this.review, reviewItemStruct.review) && Intrinsics.LJFF(this.specification, reviewItemStruct.specification) && Intrinsics.LJFF(this.skuId, reviewItemStruct.skuId) && Intrinsics.LJFF(this.diggCount, reviewItemStruct.diggCount) && Intrinsics.LJFF(this.isDigged, reviewItemStruct.isDigged) && Intrinsics.LJFF(this.isHiddenDiggArea, reviewItemStruct.isHiddenDiggArea) && Intrinsics.LJFF(this.isOwner, reviewItemStruct.isOwner) && Intrinsics.LJFF(this.user, reviewItemStruct.user) && Intrinsics.LJFF(this.tags, reviewItemStruct.tags) && Intrinsics.LJFF(this.isAnonymous, reviewItemStruct.isAnonymous) && Intrinsics.LJFF(this.reviewSourceType, reviewItemStruct.reviewSourceType) && Intrinsics.LJFF(this.reviewSourceName, reviewItemStruct.reviewSourceName) && Intrinsics.LJFF(this.reviewIncentiveName, reviewItemStruct.reviewIncentiveName) && Intrinsics.LJFF(this.reviewSourceInfo, reviewItemStruct.reviewSourceInfo) && Intrinsics.LJFF(this.reviewLink, reviewItemStruct.reviewLink) && this.isUpdated == reviewItemStruct.isUpdated && this.isLocal == reviewItemStruct.isLocal && Intrinsics.LJFF(this.translation, reviewItemStruct.translation) && Intrinsics.LJFF(this.popupTitle, reviewItemStruct.popupTitle) && Intrinsics.LJFF(this.popupContent, reviewItemStruct.popupContent) && Intrinsics.LJFF(this.popupButtonText, reviewItemStruct.popupButtonText) && Intrinsics.LJFF(this.sellerName, reviewItemStruct.sellerName) && Intrinsics.LJFF(this.reviewHintText, reviewItemStruct.reviewHintText) && Intrinsics.LJFF(this.daInfo, reviewItemStruct.daInfo);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        MainReview mainReview = this.review;
        int iHashCode = (mainReview == null ? 0 : mainReview.hashCode()) * 31;
        String str = this.specification;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.diggCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDigged;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHiddenDiggArea;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOwner;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        User user = this.user;
        int iHashCode8 = (iHashCode7 + (user == null ? 0 : user.hashCode())) * 31;
        List<ReviewTags> list = this.tags;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.isAnonymous;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.reviewSourceType;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.reviewSourceName;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reviewIncentiveName;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReviewSourceInfo reviewSourceInfo = this.reviewSourceInfo;
        int iHashCode14 = (iHashCode13 + (reviewSourceInfo == null ? 0 : reviewSourceInfo.hashCode())) * 31;
        String str5 = this.reviewLink;
        int iHashCode15 = (((((iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isUpdated)) * 31) + C786410Ut5.Z2(this.isLocal)) * 31;
        ReviewTranslation reviewTranslation = this.translation;
        int iHashCode16 = (iHashCode15 + (reviewTranslation == null ? 0 : reviewTranslation.hashCode())) * 31;
        String str6 = this.popupTitle;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.popupContent;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.popupButtonText;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sellerName;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.reviewHintText;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.daInfo;
        return iHashCode21 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewItemStruct(review=" + this.review + ", specification=" + this.specification + ", skuId=" + this.skuId + ", diggCount=" + this.diggCount + ", isDigged=" + this.isDigged + ", isHiddenDiggArea=" + this.isHiddenDiggArea + ", isOwner=" + this.isOwner + ", user=" + this.user + ", tags=" + this.tags + ", isAnonymous=" + this.isAnonymous + ", reviewSourceType=" + this.reviewSourceType + ", reviewSourceName=" + this.reviewSourceName + ", reviewIncentiveName=" + this.reviewIncentiveName + ", reviewSourceInfo=" + this.reviewSourceInfo + ", reviewLink=" + this.reviewLink + ", isUpdated=" + this.isUpdated + ", isLocal=" + this.isLocal + ", translation=" + this.translation + ", popupTitle=" + this.popupTitle + ", popupContent=" + this.popupContent + ", popupButtonText=" + this.popupButtonText + ", sellerName=" + this.sellerName + ", reviewHintText=" + this.reviewHintText + ", daInfo=" + this.daInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MainReview mainReview = this.review;
        if (mainReview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mainReview.writeToParcel(parcel, i);
        }
        parcel.writeString(this.specification);
        parcel.writeString(this.skuId);
        Integer num = this.diggCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isDigged;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isHiddenDiggArea;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isOwner;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        User user = this.user;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        List<ReviewTags> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewTags> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool4 = this.isAnonymous;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.reviewSourceType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.reviewSourceName);
        parcel.writeString(this.reviewIncentiveName);
        ReviewSourceInfo reviewSourceInfo = this.reviewSourceInfo;
        if (reviewSourceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewSourceInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reviewLink);
        parcel.writeInt(this.isUpdated ? 1 : 0);
        parcel.writeInt(this.isLocal ? 1 : 0);
        ReviewTranslation reviewTranslation = this.translation;
        if (reviewTranslation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewTranslation.writeToParcel(parcel, i);
        }
        parcel.writeString(this.popupTitle);
        parcel.writeString(this.popupContent);
        parcel.writeString(this.popupButtonText);
        parcel.writeString(this.sellerName);
        parcel.writeString(this.reviewHintText);
        parcel.writeString(this.daInfo);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.brickName;
    }

    public static ReviewItemStruct LIZ(ReviewItemStruct reviewItemStruct, Integer num, Boolean bool) {
        MainReview mainReview = reviewItemStruct.review;
        String str = reviewItemStruct.specification;
        String str2 = reviewItemStruct.skuId;
        Boolean bool2 = reviewItemStruct.isHiddenDiggArea;
        Boolean bool3 = reviewItemStruct.isOwner;
        User user = reviewItemStruct.user;
        List<ReviewTags> list = reviewItemStruct.tags;
        Boolean bool4 = reviewItemStruct.isAnonymous;
        Integer num2 = reviewItemStruct.reviewSourceType;
        String str3 = reviewItemStruct.reviewSourceName;
        String str4 = reviewItemStruct.reviewIncentiveName;
        ReviewSourceInfo reviewSourceInfo = reviewItemStruct.reviewSourceInfo;
        String str5 = reviewItemStruct.reviewLink;
        boolean z = reviewItemStruct.isUpdated;
        boolean z2 = reviewItemStruct.isLocal;
        ReviewTranslation reviewTranslation = reviewItemStruct.translation;
        String str6 = reviewItemStruct.popupTitle;
        String str7 = reviewItemStruct.popupContent;
        String str8 = reviewItemStruct.popupButtonText;
        String str9 = reviewItemStruct.sellerName;
        String str10 = reviewItemStruct.reviewHintText;
        String str11 = reviewItemStruct.daInfo;
        reviewItemStruct.getClass();
        return new ReviewItemStruct(mainReview, str, str2, num, bool, bool2, bool3, user, list, bool4, num2, str3, str4, reviewSourceInfo, str5, z, z2, reviewTranslation, str6, str7, str8, str9, str10, str11);
    }

    public static final class AppendReview implements Parcelable {

        @C09CT("days_from_purchase")
        public final String daysForPruchase;

        @C09CT("media")
        public final List<ReviewMedia> media;

        @C09CT("reply_append_review")
        public final String reply;

        @C09CT("text")
        public final String text;
        public static final Parcelable.Creator<AppendReview> CREATOR = new Parcelable.Creator<AppendReview>() { // from class: X.0mgH
            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.AppendReview createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(ReviewMedia.CREATOR.createFromParcel(parcel));
                    }
                }
                return new ReviewItemStruct.AppendReview(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.AppendReview[] newArray(int i) {
                return new ReviewItemStruct.AppendReview[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppendReview)) {
                return false;
            }
            AppendReview appendReview = (AppendReview) obj;
            return Intrinsics.LJFF(this.text, appendReview.text) && Intrinsics.LJFF(this.daysForPruchase, appendReview.daysForPruchase) && Intrinsics.LJFF(this.reply, appendReview.reply) && Intrinsics.LJFF(this.media, appendReview.media);
        }

        public final int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.daysForPruchase;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.reply;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<ReviewMedia> list = this.media;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AppendReview(text=");
            sbLIZ.append(this.text);
            sbLIZ.append(", daysForPruchase=");
            sbLIZ.append(this.daysForPruchase);
            sbLIZ.append(", reply=");
            sbLIZ.append(this.reply);
            sbLIZ.append(", media=");
            sbLIZ.append(this.media);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.text);
            parcel.writeString(this.daysForPruchase);
            parcel.writeString(this.reply);
            List<ReviewMedia> list = this.media;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewMedia> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }

        public AppendReview(String str, String str2, String str3, List<ReviewMedia> list) {
            this.text = str;
            this.daysForPruchase = str2;
            this.reply = str3;
            this.media = list;
        }
    }

    public static final class DisplayReviewText implements Parcelable {

        @C09CT("plain_text")
        public final String plainText;

        @C09CT("tag_key")
        public final String tagKey;

        @C09CT("tag_text")
        public final String tagText;

        @C09CT("text_type")
        public final Integer textType;
        public static final C1405640mgM Companion = new Object() { // from class: X.0mgM
        };
        public static final Parcelable.Creator<DisplayReviewText> CREATOR = new Parcelable.Creator<DisplayReviewText>() { // from class: X.0mgL
            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.DisplayReviewText createFromParcel(Parcel parcel) {
                Integer numValueOf;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new ReviewItemStruct.DisplayReviewText(numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.DisplayReviewText[] newArray(int i) {
                return new ReviewItemStruct.DisplayReviewText[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayReviewText)) {
                return false;
            }
            DisplayReviewText displayReviewText = (DisplayReviewText) obj;
            return Intrinsics.LJFF(this.textType, displayReviewText.textType) && Intrinsics.LJFF(this.plainText, displayReviewText.plainText) && Intrinsics.LJFF(this.tagKey, displayReviewText.tagKey) && Intrinsics.LJFF(this.tagText, displayReviewText.tagText);
        }

        public final int hashCode() {
            Integer num = this.textType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.plainText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tagKey;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tagText;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DisplayReviewText(textType=");
            sbLIZ.append(this.textType);
            sbLIZ.append(", plainText=");
            sbLIZ.append(this.plainText);
            sbLIZ.append(", tagKey=");
            sbLIZ.append(this.tagKey);
            sbLIZ.append(", tagText=");
            sbLIZ.append(this.tagText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.textType;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.plainText);
            parcel.writeString(this.tagKey);
            parcel.writeString(this.tagText);
        }

        public DisplayReviewText(Integer num, String str, String str2, String str3) {
            this.textType = num;
            this.plainText = str;
            this.tagKey = str2;
            this.tagText = str3;
        }
    }

    public static final class User implements Parcelable {

        @C09CT("avatar")
        public final Image avatar;

        @C09CT("default_avatar")
        public final Icon defaultAvatar;

        @C09CT("user_id")
        public final String id;

        @C09CT("link")
        public final String link;

        @C09CT("name")
        public final String name;
        public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() { // from class: X.0mhf
            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.User createFromParcel(Parcel parcel) {
                return new ReviewItemStruct.User(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ReviewItemStruct.User.class.getClassLoader()), parcel.readString(), (Icon) parcel.readParcelable(ReviewItemStruct.User.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.User[] newArray(int i) {
                return new ReviewItemStruct.User[i];
            }
        };
        public static final int $stable = 8;

        public User() {
            this(null, null, null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return Intrinsics.LJFF(this.id, user.id) && Intrinsics.LJFF(this.name, user.name) && Intrinsics.LJFF(this.avatar, user.avatar) && Intrinsics.LJFF(this.link, user.link) && Intrinsics.LJFF(this.defaultAvatar, user.defaultAvatar);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.avatar;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            String str3 = this.link;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Icon icon = this.defaultAvatar;
            return iHashCode4 + (icon != null ? icon.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("User(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", avatar=");
            sbLIZ.append(this.avatar);
            sbLIZ.append(", link=");
            sbLIZ.append(this.link);
            sbLIZ.append(", defaultAvatar=");
            sbLIZ.append(this.defaultAvatar);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.avatar, i);
            parcel.writeString(this.link);
            parcel.writeParcelable(this.defaultAvatar, i);
        }

        public User(String str, String str2, Image image, String str3, Icon icon) {
            this.id = str;
            this.name = str2;
            this.avatar = image;
            this.link = str3;
            this.defaultAvatar = icon;
        }
    }

    public static final class MainReview implements Parcelable {

        @C09CT("append_review")
        public final AppendReview appendReview;

        @C09CT("display_review_text")
        public final List<DisplayReviewText> displayReviewTexts;

        @C09CT("has_origin_text")
        public final Boolean hasOriginText;

        @C09CT("media")
        public final List<ReviewMedia> media;

        @C09CT("rating")
        public final String rating;

        @C09CT("reply_main_review")
        public final String reply;

        @C09CT("review_aspect_items")
        public final List<ReviewAspectItem> reviewAspectItems;

        @C09CT("review_country")
        public final String reviewCountry;

        @C09CT("review_id")
        public final String reviewId;

        @C09CT("review_timestamp")
        public final String reviewTimeStamp;

        @C09CT("review_timestamp_fmt")
        public final String reviewTimestampFmt;

        @C09CT("main_review_title")
        public final String reviewTitle;

        @C09CT("display_text")
        public final String text;
        public static final Parcelable.Creator<MainReview> CREATOR = new Parcelable.Creator<MainReview>() { // from class: X.0mgK
            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.MainReview createFromParcel(Parcel parcel) {
                ReviewItemStruct.AppendReview appendReviewCreateFromParcel;
                boolean z;
                Boolean boolValueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ArrayList arrayList3 = null;
                if (parcel.readInt() == 0) {
                    appendReviewCreateFromParcel = null;
                } else {
                    appendReviewCreateFromParcel = ReviewItemStruct.AppendReview.CREATOR.createFromParcel(parcel);
                }
                ReviewItemStruct.AppendReview appendReview = appendReviewCreateFromParcel;
                String string5 = parcel.readString();
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
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(ReviewItemStruct.DisplayReviewText.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(ReviewAspectItem.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i5 = parcel.readInt();
                    arrayList3 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList3.add(ReviewMedia.CREATOR.createFromParcel(parcel));
                    }
                }
                return new ReviewItemStruct.MainReview(string, string2, string3, string4, appendReview, string5, boolValueOf, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewItemStruct.MainReview[] newArray(int i) {
                return new ReviewItemStruct.MainReview[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainReview)) {
                return false;
            }
            MainReview mainReview = (MainReview) obj;
            return Intrinsics.LJFF(this.reviewId, mainReview.reviewId) && Intrinsics.LJFF(this.rating, mainReview.rating) && Intrinsics.LJFF(this.text, mainReview.text) && Intrinsics.LJFF(this.reviewTimeStamp, mainReview.reviewTimeStamp) && Intrinsics.LJFF(this.appendReview, mainReview.appendReview) && Intrinsics.LJFF(this.reply, mainReview.reply) && Intrinsics.LJFF(this.hasOriginText, mainReview.hasOriginText) && Intrinsics.LJFF(this.displayReviewTexts, mainReview.displayReviewTexts) && Intrinsics.LJFF(this.reviewAspectItems, mainReview.reviewAspectItems) && Intrinsics.LJFF(this.media, mainReview.media) && Intrinsics.LJFF(this.reviewTimestampFmt, mainReview.reviewTimestampFmt) && Intrinsics.LJFF(this.reviewTitle, mainReview.reviewTitle) && Intrinsics.LJFF(this.reviewCountry, mainReview.reviewCountry);
        }

        public final int hashCode() {
            String str = this.reviewId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rating;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.text;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.reviewTimeStamp;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            AppendReview appendReview = this.appendReview;
            int iHashCode5 = (iHashCode4 + (appendReview == null ? 0 : appendReview.hashCode())) * 31;
            String str5 = this.reply;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.hasOriginText;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<DisplayReviewText> list = this.displayReviewTexts;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            List<ReviewAspectItem> list2 = this.reviewAspectItems;
            int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<ReviewMedia> list3 = this.media;
            int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str6 = this.reviewTimestampFmt;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.reviewTitle;
            int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.reviewCountry;
            return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            return "MainReview(reviewId=" + this.reviewId + ", rating=" + this.rating + ", text=" + this.text + ", reviewTimeStamp=" + this.reviewTimeStamp + ", appendReview=" + this.appendReview + ", reply=" + this.reply + ", hasOriginText=" + this.hasOriginText + ", displayReviewTexts=" + this.displayReviewTexts + ", reviewAspectItems=" + this.reviewAspectItems + ", media=" + this.media + ", reviewTimestampFmt=" + this.reviewTimestampFmt + ", reviewTitle=" + this.reviewTitle + ", reviewCountry=" + this.reviewCountry + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.reviewId);
            parcel.writeString(this.rating);
            parcel.writeString(this.text);
            parcel.writeString(this.reviewTimeStamp);
            AppendReview appendReview = this.appendReview;
            if (appendReview == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appendReview.writeToParcel(parcel, i);
            }
            parcel.writeString(this.reply);
            Boolean bool = this.hasOriginText;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            List<DisplayReviewText> list = this.displayReviewTexts;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<DisplayReviewText> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            List<ReviewAspectItem> list2 = this.reviewAspectItems;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<ReviewAspectItem> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            List<ReviewMedia> list3 = this.media;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list3.size());
                Iterator<ReviewMedia> it4 = list3.iterator();
                while (it4.hasNext()) {
                    it4.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.reviewTimestampFmt);
            parcel.writeString(this.reviewTitle);
            parcel.writeString(this.reviewCountry);
        }

        public MainReview(String str, String str2, String str3, String str4, AppendReview appendReview, String str5, Boolean bool, List<DisplayReviewText> list, List<ReviewAspectItem> list2, List<ReviewMedia> list3, String str6, String str7, String str8) {
            this.reviewId = str;
            this.rating = str2;
            this.text = str3;
            this.reviewTimeStamp = str4;
            this.appendReview = appendReview;
            this.reply = str5;
            this.hasOriginText = bool;
            this.displayReviewTexts = list;
            this.reviewAspectItems = list2;
            this.media = list3;
            this.reviewTimestampFmt = str6;
            this.reviewTitle = str7;
            this.reviewCountry = str8;
        }
    }

    public ReviewItemStruct(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, User user, List<ReviewTags> list, Boolean bool4, Integer num2, String str3, String str4, ReviewSourceInfo reviewSourceInfo, String str5, boolean z, boolean z2, ReviewTranslation reviewTranslation, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.review = mainReview;
        this.specification = str;
        this.skuId = str2;
        this.diggCount = num;
        this.isDigged = bool;
        this.isHiddenDiggArea = bool2;
        this.isOwner = bool3;
        this.user = user;
        this.tags = list;
        this.isAnonymous = bool4;
        this.reviewSourceType = num2;
        this.reviewSourceName = str3;
        this.reviewIncentiveName = str4;
        this.reviewSourceInfo = reviewSourceInfo;
        this.reviewLink = str5;
        this.isUpdated = z;
        this.isLocal = z2;
        this.translation = reviewTranslation;
        this.popupTitle = str6;
        this.popupContent = str7;
        this.popupButtonText = str8;
        this.sellerName = str9;
        this.reviewHintText = str10;
        this.daInfo = str11;
    }
}
