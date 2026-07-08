package com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C049X;
import X.C0I7D;
import X.C0WZX;
import X.C1019103yf;
import X.C13LE;
import X.C13LP;
import X.C1748720vbi;
import X.C1749420vcq;
import X.C1749430vcr;
import X.C19719912Dl;
import X.C19FO;
import X.C19GS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C742102v5;
import X.C786410Ut5;
import X.C927503jt;
import X.C943603mU;
import X.EnumC1014603xw;
import X.EnumC1749100vcK;
import X.EnumC565660MGm;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnFocusChangeListenerC1775860wJU;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillCpfInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class CpfCell extends ECPowerCell<C742102v5> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJ;
    public final C943603mU LLJI;
    public final C1749420vcq LLJIJIL;
    public C1749430vcr LLJILJIL;
    public KeyBoardVisibilityUtil LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public int LLJJI;
    public EnumC565660MGm LLJJIII;
    public EnumC1749100vcK LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CpfCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void L5() {
        C19FO c19fo;
        if (this.LL) {
            return;
        }
        this.LL = true;
        C03J8.LIZ(this.itemView, true);
        Context context = this.itemView.getContext();
        if ((context instanceof C19GS) && (c19fo = (C19FO) context) != null) {
            this.LLJILJILJ = new KeyBoardVisibilityUtil(c19fo, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 23));
        }
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.03l1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLIIL);
            }
        }, null, new AwS615S0100000_1(this, 24), 6);
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [X.0vcq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.03mU] */
    public CpfCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 294);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(196);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 279), awS570S0100000_26, AFwS215S0000000_26.get$arr$(97), new AwS570S0100000_26((C03K6) this, 280), new AwS570S0100000_26((C03K6) this, 282), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 284), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 286), null, new AwS570S0100000_26((C03K6) this, 287));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 281);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 283);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 285);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 19));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 288);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 289);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 290);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 291);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 292);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 293), awS570S0100000_26, AFwS215S0000000_26.get$arr$(98), new AwS570S0100000_26((C03K6) this, 295), new AwS570S0100000_26((C03K6) this, 296), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 297), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 298), null, new AwS570S0100000_26((C03K6) this, 299));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), awS570S0100000_26, AFwS215S0000000_26.get$arr$(99), new AwS570S0100000_26((C03K6) this, 301), new AwS570S0100000_26((C03K6) this, 302), new AwS570S0100000_26((C03K6) this, 277), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 278));
        }
        this.LLJ = assemVMLazy;
        final EditText editText = (EditText) this.itemView.findViewById(R.id.hcd);
        this.LLJI = new C927503jt(editText) { // from class: X.03mU
            public final EditText LL;
            public final int LLILLJJLI = 3;
            public final List<String> LLILLL = C1697810uHb.LJIIJJI(e3.d, "-");
            public final int LLILZ = 14;

            {
                this.LL = editText;
            }

            @Override // X.C927503jt, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (this.LLILLJJLI <= 0) {
                    return;
                }
                String strValueOf = String.valueOf(editable);
                int i = 0;
                int length = u.LJJIFFI(u.LJJIFFI(strValueOf.substring(0, this.LL.getSelectionStart()), (String) ListProtector.get(this.LLILLL, 0), "", false), (String) ListProtector.get(this.LLILLL, 1), "", false).length();
                StringBuilder sb = new StringBuilder();
                int length2 = strValueOf.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt = strValueOf.charAt(i3);
                    if (cCharAt != ((String) ListProtector.get(this.LLILLL, 0)).charAt(0) && cCharAt != ((String) ListProtector.get(this.LLILLL, 1)).charAt(0)) {
                        sb.append(cCharAt);
                        if ((sb.length() - i2) % this.LLILLJJLI == 0) {
                            if (i2 >= 2) {
                                sb.append((String) ListProtector.get(this.LLILLL, 1));
                            } else {
                                sb.append((String) ListProtector.get(this.LLILLL, 0));
                            }
                            i2++;
                        }
                    }
                }
                int iLastIndexOf = sb.lastIndexOf((String) ListProtector.get(this.LLILLL, 0));
                int iLastIndexOf2 = sb.lastIndexOf((String) ListProtector.get(this.LLILLL, 1));
                if (iLastIndexOf2 > iLastIndexOf) {
                    iLastIndexOf = iLastIndexOf2;
                }
                if (iLastIndexOf >= 0 && iLastIndexOf == sb.length() - 1) {
                    sb.deleteCharAt(iLastIndexOf);
                }
                String string = sb.toString();
                int length3 = string.length();
                int i4 = this.LLILZ;
                if (length3 > i4) {
                    string = string.substring(0, i4);
                }
                int i5 = this.LLILLJJLI;
                int i6 = i5 + 1;
                int i7 = ((length / i5) * i6) + (length % i5);
                if (i7 % i6 == 0) {
                    i7--;
                }
                int length4 = string.length();
                if (i7 >= 0) {
                    i = i7;
                }
                if (i <= length4) {
                    length4 = i;
                }
                if (!Intrinsics.LJFF(string, strValueOf)) {
                    this.LL.setText(string);
                }
                this.LL.setSelection(length4);
            }
        };
        this.LLJIJIL = new C927503jt() { // from class: X.0vcq
            @Override // X.C927503jt, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!TextUtils.isEmpty(charSequence)) {
                    C03DZ.LIZJ(this.LL.itemView.findViewById(R.id.jxq));
                    C1749430vcr c1749430vcr = this.LL.LLJILJIL;
                    if (c1749430vcr != null) {
                        String strValueOf = String.valueOf(charSequence);
                        if (TextUtils.isEmpty(strValueOf)) {
                            c1749430vcr.dismiss();
                            return;
                        }
                        List<CpfElem> list = c1749430vcr.LLILLJJLI;
                        ArrayList arrayList = new ArrayList();
                        for (CpfElem cpfElem : list) {
                            String str = cpfElem.maskCode;
                            if (str != null && a0.LJJIIZI(str, strValueOf, false)) {
                                arrayList.add(cpfElem);
                            }
                        }
                        List<CpfElem> listLLIIII = C13LP.LLIIII(arrayList);
                        c1749430vcr.LLIZ = listLLIIII;
                        C1749440vcs c1749440vcs = c1749430vcr.LLILZLL;
                        if (c1749440vcs != null) {
                            c1749440vcs.LLILZ = strValueOf;
                            c1749440vcs.LLILLJJLI.clear();
                            c1749440vcs.LLILLJJLI.addAll(listLLIIII);
                            c1749440vcs.notifyDataSetChanged();
                        }
                        if (!c1749430vcr.LLIZ.isEmpty()) {
                            if (c1749430vcr.isShowing()) {
                                return;
                            }
                            c1749430vcr.showAsDropDown(c1749430vcr.LL, 0, C679280Qkg.LIZ(24));
                            Function1<Integer, Unit> function1 = c1749430vcr.LLILZ;
                            if (function1 == null) {
                                return;
                            }
                            function1.invoke(Integer.valueOf(c1749430vcr.LLIZ.size()));
                            return;
                        }
                        c1749430vcr.dismiss();
                        return;
                    }
                    return;
                }
                C03DZ.LIZ(this.LL.itemView.findViewById(R.id.jxq));
                C1749430vcr c1749430vcr2 = this.LL.LLJILJIL;
                if (c1749430vcr2 == null) {
                    return;
                }
                c1749430vcr2.dismiss();
            }
        };
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJILJILJ;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLJILJILJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(boolean r8) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell.P5(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CpfElem cpfElem;
        List<CpfElem> list;
        List<CpfElem> list2;
        C742102v5 c742102v5 = (C742102v5) interfaceC1891350zJl;
        L5();
        try {
            BillCpfInfo billCpfInfo = c742102v5.LL;
            C1749430vcr c1749430vcr = null;
            if (billCpfInfo != null && (list2 = billCpfInfo.cpfElems) != null) {
                cpfElem = (CpfElem) C13LP.LJJJLL(list2);
            } else {
                cpfElem = null;
            }
            if (cpfElem != null) {
                ((C0I7D) this.itemView.findViewById(R.id.hcd)).setText(cpfElem.maskCode);
                R5(false, true);
                N5().yT2(cpfElem);
                this.LLJJIJI = EnumC1749100vcK.SUCCESS;
                N5();
            } else {
                R5(true, false);
                N5().yT2(null);
            }
            BillCpfInfo billCpfInfo2 = c742102v5.LL;
            if (billCpfInfo2 != null && (list = billCpfInfo2.cpfElems) != null) {
                c1749430vcr = new C1749430vcr(this.itemView.getContext(), this.itemView.findViewById(R.id.hcd), list, new AwS675S0100000_26(this, 48), new AwS605S0100000_26(this, 868), new AwS570S0100000_26(this, 1595));
            }
            this.LLJILJIL = c1749430vcr;
            ((C0I7D) this.itemView.findViewById(R.id.hcd)).setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 12));
            C786410Ut5.I7(new AjS70S0100000_26(this, 101), this.itemView.findViewById(R.id.jxq));
            C786410Ut5.I7(new AjS70S0100000_26(this, 102), this.itemView.findViewById(R.id.jy4));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR15;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CpfVH onBind exception: ");
            sbLIZ.append(e);
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), N5().LLLIL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = this.itemView.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.aos, viewGroup, false);
    }

    public final void R5(boolean z, boolean z2) {
        if (z) {
            this.LLJJIII = EnumC565660MGm.INPUT;
            C03DZ.LIZ(this.itemView.findViewById(R.id.jy4));
            if (TextUtils.isEmpty(C2204961BRm.LLLLJI((C0I7D) this.itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null)))) {
                C03DZ.LIZ(this.itemView.findViewById(R.id.jxq));
            }
            Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) this.itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null));
            if (editableLLLLJI != null) {
                editableLLLLJI.clear();
            }
            ((TextView) this.itemView.findViewById(R.id.hcd)).setEnabled(true);
            if (z2) {
                this.itemView.findViewById(R.id.hcd).requestFocus();
            }
            ((TextView) this.itemView.findViewById(R.id.hcd)).addTextChangedListener(this.LLJI);
            ((TextView) this.itemView.findViewById(R.id.hcd)).addTextChangedListener(this.LLJIJIL);
            return;
        }
        this.LLJJIII = EnumC565660MGm.SELECT;
        C03DZ.LIZ(this.itemView.findViewById(R.id.jxq));
        C03DZ.LIZJ(this.itemView.findViewById(R.id.jy4));
        ((TextView) this.itemView.findViewById(R.id.hcd)).setEnabled(false);
        ((TextView) this.itemView.findViewById(R.id.hcd)).removeTextChangedListener(this.LLJI);
        ((TextView) this.itemView.findViewById(R.id.hcd)).removeTextChangedListener(this.LLJIJIL);
        C1748720vbi.LIZLLL(this.itemView, new C049X(), AFwS268S0000000_26.get$arr$(197));
    }
}
