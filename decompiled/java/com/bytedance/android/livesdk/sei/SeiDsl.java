package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class SeiDsl {

    @C09CT("layoutId")
    public String layoutId = "";

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sync_layout_id")
    public final String syncLayoutId;

    @C09CT("version")
    public int version;

    public final int hashCode() {
        int iHashCode = (this.scene * 31) + this.version;
        String str = this.layoutId;
        if (str != null) {
            iHashCode = (iHashCode * 31) + str.hashCode();
        }
        String str2 = this.syncLayoutId;
        return str2 != null ? (iHashCode * 31) + str2.hashCode() : iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SeiDsl)) {
            return false;
        }
        SeiDsl seiDsl = (SeiDsl) obj;
        if (this.scene == seiDsl.scene && this.version == seiDsl.version && Intrinsics.LJFF(this.layoutId, seiDsl.layoutId) && Intrinsics.LJFF(this.syncLayoutId, seiDsl.syncLayoutId)) {
            return true;
        }
        return false;
    }
}
