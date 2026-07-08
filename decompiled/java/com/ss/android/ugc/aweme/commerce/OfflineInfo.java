package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class OfflineInfo implements Serializable {

    @C09CT("action")
    public String action;

    @C09CT("link_type")
    public String linkType;

    @C09CT("offline_info_type")
    public int offlineInfoType;

    @C09CT("offline_subtype")
    public int offlineSubtype;

    @C09CT("text")
    public String text;

    public String getAction() {
        return this.action;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public int getOfflineSubtype() {
        return this.offlineSubtype;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setLinkType(String str) {
        this.linkType = str;
    }

    public void setOfflineInfoType(int i) {
        this.offlineInfoType = i;
    }

    public void setOfflineSubtype(int i) {
        this.offlineSubtype = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
