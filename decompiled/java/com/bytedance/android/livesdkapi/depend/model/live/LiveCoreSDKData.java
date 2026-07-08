package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C521760KdC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LiveCoreSDKData {

    @C09CT("pull_data")
    public PullData pullData;

    @C09CT("push_data")
    public PushData pushData;

    public static class Options {

        @C09CT("default_preview_quality")
        public Quality defaultPreviewQuality;

        @C09CT("default_quality")
        public Quality defaultQuality;

        @C09CT("forced_low_latency")
        public boolean forcedLowLatency;

        @C09CT("qualities")
        public List<Quality> qualityList;

        @C09CT("show_quality_button")
        public boolean showQualityButton;

        @C09CT("support_low_latency")
        public boolean supportLowLatency;

        @C09CT("max_drm_lenient_size_backup")
        public String maxDrmLenientSizeBackup = "";

        @C09CT("max_drm_lenient_size")
        public String maxDrmLenientSize = "";

        public void setDefaultQualityForDrmLenient() {
            String str = this.maxDrmLenientSize;
            if (str == null || str.isEmpty()) {
                return;
            }
            for (Quality quality : this.qualityList) {
                if (quality.sdkKey.equals(this.maxDrmLenientSize)) {
                    this.defaultQuality = quality;
                    return;
                }
            }
        }

        public Quality getDefaultQuality() {
            return this.defaultQuality;
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

    public static final class PushData {

        @C09CT("push_stream_level")
        public int pushStreamLevel;

        @C09CT("resolution_params")
        public Map<String, ResolutionParams> resolutionParams;

        @C09CT("stream_data")
        public String streamData = "";

        public static final class ResolutionParams {

            @C09CT("default_bitrate")
            public long defaultBitrate;

            @C09CT("fps")
            public long fps;

            @C09CT("height")
            public long height;

            @C09CT("max_bitrate")
            public long maxBitrate;

            @C09CT("min_bitrate")
            public long minBitrate;

            @C09CT("width")
            public long width;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static class Quality implements Parcelable {
        public static final Parcelable.Creator<Quality> CREATOR = new C521760KdC(2);

        @C09CT("icon_type")
        public int iconType;

        @C09CT("level")
        public int level;

        @C09CT("name")
        public String name;
        public List<Room> roomList;

        @C09CT("sdk_key")
        public String sdkKey;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Quality() {
            this.roomList = new ArrayList();
        }

        public Quality(Parcel parcel) {
            this.roomList = new ArrayList();
            this.name = parcel.readString();
            this.sdkKey = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.roomList = arrayList;
            parcel.readList(arrayList, Room.class.getClassLoader());
        }

        public void readFromParcel(Parcel parcel) {
            this.name = parcel.readString();
            this.sdkKey = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.roomList = arrayList;
            parcel.readList(arrayList, Room.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.sdkKey);
            parcel.writeList(this.roomList);
        }
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

    public static class PullData {

        @C09CT("options")
        public Options options;

        @C09CT("stream_data")
        public String streamData;

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

    public PullData getPullData() {
        return this.pullData;
    }

    public void setPullData(PullData pullData) {
        this.pullData = pullData;
    }
}
