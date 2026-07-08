package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaFeedCardResponse extends BaseResponse implements Serializable {

    @C09CT("card_config")
    public final DramaDNUFeedCardConfig cardConfig;

    @C09CT("card_info")
    public final Aweme cardInfo;

    @C09CT("content_type")
    public final DramaContentType contentType;

    @C09CT("insert_scene")
    public final DramaFeedCardInsertScene insertScene;

    @C09CT("need_retry")
    public final Boolean needRetry;

    @C09CT("retry_interval")
    public final Integer retryInterval;

    @C09CT("skylight_model")
    public final SkylightBlocks skylightBlocks;

    @C09CT("skylight_model_v2")
    public final SkylightBlocks skylightBlocksV2;

    @C09CT("fallback_aweme")
    public final Aweme tabFallbackAweme;

    @C09CT("track_info")
    public final Map<String, String> trackInfo;

    public MiniDramaFeedCardResponse() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final MiniDramaFeedCardResponse copy(Aweme aweme, Aweme aweme2, Boolean bool, Integer num, DramaDNUFeedCardConfig dramaDNUFeedCardConfig, Map<String, String> map, DramaContentType dramaContentType, DramaFeedCardInsertScene dramaFeedCardInsertScene, SkylightBlocks skylightBlocks, SkylightBlocks skylightBlocks2) {
        return new MiniDramaFeedCardResponse(aweme, aweme2, bool, num, dramaDNUFeedCardConfig, map, dramaContentType, dramaFeedCardInsertScene, skylightBlocks, skylightBlocks2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniDramaFeedCardResponse)) {
            return false;
        }
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = (MiniDramaFeedCardResponse) obj;
        return Intrinsics.LJFF(this.cardInfo, miniDramaFeedCardResponse.cardInfo) && Intrinsics.LJFF(this.tabFallbackAweme, miniDramaFeedCardResponse.tabFallbackAweme) && Intrinsics.LJFF(this.needRetry, miniDramaFeedCardResponse.needRetry) && Intrinsics.LJFF(this.retryInterval, miniDramaFeedCardResponse.retryInterval) && Intrinsics.LJFF(this.cardConfig, miniDramaFeedCardResponse.cardConfig) && Intrinsics.LJFF(this.trackInfo, miniDramaFeedCardResponse.trackInfo) && this.contentType == miniDramaFeedCardResponse.contentType && this.insertScene == miniDramaFeedCardResponse.insertScene && Intrinsics.LJFF(this.skylightBlocks, miniDramaFeedCardResponse.skylightBlocks) && Intrinsics.LJFF(this.skylightBlocksV2, miniDramaFeedCardResponse.skylightBlocksV2);
    }

    public int hashCode() {
        Aweme aweme = this.cardInfo;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        Aweme aweme2 = this.tabFallbackAweme;
        int iHashCode2 = (iHashCode + (aweme2 == null ? 0 : aweme2.hashCode())) * 31;
        Boolean bool = this.needRetry;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.retryInterval;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        DramaDNUFeedCardConfig dramaDNUFeedCardConfig = this.cardConfig;
        int iHashCode5 = (iHashCode4 + (dramaDNUFeedCardConfig == null ? 0 : dramaDNUFeedCardConfig.hashCode())) * 31;
        Map<String, String> map = this.trackInfo;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        DramaContentType dramaContentType = this.contentType;
        int iHashCode7 = (iHashCode6 + (dramaContentType == null ? 0 : dramaContentType.hashCode())) * 31;
        DramaFeedCardInsertScene dramaFeedCardInsertScene = this.insertScene;
        int iHashCode8 = (iHashCode7 + (dramaFeedCardInsertScene == null ? 0 : dramaFeedCardInsertScene.hashCode())) * 31;
        SkylightBlocks skylightBlocks = this.skylightBlocks;
        int iHashCode9 = (iHashCode8 + (skylightBlocks == null ? 0 : skylightBlocks.hashCode())) * 31;
        SkylightBlocks skylightBlocks2 = this.skylightBlocksV2;
        return iHashCode9 + (skylightBlocks2 != null ? skylightBlocks2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaFeedCardResponse(cardInfo=");
        sbLIZ.append(this.cardInfo);
        sbLIZ.append(", tabFallbackAweme=");
        sbLIZ.append(this.tabFallbackAweme);
        sbLIZ.append(", needRetry=");
        sbLIZ.append(this.needRetry);
        sbLIZ.append(", retryInterval=");
        sbLIZ.append(this.retryInterval);
        sbLIZ.append(", cardConfig=");
        sbLIZ.append(this.cardConfig);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.trackInfo);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", insertScene=");
        sbLIZ.append(this.insertScene);
        sbLIZ.append(", skylightBlocks=");
        sbLIZ.append(this.skylightBlocks);
        sbLIZ.append(", skylightBlocksV2=");
        sbLIZ.append(this.skylightBlocksV2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DramaDNUFeedCardConfig getCardConfig() {
        return this.cardConfig;
    }

    public final Aweme getCardInfo() {
        return this.cardInfo;
    }

    public final DramaContentType getContentType() {
        return this.contentType;
    }

    public final DramaFeedCardInsertScene getInsertScene() {
        return this.insertScene;
    }

    public final Boolean getNeedRetry() {
        return this.needRetry;
    }

    public final Integer getRetryInterval() {
        return this.retryInterval;
    }

    public final SkylightBlocks getSkylightBlocks() {
        return this.skylightBlocks;
    }

    public final SkylightBlocks getSkylightBlocksV2() {
        return this.skylightBlocksV2;
    }

    public final Aweme getTabFallbackAweme() {
        return this.tabFallbackAweme;
    }

    public final Map<String, String> getTrackInfo() {
        return this.trackInfo;
    }

    public MiniDramaFeedCardResponse(Aweme aweme, Aweme aweme2, Boolean bool, Integer num, DramaDNUFeedCardConfig dramaDNUFeedCardConfig, Map<String, String> map, DramaContentType dramaContentType, DramaFeedCardInsertScene dramaFeedCardInsertScene, SkylightBlocks skylightBlocks, SkylightBlocks skylightBlocks2) {
        this.cardInfo = aweme;
        this.tabFallbackAweme = aweme2;
        this.needRetry = bool;
        this.retryInterval = num;
        this.cardConfig = dramaDNUFeedCardConfig;
        this.trackInfo = map;
        this.contentType = dramaContentType;
        this.insertScene = dramaFeedCardInsertScene;
        this.skylightBlocks = skylightBlocks;
        this.skylightBlocksV2 = skylightBlocks2;
    }
}
