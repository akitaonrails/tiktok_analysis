package com.ss.android.ugc.aweme.settingsrequest.model;

import X.C00CW;
import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupSetting extends BaseResponse {

    @C09CT("count")
    public int count;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("popupBatch")
    public int popupBatch;

    @C09CT("text")
    public PopupText popupText;

    @C09CT("show_interval")
    public int showInterval;

    @C09CT("show_time")
    public int show_time;

    public static final class ButtonActionStruct {

        @C09CT("action_type")
        public int actionType;

        @C09CT("target")
        public String target;
    }

    public static final class ButtonStruct {

        @C09CT("action")
        public ButtonActionStruct buttonActionStruct;

        @C09CT("style")
        public C00CW style;

        @C09CT("text")
        public String text;
    }

    public static final class PopupText {

        @C09CT("buttons")
        public List<ButtonStruct> buttons;

        @C09CT("context")
        public String context;

        @C09CT("image")
        public UrlStruct image;

        @C09CT("labels")
        public List<ButtonStruct> labels;

        @C09CT("title")
        public String title;
    }

    public static final class UrlStruct {

        @C09CT("height")
        public int height;

        @C09CT("uri")
        public String uri;

        @C09CT("url_key")
        public String url_key;

        @C09CT("url_list")
        public String[] url_list = new String[0];

        @C09CT("width")
        public int width;
    }
}
