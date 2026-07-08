package kotlin.jvm.internal;

import X.AbstractC471570IeR;
import X.AbstractC712240Rwk;
import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C09AY;
import X.C0BT4;
import X.C0Q4X;
import X.C0QER;
import X.C0QLM;
import X.C0QNH;
import X.C0QOD;
import X.C0QOE;
import X.C0QV7;
import X.C123100dR;
import X.C1308910kAL;
import X.C1537480q70;
import X.C1540620qC4;
import X.C15438062q;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1846140y8q;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C2469809m4;
import X.C291001Au;
import X.C315220CXg;
import X.C622840Obq;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C653660PkS;
import X.C658220Pro;
import X.C659640Pu6;
import X.C669560QOc;
import X.C669790QOz;
import X.C677000Qh0;
import X.C677390Qhd;
import X.C679540Ql6;
import X.C689750R3t;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC622850Obr;
import X.EnumC669620QOi;
import X.InterfaceC1194850hCN;
import X.InterfaceC1631620sYq;
import X.InterfaceC1846180y8u;
import X.InterfaceC636730OyF;
import X.InterfaceC677090Qh9;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnAttachStateChangeListenerC655110Pmn;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel.VerticalPagerData;
import com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.EcSearchDealsSkinData;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.user.NimbleUserAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.ecommerce.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.result.BrandSkin;
import com.ss.android.ugc.aweme.search.result.ShopCardSkin;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class AwS659S0100000_10 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn, int i) {
        super(3);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC655110Pmn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(C658220Pro c658220Pro, int i) {
        super(3);
        this.$t = i;
        this.l0 = c658220Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(C677390Qhd c677390Qhd, int i) {
        super(3);
        this.$t = i;
        this.l0 = c677390Qhd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(C1540620qC4 c1540620qC4, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1540620qC4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(EcSearchResultContainerAssem ecSearchResultContainerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = ecSearchResultContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(GeneralVerticalSkinAssem generalVerticalSkinAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = generalVerticalSkinAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(PhotoSearchResultFragment photoSearchResultFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = photoSearchResultFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(NimbleUserAssem nimbleUserAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = nimbleUserAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(SearchVideoHolder searchVideoHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = searchVideoHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS659S0100000_10(SearchJediMixFeedFragment searchJediMixFeedFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [X.0Qgm] */
    public static final Object invoke$0(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        NextLiveData nextLiveData;
        NextLiveData nextLiveData2;
        int iIntValue;
        String stringOrNullStrategy;
        Integer numLIZJ;
        ViewGroup viewGroupKp;
        ECSearchEntranceData ecSearchEntranceData;
        List<EnumC669620QOi> list;
        String str;
        C650960Pg6 immutableData;
        C669560QOc c669560QOc;
        String str2;
        C650960Pg6 immutableData2;
        C669560QOc c669560QOc2;
        String str3;
        ECSearchEntranceData ecSearchEntranceData2;
        C650960Pg6 immutableData3;
        C669560QOc c669560QOc3;
        ECSearchEntranceData ecSearchEntranceData3;
        Integer numLIZJ2;
        List<EnumC669620QOi> list2 = (List) obj2;
        C291001Au c291001Au = (C291001Au) obj3;
        final EcSearchResultContainerAssem ecSearchResultContainerAssem = (EcSearchResultContainerAssem) awS659S0100000_10.l0;
        if (!ecSearchResultContainerAssem.LLJLLIL) {
            Integer num = (Integer) c291001Au.LIZ;
            SearchResultParam searchResultParam = ecSearchResultContainerAssem.LLJLIL;
            EnumC669620QOi enumC669620QOi = null;
            if (searchResultParam != null) {
                Context context = ecSearchResultContainerAssem.getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLp = ecSearchResultContainerAssem.lp();
                    if (viewOnAttachStateChangeListenerC20631115oDLp != null) {
                        viewOnAttachStateChangeListenerC20631115oDLp.setBackgroundColor(iIntValue2);
                    }
                }
                InterfaceC636730OyF fragmentItemOperator = ecSearchResultContainerAssem.lp().getFragmentItemOperator();
                C622840Obq c622840Obq = new C622840Obq();
                c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c622840Obq.LJIIIZ = iIntValue;
                fragmentItemOperator.LIZLLL(c622840Obq);
                ecSearchResultContainerAssem.lp().setSmoothScrollEnabled(false);
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam != null && (ecSearchEntranceData3 = searchEnterParam.getEcSearchEntranceData()) != null) {
                    stringOrNullStrategy = ecSearchEntranceData3.getStringOrNullStrategy("single_tab_type");
                } else {
                    stringOrNullStrategy = null;
                }
                if (stringOrNullStrategy == null) {
                    C646000PVm c646000PVm = C650950Pg5.Companion;
                    C19EG c19egLIZ = C724240Sb0.LIZ(ecSearchResultContainerAssem);
                    c646000PVm.getClass();
                    C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(null, c19egLIZ);
                    if (c650950Pg5LJIIIZ != null && (immutableData3 = c650950Pg5LJIIIZ.getImmutableData()) != null && (c669560QOc3 = immutableData3.searchEcommerceModel) != null) {
                        str2 = c669560QOc3.singleTabType;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "shop")) {
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(ecSearchResultContainerAssem);
                        c646000PVm.getClass();
                        C650950Pg5 c650950Pg5LJIIIZ2 = C646000PVm.LJIIIZ(null, c19egLIZ2);
                        if (c650950Pg5LJIIIZ2 != null && (immutableData2 = c650950Pg5LJIIIZ2.getImmutableData()) != null && (c669560QOc2 = immutableData2.searchEcommerceModel) != null && (str3 = c669560QOc2.singleTabType) != null && searchEnterParam != null && (ecSearchEntranceData2 = searchEnterParam.getEcSearchEntranceData()) != null) {
                            ecSearchEntranceData2.updateFeatureStrategy("single_tab_type", str3);
                        }
                    }
                }
                ecSearchResultContainerAssem.LLJLILLLLZIIL = new C669790QOz(searchEnterParam);
                com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Integer> nextLiveData3 = ecSearchResultContainerAssem.up().LLILZ;
                if (num == null) {
                    num = 0;
                }
                nextLiveData3.setValue(num);
                C1846140y8q c1846140y8qIp = ecSearchResultContainerAssem.ip();
                if (c1846140y8qIp != null) {
                    int visibility = c1846140y8qIp.getVisibility();
                    c1846140y8qIp.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1846140y8qIp);
                }
                if (searchEnterParam != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
                    if (C315220CXg.LIZ().LJLIIL(searchResultParam, true) != null) {
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLp2 = ecSearchResultContainerAssem.lp();
                        if (viewOnAttachStateChangeListenerC20631115oDLp2 != null) {
                            viewOnAttachStateChangeListenerC20631115oDLp2.setBackgroundColor(0);
                        }
                    } else {
                        C1846140y8q c1846140y8qIp2 = ecSearchResultContainerAssem.ip();
                        if (c1846140y8qIp2 != null) {
                            c1846140y8qIp2.LLJJI = true;
                            c1846140y8qIp2.LLILZLL.invalidate();
                        }
                    }
                    if (C123100dR.LIZ(ecSearchEntranceData.getStringOrNullStrategy("single_tab_type"))) {
                        ecSearchResultContainerAssem.LLLI = true;
                    }
                    if (ecSearchEntranceData.getStringOrNullStrategy("single_tab_type") == null) {
                        C646000PVm c646000PVm2 = C650950Pg5.Companion;
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(ecSearchResultContainerAssem);
                        c646000PVm2.getClass();
                        C650950Pg5 c650950Pg5LJIIIZ3 = C646000PVm.LJIIIZ(null, c19egLIZ3);
                        if (c650950Pg5LJIIIZ3 != null && (immutableData = c650950Pg5LJIIIZ3.getImmutableData()) != null && (c669560QOc = immutableData.searchEcommerceModel) != null) {
                            str = c669560QOc.singleTabType;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, "shop")) {
                            ecSearchResultContainerAssem.LLLI = true;
                        }
                    }
                    C669790QOz c669790QOz = ecSearchResultContainerAssem.LLJLILLLLZIIL;
                    if (c669790QOz != null && (list = c669790QOz.LIZ) != null && ((ArrayList) list).size() == 1) {
                        ecSearchResultContainerAssem.LLLI = true;
                    }
                    if (ecSearchResultContainerAssem.LLLI) {
                        View viewOp = ecSearchResultContainerAssem.op();
                        if (viewOp != null) {
                            C786410Ut5.LJLLLLLL(8, viewOp);
                        }
                        View viewSp = ecSearchResultContainerAssem.sp();
                        if (viewSp != null) {
                            C786410Ut5.LJLLLLLL(8, viewSp);
                        }
                    }
                }
                if (!ecSearchResultContainerAssem.LLLI && (viewGroupKp = ecSearchResultContainerAssem.kp()) != null) {
                    viewGroupKp.setBackgroundColor(0);
                }
                C1846140y8q c1846140y8qIp3 = ecSearchResultContainerAssem.ip();
                if (c1846140y8qIp3 != null) {
                    c1846140y8qIp3.setBackgroundColor(0);
                }
                if (C0QV7.LIZ()) {
                    try {
                        C1846140y8q c1846140y8qIp4 = ecSearchResultContainerAssem.ip();
                        if (c1846140y8qIp4 != null) {
                            Context context2 = ecSearchResultContainerAssem.getContext();
                            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                                int iIntValue3 = numLIZJ.intValue();
                                View viewOp2 = ecSearchResultContainerAssem.op();
                                if (viewOp2 != null) {
                                    viewOp2.setBackgroundColor(iIntValue3);
                                }
                            }
                            if (C0BT4.LIZ()) {
                                c1846140y8qIp4.setUseTextWidth(true);
                                c1846140y8qIp4.setHorizontalPadding(6);
                                c1846140y8qIp4.LLJJI = false;
                                c1846140y8qIp4.LLILZLL.invalidate();
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                Integer num2 = ecSearchResultContainerAssem.LLLFF;
                if (num2 != null) {
                    ecSearchResultContainerAssem.hp(num2.intValue());
                }
                C1846140y8q c1846140y8qIp5 = ecSearchResultContainerAssem.ip();
                if (c1846140y8qIp5 != null) {
                    final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLp3 = ecSearchResultContainerAssem.lp();
                    final C677000Qh0 c677000Qh0 = new C677000Qh0(c1846140y8qIp5, viewOnAttachStateChangeListenerC20631115oDLp3, new InterfaceC677090Qh9() { // from class: X.0Qgm
                        @Override // X.InterfaceC677090Qh9
                        public final void LIZ(C676930Qgt c676930Qgt, int i) {
                            Context context3;
                            EnumC669620QOi enumC669620QOiYC0;
                            C669790QOz c669790QOz2;
                            EcSearchResultContainerAssem ecSearchResultContainerAssem2 = ecSearchResultContainerAssem;
                            CharSequence string = null;
                            if (ecSearchResultContainerAssem2.GX() && (enumC669620QOiYC0 = ecSearchResultContainerAssem2.yC0()) != null && (c669790QOz2 = ecSearchResultContainerAssem2.LLJLILLLLZIIL) != null && c669790QOz2.LIZIZ(i) == enumC669620QOiYC0) {
                                EcSearchResultContainerAssem ecSearchResultContainerAssem3 = ecSearchResultContainerAssem;
                                string = ecSearchResultContainerAssem3.tp(ecSearchResultContainerAssem3.LLL);
                            } else {
                                EcSearchResultContainerAssem ecSearchResultContainerAssem4 = ecSearchResultContainerAssem;
                                C669790QOz c669790QOz3 = ecSearchResultContainerAssem4.LLJLILLLLZIIL;
                                if (c669790QOz3 != null && (context3 = ecSearchResultContainerAssem4.getContext()) != null) {
                                    int i2 = C0QP0.LIZ[((EnumC669620QOi) ListProtector.get(c669790QOz3.LIZ, i)).ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            if (i2 != 3) {
                                                if (i2 == 4) {
                                                    string = context3.getString(R.string.video);
                                                }
                                            } else {
                                                string = "LIVE";
                                            }
                                        } else {
                                            string = context3.getString(2131833032);
                                        }
                                    } else {
                                        string = context3.getString(2131833031);
                                    }
                                }
                            }
                            c676930Qgt.LIZ(string);
                        }
                    });
                    if (!c677000Qh0.LJ) {
                        InterfaceC1194850hCN currentOperator = viewOnAttachStateChangeListenerC20631115oDLp3.getCurrentOperator();
                        c677000Qh0.LIZLLL = currentOperator;
                        if (currentOperator != null) {
                            c677000Qh0.LJ = true;
                            final C1846140y8q c1846140y8q = c677000Qh0.LIZ;
                            viewOnAttachStateChangeListenerC20631115oDLp3.registerOnPageChangeCallback(new AbstractC712240Rwk(c1846140y8q) { // from class: X.0Qh1
                                public final WeakReference<C1846140y8q> LL;
                                public int LLILLL = 0;
                                public int LLILLJJLI = 0;

                                {
                                    this.LL = new WeakReference<>(c1846140y8q);
                                }

                                @Override // X.AbstractC712240Rwk
                                public final void onPageScrollStateChanged(int i) {
                                    this.LLILLJJLI = this.LLILLL;
                                    this.LLILLL = i;
                                }

                                @Override // X.AbstractC712240Rwk
                                public final void onPageSelected(int i) {
                                    boolean z;
                                    C1846140y8q c1846140y8q2 = this.LL.get();
                                    if (c1846140y8q2 != null && c1846140y8q2.getSelectedTabPosition() != i && i < c1846140y8q2.getTabCount()) {
                                        int i2 = this.LLILLL;
                                        if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c1846140y8q2.LJIIJ(c1846140y8q2.LJ(i), z);
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
                                  0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // X.AbstractC712240Rwk
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onPageScrolled(int r7, float r8, int r9) {
                                    /*
                                        r6 = this;
                                        java.lang.ref.WeakReference<X.0y8q> r0 = r6.LL
                                        java.lang.Object r5 = r0.get()
                                        X.0y8q r5 = (X.C1846140y8q) r5
                                        if (r5 == 0) goto L1e
                                        int r4 = r6.LLILLL
                                        r3 = 0
                                        r2 = 2
                                        r1 = 1
                                        if (r4 != r2) goto L1f
                                        int r0 = r6.LLILLJJLI
                                        if (r0 == r1) goto L1f
                                        r1 = 0
                                    L16:
                                        int r0 = r6.LLILLJJLI
                                        if (r0 == 0) goto L1b
                                    L1a:
                                        r3 = 1
                                    L1b:
                                        r5.LJIIL(r7, r8, r1, r3)
                                    L1e:
                                        return
                                    L1f:
                                        r1 = 1
                                        if (r4 != r2) goto L1a
                                        goto L16
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C677010Qh1.onPageScrolled(int, float, int):void");
                                }
                            });
                            InterfaceC1846180y8u interfaceC1846180y8u = new InterfaceC1846180y8u(viewOnAttachStateChangeListenerC20631115oDLp3) { // from class: X.0Qh7
                                public final ViewOnAttachStateChangeListenerC20631115oD LIZ;

                                @Override // X.InterfaceC1846180y8u
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC1846180y8u
                                public final void LIZIZ() {
                                }

                                {
                                    this.LIZ = viewOnAttachStateChangeListenerC20631115oDLp3;
                                }

                                @Override // X.InterfaceC1846180y8u
                                public final void LIZJ(C676930Qgt c676930Qgt) {
                                    this.LIZ.setCurrentItem(c676930Qgt.LIZIZ);
                                }
                            };
                            if (!c1846140y8qIp5.LLJJIJIIJIL.contains(interfaceC1846180y8u)) {
                                c1846140y8qIp5.LLJJIJIIJIL.add(interfaceC1846180y8u);
                            }
                            AbstractC471570IeR abstractC471570IeR = new AbstractC471570IeR() { // from class: X.0Qgz
                                @Override // X.AbstractC471570IeR
                                public final void LIZ() {
                                    c677000Qh0.LIZJ();
                                }

                                @Override // X.AbstractC471570IeR
                                public final void LIZIZ(int i, int i2) {
                                    LIZJ(i, i2, null);
                                }

                                @Override // X.AbstractC471570IeR
                                public final void LIZLLL(int i, int i2) {
                                    c677000Qh0.LIZIZ(i, i2);
                                    c677000Qh0.LIZ();
                                }

                                @Override // X.AbstractC471570IeR
                                public final void LJ(int i, int i2) {
                                    c677000Qh0.LIZLLL(i, 1);
                                    c677000Qh0.LIZIZ(i2, 1);
                                    c677000Qh0.LIZ();
                                }

                                @Override // X.AbstractC471570IeR
                                public final void LJFF(int i, int i2) {
                                    c677000Qh0.LIZLLL(i, i2);
                                    c677000Qh0.LIZ();
                                }

                                @Override // X.AbstractC471570IeR
                                public final void LIZJ(int i, int i2, Object obj4) {
                                    c677000Qh0.LIZLLL(i, i2);
                                    c677000Qh0.LIZIZ(i, i2);
                                    c677000Qh0.LIZ();
                                }
                            };
                            InterfaceC1194850hCN interfaceC1194850hCN = c677000Qh0.LIZLLL;
                            if (interfaceC1194850hCN != null) {
                                interfaceC1194850hCN.LJI(abstractC471570IeR);
                            }
                            c677000Qh0.LIZJ();
                            c1846140y8qIp5.LJIIL(viewOnAttachStateChangeListenerC20631115oDLp3.getCurrentItem(), 0.0f, true, true);
                        } else {
                            "TabLayoutMediator attached before PowerViewPager has an operator".toString();
                            throw new IllegalStateException("TabLayoutMediator attached before PowerViewPager has an operator");
                        }
                    } else {
                        "TabLayoutMediator is already attached".toString();
                        throw new IllegalStateException("TabLayoutMediator is already attached");
                    }
                }
                C1846140y8q c1846140y8qIp6 = ecSearchResultContainerAssem.ip();
                if (c1846140y8qIp6 != null) {
                    c1846140y8qIp6.setOnTabClickListener(new AwS589S0100000_10(ecSearchResultContainerAssem, 643));
                }
                if (ecSearchResultContainerAssem.yN2()) {
                    C1846140y8q c1846140y8qIp7 = ecSearchResultContainerAssem.ip();
                    if (c1846140y8qIp7 != null) {
                        c1846140y8qIp7.setHorizontalFadingEdgeEnabled(true);
                    }
                } else {
                    C1846140y8q c1846140y8qIp8 = ecSearchResultContainerAssem.ip();
                    if (c1846140y8qIp8 != null) {
                        c1846140y8qIp8.setHorizontalFadingEdgeEnabled(false);
                    }
                }
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (EnumC669620QOi enumC669620QOi2 : list2) {
                        arrayList.add(new VerticalPagerData(enumC669620QOi2, list2.indexOf(enumC669620QOi2)));
                    }
                    ecSearchResultContainerAssem.lp().getFragmentItemOperator().getState().LJIILL(arrayList, null);
                }
                ecSearchResultContainerAssem.lp().registerOnPageChangeCallback(new C689750R3t(ecSearchResultContainerAssem, searchResultParam, 1));
                ecSearchResultContainerAssem.LLJLLIL = true;
            }
            if (C0QV7.LIZ()) {
                View viewOp3 = ecSearchResultContainerAssem.op();
                if (viewOp3 != null) {
                    HandlerHook.viewPost(viewOp3, new ARunnableS110S0100000_10(ecSearchResultContainerAssem, 188));
                }
                SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) ecSearchResultContainerAssem.LLLFFI.getValue();
                if (searchContainerHeaderVM != null && (nextLiveData2 = searchContainerHeaderVM.LLILLL) != null) {
                    nextLiveData2.observe(ecSearchResultContainerAssem, new AObserverS214S0100000_10(ecSearchResultContainerAssem, 157));
                }
                SearchContainerHeaderVM searchContainerHeaderVM2 = (SearchContainerHeaderVM) ecSearchResultContainerAssem.LLLFFI.getValue();
                if (searchContainerHeaderVM2 != null && (nextLiveData = searchContainerHeaderVM2.LLILZIL) != null) {
                    nextLiveData.observe(ecSearchResultContainerAssem, new AObserverS214S0100000_10(ecSearchResultContainerAssem, 158));
                }
            }
            SearchResultParam searchResultParam2 = ((EcSearchResultContainerAssem) awS659S0100000_10.l0).LLJLIL;
            if (searchResultParam2 != null) {
                if (list2 != null) {
                    enumC669620QOi = (EnumC669620QOi) ListProtector.get(list2, ((Number) c291001Au.LIZ).intValue());
                }
                searchResultParam2.setEcomTargetTab(enumC669620QOi);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        SearchSkinAbility searchSkinAbility;
        int iIntValue;
        C0QNH c0qnh;
        ThemeImage themeImage;
        C0QER c0qer;
        Integer numValueOf;
        String strLIZJ;
        String strLIZJ2;
        String str;
        String str2;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C0QOD c0qod = (C0QOD) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if (iIntValue2 > 0) {
            GeneralVerticalSkinAssem generalVerticalSkinAssem = (GeneralVerticalSkinAssem) awS659S0100000_10.l0;
            generalVerticalSkinAssem.getClass();
            try {
                C0Q4X c0q4xLo = generalVerticalSkinAssem.Lo();
                if (c0q4xLo != null) {
                    c0qer = c0q4xLo.LLILLJJLI;
                } else {
                    c0qer = null;
                }
                EcSearchDealsSkinData ecSearchDealsSkinDataLJLI = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJLI(c0qer, false);
                if (ecSearchDealsSkinDataLJLI != null) {
                    C0QNH c0qnh2 = ecSearchDealsSkinDataLJLI.searchBarTheme;
                    ThemeColor themeColor = ecSearchDealsSkinDataLJLI.backgroundColor;
                    if (themeColor != null && (str2 = themeColor.light) != null) {
                        strLIZJ = C2469809m4.LIZJ(str2);
                    } else {
                        strLIZJ = null;
                    }
                    ThemeColor themeColor2 = ecSearchDealsSkinDataLJLI.backgroundColor;
                    if (themeColor2 != null && (str = themeColor2.dark) != null) {
                        strLIZJ2 = C2469809m4.LIZJ(str);
                    } else {
                        strLIZJ2 = null;
                    }
                    C0QLM c0qlm = new C0QLM(c0qnh2, new ThemeColor(strLIZJ, strLIZJ2), ecSearchDealsSkinDataLJLI.backgroundImage, null, new AwS48S0001000_3(iIntValue2, 3), null, 40);
                    SearchSkinAbility searchSkinAbility2 = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(generalVerticalSkinAssem), SearchSkinAbility.class, null);
                    if (searchSkinAbility2 != null) {
                        searchSkinAbility2.Z01(C0QOE.TAB_PROMOTION, c0qlm);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tab_promotion");
                    sbLIZ.append(c0qlm);
                    numValueOf = Integer.valueOf(Log.d("EcSearchSkinBgAssem", C2188811AlT.LIZIZ(sbLIZ)));
                } else {
                    numValueOf = null;
                }
                C189200o6.m2constructorimpl(numValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (c0qod != null) {
                GeneralVerticalSkinAssem generalVerticalSkinAssem2 = (GeneralVerticalSkinAssem) awS659S0100000_10.l0;
                if (c0qod instanceof BrandSkin) {
                    SearchSkinAbility searchSkinAbility3 = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), SearchSkinAbility.class, null);
                    if (searchSkinAbility3 != null) {
                        BrandSkin brandSkin = (BrandSkin) c0qod;
                        searchSkinAbility3.Z01(C0QOE.STORE, new C0QLM(null, null, new ThemeImage(brandSkin.imageLight, brandSkin.imageDark), null, new AwS48S0001000_3(iIntValue2, 1), null, 33));
                    }
                } else if ((c0qod instanceof ShopCardSkin) && (searchSkinAbility = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), SearchSkinAbility.class, null)) != null) {
                    C0QOE c0qoe = C0QOE.STORE;
                    ShopCardSkin shopCardSkin = (ShopCardSkin) c0qod;
                    Integer num = shopCardSkin.searchBoxStyleType;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    generalVerticalSkinAssem2.getClass();
                    if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            if (iIntValue != 4) {
                                if (iIntValue != 5) {
                                    c0qnh = C0QNH.ONLINE_AUTO;
                                } else {
                                    c0qnh = C0QNH.ENHANCED_LIGHT;
                                }
                            } else {
                                c0qnh = C0QNH.ENHANCED_DARK;
                            }
                        } else {
                            c0qnh = C0QNH.DEALS_LIGHT;
                        }
                    } else {
                        c0qnh = C0QNH.DEALS_DARK;
                    }
                    ThemeColor themeColor3 = shopCardSkin.headerMaskColor;
                    if (themeColor3 == null) {
                        themeColor3 = new ThemeColor("#FFFFFFB2", "#000000B2");
                    }
                    Boolean bool = shopCardSkin.enableUseFullPic;
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.LJFF(bool, bool2)) {
                        themeImage = shopCardSkin.fullThemeImage;
                    } else {
                        themeImage = shopCardSkin.middlehemeImage;
                    }
                    Intrinsics.LJFF(shopCardSkin.enableUseFullPic, bool2);
                    searchSkinAbility.Z01(c0qoe, new C0QLM(c0qnh, shopCardSkin.fullThemeColor, themeImage, themeColor3, new AwS48S0001000_3(iIntValue2, 2), null, 32));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS659S0100000_10 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS659S0100000_10.invoke$10(kotlin.jvm.internal.AwS659S0100000_10, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        C679540Ql6 c679540Ql6;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 == null || (c679540Ql6 = (C679540Ql6) c1537480q70.LJFF(C679540Ql6.class)) == null) {
            return null;
        }
        return ((C1540620qC4) awS659S0100000_10.l0).LJI(c679540Ql6);
    }

    public static final Object invoke$12(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        ((ViewOnAttachStateChangeListenerC655110Pmn) awS659S0100000_10.l0).f6((Aweme) obj, (C653660PkS) obj2, (SearchCardInfo) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        User user = ((NimbleUserAssem) awS659S0100000_10.l0).LLJLL;
        if (user != null && Intrinsics.LJFF(user.getUid(), obj)) {
            user.setBlocked(zBooleanValue);
            user.isBlock = zBooleanValue2;
            if (zBooleanValue2) {
                user.setFollowStatus(0);
            }
            ((NimbleUserAssem) awS659S0100000_10.l0).op(user);
            ((NimbleUserAssem) awS659S0100000_10.l0).up(user);
            INimbleUserDependAbility iNimbleUserDependAbilityTp = ((NimbleUserAssem) awS659S0100000_10.l0).tp();
            if (iNimbleUserDependAbilityTp != null) {
                iNimbleUserDependAbilityTp.Aq0();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        ((SearchVideoHolder) awS659S0100000_10.l0).I7(null, new C659640Pu6((Float) obj, (Float) obj2, (Map) obj3, false, null, 24));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C658220Pro c658220Pro = (C658220Pro) awS659S0100000_10.l0;
        c658220Pro.LL.LJFF(iIntValue, (View) obj, (Aweme) obj3, c658220Pro.LLILZLL, false);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int iIntValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        List<? extends Aweme> list = ((C658220Pro) awS659S0100000_10.l0).LLILZLL;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            if (!AwemeSaaSExtKt.isLive(aweme2)) {
                arrayList.add(aweme2);
            }
        }
        ((C658220Pro) awS659S0100000_10.l0).LL.LJFF(iIntValue, view, aweme, arrayList, false);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C658220Pro c658220Pro = (C658220Pro) awS659S0100000_10.l0;
        c658220Pro.LL.LJFF(iIntValue, (View) obj, (Aweme) obj3, c658220Pro.LLILZLL, false);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS659S0100000_10 awS659S0100000_10, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int iIntValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        List<? extends Aweme> list = ((C658220Pro) awS659S0100000_10.l0).LLILZLL;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            if (!AwemeSaaSExtKt.isLive(aweme2)) {
                arrayList.add(aweme2);
            }
        }
        ((C658220Pro) awS659S0100000_10.l0).LL.LJFF(iIntValue, view, aweme, arrayList, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS659S0100000_10 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            X.05hW r5 = (X.C1422405hW) r5
            X.0Qhf r6 = (X.C677410Qhf) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            r0.getClass()
            r3 = 0
            if (r5 == 0) goto L32
            X.08Us r0 = X.C2126308Ur.LIZLLL
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0Qhb r1 = new X.0Qhb
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            r1.<init>(r5, r0, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM r0 = r0.LLILZ
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.05hW> r0 = r0.LLJJI
            if (r0 == 0) goto L32
            r0.postValue(r5)
        L32:
            if (r6 == 0) goto L6f
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            X.0Qiq r0 = r0.LLILLL
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r3 = r0.LJIIL
            if (r3 == 0) goto L5c
            com.google.gson.n r2 = new com.google.gson.n
            r2.<init>()
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r2.LJJIII(r1, r0)
            java.lang.String r1 = "search_id"
            java.lang.String r0 = ""
            r2.LJJIIJ(r1, r0)
            java.lang.String r0 = "page_search"
            r3.wQ2(r2, r0)
        L5c:
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            X.0QgD r0 = r0.LL
            if (r0 == 0) goto L6f
            X.0QeI r2 = r0.LIZ
            if (r2 == 0) goto L6f
            java.lang.Throwable r1 = r6.LIZ
            java.lang.Integer r0 = r6.LIZIZ
            r2.LIZ(r0, r1)
        L6f:
            X.0Qeu r0 = X.EnumC675700Qeu.FULL_PAGE_REFRESH
            int r1 = r0.getValue()
            if (r7 == 0) goto L7d
            int r0 = r7.intValue()
            if (r0 == r1) goto L8b
        L7d:
            X.0Qeu r0 = X.EnumC675700Qeu.CONTENT_LIST_REFRESH
            int r1 = r0.getValue()
            if (r7 == 0) goto La4
            int r0 = r7.intValue()
            if (r0 != r1) goto La4
        L8b:
            java.lang.Object r0 = r4.l0
            X.0Qhd r0 = (X.C677390Qhd) r0
            X.0Qip r0 = r0.LLILZIL
            if (r0 == 0) goto La4
            X.0Qir r1 = r0.LJIILL
            if (r1 == 0) goto La4
            r0 = -1
            r1.LLILZ = r0
            r0 = 0
            r1.LLILZIL = r0
            X.0QgE r0 = r1.LL
            if (r0 == 0) goto La4
            r0.reset()
        La4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS659S0100000_10.invoke$8(kotlin.jvm.internal.AwS659S0100000_10, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS659S0100000_10 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            android.view.View r7 = (android.view.View) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.floatValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r5 = r9.floatValue()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment) r0
            com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchBottomPanelViewModel r1 = r0.LLIZLLLIL
            r0 = 0
            if (r1 == 0) goto L1c
            int r0 = r1.LLIZLLLIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L1c:
            r4 = 1
            if (r0 == 0) goto L78
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L78
            r2 = 1
        L27:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment r0 = (com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment) r0
            X.16GX r1 = r0.LLILLJJLI
            boolean r0 = r1 instanceof X.C20747416Gq
            if (r0 == 0) goto L76
            X.16Gq r1 = (X.C20747416Gq) r1
            if (r1 == 0) goto L76
            boolean r0 = r1.LJIIIIZZ()
            if (r0 != 0) goto L76
            r0 = 1
        L3c:
            r3 = r0 ^ 1
            boolean r0 = r7 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L6b
            if (r2 == 0) goto L74
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L69
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 == 0) goto L69
            r1 = 1
        L51:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            boolean r0 = r7.canScrollVertically(r4)
            if (r0 == 0) goto L67
            r0 = 1
        L5c:
            if (r1 != 0) goto L62
            if (r0 != 0) goto L62
            if (r3 != 0) goto L74
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L67:
            r0 = 0
            goto L5c
        L69:
            r1 = 0
            goto L51
        L6b:
            boolean r0 = r7 instanceof X.C16GX
            if (r0 == 0) goto L74
            if (r3 != 0) goto L74
            if (r2 == 0) goto L74
            goto L62
        L74:
            r4 = 0
            goto L62
        L76:
            r0 = 0
            goto L3c
        L78:
            r2 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS659S0100000_10.invoke$9(kotlin.jvm.internal.AwS659S0100000_10, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
