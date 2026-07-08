package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UserEmotePollOptionsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        /* JADX INFO: renamed from: emotes, reason: collision with root package name */
        @C09CT("emotes")
        public List<UserEmote> f1039emotes = new ArrayList();

        @C09CT("default_package_name")
        public String defaultPackageName = "";
    }
}
