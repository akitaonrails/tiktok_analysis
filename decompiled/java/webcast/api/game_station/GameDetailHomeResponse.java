package webcast.api.game_station;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailHomeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("data")
        public DetailHomeBizData data;

        @C09CT("dsl")
        public String dsl = "";

        @C09CT("template_id")
        public String templateId = "";
    }
}
