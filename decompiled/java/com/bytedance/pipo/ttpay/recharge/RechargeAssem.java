package com.bytedance.pipo.ttpay.recharge;

import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1715330ujr;
import X.C1716310ulR;
import X.C1717770unn;
import X.C1719440uqU;
import X.C1721560utu;
import X.C1749280vcc;
import X.C1775680wJC;
import X.C1776190wK1;
import X.C1776210wK3;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C343970De7;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class RechargeAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final long LLIZLLLIL = System.currentTimeMillis();
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1721560utu.class, "recharge_arg"), checkSupervisorPrepared());
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final Map<String, Long> LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeAssem.class, "vm", "getVm()Lcom/bytedance/pipo/ttpay/recharge/RechargeViewmodel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RechargeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargeViewmodel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 124), AFwS268S0000000_26.get$arr$(56), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 97));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 99));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 98));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 92));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 94));
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 95));
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 96));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 93));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 100));
        this.LLJJIJIL = true;
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 123));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final EditText Go() {
        return (EditText) this.LLJILLL.getValue();
    }

    public final C1721560utu Ho() {
        return (C1721560utu) this.LLJ.getValue();
    }

    public final C197039127h Jo() {
        return (C197039127h) this.LLJJIJI.getValue();
    }

    public final TuxTextView Lo() {
        return (TuxTextView) this.LLJJ.getValue();
    }

    public final TuxTextView No() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final Map<String, String> Oo() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Pair[] pairArr = new Pair[12];
        C1721560utu c1721560utuHo = Ho();
        if (c1721560utuHo == null || (str = c1721560utuHo.LLILZ) == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        C1721560utu c1721560utuHo2 = Ho();
        if (c1721560utuHo2 == null || (str2 = c1721560utuHo2.LLILZIL) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("previous_page_id", str2);
        pairArr[2] = new Pair("page_id", "receiving_qr_create");
        pairArr[3] = new Pair("busi_line", "tiktokpay");
        C1721560utu c1721560utuHo3 = Ho();
        if (c1721560utuHo3 == null || (str3 = c1721560utuHo3.LLILLL) == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("trace_id", str3);
        C1721560utu c1721560utuHo4 = Ho();
        if (c1721560utuHo4 == null || (str4 = c1721560utuHo4.LLIZLLLIL) == null) {
            str4 = "";
        }
        pairArr[5] = new Pair("merchant_user_id", str4);
        C1721560utu c1721560utuHo5 = Ho();
        if (c1721560utuHo5 == null || (str5 = c1721560utuHo5.LLJJIII) == null) {
            str5 = "";
        }
        pairArr[6] = new Pair("country_code", str5);
        pairArr[7] = new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        pairArr[8] = new Pair("os_version", Build.VERSION.RELEASE);
        pairArr[9] = new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        pairArr[10] = new Pair("device_id", deviceId != null ? deviceId : "");
        pairArr[11] = new Pair("device_source", "Android");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final Map<String, String> So() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Pair[] pairArr = new Pair[14];
        C1721560utu c1721560utuHo = Ho();
        String str6 = "";
        if (c1721560utuHo == null || (str = c1721560utuHo.LLILZIL) == null) {
            str = "";
        }
        pairArr[0] = new Pair("previous_page_id", str);
        pairArr[1] = new Pair("page_id", "receiving_qr_create");
        pairArr[2] = new Pair("busi_type", "TTPay");
        C1721560utu c1721560utuHo2 = Ho();
        if (c1721560utuHo2 == null || (str2 = c1721560utuHo2.LLIZLLLIL) == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("merchant_user_id", str2);
        C1721560utu c1721560utuHo3 = Ho();
        if (c1721560utuHo3 == null || (str3 = c1721560utuHo3.LLJJIII) == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("country_code", str3);
        pairArr[5] = new Pair("priority_region", C1717770unn.LJIIIIZZ().getPriorityRegion());
        C1721560utu c1721560utuHo4 = Ho();
        if (c1721560utuHo4 == null || (str4 = c1721560utuHo4.LLILZ) == null) {
            str4 = "";
        }
        pairArr[6] = new Pair("source_id", str4);
        pairArr[7] = new Pair("timestamp", String.valueOf(System.currentTimeMillis()));
        pairArr[8] = new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        pairArr[9] = new Pair("os_version", Build.VERSION.RELEASE);
        pairArr[10] = new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        pairArr[11] = new Pair("device_id", deviceId);
        pairArr[12] = new Pair("device_source", "Android");
        C1721560utu c1721560utuHo5 = Ho();
        if (c1721560utuHo5 != null && (str5 = c1721560utuHo5.LLJIJIL) != null) {
            str6 = str5;
        }
        pairArr[13] = new Pair("ui_type", str6);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public final RechargeViewmodel Vo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (RechargeViewmodel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapSo = So();
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_page_enter", mapSo);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJJJ.put("user_resume_time", Long.valueOf(this.LLIZLLLIL));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C1717770unn.LIZIZ().isAppBackGround()) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("quit_type", "close"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL)));
            mapLJIIJ.putAll(Oo());
            C1716310ulR.LIZ.getClass();
            C1716310ulR.LIZLLL("pipo_page_stay", mapLJIIJ);
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapSo = So();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) this.LLJJJ).get("user_resume_time");
        mapSo.put("stay_time", String.valueOf(jCurrentTimeMillis - (l != null ? l.longValue() : 0L)));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_page_hide", mapSo);
    }

    public final void Zo(String str) {
        String strCreateJumpSourceBtmToken;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String str2 = null;
        if (fragmentLJI != null) {
            strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b15220.c84583.d55594", PageFinder.via(fragmentLJI), null);
        } else {
            strCreateJumpSourceBtmToken = null;
        }
        if (strCreateJumpSourceBtmToken != null && strCreateJumpSourceBtmToken.length() != 0) {
            builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
        }
        String string = builderBuildUpon.build().toString();
        Context context = getContext();
        if (context != null) {
            C1719440uqU.LIZ(context, string, "ttpay");
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("quit_type", "next"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL)));
            mapLJIIJ.putAll(Oo());
            C1716310ulR.LIZ.getClass();
            C1716310ulR.LIZLLL("pipo_page_stay", mapLJIIJ);
        }
        C1721560utu c1721560utuHo = Ho();
        if (c1721560utuHo != null) {
            str2 = c1721560utuHo.LLJIJIL;
        }
        if (u.LJIJI(str2, "FULL_PAGE", false)) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                c19egLIZ.finish();
                return;
            }
            return;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null) {
            return;
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(fragmentLJI2, C343970De7.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String str3;
        Context context;
        Integer numLIZJ;
        PageFinder pageFinderVia;
        String string;
        OnBackPressedDispatcher onBackPressedDispatcher;
        String str4;
        super.onViewCreated(view);
        C1721560utu c1721560utuHo = Ho();
        String str5 = null;
        if (c1721560utuHo != null) {
            str = c1721560utuHo.LLJIJIL;
        } else {
            str = null;
        }
        if (u.LJIJI(str, "FULL_PAGE", true)) {
            C1715330ujr.LIZIZ(C12ES.LJIIJJI(view.getContext()), (View) this.LLJIJIL.getValue());
        }
        C0OM1 c0om1 = new C0OM1();
        C1721560utu c1721560utuHo2 = Ho();
        if (c1721560utuHo2 != null) {
            str2 = c1721560utuHo2.LLJIJIL;
        } else {
            str2 = null;
        }
        if (u.LJIJI(str2, "FULL_PAGE", true)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZ(R.raw.icon_chevron_left_offset_ltr);
            c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1378));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            C1721560utu c1721560utuHo3 = Ho();
            if (c1721560utuHo3 == null || (str4 = c1721560utuHo3.LLJJIJIL) == null) {
                str4 = "";
            }
            c1250250idj.LIZJ = str4;
            c0om1.LIZJ = c1250250idj;
        } else {
            C1250250idj c1250250idj2 = new C1250250idj();
            C1721560utu c1721560utuHo4 = Ho();
            if (c1721560utuHo4 == null || (str3 = c1721560utuHo4.LLJJIJIL) == null) {
                str3 = "";
            }
            c1250250idj2.LIZJ = str3;
            c0om1.LIZJ = c1250250idj2;
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZ(R.raw.icon_x_mark_small);
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1379));
            c0om1.LIZIZ(c1251150ifB2);
        }
        ((TuxNavBar) this.LLJIJIL.getValue()).setNavActions(c0om1);
        ((TuxNavBar) this.LLJIJIL.getValue()).setNavBackground(0);
        RechargeViewmodel rechargeViewmodelVo = Vo();
        selectSubscribe(rechargeViewmodelVo, new C2217381BqS() { // from class: X.0uuF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0uuG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJI;
            }
        }, new C2217381BqS() { // from class: X.0uu6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJILLL;
            }
        }, new C2217381BqS() { // from class: X.0uu7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0uu8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(rechargeViewmodelVo.usedInReusedScene), null, new C1776210wK3(this, 6));
        RechargeViewmodel rechargeViewmodelVo2 = Vo();
        selectSubscribe(rechargeViewmodelVo2, new C2217381BqS() { // from class: X.0uu9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJ;
            }
        }, new C2217381BqS() { // from class: X.0uuH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0uuI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJILJIL;
            }
        }, C736820SvI.LIZIZ(rechargeViewmodelVo2.usedInReusedScene), null, new C1776190wK1(this, 7));
        RechargeViewmodel rechargeViewmodelVo3 = Vo();
        selectSubscribe(rechargeViewmodelVo3, new C2217381BqS() { // from class: X.0uto
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0uuA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0uuB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(rechargeViewmodelVo3.usedInReusedScene), null, new C1776190wK1(this, 8));
        RechargeViewmodel rechargeViewmodelVo4 = Vo();
        selectSubscribe(rechargeViewmodelVo4, new C2217381BqS() { // from class: X.0uuC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0uuD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0uuJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0uuE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJILJILJ;
            }
        }, new C2217381BqS() { // from class: X.0uuK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721620uu0) obj).LLJJ;
            }
        }, C736820SvI.LIZIZ(rechargeViewmodelVo4.usedInReusedScene), null, new C1776210wK3(this, 7));
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, new C1775680wJC(this, 1));
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("button_id", "back"));
        mapLJIIJ.putAll(Oo());
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (pageFinderVia = PageFinder.via(fragmentLJI)) != null) {
                for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b15220.c99050.d8187", pageFinderVia, null, 4, null).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    mapLJIIJ.put(key, string);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_button_show", mapLJIIJ);
        C1721560utu c1721560utuHo5 = Ho();
        if (c1721560utuHo5 != null) {
            str5 = c1721560utuHo5.LLJIJIL;
        }
        if (u.LJIJI(str5, "HALF_PAGE", true) && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
            LJJIJL().setBackgroundColor(numLIZJ.intValue());
        }
        ((C1749280vcc) this.LLJJIJIIJIL.getValue()).setLayoutVariant(2);
        Vo().yQ2(this.LLJJJ);
    }
}
