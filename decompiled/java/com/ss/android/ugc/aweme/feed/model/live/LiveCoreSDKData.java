package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class LiveCoreSDKData implements Serializable {

    @C09CT("pull_data")
    public PullData pullData;

    public static class Options implements Serializable {

        @C09CT("default_preview_quality")
        public Quality defaultPreviewQuality;

        @C09CT("default_quality")
        public Quality defaultQuality;

        @C09CT("forced_low_latency")
        public boolean forcedLowLatency;

        @C09CT("qualities")
        public List<Quality> qualityList;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Options{defaultQuality=");
            sbLIZ.append(this.defaultQuality);
            sbLIZ.append(", qualityList=");
            sbLIZ.append(this.qualityList);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public boolean getForceLowLatency() {
            return this.forcedLowLatency;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    public static class PullData implements Serializable {

        @C09CT("options")
        public Options options;

        @C09CT("stream_data")
        public String streamData;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PullData{options=");
            sbLIZ.append(this.options);
            sbLIZ.append(", streamData='");
            sbLIZ.append(this.streamData);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options) {
            this.options = options;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    /* JADX INFO: loaded from: classes32.dex */
    public static class Quality implements Serializable {

        @C09CT("name")
        public String name;

        @C09CT("sdk_key")
        public String sdkKey;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Quality{name='");
            sbLIZ.append(this.name);
            sbLIZ.append('\'');
            sbLIZ.append(", sdkKey='");
            sbLIZ.append(this.sdkKey);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public Quality getDefaultPreviewQuality() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultPreviewQuality;
    }

    public Quality getDefaultQuality() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoreSDKData{pullData=");
        sbLIZ.append(this.pullData);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public void setPullData(PullData pullData) {
        this.pullData = pullData;
    }
}
