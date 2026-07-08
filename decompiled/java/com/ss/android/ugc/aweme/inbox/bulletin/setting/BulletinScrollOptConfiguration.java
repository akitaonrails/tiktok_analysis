package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinScrollOptConfiguration {
    public static final int $stable = 0;

    @C09CT("enable_async_avatar_load")
    public final Integer enableAsyncAvatarLoad;

    @C09CT("enable_async_diff")
    public final Integer enableAsyncDiff;

    @C09CT("enable_bind_optimization")
    public final Integer enableBindOptimization;

    @C09CT("enable_comment_widget_v2")
    public final Integer enableCommentWidgetV2;

    @C09CT("enable_delayed_subscribe")
    public final Integer enableDelayedSubscribe;

    @C09CT("enable_fps_sample_rate")
    public final Integer enableFpsSampleRate;

    @C09CT("enable_hybrid_widget_v2")
    public final Integer enableHybridWidgetV2;

    @C09CT("enable_linear_layout_opt")
    public final Integer enableLinearLayoutOpt;

    @C09CT("enable_photo_bind_opt")
    public final Integer enablePhotoBindOpt;

    @C09CT("enable_rainbow_opt")
    public final Integer enableRainbowOpt;

    @C09CT("enable_text_bind_opt")
    public final Integer enableTextBindOpt;

    @C09CT("enable_text_config_opt")
    public final Integer enableTextConfigOpt;

    @C09CT("enable_vh_pool_warm_up")
    public final Integer enableVHPoolWarmUp;

    @C09CT("enable_video_bind_opt")
    public final Integer enableVideoBindOpt;

    @C09CT("enable_view_preload")
    public final Integer enableViewPreload;

    @C09CT("enable_vm_holder")
    public final Integer enableVmHolder;

    @C09CT("enable_widget_code_layout")
    public final Integer enableWidgetCodeLayout;

    @C09CT("enable_widget_pre_init")
    public final Integer enableWidgetPreInit;

    @C09CT("enable_widget_pre_init_v2")
    public final Integer enableWidgetPreInitV2;

    @C09CT("fps_detailed_collect_sample_rate")
    public final Integer fpsDetailedCollectSampleRate;

    public BulletinScrollOptConfiguration() {
        this(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 15, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinScrollOptConfiguration)) {
            return false;
        }
        BulletinScrollOptConfiguration bulletinScrollOptConfiguration = (BulletinScrollOptConfiguration) obj;
        return Intrinsics.LJFF(this.enableAsyncDiff, bulletinScrollOptConfiguration.enableAsyncDiff) && Intrinsics.LJFF(this.enableRainbowOpt, bulletinScrollOptConfiguration.enableRainbowOpt) && Intrinsics.LJFF(this.enableWidgetPreInit, bulletinScrollOptConfiguration.enableWidgetPreInit) && Intrinsics.LJFF(this.enableBindOptimization, bulletinScrollOptConfiguration.enableBindOptimization) && Intrinsics.LJFF(this.enableViewPreload, bulletinScrollOptConfiguration.enableViewPreload) && Intrinsics.LJFF(this.enableDelayedSubscribe, bulletinScrollOptConfiguration.enableDelayedSubscribe) && Intrinsics.LJFF(this.enableWidgetCodeLayout, bulletinScrollOptConfiguration.enableWidgetCodeLayout) && Intrinsics.LJFF(this.enableAsyncAvatarLoad, bulletinScrollOptConfiguration.enableAsyncAvatarLoad) && Intrinsics.LJFF(this.enableTextBindOpt, bulletinScrollOptConfiguration.enableTextBindOpt) && Intrinsics.LJFF(this.enableHybridWidgetV2, bulletinScrollOptConfiguration.enableHybridWidgetV2) && Intrinsics.LJFF(this.enableWidgetPreInitV2, bulletinScrollOptConfiguration.enableWidgetPreInitV2) && Intrinsics.LJFF(this.enableVideoBindOpt, bulletinScrollOptConfiguration.enableVideoBindOpt) && Intrinsics.LJFF(this.enableVHPoolWarmUp, bulletinScrollOptConfiguration.enableVHPoolWarmUp) && Intrinsics.LJFF(this.enablePhotoBindOpt, bulletinScrollOptConfiguration.enablePhotoBindOpt) && Intrinsics.LJFF(this.enableCommentWidgetV2, bulletinScrollOptConfiguration.enableCommentWidgetV2) && Intrinsics.LJFF(this.enableTextConfigOpt, bulletinScrollOptConfiguration.enableTextConfigOpt) && Intrinsics.LJFF(this.enableLinearLayoutOpt, bulletinScrollOptConfiguration.enableLinearLayoutOpt) && Intrinsics.LJFF(this.enableVmHolder, bulletinScrollOptConfiguration.enableVmHolder) && Intrinsics.LJFF(this.fpsDetailedCollectSampleRate, bulletinScrollOptConfiguration.fpsDetailedCollectSampleRate) && Intrinsics.LJFF(this.enableFpsSampleRate, bulletinScrollOptConfiguration.enableFpsSampleRate);
    }

    public int hashCode() {
        Integer num = this.enableAsyncDiff;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.enableRainbowOpt;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.enableWidgetPreInit;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.enableBindOptimization;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.enableViewPreload;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.enableDelayedSubscribe;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.enableWidgetCodeLayout;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.enableAsyncAvatarLoad;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.enableTextBindOpt;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.enableHybridWidgetV2;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.enableWidgetPreInitV2;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.enableVideoBindOpt;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.enableVHPoolWarmUp;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.enablePhotoBindOpt;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.enableCommentWidgetV2;
        int iHashCode15 = (iHashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.enableTextConfigOpt;
        int iHashCode16 = (iHashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.enableLinearLayoutOpt;
        int iHashCode17 = (iHashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.enableVmHolder;
        int iHashCode18 = (iHashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.fpsDetailedCollectSampleRate;
        int iHashCode19 = (iHashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.enableFpsSampleRate;
        return iHashCode19 + (num20 != null ? num20.hashCode() : 0);
    }

    public String toString() {
        return "BulletinScrollOptConfiguration(enableAsyncDiff=" + this.enableAsyncDiff + ", enableRainbowOpt=" + this.enableRainbowOpt + ", enableWidgetPreInit=" + this.enableWidgetPreInit + ", enableBindOptimization=" + this.enableBindOptimization + ", enableViewPreload=" + this.enableViewPreload + ", enableDelayedSubscribe=" + this.enableDelayedSubscribe + ", enableWidgetCodeLayout=" + this.enableWidgetCodeLayout + ", enableAsyncAvatarLoad=" + this.enableAsyncAvatarLoad + ", enableTextBindOpt=" + this.enableTextBindOpt + ", enableHybridWidgetV2=" + this.enableHybridWidgetV2 + ", enableWidgetPreInitV2=" + this.enableWidgetPreInitV2 + ", enableVideoBindOpt=" + this.enableVideoBindOpt + ", enableVHPoolWarmUp=" + this.enableVHPoolWarmUp + ", enablePhotoBindOpt=" + this.enablePhotoBindOpt + ", enableCommentWidgetV2=" + this.enableCommentWidgetV2 + ", enableTextConfigOpt=" + this.enableTextConfigOpt + ", enableLinearLayoutOpt=" + this.enableLinearLayoutOpt + ", enableVmHolder=" + this.enableVmHolder + ", fpsDetailedCollectSampleRate=" + this.fpsDetailedCollectSampleRate + ", enableFpsSampleRate=" + this.enableFpsSampleRate + ')';
    }

    public BulletinScrollOptConfiguration(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20) {
        this.enableAsyncDiff = num;
        this.enableRainbowOpt = num2;
        this.enableWidgetPreInit = num3;
        this.enableBindOptimization = num4;
        this.enableViewPreload = num5;
        this.enableDelayedSubscribe = num6;
        this.enableWidgetCodeLayout = num7;
        this.enableAsyncAvatarLoad = num8;
        this.enableTextBindOpt = num9;
        this.enableHybridWidgetV2 = num10;
        this.enableWidgetPreInitV2 = num11;
        this.enableVideoBindOpt = num12;
        this.enableVHPoolWarmUp = num13;
        this.enablePhotoBindOpt = num14;
        this.enableCommentWidgetV2 = num15;
        this.enableTextConfigOpt = num16;
        this.enableLinearLayoutOpt = num17;
        this.enableVmHolder = num18;
        this.fpsDetailedCollectSampleRate = num19;
        this.enableFpsSampleRate = num20;
    }
}
