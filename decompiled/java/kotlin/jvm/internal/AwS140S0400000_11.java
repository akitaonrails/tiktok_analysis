package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0RGJ;
import X.C0SEI;
import X.C118300cf;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C1843500y4a;
import X.C19647111tt;
import X.C285440BGs;
import X.C418440Gaw;
import X.C631370Opb;
import X.C696590RUb;
import X.C700150RdF;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700950ReX;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1320380kSq;
import X.InterfaceC1631620sYq;
import X.InterfaceC417310GXx;
import Y.ARunnableS111S0100000_11;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.BaseUserFeedComponent;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS140S0400000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS140S0400000_11 awS140S0400000_11) {
        ((Function1) awS140S0400000_11.l0).invoke(((C700150RdF) awS140S0400000_11.l1).LIZ(((C700170RdH) awS140S0400000_11.l2).LIZ.LIZIZ(), ((C700260RdQ) awS140S0400000_11.l3).LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS140S0400000_11 awS140S0400000_11) {
        ((Function1) awS140S0400000_11.l0).invoke(((C700150RdF) awS140S0400000_11.l1).LIZ(((C700170RdH) awS140S0400000_11.l2).LIZ.LIZIZ(), ((C700260RdQ) awS140S0400000_11.l3).LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS140S0400000_11 awS140S0400000_11) {
        ((InterfaceC1631620sYq) awS140S0400000_11.l0).invoke((C03H5) awS140S0400000_11.l1, awS140S0400000_11.l2, awS140S0400000_11.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS140S0400000_11 awS140S0400000_11) {
        ((InterfaceC1631620sYq) awS140S0400000_11.l0).invoke((C03H5) awS140S0400000_11.l1, awS140S0400000_11.l2, awS140S0400000_11.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS140S0400000_11 awS140S0400000_11) {
        C1322110kVd c1322110kVd;
        View view;
        float f;
        float f2;
        C1331070kk5 hierarchy;
        C19647111tt c19647111tt = (C19647111tt) awS140S0400000_11.l0;
        if (c19647111tt.LLJJIII) {
            if (c19647111tt.LLJJ != null) {
                C1322110kVd c1322110kVd2 = (C1322110kVd) awS140S0400000_11.l1;
                InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI = null;
                if (c1322110kVd2 != null && (hierarchy = c1322110kVd2.getHierarchy()) != null) {
                    interfaceC1320380kSqLJIIJJI = hierarchy.LJIIJJI();
                }
                if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LJI)) {
                    Object parent = ((FrameLayout) awS140S0400000_11.l2).getParent();
                    if ((parent instanceof View) && (view = (View) parent) != null) {
                        SingleImageData singleImageData = (SingleImageData) awS140S0400000_11.l3;
                        FrameLayout frameLayout = (FrameLayout) awS140S0400000_11.l2;
                        float width = view.getWidth();
                        float height = view.getHeight();
                        float imageRatio = singleImageData.getImageRatio();
                        if (width / height > imageRatio) {
                            f2 = imageRatio * height;
                            f = height;
                        } else {
                            f = width / imageRatio;
                            f2 = width;
                        }
                        float fMax = Math.max(width / f2, height / f);
                        if (!Float.isNaN(fMax) && fMax > 1.0f) {
                            C786410Ut5.Pb(frameLayout, fMax);
                            C786410Ut5.qc(frameLayout, fMax);
                        }
                    }
                }
            }
            C19647111tt c19647111tt2 = (C19647111tt) awS140S0400000_11.l0;
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = c19647111tt2.LLJJJ;
            if (aRunnableS111S0100000_11 != null && (c1322110kVd = c19647111tt2.LLJJJIL) != null) {
                HandlerHook.viewRemoveCallbacks(c1322110kVd, aRunnableS111S0100000_11);
            }
            C1322110kVd c1322110kVd3 = (C1322110kVd) awS140S0400000_11.l1;
            ARunnableS111S0100000_11 aRunnableS111S0100000_112 = new ARunnableS111S0100000_11(c1322110kVd3, 45);
            C19647111tt c19647111tt3 = (C19647111tt) awS140S0400000_11.l0;
            c19647111tt3.LLJJJ = aRunnableS111S0100000_112;
            c19647111tt3.LLJJJIL = c1322110kVd3;
            C1322110kVd c1322110kVd4 = (C1322110kVd) awS140S0400000_11.l1;
            if (c1322110kVd4 != null) {
                HandlerHook.viewPostDelay(c1322110kVd4, aRunnableS111S0100000_112, 300L);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS140S0400000_11 awS140S0400000_11) {
        long jLongValue;
        int measuredWidth;
        TuxTextView tuxTextView;
        long jLongValue2;
        if (C285440BGs.LIZ(Long.valueOf(((VideoItemParams) C631370Opb.LIZ((StoryViewerEntranceComponent) awS140S0400000_11.l0)).getAweme().getCreateTime()))) {
            StoryViewerEntranceComponent storyViewerEntranceComponent = (StoryViewerEntranceComponent) awS140S0400000_11.l0;
            Long l = (Long) awS140S0400000_11.l1;
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            C0SEI c0sei = (C0SEI) awS140S0400000_11.l2;
            if (jLongValue2 <= 0) {
                TuxTextView tuxTextView2 = storyViewerEntranceComponent.LLJLLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(tuxTextView2.getContext().getString(c0sei.LJ));
                }
                TuxIconView tuxIconView = storyViewerEntranceComponent.LLJLLL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                storyViewerEntranceComponent.Gp(R.attr.eh);
            } else {
                TuxTextView tuxTextView3 = storyViewerEntranceComponent.LLJLLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(tuxTextView3.getContext().getResources().getQuantityString(c0sei.LIZLLL, (int) jLongValue2, C1843500y4a.LIZIZ(jLongValue2)));
                }
                TuxIconView tuxIconView2 = storyViewerEntranceComponent.LLJLLL;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                }
                storyViewerEntranceComponent.Gp(R.attr.ee);
            }
        } else {
            StoryViewerEntranceComponent storyViewerEntranceComponent2 = (StoryViewerEntranceComponent) awS140S0400000_11.l0;
            Long l2 = (Long) awS140S0400000_11.l3;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            C0SEI c0sei2 = (C0SEI) awS140S0400000_11.l2;
            if (jLongValue <= 0) {
                TuxTextView tuxTextView4 = storyViewerEntranceComponent2.LLJLLIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(tuxTextView4.getContext().getString(c0sei2.LIZIZ));
                }
                TuxIconView tuxIconView3 = storyViewerEntranceComponent2.LLJLLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                storyViewerEntranceComponent2.Gp(R.attr.eh);
            } else {
                TuxTextView tuxTextView5 = storyViewerEntranceComponent2.LLJLLIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(tuxTextView5.getContext().getResources().getQuantityString(c0sei2.LIZ, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue)));
                }
                TuxIconView tuxIconView4 = storyViewerEntranceComponent2.LLJLLL;
                if (tuxIconView4 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                }
                storyViewerEntranceComponent2.Gp(R.attr.ee);
            }
        }
        ConstraintLayout constraintLayout = ((StoryViewerEntranceComponent) awS140S0400000_11.l0).LLJZIJLIL;
        if (constraintLayout != null && (measuredWidth = constraintLayout.getMeasuredWidth()) > 0 && (tuxTextView = ((StoryViewerEntranceComponent) awS140S0400000_11.l0).LLJLLIL) != null) {
            tuxTextView.setMaxWidth(measuredWidth - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(105)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS140S0400000_11 awS140S0400000_11) {
        ((BaseUserFeedComponent) awS140S0400000_11.l0).hp(((C118300cf) awS140S0400000_11.l1).element, (C0RGJ) awS140S0400000_11.l2, (C0RGJ) awS140S0400000_11.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS140S0400000_11 awS140S0400000_11) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view = (View) awS140S0400000_11.l0;
        InterfaceC417310GXx interfaceC417310GXx = (InterfaceC417310GXx) awS140S0400000_11.l1;
        if (view == ((TranslationStatusAssem) interfaceC417310GXx).LLJLLL && (objectAnimator2 = ((TranslationStatusAssem) interfaceC417310GXx).LLLFF) != null) {
            objectAnimator2.cancel();
        }
        View view2 = (View) awS140S0400000_11.l2;
        InterfaceC417310GXx interfaceC417310GXx2 = (InterfaceC417310GXx) awS140S0400000_11.l1;
        if (view2 == ((TranslationStatusAssem) interfaceC417310GXx2).LLJLLL && (objectAnimator = ((TranslationStatusAssem) interfaceC417310GXx2).LLLFF) != null) {
            C786410Ut5.Pd(objectAnimator);
        }
        ((Function2) awS140S0400000_11.l3).invoke((View) awS140S0400000_11.l2, (View) awS140S0400000_11.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS140S0400000_11 r98) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS140S0400000_11.invoke$8(kotlin.jvm.internal.AwS140S0400000_11):java.lang.Object");
    }

    public static final Object invoke$9(AwS140S0400000_11 awS140S0400000_11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((Assembler) awS140S0400000_11.l0).QQ2((UIContentAssem) awS140S0400000_11.l1, new AwS377S0200000_11((C696590RUb) awS140S0400000_11.l2, (UIContentAssem) awS140S0400000_11.l3, 155));
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0400000_11(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<C03H5, Object, Object, Unit> interfaceC1631620sYq2, C03H5 c03h5, Object obj, Object obj2) {
        super(0);
        this.$t = obj2;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
        this.l2 = c03h5;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0400000_11(C19647111tt c19647111tt, C1322110kVd c1322110kVd, FrameLayout frameLayout, SingleImageData singleImageData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19647111tt;
        this.l1 = c1322110kVd;
        this.l2 = frameLayout;
        this.l3 = singleImageData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0400000_11(View view, View view2, InterfaceC417310GXx interfaceC417310GXx, AwS625S0100000_11 awS625S0100000_11, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = interfaceC417310GXx;
        this.l2 = view2;
        this.l3 = awS625S0100000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0400000_11(Assembler assembler, BasePanelUIComponent basePanelUIComponent, C696590RUb c696590RUb, UIContentAssem uIContentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = basePanelUIComponent;
        this.l2 = c696590RUb;
        this.l3 = uIContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0400000_11(PostModeDetailParams postModeDetailParams, PostModeDetailParams postModeDetailParams2, Aweme aweme, Map<String, String> map, FullPageParam fullPageParam) {
        super(0);
        this.$t = fullPageParam;
        this.l0 = postModeDetailParams;
        this.l1 = postModeDetailParams2;
        this.l2 = aweme;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0400000_11(StoryViewerEntranceComponent storyViewerEntranceComponent, Long l, C0SEI c0sei, Long l2, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyViewerEntranceComponent;
        this.l1 = l;
        this.l2 = c0sei;
        this.l3 = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0400000_11(BaseUserFeedComponent baseUserFeedComponent, C118300cf c118300cf, C0RGJ c0rgj, C0RGJ c0rgj2, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseUserFeedComponent;
        this.l1 = c118300cf;
        this.l2 = c0rgj;
        this.l3 = c0rgj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0400000_11(Function1 function1, Function1<? super C700950ReX, Unit> function12, C700150RdF c700150RdF, C700170RdH c700170RdH, C700260RdQ c700260RdQ) {
        super(0);
        this.$t = c700260RdQ;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c700150RdF;
        this.l3 = c700170RdH;
    }
}
