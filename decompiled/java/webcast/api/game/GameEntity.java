package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameEntity {

    @C09CT("game_source")
    public GameSource gameSource;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT("viewer_count")
    public long viewerCount;

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("summary")
    public String summary = "";

    @C09CT("game_genres")
    public List<String> gameGenres = new ArrayList();
}
