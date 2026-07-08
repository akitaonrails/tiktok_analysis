package com.ss.android.ugc.aweme.tako.botpage.components.mixpic;

import X.AbstractC738140SxQ;
import X.AnonymousClass1418;
import X.C01GW;
import X.C0PEM;
import X.C13BV;
import X.C13LE;
import X.C13W5;
import X.C141A;
import X.C141B;
import X.C1857750yRZ;
import X.C1864020ybg;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C5183020f;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixPicItem;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixPicListAssem extends ReusedUISlotAssem<TakoMixPicListAssem> implements InterfaceC712990Rxx<C141B> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C141B LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C141A LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMixPicListAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fl7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoCardAbility sp() {
        return (TakoCardAbility) this.LLJLILLLLZIIL.getValue();
    }

    public TakoMixPicListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(c19719912DlLIZ, 243);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(154);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS574S0100000_30, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((AbstractC738140SxQ) this, 244), aFwS274S0000000_30, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJL = assemVMLazy;
        this.LLJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 247));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 245));
        this.LLJLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 246));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 248));
        this.LLJLLL = new C141A(6, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)))), null);
    }

    public static String op(TakoMixPicItem takoMixPicItem) {
        int i = takoMixPicItem.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return "tako_brand_picture";
                    }
                    return "outside_picture";
                }
                return "key_frame";
            }
            return "lemon8_picture";
        }
        return "tt_picture";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 103));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C141B c141b) {
        List<TakoMixPicItem> listLLFF;
        List<TakoMixPicItem> listLLFF2;
        List<TakoMixPicItem> listLLFF3;
        C141B c141b2 = c141b;
        if (!c141b2.LLFF().isEmpty()) {
            List<TakoMixPicItem> listLLFF4 = c141b2.LLFF();
            C141B c141b3 = this.LLJJLIIIJLLLLLLLZ;
            if (c141b3 == null || (listLLFF = c141b3.LLFF()) == null) {
                listLLFF = C13BV.INSTANCE;
            }
            if (listLLFF4 == null) {
                listLLFF4 = C13BV.INSTANCE;
            }
            if (listLLFF4.size() == listLLFF.size()) {
                int size = listLLFF4.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.LJFF(AnonymousClass1418.LIZJ((TakoMixPicItem) ListProtector.get(listLLFF4, i)), AnonymousClass1418.LIZJ((TakoMixPicItem) ListProtector.get(listLLFF, i)))) {
                    }
                }
                return;
            }
            this.LLJJLIIIJLLLLLLLZ = c141b2;
            List<TakoMixPicItem> listLLFF5 = c141b2.LLFF();
            if (listLLFF5 != null) {
                ArrayList<TakoMixPicItem> arrayList = new ArrayList();
                for (TakoMixPicItem takoMixPicItem : listLLFF5) {
                    TakoMixPicItem takoMixPicItem2 = takoMixPicItem;
                    if (AnonymousClass1418.LIZJ(takoMixPicItem2) != null && AnonymousClass1418.LIZIZ(takoMixPicItem2) == null) {
                        arrayList.add(takoMixPicItem);
                    }
                }
                for (TakoMixPicItem takoMixPicItem3 : arrayList) {
                    String strLIZJ = AnonymousClass1418.LIZJ(takoMixPicItem3);
                    if (strLIZJ != null) {
                        C1864020ybg.LIZ.getClass();
                        Aweme aweme = (Aweme) ((LinkedHashMap) C1864020ybg.LIZLLL).get(strLIZJ);
                        if (aweme != null) {
                            AnonymousClass1418.LJIIIIZZ(takoMixPicItem3, aweme);
                        }
                    }
                }
            }
            C141B c141b4 = this.LLJJLIIIJLLLLLLLZ;
            if (c141b4 != null && (listLLFF3 = c141b4.LLFF()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (TakoMixPicItem takoMixPicItem4 : listLLFF3) {
                    TakoMixPicItem takoMixPicItem5 = takoMixPicItem4;
                    if (takoMixPicItem5.type != 1 && AnonymousClass1418.LIZJ(takoMixPicItem5) != null && AnonymousClass1418.LIZIZ(takoMixPicItem5) == null) {
                        arrayList2.add(takoMixPicItem4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String strLIZJ2 = AnonymousClass1418.LIZJ((TakoMixPicItem) it2.next());
                        if (strLIZJ2 != null) {
                            arrayList3.add(strLIZJ2);
                        }
                    }
                    AssemVMLazy assemVMLazy = this.LLJL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
                    ((TakoInnerDetailVM) assemVMLazy.getValue()).vQ2(arrayList3.toString());
                    ((TakoInnerDetailVM) this.LLJL.getValue()).xQ2(null, new C5183020f((Function1) null, (Function1<? super Long, Object>) 336), new AwS393S0200000_27((Function1) null, (Function1<? super Boolean, Unit>) arrayList2, (List<TakoMixPicItem>) 162));
                }
            }
            C141B c141b5 = this.LLJJLIIIJLLLLLLLZ;
            if (c141b5 != null && (listLLFF2 = c141b5.LLFF()) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (TakoMixPicItem takoMixPicItem6 : listLLFF2) {
                    TakoMixPicItem takoMixPicItem7 = takoMixPicItem6;
                    if (takoMixPicItem7.type == 1 && AnonymousClass1418.LIZJ(takoMixPicItem7) != null && AnonymousClass1418.LIZIZ(takoMixPicItem7) == null) {
                        arrayList4.add(takoMixPicItem6);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13W5(arrayList4, null, this, null), 3);
                }
            }
            if (c141b2.LJLJI()) {
                C1857750yRZ.LJIILJJIL(c141b2.LLI(), getContentView());
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C141B c141b) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C141B c141b) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
