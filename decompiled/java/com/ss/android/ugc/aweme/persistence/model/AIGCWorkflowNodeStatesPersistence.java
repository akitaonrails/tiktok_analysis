package com.ss.android.ugc.aweme.persistence.model;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowNodeStatesPersistence {

    @C09CT("custom_context")
    public final String customContext;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("map_key")
    public String mapKey;

    @C09CT("progress")
    public final Integer progress;

    @C09CT("remain_time")
    public final Long remainTime;

    @C09CT("result")
    public final String result;

    @C09CT("state")
    public final State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        @C09CT("cancelled")
        public static final State CANCELLED;

        @C09CT("default")
        public static final State DEFAULT;

        @C09CT("failed")
        public static final State FAILED;
        public static final /* synthetic */ State[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("paused")
        public static final State PAUSED;

        @C09CT("running")
        public static final State RUNNING;

        @C09CT("skip_failed")
        public static final State SKIP_FAILED;

        @C09CT("success")
        public static final State SUCCESS;

        public static InterfaceC2044707zh<State> getEntries() {
            return LLILLJJLI;
        }

        static {
            State state = new State(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
            DEFAULT = state;
            State state2 = new State("RUNNING", 1);
            RUNNING = state2;
            State state3 = new State("PAUSED", 2);
            PAUSED = state3;
            State state4 = new State("FAILED", 3);
            FAILED = state4;
            State state5 = new State("SKIP_FAILED", 4);
            SKIP_FAILED = state5;
            State state6 = new State("SUCCESS", 5);
            SUCCESS = state6;
            State state7 = new State("CANCELLED", 6);
            CANCELLED = state7;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
            LL = stateArr;
            LLILLJJLI = new C2254308sP(stateArr);
        }

        public static State[] values() {
            return (State[]) LL.clone();
        }

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }

        public State(String str, int i) {
        }
    }

    public AIGCWorkflowNodeStatesPersistence() {
        this(State.DEFAULT, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowNodeStatesPersistence)) {
            return false;
        }
        AIGCWorkflowNodeStatesPersistence aIGCWorkflowNodeStatesPersistence = (AIGCWorkflowNodeStatesPersistence) obj;
        return this.state == aIGCWorkflowNodeStatesPersistence.state && Intrinsics.LJFF(this.mapKey, aIGCWorkflowNodeStatesPersistence.mapKey) && Intrinsics.LJFF(this.progress, aIGCWorkflowNodeStatesPersistence.progress) && Intrinsics.LJFF(this.errorCode, aIGCWorkflowNodeStatesPersistence.errorCode) && Intrinsics.LJFF(this.errorMessage, aIGCWorkflowNodeStatesPersistence.errorMessage) && Intrinsics.LJFF(this.remainTime, aIGCWorkflowNodeStatesPersistence.remainTime) && Intrinsics.LJFF(this.customContext, aIGCWorkflowNodeStatesPersistence.customContext) && Intrinsics.LJFF(this.result, aIGCWorkflowNodeStatesPersistence.result);
    }

    public final int hashCode() {
        State state = this.state;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        String str = this.mapKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.progress;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.remainTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.customContext;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.result;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowNodeStatesPersistence(state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", mapKey=");
        sbLIZ.append(this.mapKey);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.remainTime);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.customContext);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowNodeStatesPersistence(State state, String str, Integer num, Integer num2, String str2, Long l, String str3, String str4) {
        this.state = state;
        this.mapKey = str;
        this.progress = num;
        this.errorCode = num2;
        this.errorMessage = str2;
        this.remainTime = l;
        this.customContext = str3;
        this.result = str4;
    }
}
