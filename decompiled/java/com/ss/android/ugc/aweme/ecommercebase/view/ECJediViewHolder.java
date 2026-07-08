package com.ss.android.ugc.aweme.ecommercebase.view;

import X.C03H8;
import X.C1743750vTh;
import X.C1AF0;
import X.C2188811AlT;
import X.InterfaceC1743770vTj;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public abstract class ECJediViewHolder<ITEM> extends JediSimpleViewHolder<ITEM> implements C03H8, InterfaceC1743770vTj {
    public int LLJI;
    public boolean LLJIJIL;

    public void onEvent(String str, String str2) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onDestroy() {
        C1743750vTh.LIZ(this);
    }

    public ECJediViewHolder(View view) {
        super(view);
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void V5(List list, int i, Object obj) {
        try {
            rr(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind uncaught EC error: msg = ");
            sbLIZ.append(th.getMessage());
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
            throw th;
        }
    }
}
