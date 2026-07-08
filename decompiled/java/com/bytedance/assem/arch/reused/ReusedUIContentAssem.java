package com.bytedance.assem.arch.reused;

import X.C01GW;
import X.C03H5;
import X.C0RCK;
import X.C2188811AlT;
import X.C2263241DiE;
import X.C2263291DiJ;
import X.C2263301DiK;
import X.C2263311DiL;
import X.C2263351DiP;
import X.C2263361DiQ;
import X.C2263371DiR;
import X.C452501pT;
import X.C723850SaN;
import X.C725080ScM;
import X.C738320Sxi;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC738310Sxh;
import X.InterfaceC738360Sxm;
import Y.ARunnableS135S0100000_35;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.storytopost.StoryToPostStateComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public abstract class ReusedUIContentAssem<RECEIVER extends C03H5> extends ReusedUIAssem<RECEIVER> {
    public int LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, new C0RCK());

    public void Vo() {
    }

    public void Zo() {
    }

    public void ap() {
    }

    public void bp() {
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

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void mo() {
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnDestroy$assem_release() {
        if (C725080ScM.LJJI) {
            Oo(new AwS579S0100000_35(this, 79), isOverrideOnDestroyAsync() ? AFwS283S0000000_35.get$arr$(9) : null, new AwS579S0100000_35(this, 80), Lifecycle.Event.ON_DESTROY);
        } else {
            super.handleOnDestroy$assem_release();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnPause$assem_release() {
        if (C725080ScM.LJJI) {
            Oo(new AwS579S0100000_35(this, 81), isOverrideOnPauseAsync() ? AFwS283S0000000_35.get$arr$(10) : null, new AwS579S0100000_35(this, 82), Lifecycle.Event.ON_PAUSE);
        } else {
            super.handleOnPause$assem_release();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void handleOnResume() {
        if (C725080ScM.LJJI) {
            Oo(new C2263291DiJ(this), isOverrideOnResumeAsync() ? new C2263361DiQ() : null, new C2263241DiE(this), Lifecycle.Event.ON_RESUME);
        } else {
            super.handleOnResume();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnStart$assem_release() {
        if (C725080ScM.LJJI) {
            Oo(new C2263301DiK(this), isOverrideOnStartAsync() ? new C2263371DiR() : null, new C2263311DiL(this), Lifecycle.Event.ON_START);
        } else if (!C725080ScM.LJI || !(!(this instanceof StoryToPostStateComponent))) {
            super.handleOnStart$assem_release();
        } else {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            C723850SaN.LJI(new AwS579S0100000_35(this, 83));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnStop$assem_release() {
        if (C725080ScM.LJJI) {
            Oo(new AwS579S0100000_35(this, 84), isOverrideOnStopAsync() ? AFwS283S0000000_35.get$arr$(11) : null, new AwS579S0100000_35(this, 85), Lifecycle.Event.ON_STOP);
        } else {
            super.handleOnStop$assem_release();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (C725080ScM.LJJI) {
            super.onDestroy();
            return;
        }
        Vo();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            super.onDestroy();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJJIL.getValue(), new ARunnableS135S0100000_35(this, 3));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onPause() {
        if (C725080ScM.LJJI) {
            super.onPause();
            return;
        }
        Zo();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            super.onPause();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJJIL.getValue(), new ARunnableS135S0100000_35(this, 4));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        if (C725080ScM.LJJI) {
            super.onResume();
            return;
        }
        ap();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            super.onResume();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJJIL.getValue(), new ARunnableS135S0100000_35(this, 5));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onStart() {
        if (C725080ScM.LJJI) {
            super.onStart();
            return;
        }
        bp();
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            super.onStart();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJJIL.getValue(), new ARunnableS135S0100000_35(this, 6));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onStop() {
        if (C725080ScM.LJJI) {
            super.onStop();
        } else if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            super.onStop();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJJIL.getValue(), new ARunnableS135S0100000_35(this, 2));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Co() {
        View view;
        ReusedUISlotAssem reusedUISlotAssem;
        View contentView;
        if (Bo()) {
            So(LJJIJL());
            return;
        }
        if (this.LLJJIJIL == 0 || (view = getSupervisor().LLJJIII) == null) {
            return;
        }
        View viewFindViewById = view.findViewById(this.LLJJIJIL);
        if (viewFindViewById == null) {
            LifecycleOwner parent = getParent();
            if (!(parent instanceof ReusedUISlotAssem) || (reusedUISlotAssem = (ReusedUISlotAssem) parent) == null || (contentView = reusedUISlotAssem.getContentView()) == null || (viewFindViewById = contentView.findViewById(this.LLJJIJIL)) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can not find view for ");
                sbLIZ.append(this);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        }
        if (!(viewFindViewById instanceof ViewStub)) {
            So(viewFindViewById);
            return;
        }
        int i = this.LLJJJ;
        if (i != 0) {
            ((ViewStub) viewFindViewById).setLayoutResource(i);
        }
        So(C786410Ut5.LJLLLL((ViewStub) viewFindViewById));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public void oo() {
        if (Bo()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }

    public final void So(View view) {
        C738320Sxi c738320Sxi;
        this.LLJJI = view;
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm(this) { // from class: X.0Se1
            public final /* synthetic */ ReusedUIContentAssem<RECEIVER> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                ReusedUIAssem reusedUIAssem = this.LIZ;
                reusedUIAssem.Ao(reusedUIAssem.LJJIJL());
                ReusedUIAssem reusedUIAssem2 = this.LIZ;
                reusedUIAssem2.Eo(reusedUIAssem2.LJJIJL());
                return Unit.LIZ;
            }
        };
        if (isOverrideOnViewCreatedAsync()) {
            c738320Sxi = new C738320Sxi(this);
        } else {
            c738320Sxi = null;
        }
        asyncLifecycle$assem_release(interfaceC738360Sxm, c738320Sxi);
    }

    public final void Oo(final Function0<Unit> function0, Function1<? super InterfaceC738310Sxh, Unit> function1, final Function0<Unit> function02, Lifecycle.Event event) {
        AwS614S0100000_35 awS614S0100000_35;
        this.lifecycleRegistry.handleLifecycleEvent(event);
        if (!(this instanceof InterfaceC738310Sxh)) {
            function0.invoke();
            C723850SaN.LJI(new C2263351DiP(function02));
            return;
        }
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.1DiF
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                function0.invoke();
                function02.invoke();
                return Unit.LIZ;
            }
        };
        if (function1 != null) {
            awS614S0100000_35 = new AwS614S0100000_35((Function1) function1, 41);
        } else {
            awS614S0100000_35 = null;
        }
        asyncLifecycle$assem_release(interfaceC738360Sxm, awS614S0100000_35);
    }
}
