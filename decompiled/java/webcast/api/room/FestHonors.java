package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FestHonors {

    @C09CT("honors")
    public List<Honor> honors = new ArrayList();

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("border_color")
    public String borderColor = "";

    @C09CT("text_color")
    public String textColor = "";

    @C09CT("jump_schema_url")
    public String jumpSchemaUrl = "";

    public static final class Honor {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("icon_url")
        public String iconUrl = "";
    }
}
