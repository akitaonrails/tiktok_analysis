package com.ss.android.ugc.aweme.shortvideo.videoquality;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.publish.MainTrackMediaInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class VQCreationData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("action")
    public final n action;

    @C09CT("app_info")
    public final AppInfo appInfo;

    @C09CT("creation_id")
    public final String creationID;

    @C09CT("device_info")
    public final DeviceInfo deviceInfo;

    @C09CT("env")
    public final EnvInfo envInfo;

    @C09CT("media_sources")
    public final List<MediaSource> mediaSources;

    @C09CT("media_sources_ext")
    public final List<MainTrackMediaInfo> mediaSourcesExt;

    @C09CT("other_info")
    public final OtherInfo otherInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("user_info")
    public final UserInfo userInfo;

    @C09CT("ve_info")
    public Map<String, ? extends Object> veInfo;

    @C09CT("version")
    public final String version;

    @C09CT("result")
    public final VideoInfo videoInfo;

    public static final class AppInfo {

        @C09CT("app_id")
        public final String appId;

        @C09CT("app_version")
        public final String appVersion;

        public AppInfo(String str, String str2) {
            this.appVersion = str;
            this.appId = str2;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class EnvInfo {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("settings")
        public final Map<String, Object> settings;

        @C09CT("video_quality_info")
        public final n videoQualityInfo;

        public EnvInfo(Map<String, ? extends Object> map, n nVar) {
            this.settings = map;
            this.videoQualityInfo = nVar;
        }
    }

    public static final class UserInfo {

        @C09CT("follower_count")
        public final int followerCount;

        @C09CT("region")
        public final String region;

        @C09CT("uid")
        public final String uid;

        public UserInfo(int i, String str, String str2) {
            this.followerCount = i;
            this.region = str;
            this.uid = str2;
        }
    }

    public static final class DeviceInfo {

        @C09CT("device_brand")
        public final String deviceBrand;

        @C09CT("device_type")
        public final String deviceType;

        /* JADX INFO: renamed from: did, reason: collision with root package name */
        @C09CT("did")
        public final String f422did;

        @C09CT("os")
        public final String os;

        @C09CT("os_version")
        public final String osVersion;

        public DeviceInfo(String str, String str2, String str3, String str4, String str5) {
            this.osVersion = str;
            this.os = str2;
            this.deviceType = str3;
            this.deviceBrand = str4;
            this.f422did = str5;
        }
    }

    public static final class MediaSource {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("bitrate")
        public final String bitrate;

        @C09CT("fps")
        public final int fps;

        @C09CT("origin_path")
        public final String originPath;

        @C09CT("resolution")
        public final String resolution;

        @C09CT("type")
        public final int type;

        public MediaSource(int i, String str, String str2, int i2, String str3) {
            this.type = i;
            this.resolution = str;
            this.bitrate = str2;
            this.fps = i2;
            this.originPath = str3;
        }
    }

    public static final class OtherInfo {

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("is_draft_or_backup")
        public final boolean isDraft;

        @C09CT("published_vids")
        public final List<String> publishedVids;

        @C09CT("video_content_source")
        public final String videoContentSource;

        @C09CT("video_source")
        public final int videoSource;

        @C09CT("video_type")
        public final String videoType;

        public OtherInfo(int i, String str, String str2, String str3, boolean z, List<String> list) {
            this.videoSource = i;
            this.videoContentSource = str;
            this.videoType = str2;
            this.enterFrom = str3;
            this.isDraft = z;
            this.publishedVids = list;
        }
    }

    public static final class VideoInfo {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("bitrate")
        public final String bitrate;

        @C09CT("file_size")
        public final long fileSize;

        @C09CT("fps")
        public final int fps;

        @C09CT("is_reencode")
        public final boolean isReencode;

        @C09CT("not_remux_error_code")
        public final int notRemuxErrorCode;

        @C09CT("resolution")
        public final String resolution;

        @C09CT("type")
        public final int type;

        public VideoInfo(int i, String str, boolean z, String str2, int i2, long j, int i3) {
            this.type = i;
            this.resolution = str;
            this.isReencode = z;
            this.bitrate = str2;
            this.notRemuxErrorCode = i2;
            this.fileSize = j;
            this.fps = i3;
        }
    }

    public VQCreationData(VideoInfo videoInfo, DeviceInfo deviceInfo, AppInfo appInfo, UserInfo userInfo, List<MediaSource> list, EnvInfo envInfo, n nVar, Map<String, ? extends Object> map, OtherInfo otherInfo, int i, String str, String str2, List<MainTrackMediaInfo> list2) {
        this.videoInfo = videoInfo;
        this.deviceInfo = deviceInfo;
        this.appInfo = appInfo;
        this.userInfo = userInfo;
        this.mediaSources = list;
        this.envInfo = envInfo;
        this.action = nVar;
        this.veInfo = map;
        this.otherInfo = otherInfo;
        this.scene = i;
        this.creationID = str;
        this.version = str2;
        this.mediaSourcesExt = list2;
    }
}
