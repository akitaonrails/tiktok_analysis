package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InGameInfo {

    @C09CT("allow_guide_gametag_ids")
    public List<Long> allowGuideGametagIds = new ArrayList();

    @C09CT("show_in_game_rank")
    public boolean showInGameRank;
}
