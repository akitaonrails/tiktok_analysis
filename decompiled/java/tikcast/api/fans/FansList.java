package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FansList {

    @C09CT("fans_count")
    public long fansCount;

    @C09CT("preview_user")
    public List<User> previewUser = new ArrayList();
}
