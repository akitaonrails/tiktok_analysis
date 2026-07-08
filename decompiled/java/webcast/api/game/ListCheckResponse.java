package webcast.api.game;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ListCheckResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("in_list")
        public Map<String, Boolean> inList = new LinkedHashMap();
    }
}
