package com.ss.android.ugc.aweme.slash.component.glue;

import X.C01S9;
import X.C09IC;
import X.C0CAU;
import X.C1163090gN9;
import X.C1173310gdd;
import X.C1173320gde;
import X.C1192290h8F;
import X.C1559260qg8;
import X.C295220Bhg;
import X.C723580SZw;
import X.C786410Ut5;
import X.C861640Xr8;
import X.InterfaceC1183590guD;
import X.InterfaceC332260D0u;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSlashGlueSlotAssemComponent<T extends BaseComponentData> extends BaseSlashSlotAssemComponent<T> {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1163090gN9.class, null), checkSupervisorPrepared());
    public boolean LLJJIII;
    public boolean LLJJIJI;

    public final void ip() {
        C01S9 c01s9;
        C1163090gN9 c1163090gN9 = (C1163090gN9) this.LLJJI.getValue();
        if (c1163090gN9 == null || (c01s9 = c1163090gN9.LL) == null) {
            return;
        }
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1173310gdd(this, null), c01s9));
    }

    public final void kp() {
        InterfaceC332260D0u<String> interfaceC332260D0u;
        C1163090gN9 c1163090gN9 = (C1163090gN9) this.LLJJI.getValue();
        if (c1163090gN9 == null || (interfaceC332260D0u = c1163090gN9.LLILLJJLI) == null) {
            return;
        }
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1173320gde(this, null), interfaceC332260D0u));
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        this.LLJJIII = true;
        if (this.LLJJIJI && C295220Bhg.LIZJ()) {
            if (!nJ()) {
                ip();
            }
            kp();
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!C295220Bhg.LIZJ()) {
            if (!nJ()) {
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS118S0100000_18(this, 78));
            }
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS118S0100000_18(this, 79));
        }
    }

    public final void pH(Function1<? super InterfaceC1183590guD, Unit> function1) {
        if (getParent() instanceof BaseSlashReusedComponent) {
            C1192290h8F.LIZJ(getParent(), function1);
        } else {
            C1192290h8F.LIZJ(this, function1);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void vo(View view) {
        super.vo(view);
        this.LLJJIJI = true;
        if (this.LLJJIII && C295220Bhg.LIZJ()) {
            if (!nJ()) {
                ip();
            }
            kp();
        }
    }
}
