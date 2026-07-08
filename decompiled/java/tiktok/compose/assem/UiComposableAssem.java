package tiktok.compose.assem;

import X.C13IQ;
import X.C1669670tYD;
import X.C19719212De;
import X.EnumC1427810nG7;
import X.InterfaceC0148002o;
import X.InterfaceC1680500tpg;
import X.InterfaceC724760Sbq;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS168S0400000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class UiComposableAssem<S extends InterfaceC0148002o> extends UIAssem {
    public static final int LLJ = 8;
    public transient C13IQ<AssemViewModel<S>> LLIZ;
    public transient InterfaceC724760Sbq LLIZLLLIL;

    public abstract void Co(S s, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ComposeView)) {
            throw new IllegalArgumentException("containerView must be a ComposeView");
        }
        C13IQ<AssemViewModel<S>> c13iq = this.LLIZ;
        if (c13iq == null) {
            throw new IllegalArgumentException("vmClass must be assigned");
        }
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((UiComposableAssem) this, 1830);
        if (!so()) {
            throw new IllegalStateException("ContainerView should be assigned");
        }
        C1669670tYD.LJ((ComposeView) viewLJJIJL, EnumC1427810nG7.Auto, new C19719212De(1863201230, new AwS168S0400000_9(viewLJJIJL, awS553S0100000_9, (C13IQ) c13iq, (UiComposableAssem) this, 0), true));
        oo(LJJIJL());
    }

    public final C13IQ<AssemViewModel<S>> Eo() {
        return this.LLIZ;
    }

    public final InterfaceC724760Sbq Fo() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
    }

    public final void Go(C13IQ<AssemViewModel<S>> c13iq) {
        this.LLIZ = c13iq;
    }

    public final void Ho(InterfaceC724760Sbq interfaceC724760Sbq) {
        this.LLIZLLLIL = interfaceC724760Sbq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
    }
}
