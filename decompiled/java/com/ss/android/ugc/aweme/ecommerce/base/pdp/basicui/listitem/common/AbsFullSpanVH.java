package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common;

import X.C03J8;
import X.C04CS;
import X.C0NJ1;
import X.C1388190mED;
import X.C13LE;
import X.C1755030vlt;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C2528109vT;
import X.C452501pT;
import X.InterfaceC1053404Aa;
import X.InterfaceC1752680vi6;
import X.InterfaceC1755040vlu;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public abstract class AbsFullSpanVH<ITEM> extends ECJediViewHolder<ITEM> {
    public C0NJ1 LLJILJIL;
    public C04CS LLJILJILJ;
    public InterfaceC1752680vi6 LLJILLL;
    public int LLJJ;
    public ITEM LLJJI;
    public InterfaceC1053404Aa LLJJIII;
    public PdpViewModel LLJJIJI;
    public InterfaceC1755040vlu LLJJIJIIJIL;

    public boolean W5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onStop() {
        b6(null);
    }

    public final ITEM X5() {
        ITEM item = this.LLJJI;
        return item == null ? this.LLILLJJLI : item;
    }

    public final PdpViewModel a6() {
        PdpViewModel pdpViewModel = this.LLJJIJI;
        if (pdpViewModel != null) {
            return pdpViewModel;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
        return (PdpViewModel) C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 58)).getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        C03J8.LIZ(this.itemView, true);
    }

    public AbsFullSpanVH(View view) {
        super(view);
        this.LLJJ = -1;
    }

    public final void b6(C1755030vlt c1755030vlt) {
        this.itemView.setTag(R.id.ei0, c1755030vlt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void V5(List list, int i, Object obj) {
        Context context;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        Context context2 = this.itemView.getContext();
        if ((context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null && c19egLIZIZ2.isFinishing()) || ((context = this.itemView.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && c19egLIZIZ.isDestroyed())) {
            IllegalStateException illegalStateException = new IllegalStateException("activity is null");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getClass().getSimpleName());
            sbLIZ.append(" onBind, activity is finishing or destroyed!");
            C1AF0.LJFF(illegalStateException, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C03J8.LIZ(this.itemView, W5());
        if (Intrinsics.LJFF(obj, this.LLJJI) && C2528109vT.LIZ) {
            return;
        }
        this.LLJJI = obj;
        super.V5(list, i, obj);
    }
}
