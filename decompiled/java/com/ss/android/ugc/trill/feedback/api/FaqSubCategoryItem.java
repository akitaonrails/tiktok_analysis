package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FaqSubCategoryItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("Children")
    public final List<FaqSubCategoryItem> children;

    @C09CT("FaqId")
    public final String faqId;

    @C09CT("HasChildren")
    public final Boolean hasChildren;

    @C09CT("ImageUrl")
    public final String imageUrl;

    @C09CT("Name")
    public final String name;

    @C09CT("OriginalLabelId")
    public final Integer originalLabelId;

    @C09CT("Url")
    public final String url;

    @C09CT("Value")
    public final String value;

    public FaqSubCategoryItem() {
        this("", "", "", new ArrayList(), Boolean.FALSE, "", 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqSubCategoryItem)) {
            return false;
        }
        FaqSubCategoryItem faqSubCategoryItem = (FaqSubCategoryItem) obj;
        return Intrinsics.LJFF(this.faqId, faqSubCategoryItem.faqId) && Intrinsics.LJFF(this.name, faqSubCategoryItem.name) && Intrinsics.LJFF(this.value, faqSubCategoryItem.value) && Intrinsics.LJFF(this.children, faqSubCategoryItem.children) && Intrinsics.LJFF(this.hasChildren, faqSubCategoryItem.hasChildren) && Intrinsics.LJFF(this.imageUrl, faqSubCategoryItem.imageUrl) && Intrinsics.LJFF(this.originalLabelId, faqSubCategoryItem.originalLabelId) && Intrinsics.LJFF(this.url, faqSubCategoryItem.url);
    }

    public FaqSubCategoryItem(String str, String str2, String str3, List<FaqSubCategoryItem> list, Boolean bool, String str4, Integer num, String str5) {
        this.faqId = str;
        this.name = str2;
        this.value = str3;
        this.children = list;
        this.hasChildren = bool;
        this.imageUrl = str4;
        this.originalLabelId = num;
        this.url = str5;
    }
}
