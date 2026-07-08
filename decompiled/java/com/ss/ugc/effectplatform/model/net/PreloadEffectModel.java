package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadEffectModel implements Serializable {
    public final String effect_id;
    public final String md5;

    public int hashCode() {
        return (this.effect_id.hashCode() * 31) + this.md5.hashCode();
    }

    public final String getEffect_id() {
        return this.effect_id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreloadEffectModel.class != obj.getClass()) {
            return false;
        }
        PreloadEffectModel preloadEffectModel = (PreloadEffectModel) obj;
        if (Intrinsics.LJFF(this.effect_id, preloadEffectModel.effect_id) && Intrinsics.LJFF(this.md5, preloadEffectModel.md5)) {
            return true;
        }
        return false;
    }

    public PreloadEffectModel(String str, String str2) {
        this.effect_id = str;
        this.md5 = str2;
    }
}
