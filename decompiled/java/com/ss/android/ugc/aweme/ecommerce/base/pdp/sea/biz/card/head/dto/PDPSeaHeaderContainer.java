package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPSeaHeaderContainer {

    @C09CT("template")
    public final String template;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPSeaHeaderContainer)) {
            return false;
        }
        PDPSeaHeaderContainer pDPSeaHeaderContainer = (PDPSeaHeaderContainer) obj;
        return Intrinsics.LJFF(this.type, pDPSeaHeaderContainer.type) && Intrinsics.LJFF(this.template, pDPSeaHeaderContainer.template);
    }

    public PDPSeaHeaderContainer(String str, String str2) {
        this.type = str;
        this.template = str2;
    }
}
