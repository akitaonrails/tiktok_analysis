package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.AbstractC946303mv;
import X.AbstractC947203n4;
import X.AbstractC947603n8;
import X.AbstractC947703n9;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C1324130kYt;
import X.C13LE;
import X.C1842040y2E;
import X.C19719912Dl;
import X.C21588719eH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C870703aj;
import X.C895603ek;
import X.C904203g8;
import X.C943703mV;
import X.C944103mZ;
import X.C944803mg;
import X.C944903mh;
import X.C945303ml;
import X.C945403mm;
import X.C945803mq;
import X.C945903mr;
import X.C946503mx;
import X.C946703mz;
import X.C947403n6;
import X.C947503n7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC944503md;
import X.InterfaceC998610c5r;
import Y.AObserverS205S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.AutoCloseObserver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class NormalTextInputHolder extends PowerCell<C895603ek> implements InterfaceC998610c5r {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final List<Object> LL = new ArrayList();
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NormalTextInputHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/card/ATMCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        this.LLILZIL = false;
    }

    public NormalTextInputHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ATMCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1027);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(184);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1017), awS545S0100000_1, AFwS207S0000000_19.get$arr$(204), new AwS545S0100000_1((C03K6) this, 1019), new AwS545S0100000_1((C03K6) this, 1021), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1023), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1306), null, new AwS545S0100000_1((C03K6) this, 1025));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1020);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1022);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1024);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 77));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1307);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1308);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1309);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1310);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1311);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1026), awS545S0100000_1, AFwS207S0000000_19.get$arr$(205), new AwS545S0100000_1((C03K6) this, 1028), new AwS545S0100000_1((C03K6) this, 1029), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1030), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1312), null, new AwS545S0100000_1((C03K6) this, 1031));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1032), awS545S0100000_1, AFwS207S0000000_19.get$arr$(206), new AwS545S0100000_1((C03K6) this, 1033), new AwS545S0100000_1((C03K6) this, 1034), new AwS545S0100000_1((C03K6) this, 1035), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1036));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(69));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1018));
    }

    public final C945403mm I5() {
        return (C945403mm) ((AbstractC947703n9) this.LLILLL.getValue()).LIZJ;
    }

    public final ATMCardViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (ATMCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        AbstractC946303mv abstractC946303mv;
        AbstractC947203n4 abstractC947203n4 = (AbstractC947203n4) ((AbstractC947603n8) this.LLILLL.getValue()).LIZ;
        if (abstractC947203n4 == null || (abstractC946303mv = abstractC947203n4.LLJJJIL) == null) {
            return null;
        }
        return abstractC946303mv.LLJJJIL;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C870703aj.LIZ(this.itemView, new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254));
        C946503mx.LIZJ(this.itemView, new C946703mz(Integer.valueOf(C0H9H.LIZIZ(16)), null, Integer.valueOf(C0H9H.LIZIZ(16)), null));
        C947503n7 c947503n7 = (C947503n7) this.LLILLL.getValue();
        if (c947503n7.LIZIZ == null) {
            c947503n7.LIZIZ = this;
            V v = c947503n7.LIZ;
            if (v != 0) {
                v.LJIILJJIL(this);
            }
        }
        T t = c947503n7.LIZJ;
        Lifecycle lifecycle = getLifecycle();
        t.getClass();
        new AutoCloseObserver(lifecycle, t);
        c947503n7.LIZJ.LLILLJJLI.observe(this, new AObserverS205S0100000_1(c947503n7, 0));
        C945403mm c945403mmI5 = I5();
        C945303ml c945303ml = I5().LLILZ.LIZ;
        final C904203g8 c904203g8YQ2 = L5().yQ2();
        c945403mmI5.LLIZ = new C944103mZ(c945303ml, Collections.singletonList(new InterfaceC944503md(c904203g8YQ2) { // from class: X.03g7
            public final C904203g8 LIZ;
            public String LIZIZ = "";
            public String LIZJ = "";
            public String LIZLLL = "";
            public Boolean LJ;
            public String LJFF;

            @Override // X.InterfaceC944303mb
            public final void LIZ(View view) {
            }

            {
                this.LIZ = c904203g8YQ2;
            }

            @Override // X.InterfaceC944503md
            public final void LIZIZ(boolean z) {
                if (z) {
                    C890103dr c890103dr = C890103dr.LIZ;
                    String str = this.LIZLLL;
                    c890103dr.getClass();
                    C890103dr.LIZIZ = str;
                    C890103dr.LJIIIIZZ(this.LIZLLL);
                    C890103dr.LJIJJ(this.LIZLLL);
                    return;
                }
                C890103dr c890103dr2 = C890103dr.LIZ;
                String str2 = this.LIZLLL;
                c890103dr2.getClass();
                C890103dr.LJIIJJI(C890103dr.LIZ(str2), null, str2, this.LIZIZ);
                C890103dr.LIZIZ = "";
            }

            @Override // X.InterfaceC944503md
            public final void LIZJ(InterfaceC896803ew interfaceC896803ew) {
                if (!(interfaceC896803ew instanceof C895603ek)) {
                    this.LJFF = interfaceC896803ew.getElementDTO().id;
                    C890103dr c890103dr = C890103dr.LIZ;
                    String str = interfaceC896803ew.getElementDTO().paramName;
                    c890103dr.getClass();
                    this.LIZLLL = C890103dr.LJIIZILJ(str);
                    return;
                }
                interfaceC896803ew.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC944303mb
            public final C944403mc LIZLLL(C944003mY c944003mY) {
                String str;
                Object objLJJJLZIJ;
                Object objLJJJLZIJ2;
                C904203g8 c904203g8;
                C894003eU c894003eU;
                C135100fN c135100fN;
                List<String> listValue;
                CharSequence charSequenceLIZIZ;
                C944403mc c944403mcLIZ = c944003mY.LIZ(c944003mY.LIZIZ);
                C945303ml c945303ml2 = (C945303ml) c944403mcLIZ.LIZ;
                InterfaceC944203ma interfaceC944203ma = c945303ml2.LJIIJ;
                boolean z = false;
                if (interfaceC944203ma != null && (charSequenceLIZIZ = interfaceC944203ma.LIZIZ()) != null && charSequenceLIZIZ.length() != 0) {
                    str = "normal";
                } else {
                    str = "";
                }
                this.LIZIZ = str;
                String strLJIIJJI = C03S8.LJIIJJI(this.LJFF);
                Boolean boolLIZJ = null;
                boolValueOf = null;
                boolValueOf = null;
                Boolean boolValueOf = null;
                Object objValue = null;
                if (Intrinsics.LJFF(strLJIIJJI, "date")) {
                    InterfaceC944203ma interfaceC944203ma2 = c945303ml2.LJIIJ;
                    if ((interfaceC944203ma2 instanceof C135100fN) && (c135100fN = (C135100fN) interfaceC944203ma2) != null && (listValue = c135100fN.value()) != null) {
                        objLJJJLZIJ = C13LP.LJJJLZIJ(0, listValue);
                        if (listValue != null) {
                            objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, listValue);
                        }
                        c904203g8 = this.LIZ;
                        if (c904203g8 != null && (c894003eU = c904203g8.LIZLLL) != null && c894003eU.LIZIZ.LIZ()) {
                            if (Intrinsics.LJFF(c894003eU.LIZIZ.LIZ, objLJJJLZIJ) && Intrinsics.LJFF(c894003eU.LIZIZ.LIZIZ, objLJJJLZIJ2)) {
                                z = true;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        this.LJ = boolValueOf;
                    } else {
                        objLJJJLZIJ = null;
                    }
                    objLJJJLZIJ2 = null;
                    c904203g8 = this.LIZ;
                    if (c904203g8 != null) {
                        if (Intrinsics.LJFF(c894003eU.LIZIZ.LIZ, objLJJJLZIJ)) {
                            z = true;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    this.LJ = boolValueOf;
                } else if (Intrinsics.LJFF(strLJIIJJI, "card_number")) {
                    C904203g8 c904203g82 = this.LIZ;
                    if (c904203g82 != null) {
                        InterfaceC944203ma interfaceC944203ma3 = c945303ml2.LJIIJ;
                        if (interfaceC944203ma3 != null) {
                            objValue = interfaceC944203ma3.value();
                        }
                        boolLIZJ = c904203g82.LIZJ(String.valueOf(objValue));
                    }
                    this.LJ = boolLIZJ;
                    return c944403mcLIZ;
                }
                return c944403mcLIZ;
            }

            @Override // X.InterfaceC944503md
            public final void LJ(boolean z) {
                C890103dr c890103dr = C890103dr.LIZ;
                String str = this.LIZJ;
                String str2 = this.LIZLLL;
                String str3 = this.LIZIZ;
                Boolean bool = this.LJ;
                c890103dr.getClass();
                C890103dr.LJIIIZ(bool, str, str2, str3, z);
            }
        }));
        C945403mm c945403mmI52 = I5();
        C945803mq c945803mq = new C2217381BqS() { // from class: X.03mq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C945303ml) obj).LJIIJ;
            }
        };
        c945403mmI52.LLILZ.LIZIZ.put(c945803mq, new AwS437S0200000_1(c945803mq, new AwS580S0100000_1(this, 537), 18));
        C945403mm c945403mmI53 = I5();
        C945903mr c945903mr = new C2217381BqS() { // from class: X.03mr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C945303ml) obj).LJIIJJI;
            }
        };
        c945403mmI53.LLILZ.LIZIZ.put(c945903mr, new AwS437S0200000_1(c945903mr, new AwS580S0100000_1(this, 538), 18));
        ((EventReceiver) this.LLILZ.getValue()).LLILLL.put(Integer.valueOf(C943703mV.class.hashCode()), new AwS580S0100000_1(this, 536));
        EventReceiver eventReceiver = (EventReceiver) this.LLILZ.getValue();
        C944903mh c944903mh = C944903mh.LIZ;
        eventReceiver.LLILLL.put(Integer.valueOf(c944903mh.hashCode()), new AwS580S0100000_1(this, 539));
        EventReceiver eventReceiver2 = (EventReceiver) this.LLILZ.getValue();
        C944803mg c944803mg = C944803mg.LIZ;
        eventReceiver2.LLILLL.put(Integer.valueOf(c944803mg.hashCode()), new AwS580S0100000_1(this, 540));
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        getItem();
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C895603ek c895603ek = (C895603ek) interfaceC1891350zJl;
        this.LLILZIL = true;
        C944103mZ c944103mZ = I5().LLIZ;
        if (c944103mZ != null) {
            Iterator it2 = ((ArrayList) c944103mZ.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC944503md) it2.next()).LIZJ(c895603ek);
            }
        }
        this.LLILLL.getValue();
        c895603ek.getClass();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [V extends androidx.databinding.ViewDataBinding, androidx.databinding.ViewDataBinding] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C947503n7 c947503n7 = (C947503n7) this.LLILLL.getValue();
        Context context = viewGroup.getContext();
        c947503n7.getClass();
        ?? LIZ = C1842040y2E.LIZ(C786410Ut5.ne(context), R.layout.an_, viewGroup, false, null);
        c947503n7.LIZ = LIZ;
        AbstractC947203n4 abstractC947203n4 = (AbstractC947203n4) LIZ;
        abstractC947203n4.LJIILLIIL((C945403mm) c947503n7.LIZJ);
        C947403n6 c947403n6 = c947503n7.LIZLLL;
        if (abstractC947203n4.LLILZIL == null) {
            abstractC947203n4.LLILZIL = new C1324130kYt<>(ViewDataBinding.LLJJIJIIJIL);
        }
        abstractC947203n4.LLILZIL.LIZ(c947403n6);
        return LIZ.LLILZ;
    }
}
