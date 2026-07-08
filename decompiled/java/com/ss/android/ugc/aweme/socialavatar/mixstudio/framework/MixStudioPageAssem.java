package com.ss.android.ugc.aweme.socialavatar.mixstudio.framework;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1948707kD;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C439980HNc;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC440890HQp;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MixStudioPageAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C439980HNc LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AtomicBoolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioPageAssem.class, "baseVM", "getBaseVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MixStudioPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioBaseViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 620), AFwS236S0000000_6.get$arr$(314), null, true);
        this.LLJJIJI = new AtomicBoolean(false);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(154));
    }

    public void LLFF() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract EnumC440890HQp ip();

    public void onPagePause() {
    }

    public final MixStudioBaseViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MixStudioBaseViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        if (C13LP.LJJLIIIJJI(hp().getState().LL) == ip() && this.LLJJIJI.compareAndSet(false, true)) {
            LLFF();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (this.LLJJIJI.compareAndSet(true, false)) {
            onPagePause();
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            if (C1948707kD.LIZ().isDebug()) {
                throw new IllegalStateException("MixStudioPageAssem missing context in onCreateView");
            }
            super.xo();
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            this.LLJJI = new C439980HNc(context, fragmentLJI, LifecycleOwnerKt.getLifecycleScope(this), hp().vQ2(), new AwS550S0100000_6(this, 619));
            super.xo();
        } else {
            if (C1948707kD.LIZ().isDebug()) {
                throw new IllegalStateException("MixStudioPageAssem missing fragment in onCreateView");
            }
            super.xo();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0HS5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440510HPd) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 69), 6);
    }
}
