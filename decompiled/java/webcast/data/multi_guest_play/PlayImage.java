package webcast.data.multi_guest_play;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlayImage {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    @C09CT("uri")
    public String uri = "";

    @C09CT("url")
    public String url = "";

    @C09CT("image_id")
    public String imageId = "";

    public final int hashCode() {
        return (((((((this.uri.hashCode() * 31) + this.url.hashCode()) * 31) + this.type) * 31) + this.status) * 31) + this.imageId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayImage(uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append("', url='");
        sbLIZ.append(this.url);
        sbLIZ.append("', type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", imageId='");
        sbLIZ.append(this.imageId);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(PlayImage.class, cls)) {
            return false;
        }
        PlayImage playImage = (PlayImage) obj;
        if (Intrinsics.LJFF(this.uri, playImage.uri) && Intrinsics.LJFF(this.url, playImage.url) && this.type == playImage.type && this.status == playImage.status && Intrinsics.LJFF(this.imageId, playImage.imageId)) {
            return true;
        }
        return false;
    }
}
