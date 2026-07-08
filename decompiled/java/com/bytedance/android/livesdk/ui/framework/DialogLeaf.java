package com.bytedance.android.livesdk.ui.framework;

import X.AbstractC1100450ek7;
import X.C1100420ek4;
import X.C1130030fVp;
import X.C1388190mED;
import X.C19GI;
import X.C19ME;
import X.C785410UrT;
import X.DialogC19728412Gs;
import X.EnumC1100490ekB;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public abstract class DialogLeaf extends AbstractC1100450ek7 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public DialogC19728412Gs LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C1130030fVp LLJILJIL;

    @Override // X.AbstractC1100450ek7
    public final void LJIL() {
        DialogC19728412Gs dialogC19728412Gs;
        this.LLJIJIL = true;
        if (!this.LLJI && (dialogC19728412Gs = this.LLJ) != null) {
            dialogC19728412Gs.dismiss();
            C785410UrT.LIZ(dialogC19728412Gs);
        }
        LJJIZ();
    }

    @Override // X.AbstractC1100450ek7
    public void LJJIIZ() {
        this.LLJI = false;
        this.LLJIJIL = false;
    }

    @Override // X.AbstractC1100450ek7
    public void LJJIIZI() {
        this.LLJI = false;
    }

    public abstract C1130030fVp LJJJIL();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // X.AbstractC1100450ek7
    public void LJJIZ() {
        super.LJJIZ();
        this.LLJ = null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        if (this.LLILLL.LIZ != EnumC1100490ekB.END) {
            LJII();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.LLJI = false;
    }

    public DialogLeaf(Context context, int i, boolean z) {
        super(context, i);
        this.LLIZ = z;
        this.LLIZLLLIL = true;
    }

    @Override // X.AbstractC1100450ek7
    public Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DialogC19728412Gs dialogC19728412Gs;
        Fragment fragment;
        Lifecycle lifecycle;
        final Context context2 = this.LL;
        C1130030fVp c1130030fVpLJJJIL = LJJJIL();
        this.LLJILJIL = c1130030fVpLJJJIL;
        final int i = c1130030fVpLJJJIL.LIZ;
        if (i == -1) {
            i = R.style.aiq;
        }
        if (this.LLIZ) {
            LiveBottomSheetDialog liveBottomSheetDialog = new LiveBottomSheetDialog(context2, i);
            liveBottomSheetDialog.LLILZLL = true;
            liveBottomSheetDialog.LLJJIJIIJIL = "gift_panel";
            dialogC19728412Gs = liveBottomSheetDialog;
        } else {
            C19GI c19gi = new C19GI(context2, i) { // from class: X.0fWE
                @Override // X.C19GI
                public final boolean LJJZ() {
                    return true;
                }
            };
            c19gi.LL = true;
            c19gi.LLILLL = "gift_panel";
            dialogC19728412Gs = c19gi;
        }
        dialogC19728412Gs.requestWindowFeature(1);
        C1130030fVp c1130030fVp = this.LLJILJIL;
        if (c1130030fVp != null) {
            dialogC19728412Gs.setCanceledOnTouchOutside(true);
            Window window = dialogC19728412Gs.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.gravity = c1130030fVp.LIZIZ;
                    attributes.softInputMode = c1130030fVp.LIZJ;
                } else {
                    attributes = null;
                }
                window.setAttributes(attributes);
            }
        }
        View view = this.LLILZ;
        if (view != null) {
            dialogC19728412Gs.setContentView(view);
        }
        Activity activityLIZ = C1388190mED.LIZ(dialogC19728412Gs.getContext());
        if (activityLIZ != null) {
            dialogC19728412Gs.setOwnerActivity(activityLIZ);
        }
        dialogC19728412Gs.setCancelable(this.LLIZLLLIL);
        dialogC19728412Gs.setOnCancelListener(this);
        dialogC19728412Gs.setOnDismissListener(this);
        dialogC19728412Gs.setOnShowListener(this);
        dialogC19728412Gs.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0fVj
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (4 == i2 && 1 == keyEvent.getAction()) {
                    this.LL.LJII();
                    return true;
                }
                return false;
            }
        });
        this.LLJ = dialogC19728412Gs;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 != null && (fragment = c1100420ek4.getFragment()) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.livesdk.ui.framework.DialogLeaf$onViewCreated$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_PAUSE) {
                        onPause();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void onPause() {
                    DialogC19728412Gs dialogC19728412Gs2;
                    DialogLeaf dialogLeaf = this.LL;
                    if (dialogLeaf.LLILLL.LIZ != EnumC1100490ekB.END || (dialogC19728412Gs2 = dialogLeaf.LLJ) == null) {
                        return;
                    }
                    dialogC19728412Gs2.dismiss();
                    C785410UrT.LIZ(dialogC19728412Gs2);
                }
            });
        }
        return null;
    }
}
