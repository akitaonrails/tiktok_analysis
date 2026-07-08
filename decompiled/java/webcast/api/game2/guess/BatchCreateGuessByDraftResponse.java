package webcast.api.game2.guess;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BatchCreateGuessByDraftResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("round_id_map")
        public Map<String, String> roundIdMap = new LinkedHashMap();
    }
}
