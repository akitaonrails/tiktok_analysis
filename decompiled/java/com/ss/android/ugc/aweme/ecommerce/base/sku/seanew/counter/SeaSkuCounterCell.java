package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031D;
import X.C03C8;
import X.C03IJ;
import X.C03K6;
import X.C049X;
import X.C04JZ;
import X.C0WZX;
import X.C1012003xW;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1389880mGw;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7735030j;
import X.C786410Ut5;
import X.C814420VxA;
import X.C908703gr;
import X.C937003lQ;
import X.C960203pA;
import X.EnumC1011903xV;
import X.EnumC1012103xX;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS136S0100000_1;
import Y.ATListenerS437S0100000_1;
import android.text.Editable;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS109S0101000_1;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuCounterCell extends ECPowerCell<C031D> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final float LLJJJIL;
    public final AssemVMLazy LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public EditText LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public C031D LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuCounterCell.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = C418440Gaw.LIZIZ(5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.axr;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.vha);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.vhb);
        this.LLJILJIL = (EditText) this.itemView.findViewById(R.id.vh_);
        this.LLJILJILJ = (LinearLayout) this.itemView.findViewById(R.id.pct);
        this.LLJILLL = (TuxIconView) this.itemView.findViewById(R.id.pcw);
        this.LLJJ = (TuxTextView) this.itemView.findViewById(R.id.pd5);
        View view = this.itemView;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIL(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(iLIZIZ2), 16);
        View viewFindViewById = this.itemView.findViewById(R.id.vgd);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        float f = LLJJJIL;
        c384050F3z.LJIIIIZZ = Float.valueOf(f);
        c384050F3z.LJIIIZ = Float.valueOf(f);
        c384050F3z.LJIIJ = Float.valueOf(f);
        c384050F3z.LJIIJJI = Float.valueOf(f);
        viewFindViewById.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS136S0100000_1(this, 12));
        }
        C908703gr c908703gr = N5().LLJILJILJ;
        if (c908703gr != null) {
            c908703gr.LIZLLL("tiktokec_button_show", new C049X(), new AwS545S0100000_1(this, 1448), EnumC1011903xV.LOG_WHEN_SHOW, this.LLJIJIL, "sku_button_show_counter_plus");
        }
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS136S0100000_1(this, 13));
        }
        C908703gr c908703gr2 = N5().LLJILJILJ;
        if (c908703gr2 != null) {
            c908703gr2.LIZLLL("tiktokec_button_show", new C049X(), new AwS545S0100000_1(this, 1451), EnumC1011903xV.LOG_WHEN_SHOW, this.LLJI, "sku_button_show_counter_minus");
        }
        EditText editText = this.LLJILJIL;
        if (editText != null) {
            editText.setOnTouchListener(new ATListenerS437S0100000_1(this, 2));
        }
        EditText editText2 = this.LLJILJIL;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C04JZ(this, 0));
        }
        EditText editText3 = this.LLJILJIL;
        if (editText3 != null) {
            editText3.setKeyListener(new NumberKeyListener() { // from class: X.03xY
                @Override // android.text.method.KeyListener
                public final int getInputType() {
                    return 3;
                }

                @Override // android.text.method.NumberKeyListener
                public final char[] getAcceptedChars() {
                    return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                }
            });
        }
        C736680Sv4.LJIIIZ(this, N5(), new C2217381BqS() { // from class: X.03lY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.03VK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLJ;
            }
        }, null, new AwS650S0100000_1(this, 10), 12);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.03lW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLILZLL;
            }
        }, null, new AwS615S0100000_1(this, 75), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.03lU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLILZIL;
            }
        }, null, new AwS615S0100000_1(this, 76), 6);
    }

    public SeaSkuCounterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1440);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(367);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1455), awS545S0100000_1, AFwS207S0000000_19.get$arr$(239), new AwS545S0100000_1((C03K6) this, 1456), new AwS545S0100000_1((C03K6) this, 1458), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1460), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1388), null, new AwS545S0100000_1((C03K6) this, 1462));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1457);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1459);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1461);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 88));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1389);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1390);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1391);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1392);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1393);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1463), awS545S0100000_1, AFwS207S0000000_19.get$arr$(237), new AwS545S0100000_1((C03K6) this, 1441), new AwS545S0100000_1((C03K6) this, 1442), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1443), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1387), null, new AwS545S0100000_1((C03K6) this, 1444));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1445), awS545S0100000_1, AFwS207S0000000_19.get$arr$(238), new AwS545S0100000_1((C03K6) this, 1447), new AwS545S0100000_1((C03K6) this, 1450), new AwS545S0100000_1((C03K6) this, 1453), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1454));
        }
        this.LLJ = assemVMLazy;
        this.LLJJIJI = true;
    }

    public final C7735030j L5() {
        C031D c031d = this.LLJJIJIL;
        if (c031d != null) {
            return c031d.LLIZ;
        }
        return null;
    }

    public final SeaSkuSpecViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    public final void P5(C7735030j c7735030j) {
        Integer num;
        int iIntValue;
        String str;
        C031D c031d = this.LLJJIJIL;
        if (c031d != null && (num = c031d.LLJJI) != null && (iIntValue = num.intValue()) > 0) {
            C031D c031d2 = this.LLJJIJIL;
            if (c031d2 != null && (str = c031d2.LLJJ) != null) {
                String strLJJIFFI = u.LJJIFFI(str, "{$quantity}", String.valueOf(iIntValue), false);
                C1389880mGw c1389880mGw = new C1389880mGw(this.itemView);
                c1389880mGw.LJIIIZ(strLJJIFFI);
                c1389880mGw.LJIIJ();
                return;
            }
            return;
        }
        C736680Sv4.LJIJJ(N5(), new AwS109S0101000_1(this, c7735030j.LIZIZ, 0));
    }

    public final void R5(C7735030j c7735030j) {
        String str;
        int i = c7735030j.LIZ;
        if (i > 1) {
            C031D c031d = this.LLJJIJIL;
            if (c031d != null && (str = c031d.LLJILLL) != null) {
                String strLJJIFFI = u.LJJIFFI(str, "{$quantity}", String.valueOf(i), false);
                C1389880mGw c1389880mGw = new C1389880mGw(this.itemView);
                c1389880mGw.LJIIIZ(strLJJIFFI);
                c1389880mGw.LJIIJ();
                return;
            }
            return;
        }
        String quantityString = this.itemView.getContext().getResources().getQuantityString(2131755286, i, Integer.valueOf(i));
        C1389880mGw c1389880mGw2 = new C1389880mGw(this.itemView);
        c1389880mGw2.LJIIIZ(quantityString);
        c1389880mGw2.LJIIJ();
    }

    public final void S5(C937003lQ c937003lQ) {
        int i;
        EnumC1012103xX enumC1012103xX = c937003lQ.LIZ;
        if (enumC1012103xX == null) {
            i = -1;
        } else {
            i = C1012003xW.LIZ[enumC1012103xX.ordinal()];
        }
        boolean z = true;
        if (i == 1 || i == 2 || i == 3) {
            z = false;
        }
        if (this.LLJJIJI == z) {
            return;
        }
        this.LLJJIJI = z;
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(z);
        }
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setEnabled(z);
        }
        EditText editText = this.LLJILJIL;
        if (editText != null) {
            editText.setEnabled(z);
        }
    }

    public final void U5(String str) {
        String string;
        int length;
        EditText editText = this.LLJILJIL;
        if (editText == null) {
            return;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0v2KgsoZVe3BNsdmL048/41rHcPJpfvFAuDOqfhKm6iw==", null));
        if (editableLLJILLL != null) {
            string = editableLLJILLL.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, str)) {
            return;
        }
        this.LLJJI = true;
        editText.setText(str);
        Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0v2KgsoZVe3BNsdmL048/41rHcPJpfvFAuDOqfhKm6iw==", null));
        if (editableLLJILLL2 != null) {
            length = editableLLJILLL2.length();
        } else {
            length = 0;
        }
        editText.setSelection(length);
        this.LLJJI = false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C7735030j c7735030jL5;
        int iIntValue;
        Image image;
        String strValueOf;
        C031D c031d = (C031D) interfaceC1891350zJl;
        super.onBindItemView(c031d);
        this.LLJJIJIL = c031d;
        int i = c031d.LLILZLL;
        EditText editText = this.LLJILJIL;
        if (editText != null && (c7735030jL5 = L5()) != null) {
            C736680Sv4.LJIJJ(N5(), new AwS580S0100000_1(this, 4));
            this.LLJJIJIIJIL = i;
            String str = "";
            if (!editText.isFocused()) {
                int i2 = this.LLJJIJIIJIL;
                if (i2 == 0) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(i2);
                }
                U5(strValueOf);
            }
            T5(this.LLJJIJIIJIL, c7735030jL5);
            C031D c031d2 = this.LLJJIJIL;
            if (c031d2 == null) {
                LinearLayout linearLayout = this.LLJILJILJ;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                    return;
                }
                return;
            }
            Integer num = c031d2.LLJILJIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.attr.a1l;
            }
            TuxTextView tuxTextView = this.LLJJ;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(iIntValue);
            }
            ECRichText eCRichText = c031d2.LLIZLLLIL;
            if (eCRichText != null) {
                TuxIconView tuxIconView = this.LLJILLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                LinearLayout linearLayout2 = this.LLJILJILJ;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                TuxTextView tuxTextView2 = this.LLJJ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                TuxTextView tuxTextView3 = this.LLJJ;
                if (tuxTextView3 != null) {
                    C03C8.LIZJ(tuxTextView3, eCRichText, "sku_counter_desc", null);
                }
                String str2 = eCRichText.template;
                if (str2 != null) {
                    str = str2;
                }
                LinearLayout linearLayout3 = this.LLJILJILJ;
                if (linearLayout3 == null) {
                    return;
                }
                C736680Sv4.LJIJJ(N5(), new AwS17S2200000_1(this, str, linearLayout3, (String) null, 0));
                return;
            }
            String str3 = c031d2.LLJ;
            if (str3 != null && !a0.LJJJIL(str3)) {
                LinearLayout linearLayout4 = this.LLJILJILJ;
                if (linearLayout4 != null) {
                    C786410Ut5.LJZL(0, linearLayout4);
                }
                TuxIconView tuxIconView2 = this.LLJILLL;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
                TuxTextView tuxTextView4 = this.LLJJ;
                if (tuxTextView4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView4, 0);
                }
                TuxTextView tuxTextView5 = this.LLJJ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(c031d2.LLJ);
                }
                if ((!C960203pA.LIZIZ(this.itemView.getContext()) || (image = c031d2.LLJIJIL) == null) && (image = c031d2.LLJI) == null) {
                    TuxIconView tuxIconView3 = this.LLJILLL;
                    if (tuxIconView3 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                    }
                } else {
                    TuxIconView tuxIconView4 = this.LLJILLL;
                    if (tuxIconView4 == null) {
                        return;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
                    c1331670kl3LIZLLL.LJJI(tuxIconView4);
                    c1331670kl3LIZLLL.LJIIJJI();
                }
                String str4 = c031d2.LLJ;
                LinearLayout linearLayout5 = this.LLJILJILJ;
                if (linearLayout5 == null) {
                    return;
                }
                C736680Sv4.LJIJJ(N5(), new AwS17S2200000_1(this, str4, linearLayout5, (String) null, 0));
                return;
            }
            LinearLayout linearLayout6 = this.LLJILJILJ;
            if (linearLayout6 != null) {
                C786410Ut5.LJZL(8, linearLayout6);
            }
            TuxIconView tuxIconView5 = this.LLJILLL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
            TuxTextView tuxTextView6 = this.LLJJ;
            if (tuxTextView6 == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
        }
    }

    public final void T5(int i, C7735030j c7735030j) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
        if (numLIZJ2 != null && numLIZJ != null) {
            if (!this.LLJJIJI) {
                TuxIconView tuxIconView = this.LLJIJIL;
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(numLIZJ.intValue());
                }
                TuxIconView tuxIconView2 = this.LLJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColor(numLIZJ.intValue());
                    return;
                }
                return;
            }
            TuxIconView tuxIconView3 = this.LLJIJIL;
            if (tuxIconView3 != null) {
                if (i >= c7735030j.LIZIZ) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = numLIZJ2.intValue();
                }
                tuxIconView3.setTintColor(iIntValue2);
            }
            TuxIconView tuxIconView4 = this.LLJI;
            if (tuxIconView4 == null) {
                return;
            }
            if (i <= c7735030j.LIZ) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = numLIZJ2.intValue();
            }
            tuxIconView4.setTintColor(iIntValue);
        }
    }
}
