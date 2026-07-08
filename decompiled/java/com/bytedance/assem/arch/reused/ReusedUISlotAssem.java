package com.bytedance.assem.arch.reused;

import X.C01GW;
import X.C03H5;
import X.C0SCX;
import X.C1163430gNh;
import X.C1163440gNi;
import X.C12NW;
import X.C18L3;
import X.C20624915nD;
import X.C20625015nE;
import X.C20742916Ex;
import X.C2263281DiI;
import X.C2263321DiM;
import X.C2263331DiN;
import X.C2263341DiO;
import X.C2263381DiS;
import X.C2263391DiT;
import X.C452501pT;
import X.C724240Sb0;
import X.C725080ScM;
import X.C738480Sxy;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC201986141o;
import X.InterfaceC487670JAn;
import X.InterfaceC738310Sxh;
import X.InterfaceC738360Sxm;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS97S0201000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public abstract class ReusedUISlotAssem<RECEIVER extends C03H5> extends ReusedUIAssem<RECEIVER> {
    public static final C01GW<Boolean> LLJJJJLIIL;
    public static final C01GW<Boolean> LLJJL;
    public Function0<? extends View> LLJJIJIL;
    public int LLJJJ;
    public C1163440gNi LLJJJIL = C1163440gNi.LIZ;
    public final C01GW LLJJJJ = C452501pT.LIZ(EnumC452301pR.NONE, new C12NW());
    public View LLJJJJJIL;

    public abstract int Oo();

    public Context So(Context context) {
        return context;
    }

    public boolean Vo() {
        return !(this instanceof CLACaptionAssemV2);
    }

    public void cp() {
    }

    public void dp() {
    }

    public void ep() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void hp() {
    }

    public void ip() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void mo() {
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, new C20625015nE());
        LLJJL = C452501pT.LIZ(enumC452301pR, new C20624915nD());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Co() {
        ReusedUISlotAssem reusedUISlotAssem;
        View contentView;
        final View viewFindViewById;
        C1163430gNh c1163430gNh;
        InterfaceC201986141o interfaceC201986141o;
        if (this.LLJJIII && this.LLJJJJJIL != null) {
            Ao(LJJIJL());
            Eo(LJJIJL());
            return;
        }
        final int iOo = Oo();
        if (iOo == 0) {
            "layoutId must be assigned.".toString();
            throw new IllegalStateException("layoutId must be assigned.");
        }
        Function0<? extends View> function0 = this.LLJJIJIL;
        if (Bo()) {
            viewFindViewById = LJJIJL();
        } else if (function0 != null) {
            viewFindViewById = function0.invoke();
        } else {
            int i = this.LLJJJ;
            if (i == 0) {
                "slotLayoutId must be assigned.".toString();
                throw new IllegalStateException("slotLayoutId must be assigned.");
            }
            View view = getSupervisor().LLJJIII;
            if (view == null || (viewFindViewById = view.findViewById(i)) == null) {
                LifecycleOwner parent = getParent();
                if (!(parent instanceof ReusedUISlotAssem) || (reusedUISlotAssem = (ReusedUISlotAssem) parent) == null || (contentView = reusedUISlotAssem.getContentView()) == null || (viewFindViewById = contentView.findViewById(i)) == null) {
                    String str = "assem: " + this + ", slotView is null";
                    str.toString();
                    throw new IllegalStateException(str);
                }
            }
        }
        if (!Bo()) {
            this.LLJJI = viewFindViewById;
        }
        if (!(viewFindViewById instanceof ViewGroup)) {
            "container must be a ViewGroup.".toString();
            throw new IllegalStateException("container must be a ViewGroup.");
        }
        final Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Context contextSo = So(context);
        C1163440gNi c1163440gNi = this.LLJJJIL;
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZIZ)) {
            new C18L3(contextSo).LIZ(iOo, (ViewGroup) viewFindViewById, new InterfaceC487670JAn(this) { // from class: X.1A1i
                public final /* synthetic */ ReusedUISlotAssem<RECEIVER> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view2, int i2, ViewGroup viewGroup) {
                    if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    this.LIZ.ap(view2, (ViewGroup) viewFindViewById);
                }
            });
            return;
        }
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZJ)) {
            View viewLIZ = C20742916Ex.LIZ(contextSo, iOo, new FrameLayout(contextSo), false, -1);
            if (viewLIZ != null) {
                ap(viewLIZ, (ViewGroup) viewFindViewById);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZLLL)) {
            final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            if (this instanceof InterfaceC738310Sxh) {
                asyncLifecycle$assem_release(new InterfaceC738360Sxm() { // from class: X.0Sdu
                    @Override // X.InterfaceC738360Sxm
                    public final Unit apply(Object obj) {
                        View view2 = (View) obj;
                        viewGroup.addView(view2);
                        this.Eo(view2);
                        return Unit.LIZ;
                    }
                }, new AwS97S0201000_11(context, (Context) iOo, (int) this, (ReusedUISlotAssem<C03H5>) 2));
                return;
            } else {
                C725080ScM.LIZ().execute(new Runnable() { // from class: X.0SdX
                    public final void LIZ() {
                        final View viewLIZJ = C20673215v0.LIZJ(iOo, C737910Sx3.LIZIZ(context));
                        ReusedUISlotAssem<C03H5> reusedUISlotAssem2 = this;
                        reusedUISlotAssem2.LLJJJJJIL = viewLIZJ;
                        if (reusedUISlotAssem2.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                            this.Ao(viewLIZJ);
                        }
                        Handler handler = (Handler) this.LLJJJJ.getValue();
                        final ViewGroup viewGroup2 = viewGroup;
                        final ReusedUISlotAssem<C03H5> reusedUISlotAssem3 = this;
                        C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0SdY
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ReusedUISlotAssem@adb9.asyncInflate$3$1");
                                try {
                                    viewGroup2.addView(viewLIZJ);
                                    reusedUISlotAssem3.Eo(viewLIZJ);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ReusedUISlotAssem@adb9.asyncInflate$3$1");
                            }
                        });
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ReusedUISlotAssem@adb9.asyncInflate$3");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ReusedUISlotAssem@adb9.asyncInflate$3");
                    }
                });
                return;
            }
        }
        if (Intrinsics.LJFF(c1163440gNi, C1163440gNi.LIZ)) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
            if (!Intrinsics.LJFF(contextSo, context)) {
                layoutInflaterNe = layoutInflaterNe.cloneInContext(contextSo);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
            View viewTd = C786410Ut5.Td(layoutInflaterNe, iOo, viewGroup2, false);
            if (viewTd != null) {
                ap(viewTd, viewGroup2);
                return;
            }
            return;
        }
        if (c1163440gNi instanceof C1163430gNh) {
            C1163440gNi c1163440gNi2 = this.LLJJJIL;
            if (!(c1163440gNi2 instanceof C1163430gNh) || (c1163430gNh = (C1163430gNh) c1163440gNi2) == null || (interfaceC201986141o = c1163430gNh.LJ) == null) {
                return;
            }
            interfaceC201986141o.LIZ(contextSo, iOo, viewFindViewById, new AwS399S0200000_33((ReusedUISlotAssem) this, viewFindViewById, (View) 4));
        }
    }

    public final boolean bp() {
        return this.LLJJJJJIL != null;
    }

    public final View getContentView() {
        View view = this.LLJJJJJIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnDestroy$assem_release() {
        if (C725080ScM.LJJI) {
            Zo(new AwS579S0100000_35(this, 91), isOverrideOnDestroyAsync() ? AFwS283S0000000_35.get$arr$(12) : null, new AwS579S0100000_35(this, 92), Lifecycle.Event.ON_DESTROY);
        } else {
            super.handleOnDestroy$assem_release();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnPause$assem_release() {
        if (C725080ScM.LJJI) {
            Zo(new AwS579S0100000_35(this, 93), isOverrideOnPauseAsync() ? AFwS283S0000000_35.get$arr$(13) : null, new AwS579S0100000_35(this, 94), Lifecycle.Event.ON_PAUSE);
        } else {
            super.handleOnPause$assem_release();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void handleOnResume() {
        if (C725080ScM.LJJI) {
            Zo(new C2263331DiN(this), isOverrideOnResumeAsync() ? new C738480Sxy() : null, new C0SCX(this), Lifecycle.Event.ON_RESUME);
        } else {
            super.handleOnResume();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnStart$assem_release() {
        if (C725080ScM.LJJI) {
            Zo(new C2263341DiO(this), isOverrideOnStartAsync() ? new C2263381DiS() : null, new C2263321DiM(this), Lifecycle.Event.ON_START);
        } else if (!C725080ScM.LJI || !Vo()) {
            super.handleOnStart$assem_release();
        } else {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            kp(new AwS579S0100000_35(this, 95));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnStop$assem_release() {
        if (C725080ScM.LJJI) {
            Zo(new AwS579S0100000_35(this, 96), isOverrideOnStopAsync() ? AFwS283S0000000_35.get$arr$(14) : null, new AwS579S0100000_35(this, 97), Lifecycle.Event.ON_STOP);
        } else {
            super.handleOnStop$assem_release();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (C725080ScM.LJJI) {
            super.onDestroy();
        } else {
            kp(new AwS579S0100000_35(this, 86));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onPause() {
        if (C725080ScM.LJJI) {
            super.onPause();
        } else {
            kp(new AwS579S0100000_35(this, 87));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        if (C725080ScM.LJJI) {
            super.onResume();
        } else {
            kp(new AwS579S0100000_35(this, 88));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onStart() {
        if (C725080ScM.LJJI) {
            super.onStart();
        } else {
            kp(new AwS579S0100000_35(this, 89));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onStop() {
        if (C725080ScM.LJJI) {
            super.onStop();
        } else {
            kp(new AwS579S0100000_35(this, 90));
        }
    }

    public ReusedUISlotAssem() {
        new LinkedList();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void oo() {
        if (bp()) {
            C786410Ut5.LJLLLLLL(8, getContentView());
        }
    }

    public static void lp(Function0 function0) {
        C724240Sb0.LJII(new C2263391DiT(function0));
    }

    public final void kp(final Function0<Unit> function0) {
        if (Intrinsics.LJFF(this.LLJJJIL, C1163440gNi.LIZLLL)) {
            C725080ScM.LIZ().execute(new Runnable(this) { // from class: X.1A29
                public final /* synthetic */ ReusedUISlotAssem<RECEIVER> LL;

                {
                    this.LL = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReusedUISlotAssem@adb9.runAsyncLifecycle$1");
                    try {
                        C723830SaL.LIZIZ(this.LL, new C1A2A(function0));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReusedUISlotAssem@adb9.runAsyncLifecycle$1");
                }
            });
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[PHI: r1
      0x0016: PHI (r1v3 X.0gNi) = (r1v2 X.0gNi), (r1v1 X.0gNi), (r1v0 X.0gNi) binds: [B:17:0x0045, B:12:0x002e, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mp(X.C1163440gNi r3) {
        /*
            r2 = this;
            X.0gNi r1 = X.C1163440gNi.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L1a
            X.01GW<java.lang.Boolean> r0 = com.bytedance.assem.arch.reused.ReusedUISlotAssem.LLJJJJLIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
        L16:
            r3 = r1
        L17:
            r2.LLJJJIL = r3
            return
        L1a:
            X.0gNi r1 = X.C1163440gNi.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L31
            X.01GW<java.lang.Boolean> r0 = com.bytedance.assem.arch.reused.ReusedUISlotAssem.LLJJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            goto L16
        L31:
            X.0gNi r1 = X.C1163440gNi.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L48
            X.01GW<java.lang.Boolean> r0 = com.bytedance.assem.arch.reused.ReusedUISlotAssem.LLJJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            goto L16
        L48:
            boolean r0 = r3 instanceof X.C1163430gNh
            if (r0 != 0) goto L17
            X.0gNi r3 = X.C1163440gNi.LIZ
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.reused.ReusedUISlotAssem.mp(X.0gNi):void");
    }

    public final void ap(final View view, ViewGroup viewGroup) {
        AwS590S0100000_11 awS590S0100000_11;
        viewGroup.addView(view);
        this.LLJJJJJIL = view;
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm(this) { // from class: X.0Sdt
            public final /* synthetic */ ReusedUISlotAssem<C03H5> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                this.LIZ.Ao(view);
                this.LIZ.Eo(view);
                return Unit.LIZ;
            }
        };
        if (isOverrideOnViewCreatedAsync()) {
            awS590S0100000_11 = new AwS590S0100000_11(view, 555);
        } else {
            awS590S0100000_11 = null;
        }
        asyncLifecycle$assem_release(interfaceC738360Sxm, awS590S0100000_11);
    }

    private final void Zo(final Function0<Unit> function0, Function1<? super InterfaceC738310Sxh, Unit> function1, final Function0<Unit> function02, Lifecycle.Event event) {
        AwS612S0100000_33 awS612S0100000_33;
        this.lifecycleRegistry.handleLifecycleEvent(event);
        if (!(this instanceof InterfaceC738310Sxh)) {
            kp(new C2263281DiI(function0, this, function02));
            return;
        }
        if (Intrinsics.LJFF(this.LLJJJIL, C1163440gNi.LIZLLL)) {
            asyncLifecycle$assem_release(new InterfaceC738360Sxm() { // from class: X.1DiG
                @Override // X.InterfaceC738360Sxm
                public final Unit apply(Object obj) {
                    function02.invoke();
                    return Unit.LIZ;
                }
            }, new AwS242S0300000_33((Function1) function1, (Function1<? super InterfaceC738310Sxh, Unit>) this, (Function0) function0, (Function0<Unit>) 4));
            return;
        }
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.1DiH
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                function0.invoke();
                function02.invoke();
                return Unit.LIZ;
            }
        };
        if (function1 != null) {
            awS612S0100000_33 = new AwS612S0100000_33(function1, (Function1<? super InterfaceC738310Sxh, Unit>) 39);
        } else {
            awS612S0100000_33 = null;
        }
        asyncLifecycle$assem_release(interfaceC738360Sxm, awS612S0100000_33);
    }
}
