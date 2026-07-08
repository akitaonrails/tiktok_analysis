package webcast.api.creator;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class PreScheduleStream {

    @C09CT("can_golive_1080p")
    public long canGolive1080p;

    @C09CT("degradation_enabled")
    public boolean degradationEnabled;

    @C09CT("degradation_type")
    public int degradationType;

    @C09CT("net_mode")
    public long netMode;

    @C09CT("pre_stream_group")
    public long preStreamGroup;

    @C09CT("push_stream_info")
    public Map<Long, PushStreamInfo> pushStreamInfo;

    @C09CT("recommend_stream_resolution")
    public int recommendStreamResolution;

    @C09CT("rtc_room_id")
    public long rtcRoomId;

    @C09CT("stream_push_urls")
    public List<String> streamPushUrls;

    @C09CT("stream_resolution_list")
    public List<StreamResolution> streamResolutionList;

    @C09CT("stream_resolution_list_all")
    public List<StreamResolution> streamResolutionListAll;

    @C09CT("stream_data")
    public String streamData = "";

    @C09CT("rtc_app_id")
    public String rtcAppId = "";

    @C09CT("stream_rtmp_push_url")
    public String streamRtmpPushUrl = "";

    @C09CT("stream_id")
    public String streamId = "";

    @C09CT("sdk_params")
    public String sdkParams = "";

    @C09CT("speed_probe_url")
    public String speedProbeUrl = "";

    /* JADX INFO: loaded from: classes.dex */
    public static final class PushStreamInfo {

        @C09CT("default_quality")
        public Quality defaultQuality;

        @C09CT("multi_default_qualities")
        public Map<String, Quality> multiDefaultQualities;

        @C09CT("multi_qualities")
        public Map<String, QualityList> multiQualities;

        @C09CT("qualities")
        public List<Quality> qualities;

        public static final class Quality {

            @C09CT("default_bitrate")
            public long defaultBitrate;

            @C09CT("fps")
            public long fps;

            @C09CT("height")
            public long height;

            @C09CT("max_bitrate")
            public long maxBitrate;

            @C09CT("min_bitrate")
            public long minBitrate;

            @C09CT("width")
            public long width;

            @C09CT("name")
            public String name = "";

            @C09CT("sdk_key")
            public String sdkKey = "";

            @C09CT("desc")
            public String desc = "";

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Quality(name=");
                sbLIZ.append(this.name);
                sbLIZ.append(", sdkKey=");
                sbLIZ.append(this.sdkKey);
                sbLIZ.append(", defaultBitrate=");
                sbLIZ.append(this.defaultBitrate);
                sbLIZ.append(")");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }

        public static final class QualityList {

            @C09CT("qualities")
            public List<Quality> qualities;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QualityList(qualities=");
                sbLIZ.append(this.qualities);
                sbLIZ.append(")");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
