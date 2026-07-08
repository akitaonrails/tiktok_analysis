package com.ss.android.ugc.aweme.im.common.view;

import X.C14K9;
import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TuxIgnoreRecyclerAndPagerSheetBehaviour extends TuxSheetBehavior<View> {
    public final Map<Integer, WeakReference<View>> LJJIJLIJ = new LinkedHashMap();
    public WeakReference<View> LJJIL;
    public boolean LJJIZ;

    public final View LJI(View view) {
        if (!C14K9.LJIILL(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewLJI = LJI(viewGroup.getChildAt(i));
                    if (viewLJI != null) {
                        return viewLJI;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public final void LJII(View view) {
        if (!(view instanceof RecyclerView) && !(view instanceof ViewPager)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LJII(viewGroup.getChildAt(i));
                }
                return;
            }
            return;
        }
        this.LJJIJLIJ.put(Integer.valueOf(view.getId()), new WeakReference<>(view));
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            Collection collectionValues = ((LinkedHashMap) this.LJJIJLIJ).values();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                Object obj = ((Reference) it2.next()).get();
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                View view2 = null;
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                View view3 = (View) next;
                WeakReference<View> weakReference = this.LJJIL;
                if (weakReference != null) {
                    view2 = weakReference.get();
                }
                if (!Intrinsics.LJFF(view3, view2) && c16g0.LJIIJ(x, y, view3)) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            this.LJJIZ = z;
        }
        if (this.LJJIZ) {
            zOnInterceptTouchEvent = false;
        } else {
            zOnInterceptTouchEvent = super.onInterceptTouchEvent(c16g0, view, motionEvent);
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.LJJIZ = false;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        LJII(c16g0);
        this.LJJIL = new WeakReference<>(LJI(view));
        super.onLayoutChild(c16g0, view, i);
        return true;
    }
}
