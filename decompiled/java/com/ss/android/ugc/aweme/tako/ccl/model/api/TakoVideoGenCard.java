package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoVideoGenCard {

    @C09CT("generation_desc_list")
    public final List<String> generationDescList;

    @C09CT("title")
    public final String title;

    @C09CT("user_images")
    public final List<String> userImages;

    public TakoVideoGenCard() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoVideoGenCard)) {
            return false;
        }
        TakoVideoGenCard takoVideoGenCard = (TakoVideoGenCard) obj;
        return Intrinsics.LJFF(this.title, takoVideoGenCard.title) && Intrinsics.LJFF(this.userImages, takoVideoGenCard.userImages) && Intrinsics.LJFF(this.generationDescList, takoVideoGenCard.generationDescList);
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.userImages.hashCode()) * 31) + this.generationDescList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoGenCard(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", userImages=");
        sbLIZ.append(this.userImages);
        sbLIZ.append(", generationDescList=");
        sbLIZ.append(this.generationDescList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoVideoGenCard(String str, List<String> list, List<String> list2) {
        this.title = str;
        this.userImages = list;
        this.generationDescList = list2;
    }

    public TakoVideoGenCard(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
