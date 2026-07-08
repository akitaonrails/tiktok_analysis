package kotlin.jvm.internal;

import X.C05BP;
import X.C098200Yq;
import X.C09AY;
import X.C0J50;
import X.C0O0B;
import X.C0PEM;
import X.C1483410ohn;
import X.C15438062q;
import X.C1565600qqM;
import X.C1565660qqS;
import X.C1575450r6F;
import X.C1575580r6S;
import X.C1580890rF1;
import X.C1593960ra6;
import X.C1598170rgt;
import X.C1598650rhf;
import X.C189200o6;
import X.C19EG;
import X.C20237314Gl;
import X.C20237414Gm;
import X.C20600815jK;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C443120HZe;
import X.C606820Nr6;
import X.C629160Om2;
import X.C690870R8b;
import X.C704830Rkn;
import X.C785410UrT;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.EnumC1575470r6H;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS35S0101000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleAssem;
import com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider;
import com.ss.android.ugc.aweme.series.reservation.model.ShortDramaReserveExtraModel;
import com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.widget.guide.StoryWidgetGuideInboxCell;
import com.ss.android.ugc.aweme.tako.botpage.components.botcenter.TakoBotCenterItemsAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryStats;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS459S0200000_24 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(C1565660qqS c1565660qqS, C1565600qqM c1565600qqM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1565660qqS;
        this.l1 = c1565600qqM;
    }

    public static final Object invoke$0(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        ((ProfileRecommendationService) awS459S0200000_24.l0).getClass();
        if (C1593960ra6.LIZ.showToast && Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ((ProfileRecommendationService) awS459S0200000_24.l0).getClass();
            C1483410ohn.LJLJJI().LJIILLIIL();
            PopupManager.LIZJ(C606820Nr6.class);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05BP((ProfileRecommendationService) awS459S0200000_24.l0, (C19EG) awS459S0200000_24.l1, null), 3);
        }
        if (bool != null) {
            ProfileRecommendationService profileRecommendationService = (ProfileRecommendationService) awS459S0200000_24.l0;
            bool.booleanValue();
            profileRecommendationService.getClass();
            C1483410ohn.LJLJJI().LJIILLIIL();
            PopupManager.LIZJ(C606820Nr6.class);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS459S0200000_24 r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS459S0200000_24.invoke$1(kotlin.jvm.internal.AwS459S0200000_24, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        if (Intrinsics.LJFF(obj2, ((C1565660qqS) awS459S0200000_24.l0).LLILZIL)) {
            ((C1565600qqM) awS459S0200000_24.l1).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        if (((Boolean) obj2).booleanValue() && ((SkylightListViewModel) awS459S0200000_24.l0).DQ2(((C1598650rhf) awS459S0200000_24.l1).hashCode())) {
            ((C1598650rhf) awS459S0200000_24.l1).d6(iIntValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        Object c098200Yq;
        C291001Au c291001Au = (C291001Au) obj2;
        if (((SkylightListViewModel) awS459S0200000_24.l0).DQ2(obj.hashCode())) {
            int iIntValue = ((Number) ((C443120HZe) c291001Au.LIZ).getFirst()).intValue();
            boolean zBooleanValue = ((Boolean) ((C443120HZe) c291001Au.LIZ).getSecond()).booleanValue();
            if (((Boolean) ((C443120HZe) c291001Au.LIZ).getThird()).booleanValue()) {
                ((C1598650rhf) awS459S0200000_24.l1).d6(iIntValue);
            } else if (zBooleanValue) {
                C1598650rhf c1598650rhf = (C1598650rhf) awS459S0200000_24.l1;
                HandlerHook.viewPost(c1598650rhf.LLJJJJJIL, new ARunnableS35S0101000_24(c1598650rhf, iIntValue, 7));
            } else {
                C1598650rhf c1598650rhf2 = (C1598650rhf) awS459S0200000_24.l1;
                if (iIntValue >= 0) {
                    try {
                        if (iIntValue < c1598650rhf2.LLJJJJJIL.getState().LJIIIIZZ()) {
                            c1598650rhf2.LLJJJJJIL.scrollToPosition(iIntValue);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        if (((SkylightListViewModel) awS459S0200000_24.l0).DQ2(obj.hashCode())) {
            Long l = C0J50.LIZ;
            if (l != null) {
                l.longValue();
                C0J50.LIZ = null;
                ((C1598650rhf) awS459S0200000_24.l1).a6(l.longValue());
            }
            C1598650rhf c1598650rhf = (C1598650rhf) awS459S0200000_24.l1;
            HandlerHook.viewPost(c1598650rhf.itemView, new ARunnableS124S0100000_24(c1598650rhf, 157));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (((SkylightListViewModel) awS459S0200000_24.l0).DQ2(obj.hashCode())) {
            ((C1598650rhf) awS459S0200000_24.l1).LLLIIII(((Boolean) c291001Au.LIZ).booleanValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x015c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0rBs, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$2(kotlin.jvm.internal.AwS459S0200000_24 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS459S0200000_24.invoke$2(kotlin.jvm.internal.AwS459S0200000_24, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        Context contextLIZ;
        C704830Rkn c704830Rkn;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C704830Rkn c704830Rkn2;
        Function0<VideoItemParams> function02;
        VideoItemParams videoItemParamsInvoke;
        Aweme aweme;
        Map map = (Map) obj;
        Function0 function03 = (Function0) obj2;
        WeakReference weakReference = (WeakReference) awS459S0200000_24.l0;
        ShortDramaReserveExtraModel shortDramaReserveExtraModelLIZJ = null;
        if (weakReference != null && (c704830Rkn2 = (C704830Rkn) weakReference.get()) != null && (function02 = c704830Rkn2.LIZLLL) != null && (videoItemParamsInvoke = function02.invoke()) != null && (aweme = videoItemParamsInvoke.getAweme()) != null) {
            shortDramaReserveExtraModelLIZJ = ((ShortDramaReserveAnchorProvider) awS459S0200000_24.l1).LIZJ(aweme);
        }
        if (C1580890rF1.LIZ(map)) {
            WeakReference weakReference2 = (WeakReference) awS459S0200000_24.l0;
            if (weakReference2 == null || (c704830Rkn = (C704830Rkn) weakReference2.get()) == null || (function0 = c704830Rkn.LIZ) == null || (c690870R8bInvoke = function0.invoke()) == null || (contextLIZ = C0O0B.LIZ(c690870R8bInvoke)) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            if (shortDramaReserveExtraModelLIZJ != null && ((ShortDramaReserveAnchorProvider) awS459S0200000_24.l1).LIZIZ(shortDramaReserveExtraModelLIZJ)) {
                C1580890rF1.LIZJ(contextLIZ.getString(2131822142), map);
                C1580890rF1.LIZIZ("1", map);
            } else {
                C1580890rF1.LIZJ(contextLIZ.getString(2131822140), map);
                C1580890rF1.LIZIZ("2", map);
            }
        }
        function03.invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS459S0200000_24 r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS459S0200000_24.invoke$4(kotlin.jvm.internal.AwS459S0200000_24, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        List list;
        RecyclerView.LayoutManager layoutManager;
        Pair pair = (Pair) obj2;
        if (pair != null && (list = (List) pair.getSecond()) != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) awS459S0200000_24.l0;
            TakoBotCenterItemsAssem takoBotCenterItemsAssem = (TakoBotCenterItemsAssem) awS459S0200000_24.l1;
            if (list.size() == 1) {
                layoutManager = takoBotCenterItemsAssem.LLJJIJIIJIL;
            } else {
                layoutManager = takoBotCenterItemsAssem.LLJJIJI;
            }
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(layoutManager);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C20237314Gl((String) pair.getFirst(), (TakoBotInfo) it2.next(), (C20237414Gm) takoBotCenterItemsAssem.LLJJIII.getValue()));
            }
            state.LJIILL(arrayList, null);
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS459S0200000_24.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS459S0200000_24.l1;
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(false, takoEnterParams, (String) obj, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        SummaryStats summaryStats = (SummaryStats) obj2;
        if (summaryStats != null) {
            C629160Om2.LIZ.getClass();
            if (C629160Om2.LIZ()) {
                C1575450r6F c1575450r6FLIZJ = ((C1575580r6S) awS459S0200000_24.l0).LIZJ();
                DialogC1389620mGW dialogC1389620mGW = c1575450r6FLIZJ.LJIIJ;
                if (dialogC1389620mGW != null) {
                    dialogC1389620mGW.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW);
                }
                c1575450r6FLIZJ.LJIIJ = null;
                ((C1575580r6S) awS459S0200000_24.l0).LIZJ().LIZLLL((EnumC1575470r6H) awS459S0200000_24.l1, ((C1575580r6S) awS459S0200000_24.l0).LIZLLL(), ((C1575580r6S) awS459S0200000_24.l0).LIZ());
            } else {
                ((C1575580r6S) awS459S0200000_24.l0).LIZJ().LIZIZ(true);
                ((C1575580r6S) awS459S0200000_24.l0).LIZJ().LIZ(summaryStats);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        if (obj2 != null) {
            C786410Ut5.LJLZ(0, (ViewGroup) ((C1575580r6S) awS459S0200000_24.l0).LL.LIZ.findViewById(R.id.ng2));
            C1575450r6F c1575450r6FLIZJ = ((C1575580r6S) awS459S0200000_24.l0).LIZJ();
            DialogC1389620mGW dialogC1389620mGW = c1575450r6FLIZJ.LJIIJ;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            c1575450r6FLIZJ.LJIIJ = null;
            ((C1575580r6S) awS459S0200000_24.l0).LIZJ().LIZLLL((EnumC1575470r6H) awS459S0200000_24.l1, ((C1575580r6S) awS459S0200000_24.l0).LIZLLL(), ((C1575580r6S) awS459S0200000_24.l0).LIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS459S0200000_24 awS459S0200000_24, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(((StoryWidgetGuideInboxCell) awS459S0200000_24.l0).itemView.getContext().getString(((C1598170rgt) awS459S0200000_24.l1).LLILLL));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(C1575580r6S c1575580r6S, EnumC1575470r6H enumC1575470r6H, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1575580r6S;
        this.l1 = enumC1575470r6H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, TakoBotCenterItemsAssem takoBotCenterItemsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.l1 = takoBotCenterItemsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(C19EG c19eg, ProfileRecommendationService profileRecommendationService, int i) {
        super(2);
        this.$t = i;
        this.l0 = profileRecommendationService;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf, int i) {
        super(2);
        this.$t = i;
        this.l0 = skylightListViewModel;
        this.l1 = c1598650rhf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(LiveEventCtaAnchorProvider liveEventCtaAnchorProvider, WeakReference weakReference, int i) {
        super(2);
        this.$t = i;
        this.l0 = weakReference;
        this.l1 = liveEventCtaAnchorProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(MiniDramaCenterNewStyleAssem miniDramaCenterNewStyleAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniDramaCenterNewStyleAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider, WeakReference weakReference, int i) {
        super(2);
        this.$t = i;
        this.l0 = weakReference;
        this.l1 = shortDramaReserveAnchorProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(SeriesPurchaseOptionFragment seriesPurchaseOptionFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = seriesPurchaseOptionFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(StoryWidgetGuideInboxCell storyWidgetGuideInboxCell, C1598170rgt c1598170rgt, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyWidgetGuideInboxCell;
        this.l1 = c1598170rgt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS459S0200000_24(TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoDisclaimerDialogProcessor;
        this.l1 = takoEnterParams;
    }
}
