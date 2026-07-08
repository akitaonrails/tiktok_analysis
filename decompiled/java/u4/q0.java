package u4;

import X.C08IF;
import X.C14JH;
import X.C14JI;
import X.C14JJ;
import X.C14K9;
import X.C19WF;
import X.C1A6V;
import X.C20092413jW;
import X.C20094213jo;
import X.C20094313jp;
import X.C20095113jx;
import X.C20095413k0;
import X.C20095513k1;
import X.C20095613k2;
import X.C20095713k3;
import X.C20095813k4;
import X.C20096013k6;
import X.C20096313k9;
import X.C20096613kC;
import X.C20096713kD;
import X.C20097213kI;
import X.C20097313kJ;
import X.C20098313kT;
import X.C20098713kX;
import X.C20246014Ju;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC20092813ja;
import X.InterfaceC20096813kE;
import X.InterfaceC20096913kF;
import X.InterfaceC20097013kG;
import X.ViewTreeObserverOnGlobalLayoutListenerC1321670kUv;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class q0 {
    public static WeakHashMap<View, C19WF> LIZ;
    public static Method LIZIZ;
    public static Field LIZJ;
    public static boolean LIZLLL;
    public static final int[] LJ = {R.id.zh, R.id.zi, R.id.zt, R.id.a04, R.id.a07, R.id.a08, R.id.a09, R.id.a0_, R.id.a0a, R.id.a0b, R.id.zj, R.id.zk, R.id.zl, R.id.zm, R.id.zn, R.id.zo, R.id.zp, R.id.zq, R.id.zr, R.id.zs, R.id.zu, R.id.zv, R.id.zw, R.id.zx, R.id.zy, R.id.zz, R.id.a00, R.id.a01, R.id.a02, R.id.a03, R.id.a05, R.id.a06};
    public static final C20096713kD LJFF = new InterfaceC20096913kF() { // from class: X.13kD
        @Override // X.InterfaceC20096913kF
        public final C20098713kX LJFF(C20098713kX c20098713kX) {
            return c20098713kX;
        }
    };
    public static final ViewTreeObserverOnGlobalLayoutListenerC1321670kUv LJI = new ViewTreeObserverOnGlobalLayoutListenerC1321670kUv();

    public static C19WF LIZIZ(View view) {
        if (LIZ == null) {
            LIZ = new WeakHashMap<>();
        }
        C19WF c19wf = LIZ.get(view);
        if (c19wf == null) {
            C19WF c19wf2 = new C19WF(view);
            LIZ.put(view, c19wf2);
            return c19wf2;
        }
        return c19wf;
    }

    public static void LJ(View view) {
        C20094213jo c20094213joLJFF = LJFF(view);
        if (c20094213joLJFF == null) {
            c20094213joLJFF = new C20094213jo();
        }
        LJIJ(view, c20094213joLJFF);
    }

    public static C20094213jo LJFF(View view) {
        View.AccessibilityDelegate accessibilityDelegateLJI = LJI(view);
        if (accessibilityDelegateLJI == null) {
            return null;
        }
        if (accessibilityDelegateLJI instanceof C20094313jp) {
            return ((C20094313jp) accessibilityDelegateLJI).LIZ;
        }
        return new C20094213jo(accessibilityDelegateLJI);
    }

    public static View.AccessibilityDelegate LJI(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C20095113jx.LIZ(view);
        }
        if (!LIZLLL) {
            if (LIZJ == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    LIZJ = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZLLL = true;
                    return null;
                }
            }
            try {
                Object obj = LIZJ.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LIZLLL = true;
            }
        }
        return null;
    }

    public static CharSequence LJII(View view) {
        return new C20095713k3(CharSequence.class).LIZLLL(view);
    }

    public static List<C20092413jW> LJIIIIZZ(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.x0w);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.x0w, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] LJIIIZ(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C20098313kT.LIZ(view);
        }
        return (String[]) view.getTag(R.id.x20);
    }

    public static C1A6V LJIIJ(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C20096013k6.LIZJ(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return new C1A6V(window, view);
            }
        }
        return null;
    }

    public static void LJIJJLI(ViewGroup viewGroup) {
        if (LIZIZ == null) {
            try {
                LIZIZ = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZIZ.setAccessible(true);
        }
        try {
            LIZIZ.invoke(viewGroup, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (IllegalArgumentException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    public static C20246014Ju LIZJ(View view, C20246014Ju c20246014Ju) {
        WindowInsets windowInsetsLJIIJ = c20246014Ju.LJIIJ();
        if (windowInsetsLJIIJ != null) {
            WindowInsets windowInsetsLIZ = C20097313kJ.LIZ(view, windowInsetsLJIIJ);
            if (!windowInsetsLIZ.equals(windowInsetsLJIIJ)) {
                return C20246014Ju.LJIIJJI(view, windowInsetsLIZ);
            }
        }
        return c20246014Ju;
    }

    public static boolean LIZLLL(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C20096313k9 c20096313k9 = (C20096313k9) view.getTag(R.id.x2h);
        if (c20096313k9 == null) {
            c20096313k9 = new C20096313k9();
            view.setTag(R.id.x2h, c20096313k9);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = c20096313k9.LIZ;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = C20096313k9.LIZLLL;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (c20096313k9.LIZ == null) {
                            c20096313k9.LIZ = new WeakHashMap<>();
                        }
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ArrayList<WeakReference<View>> arrayList2 = C20096313k9.LIZLLL;
                            View view2 = arrayList2.get(size).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                c20096313k9.LIZ.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c20096313k9.LIZ.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        View viewLIZ = c20096313k9.LIZ(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewLIZ == null) {
                return false;
            }
            if (!KeyEvent.isModifierKey(keyCode)) {
                if (c20096313k9.LIZIZ == null) {
                    c20096313k9.LIZIZ = new SparseArray<>();
                }
                c20096313k9.LIZIZ.put(keyCode, new WeakReference<>(viewLIZ));
            }
        } else if (viewLIZ == null) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI(int i, View view) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) C786410Ut5.H2(view.getContext(), "accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (LJII(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                accessibilityEventObtain.setEventType(32);
                accessibilityEventObtain.setContentChangeTypes(i);
                accessibilityEventObtain.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain);
                accessibilityEventObtain.getText().add(LJII(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                return;
            }
            if (view.getParent() == null) {
                return;
            }
            try {
                view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                return;
            } catch (AbstractMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        accessibilityEventObtain2.setEventType(i2);
        accessibilityEventObtain2.setContentChangeTypes(i);
        if (z) {
            accessibilityEventObtain2.getText().add(LJII(view));
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        view.sendAccessibilityEventUnchecked(accessibilityEventObtain2);
    }

    public static C20246014Ju LJIIL(View view, C20246014Ju c20246014Ju) {
        WindowInsets windowInsetsLJIIJ = c20246014Ju.LJIIJ();
        if (windowInsetsLJIIJ != null) {
            WindowInsets windowInsetsLIZIZ = C20097313kJ.LIZIZ(view, windowInsetsLJIIJ);
            if (!windowInsetsLIZIZ.equals(windowInsetsLJIIJ)) {
                return C20246014Ju.LJIIJJI(view, windowInsetsLIZIZ);
            }
        }
        return c20246014Ju;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C20098713kX LJIILIIL(View view, C20098713kX c20098713kX) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C20098313kT.LIZIZ(view, c20098713kX);
        }
        InterfaceC20096813kE interfaceC20096813kE = (InterfaceC20096813kE) view.getTag(R.id.x1z);
        InterfaceC20096913kF interfaceC20096913kF = LJFF;
        if (interfaceC20096813kE != null) {
            C20098713kX c20098713kXLIZ = interfaceC20096813kE.LIZ(view, c20098713kX);
            if (c20098713kXLIZ == null) {
                return null;
            }
            if (view instanceof InterfaceC20096913kF) {
                interfaceC20096913kF = (InterfaceC20096913kF) view;
            }
            return interfaceC20096913kF.LJFF(c20098713kXLIZ);
        }
        if (view instanceof InterfaceC20096913kF) {
            interfaceC20096913kF = (InterfaceC20096913kF) view;
        }
        return interfaceC20096913kF.LJFF(c20098713kX);
    }

    public static void LJIILJJIL(int i, View view) {
        List<C20092413jW> listLJIIIIZZ = LJIIIIZZ(view);
        for (int i2 = 0; i2 < listLJIIIIZZ.size(); i2++) {
            if (((C20092413jW) ListProtector.get(listLJIIIIZZ, i2)).LIZ() == i) {
                ListProtector.remove(listLJIIIIZZ, i2);
                return;
            }
        }
    }

    public static View LJIILLIIL(int i, View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C20095813k4.LJI(view, i);
        }
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void LJIJ(View view, C20094213jo c20094213jo) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c20094213jo == null && (LJI(view) instanceof C20094313jp)) {
            c20094213jo = new C20094213jo();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c20094213jo == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = c20094213jo.mBridge;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void LJIJI(View view, boolean z) {
        new C20095513k1(Boolean.class).LJ(view, Boolean.valueOf(z));
    }

    public static void LJIJJ(View view, CharSequence charSequence) {
        boolean z;
        new C20095713k3(CharSequence.class).LJ(view, charSequence);
        if (charSequence != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1321670kUv viewTreeObserverOnGlobalLayoutListenerC1321670kUv = LJI;
            WeakHashMap<View, Boolean> weakHashMap = viewTreeObserverOnGlobalLayoutListenerC1321670kUv.LL;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1321670kUv);
            if (view.isAttachedToWindow()) {
                C786410Ut5.x3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1321670kUv);
                return;
            }
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1321670kUv viewTreeObserverOnGlobalLayoutListenerC1321670kUv2 = LJI;
        viewTreeObserverOnGlobalLayoutListenerC1321670kUv2.LL.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1321670kUv2);
        C786410Ut5.C3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1321670kUv2);
    }

    public static void LJJ(View view, C20097213kI c20097213kI) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c20097213kI != null) {
                pointerIcon = c20097213kI.LIZ;
            } else {
                pointerIcon = null;
            }
            C20096613kC.LIZLLL(view, pointerIcon);
        }
    }

    public static void LJJI(View view, boolean z) {
        new C20095413k0(Boolean.class).LJ(view, Boolean.valueOf(z));
    }

    public static void LJJIFFI(View view, CharSequence charSequence) {
        new C20095613k2(CharSequence.class).LJ(view, charSequence);
    }

    public static void LJJII(View view, final C14JJ c14jj) {
        WindowInsetsAnimation.Callback callback = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (c14jj != null) {
                callback = new WindowInsetsAnimation.Callback(c14jj) { // from class: X.14JK
                    public final C14JJ LIZ;
                    public List<C14JM> LIZIZ;
                    public ArrayList<C14JM> LIZJ;
                    public final HashMap<WindowInsetsAnimation, C14JM> LIZLLL;

                    {
                        super(c14jj.LLILLJJLI);
                        this.LIZLLL = new HashMap<>();
                        this.LIZ = c14jj;
                    }

                    public final C14JM LIZ(WindowInsetsAnimation windowInsetsAnimation) {
                        C14JM c14jm = this.LIZLLL.get(windowInsetsAnimation);
                        if (c14jm == null) {
                            C14JM c14jm2 = new C14JM(windowInsetsAnimation);
                            this.LIZLLL.put(windowInsetsAnimation, c14jm2);
                            return c14jm2;
                        }
                        return c14jm;
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZ(LIZ(windowInsetsAnimation));
                        this.LIZLLL.remove(windowInsetsAnimation);
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZIZ(LIZ(windowInsetsAnimation));
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                        ArrayList<C14JM> arrayList = this.LIZJ;
                        if (arrayList == null) {
                            ArrayList<C14JM> arrayList2 = new ArrayList<>(list.size());
                            this.LIZJ = arrayList2;
                            this.LIZIZ = Collections.unmodifiableList(arrayList2);
                        } else {
                            arrayList.clear();
                        }
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size >= 0) {
                                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) ListProtector.get(list, size);
                                C14JM c14jmLIZ = LIZ(windowInsetsAnimation);
                                c14jmLIZ.LIZ.LJ(windowInsetsAnimation.getFraction());
                                this.LIZJ.add(c14jmLIZ);
                            } else {
                                return this.LIZ.LIZJ(C20246014Ju.LJIIJJI(null, windowInsets), this.LIZIZ).LJIIJ();
                            }
                        }
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                        C14JL c14jlLIZLLL = this.LIZ.LIZLLL(LIZ(windowInsetsAnimation), new C14JL(bounds));
                        c14jlLIZLLL.getClass();
                        return new WindowInsetsAnimation.Bounds(c14jlLIZLLL.LIZ.LIZLLL(), c14jlLIZLLL.LIZIZ.LIZLLL());
                    }
                };
            }
            view.setWindowInsetsAnimationCallback(callback);
            return;
        }
        Interpolator interpolator = C14JI.LJ;
        Object tag = view.getTag(R.id.x1y);
        if (c14jj == null) {
            view.setTag(R.id.x2k, null);
            if (tag != null) {
                return;
            }
            view.setOnApplyWindowInsetsListener(null);
            return;
        }
        View.OnApplyWindowInsetsListener c14jh = new C14JH(view, c14jj);
        view.setTag(R.id.x2k, c14jh);
        if (tag != null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(c14jh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIII(int i, View view) {
        if (view instanceof InterfaceC20097013kG) {
            ((InterfaceC20097013kG) view).stopNestedScroll(i);
        } else {
            if (i != 0) {
                return;
            }
            C14K9.LJJIFFI(view);
        }
    }

    public static int LIZ(View view, CharSequence charSequence, InterfaceC20092813ja interfaceC20092813ja) {
        int iLIZ;
        boolean z;
        List<C20092413jW> listLJIIIIZZ = LJIIIIZZ(view);
        int i = 0;
        while (true) {
            if (i < listLJIIIIZZ.size()) {
                if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) ((C20092413jW) ListProtector.get(listLJIIIIZZ, i)).LIZ).getLabel())) {
                    iLIZ = ((C20092413jW) ListProtector.get(listLJIIIIZZ, i)).LIZ();
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                iLIZ = -1;
                do {
                    int i3 = LJ[i2];
                    boolean z2 = true;
                    for (int i4 = 0; i4 < listLJIIIIZZ.size(); i4++) {
                        if (((C20092413jW) ListProtector.get(listLJIIIIZZ, i4)).LIZ() != i3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        iLIZ = i3;
                    }
                    i2++;
                    if (i2 >= 32) {
                        break;
                    }
                } while (iLIZ == -1);
            }
        }
        if (iLIZ != -1) {
            C20092413jW c20092413jW = new C20092413jW(null, iLIZ, charSequence, interfaceC20092813ja, null);
            LJ(view);
            LJIILJJIL(c20092413jW.LIZ(), view);
            LJIIIIZZ(view).add(c20092413jW);
            LJIIJJI(0, view);
        }
        return iLIZ;
    }

    public static void LJIL(View view, String[] strArr, InterfaceC20096813kE interfaceC20096813kE) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            C20098313kT.LIZJ(view, strArr, interfaceC20096813kE);
            return;
        }
        if (strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = false;
        if (strArr != null) {
            z = true;
        } else {
            z = false;
        }
        C08IF.LIZ("When the listener is set, MIME types must also be set", z);
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z2 = true;
                    break;
                }
                i++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("A MIME type set here must not start with *: ");
            sbLIZ.append(Arrays.toString(strArr));
            C08IF.LIZ(C2188811AlT.LIZIZ(sbLIZ), true ^ z2);
        }
        view.setTag(R.id.x20, strArr);
        view.setTag(R.id.x1z, interfaceC20096813kE);
    }

    public static void LJIILL(View view, C20092413jW c20092413jW, CharSequence charSequence, InterfaceC20092813ja interfaceC20092813ja) {
        if (interfaceC20092813ja == null && charSequence == null) {
            LJIILJJIL(c20092413jW.LIZ(), view);
            LJIIJJI(0, view);
            return;
        }
        c20092413jW.getClass();
        C20092413jW c20092413jW2 = new C20092413jW(null, c20092413jW.LIZIZ, charSequence, interfaceC20092813ja, c20092413jW.LIZJ);
        LJ(view);
        LJIILJJIL(c20092413jW2.LIZ(), view);
        LJIIIIZZ(view).add(c20092413jW2);
        LJIIJJI(0, view);
    }

    public static void LJIIZILJ(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C20095113jx.LIZLLL(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }
}
