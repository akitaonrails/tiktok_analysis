package com.ss.android.ugc.aweme.feed.model.im;

import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class AIGroupShotMediaModel {
    public int currentIndex;
    public final boolean isParticipant;
    public final List<AIGroupShotResultModel> results;
    public final String templateId;
    public final String templateResId;

    public final boolean isParticipant() {
        return this.isParticipant;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public AIGroupShotMediaModel(String str, String str2, List<AIGroupShotResultModel> list, boolean z, int i) {
        this.templateId = str;
        this.templateResId = str2;
        this.results = list;
        this.isParticipant = z;
        this.currentIndex = i;
    }
}
