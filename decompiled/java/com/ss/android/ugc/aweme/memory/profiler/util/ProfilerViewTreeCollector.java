package com.ss.android.ugc.aweme.memory.profiler.util;

import X.AbstractC2098408Jy;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C2095108Ir;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.inspector.WindowInspector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.lynx.tasm.LynxView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfilerViewTreeCollector {
    public static final ProfilerViewTreeCollector INSTANCE = new ProfilerViewTreeCollector();

    public static final class NodeCounter {
        public int value;
    }

    private final String visibilityName(int i) {
        return i != 0 ? i != 4 ? i == 8 ? "GONE" : "VISIBLE" : "INVISIBLE" : "VISIBLE";
    }

    private final List<String> readRootViewNames() {
        try {
            Object objInvoke = Class.forName("android.view.WindowManagerGlobal").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return C13BV.INSTANCE;
            }
            Object objInvoke2 = objInvoke.getClass().getMethod("getViewRootNames", new Class[0]).invoke(objInvoke, new Object[0]);
            Object[] objArr = objInvoke2 instanceof Object[] ? (Object[]) objInvoke2 : null;
            if (objArr == null) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArr) {
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    private final List<View> readRootViews() {
        try {
            return Build.VERSION.SDK_INT >= 29 ? WindowInspector.getGlobalWindowViews() : readRootViewsViaWmgReflection();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return readRootViewsViaWmgReflection();
        }
    }

    private final List<View> readRootViewsViaWmgReflection() {
        try {
            Object objInvoke = Class.forName("android.view.WindowManagerGlobal").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return C13BV.INSTANCE;
            }
            Object objInvoke2 = objInvoke.getClass().getMethod("getRootViews", new Class[0]).invoke(objInvoke, new Object[0]);
            List<View> list = objInvoke2 instanceof List ? (List) objInvoke2 : null;
            return list == null ? C13BV.INSTANCE : list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    public final h collect() {
        h hVar = new h();
        List<View> rootViews = readRootViews();
        List<String> rootViewNames = readRootViewNames();
        if (rootViews.isEmpty()) {
            return hVar;
        }
        int i = 0;
        for (View view : rootViews) {
            int i2 = i + 1;
            try {
                n nVar = new n();
                String simpleName = (String) C13LP.LJJJLZIJ(i, rootViewNames);
                if (simpleName == null) {
                    simpleName = view.getClass().getSimpleName();
                }
                nVar.LJJIIJ("windowName", simpleName);
                nVar.LJJIIJ("rootClass", view.getClass().getName());
                ProfilerViewTreeCollector profilerViewTreeCollector = INSTANCE;
                nVar.LJJIFFI("rootBounds", profilerViewTreeCollector.boundsArray(view));
                NodeCounter nodeCounter = new NodeCounter();
                nVar.LJJIFFI("tree", profilerViewTreeCollector.serializeNode(view, 0, nodeCounter));
                nVar.LJJIII(Integer.valueOf(nodeCounter.value), "totalNodes");
                Activity activityFindActivity = profilerViewTreeCollector.findActivity(view);
                if (activityFindActivity != null) {
                    nVar.LJJIIJ("attachedActivity", activityFindActivity.getClass().getName());
                    nVar.LJJIIJ("attachedActivityObjId", C2095108Ir.LIZ(activityFindActivity));
                }
                hVar.LJJIFFI(nVar);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            i = i2;
        }
        return hVar;
    }

    private final h boundsArray(View view) {
        int[] iArr = new int[2];
        try {
            view.getLocationOnScreen(iArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        h hVar = new h();
        hVar.LJJII(Integer.valueOf(iArr[0]));
        hVar.LJJII(Integer.valueOf(iArr[1]));
        hVar.LJJII(Integer.valueOf(iArr[0] + view.getWidth()));
        hVar.LJJII(Integer.valueOf(iArr[1] + view.getHeight()));
        return hVar;
    }

    private final Activity findActivity(View view) {
        Context context = view.getContext();
        for (int i = 0; (context instanceof ContextWrapper) && i < 16; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private final List<View> getChildren(ViewGroup viewGroup) {
        View childAt;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
        while (it2.hasNext()) {
            try {
                childAt = viewGroup.getChildAt(((AbstractC2098408Jy) it2).nextInt());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                childAt = null;
            }
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private final String readResourceEntryName(View view) {
        int id = view.getId();
        String resourceEntryName = null;
        if (id != -1 && id != 0) {
            try {
                resourceEntryName = view.getResources().getResourceEntryName(id);
                return resourceEntryName;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return resourceEntryName;
    }

    private final n serializeNode(View view, int i, NodeCounter nodeCounter) {
        nodeCounter.value++;
        n nVar = new n();
        nVar.LJJIIJ("className", view.getClass().getName());
        nVar.LJJIIJ("resourceId", readResourceEntryName(view));
        nVar.LJJIFFI("bounds", boundsArray(view));
        nVar.LJJIIJ("visibility", visibilityName(view.getVisibility()));
        if (view instanceof LynxView) {
            nVar.LJJIIJ("objId", C2095108Ir.LIZ(view));
        }
        h hVar = new h();
        if ((view instanceof ViewGroup) && i < 200) {
            Iterator<View> it2 = getChildren((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                hVar.LJJIFFI(serializeNode(it2.next(), i + 1, nodeCounter));
            }
        }
        nVar.LJJIFFI("children", hVar);
        return nVar;
    }
}
