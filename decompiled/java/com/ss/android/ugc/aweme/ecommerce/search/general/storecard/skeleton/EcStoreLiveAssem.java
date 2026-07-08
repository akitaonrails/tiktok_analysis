package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton;

import X.C0R48;
import X.C661010PwJ;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC662780PzA;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcStoreLiveAssem extends ReusedUISlotAssem<EcStoreLiveAssem> implements InterfaceC712990Rxx<C661010PwJ> {
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public FixedRatioFrameLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C661010PwJ LLJLL;
    public InterfaceC662780PzA LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bqp;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLLIL = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final LinearLayout op() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.koe) : null;
            this.LLJL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final FixedRatioFrameLayout sp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ubv) : null;
            this.LLJLIL = (FixedRatioFrameLayout) viewFindViewById;
        }
        return (FixedRatioFrameLayout) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 4));
        view.addOnAttachStateChangeListener(new C0R48(view, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0PPF, X.0PzA] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C661010PwJ r19) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C661010PwJ c661010PwJ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C661010PwJ c661010PwJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
