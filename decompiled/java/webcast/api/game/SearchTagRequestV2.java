package webcast.api.game;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class SearchTagRequestV2 {

    @C09CT("limit")
    public int limit;

    @C09CT("live_mode")
    public long liveMode;

    @C09CT("offset")
    public int offset;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("query_string")
    public String queryString = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";
}
