package com.ss.android.ugc.aweme.verify.otp;

import X.AbstractC1714770uix;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0PEM;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1266250j3X;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1391190mJ3;
import X.C13LE;
import X.C1622206Wu;
import X.C1713520ugw;
import X.C1713570uh1;
import X.C1713590uh3;
import X.C1713680uhC;
import X.C1713750uhJ;
import X.C1713840uhS;
import X.C1714180ui0;
import X.C1714190ui1;
import X.C1714230ui5;
import X.C1714250ui7;
import X.C1714270ui9;
import X.C1714750uiv;
import X.C1714760uiw;
import X.C1714780uiy;
import X.C1715550ukD;
import X.C1719520uqc;
import X.C1748330vb5;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C21244318Bt;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C2441009hQ;
import X.C338490DOt;
import X.C343970De7;
import X.C443180HZk;
import X.C444920HcY;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C511501yz;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.CountDownTimerC1714650uil;
import X.CountDownTimerC1775650wJ9;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1719540uqe;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyTuxSheet;
import com.ss.android.ugc.aweme.verify.ab.PipoVerificationRetentionPopupSettings;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class OtpFragment extends BaseVerifyFragment implements InterfaceC1719540uqe, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZjMpOyY1MWsjPT99BzE8Dz0yLygpJzs=";
    public C1719520uqc LLJILJILJ;
    public C1748330vb5 LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxNavBar LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public C1390130mHL LLJJJ;
    public boolean LLJJJIL;
    public CountDownTimerC1775650wJ9 LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public CountDownTimerC1714650uil LLJLLIL;
    public C1715550ukD LLJLLL;
    public boolean LLJZ;
    public String LLJZIJLIL;
    public int LLL;
    public final AssemVMLazy LLLFF;
    public long LLJJJJLIIL = System.currentTimeMillis();
    public AbstractC1714770uix LLJL = C1714780uiy.LIZ;
    public final C1266250j3X LLJLL = new C1266250j3X(CoroutineExceptionHandler.LJJLIL, 1);
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1161));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OtpFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/verify/otp/OtpViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final String UR() {
        return "bnpl_activate_otp";
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final int ZR() {
        return R.layout.i7h;
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

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC21503819Do
    public final void tv() {
        C1713680uhC c1713680uhC;
        iS().LJFF("return");
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_activate_otp", null, null, 48);
        }
        C20277814Wa.LIZIZ(this);
    }

    public OtpFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OtpViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1966);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(485);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1162), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS570S0100000_26((Fragment) this, 1163), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1164), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLFF = assemVMLazy;
    }

    public final void cS() {
        CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJJJ;
        if (countDownTimerC1775650wJ9 != null) {
            countDownTimerC1775650wJ9.cancel();
        }
        this.LLJJJJJIL = true;
        sS();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJLL), null, new C1714190ui1(this, null), 2);
        CountDownTimerC1775650wJ9 countDownTimerC1775650wJ92 = new CountDownTimerC1775650wJ9(this, 1);
        this.LLJJJJ = countDownTimerC1775650wJ92;
        countDownTimerC1775650wJ92.start();
    }

    public final Map hS() {
        return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b99078.c82052.d3206", PageFinder.via(getView()), null, 4, null);
    }

    public final C1714180ui0 iS() {
        return (C1714180ui0) this.LLLF.getValue();
    }

    public final C1748330vb5 kS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qir) : null;
            this.LLJILLL = (C1748330vb5) viewFindViewById;
        }
        return (C1748330vb5) viewFindViewById;
    }

    public final TuxTextView mS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qis) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1719520uqc nS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qit) : null;
            this.LLJILJILJ = (C1719520uqc) viewFindViewById;
        }
        return (C1719520uqc) viewFindViewById;
    }

    public final TuxTextView oS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qiw) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final OtpViewModel qS() {
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (OtpViewModel) assemVMLazy.getValue();
    }

    public final void sS() {
        View viewFindViewById = this.LLJJ;
        String string = null;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qiq) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        if (appCompatTextView == null) {
            return;
        }
        String string2 = this.LLJJL;
        if (string2 == null) {
            string2 = appCompatTextView.getText().toString();
            this.LLJJL = string2;
        }
        String str = this.LLJJLIIIJLLLLLLLZ;
        if (str == null) {
            str = "";
        }
        AbstractC1714770uix abstractC1714770uix = this.LLJL;
        if (abstractC1714770uix instanceof C1714750uiv) {
            string = getString(((C1714750uiv) abstractC1714770uix).LIZIZ);
        } else if (abstractC1714770uix instanceof C1714760uiw) {
            string = getString(((C1714760uiw) abstractC1714770uix).LIZIZ);
        } else if (!Intrinsics.LJFF(abstractC1714770uix, C1714780uiy.LIZ)) {
            throw new C1954807lC();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string2);
        if (!a0.LJJJIL(str)) {
            sb.append(' ');
            sb.append(str);
        }
        if (string != null && !a0.LJJJIL(string) && 0 == 0) {
            sb.append(' ');
            sb.append(getString(2131840415));
            sb.append(' ');
            sb.append(string);
        }
        String string3 = sb.toString();
        SpannableString spannableString = new SpannableString(string3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, requireContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        int iLJIIL = C2441009hQ.LJIIL(iIntValue, 102);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, requireContext());
        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, requireContext());
        int iIntValue3 = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1p, requireContext());
        int iIntValue4 = numLIZJ4 != null ? numLIZJ4.intValue() : iIntValue3;
        int length = string2.length();
        C786410Ut5.p2(spannableString, new C444920HcY(42, false), 0, length, 17);
        if (this.LLJJJJJIL) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLJIIL), 0, length, 17);
        } else {
            C786410Ut5.p2(spannableString, new C511501yz(iIntValue, new AwS570S0100000_26(this, 1165), 1), 0, length, 17);
        }
        if (!a0.LJJJIL(str)) {
            int iLJJJ = a0.LJJJ(string3, str, 0, false, 6);
            C786410Ut5.p2(spannableString, new C444920HcY(41, false), iLJJJ, str.length() + iLJJJ, 17);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue4), iLJJJ, str.length() + iLJJJ, 17);
        }
        if (string != null && !a0.LJJJIL(string)) {
            String string4 = getString(2131840415);
            int iLJJJ2 = a0.LJJJ(string3, string4, length, false, 4);
            C786410Ut5.p2(spannableString, new C444920HcY(51, false), iLJJJ2, string4.length() + iLJJJ2, 17);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue3), iLJJJ2, string4.length() + iLJJJ2, 17);
            int iLJJJ3 = a0.LJJJ(string3, string, 0, false, 6);
            C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ3, string.length() + iLJJJ3, 17);
            C786410Ut5.p2(spannableString, new C511501yz(iIntValue2, new AwS570S0100000_26(this, 1166), 1), iLJJJ3, string.length() + iLJJJ3, 17);
        }
        appCompatTextView.setText(spannableString);
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setHighlightColor(0);
    }

    @Override // X.InterfaceC1719540uqe
    public final void LJJLL() {
        String str;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        C1713570uh1 c1713570uh1SR = SR();
        String str2 = (c1713570uh1SR == null || (verifyInfoLJIIIZ = c1713570uh1SR.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null) ? null : verifyDetail.codeType;
        if (Intrinsics.LJFF(str2, "1")) {
            str = "6";
        } else {
            Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT);
            str = "4";
        }
        iS().LIZLLL(C2097908Jt.LIZJ(new Pair("code_length", str)));
        EditText editText = nS().getEditText();
        if (!Intrinsics.LJFF(String.valueOf(editText != null ? C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPytcZbIxXySCG2lJOtmbceX697BEmg=", null)) : null), this.LLJZIJLIL)) {
            this.LLJZ = false;
        }
        C1748330vb5 c1748330vb5KS = kS();
        if (c1748330vb5KS != null) {
            c1748330vb5KS.setMessage("");
        }
        nS();
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final void WR() {
        C1719520uqc c1719520uqcNS = nS();
        if (c1719520uqcNS != null) {
            HandlerHook.viewPostDelay(c1719520uqcNS, new ARunnableS126S0100000_26(this, 57), 100L);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC1724030uxt
    public final void bF() {
        iS().LJFF("close");
        super.bF();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[PHI: r5
      0x0076: PHI (r5v1 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:48:0x0073, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            r11 = this;
            X.0uh1 r0 = r11.SR()
            r4 = 0
            if (r0 == 0) goto L78
            com.bytedance.pipo.verify.base.model.VerifyInfo r3 = r0.LJIIIZ()
        Lb:
            if (r3 == 0) goto Lf
            java.lang.String r4 = r3.verifyType
        Lf:
            r2 = 1
            if (r3 == 0) goto L72
            boolean r0 = r3.switchCandidate
            if (r0 != r2) goto L72
            r5 = 1
        L17:
            boolean r0 = r3.isProgressive
            if (r0 != r2) goto L76
            r6 = 1
        L1c:
            int r7 = r11.LLL
            X.0uh1 r0 = r11.SR()
            if (r0 == 0) goto L32
            X.0uh7 r0 = r0.LIZIZ
            if (r0 == 0) goto L32
            X.01GW r0 = r0.LIZJ
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L34
        L32:
            X.13BV r8 = X.C13BV.INSTANCE
        L34:
            X.0uh1 r0 = r11.SR()
            if (r0 == 0) goto L70
            boolean r0 = r0.LJIIL
            if (r0 != r2) goto L70
            r9 = 1
        L3f:
            X.0uh1 r0 = r11.SR()
            if (r0 == 0) goto L6e
            X.0uiK r0 = r0.LIZLLL
            if (r0 == 0) goto L6e
            boolean r0 = r0.LIZIZ
            if (r0 != r2) goto L6e
            r10 = 1
        L4e:
            X.0uix r1 = X.C1714730uit.LIZIZ(r4, r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto L68
            boolean r0 = r3.isProgressive
            if (r0 != r2) goto L68
            X.0uiy r0 = X.C1714780uiy.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L68
            X.0uh1 r0 = r11.SR()
            if (r0 == 0) goto L68
            r0.LJIIL = r2
        L68:
            r11.LLJL = r1
            r11.sS()
            return
        L6e:
            r10 = 0
            goto L4e
        L70:
            r9 = 0
            goto L3f
        L72:
            r5 = 0
            if (r3 == 0) goto L76
            goto L17
        L76:
            r6 = 0
            goto L1c
        L78:
            r3 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.otp.OtpFragment.dS():void");
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJJJ;
        if (countDownTimerC1775650wJ9 != null) {
            countDownTimerC1775650wJ9.cancel();
        }
        CountDownTimerC1714650uil countDownTimerC1714650uil = this.LLJLLIL;
        if (countDownTimerC1714650uil != null) {
            countDownTimerC1714650uil.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1715550ukD c1715550ukD;
        iS().LJFF("unmount");
        super.onDestroyView();
        Context context = getContext();
        if (context != null && (c1715550ukD = this.LLJLLL) != null) {
            C786410Ut5.LJJIFFI(context, c1715550ukD);
        }
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EditText editText = nS().getEditText();
        if (editText != null) {
            C443180HZk.LIZ(editText);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1713680uhC c1713680uhC;
        iS().LJFF("user_cancel");
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_activate_otp", null, null, 48);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        NR(AFwS268S0000000_26.get$arr$(484));
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        super.onCreate(bundle);
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b99078", (String) this.LLIZ.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onEventClick(String str) {
        String string;
        Unit unit;
        C1713520ugw c1713520ugw;
        C1713590uh3 c1713590uh3;
        C1713840uhS c1713840uhS;
        n nVar;
        Set<Map.Entry<String, k>> setEntrySet;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("obj_id", str), new Pair("click_use_time", String.valueOf(System.currentTimeMillis() - this.LLJJJJLIIL)));
        try {
            C1713570uh1 c1713570uh1SR = SR();
            if (c1713570uh1SR != null && (c1713520ugw = c1713570uh1SR.LIZ) != null && (c1713590uh3 = c1713520ugw.LIZ) != null && (c1713840uhS = c1713590uh3.LIZ) != null && (nVar = c1713840uhS.LIZ) != null && (setEntrySet = nVar.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!mapLJIIJ.containsKey(entry.getKey())) {
                        mapLJIIJ.put(entry.getKey(), ((k) entry.getValue()).LJIL());
                    }
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
        C1713570uh1 c1713570uh1SR2 = SR();
        if (c1713570uh1SR2 != 0) {
            String strLIZ = C1714270ui9.LIZ();
            for (Map.Entry entry2 : hS().entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                mapLJIIJ.put(key, string);
            }
            c1713570uh1SR2.LJIIJJI("fp_sdk_bnpl_otp_click", "bnpl_activate_otp", strLIZ, mapLJIIJ);
        }
        if (Intrinsics.LJFF(str, "back")) {
            iS().LIZIZ("back");
            iS().LJFF("user_cancel");
        } else {
            if (!Intrinsics.LJFF(str, "resend")) {
                return;
            }
            iS().LIZIZ("resend_code");
        }
    }

    public final void rS(String str) {
        String str2;
        VerifyInfo verifyInfoLJIIIZ;
        this.LLL++;
        dS();
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null) {
            String strLIZ = C1714270ui9.LIZ();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("verify_type", "otp");
            pairArr[1] = new Pair("error_code", "4");
            pairArr[2] = new Pair("error_message", "network error");
            C1713570uh1 c1713570uh1SR2 = SR();
            if (c1713570uh1SR2 == null || (verifyInfoLJIIIZ = c1713570uh1SR2.LJIIIZ()) == null || (str2 = verifyInfoLJIIIZ.verifyId) == null) {
                str2 = "";
            }
            pairArr[3] = new Pair("verifyId", str2);
            c1713570uh1SR.LJIIJJI("rd_pipo_bnpl_veryfication", "", strLIZ, C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (str == null) {
            str = getString(2131832568);
        } else if (str.length() == 0) {
            str = getString(2131832569);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
        C1719520uqc c1719520uqcNS = nS();
        if (c1719520uqcNS != null) {
            c1719520uqcNS.setText("");
        }
        EditText editText = nS().getEditText();
        if (editText != null) {
            C443180HZk.LIZ(editText);
        }
        nS().getTuxVerifyCenterOtpInputFromXml().setEnabled(true);
    }

    @Override // X.InterfaceC1719540uqe
    public final void ty(String str) {
        C1713750uhJ c1713750uhJLJII;
        if (this.LLJLIL && System.currentTimeMillis() - this.LLJLILLLLZIIL < 500) {
            C1713570uh1 c1713570uh1SR = SR();
            if (c1713570uh1SR != null && (c1713750uhJLJII = c1713570uh1SR.LJII()) != null) {
                c1713750uhJLJII.LJIIIIZZ++;
                return;
            }
            return;
        }
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = System.currentTimeMillis();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII().plus(this.LLJLL), null, new C1714250ui7(this, str, null), 2);
    }

    public final void gS(String str, String str2) {
        C1713680uhC c1713680uhC;
        bS(str);
        if (Intrinsics.LJFF(str, "PASS")) {
            iS().LJFF("verify_success");
            BaseVerifyTuxSheet baseVerifyTuxSheet = this.LLJILJIL;
            if (baseVerifyTuxSheet != null) {
                baseVerifyTuxSheet.SR();
            }
        } else if (Intrinsics.LJFF(str, "REJECT")) {
            iS().LJFF("verify_failed");
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = "a2270.b99078.c82052.d3206";
        c21244318Bt.LIZIZ = PageFinder.via(getView());
        String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, str, "bnpl_activate_otp", str2, strCreateJumpSourceBtmToken, 16);
        }
        if (this.LLJJJIL) {
            if (PipoVerificationRetentionPopupSettings.LIZ().LIZ()) {
                BaseVerifyTuxSheet baseVerifyTuxSheet2 = this.LLJILJIL;
                if (baseVerifyTuxSheet2 != null) {
                    baseVerifyTuxSheet2.SR();
                    return;
                }
                return;
            }
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            return;
        }
        C1714230ui5.LIZIZ(requireActivity(), SR(), str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:0|2|(1:4)(1:84)|5|(1:7)(1:83)|8|(1:16)|17|(1:19)|20|(1:82)(1:24)|25|(1:27)(1:81)|28|(3:30|(1:32)(1:80)|33)|34|(3:36|(3:38|(1:78)(1:42)|(1:44))(1:79)|45)|46|(1:77)(1:50)|51|(3:53|(1:61)|62)|63|(1:75)(35:67|(0)(1:71)|72|(7:208|85|(1:87)(1:92)|88|(2:91|89)|220|93)|96|(1:170)(1:100)|101|(5:103|(3:105|(1:107)(1:169)|108)|109|(3:111|(1:113)(1:168)|114)|115)|116|(1:167)(1:122)|123|(1:125)(1:166)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:165)(2:149|(1:153)(0))|154|(2:158|(2:160|(1:162))(1:164))|163|210|171|(1:189)(4:183|(4:186|(3:213|188|216)(1:215)|214|184)|212|190)|191|194|(4:196|(4:199|(2:203|218)(1:219)|204|197)|217|205)|206|207)|76|72|(0)|96|(2:98|170)(0)|101|(0)|116|(2:118|167)(0)|123|(0)(0)|126|(0)|129|(0)|132|(0)|135|(0)|138|(0)|141|(2:143|165)(0)|154|(3:156|158|(0)(0))|163|210|171|(3:173|189|191)(0)|194|(0)|206|207) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03cd, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ce, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0ukD, android.content.BroadcastReceiver] */
    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.otp.OtpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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
