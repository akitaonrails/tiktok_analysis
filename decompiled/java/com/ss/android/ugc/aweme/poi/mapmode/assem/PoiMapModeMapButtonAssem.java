package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C01D1;
import X.C0TVI;
import X.C1189060h32;
import X.C13LE;
import X.C14K9;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.os.Build;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeMapButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public View LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeMapButtonAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapModeMapButtonAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1460), AFwS256S0000000_18.get$arr$(507), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0gfD
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.nze);
        this.LLJ = viewFindViewById;
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        View view2 = this.LLJ;
        if (view2 != null) {
            C1189060h32.LJJIIJ(view2, new AwS597S0100000_18(this, 406));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gfH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gfC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 41), 12);
    }
}
