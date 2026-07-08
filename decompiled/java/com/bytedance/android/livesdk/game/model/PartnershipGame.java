package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PartnershipGame {

    @C09CT("age_limit")
    public Long ageLimit;

    @C09CT("android_package")
    public String androidPackage;

    @C09CT("android_package_size")
    public Long androidPackageSize;

    @C09CT("android_version")
    public String androidVersion;

    @C09CT("brief_introduction")
    public String briefIntroduction;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("introduction")
    public String introduction;

    @C09CT("introduction_image")
    public List<ImageModel> introductionImage;

    @C09CT("introduction_video")
    public List<Video> introductionVideo;

    @C09CT("ios_bundle_id")
    public String iosBundleId;

    @C09CT("ios_package_size")
    public Long iosPackageSize;

    @C09CT("ios_version")
    public String iosVersion;

    @C09CT("labels")
    public List<String> labels;

    @C09CT("last_update_time")
    public Long lastUpdateTime;

    @C09CT("name")
    public String name;

    @C09CT("open_gll")
    public int openGll;

    @C09CT("top_background_image")
    public ImageModel topBackgroundImage;

    @C09CT("deep_link")
    public String deepLink = "";

    @C09CT("game_publisher")
    public String gamePublisher = "";

    @C09CT("contact_email")
    public String contactEmail = "";

    @C09CT("contact_phone_num")
    public String contactPhoneNum = "";

    public static final class Video {

        @C09CT("cover")
        public ImageModel cover;

        @C09CT("duration")
        public double duration;

        @C09CT("vid")
        public String vid = "";

        @C09CT("url")
        public String url = "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.idStr != null) {
            sb.append(", id_str=");
            sb.append(this.idStr);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.androidVersion != null) {
            sb.append(", android_version=");
            sb.append(this.androidVersion);
        }
        if (this.iosVersion != null) {
            sb.append(", ios_version=");
            sb.append(this.iosVersion);
        }
        if (this.ageLimit != null) {
            sb.append(", age_limit=");
            sb.append(this.ageLimit);
        }
        if (this.androidPackage != null) {
            sb.append(", android_package=");
            sb.append(this.androidPackage);
        }
        if (this.androidPackageSize != null) {
            sb.append(", android_package_size=");
            sb.append(this.androidPackageSize);
        }
        if (this.iosBundleId != null) {
            sb.append(", ios_bundle_id=");
            sb.append(this.iosBundleId);
        }
        if (this.iosPackageSize != null) {
            sb.append(", ios_package_size=");
            sb.append(this.iosPackageSize);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        List<ImageModel> list = this.introductionImage;
        if (list != null && !list.isEmpty()) {
            sb.append(", introduction_image=");
            sb.append(this.introductionImage);
        }
        if (this.introduction != null) {
            sb.append(", introduction=");
            sb.append(this.introduction);
        }
        if (this.briefIntroduction != null) {
            sb.append(", brief_introduction=");
            sb.append(this.briefIntroduction);
        }
        List<String> list2 = this.labels;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (this.lastUpdateTime != null) {
            sb.append(", last_update_time=");
            sb.append(this.lastUpdateTime);
        }
        sb.replace(0, 2, "PartnershipGame{");
        sb.append('}');
        return sb.toString();
    }
}
