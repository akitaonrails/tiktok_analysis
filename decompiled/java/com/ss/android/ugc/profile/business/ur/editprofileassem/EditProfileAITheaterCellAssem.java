package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C01GW;
import X.C05P0;
import X.C0H1U;
import X.C0PEM;
import X.C1155230gAT;
import X.C11G3;
import X.C11G4;
import X.C1215970hkR;
import X.C1216270hkv;
import X.C1220380hrY;
import X.C127K;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1667980tVU;
import X.C1669670tYD;
import X.C1685850tyJ;
import X.C1954807lC;
import X.C19719212De;
import X.C19719912Dl;
import X.C19ME;
import X.C1EDI;
import X.C20028913Yh;
import X.C2217381BqS;
import X.C23250099c;
import X.C317380CcK;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1220390hrZ;
import X.EnumC1427810nG7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC549230LgP;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileAITheaterCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public LinearLayout LLJ;
    public C127K LLJI;
    public final C05P0<String> LLJIJIL;
    public final C05P0<InterfaceC549230LgP> LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public final C01GW LLJILLL;
    public final EnumC1220390hrZ LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileAITheaterCellAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileAITheaterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditProfileAITheaterCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileAITheaterViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2249), AFwS257S0000000_19.get$arr$(392), null, true);
        this.LLJIJIL = C20028913Yh.LJI("");
        this.LLJILJIL = C20028913Yh.LJI(null);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
        this.LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(424));
        this.LLJJ = EnumC1220390hrZ.BOTTOM;
    }

    public final Drawable Go() {
        float[] fArr;
        int[] iArr = {6092703, -10951249, -11550513, 1279962847};
        float[] fArr2 = {0.0f, 0.3654f, 0.6587f, 0.9519f};
        float fLIZIZ = C418440Gaw.LIZIZ(10);
        int i = C1220380hrY.LIZ[this.LLJJ.ordinal()];
        if (i == 1) {
            fArr = new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i == 2) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ};
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (Build.VERSION.SDK_INT >= 29) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setAlpha(28);
            gradientDrawable.setColors(iArr, fArr2);
            return gradientDrawable;
        }
        float width = this.LLJI != null ? r1.getWidth() : C418440Gaw.LIZIZ(369);
        float fLIZIZ2 = C418440Gaw.LIZIZ(24);
        LinearGradient linearGradient = new LinearGradient(0.0f, fLIZIZ2, width, fLIZIZ2, iArr, fArr2, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setAlpha(28);
        shapeDrawable.getPaint().setShader(linearGradient);
        return shapeDrawable;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        EditProfileAITheaterViewModel editProfileAITheaterViewModel = (EditProfileAITheaterViewModel) assemVMLazy.getValue();
        C23250099c.LIZLLL(editProfileAITheaterViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C317380CcK(editProfileAITheaterViewModel, null), 2);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0hka
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C317400CcM) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 131), 6);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        LinearLayout linearLayout;
        int iIntValue;
        int iIntValue2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayout linearLayout2;
        C11G4 c11g4LIZ;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        super.onViewCreated(view);
        if (!((Boolean) this.LLJILLL.getValue()).booleanValue()) {
            C127K c127k2 = this.LLJI;
            if (c127k2 != null) {
                C786410Ut5.LLZLL(c127k2, 8);
                return;
            }
            return;
        }
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJI = c127k;
            ViewParent parent = view.getParent();
            if (parent instanceof LinearLayout) {
                linearLayout = (LinearLayout) parent;
            } else {
                linearLayout = null;
            }
            this.LLJ = linearLayout;
            if (C1EDI.LJ() && (linearLayout3 = this.LLJ) != null && (linearLayout4 = (LinearLayout) linearLayout3.findViewById(R.id.jk4)) != null) {
                C786410Ut5.LJZL(0, linearLayout4);
            }
            C127K c127k3 = this.LLJI;
            if (c127k3 != null && (c11g4LIZ = C1215970hkR.LIZ(c127k3)) != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 161));
            }
            int i = C1220380hrY.LIZ[this.LLJJ.ordinal()];
            if (i != 1) {
                if (i == 2 && (linearLayout2 = this.LLJ) != null) {
                    C0H1U.LJII(0, linearLayout2);
                }
            } else {
                LinearLayout linearLayout5 = this.LLJ;
                if (linearLayout5 != null) {
                    C0H1U.LJIIJ(0, linearLayout5);
                }
            }
            C127K c127k4 = this.LLJI;
            if (c127k4 != null) {
                Context context = view.getContext();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -11486015;
                }
                long jLIZIZ = C1685850tyJ.LIZIZ(iIntValue);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ez, context);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = -7423006;
                }
                long jLIZIZ2 = C1685850tyJ.LIZIZ(iIntValue2);
                ComposeView composeView = new ComposeView(context, null, 6);
                ViewTreeLifecycleOwner.set(composeView, this);
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-232069389, new C1667980tVU(this, jLIZIZ, jLIZIZ2), true));
                C11G4 c11g4LIZ2 = C1215970hkR.LIZ(c127k4);
                if (c11g4LIZ2 != null) {
                    TuxTextView tuxTextView = (TuxTextView) c127k4.findViewById(R.id.y3j);
                    if (C1EDI.LJ()) {
                        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), 16);
                        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(16)), 0, 0, 0, false, 16);
                        if (tuxTextView.getResources().getConfiguration().screenWidthDp < 320) {
                            layoutParams.width = C1216270hkv.LIZIZ(100);
                        } else {
                            layoutParams.width = C1216270hkv.LIZIZ(110);
                        }
                        layoutParams.height = -1;
                        C786410Ut5.R6(tuxTextView, layoutParams);
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColorRes(R.attr.a1j);
                        tuxTextView.setGravity(8388627);
                    } else {
                        C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C1216270hkv.LIZIZ(14)), null, Integer.valueOf(C1216270hkv.LIZIZ(14)), false, 21);
                    }
                    C11G3 c11g3 = c11g4LIZ2.LIZIZ;
                    c11g4LIZ2.LJIILIIL(composeView);
                    if (C1EDI.LJ()) {
                        View view2 = (View) ((View) c11g3.getParent()).getParent();
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        layoutParams2.height = -1;
                        C426750GoL.LJIIIZ(view2, 0, 0, 0, 0, false, 16);
                        C426750GoL.LJIIL(view2, 0, 0, 0, 0, 16);
                        C786410Ut5.W5(view2, layoutParams2);
                        View view3 = (View) c11g3.getParent();
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        layoutParams3.height = -1;
                        C426750GoL.LJIIIZ(view3, 0, 0, 0, 0, false, 16);
                        C426750GoL.LJIIL(view3, 0, 0, 0, 0, 16);
                        C786410Ut5.W5(view3, layoutParams3);
                    }
                    if (C1EDI.LJ()) {
                        C426750GoL.LJIIIZ(c11g3, 0, 0, 0, 0, false, 16);
                        C19ME c19me = (C19ME) c11g3.getLayoutParams();
                        c19me.startToEnd = R.id.y3j;
                        c19me.endToEnd = 0;
                        ((ViewGroup.MarginLayoutParams) c19me).width = C1216270hkv.LIZIZ(0);
                        c19me.horizontalWeight = 1.0f;
                        ((ViewGroup.MarginLayoutParams) c19me).height = -1;
                        c127k4.setGravity(16);
                        C786410Ut5.W5(c11g3, c19me);
                        TuxIconView tuxIconView = (TuxIconView) c11g3.findViewById(R.id.k1_);
                        ViewParent parent2 = tuxIconView.getParent();
                        if ((parent2 instanceof LinearLayoutCompat) && (linearLayoutCompat = (LinearLayoutCompat) parent2) != null) {
                            ViewGroup.LayoutParams layoutParams4 = linearLayoutCompat.getLayoutParams();
                            layoutParams4.width = -2;
                            layoutParams4.height = -1;
                            linearLayoutCompat.setGravity(16);
                            C426750GoL.LJIIL(linearLayoutCompat, 0, 0, 0, 0, 16);
                            C426750GoL.LJIIIZ(linearLayoutCompat, 0, 0, 0, 0, false, 16);
                            C786410Ut5.i6(linearLayoutCompat, layoutParams4);
                            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) tuxIconView.getLayoutParams();
                            layoutParams5.width = C1216270hkv.LIZIZ(16);
                            layoutParams5.height = C1216270hkv.LIZIZ(16);
                            C426750GoL.LJIIL(tuxIconView, 0, 0, 0, 0, 16);
                            C426750GoL.LJIIIZ(tuxIconView, 0, 0, Integer.valueOf(C1216270hkv.LIZIZ(16)), 0, false, 16);
                            layoutParams5.gravity = 8388629;
                            C786410Ut5.M6(tuxIconView, layoutParams5);
                            if (C1EDI.LJ()) {
                                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) composeView.getLayoutParams();
                                layoutParams6.gravity = 8388627;
                                C426750GoL.LJIIL(composeView, Integer.valueOf(C1216270hkv.LIZIZ(10)), null, Integer.valueOf(C1216270hkv.LIZIZ(8)), null, 26);
                                C426750GoL.LJIIIZ(composeView, 0, 0, 0, 0, false, 16);
                                layoutParams6.width = C1216270hkv.LIZIZ(0);
                                layoutParams6.height = -1;
                                layoutParams6.weight = 1.0f;
                                C786410Ut5.W5(composeView, layoutParams6);
                            }
                        }
                    }
                }
            }
            C127K c127k5 = this.LLJI;
            if (c127k5 != null) {
                if (c127k5.isLaidOut() && !c127k5.isLayoutRequested()) {
                    C127K c127k6 = this.LLJI;
                    if (c127k6 != null) {
                        c127k6.setBackground(Go());
                        return;
                    }
                    return;
                }
                c127k5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1265870j2v(this, 3));
            }
        }
    }
}
