package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReqSong {

    @C09CT("req_count")
    public long reqCount;

    @C09CT("song")
    public KaraokeSong song;

    @C09CT("user_list")
    public List<User> userList = new ArrayList();
}
