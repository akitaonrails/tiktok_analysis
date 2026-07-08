package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class WebcastRoomRepostRepostersResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("reposters")
        public List<Reposter> reposters = new ArrayList();
    }

    public static final class Reposter {

        @C09CT("repost_note")
        public String repostNote = "";

        @C09CT("repost_timestamp")
        public long repostTimestamp;

        @C09CT("type")
        public int type;

        @C09CT("user")
        public User user;
    }
}
