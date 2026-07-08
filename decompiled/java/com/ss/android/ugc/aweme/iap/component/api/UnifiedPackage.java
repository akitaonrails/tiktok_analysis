package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UnifiedPackage {

    @C09CT("collection_detail_info")
    public final CollectionDetailInfo collectionDetailInfo;

    @C09CT("description")
    public final String description;

    @C09CT("footer")
    public final FooterOverride footer;

    @C09CT("highlight")
    public final Highlight highlight;

    @C09CT("layout")
    public final PackageLayout layout;

    @C09CT("options")
    public final List<UnifiedPurchaseOption> options;

    @C09CT("package_id")
    public final String packageId;

    @C09CT("package_image")
    public final PGCImage packageImage;

    @C09CT("package_type")
    public final Integer packageType;

    @C09CT("plan_change_options")
    public final List<UnifiedPurchaseOption> planChangeOptions;

    @C09CT("post_purchase_info")
    public final PostPurchaseInfo postPurchaseInfo;

    @C09CT("title")
    public final InteractiveTitle title;

    public UnifiedPackage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedPackage)) {
            return false;
        }
        UnifiedPackage unifiedPackage = (UnifiedPackage) obj;
        return Intrinsics.LJFF(this.packageId, unifiedPackage.packageId) && Intrinsics.LJFF(this.title, unifiedPackage.title) && Intrinsics.LJFF(this.description, unifiedPackage.description) && Intrinsics.LJFF(this.packageImage, unifiedPackage.packageImage) && Intrinsics.LJFF(this.packageType, unifiedPackage.packageType) && Intrinsics.LJFF(this.options, unifiedPackage.options) && Intrinsics.LJFF(this.planChangeOptions, unifiedPackage.planChangeOptions) && Intrinsics.LJFF(this.postPurchaseInfo, unifiedPackage.postPurchaseInfo) && Intrinsics.LJFF(this.highlight, unifiedPackage.highlight) && Intrinsics.LJFF(this.layout, unifiedPackage.layout) && Intrinsics.LJFF(this.footer, unifiedPackage.footer) && Intrinsics.LJFF(this.collectionDetailInfo, unifiedPackage.collectionDetailInfo);
    }

    public final int hashCode() {
        String str = this.packageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InteractiveTitle interactiveTitle = this.title;
        int iHashCode2 = (iHashCode + (interactiveTitle == null ? 0 : interactiveTitle.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PGCImage pGCImage = this.packageImage;
        int iHashCode4 = (iHashCode3 + (pGCImage == null ? 0 : pGCImage.hashCode())) * 31;
        Integer num = this.packageType;
        int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.options.hashCode()) * 31) + this.planChangeOptions.hashCode()) * 31;
        PostPurchaseInfo postPurchaseInfo = this.postPurchaseInfo;
        int iHashCode6 = (iHashCode5 + (postPurchaseInfo == null ? 0 : postPurchaseInfo.hashCode())) * 31;
        Highlight highlight = this.highlight;
        int iHashCode7 = (iHashCode6 + (highlight == null ? 0 : highlight.hashCode())) * 31;
        PackageLayout packageLayout = this.layout;
        int iHashCode8 = (iHashCode7 + (packageLayout == null ? 0 : packageLayout.hashCode())) * 31;
        FooterOverride footerOverride = this.footer;
        int iHashCode9 = (iHashCode8 + (footerOverride == null ? 0 : footerOverride.hashCode())) * 31;
        CollectionDetailInfo collectionDetailInfo = this.collectionDetailInfo;
        return iHashCode9 + (collectionDetailInfo != null ? collectionDetailInfo.hashCode() : 0);
    }

    public final String toString() {
        return "UnifiedPackage(packageId=" + this.packageId + ", title=" + this.title + ", description=" + this.description + ", packageImage=" + this.packageImage + ", packageType=" + this.packageType + ", options=" + this.options + ", planChangeOptions=" + this.planChangeOptions + ", postPurchaseInfo=" + this.postPurchaseInfo + ", highlight=" + this.highlight + ", layout=" + this.layout + ", footer=" + this.footer + ", collectionDetailInfo=" + this.collectionDetailInfo + ')';
    }

    public UnifiedPackage(String str, InteractiveTitle interactiveTitle, String str2, PGCImage pGCImage, Integer num, List<UnifiedPurchaseOption> list, List<UnifiedPurchaseOption> list2, PostPurchaseInfo postPurchaseInfo, Highlight highlight, PackageLayout packageLayout, FooterOverride footerOverride, CollectionDetailInfo collectionDetailInfo) {
        this.packageId = str;
        this.title = interactiveTitle;
        this.description = str2;
        this.packageImage = pGCImage;
        this.packageType = num;
        this.options = list;
        this.planChangeOptions = list2;
        this.postPurchaseInfo = postPurchaseInfo;
        this.highlight = highlight;
        this.layout = packageLayout;
        this.footer = footerOverride;
        this.collectionDetailInfo = collectionDetailInfo;
    }

    public UnifiedPackage(String str, InteractiveTitle interactiveTitle, String str2, PGCImage pGCImage, Integer num, List list, List list2, PostPurchaseInfo postPurchaseInfo, Highlight highlight, PackageLayout packageLayout, FooterOverride footerOverride, CollectionDetailInfo collectionDetailInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : interactiveTitle, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : pGCImage, (i & 16) != 0 ? null : num, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? C13BV.INSTANCE : list2, (i & 128) != 0 ? null : postPurchaseInfo, (i & 256) != 0 ? null : highlight, (i & 512) != 0 ? null : packageLayout, (i & 1024) != 0 ? null : footerOverride, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? collectionDetailInfo : null);
    }
}
