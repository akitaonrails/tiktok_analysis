package com.ss.android.ugc.aweme.aikit.api.create;

import X.C0LU2;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CreateState {

    public static final class Canceled extends CreateState {
        public static final Canceled INSTANCE = new Canceled();
    }

    public static final class Duplicate extends CreateState {
        public static final Duplicate INSTANCE = new Duplicate();
    }

    public static final class NullState extends CreateState {
        public static final NullState INSTANCE = new NullState();
    }

    public static final class Failed extends CreateState {
        public final long duration;
        public final int errorCode;
        public final String errorMsg;
        public final String errorSource;
        public final String failReasonMsg;
        public final String step;

        public Failed() {
            this("", -1, "", null, "", -1L);
        }

        public final Failed copy(String str, int i, String str2, String str3, String str4, long j) {
            return new Failed(str, i, str2, str3, str4, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.LJFF(this.step, failed.step) && this.errorCode == failed.errorCode && Intrinsics.LJFF(this.errorMsg, failed.errorMsg) && Intrinsics.LJFF(this.errorSource, failed.errorSource) && Intrinsics.LJFF(this.failReasonMsg, failed.failReasonMsg) && this.duration == failed.duration;
        }

        public int hashCode() {
            int iHashCode = ((((this.step.hashCode() * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31;
            String str = this.errorSource;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.failReasonMsg.hashCode()) * 31) + C786410Ut5.Y2(this.duration);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed(step=");
            sbLIZ.append(this.step);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(this.errorCode);
            sbLIZ.append(", errorMsg=");
            sbLIZ.append(this.errorMsg);
            sbLIZ.append(", errorSource=");
            sbLIZ.append(this.errorSource);
            sbLIZ.append(", failReasonMsg=");
            sbLIZ.append(this.failReasonMsg);
            sbLIZ.append(", duration=");
            sbLIZ.append(this.duration);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final String getErrorSource() {
            return this.errorSource;
        }

        public final String getFailReasonMsg() {
            return this.failReasonMsg;
        }

        public final String getStep() {
            return this.step;
        }

        public Failed(String str, int i, String str2, String str3, String str4, long j) {
            this.step = str;
            this.errorCode = i;
            this.errorMsg = str2;
            this.errorSource = str3;
            this.failReasonMsg = str4;
            this.duration = j;
        }
    }

    public static final class Finished extends CreateState {
        public final long duration;
        public final List<String> results;

        public final Finished copy(long j, List<String> list) {
            return new Finished(j, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) obj;
            return this.duration == finished.duration && Intrinsics.LJFF(this.results, finished.results);
        }

        public int hashCode() {
            return (C786410Ut5.Y2(this.duration) * 31) + this.results.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Finished(duration=");
            sbLIZ.append(this.duration);
            sbLIZ.append(", results=");
            sbLIZ.append(this.results);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final List<String> getResults() {
            return this.results;
        }

        public Finished(long j, List<String> list) {
            this.duration = j;
            this.results = list;
        }
    }

    public static final class Running extends CreateState {
        public final int progress;
        public final String serverTaskId;
        public final C0LU2 step;

        public final Running copy(C0LU2 c0lu2, int i, String str) {
            return new Running(c0lu2, i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Running)) {
                return false;
            }
            Running running = (Running) obj;
            return this.step == running.step && this.progress == running.progress && Intrinsics.LJFF(this.serverTaskId, running.serverTaskId);
        }

        public int hashCode() {
            int iHashCode = ((this.step.hashCode() * 31) + this.progress) * 31;
            String str = this.serverTaskId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Running(step=");
            sbLIZ.append(this.step);
            sbLIZ.append(", progress=");
            sbLIZ.append(this.progress);
            sbLIZ.append(", serverTaskId=");
            sbLIZ.append(this.serverTaskId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getServerTaskId() {
            return this.serverTaskId;
        }

        public final C0LU2 getStep() {
            return this.step;
        }

        public Running(C0LU2 c0lu2, int i, String str) {
            this.step = c0lu2;
            this.progress = i;
            this.serverTaskId = str;
        }
    }
}
