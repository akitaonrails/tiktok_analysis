package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.waistbanner;

import X.C01GW;
import X.C1020703yv;
import X.C11EA;
import X.C13LE;
import X.C1743750vTh;
import X.C1755030vlt;
import X.C1762930vyd;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpWaistBannerViewHolder extends AbsFullSpanVH<C1020703yv> {
    public final C01GW LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C11EA.LJIIIIZZ(this, c6(), new C2217381BqS() { // from class: X.0vsf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getFlashSaleCountDown();
            }
        }, new C2217381BqS() { // from class: X.0vmS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getFlashSaleState();
            }
        }, new AwS675S0100000_26(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1762930vyd c1762930vyd;
        C1743750vTh.LIZ(this);
        View view = this.itemView;
        if (!(view instanceof C1762930vyd) || (c1762930vyd = (C1762930vyd) view) == null) {
            return;
        }
        c1762930vyd.LLILLJJLI.LLJJJJJIL.LJJJJLI();
    }

    public SeaPdpWaistBannerViewHolder(ViewGroup viewGroup) {
        super(new C1762930vyd(new ContextThemeWrapper(viewGroup.getContext(), R.style.y3)));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 81));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0395 A[Catch: all -> 0x03ba, TryCatch #0 {all -> 0x03ba, blocks: (B:169:0x038f, B:171:0x0395, B:172:0x03a5), top: B:193:0x038f }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.waistbanner.SeaPdpWaistBannerViewHolder.rr(java.lang.Object):void");
    }
}
