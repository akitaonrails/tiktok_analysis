package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1073970e3P;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13IQ;
import X.C13LE;
import X.C1720106oR;
import X.C197039127h;
import X.C2001407si;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C446980Hfs;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1070410dxf;
import Y.ACListenerS119S0200000_16;
import Y.ACListenerS82S0300000_16;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class NeedAuthFragment extends FFPBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJSHELIOS4nISoiZyk1OGs5IGEdLSAoCDonIAM+KCg+LSs4";
    public LinearLayout LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 498));
    public final Map<EnumC1070410dxf, Boolean> LLJ = new LinkedHashMap();
    public final int LLJILJIL = R.layout.c_h;

    public final void dS() {
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJLLLLLL(EnumC1070410dxf.CONTACT.isGrant() ^ true ? 0 : 8, linearLayout);
        LinearLayout linearLayout2 = this.LLJIJIL;
        C786410Ut5.LJLLLLLL(EnumC1070410dxf.FACEBOOK.isGrant() ^ true ? 0 : 8, linearLayout2 != null ? linearLayout2 : null);
    }

    public final void gS() {
        ((LinkedHashMap) this.LLJ).clear();
        Map<EnumC1070410dxf, Boolean> map = this.LLJ;
        EnumC1070410dxf[] enumC1070410dxfArrValues = EnumC1070410dxf.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1070410dxfArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC1070410dxf enumC1070410dxf : enumC1070410dxfArrValues) {
            Pair pair = new Pair(enumC1070410dxf, Boolean.valueOf(enumC1070410dxf.isGrant()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        map.putAll(linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        for (EnumC1070410dxf enumC1070410dxf : EnumC1070410dxf.values()) {
            if (enumC1070410dxf.isGrant() && Intrinsics.LJFF(((LinkedHashMap) this.LLJ).get(enumC1070410dxf), Boolean.FALSE)) {
                ((FFPMainFragmentVM) this.LLIZLLLIL.getValue()).vQ2(C13LE.LIZ(RecFriendsFragment.class));
            }
        }
        dS();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void aS(C13IQ<? extends Fragment> c13iq) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("[ffp]", "Need Auth show again!");
        gS();
        dS();
        if (!SR().getState().LLILZLL) {
            new C2001407si("authorize", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        int i;
        gS();
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.p07);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LIZLLL("[ffp]");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        View viewFindViewById = view.findViewById(R.id.xvt);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C446980Hfs.LIZ(viewFindViewById.getContext(), R.color.fw));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        TextView textView = (TextView) view.findViewById(R.id.title);
        String string = getString(2131834653);
        String string2 = getString(2131834654);
        int i2 = 0;
        int iLJJJ = a0.LJJJ(string, "%s", 0, false, 6);
        int length = string2.length() + iLJJJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1)));
        if (iLJJJ != -1 && iLJJJ <= length) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a0d, textView.getContext())), iLJJJ, length, 33);
        }
        textView.setText(spannableStringBuilder);
        String str = null;
        C1073970e3P c1073970e3P = new C1073970e3P(SR().getState().LLILZIL.LIZ, "find_friends", str, str, 28);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.eqj);
        if (!EnumC1070410dxf.CONTACT.isGrant()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, linearLayout);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z2.LIZ = Integer.valueOf(C446980Hfs.LIZ(linearLayout.getContext(), R.color.mz));
        linearLayout.setBackground(c384050F3z2.LIZ(linearLayout.getContext()));
        C786410Ut5.R7(linearLayout, new ACListenerS82S0300000_16(linearLayout, c1073970e3P, this, 1));
        this.LLJI = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hr0);
        if (!(!EnumC1070410dxf.FACEBOOK.isGrant())) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, linearLayout2);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z3.LIZ = Integer.valueOf(C446980Hfs.LIZ(linearLayout2.getContext(), R.color.n0));
        linearLayout2.setBackground(c384050F3z3.LIZ(linearLayout2.getContext()));
        C786410Ut5.R7(linearLayout2, new ACListenerS82S0300000_16(linearLayout2, c1073970e3P, this, 2));
        this.LLJIJIL = linearLayout2;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.kyx);
        C786410Ut5.U8(c197039127h, new ACListenerS119S0200000_16(c197039127h, c1073970e3P, 9));
        c197039127h.setButtonVariant(1);
        if (!SR().getState().LLILZLL) {
            new C2001407si("authorize", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
        }
    }
}
