package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C654080Pl8;
import X.EnumC654060Pl6;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class GameInfo implements Serializable {

    @C09CT("cover_thumb")
    public final UrlModel coverThumb;

    @C09CT("cp_game_id_str")
    public final String cpGameIdStr;

    @C09CT("dsl")
    public final String dsl;

    @C09CT("game_entity_card_upgrade")
    public final int gameEntityCardUpgrade;

    @C09CT("game_tag_id_str")
    public final String gameTagIdStr;

    @C09CT("id_str")
    public final String idStr;

    @C09CT("raw_data")
    public final String rawData;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    public GameInfo() {
        this("", "", null, "", "", null, null, null, 0);
    }

    public final C654080Pl8 toSearchHubMobParams(String str, int i, String str2) {
        String str3 = str;
        String str4 = this.idStr;
        if (str3 == null) {
            str3 = "";
        }
        return new C654080Pl8(str4, str3, "", EnumC654060Pl6.GAME, i, 0, str2);
    }

    public GameInfo(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, int i) {
        this.idStr = str;
        this.title = str2;
        this.coverThumb = urlModel;
        this.cpGameIdStr = str3;
        this.gameTagIdStr = str4;
        this.schema = str5;
        this.rawData = str6;
        this.dsl = str7;
        this.gameEntityCardUpgrade = i;
    }
}
