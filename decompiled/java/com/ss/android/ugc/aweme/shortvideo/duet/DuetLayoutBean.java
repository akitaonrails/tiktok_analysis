package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DuetLayoutBean {

    @C09CT("change_direction_mode")
    public final int changeDirectionMode;

    @C09CT("direction_status")
    public final List<String> directionStatus;

    @C09CT("name")
    public final String name;

    @C09CT("safety_status")
    public final List<String> safetyStatus;

    public DuetLayoutBean(String str, int i, List<String> list, List<String> list2) {
        this.name = str;
        this.changeDirectionMode = i;
        this.directionStatus = list;
        this.safetyStatus = list2;
    }
}
