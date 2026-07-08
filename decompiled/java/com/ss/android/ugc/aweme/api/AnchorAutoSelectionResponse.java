package com.ss.android.ugc.aweme.api;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorAutoSelectionResponse {

    @C09CT("added_icon")
    public final UrlModel addedIcon;

    @C09CT("anchor")
    public final CreateAnchorInfo anchor;

    @C09CT("can_user_remove")
    public final Boolean canRemove;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("status_code")
    public final int status;

    @C09CT("status_msg")
    public final String statusMsg;

    public AnchorAutoSelectionResponse(int i, String str, CreateAnchorInfo createAnchorInfo, Boolean bool, UrlModel urlModel, String str2) {
        this.status = i;
        this.statusMsg = str;
        this.anchor = createAnchorInfo;
        this.canRemove = bool;
        this.addedIcon = urlModel;
        this.logExtra = str2;
    }
}
