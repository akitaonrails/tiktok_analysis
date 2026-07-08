package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class GetPlayTogetherTempelateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("last_template")
        public PlayTogetherTemplate lastTemplate;

        @C09CT("system_templates")
        public List<PlayTogetherTemplate> systemTemplates = new ArrayList();
    }
}
