package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutDSLConfig {
    public static final Companion Companion = new Companion();
    public final String layoutId;
    public final int sceneVersion;

    public static final class Builder {
        public String layoutId = "";
        public int sceneVersion;

        public final LayoutDSLConfig build() {
            return new LayoutDSLConfig(this);
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final int getSceneVersion() {
            return this.sceneVersion;
        }

        public final void setLayoutId(String str) {
            this.layoutId = str;
        }

        public final void setSceneVersion(int i) {
            this.sceneVersion = i;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutDSLConfig(sceneVersion=");
        sbLIZ.append(this.sceneVersion);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.layoutId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Companion {
        public final LayoutDSLConfig build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public LayoutDSLConfig(Builder builder) {
        this(builder.getSceneVersion(), builder.getLayoutId());
    }

    public LayoutDSLConfig(int i, String str) {
        this.sceneVersion = i;
        this.layoutId = str;
    }
}
