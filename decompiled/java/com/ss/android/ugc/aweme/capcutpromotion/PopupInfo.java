package com.ss.android.ugc.aweme.capcutpromotion;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class PopupInfo {

    @C09CT("btn_list")
    public final List<ButtonAction> buttonList;

    @C09CT("is_show")
    public final boolean isShow;

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public PopupInfo(boolean z, String str, String str2, List<ButtonAction> list, LogPb logPb) {
        this.isShow = z;
        this.title = str;
        this.subTitle = str2;
        this.buttonList = list;
        this.logPb = logPb;
    }
}
