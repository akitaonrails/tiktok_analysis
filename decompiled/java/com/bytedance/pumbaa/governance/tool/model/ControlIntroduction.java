package com.bytedance.pumbaa.governance.tool.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ControlIntroduction {

    @C09CT("background")
    public String background;

    @C09CT("owner")
    public String owner;

    @C09CT("principle")
    public String principle;

    @C09CT("roadmap")
    public String roadmap;

    @C09CT("solution")
    public String solution;

    public ControlIntroduction() {
        this("", "", "", "", "");
    }

    public ControlIntroduction(String str, String str2, String str3, String str4, String str5) {
        this.owner = str;
        this.background = str2;
        this.solution = str3;
        this.principle = str4;
        this.roadmap = str5;
    }
}
