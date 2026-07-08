package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class LiveDropsRoomInfo implements Serializable {

    @C09CT("promoting_drops_game_id")
    public String promotingDropsGameId;

    @C09CT("promoting_drops_game_name_for_report")
    public String promotingDropsGameNameForReport;

    @C09CT("promoting_drops_id")
    public String promotingDropsId;

    @C09CT("show_drops_tag")
    public boolean showDropsTag;

    public LiveDropsRoomInfo() {
        this(false, "", "", "");
    }

    public LiveDropsRoomInfo(boolean z, String str, String str2, String str3) {
        this.showDropsTag = z;
        this.promotingDropsId = str;
        this.promotingDropsGameId = str2;
        this.promotingDropsGameNameForReport = str3;
    }
}
