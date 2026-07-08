package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftActivityCreator {

    @C09CT("background")
    public ImageModel background;

    @C09CT("background_rtl")
    public ImageModel backgroundRtl;

    @C09CT("banner_type")
    public int bannerType;

    @C09CT("button")
    public GiftPanelCardletByCreator.CardletButton button;

    @C09CT("end_time")
    public long endTime;

    @C09CT("event_id")
    public long eventId;

    @C09CT("height")
    public long height;

    @C09CT("start_time")
    public long startTime;

    @C09CT("area_schema")
    public String areaSchema = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("gift_ids")
    public List<Long> giftIds = new ArrayList();

    @C09CT("target_schema")
    public String targetSchema = "";

    @C09CT("event_name")
    public String eventName = "";

    @C09CT("entrance_name")
    public String entranceName = "";

    @C09CT("override_gift_cardlets")
    public Map<Long, GiftPanelCardletByCreator> overrideGiftCardlets = new LinkedHashMap();

    @C09CT("extra")
    public String extra = "";
}
