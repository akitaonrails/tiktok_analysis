package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C1224860hym;
import X.C1224870hyn;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1224880hyo;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorNavBarVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorNavBarAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C1223620hwm.LIZLLL(this);
    public final AssemVMLazy LLJ;
    public String LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorNavBarAssem.class, "selectorNavBarVM", "getSelectorNavBarVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorNavBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectorNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorNavBarVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2606), AFwS257S0000000_19.get$arr$(515), null, true);
        this.LLJI = "";
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2605));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2604));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2608));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2603));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2607));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    public final TuxNavBar Go() {
        return (TuxNavBar) this.LLJILJIL.getValue();
    }

    public final C1224860hym Ho() {
        return (C1224860hym) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view);
        if (!Ho().LJFF()) {
            C1584506Ih.LIZIZ(Go());
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hyp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C2000907sd) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 189), 4);
            String strLIZJ = Ho().LIZJ();
            if (!Intrinsics.LJFF(this.LLJI, strLIZJ)) {
                this.LLJI = strLIZJ;
            }
            TuxNavBar tuxNavBarGo = Go();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = this.LLJI;
            tuxNavBarGo.LJIJJ(c1250250idj);
            Iterator<T> it2 = Ho().LIZIZ().iterator();
            while (it2.hasNext()) {
                int i2 = C1224870hyn.LIZ[((EnumC1224880hyo) it2.next()).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        TuxNavBar tuxNavBarGo2 = Go();
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 2767));
                        tuxNavBarGo2.LIZ(c1251150ifB);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    TuxNavBar tuxNavBarGo3 = Go();
                    C1251150ifB c1251150ifB2 = new C1251150ifB();
                    c1251150ifB2.LIZLLL();
                    c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
                    c1251150ifB2.LIZJ(new AwS563S0100000_19(this, 2766));
                    tuxNavBarGo3.LIZIZ(c1251150ifB2);
                }
            }
            Go().LJIIZILJ(Ho().LIZLLL());
            Integer num = ((C1224280hxq) this.LLIZLLLIL.getValue()).LJIIIZ().LJIIJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.attr.zm;
            }
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue, context)) != null) {
                Go().setNavBackground(numLIZJ.intValue());
            }
        }
        String strLIZ = Ho().LIZ();
        String strLJ = Ho().LJ();
        View view2 = (View) this.LLJILJILJ.getValue();
        if (strLIZ.length() <= 0 && strLJ.length() <= 0) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        if (strLIZ.length() > 0) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLJILLL.getValue());
            ((TextView) this.LLJILLL.getValue()).setText(strLIZ);
        }
        if (strLJ.length() > 0) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJ.getValue());
            ((TextView) this.LLJJ.getValue()).setText(strLJ);
        }
    }
}
