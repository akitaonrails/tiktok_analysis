package com.bytedance.goda.model.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaContainer {

    @C09CT("type")
    public final Integer containerType;

    @C09CT("name")
    public final String name;

    @C09CT("schema")
    public final String schema;

    public GodaContainer() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaContainer)) {
            return false;
        }
        GodaContainer godaContainer = (GodaContainer) obj;
        return Intrinsics.LJFF(this.containerType, godaContainer.containerType) && Intrinsics.LJFF(this.name, godaContainer.name) && Intrinsics.LJFF(this.schema, godaContainer.schema);
    }

    public GodaContainer(Integer num, String str, String str2) {
        this.containerType = num;
        this.name = str;
        this.schema = str2;
    }
}
