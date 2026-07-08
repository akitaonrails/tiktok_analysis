package com.ss.android.ugc.aweme.modeo.ttep.moderation;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PMFaceVideo {

    @C09CT("idle")
    public final List<String> idle;

    @C09CT("nodding")
    public final List<String> nodding;

    @C09CT("openmouth")
    public final List<String> openMouth;

    @C09CT("raiseeyebrows")
    public final List<String> raiseEyeBrows;

    @C09CT("turnhead")
    public final List<String> turnHead;

    public PMFaceVideo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.idle = list;
        this.nodding = list2;
        this.openMouth = list3;
        this.raiseEyeBrows = list4;
        this.turnHead = list5;
    }
}
