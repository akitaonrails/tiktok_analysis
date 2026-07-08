package com.ss.android.ugc.aweme.cell;

import X.AbstractC19293010ds;
import X.AnonymousClass1278;
import X.C11GO;
import X.C127M;
import X.C20693415yG;
import X.C20693515yH;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.widget.CompoundButton;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class RadioCell extends TuxCell<C20693415yG, AnonymousClass1278> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell
    /* JADX INFO: renamed from: L5 */
    public final void onBindItemView(AbstractC19293010ds abstractC19293010ds) {
        C20693415yG c20693415yG = (C20693415yG) abstractC19293010ds;
        super.onBindItemView(c20693415yG);
        C11GO c11go = (C11GO) this.LL;
        if (c11go != null) {
            c11go.LJIILJJIL(c20693415yG.LLJJIJIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(context);
        C20693415yG c20693415yG = (C20693415yG) getItem();
        if (c20693415yG != null) {
            onCheckedChangeListener = c20693415yG.LLJJJ;
        } else {
            onCheckedChangeListener = null;
        }
        anonymousClass1278.LJIILLIIL(onCheckedChangeListener);
        anonymousClass1278.LJIILL(new AwS575S0100000_31(this, 1525));
        return anonymousClass1278;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C20693515yH c20693515yH) {
        C20693415yG c20693415yG = (C20693415yG) c20693515yH;
        super.onBindItemView(c20693415yG);
        C11GO c11go = (C11GO) this.LL;
        if (c11go != null) {
            c11go.LJIILJJIL(c20693415yG.LLJJIJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20693415yG c20693415yG = (C20693415yG) interfaceC1891350zJl;
        super.onBindItemView(c20693415yG);
        C11GO c11go = (C11GO) this.LL;
        if (c11go != null) {
            c11go.LJIILJJIL(c20693415yG.LLJJIJIL);
        }
    }
}
