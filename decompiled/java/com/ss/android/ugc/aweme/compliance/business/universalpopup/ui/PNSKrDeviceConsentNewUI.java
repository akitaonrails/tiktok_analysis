package com.ss.android.ugc.aweme.compliance.business.universalpopup.ui;

import X.C01GW;
import X.C0HZQ;
import X.C13BV;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1766560w4U;
import X.C1913700zto;
import X.C19332510kF;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C294580Bge;
import X.C431260Gvc;
import X.C444940Hca;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1913590ztd;
import Y.ACListenerS60S0400000_28;
import Y.ACListenerS92S0300000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KRConsentConfig;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSKrDeviceConsentNewUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzHELIOSZiPCE6PiA+Oi4/OCo8PD99PSxiGQEAAzcILDk6KyAPJiEgLSs4ByokHQw=";
    public C0HZQ LLIZ;
    public KRConsentConfig LLJJIII;
    public C1913700zto LLJJIJI;
    public boolean LLJJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 150));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 149));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 158));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 159));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 153));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 154));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 151));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 152));
    public boolean LLJJI = true;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 156));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 155));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 157));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 160));

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
    }

    public final C0HZQ bS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dj_) : null;
            this.LLIZ = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final C197039127h cS() {
        return (C197039127h) this.LLIZLLLIL.getValue();
    }

    public final C0HZQ dS() {
        return (C0HZQ) this.LLJILLL.getValue();
    }

    public final C0HZQ gS() {
        return (C0HZQ) this.LLJILJIL.getValue();
    }

    public final C0HZQ hS() {
        return (C0HZQ) this.LLJI.getValue();
    }

    public final void kS() {
        C0HZQ c0hzqGS;
        C197039127h c197039127hCS = cS();
        if (c197039127hCS != null) {
            C0HZQ c0hzqHS = hS();
            c197039127hCS.setEnabled(c0hzqHS != null && c0hzqHS.isChecked() && (c0hzqGS = gS()) != null && c0hzqGS.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    public final void iS(String str) {
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJL("use_webview_title", true);
        sparkContext.LJJL("hide_status_bar", true);
        sparkContext.LJJL("show_separate_line", false);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public final void mS(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.CONSENT_BOX_KR.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void aS(java.lang.String r3, boolean r4) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1495818221: goto L4d;
                case 623683781: goto L42;
                case 975365518: goto L37;
                case 2064195680: goto L2c;
                default: goto L7;
            }
        L7:
            java.lang.String r3 = ""
        L9:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "consent_box"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "content"
            r2.LJIIIIZZ(r0, r3)
            if (r4 == 0) goto L2a
            r1 = 1
        L1d:
            java.lang.String r0 = "click_type"
            r2.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "register_terms_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L2a:
            r1 = 2
            goto L1d
        L2c:
            java.lang.String r0 = "terms-and-conditions-kr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r3 = "agree_to_personal_information"
            goto L9
        L37:
            java.lang.String r0 = "agree_all"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r3 = "select_all"
            goto L9
        L42:
            java.lang.String r0 = "terms-of-service"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r3 = "agree_to_tiktok_terms_of_service"
            goto L9
        L4d:
            java.lang.String r0 = "consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r3 = "agree_to_receive_notifications_of_marketing_content_and_promotions"
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI.aS(java.lang.String, boolean):void");
    }

    public final void ZR(TuxTextView tuxTextView, String str) {
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = tuxTextView.getContext().getString(2131834725);
        c444940Hca.LIZIZ = true;
        c444940Hca.LIZIZ(52);
        c444940Hca.LIZLLL(0);
        c444940Hca.LJIIIIZZ = new AwS177S1100000_28(this, str, 2);
        tuxTextView.setText(c444940Hca.LIZ(tuxTextView.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        C197039127h c197039127hCS;
        TextView textView2;
        super.onViewCreated(view, bundle);
        if (C294580Bge.LIZ()) {
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            KRConsentConfig kRConsentConfigLJIIJ = null;
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                kRConsentConfigLJIIJ = iPNSConsentConfigServiceLJIIIZ.LJIIJ();
            }
            if (kRConsentConfigLJIIJ != null) {
                RecyclerView recyclerView = (RecyclerView) this.LLJJIJIL.getValue();
                if (recyclerView != null) {
                    List list = kRConsentConfigLJIIJ.checkboxes;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    if (!list.isEmpty()) {
                        this.LLJJIII = kRConsentConfigLJIIJ;
                        View view2 = (View) this.LLJJIJIIJIL.getValue();
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                        }
                        C1913700zto c1913700zto = new C1913700zto(EnumC1913590ztd.CONSENT_BOX_KR.getValue(), list, new AwS642S0100000_28(this, 62));
                        this.LLJJIJI = c1913700zto;
                        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                        recyclerView.setAdapter(c1913700zto);
                        C786410Ut5.LLIZLLLIL(recyclerView, 0);
                        String str = kRConsentConfigLJIIJ.title;
                        if (str != null && str.length() > 0 && (textView2 = (TextView) this.LLJJJ.getValue()) != null) {
                            textView2.setText(str);
                        }
                        String str2 = kRConsentConfigLJIIJ.button;
                        if (str2 != null && str2.length() > 0 && (c197039127hCS = cS()) != null) {
                            c197039127hCS.setText(str2);
                        }
                        String str3 = kRConsentConfigLJIIJ.agreeAll;
                        if (str3 != null && str3.length() > 0 && (textView = (TextView) this.LLJJJIL.getValue()) != null) {
                            textView.setText(str3);
                        }
                        C197039127h c197039127hCS2 = cS();
                        if (c197039127hCS2 != null) {
                            c197039127hCS2.setEnabled(c1913700zto.LLLI());
                        }
                        this.LLJJJJ = true;
                        C0HZQ c0hzq = (C0HZQ) this.LLJ.getValue();
                        if (c0hzq != null) {
                            c0hzq.setChecked(c1913700zto.LLLFZ());
                        }
                        this.LLJJJJ = false;
                        C0HZQ c0hzq2 = (C0HZQ) this.LLJ.getValue();
                        if (c0hzq2 != null) {
                            C786410Ut5.D7(c0hzq2, new C19332510kF(this, 19));
                        }
                        iPNSConsentConfigServiceLJIIIZ.LIZLLL("kr_consent_box");
                        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
                        tuxImmersionBarLIZLLL.LJIIJJI();
                        tuxImmersionBarLIZLLL.LIZLLL();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                        C20684815ws.LJIILLIIL("register_terms_show", c2344009Gk.LIZ);
                        return;
                    }
                }
            } else if (iPNSConsentConfigServiceLJIIIZ != null) {
                iPNSConsentConfigServiceLJIIIZ.LJIIIZ("kr_consent_box");
            }
        }
        kS();
        C0HZQ c0hzq3 = (C0HZQ) this.LLJ.getValue();
        if (c0hzq3 != null) {
            C786410Ut5.D7(c0hzq3, new C19332510kF(this, 0));
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLJIJIL.getValue();
        if (tuxTextView != null) {
            ZR(tuxTextView, "terms-of-service");
        }
        C0HZQ c0hzqHS = hS();
        if (c0hzqHS != null) {
            C786410Ut5.D7(c0hzqHS, new C19332510kF(this, 1));
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLJILJILJ.getValue();
        if (tuxTextView2 != null) {
            ZR(tuxTextView2, "terms-and-conditions-kr");
        }
        C0HZQ c0hzqGS = gS();
        if (c0hzqGS != null) {
            C786410Ut5.D7(c0hzqGS, new C19332510kF(this, 2));
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.LLJJ.getValue();
        if (tuxTextView3 != null) {
            ZR(tuxTextView3, "consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose");
        }
        C0HZQ c0hzqDS = dS();
        if (c0hzqDS != null) {
            C786410Ut5.D7(c0hzqDS, new C19332510kF(this, 3));
        }
        TuxImmersionBar tuxImmersionBarLIZLLL2 = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL2.LJIIJJI();
        tuxImmersionBarLIZLLL2.LIZLLL();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "homepage_hot");
        C20684815ws.LJIILLIIL("register_terms_show", c2344009Gk2.LIZ);
        mS("terms-of-service");
        mS("terms-and-conditions-kr");
        mS("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        String str;
        KRConsentConfig kRConsentConfig = this.LLJJIII;
        C1913700zto c1913700zto = this.LLJJIJI;
        if (kRConsentConfig != null && c1913700zto != null) {
            C197039127h c197039127hCS = cS();
            if (c197039127hCS != null) {
                C786410Ut5.U8(c197039127hCS, new ACListenerS60S0400000_28(awS596S0100000_17, list, this, c1913700zto, 2));
            }
        } else {
            C197039127h c197039127hCS2 = cS();
            if (c197039127hCS2 != null) {
                C786410Ut5.U8(c197039127hCS2, new ACListenerS92S0300000_28(awS596S0100000_17, list, this, 3));
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        if (bS().isChecked()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("trend_on", str);
        C20684815ws.LJIILLIIL("register_terms_click_next", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L35
        Le:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r5.getContext()
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.setTheme(r0)
        L1a:
            r0 = 2131561009(0x7f0d0a31, float:1.8747406E38)
            android.view.View r3 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L27
            r3 = r2
        L27:
            if (r3 == 0) goto L55
            goto L37
        L2a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886939(0x7f12035b, float:1.940847E38)
            r1.setTheme(r0)
            goto L1a
        L35:
            r0 = 0
            goto Le
        L37:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5b
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L52
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5b
        L52:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
