package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0I7D;
import X.C1208740hYm;
import X.C1208860hYy;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C2188811AlT;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ATListenerS451S0100000_18;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimSearchAssem extends UIContentAssem implements IPoiClaimSearchAssemAbility, InterfaceC1554640qYg {
    public FrameLayout LLIZLLLIL;
    public C0I7D LLJ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public String LLJILJILJ;
    public final C1208860hYy LLJILLL;
    public final C1208740hYm LLJJ;
    public final ATListenerS451S0100000_18 LLJJI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2076409675) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSearchAssemAbility
    public final void LJLZ() {
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            KeyboardUtils.LIZIZ(c0i7d);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSearchAssemAbility
    public final void iC1() {
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            c0i7d.setText("");
            c0i7d.requestFocus();
            c0i7d.setCursorVisible(true);
            c0i7d.setSelection(0);
        }
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
    }

    public PoiClaimSearchAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(279);
        this.LLJI = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(284), new AwS562S0100000_18((AbstractC738140SxQ) this, 889), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 887));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 888));
        this.LLJILJILJ = "";
        this.LLJILLL = new C1208860hYy(this, 4);
        this.LLJJ = new C1208740hYm(this, 0);
        this.LLJJI = new ATListenerS451S0100000_18(this, 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            c0i7d.removeTextChangedListener(this.LLJILLL);
            c0i7d.setOnEditorActionListener(null);
            c0i7d.setOnTouchListener(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimSearchAssem onViewCreated hashCode=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.qyf);
        this.LLJ = (C0I7D) view.findViewById(R.id.qyx);
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 53, 42), frameLayout);
        }
        C0I7D c0i7d = this.LLJ;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(this.LLJILLL);
        }
        C0I7D c0i7d2 = this.LLJ;
        if (c0i7d2 != null) {
            c0i7d2.setOnEditorActionListener(this.LLJJ);
        }
        C0I7D c0i7d3 = this.LLJ;
        if (c0i7d3 != null) {
            c0i7d3.setOnTouchListener(this.LLJJI);
        }
    }

    public final void Go(String str, boolean z) {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        IPoiClaimListAssemAbility iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) this.LLJIJIL.getValue();
        if (iPoiClaimListAssemAbility != null) {
            iPoiClaimListAssemAbility.nf(str);
        }
        IPoiClaimListAssemAbility iPoiClaimListAssemAbility2 = (IPoiClaimListAssemAbility) this.LLJIJIL.getValue();
        if (iPoiClaimListAssemAbility2 != null) {
            iPoiClaimListAssemAbility2.uh(str, z);
        }
    }
}
