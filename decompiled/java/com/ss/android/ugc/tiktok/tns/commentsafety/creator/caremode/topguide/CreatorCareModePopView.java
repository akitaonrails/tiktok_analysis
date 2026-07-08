package com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide;

import X.C06W1;
import X.C1380390m1d;
import X.C1888220zEi;
import X.C191757100d;
import X.C191758100e;
import X.C191761100h;
import X.C191765100l;
import X.C191766100m;
import X.C19EG;
import X.C20656615sK;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C214906198m;
import X.C356901a3;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C814420VxA;
import X.C994003uc;
import X.EnumC1490680otW;
import X.EnumC1620106Vz;
import X.InterfaceC1380410m1f;
import X.InterfaceC1380420m1g;
import Y.ACListenerS162S0100000_28;
import Y.ARunnableS47S0110000_28;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorCareModePopView extends C214906198m implements InterfaceC1380420m1g {
    public final C19EG LL;
    public final C20656615sK LLILLJJLI;
    public final EnumC1620106Vz LLILLL;
    public final View LLILZ;
    public long LLILZIL;
    public final long LLILZLL;
    public final C1380390m1d LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final ARunnableS47S0110000_28 LLJ;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    public final Map<String, String> LJJIIJ() {
        int i = C06W1.LIZ[this.LLILLL.ordinal()];
        return (i == 1 || i == 2) ? C2097908Jt.LIZJ(new Pair("trigger", "delete")) : i != 3 ? C2097608Jq.LJ() : C2097908Jt.LIZJ(new Pair("trigger", "dislike"));
    }

    public final void LJJIIJZLJL() {
        this.LLIZ.LIZIZ();
        if (this.LL.isFinishing()) {
            this.LLILLJJLI.LIZ();
            return;
        }
        this.LLILZIL = System.currentTimeMillis() + this.LLILZLL;
        HandlerHook.viewPostDelay(this.LLILZ, this.LLJ, this.LLILZLL);
        showAtLocation(this.LL.getWindow().getDecorView(), 48, 0, 0);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(this);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        C20684815ws.LJIILLIIL("consider_turn_on_care_mode_popup_show", LJJIIJ());
        C191761100h c191761100h = C191761100h.LIZ;
        EnumC1620106Vz enumC1620106Vz = this.LLILLL;
        c191761100h.getClass();
        int iLIZIZ = C1888220zEi.LIZIZ.LIZIZ();
        if (enumC1620106Vz == EnumC1620106Vz.COMMENT_DELETE_PUSH || enumC1620106Vz == EnumC1620106Vz.COMMENT_BATCH_DELETE_PUSH) {
            if (iLIZIZ == EnumC1490680otW.VULNERABLE.getValue()) {
                C191757100d.LIZIZ.LJ();
            }
            if (iLIZIZ == EnumC1490680otW.WHITE_LIST.getValue()) {
                C191765100l c191765100l = C191765100l.LIZIZ;
                c191765100l.LIZ.LIZLLL(c191765100l.LIZ());
            }
        }
        if (enumC1620106Vz == EnumC1620106Vz.COMMENT_DISLIKE_PUSH) {
            if (iLIZIZ == EnumC1490680otW.VULNERABLE.getValue()) {
                C191758100e.LIZIZ.LJ();
            }
            if (iLIZIZ == EnumC1490680otW.WHITE_LIST.getValue()) {
                C191766100m c191766100m = C191766100m.LIZIZ;
                c191766100m.LIZ.LIZLLL(c191766100m.LIZ());
            }
        }
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            CreatorCareModePopView creatorCareModePopView = CreatorCareModePopView.this;
            creatorCareModePopView.dismiss();
            creatorCareModePopView.LLILLJJLI.LIZ();
            CreatorCareModePopView.this.LLIZLLLIL.getLifecycle().removeObserver(this);
        }
    }

    public CreatorCareModePopView(C19EG c19eg, C20656615sK c20656615sK, EnumC1620106Vz enumC1620106Vz) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = c20656615sK;
        this.LLILLL = enumC1620106Vz;
        View viewSd = C786410Ut5.Sd(R.layout.ahk, C786410Ut5.ne(c19eg), null);
        this.LLILZ = viewSd;
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
        C1380390m1d c1380390m1d = (C1380390m1d) viewSd;
        this.LLIZ = c1380390m1d;
        LifecycleOwner lifecycleOwnerLJ = SAFExtensionKt.LJ(c19eg);
        lifecycleOwnerLJ = lifecycleOwnerLJ == null ? c19eg : lifecycleOwnerLJ;
        this.LLIZLLLIL = lifecycleOwnerLJ;
        this.LLJ = new ARunnableS47S0110000_28(this, 5);
        lifecycleOwnerLJ.getLifecycle().addObserver(new AnonymousClass1());
        c1380390m1d.LLILLL = viewSd.findViewById(R.id.ngu);
        c1380390m1d.setPullUpListener(this);
        c1380390m1d.setInternalTouchEventListener(new InterfaceC1380410m1f() { // from class: X.100j
            @Override // X.InterfaceC1380410m1f
            public final void onTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            this.LIZ.LLJ.z1 = true;
                            return;
                        }
                        return;
                    } else {
                        CreatorCareModePopView creatorCareModePopView = this.LIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        CreatorCareModePopView creatorCareModePopView2 = this.LIZ;
                        creatorCareModePopView.LLILZIL = jCurrentTimeMillis + creatorCareModePopView2.LLILZLL;
                        creatorCareModePopView2.LLJ.z1 = false;
                        HandlerHook.viewPostDelay(creatorCareModePopView2.LLILZ, creatorCareModePopView2.LLJ, creatorCareModePopView2.LLILZLL);
                        return;
                    }
                }
                this.LIZ.LLJ.z1 = true;
            }
        });
        View viewFindViewById = viewSd.findViewById(R.id.ngu);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C497820Jfg.LIZJ(c19eg) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        viewFindViewById.setBackground(c384050F3z.LIZ(c19eg));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZ = R.raw.icon_comment_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1o);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c19eg);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zz);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
        ((TuxIconView) viewFindViewById.findViewById(R.id.lvm)).setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(c19eg)));
        ((TextView) viewFindViewById.findViewById(R.id.zos)).setText(c19eg.getString(2131830100));
        ((TextView) viewFindViewById.findViewById(R.id.zk7)).setText(c19eg.getString(2131830099));
        C786410Ut5.h9((TuxTextView) viewFindViewById.findViewById(R.id.zk7), new ACListenerS162S0100000_28(this, 195));
        setBackgroundDrawable(null);
        setContentView(viewSd);
        setWidth(-1);
        setHeight(-2);
        setClippingEnabled(false);
        update();
        setAnimationStyle(R.style.afu);
    }
}
