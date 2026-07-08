package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Container {

    @C09CT("type")
    public final String containerType;

    @C09CT("template")
    public final String template;

    @C09CT("version")
    public final Integer version;

    public GodaV2Container() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Container)) {
            return false;
        }
        GodaV2Container godaV2Container = (GodaV2Container) obj;
        return Intrinsics.LJFF(this.containerType, godaV2Container.containerType) && Intrinsics.LJFF(this.template, godaV2Container.template) && Intrinsics.LJFF(this.version, godaV2Container.version);
    }

    public GodaV2Container(String str, String str2, Integer num) {
        this.containerType = str;
        this.template = str2;
        this.version = num;
    }
}
