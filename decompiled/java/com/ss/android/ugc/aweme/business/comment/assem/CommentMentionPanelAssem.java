package com.ss.android.ugc.aweme.business.comment.assem;

import X.C01GW;
import X.C0HU7;
import X.C0HV5;
import X.C1383370m6R;
import X.C13LE;
import X.C1637806bA;
import X.C19746412Nq;
import X.C20612315lB;
import X.C20612815lG;
import X.C20612915lH;
import X.C21388418n4;
import X.C21647019ng;
import X.C2176211AEx;
import X.C295780Bia;
import X.C295880Bik;
import X.C418440Gaw;
import X.C449290Hjb;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897520ZIw;
import X.InterfaceC1348870lCn;
import X.InterfaceC442640HXi;
import Y.AAListenerS68S0110000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS24S1201000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CommentMentionPanelAssem extends UISlotAssem implements InterfaceC1348870lCn {
    public C20612815lG LLJJI;
    public boolean LLJJIJI;
    public C21647019ng LLJJIJIL;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, C13LE.LIZ(MentionContainerViewModel.class), C1637806bA.LIZ, AFwS221S0000000_31.get$arr$(98), AFwS276S0000000_31.get$arr$(290), (Function0) null, 3));
    public ValueAnimator LLJJIJIIJIL = new ValueAnimator();
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 310));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dle;
    }

    public final MentionContainerViewModel hp() {
        return (MentionContainerViewModel) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1348870lCn
    public final void Sg() {
        MentionContainerViewModel mentionContainerViewModelHp = hp();
        mentionContainerViewModelHp.getClass();
        mentionContainerViewModelHp.setState(new AwS43S0010000_31(true, 16));
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = hp().LLILLL;
        if (activityStatusAnalyticsCommonLifecycleOwner != null) {
            activityStatusAnalyticsCommonLifecycleOwner.LIZLLL();
        }
        C897520ZIw c897520ZIw = hp().LLILLJJLI;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
        if (C2176211AEx.LIZIZ()) {
            kp(((ViewGroup.MarginLayoutParams) this.LLJJJ.getValue()).bottomMargin, 0);
        } else {
            ip(((ViewGroup.MarginLayoutParams) this.LLJJJ.getValue()).bottomMargin, 0);
        }
        C449290Hjb.LIZ = String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJIIJIL.cancel();
        C897520ZIw c897520ZIw = hp().LLILLJJLI;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // X.InterfaceC1348870lCn
    public final boolean Hn() {
        return this.LLJJIJI;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // X.InterfaceC1348870lCn
    public final void Sa(User user) {
        MentionContainerViewModel mentionContainerViewModelHp = hp();
        mentionContainerViewModelHp.getClass();
        mentionContainerViewModelHp.setStateImmediate(new AwS610S0100000_31(user, 427));
    }

    @Override // X.InterfaceC1348870lCn
    public final void Ym(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MentionContainerViewModel mentionContainerViewModelHp = hp();
        mentionContainerViewModelHp.getClass();
        mentionContainerViewModelHp.setState(new AwS43S0010000_31(false, 16));
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = hp().LLILLL;
            if (activityStatusAnalyticsCommonLifecycleOwner != null) {
                activityStatusAnalyticsCommonLifecycleOwner.LIZJ();
            }
            C897520ZIw c897520ZIw = hp().LLILLJJLI;
            if (c897520ZIw != null) {
                c897520ZIw.LJII();
            }
            if (z) {
                if (C2176211AEx.LIZIZ()) {
                    kp(((ViewGroup.MarginLayoutParams) this.LLJJJ.getValue()).bottomMargin, -LJJIJL().getLayoutParams().height);
                } else {
                    ip(((ViewGroup.MarginLayoutParams) this.LLJJJ.getValue()).bottomMargin, -LJJIJL().getLayoutParams().height);
                }
            } else {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = -LJJIJL().getLayoutParams().height;
                }
                LJJIJL().requestLayout();
            }
            C449290Hjb.LIZ = String.valueOf(System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC1348870lCn
    public final void f4(String str) {
        MentionContainerViewModel mentionContainerViewModelHp = hp();
        mentionContainerViewModelHp.getClass();
        mentionContainerViewModelHp.setStateImmediate(new AwS81S1000000_31(str, 9));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZIZ;
        if (!this.LLJJIJI) {
            ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
            C20612815lG c20612815lG = this.LLJJI;
            if (c20612815lG != null && c20612815lG.LIZ == 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(106));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
            }
            layoutParams.height = iLIZIZ;
            C1383370m6R.LJI(LJJIJL()).bottomMargin = -LJJIJL().getLayoutParams().height;
            LJJIJL().requestLayout();
        }
        C20612815lG c20612815lG2 = this.LLJJI;
        if (c20612815lG2 != null) {
            C723850SaN.LIZLLL(this, new AwS24S1201000_31(R.id.emu, this, c20612815lG2, "comment", 0));
        }
        hp().LLILLL = new ActivityStatusAnalyticsCommonLifecycleOwner(this, false);
    }

    @Override // X.InterfaceC1348870lCn
    public final void rm(int i) {
        LJJIJL().getLayoutParams().height = i;
        LJJIJL().requestLayout();
    }

    @Override // X.InterfaceC1348870lCn
    public final void Vf(String str, Set<String> set) {
        String str2;
        if (C20612915lH.LIZIZ.LJIIIIZZ().LJFF(null)) {
            return;
        }
        MentionContainerViewModel mentionContainerViewModelHp = hp();
        mentionContainerViewModelHp.LLILZ = null;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        mentionContainerViewModelHp.LLILZLL = str2;
        mentionContainerViewModelHp.setState(new C20612315lB(str, set, false));
    }

    public final void ip(int i, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIIJIL.cancel();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i, i2);
        valueAnimator.setInterpolator(new C21388418n4());
        valueAnimator.setDuration(350L);
        valueAnimator.addListener(new AAListenerS68S0110000_19(this, z, 0));
        valueAnimator.addUpdateListener(new AUListenerS268S0100000_19(this, 1));
        this.LLJJIJIIJIL = valueAnimator;
        valueAnimator.start();
    }

    public final void kp(int i, int i2) {
        final boolean z;
        C21647019ng c21647019ngLIZ;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C21647019ng c21647019ng = this.LLJJIJIL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        Context context = getContext();
        if (context != null) {
            c21647019ngLIZ = C0HU7.LIZ(C0HU7.LIZ, context, new View(context), Collections.singletonList(new C19746412Nq("mention_panel_show_anim", new C0HV5(i, i2))), 0.0f, "mention_panel_show_anim", new InterfaceC442640HXi() { // from class: X.15lJ
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    InterfaceC1844880y6o interfaceC1844880y6o = (InterfaceC1844880y6o) obj;
                    ViewGroup.LayoutParams layoutParams = this.LIZ.LJJIJL().getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.bottomMargin = (int) interfaceC1844880y6o.getValue();
                    }
                    this.LIZ.LJJIJL().requestLayout();
                }
            }, new InterfaceC442640HXi() { // from class: X.15lK
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    this.LIZ.getClass();
                    this.LIZ.getClass();
                    if (!z) {
                        C786410Ut5.LJLLLLLL(8, this.LIZ.LJJIJL());
                    }
                }
            }, 24);
        } else {
            c21647019ngLIZ = null;
        }
        this.LLJJIJIL = c21647019ngLIZ;
        if (c21647019ngLIZ != null) {
            c21647019ngLIZ.LJI(true);
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }
}
