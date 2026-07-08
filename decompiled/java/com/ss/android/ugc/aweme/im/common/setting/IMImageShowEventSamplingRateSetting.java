package com.ss.android.ugc.aweme.im.common.setting;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C452501pT;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMImageShowEventSamplingRateSetting {
    public static final IMImageShowEventSamplingRateSetting LIZ = new IMImageShowEventSamplingRateSetting();
    public static final IMImageCacheSizeConfig LIZIZ = new IMImageCacheSizeConfig(null, 1, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(123));

    public static final class IMImageCacheSizeConfig implements Serializable {

        @C09CT("sampling_rate_map")
        public final Map<String, Float> sampRateMap;

        public IMImageCacheSizeConfig() {
            this(null, 1, null);
        }

        public IMImageCacheSizeConfig(Map<String, Float> map) {
            this.sampRateMap = map;
        }

        public IMImageCacheSizeConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("sticker_", Float.valueOf(1.0f)), new Pair("photo-message-template", Float.valueOf(1.0f)), new Pair("video-message-template", Float.valueOf(1.0f)), new Pair("AwemeCoverManager:MsgCover", Float.valueOf(1.0f))) : map);
        }
    }
}
