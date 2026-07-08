package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EmotesReviewListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_highlight")
        public boolean hasHighlight;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("highlight_sticker_generation_status")
        public int highlightStickerGenerationStatus;

        @C09CT("offset")
        public long offset;

        @C09CT("total_count")
        public long totalCount;

        @C09CT("emote_list")
        public List<ReviewEmote> emoteList = new ArrayList();

        @C09CT("highlight_sticker_list")
        public List<ReviewEmote> highlightStickerList = new ArrayList();
    }
}
