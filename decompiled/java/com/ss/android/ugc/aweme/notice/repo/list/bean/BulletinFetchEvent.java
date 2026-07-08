package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFetchEvent {

    @C09CT("event_time")
    public final Long eventTime;

    @C09CT("event_track_map")
    public final Map<String, String> eventTrackMap;

    @C09CT("event_type")
    public final Integer eventType;

    @C09CT("item_id")
    public final Long itemId;

    @C09CT("item_info")
    public final BulletinItem itemInfo;

    public BulletinFetchEvent(Integer num, Long l, Long l2, BulletinItem bulletinItem, Map<String, String> map) {
        this.eventType = num;
        this.itemId = l;
        this.eventTime = l2;
        this.itemInfo = bulletinItem;
        this.eventTrackMap = map;
    }
}
