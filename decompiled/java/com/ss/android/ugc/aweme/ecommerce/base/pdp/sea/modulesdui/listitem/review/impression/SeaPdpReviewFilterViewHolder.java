package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.impression;

import X.C01GW;
import X.C04IT;
import X.C13LE;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpReviewFilterViewHolder extends AbsFullSpanVH<C04IT> {
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpReviewFilterViewHolder(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.asl, context, viewGroup, false, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 71));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:13:0x00ad, B:15:0x00b7, B:17:0x00bd, B:22:0x00ca, B:24:0x00d4, B:18:0x00c0, B:20:0x00c6), top: B:60:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #1 {all -> 0x00dc, blocks: (B:13:0x00ad, B:15:0x00b7, B:17:0x00bd, B:22:0x00ca, B:24:0x00d4, B:18:0x00c0, B:20:0x00c6), top: B:60:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:30:0x0110, B:32:0x011a, B:34:0x0120, B:39:0x012d, B:40:0x0135, B:35:0x0123, B:37:0x0129), top: B:58:0x0110 }] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.impression.SeaPdpReviewFilterViewHolder.rr(java.lang.Object):void");
    }
}
