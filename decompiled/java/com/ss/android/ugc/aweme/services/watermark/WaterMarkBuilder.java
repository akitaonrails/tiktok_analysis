package com.ss.android.ugc.aweme.services.watermark;

import X.InterfaceC2257101DWa;
import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WaterMarkBuilder {
    public boolean addEndMark;
    public boolean addInterMark;
    public int aigcLabelType;
    public InterfaceC2257101DWa author;
    public boolean containC2PA;
    public boolean forceAIGCWatermark;
    public boolean forceInputResolution;
    public String inputPath;
    public boolean is1To1;
    public boolean isAddAiChatWatermark;
    public boolean isAddAiLiveWatermark;
    public boolean isForce16To9;
    public boolean isInstagram;
    public WaterMarkListener listener;
    public long mDownloadDuration;
    public long mDownloadRate;
    public String mUrl;
    public String outPath;
    public boolean richEndMode;
    public int saveType;
    public List<String> ttsCreatorIdList;
    public String ttsVoiceCreatorDesc;
    public List<String> vcCreatorIdList;
    public Video video;
    public String waterPicDir = "";
    public Pair<Boolean, List<String>> aiBusinessWatermarkKeys = Pair.create(Boolean.FALSE, Collections.emptyList());

    public WaterMarkBuilder setActivityWaterMark(String str) {
        this.waterPicDir = str;
        return this;
    }

    public WaterMarkBuilder setAddEndMark(boolean z) {
        this.addEndMark = z;
        return this;
    }

    public WaterMarkBuilder setAddInterMark(boolean z) {
        this.addInterMark = z;
        return this;
    }

    public WaterMarkBuilder setAiChatWatermark(boolean z) {
        this.isAddAiChatWatermark = z;
        return this;
    }

    public WaterMarkBuilder setDownloadDuration(long j) {
        this.mDownloadDuration = j;
        return this;
    }

    public WaterMarkBuilder setDownloadRate(long j) {
        this.mDownloadRate = j;
        return this;
    }

    public WaterMarkBuilder setForce16To9Ratio(boolean z) {
        this.isForce16To9 = z;
        return this;
    }

    public WaterMarkBuilder setForceInputResolution(boolean z) {
        this.forceInputResolution = z;
        return this;
    }

    public WaterMarkBuilder setInputPath(String str) {
        this.inputPath = str;
        return this;
    }

    public WaterMarkBuilder setIs1To1(boolean z) {
        this.is1To1 = z;
        return this;
    }

    public WaterMarkBuilder setIsInstagram(boolean z) {
        this.isInstagram = z;
        return this;
    }

    public WaterMarkBuilder setIsRichEndMode(boolean z) {
        this.richEndMode = z;
        return this;
    }

    public WaterMarkBuilder setListener(WaterMarkListener waterMarkListener) {
        this.listener = waterMarkListener;
        return this;
    }

    public WaterMarkBuilder setOutPath(String str) {
        this.outPath = str;
        return this;
    }

    public WaterMarkBuilder setSaveType(int i) {
        this.saveType = i;
        return this;
    }

    public void setTTSVoiceCreatorDesc(String str) {
        this.ttsVoiceCreatorDesc = str;
    }

    public void setTtsCreatorIdList(List<String> list) {
        this.ttsCreatorIdList = list;
    }

    public WaterMarkBuilder setUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public void setVcCreatorIdList(List<String> list) {
        this.vcCreatorIdList = list;
    }

    public WaterMarkBuilder setWaterParams(InterfaceC2257101DWa interfaceC2257101DWa, Video video) {
        this.author = interfaceC2257101DWa;
        this.video = video;
        return this;
    }
}
