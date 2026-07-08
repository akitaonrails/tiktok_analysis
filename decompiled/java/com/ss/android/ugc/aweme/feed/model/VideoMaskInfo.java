package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoMaskInfo implements Serializable {

    @C09CT("birthday_edit_module")
    public MaskExtraModule birthdayEditModule;

    @C09CT("cancel_mask_label")
    public String cancelMaskLabel;

    @C09CT("content")
    public String content;

    @C09CT("mask_type")
    public Integer maskType;

    @C09CT("policy_module")
    public MaskExtraModule policyModule;

    @C09CT("pop_window")
    public MaskExtraModule popWindow;

    @C09CT("show_mask")
    public Boolean showMask;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("title")
    public String title;

    public VideoMaskInfo() {
        this(Boolean.FALSE, 0, null, null, null, "", "", "", null);
    }

    public VideoMaskInfo(Boolean bool, Integer num, Integer num2, MaskExtraModule maskExtraModule, MaskExtraModule maskExtraModule2, String str, String str2, String str3, MaskExtraModule maskExtraModule3) {
        this.showMask = bool;
        this.maskType = num;
        this.status = num2;
        this.birthdayEditModule = maskExtraModule;
        this.policyModule = maskExtraModule2;
        this.title = str;
        this.content = str2;
        this.cancelMaskLabel = str3;
        this.popWindow = maskExtraModule3;
    }
}
