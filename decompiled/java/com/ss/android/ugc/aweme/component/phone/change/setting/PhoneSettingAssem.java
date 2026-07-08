package com.ss.android.ugc.aweme.component.phone.change.setting;

import X.C019F;
import X.C0OM1;
import X.C1247510iZJ;
import X.C1251150ifB;
import X.C1390850mIV;
import X.C13LE;
import X.C1533950q1J;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1717230umv;
import X.C1717550unR;
import X.C1717770unn;
import X.C1776190wK1;
import X.C1776200wK2;
import X.C1948507kB;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C345890DhD;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C770750ULh;
import X.C786410Ut5;
import X.DialogInterfaceOnCancelListenerC1775850wJT;
import X.InterfaceC1717730unj;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import com.ss.android.ugc.aweme.component.phone.change.ChangePhoneManager;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.RiskInfoInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PhoneSettingAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public TuxNavBar LLIZLLLIL;
    public C197039127h LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C1559260qg8 LLJILJILJ = new C1559260qg8(new C723590SZx(this, C1717230umv.class, "SOURCE_DATA"), checkSupervisorPrepared());
    public final AssemVMLazy LLJILLL;
    public ChangePhoneManager LLJJ;
    public BaseSheet LLJJI;
    public PhoneApi.PhoneChangeSettings LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhoneSettingAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/phone/change/setting/PhoneSettingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhoneSettingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhoneSettingViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 963), AFwS268S0000000_26.get$arr$(110), null, true);
    }

    public final void Go() {
        Map<String, String> map;
        String str;
        String str2;
        String str3;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        String str4;
        Map<String, String> map5;
        Map<String, String> map6;
        Map<String, String> map7;
        Map<String, String> map8;
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJII(2131839178);
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839177);
        c1247510iZJ.LIZ(new AwS605S0100000_26(this, 101));
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131839176);
        c1247510iZJ2.LIZ(new AwS605S0100000_26(this, 102));
        c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        this.LLJJI = c1390850mIV.LIZJ();
        PhoneApi.PhoneChangeSettings phoneChangeSettings = this.LLJJIII;
        String str5 = null;
        if (phoneChangeSettings == null || (map = phoneChangeSettings.starlings) == null || map.isEmpty()) {
            return;
        }
        C770750ULh c770750ULh = new C770750ULh();
        PhoneApi.PhoneChangeSettings phoneChangeSettings2 = this.LLJJIII;
        String str6 = "";
        if (phoneChangeSettings2 == null || (map8 = phoneChangeSettings2.starlings) == null || (str = map8.get("pipo_change_mobile_select_title")) == null) {
            str = "";
        }
        c770750ULh.LJ = str;
        C345890DhD[] c345890DhDArr = new C345890DhD[2];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        PhoneApi.PhoneChangeSettings phoneChangeSettings3 = this.LLJJIII;
        if (phoneChangeSettings3 == null || (map7 = phoneChangeSettings3.starlings) == null || (str2 = map7.get("pipo_change_mobile_select_copywriting")) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        PhoneApi.PhoneChangeSettings phoneChangeSettings4 = this.LLJJIII;
        sbLIZ.append(phoneChangeSettings4 != null ? phoneChangeSettings4.maskedMobileNo : null);
        c345890DhDArr[0] = new C345890DhD(C2188811AlT.LIZIZ(sbLIZ), true);
        PhoneApi.PhoneChangeSettings phoneChangeSettings5 = this.LLJJIII;
        if (phoneChangeSettings5 == null || (map6 = phoneChangeSettings5.starlings) == null || (str3 = map6.get("pipo_change_mobile_select_inform_copywriting")) == null) {
            str3 = "";
        }
        c345890DhDArr[1] = new C345890DhD(str3, true);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c345890DhDArr);
        PhoneApi.PhoneChangeSettings phoneChangeSettings6 = this.LLJJIII;
        if (C1533950q1J.LJ((phoneChangeSettings6 == null || (map5 = phoneChangeSettings6.starlings) == null) ? null : map5.get("cooling_off_notice"))) {
            PhoneApi.PhoneChangeSettings phoneChangeSettings7 = this.LLJJIII;
            if (phoneChangeSettings7 != null && (map4 = phoneChangeSettings7.starlings) != null && (str4 = map4.get("cooling_off_notice")) != null) {
                str6 = str4;
            }
            listLJIILJJIL.add(new C345890DhD(str6, true));
        }
        c770750ULh.LIZLLL(listLJIILJJIL);
        c770750ULh.LJIILLIIL = true;
        PhoneApi.PhoneChangeSettings phoneChangeSettings8 = this.LLJJIII;
        c770750ULh.LJI((phoneChangeSettings8 == null || (map3 = phoneChangeSettings8.starlings) == null) ? null : map3.get("pipo_change_mobile_select_send_button"), new AwS605S0100000_26(this, 103));
        PhoneApi.PhoneChangeSettings phoneChangeSettings9 = this.LLJJIII;
        if (phoneChangeSettings9 != null && (map2 = phoneChangeSettings9.starlings) != null) {
            str5 = map2.get("pipo_change_mobile_select_another_way_button");
        }
        c770750ULh.LJII(str5, new AwS605S0100000_26(this, 104));
        c770750ULh.LJIJ = true;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = false;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC1775850wJT(this, 0);
        this.LLJJI = tuxSheet;
    }

    public final C197039127h Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.a24) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1717230umv Jo() {
        return (C1717230umv) this.LLJILJILJ.getValue();
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qb8) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView No() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qbb) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView Oo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qbd) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PhoneSettingViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PhoneSettingViewModel) assemVMLazy.getValue();
    }

    public final void Vo() {
        C786410Ut5.LLLLZLL(Oo(), 8);
        C786410Ut5.LLLLZLL(No(), 8);
        C786410Ut5.LLLLLLJ(Ho(), 8);
        C786410Ut5.LLLLZLL(Lo(), 8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 149));
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.qbc);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJIIZILJ(false);
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.qbc);
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        ((TuxNavBar) view2).setNavActions(c0om1);
        C786410Ut5.U8(Ho(), new ACListenerS160S0100000_26(this, 17));
        PhoneSettingViewModel phoneSettingViewModelSo = So();
        selectSubscribe(phoneSettingViewModelSo, new C2217381BqS() { // from class: X.0una
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0unf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0ung
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0und
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1717630unZ) obj).LLILZ);
            }
        }, C736820SvI.LIZIZ(phoneSettingViewModelSo.usedInReusedScene), null, new C1776200wK2(this, 3));
        PhoneSettingViewModel phoneSettingViewModelSo2 = So();
        selectSubscribe(phoneSettingViewModelSo2, new C2217381BqS() { // from class: X.0unb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0une
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1717630unZ) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0uni
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(phoneSettingViewModelSo2.usedInReusedScene), null, new C1776190wK1(this, 1));
        PhoneSettingViewModel phoneSettingViewModelSo3 = So();
        selectSubscribe(phoneSettingViewModelSo3, new C2217381BqS() { // from class: X.0unY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0unc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1717630unZ) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0unh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717630unZ) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(phoneSettingViewModelSo3.usedInReusedScene), null, new C1776190wK1(this, 2));
        PhoneSettingViewModel phoneSettingViewModelSo4 = So();
        C1717230umv c1717230umvJo = Jo();
        phoneSettingViewModelSo4.LLILLJJLI = c1717230umvJo;
        if (C1948507kB.LIZ(c1717230umvJo.LLILZIL)) {
            C1717550unR c1717550unR = PhoneApi.LIZ;
            String str = c1717230umvJo.LLILZIL;
            String str2 = c1717230umvJo.LL;
            c1717550unR.getClass();
            InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
            interfaceC1717730unjCreateBuilder.LIZ(new RiskInfoInterceptor(str2));
            interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
            interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(str2));
            interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
            phoneSettingViewModelSo4.LL = (PhoneApi) interfaceC1717730unjCreateBuilder.build().create(PhoneApi.class);
        } else {
            phoneSettingViewModelSo4.setState(AFwS268S0000000_26.get$arr$(565));
            C1AF0.LIZLLL("pa_phone_setting_error", C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, c1717230umvJo.LL)));
        }
        So().AQ2();
    }
}
