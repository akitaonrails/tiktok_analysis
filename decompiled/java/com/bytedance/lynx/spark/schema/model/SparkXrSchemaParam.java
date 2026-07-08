package com.bytedance.lynx.spark.schema.model;

import X.EnumC1067640dtC;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkXrSchemaParam extends SparkSchemaParam {
    public boolean exitOnActivityFinish;
    public String splashDrawable;
    public String splashTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkXrSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean getExitOnActivityFinish() {
        return this.exitOnActivityFinish;
    }

    public final String getSplashDrawable() {
        return this.splashDrawable;
    }

    public final String getSplashTitle() {
        return this.splashTitle;
    }

    public SparkXrSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
        this.splashDrawable = "spark_icon";
        this.splashTitle = "App Title";
    }

    public final void setExitOnActivityFinish(boolean z) {
        this.exitOnActivityFinish = z;
    }

    public final void setSplashDrawable(String str) {
        this.splashDrawable = str;
    }

    public final void setSplashTitle(String str) {
        this.splashTitle = str;
    }

    public /* synthetic */ SparkXrSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
