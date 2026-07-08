package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PopMsgContainer {

    @C09CT("has_jump")
    public boolean hasJump;

    @C09CT("has_pop")
    public boolean hasPop;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("content")
    public String content = "";

    @C09CT("button_content")
    public List<String> buttonContent = new ArrayList();

    @C09CT("title")
    public String title = "";

    @C09CT("jump_title")
    public String jumpTitle = "";

    @C09CT("jump_url")
    public String jumpUrl = "";
}
