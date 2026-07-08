package com.ss.android.ugc.aweme.poi.quiz.assem;

import X.C01D1;
import X.C01GW;
import X.C1173220gdU;
import X.C1177230gjx;
import X.C1179500gnc;
import X.C1189060h32;
import X.C1208670hYf;
import X.C1209070hZJ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C20584615gi;
import X.C20600815jK;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C814420VxA;
import X.EnumC1179510gnd;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiCardBottomBtnModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizConfigModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import com.ss.android.ugc.aweme.poi.quiz.item.PoiQuizHorizontalCardItemCell;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizHorizontalCardAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public interface PoiQuizHorizontalCardAbility extends InterfaceC494301wD {
        boolean Bf2();

        boolean d4();

        void e2(C1177230gjx c1177230gjx);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizHorizontalCardAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiQuizHorizontalCardAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1683), AFwS256S0000000_18.get$arr$(551), null, true);
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1682));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6i;
    }

    public final PoiQuizPageVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    public final void ip(EnumC1179510gnd enumC1179510gnd) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new C1179500gnc(null, null, enumC1179510gnd));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            state.LJIILL(arrayList, null);
        }
    }

    public final void kp(List<PoiQuizItem> list) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<PoiQuizItem> it2 = list.iterator();
            while (true) {
                PoiCardBottomBtnModel poiCardBottomBtnModel = null;
                if (!it2.hasNext()) {
                    break;
                }
                PoiQuizItem next = it2.next();
                PoiQuizConfigModel poiQuizConfigModel = hp().LLJ;
                if (poiQuizConfigModel != null) {
                    poiCardBottomBtnModel = poiQuizConfigModel.poiCardBottomBtnModel;
                }
                arrayList.add(new C1179500gnc(next, poiCardBottomBtnModel, EnumC1179510gnd.SUCCESS));
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                state.LJIILL(arrayList, null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int marginStart;
        int i;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.r95);
        this.LLJJIII = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            int i2 = 0;
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PoiQuizHorizontalCardItemCell.class);
            InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 1;
            viewItemOperator.LIZLLL(c1173220gdU);
            viewOnAttachStateChangeListenerC20631115oD.setPageTransformer(new C20584615gi(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C1208670hYf(this, 6));
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20631115oD.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = viewOnAttachStateChangeListenerC20631115oD.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams3 = viewOnAttachStateChangeListenerC20631115oD.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams4 = viewOnAttachStateChangeListenerC20631115oD.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i2 = marginLayoutParams.bottomMargin;
            }
            C1189060h32.LJJII(viewOnAttachStateChangeListenerC20631115oD, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i2 + ((Number) this.LLJJIJIL.getValue()).intValue()));
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
            viewOnAttachStateChangeListenerC20631115oD.setBackground(c19659111vp.LIZ(viewOnAttachStateChangeListenerC20631115oD.getContext()));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), new PoiQuizHorizontalCardAbility() { // from class: com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem$loadAllAbility$1$1
                @Override // com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility
                public final boolean Bf2() {
                    return !this.LL.LLJJIJIIJIL;
                }

                @Override // com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility
                public final boolean d4() {
                    return this.LL.LLJJIJI;
                }

                @Override // com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility
                public final void e2(C1177230gjx c1177230gjx) {
                    this.LL.getClass();
                }
            }, PoiQuizHorizontalCardAbility.class, null, null);
        }
        PoiQuizPageVM poiQuizPageVMHp = hp();
        selectSubscribe(poiQuizPageVMHp, new C2217381BqS() { // from class: X.0gmR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0gmV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gln
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(poiQuizPageVMHp.usedInReusedScene), null, new C1209070hZJ(this, 7));
    }
}
