package com.ss.android.ugc.aweme.minis.payment;

import X.C01GW;
import X.C04J4;
import X.C0HZQ;
import X.C1697810uHb;
import X.C1841240y0w;
import X.C1841350y17;
import X.C197039127h;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1841270y0z;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRechargeFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgHELIOSZjUtMCI2JjFiBCY9ITYeLCw7KTcrLAkhKSIhLCEn";
    public final Function1<MinisRechargeSheetParams, Unit> LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public C197039127h LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public RadiusLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxIconView LLJJIII;
    public C0HZQ LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public TuxTextView LLJJJIL;
    public C1841350y17 LLJJJJ;
    public C1841350y17 LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public EnumC1841270y0z LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    public MinisRechargeFragment() {
        this(AFwS269S0000000_27.get$arr$(132), AFwS216S0000000_27.get$arr$(151));
    }

    public final RadiusLayout UR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bqn) : null;
            this.LLJILJIL = (RadiusLayout) viewFindViewById;
        }
        return (RadiusLayout) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cp0) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final MinisRechargeSheetParams WR() {
        return (MinisRechargeSheetParams) this.LLJLILLLLZIIL.getValue();
    }

    public final TuxTextView ZR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zac) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView aS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zgs) : null;
            this.LLJILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView bS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zhs) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_sandbox_hint) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView dS() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_total_price_money_amount) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView gS() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_web_pay_discount_amount) : null;
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView hS() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_web_pay_discount_rate) : null;
            this.LLJJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final boolean iS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dqy) : null;
            this.LLJJIJI = (C0HZQ) viewFindViewById;
        }
        CompoundButton compoundButton = (CompoundButton) viewFindViewById;
        return compoundButton != null && compoundButton.isChecked();
    }

    public final void SR() {
        C197039127h c197039127hVR = VR();
        if (c197039127hVR != null) {
            c197039127hVR.setLoading(false);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJIJIIJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final void mS(EnumC1841270y0z enumC1841270y0z) {
        TuxTextView tuxTextViewDS;
        TuxTextView tuxTextViewDS2;
        boolean z;
        int i;
        MinisRechargeSheetParams minisRechargeSheetParamsWR = WR();
        if (minisRechargeSheetParamsWR != null) {
            int i2 = 0;
            if (Intrinsics.LJFF(minisRechargeSheetParamsWR.mode, "MODE_RECHARGE") || Intrinsics.LJFF(minisRechargeSheetParamsWR.mode, "MODE_RECHARGE_AND_PAY")) {
                if (enumC1841270y0z == EnumC1841270y0z.WEB && minisRechargeSheetParamsWR.webPrice.length() > 0) {
                    C197039127h c197039127hVR = VR();
                    if (c197039127hVR != null) {
                        String string = getString(2131857203);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((char) 8234);
                        sbLIZ.append(minisRechargeSheetParamsWR.symbol);
                        sbLIZ.append(minisRechargeSheetParamsWR.webPrice);
                        sbLIZ.append((char) 8236);
                        c197039127hVR.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1)));
                    }
                    if (C1841240y0w.LIZ() && (tuxTextViewDS2 = dS()) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((char) 8234);
                        sbLIZ2.append(minisRechargeSheetParamsWR.symbol);
                        sbLIZ2.append(minisRechargeSheetParamsWR.webPrice);
                        sbLIZ2.append((char) 8236);
                        tuxTextViewDS2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    C197039127h c197039127hVR2 = VR();
                    if (c197039127hVR2 != null) {
                        c197039127hVR2.setText(minisRechargeSheetParamsWR.buttonText);
                    }
                    TuxTextView tuxTextViewAS = aS();
                    if (tuxTextViewAS != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append((char) 8234);
                        sbLIZ3.append(minisRechargeSheetParamsWR.amount);
                        sbLIZ3.append((char) 8236);
                        tuxTextViewAS.setText(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (C1841240y0w.LIZ() && (tuxTextViewDS = dS()) != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append((char) 8234);
                        sbLIZ4.append(minisRechargeSheetParamsWR.amount);
                        sbLIZ4.append((char) 8236);
                        tuxTextViewDS.setText(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
            if (enumC1841270y0z == EnumC1841270y0z.WEB) {
                z = true;
            } else {
                z = false;
            }
            TuxTextView tuxTextViewHS = hS();
            if (tuxTextViewHS != null) {
                if (z && minisRechargeSheetParamsWR.webPriceDiscountAmount.length() > 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextViewHS, i);
            }
            TuxTextView tuxTextViewGS = gS();
            if (tuxTextViewGS != null) {
                if (!z || minisRechargeSheetParamsWR.webPriceDiscountRate.length() <= 0) {
                    i2 = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextViewGS, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MinisRechargeFragment(Function1<? super MinisRechargeSheetParams, Unit> function1, Function0<Unit> function0) {
        this.LLIZ = function1;
        this.LLIZLLLIL = function0;
        this.LLJL = EnumC1841270y0z.WEB;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 607));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0201 A[PHI: r0
      0x0201: PHI (r0v140 android.view.View) = (r0v139 android.view.View), (r0v145 android.view.View) binds: [B:97:0x01ee, B:102:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05fc A[PHI: r1
      0x05fc: PHI (r1v33 java.lang.String) = (r1v9 java.lang.String), (r1v38 java.lang.String) binds: [B:315:0x05f8, B:243:0x0436] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06c6 A[PHI: r0
      0x06c6: PHI (r0v134 android.view.View) = (r0v133 android.view.View), (r0v137 android.view.View) binds: [B:374:0x06b6, B:379:0x06c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[PHI: r0
      0x00fb: PHI (r0v169 android.view.View) = (r0v168 android.view.View), (r0v172 android.view.View) binds: [B:51:0x00eb, B:56:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r0 = X.C1841240y0w.LIZ()
            r3 = 0
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams r0 = r4.WR()
            if (r0 == 0) goto L39
            java.lang.String r1 = r0.mode
        Lf:
            java.lang.String r0 = "MODE_RECHARGE"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L27
            com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams r0 = r4.WR()
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.mode
        L1f:
            java.lang.String r0 = "MODE_RECHARGE_AND_PAY"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3b
        L27:
            r1 = 2131564153(0x7f0d1679, float:1.8753783E38)
        L2a:
            r0 = 0
            android.view.View r2 = X.C786410Ut5.Td(r5, r1, r6, r0)
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L34
            r2 = r3
        L34:
            if (r2 == 0) goto L5d
            goto L3f
        L37:
            r1 = r3
            goto L1f
        L39:
            r1 = r3
            goto Lf
        L3b:
            r1 = 2131564152(0x7f0d1678, float:1.8753781E38)
            goto L2a
        L3f:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L63
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> L63
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r4)     // Catch: java.lang.Throwable -> L63
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r2.setTag(r0, r4)     // Catch: java.lang.Throwable -> L63
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L63
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5a
            r3 = r1
            X.19GS r3 = (X.C19GS) r3     // Catch: java.lang.Throwable -> L63
        L5a:
            X.C1685300txQ.LIZ(r3)     // Catch: java.lang.Throwable -> L63
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L63
            return r2
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void kS(TextView textView, List list, String str, Function1 function1) {
        SpannableString spannableString = new SpannableString(str);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj;
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (a0.LJJJ(str, str2, length, false, 4) != -1) {
                    int iLJJJ = a0.LJJJ(str, str2, length, false, 4);
                    arrayList.add(Integer.valueOf(iLJJJ));
                    length = iLJJJ + str2.length();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    C786410Ut5.p2(spannableString, new C04J4((TuxTextView) textView, function1, i, 4), iIntValue, str2.length() + iIntValue, 34);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(-65536);
        textView.setText(spannableString);
    }
}
