package com.bytedance.lynx.spark.schema.model;

import X.EnumC1067640dtC;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkPageSchemaParam extends AbsSparkPageSchemaParam {
    /* JADX WARN: Multi-variable type inference failed */
    public SparkPageSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SparkPageSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
    }

    public /* synthetic */ SparkPageSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
