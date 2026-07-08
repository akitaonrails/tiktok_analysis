package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.C0R4E;
import X.C14JJ;
import X.C2187701Ajg;
import X.C356901a3;
import X.C674570Qd5;
import X.C674580Qd6;
import X.C674590Qd7;
import X.InterfaceC674600Qd8;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import java.util.Iterator;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchKeyboardMonitor implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final View LL;
    public final InterfaceC674600Qd8 LLILLJJLI;
    public final Lifecycle LLILLL;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public C674570Qd5 LLILZ = new C674570Qd5(false, 0);
    public final C674590Qd7 LLIZLLLIL = new C14JJ() { // from class: X.0Qd7
        {
            super(1);
        }

        @Override // X.C14JJ
        public final void LIZ(C14JM c14jm) {
            this.LLILLL.getClass();
            if ((c14jm.LIZ() & 8) != 0) {
                C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(this.LLILLL.LL);
                if (c674570Qd5LIZ.LIZ) {
                    this.LLILLL.LIZIZ(c674570Qd5LIZ.LIZIZ, true);
                } else {
                    this.LLILLL.LIZIZ(0, false);
                }
                this.LLILLL.LIZ(c674570Qd5LIZ);
            }
        }

        @Override // X.C14JJ
        public final void LIZIZ(C14JM c14jm) {
            this.LLILLL.getClass();
            if ((c14jm.LIZ() & 8) != 0) {
                C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(this.LLILLL.LL);
                if (c674570Qd5LIZ.LIZ) {
                    EcSearchKeyboardMonitor ecSearchKeyboardMonitor = this.LLILLL;
                    ecSearchKeyboardMonitor.LLILZIL = false;
                    ecSearchKeyboardMonitor.LLILZLL = c674570Qd5LIZ.LIZIZ;
                    ecSearchKeyboardMonitor.LLIZ = 0;
                }
            }
        }

        @Override // X.C14JJ
        public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
            C14JM next;
            EcSearchKeyboardMonitor ecSearchKeyboardMonitor = this.LLILLL;
            Iterator<C14JM> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    ecSearchKeyboardMonitor.getClass();
                    if ((next.LIZ() & 8) != 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C14JM c14jm = next;
            if (c14jm == null) {
                return c20246014Ju;
            }
            float fLIZJ = c14jm.LIZ.LIZJ();
            EcSearchKeyboardMonitor ecSearchKeyboardMonitor2 = this.LLILLL;
            ecSearchKeyboardMonitor2.LIZIZ(C814420VxA.LIZIZ(ecSearchKeyboardMonitor2.LLILZLL + ((ecSearchKeyboardMonitor2.LLIZ - r2) * fLIZJ)), ecSearchKeyboardMonitor2.LLILZIL);
            return c20246014Ju;
        }

        @Override // X.C14JJ
        public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
            this.LLILLL.getClass();
            if ((c14jm.LIZ() & 8) != 0) {
                C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(this.LLILLL.LL);
                if (c674570Qd5LIZ.LIZ) {
                    EcSearchKeyboardMonitor ecSearchKeyboardMonitor = this.LLILLL;
                    ecSearchKeyboardMonitor.LLILZIL = true;
                    ecSearchKeyboardMonitor.LLILZLL = 0;
                    ecSearchKeyboardMonitor.LLIZ = c674570Qd5LIZ.LIZIZ;
                }
                EcSearchKeyboardMonitor ecSearchKeyboardMonitor2 = this.LLILLL;
                ecSearchKeyboardMonitor2.LIZIZ(C814420VxA.LIZIZ(ecSearchKeyboardMonitor2.LLILZLL + ((ecSearchKeyboardMonitor2.LLIZ - r1) * 0.0f)), ecSearchKeyboardMonitor2.LLILZIL);
                return c14jl;
            }
            return c14jl;
        }
    };
    public C674570Qd5 LLJ = new C674570Qd5(false, 0);
    public final C0R4E LLJI = new C0R4E(this, 1);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZJ() {
        if (Build.VERSION.SDK_INT >= 30) {
            q0.LJJII(this.LL, null);
        } else {
            ViewTreeObserver viewTreeObserver = this.LL.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                C0R4E c0r4e = this.LLJI;
                viewTreeObserver.removeOnGlobalLayoutListener(c0r4e);
                C2187701Ajg.LIZIZ(viewTreeObserver, c0r4e, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
        this.LLILLL.removeObserver(this);
    }

    public final void LIZ(C674570Qd5 c674570Qd5) {
        if (!c674570Qd5.LIZ) {
            c674570Qd5 = new C674570Qd5(false, 0);
        }
        boolean z = c674570Qd5.LIZ;
        if (z == this.LLILZ.LIZ) {
            return;
        }
        this.LLILZ = c674570Qd5;
        if (z) {
            this.LLILLJJLI.LIZIZ(c674570Qd5.LIZIZ);
        } else {
            this.LLILLJJLI.LIZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(this.LL);
        if (!c674570Qd5LIZ.LIZ) {
            c674570Qd5LIZ = new C674570Qd5(false, 0);
        }
        this.LLILZ = c674570Qd5LIZ;
        if (Build.VERSION.SDK_INT >= 30) {
            q0.LJJII(this.LL, this.LLIZLLLIL);
            return;
        }
        this.LLJ = C674580Qd6.LIZ(this.LL);
        ViewTreeObserver viewTreeObserver = this.LL.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return;
        }
        C0R4E c0r4e = this.LLJI;
        viewTreeObserver.addOnGlobalLayoutListener(c0r4e);
        C2187701Ajg.LIZ(viewTreeObserver, c0r4e, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        LIZJ();
    }

    public final void LIZIZ(int i, boolean z) {
        if (z) {
            this.LLILLJJLI.onShow(i);
        } else {
            this.LLILLJJLI.onHide(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Qd7] */
    public EcSearchKeyboardMonitor(View view, InterfaceC674600Qd8 interfaceC674600Qd8, Lifecycle lifecycle) {
        this.LL = view;
        this.LLILLJJLI = interfaceC674600Qd8;
        this.LLILLL = lifecycle;
    }
}
