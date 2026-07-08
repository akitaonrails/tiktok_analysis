package com.bytedance.pipo.ttpay.recharge.qrcode;

import X.AbstractC2350809Ja;
import X.AbstractC2361009My;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1222130huN;
import X.C1222150huP;
import X.C1222160huQ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1548820qPI;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1715330ujr;
import X.C1716310ulR;
import X.C1717770unn;
import X.C1719840ur8;
import X.C1719940urI;
import X.C1721850uuN;
import X.C1721860uuO;
import X.C1721880uuQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19514711Wn;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C1976907ol;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C397901gf;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.DialogC1389620mGW;
import X.InterfaceC0148002o;
import X.InterfaceC1222140huO;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC19515111Wr;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ARunnableS29S1200000_26;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.stellar.base.page.StellarPageFragment;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.zhiliaoapp.musically.R;
import defpackage.c5;
import defpackage.h2;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS142S0110000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class QrCodeFragment extends BaseFragment implements InterfaceC724530SbT, IInterceptor, InterfaceC21503819Do {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZjcpKiHELIOScyOiIpZz4hKyooLGECOgYjLSoVOiQrJCo9PA==";
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public final long LLJJJIL = System.currentTimeMillis();
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public C1222160huQ LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public Uri LLJLLIL;
    public AwS142S0110000_26 LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public String LLLFFI;
    public final C1721860uuO LLLFZ;
    public final String LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QrCodeFragment.class, "viewModel", "getViewModel()Lcom/bytedance/pipo/ttpay/recharge/qrcode/QrCodeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0uuO] */
    public QrCodeFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QrCodeViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 107);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(95);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 108), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 109), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 110), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 102));
        this.LLJJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 106));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 105));
        this.LLJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 103));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 111));
        this.LLJLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 101));
        this.LLJZ = System.currentTimeMillis();
        this.LLJZIJLIL = true;
        this.LLLFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(28));
        this.LLLFZ = new AbstractC2361009My() { // from class: X.0uuO
            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                String str2;
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("qr_type", "collect");
                pairArr[1] = new Pair("event_type", "server");
                if (!a0.LJJJIL(str)) {
                    str2 = "success";
                } else {
                    str2 = "fail";
                }
                pairArr[2] = new Pair("result", str2);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                mapLJIIJ.putAll(this.LL.VR());
                C1716310ulR.LIZ.getClass();
                C1716310ulR.LIZLLL("pipo_qrcode_screenshot", mapLJIIJ);
                return false;
            }
        };
        this.LLLI = "qr_code_stellar_fragment" + System.currentTimeMillis();
    }

    public final Map<String, String> VR() {
        Pair[] pairArr = new Pair[14];
        String str = this.LLJI;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        String str2 = this.LLJIJIL;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("previous_page_id", str2);
        pairArr[2] = new Pair("page_id", "receiving_qr_code");
        pairArr[3] = new Pair("busi_line", "tiktokpay");
        String str3 = this.LLIZLLLIL;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("trace_id", str3);
        String str4 = this.LLJILJILJ;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[5] = new Pair("merchant_user_id", str4);
        String str5 = this.LLJJIJI;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[6] = new Pair("country_code", str5);
        String str6 = this.LLJJIJIIJIL;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[7] = new Pair("transaction_amount", str6);
        pairArr[8] = new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        pairArr[9] = new Pair("os_version", Build.VERSION.RELEASE);
        pairArr[10] = new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        pairArr[11] = new Pair("device_id", deviceId != null ? deviceId : "");
        pairArr[12] = new Pair("device_source", "Android");
        pairArr[13] = new Pair("page_style", u.LJIJI(this.LLJJIJIL, "static", true) ? "static" : "dynamic");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final DialogC1389620mGW WR() {
        return (DialogC1389620mGW) this.LLJLIL.getValue();
    }

    public final Map<String, String> ZR() {
        Pair[] pairArr = new Pair[14];
        String str = this.LLJIJIL;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("previous_page_id", str);
        pairArr[1] = new Pair("page_id", "receiving_qr_code");
        pairArr[2] = new Pair("busi_type", "TTPay");
        String str2 = this.LLJILJILJ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("merchant_user_id", str2);
        String str3 = this.LLJJIJI;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("country_code", str3);
        pairArr[5] = new Pair("priority_region", C1717770unn.LJIIIIZZ().getPriorityRegion());
        String str4 = this.LLJI;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[6] = new Pair("source_id", str4);
        pairArr[7] = new Pair("timestamp", String.valueOf(System.currentTimeMillis()));
        pairArr[8] = new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        pairArr[9] = new Pair("os_version", Build.VERSION.RELEASE);
        pairArr[10] = new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        pairArr[11] = new Pair("device_id", deviceId != null ? deviceId : "");
        pairArr[12] = new Pair("device_source", "Android");
        pairArr[13] = new Pair("page_style", u.LJIJI(this.LLJJIJIL, "static", true) ? "static" : "dynamic");
        return C2097608Jq.LJIIJ(pairArr);
    }

    public final QrCodeViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (QrCodeViewModel) assemVMLazy.getValue();
    }

    public final void bS() {
        if (this.LLL && isResumed() && !this.LLLF) {
            IScreenshotService iScreenshotService = (IScreenshotService) this.LLLFF.getValue();
            if (iScreenshotService != null) {
                iScreenshotService.LJFF(this.LLLFZ);
            }
            this.LLLF = true;
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void onActivityFinish() {
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "PIPO_WALLET_QR_RECEIVE_FINISH"));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (this.LLLF) {
            IScreenshotService iScreenshotService = (IScreenshotService) this.LLLFF.getValue();
            if (iScreenshotService != null) {
                iScreenshotService.LIZLLL(this.LLLFZ);
            }
            this.LLLF = false;
        }
        Uri uri = this.LLJLLIL;
        h2.LIZ(String.valueOf(uri != null ? uri.getPath() : null));
        SmartRouter.removeInterceptor(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (this.LLLF) {
            IScreenshotService iScreenshotService = (IScreenshotService) this.LLLFF.getValue();
            if (iScreenshotService != null) {
                iScreenshotService.LIZLLL(this.LLLFZ);
            }
            this.LLLF = false;
        }
        super.onStop();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("quit_type", "close"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJJJIL)));
        mapLJIIJ.putAll(VR());
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_page_stay", mapLJIIJ);
        Map<String, String> mapZR = ZR();
        mapZR.put("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJZ));
        C1716310ulR.LIZLLL("rd_pipo_page_hide", mapZR);
    }

    public final void dS() {
        String str;
        Object c098200Yq;
        Bundle arguments = getArguments();
        String str2 = null;
        this.LLIZ = arguments != null ? arguments.getString("session_id") : null;
        Bundle arguments2 = getArguments();
        this.LLIZLLLIL = arguments2 != null ? arguments2.getString("trace_id") : null;
        Bundle arguments3 = getArguments();
        this.LLJ = arguments3 != null ? arguments3.getString("host") : null;
        Bundle arguments4 = getArguments();
        this.LLJI = arguments4 != null ? arguments4.getString("enter_from") : null;
        Bundle arguments5 = getArguments();
        this.LLJIJIL = arguments5 != null ? arguments5.getString("previous_page_id") : null;
        Bundle arguments6 = getArguments();
        this.LLJILJIL = arguments6 != null ? arguments6.getString("merchant_id") : null;
        Bundle arguments7 = getArguments();
        this.LLJILJILJ = arguments7 != null ? arguments7.getString("merchant_user_id") : null;
        Bundle arguments8 = getArguments();
        this.LLJILLL = arguments8 != null ? arguments8.getString("order_id") : null;
        Bundle arguments9 = getArguments();
        this.LLJJ = arguments9 != null ? arguments9.getString("trade_type") : null;
        Bundle arguments10 = getArguments();
        this.LLJJIII = arguments10 != null ? arguments10.getString("result_link") : null;
        Bundle arguments11 = getArguments();
        this.LLJJJ = arguments11 != null ? arguments11.getString("customer_service_link") : null;
        Bundle arguments12 = getArguments();
        this.LLJJIJI = arguments12 != null ? arguments12.getString("country_code") : null;
        Bundle arguments13 = getArguments();
        this.LLJJIJIIJIL = arguments13 != null ? arguments13.getString("transaction_amount") : null;
        Bundle arguments14 = getArguments();
        this.LLJJIJIL = arguments14 != null ? arguments14.getString("qr_code_type") : null;
        Bundle arguments15 = getArguments();
        this.LLLFFI = arguments15 != null ? arguments15.getString("source_btm_token") : null;
        Bundle arguments16 = getArguments();
        String string = arguments16 != null ? arguments16.getString("stellar_url") : null;
        if (u.LJIJI(this.LLJJIJIL, "static", true) && (string == null || string.length() == 0)) {
            string = this.LLJJI;
        }
        this.LLJJI = string;
        if (u.LJIJI(this.LLJJIJIL, "static", true) && (str = this.LLJJIJIIJIL) != null && str.length() != 0) {
            String str3 = this.LLJJI;
            String str4 = this.LLJJIJIIJIL;
            if (str3 != null) {
                if (str4 == null) {
                    str2 = str3;
                } else {
                    try {
                        Uri uri = UriProtector.parse(str3);
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        String strDecode = Uri.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        JSONObject jSONObject = strDecode.length() == 0 ? new JSONObject() : new JSONObject(strDecode);
                        jSONObject.put("request_amount", str4);
                        c098200Yq = C1719940urI.LIZJ(uri, "extra", Uri.encode(C786410Ut5.J3(jSONObject))).toString();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Object obj = str3;
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    str2 = (String) obj;
                }
            }
            this.LLJJI = str2;
        }
        try {
            C19EG activity = getActivity();
            if (activity != null) {
                BtmSDK.INSTANCE.registerBtmPageOnCreate(activity, "a2270.b34672", this.LLLFFI);
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            PageFinder pageFinderVia = PageFinder.via(getActivity());
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("active_scenario", "QR_CODE");
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJZ = System.currentTimeMillis();
        Uri uri = this.LLJLLIL;
        h2.LIZ(String.valueOf(uri != null ? uri.getPath() : null));
        bS();
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        C20277814Wa.LIZIZ(this);
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "leave"), new Pair("quit_type", "return"), new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJJJIL)));
        mapLJIIJ.putAll(VR());
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_page_stay", mapLJIIJ);
    }

    public static Bundle SR(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String UR(boolean z) {
        Uri uriLIZJ;
        Uri uriLIZJ2;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2;
        Uri uri;
        String str;
        String str2 = this.LLJJI;
        Uri uriBuild = null;
        if (str2 != null) {
            uriLIZJ = UriProtector.parse(str2);
        } else {
            uriLIZJ = null;
        }
        String str3 = this.LLJJI;
        if (str3 != null && (uri = UriProtector.parse(str3)) != null && (str = this.LLJI) != null) {
            uriLIZJ = C1719940urI.LIZJ(uri, "enter_from", str);
        }
        if (uriLIZJ != null && (uriLIZJ2 = C1719940urI.LIZJ(uriLIZJ, "current_time", "31420800000")) != null && (builderBuildUpon = uriLIZJ2.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("previous_page_id", this.LLJIJIL)) != null && (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("trace_id", this.LLIZLLLIL)) != null) {
            if (z) {
                builderAppendQueryParameter2.appendQueryParameter("report_page_event", CardStruct.IStatusCode.DEFAULT);
                builderAppendQueryParameter2.appendQueryParameter("page_id", "receiving_qr_code");
            }
            uriBuild = builderAppendQueryParameter2.build();
        }
        return String.valueOf(uriBuild);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return u.LJIJI(host, "pipo", false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Unit unit;
        super.onCreate(bundle);
        try {
            List<String> list = c5.LIZ().preloadImageUrls;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(it2.next());
                    c1331670kl3LJIIIZ.LJJIJL(getContext());
                    c1331670kl3LJIIIZ.LIZLLL("ttpay_qr_code");
                    c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LJIIIZ.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.0utl
                        @Override // X.InterfaceC605070NoH
                        public final void LIZ(File file) {
                        }

                        @Override // X.InterfaceC605070NoH
                        public final void onFailed(Throwable th) {
                        }
                    });
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C786410Ut5.LJJIIZI(bundle, getArguments(), "arguments");
        C786410Ut5.LJJJI("last_stellar_fragment_tag", this.LLLI, bundle);
        super.onSaveInstanceState(bundle);
    }

    public static void cS(ImageView imageView, String str) {
        try {
            byte[] bArrDecode = Base64.decode(a0.LJJLJLI(str, ",", str), 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (imageView != null) {
                imageView.setImageBitmap(bitmapDecodeByteArray);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String[] strArr;
        Bundle bundleSR;
        String string10;
        Bundle bundleSR2;
        Bundle bundleSR3;
        Bundle bundleSR4;
        Bundle bundleSR5;
        Bundle bundleSR6;
        Bundle bundleSR7;
        Bundle bundleSR8;
        Bundle bundleSR9;
        Bundle bundleSR10;
        Bundle bundleSR11 = null;
        if (routeIntent != null && (path = routeIntent.getPath()) != null) {
            int iHashCode = path.hashCode();
            if (iHashCode != -557918864) {
                if (iHashCode != -115426740) {
                    if (iHashCode == 870924860 && path.equals("/qr_code")) {
                        Intent extra = routeIntent.getExtra();
                        if (extra != null) {
                            bundleSR11 = SR(extra);
                        }
                        setArguments(bundleSR11);
                        dS();
                        C1222160huQ c1222160huQ = this.LLJJJJLIIL;
                        if (c1222160huQ != null) {
                            c1222160huQ.LIZ(UR(true));
                        }
                        aS().LLILLJJLI = new C1721880uuQ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIJIL);
                        aS().vQ2(ZR());
                        return true;
                    }
                    return false;
                }
                if (!path.equals("/qr_code/share")) {
                    return false;
                }
            } else if (!path.equals("/qr_code/save")) {
                return false;
            }
            Intent extra2 = routeIntent.getExtra();
            String str = "";
            if (extra2 == null || (bundleSR10 = SR(extra2)) == null || (string = bundleSR10.getString("user_info")) == null) {
                string = "";
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 == null || (bundleSR9 = SR(extra3)) == null || (string2 = bundleSR9.getString("qr_code")) == null) {
                string2 = "";
            }
            Intent extra4 = routeIntent.getExtra();
            if (extra4 == null || (bundleSR8 = SR(extra4)) == null || (string3 = bundleSR8.getString("expiration_time_content")) == null) {
                string3 = "";
            }
            Intent extra5 = routeIntent.getExtra();
            if (extra5 == null || (bundleSR7 = SR(extra5)) == null || (string4 = bundleSR7.getString("expiration_time_value")) == null) {
                string4 = "";
            }
            Intent extra6 = routeIntent.getExtra();
            if (extra6 == null || (bundleSR6 = SR(extra6)) == null || (string5 = bundleSR6.getString("amount_content")) == null) {
                string5 = "";
            }
            Intent extra7 = routeIntent.getExtra();
            if (extra7 == null || (bundleSR5 = SR(extra7)) == null || (string6 = bundleSR5.getString("amount_value")) == null) {
                string6 = "";
            }
            Intent extra8 = routeIntent.getExtra();
            if (extra8 == null || (bundleSR4 = SR(extra8)) == null || (string7 = bundleSR4.getString("logo")) == null) {
                string7 = "";
            }
            boolean zLJFF = Intrinsics.LJFF(routeIntent.getPath(), "/qr_code/save");
            Intent extra9 = routeIntent.getExtra();
            if (extra9 == null || (bundleSR3 = SR(extra9)) == null || (string8 = bundleSR3.getString("qr_title")) == null) {
                string8 = "";
            }
            Intent extra10 = routeIntent.getExtra();
            if (extra10 == null || (bundleSR2 = SR(extra10)) == null || (string9 = bundleSR2.getString("tel")) == null) {
                string9 = "";
            }
            Intent extra11 = routeIntent.getExtra();
            if (extra11 != null && (bundleSR = SR(extra11)) != null && (string10 = bundleSR.getString("user_name")) != null) {
                str = string10;
            }
            final C1721850uuN c1721850uuN = new C1721850uuN(this, string8, string, string9, string2, string3, string4, string5, string6, string7, str, zLJFF);
            final AwS142S0110000_26 awS142S0110000_26 = new AwS142S0110000_26(this, zLJFF, 4);
            if (zLJFF && Build.VERSION.SDK_INT >= 29) {
                c1721850uuN.invoke();
            } else {
                C19EG activity = getActivity();
                if (activity != null) {
                    C19741112Lp.LIZ.getClass();
                    if (C19741112Lp.LJFF(activity)) {
                        c1721850uuN.invoke();
                        return true;
                    }
                    if (Build.VERSION.SDK_INT < 33) {
                        strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
                    } else {
                        strArr = new String[]{"android.permission.MANAGE_EXTERNAL_STORAGE"};
                    }
                    C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-pipo_ttpay_request_media_image_storage_permissions")).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0uuP
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            for (C0HWO c0hwo : c0hwoArr) {
                                int i = C449000Hj8.LIZ[c0hwo.LIZIZ.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                                            Map<String, String> mapZR = this.ZR();
                                            mapZR.put("error_type", "permission_denied");
                                            mapZR.put("error_code", "1");
                                            c1716310ulR.getClass();
                                            C1716310ulR.LIZLLL("rd_pipo_common_error", mapZR);
                                            awS142S0110000_26.invoke();
                                        } else {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        C1716310ulR c1716310ulR2 = C1716310ulR.LIZ;
                                        Map<String, String> mapZR2 = this.ZR();
                                        mapZR2.put("error_type", "permission_denied");
                                        mapZR2.put("error_code", CardStruct.IStatusCode.DEFAULT);
                                        c1716310ulR2.getClass();
                                        C1716310ulR.LIZLLL("rd_pipo_common_error", mapZR2);
                                        awS142S0110000_26.invoke();
                                    }
                                } else {
                                    c1721850uuN.invoke();
                                }
                            }
                        }
                    });
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int iLIZJ;
        Fragment fragment;
        C19EG activity;
        FragmentManager supportFragmentManager;
        int id;
        String string2;
        C1222160huQ c1222160huQ;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String string3;
        String string4;
        String string5;
        String str14;
        String string6;
        Long l;
        Integer num;
        Long l2;
        Integer num2;
        Integer num3;
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        int iIntValue = 1;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZ(R.raw.icon_chevron_left_offset_ltr);
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 104));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("title")) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        View view2 = (View) this.LLJLL.getValue();
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            iLIZJ = C497820Jfg.LIZJ(activity2);
        } else {
            iLIZJ = 0;
        }
        C1715330ujr.LIZIZ(iLIZJ, view2);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJLL.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLJLILLLLZIIL.getValue();
        if (c1749280vcc != null) {
            c1749280vcc.setLayoutVariant(2);
        }
        final C19EG activity3 = getActivity();
        String string7 = null;
        if (activity3 != null) {
            FragmentManager supportFragmentManager2 = activity3.getSupportFragmentManager();
            if (bundle != null) {
                string2 = bundle.getString("last_stellar_fragment_tag");
            } else {
                string2 = null;
            }
            Fragment fragmentLJJJJZI = supportFragmentManager2.LJJJJZI(string2);
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = supportFragmentManager2.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIIZ();
            }
            C1222150huP c1222150huP = new C1222150huP();
            c1222150huP.LIZIZ = UR(true);
            c1222150huP.LIZJ = new InterfaceC1222140huO() { // from class: X.0uuM
                @Override // X.InterfaceC1222140huO
                public final void LIZ() {
                }

                @Override // X.InterfaceC1222140huO
                public final void LIZJ() {
                    String string8;
                    QrCodeFragment qrCodeFragment = this;
                    qrCodeFragment.LLL = true;
                    qrCodeFragment.bS();
                    QrCodeFragment qrCodeFragment2 = this;
                    qrCodeFragment2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b34672", PageFinder.via(qrCodeFragment2.getActivity()), null, 4, null).entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == null || (string8 = value.toString()) == null) {
                            string8 = "";
                        }
                        linkedHashMap.put(key, string8);
                    }
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("render_cost", String.valueOf(System.currentTimeMillis() - qrCodeFragment2.LLJJJIL)));
                    mapLJIIJ.putAll(linkedHashMap);
                    mapLJIIJ.putAll(qrCodeFragment2.VR());
                    C1716310ulR.LIZ.getClass();
                    C1716310ulR.LIZLLL("pipo_page_show", mapLJIIJ);
                    Map<String, String> mapZR = qrCodeFragment2.ZR();
                    mapZR.put("first_render", qrCodeFragment2.LLJZIJLIL ? "1" : CardStruct.IStatusCode.DEFAULT);
                    mapZR.put("api_status", "1");
                    mapZR.put("time_cost", String.valueOf(System.currentTimeMillis() - qrCodeFragment2.LLJJJIL));
                    C1716310ulR.LIZLLL("rd_pipo_page_show", mapZR);
                    qrCodeFragment2.LLJZIJLIL = false;
                }

                @Override // X.InterfaceC1222140huO
                public final void LIZIZ(String str15) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS29S1200000_26(this, activity3, str15, 2));
                }
            };
            StellarPageFragment stellarPageFragment = new StellarPageFragment();
            String str15 = c1222150huP.LIZIZ;
            if (str15 != null && str15.length() != 0) {
                C1222130huN.LIZ.getClass();
                C1719840ur8 c1719840ur8LIZJ = C1222130huN.LIZJ(str15);
                Bundle bundle2 = new Bundle();
                if (c1719840ur8LIZJ != null) {
                    str = c1719840ur8LIZJ.LLILLL;
                } else {
                    str = null;
                }
                C786410Ut5.LJJJI("page_id", str, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str2 = c1719840ur8LIZJ.LLIZ;
                } else {
                    str2 = null;
                }
                C786410Ut5.LJJJI("host", str2, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str3 = c1719840ur8LIZJ.LLIZLLLIL;
                } else {
                    str3 = null;
                }
                C786410Ut5.LJJJI("path", str3, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str4 = c1719840ur8LIZJ.LLJI;
                } else {
                    str4 = null;
                }
                C786410Ut5.LJJJI("extra", str4, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str5 = c1719840ur8LIZJ.LL;
                } else {
                    str5 = null;
                }
                C786410Ut5.LJJJI("entrance", str5, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str6 = c1719840ur8LIZJ.LLILLJJLI;
                } else {
                    str6 = null;
                }
                C786410Ut5.LJJJI("enter_from", str6, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str7 = c1719840ur8LIZJ.LLILZ;
                } else {
                    str7 = null;
                }
                C786410Ut5.LJJJI("previous_page_id", str7, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str8 = c1719840ur8LIZJ.LLILZIL;
                } else {
                    str8 = null;
                }
                C786410Ut5.LJJJI("trace_id", str8, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str9 = c1719840ur8LIZJ.LLILZLL;
                } else {
                    str9 = null;
                }
                C786410Ut5.LJJJI("session_id", str9, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str10 = c1719840ur8LIZJ.LLJ;
                } else {
                    str10 = null;
                }
                C786410Ut5.LJJJI("merchant_id", str10, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str11 = c1719840ur8LIZJ.LLJIJIL;
                } else {
                    str11 = null;
                }
                C786410Ut5.LJJJI("page_title", str11, bundle2);
                C786410Ut5.LJJJI("container_id", c1222150huP.LIZ, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str12 = c1719840ur8LIZJ.LLJILJILJ;
                } else {
                    str12 = null;
                }
                C786410Ut5.LJJJI("target_page", str12, bundle2);
                if (c1719840ur8LIZJ != null && (num3 = c1719840ur8LIZJ.LLJJ) != null) {
                    iIntValue = num3.intValue();
                }
                bundle2.putInt("report_page_event", iIntValue);
                if (c1719840ur8LIZJ != null) {
                    str13 = c1719840ur8LIZJ.LLJJI;
                } else {
                    str13 = null;
                }
                C786410Ut5.LJJJI("btm_id", str13, bundle2);
                if (c1719840ur8LIZJ != null && (num2 = c1719840ur8LIZJ.LLJJIII) != null) {
                    string3 = num2.toString();
                } else {
                    string3 = null;
                }
                C786410Ut5.LJJJI("need_polling", string3, bundle2);
                if (c1719840ur8LIZJ != null && (l2 = c1719840ur8LIZJ.LLJJIJI) != null) {
                    string4 = l2.toString();
                } else {
                    string4 = null;
                }
                C786410Ut5.LJJJI("polling_interval", string4, bundle2);
                if (c1719840ur8LIZJ != null && (num = c1719840ur8LIZJ.LLJJIJIIJIL) != null) {
                    string5 = num.toString();
                } else {
                    string5 = null;
                }
                C786410Ut5.LJJJI("sum_times", string5, bundle2);
                if (c1719840ur8LIZJ != null) {
                    str14 = c1719840ur8LIZJ.LLJJIJIL;
                } else {
                    str14 = null;
                }
                C786410Ut5.LJJJI("polling_params", str14, bundle2);
                if (c1719840ur8LIZJ != null && (l = c1719840ur8LIZJ.LLJJJ) != null) {
                    string6 = l.toString();
                } else {
                    string6 = null;
                }
                C786410Ut5.LJJJI("current_time", string6, bundle2);
                stellarPageFragment.setArguments(bundle2);
                String str16 = c1222150huP.LIZ;
                if (str16 != null) {
                    C1222130huN.LIZIZ.put(str16, new WeakReference<>(c1222150huP));
                }
                c1222160huQ = new C1222160huQ(stellarPageFragment);
            } else {
                c1222160huQ = null;
            }
            this.LLJJJJLIIL = c1222160huQ;
        }
        C1222160huQ c1222160huQ2 = this.LLJJJJLIIL;
        if (c1222160huQ2 != null && (fragment = c1222160huQ2.LIZ) != null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            C19EH c19ehLJIIJ2 = supportFragmentManager.LJIIJ();
            if (bundle != null) {
                string7 = bundle.getString("last_stellar_fragment_tag");
            }
            Fragment fragmentLJJJJZI2 = supportFragmentManager.LJJJJZI(string7);
            if (fragmentLJJJJZI2 != null) {
                c19ehLJIIJ2.LJIIZILJ(fragmentLJJJJZI2);
            }
            View view3 = (View) this.LLJJJJJIL.getValue();
            if (view3 != null) {
                id = view3.getId();
            } else {
                id = -1;
            }
            c19ehLJIIJ2.LIZJ(id, fragment, this.LLLI);
            c19ehLJIIJ2.LJJIFFI(fragment);
            c19ehLJIIJ2.LJIIIZ();
        }
        C736680Sv4.LJIIIIZZ(this, aS(), new C2217381BqS() { // from class: X.0uuW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721920uuU) obj).LLILLJJLI;
            }
        }, null, AFwS313S0000000_26.get$arr$(35), 6);
        C736680Sv4.LJIIIIZZ(this, aS(), new C2217381BqS() { // from class: X.0uuX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1721920uuU) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 109), 6);
        aS().LLILLJJLI = new C1721880uuQ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIJIL);
        aS().vQ2(ZR());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("arguments");
            if (bundle2 == null) {
                bundle2 = getArguments();
            }
            setArguments(bundle2);
        }
        dS();
        SmartRouter.addInterceptor(this);
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapZR = ZR();
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_page_enter", mapZR);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9i, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
