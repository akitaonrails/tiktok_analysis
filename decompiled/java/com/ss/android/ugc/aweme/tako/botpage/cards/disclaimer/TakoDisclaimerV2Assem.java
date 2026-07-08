package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.C003L;
import X.C01GW;
import X.C1308910kAL;
import X.C14J2;
import X.C1697810uHb;
import X.C202135147h;
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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.TakoDisclaimerWithTosConfigModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerV2Assem extends ReusedUISlotAssem<TakoDisclaimerV2Assem> implements InterfaceC712990Rxx<C003L> {
    public static final C202135147h LLL = new C202135147h(16);
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public C14J2 LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(110));
    public final C444890HcV LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn8;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoDisclaimerWithTosConfigModel sp() {
        return (TakoDisclaimerWithTosConfigModel) this.LLJLLL.getValue();
    }

    public final boolean tp() {
        return ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
    }

    public TakoDisclaimerV2Assem() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        this.LLJZ = c444890HcV;
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(111));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        int i;
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.fw9);
        this.LLJL = (TuxTextView) view.findViewById(R.id.fvm);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.fvn);
        this.LLJLILLLLZIIL = (LinearLayout) view.findViewById(R.id.fvq);
        this.LLJLL = (LinearLayout) view.findViewById(R.id.fvr);
        this.LLJLLIL = (C14J2) view.findViewById(R.id.ety);
        if (tp()) {
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(LLL.LJFF);
                tuxTextView.setTextColorRes(R.attr.a1h);
            }
            for (TuxTextView tuxTextView2 : C1697810uHb.LJIIJJI(this.LLJL, this.LLJLIL)) {
                if (tuxTextView2 != null) {
                    C202135147h c202135147h = LLL;
                    tuxTextView2.setTuxFont(c202135147h.LJI);
                    tuxTextView2.setTextColorRes(c202135147h.LJII);
                }
            }
            op(this.LLJLILLLLZIIL);
            op(this.LLJLL);
        }
        if (!tp()) {
            Context context = getContext();
            if (context != null) {
                if (C960203pA.LIZIZ(context)) {
                    i = R.attr.zq;
                } else {
                    i = R.attr.c7;
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(i, context);
                if (numLIZJ2 != null) {
                    int iIntValue = numLIZJ2.intValue();
                    C14J2 c14j2 = this.LLJLLIL;
                    if (c14j2 != null) {
                        c14j2.setBackgroundDrawColor(iIntValue);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C14J2 c14j22 = this.LLJLLIL;
        if (c14j22 != null) {
            C202135147h c202135147h2 = LLL;
            c14j22.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c202135147h2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c202135147h2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        C14J2 c14j23 = this.LLJLLIL;
        if (c14j23 != null) {
            c14j23.setDrawType(1);
        }
        C14J2 c14j24 = this.LLJLLIL;
        if (c14j24 != null) {
            c14j24.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(LLL.LJ)));
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(LLL.LIZJ, context2)) != null) {
            int iIntValue2 = numLIZJ.intValue();
            C14J2 c14j25 = this.LLJLLIL;
            if (c14j25 != null) {
                c14j25.setStrokeDrawColor(iIntValue2);
            }
        }
        C14J2 c14j26 = this.LLJLLIL;
        if (c14j26 == null) {
            return;
        }
        c14j26.setStrokeWidthDp(LLL.LIZLLL);
    }

    public final void op(LinearLayout linearLayout) {
        View childAt;
        Drawable drawable;
        if (tp() && linearLayout != null && (childAt = linearLayout.getChildAt(0)) != null) {
            Context context = getContext();
            if (context != null) {
                drawable = context.getDrawable(LLL.LJIIIIZZ);
            } else {
                drawable = null;
            }
            childAt.setBackground(drawable);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C003L c003l) {
        int i;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(sp().title);
        }
        boolean zIsEmpty = TextUtils.isEmpty(sp().contentLearnMore);
        int i2 = R.attr.a1j;
        if (zIsEmpty) {
            LinearLayout linearLayout = this.LLJLILLLLZIIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        } else {
            LinearLayout linearLayout2 = this.LLJLILLLLZIIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                C2027407wu c2027407wu = C2027407wu.LIZ;
                Context context = getContext();
                if (context == null) {
                    context = tuxTextView2.getContext();
                }
                String str = sp().contentLearnMore;
                Map<String, PlaceholderInfoModel> map = sp().placeholders;
                Typeface typeface = this.LLJZ.getTypeface();
                if (tp()) {
                    i = LLL.LJII;
                } else {
                    i = R.attr.a1j;
                }
                tuxTextView2.setText(C2027407wu.LIZ(c2027407wu, context, str, map, typeface, Integer.valueOf(i)));
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView2.setLineHeight(C814420VxA.LIZIZ(C418440Gaw.LJ(16)));
            }
        }
        if (TextUtils.isEmpty(sp().contentTosAndPolicy)) {
            LinearLayout linearLayout3 = this.LLJLL;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
                return;
            }
            return;
        }
        LinearLayout linearLayout4 = this.LLJLL;
        if (linearLayout4 != null) {
            C786410Ut5.LJZL(0, linearLayout4);
        }
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 == null) {
            return;
        }
        C2027407wu c2027407wu2 = C2027407wu.LIZ;
        Context context2 = getContext();
        if (context2 == null) {
            context2 = tuxTextView3.getContext();
        }
        String str2 = sp().contentTosAndPolicy;
        Map<String, PlaceholderInfoModel> map2 = sp().placeholders;
        Typeface typeface2 = this.LLJZ.getTypeface();
        if (tp()) {
            i2 = LLL.LJII;
        }
        tuxTextView3.setText(C2027407wu.LIZ(c2027407wu2, context2, str2, map2, typeface2, Integer.valueOf(i2)));
        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView3.setLineHeight(C814420VxA.LIZIZ(C418440Gaw.LJ(16)));
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
