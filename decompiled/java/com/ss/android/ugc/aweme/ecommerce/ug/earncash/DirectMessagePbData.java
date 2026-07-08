package com.ss.android.ugc.aweme.ecommerce.ug.earncash;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DirectMessagePbData {

    @C09CT("message_data")
    public final String contentPb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public DirectMessagePbData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectMessagePbData)) {
            return false;
        }
        DirectMessagePbData directMessagePbData = (DirectMessagePbData) obj;
        return Intrinsics.LJFF(this.id, directMessagePbData.id) && Intrinsics.LJFF(this.scene, directMessagePbData.scene) && Intrinsics.LJFF(this.contentPb, directMessagePbData.contentPb);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentPb;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectMessagePbData(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", contentPb=");
        sbLIZ.append(this.contentPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DirectMessagePbData(String str, String str2, String str3) {
        this.id = str;
        this.scene = str2;
        this.contentPb = str3;
    }
}
