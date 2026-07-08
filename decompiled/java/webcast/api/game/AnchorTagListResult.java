package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorTagListResult {

    @C09CT("is_rec")
    public boolean isRec;

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("index")
    public String index = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("icon_uri")
    public String iconUri = "";

    @C09CT("genres")
    public List<GameAnchorCategory> genres = new ArrayList();
}
