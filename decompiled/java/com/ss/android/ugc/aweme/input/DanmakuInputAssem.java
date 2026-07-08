package com.ss.android.ugc.aweme.input;

import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C1354840lMQ;
import X.C1361010lWN;
import X.C1383770m75;
import X.C13LE;
import X.C1402120mag;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1354850lMR;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS155S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuInputAssem extends UISlotAssem implements DanmakuInputAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final Regex LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public TuxIconView LLJJIII;
    public C1354840lMQ LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public C427660Gpo LLJJIJIL;
    public AnimatorSet LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuInputAssem.class, "inputVM", "getInputVM()Lcom/ss/android/ugc/aweme/input/DanmakuInputVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new Regex("[\r|\n]+");
    }

    public DanmakuInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuInputVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 612), AFwS259S0000000_21.get$arr$(171), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 611));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bj1;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -145495641) {
            return null;
        }
        return this;
    }

    public final DanmakuInputVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (DanmakuInputVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        UrlModel avatarThumb;
        C03IT c03it;
        C427660Gpo c427660Gpo;
        CharSequence charSequence;
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.up8);
        Context context = getContext();
        if (context != null && (tuxIconView = this.LLJJIJIIJIL) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_arrow_up_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        }
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS155S0100000_21(this, 207));
        }
        this.LLJJIJI = (C1354840lMQ) view.findViewById(R.id.gsw);
        C1361010lWN c1361010lWN = hp().LL;
        if (c1361010lWN != null && (charSequence = c1361010lWN.LIZJ) != null && charSequence.length() > 0) {
            C1354840lMQ c1354840lMQ = this.LLJJIJI;
            if (c1354840lMQ != null) {
                c1354840lMQ.setText(charSequence);
            }
            TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
        }
        C1354840lMQ c1354840lMQ2 = this.LLJJIJI;
        if (c1354840lMQ2 != null) {
            c1354840lMQ2.addTextChangedListener(new C1402120mag(this, 14));
        }
        C1354840lMQ c1354840lMQ3 = this.LLJJIJI;
        String string = null;
        if (c1354840lMQ3 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131827579);
            }
            c1354840lMQ3.setHint(string);
        }
        C1354840lMQ c1354840lMQ4 = this.LLJJIJI;
        if (c1354840lMQ4 != null) {
            final View viewLJJIJL = LJJIJL();
            c1354840lMQ4.setFilters(new InputFilter[]{new InputFilter(viewLJJIJL) { // from class: X.0HbV
                public final View LL;
                public final int LLILLJJLI = ((Number) C303690BvL.LIZ.getValue()).intValue();

                {
                    this.LL = viewLJJIJL;
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence2, int i, int i2, Spanned spanned, int i3, int i4) {
                    if (spanned == null || charSequence2 == null) {
                        return null;
                    }
                    int length = this.LLILLJJLI - (spanned.length() - (i4 - i3));
                    int i5 = i2 - i;
                    if (length < i5) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                        c1389890mGx.LJIIIZ(2131838743);
                        c1389890mGx.LJIIJJI();
                    }
                    if (length <= 0) {
                        return "";
                    }
                    if (length >= i5) {
                        return null;
                    }
                    int i6 = length + i;
                    int i7 = i6 - 1;
                    if (Character.isHighSurrogate(charSequence2.charAt(i7))) {
                        if (i7 == i) {
                            return "";
                        }
                        i6 = i7;
                    }
                    return charSequence2.subSequence(i, i6);
                }
            }});
        }
        C1354840lMQ c1354840lMQ5 = this.LLJJIJI;
        if (c1354840lMQ5 != null) {
            c1354840lMQ5.setFocusChangeListener(new InterfaceC1354850lMR() { // from class: X.0lMS
                @Override // X.InterfaceC1354850lMR
                public final void LIZ() {
                    KeyboardUtils.LIZLLL(this.LIZ.LLJJIJI);
                }
            });
        }
        C1354840lMQ c1354840lMQ6 = this.LLJJIJI;
        if (c1354840lMQ6 != null) {
            c1354840lMQ6.setFocusableInTouchMode(true);
        }
        C1354840lMQ c1354840lMQ7 = this.LLJJIJI;
        if (c1354840lMQ7 != null) {
            c1354840lMQ7.setFocusable(true);
        }
        C1354840lMQ c1354840lMQ8 = this.LLJJIJI;
        if (c1354840lMQ8 != null) {
            c1354840lMQ8.requestFocus();
        }
        TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.gzi);
        this.LLJJIII = tuxIconView4;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS155S0100000_21(this, 208));
        }
        this.LLJJIJIL = (C427660Gpo) view.findViewById(R.id.bkz);
        User curUser = C1383770m75.LIZ().LJIIJ().getCurUser();
        if (curUser.getAvatarMedium() != null) {
            avatarThumb = curUser.getAvatarMedium();
        } else if (curUser.getAvatarLarger() != null) {
            avatarThumb = curUser.getAvatarLarger();
        } else {
            if (curUser.getAvatarThumb() != null) {
                avatarThumb = curUser.getAvatarThumb();
            }
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lMP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1354820lMO) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 145), 4);
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lMN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1354820lMO) obj).LLILZ);
                }
            }, C736820SvI.LJ(), new AwS635S0100000_21(this, 146), 4);
        }
        if (avatarThumb != null && (c03it = new C03IT(avatarThumb.getUrlList())) != null && (c427660Gpo = this.LLJJIJIL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, c03it, false, null, null, false, false, null, null, false, null, 1006);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lMP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1354820lMO) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 145), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0lMN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1354820lMO) obj).LLILZ);
            }
        }, C736820SvI.LJ(), new AwS635S0100000_21(this, 146), 4);
    }
}
