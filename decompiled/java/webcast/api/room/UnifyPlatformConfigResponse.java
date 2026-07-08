package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class UnifyPlatformConfigResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("config_data")
        public Map<String, ConfigData> configData = new LinkedHashMap();
    }
}
