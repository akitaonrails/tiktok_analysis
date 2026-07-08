package com.ss.android.ugc.aweme.poi.mapdetail.assem;

import X.C01D1;
import X.C1189060h32;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailMapButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public View LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapDetailMapButtonAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapdetail/viewmodel/PoiMapDetailPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiMapDetailMapButtonAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapDetailPageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1399), AFwS256S0000000_18.get$arr$(480), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZ;
        Context context2;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.nze);
        this.LLJ = viewFindViewById;
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            View view2 = this.LLJ;
            if (view2 != null && (context = view2.getContext()) != null && C960203pA.LIZIZ(context)) {
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
                c384050F3z.LIZLLL = Integer.valueOf((int) C339190DRl.LIZ(1));
                View view3 = this.LLJ;
                if (view3 != null && (context2 = view3.getContext()) != null) {
                    numLIZ = C1308910kAL.LIZ(R.attr.a03, context2);
                } else {
                    numLIZ = null;
                }
                c384050F3z.LJ = numLIZ;
            } else {
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            }
            Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(0);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(50);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            viewFindViewById.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext())));
        }
        View view4 = this.LLJ;
        if (view4 != null) {
            C1189060h32.LJJIIJ(view4, new AwS597S0100000_18(this, 398));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ghk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0ghl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1175650ghP) obj).LLILLJJLI;
            }
        }, null, new AwS667S0100000_18(this, 4), 12);
    }
}
