package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class GameplayCard {

    @C09CT("button")
    public final SideBarButton button;

    @C09CT("sub_title")
    public final String description;

    @C09CT("gameplay_type")
    public final String gameplayType;

    @C09CT("icon")
    public final String icon;

    @C09CT("index")
    public final Integer index;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("title")
    public final String title;

    public GameplayCard() {
        this(null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        Integer num = this.index;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.gameplayType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SideBarButton sideBarButton = this.button;
        return iHashCode6 + (sideBarButton != null ? sideBarButton.hashCode() : 0);
    }

    public GameplayCard(Integer num, String str, String str2, String str3, String str4, String str5, SideBarButton sideBarButton) {
        this.index = num;
        this.gameplayType = str;
        this.taskKey = str2;
        this.icon = str3;
        this.title = str4;
        this.description = str5;
        this.button = sideBarButton;
    }
}
