package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EsportsTournamentInfo {

    @C09CT("tournament_type")
    public int tournamentType;

    @C09CT("tournament_id")
    public String tournamentId = "";

    @C09CT("tournament_name")
    public String tournamentName = "";

    @C09CT("tournament_icon")
    public String tournamentIcon = "";

    @C09CT("icon_theme_color")
    public String iconThemeColor = "";

    @C09CT("match_info_list")
    public List<EsportsMatchInfo> matchInfoList = new ArrayList();
}
