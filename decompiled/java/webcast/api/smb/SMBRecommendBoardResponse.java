package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBRecommendBoardResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("board_dsl_compatibility")
        public BoardDSLCompatibility boardDslCompatibility;

        @C09CT("board_list")
        public List<Board> boardList = new ArrayList();

        @C09CT("global_content_offset_y")
        public long globalContentOffsetY;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("total")
        public long total;

        public static final class BoardDSLCompatibility {

            @C09CT("has_incompatible_dsl")
            public boolean hasIncompatibleDsl;

            @C09CT("incompatible_notice_icon")
            public ImageModel incompatibleNoticeIcon;

            @C09CT("incompatible_notice_content")
            public String incompatibleNoticeContent = "";

            @C09CT("incompatible_notice_schema")
            public String incompatibleNoticeSchema = "";

            @C09CT("incompatible_notice_heading")
            public String incompatibleNoticeHeading = "";

            @C09CT("update_btn_text")
            public String updateBtnText = "";
        }
    }
}
