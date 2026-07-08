package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C013C;
import X.C03H5;
import X.C09AY;
import X.C0CNO;
import X.C0S5G;
import X.C0S5K;
import X.C0SL3;
import X.C118300cf;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C16F4;
import X.C19606111nH;
import X.C238400w2;
import X.C259800zU;
import X.C2788016c;
import X.C291001Au;
import X.C491001vg;
import X.C586100Mym;
import X.C637920P0k;
import X.C695930RRn;
import X.C699950Rcv;
import X.C700170RdH;
import X.C700190RdJ;
import X.C701040Reg;
import X.C723830SaL;
import X.C730490Sl5;
import X.C734390SrN;
import X.C817403Hg;
import X.EnumC715590S5d;
import X.InterfaceC665370Q7z;
import X.InterfaceC699200Rbi;
import X.InterfaceC700000Rd0;
import X.InterfaceC725030ScH;
import X.InterfaceC725050ScJ;
import Y.ARunnableS80S0200000_11;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS109S0400000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        C03H5 actualReceiver = ((InterfaceC725050ScJ) awS109S0400000_11.l0).getActualReceiver();
        if (actualReceiver != null) {
            C723830SaL.LIZIZ(actualReceiver, new AwS66S0500000_2(abstractC1623806Xk, (AbstractC1623806Xk<Object>) awS109S0400000_11.l1, (Function1<C03H5, Unit>) awS109S0400000_11.l2, (Function2<C03H5, ? super Throwable, Unit>) awS109S0400000_11.l3, (Function2<C03H5, Object, Unit>) actualReceiver, (C03H5) 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        C03H5 receiverForHostVM = ((InterfaceC725030ScH) awS109S0400000_11.l0).getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = ((InterfaceC725030ScH) awS109S0400000_11.l0).getActualReceiverHolder().getActualReceiver()) != null) {
            Function1 function1 = (Function1) awS109S0400000_11.l1;
            Function2 function2 = (Function2) awS109S0400000_11.l2;
            Function2 function22 = (Function2) awS109S0400000_11.l3;
            if (abstractC1623806Xk instanceof C1623706Xj) {
                if (function1 != null) {
                    function1.invoke(receiverForHostVM);
                }
            } else if (abstractC1623806Xk instanceof C491001vg) {
                if (function2 != null) {
                    function2.invoke(receiverForHostVM, ((C491001vg) abstractC1623806Xk).LIZ);
                }
            } else if ((abstractC1623806Xk instanceof C1623606Xi) && function22 != null) {
                function22.invoke(receiverForHostVM, ((C1623606Xi) abstractC1623806Xk).LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        VideoDiggVM videoDiggVM = (VideoDiggVM) awS109S0400000_11.l0;
        videoDiggVM.setState(new AwS109S0400000_11(videoDiggVM, (C238400w2) awS109S0400000_11.l1, (Aweme) awS109S0400000_11.l2, (C013C) awS109S0400000_11.l3, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        String str = (String) obj;
        C013C c013c = (C013C) awS109S0400000_11.l0;
        if (!c013c.element) {
            c013c.element = true;
            ((ViewGroup) awS109S0400000_11.l1).addView((EmojiAnimPlayground) awS109S0400000_11.l2, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        ((C19606111nH) awS109S0400000_11.l3).LIZIZ(str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        return C730490Sl5.LIZ((C730490Sl5) obj, ((VideoDiggVM) awS109S0400000_11.l0).AQ2(((C238400w2) awS109S0400000_11.l1).element, (Aweme) awS109S0400000_11.l2, ((C013C) awS109S0400000_11.l3).element), null, null, null, null, 61);
    }

    public static final Object invoke$3(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        ((TranslationStatusViewModel) awS109S0400000_11.l0).vQ2(((C0S5G) awS109S0400000_11.l1).LL instanceof C0S5K, (EnumC715590S5d) awS109S0400000_11.l2, null, (InterfaceC665370Q7z) obj, (C2788016c) awS109S0400000_11.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C734390SrN.LIZLLL((Aweme) awS109S0400000_11.l0, ((VideoItemParams) awS109S0400000_11.l1).mEventType);
        } else {
            C734390SrN.LIZIZ((Aweme) awS109S0400000_11.l0, ((VideoItemParams) awS109S0400000_11.l1).mEventType);
        }
        DiggPanelComponent diggPanelComponent = (DiggPanelComponent) awS109S0400000_11.l2;
        C16F4 c16f4 = diggPanelComponent.LLJJ;
        if (c16f4 != null) {
            C637920P0k.LIZ(c16f4, new ARunnableS80S0200000_11(diggPanelComponent, (C586100Mym) awS109S0400000_11.l3, 29));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        C699950Rcv c699950RcvLIZ;
        ReusedAssem reusedAssem = (ReusedAssem) obj;
        C701040Reg c701040Reg = (C701040Reg) awS109S0400000_11.l0;
        String strLLLII = ((FcpNodeProtocol) awS109S0400000_11.l1).LLLII();
        if (reusedAssem != null) {
            c699950RcvLIZ = C695930RRn.LIZ(reusedAssem, (FcpNodeProtocol) awS109S0400000_11.l1, (C700170RdH) awS109S0400000_11.l2, (Function0) awS109S0400000_11.l3, true);
        } else {
            c699950RcvLIZ = null;
        }
        c701040Reg.LJI(strLLLII, c699950RcvLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((ConditionData) awS109S0400000_11.l0).setCanApplySlot(zBooleanValue);
        C0CNO.LIZLLL(0L, new AwS94S0210000_11((ReusedAssem) awS109S0400000_11.l1, (ReusedAssem<?>) zBooleanValue, (boolean) ((C700190RdJ) awS109S0400000_11.l2).LJFF, (C701040Reg) 0));
        InterfaceC700000Rd0 interfaceC700000Rd0Wb1 = ((FcpNodeProtocol) awS109S0400000_11.l3).wb1();
        if (interfaceC700000Rd0Wb1 != null) {
            interfaceC700000Rd0Wb1.l0(zBooleanValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        C0SL3 c0sl3 = (C0SL3) obj;
        if (c0sl3.LIZJ == ((C118300cf) awS109S0400000_11.l0).element && c0sl3.LIZIZ == ((C817403Hg) awS109S0400000_11.l1).element && Intrinsics.LJFF(c0sl3.LJ, ((C259800zU) awS109S0400000_11.l2).element) && Intrinsics.LJFF(c0sl3.LJI, ((C259800zU) awS109S0400000_11.l3).element)) {
            return null;
        }
        int i = ((C118300cf) awS109S0400000_11.l0).element;
        float f = ((C817403Hg) awS109S0400000_11.l1).element;
        C0SL3 c0sl32 = c0sl3.LJIIL;
        if (c0sl32 == null) {
            c0sl32 = c0sl3;
        }
        return C0SL3.LIZ(c0sl3, null, f, i, (Rect) ((C259800zU) awS109S0400000_11.l2).element, (Rect) ((C259800zU) awS109S0400000_11.l3).element, c0sl32, 12201);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS109S0400000_11 r6, java.lang.Object r7) {
        /*
            X.0Sfw r7 = (X.C727300Sfw) r7
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            if (r5 != 0) goto L12
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            X.0ShE r0 = r0.LJJLIIIJLJLI()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.LJIIIIZZ()
        L12:
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel r2 = (com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel) r2
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            r2.cR2(r5, r1, r0)
            java.lang.Object r1 = r6.l2
            com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel r1 = (com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel) r1
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r5.getUserStory()
            r1.LLILZIL = r0
            java.lang.Object r3 = r6.l1
            com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel r3 = (com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel) r3
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            r0 = 1
            java.util.List r4 = r3.NQ2(r2, r1, r0)
            if (r4 != 0) goto L40
            X.13BV r4 = X.C13BV.INSTANCE
        L40:
            java.lang.Object r0 = r6.l3
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L6a
            int r0 = r4.indexOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L6a
            int r3 = r1.intValue()
        L58:
            java.lang.Object r2 = r6.l2
            com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel r2 = (com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel) r2
            X.01Au r1 = new X.01Au
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.<init>(r0)
            X.0Sfw r0 = r2.xQ2(r7, r4, r3, r1)
            return r0
        L6a:
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel r2 = (com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel) r2
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            int r3 = r2.JQ2(r1, r0, r4)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS109S0400000_11.invoke$8(kotlin.jvm.internal.AwS109S0400000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS109S0400000_11 awS109S0400000_11, Object obj) {
        return C730490Sl5.LIZ((C730490Sl5) obj, ((VideoDiggVM) awS109S0400000_11.l0).AQ2(((C238400w2) awS109S0400000_11.l1).element, (Aweme) awS109S0400000_11.l2, ((C013C) awS109S0400000_11.l3).element), null, new C291001Au(Boolean.TRUE), null, null, 53);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0400000_11(C118300cf c118300cf, C118300cf c118300cf2, C817403Hg c817403Hg, C259800zU<Rect> c259800zU, C259800zU<Rect> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c817403Hg;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0400000_11(C013C c013c, ViewGroup viewGroup, EmojiAnimPlayground emojiAnimPlayground, C19606111nH c19606111nH, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = viewGroup;
        this.l2 = emojiAnimPlayground;
        this.l3 = c19606111nH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0400000_11(C701040Reg c701040Reg, C701040Reg c701040Reg2, FcpNodeProtocol fcpNodeProtocol, C700170RdH c700170RdH, Function0<? extends InterfaceC699200Rbi<?>> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c701040Reg;
        this.l1 = c701040Reg2;
        this.l2 = fcpNodeProtocol;
        this.l3 = c700170RdH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0400000_11(InterfaceC725030ScH interfaceC725030ScH, InterfaceC725030ScH<RECEIVER> interfaceC725030ScH2, Function1<? super RECEIVER, Unit> function1, Function2<? super RECEIVER, ? super Throwable, Unit> function2, Function2<? super RECEIVER, ? super T, Unit> function22) {
        super(1);
        this.$t = function22;
        this.l0 = interfaceC725030ScH;
        this.l1 = interfaceC725030ScH2;
        this.l2 = function1;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0400000_11(InterfaceC725050ScJ interfaceC725050ScJ, InterfaceC725050ScJ<? extends RECEIVER> interfaceC725050ScJ2, Function1<? super RECEIVER, Unit> function1, Function2<? super RECEIVER, ? super Throwable, Unit> function2, Function2<? super RECEIVER, ? super T, Unit> function22) {
        super(1);
        this.$t = function22;
        this.l0 = interfaceC725050ScJ;
        this.l1 = interfaceC725050ScJ2;
        this.l2 = function1;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0400000_11(VideoDiggVM videoDiggVM, C238400w2 c238400w2, Aweme aweme, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.l1 = c238400w2;
        this.l2 = aweme;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0400000_11(Aweme aweme, VideoItemParams videoItemParams, DiggPanelComponent diggPanelComponent, C586100Mym c586100Mym, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = videoItemParams;
        this.l2 = diggPanelComponent;
        this.l3 = c586100Mym;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0400000_11(Aweme aweme, StoryFeedViewModel storyFeedViewModel, StoryGalleryListViewModel storyGalleryListViewModel, Aweme aweme2, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = storyFeedViewModel;
        this.l2 = storyGalleryListViewModel;
        this.l3 = aweme2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0400000_11(ConditionData conditionData, ConditionData conditionData2, ReusedAssem<?> reusedAssem, C700190RdJ c700190RdJ, FcpNodeProtocol fcpNodeProtocol) {
        super(1);
        this.$t = fcpNodeProtocol;
        this.l0 = conditionData;
        this.l1 = conditionData2;
        this.l2 = reusedAssem;
        this.l3 = c700190RdJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0400000_11(TranslationStatusViewModel translationStatusViewModel, C0S5G c0s5g, EnumC715590S5d enumC715590S5d, C2788016c c2788016c, int i) {
        super(1);
        this.$t = i;
        this.l0 = translationStatusViewModel;
        this.l1 = c0s5g;
        this.l2 = enumC715590S5d;
        this.l3 = c2788016c;
    }
}
