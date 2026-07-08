package com.ss.android.ugc.aweme.poi.creator;

import X.AbstractC738140SxQ;
import X.C0I7D;
import X.C1197680hGw;
import X.C1197690hGx;
import X.C1208740hYm;
import X.C1208860hYy;
import X.C1220000hqw;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C166V;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorSearchAssem extends UISlotAssem implements PromoteStoresAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 285));
    public C0I7D LLJJIII;
    public FrameLayout LLJJIJI;
    public final C736950SvV LLJJIJIIJIL;
    public String LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCreatorSearchAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiCreatorSearchViewBinding;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzb;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 297760322) {
            return null;
        }
        return this;
    }

    public PoiCreatorSearchAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(312);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(338), new AwS562S0100000_18((AbstractC738140SxQ) this, 986), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIL = "";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJIIJIL.getValue();
        PoiCreatorVM poiCreatorVM = (PoiCreatorVM) this.LLJJIJIIJIL.getValue();
        C1197690hGx c1197690hGx = poiCreatorVM.LLIZLLLIL;
        if (c1197690hGx != null) {
            c1197690hGx.LIZLLL = true;
        }
        poiCreatorVM.LLIZLLLIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public final void hp(String str) {
        this.LLJJIJIIJIL.getValue();
        PoiCreatorVM poiCreatorVM = (PoiCreatorVM) this.LLJJIJIIJIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[searchPoi] keyword=");
        sbLIZ.append(str);
        sbLIZ.append(", showLoading=");
        int i = 0;
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            C1197690hGx c1197690hGx = poiCreatorVM.LLIZLLLIL;
            if (c1197690hGx != null) {
                c1197690hGx.LIZLLL = true;
            }
            poiCreatorVM.LLIZLLLIL = null;
        } else if (poiCreatorVM.LLIZLLLIL == null) {
            poiCreatorVM.LLIZLLLIL = new C1197690hGx(Long.valueOf(System.currentTimeMillis()), Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis()));
        }
        poiCreatorVM.xQ2(str);
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null) {
            if (!C123100dR.LIZ(str)) {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        this.LLJJIII = ((C1197680hGw) c166v.LIZ(this)).LLILLL;
        this.LLJJIJI = ((C1197680hGw) this.LLJJI.LIZ(this)).LLILZ;
        Context context = getContext();
        if (context != null) {
            ConstraintLayout constraintLayout = ((C1197680hGw) this.LLJJI.LIZ(this)).LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, context);
            if (numLIZJ == null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.br, context);
            }
            c384050F3z.LIZ = numLIZJ;
            constraintLayout.setBackground(c384050F3z.LIZ(context));
        }
        FrameLayout frameLayout = this.LLJJIJI;
        if (frameLayout != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 18, 42), frameLayout);
        }
        C0I7D c0i7d = this.LLJJIII;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(new C1208860hYy(this, 5));
        }
        C0I7D c0i7d2 = this.LLJJIII;
        if (c0i7d2 != null) {
            c0i7d2.setOnEditorActionListener(new C1208740hYm(this, 1));
        }
    }
}
