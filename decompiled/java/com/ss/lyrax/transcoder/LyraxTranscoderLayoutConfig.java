package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderLayoutConfig {
    public String appData;
    public long danceVideoStartNtpTime;
    public LyraxTranscoderEffectDescription[] effectDescriptions;
    public LyraxTranscoderLayoutRegionConfig[] layoutBeforeRegionConfigs;
    public LyraxTranscoderLayoutRegionConfig[] layoutRegionConfigs;
    public String backgroundColor = "";
    public String backgroundImageUrl = "";
    public String animationId = "";
    public String animationPath = "";
    public String flashColor = "";
    public LyraxTranscoderRenderMode backgroundImageRenderMode = LyraxTranscoderRenderMode.HIDDEN;
    public LyraxTranscoderAppdataSEIMode appdataSEIMode = LyraxTranscoderAppdataSEIMode.ASYNC_MODE;
    public String danceVideoId = "";

    public String getAnimationId() {
        return this.animationId;
    }

    public String getAnimationPath() {
        return this.animationPath;
    }

    public String getAppData() {
        return this.appData;
    }

    public LyraxTranscoderAppdataSEIMode getAppdataSEIMode() {
        return this.appdataSEIMode;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public LyraxTranscoderRenderMode getBackgroundImageRenderMode() {
        return this.backgroundImageRenderMode;
    }

    public String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public String getDanceVideoId() {
        return this.danceVideoId;
    }

    public long getDanceVideoStartNtpTime() {
        return this.danceVideoStartNtpTime;
    }

    public LyraxTranscoderEffectDescription[] getEffectDescriptions() {
        return this.effectDescriptions;
    }

    public String getFlashColor() {
        return this.flashColor;
    }

    public LyraxTranscoderLayoutRegionConfig[] getLayoutBeforeRegionConfigs() {
        return this.layoutBeforeRegionConfigs;
    }

    public LyraxTranscoderLayoutRegionConfig[] getLayoutRegionConfigs() {
        return this.layoutRegionConfigs;
    }

    public void setAnimationId(String str) {
        this.animationId = str;
    }

    public void setAnimationPath(String str) {
        this.animationPath = str;
    }

    public void setAppData(String str) {
        this.appData = str;
    }

    public void setAppdataSEIMode(LyraxTranscoderAppdataSEIMode lyraxTranscoderAppdataSEIMode) {
        this.appdataSEIMode = lyraxTranscoderAppdataSEIMode;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setBackgroundImageRenderMode(LyraxTranscoderRenderMode lyraxTranscoderRenderMode) {
        this.backgroundImageRenderMode = lyraxTranscoderRenderMode;
    }

    public void setBackgroundImageUrl(String str) {
        this.backgroundImageUrl = str;
    }

    public void setDanceVideoId(String str) {
        this.danceVideoId = str;
    }

    public void setDanceVideoStartNtpTime(long j) {
        this.danceVideoStartNtpTime = j;
    }

    public void setEffectDescriptions(LyraxTranscoderEffectDescription[] lyraxTranscoderEffectDescriptionArr) {
        this.effectDescriptions = lyraxTranscoderEffectDescriptionArr;
    }

    public void setFlashColor(String str) {
        this.flashColor = str;
    }

    public void setLayoutBeforeRegionConfigs(LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr) {
        this.layoutBeforeRegionConfigs = lyraxTranscoderLayoutRegionConfigArr;
    }

    public void setLayoutRegionConfigs(LyraxTranscoderLayoutRegionConfig[] lyraxTranscoderLayoutRegionConfigArr) {
        this.layoutRegionConfigs = lyraxTranscoderLayoutRegionConfigArr;
    }
}
