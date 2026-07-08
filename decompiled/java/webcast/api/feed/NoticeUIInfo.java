package webcast.api.feed;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeUIInfo {

    @C09CT("button")
    public NoticeButton button;

    @C09CT("content")
    public TopliveNoticeTextStruct content;

    @C09CT("default_jump_type")
    public int defaultJumpType;

    @C09CT("right_image")
    public NoticeUrlStruct rightImage;

    @C09CT("ui_type")
    public int uiType;

    @C09CT("from_user_list")
    public List<NoticeUserStruct> fromUserList = new ArrayList();

    @C09CT("tux_id")
    public String tuxId = "";

    @C09CT("tux_color")
    public String tuxColor = "";
}
