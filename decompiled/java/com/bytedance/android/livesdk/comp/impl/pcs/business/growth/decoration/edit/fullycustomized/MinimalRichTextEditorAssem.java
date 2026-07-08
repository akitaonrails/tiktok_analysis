package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized;

import X.C019F;
import X.C01DP;
import X.C01DX;
import X.C09R3;
import X.C0J2B;
import X.C0J2I;
import X.C0J2K;
import X.C0J2L;
import X.C0J2M;
import X.C0J2N;
import X.C0J2Q;
import X.C0J2Z;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C485470J2b;
import X.C485480J2c;
import X.C485490J2d;
import X.C497740JfY;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MinimalRichTextEditorAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL;
    public View LLJJIJIL;
    public final C0J2I LLJJJ;
    public C0J2B LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinimalRichTextEditorAssem.class, "editPageViewModel", "getEditPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditPageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MinimalRichTextEditorAssem.class, "fontViewModel", "getFontViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/edititem/vm/FullyCustomizedBoardEditFontViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MinimalRichTextEditorAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(MinimalRichTextEditorAssem.class, "editFragmentViewModel", "getEditFragmentViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/fullycustomized/CustomizedBoardEditFragmentViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0J2I] */
    public MinimalRichTextEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FullyCustomizedBoardEditPageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C0J2K(c19719912DlLIZ), new C0J2Z(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FullyCustomizedBoardEditFontViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C0J2L(c19719912DlLIZ2), new C485470J2b(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C0J2M(c19719912DlLIZ3), new C485480J2c(), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(CustomizedBoardEditFragmentViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C0J2N(c19719912DlLIZ4), new C485490J2d(), null, true);
        this.LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
        this.LLJJJ = new View.OnLayoutChangeListener() { // from class: X.0J2I
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                final C0J2B c0j2b = this.LL.LLJJJIL;
                if (c0j2b != null) {
                    int i9 = i4 - i2;
                    final LinearLayout linearLayout = c0j2b.LJI;
                    if (linearLayout != null && !c0j2b.LJIIIIZZ) {
                        ValueAnimator valueAnimator = c0j2b.LJIIJJI;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i10 = c0j2b.LJIIJ;
                        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i9);
                        valueAnimatorOfInt.setDuration(200L);
                        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0J2H
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                FrameLayout.LayoutParams layoutParams;
                                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                                    layoutParams.bottomMargin = iLIZIZ + iIntValue;
                                    C786410Ut5.d6(linearLayout, layoutParams);
                                    c0j2b.LJIIJ = iIntValue;
                                }
                            }
                        });
                        valueAnimatorOfInt.start();
                        c0j2b.LJIIJJI = valueAnimatorOfInt;
                    }
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.g0o;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CustomizedBoardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CustomizedBoardScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LLJJIJIL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLJJJ);
        }
        this.LLJJIJIL = null;
        C0J2B c0j2b = this.LLJJJIL;
        if (c0j2b != null) {
            c0j2b.LIZ();
        }
        this.LLJJJIL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C0J2Q(this));
        final View viewFindViewById = view.findViewById(R.id.gp_);
        this.LLJJIJIL = viewFindViewById;
        C0J2B c0j2b = new C0J2B(view.getContext());
        c0j2b.LJ = R.attr.dv3;
        c0j2b.LIZIZ = C497740JfY.LJIJI(2131851441);
        c0j2b.LIZJ = 3000L;
        this.LLJJJIL = c0j2b;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(this.LLJJJ);
            HandlerHook.viewPost(viewFindViewById, new Runnable() { // from class: X.0J2J
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MinimalRichTextEditorAssem@d0e.onViewCreated$2");
                    try {
                        C0J2B c0j2b2 = this.LL.LLJJJIL;
                        if (c0j2b2 != null) {
                            c0j2b2.LIZLLL = viewFindViewById.getHeight();
                            c0j2b2.LIZIZ((ViewGroup) view);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MinimalRichTextEditorAssem@d0e.onViewCreated$2");
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        ((FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue()).xQ2();
        ((FullyCustomizedBoardEditFontViewModel) this.LLJJIII.getValue()).wQ2();
        ((RichTextStyleEditViewModel) this.LLJJIJI.getValue()).wQ2();
        C01DX.LIZIZ("show", ((C01DP) this.LLJJIJIIJIL.getValue()).LLILZ, ((C01DP) this.LLJJIJIIJIL.getValue()).LLIZLLLIL, ((C01DP) this.LLJJIJIIJIL.getValue()).LLJ, null, false);
    }
}
