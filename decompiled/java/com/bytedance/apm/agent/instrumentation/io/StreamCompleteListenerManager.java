package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class StreamCompleteListenerManager {
    public boolean streamComplete;
    public ArrayList<StreamCompleteListener> streamCompleteListeners = new ArrayList<>();

    private boolean checkComplete() {
        boolean zIsComplete;
        synchronized (this) {
            try {
                zIsComplete = isComplete();
                if (!zIsComplete) {
                    this.streamComplete = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zIsComplete;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this) {
            try {
                z = this.streamComplete;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    private List<StreamCompleteListener> getStreamCompleteListeners() {
        ArrayList arrayList;
        synchronized (this.streamCompleteListeners) {
            try {
                arrayList = new ArrayList(this.streamCompleteListeners);
                this.streamCompleteListeners.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            try {
                this.streamCompleteListeners.add(streamCompleteListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void notifyStreamComplete(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            Iterator<StreamCompleteListener> it2 = getStreamCompleteListeners().iterator();
            while (it2.hasNext()) {
                it2.next().streamComplete(streamCompleteEvent);
            }
        }
    }

    public void notifyStreamError(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            Iterator<StreamCompleteListener> it2 = getStreamCompleteListeners().iterator();
            while (it2.hasNext()) {
                it2.next().streamError(streamCompleteEvent);
            }
        }
    }

    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            try {
                this.streamCompleteListeners.remove(streamCompleteListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
