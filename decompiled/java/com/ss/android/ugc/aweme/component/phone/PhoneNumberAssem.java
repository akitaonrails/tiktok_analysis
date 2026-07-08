package com.ss.android.ugc.aweme.component.phone;

import X.C019F;
import X.C0TUO;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1716550ulp;
import X.C1717080umg;
import X.C1717770unn;
import X.C1717910uo1;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1775980wJg;
import X.C1776200wK2;
import X.C1948507kB;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C344820DfU;
import X.C419280GcI;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C958703ov;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS141S0100000_6;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PhoneRule;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.text.Regex;
import mf.a;

/* JADX INFO: loaded from: classes27.dex */
public final class PhoneNumberAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public TuxTextView LLIZLLLIL;
    public C1748440vbG LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public C1748330vb5 LLJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public C419280GcI LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhoneNumberAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/phone/PhoneNumberVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhoneNumberAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhoneNumberVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 960), AFwS268S0000000_26.get$arr$(107), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1717910uo1.class, "phone_number_data"), checkSupervisorPrepared());
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1748440vbG Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c4x) : null;
            this.LLJ = (C1748440vbG) viewFindViewById;
        }
        return (C1748440vbG) viewFindViewById;
    }

    public final C1748330vb5 Jo() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c59) : null;
            this.LLJJ = (C1748330vb5) viewFindViewById;
        }
        return (C1748330vb5) viewFindViewById;
    }

    public final C197039127h Lo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5a) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView No() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5d) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1717910uo1 Oo() {
        return (C1717910uo1) this.LLJJIII.getValue();
    }

    public final PhoneNumberVM So() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (PhoneNumberVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        if (TextUtils.isEmpty(Oo().LLILZIL)) {
            C786410Ut5.LLLLZLL(No(), 8);
        } else {
            C786410Ut5.LLLLZLL(No(), 0);
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                No().setText(C344820DfU.LIZ(c19egLIZ2, Oo().LLILZIL, new AwS461S0200000_26(this, c19egLIZ2, 3)));
            }
        }
        PhoneNumberVM phoneNumberVMSo = So();
        phoneNumberVMSo.withState(new AwS392S0200000_26(phoneNumberVMSo, C0TUO.EDIT, 105));
        if (Oo().LLILLJJLI.isEmpty()) {
            return;
        }
        PhoneNumberVM phoneNumberVMSo2 = So();
        ArrayList<RegionMobileCodeItem> arrayList = Oo().LLILLJJLI;
        phoneNumberVMSo2.LLILZ.clear();
        phoneNumberVMSo2.LLILZ.addAll(arrayList);
        if (Oo().LLILLJJLI.size() <= 1) {
            So().vQ2(((RegionMobileCodeItem) ListProtector.get(Oo().LLILLJJLI, 0)).getMobileCode(), ((RegionMobileCodeItem) ListProtector.get(Oo().LLILLJJLI, 0)).getAlpha2(), true);
            return;
        }
        boolean z = false;
        for (RegionMobileCodeItem regionMobileCodeItem : Oo().LLILLJJLI) {
            if (TextUtils.equals(regionMobileCodeItem.getAlpha2(), C1717770unn.LJIIIIZZ().getCurrentRegionCode())) {
                So().vQ2(regionMobileCodeItem.getMobileCode(), regionMobileCodeItem.getAlpha2(), true);
                z = true;
            }
        }
        if (z) {
            return;
        }
        So().vQ2(((RegionMobileCodeItem) ListProtector.get(Oo().LLILLJJLI, 0)).getMobileCode(), ((RegionMobileCodeItem) ListProtector.get(Oo().LLILLJJLI, 0)).getAlpha2(), true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        String str = So().LLILLL;
        if (str != null) {
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = Oo().LLILLL;
            c1716550ulp.getClass();
            C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
            if (c1717080umgLJFF != null) {
                C1716550ulp.LIZIZ.put(str2, C1717080umg.LIZ(c1717080umgLJFF, str, 2097087));
            }
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1748440vbG c1748440vbGHo = Ho();
        HandlerHook.viewPostDelay(c1748440vbGHo, new ARunnableS116S0100000_16(c1748440vbGHo, 245), 300L);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        Ho().setPlaceholderText(C20642515q3.LJI(2131840456));
        Vo(So().getState().LLILLJJLI, So().getState().LLILLL);
        if (C1948507kB.LIZ(Oo().LLILZ)) {
            View viewFindViewById = this.LLJI;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5e) : null;
                this.LLJI = (TuxTextView) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(Oo().LLILZ);
        }
        Ho().LIZ(new C1775980wJg(this, 2));
    }

    public final boolean Go(String str) {
        Iterator<PhoneRule> it2 = So().LLILZLL.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().regex;
            if (str2 != null && !new Regex(str2).matches(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        C197039127h c197039127hLo = Lo();
        C786410Ut5.U8(c197039127hLo, new ACListenerS128S0200000_26(this, c197039127hLo, 15));
        C1748330vb5 c1748330vb5Jo = Jo();
        if (c1748330vb5Jo != null) {
            c1748330vb5Jo.setMessageIcon(C958703ov.LIZ);
        }
        C1748330vb5 c1748330vb5Jo2 = Jo();
        if (c1748330vb5Jo2 != null) {
            c1748330vb5Jo2.setFadeInMessage(true);
        }
        C1748330vb5 c1748330vb5Jo3 = Jo();
        if (c1748330vb5Jo3 != null) {
            C786410Ut5.LLLLLLLZIL(c1748330vb5Jo3, 0);
        }
        C1748330vb5 c1748330vb5Jo4 = Jo();
        if (c1748330vb5Jo4 != null) {
            c1748330vb5Jo4.setMessage("");
        }
        Ho().LJIILIIL(2, false);
        View viewFindViewById = null;
        if (C1948507kB.LIZ(Oo().LLIZLLLIL)) {
            View viewFindViewById2 = this.LLJILJIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.c51);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJIL = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(Oo().LLIZLLLIL);
        }
        if (C1948507kB.LIZ(Oo().LLJI)) {
            View viewFindViewById3 = this.LLJILJILJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.c4p);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJILJ = viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            View view2 = this.LLJILLL;
            if (view2 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById = viewLJJIJL3.findViewById(R.id.qi2);
                }
                this.LLJILLL = (TuxTextView) viewFindViewById;
                view2 = viewFindViewById;
            }
            ((TextView) view2).setText(Oo().LLJI);
        }
        if (C1948507kB.LIZ(Oo().LLJ)) {
            Lo().setText(Oo().LLJ);
        }
        C736680Sv4.LJIIIZ(this, So(), new C2217381BqS() { // from class: X.0uoB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0uoA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLILLJJLI;
            }
        }, null, new AwS675S0100000_26(this, 0), 12);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0uo0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1717920uo2) obj).LLILZ);
            }
        }, null, new AwS640S0100000_26(this, 5), 6);
        PhoneNumberVM phoneNumberVMSo = So();
        selectSubscribe(phoneNumberVMSo, new C2217381BqS() { // from class: X.0uo5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLILZIL;
            }
        }, new C2217371BqR() { // from class: X.0uo9
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLILZLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1717920uo2) obj).LLILZLL = (ConfirmRegisterMobileResponse) obj2;
            }
        }, new C2217381BqS() { // from class: X.0uo6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0uo7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZIZ(phoneNumberVMSo.usedInReusedScene), null, new C1776200wK2(this, 2));
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0uo4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1717920uo2) obj).LLJ);
            }
        }, null, new AwS640S0100000_26(this, 4), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0uo8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717920uo2) obj).LLJI;
            }
        }, null, AFwS313S0000000_26.get$arr$(0), 6);
        So().LLIZ = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b70343", PageFinder.via(C724240Sb0.LJI(this)), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        So().onEventShow(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0GcI] */
    public final void Vo(String str, String str2) {
        final Context context = getContext();
        if (context != null) {
            if (this.LLJJIJI == null) {
                this.LLJJIJI = new LinearLayout(context) { // from class: X.0GcI
                    public TuxTextView LL;
                    public TuxIconView LLILLJJLI;

                    public final TuxIconView getBnplPhoneCountryRegionSelectIconFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.c4z);
                            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
                        }
                        return (TuxIconView) callbackFindViewById;
                    }

                    public final TuxTextView getBnplPhoneCountryRegionValueFromXml() {
                        KeyEvent.Callback callbackFindViewById = this.LL;
                        if (callbackFindViewById == null) {
                            callbackFindViewById = findViewById(R.id.c50);
                            this.LL = (TuxTextView) callbackFindViewById;
                        }
                        return (TuxTextView) callbackFindViewById;
                    }

                    {
                        super(context, null, 0);
                        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ac7, this, true);
                        setGravity(1);
                    }

                    public final void setBnplPhoneCountryRegionSelectIconFromXml(TuxIconView tuxIconView) {
                        this.LLILLJJLI = tuxIconView;
                    }

                    public final void setBnplPhoneCountryRegionValueFromXml(TuxTextView tuxTextView) {
                        this.LL = tuxTextView;
                    }

                    public final void setClickEvent(Function0<Unit> function0) {
                        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(function0, 105);
                        if (C1848410yCV.LIZ) {
                            aCListenerS141S0100000_6 = new f(aCListenerS141S0100000_6);
                        }
                        a aVar = new a(aCListenerS141S0100000_6);
                        if (C2213981Bky.LIZIZ.isOffline()) {
                            C2211941Bhg.LIZ.injectViewListener(this);
                        }
                        setOnClickListener(aVar);
                    }

                    public final void setText(String str3) {
                        getBnplPhoneCountryRegionValueFromXml().setText(str3);
                    }
                };
                if (Oo().LLILLJJLI.size() > 1) {
                    C419280GcI c419280GcI = this.LLJJIJI;
                    if (c419280GcI != null) {
                        C786410Ut5.LLLLLLZZ(c419280GcI.getBnplPhoneCountryRegionSelectIconFromXml(), 0);
                    }
                    C419280GcI c419280GcI2 = this.LLJJIJI;
                    if (c419280GcI2 != null) {
                        c419280GcI2.setClickEvent(new AwS570S0100000_26(this, 146));
                    }
                } else {
                    C419280GcI c419280GcI3 = this.LLJJIJI;
                    if (c419280GcI3 != null) {
                        C786410Ut5.LLLLLLZZ(c419280GcI3.getBnplPhoneCountryRegionSelectIconFromXml(), 8);
                    }
                }
                Ho().LJI(this.LLJJIJI);
            }
            C419280GcI c419280GcI4 = this.LLJJIJI;
            if (c419280GcI4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" +");
                sbLIZ.append(str);
                c419280GcI4.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
