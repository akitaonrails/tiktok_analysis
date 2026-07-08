package com.ss.android.ugc.aweme.services.audio;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AudioWatermarkInfo {
    public boolean isContainCreatorVoice;
    public List<String> ttsCreatorIdsList;
    public List<String> vcCreatorIdsList;
    public String watermarkText;

    public AudioWatermarkInfo() {
        this(false, "", new ArrayList(), new ArrayList());
    }

    public final boolean isContainCreatorVoice() {
        return this.isContainCreatorVoice;
    }

    public final void setContainCreatorVoice(boolean z) {
        this.isContainCreatorVoice = z;
    }

    public final void setTtsCreatorIdsList(List<String> list) {
        this.ttsCreatorIdsList = list;
    }

    public final void setVcCreatorIdsList(List<String> list) {
        this.vcCreatorIdsList = list;
    }

    public final void setWatermarkText(String str) {
        this.watermarkText = str;
    }

    public AudioWatermarkInfo(boolean z, String str, List<String> list, List<String> list2) {
        this.isContainCreatorVoice = z;
        this.watermarkText = str;
        this.ttsCreatorIdsList = list;
        this.vcCreatorIdsList = list2;
    }
}
