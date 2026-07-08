package com.ss.android.ugc.aweme.innerpush.ui;

import X.C0PH3;
import X.C12ES;
import X.C1390290mHb;
import X.C1390660mIC;
import X.C19290510dT;
import X.C19EG;
import X.C20644215qK;
import X.C20663715tT;
import X.C20664615tc;
import X.C20665215ti;
import X.C20731216Ak;
import X.C2097908Jt;
import X.C214906198m;
import X.C21647019ng;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C844470XAv;
import X.C994003uc;
import X.InterfaceC20663615tS;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushPopupWindow extends C214906198m implements InterfaceC20663615tS, GenericLifecycleObserver {
    public final C19EG LL;
    public final InnerPushMessage LLILLJJLI;
    public final C20664615tc LLILLL;
    public C21647019ng LLILZ;
    public C20665215ti LLILZIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        C19290510dT.LIZ("InnerPushPopupWindow", " current activity onDestroy........");
        LJJIIJ(null, false);
        IMainSAFLifecycleKt.requireTopSAFExpLifecycle(this.LL, true).removeObserver(this);
    }

    @Override // X.InterfaceC20663615tS
    public final int getMessageType() {
        return this.LLILLJJLI.getType();
    }

    @Override // X.InterfaceC20663615tS
    public final C20665215ti LJIILLIIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC20663615tS
    public final InnerPushMessage getMsg() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC20663615tS
    public final void LJII(InnerPushMessage innerPushMessage) {
        C20644215qK.LIZ(innerPushMessage);
    }

    @Override // android.widget.PopupWindow, X.InterfaceC20663615tS
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public InnerPushPopupWindow(C19EG c19eg, InnerPushMessage innerPushMessage) {
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = innerPushMessage;
        C20664615tc c20664615tc = new C20664615tc(c19eg);
        this.LLILLL = c20664615tc;
        this.LLILZIL = new C20665215ti(this, c19eg);
        c20664615tc.setInnerPushNotifier(this);
        setContentView(c20664615tc);
        IMainSAFLifecycleKt.requireTopSAFExpLifecycle(c19eg, true).addObserver(this);
        C844470XAv.LIZ.getClass();
        setWidth(C12ES.LJIIJ(C844470XAv.LIZ()));
        setHeight(-2);
        update();
        setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // X.InterfaceC20665015tg
    public final void LJIJI(String str, boolean z) {
        LJJIIJ(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // X.InterfaceC20663615tS
    public final void LJJIII(C20665215ti c20665215ti, InnerPushMessage innerPushMessage) {
        long j;
        Float fValueOf;
        C21647019ng c21647019ng;
        ViewGroup viewGroup;
        boolean zLJI = MethodIDManager.LJI(72013);
        if (c20665215ti != null) {
            this.LLILZIL = c20665215ti;
            this.LLILLL.setMessage(innerPushMessage);
            C20664615tc c20664615tc = this.LLILLL;
            FrameLayout frameLayout = c20664615tc.LLILLJJLI;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            FrameLayout frameLayout2 = c20664615tc.LLILLJJLI;
            if (frameLayout2 != null) {
                frameLayout2.addView(c20665215ti);
            }
            C20664615tc c20664615tc2 = this.LLILLL;
            InnerPushConfig config = innerPushMessage.getConfig();
            if (config != null) {
                j = ((long) config.popupDurationSeconds) * 1000;
            } else {
                j = Mp4ScreenVideoLoadTimeout.CONTROL;
            }
            c20664615tc2.setShowDuration(j);
            this.LLILLL.onShow();
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                this.LLILLL.setInnerPushLayoutRadius(uiTemplate.globalRadius);
            }
            if (!this.LL.isFinishing() && !isShowing()) {
                if (getContentView().getParent() != null) {
                    ViewParent parent = getContentView().getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(getContentView(), viewGroup);
                    }
                }
                C20644215qK.LIZ(innerPushMessage);
                if (C20731216Ak.LIZIZ()) {
                    int i = -getContentView().getMeasuredHeight();
                    this.LLILZ = C0PH3.LIZ(C0PH3.LIZ, "InnerPushPopupWindow_Enter", this.LL, getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i - C497820Jfg.LIZJ(this.LL))), 0.0f, null, 96);
                    C786410Ut5.ed(getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i - C497820Jfg.LIZJ(this.LL))));
                } else {
                    setAnimationStyle(R.style.jh);
                }
                setClippingEnabled(false);
                View contentView = getContentView();
                if (contentView != null) {
                    contentView.setPadding(0, C497820Jfg.LIZJ(this.LL), 0, 0);
                }
                showAtLocation(this.LL.getWindow().getDecorView(), 8388659, 0, 0);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJI(this);
                C787990Uvd.LIZ.getClass();
                C994003uc.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showAtLocation translationY:");
                View contentView2 = getContentView();
                if (contentView2 != null) {
                    fValueOf = Float.valueOf(contentView2.getTranslationY());
                } else {
                    fValueOf = null;
                }
                sbLIZ.append(fValueOf);
                sbLIZ.append(" -76:");
                sbLIZ.append(C418440Gaw.LIZIZ(-76));
                C19290510dT.LIZ("InnerPushPopupWindow", C2188811AlT.LIZIZ(sbLIZ));
                if (C20731216Ak.LIZIZ() && (c21647019ng = this.LLILZ) != null) {
                    c21647019ng.LJI(true);
                }
            } else {
                dismiss();
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        if (PopupMonitorServiceImpl.LJJJJIZL()) {
            C1390660mIC c1390660mICLJJIJL = PopupMonitorServiceImpl.LJJIJL();
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("click_push_unmute", "open_tiktok_on_mute_push_guide_topwindow"));
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            if (innerPushMessage.getLabel() == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("type:");
                sbLIZ2.append(innerPushMessage.getType());
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ2);
            }
            String label = innerPushMessage.getLabel();
            if (label != null) {
                boolean zContainsKey = mapLIZJ.containsKey(label);
                T tValueOf = label;
                if (zContainsKey) {
                    tValueOf = String.valueOf(mapLIZJ.get(label));
                }
                c259800zU.element = tValueOf;
            }
            C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390290mHb(c259800zU, innerPushMessage, c1390660mICLJJIJL, null), 3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJIIJ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" dismissPopup userCancel:");
        sbLIZ.append(z);
        sbLIZ.append(" reason:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C19290510dT.LIZ("InnerPushPopupWindow", C2188811AlT.LIZIZ(sbLIZ));
        if (!isShowing()) {
            return;
        }
        if (!this.LL.isFinishing() && this.LLILLL.isAttachedToWindow()) {
            if (C20731216Ak.LIZIZ()) {
                C0PH3.LIZ(C0PH3.LIZ, "InnerPushPopupWindow_Exit", this.LL, getContentView(), 0.0f, C418440Gaw.LIZIZ(Integer.valueOf((-getContentView().getMeasuredHeight()) - C497820Jfg.LIZJ(this.LL))), new AwS575S0100000_31(this, 1469), 32).LJI(true);
            } else {
                dismiss();
            }
        }
        C20663715tT.LIZ.LJFF(this.LLILLJJLI, z, str);
    }

    @Override // X.InterfaceC20663615tS
    public final void LIZJ(InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2) {
        C20665215ti c20665215ti = this.LLILZIL;
        if (c20665215ti != null) {
            c20665215ti.LIZLLL(innerPushMessage, iArr);
        }
        if (z) {
            this.LLILLL.LIZJ();
        }
    }
}
