package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C0I7D;
import X.C14K9;
import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TakoIgnoreRecyclerAndPagerWithDraggableAreaBottomSheetBehaviour extends BottomSheetBehavior<View> {
    public final Map<Integer, WeakReference<View>> LIZ = new LinkedHashMap();
    public WeakReference<View> LIZIZ;
    public boolean LIZJ;

    public final View LIZ(View view) {
        if (!C14K9.LJIILL(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewLIZ = LIZ(viewGroup.getChildAt(i));
                    if (viewLIZ != null) {
                        return viewLIZ;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public final void LIZIZ(View view) {
        if (!(view instanceof RecyclerView) && !(view instanceof ViewPager) && !(view instanceof C0I7D)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LIZIZ(viewGroup.getChildAt(i));
                }
                return;
            }
            return;
        }
        this.LIZ.put(Integer.valueOf(view.getId()), new WeakReference<>(view));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent;
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            Collection collectionValues = ((LinkedHashMap) this.LIZ).values();
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
                WeakReference<View> weakReference = this.LIZIZ;
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
            this.LIZJ = z;
        }
        if (this.LIZJ) {
            zOnInterceptTouchEvent = false;
        } else {
            zOnInterceptTouchEvent = super.onInterceptTouchEvent(c16g0, view, motionEvent);
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.LIZJ = false;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        LIZIZ(c16g0);
        this.LIZIZ = new WeakReference<>(LIZ(view));
        return super.onLayoutChild(c16g0, view, i);
    }
}
