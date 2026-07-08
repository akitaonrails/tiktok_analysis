package com.bytedance.pumbaa.hybrid.engine.api.model;

import X.C09CT;
import X.EnumC822390WNx;

/* JADX INFO: loaded from: classes14.dex */
public final class ValueModel {

    @C09CT("sub_type")
    public final EnumC822390WNx subType;

    @C09CT("type")
    public final EnumC822390WNx type;

    @C09CT("value")
    public final Object value;

    public ValueModel(EnumC822390WNx enumC822390WNx, Object obj, EnumC822390WNx enumC822390WNx2) {
        this.type = enumC822390WNx;
        this.value = obj;
        this.subType = enumC822390WNx2;
    }
}
