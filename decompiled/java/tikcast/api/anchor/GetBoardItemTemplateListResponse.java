package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.BoardItemTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetBoardItemTemplateListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("board_item_template_list")
        public List<BoardItemTemplate> boardItemTemplateList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public int nextOffset;
    }
}
