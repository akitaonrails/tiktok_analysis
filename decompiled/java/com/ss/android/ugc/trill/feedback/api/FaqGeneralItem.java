package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FaqGeneralItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("faqCategory")
    public final String faqCategory;

    @C09CT("faqName")
    public final String faqName;

    @C09CT("faqSubCategory")
    public final List<FaqSubCategoryItem> faqSubCategory;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqGeneralItem)) {
            return false;
        }
        FaqGeneralItem faqGeneralItem = (FaqGeneralItem) obj;
        return Intrinsics.LJFF(this.faqCategory, faqGeneralItem.faqCategory) && Intrinsics.LJFF(this.faqName, faqGeneralItem.faqName) && Intrinsics.LJFF(this.faqSubCategory, faqGeneralItem.faqSubCategory);
    }

    public FaqGeneralItem() {
        this("", "", new ArrayList());
    }

    public FaqGeneralItem(String str, String str2, List<FaqSubCategoryItem> list) {
        this.faqCategory = str;
        this.faqName = str2;
        this.faqSubCategory = list;
    }
}
