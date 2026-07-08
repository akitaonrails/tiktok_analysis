package com.bytedance.ies.ugc.aweme.ttsetting.model;

import X.C07PK;
import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class TTSettingDataAppBean {

    @C09CT("aweme_live_podcast")
    public AwemeLivePodcast awemeLivePodcast;

    @C09CT("aweme_music_ailab")
    public AwemeMusicAilab awemeMusicAilab;

    @C09CT("aweme_push_monitor_config")
    public AwemePushMonitorConfig awemePushMonitorConfig;

    @C09CT("aweme_uniqueid_settings")
    public AwemeUniqueidSettings awemeUniqueidSettings;

    @C09CT("pre_download_delay_days")
    public Integer preDownloadDelayDays;

    @C09CT("pre_download_delay_second")
    public Long preDownloadDelaySecond;

    @C09CT("pre_download_start_time")
    public Integer preDownloadStartTime;

    @C09CT("pre_download_version")
    public Integer preDownloadVersion;

    @C09CT("teens_mode_alert_count")
    public Integer teensModeAlertCount;

    @C09CT("teens_mode_match_alert_switch")
    public Boolean teensModeMatchAlertSwitch;

    @C09CT("update_sdk")
    public Integer updateSdk;

    @C09CT("user_badge_click_settings")
    public C07PK userBadgeClickSettings;

    public static final class AwemeLivePodcast {

        @C09CT("can_be_obs_live_podcast")
        public Boolean canBeObsLivePodcast;
    }

    public static final class AwemeMusicAilab {

        @C09CT("frame_count")
        public Integer frameCount;

        @C09CT("song_uri")
        public String songUri;

        @C09CT("song_url_list")
        public ArrayList<String> songUrlList;
    }

    public static final class AwemePushMonitorConfig {

        @C09CT("default_send_data_interval")
        public Integer defaultSendDataInterval;

        @C09CT("enable_upload_unactive_apps")
        public Boolean enableUploadUnactiveApps;

        @C09CT("is_monitor_alive_enable")
        public Integer isMonitorAliveEnable;

        @C09CT("max_send_start_info_num")
        public Integer maxSendStartInfoNum;

        @C09CT("monitor_live_interval_second")
        public Integer monitorLiveIntervalSecond;

        @C09CT("upload_unactive_app_packages")
        public ArrayList<String> uploadUnactiveAppPackages;
    }

    public static final class AwemeUniqueidSettings {

        @C09CT("enable_al")
        public Integer enableAl;

        @C09CT("get_mobile_delay")
        public Integer getMobileDelay;

        @C09CT("get_phone_enable")
        public Integer getPhoneEnable;

        @C09CT("other_info_enable")
        public Integer otherInfoEnable;

        @C09CT("tt_get_mobile_retry_times")
        public Integer ttGetMobileRetryTimes;
    }

    public final C07PK getUserBadgeClickSettings() {
        return null;
    }

    public final void setUserBadgeClickSettings(C07PK c07pk) {
    }

    public final AwemeLivePodcast getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final AwemeMusicAilab getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final AwemePushMonitorConfig getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final AwemeUniqueidSettings getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final void setAwemeLivePodcast(AwemeLivePodcast awemeLivePodcast) {
        this.awemeLivePodcast = awemeLivePodcast;
    }

    public final void setAwemeMusicAilab(AwemeMusicAilab awemeMusicAilab) {
        this.awemeMusicAilab = awemeMusicAilab;
    }

    public final void setAwemePushMonitorConfig(AwemePushMonitorConfig awemePushMonitorConfig) {
        this.awemePushMonitorConfig = awemePushMonitorConfig;
    }

    public final void setAwemeUniqueidSettings(AwemeUniqueidSettings awemeUniqueidSettings) {
        this.awemeUniqueidSettings = awemeUniqueidSettings;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l) {
        this.preDownloadDelaySecond = l;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }
}
