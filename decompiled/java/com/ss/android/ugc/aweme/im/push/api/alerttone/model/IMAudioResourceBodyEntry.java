package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMAudioResourceBodyEntry {

    @C09CT("public_resource_audio_id")
    public final String audioResourceId;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public IMAudioResourceBodyEntry() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMAudioResourceBodyEntry)) {
            return false;
        }
        IMAudioResourceBodyEntry iMAudioResourceBodyEntry = (IMAudioResourceBodyEntry) obj;
        return Intrinsics.LJFF(this.scene, iMAudioResourceBodyEntry.scene) && Intrinsics.LJFF(this.audioResourceId, iMAudioResourceBodyEntry.audioResourceId);
    }

    public final int hashCode() {
        Integer num = this.scene;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.audioResourceId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAudioResourceBodyEntry(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", audioResourceId=");
        sbLIZ.append(this.audioResourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMAudioResourceBodyEntry(Integer num, String str) {
        this.scene = num;
        this.audioResourceId = str;
    }
}
