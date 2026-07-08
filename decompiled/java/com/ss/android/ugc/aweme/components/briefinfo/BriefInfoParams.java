package com.ss.android.ugc.aweme.components.briefinfo;

import X.C09CT;
import com.ss.android.ugc.aweme.behavior.popup.OnclickParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class BriefInfoParams {

    @C09CT("html_text")
    public final String htmlText;

    @C09CT("on_click")
    public final OnclickParams onClickAction;

    @C09CT("start_icon")
    public final String startIcon;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BriefInfoParams)) {
            return false;
        }
        BriefInfoParams briefInfoParams = (BriefInfoParams) obj;
        return Intrinsics.LJFF(this.startIcon, briefInfoParams.startIcon) && Intrinsics.LJFF(this.htmlText, briefInfoParams.htmlText) && Intrinsics.LJFF(this.onClickAction, briefInfoParams.onClickAction);
    }

    public BriefInfoParams(String str, String str2, OnclickParams onclickParams) {
        this.startIcon = str;
        this.htmlText = str2;
        this.onClickAction = onclickParams;
    }
}
