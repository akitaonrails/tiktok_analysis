package com.bytedance.vcloud.strategy.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public class LivePreference {

    @C09CT("cmaf")
    public String cmaf;

    @C09CT("drm_license_urls")
    public DrmLicenseUrls drmLicenseUrls;

    @C09CT("flv")
    public String flv;

    @C09CT("hls")
    public String hls;

    @C09CT("lls")
    public String lls;
    public SubSdkParams mParsedSdkParams;

    @C09CT("rtc")
    public String rtc;

    @C09CT("sdk_params")
    public String sdkParams;

    public static class DrmLicenseUrls {

        @C09CT("minimum_security_level")
        public String minimumSecurityLevel;

        @C09CT("pssh")
        public String pssh;

        @C09CT("widevine")
        public String widevineUrl;
    }

    public static class SubSdkParams {

        @C09CT("cdn_name")
        public String cdnName;

        @C09CT("gop")
        public int gop;

        @C09CT("resolution")
        public String resolution;

        @C09CT("stream_suffix")
        public String streamSuffix;

        @C09CT("vbitrate")
        public int vBitrate;

        @C09CT("VCodec")
        public String vCodec;

        @C09CT("v_rtbitrate")
        public int vRealTimeBitrate;

        @C09CT("v_rtbitrate_pct")
        public int vRealTimeBitratePct;

        @C09CT("v_rtbitrate_std")
        public int vRealTimeBitrateStd;

        @C09CT("v_rtbitrate_timestamp")
        public long vRealTimeBitrateTs;

        @C09CT("v_rtbitrate_vpaas_timestamp")
        public long vRealTimeBitrateVpaasTs;

        @C09CT("v_rtpsnr")
        public int vRtPsnr;
    }

    public synchronized SubSdkParams getParsedSdkParams() {
        return this.mParsedSdkParams;
    }

    public synchronized void setParsedSdkParams(SubSdkParams subSdkParams) {
        this.mParsedSdkParams = subSdkParams;
    }
}
