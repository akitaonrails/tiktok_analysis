package com.ss.android.ugc.aweme.im.chatroom.input.components.record;

import X.AbstractC423760GjW;
import X.C019F;
import X.C0EJT;
import X.C0HVA;
import X.C1383370m6R;
import X.C13LE;
import X.C1602160rnK;
import X.C1619980sG4;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19M4;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C423680GjO;
import X.C432390GxR;
import X.C432410GxT;
import X.C432510Gxd;
import X.C432670Gxt;
import X.C432730Gxz;
import X.C432750Gy1;
import X.C432780Gy4;
import X.C432820Gy8;
import X.C432840GyA;
import X.C432870GyD;
import X.C432890GyF;
import X.C459000HzG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class RecordFieldAssem extends UISlotAssem implements C0HVA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public View LLJJI;
    public C19M4 LLJJIII;
    public ViewFlipper LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public AbstractC423760GjW LLJJJ;
    public C0EJT LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public ViewSwitcher LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C423680GjO LLJL;
    public View LLJLIL;
    public ValueAnimator LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public final AssemVMLazy LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecordFieldAssem.class, "panelSizeVM", "getPanelSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecordFieldAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 140), AFwS236S0000000_6.get$arr$(89), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ck3;
    }

    public final void hp() {
        ValueAnimator valueAnimatorOfFloat = this.LLJLILLLLZIIL;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.5f);
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 27));
            this.LLJLILLLLZIIL = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimatorOfFloat2 = this.LLJLL;
        if (valueAnimatorOfFloat2 == null) {
            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.7f);
            valueAnimatorOfFloat2.setDuration(1000L);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setRepeatMode(2);
            valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(this, 28));
            this.LLJLL = valueAnimatorOfFloat2;
        }
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.LLJLILLLLZIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        AbstractC423760GjW abstractC423760GjW = this.LLJJJ;
        if (abstractC423760GjW != null) {
            abstractC423760GjW.LIZJ();
        }
        super.onDestroy();
    }

    @Override // X.C0HVA
    public final String Bc() {
        return C432670Gxt.LIZ(this);
    }

    public final String ip(int i) {
        String strValueOf = String.valueOf(i / 60);
        String strLJJJJJL = a0.LJJJJJL('0', 2, String.valueOf(i % 60));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(':');
        sbLIZ.append(strLJJJJJL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String kp(int i) {
        Resources resources;
        String quantityString;
        Context context;
        Resources resources2;
        String quantityString2;
        int i2 = i / 60;
        int i3 = i % 60;
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (quantityString = resources.getQuantityString(2131755067, i2)) != null && (context = getContext()) != null && (resources2 = context.getResources()) != null && (quantityString2 = resources2.getQuantityString(2131755068, i3)) != null) {
            if (i2 > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append(' ');
                sbLIZ.append(quantityString);
                sbLIZ.append(' ');
                sbLIZ.append(i3);
                sbLIZ.append(' ');
                sbLIZ.append(quantityString2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i3);
            sbLIZ2.append(' ');
            sbLIZ2.append(quantityString2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewFlipper viewFlipper;
        super.onViewCreated(view);
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, view);
        }
        if (view instanceof ViewFlipper) {
            viewFlipper = (ViewFlipper) view;
        } else {
            viewFlipper = null;
        }
        this.LLJJIJI = viewFlipper;
        this.LLJLIL = view.findViewById(R.id.uaj);
        this.LLJJIII = (C19M4) view.findViewById(R.id.wsi);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.k8k);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.k8i);
        this.LLJJJ = (AbstractC423760GjW) view.findViewById(R.id.k8h);
        this.LLJJJIL = (C0EJT) view.findViewById(R.id.k8j);
        this.LLJJJJ = view.findViewById(R.id.k8g);
        this.LLJJJJJIL = view.findViewById(R.id.k8f);
        this.LLJJJJLIIL = view.findViewById(R.id.k8q);
        this.LLJJL = (ViewSwitcher) view.findViewById(R.id.k8p);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.k8r);
        this.LLJL = (C423680GjO) view.findViewById(R.id.k8s);
        this.LLJJI = view.findViewById(R.id.k8m);
        C19M4 c19m4 = this.LLJJIII;
        if (c19m4 != null) {
            c19m4.setText(view.getContext().getString(2131832290));
        }
        C423680GjO c423680GjO = this.LLJL;
        if (c423680GjO != null) {
            int iLJFF = C1383370m6R.LJFF(R.attr.a1h);
            int iLJI = C2441009hQ.LJI(0.7f, C1383370m6R.LJFF(R.attr.a1h), C1383370m6R.LJFF(R.attr.zo));
            c423680GjO.LLILLJJLI.setColor(iLJFF);
            c423680GjO.LLILLL.setColor(iLJI);
            c423680GjO.invalidate();
        }
        C423680GjO c423680GjO2 = this.LLJL;
        if (c423680GjO2 != null) {
            ViewGroup.LayoutParams layoutParams = c423680GjO2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5(c423680GjO2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        AbstractC423760GjW abstractC423760GjW = this.LLJJJ;
        if (abstractC423760GjW != null) {
            ViewGroup.LayoutParams layoutParams2 = abstractC423760GjW.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5(abstractC423760GjW, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C0EJT c0ejt = this.LLJJJIL;
        if (c0ejt != null) {
            int visibility = c0ejt.getVisibility();
            c0ejt.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0ejt);
        }
        AbstractC423760GjW abstractC423760GjW2 = this.LLJJJ;
        if (abstractC423760GjW2 != null) {
            int visibility2 = abstractC423760GjW2.getVisibility();
            abstractC423760GjW2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, abstractC423760GjW2);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                C786410Ut5.W5(view2, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        View viewFindViewById = view.findViewById(R.id.k8l);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View view3 = this.LLJJI;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
            if (layoutParams4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                C786410Ut5.W5(view3, marginLayoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dtl);
        if (tuxIconView != null) {
            tuxIconView.setLabel("");
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        int iLJFF2 = C1383370m6R.LJFF(R.attr.a1h);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.k8o);
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColor(iLJFF2);
        }
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.k8n);
        if (tuxIconView3 != null) {
            tuxIconView3.setTintColor(iLJFF2);
        }
        TuxTextView tuxTextView = this.LLJJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.a1h);
        }
        ViewSwitcher viewSwitcher = this.LLJJL;
        if (viewSwitcher != null) {
            ViewGroup.LayoutParams layoutParams5 = viewSwitcher.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                C786410Ut5.W5(viewSwitcher, layoutParams5);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432510Gxd(this, view, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432730Gxz(this, view, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432410GxT(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432390GxR(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432750Gy1(this, null), 3);
        View view4 = this.LLJJJJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432780Gy4(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432820Gy8(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432840GyA(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432870GyD(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C432890GyF(this, view, null), 3);
        View view5 = this.LLJJI;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 29), view5);
        }
    }
}
