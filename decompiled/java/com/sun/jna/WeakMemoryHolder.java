package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class WeakMemoryHolder {
    public ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    public IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<>();

    public synchronized void clean() {
        ReferenceQueue<Object> referenceQueue = this.referenceQueue;
        while (true) {
            Reference<? extends Object> referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                this.backingMap.remove(referencePoll);
                referenceQueue = this.referenceQueue;
            }
        }
    }

    public synchronized void put(Object obj, Memory memory) {
        clean();
        this.backingMap.put(new WeakReference(obj, this.referenceQueue), memory);
    }
}
