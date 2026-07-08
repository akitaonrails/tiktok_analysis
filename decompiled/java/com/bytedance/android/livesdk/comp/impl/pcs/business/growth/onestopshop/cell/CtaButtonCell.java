package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C1324610kZf;
import X.C13LE;
import X.C16F5;
import X.C1819620xS4;
import X.C1820630xTh;
import X.C1820640xTi;
import X.C1820650xTj;
import X.C1820960xUE;
import X.C1831830xll;
import X.C1831840xlm;
import X.C1831850xln;
import X.C1831860xlo;
import X.C1831870xlp;
import X.C1831880xlq;
import X.C1831890xlr;
import X.C1831900xls;
import X.C1831910xlt;
import X.C1831920xlu;
import X.C1831930xlv;
import X.C1831940xlw;
import X.C1831950xlx;
import X.C1831960xly;
import X.C1831970xlz;
import X.C1831980xm0;
import X.C1831990xm1;
import X.C1832000xm2;
import X.C1832010xm3;
import X.C1832020xm4;
import X.C1832030xm5;
import X.C1832040xm6;
import X.C1832050xm7;
import X.C1832060xm8;
import X.C1832070xm9;
import X.C1832080xmA;
import X.C1832090xmB;
import X.C1832100xmC;
import X.C1832110xmD;
import X.C1832120xmE;
import X.C1832130xmF;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CtaButtonCell extends PowerCell<C1820960xUE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public LiveIconView LLILZ;
    public C16F5 LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CtaButtonCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final OneStopPageVM I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (OneStopPageVM) assemVMLazy.getValue();
    }

    public CtaButtonCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1831850xln c1831850xln = new C1831850xln(c19719912DlLIZ);
        C1832130xmF c1832130xmF = new C1832130xmF();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1832120xmE(c19719912DlLIZ), c1831850xln, new C1832050xm7(), new C1831950xlx(this), new C1831870xlp(this), new C1832070xm9(this), c1832130xmF, new C1831840xlm(this), null, new C1831880xlq(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1831930xlv c1831930xlv = new C1831930xlv(this);
            C1832060xm8 c1832060xm8 = new C1832060xm8(this);
            C1832090xmB c1832090xmB = new C1832090xmB(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1832020xm4((InterfaceC451590HnJ) obj, c1831930xlv));
            C1831970xlz c1831970xlz = new C1831970xlz(c01gwLIZIZ);
            C1831980xm0 c1831980xm0 = new C1831980xm0(c01gwLIZIZ);
            C1831990xm1 c1831990xm1 = new C1831990xm1(c01gwLIZIZ);
            C1832000xm2 c1832000xm2 = new C1832000xm2(c01gwLIZIZ);
            C1832010xm3 c1832010xm3 = new C1832010xm3(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1832090xmB, c1831850xln, new C452080Ho6(), c1831970xlz, c1831980xm0, c1832060xm8, c1832130xmF, c1831990xm1, c1832000xm2, c1832010xm3);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1832100xmC(c19719912DlLIZ), c1831850xln, new C1832030xm5(), new C1831960xly(this), new C1831920xlu(this), new C1832080xmA(this), c1832130xmF, new C1831830xll(this), null, new C1831890xlr(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1832110xmD(c19719912DlLIZ), c1831850xln, new C1832040xm6(), new C1831940xlw(this), new C1831900xls(this), new C1831910xlt(this), c1832130xmF, null, null, new C1831860xlo(this));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        final C1820960xUE c1820960xUE = (C1820960xUE) interfaceC1891350zJl;
        super.onBindItemView(c1820960xUE);
        String str = c1820960xUE.LLILZLL;
        String str2 = I5().LLILZIL.LIZ;
        String str3 = c1820960xUE.LLILZIL;
        C1820630xTh c1820630xThLIZ = I5().getState().LL.LIZ();
        String string = null;
        if (c1820630xThLIZ != null) {
            numValueOf = Integer.valueOf(c1820630xThLIZ.LIZIZ);
        } else {
            numValueOf = null;
        }
        C1820640xTi.LIZLLL(str, "show", str2, new C1820650xTj(null, null, str3, numValueOf, null, 19));
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1820960xUE.LL);
        int iLIZ = C439101nJ.LIZ(60);
        int iLIZ2 = C439101nJ.LIZ(60);
        c1324610kZfLJIIIZ.LJ = iLIZ;
        c1324610kZfLJIIIZ.LJFF = iLIZ2;
        c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(this.LLILZ);
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(c1820960xUE.LLILLJJLI);
        }
        C16F5 c16f52 = this.LLILLL;
        if (c16f52 != null) {
            c16f52.setText(c1820960xUE.LLILLL);
        }
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131856002);
            }
            c16f53.setText(string);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xUD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer numValueOf2;
                String str4 = c1820960xUE.LLILZLL;
                String str5 = this.I5().LLILZIL.LIZ;
                String str6 = c1820960xUE.LLILZIL;
                C1820630xTh c1820630xThLIZ2 = this.I5().getState().LL.LIZ();
                if (c1820630xThLIZ2 != null) {
                    numValueOf2 = Integer.valueOf(c1820630xThLIZ2.LIZIZ);
                } else {
                    numValueOf2 = null;
                }
                C1820640xTi.LIZLLL(str4, "click", str5, new C1820650xTj(null, null, str6, numValueOf2, null, 19));
                c1820960xUE.LLILZ.invoke();
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gto, false, 4, null);
        this.LLILLJJLI = (C16F5) viewInflateItemView$default.findViewById(R.id.fah);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.f_y);
        this.LLILZ = (LiveIconView) viewInflateItemView$default.findViewById(R.id.fai);
        this.LLILZIL = (C16F5) viewInflateItemView$default.findViewById(R.id.fag);
        return viewInflateItemView$default;
    }
}
