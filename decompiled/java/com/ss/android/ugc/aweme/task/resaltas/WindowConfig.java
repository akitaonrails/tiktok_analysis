package com.ss.android.ugc.aweme.task.resaltas;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class WindowConfig {

    @C09CT("end_scene")
    public final String endScene;

    @C09CT("end_state")
    public final String endState;

    @C09CT("name")
    public final String name;

    @C09CT("start_scene")
    public final String startScene;

    @C09CT("start_state")
    public final String startState;

    @C09CT("timeout_ms")
    public final long timeoutMs;

    public WindowConfig() {
        this("", "", "", null, null, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowConfig)) {
            return false;
        }
        WindowConfig windowConfig = (WindowConfig) obj;
        return Intrinsics.LJFF(this.name, windowConfig.name) && Intrinsics.LJFF(this.startScene, windowConfig.startScene) && Intrinsics.LJFF(this.startState, windowConfig.startState) && Intrinsics.LJFF(this.endScene, windowConfig.endScene) && Intrinsics.LJFF(this.endState, windowConfig.endState) && this.timeoutMs == windowConfig.timeoutMs;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.startScene.hashCode()) * 31) + this.startState.hashCode()) * 31;
        String str = this.endScene;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endState;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.timeoutMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", startScene=");
        sbLIZ.append(this.startScene);
        sbLIZ.append(", startState=");
        sbLIZ.append(this.startState);
        sbLIZ.append(", endScene=");
        sbLIZ.append(this.endScene);
        sbLIZ.append(", endState=");
        sbLIZ.append(this.endState);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WindowConfig(String str, String str2, String str3, String str4, String str5, long j) {
        this.name = str;
        this.startScene = str2;
        this.startState = str3;
        this.endScene = str4;
        this.endState = str5;
        this.timeoutMs = j;
    }
}
