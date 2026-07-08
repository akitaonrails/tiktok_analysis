package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.discover.model.VideoTag;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.video.PillarBoxVideoInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class Video implements Serializable {
    public UrlModel LL;
    public int[] LLILLJJLI;
    public String LLILLL;
    public float LLILZ;
    public Boolean LLILZIL;
    public transient Object LLILZLL;

    @C09CT("ai_static_cover")
    public UrlModel aiCover;

    @C09CT("ai_dynamic_cover")
    public UrlModel aiDynamicCover;

    @C09CT("ai_dynamic_cover_bak")
    public UrlModel aiDynamicCoverBak;

    @C09CT("animated_cover")
    public UrlModel animatedCover;

    @C09CT("big_thumbs")
    public List<Object> bigThumbs;

    @C09CT("bit_rate")
    public List<BitRate> bitRate;

    @C09CT("bit_rate_audio")
    public List<BitrateAudioStruct> bitRateAudio;

    @C09CT("caption_download_addr")
    public UrlModel captionDownloadAddr;

    @C09CT("cla_info")
    public CaptionModel captionModel;

    @C09CT("cdn_url_expired")
    public long cdnUrlExpired;

    @C09CT("cover")
    public UrlModel cover;

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

    @C09CT("height")
    public int height;

    @C09CT("is_callback")
    public boolean isCallback;

    @C09CT("cover_is_custom")
    public boolean isCustomCover;

    @C09CT("is_long_video")
    public int isLongVideo;

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

    @C09CT("play_addr_bytevc1")
    public VideoUrlModel playAddrBytevc1;

    @C09CT("ratio")
    public String ratio;

    @C09CT("ui_alike_download_addr")
    public UrlModel uiAlikeAddr;

    @C09CT("vid_profile_labels")
    public String vidProfileLabels;

    @C09CT("duration")
    public int videoLength;

    @C09CT("tag")
    public VideoTag videoTag;

    @C09CT("tags")
    public List<VideoTag> videoTags;

    @C09CT("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    public final void LIZ() {
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
                LIZIZ(this.playAddrBytevc1);
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
                LIZIZ(this.playAddr);
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
        video.LL = this.LL;
        video.LLILLJJLI = this.LLILLJJLI;
        video.isCallback = this.isCallback;
        video.meta = this.meta;
        video.isLongVideo = this.isLongVideo;
        video.LLILLL = this.LLILLL;
        video.cdnUrlExpired = this.cdnUrlExpired;
        video.didProfileLabels = this.didProfileLabels;
        video.vidProfileLabels = this.vidProfileLabels;
        return video;
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
        UrlModel urlModel = this.cover;
        return (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) ? false : true;
    }

    public boolean isLongVideo() {
        return this.isLongVideo > 0;
    }

    public boolean isOriginCoverValid() {
        UrlModel urlModel = this.originCover;
        return (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) ? false : true;
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
        LIZ();
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
        LIZ();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(1);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        return this.playAddrBytevc1;
    }

    public VideoUrlModel getPlayAddrH264() {
        LIZ();
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

    /* JADX WARN: Removed duplicated region for block: B:162:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getVideoModelMap() {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video.getVideoModelMap():java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVideoModelStr() {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video.getVideoModelStr():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasDashBitrate() {
        /*
            r3 = this;
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZIZ()
            java.lang.String r2 = "dash"
            if (r0 == 0) goto L13
            java.lang.String r0 = r3.format
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            return r0
        L13:
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L26
            java.lang.Boolean r0 = r3.LLILZIL
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            return r0
        L26:
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L58
            java.lang.String r0 = r3.meta
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L54
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r3.meta     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "format"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L54
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L50
            r3.LLILZIL = r0     // Catch: java.lang.Throwable -> L50
            goto L58
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.LLILZIL = r0
        L58:
            java.lang.Boolean r0 = r3.LLILZIL
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video.hasDashBitrate():boolean");
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

    public List<Object> getBigThumbs() {
        return this.bigThumbs;
    }

    public int[] getCachedOuterCoverSize() {
        return this.LLILLJJLI;
    }

    public UrlModel getCachedOuterCoverUrl() {
        return this.LL;
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
        return this.LLILLL;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public Object getVideoModelObject() {
        return this.LLILZLL;
    }

    public VideoTag getVideoTag() {
        return this.videoTag;
    }

    public List<VideoTag> getVideoTags() {
        return this.videoTags;
    }

    public int getWidth() {
        return this.width;
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

    public final void LIZIZ(VideoUrlModel videoUrlModel) {
        int i;
        int i2;
        if (this.LLILZ <= 0.0f && (i = this.width) != 0 && (i2 = this.height) != 0) {
            this.LLILZ = (i * 1.0f) / i2;
        }
        if (videoUrlModel != null) {
            float f = this.LLILZ;
            if (f > 0.0f) {
                videoUrlModel.setAspectRatio(f);
            }
        }
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

    public void setAiDynamicCover(UrlModel urlModel) {
        this.aiDynamicCover = urlModel;
    }

    public void setAiDynamicCoverBak(UrlModel urlModel) {
        this.aiDynamicCoverBak = urlModel;
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBigThumbs(List<Object> list) {
        this.bigThumbs = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCachedOuterCoverSize(int[] iArr) {
        this.LLILLJJLI = iArr;
    }

    public void setCachedOuterCoverUrl(UrlModel urlModel) {
        this.LL = urlModel;
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
        this.LLILLL = str;
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
        this.LLILZLL = obj;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(VideoTag videoTag) {
        this.videoTag = videoTag;
    }

    public void setVideoTags(List<VideoTag> list) {
        this.videoTags = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
