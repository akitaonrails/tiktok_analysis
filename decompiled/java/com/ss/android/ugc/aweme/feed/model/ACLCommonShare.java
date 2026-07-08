package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class ACLCommonShare implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("code")
    public int code;

    @C09CT("mute")
    public boolean mute;

    @C09CT("show_type")
    public int showType = 2;

    @C09CT("toast_msg")
    public String toastMsg = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("transcode")
    public int transcode = 3;

    @C09CT("popup_msg")
    public String popupMsg = "";

    @C09CT("platform_id")
    public String platformId = "";

    @C09CT("action_id")
    public String actionId = "";
    public AclType awemeAclType = AclType.SHARE_GENERAL;

    public static final class Companion {
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final AclType getAwemeAclType() {
        return this.awemeAclType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final String getPopupMsg() {
        return this.popupMsg;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public final int getTranscode() {
        return this.transcode;
    }

    public final void setActionId(String str) {
        this.actionId = str;
    }

    public final void setAwemeAclType(AclType aclType) {
        this.awemeAclType = aclType;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public final void setPopupMsg(String str) {
        this.popupMsg = str;
    }

    public final void setShowType(int i) {
        this.showType = i;
    }

    public final void setToastMsg(String str) {
        this.toastMsg = str;
    }

    public final void setTranscode(int i) {
        this.transcode = i;
    }
}
