package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.C003L;
import X.C01GW;
import X.C1308910kAL;
import X.C14J2;
import X.C1697810uHb;
import X.C202136147i;
import X.C2027407wu;
import X.C418440Gaw;
import X.C444890HcV;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.TakoDisclaimerWithTosConfigModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerV2OptAssem extends ReusedUISlotAssem<TakoDisclaimerV2OptAssem> implements InterfaceC712990Rxx<C003L> {
    public static final C202136147i LLJZ = new C202136147i(17, 17, 0, null, 1.0f, 20.0f, Integer.valueOf(R.attr.c7), 103, 61, R.attr.a1j, R.drawable.de2);
    public static final C202136147i LLJZIJLIL = new C202136147i(16, 16, 1, Integer.valueOf(R.attr.a02), 0.5f, 16, null, 43, 81, R.attr.a1k, R.drawable.de3);
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public C14J2 LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(112));
    public final C444890HcV LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn9;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TakoDisclaimerV2OptAssem() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        this.LLJLL = c444890HcV;
        this.LLJLLIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(113));
        this.LLJLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 223));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        LinearLayout.LayoutParams layoutParams;
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.fw9);
        this.LLJL = (LinearLayout) view.findViewById(R.id.fvp);
        this.LLJLIL = (C14J2) view.findViewById(R.id.ety);
        C202136147i c202136147i = (C202136147i) this.LLJLLL.getValue();
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(c202136147i.LJII);
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
        LinearLayout linearLayout = this.LLJL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (linearLayout != null) {
            layoutParams2 = linearLayout.getLayoutParams();
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            LinearLayout linearLayout2 = this.LLJL;
            if (linearLayout2 != null) {
                C786410Ut5.d6(linearLayout2, layoutParams);
            }
        }
        C202136147i c202136147i2 = (C202136147i) this.LLJLLL.getValue();
        C14J2 c14j2 = this.LLJLIL;
        if (c14j2 != null) {
            c14j2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c202136147i2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c202136147i2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        C14J2 c14j22 = this.LLJLIL;
        if (c14j22 != null) {
            c14j22.setDrawType(c202136147i2.LIZJ);
        }
        C14J2 c14j23 = this.LLJLIL;
        if (c14j23 != null) {
            c14j23.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(c202136147i2.LJFF)));
        }
        Context context = getContext();
        if (context != null) {
            Integer num = c202136147i2.LJI;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == R.attr.c7 && C960203pA.LIZIZ(context)) {
                    iIntValue = R.attr.zq;
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(iIntValue, context);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    C14J2 c14j24 = this.LLJLIL;
                    if (c14j24 != null) {
                        c14j24.setBackgroundDrawColor(iIntValue2);
                    }
                }
            }
            Integer num2 = c202136147i2.LIZLLL;
            if (num2 != null && (numLIZJ = C1308910kAL.LIZJ(num2.intValue(), context)) != null) {
                int iIntValue3 = numLIZJ.intValue();
                C14J2 c14j25 = this.LLJLIL;
                if (c14j25 != null) {
                    c14j25.setStrokeDrawColor(iIntValue3);
                }
            }
        }
        C14J2 c14j26 = this.LLJLIL;
        if (c14j26 != null) {
            c14j26.setStrokeWidthDp(c202136147i2.LJ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C003L c003l) {
        boolean z;
        LinearLayout linearLayout;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            String str = ((TakoDisclaimerWithTosConfigModel) this.LLJLILLLLZIIL.getValue()).newTitle;
            if (a0.LJJJIL(str)) {
                str = ((TakoDisclaimerWithTosConfigModel) this.LLJLILLLLZIIL.getValue()).title;
            }
            tuxTextView.setText(str);
        }
        List<String> list = ((TakoDisclaimerWithTosConfigModel) this.LLJLILLLLZIIL.getValue()).contentParagraphs;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (true ^ a0.LJJJIL(str2)) {
                arrayList.add(str2);
            }
        }
        LinearLayout linearLayout2 = this.LLJL;
        if (linearLayout2 != null) {
            C786410Ut5.LJJJJJL(linearLayout2);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = (String) obj;
                LinearLayout linearLayout3 = this.LLJL;
                if (linearLayout3 != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Context context = getContext();
                    if (context != null || ((linearLayout = this.LLJL) != null && (context = linearLayout.getContext()) != null)) {
                        C202136147i c202136147i = (C202136147i) this.LLJLLL.getValue();
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(8388659);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (!z) {
                            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        }
                        C786410Ut5.d6(linearLayout4, layoutParams);
                        View view = new View(context);
                        view.setBackground(context.getDrawable(c202136147i.LJIIJ));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        C786410Ut5.W5(view, layoutParams2);
                        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                        tuxTextView2.setTuxFont(c202136147i.LJIIIIZZ);
                        tuxTextView2.setTextColorRes(c202136147i.LJIIIZ);
                        tuxTextView2.setGravity(8388659);
                        tuxTextView2.setTextDirection(5);
                        tuxTextView2.setText(C2027407wu.LIZ(C2027407wu.LIZ, context, str3, ((TakoDisclaimerWithTosConfigModel) this.LLJLILLLLZIIL.getValue()).placeholders, this.LLJLL.getTypeface(), Integer.valueOf(c202136147i.LJIIIZ)));
                        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                        C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                        linearLayout4.addView(view);
                        linearLayout4.addView(tuxTextView2);
                        linearLayout3.addView(linearLayout4);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003L c003l) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003L c003l) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
