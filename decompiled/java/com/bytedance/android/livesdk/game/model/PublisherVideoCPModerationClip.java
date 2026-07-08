package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PublisherVideoCPModerationClip {

    @C09CT("end_sec")
    public int endSec;

    @C09CT("start_sec")
    public int startSec;

    @C09CT("common_requirement_list")
    public List<Integer> commonRequirementList = new ArrayList();

    @C09CT("cp_specific_requirement_list")
    public List<Integer> cpSpecificRequirementList = new ArrayList();

    @C09CT("other_advice")
    public String otherAdvice = "";
}
