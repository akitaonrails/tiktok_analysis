package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ChannelInfo {

    @C09CT("channel_id")
    public final Integer channelId;

    @C09CT("event_tracking_fields")
    public List<KeyValueHolder> eventTrackingExtra;

    @C09CT("name")
    public final String name;

    @C09CT("subscribe_desc")
    public final String subscribeDesc;

    @C09CT("tux_image_url")
    public final TuxImageModel tuxImageUrl;

    public ChannelInfo(Integer num, String str, String str2, TuxImageModel tuxImageModel, List<KeyValueHolder> list) {
        this.channelId = num;
        this.name = str;
        this.subscribeDesc = str2;
        this.tuxImageUrl = tuxImageModel;
        this.eventTrackingExtra = list;
    }
}
