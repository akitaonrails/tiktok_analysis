package webcast.data.multi_guest_play;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperContext {
    public boolean LIZ;
    public int LIZIZ;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("user_id")
    public long userId;

    @C09CT("wallpaper_start_time")
    public long wallpaperStartTime;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("user_keywords")
    public String userKeywords = "";

    @C09CT("linkmic_id_str")
    public String linkmicIdStr = "";
}
