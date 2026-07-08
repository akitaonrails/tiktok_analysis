package com.ss.android.ugc.aweme.socialavatar.mixstudio.share;

import X.C019F;
import X.C0HSQ;
import X.C0HSR;
import X.C0HSS;
import X.C0HST;
import X.C0HSU;
import X.C0HT0;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20642515q3;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C440370HOp;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC441640HTm;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioShareActionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioShareActionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/share/MixStudioShareViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MixStudioShareActionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioShareViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 819), AFwS236S0000000_6.get$arr$(331), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C0HSS.class, null), checkSupervisorPrepared());
    }

    public final C0HSS Ho() {
        return (C0HSS) this.LLJ.getValue();
    }

    public final MixStudioShareViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (MixStudioShareViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        C0HSU c0hsu;
        EnumC441640HTm enumC441640HTm;
        String str;
        C0HSR c0hsr;
        C0HSR c0hsr2;
        EnumC441640HTm enumC441640HTm2;
        super.onViewCreated(view);
        String str2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            RadiusLayout radiusLayoutGo = Go(C20642515q3.LJI(2131849125), R.raw.icon_add_to_story, C0HSU.LL, new C0HSQ(this));
            String strLJI = C20642515q3.LJI(R.string.hz_);
            C0HSS c0hssHo = Ho();
            if (c0hssHo != null && (enumC441640HTm2 = c0hssHo.LL) != null && enumC441640HTm2.isFromStory()) {
                c0hsu = C0HSU.LLILLL;
            } else {
                c0hsu = C0HSU.LLILLJJLI;
            }
            RadiusLayout radiusLayoutGo2 = Go(strLJI, R.raw.icon_arrow_down_to_line, c0hsu, new C0HST(this));
            RadiusLayout radiusLayoutGo3 = Go(C20642515q3.LJI(R.string.s65), R.raw.icon_flag, C0HSU.LLILLL, new C0HT0(this));
            C0HSS c0hssHo2 = Ho();
            if (c0hssHo2 != null && (enumC441640HTm = c0hssHo2.LL) != null && !enumC441640HTm.isFromStory()) {
                viewGroup.addView(radiusLayoutGo);
                C440370HOp c440370HOp = C440370HOp.LIZ;
                C0HSS c0hssHo3 = Ho();
                if (c0hssHo3 != null && (c0hsr2 = c0hssHo3.LLILLL) != null) {
                    str = c0hsr2.LIZ;
                } else {
                    str = null;
                }
                C0HSS c0hssHo4 = Ho();
                if (c0hssHo4 != null && (c0hsr = c0hssHo4.LLILLL) != null) {
                    str2 = c0hsr.LIZIZ;
                }
                c440370HOp.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                C20684815ws.LJIILLIIL("share_to_story_show", c2344009Gk.LIZ);
            }
            viewGroup.addView(radiusLayoutGo2);
            viewGroup.addView(radiusLayoutGo3);
            if (radiusLayoutGo3 != null) {
                C426750GoL.LJIIIZ(radiusLayoutGo3, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 0, false, 16);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0HSV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HTL) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(25), 4);
    }

    public final RadiusLayout Go(String str, int i, C0HSU c0hsu, Function0 function0) {
        RadiusLayout radiusLayout;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.f__, null);
        if (!(viewLJLLJ instanceof RadiusLayout) || (radiusLayout = (RadiusLayout) viewLJLLJ) == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) radiusLayout.findViewById(R.id.a3c);
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TextView textView = (TextView) radiusLayout.findViewById(R.id.a4y);
        if (textView != null) {
            textView.setText(str);
        }
        int iOrdinal = c0hsu.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    radiusLayout.setRadius(C418440Gaw.LIZIZ(10));
                } else {
                    throw new C1954807lC();
                }
            } else {
                radiusLayout.LIZ(0.0f, 0.0f, C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10));
            }
        } else {
            radiusLayout.LIZ(C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10), 0.0f, 0.0f);
        }
        C427690Gpr.LJ(radiusLayout, 0.0f);
        C786410Ut5.I7(new AkS78S0100000_6(function0, 26), radiusLayout);
        return radiusLayout;
    }
}
