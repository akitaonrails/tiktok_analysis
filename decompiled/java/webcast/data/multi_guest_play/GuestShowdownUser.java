package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("rank")
    public int rank;

    @C09CT("score")
    public long score;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_tag")
    public int userTag;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("icon_name")
    public String iconName = "";

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.userId) * 31) + this.linkmicId.hashCode()) * 31) + C786410Ut5.Y2(this.score)) * 31) + this.rank) * 31) + this.nickname.hashCode()) * 31) + this.displayId.hashCode()) * 31;
        ImageModel imageModel = this.avatarThumb;
        return ((((iY2 + (imageModel != null ? imageModel.hashCode() : 0)) * 31) + this.userTag) * 31) + this.iconName.hashCode();
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
        if (!Intrinsics.LJFF(GuestShowdownUser.class, cls)) {
            return false;
        }
        GuestShowdownUser guestShowdownUser = (GuestShowdownUser) obj;
        if (this.userId == guestShowdownUser.userId && Intrinsics.LJFF(this.linkmicId, guestShowdownUser.linkmicId) && this.score == guestShowdownUser.score && this.rank == guestShowdownUser.rank && Intrinsics.LJFF(this.nickname, guestShowdownUser.nickname) && Intrinsics.LJFF(this.displayId, guestShowdownUser.displayId) && Intrinsics.LJFF(this.avatarThumb, guestShowdownUser.avatarThumb) && this.userTag == guestShowdownUser.userTag && Intrinsics.LJFF(this.iconName, guestShowdownUser.iconName)) {
            return true;
        }
        return false;
    }
}
