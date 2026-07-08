package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EffectStruct;

/* JADX INFO: loaded from: classes.dex */
public final class EffectSearchResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("effects")
        public List<EffectStruct> effects = new ArrayList();

        @C09CT("collections")
        public List<EffectStruct> collections = new ArrayList();
    }
}
