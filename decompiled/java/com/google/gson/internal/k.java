package com.google.gson.internal;

import X.C2188811AlT;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements t<Object> {
    public final /* synthetic */ Type LIZ;

    @Override // com.google.gson.internal.t
    public final Object LIZ() {
        Type type = this.LIZ;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid EnumSet type: ");
            sbLIZ.append(this.LIZ.toString());
            throw new com.google.gson.l(C2188811AlT.LIZIZ(sbLIZ));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Invalid EnumSet type: ");
        sbLIZ2.append(this.LIZ.toString());
        throw new com.google.gson.l(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public k(Type type) {
        this.LIZ = type;
    }
}
