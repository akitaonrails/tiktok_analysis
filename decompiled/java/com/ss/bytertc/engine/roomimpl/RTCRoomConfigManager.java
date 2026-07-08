package com.ss.bytertc.engine.roomimpl;

import X.C2188811AlT;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.lyrax.room.LyraxVideoRemoteConfig;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomConfigManager {
    public final ConcurrentHashMap<StreamIndex, RTCPublishConfig> publishConfigs = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, RTCSubscribeConfig> subscribeConfigs = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, LyraxVideoRemoteConfigWrapper> videoConfigMap = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, LyraxVideoPerfDegradeLimitWrapper> videoLimitMap = new ConcurrentHashMap<>();

    public void clearConfig() {
        this.publishConfigs.clear();
        this.subscribeConfigs.clear();
        this.videoConfigMap.clear();
        this.videoLimitMap.clear();
    }

    public static class LyraxVideoPerfDegradeLimitWrapper {
        public LyraxVideoPerfDegradeLimit limit;
        public long timestamp = System.currentTimeMillis();

        public LyraxVideoPerfDegradeLimit getLimit() {
            return this.limit;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public LyraxVideoPerfDegradeLimitWrapper(LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit) {
            this.limit = lyraxVideoPerfDegradeLimit;
        }
    }

    public static class LyraxVideoRemoteConfigWrapper {
        public LyraxVideoRemoteConfig config;
        public long timestamp = System.currentTimeMillis();

        public LyraxVideoRemoteConfig getConfig() {
            return this.config;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public LyraxVideoRemoteConfigWrapper(LyraxVideoRemoteConfig lyraxVideoRemoteConfig) {
            this.config = lyraxVideoRemoteConfig;
        }
    }

    private String getStreamIndexFromKey(String str) {
        return str.split("_of_")[0];
    }

    public RTCPublishConfig getPublishConfig(StreamIndex streamIndex) {
        RTCPublishConfig rTCPublishConfig = this.publishConfigs.get(streamIndex);
        if (rTCPublishConfig == null) {
            return new RTCPublishConfig();
        }
        return rTCPublishConfig;
    }

    private String getKey(String str, StreamIndex streamIndex) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(streamIndex.toString());
        sbLIZ.append("_of_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCSubscribeConfig getSubscribeConfig(String str, StreamIndex streamIndex) {
        return this.subscribeConfigs.get(getKey(str, streamIndex));
    }

    public LyraxVideoRemoteConfigWrapper getVideoConfig(String str, StreamIndex streamIndex) {
        return this.videoConfigMap.get(getKey(str, streamIndex));
    }

    public LyraxVideoPerfDegradeLimitWrapper getVideoPerfLimit(String str, StreamIndex streamIndex) {
        return this.videoLimitMap.get(getKey(str, streamIndex));
    }

    public void muteAllRemoteStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType, MuteState muteState) {
        boolean z;
        for (Map.Entry<String, RTCSubscribeConfig> entry : this.subscribeConfigs.entrySet()) {
            if (getStreamIndexFromKey(entry.getKey()).equals(streamIndex.toString())) {
                RTCSubscribeConfig value = entry.getValue();
                int i = mediaStreamType.value;
                boolean z2 = true;
                if ((MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO.value & i) != 0) {
                    if (muteState != MuteState.MUTE_STATE_ON) {
                        z = true;
                    } else {
                        z = false;
                    }
                    value.subAudio = z;
                }
                if ((i & MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO.value) != 0) {
                    if (muteState == MuteState.MUTE_STATE_ON) {
                        z2 = false;
                    }
                    value.subVideo = z2;
                }
                this.subscribeConfigs.put(entry.getKey(), value);
            }
        }
    }

    public void muteLocalStream(StreamIndex streamIndex, MediaStreamType mediaStreamType, MuteState muteState) {
        boolean z;
        RTCPublishConfig rTCPublishConfig = this.publishConfigs.get(streamIndex);
        if (rTCPublishConfig == null) {
            rTCPublishConfig = new RTCPublishConfig();
        }
        if (mediaStreamType == null) {
            return;
        }
        int i = mediaStreamType.value;
        boolean z2 = true;
        if ((MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO.value & i) != 0) {
            if (muteState == MuteState.MUTE_STATE_OFF) {
                z = true;
            } else {
                z = false;
            }
            rTCPublishConfig.audioStream = z;
        }
        if ((i & MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO.value) != 0) {
            if (muteState != MuteState.MUTE_STATE_OFF) {
                z2 = false;
            }
            rTCPublishConfig.videoStream = z2;
        }
        this.publishConfigs.put(streamIndex, rTCPublishConfig);
    }

    public void setVideoConfig(String str, StreamIndex streamIndex, LyraxVideoRemoteConfigWrapper lyraxVideoRemoteConfigWrapper) {
        this.videoConfigMap.put(getKey(str, streamIndex), lyraxVideoRemoteConfigWrapper);
    }

    public void setVideoPerfLimit(String str, StreamIndex streamIndex, LyraxVideoPerfDegradeLimitWrapper lyraxVideoPerfDegradeLimitWrapper) {
        this.videoLimitMap.put(getKey(str, streamIndex), lyraxVideoPerfDegradeLimitWrapper);
    }

    public void muteRemoteStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType, MuteState muteState) {
        boolean z;
        String key = getKey(str, streamIndex);
        RTCSubscribeConfig rTCSubscribeConfig = this.subscribeConfigs.get(key);
        if (rTCSubscribeConfig == null) {
            rTCSubscribeConfig = new RTCSubscribeConfig();
        }
        int i = mediaStreamType.value;
        boolean z2 = true;
        if ((MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO.value & i) != 0) {
            if (muteState != MuteState.MUTE_STATE_ON) {
                z = true;
            } else {
                z = false;
            }
            rTCSubscribeConfig.subAudio = z;
        }
        if ((i & MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO.value) != 0) {
            if (muteState == MuteState.MUTE_STATE_ON) {
                z2 = false;
            }
            rTCSubscribeConfig.subVideo = z2;
        }
        this.subscribeConfigs.put(key, rTCSubscribeConfig);
    }
}
