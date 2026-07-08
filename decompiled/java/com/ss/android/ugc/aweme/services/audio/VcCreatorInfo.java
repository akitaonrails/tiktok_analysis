package com.ss.android.ugc.aweme.services.audio;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class VcCreatorInfo {
    public boolean hasVcCreatorVoice;
    public List<String> vcCreatorIdsList;
    public List<String> vcCreatorUserNameList;

    public VcCreatorInfo() {
        this(false, new ArrayList(), new ArrayList());
    }

    public final void setHasVcCreatorVoice(boolean z) {
        this.hasVcCreatorVoice = z;
    }

    public final void setVcCreatorIdsList(List<String> list) {
        this.vcCreatorIdsList = list;
    }

    public final void setVcCreatorUserNameList(List<String> list) {
        this.vcCreatorUserNameList = list;
    }

    public VcCreatorInfo(boolean z, List<String> list, List<String> list2) {
        this.hasVcCreatorVoice = z;
        this.vcCreatorIdsList = list;
        this.vcCreatorUserNameList = list2;
    }
}
