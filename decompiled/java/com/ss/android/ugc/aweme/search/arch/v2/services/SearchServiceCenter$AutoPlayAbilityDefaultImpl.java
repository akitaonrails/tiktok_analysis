package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C01GW;
import X.C452501pT;
import X.C640750PBh;
import X.InterfaceC658510PsH;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchServiceCenter$AutoPlayAbilityDefaultImpl implements SearchServiceCenter$AutoPlayAbility {
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(155));

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final View Vt() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public void kC0(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public final boolean mm() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public void J0() {
        Iterator it2 = ((ArrayList) this.LL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC658510PsH) it2.next()).J0();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public void LLZZZZ() {
        Iterator it2 = ((ArrayList) this.LL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC658510PsH) it2.next()).LLZZZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
    public void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
        function0.invoke();
    }
}
