package com.ss.android.ugc.aweme.home;

import X.C01D1;
import X.C01GW;
import X.C07M6;
import X.C0OM1;
import X.C123100dR;
import X.C1238130iKB;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390410mHn;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1722790uvt;
import X.C1722850uvz;
import X.C1722940uw8;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C20642515q3;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C759400Tqc;
import X.C759410Tqd;
import X.C759450Tqh;
import X.C800330VaR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1722860uw0;
import X.InterfaceC1722870uw1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC759720Tr8;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.home.configs.PerfConfig;
import com.ss.android.ugc.aweme.home.scope.WalletHomeAbility;
import com.ss.android.ugc.aweme.pipo.stellar.PipoStellarService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS348S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS77S0210000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletHomeViewAssem extends UIContentAssem implements WalletHomeAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public TuxNavBar LLIZLLLIL;
    public RecyclerView LLJ;
    public C1390410mHn LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1722790uvt.class, "wallet_home_hierarchy_data"), checkSupervisorPrepared());
    public InterfaceC1722870uw1 LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WalletHomeViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/home/WalletHomeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WalletHomeViewAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WalletHomeViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 565), AFwS268S0000000_26.get$arr$(329), null, true);
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 735));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2018752115) {
            return null;
        }
        return this;
    }

    public final C1722790uvt Go() {
        return (C1722790uvt) this.LLJIJIL.getValue();
    }

    public final C1390410mHn Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z0t) : null;
            this.LLJI = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final WalletHomeViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (WalletHomeViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, com.ss.android.ugc.aweme.home.scope.WalletHomeAbility
    public final C19EG getContext() {
        return C724240Sb0.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C07M6.LIZ(new AwS570S0100000_26(Go(), 1286));
        C07M6.LIZ(new AwS570S0100000_26(Go(), 1289));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.home.scope.WalletHomeAbility
    public final InterfaceC1722870uw1 D50() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC1722870uw1 interfaceC1722870uw1;
        C19EG c19egLIZ;
        super.onViewCreated(view);
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1895));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131821899);
        c0om1.LIZJ = c1250250idj;
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.wallet_home_nav_bar);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            try {
                C759450Tqh c759450TqhLIZ = PipoStellarService.LIZIZ().LIZ(c19egLIZ2);
                this.LLJILJIL = c759450TqhLIZ;
                if (c759450TqhLIZ != null) {
                    c759450TqhLIZ.LJII(new C759400Tqc() { // from class: X.0uwM
                        {
                            AFwS268S0000000_26.get$arr$(4);
                            AFwS348S0000000_26.get$arr$(0);
                        }
                    });
                    c759450TqhLIZ.LJII(new C759400Tqc() { // from class: X.0uwN
                        {
                            AFwS268S0000000_26.get$arr$(11);
                            AFwS348S0000000_26.get$arr$(1);
                        }
                    });
                    View viewFindViewById2 = this.LLJ;
                    if (viewFindViewById2 == null) {
                        View viewLJJIJL2 = LJJIJL();
                        if (viewLJJIJL2 != null) {
                            viewFindViewById2 = viewLJJIJL2.findViewById(R.id.wallet_home_card_list);
                        } else {
                            viewFindViewById2 = null;
                        }
                        this.LLJ = (RecyclerView) viewFindViewById2;
                    }
                    c759450TqhLIZ.LJFF((RecyclerView) viewFindViewById2);
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                    if (c19egLIZ3 != null) {
                        View viewFindViewById3 = this.LLJ;
                        if (viewFindViewById3 == null) {
                            View viewLJJIJL3 = LJJIJL();
                            if (viewLJJIJL3 != null) {
                                viewFindViewById3 = viewLJJIJL3.findViewById(R.id.wallet_home_card_list);
                            } else {
                                viewFindViewById3 = null;
                            }
                            this.LLJ = (RecyclerView) viewFindViewById3;
                        }
                        Drawable drawableLIZIZ = C800330VaR.LIZIZ(c19egLIZ3, R.drawable.csk);
                        if (drawableLIZIZ != null && (interfaceC1722870uw1 = this.LLJILJIL) != null) {
                            interfaceC1722870uw1.LIZJ(drawableLIZIZ);
                        }
                    }
                    C07M6.LIZ(AFwS187S0000000_2.get$arr$(823));
                    C07M6.LIZ(AFwS215S0000000_26.get$arr$(299));
                    InterfaceC1722870uw1 interfaceC1722870uw12 = this.LLJILJIL;
                    if (interfaceC1722870uw12 != null) {
                        interfaceC1722870uw12.LJ(new AwS605S0100000_26(this, 924));
                    }
                    if (((PerfConfig) C1722940uw8.LIZIZ.getValue()).disablePrerender != 1) {
                        c759450TqhLIZ.LJI(Collections.singletonList((C759410Tqd) this.LLJILLL.getValue()));
                    }
                    InterfaceC1722870uw1 interfaceC1722870uw13 = this.LLJILJIL;
                    if (interfaceC1722870uw13 != null) {
                        interfaceC1722870uw13.LIZLLL(new InterfaceC759720Tr8() { // from class: X.0uw7
                            @Override // X.InterfaceC759720Tr8
                            public final void LIZ(WebView webView, String str) {
                            }

                            @Override // X.InterfaceC759720Tr8
                            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            }

                            @Override // X.InterfaceC759720Tr8
                            public final void LIZIZ(long j, boolean z) {
                                C1722880uw2.LIZJ.LIZ(false);
                            }

                            @Override // X.InterfaceC759720Tr8
                            public final void onPageFinished(WebView webView, String str) {
                                C1722880uw2.LIZJ.LIZ(true);
                            }

                            @Override // X.InterfaceC759720Tr8
                            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                C1722880uw2.LIZJ.LIZ(false);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                Lo(null, null, false);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ulN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1158990gGX) obj).LL);
            }
        }, null, new AwS640S0100000_26(this, 200), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gLk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158990gGX) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 201), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0uj1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158990gGX) obj).LLILLL;
            }
        }, null, new AwS640S0100000_26(this, 202), 6);
        if (!Go().LIZ()) {
            Lo(null, null, false);
            return;
        }
        WalletHomeViewModel walletHomeViewModelJo = Jo();
        C1722790uvt c1722790uvtGo = Go();
        C759410Tqd c759410Tqd = (C759410Tqd) this.LLJILLL.getValue();
        walletHomeViewModelJo.LL = c1722790uvtGo;
        walletHomeViewModelJo.LLILLJJLI = c759410Tqd;
        walletHomeViewModelJo.vQ2();
        C23250099c.LIZLLL(walletHomeViewModelJo.getLifecycleScope(), walletHomeViewModelJo.LLILZLL, null, new C1722850uvz(walletHomeViewModelJo, null), 2);
        if (((InterfaceC1722860uw0) Jo().wQ2().getOperator()).LJJJJLI()) {
            String str = Go().LLILZIL;
            if (C123100dR.LIZ(str) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                c1537900q7g.getClass();
                new C1541950qED(c19egLIZ, sparkContext).LIZIZ();
                ((InterfaceC1722860uw0) Jo().wQ2().getOperator()).LLLLLL();
            }
        }
    }

    public final void Lo(String str, Function0 function0, boolean z) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (!C123100dR.LIZ(str)) {
                str = C20642515q3.LJI(2131832545);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            c1397580mTM.LIZIZ(str);
            c1397580mTM.LJII = false;
            C1238130iKB.LIZ(c1397580mTM, new AwS77S0210000_26(z, (boolean) function0, (Function0<Unit>) this, (WalletHomeViewAssem) 8));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
