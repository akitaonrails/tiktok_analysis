package com.ss.lyrax.transcoder;

import X.C2188811AlT;
import com.ss.lyrax.stream.LyraxStreamIndex;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderLayoutRegionConfig {
    public float cornerRadius;
    public boolean isLocalUser;
    public float locationX;
    public float locationY;
    public int winId;
    public int zOrder;
    public String userId = "";
    public String roomId = "";
    public String streamId = "";
    public float widthProportion = 1.0f;
    public float heightProportion = 1.0f;
    public float alpha = 1.0f;
    public LyraxStreamIndex streamIndex = LyraxStreamIndex.kMain;
    public LyraxTranscoderMediaType mediaType = LyraxTranscoderMediaType.AUDIO_AND_VIDEO;
    public LyraxTranscoderRenderMode renderMode = LyraxTranscoderRenderMode.HIDDEN;
    public LyraxTranscoderLayoutRegionType regionContentType = LyraxTranscoderLayoutRegionType.VIDEO_STREAM;
    public String alternateImageUrl = "";
    public LyraxTranscoderLayoutRegionAlternateImageProcessConfig alternateImageProcessConfig = new LyraxTranscoderLayoutRegionAlternateImageProcessConfig();
    public LyraxTranscoderPosition spatialPosition = new LyraxTranscoderPosition();
    public LyraxTranscoderSourceCrop sourceCrop = new LyraxTranscoderSourceCrop();
    public boolean applySpatialAudio = false;
    public boolean applySpatialReverb = false;
    public LyraxTranscoderEffectDescription[] effectDescriptions = null;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxTranscoderLayoutRegionConfig{userId='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", roomId='");
        sbLIZ.append(this.roomId);
        sbLIZ.append('\'');
        sbLIZ.append(", winId=");
        sbLIZ.append(this.winId);
        sbLIZ.append(", streamId='");
        sbLIZ.append(this.streamId);
        sbLIZ.append('\'');
        sbLIZ.append(", locationX=");
        sbLIZ.append(this.locationX);
        sbLIZ.append(", locationY=");
        sbLIZ.append(this.locationY);
        sbLIZ.append(", widthProportion=");
        sbLIZ.append(this.widthProportion);
        sbLIZ.append(", heightProportion=");
        sbLIZ.append(this.heightProportion);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append(this.cornerRadius);
        sbLIZ.append(", zOrder=");
        sbLIZ.append(this.zOrder);
        sbLIZ.append(", isLocalUser=");
        sbLIZ.append(this.isLocalUser);
        sbLIZ.append(", streamIndex=");
        sbLIZ.append(this.streamIndex);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", renderMode=");
        sbLIZ.append(this.renderMode);
        sbLIZ.append(", regionContentType=");
        sbLIZ.append(this.regionContentType);
        sbLIZ.append(", alternateImageUrl='");
        sbLIZ.append(this.alternateImageUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", alternateImageProcessConfig=");
        sbLIZ.append(this.alternateImageProcessConfig);
        sbLIZ.append(", spatialPosition=");
        sbLIZ.append(this.spatialPosition);
        sbLIZ.append(", sourceCrop=");
        sbLIZ.append(this.sourceCrop);
        sbLIZ.append(", applySpatialAudio=");
        sbLIZ.append(this.applySpatialAudio);
        sbLIZ.append(", applySpatialReverb=");
        sbLIZ.append(this.applySpatialReverb);
        sbLIZ.append(", effectDescriptions=");
        sbLIZ.append(Arrays.toString(this.effectDescriptions));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public float getAlpha() {
        return this.alpha;
    }

    public LyraxTranscoderLayoutRegionAlternateImageProcessConfig getAlternateImageProcessConfig() {
        return this.alternateImageProcessConfig;
    }

    public String getAlternateImageUrl() {
        return this.alternateImageUrl;
    }

    public boolean getApplySpatialAudio() {
        return this.applySpatialAudio;
    }

    public boolean getApplySpatialReverb() {
        return this.applySpatialReverb;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public LyraxTranscoderEffectDescription[] getEffectDescriptions() {
        return this.effectDescriptions;
    }

    public float getHeightProportion() {
        return this.heightProportion;
    }

    public boolean getIsLocalUser() {
        return this.isLocalUser;
    }

    public float getLocationX() {
        return this.locationX;
    }

    public float getLocationY() {
        return this.locationY;
    }

    public LyraxTranscoderMediaType getMediaType() {
        return this.mediaType;
    }

    public LyraxTranscoderLayoutRegionType getRegionContentType() {
        return this.regionContentType;
    }

    public LyraxTranscoderRenderMode getRenderMode() {
        return this.renderMode;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public LyraxTranscoderSourceCrop getSourceCrop() {
        return this.sourceCrop;
    }

    public LyraxTranscoderPosition getSpatialPosition() {
        return this.spatialPosition;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public LyraxStreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public float getWidthProportion() {
        return this.widthProportion;
    }

    public int getWinId() {
        return this.winId;
    }

    public int getzOrder() {
        return this.zOrder;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setAlternateImageProcessConfig(LyraxTranscoderLayoutRegionAlternateImageProcessConfig lyraxTranscoderLayoutRegionAlternateImageProcessConfig) {
        this.alternateImageProcessConfig = lyraxTranscoderLayoutRegionAlternateImageProcessConfig;
    }

    public void setAlternateImageUrl(String str) {
        this.alternateImageUrl = str;
    }

    public void setApplySpatialAudio(boolean z) {
        this.applySpatialAudio = z;
    }

    public void setApplySpatialReverb(boolean z) {
        this.applySpatialReverb = z;
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public void setEffectDescriptions(LyraxTranscoderEffectDescription[] lyraxTranscoderEffectDescriptionArr) {
        this.effectDescriptions = lyraxTranscoderEffectDescriptionArr;
    }

    public void setHeightProportion(float f) {
        this.heightProportion = f;
    }

    public void setLocalUser(boolean z) {
        this.isLocalUser = z;
    }

    public void setLocationX(float f) {
        this.locationX = f;
    }

    public void setLocationY(float f) {
        this.locationY = f;
    }

    public void setMediaType(LyraxTranscoderMediaType lyraxTranscoderMediaType) {
        this.mediaType = lyraxTranscoderMediaType;
    }

    public void setRegionContentType(LyraxTranscoderLayoutRegionType lyraxTranscoderLayoutRegionType) {
        this.regionContentType = lyraxTranscoderLayoutRegionType;
    }

    public void setRenderMode(LyraxTranscoderRenderMode lyraxTranscoderRenderMode) {
        this.renderMode = lyraxTranscoderRenderMode;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setSourceCrop(LyraxTranscoderSourceCrop lyraxTranscoderSourceCrop) {
        this.sourceCrop = lyraxTranscoderSourceCrop;
    }

    public void setSpatialPosition(LyraxTranscoderPosition lyraxTranscoderPosition) {
        this.spatialPosition = lyraxTranscoderPosition;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public void setStreamIndex(LyraxStreamIndex lyraxStreamIndex) {
        this.streamIndex = lyraxStreamIndex;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setWidthProportion(float f) {
        this.widthProportion = f;
    }

    public void setWinId(int i) {
        this.winId = i;
    }

    public void setzOrder(int i) {
        this.zOrder = i;
    }
}
