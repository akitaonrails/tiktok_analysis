package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LinkBlock {

    @C09CT("button_name")
    public final String buttonName;

    @C09CT("link_text")
    public final String linkText;

    @C09CT("schema")
    public final String schema;

    public LinkBlock() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkBlock)) {
            return false;
        }
        LinkBlock linkBlock = (LinkBlock) obj;
        return Intrinsics.LJFF(this.linkText, linkBlock.linkText) && Intrinsics.LJFF(this.schema, linkBlock.schema) && Intrinsics.LJFF(this.buttonName, linkBlock.buttonName);
    }

    public LinkBlock(String str, String str2, String str3) {
        this.linkText = str;
        this.schema = str2;
        this.buttonName = str3;
    }
}
