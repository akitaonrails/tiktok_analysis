package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EndPageTempGuideModuleElement {

    @C09CT("button")
    public Button button;

    @C09CT("call_to_action")
    public CallToAction callToAction;

    @C09CT("image")
    public Image image;

    @C09CT("type")
    public int type;

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("icon")
    public String icon = "";

    @C09CT("biz_info")
    public String bizInfo = "";

    @C09CT("multi_images")
    public List<Image> multiImages = new ArrayList();

    public static final class Button {

        @C09CT("schema")
        public String schema = "";

        @C09CT("text")
        public String text = "";
    }

    public static final class CallToAction {

        @C09CT("content")
        public String content = "";

        @C09CT("type")
        public int type;
    }

    public static final class Image {

        @C09CT("height")
        public int height;

        @C09CT("location")
        public int location;

        @C09CT("url")
        public String url = "";

        @C09CT("width")
        public int width;
    }
}
