package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem;

import X.AbstractC1585810rMx;
import X.AbstractC1837070xuD;
import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C1836920xty;
import X.C1837040xuA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C497740JfY;
import X.C521550Kcr;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailPurchaseSectionAssem;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.text.a0;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: loaded from: classes28.dex */
public class CourseDetailPurchaseSectionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public LinearLayout LLJ;
    public View LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public C16FS LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public C1836920xty LLJJ;
    public ValueAnimator LLJJI;
    public ValueAnimator LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CourseDetailPurchaseSectionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CourseDetailPurchaseSectionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 719), AFwS269S0000000_27.get$arr$(137), null, true);
    }

    public boolean Vo() {
        return false;
    }

    public final LinearLayout Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w7z) : null;
            this.LLJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C16F5 Jo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_tos) : null;
            this.LLJIJIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16FS Lo() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ctm) : null;
            this.LLJILJILJ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final View No() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.sif) : null;
            this.LLJI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1836920xty Oo() {
        if (this.LLJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1836920xty.class, null);
            this.LLJJ = interfaceC1555100qZQLIZIZ != null ? (C1836920xty) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJ;
    }

    public final PcsCourseDetailVM So() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PcsCourseDetailVM) assemVMLazy.getValue();
    }

    public final boolean Ho() {
        C1837040xuA c1837040xuA;
        GetSMBCourseDetailResponse.Data data;
        SMBCourse sMBCourse;
        AbstractC1837070xuD abstractC1837070xuD = So().getState().LL;
        if (!(abstractC1837070xuD instanceof C1837040xuA) || (c1837040xuA = (C1837040xuA) abstractC1837070xuD) == null || (data = c1837040xuA.LIZ) == null || (sMBCourse = data.course) == null) {
            return false;
        }
        return sMBCourse.showM2Guide;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C16FS c16fsLo;
        super.onViewCreated(view);
        View rootView = LJJIJL().getRootView();
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = rootView.findViewById(R.id.ew4);
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0xu9
                public boolean LL = true;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    CourseDetailPurchaseSectionAssem courseDetailPurchaseSectionAssem;
                    LinearLayout linearLayoutGo;
                    float fFloatValue;
                    Float f;
                    if (!this.LL) {
                        return;
                    }
                    if (!viewOnAttachStateChangeListenerC20604515jv.canScrollVertically(1) && !viewOnAttachStateChangeListenerC20604515jv.canScrollVertically(-1)) {
                        this.LL = false;
                        return;
                    }
                    if (i != 0) {
                        if ((i != 1 && i != 2) || (linearLayoutGo = (courseDetailPurchaseSectionAssem = this).Go()) == null) {
                            return;
                        }
                        ValueAnimator valueAnimator = courseDetailPurchaseSectionAssem.LLJJI;
                        if ((valueAnimator != null && valueAnimator.isStarted()) || linearLayoutGo.getAlpha() == 0.0f || !C500260Jjc.LJJJJIZL(linearLayoutGo)) {
                            return;
                        }
                        ValueAnimator valueAnimator2 = courseDetailPurchaseSectionAssem.LLJJIII;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimator3 = courseDetailPurchaseSectionAssem.LLJJIII;
                        Object animatedValue = null;
                        if (valueAnimator3 != null) {
                            animatedValue = valueAnimator3.getAnimatedValue();
                        }
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 1.0f;
                        }
                        ValueAnimator valueAnimatorLIZ = C740320T2g.LIZ(linearLayoutGo, fFloatValue, 0.0f, 0L, AFwS216S0000000_27.get$arr$(326));
                        valueAnimatorLIZ.start();
                        courseDetailPurchaseSectionAssem.LLJJI = valueAnimatorLIZ;
                        return;
                    }
                    CourseDetailPurchaseSectionAssem courseDetailPurchaseSectionAssem2 = this;
                    LinearLayout linearLayoutGo2 = courseDetailPurchaseSectionAssem2.Go();
                    if (linearLayoutGo2 == null) {
                        return;
                    }
                    ValueAnimator valueAnimator4 = courseDetailPurchaseSectionAssem2.LLJJIII;
                    if (valueAnimator4 != null && valueAnimator4.isStarted()) {
                        return;
                    }
                    ValueAnimator valueAnimatorLIZ2 = C740320T2g.LIZ(linearLayoutGo2, 0.0f, 1.0f, 400L, new AwS571S0100000_27(courseDetailPurchaseSectionAssem2, 9));
                    valueAnimatorLIZ2.start();
                    courseDetailPurchaseSectionAssem2.LLJJIII = valueAnimatorLIZ2;
                }
            });
        }
        if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage() && (c16fsLo = Lo()) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey7);
            c16fsLo.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
        }
        C16FS c16fsLo2 = Lo();
        if (c16fsLo2 != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 4), c16fsLo2);
        }
        String strLJIJI = C497740JfY.LJIJI(2131855822);
        String strLJIJJ = C497740JfY.LJIJJ(2131855821, strLJIJI);
        SpannableString spannableString = new SpannableString(strLJIJJ);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, length, 33);
        C786410Ut5.p2(spannableString, new C521550Kcr(this, 0), iLJJJ, length, 33);
        C16F5 c16f5Jo = Jo();
        if (c16f5Jo != null) {
            c16f5Jo.setText(spannableString);
        }
        C16F5 c16f5Jo2 = Jo();
        if (c16f5Jo2 != null) {
            c16f5Jo2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C16F5 c16f5Jo3 = Jo();
        if (c16f5Jo3 != null) {
            c16f5Jo3.setHighlightColor(0);
        }
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0xu7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 2), 4);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0xu4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1837060xuC) obj).LLILLJJLI;
            }
        }, null, new AwS641S0100000_27(this, 3), 6);
    }
}
