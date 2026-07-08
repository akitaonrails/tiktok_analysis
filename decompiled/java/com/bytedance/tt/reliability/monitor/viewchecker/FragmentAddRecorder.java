package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C2188811AlT;
import X.C786410Ut5;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentAddRecorder {
    public static final ArrayBlockingQueue<RecordEntry> ring = new ArrayBlockingQueue<>(5);

    public static class RecordEntry {
        public final int containerId;
        public final String fragmentClass;
        public final String hostActivity;
        public final List<String> stack;
        public final String tag;
        public final long threadId;
        public final String threadName;
        public final long timestamp;

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.timestamp), this.fragmentClass, this.tag, Integer.valueOf(this.containerId), this.hostActivity, this.threadName, Long.valueOf(this.threadId), this.stack);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nFragmentAddRecorder(timestamp=");
            sbLIZ.append(this.timestamp);
            sbLIZ.append(", fragmentClass='");
            sbLIZ.append(this.fragmentClass);
            sbLIZ.append('\'');
            sbLIZ.append(", tag=");
            sbLIZ.append(this.tag);
            sbLIZ.append(", containerId=");
            sbLIZ.append(this.containerId);
            sbLIZ.append(", hostActivity=");
            sbLIZ.append(this.hostActivity);
            sbLIZ.append(", threadName='");
            sbLIZ.append(this.threadName);
            sbLIZ.append('\'');
            sbLIZ.append(", threadId=");
            sbLIZ.append(this.threadId);
            sbLIZ.append(", stack=");
            sbLIZ.append(this.stack);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public int getContainerId() {
            return this.containerId;
        }

        public String getFragmentClass() {
            return this.fragmentClass;
        }

        public String getHostActivity() {
            return this.hostActivity;
        }

        public List<String> getStack() {
            return this.stack;
        }

        public String getTag() {
            return this.tag;
        }

        public long getThreadId() {
            return this.threadId;
        }

        public String getThreadName() {
            return this.threadName;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RecordEntry recordEntry = (RecordEntry) obj;
            if (this.timestamp == recordEntry.timestamp && this.containerId == recordEntry.containerId && this.threadId == recordEntry.threadId && this.fragmentClass.equals(recordEntry.fragmentClass) && Objects.equals(this.tag, recordEntry.tag) && Objects.equals(this.hostActivity, recordEntry.hostActivity) && this.threadName.equals(recordEntry.threadName) && this.stack.equals(recordEntry.stack)) {
                return true;
            }
            return false;
        }

        public RecordEntry(long j, String str, String str2, int i, String str3, String str4, long j2, List<String> list) {
            this.timestamp = j;
            this.fragmentClass = str;
            this.tag = str2;
            this.containerId = i;
            this.hostActivity = str3;
            this.threadName = str4;
            this.threadId = j2;
            this.stack = list;
        }
    }

    public static synchronized List<RecordEntry> snapshot() {
        return snapshot(5);
    }

    public static synchronized List<RecordEntry> snapshot(int i) {
        ArrayList arrayList;
        int size;
        arrayList = new ArrayList(ring);
        size = arrayList.size();
        return new ArrayList(arrayList.subList(Math.max(0, size - i), size));
    }

    public static synchronized void record(Fragment fragment, String str, int i, String str2) {
        record(fragment, str, i, str2, 24);
    }

    public static synchronized void record(Fragment fragment, String str, int i, String str2, int i2) {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        for (int i3 = 0; i3 < stackTrace.length && i3 < i2; i3++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stackTrace[i3].toString());
            sbLIZ.append("\n");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        RecordEntry recordEntry = new RecordEntry(System.currentTimeMillis(), fragment.getClass().getName(), str, i, str2, C786410Ut5.u3().getName(), C786410Ut5.u3().getId(), arrayList);
        ArrayBlockingQueue<RecordEntry> arrayBlockingQueue = ring;
        if (arrayBlockingQueue.remainingCapacity() == 0) {
            arrayBlockingQueue.poll();
        }
        arrayBlockingQueue.offer(recordEntry);
    }
}
