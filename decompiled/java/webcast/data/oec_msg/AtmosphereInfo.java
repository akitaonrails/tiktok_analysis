package webcast.data.oec_msg;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AtmosphereInfo {

    @C09CT("tags")
    public List<Tag> tags = new ArrayList();

    public static final class Tag {

        @C09CT("count")
        public long count;

        @C09CT("desc")
        public String desc = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("type")
        public int type;
    }
}
