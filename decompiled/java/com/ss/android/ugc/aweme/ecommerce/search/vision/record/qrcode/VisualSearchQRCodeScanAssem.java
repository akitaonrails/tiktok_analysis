package com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode;

import X.C098200Yq;
import X.C09N5;
import X.C0HXD;
import X.C0HXE;
import X.C13LQ;
import X.C13LZ;
import X.C144800gw;
import X.C144900gx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559040qfm;
import X.C1619980sG4;
import X.C189200o6;
import X.C1954807lC;
import X.C19ME;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C370280EfS;
import X.C418440Gaw;
import X.C420710Geb;
import X.C423430Giz;
import X.C448530HiN;
import X.C448540HiO;
import X.C448550HiP;
import X.C448570HiR;
import X.C448610HiV;
import X.C448640HiY;
import X.C448660Hia;
import X.C448680Hic;
import X.C448700Hie;
import X.C448710Hif;
import X.C687700QyG;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC448620HiW;
import X.EnumC448630HiX;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC448730Hih;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ALAdapterS0S0510000_5;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS1S1201000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import lro.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class VisualSearchQRCodeScanAssem extends UIContentAssem implements IEcQRCodeScanAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLFZ = 0;
    public Rect LLJIJIL;
    public LinearLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C420710Geb LLJILLL;
    public FrameLayout LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public View LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public FrameLayout LLJJJ;
    public C370280EfS LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public boolean LLJJJJJIL;
    public Animator LLJJJJLIIL;
    public Animator LLJJL;
    public C0HXD LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public ARunnableS106S0100000_6 LLJZ;
    public b LLJZIJLIL;
    public C448700Hie LLL;
    public boolean LLLFF;
    public final C448530HiN LLLFFI;
    public final VisualSearchQRCodeScanAssem LLIZLLLIL = this;
    public C448610HiV LLJ = new C448610HiV(C144900gx.LIZ(), false);
    public C423430Giz LLJI = new C423430Giz(0);
    public C0HXD LLJLLL = C0HXD.TAKE_PHOTO;
    public final long LLLF = System.currentTimeMillis();

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{EcTakePhotoScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EcTakePhotoScope.class);
        return arrayList;
    }

    public static FrameLayout.LayoutParams Lo() {
        return new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(271)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(271)), 17);
    }

    public static GradientDrawable No() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        gradientDrawable.setColor(1711276032);
        return gradientDrawable;
    }

    public final ConstraintLayout Ho() {
        ConstraintLayout constraintLayout = this.LLJJJJ;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LJJIJL().findViewById(R.id.qd8);
        if (constraintLayout2 == null) {
            return null;
        }
        this.LLJJJJ = constraintLayout2;
        return constraintLayout2;
    }

    public final TuxTextView Oo() {
        ViewGroup viewGroup;
        ConstraintLayout constraintLayoutHo;
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        View viewLJJIJL = LJJIJL();
        AttributeSet attributeSet = null;
        if (!(viewLJJIJL instanceof ConstraintLayout) || (viewGroup = (ViewGroup) viewLJJIJL) == null || (constraintLayoutHo = Ho()) == null) {
            return null;
        }
        TuxTextView tuxTextView2 = (TuxTextView) viewGroup.findViewWithTag("visual_search_qrcode_scan_mode_guide");
        if (tuxTextView2 != null) {
            this.LLJJIII = tuxTextView2;
            return tuxTextView2;
        }
        TuxTextView tuxTextView3 = new TuxTextView(LJJIJL().getContext(), attributeSet, 6, 0);
        tuxTextView3.setTag("visual_search_qrcode_scan_mode_guide");
        C786410Ut5.LLLLZLL(tuxTextView3, 0);
        tuxTextView3.setGravity(17);
        tuxTextView3.setTextAlignment(4);
        C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)));
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.bottomToTop = constraintLayoutHo.getId();
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29));
        C786410Ut5.R6(tuxTextView3, c19me);
        tuxTextView3.setTuxFont(62);
        tuxTextView3.setTextColorRes(R.attr.ee);
        tuxTextView3.setShadowLayer(C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(1), 520093696);
        viewGroup.addView(tuxTextView3);
        this.LLJJIII = tuxTextView3;
        return tuxTextView3;
    }

    public final LinearLayout Vo() {
        ViewGroup viewGroup;
        ConstraintLayout constraintLayoutHo;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout linearLayout = this.LLJJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ConstraintLayout) || (viewGroup = (ViewGroup) viewLJJIJL) == null || (constraintLayoutHo = Ho()) == null) {
            return null;
        }
        LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewWithTag("visual_search_qrcode_scan_mode_back");
        if (linearLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = -2;
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                C786410Ut5.d6(linearLayout2, marginLayoutParams);
            }
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
            linearLayout2.setBackground(No());
            Go(linearLayout2);
            this.LLJJI = linearLayout2;
            return linearLayout2;
        }
        LinearLayout linearLayout3 = new LinearLayout(LJJIJL().getContext());
        linearLayout3.setId(View.generateViewId());
        linearLayout3.setTag("visual_search_qrcode_scan_mode_back");
        C786410Ut5.LJZL(8, linearLayout3);
        C786410Ut5.W4(linearLayout3, 0.0f);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        C19ME c19me = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.topToTop = constraintLayoutHo.getId();
        c19me.bottomToBottom = constraintLayoutHo.getId();
        C786410Ut5.d6(linearLayout3, c19me);
        linearLayout3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        linearLayout3.setBackground(No());
        Go(linearLayout3);
        viewGroup.addView(linearLayout3);
        this.LLJJI = linearLayout3;
        return linearLayout3;
    }

    public final FrameLayout Zo() {
        ViewGroup viewGroup;
        FrameLayout frameLayout = this.LLJJ;
        if (frameLayout != null) {
            return frameLayout;
        }
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ConstraintLayout) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
            return null;
        }
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewWithTag("visual_search_qrcode_scan_mode_container");
        if (frameLayout2 != null) {
            this.LLJJ = frameLayout2;
            Ep(frameLayout2);
            return frameLayout2;
        }
        FrameLayout frameLayout3 = new FrameLayout(LJJIJL().getContext());
        frameLayout3.setTag("visual_search_qrcode_scan_mode_container");
        C786410Ut5.LJZ(8, frameLayout3);
        C19ME c19me = new C19ME(-1, 0);
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = this.LLJJIJIL;
        C786410Ut5.a6(frameLayout3, c19me);
        viewGroup.addView(frameLayout3);
        this.LLJJ = frameLayout3;
        return frameLayout3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final void ac2() {
        if (this.LLJLLL != C0HXD.QR_SCAN) {
            return;
        }
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS106S0100000_6(this, 51), 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip() {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem.ip():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final void lA1() {
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = this.LLJZ;
        if (aRunnableS106S0100000_6 != null) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS106S0100000_6);
        }
        this.LLJZ = null;
        this.LLJI = new C423430Giz(0);
        this.LLJIJIL = null;
        C420710Geb c420710Geb = this.LLJILLL;
        if (c420710Geb != null) {
            c420710Geb.LIZ();
        }
        C448700Hie c448700Hie = this.LLL;
        b bVar = this.LLJZIJLIL;
        if (c448700Hie != null && bVar != null) {
            bVar.LIZIZ(c448700Hie);
        }
        this.LLL = null;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLL = null;
    }

    public final boolean tp() {
        if (this.LLJLLIL) {
            return C144900gx.LIZ() || C144800gw.LIZ();
        }
        return false;
    }

    public final void zp() {
        if (this.LLJLLL != C0HXD.TAKE_PHOTO) {
            return;
        }
        if (!so() || !this.LLILZ) {
            if (this.LLJLLIL) {
                return;
            }
            lA1();
        } else if (this.LLJLLIL && C144800gw.LIZ()) {
            up(true);
        } else {
            lA1();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0HiN] */
    public VisualSearchQRCodeScanAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C1559040qfm.class, null);
        this.LLLFFI = new InterfaceC448730Hih() { // from class: X.0HiN
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
            @Override // X.InterfaceC448730Hih
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.List<com.ss.android.vesdk.algorithm.s> r11) {
                /*
                    Method dump skipped, instruction units count: 421
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C448530HiN.LIZ(java.util.List):void");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final void CF1() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS106S0100000_6(this, 53));
            return;
        }
        if (!this.LLJLLIL) {
            lA1();
            return;
        }
        int i = C0HXE.LIZ[this.LLJLLL.ordinal()];
        if (i == 1) {
            up(false);
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            zp();
        }
    }

    public final void So() {
        C370280EfS c370280EfS;
        FrameLayout frameLayoutZo = Zo();
        if (frameLayoutZo == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJJ;
        if (frameLayout == null) {
            frameLayout = (FrameLayout) frameLayoutZo.findViewWithTag("visual_search_qrcode_scan_frame");
            if (frameLayout != null) {
                this.LLJJJ = frameLayout;
            } else {
                frameLayout = new FrameLayout(LJJIJL().getContext());
                frameLayout.setTag("visual_search_qrcode_scan_frame");
                C786410Ut5.LJZ(8, frameLayout);
                C786410Ut5.U4(frameLayout, 0.0f);
                C786410Ut5.a6(frameLayout, Lo());
                frameLayoutZo.addView(frameLayout);
                this.LLJJJ = frameLayout;
            }
        }
        if (!(frameLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            C786410Ut5.a6(frameLayout, Lo());
        }
        View childAt = frameLayout.getChildAt(0);
        if ((childAt instanceof C370280EfS) && (c370280EfS = (C370280EfS) childAt) != null) {
            this.LLJJJIL = c370280EfS;
            return;
        }
        this.LLJJJIL = new C370280EfS(LJJIJL().getContext());
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(this.LLJJJIL);
    }

    public final PhotoSearchEnterParams j80() {
        IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558360qeg.LJ(LJJIJL(), null), IEcPreviewViewAbility.class, null);
        if (iEcPreviewViewAbility != null) {
            return iEcPreviewViewAbility.j80();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        lA1();
        b bVar = this.LLJZIJLIL;
        if (bVar != null) {
            bVar.LIZJ(null);
        }
        Animator animator = this.LLJJJJLIIL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJJJLIIL = null;
        C420710Geb c420710Geb = this.LLJILLL;
        if (c420710Geb != null) {
            c420710Geb.LIZ();
        }
        Animator animator2 = this.LLJJL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLJJL = null;
        C370280EfS c370280EfS = this.LLJJJIL;
        if (c370280EfS != null) {
            c370280EfS.LIZ();
        }
        this.LLJZ = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJZIJLIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJILLL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = false;
        super.onDestroy();
    }

    public static C19ME Jo(int i) {
        C19ME c19me = new C19ME(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)));
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = i;
        return c19me;
    }

    public static String ep(String str) {
        try {
            return C13LQ.LJJIJIL(MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8)), "", AFwS247S0000000_13.get$arr$(21));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return String.valueOf(str.hashCode());
        }
    }

    public final void Ap(View view) {
        C19ME c19me;
        int iLIZIZ = this.LLJJIJIIJIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        if (iLIZIZ < 0) {
            iLIZIZ = 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null && ((ViewGroup.MarginLayoutParams) c19me).width == -1 && ((ViewGroup.MarginLayoutParams) c19me).height == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)) && c19me.startToStart == 0 && c19me.endToEnd == 0 && c19me.bottomToBottom == 0 && ((ViewGroup.MarginLayoutParams) c19me).bottomMargin == iLIZIZ) {
            return;
        }
        C786410Ut5.W5(view, Jo(iLIZIZ));
        view.requestLayout();
    }

    public final void Bp(C0HXD c0hxd) {
        this.LLJLLL = c0hxd;
        int i = C0HXE.LIZ[c0hxd.ordinal()];
        if (i != 1) {
            if (i == 2) {
                zp();
                mp(c0hxd);
                lp(c0hxd);
                kp(c0hxd);
                return;
            }
            throw new C1954807lC();
        }
        this.LLJIJIL = null;
        this.LLJI = new C423430Giz(0);
        kp(this.LLJLLL);
        up(false);
        mp(c0hxd);
        lp(c0hxd);
        kp(c0hxd);
    }

    public final void Ep(FrameLayout frameLayout) {
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (c19me != null && ((ViewGroup.MarginLayoutParams) c19me).width == -1 && ((ViewGroup.MarginLayoutParams) c19me).height == 0 && c19me.startToStart == 0 && c19me.endToEnd == 0 && c19me.topToTop == 0 && c19me.bottomToBottom == 0 && ((ViewGroup.MarginLayoutParams) c19me).bottomMargin == this.LLJJIJIL) {
            return;
        }
        if (c19me == null) {
            c19me = new C19ME(-1, 0);
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = this.LLJJIJIL;
        }
        ((ViewGroup.MarginLayoutParams) c19me).width = -1;
        ((ViewGroup.MarginLayoutParams) c19me).height = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.topToTop = 0;
        c19me.bottomToTop = -1;
        c19me.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = this.LLJJIJIL;
        C786410Ut5.a6(frameLayout, c19me);
        frameLayout.requestLayout();
    }

    public final void Go(LinearLayout linearLayout) {
        C786410Ut5.LJJJJJL(linearLayout);
        TuxIconView tuxIconView = new TuxIconView(LJJIJL().getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.M6(tuxIconView, layoutParams);
        tuxIconView.setImportantForAccessibility(2);
        tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setTintColorRes(R.attr.ee);
        linearLayout.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setText(tuxTextView.getContext().getString(2131847126));
        linearLayout.addView(tuxTextView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final void VR0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLJJIJIIJIL = i;
        this.LLJJIJIL = i;
        View view = this.LLJJIJI;
        if (view != null) {
            Ap(view);
        }
        FrameLayout frameLayout = this.LLJJ;
        if (frameLayout != null) {
            Ep(frameLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final void W51(boolean z) {
        int i;
        this.LLJLLIL = z;
        C448610HiV c448610HiV = this.LLJ;
        boolean zLIZ = C144900gx.LIZ();
        c448610HiV.getClass();
        this.LLJ = new C448610HiV(zLIZ, z);
        if (so() && this.LLILZ) {
            if (!z && this.LLJLLL == C0HXD.QR_SCAN) {
                Bp(C0HXD.TAKE_PHOTO);
                return;
            }
            zp();
            C0HXD c0hxd = this.LLJLLL;
            mp(c0hxd);
            lp(c0hxd);
            kp(c0hxd);
            return;
        }
        if (!z && this.LLJLLL == C0HXD.QR_SCAN) {
            this.LLJLLL = C0HXD.TAKE_PHOTO;
        }
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null) {
            if (tp()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        zp();
    }

    public final Rect ap(VEBachQRCodeResult vEBachQRCodeResult) {
        float[][] location = vEBachQRCodeResult.getLocation();
        if (location == null || location.length == 0) {
            return null;
        }
        int width = LJJIJL().getWidth();
        int height = LJJIJL().getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax = Float.MIN_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (float[] fArr : location) {
            if (fArr.length >= 2) {
                fMin = Math.min(fMin, C13LZ.LIZLLL(fArr[0], 0.0f, 1.0f));
                fMin2 = Math.min(fMin2, C13LZ.LIZLLL(fArr[1], 0.0f, 1.0f));
                fMax = Math.max(fMax, C13LZ.LIZLLL(fArr[0], 0.0f, 1.0f));
                fMax2 = Math.max(fMax2, C13LZ.LIZLLL(fArr[1], 0.0f, 1.0f));
            }
        }
        if (fMin != Float.MAX_VALUE && fMin2 != Float.MAX_VALUE && fMax != Float.MIN_VALUE && fMax2 != Float.MIN_VALUE) {
            float f = width;
            float f2 = height;
            return new Rect((int) (fMin * f), (int) (fMin2 * f2), (int) (fMax * f), (int) (fMax2 * f2));
        }
        return null;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{EcTakePhotoScope.class}).unbindAbility(this.LLIZLLLIL, IEcQRCodeScanAbility.class);
    }

    public final Rect bp(View view) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        LJJIJL().getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(X.C0HXD r4) {
        /*
            r3 = this;
            X.0HXD r0 = X.C0HXD.TAKE_PHOTO
            r2 = 0
            if (r4 != r0) goto L2d
            X.0Giz r1 = r3.LLJI
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L2d
            X.0HiR r0 = r1.LIZIZ
            if (r0 == 0) goto L2d
            r1 = 1
        L10:
            android.widget.FrameLayout r0 = r3.LLJILJILJ
            if (r0 == 0) goto L17
            r0.setClickable(r2)
        L17:
            if (r1 != 0) goto L29
            Y.ARunnableS106S0100000_6 r1 = r3.LLJZ
            if (r1 == 0) goto L24
            android.view.View r0 = r3.LJJIJL()
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r0, r1)
        L24:
            r0 = 0
            r3.LLJZ = r0
            r3.LLJIJIL = r0
        L29:
            r3.ip()
            return
        L2d:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem.kp(X.0HXD):void");
    }

    public final void lp(C0HXD c0hxd) {
        boolean z;
        boolean z2;
        boolean z3;
        FrameLayout frameLayout;
        FrameLayout frameLayoutZo;
        LinearLayout linearLayoutVo;
        float f;
        float f2;
        boolean z4;
        boolean z5 = false;
        if (this.LLJ.LIZ && c0hxd == C0HXD.TAKE_PHOTO) {
            z = true;
        } else {
            z = false;
        }
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinearLayout linearLayout2 = this.LLJILJIL;
        if (linearLayout2 != null) {
            if (z && this.LLJ.LIZIZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            linearLayout2.setClickable(z4);
        }
        if (z) {
            LinearLayout linearLayout3 = this.LLJILJIL;
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(0, linearLayout3);
            }
            LinearLayout linearLayout4 = this.LLJILJIL;
            if (linearLayout4 != null) {
                if (this.LLJ.LIZIZ) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.34f;
                }
                C786410Ut5.W4(linearLayout4, f2);
            }
            if (!z2) {
                boolean z6 = this.LLJ.LIZIZ;
                LinearLayout linearLayout5 = this.LLJILJIL;
                if (linearLayout5 != null) {
                    Animator animator = this.LLJJJJLIIL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    this.LLJJJJLIIL = null;
                    C786410Ut5.W4(linearLayout5, 0.0f);
                    C786410Ut5.Rb(linearLayout5, 0.9f);
                    C786410Ut5.sc(linearLayout5, 0.9f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[3];
                    Property property = View.ALPHA;
                    float[] fArr = new float[2];
                    fArr[0] = 0.0f;
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.34f;
                    }
                    fArr[1] = f;
                    animatorArr[0] = ObjectAnimator.ofFloat(linearLayout5, (Property<LinearLayout, Float>) property, fArr);
                    animatorArr[1] = ObjectAnimator.ofFloat(linearLayout5, (Property<LinearLayout, Float>) View.SCALE_X, 0.9f, 1.0f);
                    animatorArr[2] = ObjectAnimator.ofFloat(linearLayout5, (Property<LinearLayout, Float>) View.SCALE_Y, 0.9f, 1.0f);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.setDuration(200L);
                    animatorSet.setInterpolator(C1619980sG4.LIZLLL());
                    this.LLJJJJLIIL = animatorSet;
                    animatorSet.start();
                }
                if (Intrinsics.LJFF("show", "show")) {
                    if (!this.LLLFF) {
                        this.LLLFF = true;
                        op("search_visual_qr_code_icon", "show", String.valueOf(this.LLLF));
                    }
                } else {
                    op("search_visual_qr_code_icon", "show", String.valueOf(this.LLLF));
                }
            }
        } else {
            Animator animator2 = this.LLJJJJLIIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.LLJJJJLIIL = null;
            LinearLayout linearLayout6 = this.LLJILJIL;
            if (linearLayout6 != null) {
                C786410Ut5.LJZL(8, linearLayout6);
            }
        }
        if (this.LLJJLIIIJLLLLLLLZ == c0hxd) {
            LinearLayout linearLayout7 = this.LLJJI;
            if (linearLayout7 != null) {
                if (c0hxd == C0HXD.QR_SCAN) {
                    z5 = true;
                }
                linearLayout7.setClickable(z5);
                return;
            }
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = c0hxd;
        if (c0hxd == C0HXD.QR_SCAN) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            ConstraintLayout constraintLayoutHo = Ho();
            if (constraintLayoutHo != null && (frameLayoutZo = Zo()) != null && (linearLayoutVo = Vo()) != null) {
                Oo();
                So();
                FrameLayout frameLayout2 = this.LLJJJ;
                if (frameLayout2 != null) {
                    Animator animator3 = this.LLJJL;
                    if (animator3 != null) {
                        animator3.cancel();
                    }
                    this.LLJJL = null;
                    C370280EfS c370280EfS = this.LLJJJIL;
                    if (c370280EfS != null) {
                        c370280EfS.LIZ();
                    }
                    C786410Ut5.LJZ(0, frameLayoutZo);
                    C786410Ut5.LJZL(0, linearLayoutVo);
                    C786410Ut5.LJZ(0, frameLayout2);
                    C786410Ut5.Pb(frameLayout2, 1.0f);
                    C786410Ut5.qc(frameLayout2, 1.0f);
                    C786410Ut5.W4(linearLayoutVo, 0.0f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayoutHo, (Property<ConstraintLayout, Float>) View.ALPHA, constraintLayoutHo.getAlpha(), 0.0f);
                    objectAnimatorOfFloat.setDuration(50L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) View.ALPHA, frameLayout2.getAlpha(), 1.0f);
                    objectAnimatorOfFloat2.setDuration(150L);
                    objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayoutVo, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat3.setStartDelay(150L);
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
                    animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    animatorSet2.addListener(new ALAdapterS0S0510000_5(frameLayoutZo, frameLayout2, linearLayoutVo, constraintLayoutHo, this, 0));
                    this.LLJJL = animatorSet2;
                    animatorSet2.start();
                }
            }
        } else {
            ConstraintLayout constraintLayoutHo2 = Ho();
            if (constraintLayoutHo2 != null && (frameLayout = this.LLJJ) != null) {
                LinearLayout linearLayout8 = this.LLJJI;
                FrameLayout frameLayout3 = this.LLJJJ;
                Animator animator4 = this.LLJJL;
                if (animator4 != null) {
                    animator4.cancel();
                }
                this.LLJJL = null;
                C370280EfS c370280EfS2 = this.LLJJJIL;
                if (c370280EfS2 != null) {
                    c370280EfS2.LIZ();
                }
                if (frameLayout.getVisibility() == 0 || constraintLayoutHo2.getVisibility() != 0 || constraintLayoutHo2.getAlpha() != 1.0f) {
                    C786410Ut5.LL(0, constraintLayoutHo2);
                    ArrayList arrayList = new ArrayList();
                    if (linearLayout8 != null) {
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(linearLayout8, (Property<LinearLayout, Float>) View.ALPHA, linearLayout8.getAlpha(), 0.0f);
                        objectAnimatorOfFloat4.setDuration(50L);
                        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                        arrayList.add(objectAnimatorOfFloat4);
                    }
                    if (frameLayout3 != null) {
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.ALPHA, frameLayout3.getAlpha(), 0.0f);
                        objectAnimatorOfFloat5.setDuration(50L);
                        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                        arrayList.add(objectAnimatorOfFloat5);
                    }
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(constraintLayoutHo2, (Property<ConstraintLayout, Float>) View.ALPHA, constraintLayoutHo2.getAlpha(), 1.0f);
                    objectAnimatorOfFloat6.setDuration(250L);
                    objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LIZLLL());
                    arrayList.add(objectAnimatorOfFloat6);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(arrayList);
                    animatorSet3.addListener(new ALAdapterS0S0510000_5(frameLayout, frameLayout3, linearLayout8, constraintLayoutHo2, this, 1));
                    this.LLJJL = animatorSet3;
                    animatorSet3.start();
                }
            }
        }
        LinearLayout linearLayout9 = this.LLJJI;
        if (linearLayout9 == null) {
            return;
        }
        linearLayout9.setClickable(z3);
    }

    public final void mp(C0HXD c0hxd) {
        String string;
        if (!tp()) {
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextViewOo = this.LLJJIII;
        if (tuxTextViewOo == null && (tuxTextViewOo = Oo()) == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextViewOo, 0);
        int i = C0HXE.LIZ[c0hxd.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = tuxTextViewOo.getContext().getString(2131847131);
            } else {
                throw new C1954807lC();
            }
        } else {
            string = tuxTextViewOo.getContext().getString(2131847128);
        }
        tuxTextViewOo.setText(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{EcTakePhotoScope.class}).bindAbility(this.LLIZLLLIL, IEcQRCodeScanAbility.class);
    }

    public final void up(boolean z) {
        VERecorder vERecorderJz0;
        b bVar;
        EnumC448620HiW enumC448620HiW;
        IVESDKAbility iVESDKAbility = (IVESDKAbility) C1558520qew.LIZ(C1558360qeg.LJ(LJJIJL(), null), IVESDKAbility.class, null);
        if (iVESDKAbility != null && (vERecorderJz0 = iVESDKAbility.Jz0()) != null && (bVar = vERecorderJz0.LIZIZ.LJJIJLIJ) != null) {
            b bVar2 = this.LLJZIJLIL;
            if (bVar2 != bVar) {
                C448700Hie c448700Hie = this.LLL;
                if (c448700Hie != null && bVar2 != null) {
                    bVar2.LIZIZ(c448700Hie);
                }
                this.LLL = null;
                this.LLJL = false;
                this.LLJLIL = false;
                this.LLJLILLLLZIIL = false;
                b bVar3 = this.LLJZIJLIL;
                if (bVar3 != null) {
                    bVar3.LIZJ(null);
                }
                this.LLJZIJLIL = bVar;
                bVar.LIZJ(this.LLLFFI);
            }
            b bVar4 = this.LLJZIJLIL;
            C448700Hie c448700Hie2 = this.LLL;
            if (!this.LLJL) {
                this.LLJLILLLLZIIL = false;
            } else if (c448700Hie2 != null && bVar4 != null) {
                bVar4.LIZIZ(c448700Hie2);
                this.LLL = null;
                this.LLJL = false;
                this.LLJLIL = false;
                this.LLJLILLLLZIIL = false;
                this.LLJLL = null;
            }
            C448710Hif c448710Hif = new C448710Hif();
            c448710Hif.LIZ.LIZ = EnumC448630HiX.CAMERA.ordinal();
            C448700Hie c448700Hie3 = c448710Hif.LIZ;
            c448700Hie3.LIZLLL = 60;
            c448700Hie3.LJII = true;
            if (z) {
                enumC448620HiW = EnumC448620HiW.ETEScanCodeContinue;
            } else {
                enumC448620HiW = EnumC448620HiW.ETEScanCodeOnce;
            }
            c448700Hie3.LJFF = enumC448620HiW;
            C448700Hie c448700HieLIZ = c448710Hif.LIZ();
            if (bVar4 != null && bVar4.LIZ(c448700HieLIZ)) {
                this.LLL = c448700HieLIZ;
                this.LLJL = true;
                this.LLJLIL = z;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.IEcQRCodeScanAbility
    public final boolean A61(String str, String str2) {
        Object c098200Yq;
        String str3;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        if (this.LLJLLL != C0HXD.QR_SCAN || str == null || !(!a0.LJJJIL(str))) {
            return false;
        }
        try {
            c098200Yq = C09N5.LIZ(LJJIJL().getContext(), UriProtector.parse(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str4 = (String) c098200Yq;
        if (str4 == null || !(!a0.LJJJIL(str4))) {
            return false;
        }
        C448710Hif c448710Hif = new C448710Hif();
        C448700Hie c448700Hie = c448710Hif.LIZ;
        c448700Hie.picturePath = str4;
        c448700Hie.LIZ = EnumC448630HiX.PICTURE.ordinal();
        C448700Hie c448700Hie2 = c448710Hif.LIZ;
        c448700Hie2.LIZJ = true;
        c448700Hie2.reqWidth = 1280;
        c448700Hie2.reqHeight = 720;
        VEBachQRCodeResult vEBachQRCodeResultScanPicture = VEUtils.scanPicture(c448710Hif.LIZ());
        if (!(vEBachQRCodeResultScanPicture instanceof VEBachQRCodeResult) || vEBachQRCodeResultScanPicture == null) {
            return false;
        }
        if (str2 == null) {
            PhotoSearchEnterParams photoSearchEnterParamsJ80 = j80();
            if (photoSearchEnterParamsJ80 != null && (photoSearchLogEnterParams = photoSearchEnterParamsJ80.logParams) != null) {
                str2 = photoSearchLogEnterParams.photoSearchTypeDetail;
            } else {
                str2 = null;
            }
        }
        if (Intrinsics.LJFF(str2, "choose_album_extend_panel")) {
            str3 = "choose_album_exposed";
        } else {
            str3 = "choose_album";
        }
        if (vEBachQRCodeResultScanPicture.retCode != 0) {
            return false;
        }
        String result = vEBachQRCodeResultScanPicture.getResult();
        if (result == null) {
            result = "";
        }
        if (a0.LJJJIL(result)) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LLJLL, result)) {
            int i = vEBachQRCodeResultScanPicture.type;
            lA1();
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C448550HiP(this, result, i, str3, null), 3);
        }
        return true;
    }

    public final void cp(String str, C448660Hia c448660Hia) {
        if (c448660Hia.LIZIZ) {
            this.LLJLL = str;
            this.LLJLILLLLZIIL = false;
            if (this.LLJLLL == C0HXD.QR_SCAN) {
                up(false);
                return;
            }
            return;
        }
        this.LLJLL = null;
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS106S0100000_6(this, 52), 200L);
    }

    public static void yp(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2) {
        int iIndexOfChild;
        View viewFindViewById = constraintLayout.findViewById(R.id.syt);
        if (viewFindViewById == null) {
            iIndexOfChild = -1;
        } else {
            iIndexOfChild = constraintLayout.indexOfChild(viewFindViewById);
        }
        int iIndexOfChild2 = constraintLayout.indexOfChild(view);
        if (iIndexOfChild >= 0 && iIndexOfChild2 > iIndexOfChild) {
            C786410Ut5.LJJLI(view, constraintLayout);
            constraintLayout.addView(view, iIndexOfChild);
        }
        View viewFindViewWithTag = constraintLayout.findViewWithTag("visual_search_qrcode_scan_mode_guide");
        if (viewFindViewWithTag != null) {
            constraintLayout.bringChildToFront(viewFindViewWithTag);
        }
        View viewFindViewWithTag2 = constraintLayout.findViewWithTag("visual_search_qrcode_scan_mode_back");
        if (viewFindViewWithTag2 != null) {
            constraintLayout.bringChildToFront(viewFindViewWithTag2);
        }
        if (constraintLayout2 != null) {
            constraintLayout.bringChildToFront(constraintLayout2);
        }
    }

    public final void dp(String str, Rect rect, int i) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS1S1201000_6(this, str, rect, i, 0));
            return;
        }
        int i2 = C0HXE.LIZ[this.LLJLLL.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.LLJL && this.LLJLIL && C144800gw.LIZ()) {
                    C448640HiY.LIZ.getClass();
                    if (C448640HiY.LIZ(str) != null && rect != null && !rect.isEmpty()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLLF);
                        sbLIZ.append('_');
                        sbLIZ.append(ep(str));
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        this.LLJIJIL = new Rect(rect);
                        this.LLJI = new C423430Giz(true, new C448570HiR(i, str, strLIZIZ));
                        kp(this.LLJLLL);
                        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 139);
                        ARunnableS106S0100000_6 aRunnableS106S0100000_62 = this.LLJZ;
                        if (aRunnableS106S0100000_62 != null) {
                            HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS106S0100000_62);
                        }
                        this.LLJZ = aRunnableS106S0100000_6;
                        HandlerHook.viewRemoveCallbacks(LJJIJL(), aRunnableS106S0100000_6);
                        HandlerHook.viewPostDelay(LJJIJL(), aRunnableS106S0100000_6, 300L);
                        op("search_visual_scan_it_tag", "show", strLIZIZ);
                        return;
                    }
                    this.LLJI = new C423430Giz(i3);
                    kp(this.LLJLLL);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (!this.LLJL || this.LLJLILLLLZIIL) {
            return;
        }
        if (Intrinsics.LJFF(this.LLJLL, str)) {
            lA1();
            this.LLJLL = str;
            up(false);
        } else {
            this.LLJLILLLLZIIL = true;
            lA1();
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C448540HiO(this, str, i, null), 3);
        }
    }

    public final Object hp(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C448680Hic.LIZ.LIZIZ(LJJIJL().getContext(), str, i, "search_middle_page", -1, interfaceC1364105Vn);
    }

    public final void op(String str, String str2, String str3) {
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        String str4;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParamsJ80 = j80();
        JSONObject jSONObject = new JSONObject();
        String str5 = null;
        if (photoSearchEnterParamsJ80 != null && (photoSearchLogEnterParams2 = photoSearchEnterParamsJ80.logParams) != null) {
            str5 = photoSearchLogEnterParams2.searchEntrance;
        }
        jSONObject.put("enter_from", str5);
        jSONObject.put("action_type", str2);
        jSONObject.put("current_page", "search_blankpage");
        if (str3 != null && (!a0.LJJJIL(str3))) {
            jSONObject.put("impr_id", str3);
        }
        if (photoSearchEnterParamsJ80 != null && (photoSearchLogEnterParams = photoSearchEnterParamsJ80.logParams) != null && (str4 = photoSearchLogEnterParams.middlePageId) != null && (!a0.LJJJIL(str4))) {
            jSONObject.put("blankpage_id", str4);
        }
        C20684815ws.LJIJ(str, jSONObject);
    }

    public final void sp(String str, String str2, String str3) {
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        String str4;
        PhotoSearchEnterParams photoSearchEnterParamsJ80 = j80();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scan_source", str2);
        jSONObject.put("url", str);
        String str5 = null;
        if (str3 != null && (!a0.LJJJIL(str3))) {
            jSONObject.put("impr_id", str3);
        }
        if (photoSearchEnterParamsJ80 != null && (photoSearchLogEnterParams2 = photoSearchEnterParamsJ80.logParams) != null && (str4 = photoSearchLogEnterParams2.middlePageId) != null && (!a0.LJJJIL(str4))) {
            jSONObject.put("blankpage_id", str4);
        }
        jSONObject.put("current_page", "search_blankpage");
        if (photoSearchEnterParamsJ80 != null && (photoSearchLogEnterParams = photoSearchEnterParamsJ80.logParams) != null) {
            str5 = photoSearchLogEnterParams.searchEntrance;
        }
        jSONObject.put("enter_from", str5);
        C20684815ws.LJIJ("search_visual_qr_code_scan", jSONObject);
    }
}
