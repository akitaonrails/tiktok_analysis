package webcast.data.oec_msg;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class UserInfo {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("is_winner")
    public boolean isWinner;

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("user_id")
    public long userId;
}
