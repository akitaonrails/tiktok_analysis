package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0DVN;
import X.C0HE8;
import X.C0HZQ;
import X.C0K0R;
import X.C0K7G;
import X.C0KC9;
import X.C0KCC;
import X.C0KCI;
import X.C0KDQ;
import X.C0KDT;
import X.C0KDW;
import X.C0KDZ;
import X.C0KEP;
import X.C0KF9;
import X.C0KFA;
import X.C0KFG;
import X.C0KFI;
import X.C0KFJ;
import X.C0KQD;
import X.C13LQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C259800zU;
import X.C339550DSv;
import X.C452501pT;
import X.C511520K4g;
import X.C513830KDd;
import X.C514070KEb;
import X.C514080KEc;
import X.C514100KEe;
import X.C514160KEk;
import X.C514170KEl;
import X.C514180KEm;
import X.C514200KEo;
import X.C514210KEp;
import X.C514220KEq;
import X.C515640KKc;
import X.C786410Ut5;
import X.InterfaceC339570DSx;
import Y.ACListenerS111S0200000_7;
import Y.AObserverS172S0200000_7;
import Y.AObserverS211S0100000_7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.model.PgcSubscribeUserInfoResponse;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiMonthFragment extends PgcBaseFragment {
    public static final int LLJLIL = (int) C511520K4g.LIZ(12.0f);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyHELIOSAmJiEtPSY8Jms8KCw4KSIpOS40LWs5IGEAPSccKCw4KSIpBDo/PCwBJiEnIAM+KCg+LSs4";
    public PackagePageViewModel LLILLL;
    public Map<String, String> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public RecyclerView LLJ;
    public C339550DSv<InterfaceC339570DSx> LLJI;
    public C197039127h LLJIJIL;
    public C0HZQ LLJILJIL;
    public TuxTextView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public TuxIconView LLJJI;
    public ObjectAnimator LLJJIII;
    public C513830KDd LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public Boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public List<? extends C0KQD> LLJL;
    public Function0<Unit> LLILLJJLI = AFwS193S0000000_7.get$arr$(172);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(171));
    public C0KCC LLILZIL = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LLJJIII;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
        ((Handler) this.LLILZ.getValue()).removeCallbacksAndMessages(null);
        this.LLJJJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final void MR(C0KDT c0kdt) {
        int i = 0;
        if (c0kdt == null) {
            c0kdt = new C0KDT(i);
        }
        List listLJIJI = C13LQ.LJIJI(new InterfaceC339570DSx[]{new C514200KEo(c0kdt.LJIIJJI), new InterfaceC339570DSx() { // from class: X.0KFG
            public final String LIZ = "item_package_refund_alert";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZ;
            }
        }, new InterfaceC339570DSx() { // from class: X.0KFI
            public final String LIZ = "item_package_sub_plans";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZ;
            }
        }, new C0KF9(c0kdt.LIZLLL), new C0KFA(c0kdt.LJI), new C514220KEq(c0kdt.LIZ), new C514210KEp(c0kdt), new InterfaceC339570DSx() { // from class: X.0KFJ
            public final String LIZ = "item_package_refund_info";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZ;
            }
        }});
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(c0kdt, 467);
        C339550DSv<InterfaceC339570DSx> c339550DSv = this.LLJI;
        if (c339550DSv != null) {
            c339550DSv.LLLI(listLJIJI, new AwS586S0100000_7(awS586S0100000_7, 466));
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
        this.LLJJIJIL = Intrinsics.LJFF(this.LLILZIL.LIZJ, "sub_change_price_email");
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, kotlin.jvm.internal.AwS408S0200000_7] */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0KDT value;
        MutableLiveData<C0KDT> mutableLiveData;
        MutableLiveData<C0KDZ> mutableLiveData2;
        LiveData<PgcSubscribeUserInfoResponse> liveData;
        LiveData<PGCSubscriptionProductDetailWithTemplateInfo> liveData2;
        LiveData<C0KCI> liveData3;
        final PGCSubscriptionProductDetailWithTemplateInfo value2;
        TemplateInfo templateInfo;
        LiveData<PGCSubscriptionProductDetailWithTemplateInfo> liveData4;
        MutableLiveData<C0KDT> mutableLiveData3;
        int i;
        super.onViewCreated(view, bundle);
        this.LLJ = (RecyclerView) view.findViewById(R.id.pxo);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.whz);
        this.LLJILJIL = (C0HZQ) view.findViewById(R.id.wgw);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.wgx);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.xj2);
        final C513830KDd c513830KDd = new C513830KDd(this.LLILLL, this.LLILZLL);
        this.LLJJIJI = c513830KDd;
        this.LLJI = new C339550DSv<>(C2097608Jq.LJIIIIZZ(new Pair(C0KFI.class, new C0DVN<C0KFI, C514160KEk>(c513830KDd) { // from class: X.0KDV
            public final C513830KDd LIZ;

            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff4;
            }

            {
                this.LIZ = c513830KDd;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view2) {
                return new C514160KEk(view2);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ff4, viewGroup, false);
                RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.qlv);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                    recyclerView.setNestedScrollingEnabled(false);
                    recyclerView.setAdapter(this.LIZ);
                    recyclerView.addItemDecoration(new C0KEL(SubPackageMultiMonthFragment.LLJLIL));
                    recyclerView.setOverScrollMode(2);
                }
                return new C514160KEk(viewTd);
            }
        }), new Pair(C0KF9.class, new C0DVN<C0KF9, C514100KEe>() { // from class: X.0KEf
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff2;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view2) {
                return new AbstractC339560DSw<C0KF9>(view2) { // from class: X.0KEe
                    public final TuxTextView LL;

                    {
                        super(view2);
                        this.LL = (TuxTextView) view2.findViewById(R.id.pi8);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        this.LL.setText(((C0KF9) interfaceC339570DSx).LIZIZ);
                    }
                };
            }
        }), new Pair(C0KFA.class, new C0DVN<C0KFA, C514080KEc>() { // from class: X.0KEh
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff7;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view2) {
                return new AbstractC339560DSw<C0KFA>(view2) { // from class: X.0KEc
                    public final TuxTextView LL;

                    {
                        super(view2);
                        this.LL = (TuxTextView) view2.findViewById(R.id.be_);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        String strLJ;
                        TuxTextView tuxTextView = this.LL;
                        int i2 = ((C0KFA) interfaceC339570DSx).LIZIZ;
                        if (i2 == 1) {
                            strLJ = C511520K4g.LJII(2131839720);
                        } else {
                            strLJ = C511520K4g.LJ(2131755455, i2, Integer.valueOf(i2));
                        }
                        tuxTextView.setText(strLJ);
                    }
                };
            }
        }), new Pair(C514220KEq.class, new C0DVN<C514220KEq, C514070KEb>() { // from class: X.0KEg
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff8;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view2) {
                return new AbstractC339560DSw<C514220KEq>(view2) { // from class: X.0KEb
                    public final TuxTextView LL;

                    {
                        super(view2);
                        this.LL = (TuxTextView) view2.findViewById(R.id.he7);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        String strLJ;
                        C514220KEq c514220KEq = (C514220KEq) interfaceC339570DSx;
                        SubInfo subInfo = c514220KEq.LIZIZ;
                        if (subInfo != null) {
                            long jLongValue = subInfo.subStartTime.longValue();
                            SimpleDateFormat simpleDateFormat = C0KFF.LIZ;
                            String str = simpleDateFormat.format(new Date(jLongValue));
                            str.toString();
                            String str2 = simpleDateFormat.format(new Date(subInfo.subEndTime.longValue()));
                            str2.toString();
                            int i2 = subInfo.renewalPeriod;
                            if (i2 == 1) {
                                strLJ = C511520K4g.LJIIIIZZ(2131839645, Integer.valueOf(c514220KEq.LIZIZ.renewalPeriod), str, str2);
                            } else {
                                strLJ = C511520K4g.LJ(2131755459, c514220KEq.LIZIZ.renewalPeriod, Integer.valueOf(i2), str, str2);
                            }
                            this.LL.setText(strLJ);
                        }
                    }
                };
            }
        }), new Pair(C514210KEp.class, new C0DVN<C514210KEp, C0KDW>() { // from class: X.0KEI
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.fey;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view2) {
                return new AbstractC339560DSw<C514210KEp>(view2) { // from class: X.0KDW
                    public final TuxTextView LL;

                    {
                        super(view2);
                        this.LL = (TuxTextView) view2.findViewById(R.id.bea);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        String strLJ;
                        TuxTextView tuxTextView = this.LL;
                        C0KDT c0kdt = ((C514210KEp) interfaceC339570DSx).LIZIZ;
                        if (c0kdt.LJIIIIZZ) {
                            strLJ = C511520K4g.LJIIIIZZ(2131830312, c0kdt.LJIIIZ);
                        } else {
                            int i2 = c0kdt.LJI;
                            strLJ = C511520K4g.LJ(2131755457, i2, Integer.valueOf(i2));
                        }
                        tuxTextView.setText(strLJ);
                    }
                };
            }
        }), new Pair(C0KFG.class, new C0DVN<C0KFG, C514170KEl>() { // from class: X.0KEi
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff6;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(final View view2) {
                return new AbstractC339560DSw<C0KFG>(view2) { // from class: X.0KEl
                    @Override // X.AbstractC339560DSw
                    public final /* bridge */ /* synthetic */ void I5(InterfaceC339570DSx interfaceC339570DSx) {
                    }
                };
            }
        }), new Pair(C0KFJ.class, new C0DVN<C0KFJ, C514180KEm>() { // from class: X.0KEj
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.fex;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(final View view2) {
                return new AbstractC339560DSw<C0KFJ>(view2) { // from class: X.0KEm
                    @Override // X.AbstractC339560DSw
                    public final /* bridge */ /* synthetic */ void I5(InterfaceC339570DSx interfaceC339570DSx) {
                    }
                };
            }
        }), new Pair(C514200KEo.class, new C0DVN<C514200KEo, C0KEP>() { // from class: X.0KEO
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff1;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(final View view2) {
                return new AbstractC339560DSw<C514200KEo>(view2) { // from class: X.0KEP
                    public final TuxTextView LL;

                    {
                        super(view2);
                        this.LL = (TuxTextView) view2.findViewById(R.id.ock);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        PGCTipsInfo pGCTipsInfo = ((C514200KEo) interfaceC339570DSx).LIZIZ;
                        if (pGCTipsInfo != null) {
                            String str = pGCTipsInfo.description;
                            String str2 = pGCTipsInfo.ctaText;
                            String str3 = pGCTipsInfo.ctaSchema;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(str2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            Map<String, String> map = pGCTipsInfo.etParams;
                            C0KDQ.LIZ.getClass();
                            C511970K5z c511970K5z = new C511970K5z("migration_alert_show");
                            C0K61.LIZ(c511970K5z, null);
                            c511970K5z.LIZIZ("purchase_panel", "enter_from");
                            c511970K5z.LIZJ(map);
                            c511970K5z.LIZLLL();
                            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                                TuxTextView tuxTextView = this.LL;
                                C0KC9 c0kc9 = C0KC9.LIZ;
                                Context context = this.itemView.getContext();
                                c0kc9.getClass();
                                tuxTextView.setText(C0KC9.LIZ(context, strLIZIZ, str2, str3, "purchase_panel", map));
                                this.LL.setMovementMethod(LinkMovementMethod.getInstance());
                                TuxTextView tuxTextView2 = this.LL;
                                tuxTextView2.LLJJ = true;
                                tuxTextView2.setHighlightColor(0);
                                return;
                            }
                            TuxTextView tuxTextView3 = this.LL;
                            if (strLIZIZ == null) {
                                strLIZIZ = "";
                            }
                            tuxTextView3.setText(new SpannableStringBuilder(strLIZIZ));
                            this.LL.setMovementMethod(null);
                            this.LL.setHighlightColor(0);
                        }
                    }
                };
            }
        })));
        this.LLJJ = (TuxIconView) view.findViewById(R.id.hoq);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.bn7);
        ((TextView) view.findViewById(R.id.title)).setTextColor(C511520K4g.LIZIZ(R.attr.a1h, view.getContext()));
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS111S0200000_7(this, view, 58));
        }
        TuxIconView tuxIconView2 = this.LLJJI;
        if (tuxIconView2 != null) {
            if (this.LLILZIL.LJIIZILJ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView2);
            C786410Ut5.a9(tuxIconView2, new ACListenerS111S0200000_7(this, tuxIconView2, 59));
        }
        RecyclerView recyclerView = this.LLJ;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.LLJI);
            recyclerView.setItemAnimator(null);
        }
        PackagePageViewModel packagePageViewModel = this.LLILLL;
        if (packagePageViewModel != null && (mutableLiveData3 = packagePageViewModel.LLJILJIL) != null) {
            value = mutableLiveData3.getValue();
        } else {
            value = null;
        }
        MR(value);
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS111S0200000_7(this, c197039127h, 53));
        }
        final C0HZQ c0hzq = this.LLJILJIL;
        if (c0hzq != null) {
            PackagePageViewModel packagePageViewModel2 = this.LLILLL;
            if (packagePageViewModel2 != null && (liveData4 = packagePageViewModel2.LLIZ) != null) {
                value2 = liveData4.getValue();
            } else {
                value2 = null;
            }
            final int iLJIIIIZZ = C0K7G.LJIIIIZZ();
            if (iLJIIIIZZ == 1) {
                C0K0R.LIZ(c0hzq);
                this.LLJJIJIIJIL = true;
                this.LLJJJJJIL = System.currentTimeMillis();
                C0KDQ c0kdq = C0KDQ.LIZ;
                String str = this.LLILZIL.LJII;
                if (value2 != null) {
                    templateInfo = value2.getTemplateInfo();
                } else {
                    templateInfo = null;
                }
                c0kdq.getClass();
                C0KDQ.LIZIZ(str, templateInfo, 1);
            } else {
                C0K0R.LIZJ(c0hzq);
                C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0KDS
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        TemplateInfo templateInfo2;
                        LiveData<PGCSubscriptionProductDetailWithTemplateInfo> liveData5;
                        PGCSubscriptionProductDetailWithTemplateInfo value3;
                        PackagePageViewModel packagePageViewModel3;
                        SubPackageMultiMonthFragment subPackageMultiMonthFragment = this.LL;
                        subPackageMultiMonthFragment.LLJJIJIIJIL = z;
                        if (z) {
                            subPackageMultiMonthFragment.LLJJJJJIL = System.currentTimeMillis();
                            C0KDQ c0kdq2 = C0KDQ.LIZ;
                            String str2 = this.LL.LLILZIL.LJII;
                            PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = value2;
                            if (pGCSubscriptionProductDetailWithTemplateInfo != null) {
                                templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                            } else {
                                templateInfo2 = null;
                            }
                            int i2 = iLJIIIIZZ;
                            c0kdq2.getClass();
                            C0KDQ.LIZIZ(str2, templateInfo2, i2);
                            if (!this.LL.LLJJLIIIJLLLLLLLZ && C0K7G.LIZJ()) {
                                SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = this.LL;
                                subPackageMultiMonthFragment2.LLJJLIIIJLLLLLLLZ = true;
                                PackagePageViewModel packagePageViewModel4 = subPackageMultiMonthFragment2.LLILLL;
                                if (packagePageViewModel4 != null && (liveData5 = packagePageViewModel4.LLIZ) != null && (value3 = liveData5.getValue()) != null && (packagePageViewModel3 = this.LL.LLILLL) != null) {
                                    Context context = c0hzq.getContext();
                                    SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = this.LL;
                                    C0KCC c0kcc = subPackageMultiMonthFragment3.LLILZIL;
                                    packagePageViewModel3.xQ2(context, value3, c0kcc.LIZ, c0kcc.LIZJ, subPackageMultiMonthFragment3.LLILZLL, c0kcc.LJJ, EnumC513400KBm.PACKAGE_PAGE, true, subPackageMultiMonthFragment3.LLJL);
                                }
                            }
                        }
                    }
                });
                C515640KKc.LIZ(8, c0hzq);
            }
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            C0KC9 c0kc9 = C0KC9.LIZ;
            Context context = tuxTextView.getContext();
            Context context2 = getContext();
            c0kc9.getClass();
            tuxTextView.setText(C0KC9.LIZIZ(context, context2, null));
        }
        TuxTextView tuxTextView2 = this.LLJILJILJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView3 = this.LLJILJILJ;
        if (tuxTextView3 != null) {
            tuxTextView3.LLJJ = true;
            tuxTextView3.setHighlightColor(0);
        }
        PackagePageViewModel packagePageViewModel3 = this.LLILLL;
        if (packagePageViewModel3 != null && (liveData3 = packagePageViewModel3.LLILZIL) != null) {
            liveData3.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 61));
        }
        PackagePageViewModel packagePageViewModel4 = this.LLILLL;
        if (packagePageViewModel4 != null && (liveData2 = packagePageViewModel4.LLIZ) != null) {
            liveData2.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 63));
        }
        PackagePageViewModel packagePageViewModel5 = this.LLILLL;
        if (packagePageViewModel5 != null && (liveData = packagePageViewModel5.LLJ) != null) {
            liveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 65));
        }
        C259800zU c259800zU = new C259800zU();
        AObserverS172S0200000_7 aObserverS172S0200000_7 = new AObserverS172S0200000_7(this, c259800zU, 6);
        c259800zU.element = new AwS408S0200000_7(this, aObserverS172S0200000_7, 65);
        PackagePageViewModel packagePageViewModel6 = this.LLILLL;
        if (packagePageViewModel6 != null && (mutableLiveData2 = packagePageViewModel6.LLJIJIL) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS172S0200000_7(this, aObserverS172S0200000_7, 4));
        }
        PackagePageViewModel packagePageViewModel7 = this.LLILLL;
        if (packagePageViewModel7 != null && (mutableLiveData = packagePageViewModel7.LLJILJIL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS211S0100000_7(this, 60));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(C0HE8.LIZ(requireActivity())), R.layout.ff0, viewGroup, false);
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
