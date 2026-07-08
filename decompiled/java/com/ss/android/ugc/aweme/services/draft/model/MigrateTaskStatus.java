package com.ss.android.ugc.aweme.services.draft.model;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MigrateTaskStatus {

    public static final class Cancelled extends MigrateTaskStatus {
        public static final Cancelled INSTANCE = new Cancelled();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Idle extends MigrateTaskStatus {
        public static final Idle INSTANCE = new Idle();
    }

    public static final class Started extends MigrateTaskStatus {
        public static final Started INSTANCE = new Started();
    }

    public static final class Completed extends MigrateTaskStatus {
        public final MigrateResult result;

        public final Completed copy(MigrateResult migrateResult) {
            return new Completed(migrateResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.LJFF(this.result, ((Completed) obj).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Completed(result=");
            sbLIZ.append(this.result);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final MigrateResult getResult() {
            return this.result;
        }

        public Completed(MigrateResult migrateResult) {
            this.result = migrateResult;
        }
    }

    public static final class Progress extends MigrateTaskStatus {
        public final MigrateDraftStateInfo current;
        public final int currentIndex;
        public final String listFrom;
        public final int totalSize;

        public final Progress copy(MigrateDraftStateInfo migrateDraftStateInfo, int i, int i2, String str) {
            return new Progress(migrateDraftStateInfo, i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return Intrinsics.LJFF(this.current, progress.current) && this.currentIndex == progress.currentIndex && this.totalSize == progress.totalSize && Intrinsics.LJFF(this.listFrom, progress.listFrom);
        }

        public int hashCode() {
            return (((((this.current.hashCode() * 31) + this.currentIndex) * 31) + this.totalSize) * 31) + this.listFrom.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Progress(current=");
            sbLIZ.append(this.current);
            sbLIZ.append(", currentIndex=");
            sbLIZ.append(this.currentIndex);
            sbLIZ.append(", totalSize=");
            sbLIZ.append(this.totalSize);
            sbLIZ.append(", listFrom=");
            sbLIZ.append(this.listFrom);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final MigrateDraftStateInfo getCurrent() {
            return this.current;
        }

        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        public final String getListFrom() {
            return this.listFrom;
        }

        public final int getTotalSize() {
            return this.totalSize;
        }

        public Progress(MigrateDraftStateInfo migrateDraftStateInfo, int i, int i2, String str) {
            this.current = migrateDraftStateInfo;
            this.currentIndex = i;
            this.totalSize = i2;
            this.listFrom = str;
        }
    }
}
