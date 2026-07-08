package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public final class MultiCancelData {
    public static final Companion Companion = new Companion();
    public final Map<String, Object> custom;

    public static final class Builder {
        public Map<String, ? extends Object> custom;

        public final MultiCancelData build() {
            return new MultiCancelData(this);
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }
    }

    public static final class Companion {
        public final MultiCancelData build(Function1<? super Builder, Unit> function1) {
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }
    }

    public MultiCancelData(Builder builder) {
        this((Map<String, ? extends Object>) builder.getCustom());
    }

    public MultiCancelData(Map<String, ? extends Object> map) {
        this.custom = map;
    }
}
