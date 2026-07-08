package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class Step implements Serializable {

    @C09CT("agreement_content")
    public final String agreementContent;

    @C09CT("another_step")
    public final String another_step;
    public ArrayList<String> childSteps;

    @C09CT("parent_page")
    public final String parentStep;

    @C09CT("intermediate_process_page")
    public final ProcessItemList processItemList;

    @C09CT(alternate = {"skip_able"}, value = "skipable")
    public final Boolean skipable;

    @C09CT("starling_map")
    public final Map<String, String> starlingMap;

    @C09CT("step_attr")
    public final StepAttr stepAttr;

    @C09CT("step_info")
    public final String stepInfo;

    @C09CT("step_name")
    public final String stepName;

    @C09CT("page_url")
    public final String url;

    @C09CT("verify_info")
    public final String verifyInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Intrinsics.LJFF(this.stepName, step.stepName) && Intrinsics.LJFF(this.url, step.url) && Intrinsics.LJFF(this.parentStep, step.parentStep) && Intrinsics.LJFF(this.processItemList, step.processItemList) && Intrinsics.LJFF(this.starlingMap, step.starlingMap) && Intrinsics.LJFF(this.agreementContent, step.agreementContent) && Intrinsics.LJFF(this.another_step, step.another_step) && Intrinsics.LJFF(this.childSteps, step.childSteps) && Intrinsics.LJFF(this.verifyInfo, step.verifyInfo) && Intrinsics.LJFF(this.stepAttr, step.stepAttr) && Intrinsics.LJFF(this.stepInfo, step.stepInfo) && Intrinsics.LJFF(this.skipable, step.skipable);
    }

    public final void setChildSteps(ArrayList<String> arrayList) {
        this.childSteps = arrayList;
    }

    public Step(String str, String str2, String str3, ProcessItemList processItemList, Map<String, String> map, String str4, String str5, ArrayList<String> arrayList, String str6, StepAttr stepAttr, String str7, Boolean bool) {
        this.stepName = str;
        this.url = str2;
        this.parentStep = str3;
        this.processItemList = processItemList;
        this.starlingMap = map;
        this.agreementContent = str4;
        this.another_step = str5;
        this.childSteps = arrayList;
        this.verifyInfo = str6;
        this.stepAttr = stepAttr;
        this.stepInfo = str7;
        this.skipable = bool;
    }
}
