package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Entrance {

    @C09CT("dark_mode_icon")
    public ImageModel darkModeIcon;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("is_disabled")
    public boolean isDisabled;

    @C09CT("off_dark_mode_icon")
    public ImageModel offDarkModeIcon;

    @C09CT("off_icon")
    public ImageModel offIcon;

    @C09CT("on_dark_mode_icon")
    public ImageModel onDarkModeIcon;

    @C09CT("on_icon")
    public ImageModel onIcon;

    @C09CT("show_exclamation_mark")
    public boolean showExclamationMark;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("text")
    public String text = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("red_dot_ids")
    public List<String> redDotIds = new ArrayList();
}
