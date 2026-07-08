package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C09CT;
import X.C18KR;
import android.util.LruCache;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public final class FcpPageStack implements C18KR, Serializable {
    public static final int $stable = 8;

    @C09CT("recordDeque")
    public final LinkedList<FcpPageNode> recordDeque = new LinkedList<>();
    public final transient LruCache<String, FcpPageNode> reportCache = new LruCache<>(10);

    @Override // X.C18KR
    public synchronized FcpPageNode peek() {
        if (getRecordDeque().isEmpty()) {
            return null;
        }
        return getRecordDeque().peekLast();
    }

    @Override // X.C18KR
    public synchronized FcpPageNode pop() {
        String trackerId;
        if (getRecordDeque().isEmpty()) {
            return null;
        }
        FcpPageNode fcpPageNodeRemoveLast = getRecordDeque().removeLast();
        FcpPageNode fcpPageNode = fcpPageNodeRemoveLast;
        FcpComponentTracker tracker = fcpPageNode.getTracker();
        if (tracker != null && (trackerId = tracker.getTrackerId()) != null && trackerId.length() != 0) {
            getReportCache().put(trackerId, fcpPageNode);
        }
        return fcpPageNodeRemoveLast;
    }

    @Override // X.C18KR
    public synchronized int size() {
        return getRecordDeque().size();
    }

    public LinkedList<FcpPageNode> getRecordDeque() {
        return this.recordDeque;
    }

    public LruCache<String, FcpPageNode> getReportCache() {
        return this.reportCache;
    }

    @Override // X.C18KR
    public synchronized void doLoop(Function1<? super FcpPageNode, Boolean> function1) {
        Iterator<FcpPageNode> itDescendingIterator = getRecordDeque().descendingIterator();
        if (itDescendingIterator == null) {
            return;
        }
        while (itDescendingIterator.hasNext() && function1.invoke(itDescendingIterator.next()).booleanValue()) {
        }
    }

    @Override // X.C18KR
    public synchronized void push(FcpPageNode fcpPageNode) {
        getRecordDeque().addLast(fcpPageNode);
    }
}
