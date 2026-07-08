package jg5;

import X.AbstractC20611515l3;
import X.C0CHQ;
import X.C1453870nw9;
import X.C1625380sOm;
import X.C1625400sOo;
import X.C1627310sRt;
import X.C1630870sXd;
import X.C1633850scR;
import X.C1635530sf9;
import X.C1635800sfa;
import X.C1647290sy7;
import X.C1650030t2X;
import X.C1660010tId;
import X.C1660720tJm;
import X.C1DRG;
import X.C214885197r;
import X.C297340Bl6;
import X.C343070Dcf;
import X.InterfaceC1628180sTI;
import X.InterfaceC1630220sWa;
import X.InterfaceC1635390sev;
import X.InterfaceC1635410sex;
import X.InterfaceC1636390sgX;
import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public class AvS182S0000000_25 extends AbstractC20611515l3 {
    public final int $t;

    public static final Object LIZIZ$0(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return c1drg;
    }

    /* JADX WARN: Type inference failed for: r0v102, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [X.1DRG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.1DRG, java.lang.Object] */
    @Override // X.AbstractC20611515l3
    public final C1DRG LIZIZ(C1DRG c1drg) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c1drg);
            case 1:
                return LIZIZ$1(this, c1drg);
            case 2:
                return LIZIZ$2(this, c1drg);
            case 3:
                return LIZIZ$3(this, c1drg);
            case 4:
                return LIZIZ$4(this, c1drg);
            case 5:
                return LIZIZ$5(this, c1drg);
            case 6:
                return LIZIZ$6(this, c1drg);
            case 7:
                return LIZIZ$7(this, c1drg);
            case 8:
                return LIZIZ$8(this, c1drg);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZIZ$9(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZIZ$10(this, c1drg);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZIZ$11(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZIZ$12(this, c1drg);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZIZ$13(this, c1drg);
            case 14:
                return LIZIZ$14(this, c1drg);
            case 15:
                return LIZIZ$15(this, c1drg);
            case 16:
                return LIZIZ$16(this, c1drg);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZIZ$17(this, c1drg);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZIZ$18(this, c1drg);
            case 19:
                return LIZIZ$19(this, c1drg);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZIZ$20(this, c1drg);
            case 21:
                return LIZIZ$21(this, c1drg);
            case 22:
                return LIZIZ$22(this, c1drg);
            case 23:
                return LIZIZ$23(this, c1drg);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZIZ$24(this, c1drg);
            case 25:
                return LIZIZ$25(this, c1drg);
            case 26:
                return LIZIZ$26(this, c1drg);
            case 27:
                return LIZIZ$27(this, c1drg);
            case 28:
                return LIZIZ$28(this, c1drg);
            case 29:
                return LIZIZ$29(this, c1drg);
            case 30:
                return LIZIZ$30(this, c1drg);
            case 31:
                return LIZIZ$31(this, c1drg);
            case 32:
                return LIZIZ$32(this, c1drg);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return LIZIZ$33(this, c1drg);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return LIZIZ$34(this, c1drg);
            case 35:
                return LIZIZ$35(this, c1drg);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return LIZIZ$36(this, c1drg);
            case 37:
                return LIZIZ$37(this, c1drg);
            case 38:
                return LIZIZ$38(this, c1drg);
            case 39:
                return LIZIZ$39(this, c1drg);
            case 40:
                return LIZIZ$40(this, c1drg);
            case 41:
                return LIZIZ$41(this, c1drg);
            default:
                return super.LIZIZ(c1drg);
        }
    }

    public AvS182S0000000_25(int i) {
        this.$t = i;
    }

    public static final Object LIZIZ$1(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$10(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        ((q) c1drg.LJII(q.class, null)).C0().getStickerRepository().LJFF().LJIIZILJ().observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skN
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchEffectModel data;
                InterfaceC1448230nn3 interfaceC1448230nn3LJJIIJZLJL = C1ER1.LIZIZ.LJJIIJZLJL();
                SearchEffectResponseV2 searchEffectResponseV2 = (SearchEffectResponseV2) ((C1641640sp0) obj).LIZ;
                if (searchEffectResponseV2 != null) {
                    data = searchEffectResponseV2.getData();
                } else {
                    data = null;
                }
                interfaceC1448230nn3LJJIIJZLJL.LJIIIZ(data);
            }
        });
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), ((q) c1drg.LJII(q.class, null)).C0(), ((q) c1drg.LJII(q.class, null)).w4(), new C1635530sf9((InterfaceC1635390sev) c1drg.LJII(InterfaceC1635390sev.class, null)), c1drg);
        tTSearchStickerViewModel.LLJLL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0nnu
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJJI((String) obj);
            }
        });
        tTSearchStickerViewModel.LLJZIJLIL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skS
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJIILJJIL(((C090E) obj).LIZ);
            }
        });
        tTSearchStickerViewModel.LLLFF = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
        ((q) c1drg.LJII(q.class, null)).IH0().LIZ((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new AObjectS246S0100000_25(tTSearchStickerViewModel, 284));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$11(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1647290sy7();
    }

    public static final Object LIZIZ$12(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY6
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }

    public static final Object LIZIZ$13(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        ((q) c1drg.LJII(q.class, null)).C0().getStickerRepository().LJFF().LJIIZILJ().observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skM
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchEffectModel data;
                InterfaceC1448230nn3 interfaceC1448230nn3LJJIIJZLJL = C1ER1.LIZIZ.LJJIIJZLJL();
                SearchEffectResponseV2 searchEffectResponseV2 = (SearchEffectResponseV2) ((C1641640sp0) obj).LIZ;
                if (searchEffectResponseV2 != null) {
                    data = searchEffectResponseV2.getData();
                } else {
                    data = null;
                }
                interfaceC1448230nn3LJJIIJZLJL.LJIIIZ(data);
            }
        });
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), ((q) c1drg.LJII(q.class, null)).C0(), ((q) c1drg.LJII(q.class, null)).w4(), new C1635530sf9((InterfaceC1635390sev) c1drg.LJII(InterfaceC1635390sev.class, null)), c1drg);
        tTSearchStickerViewModel.LLJLL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0nnt
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJJI((String) obj);
            }
        });
        tTSearchStickerViewModel.LLJZIJLIL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skR
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJIILJJIL(((C090E) obj).LIZ);
            }
        });
        tTSearchStickerViewModel.LLLFF = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
        ((q) c1drg.LJII(q.class, null)).IH0().LIZ((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new AObjectS246S0100000_25(tTSearchStickerViewModel, 278));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$14(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$15(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY8
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }

    public static final Object LIZIZ$16(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        C1630870sXd c1630870sXd = new C1630870sXd(null);
        c1630870sXd.LIZ("sticker_category:favorite", new C1635800sfa((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), (InterfaceC1628180sTI) c1drg.LJII(InterfaceC1628180sTI.class, null), ((q) c1drg.LJII(q.class, null)).C0(), (InterfaceC1630220sWa) c1drg.LJII(InterfaceC1630220sWa.class, null)));
        return c1630870sXd;
    }

    public static final Object LIZIZ$17(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY2
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }

    public static final Object LIZIZ$18(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), ((q) c1drg.LJII(q.class, null)).C0(), ((q) c1drg.LJII(q.class, null)).w4(), new C1635530sf9((InterfaceC1635390sev) c1drg.LJII(InterfaceC1635390sev.class, null)), c1drg);
        tTSearchStickerViewModel.LLLFF = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
        ((q) c1drg.LJII(q.class, null)).IH0().LIZ((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new AObjectS246S0100000_25(tTSearchStickerViewModel, 130));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$19(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return Boolean.valueOf(C343070Dcf.LIZIZ());
    }

    public static final Object LIZIZ$2(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$20(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1647290sy7();
    }

    public static final Object LIZIZ$21(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY4
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }

    public static final Object LIZIZ$22(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        ((q) c1drg.LJII(q.class, null)).C0().getStickerRepository().LJFF().LJIIZILJ().observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchEffectModel data;
                InterfaceC1448230nn3 interfaceC1448230nn3LJJIIJZLJL = C1ER1.LIZIZ.LJJIIJZLJL();
                SearchEffectResponseV2 searchEffectResponseV2 = (SearchEffectResponseV2) ((C1641640sp0) obj).LIZ;
                if (searchEffectResponseV2 != null) {
                    data = searchEffectResponseV2.getData();
                } else {
                    data = null;
                }
                interfaceC1448230nn3LJJIIJZLJL.LJIIIZ(data);
            }
        });
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), ((q) c1drg.LJII(q.class, null)).C0(), ((q) c1drg.LJII(q.class, null)).w4(), new C1635530sf9((InterfaceC1635390sev) c1drg.LJII(InterfaceC1635390sev.class, null)), c1drg);
        tTSearchStickerViewModel.LLJLL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0nns
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJJI((String) obj);
            }
        });
        tTSearchStickerViewModel.LLJZIJLIL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new Observer() { // from class: X.0skQ
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1ER1.LIZIZ.LJJIIJZLJL().LJIILJJIL(((C090E) obj).LIZ);
            }
        });
        tTSearchStickerViewModel.LLLFF = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
        ((q) c1drg.LJII(q.class, null)).IH0().LIZ((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new AObjectS246S0100000_25(tTSearchStickerViewModel, 712));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$23(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1647290sy7();
    }

    public static final Object LIZIZ$24(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        final InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS266S0000000_25.get$arr$(528));
        return new InterfaceC1635390sev(interfaceC1635410sexLIZ) { // from class: X.0seu
            public final /* synthetic */ InterfaceC1635390sev LL;
            public final /* synthetic */ InterfaceC1635390sev LLILLJJLI;

            @Override // X.InterfaceC1635390sev
            public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
                this.LL.LIZ(list, map, iFetchEffectListByIdsListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
                this.LL.LIZIZ(str, map, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
                this.LL.LIZJ(effect, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LIZLLL(String str) {
                this.LL.LIZLLL(str);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJ(effect, z, z2, z3, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.LJFF(list, z, map, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJI(str, z, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJII(Effect effect) {
                this.LL.LJII(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final boolean LJIIIIZZ(Effect effect) {
                return this.LL.LJIIIIZZ(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2) {
                this.LL.LJIIIZ(str, z, str2, i, i2, map, iFetchPanelInfoListener, z2);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIJ(List list, Map map, C396901gV c396901gV) {
                this.LL.LJIIJ(list, map, c396901gV);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
                this.LL.LJIIJJI(providerEffect, iDownloadProviderEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJIIL(effect, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633120sbG c1633120sbG) {
                this.LL.LJIILJJIL(str, str2, str3, i, i2, map, i3, c1633120sbG);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIZILJ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJIIZILJ(str, map, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJIJI(str, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final boolean LJIJJLI(Effect effect) {
                return this.LL.LJIJJLI(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIL(C1634110scr c1634110scr, InfoStickerEffect infoStickerEffect) {
                this.LL.LJIL(c1634110scr, infoStickerEffect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJ(Effect effect) {
                this.LL.LJJ(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIFFI(String str, int i, int i2, int i3, String str2, Map map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z) {
                this.LL.LJJIFFI(str, i, i2, i3, str2, map, iFetchPanelInfoListener, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJII(String str, EnumC1285060jXs enumC1285060jXs, boolean z, int i, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJII(str, enumC1285060jXs, z, i, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIII(String str, C1638390sjl c1638390sjl) {
                this.LL.LJJIII(str, c1638390sjl);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIIJZLJL(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, boolean z, String str, int i) {
                this.LL.LJJIIJZLJL(map, c13ma, z, str, i);
            }

            @Override // X.InterfaceC1635390sev
            public final EffectConfiguration LJJIIZ() {
                return this.LL.LJJIIZ();
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIIZI(String str, String str2, int i, int i2, int i3, String str3, C1631900sZI c1631900sZI) {
                this.LL.LJJIIZI(str, str2, i, i2, i3, str3, c1631900sZI);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJ(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633130sbH c1633130sbH) {
                this.LL.LJJIJ(str, str2, str3, i, i2, map, i3, c1633130sbH);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIIJI(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.LJJIJIIJI(list, z, map, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIIJIL(String str, String str2, int i, int i2, boolean z, String str3, String str4, IFetchProviderEffect iFetchProviderEffect) {
                this.LL.LJJIJIIJIL(str, str2, i, i2, z, str3, null, iFetchProviderEffect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIL(String str, Map map, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJIJIL(str, map, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJL(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener) {
                this.LL.LJJIJL(str, str2, i, map, iCheckChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJLIJ(String str) {
                this.LL.LJJIJLIJ(str);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJ(int i, int i2, int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, Map map, boolean z) {
                this.LL.LJJJ(i, i2, i3, i4, iFetchCategoryEffectListener, str, str2, str3, map, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJJI(str, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJIL(long j, C13MA<GetCustomizedEffectIDData> c13ma) {
                this.LL.LJJJIL(j, c13ma);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJJ(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, boolean z) {
                this.LL.LJJJJ(i, i2, i3, iFetchCategoryEffectListener, str, str2, str3, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJJI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJJJI(str, z, z2, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final EffectManager LLJILJILJ() {
                return this.LL.LLJILJILJ();
            }

            @Override // X.InterfaceC1635390sev
            public final void destroy() {
                this.LL.destroy();
            }

            @Override // X.InterfaceC1635390sev
            public final void lg(String str, String str2, IUpdateTagListener iUpdateTagListener) {
                this.LL.lg(str, str2, iUpdateTagListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
                this.LL.mg(str, list, str2, iIsTagNeedUpdatedListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void ng() {
                this.LL.ng();
            }

            @Override // X.InterfaceC1635390sev
            public final void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.og(list, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect) {
                this.LL.pg(str, i, i2, str2, null, map, iFetchProviderEffect);
            }

            @Override // X.InterfaceC1635390sev
            public final void qg(IModFavoriteList iModFavoriteList, String str, List list, boolean z) {
                this.LL.qg(iModFavoriteList, str, list, z);
            }

            {
                this.LLILLJJLI = interfaceC1635410sexLIZ;
                this.LL = interfaceC1635410sexLIZ;
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIZ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, int i3, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map) {
                if (Intrinsics.LJFF(str, "default")) {
                    iFetchPanelInfoListener.onSuccess(new PanelInfoModel("", new ArrayList(), null, null, null, null, new ArrayList(), null, null));
                } else {
                    this.LLILLJJLI.LJJIZ(str, z, str2, i, i2, z2, z3, i3, iFetchPanelInfoListener, map);
                }
            }
        };
    }

    public static final Object LIZIZ$25(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C214885197r((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null));
    }

    public static final Object LIZIZ$26(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY7
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }

    public static final Object LIZIZ$27(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        C1630870sXd c1630870sXd = new C1630870sXd(null);
        c1630870sXd.LIZ("sticker_category:favorite", new C1635800sfa((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), (InterfaceC1628180sTI) c1drg.LJII(InterfaceC1628180sTI.class, null), ((q) c1drg.LJII(q.class, null)).C0(), (InterfaceC1630220sWa) c1drg.LJII(InterfaceC1630220sWa.class, null)));
        return c1630870sXd;
    }

    public static final Object LIZIZ$28(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$29(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1453870nw9();
    }

    public static final Object LIZIZ$3(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$30(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1647290sy7();
    }

    public static final Object LIZIZ$31(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$32(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$33(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        if (C297340Bl6.LIZIZ()) {
            return C1633850scR.LIZ(C0CHQ.LIZ, null);
        }
        return C1633850scR.LIZ(C0CHQ.LIZ, AFwS266S0000000_25.get$arr$(546));
    }

    public static final Object LIZIZ$34(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C214885197r((ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null));
    }

    public static final Object LIZIZ$35(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$36(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1453870nw9();
    }

    public static final Object LIZIZ$37(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1660010tId(c1drg);
    }

    public static final Object LIZIZ$38(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1660720tJm(c1drg, AFwS214S0000000_25.get$arr$(564));
    }

    public static final Object LIZIZ$39(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$4(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1650030t2X(c1drg);
    }

    public static final Object LIZIZ$40(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1453870nw9();
    }

    public static final Object LIZIZ$41(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$5(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1650030t2X(c1drg);
    }

    public static final Object LIZIZ$6(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1627310sRt();
    }

    public static final Object LIZIZ$7(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625380sOm(c1drg);
    }

    public static final Object LIZIZ$8(AvS182S0000000_25 avS182S0000000_25, C1DRG c1drg) {
        return new C1625400sOo(c1drg);
    }

    public static final Object LIZIZ$9(AvS182S0000000_25 avS182S0000000_25, final C1DRG c1drg) {
        return new InterfaceC1636390sgX(c1drg) { // from class: X.0sY5
            public final C1635820sfc LIZ;

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZIZ() {
                return this.LIZ.LJII;
            }

            {
                this.LIZ = (C1635820sfc) c1drg.LJII(C1635820sfc.class, null);
            }

            @Override // X.InterfaceC1636390sgX
            public final boolean LIZ(Effect effect) {
                return C1624170sMp.LIZIZ(effect);
            }
        };
    }
}
