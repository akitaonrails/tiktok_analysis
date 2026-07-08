package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PhaseProgressInfo {

    @C09CT("messages")
    public final List<String> messages;

    @C09CT("phase_name")
    public final String phaseName;

    @C09CT("progress")
    public final int progress;

    @C09CT("progress_steps")
    public final List<Integer> progressSteps;

    @C09CT("result")
    public final Object result;

    public PhaseProgressInfo() {
        this(null, 0, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhaseProgressInfo)) {
            return false;
        }
        PhaseProgressInfo phaseProgressInfo = (PhaseProgressInfo) obj;
        return Intrinsics.LJFF(this.phaseName, phaseProgressInfo.phaseName) && this.progress == phaseProgressInfo.progress && Intrinsics.LJFF(this.progressSteps, phaseProgressInfo.progressSteps) && Intrinsics.LJFF(this.result, phaseProgressInfo.result) && Intrinsics.LJFF(this.messages, phaseProgressInfo.messages);
    }

    public int hashCode() {
        int iHashCode = ((((this.phaseName.hashCode() * 31) + this.progress) * 31) + this.progressSteps.hashCode()) * 31;
        Object obj = this.result;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.messages.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhaseProgressInfo(phaseName=");
        sbLIZ.append(this.phaseName);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", progressSteps=");
        sbLIZ.append(this.progressSteps);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.messages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getResultString() {
        Object obj = this.result;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean isCompleted() {
        return this.progress >= 100;
    }

    public PhaseProgressInfo(String str, int i, List<Integer> list, Object obj, List<String> list2) {
        this.phaseName = str;
        this.progress = i;
        this.progressSteps = list;
        this.result = obj;
        this.messages = list2;
    }

    public PhaseProgressInfo(String str, int i, List list, Object obj, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? null : obj, (i2 & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
