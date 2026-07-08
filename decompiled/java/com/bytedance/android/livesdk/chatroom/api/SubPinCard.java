package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SubPinCard {

    @C09CT("desc")
    public Text desc;

    @C09CT("extra_info")
    public SubPinCardExtra extraInfo;

    @C09CT("goal_pin_card")
    public SubGoalPinCard goalPinCard;

    @C09CT("highlight_text_num")
    public long highlightTextNum;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("last_pin_timestamp")
    public long lastPinTimestamp;

    @C09CT("pin_source")
    public int pinSource;

    @C09CT("template_id")
    public long templateId;

    @C09CT("time_to_live")
    public long timeToLive;

    @C09CT("title")
    public Text title;

    @C09CT("type")
    public int type;

    @C09CT("action_schema")
    public String actionSchema = "";
    public final Map<String, Object> LIZ = new LinkedHashMap();

    @C09CT("icons")
    public List<ImageModel> icons = new ArrayList();

    public static final class SubPinCardExtra {

        @C09CT("sov_info")
        public SOVPinCardInfo sovInfo;
    }

    public static final class Text {

        @C09CT("Content")
        public String content = "";

        @C09CT("type")
        public int type;
    }
}
