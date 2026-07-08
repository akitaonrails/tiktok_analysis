package com.ss.android.ugc.asve.editor;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class NLECommitStatisticsConfig {

    @C09CT("diff_duration_list")
    public final ArrayList<Long> diffDurationList;

    @C09CT("render_duration_list")
    public final ArrayList<Long> renderDurationList;

    @C09CT("version")
    public final int version;

    public NLECommitStatisticsConfig() {
        this(new ArrayList(), new ArrayList(), -1);
    }

    public NLECommitStatisticsConfig(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i) {
        this.diffDurationList = arrayList;
        this.renderDurationList = arrayList2;
        this.version = i;
    }
}
