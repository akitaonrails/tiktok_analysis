package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("user_id")
    public long userId;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.userId) * 31) + this.nickname.hashCode()) * 31) + this.displayId.hashCode();
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
        if (!Intrinsics.LJFF(SimpleUser.class, cls)) {
            return false;
        }
        SimpleUser simpleUser = (SimpleUser) obj;
        if (this.userId == simpleUser.userId && Intrinsics.LJFF(this.nickname, simpleUser.nickname) && Intrinsics.LJFF(this.displayId, simpleUser.displayId)) {
            return true;
        }
        return false;
    }
}
