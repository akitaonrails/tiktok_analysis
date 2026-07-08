package com.bytedance.poplayer.test;

import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C20656115sF;
import X.InterfaceC20658015sY;
import com.bytedance.poplayer.core.PopupManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class PopupTestController {
    public static final PopupTestController INSTANCE = new PopupTestController();
    public static TestingBlockPopupFilter testingFilter;

    public static final void blockAllPopups() {
        INSTANCE.ensureFilterInstalled().isBlocking().set(true);
    }

    private final TestingBlockPopupFilter ensureFilterInstalled() {
        TestingBlockPopupFilter testingBlockPopupFilter = testingFilter;
        if (testingBlockPopupFilter != null) {
            return testingBlockPopupFilter;
        }
        ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
        TestingBlockPopupFilter testingBlockPopupFilter2 = new TestingBlockPopupFilter(PopupManager.LJIIJJI);
        PopupManager.LJIIJJI = testingBlockPopupFilter2;
        testingFilter = testingBlockPopupFilter2;
        return testingBlockPopupFilter2;
    }

    public static final String getExemptKeys() {
        TestingBlockPopupFilter testingBlockPopupFilter = testingFilter;
        return testingBlockPopupFilter == null ? "" : C13LP.LJJLIIIJ(testingBlockPopupFilter.getExemptKeys(), ",", null, null, 0, null, null, 62);
    }

    public static final boolean isBlocking() {
        AtomicBoolean atomicBooleanIsBlocking;
        TestingBlockPopupFilter testingBlockPopupFilter = testingFilter;
        if (testingBlockPopupFilter == null || (atomicBooleanIsBlocking = testingBlockPopupFilter.isBlocking()) == null) {
            return false;
        }
        return atomicBooleanIsBlocking.get();
    }

    public static final void unblockAllPopups() {
        TestingBlockPopupFilter testingBlockPopupFilter = testingFilter;
        if (testingBlockPopupFilter != null) {
            testingBlockPopupFilter.isBlocking().set(false);
            testingBlockPopupFilter.getExemptKeys().clear();
        }
    }

    public static final void blockAllPopups(String str) {
        PopupTestController popupTestController = INSTANCE;
        TestingBlockPopupFilter testingBlockPopupFilterEnsureFilterInstalled = popupTestController.ensureFilterInstalled();
        List<String> exemptKeys = popupTestController.parseExemptKeys(str);
        testingBlockPopupFilterEnsureFilterInstalled.getExemptKeys().clear();
        testingBlockPopupFilterEnsureFilterInstalled.getExemptKeys().addAll(exemptKeys);
        testingBlockPopupFilterEnsureFilterInstalled.isBlocking().set(true);
    }

    private final List<String> parseExemptKeys(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return C13LP.LJJJJI(arrayList2);
        }
        return C13BV.INSTANCE;
    }

    public static final void setExemptKeys(String str) {
        PopupTestController popupTestController = INSTANCE;
        TestingBlockPopupFilter testingBlockPopupFilterEnsureFilterInstalled = popupTestController.ensureFilterInstalled();
        List<String> exemptKeys = popupTestController.parseExemptKeys(str);
        testingBlockPopupFilterEnsureFilterInstalled.getExemptKeys().clear();
        testingBlockPopupFilterEnsureFilterInstalled.getExemptKeys().addAll(exemptKeys);
    }
}
