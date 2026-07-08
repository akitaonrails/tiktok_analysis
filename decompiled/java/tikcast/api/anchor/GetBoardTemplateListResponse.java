package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetBoardTemplateListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public int nextOffset;

        @C09CT("recommended_templates")
        public List<Board> recommendedTemplates = new ArrayList();

        @C09CT("templates")
        public List<Board> templates = new ArrayList();
    }
}
