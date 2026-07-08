package kotlin.jvm.internal;

import X.C054G;
import X.C09AY;
import X.C1295960jpS;
import X.C13LE;
import X.C1561140qjA;
import X.C1580330rE7;
import X.C336601Si;
import X.C418440Gaw;
import X.C631370Opb;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1600580rkm;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS72S0100100_24 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS72S0100100_24 awS72S0100100_24) {
        C054G c054g = C336601Si.LIZ;
        C336601Si.LIZ("click", awS72S0100100_24.j1, ((VideoItemParams) C631370Opb.LIZ((FeedAvatarSocialPublishAssem) awS72S0100100_24.l0)).getAweme(), null, null, null, 56);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS72S0100100_24 awS72S0100100_24) {
        Long l;
        View view;
        C1295960jpS c1295960jpS;
        View view2;
        int iIntValue;
        C1580330rE7 c1580330rE7 = C1580330rE7.LIZ;
        long j = awS72S0100100_24.j1;
        synchronized (c1580330rE7) {
            TuxTextView tuxTextView = null;
            if (C1580330rE7.LIZIZ && (l = C1580330rE7.LIZJ) != null && l.longValue() == j) {
                C1580330rE7.LIZIZ = false;
                C1580330rE7.LIZJ = null;
                ((SlideGuideController) awS72S0100100_24.l0).LJII();
                SlideGuideController slideGuideController = (SlideGuideController) awS72S0100100_24.l0;
                TuxTextView tuxTextView2 = slideGuideController.LLILZ;
                if (tuxTextView2 != null && (view = slideGuideController.LLILZIL) != null && (c1295960jpS = slideGuideController.LLILZLL) != null && (view2 = slideGuideController.LLIZ) != null) {
                    HandlerHook.viewRemoveCallbacks(slideGuideController.LLILLJJLI, slideGuideController.LLJILJIL);
                    slideGuideController.LLJIJIL = true;
                    slideGuideController.LLILLJJLI.setClickable(false);
                    Integer numValueOf = Integer.valueOf(slideGuideController.LLILLJJLI.getRootView().getHeight());
                    if (numValueOf.intValue() > 0) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = slideGuideController.LLILLJJLI.getResources().getDisplayMetrics().heightPixels;
                    }
                    int i = (int) (iIntValue * 0.3f);
                    LinearLayout linearLayout = slideGuideController.LLILLJJLI;
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -1;
                        C786410Ut5.W5(linearLayout, layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if (layoutParams2 != null) {
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                            layoutParams3.height = -1;
                            C786410Ut5.W5(view2, layoutParams3);
                            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                            if (layoutParams4 != null) {
                                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                                layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                                layoutParams5.height = -1;
                                layoutParams5.gravity = 8388659;
                                layoutParams5.setMarginStart(0);
                                layoutParams5.topMargin = 0;
                                C786410Ut5.W5(view, layoutParams5);
                                ViewGroup.LayoutParams layoutParams6 = c1295960jpS.getLayoutParams();
                                if (layoutParams6 != null) {
                                    FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                                    layoutParams7.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203));
                                    layoutParams7.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203));
                                    layoutParams7.gravity = 8388659;
                                    layoutParams7.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                    layoutParams7.topMargin = i;
                                    C786410Ut5.W5(c1295960jpS, layoutParams7);
                                    ViewGroup.LayoutParams layoutParams8 = tuxTextView2.getLayoutParams();
                                    if (layoutParams8 != null) {
                                        FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
                                        layoutParams9.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203));
                                        layoutParams9.height = -2;
                                        layoutParams9.gravity = 8388659;
                                        layoutParams9.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                        layoutParams9.topMargin = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                        C786410Ut5.W5(tuxTextView2, layoutParams9);
                                        TuxTextView tuxTextView3 = slideGuideController.LLILLL;
                                        if (tuxTextView3 != null) {
                                            tuxTextView = tuxTextView3;
                                        }
                                        C786410Ut5.LJLLLLLL(8, tuxTextView);
                                        C786410Ut5.LJLLLLLL(0, view);
                                        C786410Ut5.LJLLLLLL(0, tuxTextView2);
                                        C786410Ut5.LJLLLLLL(0, c1295960jpS);
                                        c1295960jpS.setRepeatMode(1);
                                        c1295960jpS.setRepeatCount(-1);
                                        c1295960jpS.removeAllAnimatorListeners();
                                        c1295960jpS.playAnimation();
                                        HandlerHook.viewPostDelay(slideGuideController.LLILLJJLI, slideGuideController.LLJILJIL, Mp4ScreenVideoLoadTimeout.CONTROL);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            } else {
                ((SlideGuideController) awS72S0100100_24.l0).LIZ(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS72S0100100_24 awS72S0100100_24) {
        SlideGuideController slideGuideController = (SlideGuideController) awS72S0100100_24.l0;
        long j = awS72S0100100_24.j1;
        if (!slideGuideController.LLJILLL) {
            slideGuideController.LLJILLL = true;
            PopupManager.LJIILL.add(slideGuideController.LLJJI);
            Long l = slideGuideController.LLJJ;
            if (l == null || l.longValue() != j) {
                slideGuideController.LLJJ = Long.valueOf(j);
                slideGuideController.LIZJ(new AwS72S0100100_24(j, slideGuideController, 4));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS72S0100100_24 awS72S0100100_24) {
        return new C1561140qjA(C13LE.LIZ(((RecyclerView.LayoutManager) awS72S0100100_24.l0).getClass()).LIZLLL(), awS72S0100100_24.j1);
    }

    public static final Object invoke$4(AwS72S0100100_24 awS72S0100100_24) {
        Long l;
        synchronized (C1580330rE7.LIZ) {
            l = C1580330rE7.LIZJ;
            if (!C1580330rE7.LIZIZ) {
                l = null;
            }
        }
        long j = awS72S0100100_24.j1;
        if (l != null && l.longValue() == j && !PopupManager.LJI()) {
            ((SlideGuideController) awS72S0100100_24.l0).LJII();
            ((SlideGuideController) awS72S0100100_24.l0).LJI(EnumC1600580rkm.LLIZ);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS72S0100100_24(long r3, com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 1: goto Lf;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.j1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.j1 = r3
            r1.l0 = r5
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS72S0100100_24.<init>(long, com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0100100_24(long j, FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = feedAvatarSocialPublishAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0100100_24(RecyclerView.LayoutManager layoutManager, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = layoutManager;
        this.j1 = j;
    }
}
