package com.ss.android.ugc.aweme.multi.ui;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorPanelExtraInfo implements Serializable {

    @C09CT("icon")
    public final String downgradeIcon;

    @C09CT("subTitle")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    @C09CT("useTextStyleButton")
    public final boolean useTextStyleButton;

    public AnchorPanelExtraInfo() {
        this("", null, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorPanelExtraInfo)) {
            return false;
        }
        AnchorPanelExtraInfo anchorPanelExtraInfo = (AnchorPanelExtraInfo) obj;
        return Intrinsics.LJFF(this.downgradeIcon, anchorPanelExtraInfo.downgradeIcon) && Intrinsics.LJFF(this.title, anchorPanelExtraInfo.title) && Intrinsics.LJFF(this.subTitle, anchorPanelExtraInfo.subTitle) && this.useTextStyleButton == anchorPanelExtraInfo.useTextStyleButton;
    }

    public AnchorPanelExtraInfo(String str, String str2, String str3, boolean z) {
        this.downgradeIcon = str;
        this.title = str2;
        this.subTitle = str3;
        this.useTextStyleButton = z;
    }
}
