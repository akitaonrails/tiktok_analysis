package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class GameTagDetail implements Serializable {

    @C09CT("display_name")
    public final String displayName;

    @C09CT("game_tag_id")
    public final int gameTagId;

    @C09CT("game_tag_name")
    public final String gameTagName;

    @C09CT("preview_game_moment_enable")
    public final boolean previewGameMomentEnable;

    @C09CT("starling_key")
    public final String starlingKey;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameTagDetail(gameTagId=");
        sbLIZ.append(this.gameTagId);
        sbLIZ.append(", gameTagName=");
        sbLIZ.append(this.gameTagName);
        sbLIZ.append(", previewGameMomentEnable=");
        sbLIZ.append(this.previewGameMomentEnable);
        sbLIZ.append(", starlingKey=");
        sbLIZ.append(this.starlingKey);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GameTagDetail() {
        this(0, "", false, "", "");
    }

    public GameTagDetail(int i, String str, boolean z, String str2, String str3) {
        this.gameTagId = i;
        this.gameTagName = str;
        this.previewGameMomentEnable = z;
        this.starlingKey = str2;
        this.displayName = str3;
    }
}
