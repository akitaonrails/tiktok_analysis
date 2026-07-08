package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C1474810oTv;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class Video implements Serializable {

    @C09CT("ad_video_id")
    public String adVideoId;

    @C09CT("ai_static_cover")
    public UrlModel aiCover;

    @C09CT("ai_dynamic_cover")
    public UrlModel aiDynamicCover;

    @C09CT("ai_dynamic_cover_bak")
    public UrlModel aiDynamicCoverBak;

    @C09CT("animated_cover")
    public UrlModel animatedCover;
    public float aspectRatio;

    @C09CT("big_thumbs")
    public List<BigThumb> bigThumbs;

    @C09CT("bit_rate")
    public List<BitRate> bitRate;

    @C09CT("bit_rate_audio")
    public List<BitrateAudioStruct> bitRateAudio;

    @C09CT("blur_preview")
    public String blurPreview;
    public int[] cachedOuterCoverSize;
    public UrlModel cachedOuterCoverUrl;

    @C09CT("caption_download_addr")
    public UrlModel captionDownloadAddr;

    @C09CT("cla_info")
    public CaptionModel captionModel;

    @C09CT("cdn_url_expired")
    public long cdnUrlExpired;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("cover_rgb")
    public String coverRgb;

    @C09CT("CoverTsp")
    public double coverTsp;

    @C09CT("video_model")
    public String dVideoModel;

    @C09CT("video_model_v2")
    public Map<String, Object> dVideoModelV2;

    @C09CT("did_profile_labels")
    public String didProfileLabels;

    @C09CT("download_addr")
    public UrlModel downloadAddr;

    @C09CT("download_no_watermark_addr")
    public UrlModel downloadNoWatermarkAddr;

    @C09CT("token_auth")
    public PlayTokenAuth drmTokenAuth;

    @C09CT("dynamic_cover")
    public UrlModel dynamicCover;

    @C09CT("is_drm_source")
    public boolean enableIntertrustDrm;

    @C09CT("fake_landscape_video_info")
    public FakeLandscapeInfo fakeLandscapeInfo;

    @C09CT("format")
    public String format;

    @C09CT("play_addr_h264")
    public VideoUrlModel h264PlayAddr;
    public Boolean hasDashBitrate;

    @C09CT("height")
    public int height;

    @C09CT("interest_selection_tags")
    public List<String> interestSelectionTags;

    @C09CT("is_3d")
    public boolean is3DVideo;

    @C09CT("is_callback")
    public boolean isCallback;

    @C09CT("cover_is_custom")
    public boolean isCustomCover;

    @C09CT("is_long_video")
    public int isLongVideo;

    @C09CT("lowres_cover")
    public UrlModel lowResCover;

    @C09CT("meta")
    public String meta;

    @C09CT("misc_download_addrs")
    public String miscDownloadAddrs;

    @C09CT("need_set_token")
    public boolean needSetCookie;

    @C09CT("new_download_addr")
    public UrlModel newDownloadAddr;

    @C09CT("origin_cover")
    public UrlModel originCover;

    @C09CT("pillar_box_video_info")
    public PillarBoxVideoInfo pillarBoxVideoInfo;

    @C09CT("real_duration")
    public int pilotLength;

    @C09CT("play_addr")
    public VideoUrlModel playAddr;

    @C09CT("play_addr_3d_fallback")
    public VideoUrlModel playAddr3DFallback;

    @C09CT("play_addr_bytevc1")
    public VideoUrlModel playAddrBytevc1;

    @C09CT("ratio")
    public String ratio;

    @C09CT("ui_alike_download_addr")
    public UrlModel uiAlikeAddr;

    @C09CT("vid_profile_labels")
    public String vidProfileLabels;
    public String videoAdTag;

    @C09CT("duration")
    public int videoLength;
    public transient Object videoModelObject;

    @C09CT("tag")
    public com.ss.android.ugc.aweme.discover.model.VideoTag videoTag;

    @C09CT("tags")
    public List<com.ss.android.ugc.aweme.discover.model.VideoTag> videoTags;

    @C09CT("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    private void checkBitRateAndDurationCopy() {
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            List<BitRate> bitRate = videoUrlModel.getBitRate();
            List<BitRate> list = this.bitRate;
            if (bitRate != list) {
                this.playAddrBytevc1.setBitRate(list);
                this.playAddrBytevc1.setAudioBitrate(this.bitRateAudio);
                this.playAddrBytevc1.setMeta(this.meta);
                this.playAddrBytevc1.setFormat(this.format);
                this.playAddrBytevc1.setDashVideoModelStr(getVideoModelStr());
                this.playAddrBytevc1.setDashVideoModelMap(getVideoModelMap());
                this.playAddrBytevc1.setDidProfileLabels(getDidProfileLabels());
                this.playAddrBytevc1.setVidProfileLabels(getVidProfileLabels());
                this.playAddrBytevc1.setDuration(this.videoLength);
                this.playAddrBytevc1.setCodecType(1);
                this.playAddrBytevc1.setCdnUrlExpired(this.cdnUrlExpired);
                initAspectRatio(this.playAddrBytevc1);
            }
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            List<BitRate> bitRate2 = videoUrlModel2.getBitRate();
            List<BitRate> list2 = this.bitRate;
            if (bitRate2 != list2) {
                this.playAddr.setBitRate(list2);
                this.playAddr.setAudioBitrate(this.bitRateAudio);
                this.playAddr.setMeta(this.meta);
                this.playAddr.setFormat(this.format);
                this.playAddr.setDashVideoModelStr(getVideoModelStr());
                this.playAddr.setDashVideoModelMap(getVideoModelMap());
                this.playAddr.setDidProfileLabels(getDidProfileLabels());
                this.playAddr.setVidProfileLabels(getVidProfileLabels());
                this.playAddr.setDuration(this.videoLength);
                this.playAddr.setCodecType(0);
                this.playAddr.setCdnUrlExpired(this.cdnUrlExpired);
                initAspectRatio(this.playAddr);
            }
        }
    }

    public Video copyFrom() {
        Video video = new Video();
        video.playAddr = this.playAddr;
        video.playAddrBytevc1 = this.playAddrBytevc1;
        video.h264PlayAddr = this.h264PlayAddr;
        video.cover = this.cover;
        video.aiCover = this.aiCover;
        video.isCustomCover = this.isCustomCover;
        video.coverTsp = this.coverTsp;
        video.dVideoModel = this.dVideoModel;
        video.dVideoModelV2 = this.dVideoModelV2;
        video.drmTokenAuth = this.drmTokenAuth;
        video.dynamicCover = this.dynamicCover;
        video.animatedCover = this.animatedCover;
        video.originCover = this.originCover;
        video.aiDynamicCover = this.aiDynamicCover;
        video.aiDynamicCoverBak = this.aiDynamicCoverBak;
        video.height = this.height;
        video.width = this.width;
        video.ratio = this.ratio;
        video.downloadAddr = this.downloadAddr;
        video.videoLength = this.videoLength;
        video.bitRate = this.bitRate;
        video.newDownloadAddr = this.newDownloadAddr;
        video.uiAlikeAddr = this.uiAlikeAddr;
        video.captionDownloadAddr = this.captionDownloadAddr;
        video.needSetCookie = this.needSetCookie;
        video.videoTag = this.videoTag;
        video.videoTags = this.videoTags;
        video.miscDownloadAddrs = this.miscDownloadAddrs;
        video.enableIntertrustDrm = this.enableIntertrustDrm;
        video.pilotLength = this.pilotLength;
        video.captionModel = this.captionModel;
        video.bigThumbs = this.bigThumbs;
        video.cachedOuterCoverUrl = this.cachedOuterCoverUrl;
        video.cachedOuterCoverSize = this.cachedOuterCoverSize;
        video.isCallback = this.isCallback;
        video.meta = this.meta;
        video.isLongVideo = this.isLongVideo;
        video.videoAdTag = this.videoAdTag;
        video.cdnUrlExpired = this.cdnUrlExpired;
        video.didProfileLabels = this.didProfileLabels;
        video.vidProfileLabels = this.vidProfileLabels;
        video.coverRgb = this.coverRgb;
        return video;
    }

    public String getAid() {
        VideoUrlModel videoUrlModel = this.playAddr;
        String sourceId = videoUrlModel != null ? videoUrlModel.getSourceId() : null;
        if (this.playAddrBytevc1 != null && TextUtils.isEmpty(sourceId)) {
            sourceId = this.playAddrBytevc1.getSourceId();
        }
        return TextUtils.isEmpty(sourceId) ? "null_aweme_id" : sourceId;
    }

    public VideoUrlModel getH264PlayAddr() {
        VideoUrlModel videoUrlModel = this.h264PlayAddr;
        if (videoUrlModel != null) {
            long cdnUrlExpired = videoUrlModel.getCdnUrlExpired();
            long j = this.cdnUrlExpired;
            if (cdnUrlExpired != j) {
                this.h264PlayAddr.setCdnUrlExpired(j);
            }
        }
        return this.h264PlayAddr;
    }

    public long getPb2AwemeMillis() {
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null && 0 != videoUrlModel.getPb2AwemeMillis()) {
            return this.playAddr.getPb2AwemeMillis();
        }
        VideoUrlModel videoUrlModel2 = this.playAddrBytevc1;
        if (videoUrlModel2 != null && 0 != videoUrlModel2.getPb2AwemeMillis()) {
            return this.playAddrBytevc1.getPb2AwemeMillis();
        }
        VideoUrlModel videoUrlModel3 = this.h264PlayAddr;
        if (videoUrlModel3 == null || 0 == videoUrlModel3.getPb2AwemeMillis()) {
            return 0L;
        }
        return this.h264PlayAddr.getPb2AwemeMillis();
    }

    public String getVideoId() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getToken();
        }
        return null;
    }

    public int getWidth() {
        return this.is3DVideo ? (int) Math.ceil(this.width / 3.0f) : this.width;
    }

    public boolean hasByteVC2() {
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return false;
        }
        for (BitRate bitRate : list) {
            if (bitRate != null && 2 == bitRate.isBytevc1()) {
                return true;
            }
        }
        return false;
    }

    public boolean isCoverValid() {
        return isUrlModelValid(this.cover);
    }

    public boolean isLongVideo() {
        return this.isLongVideo > 0;
    }

    public boolean isOriginCoverValid() {
        return isUrlModelValid(this.originCover);
    }

    private void calculateHasDashBitrate() {
        if (C1474810oTv.LJJI()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.hasDashBitrate = Boolean.TRUE;
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.hasDashBitrate = Boolean.FALSE;
    }

    public List<BitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<BitRate> list = this.bitRate;
        return list == null ? Collections.emptyList() : list;
    }

    public UrlModel getOriginCover() {
        return (isOriginCoverValid() || !isCoverValid()) ? this.originCover : this.cover;
    }

    public VideoUrlModel getPlayAddr() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(1);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setCodecType(0);
            this.playAddr.setRatio(this.ratio);
        }
        return checkVideo(this.playAddrBytevc1) ? this.playAddrBytevc1 : this.playAddr;
    }

    public VideoUrlModel getPlayAddrBytevc1() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(1);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        return this.playAddrBytevc1;
    }

    public VideoUrlModel getPlayAddrH264() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(0);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    public VideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public Map<String, Object> getVideoModelMap() {
        if (!C1474810oTv.LJLLI() || !hasDashBitrate()) {
            return this.dVideoModelV2;
        }
        Map<String, Object> map = this.dVideoModelV2;
        if (map != null) {
            return map;
        }
        Map<String, Object> dashMapFromVideo = DashVideoModelUtil.Companion.getDashMapFromVideo(this);
        this.dVideoModelV2 = dashMapFromVideo;
        return dashMapFromVideo;
    }

    public String getVideoModelStr() {
        if (C1474810oTv.LJLLI() || !hasDashBitrate()) {
            return this.dVideoModel;
        }
        if (!TextUtils.isEmpty(this.dVideoModel)) {
            return this.dVideoModel;
        }
        String dashJsonStrFromVideo = DashVideoModelUtil.Companion.getDashJsonStrFromVideo(this);
        this.dVideoModel = dashJsonStrFromVideo;
        return dashJsonStrFromVideo;
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.format);
        }
        if (((Boolean) C1474810oTv.F0.getValue()).booleanValue() && (bool = this.hasDashBitrate) != null) {
            return bool.booleanValue();
        }
        calculateHasDashBitrate();
        return this.hasDashBitrate.booleanValue();
    }

    public boolean hasVideoModel() {
        return (TextUtils.isEmpty(getVideoModelStr()) && getVideoModelMap() == null) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video{playAddr=");
        sbLIZ.append(this.playAddr);
        sbLIZ.append(", playAddrBytevc1=");
        sbLIZ.append(this.playAddrBytevc1);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", dynamicCover=");
        sbLIZ.append(this.dynamicCover);
        sbLIZ.append(", originCover=");
        sbLIZ.append(this.originCover);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", ratio='");
        sbLIZ.append(this.ratio);
        sbLIZ.append('\'');
        sbLIZ.append(", downloadAddr=");
        sbLIZ.append(this.downloadAddr);
        sbLIZ.append(", videoLength=");
        sbLIZ.append(this.videoLength);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", newDownloadAddr=");
        sbLIZ.append(this.newDownloadAddr);
        sbLIZ.append(", needSetCookie=");
        sbLIZ.append(this.needSetCookie);
        sbLIZ.append(", misc_download_addrs=");
        sbLIZ.append(this.miscDownloadAddrs);
        sbLIZ.append(", isCallback=");
        sbLIZ.append(this.isCallback);
        sbLIZ.append(", isLongVideo=");
        sbLIZ.append(this.isLongVideo);
        sbLIZ.append(", meta=");
        sbLIZ.append(this.meta);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public String getAdVideoId() {
        return this.adVideoId;
    }

    public UrlModel getAiCover() {
        return this.aiCover;
    }

    public UrlModel getAiDynamicCover() {
        return this.aiDynamicCover;
    }

    public UrlModel getAiDynamicCoverBak() {
        return this.aiDynamicCoverBak;
    }

    public UrlModel getAnimatedCover() {
        return this.animatedCover;
    }

    public List<BigThumb> getBigThumbs() {
        return this.bigThumbs;
    }

    public String getBlurPreview() {
        return this.blurPreview;
    }

    public int[] getCachedOuterCoverSize() {
        return this.cachedOuterCoverSize;
    }

    public UrlModel getCachedOuterCoverUrl() {
        return this.cachedOuterCoverUrl;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public CaptionModel getCaptionModel() {
        return this.captionModel;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getCoverRgb() {
        return this.coverRgb;
    }

    public double getCoverTsp() {
        return this.coverTsp;
    }

    public String getDidProfileLabels() {
        return this.didProfileLabels;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public UrlModel getDownloadNoWatermarkAddr() {
        return this.downloadNoWatermarkAddr;
    }

    public PlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public FakeLandscapeInfo getFakeLandscapeInfo() {
        return this.fakeLandscapeInfo;
    }

    public String getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public List<String> getInterestSelectionTags() {
        return this.interestSelectionTags;
    }

    public UrlModel getLowResCover() {
        return this.lowResCover;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getMiscDownloadAddrs() {
        return this.miscDownloadAddrs;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public PillarBoxVideoInfo getPillarBoxVideoInfo() {
        return this.pillarBoxVideoInfo;
    }

    public int getPilotLength() {
        return this.pilotLength;
    }

    public VideoUrlModel getPlayAddr3DFallback() {
        return this.playAddr3DFallback;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<BitRate> getRawBitRate() {
        return this.bitRate;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public String getVidProfileLabels() {
        return this.vidProfileLabels;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public Object getVideoModelObject() {
        return this.videoModelObject;
    }

    public com.ss.android.ugc.aweme.discover.model.VideoTag getVideoTag() {
        return this.videoTag;
    }

    public List<com.ss.android.ugc.aweme.discover.model.VideoTag> getVideoTags() {
        return this.videoTags;
    }

    public boolean is3DVideo() {
        return this.is3DVideo;
    }

    public boolean isCallback() {
        return this.isCallback;
    }

    public boolean isCustomCover() {
        return this.isCustomCover;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    private void initAspectRatio(VideoUrlModel videoUrlModel) {
        int i;
        int i2;
        if (this.aspectRatio <= 0.0f && (i = this.width) != 0 && (i2 = this.height) != 0) {
            this.aspectRatio = (i * 1.0f) / i2;
        }
        if (videoUrlModel != null) {
            float f = this.aspectRatio;
            if (f > 0.0f) {
                videoUrlModel.setAspectRatio(f);
            }
        }
    }

    public static boolean isUrlModelValid(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkVideo(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = urlList.iterator();
        while (it2.hasNext()) {
            if (TextUtils.isEmpty(it2.next())) {
                it2.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setAdVideoId(String str) {
        this.adVideoId = str;
    }

    public void setAiDynamicCover(UrlModel urlModel) {
        this.aiDynamicCover = urlModel;
    }

    public void setAiDynamicCoverBak(UrlModel urlModel) {
        this.aiDynamicCoverBak = urlModel;
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBigThumbs(List<BigThumb> list) {
        this.bigThumbs = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCachedOuterCoverSize(int[] iArr) {
        this.cachedOuterCoverSize = iArr;
    }

    public void setCachedOuterCoverUrl(UrlModel urlModel) {
        this.cachedOuterCoverUrl = urlModel;
    }

    public void setCallback(boolean z) {
        this.isCallback = z;
    }

    public void setCaptionModel(CaptionModel captionModel) {
        this.captionModel = captionModel;
    }

    public void setCdnUrlExpired(long j) {
        this.cdnUrlExpired = j;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setCoverRgb(String str) {
        this.coverRgb = str;
    }

    public void setCoverTsp(double d) {
        this.coverTsp = d;
    }

    public void setDidProfileLabels(String str) {
        this.didProfileLabels = str;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDownloadNoWatermarkAddr(UrlModel urlModel) {
        this.downloadNoWatermarkAddr = urlModel;
    }

    public void setDrmTokenAuth(PlayTokenAuth playTokenAuth) {
        this.drmTokenAuth = playTokenAuth;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setFakeLandscapeInfo(FakeLandscapeInfo fakeLandscapeInfo) {
        this.fakeLandscapeInfo = fakeLandscapeInfo;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public void setMiscDownloadAddrs(String str) {
        this.miscDownloadAddrs = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPb2AwemeMillis(long j) {
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setPb2AwemeMillis(j);
        }
        VideoUrlModel videoUrlModel2 = this.playAddrBytevc1;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setPb2AwemeMillis(j);
        }
        VideoUrlModel videoUrlModel3 = this.h264PlayAddr;
        if (videoUrlModel3 != null) {
            videoUrlModel3.setPb2AwemeMillis(j);
        }
    }

    public void setPillarBoxVideoInfo(PillarBoxVideoInfo pillarBoxVideoInfo) {
        this.pillarBoxVideoInfo = pillarBoxVideoInfo;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrBytevc1(VideoUrlModel videoUrlModel) {
        this.playAddrBytevc1 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setRationAndSourceId(String str) {
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setRatio(this.ratio);
            videoUrlModel.setSourceId(str);
            this.playAddrBytevc1.setCodecType(1);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setRatio(this.ratio);
            videoUrlModel2.setSourceId(str);
            this.playAddr.setCodecType(0);
        }
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVidProfileLabels(String str) {
        this.vidProfileLabels = str;
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel2 = this.playAddrBytevc1;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel3 = this.h264PlayAddr;
        if (videoUrlModel3 != null) {
            videoUrlModel3.setVideoAdTag(str);
        }
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModelMap(Map<String, Object> map) {
        this.dVideoModelV2 = map;
    }

    public void setVideoModelObject(Object obj) {
        this.videoModelObject = obj;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(com.ss.android.ugc.aweme.discover.model.VideoTag videoTag) {
        this.videoTag = videoTag;
    }

    public void setVideoTags(List<com.ss.android.ugc.aweme.discover.model.VideoTag> list) {
        this.videoTags = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
