package webcast.api.game;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetRelatedEntranceResponse {

    @C09CT("related_live_entrance")
    public Map<Long, RelatedLiveStruct> relatedLiveEntrance = new LinkedHashMap();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class RelatedLiveStruct {

        @C09CT("content")
        public String content = "";

        @C09CT("related_live_tag")
        public String relatedLiveTag = "";

        @C09CT("game_name")
        public String gameName = "";
    }
}
