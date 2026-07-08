package dmt.av.video;

import X.C2188811AlT;
import X.C2219091BtD;
import X.C580740Mq8;
import X.C786410Ut5;
import X.InterfaceC1447480nlq;
import X.InterfaceC1452170ntP;
import X.InterfaceC1462000o9G;
import X.InterfaceC1462020o9I;
import X.InterfaceC1463990oCT;
import X.ViewTreeObserverOnWindowFocusChangeListenerC1462010o9H;
import android.content.Context;
import android.content.IntentFilter;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* JADX INFO: loaded from: classes23.dex */
public final class VEEditorAutoStartStopArbiter implements GenericLifecycleObserver {
    public final Context LL;
    public C580740Mq8 LLILLJJLI;
    public final InterfaceC1452170ntP LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC1462000o9G LLJILJIL;
    public final LifecycleOwner LLJILLL;
    public int LLJJ;
    public final ViewParent LLJJI;
    public final ViewTreeObserverOnWindowFocusChangeListenerC1462010o9H LLJJIII;
    public boolean LLJIJIL = true;
    public VEEditor.VEState LLJILJILJ = VEEditor.VEState.STARTED;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LIZ() {
        InterfaceC1462000o9G interfaceC1462000o9G = this.LLJILJIL;
        if (interfaceC1462000o9G == null || !interfaceC1462000o9G.x0()) {
            VEEditor.VEState vEState = VEEditor.VEState.STARTED;
            this.LLJILJILJ = vEState;
            if (this.LLILZ) {
                return;
            }
            try {
                if (this.LLILLL.getState() != vEState) {
                    this.LLJJ = this.LLILLL.play();
                }
                Object obj = this.LL;
                if (obj instanceof InterfaceC1462020o9I) {
                    ((InterfaceC1462020o9I) obj).LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2219091BtD.LIZLLL().LIZ(e.toString());
            }
        }
    }

    public final void LIZIZ() {
        InterfaceC1462000o9G interfaceC1462000o9G = this.LLJILJIL;
        if ((interfaceC1462000o9G == null || !interfaceC1462000o9G.LLIIIJ()) && !this.LLILZ) {
            try {
                if (this.LLILLL.getState() != VEEditor.VEState.PAUSED) {
                    this.LLILLL.pause();
                }
                Object obj = this.LL;
                if (obj instanceof InterfaceC1462020o9I) {
                    ((InterfaceC1462020o9I) obj).LIZIZ();
                }
            } catch (VEException e) {
                TryCatchGuardChecker.doCheck(e);
                if (e.getRetCd() != -105) {
                    throw e;
                }
            }
        }
    }

    public final void LIZLLL() {
        if (this.LLILZIL || this.LLILZLL) {
            return;
        }
        VEEditor.VEState vEState = this.LLJILJILJ;
        if ((vEState == VEEditor.VEState.PAUSED || vEState == VEEditor.VEState.COMPLETED || vEState == VEEditor.VEState.SEEKING) && !this.LLIZ) {
            return;
        }
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (this.LLILLJJLI != null) {
            try {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unregister Receiver ");
                sbLIZ.append(this.LL);
                sbLIZ.append(" ");
                sbLIZ.append(this.LLILLJJLI);
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJJIFFI(this.LL, this.LLILLJJLI);
                this.LLILLJJLI = null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2219091BtD.LIZLLL().LIZ(e.toString());
            }
        } else {
            C2219091BtD.LIZLLL().LIZ("Receiver not registered");
        }
        this.LLJIJIL = false;
        Object obj = this.LLJJI;
        if (obj != null) {
            ((View) obj).getViewTreeObserver().removeOnWindowFocusChangeListener(this.LLJJIII);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.LLJILJILJ = this.LLILLL.getState();
        if (!this.LLILZIL && !this.LLIZLLLIL && !this.LLJI) {
            LIZIZ();
        }
        this.LLJIJIL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.LLJ) {
            LIZLLL();
        }
        this.LLJIJIL = true;
    }

    public final void LIZJ(boolean z, boolean z2, boolean z3) {
        boolean z4;
        InterfaceC1462000o9G interfaceC1462000o9G = this.LLJILJIL;
        if ((interfaceC1462000o9G == null || !interfaceC1462000o9G.LJL(z)) && (z4 = this.LLILZ) != z) {
            if (z4) {
                if (!z2) {
                    this.LLILLL.play();
                }
                Object obj = this.LL;
                if (obj instanceof InterfaceC1447480nlq) {
                    ((InterfaceC1447480nlq) obj).LLLIIII();
                }
            } else if (!z3) {
                this.LLILLL.pause();
            }
            this.LLILZ = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0o9H, android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    public VEEditorAutoStartStopArbiter(Context context, LifecycleOwner lifecycleOwner, InterfaceC1452170ntP interfaceC1452170ntP, SurfaceView surfaceView, boolean z) throws Exception {
        ?? r3 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0o9H
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z2) {
                VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LL;
                if (z2) {
                    if (vEEditorAutoStartStopArbiter.LLJILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        VEEditor.VEState vEState = vEEditorAutoStartStopArbiter.LLJILJILJ;
                        if ((vEState != VEEditor.VEState.PAUSED && vEState != VEEditor.VEState.COMPLETED && vEState != VEEditor.VEState.SEEKING) || vEEditorAutoStartStopArbiter.LLIZ) {
                            InterfaceC1462000o9G interfaceC1462000o9G = vEEditorAutoStartStopArbiter.LLJILJIL;
                            if (interfaceC1462000o9G != null && interfaceC1462000o9G.b0()) {
                                return;
                            }
                            vEEditorAutoStartStopArbiter.LIZ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                vEEditorAutoStartStopArbiter.getClass();
            }
        };
        this.LLJJIII = r3;
        this.LLIZ = z;
        this.LL = context;
        this.LLILLL = interfaceC1452170ntP;
        this.LLJILLL = lifecycleOwner;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.LLILLJJLI = new C580740Mq8(this, 2);
        ViewParent parent = surfaceView.getParent();
        this.LLJJI = parent;
        if (parent != 0) {
            ((View) parent).getViewTreeObserver().addOnWindowFocusChangeListener(r3);
        }
        C786410Ut5.LJIJJ(context, this.LLILLJJLI, intentFilter);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Register Receiver ");
        sbLIZ.append(context);
        sbLIZ.append(" ");
        sbLIZ.append(this.LLILLJJLI);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
