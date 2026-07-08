package com.ss.android.ugc.aweme.ecommerce.search.general.productcard.ui;

import X.C01GW;
import X.C0Q3E;
import X.C1018703yb;
import X.C452501pT;
import X.C643110PKj;
import X.C663060Pzc;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchProductCardAssem extends ReusedUISlotAssem<EcSearchProductCardAssem> implements InterfaceC712990Rxx<C643110PKj>, View.OnAttachStateChangeListener {
    public View LLJJLIIIJLLLLLLLZ;
    public C643110PKj LLJL;
    public TuxTextView LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public ConstraintLayout LLJZ;
    public boolean LLJZIJLIL;
    public final C01GW LLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(72));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.brq;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ISearchContextAbility iSearchContextAbilityLIZ;
        if (this.LLJZIJLIL) {
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        ISearchContextAbility iSearchContextAbilityLIZ2 = null;
        if (view2 != null) {
            iSearchContextAbilityLIZ = C0Q3E.LIZ(view2);
        } else {
            iSearchContextAbilityLIZ = null;
        }
        C643110PKj c643110PKj = this.LLJL;
        Map mapLIZ = C663060Pzc.LIZ(iSearchContextAbilityLIZ, c643110PKj);
        C663060Pzc.LIZJ(mapLIZ, iSearchContextAbilityLIZ, c643110PKj);
        C1018703yb.LIZIZ("search_result_show", mapLIZ);
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            iSearchContextAbilityLIZ2 = C0Q3E.LIZ(view3);
        }
        Map mapLIZ2 = C663060Pzc.LIZ(iSearchContextAbilityLIZ2, this.LLJL);
        C663060Pzc.LIZIZ(mapLIZ2, iSearchContextAbilityLIZ2);
        C1018703yb.LIZIZ("tiktokec_product_show", mapLIZ2);
        this.LLJZIJLIL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view;
        view.addOnAttachStateChangeListener(this);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.rzz);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.rxg);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.rxe);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.rys);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.v5w);
        this.LLJZ = (ConstraintLayout) view.findViewById(R.id.eqx);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0228  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C643110PKj r18) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.general.productcard.ui.EcSearchProductCardAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C643110PKj c643110PKj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C643110PKj c643110PKj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
