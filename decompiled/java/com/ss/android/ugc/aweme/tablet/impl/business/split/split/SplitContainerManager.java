package com.ss.android.ugc.aweme.tablet.impl.business.split.split;

import X.C13LP;
import X.C1616660sAi;
import X.C19EG;
import X.C21613419iG;
import X.InterfaceC752360TfG;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SplitContainerManager {
    public static final HashMap<String, WeakReference<InterfaceC752360TfG>> LIZ = new HashMap<>();
    public static final HashMap<Integer, List<String>> LIZIZ = new HashMap<>();
    public static final HashMap<Integer, String> LIZJ = new HashMap<>();
    public static final LifecycleEventObserver LIZLLL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager$lifeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if ((lifecycleOwner instanceof Activity) && event == Lifecycle.Event.ON_DESTROY) {
                int iHashCode = lifecycleOwner.hashCode();
                HashMap<Integer, List<String>> map = SplitContainerManager.LIZIZ;
                if (map.containsKey(Integer.valueOf(iHashCode))) {
                    List<String> list = map.get(Integer.valueOf(iHashCode));
                    if (list != null) {
                        Iterator<String> it2 = list.iterator();
                        while (it2.hasNext()) {
                            SplitContainerManager.LIZ.remove(it2.next());
                        }
                    }
                    SplitContainerManager.LIZIZ.remove(Integer.valueOf(iHashCode));
                }
            }
        }
    };

    public static InterfaceC752360TfG LIZIZ(Integer num) {
        WeakReference<InterfaceC752360TfG> weakReference;
        if (!C1616660sAi.LIZJ() || num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String str = LIZJ.get(Integer.valueOf(iIntValue));
        List<String> list = LIZIZ.get(Integer.valueOf(iIntValue));
        if (list == null || !C13LP.LJJJJ(str, list) || (weakReference = LIZ.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static InterfaceC752360TfG LIZ(String str, Fragment fragment, final View view, boolean z) {
        InterfaceC752360TfG c21613419iG;
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            fragment.getLifecycle().addObserver(LIZLLL);
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            HashMap<String, WeakReference<InterfaceC752360TfG>> map = LIZ;
            WeakReference<InterfaceC752360TfG> weakReference = map.get(str);
            if (weakReference == null || (c21613419iG = weakReference.get()) == null) {
                if (C1616660sAi.LIZJ()) {
                    c21613419iG = new C21613419iG(activity, childFragmentManager, view, z);
                    map.put(str, new WeakReference<>(c21613419iG));
                    int iHashCode = activity.hashCode();
                    HashMap<Integer, List<String>> map2 = LIZIZ;
                    List<String> arrayList = map2.get(Integer.valueOf(iHashCode));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(str);
                    map2.put(Integer.valueOf(iHashCode), arrayList);
                    LIZJ.put(Integer.valueOf(iHashCode), str);
                } else {
                    return new InterfaceC752360TfG(view) { // from class: X.0T43
                        public final View LL;

                        @Override // X.InterfaceC752360TfG
                        public final void LIZ(InterfaceC21613819iK interfaceC21613819iK) {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final boolean LIZIZ(String str2, boolean z2) {
                            return false;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final int LIZLLL() {
                            return 0;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LJFF(C0T44 c0t44) {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final boolean LJI() {
                            return false;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final boolean LJII() {
                            return false;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final InterfaceC739440SzW LJIIIZ(String str2) {
                            return null;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LJIIJ(int i, int i2) {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final boolean LJIIJJI() {
                            return false;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LJIIL(InterfaceC21613819iK interfaceC21613819iK) {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final void LJIILIIL(InterfaceC21613719iJ interfaceC21613719iJ) {
                        }

                        @Override // X.InterfaceC752360TfG
                        public final String LJIILJJIL() {
                            return "";
                        }

                        @Override // X.InterfaceC752360TfG
                        public final boolean LJIILL() {
                            return false;
                        }

                        @Override // X.InterfaceC752360TfG
                        public final View LJ() {
                            return this.LL;
                        }

                        {
                            this.LL = view;
                        }
                    };
                }
            }
            return c21613419iG;
        }
        return new InterfaceC752360TfG(view) { // from class: X.0T43
            public final View LL;

            @Override // X.InterfaceC752360TfG
            public final void LIZ(InterfaceC21613819iK interfaceC21613819iK) {
            }

            @Override // X.InterfaceC752360TfG
            public final boolean LIZIZ(String str2, boolean z2) {
                return false;
            }

            @Override // X.InterfaceC752360TfG
            public final void LIZJ() {
            }

            @Override // X.InterfaceC752360TfG
            public final int LIZLLL() {
                return 0;
            }

            @Override // X.InterfaceC752360TfG
            public final void LJFF(C0T44 c0t44) {
            }

            @Override // X.InterfaceC752360TfG
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC752360TfG
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC752360TfG
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC752360TfG
            public final InterfaceC739440SzW LJIIIZ(String str2) {
                return null;
            }

            @Override // X.InterfaceC752360TfG
            public final void LJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC752360TfG
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.InterfaceC752360TfG
            public final void LJIIL(InterfaceC21613819iK interfaceC21613819iK) {
            }

            @Override // X.InterfaceC752360TfG
            public final void LJIILIIL(InterfaceC21613719iJ interfaceC21613719iJ) {
            }

            @Override // X.InterfaceC752360TfG
            public final String LJIILJJIL() {
                return "";
            }

            @Override // X.InterfaceC752360TfG
            public final boolean LJIILL() {
                return false;
            }

            @Override // X.InterfaceC752360TfG
            public final View LJ() {
                return this.LL;
            }

            {
                this.LL = view;
            }
        };
    }
}
