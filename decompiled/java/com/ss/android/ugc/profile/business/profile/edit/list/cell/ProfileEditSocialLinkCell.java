package com.ss.android.ugc.profile.business.profile.edit.list.cell;

import X.C01GW;
import X.C11G4;
import X.C1214430hhx;
import X.C1215970hkR;
import X.C1266090j3H;
import X.C127K;
import X.C1308910kAL;
import X.C13LE;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1216830hlp;
import X.InterfaceC1214300hhk;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS122S0200000_19;
import Y.ATListenerS452S0100000_19;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.edit.IProfileEditLinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditSocialLinkCell extends PowerCell<C1214430hhx> implements InterfaceC1214300hhk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C127K LL;
    public boolean LLILLL;
    public View LLILZ;
    public final C1266090j3H LLILLJJLI = new C1266090j3H(this, 5);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2095));
    public final AwS633S0100000_19 LLILZLL = new AwS633S0100000_19(this, 114);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileEditSocialLinkCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/profile/edit/list/control/IProfileLinkControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1214300hhk
    public final void LJIIJ() {
        this.LLILLL = false;
        this.itemView.setBackgroundColor(0);
    }

    @Override // X.InterfaceC1214300hhk
    public final void LJIIZILJ() {
        Integer num = (Integer) this.LLILZIL.getValue();
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
    }

    @Override // X.InterfaceC1214300hhk
    public final boolean n2() {
        return this.LLILLL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        C11G4 c11g4LIZ;
        View viewFindViewById;
        IProfileEditLinkAbility iProfileEditLinkAbility;
        View viewFindViewById2;
        IProfileEditLinkAbility iProfileEditLinkAbility2;
        String uid;
        String string2;
        C1214430hhx c1214430hhx = (C1214430hhx) interfaceC1891350zJl;
        super.onBindItemView(c1214430hhx);
        C127K c127k = this.LL;
        if (c127k != null) {
            c127k.setTitle(c1214430hhx.LLILLJJLI);
            ((TuxTextView) c127k.findViewById(R.id.m4r)).setTuxFont(41);
            TuxTextView tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(41);
            }
            TuxTextView tuxTextView2 = (TuxTextView) c127k.findViewById(R.id.y3j);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1h);
            }
        }
        String str = "";
        View viewFindViewById3 = null;
        if (c1214430hhx.LL == EnumC1216830hlp.WEBSITE.getType() && (iProfileEditLinkAbility2 = c1214430hhx.LLILZ) != null && iProfileEditLinkAbility2.YQ1()) {
            C127K c127k2 = this.LL;
            if (c127k2 != null) {
                Context context = getContext();
                if (context == null || (string2 = context.getString(2131827253)) == null) {
                    string2 = "";
                }
                C1215970hkR.LIZJ(c127k2, string2, false);
            }
            IProfileEditLinkAbility iProfileEditLinkAbility3 = c1214430hhx.LLILZ;
            if (iProfileEditLinkAbility3 != null && iProfileEditLinkAbility3.ZJ1()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                User userIx = c1214430hhx.LLILZ.Ix();
                if (userIx != null) {
                    uid = userIx.getUid();
                } else {
                    uid = null;
                }
                c2344009Gk.LJIIIIZZ("uid", uid);
                C20684815ws.LJIILLIIL("cannot_add_link_show", c2344009Gk.LIZ);
            }
        }
        String str2 = c1214430hhx.LLILLL;
        if (str2 != null && str2.length() != 0) {
            C127K c127k3 = this.LL;
            if (c127k3 != null) {
                I5(c127k3, c1214430hhx.LLILLL, true);
            }
        } else {
            C127K c127k4 = this.LL;
            if (c127k4 != null) {
                Context context2 = getContext();
                if (context2 != null && (string = context2.getString(2131837190)) != null) {
                    str = string;
                }
                I5(c127k4, str, false);
            }
        }
        C127K c127k5 = this.LL;
        if (c127k5 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_3_lines_horizontal_2;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c127k5.setIcon(c419910GdJ);
        }
        C127K c127k6 = this.LL;
        if (c127k6 != null) {
            viewFindViewById3 = c127k6.findViewById(R.id.y3j);
        }
        if (viewFindViewById3 != null) {
            C426750GoL.LJIIIZ(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), false, 16);
        }
        C127K c127k7 = this.LL;
        if (c127k7 != null && (viewFindViewById2 = c127k7.findViewById(R.id.k1_)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById2, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), 0, 0, false, 16);
        }
        View view = this.LLILZ;
        if (view != null) {
            view.setOnTouchListener(new ATListenerS452S0100000_19(this.LLILZLL, 2));
        }
        if (c1214430hhx.LL == EnumC1216830hlp.LEMON8.getType() && (iProfileEditLinkAbility = c1214430hhx.LLILZ) != null) {
            iProfileEditLinkAbility.X02(new AwS385S0200000_19(c1214430hhx, this, 109));
        }
        C127K c127k8 = this.LL;
        if (c127k8 != null && (viewFindViewById = c127k8.findViewById(R.id.m4r)) != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, 0, 16);
        }
        C127K c127k9 = this.LL;
        if (c127k9 != null && (c11g4LIZ = C1215970hkR.LIZ(c127k9)) != null) {
            c11g4LIZ.LJIILL(new ACListenerS122S0200000_19(c1214430hhx, this, 56));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ece, viewGroup, false);
        this.LL = (C127K) viewTd.findViewById(R.id.mqv);
        this.LLILZ = viewTd.findViewById(R.id.g85);
        return viewTd;
    }

    public final void I5(C127K c127k, CharSequence charSequence, boolean z) {
        int i;
        int length;
        C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
        if (c11g4LIZ == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = c11g4LIZ.LJIIL();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Context context = getContext();
        if (context != null) {
            if (z) {
                i = R.attr.a1h;
            } else {
                i = R.attr.uh;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                if (charSequence != null) {
                    length = charSequence.length();
                } else {
                    length = 0;
                }
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 0, length, 17);
            }
        }
        c11g4LIZ.LJIILJJIL(spannableStringBuilder);
        c127k.setAccessory(c11g4LIZ);
    }
}
