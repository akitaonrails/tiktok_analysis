package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AnchorLiveFragmentTemplateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("live_fragment_templates")
        public List<LiveFragmentTemplate> liveFragmentTemplates = new ArrayList();
    }
}
