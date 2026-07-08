package webcast.api.feed;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class FetchSpecialCardRequest {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("debug")
    public boolean debug;

    @C09CT("feed_index")
    public long feedIndex;

    @C09CT("is_draw")
    public long isDraw;

    @C09CT("sub_channel_id")
    public long subChannelId;

    @C09CT("req_from")
    public String reqFrom = "";

    @C09CT("enter_source")
    public String enterSource = "";

    @C09CT("req_session")
    public String reqSession = "";

    @C09CT("special_card_biz_param")
    public Map<String, String> specialCardBizParam = new LinkedHashMap();
}
