package com.ss.android.ugc.aweme.i18n.settings.agreements;

import X.C0AJ3;
import X.C0OM1;
import X.C1237450iJ5;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6
public final class AgreementPage extends BasePage implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zix9cSF9OyHELIOSA4PSY9LzZiKCghLSAhLCEnO2sNLj02LSgpJzsDKSIp";
    public WebView LLJ;
    public TextView LLJI;
    public View LLJIJIL;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5m;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        WebView webView;
        super.onPause();
        if (((Boolean) C0AJ3.LIZ.getValue()).booleanValue() || (webView = this.LLJ) == null) {
            return;
        }
        webView.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        WebView webView;
        super.onResume();
        if (((Boolean) C0AJ3.LIZ.getValue()).booleanValue() || (webView = this.LLJ) == null) {
            return;
        }
        webView.onResume();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SR();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        String string;
        WebSettings settings;
        this.LLJI = (TextView) view.findViewById(R.id.am8);
        this.LLJIJIL = view.findViewById(R.id.nn7);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i = 0;
                    String str = "";
                    if (extras.getBoolean("HIDE_TITLE_BAR", false) || (string = extras.getString("FIELD_TITLE")) == null) {
                        string = "";
                    }
                    C0OM1 c0om1 = new C0OM1();
                    C1237450iJ5.LIZIZ(c0om1, string, new AwS560S0100000_16(this, 310));
                    tuxNavBar.setNavActions(c0om1);
                    boolean z = extras.getBoolean("FIELD_SHOW_AGREE_BUTTON", false);
                    String string2 = extras.getString("URL_FIELD");
                    if (string2 != null) {
                        str = string2;
                    }
                    TextView textView = this.LLJI;
                    if (textView != null) {
                        if (!z) {
                            i = 8;
                        }
                        C786410Ut5.LLIL(textView, i);
                    }
                    TextView textView2 = this.LLJI;
                    if (textView2 != null) {
                        C786410Ut5.T7(textView2, this);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (!((Boolean) C0AJ3.LIZ.getValue()).booleanValue()) {
                            WebView webView = (WebView) view.findViewById(R.id.os6);
                            this.LLJ = webView;
                            if (webView != null) {
                                C786410Ut5.ue(webView, str);
                            }
                            WebView webView2 = this.LLJ;
                            if (webView2 != null) {
                                C786410Ut5.te(webView2, new WebViewClient() { // from class: X.0dog
                                    public final boolean LIZ(WebView webView3, String str2) {
                                        String lowerCase;
                                        Uri uri = UriProtector.parse(str2);
                                        String scheme = uri.getScheme();
                                        if (scheme != null) {
                                            lowerCase = scheme.toLowerCase(Locale.getDefault());
                                        } else {
                                            lowerCase = null;
                                        }
                                        if (Intrinsics.LJFF("market", lowerCase)) {
                                            Intent intent2 = new Intent("android.intent.action.VIEW");
                                            intent2.setData(uri);
                                            intent2.addFlags(268435456);
                                            Context context = webView3.getContext();
                                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
                                            C1701330uNH.LIZ(intent2, context);
                                            C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAzzdfdm9tQOqGXasmKcNh1tPv3DZuJ6puVmYYsSxL84g9", null));
                                            return true;
                                        }
                                        return super.shouldOverrideUrlLoading(webView3, str2);
                                    }

                                    @Override // android.webkit.WebViewClient
                                    public final void onPageFinished(WebView webView3, String str2) {
                                        super.onPageFinished(webView3, str2);
                                        View view2 = this.LIZ.LLJIJIL;
                                        if (view2 != null) {
                                            C786410Ut5.LJLLLLLL(8, view2);
                                        }
                                    }

                                    @Override // android.webkit.WebViewClient
                                    public final boolean shouldOverrideUrlLoading(WebView webView3, String str2) {
                                        if (C794280VDu.LIZ(webView3, "seclink")) {
                                            return LIZ(webView3, str2);
                                        }
                                        C1064860doi.LIZ.getClass();
                                        if (C1064860doi.LIZLLL(webView3, str2)) {
                                            return true;
                                        }
                                        return LIZ(webView3, str2);
                                    }
                                });
                            }
                            WebView webView3 = this.LLJ;
                            if (webView3 != null && (settings = webView3.getSettings()) != null) {
                                settings.setJavaScriptEnabled(true);
                                return;
                            }
                            return;
                        }
                        View view2 = this.LLJIJIL;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme://webview?url=");
                        sbLIZ.append(str);
                        SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ)).open();
                        SR();
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        SR();
    }
}
