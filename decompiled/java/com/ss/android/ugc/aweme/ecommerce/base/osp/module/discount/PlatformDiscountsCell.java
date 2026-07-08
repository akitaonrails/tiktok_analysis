package com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount;

import X.AbstractC426530Gnz;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03HV;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03XA;
import X.C0H1U;
import X.C0H9H;
import X.C0OFE;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C19ME;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426160GnO;
import X.C426750GoL;
import X.C444920HcY;
import X.C452080Ho6;
import X.C452501pT;
import X.C720002rW;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import defpackage.h3;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformDiscountsCell extends ECPowerCell<C720002rW> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLJ;
    public final LinkedList<h3> LLJI;
    public View LLJIJIL;
    public Integer LLJILJIL;
    public C03HV LLJILJILJ;
    public boolean LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlatformDiscountsCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlatformDiscountsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 266);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(79);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 257), awS545S0100000_1, AFwS207S0000000_19.get$arr$(118), new AwS545S0100000_1((C03K6) this, 258), new AwS545S0100000_1((C03K6) this, 260), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 262), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1104), null, new AwS545S0100000_1((C03K6) this, 264));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 259);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 261);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 263);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 48));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1105);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1106);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1107);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1108);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1109);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 265), awS545S0100000_1, AFwS207S0000000_19.get$arr$(119), new AwS545S0100000_1((C03K6) this, 247), new AwS545S0100000_1((C03K6) this, 248), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 249), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1103), null, new AwS545S0100000_1((C03K6) this, 250));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 251), awS545S0100000_1, AFwS207S0000000_19.get$arr$(117), new AwS545S0100000_1((C03K6) this, 253), new AwS545S0100000_1((C03K6) this, 254), new AwS545S0100000_1((C03K6) this, 255), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 256));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = new LinkedList<>();
    }

    public final OrderSubmitAssemViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = T5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("platform_promotion", this.itemView);
        }
        ModuleManager moduleManager2 = T5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "platform_promotion");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    public static SpannableStringBuilder N5(View view) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(view.getContext(), R.raw.icon_info_circle);
        tuxIconDrawable.setBounds(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconDrawable.LJI(R.attr.a1k, view.getContext());
        C786410Ut5.q2(spannableStringBuilder, new ImageSpan(tuxIconDrawable, 1), 0, 1, 18);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule r23) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell.R5(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule):void");
    }

    public final void U5(boolean z) {
        int i;
        int i2;
        View view = this.itemView;
        View viewFindViewById = view.findViewById(R.id.prh);
        int i3 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.pri);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.prj);
        if (!z) {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, viewFindViewById3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0bdf  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v83, types: [android.util.AttributeSet, java.lang.Integer, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v93 */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r28) {
        /*
            Method dump skipped, instruction units count: 3072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.ap1, viewGroup, false);
    }

    public final void P5(C426160GnO c426160GnO, Integer num) {
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me2;
        ViewGroup.LayoutParams layoutParams2 = c426160GnO.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.order_submit_discount_title);
            if (tuxTextView != null) {
                layoutParams = tuxTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me2 = (C19ME) layoutParams;
            } else {
                c19me2 = null;
            }
            if (num != null && num.intValue() == 1) {
                ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                c19me.matchConstraintDefaultWidth = 1;
                c19me.constrainedWidth = true;
                c19me.matchConstraintMaxWidth = 0;
                c19me.matchConstraintMinWidth = 0;
                C786410Ut5.a7(c426160GnO, c19me);
                if (c19me2 != null) {
                    ((ViewGroup.MarginLayoutParams) c19me2).width = 0;
                    c19me2.matchConstraintDefaultWidth = 1;
                    c19me2.constrainedWidth = true;
                    c19me2.matchConstraintMaxWidth = 0;
                    c19me2.matchConstraintMinWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    C786410Ut5.R6(tuxTextView, c19me2);
                }
                if (tuxTextView != null) {
                    tuxTextView.setMinWidth(0);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    return;
                }
                return;
            }
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.matchConstraintDefaultWidth = 0;
            c19me.constrainedWidth = false;
            c19me.matchConstraintMaxWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));
            c19me.matchConstraintMinWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(95));
            C786410Ut5.a7(c426160GnO, c19me);
            if (c19me2 != null) {
                ((ViewGroup.MarginLayoutParams) c19me2).width = 0;
                c19me2.matchConstraintDefaultWidth = 1;
                c19me2.constrainedWidth = false;
                c19me2.matchConstraintMaxWidth = 0;
                c19me2.matchConstraintMinWidth = 0;
                C786410Ut5.R6(tuxTextView, c19me2);
            }
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setMinWidth(0);
            tuxTextView.setMaxLines(Integer.MAX_VALUE);
            tuxTextView.setEllipsize(null);
        }
    }

    public final void W5(boolean z, boolean z2) {
        int[] iArr;
        char c;
        int i;
        int iIntValue;
        int i2;
        char c2;
        int iIntValue2;
        View viewFindViewById = this.itemView.findViewById(R.id.ps9);
        View viewFindViewById2 = this.itemView.findViewById(R.id.ps8);
        View viewFindViewById3 = this.itemView.findViewById(R.id.f781psf);
        View viewFindViewById4 = this.itemView.findViewById(R.id.ps6);
        View viewFindViewById5 = this.itemView.findViewById(R.id.prg);
        View viewFindViewById6 = this.itemView.findViewById(R.id.prs);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        if (C960203pA.LIZIZ(this.itemView.getContext())) {
            iArr = new int[]{-14609402, -13820917};
        } else {
            iArr = new int[]{-2327, -1808, -1036, -135208};
        }
        if (T5().uS2() && viewFindViewById4 != null) {
            c = 4;
            C426750GoL.LJIIIZ(viewFindViewById4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 26);
        } else {
            c = 4;
        }
        if (z) {
            View view = this.LLJIJIL;
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(iArr);
                gradientDrawable.setOrientation(orientation);
                if (T5().uS2()) {
                    float fLIZIZ = C418440Gaw.LIZIZ(10);
                    float[] fArr = new float[8];
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[c] = fLIZIZ;
                    fArr[5] = fLIZIZ;
                    fArr[6] = fLIZIZ;
                    fArr[7] = fLIZIZ;
                    gradientDrawable.setCornerRadii(fArr);
                }
                view.setBackground(gradientDrawable);
            }
            if (viewFindViewById4 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(12));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fv, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                gradientDrawable2.setStroke(iLIZIZ, iIntValue2);
                viewFindViewById4.setBackground(gradientDrawable2);
                C0H9H.LJI(0, viewFindViewById4);
            }
            if (viewFindViewById2 != null) {
                C0H1U.LIZIZ(viewFindViewById2);
            }
            if (viewFindViewById != null) {
                C0H1U.LIZIZ(viewFindViewById);
            }
            if (viewFindViewById3 != null) {
                C0H1U.LIZIZ(viewFindViewById3);
            }
            if (viewFindViewById6 != null) {
                i2 = 8;
                c2 = 0;
                C426750GoL.LJIIL(viewFindViewById6, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 29);
            } else {
                i2 = 8;
                c2 = 0;
            }
            if (viewFindViewById5 != null) {
                C426750GoL.LJIIL(viewFindViewById5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 21);
                GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, iArr);
                if (T5().uS2()) {
                    float fLIZIZ2 = C418440Gaw.LIZIZ(10);
                    float[] fArr2 = new float[i2];
                    fArr2[c2] = fLIZIZ2;
                    fArr2[1] = fLIZIZ2;
                    fArr2[2] = fLIZIZ2;
                    fArr2[3] = fLIZIZ2;
                    fArr2[c] = 0.0f;
                    fArr2[5] = 0.0f;
                    fArr2[6] = 0.0f;
                    fArr2[7] = 0.0f;
                    gradientDrawable3.setCornerRadii(fArr2);
                }
                viewFindViewById5.setBackground(gradientDrawable3);
                return;
            }
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setBackground(null);
        }
        if (viewFindViewById4 != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(12));
            gradientDrawable4.setColors(iArr);
            gradientDrawable4.setOrientation(orientation);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.fv, this.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            gradientDrawable4.setStroke(iLIZIZ2, iIntValue);
            viewFindViewById4.setBackground(gradientDrawable4);
        }
        if (z2) {
            if (viewFindViewById2 != null) {
                C0H1U.LIZIZ(viewFindViewById2);
            }
            if (viewFindViewById != null) {
                C0H1U.LIZIZ(viewFindViewById);
            }
            if (viewFindViewById3 != null) {
                C0H1U.LIZIZ(viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                C0H9H.LJI(0, viewFindViewById4);
            }
        } else {
            if (viewFindViewById2 != null) {
                C12ES.LJIILL(0, viewFindViewById2);
            }
            if (viewFindViewById != null) {
                C12ES.LJIILL(0, viewFindViewById);
            }
            if (viewFindViewById3 != null) {
                C12ES.LJIILL(0, viewFindViewById3);
            }
            if (viewFindViewById4 != null) {
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewFindViewById4);
            }
        }
        if (viewFindViewById6 != null) {
            i = 0;
            C426750GoL.LJIIL(viewFindViewById6, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, 29);
        } else {
            i = 0;
        }
        if (viewFindViewById5 == null) {
            return;
        }
        C426750GoL.LJIIL(viewFindViewById5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 21);
        viewFindViewById5.setBackground(null);
    }

    public static void V5(TuxIconView tuxIconView, int i, int i2) {
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                layoutParams.width = i2;
            }
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.setIconRes(R.raw.icon_coupon_deducted);
            tuxIconView.setTintColorRes(R.attr.a1q);
        }
    }

    public static Pair S5(TuxTextView tuxTextView, int i, SpannableStringBuilder spannableStringBuilder, String str) {
        TextPaint paint = tuxTextView.getPaint();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("... ");
        sbLIZ.append(str);
        float fMeasureText = paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
        int i2 = i - 1;
        int lineEnd = tuxTextView.getLayout().getLineEnd(i2);
        float lineWidth = tuxTextView.getLayout().getLineWidth(i2);
        if (lineEnd > spannableStringBuilder.length()) {
            C03O0 c03o0 = C03O0.LIZ;
            String string = spannableStringBuilder.toString();
            c03o0.getClass();
            HashMap map = new HashMap();
            C0OFE.LIZ("desc_text", string);
            C0OFE.LIZ("tc_text", str);
            C0OFE.LIZ("error_msg", "get line end index wrong");
            C03O0.LLF("rd_tiktokec_promotion_module_calculate_string_error", map);
            return new Pair(spannableStringBuilder, Boolean.FALSE);
        }
        float width = lineWidth - (tuxTextView.getWidth() - fMeasureText);
        int i3 = 1;
        while (true) {
            if (i3 < lineEnd) {
                try {
                    if (tuxTextView.getPaint().measureText(spannableStringBuilder.subSequence(lineEnd - i3, lineEnd).toString()) > width) {
                        break;
                    }
                    i3++;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C03O0 c03o02 = C03O0.LIZ;
                    String string2 = spannableStringBuilder.toString();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c03o02.getClass();
                    HashMap map2 = new HashMap();
                    C0OFE.LIZ("desc_text", string2);
                    C0OFE.LIZ("tc_text", str);
                    C0OFE.LIZ("error_msg", message);
                    C03O0.LLF("rd_tiktokec_promotion_module_calculate_string_error", map2);
                    return new Pair(spannableStringBuilder, Boolean.FALSE);
                }
            } else {
                i3 = 0;
                break;
            }
        }
        int i4 = (lineEnd - i3) - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        return new Pair(new SpannableStringBuilder(spannableStringBuilder.subSequence(0, i4)), Boolean.TRUE);
    }

    public final void L5(final Context context, SpannableStringBuilder spannableStringBuilder, boolean z, String str, final String str2) {
        int length;
        int length2;
        Integer numLIZJ;
        if (z) {
            spannableStringBuilder.append("...");
            length = spannableStringBuilder.length();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(str);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            length2 = spannableStringBuilder.length();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(str);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
            length = spannableStringBuilder.length() - str.length();
            length2 = spannableStringBuilder.length();
        }
        C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0396
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String str3;
                HashMap<String, Object> mapLJIIJ = null;
                String strLJ = this.LL.T5().LLLZLZ.LJ("c1196.d19683", str2, null);
                if (strLJ != null && !a0.LJJJIL(strLJ)) {
                    C919503ib.LIZIZ(context, strLJ, C2097608Jq.LJ(), false).open();
                }
                C720002rW c720002rW = (C720002rW) this.LL.getItem();
                if (c720002rW != null && (str3 = c720002rW.LLJJIJIIJIL) != null) {
                    mapLJIIJ = C1741890vQh.LJIIJ(str3);
                }
                C1748720vbi.LIZLLL(view, new C10516049i(), new AwS367S0200000_1(this.LL, mapLJIIJ, 364));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1n, context);
                if (numLIZJ2 != null) {
                    textPaint.setColor(numLIZJ2.intValue());
                }
            }
        }, length, length2, 18);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(81, false), length, length2, 18);
        if (z && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length - 3, length, 18);
        }
    }
}
