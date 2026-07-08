package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedButton {

    @C09CT("background_colors")
    public final List<String> backgroundColors;

    @C09CT("background_image")
    public String backgroundImage;

    @C09CT("background_color")
    public final String bgColor;

    @C09CT("button_action")
    public final String buttonAction;

    @C09CT("button_action_type")
    public final String buttonActionType;

    @C09CT("content")
    public Content content;

    @C09CT("description")
    public Content description;

    @C09CT("gradient_type")
    public final int gradientType;

    @C09CT("icon")
    public final String icon;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("link_type")
    public final String linkType;

    @C09CT("locations")
    public final List<Float> locations;

    @C09CT("request")
    public final Request request;

    @C09CT("task_event_key")
    public final String taskEventKey;

    public FeedButton(Content content, Content content2, String str, String str2, List<String> list, String str3, int i, String str4, String str5, List<Float> list2, String str6, String str7, Request request, String str8) {
        this.content = content;
        this.description = content2;
        this.bgColor = str;
        this.buttonActionType = str2;
        this.backgroundColors = list;
        this.backgroundImage = str3;
        this.gradientType = i;
        this.jumpLink = str4;
        this.linkType = str5;
        this.locations = list2;
        this.buttonAction = str6;
        this.taskEventKey = str7;
        this.request = request;
        this.icon = str8;
    }
}
