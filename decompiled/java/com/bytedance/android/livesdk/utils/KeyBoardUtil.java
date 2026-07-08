package com.bytedance.android.livesdk.utils;

import X.C0TVI;
import X.C142Q;
import X.C142R;
import X.C14JJ;
import X.C14K9;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import java.util.ArrayList;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes31.dex */
public final class KeyBoardUtil {
    public static final List<AndroidBug5497Workaround> LIZ = new ArrayList(2);

    public static class AndroidBug5497Workaround implements GenericLifecycleObserver {
        public C142R LL;
        public View LLILLJJLI;
        public C142Q LLILLL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            ((ArrayList) KeyBoardUtil.LIZ).remove(this);
            View view = this.LLILLJJLI;
            if (view != null && view.getViewTreeObserver() != null && this.LLILLJJLI.getViewTreeObserver().isAlive()) {
                C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), this.LL);
            }
            this.LLILLJJLI = null;
            this.LL = null;
            this.LLILLL = null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [X.142R] */
        public AndroidBug5497Workaround(LifecycleOwner lifecycleOwner, View view, C142Q c142q, final float f) {
            lifecycleOwner.getLifecycle().addObserver(this);
            this.LLILLL = c142q;
            this.LL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.142R
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    KeyBoardUtil.AndroidBug5497Workaround androidBug5497Workaround = this.LL;
                    float f2 = f;
                    if (androidBug5497Workaround.LLILLJJLI == null || androidBug5497Workaround.LLILLL == null) {
                        return;
                    }
                    Rect rect = new Rect();
                    androidBug5497Workaround.LLILLJJLI.getWindowVisibleDisplayFrame(rect);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AndroidBug5497Workaround r.bottom:");
                    sbLIZ.append(rect.bottom);
                    C20441214yg.LIZIZ("text_header", C2188811AlT.LIZIZ(sbLIZ));
                    if (rect.bottom < androidBug5497Workaround.LLILLJJLI.getHeight() * f2) {
                        androidBug5497Workaround.LLILLL.onShow();
                    } else {
                        androidBug5497Workaround.LLILLL.onHide();
                    }
                }
            };
            View rootView = view.getRootView();
            this.LLILLJJLI = rootView;
            C786410Ut5.x3(rootView.getViewTreeObserver(), this.LL);
        }
    }

    public static void LIZIZ(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void LIZJ(Context context, EditText editText) {
        InputMethodManager inputMethodManager;
        if (context != null && editText != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public static void LIZLLL(Context context, EditText editText) {
        InputMethodManager inputMethodManager;
        if (context != null && editText != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.142P] */
    public static void LIZ(final LifecycleOwner lifecycleOwner, final View view, final C142Q c142q, final boolean z) {
        final ?? r2 = new C142Q(c142q) { // from class: X.142P
            public int LIZ;
            public final C142Q LIZIZ;

            @Override // X.C142Q
            public final void onHide() {
                if (this.LIZ == 2) {
                    return;
                }
                this.LIZ = 2;
                C142Q c142q2 = this.LIZIZ;
                if (c142q2 != null) {
                    c142q2.onHide();
                }
            }

            @Override // X.C142Q
            public final void onShow() {
                if (this.LIZ == 1) {
                    return;
                }
                this.LIZ = 1;
                C142Q c142q2 = this.LIZIZ;
                if (c142q2 != null) {
                    c142q2.onShow();
                }
            }

            {
                this.LIZIZ = c142q;
            }
        };
        if (Build.VERSION.SDK_INT < 30) {
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.utils.KeyBoardUtil.1
                public final /* synthetic */ float LLILZ = 0.75f;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        ((ArrayList) KeyBoardUtil.LIZ).add(new AndroidBug5497Workaround(lifecycleOwner, view, r2, this.LLILZ));
                    }
                }
            });
        } else {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.142O
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C142Q c142q2 = r2;
                    boolean z2 = z;
                    boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setOnApplyWindowInsetsListener imeVisible:");
                    sbLIZ.append(zLJIIIIZZ);
                    C20441214yg.LIZIZ("text_header", C2188811AlT.LIZIZ(sbLIZ));
                    if (zLJIIIIZZ) {
                        c142q2.onShow();
                    } else if (!z2) {
                        c142q2.onHide();
                        return c20246014Ju;
                    }
                    return c20246014Ju;
                }
            });
            q0.LJJII(view, new C14JJ() { // from class: X.142N
                public boolean LLILLL;

                @Override // X.C14JJ
                public final void LIZ(C14JM c14jm) {
                    Object objValueOf;
                    C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onEnd imeVisible:");
                    sbLIZ.append(this.LLILLL);
                    sbLIZ.append(" isVisible: ");
                    if (c20246014JuLIZ == null) {
                        objValueOf = "null";
                    } else {
                        objValueOf = Boolean.valueOf(c20246014JuLIZ.LJIIIIZZ(8));
                    }
                    sbLIZ.append(objValueOf);
                    C20441214yg.LIZIZ("text_header", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LLILLL) {
                        r2.onShow();
                    } else {
                        r2.onHide();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // X.C14JJ
                public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                    this.LLILLL = c20246014Ju.LJIIIIZZ(8);
                    return c20246014Ju;
                }
            });
        }
    }
}
