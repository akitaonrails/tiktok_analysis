package com.ss.android.ugc.aweme.tako.multipletemplate.templatelist;

import X.C01D1;
import X.C01GW;
import X.C0I7D;
import X.C1110404Vy;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1853010yJv;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C259800zU;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1154120g8g;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS158S0100000_24;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.PromptTemplateAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PromptTemplateAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public InterfaceC1355580lNc LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1332));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1335));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1338));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1336));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1337));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1333));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1339));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1334));
    public final C1559260qg8 LLJJL = new C1559260qg8(new C723580SZw(this, C1853010yJv.class, null), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PromptTemplateAssem.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PromptTemplateAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateListViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1340), AFwS264S0000000_24.get$arr$(444), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fqh;
    }

    public final void hp() {
        List list = (List) this.LLJJI.getValue();
        if (list == null || C13LP.LJJJLL(list) == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        TemplateListViewModel templateListViewModel = (TemplateListViewModel) assemVMLazy.getValue();
        templateListViewModel.withState(new AwS393S0200000_27(templateListViewModel, getContentView().getContext(), 171));
    }

    public final C197039127h ip() {
        return (C197039127h) this.LLJJJ.getValue();
    }

    public final C1853010yJv kp() {
        return (C1853010yJv) this.LLJJL.getValue();
    }

    public final C0I7D lp() {
        return (C0I7D) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJJJJJIL;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        View decorView;
        Window window;
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 324));
        View view2 = (View) this.LLJJIII.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        view2.setBackground(c384050F3z.LIZ(((View) this.LLJJIII.getValue()).getContext()));
        View view3 = (View) this.LLJJJJ.getValue();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, view3.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        float fAlpha = Color.alpha(iIntValue) / 255.0f;
        float f = 255;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (0.0f * fAlpha * f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)), Color.argb((int) (fAlpha * 0.5f * f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue))}));
        final C259800zU c259800zU = new C259800zU();
        ACListenerS158S0100000_24 aCListenerS158S0100000_24 = new ACListenerS158S0100000_24(this, 60);
        C786410Ut5.h9((TuxTextView) this.LLJJIJIL.getValue(), aCListenerS158S0100000_24);
        C786410Ut5.I7(aCListenerS158S0100000_24, getContentView().findViewById(R.id.k2j));
        C786410Ut5.d9(lp(), aCListenerS158S0100000_24);
        C786410Ut5.U8(ip(), new ACListenerS158S0100000_24(this, 58));
        C786410Ut5.U8((C197039127h) this.LLJJJIL.getValue(), new ACListenerS158S0100000_24(this, 59));
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        TemplateListViewModel templateListViewModel = (TemplateListViewModel) assemVMLazy.getValue();
        C1853010yJv c1853010yJvKp = kp();
        EnumC1154120g8g enumC1154120g8g = EnumC1154120g8g.TAKO_TEMPLATE_ACTIVITY;
        templateListViewModel.LLILLL = c1853010yJvKp;
        templateListViewModel.LLILZLL = enumC1154120g8g;
        C736680Sv4.LJIIIIZZ(this, this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0rG3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853320yKQ) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 112), 6);
        C0I7D c0i7dLp = lp();
        c0i7dLp.setFocusable(false);
        c0i7dLp.setFocusableInTouchMode(false);
        c0i7dLp.setCursorVisible(false);
        lp().addTextChangedListener(new TextWatcher() { // from class: X.0s0c
            public boolean LL = true;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                boolean z;
                String enterFrom;
                String enterMethod;
                String str;
                String str2;
                String str3;
                String pageSource;
                String modeSource;
                String templateType;
                String groupId;
                Map<String, String> commonMobParams;
                Map<String, String> commonMobParams2;
                Map<String, String> commonMobParams3;
                String str4 = "";
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.LL) {
                    PromptTemplateAssem promptTemplateAssem = this.LLILLJJLI;
                    if (z) {
                        ((C197039127h) promptTemplateAssem.LLJJJIL.getValue()).setEnabled(false);
                        promptTemplateAssem.ip().setEnabled(false);
                    } else {
                        ((C197039127h) promptTemplateAssem.LLJJJIL.getValue()).setEnabled(true);
                        promptTemplateAssem.ip().setEnabled(true);
                    }
                    this.LL = z;
                }
                if (!this.LLILLJJLI.LLJJJJLIIL && !Intrinsics.LJFF(string, c259800zU.element)) {
                    PromptTemplateAssem promptTemplateAssem2 = this.LLILLJJLI;
                    promptTemplateAssem2.LLJJJJLIIL = true;
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    C1853010yJv c1853010yJvKp2 = promptTemplateAssem2.kp();
                    if (c1853010yJvKp2 == null || (enterFrom = c1853010yJvKp2.getEnterFrom()) == null) {
                        enterFrom = "";
                    }
                    C1853010yJv c1853010yJvKp3 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp3 == null || (enterMethod = c1853010yJvKp3.getEnterMethod()) == null) {
                        enterMethod = "";
                    }
                    C1853010yJv c1853010yJvKp4 = this.LLILLJJLI.kp();
                    String mode = null;
                    if (c1853010yJvKp4 == null || (commonMobParams3 = c1853010yJvKp4.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
                        str = "";
                    }
                    C1853010yJv c1853010yJvKp5 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp5 == null || (commonMobParams2 = c1853010yJvKp5.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
                        str2 = "";
                    }
                    C1853010yJv c1853010yJvKp6 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp6 == null || (commonMobParams = c1853010yJvKp6.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
                        str3 = "";
                    }
                    C1853010yJv c1853010yJvKp7 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp7 == null || (pageSource = c1853010yJvKp7.getPageSource()) == null) {
                        pageSource = "";
                    }
                    C1853010yJv c1853010yJvKp8 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp8 != null) {
                        mode = c1853010yJvKp8.getMode();
                    }
                    C1853010yJv c1853010yJvKp9 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp9 == null || (modeSource = c1853010yJvKp9.getModeSource()) == null) {
                        modeSource = "";
                    }
                    Pair[] pairArr = new Pair[2];
                    C1853010yJv c1853010yJvKp10 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp10 == null || (templateType = c1853010yJvKp10.getTemplateType()) == null) {
                        templateType = "";
                    }
                    pairArr[0] = new Pair("template_type", templateType);
                    C1853010yJv c1853010yJvKp11 = this.LLILLJJLI.kp();
                    if (c1853010yJvKp11 != null && (groupId = c1853010yJvKp11.getGroupId()) != null) {
                        str4 = groupId;
                    }
                    pairArr[1] = new Pair("group_id", str4);
                    C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "start_edit", "", null, mode, modeSource, null, null, null, C2097608Jq.LJIIIIZZ(pairArr), 47360);
                }
            }
        });
        View contentView = getContentView();
        contentView.setFocusable(true);
        contentView.setFocusableInTouchMode(true);
        contentView.requestFocus();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(c19egLIZ, decorView);
        this.LLJJJJJIL = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = new InterfaceC1352000lHq() { // from class: X.0s0d
                @Override // X.InterfaceC1352000lHq
                public final void j(int i) {
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLILII() {
                    C0I7D c0i7dLp2 = this.LL.lp();
                    c0i7dLp2.setFocusable(false);
                    c0i7dLp2.setFocusableInTouchMode(false);
                    c0i7dLp2.setCursorVisible(false);
                    c0i7dLp2.clearFocus();
                    C2174781A9k.LIZ(c0i7dLp2);
                    PromptTemplateAssem promptTemplateAssem = this.LL;
                    promptTemplateAssem.LLJJJJLIIL = false;
                    ((TextView) promptTemplateAssem.LLJJIJIL.getValue()).setText(((View) this.LL.LLJJIJIL.getValue()).getContext().getString(2131822549));
                    C786410Ut5.LJLLLLLL(8, (View) this.LL.LLJJJIL.getValue());
                    C786410Ut5.LJLLLLLL(0, this.LL.ip());
                }

                @Override // X.InterfaceC1352000lHq
                public final void LLLLZI(int i) {
                    String enterFrom;
                    String enterMethod;
                    String str;
                    String str2;
                    String str3;
                    String pageSource;
                    String modeSource;
                    String templateType;
                    String groupId;
                    Map<String, String> commonMobParams;
                    Map<String, String> commonMobParams2;
                    Map<String, String> commonMobParams3;
                    C786410Ut5.LJLLLLLL(0, (View) this.LL.LLJJJIL.getValue());
                    C786410Ut5.LJLLLLLL(8, this.LL.ip());
                    ((TextView) this.LL.LLJJIJIL.getValue()).setText(((View) this.LL.LLJJIJIL.getValue()).getContext().getString(2131822512));
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    C1853010yJv c1853010yJvKp2 = this.LL.kp();
                    String str4 = "";
                    if (c1853010yJvKp2 == null || (enterFrom = c1853010yJvKp2.getEnterFrom()) == null) {
                        enterFrom = "";
                    }
                    C1853010yJv c1853010yJvKp3 = this.LL.kp();
                    if (c1853010yJvKp3 == null || (enterMethod = c1853010yJvKp3.getEnterMethod()) == null) {
                        enterMethod = "";
                    }
                    C1853010yJv c1853010yJvKp4 = this.LL.kp();
                    String mode = null;
                    if (c1853010yJvKp4 == null || (commonMobParams3 = c1853010yJvKp4.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
                        str = "";
                    }
                    C1853010yJv c1853010yJvKp5 = this.LL.kp();
                    if (c1853010yJvKp5 == null || (commonMobParams2 = c1853010yJvKp5.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
                        str2 = "";
                    }
                    C1853010yJv c1853010yJvKp6 = this.LL.kp();
                    if (c1853010yJvKp6 == null || (commonMobParams = c1853010yJvKp6.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
                        str3 = "";
                    }
                    C1853010yJv c1853010yJvKp7 = this.LL.kp();
                    if (c1853010yJvKp7 == null || (pageSource = c1853010yJvKp7.getPageSource()) == null) {
                        pageSource = "";
                    }
                    C1853010yJv c1853010yJvKp8 = this.LL.kp();
                    if (c1853010yJvKp8 != null) {
                        mode = c1853010yJvKp8.getMode();
                    }
                    C1853010yJv c1853010yJvKp9 = this.LL.kp();
                    if (c1853010yJvKp9 == null || (modeSource = c1853010yJvKp9.getModeSource()) == null) {
                        modeSource = "";
                    }
                    Pair[] pairArr = new Pair[2];
                    C1853010yJv c1853010yJvKp10 = this.LL.kp();
                    if (c1853010yJvKp10 == null || (templateType = c1853010yJvKp10.getTemplateType()) == null) {
                        templateType = "";
                    }
                    pairArr[0] = new Pair("template_type", templateType);
                    C1853010yJv c1853010yJvKp11 = this.LL.kp();
                    if (c1853010yJvKp11 != null && (groupId = c1853010yJvKp11.getGroupId()) != null) {
                        str4 = groupId;
                    }
                    pairArr[1] = new Pair("group_id", str4);
                    C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "click_edit", "", null, mode, modeSource, null, null, null, C2097608Jq.LJIIIIZZ(pairArr), 47360);
                }
            };
            keyboardFakePopupWindowLIZ.show();
        }
    }
}
