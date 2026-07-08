package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipGiftInfo {

    @C09CT("auth_param")
    public AuthParam authParam;

    @C09CT("end_time")
    public long endTime;

    @C09CT("gift_redeem_info")
    public GiftRedeemInfo giftRedeemInfo;

    @C09CT("need_auth")
    public boolean needAuth;

    @C09CT("pattern_info")
    public GameAccountPatternInfo patternInfo;

    @C09CT("start_time")
    public long startTime;

    @C09CT("type")
    public int type;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("name")
    public String name = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("items")
    public List<GiftItem> items = new ArrayList();

    @C09CT("detail")
    public String detail = "";

    @C09CT("gift_code")
    public String giftCode = "";

    @C09CT("guidance")
    public String guidance = "";

    public static final class GameAccountPatternInfo {

        @C09CT("patterns")
        public List<GameAccountPatternItem> patterns = new ArrayList();

        @C09CT("version_id")
        public String versionId = "";

        @C09CT("guide_pic_url")
        public String guidePicUrl = "";
    }

    public static final class GameAccountPatternItem {

        @C09CT("pattern_index")
        public int patternIndex;

        @C09CT("pattern_name")
        public String patternName = "";

        @C09CT("pattern_text")
        public String patternText = "";
    }
}
