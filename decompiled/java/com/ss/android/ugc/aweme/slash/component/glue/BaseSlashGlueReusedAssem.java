package com.ss.android.ugc.aweme.slash.component.glue;

import X.C098200Yq;
import X.C1163090gN9;
import X.C1163440gNi;
import X.C1180170goh;
import X.C189200o6;
import X.C19719912Dl;
import X.C723830SaL;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSlashGlueReusedAssem<T extends BaseComponentData> extends BaseSlashReusedComponent<T> {
    public final C1163090gN9<T> LLJL = new C1163090gN9<>(null);
    public boolean LLJLIL;

    public abstract C19719912Dl sp(BaseComponentData baseComponentData);

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        this.LLJL.LLILLJJLI.setValue(UUID.randomUUID().toString());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Co() {
        super.Co();
    }

    public C1163440gNi tp() {
        return C1163440gNi.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent
    /* JADX INFO: renamed from: op */
    public void up(T t) {
        Integer numValueOf;
        Object c098200Yq;
        super.up(t);
        this.LLJL.LL.setValue(t);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (!this.LLJLIL && numValueOf != null && numValueOf.intValue() != -1) {
            this.LLJLIL = true;
            try {
                C723830SaL.LIZ(this, null, new AwS227S0300000_18((BaseSlashGlueReusedAssem) this, (BaseSlashGlueReusedAssem<Integer>) t, numValueOf, (Integer) 32));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1180170goh.LIZLLL().LIZIZ("Slash", new AwS562S0100000_18(thM5exceptionOrNullimpl, 2241));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((BaseComponentData) obj);
    }
}
