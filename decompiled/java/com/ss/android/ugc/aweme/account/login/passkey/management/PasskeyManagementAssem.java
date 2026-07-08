package com.ss.android.ugc.aweme.account.login.passkey.management;

import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1887200zD4;
import X.C19331810k8;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C878203bw;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS162S0100000_28;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyManagementAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public DialogC1389620mGW LLJILJILJ;
    public C1722300uv6 LLJILLL;
    public C1397510mTF LLJJ;
    public C1397510mTF LLJJI;
    public String LLJJIII;
    public SpannableStringBuilder LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PasskeyManagementAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/passkey/management/PasskeyManagementViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PasskeyManagementAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PasskeyManagementViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 106), AFwS271S0000000_28.get$arr$(23), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 103));
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 104));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 102));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 105));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 101));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final PasskeyManagementViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PasskeyManagementViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        PasskeyManagementViewModel passkeyManagementViewModelGo = Go();
        passkeyManagementViewModelGo.withState(new AwS607S0100000_28(passkeyManagementViewModelGo, 256));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            String string = c19egLIZ.getString(2131821321);
            this.LLJJIII = string.substring(0, a0.LJJJ(string, c19egLIZ.getString(2131821322), 0, false, 6));
            String string2 = c19egLIZ.getString(2131821321);
            String string3 = c19egLIZ.getString(2131821322);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string2);
            sbLIZ.append(' ');
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            int iLJJJ = a0.LJJJ(string2, string3, 0, false, 6);
            int length = string3.length() + iLJJJ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1n);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c19egLIZ);
            Double dValueOf = Double.valueOf(1.5d);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
            Double dValueOf2 = Double.valueOf(10.5d);
            tuxIconDrawableLIZ.setBounds(new Rect(iLIZIZ, iLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2))));
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), length, length + 1, 33);
            C786410Ut5.q2(spannableStringBuilder, new C19331810k8(this, 1), iLJJJ, length, 33);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, c19egLIZ);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length, 33);
            }
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 33);
            this.LLJJIJI = spannableStringBuilder;
            ((TextView) this.LLJIJIL.getValue()).setMovementMethod(C431260Gvc.LIZ);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c19egLIZ, 1, false);
            C1887200zD4 c1887200zD4 = new C1887200zD4(LJJIJL().getContext());
            ((RecyclerView) this.LLJILJIL.getValue()).setLayoutManager(linearLayoutManager);
            ((RecyclerView) this.LLJILJIL.getValue()).setAdapter(c1887200zD4);
            C786410Ut5.U8((C197039127h) this.LLJJIJIIJIL.getValue(), new ACListenerS162S0100000_28(this, 30));
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19egLIZ);
            this.LLJILJILJ = dialogC1389620mGW;
            dialogC1389620mGW.LJJLL(false);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(c19egLIZ);
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = c19egLIZ.getString(2131821297);
            c1722300uv6.LJIIIIZZ = c19egLIZ.getString(2131821296);
            c1722300uv6.LJIIIZ = new AwS607S0100000_28(c19egLIZ, 41);
            c1722300uv6.LJIIJ = new AwS607S0100000_28(this, 42);
            c1722300uv6.LJIIL = C878203bw.LIZ;
            this.LLJILLL = c1722300uv6;
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            c1397580mTM.LJI(c19egLIZ.getString(2131821315));
            c1397580mTM.LIZIZ(c19egLIZ.getString(2131821316));
            C985403tE.LIZ(c1397580mTM, new AwS394S0200000_28(c19egLIZ, this, 10));
            c1397580mTM.LIZLLL(new AwS607S0100000_28(this, 43));
            this.LLJJ = new C1397510mTF(c1397580mTM);
            C1397580mTM c1397580mTM2 = new C1397580mTM(c19egLIZ);
            c1397580mTM2.LJI(c19egLIZ.getString(2131821290));
            c1397580mTM2.LIZIZ(c19egLIZ.getString(2131821291));
            C985403tE.LIZ(c1397580mTM2, new AwS394S0200000_28(c19egLIZ, this, 11));
            c1397580mTM2.LIZLLL(new AwS607S0100000_28(this, 44));
            this.LLJJI = new C1397510mTF(c1397580mTM2);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zC2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1886430zBp) obj).LLILLL;
                }
            }, null, new AwS642S0100000_28(this, 4), 6);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zBu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1886430zBp) obj).LL;
                }
            }, null, new AwS642S0100000_28(c1887200zD4, 5), 6);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0zBt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1886430zBp) obj).LLILLJJLI);
                }
            }, null, new AwS642S0100000_28(this, 6), 6);
        }
    }
}
