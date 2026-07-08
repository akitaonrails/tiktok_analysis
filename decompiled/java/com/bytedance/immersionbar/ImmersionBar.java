package com.bytedance.immersionbar;

import X.AbstractC1563340qmi;
import X.C1323020kX6;
import X.C1565730qqZ;
import X.C199Y;
import X.C19EG;
import X.C21504419Du;
import X.C21504519Dv;
import X.C21586319dt;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C2451209j4;
import X.C680860QnE;
import X.C786410Ut5;
import X.EnumC21504619Dw;
import X.EnumC682280QpW;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class ImmersionBar {
    public static final Map<String, ImmersionBar> LJIILIIL = new HashMap();
    public final C19EG LIZ;
    public Window LIZIZ;
    public ViewGroup LIZJ;
    public ViewGroup LIZLLL;
    public ImmersionBar LJ;
    public C21504419Du LJFF;
    public C680860QnE LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final boolean LJIIL;

    public final void LIZJ() {
        if (this.LJIIIZ) {
            if (this.LJ == null) {
                this.LJ = LJIILJJIL(this.LIZ);
            }
            ImmersionBar immersionBar = this.LJ;
            if (immersionBar.LJIIJJI) {
                return;
            }
            immersionBar.LJ();
        }
    }

    public final void LJ() {
        int i;
        ViewGroup viewGroup;
        C21504419Du c21504419Du = this.LJFF;
        if (c21504419Du.LLJ) {
            int i2 = c21504419Du.LL;
            LJIIIZ(c21504419Du.LLJIJIL, i2 != 0 && i2 > -4539718);
        }
        C21504419Du c21504419Du2 = this.LJFF;
        if (c21504419Du2.LLJI) {
            int i3 = c21504419Du2.LLILLJJLI;
            LJI(c21504419Du2.LLJILJIL, i3 != 0 && i3 > -4539718);
        }
        int i4 = C2451209j4.LIZ;
        if (i4 >= 19) {
            this.LJI = new C680860QnE(this.LIZ);
            if (this.LJIIIIZZ) {
                ImmersionBar immersionBar = (ImmersionBar) ((HashMap) LJIILIIL).get(this.LIZ.toString());
                if (immersionBar != null) {
                    immersionBar.LJFF = this.LJFF;
                }
            }
            if (i4 < 21 || C2451209j4.LIZIZ()) {
                this.LIZIZ.addFlags(67108864);
                View viewFindViewById = this.LIZJ.findViewById(R.id.khw);
                if (viewFindViewById == null) {
                    viewFindViewById = new View(this.LIZ);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.LJI.LIZ);
                    layoutParams.gravity = 48;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    viewFindViewById.setId(R.id.khw);
                    this.LIZJ.addView(viewFindViewById);
                }
                C21504419Du c21504419Du3 = this.LJFF;
                if (c21504419Du3.LLJILJILJ) {
                    viewFindViewById.setBackgroundColor(C2441009hQ.LJI(c21504419Du3.LLILLL, c21504419Du3.LL, c21504419Du3.LLJILLL));
                } else {
                    viewFindViewById.setBackgroundColor(C2441009hQ.LJI(c21504419Du3.LLILLL, c21504419Du3.LL, 0));
                }
                this.LIZIZ.clearFlags(134217728);
                i = 256;
            } else {
                if (i4 >= 28 && !this.LJIIJ) {
                    WindowManager.LayoutParams attributes = this.LIZIZ.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    this.LIZIZ.setAttributes(attributes);
                    this.LJIIJ = true;
                }
                C21504419Du c21504419Du4 = this.LJFF;
                i = (c21504419Du4.LLILZIL && c21504419Du4.LLJJI) ? 1792 : 1280;
                this.LIZIZ.clearFlags(67108864);
                this.LIZIZ.clearFlags(134217728);
                this.LIZIZ.addFlags(Integer.MIN_VALUE);
                C21504419Du c21504419Du5 = this.LJFF;
                if (c21504419Du5.LLJILJILJ) {
                    this.LIZIZ.setStatusBarColor(C2441009hQ.LJI(c21504419Du5.LLILLL, c21504419Du5.LL, c21504419Du5.LLJILLL));
                } else {
                    this.LIZIZ.setStatusBarColor(C2441009hQ.LJI(c21504419Du5.LLILLL, c21504419Du5.LL, 0));
                }
                C21504419Du c21504419Du6 = this.LJFF;
                if (c21504419Du6.LLJJI && i4 >= 26) {
                    this.LIZIZ.setNavigationBarColor(C2441009hQ.LJI(c21504419Du6.LLILZ, c21504419Du6.LLILLJJLI, c21504419Du6.LLJJ));
                } else if (i4 >= 23) {
                }
                if (this.LJFF.LLIZ) {
                    i |= 8192;
                }
                if (i4 >= 26 && this.LJFF.LLIZLLLIL) {
                    i |= 16;
                }
            }
            int i5 = C21504519Dv.LIZ[this.LJFF.LLILZLL.ordinal()];
            if (i5 == 1) {
                i |= 518;
            } else if (i5 == 2) {
                i |= 1028;
            } else if (i5 == 3) {
                i |= 514;
            }
            int i6 = i | SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            if (!LIZIZ(this.LIZJ.findViewById(android.R.id.content)) && (viewGroup = this.LIZLLL) != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            this.LIZJ.setSystemUiVisibility(i6);
        }
        if (C2451209j4.LIZLLL()) {
            LJIIIIZZ(this.LIZIZ, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.LJFF.LLIZ);
            C21504419Du c21504419Du7 = this.LJFF;
            if (c21504419Du7.LLJJI) {
                LJIIIIZZ(this.LIZIZ, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", c21504419Du7.LLIZLLLIL);
            }
        }
        if (C2451209j4.LIZJ()) {
            this.LJFF.getClass();
            C1323020kX6.LIZ(this.LIZ, this.LJFF.LLIZ, true);
        }
        this.LJIIJJI = true;
    }

    public final void LJIIJJI() {
        C21504419Du c21504419Du = this.LJFF;
        c21504419Du.LLILLJJLI = 0;
        c21504419Du.LLILZIL = true;
    }

    public final void LJIIL() {
        this.LJFF.LL = 0;
    }

    public static boolean LIZIZ(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof C21586319dt) && LIZIZ(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ImmersionBar LJIILJJIL(C19EG c19eg) {
        String string = c19eg.toString();
        Map<String, ImmersionBar> map = LJIILIIL;
        ImmersionBar immersionBar = (ImmersionBar) ((HashMap) map).get(string);
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(c19eg, string);
            ((HashMap) map).put(string, immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        Context context;
        Integer numLIZ;
        if (lifecycleOwner instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.immersionbar.ImmersionBar.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            handleDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public void handleDestroy() {
                        ImmersionBar immersionBar = ImmersionBar.this;
                        immersionBar.getClass();
                        Iterator it2 = ((HashMap) ImmersionBar.LJIILIIL).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (((String) entry.getKey()).contains(immersionBar.LJII) || ((String) entry.getKey()).equals(immersionBar.LJII)) {
                                it2.remove();
                            }
                        }
                        immersionBar.LJIIJJI = false;
                    }
                });
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.immersionbar.ImmersionBar.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handleDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void handleDestroy() {
                ImmersionBar immersionBar = ImmersionBar.this;
                immersionBar.getClass();
                Iterator it2 = ((HashMap) ImmersionBar.LJIILIIL).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (((String) entry.getKey()).contains(immersionBar.LJII) || ((String) entry.getKey()).equals(immersionBar.LJII)) {
                        it2.remove();
                    }
                }
                immersionBar.LJIIJJI = false;
            }
        });
    }

    public final void LIZLLL(EnumC21504619Dw enumC21504619Dw) {
        this.LJFF.LLILZLL = enumC21504619Dw;
        if (C2451209j4.LIZ == 19 || C2451209j4.LIZIZ()) {
            EnumC21504619Dw enumC21504619Dw2 = this.LJFF.LLILZLL;
            EnumC21504619Dw enumC21504619Dw3 = EnumC21504619Dw.FLAG_HIDE_NAVIGATION_BAR;
        }
    }

    public final void LJII(boolean z) {
        LJI(0.2f, z);
    }

    public final void LJIIJ(boolean z) {
        LJIIIZ(0.2f, z);
    }

    public ImmersionBar(C19EG c19eg, String str) {
        this.LJIIIZ = true;
        new HashMap();
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LIZ = c19eg;
        LJFF(c19eg.getWindow(), str);
        LIZ(c19eg);
    }

    public static ImmersionBar LJIILIIL(Fragment fragment, boolean z) {
        if (fragment.getActivity() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fragment.getActivity().toString());
            sbLIZ.append(fragment.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            HashMap map = (HashMap) LJIILIIL;
            ImmersionBar immersionBar = (ImmersionBar) map.get(strLIZIZ);
            if (immersionBar == null) {
                ImmersionBar immersionBar2 = new ImmersionBar(fragment, strLIZIZ, z);
                map.put(strLIZIZ, immersionBar2);
                return immersionBar2;
            }
            return immersionBar;
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public final void LJFF(Window window, String str) {
        boolean z;
        this.LIZIZ = window;
        this.LJII = str;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.LIZJ = viewGroup;
        this.LIZLLL = (ViewGroup) viewGroup.findViewById(android.R.id.content);
        if (this.LJIIL) {
            window = this.LIZ.getWindow();
        }
        this.LJFF = new C21504419Du();
        int i = C2451209j4.LIZ;
        if (i >= 21) {
            this.LJFF.LLILLJJLI = window.getNavigationBarColor();
            this.LJFF.LL = window.getStatusBarColor();
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = true;
        if (i >= 23) {
            if ((systemUiVisibility & 8192) != 0) {
                z = true;
            } else {
                z = false;
            }
            LJIIJ(z);
            if (i >= 26) {
                if ((systemUiVisibility & 16) == 0) {
                    z2 = false;
                }
                LJII(z2);
            }
        }
    }

    public final void LJI(float f, boolean z) {
        this.LJFF.LLIZLLLIL = z;
        if (z && !C2451209j4.LIZLLL() && C2451209j4.LIZ < 26) {
            this.LJFF.LLILZ = f;
        } else {
            this.LJFF.LLILZ = 0.0f;
        }
    }

    public final void LJIIIZ(float f, boolean z) {
        this.LJFF.LLIZ = z;
        if (z && !C2451209j4.LIZLLL() && !C2451209j4.LIZJ() && C2451209j4.LIZ < 23) {
            this.LJFF.LLILLL = f;
            return;
        }
        C21504419Du c21504419Du = this.LJFF;
        c21504419Du.getClass();
        c21504419Du.LLILLL = 0.0f;
    }

    public ImmersionBar(DialogFragment dialogFragment, String str, boolean z) {
        this.LJIIIZ = true;
        new HashMap();
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LIZ = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        this.LJIIL = z;
        if (dialog != null) {
            LIZJ();
            LJFF(dialog.getWindow(), str);
            LIZ(dialogFragment);
            return;
        }
        throw new NullPointerException("dialog in DialogFragment cannot be null");
    }

    public static void LJIIIIZZ(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public ImmersionBar(Fragment fragment, String str, boolean z) {
        this.LJIIIZ = true;
        new HashMap();
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        C19EG activity = fragment.getActivity();
        this.LIZ = activity;
        this.LJIIIIZZ = true;
        this.LJIIIZ = z;
        LIZJ();
        LJFF(activity.getWindow(), str);
        LIZ(fragment);
    }

    public ImmersionBar(C19EG c19eg, Dialog dialog, String str) {
        this.LJIIIZ = true;
        new HashMap();
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LIZ = c19eg;
        LIZJ();
        LJFF(dialog.getWindow(), str);
        LIZ(c19eg);
    }

    public ImmersionBar(C19EG c19eg, Window window, String str, boolean z) {
        this.LJIIIZ = true;
        new HashMap();
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LIZ = c19eg;
        this.LJIIL = z;
        LIZJ();
        LJFF(window, str);
        LIZ(c19eg);
    }
}
