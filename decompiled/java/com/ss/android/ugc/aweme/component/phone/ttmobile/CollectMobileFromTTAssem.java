package com.ss.android.ugc.aweme.component.phone.ttmobile;

import X.C019F;
import X.C0JDF;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1716310ulR;
import X.C1719320uqI;
import X.C1749280vcc;
import X.C1776190wK1;
import X.C1948507kB;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C344820DfU;
import X.C431360Gvm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CollectMobileFromTTAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public TuxNavBar LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C197039127h LLJILJILJ;
    public C197039127h LLJILLL;
    public C1749280vcc LLJJ;
    public TuxTextView LLJJI;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, C1719320uqI.class, "SOURCE_DATA"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;
    public long LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectMobileFromTTAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/phone/ttmobile/CollectMobileFromTTViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollectMobileFromTTAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CollectMobileFromTTViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 251), AFwS268S0000000_26.get$arr$(116), null, true);
    }

    public final C197039127h Ho() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.a25) : null;
            this.LLJILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1719320uqI Jo() {
        return (C1719320uqI) this.LLJJIII.getValue();
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qb_) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final CollectMobileFromTTViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (CollectMobileFromTTViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap<String, String> Go(String str) {
        String string;
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            map.put(key, string);
        }
        return map;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = System.currentTimeMillis();
        boolean z = true;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT), new Pair(Scene.SCENE_SERVICE, Jo().LLILLL), new Pair("enter_type", "normal"));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str = Jo().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str));
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b79668", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            mapLJIIJ.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
        String str2 = Jo().LL;
        c1716310ulR2.getClass();
        C1716310ulR.LIZJ("fp_sdk_auto_get_phone_number_show", "auto_get_phone_number", str2, mapLJIIJ);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 151));
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.e6n);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJIIZILJ(false);
        View viewFindViewById3 = this.LLIZLLLIL;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.e6n);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById3;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById3;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        if (C1948507kB.LIZ(Jo().LLJJJIL)) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 150));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById4 = viewLJJIJL3.findViewById(R.id.e6o);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = (TuxTextView) viewFindViewById4;
        }
        ((TextView) viewFindViewById4).setText(Jo().LLILZ);
        View viewFindViewById5 = this.LLJI;
        if (viewFindViewById5 == null) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById5 = viewLJJIJL4.findViewById(R.id.e6m);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJI = (TuxTextView) viewFindViewById5;
        }
        ((TextView) viewFindViewById5).setText(Jo().LLIZ);
        View viewFindViewById6 = this.LLJIJIL;
        if (viewFindViewById6 == null) {
            View viewLJJIJL5 = LJJIJL();
            if (viewLJJIJL5 != null) {
                viewFindViewById6 = viewLJJIJL5.findViewById(R.id.qb8);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJIJIL = (TuxTextView) viewFindViewById6;
        }
        ((TextView) viewFindViewById6).setText(Jo().LLJ);
        View viewFindViewById7 = this.LLJILJIL;
        if (viewFindViewById7 == null) {
            View viewLJJIJL6 = LJJIJL();
            if (viewLJJIJL6 != null) {
                viewFindViewById7 = viewLJJIJL6.findViewById(R.id.y2o);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJILJIL = (TuxTextView) viewFindViewById7;
        }
        ((TextView) viewFindViewById7).setText(Jo().LLIZLLLIL);
        View viewFindViewById8 = this.LLJIJIL;
        if (viewFindViewById8 == null) {
            View viewLJJIJL7 = LJJIJL();
            if (viewLJJIJL7 != null) {
                viewFindViewById8 = viewLJJIJL7.findViewById(R.id.qb8);
            } else {
                viewFindViewById8 = null;
            }
            this.LLJIJIL = (TuxTextView) viewFindViewById8;
        }
        ((TuxTextView) viewFindViewById8).LJJJJI(32.0f);
        String str3 = Jo().LLJI;
        if (str3 != null && str3.length() != 0) {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLZLL(Lo(), 8);
        } else {
            C786410Ut5.LLLLZLL(Lo(), 0);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                Lo().setText(C344820DfU.LIZ(c19egLIZ, Jo().LLJI, new AwS461S0200000_26(this, c19egLIZ, 10)));
                Lo().LJJJJI(12.0f);
                Lo().setHighlightColor(0);
                Lo().setMovementMethod(C431360Gvm.LIZ());
            }
        }
        View viewFindViewById9 = this.LLJILJILJ;
        if (viewFindViewById9 == null) {
            View viewLJJIJL8 = LJJIJL();
            if (viewLJJIJL8 != null) {
                viewFindViewById9 = viewLJJIJL8.findViewById(R.id.a27);
            } else {
                viewFindViewById9 = null;
            }
            this.LLJILJILJ = (C197039127h) viewFindViewById9;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById9, new ACListenerS160S0100000_26(this, 18));
        if (Jo().LLJIJIL) {
            C786410Ut5.LLLLLLJ(Ho(), 0);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                Ho().LJJJJL(new AwS38S0001000_26(numLIZJ.intValue(), 0));
            }
            C786410Ut5.U8(Ho(), new ACListenerS160S0100000_26(this, 19));
        } else {
            C786410Ut5.LLLLLLJ(Ho(), 8);
        }
        CollectMobileFromTTViewModel collectMobileFromTTViewModelNo = No();
        selectSubscribe(collectMobileFromTTViewModelNo, new C2217381BqS() { // from class: X.0uqN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0uqR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0uqP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0uqQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(collectMobileFromTTViewModelNo.usedInReusedScene), null, new C0JDF(this));
        CollectMobileFromTTViewModel collectMobileFromTTViewModelNo2 = No();
        selectSubscribe(collectMobileFromTTViewModelNo2, new C2217381BqS() { // from class: X.0uqM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0uqO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LLILLJJLI;
            }
        }, new C2217371BqR() { // from class: X.0uqS
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718390uon) obj).LLILZLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1718390uon) obj).LLILZLL = (BaseResponse) obj2;
            }
        }, C736820SvI.LIZIZ(collectMobileFromTTViewModelNo2.usedInReusedScene), null, new C1776190wK1(this, 3));
        View view2 = this.LLJJ;
        if (view2 == null) {
            View viewLJJIJL9 = LJJIJL();
            if (viewLJJIJL9 != null) {
                viewFindViewById2 = viewLJJIJL9.findViewById(R.id.z18);
            }
            this.LLJJ = (C1749280vcc) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C786410Ut5.LLLZLZ((C1749280vcc) view2, 8);
        No().LL = Jo().LLILLL;
        No().LLILLJJLI = Jo().LLJILLL;
    }

    public final void Oo(String str, Map<String, String> map) {
        String string;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("obj_id", str), new Pair("click_use_time", String.valueOf(System.currentTimeMillis() - this.LLJJIJIIJIL)), new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT), new Pair(Scene.SCENE_SERVICE, Jo().LLILLL), new Pair("enter_type", "normal"));
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b79668", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            mapLJIIJ.put(key, string);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                mapLJIIJ.put(entry2.getKey(), entry2.getValue());
            }
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str2 = Jo().LLILZLL;
        c1716310ulR.getClass();
        mapLJIIJ.putAll(C1716310ulR.LIZ(str2));
        C1716310ulR.LIZJ("fp_sdk_auto_get_phone_number_click", "auto_get_phone_number", Jo().LL, mapLJIIJ);
    }
}
