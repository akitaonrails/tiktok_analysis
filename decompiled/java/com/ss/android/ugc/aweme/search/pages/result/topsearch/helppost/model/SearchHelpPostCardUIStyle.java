package com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHelpPostCardUIStyle implements Serializable {
    public static final int $stable = 8;

    @C09CT("background_color")
    public final String backGroundColor;

    @C09CT("icon")
    public final TuxImageModel icon;

    @C09CT("show_icon")
    public final boolean isShowIcon;

    public SearchHelpPostCardUIStyle() {
        this("", false, null);
    }

    public int hashCode() {
        String str = this.backGroundColor;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isShowIcon)) * 31;
        TuxImageModel tuxImageModel = this.icon;
        return iHashCode + (tuxImageModel != null ? tuxImageModel.hashCode() : 0);
    }

    public final boolean isShowIcon() {
        return this.isShowIcon;
    }

    public SearchHelpPostCardUIStyle(String str, boolean z, TuxImageModel tuxImageModel) {
        this.backGroundColor = str;
        this.isShowIcon = z;
        this.icon = tuxImageModel;
    }
}
