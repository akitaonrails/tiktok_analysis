package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class WallpaperReviewMessage extends AbstractC1136060ffY {

    @C09CT("ai_pic_url")
    public String aiPicUrl;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("context_keywords")
    public String contextKeywords;

    @C09CT("keywords")
    public String keywords;

    @C09CT("review_result")
    public long reviewResult;

    @C09CT("room_id")
    public long roomId;

    @C09CT("wallpaper_id")
    public long wallpaperId;

    public WallpaperReviewMessage() {
        this.type = C001A.WALLPAPER_REVIEW_MESSAGE;
        this.aiPicUrl = "";
        this.contextKeywords = "";
        this.keywords = "";
    }
}
