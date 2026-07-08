package com.ss.android.ugc.aweme.aigc.network;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.mention.NetworkMentionDataItem;

/* JADX INFO: loaded from: classes33.dex */
public final class IMCameoInfoData {

    @C09CT("opposite_cameo_mention_info")
    public final NetworkMentionDataItem peerCameo;

    @C09CT("opposite_user_hit_libra")
    public final Boolean peerHitLibra;

    @C09CT("my_cameo_mention_info")
    public final NetworkMentionDataItem selfCameo;

    public IMCameoInfoData() {
        this(null, null, null);
    }

    public IMCameoInfoData(NetworkMentionDataItem networkMentionDataItem, NetworkMentionDataItem networkMentionDataItem2, Boolean bool) {
        this.selfCameo = networkMentionDataItem;
        this.peerCameo = networkMentionDataItem2;
        this.peerHitLibra = bool;
    }
}
