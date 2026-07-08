package com.ss.android.ugc.aweme.feed.model.intervention;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class OperatorInfoStruct {
    public static final int $stable = 8;

    @C09CT("invalid_data_scene")
    public int invalidDataScene;

    @C09CT("op_pos")
    public int opPos = -1;
    public transient long opTimestamp;

    @C09CT("operator")
    public int operator;

    @C09CT("reason")
    public String reason;

    @C09CT("stage")
    public int stage;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Op(op=");
        sbLIZ.append(this.operator);
        sbLIZ.append(", r=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.stage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getInvalidDataScene() {
        return this.invalidDataScene;
    }

    public final int getOpPos() {
        return this.opPos;
    }

    public final long getOpTimestamp() {
        return this.opTimestamp;
    }

    public final int getOperator() {
        return this.operator;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getStage() {
        return this.stage;
    }

    public final void setInvalidDataScene(int i) {
        this.invalidDataScene = i;
    }

    public final void setOpPos(int i) {
        this.opPos = i;
    }

    public final void setOpTimestamp(long j) {
        this.opTimestamp = j;
    }

    public final void setOperator(int i) {
        this.operator = i;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setStage(int i) {
        this.stage = i;
    }
}
