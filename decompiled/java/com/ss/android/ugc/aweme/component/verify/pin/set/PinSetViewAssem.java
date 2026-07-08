package com.ss.android.ugc.aweme.component.verify.pin.set;

import X.AbstractC738140SxQ;
import X.C0OM1;
import X.C1238130iKB;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1714690uip;
import X.C1716310ulR;
import X.C1718120uoM;
import X.C1719140uq0;
import X.C1719460uqW;
import X.C1948507kB;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1717460unI;
import X.InterfaceC1719490uqZ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS126S0100000_26;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.component.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinRule;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinSetViewAssem;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinSetViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class PinSetViewAssem extends BasePinUIAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public TuxNavBar LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C1719460uqW LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public View LLJJI;
    public TuxTextView LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL;
    public String LLJJIJIL;
    public long LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinSetViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/component/verify/pin/set/PinSetViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1719460uqW Ho() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5w) : null;
            this.LLJILJIL = (C1719460uqW) viewFindViewById;
        }
        return (C1719460uqW) viewFindViewById;
    }

    public final TuxTextView Jo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5y) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c64) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1719140uq0 No() {
        return (C1719140uq0) this.LLJJIJIIJIL.getValue();
    }

    public final PinSetViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PinSetViewModel) assemVMLazy.getValue();
    }

    public PinSetViewAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinSetViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 970);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(138);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 971), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJI = assemVMLazy;
        this.LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1719140uq0.class, "KEY_SET_DATA"), checkSupervisorPrepared());
        this.LLJJIJIL = "";
    }

    public final String So() {
        return (No().LL == EnumC1717460unI.FORGOT || No().LL == EnumC1717460unI.CHANGE) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap<String, String> Go(String str) {
        String string;
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b87466", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            map.put(key, string);
        }
        map.put("is_reset", So());
        return map;
    }

    public final void Vo(String str) {
        C1719460uqW c1719460uqWHo = Ho();
        if (str == null) {
            str = "";
        }
        c1719460uqWHo.LIZLLL(str);
        Ho().getTuxPinFromXml().setEnabled(true);
        Ho().LIZ(800L);
    }

    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        if (No().LLIZ.length() == 0) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            String str = No().LLILZ;
            String str2 = No().LLILLL;
            String str3 = No().LLJIJIL;
            c1716310ulR.getClass();
            C1716310ulR.LJII(str, "bnpl_pin_set", str2, str3);
            C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
            c1397580mTM.LIZ(2131835079);
            C1238130iKB.LIZ(c1397580mTM, new AwS598S0100000_19(this, 133));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0qkn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1557860qds) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 112), 6);
        if (C1714690uip.LIZ(No().LLJJIJIIJIL)) {
            C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0ql0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1557860qds) obj).LLILLJJLI);
                }
            }, null, AFwS310S0000000_24.get$arr$(69), 6);
        }
        View viewFindViewById = this.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.c5z);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        C786410Ut5.LLLLZLLLI((TuxNavBar) viewFindViewById, 0);
        C786410Ut5.LLLLZLL(Lo(), 0);
        C786410Ut5.LLLLZLL(Jo(), 0);
        C1719460uqW c1719460uqWHo = Ho();
        int visibility = c1719460uqWHo.getVisibility();
        c1719460uqWHo.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1719460uqWHo);
        String str4 = No().LLJL;
        if (a0.LJJJIL(str4)) {
            View viewFindViewById3 = this.LLJJI;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.qi3);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJI = viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        } else {
            View viewFindViewById4 = this.LLJJI;
            if (viewFindViewById4 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById4 = viewLJJIJL3.findViewById(R.id.qi3);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJI = viewFindViewById4;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            View viewFindViewById5 = this.LLJJIII;
            if (viewFindViewById5 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById5 = viewLJJIJL4.findViewById(R.id.qi4);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJJIII = (TuxTextView) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(str4);
        }
        View viewFindViewById6 = this.LLJ;
        if (viewFindViewById6 == null) {
            View viewLJJIJL5 = LJJIJL();
            if (viewLJJIJL5 != null) {
                viewFindViewById6 = viewLJJIJL5.findViewById(R.id.c5z);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById6;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById6;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1407));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        if (C1948507kB.LIZ(No().LLJJIJIL)) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1408));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
        if (C1948507kB.LIZ(No().LLJILJILJ)) {
            Lo().setText(No().LLJILJILJ);
        } else {
            Lo().setText(2131840482);
        }
        if (C1948507kB.LIZ(No().LLJILLL)) {
            Jo().setText(No().LLJILLL);
        } else {
            Jo().setText(2131840472);
        }
        if (C1948507kB.LIZ(No().LLJJIJI)) {
            View viewFindViewById7 = this.LLJILJILJ;
            if (viewFindViewById7 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById7 = viewLJJIJL6.findViewById(R.id.c4p);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLJILJILJ = viewFindViewById7;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById7);
            View viewFindViewById8 = this.LLJILLL;
            if (viewFindViewById8 == null) {
                View viewLJJIJL7 = LJJIJL();
                if (viewLJJIJL7 != null) {
                    viewFindViewById8 = viewLJJIJL7.findViewById(R.id.qi2);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJILLL = (TuxTextView) viewFindViewById8;
            }
            ((TextView) viewFindViewById8).setText(No().LLJJIJI);
        }
        Ho().setInputCallback(new InterfaceC1719490uqZ() { // from class: X.0qtL
            @Override // X.InterfaceC1719490uqZ
            public final void LIZIZ(int i) {
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZ(String str5) {
                PinSetViewAssem pinSetViewAssem = this.LIZ;
                pinSetViewAssem.LLJJIJIL = str5;
                PinSetViewModel pinSetViewModelOo = pinSetViewAssem.Oo();
                for (PinRule pinRule : this.LIZ.No().LLILLJJLI) {
                    if (new Regex(pinRule.regex).containsMatchIn(str5)) {
                        pinSetViewModelOo.setState(new AwS390S0200000_24(pinRule, pinSetViewModelOo, 93));
                        return;
                    }
                }
                pinSetViewModelOo.setStateImmediate(new AwS603S0100000_24(pinSetViewModelOo, 538));
            }
        });
        HandlerHook.viewPost(Ho(), new ARunnableS126S0100000_26(this, 91));
        Ho().setDimOnComplete(false);
        if (C1714690uip.LIZ(No().LLJJIJIIJIL)) {
            View viewFindViewById9 = this.LLJJ;
            if (viewFindViewById9 == null) {
                View viewLJJIJL8 = LJJIJL();
                if (viewLJJIJL8 != null) {
                    viewFindViewById9 = viewLJJIJL8.findViewById(R.id.c66);
                } else {
                    viewFindViewById9 = null;
                }
                this.LLJJ = (TuxTextView) viewFindViewById9;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById9, 0);
            View view2 = this.LLJJ;
            if (view2 == null) {
                View viewLJJIJL9 = LJJIJL();
                if (viewLJJIJL9 != null) {
                    viewFindViewById2 = viewLJJIJL9.findViewById(R.id.c66);
                }
                this.LLJJ = (TuxTextView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C786410Ut5.h9((TuxTextView) view2, new ACListenerS158S0100000_24(this, 95));
        }
        this.LLJJJ = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b87466", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        linkedHashMap.put("is_reset", So());
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str5 = No().LLILZ;
        String str6 = No().LLJ;
        String str7 = No().LLJI;
        String str8 = No().LLILLL;
        String str9 = No().LLILZIL;
        String str10 = No().LLJIJIL;
        c1718120uoM.getClass();
        C1718120uoM.LJI(str5, "bnpl_pin_set", str6, str7, str8, 0L, "set_pin_first", str9, str10, linkedHashMap);
    }
}
