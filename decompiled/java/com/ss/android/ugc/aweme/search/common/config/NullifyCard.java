package com.ss.android.ugc.aweme.search.common.config;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NullifyCard {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("doc_type")
    public final Integer docType;

    @C09CT("origin_type")
    public final Integer originType;

    @C09CT("top_bar_type")
    public final Integer topBarType;

    @C09CT("type")
    public final int type;

    public NullifyCard() {
        this(0, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullifyCard)) {
            return false;
        }
        NullifyCard nullifyCard = (NullifyCard) obj;
        return this.type == nullifyCard.type && Intrinsics.LJFF(this.docType, nullifyCard.docType) && Intrinsics.LJFF(this.originType, nullifyCard.originType) && Intrinsics.LJFF(this.topBarType, nullifyCard.topBarType);
    }

    public final int hashCode() {
        int i = this.type * 31;
        Integer num = this.docType;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.originType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.topBarType;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public NullifyCard(int i, Integer num, Integer num2, Integer num3) {
        this.type = i;
        this.docType = num;
        this.originType = num2;
        this.topBarType = num3;
    }
}
