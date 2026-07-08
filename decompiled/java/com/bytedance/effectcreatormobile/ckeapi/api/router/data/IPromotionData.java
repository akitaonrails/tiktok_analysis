package com.bytedance.effectcreatormobile.ckeapi.api.router.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface IPromotionData {

    public static final class PromotionBannerData implements IPromotionData {

        @C09CT("banner_id")
        public final String bannerId;

        @C09CT("banner_url")
        public final String bannerUrl;

        @C09CT("target_url")
        public final String targetUrl;

        public final PromotionBannerData copy(String str, String str2, String str3) {
            return new PromotionBannerData(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionBannerData)) {
                return false;
            }
            PromotionBannerData promotionBannerData = (PromotionBannerData) obj;
            return Intrinsics.LJFF(this.bannerUrl, promotionBannerData.bannerUrl) && Intrinsics.LJFF(this.targetUrl, promotionBannerData.targetUrl) && Intrinsics.LJFF(this.bannerId, promotionBannerData.bannerId);
        }

        public int hashCode() {
            return (((this.bannerUrl.hashCode() * 31) + this.targetUrl.hashCode()) * 31) + this.bannerId.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PromotionBannerData(bannerUrl=");
            sbLIZ.append(this.bannerUrl);
            sbLIZ.append(", targetUrl=");
            sbLIZ.append(this.targetUrl);
            sbLIZ.append(", bannerId=");
            sbLIZ.append(this.bannerId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PromotionBannerData() {
            this("", "", "");
        }

        public final String getBannerId() {
            return this.bannerId;
        }

        public final String getBannerUrl() {
            return this.bannerUrl;
        }

        public final String getTargetUrl() {
            return this.targetUrl;
        }

        public PromotionBannerData(String str, String str2, String str3) {
            this.bannerUrl = str;
            this.targetUrl = str2;
            this.bannerId = str3;
        }
    }

    public static final class PromotionLokiData implements IPromotionData {
        public final String categoryKey;
        public final String coverUrl;
        public final String effectId;
        public final String name;
        public final String originCategoryId;
        public final String resId;
        public final String resType;
        public final String secondObjectType;
        public final int useCount;

        public final PromotionLokiData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
            return new PromotionLokiData(str, str2, str3, str4, str5, str6, i, str7, str8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionLokiData)) {
                return false;
            }
            PromotionLokiData promotionLokiData = (PromotionLokiData) obj;
            return Intrinsics.LJFF(this.resId, promotionLokiData.resId) && Intrinsics.LJFF(this.effectId, promotionLokiData.effectId) && Intrinsics.LJFF(this.coverUrl, promotionLokiData.coverUrl) && Intrinsics.LJFF(this.name, promotionLokiData.name) && Intrinsics.LJFF(this.resType, promotionLokiData.resType) && Intrinsics.LJFF(this.secondObjectType, promotionLokiData.secondObjectType) && this.useCount == promotionLokiData.useCount && Intrinsics.LJFF(this.categoryKey, promotionLokiData.categoryKey) && Intrinsics.LJFF(this.originCategoryId, promotionLokiData.originCategoryId);
        }

        public int hashCode() {
            return (((((((((((((((this.resId.hashCode() * 31) + this.effectId.hashCode()) * 31) + this.coverUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.resType.hashCode()) * 31) + this.secondObjectType.hashCode()) * 31) + this.useCount) * 31) + this.categoryKey.hashCode()) * 31) + this.originCategoryId.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PromotionLokiData(resId=");
            sbLIZ.append(this.resId);
            sbLIZ.append(", effectId=");
            sbLIZ.append(this.effectId);
            sbLIZ.append(", coverUrl=");
            sbLIZ.append(this.coverUrl);
            sbLIZ.append(", name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", resType=");
            sbLIZ.append(this.resType);
            sbLIZ.append(", secondObjectType=");
            sbLIZ.append(this.secondObjectType);
            sbLIZ.append(", useCount=");
            sbLIZ.append(this.useCount);
            sbLIZ.append(", categoryKey=");
            sbLIZ.append(this.categoryKey);
            sbLIZ.append(", originCategoryId=");
            sbLIZ.append(this.originCategoryId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getCategoryKey() {
            return this.categoryKey;
        }

        public final String getCoverUrl() {
            return this.coverUrl;
        }

        public final String getEffectId() {
            return this.effectId;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginCategoryId() {
            return this.originCategoryId;
        }

        public final String getResId() {
            return this.resId;
        }

        public final String getResType() {
            return this.resType;
        }

        public final String getSecondObjectType() {
            return this.secondObjectType;
        }

        public final int getUseCount() {
            return this.useCount;
        }

        public PromotionLokiData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
            this.resId = str;
            this.effectId = str2;
            this.coverUrl = str3;
            this.name = str4;
            this.resType = str5;
            this.secondObjectType = str6;
            this.useCount = i;
            this.categoryKey = str7;
            this.originCategoryId = str8;
        }
    }
}
