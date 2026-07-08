package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font;

import X.C019F;
import X.C01DG;
import X.C01DY;
import X.C01DZ;
import X.C01GW;
import X.C0GS0;
import X.C13LE;
import X.C1637806bA;
import X.C1826400xd0;
import X.C1826410xd1;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C296801Da;
import X.C418440Gaw;
import X.C433480GzC;
import X.C433490GzD;
import X.C452501pT;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.a;

/* JADX INFO: loaded from: classes7.dex */
public final class CustomizedBoardTextFontDescriptionColorAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C296801Da(this));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CustomizedBoardTextFontDescriptionColorAssem.class, "colorViewModel", "getColorViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardTextColorViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CustomizedBoardTextFontDescriptionColorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardTextColorViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C01DY(c19719912DlLIZ), new C01DZ(), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        double d;
        super.onViewCreated(view);
        C500260Jjc.LLFFF(LJJIJL());
        final C433480GzC c433480GzC = (C433480GzC) this.LLIZLLLIL.getValue();
        c433480GzC.getClass();
        List<C1826410xd1> list = C1826400xd0.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C1826410xd1> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().LIZLLL;
            if (num != null) {
                arrayList.add(num);
            }
        }
        ((ArrayList) c433480GzC.LLILZIL).clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final C0GS0 c0gs0 = new C0GS0(c433480GzC.LL);
            int iIntValue = ((Number) ListProtector.get(arrayList, i)).intValue();
            c0gs0.LL = iIntValue;
            c0gs0.LLILZ.setColor(iIntValue);
            c0gs0.invalidate();
            c0gs0.setTag(ListProtector.get(arrayList, i));
            ((ArrayList) c433480GzC.LLILZIL).add(c0gs0);
            int i2 = c433480GzC.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            double d2 = 14.0d;
            if (i == 0) {
                d = 14.0d;
            } else {
                d = 5.0d;
            }
            layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d)));
            if (i != arrayList.size() - 1) {
                d2 = 5.0d;
            }
            layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d2)));
            layoutParams.gravity = 16;
            LinearLayout linearLayout = c433480GzC.LLILZ;
            if (linearLayout != null) {
                linearLayout.addView(c0gs0, layoutParams);
            }
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0GzB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Integer num2;
                    C0GS0 c0gs02;
                    for (C0GS0 c0gs03 : (ArrayList) c433480GzC.LLILZIL) {
                        if (c0gs03.LLILLJJLI) {
                            C433530GzH.LIZ(1.0f, 200L, c0gs03);
                            c0gs03.setSelection(false);
                        }
                    }
                    c433480GzC.getClass();
                    C433530GzH.LIZ(1.15f, 200L, view2);
                    if ((view2 instanceof C0GS0) && (c0gs02 = (C0GS0) view2) != null) {
                        c0gs02.setSelection(true);
                    }
                    Object tag = view2.getTag();
                    if ((tag instanceof Integer) && (num2 = (Integer) tag) != null) {
                        c433480GzC.LLILZLL.invoke(Integer.valueOf(num2.intValue()));
                    }
                    C433500GzE c433500GzE = c433480GzC.LLILLL;
                    if (c433500GzE != null) {
                        c433500GzE.LIZ(c0gs0);
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0gs0);
            }
            c0gs0.setOnClickListener(aVar);
        }
        ((C433480GzC) this.LLIZLLLIL.getValue()).setColorChangeListener(new C01DG(this));
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        withState(assemVMLazy.getValue(), new C433490GzD(this));
    }
}
