package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class AboutAdInfoItem implements Serializable {

    @C09CT("group_title")
    public String groupTitle;

    @C09CT("orientation_info")
    public List<OrientationInfo> orientationInfo;

    public AboutAdInfoItem() {
        this("", null);
    }

    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final List<OrientationInfo> getOrientationInfo() {
        return this.orientationInfo;
    }

    public final void setGroupTitle(String str) {
        this.groupTitle = str;
    }

    public final void setOrientationInfo(List<OrientationInfo> list) {
        this.orientationInfo = list;
    }

    public AboutAdInfoItem(String str, List<OrientationInfo> list) {
        this.groupTitle = str;
        this.orientationInfo = list;
    }
}
