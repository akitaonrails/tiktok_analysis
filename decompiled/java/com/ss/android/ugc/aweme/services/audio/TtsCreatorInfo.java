package com.ss.android.ugc.aweme.services.audio;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class TtsCreatorInfo {
    public boolean hasTtsCreatorVoice;
    public List<String> ttsCreatorIdsList;
    public List<String> ttsCreatorUserNameList;

    public TtsCreatorInfo() {
        this(false, new ArrayList(), new ArrayList());
    }

    public final void setHasTtsCreatorVoice(boolean z) {
        this.hasTtsCreatorVoice = z;
    }

    public final void setTtsCreatorIdsList(List<String> list) {
        this.ttsCreatorIdsList = list;
    }

    public final void setTtsCreatorUserNameList(List<String> list) {
        this.ttsCreatorUserNameList = list;
    }

    public TtsCreatorInfo(boolean z, List<String> list, List<String> list2) {
        this.hasTtsCreatorVoice = z;
        this.ttsCreatorIdsList = list;
        this.ttsCreatorUserNameList = list2;
    }
}
