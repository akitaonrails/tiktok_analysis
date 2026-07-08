package com.ss.android.ugc.tools.view.uikit.factory;

import X.C01GW;
import X.C0CHQ;
import X.C0KW5;
import X.C1388190mED;
import X.C1659720tIA;
import X.C19576911iZ;
import X.C19577311id;
import X.C19EG;
import X.C201955140j;
import X.C2188811AlT;
import X.C281020Azs;
import X.C294080Bfq;
import X.C356901a3;
import X.C452501pT;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.DialogC1389620mGW;
import X.DialogC1390150mHN;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS231S0200000_29;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CreativeDialogWrapper implements CreativeLoadingDialog {
    public final C01GW LIZ;
    public final ARunnableS129S0100000_29 LIZIZ;
    public final ARunnableS129S0100000_29 LIZJ;
    public final C0KW5 LIZLLL;
    public final DialogC1390150mHN LJ;
    public final DialogC1389620mGW LJFF;
    public final int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final ARunnableS129S0100000_29 LJIILIIL;

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void dismiss() {
        this.LJIIJJI = false;
        if (!isShowing() && this.LJIIL) {
            this.LJIIL = false;
            ((Handler) this.LIZ.getValue()).removeCallbacks(this.LJIILIIL);
        }
        if (isShowing()) {
            try {
                C0KW5 c0kw5 = this.LIZLLL;
                if (c0kw5 != null) {
                    c0kw5.dismiss();
                    C785410UrT.LIZ(c0kw5);
                }
                DialogC1390150mHN dialogC1390150mHN = this.LJ;
                if (dialogC1390150mHN != null) {
                    dialogC1390150mHN.dismiss();
                    C785410UrT.LIZ(dialogC1390150mHN);
                }
                DialogC1389620mGW dialogC1389620mGW = this.LJFF;
                if (dialogC1389620mGW != null) {
                    dialogC1389620mGW.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW);
                }
                if (this.LJI > 0) {
                    ((Handler) this.LIZ.getValue()).removeCallbacks(this.LIZIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final boolean isShowing() {
        DialogC1390150mHN dialogC1390150mHN = this.LJ;
        if (dialogC1390150mHN != null && dialogC1390150mHN.isShowing()) {
            return true;
        }
        DialogC1389620mGW dialogC1389620mGW = this.LJFF;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            return true;
        }
        C0KW5 c0kw5 = this.LIZLLL;
        return c0kw5 != null && c0kw5.isShowing();
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final Dialog originalDialog() {
        DialogC1390150mHN dialogC1390150mHN = this.LJ;
        if (dialogC1390150mHN != null) {
            return dialogC1390150mHN;
        }
        DialogC1389620mGW dialogC1389620mGW = this.LJFF;
        return dialogC1389620mGW == null ? this.LIZLLL : dialogC1389620mGW;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void show() {
        if (isShowing()) {
            return;
        }
        try {
            C0KW5 c0kw5 = this.LIZLLL;
            if (c0kw5 != null) {
                c0kw5.show();
                C785410UrT.LIZIZ(c0kw5);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c0kw5);
                C816490W1f.LIZ(c0kw5);
            }
            DialogC1390150mHN dialogC1390150mHN = this.LJ;
            if (dialogC1390150mHN != null) {
                C786410Ut5.K4(dialogC1390150mHN);
            }
            DialogC1389620mGW dialogC1389620mGW = this.LJFF;
            if (dialogC1389620mGW != null) {
                C786410Ut5.J4(dialogC1389620mGW);
            }
            if (this.LJI > 0) {
                C786410Ut5.LJLIIL(this.LJI, (Handler) this.LIZ.getValue(), this.LIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper$4, reason: invalid class name */
    public final class AnonymousClass4 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

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

        public AnonymousClass4() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C201955140j.LIZIZ("CreativeDialogWrapper", "dialog dismiss, no memory leak usage");
            CreativeDialogWrapper.this.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void delayShow(long j) {
        this.LJIIJJI = true;
        this.LJIIL = true;
        Handler handler = (Handler) this.LIZ.getValue();
        ARunnableS129S0100000_29 aRunnableS129S0100000_29 = this.LJIILIIL;
        if (j <= 0) {
            j = C19576911iZ.LIZ();
        }
        C786410Ut5.LJLIIL(j, handler, aRunnableS129S0100000_29);
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void showCloseIcon(boolean z) {
        if (z) {
            this.LIZIZ.run();
        } else {
            this.LIZJ.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void updateFakeProgress(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 50);
        ValueAnimator valueAnimator = null;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration((long) (((double) i) * 0.2d));
            valueAnimatorOfInt.addUpdateListener(new AUListenerS231S0200000_29(this, valueAnimatorOfInt, 3));
        } else {
            valueAnimatorOfInt = null;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(51, 99);
        if (valueAnimatorOfInt2 != null) {
            valueAnimatorOfInt2.setDuration((long) (((double) i) * 0.8d));
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS231S0200000_29(this, valueAnimatorOfInt2, 4));
            valueAnimator = valueAnimatorOfInt2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimator);
        animatorSet.start();
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void updateProgressContent(String str) {
        if (isShowing()) {
            DialogC1390150mHN dialogC1390150mHN = this.LJ;
            if (dialogC1390150mHN != null) {
                dialogC1390150mHN.LJJLJLI(str);
            }
            DialogC1389620mGW dialogC1389620mGW = this.LJFF;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.LJJLJLI(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    public CreativeDialogWrapper(Context context, CreativeLoadingDialogBuilder creativeLoadingDialogBuilder) {
        boolean z;
        Object objRequireTopSAFExpLifecycleOwner;
        Lifecycle lifecycle;
        creativeLoadingDialogBuilder.getConfig().isShowProgress();
        this.LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 763));
        this.LIZIZ = new ARunnableS129S0100000_29(this, 118);
        this.LIZJ = new ARunnableS129S0100000_29(this, 117);
        int i = -1;
        this.LJI = -1;
        this.LJIIJJI = true;
        this.LJIILIIL = new ARunnableS129S0100000_29(this, 116);
        int i2 = C19577311id.LIZ[creativeLoadingDialogBuilder.getConfig().cancelViewVisibleType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = 15000;
                    }
                } else {
                    i = 5000;
                }
            } else {
                i = 0;
            }
        }
        this.LJI = i;
        String str = creativeLoadingDialogBuilder.getConfig().message;
        if ((str == null || str.length() == 0) && creativeLoadingDialogBuilder.getConfig().cancelViewVisibleType == CreativeLoadingDialogBuilder.CancelType.GONE) {
            z = true;
        } else {
            z = false;
        }
        if (creativeLoadingDialogBuilder.getConfig().isShowProgress()) {
            DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(context);
            dialogC1390150mHN.LJJLIIJ(false);
            dialogC1390150mHN.LJJLJ(creativeLoadingDialogBuilder.getConfig().hasOverLay);
            dialogC1390150mHN.LJJLJLI(creativeLoadingDialogBuilder.getConfig().message);
            dialogC1390150mHN.LJJZ(i == 0);
            dialogC1390150mHN.setCancelable(creativeLoadingDialogBuilder.getConfig().backCanCancel);
            this.LJ = dialogC1390150mHN;
        } else if (!creativeLoadingDialogBuilder.getConfig().isShowProgress() && !z) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLIIJ(creativeLoadingDialogBuilder.getConfig().hasOverLay);
            dialogC1389620mGW.LJJLJLI(creativeLoadingDialogBuilder.getConfig().message);
            dialogC1389620mGW.LJJLL(i == 0);
            dialogC1389620mGW.setCancelable(creativeLoadingDialogBuilder.getConfig().backCanCancel);
            this.LJFF = dialogC1389620mGW;
        } else {
            C0KW5 c0kw5 = new C0KW5(context);
            c0kw5.setCancelable(creativeLoadingDialogBuilder.getConfig().backCanCancel);
            this.LIZLLL = c0kw5;
        }
        if (((Boolean) C281020Azs.LIZ.getValue()).booleanValue()) {
            C201955140j.LIZIZ("CreativeDialogWrapper", "no memory leak usage");
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                objRequireTopSAFExpLifecycleOwner = IMainSAFLifecycleKt.requireTopSAFExpLifecycleOwner(c19egLIZIZ, true);
            } else {
                objRequireTopSAFExpLifecycleOwner = null;
            }
            ?? LJIIIIZZ = objRequireTopSAFExpLifecycleOwner instanceof C19EG ? C0CHQ.LIZ().LJIJJ().LJIIIIZZ((Activity) objRequireTopSAFExpLifecycleOwner) : objRequireTopSAFExpLifecycleOwner;
            if (LJIIIIZZ != 0 && (lifecycle = LJIIIIZZ.getLifecycle()) != null) {
                lifecycle.addObserver(new AnonymousClass4());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void updateProgress(final int i, final boolean z) {
        if (C294080Bfq.LIZ() && !C1659720tIA.LIZIZ()) {
            C786410Ut5.LJJZZIII((Handler) this.LIZ.getValue(), new Runnable() { // from class: X.0ylK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CreativeDialogWrapper@af05.updateProgress$1");
                    try {
                        this.LL.updateProgress(i, z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CreativeDialogWrapper@af05.updateProgress$1");
                }
            });
            return;
        }
        if (!z) {
            this.LJIIIIZZ = i;
            this.LJIIIZ = System.currentTimeMillis();
        }
        int iMax = Math.max(i, this.LJII);
        this.LJII = iMax;
        if (iMax == 99) {
            this.LJIIJ = System.currentTimeMillis();
        }
        if (isShowing()) {
            DialogC1390150mHN dialogC1390150mHN = this.LJ;
            if (dialogC1390150mHN != null) {
                dialogC1390150mHN.LJJLL(this.LJII, false);
            }
            DialogC1389620mGW dialogC1389620mGW = this.LJFF;
            if (dialogC1389620mGW != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(dialogC1389620mGW.getContext().getResources().getString(R.string.txr));
                sbLIZ.append(this.LJII);
                sbLIZ.append('%');
                dialogC1389620mGW.LJJLJLI(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
