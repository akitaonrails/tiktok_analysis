package com.ss.android.ugc.aweme.offlinemode.ui.sheet;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C05Q8;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19319410i8;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C21411818qq;
import X.C2217381BqS;
import X.C23250099c;
import X.C297220Bku;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426320Gne;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C616100OEm;
import X.C624610Oeh;
import X.C624670Oen;
import X.C624720Oes;
import X.C625420Og0;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC624620Oei;
import X.EnumC624750Oev;
import X.EnumC624770Oex;
import X.EnumC624820Of2;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeSheetPageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public static final C19319410i8 LLLIIII;
    public static final List<Integer> LLLIIIIL;
    public LinearLayout LLIZLLLIL;
    public SmartImageView LLJ;
    public TuxIconView LLJI;
    public RelativeLayout LLJIJIL;
    public C21411818qq LLJILJIL;
    public RelativeLayout LLJILJILJ;
    public RelativeLayout LLJILLL;
    public C197039127h LLJJ;
    public TuxIconView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C426320Gne LLJJIJIL;
    public TuxTextView LLJJJ;
    public SmartImageView LLJJJIL;
    public SmartImageView LLJJJJ;
    public View LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1417));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1418));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1416));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1419));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1410));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1412));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1411));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1415));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1413));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1414));
    public final C736950SvV LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final C630740Ooa LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModeSheetPageAssem.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIII = new C19319410i8("SheetPageAssem");
        LLLIIIIL = C1697810uHb.LJIIJJI(50, 100, 150, 200);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public OfflineModeSheetPageAssem() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(296);
        this.LLJZIJLIL = new C736950SvV(C13LE.LIZ(OfflineModeListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(587), new AwS553S0100000_9((AbstractC738140SxQ) this, 1423), new C451610HnL(this, true, true), new C723700Sa8(this));
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1422), AFwS240S0000000_9.get$arr$(586), null, true);
        this.LLLF = C628500Oky.LIZ(new AwS553S0100000_9(this, 1421));
        this.LLLFF = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1408));
        this.LLLFFI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1420));
        this.LLLFZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1409));
        this.LLLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1407));
    }

    public final OfflineModeManagerVM Go() {
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    public final TuxIconView Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pj1) : null;
            this.LLJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final RelativeLayout Jo() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pj9) : null;
            this.LLJILLL = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final C426320Gne Lo() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pjj) : null;
            this.LLJJIJIL = (C426320Gne) viewFindViewById;
        }
        return (C426320Gne) viewFindViewById;
    }

    public final TuxTextView No() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pjk) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView Oo() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pjq) : null;
            this.LLJJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final EnumC624750Oev So() {
        return (EnumC624750Oev) this.LLLF.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044f  */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAssemPostCreate() {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem.onAssemPostCreate():void");
    }

    public final void Vo() {
        boolean z = Go().getState().LLILZIL > C625420Og0.LIZ();
        Go().OQ2(true);
        Go().xQ2();
        if (z) {
            Go().MQ2(EnumC624820Of2.CONTINUE);
        }
    }

    public final boolean Zo() {
        String stringExtra;
        Intent intent;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (intent = c19egLIZ.getIntent()) == null) {
            stringExtra = null;
        } else {
            try {
                stringExtra = intent.getStringExtra("enter_method");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        }
        return Intrinsics.LJFF(stringExtra, "click_manage") && C297220Bku.LIZ();
    }

    public final String getEnterFrom() {
        EnumC624750Oev enumC624750OevSo = So();
        if (enumC624750OevSo != null) {
            return enumC624750OevSo.getEnterFrom();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        LLLIIII.LIZ("[onCreate]", this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        LLLIIII.LIZ("[onDestroy]", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        LLLIIII.LIZ("[onPause]", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        LLLIIII.LIZ("[onResume]", this);
    }

    public final void cp(double d) {
        String strJ4;
        int i;
        String string;
        String strLJJIFFI;
        View viewFindViewById = this.LLJJJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.pj_);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        boolean z = false;
        if (c19egLIZ == null || (string = c19egLIZ.getString(2131838533)) == null || (strLJJIFFI = u.LJJIFFI(string, "%d", "%.1f", false)) == null || (strJ4 = C786410Ut5.j4(strLJJIFFI, Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1))) == null) {
            strJ4 = "";
        }
        textView.setText(strJ4);
        if (C624670Oen.LIZIZ() || d > 0.0d) {
            z = true;
        }
        if (C624670Oen.LIZIZ()) {
            ((C197039127h) this.LLJLILLLLZIIL.getValue()).setEnabled(z);
        }
        View view = this.LLJJ;
        if (view == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.pj8);
            }
            this.LLJJ = (C197039127h) viewFindViewById2;
            view = viewFindViewById2;
        }
        TuxTextView tuxTextView = (TuxTextView) view;
        if (z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1p;
        }
        tuxTextView.setTextColorRes(i);
    }

    public final void dp(EnumC624770Oex enumC624770Oex) {
        String string;
        int i;
        boolean z;
        String string2;
        EnumC624620Oei.Companion.getClass();
        EnumC624620Oei enumC624620OeiLIZ = C624610Oeh.LIZ(enumC624770Oex);
        Oo().setTuxIcon(enumC624620OeiLIZ.getIcon());
        View viewFindViewById = this.LLJJIII;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.pjr);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById;
        if (C624670Oen.LIZIZ()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                string2 = c19egLIZ.getString(2131838588);
            } else {
                string2 = null;
            }
            tuxTextView.setText(string2);
            if (enumC624620OeiLIZ == EnumC624620Oei.UNINITIALIZED) {
                tuxTextView.setTuxFont(13);
            } else {
                tuxTextView.setTuxFont(33);
            }
        } else {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                string = c19egLIZ2.getString(enumC624620OeiLIZ.getTitle());
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        boolean z2 = true;
        if (C624670Oen.LIZIZ()) {
            C616100OEm state = Go().getState();
            int i2 = state.LLILLJJLI;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            float f = (i2 * 100.0f) / state.LLILZIL;
            TuxTextView tuxTextViewNo = No();
            if (tuxTextViewNo != null) {
                tuxTextViewNo.setText(enumC624620OeiLIZ.getSubtitle(C724240Sb0.LIZ(this), state.LLILZIL, state.LLILLL, z, (int) f));
            }
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                ((ImageView) this.LLJJJJLIIL.getValue()).setImageResource(R.drawable.c93);
            } else {
                ((ImageView) this.LLJJJJLIIL.getValue()).setImageResource(R.drawable.c94);
            }
            TuxIconView tuxIconViewOo = Oo();
            if (tuxIconViewOo != null) {
                tuxIconViewOo.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31)));
            }
            TuxIconView tuxIconViewOo2 = Oo();
            if (tuxIconViewOo2 != null) {
                tuxIconViewOo2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31)));
            }
            TuxIconView tuxIconViewOo3 = Oo();
            if (tuxIconViewOo3 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31));
                ViewGroup.LayoutParams layoutParams = tuxIconViewOo3.getLayoutParams();
                layoutParams.height = iLIZIZ;
                layoutParams.width = iLIZIZ;
                C786410Ut5.W5(tuxIconViewOo3, layoutParams);
            }
            C426320Gne c426320GneLo = Lo();
            if (c426320GneLo != null) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                ViewGroup.LayoutParams layoutParams2 = c426320GneLo.getLayoutParams();
                layoutParams2.height = iLIZIZ2;
                layoutParams2.width = iLIZIZ2;
                C786410Ut5.W5(c426320GneLo, layoutParams2);
            }
            View view = (View) this.LLJLLL.getValue();
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams3.height = iLIZIZ3;
            layoutParams3.width = iLIZIZ3;
            C786410Ut5.W5(view, layoutParams3);
            C426750GoL.LJIIIZ((View) this.LLJZ.getValue(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
            C426320Gne c426320GneLo2 = Lo();
            if (c426320GneLo2 != null) {
                c426320GneLo2.setUnderColorAttr(R.attr.a03);
            }
            if (enumC624770Oex.isUninitialized()) {
                C786410Ut5.LJZI(0, (ImageView) this.LLJJJJLIIL.getValue());
                C786410Ut5.LJZI(0, (ImageView) this.LLJJL.getValue());
                C786410Ut5.LJZ(8, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
            } else {
                C426320Gne c426320GneLo3 = Lo();
                if (c426320GneLo3 != null) {
                    c426320GneLo3.LIZ(f, false);
                }
                if ((!enumC624770Oex.isPauseByNet() || !z) && !enumC624770Oex.isPauseByError()) {
                    C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJLLL.getValue(), 8);
                    TuxIconView tuxIconViewOo4 = Oo();
                    if (tuxIconViewOo4 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconViewOo4, 0);
                    }
                    C426320Gne c426320GneLo4 = Lo();
                    if (c426320GneLo4 != null) {
                        C786410Ut5.LLLZZ(c426320GneLo4, 0);
                    }
                } else {
                    C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJLLL.getValue(), 0);
                    TuxIconView tuxIconViewOo5 = Oo();
                    if (tuxIconViewOo5 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconViewOo5, 8);
                    }
                    C426320Gne c426320GneLo5 = Lo();
                    if (c426320GneLo5 != null) {
                        C786410Ut5.LLLZZ(c426320GneLo5, 8);
                    }
                    if (enumC624770Oex.isPauseByError()) {
                        TuxIconView tuxIconView = (TuxIconView) this.LLJLLL.getValue();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a01);
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a01);
                        tuxIconView.setTuxIcon(c419910GdJ);
                    } else {
                        TuxIconView tuxIconView2 = (TuxIconView) this.LLJLLL.getValue();
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_clock;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.a01);
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.a01);
                        tuxIconView2.setTuxIcon(c419910GdJ2);
                    }
                }
                C786410Ut5.LJZI(8, (ImageView) this.LLJJJJLIIL.getValue());
                C786410Ut5.LJZI(8, (ImageView) this.LLJJL.getValue());
                C786410Ut5.LJZ(0, (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
                C786410Ut5.LJZ(8, (FrameLayout) this.LLJLLIL.getValue());
            }
            if (enumC624620OeiLIZ == EnumC624620Oei.DOWNLOADED) {
                C426320Gne c426320GneLo6 = Lo();
                if (c426320GneLo6 != null) {
                    c426320GneLo6.setAboveColorAttr(R.attr.a1v);
                }
                TuxIconView tuxIconViewOo6 = Oo();
                if (tuxIconViewOo6 != null) {
                    tuxIconViewOo6.setTintColorRes(R.attr.a1v);
                }
            } else {
                C426320Gne c426320GneLo7 = Lo();
                if (c426320GneLo7 != null) {
                    c426320GneLo7.setAboveColorAttr(R.attr.u_);
                }
                TuxIconView tuxIconViewOo7 = Oo();
                if (tuxIconViewOo7 != null) {
                    tuxIconViewOo7.setTintColorRes(R.attr.u_);
                }
            }
        }
        int i3 = C624720Oes.LIZ[enumC624770Oex.ordinal()];
        if ((i3 != 1 && i3 != 2 && i3 != 3) || C624670Oen.LIZIZ()) {
            C339190DRl.LIZIZ(Ho());
        } else {
            C339190DRl.LIZLLL(Ho());
        }
        if (!C297220Bku.LIZ() && !C624670Oen.LIZIZ() && enumC624770Oex == EnumC624770Oex.DOWNLOADING) {
            z2 = false;
        }
        View view2 = this.LLJJIJI;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.pjd);
            }
            this.LLJJIJI = (TuxTextView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        TuxTextView tuxTextView2 = (TuxTextView) view2;
        if (z2) {
            i = R.attr.a1j;
        } else {
            i = R.attr.a1p;
        }
        tuxTextView2.setTextColorRes(i);
    }

    public final void ep(EnumC624820Of2 enumC624820Of2) {
        Go().MQ2(enumC624820Of2);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(Go()), C0PEM.LIZJ, null, new C05Q8(this, enumC624820Of2, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bp(int r18, int r19) {
        /*
            r17 = this;
            r9 = r18
            float r5 = (float) r9
            r0 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r0
            r13 = r19
            float r0 = (float) r13
            float r5 = r5 / r0
            boolean r0 = X.C624670Oen.LIZIZ()
            r10 = 0
            r8 = 1
            r4 = 0
            r6 = r17
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM r0 = r6.Go()
            X.002o r0 = r0.getState()
            X.0OEm r0 = (X.C616100OEm) r0
            X.0Oex r14 = r0.LLILLL
            if (r9 != 0) goto L74
            r15 = 1
        L24:
            if (r9 >= r13) goto L43
            com.bytedance.tux.input.TuxTextView r1 = r6.No()
            if (r1 == 0) goto L43
            X.0Oeh r0 = X.EnumC624620Oei.Companion
            r0.getClass()
            X.0Oei r11 = X.C624610Oeh.LIZ(r14)
            X.19EG r12 = X.C724240Sb0.LIZ(r6)
            int r0 = (int) r5
            r16 = r0
            java.lang.String r0 = r11.getSubtitle(r12, r13, r14, r15, r16)
            r1.setText(r0)
        L43:
            X.0Gne r0 = r6.Lo()
            r0.LIZ(r5, r4)
            com.bytedance.tux.input.TuxTextView r2 = r6.LLJJIJI
            if (r2 != 0) goto L61
            android.view.View r1 = r6.LJJIJL()
            if (r1 == 0) goto L5b
            r0 = 2131383241(0x7f0a53c9, float:1.838685E38)
            android.view.View r10 = r1.findViewById(r0)
        L5b:
            r0 = r10
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r6.LLJJIJI = r0
            r2 = r10
        L61:
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.0Oej r1 = X.EnumC624640Oek.Companion
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            r1.getClass()
            java.lang.String r0 = X.C624630Oej.LIZ(r13, r0)
            r2.setText(r0)
            return
        L74:
            r15 = 0
            goto L24
        L76:
            com.bytedance.tux.input.TuxTextView r7 = r6.No()
            if (r9 < r13) goto L9f
            X.19EG r1 = X.C724240Sb0.LIZ(r6)
            if (r1 == 0) goto Lc6
            r0 = 2131838535(0x7f114647, float:1.9310296E38)
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto Lc6
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1[r4] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String r0 = X.C786410Ut5.j4(r2, r0)
        L9b:
            r7.setText(r0)
            goto L43
        L9f:
            X.19EG r1 = X.C724240Sb0.LIZ(r6)
            if (r1 == 0) goto Lc6
            r0 = 2131838525(0x7f11463d, float:1.9310276E38)
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto Lc6
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1[r8] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r0 = X.C786410Ut5.j4(r3, r0)
            goto L9b
        Lc6:
            r0 = r10
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem.bp(int, int):void");
    }

    public static void ap(final OfflineModeSheetPageAssem offlineModeSheetPageAssem, EnumC624770Oex enumC624770Oex, double d, int i) {
        boolean z;
        boolean z2;
        if ((i & 1) != 0) {
            enumC624770Oex = offlineModeSheetPageAssem.Go().getState().LLILLL;
        }
        if ((i & 2) != 0) {
            d = offlineModeSheetPageAssem.Go().getState().LL;
        }
        offlineModeSheetPageAssem.getClass();
        if (C624670Oen.LIZIZ()) {
            C197039127h c197039127h = (C197039127h) offlineModeSheetPageAssem.LLJLILLLLZIIL.getValue();
            C197039127h c197039127h2 = (C197039127h) offlineModeSheetPageAssem.LLJLL.getValue();
            if (enumC624770Oex == EnumC624770Oex.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            final boolean zLJFF = Intrinsics.LJFF(offlineModeSheetPageAssem.getEnterFrom(), "homepage_hot");
            if (d > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = null;
            if (z) {
                C19EG c19egLIZ = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ != null) {
                    string = c19egLIZ.getString(2131838579);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(true);
                c197039127h2.setButtonVariant(0);
                C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0Oee
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EnumC624820Of2 enumC624820Of2;
                        if (zLJFF) {
                            OfflineModeManagerVM offlineModeManagerVMGo = offlineModeSheetPageAssem.Go();
                            C19319410i8 c19319410i8 = OfflineModeManagerVM.LLILZLL;
                            offlineModeManagerVMGo.vQ2(false);
                        }
                        if (zLJFF) {
                            enumC624820Of2 = EnumC624820Of2.FYP_PANEL;
                        } else {
                            enumC624820Of2 = EnumC624820Of2.DOWNLOAD;
                        }
                        offlineModeSheetPageAssem.ep(enumC624820Of2);
                    }
                });
                C786410Ut5.LLLLLLJ(c197039127h, 8);
                return;
            }
            if (enumC624770Oex.isPauseByError()) {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ2 != null) {
                    string = c19egLIZ2.getString(2131838581);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(true);
                c197039127h2.setButtonVariant(0);
                C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(offlineModeSheetPageAssem, 124));
            } else if (zLJFF) {
                C19EG c19egLIZ3 = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ3 != null) {
                    string = c19egLIZ3.getString(2131838580);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(z2);
                c197039127h2.setButtonVariant(0);
                C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(offlineModeSheetPageAssem, 125));
            } else if (enumC624770Oex.isDownloading()) {
                C19EG c19egLIZ4 = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ4 != null) {
                    string = c19egLIZ4.getString(2131838583);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(true);
                c197039127h2.setButtonVariant(1);
                C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(offlineModeSheetPageAssem, 126));
            } else if (enumC624770Oex.canResume()) {
                C19EG c19egLIZ5 = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ5 != null) {
                    string = c19egLIZ5.getString(2131838584);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(true);
                c197039127h2.setButtonVariant(0);
                C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(offlineModeSheetPageAssem, 127));
            } else if (enumC624770Oex.isDownloaded()) {
                C19EG c19egLIZ6 = C724240Sb0.LIZ(offlineModeSheetPageAssem);
                if (c19egLIZ6 != null) {
                    string = c19egLIZ6.getString(2131838585);
                }
                c197039127h2.setText(string);
                c197039127h2.setEnabled(true);
                c197039127h2.setButtonVariant(0);
                C786410Ut5.U8(c197039127h2, new ACListenerS137S0100000_2(offlineModeSheetPageAssem, 78));
            }
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
    }

    public static void hp(int i, View view, boolean z, boolean z2) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(i);
        if (z) {
            float f = iLIZIZ;
            c384050F3z.LJIIIIZZ = Float.valueOf(f);
            c384050F3z.LJIIIZ = Float.valueOf(f);
        }
        if (z2) {
            float f2 = iLIZIZ;
            c384050F3z.LJIIJ = Float.valueOf(f2);
            c384050F3z.LJIIJJI = Float.valueOf(f2);
        }
        Context context = view.getContext();
        if (context != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context)});
            layerDrawable.setLayerInset(0, iLIZIZ2, 0, iLIZIZ2, 0);
            view.setBackground(layerDrawable);
        }
        C426750GoL.LJIIL(view, Integer.valueOf(iLIZIZ2), null, Integer.valueOf(iLIZIZ2), null, 26);
    }
}
