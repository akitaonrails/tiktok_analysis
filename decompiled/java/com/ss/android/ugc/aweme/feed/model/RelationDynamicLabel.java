package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class RelationDynamicLabel implements Serializable {

    @C09CT("count")
    public int count;

    @C09CT("label_info")
    public String labelInfo;

    @C09CT("nickname")
    public String nickname;

    @C09CT("show_type")
    public int showType;

    @C09CT("tab_label_info")
    public String tabText;

    @C09CT("type")
    public int type;

    @C09CT("user_id")
    public String userId;

    public boolean isValid() {
        return !TextUtils.isEmpty(this.labelInfo);
    }

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShowType() {
        return this.showType;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setShowType(int i) {
        this.showType = i;
    }

    public void setTabText(String str) {
        this.tabText = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
