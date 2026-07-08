package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C1324610kZf;
import X.C13LE;
import X.C16F5;
import X.C1819620xS4;
import X.C1821010xUJ;
import X.C1832450xml;
import X.C1832460xmm;
import X.C1832470xmn;
import X.C1832480xmo;
import X.C1832490xmp;
import X.C1832500xmq;
import X.C1832510xmr;
import X.C1832520xms;
import X.C1832530xmt;
import X.C1832540xmu;
import X.C1832550xmv;
import X.C1832560xmw;
import X.C1832570xmx;
import X.C1832580xmy;
import X.C1832590xmz;
import X.C1832600xn0;
import X.C1832610xn1;
import X.C1832620xn2;
import X.C1832630xn3;
import X.C1832640xn4;
import X.C1832650xn5;
import X.C1832660xn6;
import X.C1832670xn7;
import X.C1832680xn8;
import X.C1832690xn9;
import X.C1832700xnA;
import X.C1832710xnB;
import X.C1832720xnC;
import X.C1832730xnD;
import X.C1832740xnE;
import X.C1832750xnF;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.PlaybookCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PlaybookCell extends PowerCell<C1821010xUJ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public ImageView LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaybookCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/onestopshop/vm/OneStopPageVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaybookCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OneStopPageVM.class);
        C1832470xmn c1832470xmn = new C1832470xmn(c19719912DlLIZ);
        C1832750xnF c1832750xnF = new C1832750xnF();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1832740xnE(c19719912DlLIZ), c1832470xmn, new C1832670xn7(), new C1832570xmx(this), new C1832490xmp(this), new C1832690xn9(this), c1832750xnF, new C1832460xmm(this), null, new C1832500xmq(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1832550xmv c1832550xmv = new C1832550xmv(this);
            C1832680xn8 c1832680xn8 = new C1832680xn8(this);
            C1832710xnB c1832710xnB = new C1832710xnB(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1832640xn4((InterfaceC451590HnJ) obj, c1832550xmv));
            C1832590xmz c1832590xmz = new C1832590xmz(c01gwLIZIZ);
            C1832600xn0 c1832600xn0 = new C1832600xn0(c01gwLIZIZ);
            C1832610xn1 c1832610xn1 = new C1832610xn1(c01gwLIZIZ);
            C1832620xn2 c1832620xn2 = new C1832620xn2(c01gwLIZIZ);
            C1832630xn3 c1832630xn3 = new C1832630xn3(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1832710xnB, c1832470xmn, new C452080Ho6(), c1832590xmz, c1832600xn0, c1832680xn8, c1832750xnF, c1832610xn1, c1832620xn2, c1832630xn3);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1832720xnC(c19719912DlLIZ), c1832470xmn, new C1832650xn5(), new C1832580xmy(this), new C1832540xmu(this), new C1832700xnA(this), c1832750xnF, new C1832450xml(this), null, new C1832510xmr(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1832730xnD(c19719912DlLIZ), c1832470xmn, new C1832660xn6(), new C1832560xmw(this), new C1832520xms(this), new C1832530xmt(this), c1832750xnF, null, null, new C1832480xmo(this));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        final C1821010xUJ c1821010xUJ = (C1821010xUJ) interfaceC1891350zJl;
        super.onBindItemView(c1821010xUJ);
        int iLIZ = C439101nJ.LIZ(60);
        int iLIZ2 = C439101nJ.LIZ(80);
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZ;
                layoutParams.height = iLIZ2;
            }
        } else {
            layoutParams = null;
        }
        ImageView imageView2 = this.LLILLJJLI;
        if (imageView2 != null) {
            C786410Ut5.c6(imageView2, layoutParams);
        }
        View view = this.itemView;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(c1821010xUJ.LL));
        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(8)));
        c1324610kZfLJIIIZ.LJ = iLIZ;
        c1324610kZfLJIIIZ.LJFF = iLIZ2;
        c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1821010xUJ.LLILLJJLI);
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            c16f52.setText(c1821010xUJ.LLILLL);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xUZ
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    c1821010xUJ.LLILZ.invoke();
                    AssemVMLazy assemVMLazy = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PlaybookCell.LLILZIL;
                    C1820640xTi.LIZLLL("playbook", "click", ((OneStopPageVM) assemVMLazy.getValue()).LLILZIL.LIZ, new C1820650xTj(null, null, null, null, null, 31));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.gtr, false, 4, null);
        this.LLILLL = (C16F5) viewInflateItemView$default.findViewById(R.id.qrq);
        this.LLILLJJLI = (ImageView) viewInflateItemView$default.findViewById(R.id.qrp);
        this.LLILZ = (C16F5) viewInflateItemView$default.findViewById(R.id.qro);
        return viewInflateItemView$default;
    }
}
