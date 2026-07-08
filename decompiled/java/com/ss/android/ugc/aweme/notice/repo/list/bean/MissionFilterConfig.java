package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C623810OdP;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionFilterConfig {
    public static final C623810OdP Companion = new C623810OdP();

    @C09CT("options")
    public final List<MissionFilterOption> options;

    @C09CT("title")
    public final String title;

    @C09CT("val_type")
    public final String valType;

    public MissionFilterConfig() {
        this("", null, "");
    }

    public final MissionFilterConfig copy(String str, List<MissionFilterOption> list, String str2) {
        return new MissionFilterConfig(str, list, str2);
    }

    public MissionFilterConfig(String str, List<MissionFilterOption> list, String str2) {
        this.title = str;
        this.options = list;
        this.valType = str2;
    }
}
