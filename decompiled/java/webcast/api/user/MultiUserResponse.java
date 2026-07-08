package webcast.api.user;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiUserResponse {

    @C09CT("data")
    public List<User> data;

    @C09CT("extra")
    public UserExtra extra;
}
