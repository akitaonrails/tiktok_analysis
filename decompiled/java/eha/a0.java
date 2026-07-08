package eha;

import X.C01GW;
import X.C03DZ;
import X.C0HZQ;
import X.C0I7D;
import X.C0WZX;
import X.C13LP;
import X.C1745300vWC;
import X.C1745330vWF;
import X.C1745340vWG;
import X.C1745430vWP;
import X.C1745470vWT;
import X.C1745480vWU;
import X.C1745490vWV;
import X.C1745680vWo;
import X.C1745690vWp;
import X.C1746150vXZ;
import X.C1746460vY4;
import X.C1748260vay;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C586610Mzb;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C927503jt;
import X.C948503nH;
import X.C960203pA;
import X.EnumC586600Mza;
import X.InterfaceC998610c5r;
import Y.ACListenerS128S0200000_26;
import Y.ARunnableS126S0100000_26;
import aha.h;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import eha.a0;
import g1c.AjS44S0200000_26;
import g1c.AjS66S0100000_19;
import g1c.AjS70S0100000_26;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class a0 implements p8b.c, InterfaceC998610c5r {
    public final C1745300vWC LL;
    public final AddressEditFragment LLILLJJLI;
    public final AddressEditViewModel LLILLL;
    public final boolean LLILZ;
    public C1745490vWV LLILZIL;
    public final CandHelper LLILZLL;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public C1745680vWo LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJJ;
    public Integer LLJJI;
    public Integer LLJJIII;
    public long LLIZ = -1;
    public boolean LLJI = true;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1231));

    @Override // p8b.c
    public final String getViewName() {
        return "TextInputHelper";
    }

    @Override // X.InterfaceC998610c5r
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C0I7D l() {
        return this.LL.getInputWithIndicatorEditTextFromXml();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C1745340vWG c1745340vWG;
        String str;
        C1745680vWo c1745680vWo = this.LLJILJIL;
        if (c1745680vWo != null) {
            if (c1745680vWo.LJII || !c1745680vWo.LJFF) {
                return false;
            }
            if (c1745680vWo != null && (c1745340vWG = c1745680vWo.LIZJ) != null && (str = c1745340vWG.LIZ) != null && str.length() > 0) {
                return true;
            }
        }
        return String.valueOf(C2204961BRm.LLLLJI(l(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRMunR5k1Ew5XnFl3QV/Gg", null))).length() == 0;
    }

    /* JADX WARN: Type inference failed for: r4v50, types: [X.0vWV] */
    public final void LIZJ(final C1745680vWo c1745680vWo) {
        String str;
        String str2;
        boolean z;
        View viewFindViewById;
        C0HZQ c0hzq;
        View viewFindViewById2;
        TextView textView;
        String str3;
        List listLJJLIIIJILLIZJL;
        String str4;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams;
        String str5;
        int iLIZIZ;
        this.LLJILJIL = c1745680vWo;
        this.LLJI = c1745680vWo.LIZLLL;
        ClientConfig clientConfig = this.LLILLL.LLL;
        View viewFindViewById3 = null;
        if (clientConfig != null) {
            str = clientConfig.uiStyle;
        } else {
            str = null;
        }
        if (C586610Mzb.LIZ(str)) {
            if (Intrinsics.LJFF(c1745680vWo.LIZ.key, "name")) {
                C1745300vWC c1745300vWC = this.LL;
                if ((c1745300vWC instanceof C1745300vWC) && c1745300vWC != null) {
                    c1745300vWC.LJI(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), true);
                }
            } else {
                ClientConfig clientConfig2 = this.LLILLL.LLL;
                if (clientConfig2 != null) {
                    str5 = clientConfig2.uiStyle;
                } else {
                    str5 = null;
                }
                if (Intrinsics.LJFF(str5, EnumC586600Mza.EU_NEW_VERSION.getValue())) {
                    View inputBottomSpaceFromXml = this.LL.getInputBottomSpaceFromXml();
                    if (inputBottomSpaceFromXml != null) {
                        C786410Ut5.LJLLLLLL(8, inputBottomSpaceFromXml);
                    }
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                C1745300vWC c1745300vWC2 = this.LL;
                if ((c1745300vWC2 instanceof C1745300vWC) && c1745300vWC2 != null) {
                    c1745300vWC2.LJI(Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), true);
                }
            }
            C426750GoL.LJIIL(this.LL.getInputWithIndicatorFromXml(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), 21);
        }
        if (C770702zh.LIZIZ(c1745680vWo.LIZ.key)) {
            String str6 = c1745680vWo.LIZ.key;
            ClientConfig clientConfig3 = this.LLILLL.LLL;
            if (clientConfig3 != null) {
                str4 = clientConfig3.wakeUpKeyBoardKeys;
            } else {
                str4 = null;
            }
            if (Intrinsics.LJFF(str6, str4) && !this.LLJIJIL && ((addressEditEnterParams = this.LLILLL.LLJJJIL) == null || addressEditEnterParams.address == null)) {
                HandlerHook.viewPost(this.LL, new ARunnableS126S0100000_26(this, 67));
                this.LLJIJIL = true;
            }
        }
        C1745490vWV c1745490vWV = this.LLILZIL;
        if (c1745490vWV != null) {
            this.LL.getInputWithIndicatorFromXml().getEditText().removeTextChangedListener(c1745490vWV);
        }
        if (!Intrinsics.LJFF(c1745680vWo.LIZ.key, this.LLILZLL.LJII)) {
            this.LLILZLL.LIZJ(this.LLILLL, c1745680vWo.LIZ.key);
        }
        this.LL.getInputWithIndicatorFromXml().setIndicatorClickListener(new ACListenerS128S0200000_26(this, c1745680vWo, 13));
        Object obj = c1745680vWo.LIZIZ;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        String str7 = "";
        if (str2 != null) {
            this.LL.getInputWithIndicatorFromXml().setText(str2);
        } else {
            this.LL.getInputWithIndicatorFromXml().setText("");
        }
        if (str2 != null && str2.length() != 0 && !this.LLJILJILJ) {
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            String str8 = c1745680vWo.LIZ.key;
            c1746460vY4.getClass();
            if (C1746460vY4.LIZIZ(str8)) {
                C1745680vWo c1745680vWo2 = this.LLJILJIL;
                if (c1745680vWo2 != null) {
                    C948503nH.LJIIIIZZ(this.LLILLJJLI, new C1745430vWP(this, c1745680vWo2, c1745680vWo, str2, null));
                }
                c1745680vWo.LJIIL = null;
            }
        }
        Integer num = c1745680vWo.LIZ.type;
        if (num != null) {
            if (num.intValue() == 0) {
                this.LL.getInputWithIndicatorFromXml().getEditText().setTag(0);
                this.LL.getInputWithIndicatorFromXml().setInputType(1);
                AddressEditViewModel addressEditViewModel = this.LLILLL;
                String str9 = c1745680vWo.LIZ.key;
                ClientConfig clientConfig4 = addressEditViewModel.LLL;
                if (clientConfig4 != null && (str3 = clientConfig4.numberKeyboardKeys) != null && (listLJJLIIIJILLIZJL = kotlin.text.a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) != null && C13LP.LJJJJ(str9, listLJJLIIIJILLIZJL)) {
                    this.LL.getInputWithIndicatorFromXml().setInputType(2);
                }
            } else if (num.intValue() == 5) {
                this.LL.getInputWithIndicatorFromXml().getEditText().setTag(5);
                this.LL.getInputWithIndicatorFromXml().setInputType(1);
            }
        }
        final C1745300vWC c1745300vWC3 = this.LL;
        c1745300vWC3.LIZLLL(c1745680vWo.LIZ.title, c1745680vWo.LIZJ());
        c1745300vWC3.getInputWithIndicatorFromXml().setHint(c1745680vWo.LIZ.hint);
        Integer num2 = c1745680vWo.LIZ.maxLines;
        if (num2 == null || num2.intValue() < 0) {
            if (this.LLILZ) {
                num2 = 1;
            } else {
                num2 = Integer.MAX_VALUE;
            }
        }
        c1745300vWC3.getInputWithIndicatorFromXml().setMaxLines(num2.intValue());
        if (num2.intValue() > 1) {
            c1745300vWC3.getInputWithIndicatorEditTextFromXml().setImeOptions(6);
            c1745300vWC3.getInputWithIndicatorEditTextFromXml().setRawInputType(1);
            c1745300vWC3.getInputWithIndicatorEditTextFromXml().setInputType(131072);
            c1745300vWC3.getInputWithIndicatorEditTextFromXml().setHorizontallyScrolling(false);
        } else {
            Integer num3 = c1745680vWo.LJIIIIZZ;
            if (num3 != null) {
                this.LL.getInputWithIndicatorEditTextFromXml().setImeOptions(num3.intValue());
            }
        }
        if (c1745300vWC3.getInputWithIndicatorFromXml().getInputWithIndicatorEditTextFromXml().hasFocus()) {
            c1745300vWC3.LIZIZ();
            c1745680vWo.LIZJ = null;
        } else {
            if (!((h) this.LLJILLL.getValue()).LIZLLL() && !this.LLILLL.FQ2().isAllKeyItemFilled()) {
                z = false;
            } else {
                z = true;
            }
            C1745330vWF.LIZ(z, c1745680vWo.LIZJ, c1745300vWC3);
        }
        C786410Ut5.I7(new AjS44S0200000_26(c1745300vWC3, this, 15), this.LL.getContentViewFromXml());
        String str10 = this.LLILZLL.LJIIJ;
        if (Intrinsics.LJFF(str10, "sug") || Intrinsics.LJFF(str10, "auto")) {
            this.LLIZLLLIL = C2204961BRm.LLJILLL(c1745300vWC3.getInputWithIndicatorFromXml().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRMunR5k1Ew5XnFl3QV/Gg", null)).length();
            if (C1745470vWT.LIZ(c1745680vWo.LIZ.key)) {
                c1745300vWC3.getInputWithIndicatorFromXml().getEditText().setSelection(C2204961BRm.LLJILLL(c1745300vWC3.getInputWithIndicatorFromXml().getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM6R4QuW/NeRMunR5k1Ew5XnFl3QV/Gg", null)).length());
            }
        }
        this.LL.getInputWithIndicatorFromXml().getEditText().setFilters(new C1745690vWp[]{new C1745690vWp()});
        Integer num4 = c1745680vWo.LIZ.maxLength;
        if (num4 != null) {
            c1745300vWC3.getInputWithIndicatorFromXml().setMaxLength(num4.intValue());
        }
        this.LLILZIL = new C927503jt(this) { // from class: X.0vWV
            public final /* synthetic */ a0 LLILLJJLI;

            {
                this.LLILLJJLI = this;
            }

            @Override // X.C927503jt, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z2;
                if (charSequence != null) {
                    C1745680vWo c1745680vWo3 = c1745680vWo;
                    a0 a0Var = this.LLILLJJLI;
                    String string = kotlin.text.a0.LJLIIIL(charSequence.toString()).toString();
                    if (!Intrinsics.LJFF(string, c1745680vWo3.LIZIZ)) {
                        a0Var.LLILLL.LLJJIJI = true;
                        c1745680vWo3.LIZIZ = string;
                        if (Intrinsics.LJFF(c1745680vWo3.LIZ.key, "zipcode")) {
                            a0Var.LLILLL.LLLLZIL = null;
                        }
                        AddressEditViewModel addressEditViewModel2 = a0Var.LLILLL;
                        if (addressEditViewModel2.AR2() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        addressEditViewModel2.nS2(z2);
                    } else {
                        return;
                    }
                }
                if (C1745470vWT.LIZ(c1745680vWo.LIZ.key) || this.LLILLJJLI.LLILLL.nR2(c1745680vWo.LIZ.key)) {
                    a0 a0Var2 = this.LLILLJJLI;
                    CandHelper candHelper = a0Var2.LLILZLL;
                    if (candHelper.LJI == 0) {
                        candHelper.LJI = 1;
                        candHelper.LIZ(a0Var2.LLILLL, c1745680vWo.LIZ.key);
                    } else {
                        if (!a0Var2.LLJI) {
                            return;
                        }
                        candHelper.LJ(a0Var2.LL.getInputWithIndicatorFromXml().getEditText(), c1745680vWo.LIZ.key, this.LLILLJJLI.LLILLL, 1);
                    }
                }
            }
        };
        c1745300vWC3.getInputWithIndicatorFromXml().getEditText().addTextChangedListener(this.LLILZIL);
        c1745300vWC3.getInputWithIndicatorFromXml().setOnEditTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0vWS
            /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
            @Override // android.view.View.OnFocusChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onFocusChange(android.view.View r14, boolean r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 778
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC1745460vWS.onFocusChange(android.view.View, boolean):void");
            }
        });
        if (C1746150vXZ.LIZ() && (Intrinsics.LJFF(c1745680vWo.LIZ.key, "address") || Intrinsics.LJFF(c1745680vWo.LIZ.key, "address_detail") || Intrinsics.LJFF(c1745680vWo.LIZ.key, "unit_floor"))) {
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 476);
            C786410Ut5.M9(this.LL);
            C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_26, 50), this.LL);
            C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_26, 52), this.LL.getContentViewFromXml());
            this.LL.getInputWithIndicatorEditTextFromXml().setFocusable(false);
            this.LL.getInputWithIndicatorEditTextFromXml().setCursorVisible(false);
            this.LL.getInputWithIndicatorEditTextFromXml().setFocusableInTouchMode(false);
            C786410Ut5.I7(new AjS70S0100000_26(awS605S0100000_26, 53), this.LL.getContentViewFromXml().findViewById(R.id.kq8));
        } else if (!c1745680vWo.LJFF) {
            if (((h) this.LLJILLL.getValue()).LIZJ()) {
                this.LL.getTitleFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, this.LL.getContext()));
            }
            C786410Ut5.M9(this.LL);
            C786410Ut5.I7(new AjS70S0100000_26(this, 45), this.LL);
            C786410Ut5.I7(new AjS70S0100000_26(this, 46), this.LL.getContentViewFromXml());
            this.LL.getInputWithIndicatorEditTextFromXml().setFocusable(false);
            this.LL.getInputWithIndicatorEditTextFromXml().setCursorVisible(false);
            this.LL.getInputWithIndicatorEditTextFromXml().setFocusableInTouchMode(false);
            this.LL.getInputWithIndicatorEditTextFromXml().setTextColor(C960203pA.LIZ(R.attr.a1p, this.LL.getContext()));
            C786410Ut5.I7(new AjS70S0100000_26(this, 48), this.LL.getContentViewFromXml().findViewById(R.id.kq8));
        }
        boolean zLIZIZ = C770702zh.LIZIZ(c1745680vWo.LIZIZ());
        FrameLayout contentViewFromXml = this.LL.getContentViewFromXml();
        if (contentViewFromXml != null) {
            viewFindViewById = contentViewFromXml.findViewById(R.id.dj7);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof C0HZQ) {
            c0hzq = (C0HZQ) viewFindViewById;
        } else {
            c0hzq = null;
        }
        FrameLayout contentViewFromXml2 = this.LL.getContentViewFromXml();
        if (contentViewFromXml2 != null) {
            viewFindViewById2 = contentViewFromXml2.findViewById(R.id.z3l);
        } else {
            viewFindViewById2 = null;
        }
        if (viewFindViewById2 instanceof TuxTextView) {
            textView = (TextView) viewFindViewById2;
        } else {
            textView = null;
        }
        if (zLIZIZ) {
            View inputWithIndicatorBar = this.LL.getInputWithIndicatorBar();
            if (inputWithIndicatorBar != null) {
                C426750GoL.LJIIL(inputWithIndicatorBar, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 0, 21);
            }
            C1748260vay inputWithIndicatorFromXml = this.LL.getInputWithIndicatorFromXml();
            if (inputWithIndicatorFromXml != null) {
                this.LLJJI = Integer.valueOf(inputWithIndicatorFromXml.getPaddingTop());
                this.LLJJIII = Integer.valueOf(inputWithIndicatorFromXml.getPaddingBottom());
                C426750GoL.LJIIL(inputWithIndicatorFromXml, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 21);
            }
            if (c0hzq != null) {
                C03DZ.LIZJ(c0hzq);
                if (!this.LLJJ) {
                    this.LLJJ = true;
                    C1745480vWU c1745480vWU = this.LLILLL.LLJJIJIL;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("sug_type", "geo_2");
                    String str11 = c1745680vWo.LIZ.key;
                    if (str11 != null) {
                        str7 = str11;
                    }
                    pairArr[1] = new Pair("input_box_name", str7);
                    C1745480vWU.LJFF(c1745480vWU, "zipcode_unknown", null, C2097608Jq.LJIIIIZZ(pairArr), 2);
                }
                C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0vWY
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        String str12;
                        AddressEditViewModel addressEditViewModel2 = this.LL.LLILLL;
                        addressEditViewModel2.getClass();
                        addressEditViewModel2.setState(new AwS38S0010000_26(z2, 17));
                        C1745480vWU c1745480vWU2 = this.LL.LLILLL.LLJJIJIL;
                        if (z2) {
                            str12 = "select";
                        } else {
                            str12 = "cancel";
                        }
                        String str13 = c1745680vWo.LIZ.key;
                        if (str13 == null) {
                            str13 = "";
                        }
                        c1745480vWU2.LJIILL(str12, "manual", str13);
                    }
                });
            }
            if (textView != null) {
                C03DZ.LIZJ(textView);
                textView.setText(c1745680vWo.LIZIZ());
                C786410Ut5.I7(new AjS66S0100000_19(c0hzq, 0), textView);
                return;
            }
            return;
        }
        C03DZ.LIZ(c0hzq);
        C03DZ.LIZ(textView);
        FrameLayout contentViewFromXml3 = this.LL.getContentViewFromXml();
        if (contentViewFromXml3 != null) {
            viewFindViewById3 = contentViewFromXml3.findViewById(R.id.kq6);
        }
        C03DZ.LIZ(viewFindViewById3);
        Integer num5 = this.LLJJIII;
        if (num5 != null) {
            int iIntValue = num5.intValue();
            C1748260vay inputWithIndicatorFromXml2 = this.LL.getInputWithIndicatorFromXml();
            if (inputWithIndicatorFromXml2 != null) {
                C426750GoL.LJIIL(inputWithIndicatorFromXml2, null, null, null, Integer.valueOf(iIntValue), 23);
            }
        }
        Integer num6 = this.LLJJI;
        if (num6 != null) {
            int iIntValue2 = num6.intValue();
            C1748260vay inputWithIndicatorFromXml3 = this.LL.getInputWithIndicatorFromXml();
            if (inputWithIndicatorFromXml3 != null) {
                C426750GoL.LJIIL(inputWithIndicatorFromXml3, null, Integer.valueOf(iIntValue2), null, null, 29);
            }
        }
        View inputWithIndicatorBar2 = this.LL.getInputWithIndicatorBar();
        if (inputWithIndicatorBar2 == null) {
            return;
        }
        C426750GoL.LJIIL(inputWithIndicatorBar2, null, 0, null, 0, 21);
    }

    public final void LIZ(LaneParams laneParams, C1745680vWo c1745680vWo, Function0<Unit> function0) {
        if (this.LLILLL.LLLLZIL != null && Intrinsics.LJFF(c1745680vWo.LIZ.key, "zipcode")) {
            laneParams.withNotCheckParam("has_auto_input", 1);
            laneParams.withNotCheckParam("has_sug_input", 1);
            laneParams.withNotCheckParam("sug_type", this.LLILLL.LLLLZIL);
            return;
        }
        function0.invoke();
    }

    public a0(C1745300vWC c1745300vWC, AddressEditFragment addressEditFragment, AddressEditViewModel addressEditViewModel, boolean z) {
        this.LL = c1745300vWC;
        this.LLILLJJLI = addressEditFragment;
        this.LLILLL = addressEditViewModel;
        this.LLILZ = z;
        this.LLILZLL = new CandHelper(c1745300vWC.getContext(), c1745300vWC.getContentViewFromXml());
    }
}
