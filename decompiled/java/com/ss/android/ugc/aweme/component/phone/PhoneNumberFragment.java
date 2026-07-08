package com.ss.android.ugc.aweme.component.phone;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0V4V;
import X.C1238130iKB;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C14EU;
import X.C1685300txQ;
import X.C168Q;
import X.C1714690uip;
import X.C1715520ukA;
import X.C1716310ulR;
import X.C1717860unw;
import X.C189200o6;
import X.C1948507kB;
import X.C19719912Dl;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C20277814Wa;
import X.C2097908Jt;
import X.C21505219Ec;
import X.C2217381BqS;
import X.C431360Gvm;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C834010Wnf;
import X.C990770btD;
import X.EnumC1716530uln;
import X.InterfaceC1717870unx;
import X.InterfaceC1724030uxt;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PhoneNumberFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1724030uxt {
    public static final C1717860unw LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final HashMap<String, InterfaceC1717870unx> LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88HELIOSJiAiPWEjICoiLGEDICoiLAEmJScpOwkhKSIhLCEn";
    public TuxNavBar LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public TuxTextView LLJI;
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.navArg(this);
    public long LLJILJIL;
    public C1397510mTF LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C19F0<IntentSenderRequest> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhoneNumberFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/component/phone/PhoneNumberVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new C1717860unw();
        LLJJIJI = new HashMap<>();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null && (scene = phoneRouteArgUR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PhoneRouteArg phoneRouteArgUR2 = UR();
        if (phoneRouteArgUR2 != null && (eventParam = phoneRouteArgUR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        this.LLJILJIL = System.currentTimeMillis();
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PhoneRouteArg phoneRouteArgUR3 = UR();
        C1716310ulR.LJFF(c1716310ulR, "bnpl_activate_phone_number", phoneRouteArgUR3 != null ? phoneRouteArgUR3.getPreviousPageId() : null, linkedHashMap);
    }

    public final PhoneRouteArg UR() {
        return (PhoneRouteArg) this.LLJIJIL.getValue();
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c5d) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null && (scene = phoneRouteArgUR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PhoneRouteArg phoneRouteArgUR2 = UR();
        if (phoneRouteArgUR2 != null && (eventParam = phoneRouteArgUR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PhoneRouteArg phoneRouteArgUR3 = UR();
        String previousPageId = phoneRouteArgUR3 != null ? phoneRouteArgUR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.CLOSE;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJILJIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_activate_phone_number", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null && (scene = phoneRouteArgUR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PhoneRouteArg phoneRouteArgUR2 = UR();
        if (phoneRouteArgUR2 != null && (eventParam = phoneRouteArgUR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PhoneRouteArg phoneRouteArgUR3 = UR();
        String previousPageId = phoneRouteArgUR3 != null ? phoneRouteArgUR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.RETURN;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJILJIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_activate_phone_number", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        String eventParam;
        String scene;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null && (scene = phoneRouteArgUR.getScene()) != null) {
            linkedHashMap.put("busi_type", scene);
        }
        PhoneRouteArg phoneRouteArgUR2 = UR();
        if (phoneRouteArgUR2 != null && (eventParam = phoneRouteArgUR2.getEventParam()) != null) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(C1716310ulR.LIZ(eventParam));
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        PhoneRouteArg phoneRouteArgUR3 = UR();
        String previousPageId = phoneRouteArgUR3 != null ? phoneRouteArgUR3.getPreviousPageId() : null;
        EnumC1716530uln enumC1716530uln = EnumC1716530uln.NEXT;
        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LLJILJIL);
        c1716310ulR.getClass();
        C1716310ulR.LJI("bnpl_activate_phone_number", previousPageId, enumC1716530uln, strValueOf, linkedHashMap);
    }

    public PhoneNumberFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhoneNumberVM.class);
        this.LLJILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 961), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 962), AFwS268S0000000_26.get$arr$(109));
        this.LLJJ = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.0uoC
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                Context contextN3;
                ActivityResult activityResult = (ActivityResult) obj;
                Context context = this.LIZ.getContext();
                if (context != null && (contextN3 = C786410Ut5.N3(context)) != null) {
                    if (activityResult.resultCode == -1) {
                        RegionMobileCodeItem regionMobileCodeItem = null;
                        try {
                            C834010Wnf.LIZIZ(contextN3);
                            String strLIZLLL = C833870WnR.LIZLLL(activityResult.data);
                            if (strLIZLLL != null) {
                                try {
                                    C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(strLIZLLL, null);
                                    if (c2218561BsMLJIIZILJ != null) {
                                        AssemVMLazy assemVMLazy = this.LIZ.LLJILLL;
                                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PhoneNumberFragment.LLJJIII;
                                        PhoneNumberVM phoneNumberVM = (PhoneNumberVM) assemVMLazy.getValue();
                                        Iterator<RegionMobileCodeItem> it2 = phoneNumberVM.xQ2().LLILLJJLI.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            RegionMobileCodeItem next = it2.next();
                                            if (Intrinsics.LJFF(next.getMobileCode(), String.valueOf(c2218561BsMLJIIZILJ.getCountryCode()))) {
                                                regionMobileCodeItem = next;
                                                break;
                                            }
                                        }
                                        RegionMobileCodeItem regionMobileCodeItem2 = regionMobileCodeItem;
                                        if (regionMobileCodeItem2 == null) {
                                            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", "not_match"));
                                            c1716310ulR.getClass();
                                            C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ);
                                            phoneNumberVM.setState(AFwS268S0000000_26.get$arr$(533));
                                            return;
                                        }
                                        C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                                        Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("result", "success"));
                                        c1716310ulR2.getClass();
                                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ2);
                                        phoneNumberVM.LLJ = true;
                                        phoneNumberVM.LLJI = String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber());
                                        phoneNumberVM.vQ2(regionMobileCodeItem2.getMobileCode(), regionMobileCodeItem2.getAlpha2(), false);
                                        phoneNumberVM.setState(new AwS605S0100000_26(c2218561BsMLJIIZILJ, 511));
                                        return;
                                    }
                                } catch (C1722250uv1 e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                C1716310ulR c1716310ulR3 = C1716310ulR.LIZ;
                                Map mapLIZJ3 = C2097908Jt.LIZJ(new Pair("result", "parse_null"));
                                c1716310ulR3.getClass();
                                C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ3);
                                return;
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        C1716310ulR c1716310ulR4 = C1716310ulR.LIZ;
                        Map mapLIZJ4 = C2097908Jt.LIZJ(new Pair("result", "number_null"));
                        c1716310ulR4.getClass();
                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ4);
                        return;
                    }
                    C1716310ulR c1716310ulR5 = C1716310ulR.LIZ;
                    Map mapLIZJ5 = C2097908Jt.LIZJ(new Pair("result", "cancel"));
                    c1716310ulR5.getClass();
                    C1716310ulR.LIZLLL("rd_pipo_phone_hint_response", mapLIZJ5);
                }
            }
        });
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String scene;
        EventBus.LIZLLL().LJJI(this);
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null && (scene = phoneRouteArgUR.getScene()) != null) {
            LLJJI.getClass();
            LLJJIJI.remove(scene);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        String scene;
        C19EG activity;
        PhoneRouteArg phoneRouteArgUR = UR();
        if (!TextUtils.equals(phoneRouteArgUR != null ? phoneRouteArgUR.getMode() : null, "reset_mobile") || (activity = getActivity()) == null) {
            C1717860unw c1717860unw = LLJJI;
            PhoneRouteArg phoneRouteArgUR2 = UR();
            if (phoneRouteArgUR2 == null || (scene = phoneRouteArgUR2.getScene()) == null) {
                scene = "";
            }
            C1717860unw.LIZ(c1717860unw, scene, false, null, null, null, 48);
            C20277814Wa.LIZIZ(this);
            return;
        }
        if (this.LLJILJILJ == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131839175);
            c1397580mTM.LIZ(2131839174);
            c1397580mTM.LJII = false;
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 508));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            this.LLJILJILJ = c1397510mTF;
            c1397510mTF.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap<String, String> SR(String str) {
        String string;
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via((Fragment) this), null, 4, null).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            map.put(key, string);
        }
        return map;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        Window window;
        NR(AFwS268S0000000_26.get$arr$(108));
        activityConfiguration(new AwS605S0100000_26(this, 97));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        EventBus.LIZLLL().LJIJJ(this);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null) {
            sourceBtmToken = phoneRouteArgUR.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b70343", sourceBtmToken);
        C1715520ukA.LIZIZ(bundle, "PhoneNumberFragment");
    }

    @C14EU
    public final void onEvent(C990770btD c990770btD) {
        requireActivity().finish();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String customerServiceUrl;
        String coolingOffNotice;
        Context context;
        Context contextN3;
        super.onViewCreated(view, bundle);
        HashMap<String, String> experimentsMap = null;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 127), 3);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1268));
        boolean z = true;
        c0om1.LJ(c1251150ifB);
        PhoneRouteArg phoneRouteArgUR = UR();
        if (phoneRouteArgUR != null) {
            customerServiceUrl = phoneRouteArgUR.getCustomerServiceUrl();
        } else {
            customerServiceUrl = null;
        }
        if (C1948507kB.LIZ(customerServiceUrl)) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1267));
            c0om1.LIZIZ(c1251150ifB2);
        }
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.f681c5b);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        PhoneRouteArg phoneRouteArgUR2 = UR();
        if (phoneRouteArgUR2 != null) {
            coolingOffNotice = phoneRouteArgUR2.getCoolingOffNotice();
            if (coolingOffNotice != null && !a0.LJJJIL(coolingOffNotice)) {
                z = false;
            }
        } else {
            coolingOffNotice = null;
        }
        if (z) {
            View viewFindViewById2 = this.LLJ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.qi3);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJ = viewFindViewById2;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        } else {
            View viewFindViewById3 = this.LLJ;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.qi3);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJ = viewFindViewById3;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            View viewFindViewById4 = this.LLJI;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.qi4);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJI = (TuxTextView) viewFindViewById4;
            }
            ((TextView) viewFindViewById4).setText(coolingOffNotice);
        }
        VR().LJJJJI(12.0f);
        VR().setHighlightColor(0);
        VR().setMovementMethod(C431360Gvm.LIZ());
        PhoneRouteArg phoneRouteArgUR3 = UR();
        if (phoneRouteArgUR3 != null) {
            experimentsMap = phoneRouteArgUR3.getExperimentsMap();
        }
        if (C1714690uip.LIZ(experimentsMap) && (context = getContext()) != null && (contextN3 = C786410Ut5.N3(context)) != null) {
            if (!C0V4V.LIZ(contextN3)) {
                C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", "not_available"));
                c1716310ulR.getClass();
                C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ);
                return;
            }
            C834010Wnf.LIZIZ(contextN3).LJ(new GetPhoneNumberHintIntentRequest(0)).LJFF(new InterfaceC835710WqP() { // from class: X.0uoG
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    try {
                        this.LIZ.LLJJ.LIZ(new C1719660uqq(((PendingIntent) obj).getIntentSender()).LIZ());
                        C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                        Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("result", "success"));
                        c1716310ulR2.getClass();
                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1716310ulR c1716310ulR3 = C1716310ulR.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("launch_fail_");
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        sbLIZ.append(message);
                        Map mapLIZJ3 = C2097908Jt.LIZJ(new Pair("result", C2188811AlT.LIZIZ(sbLIZ)));
                        c1716310ulR3.getClass();
                        C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ3);
                    }
                }
            }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0gNy
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("request_fail_");
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    sbLIZ.append(message);
                    Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("result", C2188811AlT.LIZIZ(sbLIZ)));
                    c1716310ulR2.getClass();
                    C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a.LIZLLL(layoutInflater.getContext());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ac4, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
