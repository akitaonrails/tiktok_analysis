package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Facade implements Serializable {

    @C09CT("body")
    public final List<GroupFacade> body;

    @C09CT("footer")
    public final List<String> footer;

    @C09CT("header")
    public final List<String> header;

    @C09CT("overlay")
    public final List<String> overlay;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Facade)) {
            return false;
        }
        GodaV2Facade godaV2Facade = (GodaV2Facade) obj;
        return Intrinsics.LJFF(this.header, godaV2Facade.header) && Intrinsics.LJFF(this.body, godaV2Facade.body) && Intrinsics.LJFF(this.footer, godaV2Facade.footer) && Intrinsics.LJFF(this.overlay, godaV2Facade.overlay);
    }

    public GodaV2Facade(List<String> list, List<GroupFacade> list2, List<String> list3, List<String> list4) {
        this.header = list;
        this.body = list2;
        this.footer = list3;
        this.overlay = list4;
    }
}
