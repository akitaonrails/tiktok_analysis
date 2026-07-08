package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MgetPullStreamInfosResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class PullStreamInfo {

        @C09CT("live_type_audio")
        public Boolean liveTypeAudio;

        @C09CT("live_type_screenshot")
        public Boolean liveTypeScreenshot;

        @C09CT("live_type_third_party")
        public Boolean liveTypeThirdParty;

        @C09CT("pull_data_option_default_quality")
        public LiveCoreSDKData.Quality pullDataOptionDefaultQuality;

        @C09CT("pull_stream_url_data")
        public String pullStreamUrlData;

        @C09CT("room_id")
        public Long roomId;

        @C09CT("stream_url_extra_super_resolution")
        public StreamUrlExtra.SrConfig streamUrlExtraSuperResolution;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.roomId != null) {
                sb.append(", room_id=");
                sb.append(this.roomId);
            }
            if (this.pullStreamUrlData != null) {
                sb.append(", pull_stream_url_data=");
                sb.append(this.pullStreamUrlData);
            }
            if (this.pullDataOptionDefaultQuality != null) {
                sb.append(", pull_data_option_default_quality=");
                sb.append(this.pullDataOptionDefaultQuality);
            }
            if (this.streamUrlExtraSuperResolution != null) {
                sb.append(", stream_url_extra_super_resolution=");
                sb.append(this.streamUrlExtraSuperResolution);
            }
            if (this.liveTypeScreenshot != null) {
                sb.append(", live_type_screenshot=");
                sb.append(this.liveTypeScreenshot);
            }
            if (this.liveTypeThirdParty != null) {
                sb.append(", live_type_third_party=");
                sb.append(this.liveTypeThirdParty);
            }
            if (this.liveTypeAudio != null) {
                sb.append(", live_type_audio=");
                sb.append(this.liveTypeAudio);
            }
            sb.replace(0, 2, "PullStreamInfo{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class ResponseData {

        @C09CT("pull_stream_infos")
        public List<PullStreamInfo> pullStreamInfos;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            List<PullStreamInfo> list = this.pullStreamInfos;
            if (list != null && !list.isEmpty()) {
                sb.append(", pull_stream_infos=");
                sb.append(this.pullStreamInfos);
            }
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "MgetPullStreamInfosResponse{");
        sb.append('}');
        return sb.toString();
    }
}
