package g1c;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC420730Ged;
import X.C00ZL;
import X.C09HE;
import X.C0OBG;
import X.C0PRC;
import X.C0Q1G;
import X.C0Q3E;
import X.C0QAX;
import X.C0QCF;
import X.C0QXE;
import X.C0QXR;
import X.C0WZX;
import X.C0XQ7;
import X.C1018703yb;
import X.C128Y;
import X.C1357120lQ6;
import X.C1388190mED;
import X.C1558520qew;
import X.C19EG;
import X.C1A3S;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C259800zU;
import X.C426160GnO;
import X.C654590Plx;
import X.C655220Pmy;
import X.C655440PnK;
import X.C661010PwJ;
import X.C662730Pz5;
import X.C662850PzH;
import X.C662860PzI;
import X.C668260QJc;
import X.C671780QWq;
import X.C671910QXd;
import X.C672020QXo;
import X.C672120QXy;
import X.C674040QcE;
import X.C675940QfI;
import X.C675950QfJ;
import X.C676280Qfq;
import X.C676850Qgl;
import X.C677180QhI;
import X.C679720QlO;
import X.C680790Qn7;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC657940PrM;
import X.EnumC670460QRo;
import X.EnumC674020QcC;
import X.InterfaceC645880PVa;
import X.InterfaceC662740Pz6;
import X.InterfaceC662780PzA;
import X.InterfaceC671770QWp;
import X.InterfaceC676690QgV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.config.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcHintInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcStoreInfoV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.VideoVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.ui.SearchHelpPostCardContentAssem;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.SearchSevenSplitScreenFragment;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AjS65S0100000_10 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS65S0100000_10(SearchHelpPostCardContentAssem searchHelpPostCardContentAssem, int i) {
        super(500L);
        this.$t = i;
        this.l0 = searchHelpPostCardContentAssem;
    }

    public static final void LIZ$0(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((C0QCF) ajS65S0100000_10.l0).getFlowLayout().setMaxTagLines(0);
            ((C0QCF) ajS65S0100000_10.l0).getFlowLayout().addView(((C0QCF) ajS65S0100000_10.l0).getFoldView());
            C0QCF c0qcf = (C0QCF) ajS65S0100000_10.l0;
            c0qcf.LLILZIL = !c0qcf.LLILZIL;
            Function1<? super View, Unit> function1 = c0qcf.LLIZ;
            if (function1 != null) {
                function1.invoke(view);
            }
        }
    }

    public static final void LIZ$1(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((C0QCF) ajS65S0100000_10.l0).getFlowLayout().setMaxTagLines(((C0QCF) ajS65S0100000_10.l0).LLILZ);
            C426160GnO flowLayout = ((C0QCF) ajS65S0100000_10.l0).getFlowLayout();
            TuxIconView foldView = ((C0QCF) ajS65S0100000_10.l0).getFoldView();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(flowLayout, foldView);
            flowLayout.removeView(foldView);
            C0QCF c0qcf = (C0QCF) ajS65S0100000_10.l0;
            c0qcf.LLILZIL = !c0qcf.LLILZIL;
            Function1<? super View, Unit> function1 = c0qcf.LLIZLLLIL;
            if (function1 != null) {
                function1.invoke(view);
            }
        }
    }

    public static final void LIZ$10(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((Function1) ajS65S0100000_10.l0).invoke(view);
        }
    }

    public static final void LIZ$11(AjS65S0100000_10 ajS65S0100000_10, View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (view != null && (viewOnAttachStateChangeListenerC20604515jv = ((VideoVerticalAssem) ajS65S0100000_10.l0).LLIZLLLIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
    }

    public static final void LIZ$12(AjS65S0100000_10 ajS65S0100000_10, View view) {
        PhotoSearchBaseVM photoSearchBaseVM;
        PhotoSearchEntranceConfig photoSearchEntranceConfig;
        if (view != null) {
            PhotoSearchResultFragment photoSearchResultFragment = (PhotoSearchResultFragment) ajS65S0100000_10.l0;
            photoSearchResultFragment.getClass();
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (photoSearchBaseVM = photoSearchResultFragment.LLIZ) != null && (photoSearchEntranceConfig = photoSearchBaseVM.LLILLJJLI) != null && photoSearchEntranceConfig.enableRepeatSearchGuide) {
                C675950QfJ.LIZ.getClass();
                if (C675950QfJ.LIZ().getLong("last_show_repeat_search_guide_time", -1L) <= 0) {
                    C677180QhI c677180QhI = C677180QhI.LIZ;
                    PhotoSearchBaseVM photoSearchBaseVM2 = photoSearchResultFragment.LLIZ;
                    c677180QhI.getClass();
                    if (C677180QhI.LIZ(photoSearchResultFragment, photoSearchBaseVM2)) {
                        C675950QfJ.LIZ().storeLong("last_show_repeat_search_guide_time", System.currentTimeMillis());
                        return;
                    }
                }
            }
            PhotoSearchBaseVM photoSearchBaseVM3 = ((PhotoSearchResultFragment) ajS65S0100000_10.l0).LLIZ;
            if (photoSearchBaseVM3 != null) {
                photoSearchBaseVM3.BQ2();
            }
            C19EG activity = ((PhotoSearchResultFragment) ajS65S0100000_10.l0).getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$13(AjS65S0100000_10 ajS65S0100000_10, View view) {
        DialogFragment dialogFragment;
        if (view != null && (dialogFragment = (DialogFragment) ((C259800zU) ajS65S0100000_10.l0).element) != null) {
            dialogFragment.dismiss();
        }
    }

    public static final void LIZ$14(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((C0QAX) ajS65S0100000_10.l0).LL.invoke();
            C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
            C0QAX c0qax = (C0QAX) ajS65S0100000_10.l0;
            Product product = c0qax.LLJI;
            C655440PnK c655440PnK = c0qax.LLILZLL;
            C654590Plx c654590Plx = c0qax.LLIZ;
            InterfaceC662740Pz6 interfaceC662740Pz6 = c0qax.LLIZLLLIL;
            String str = c0qax.LLJ;
            String str2 = c0qax.LLJILJILJ;
            PageFinder pageFinderVia = PageFinder.via((View) c0qax.LLILZ);
            EnumC657940PrM enumC657940PrM = ((C0QAX) ajS65S0100000_10.l0).LLJILJIL;
            c662730Pz5.getClass();
            C662730Pz5.LIZ(product, c655440PnK, c654590Plx, interfaceC662740Pz6, str, "search_live_shownow_banner", true, str2, pageFinderVia, enumC657940PrM, null, true);
        }
    }

    public static final void LIZ$15(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) ajS65S0100000_10.l0;
            eCSearchBarAssem.getClass();
            C672020QXo c672020QXoLIZ = C671780QWq.LIZ(C1558520qew.LJIIL(eCSearchBarAssem));
            if (c672020QXoLIZ != null) {
                c672020QXoLIZ.LIZJ("click_cancel");
            }
            C668260QJc.LIZ = String.valueOf(C2204961BRm.LLLLJI(((ECSearchBarAssem) ajS65S0100000_10.l0).Bp(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null)));
            C668260QJc.LIZIZ = System.currentTimeMillis();
            ((ECSearchBarAssem) ajS65S0100000_10.l0).Bp().setText("");
            if (!((ECSearchBarAssem) ajS65S0100000_10.l0).Bp().isFocused()) {
                ((ECSearchBarAssem) ajS65S0100000_10.l0).Bp().requestFocus();
            }
        }
    }

    public static final void LIZ$16(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            C674040QcE c674040QcE = ((ECSearchBarAssem) ajS65S0100000_10.l0).LLLIIL;
            if (c674040QcE != null && c674040QcE.LIZIZ.isRecording()) {
                C674040QcE c674040QcE2 = ((ECSearchBarAssem) ajS65S0100000_10.l0).LLLIIL;
                if (c674040QcE2 != null) {
                    c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH_TRANSCRIBING);
                }
                EcSearchBarAsrHelper ecSearchBarAsrHelper = ((ECSearchBarAssem) ajS65S0100000_10.l0).LLLIILIL;
                if (ecSearchBarAsrHelper != null) {
                    ecSearchBarAsrHelper.LIZJ();
                    return;
                }
                return;
            }
            ((ECSearchBarAssem) ajS65S0100000_10.l0).Up();
        }
    }

    public static final void LIZ$17(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) ajS65S0100000_10.l0;
            eCSearchBarAssem.getClass();
            if (!C0OBG.LIZIZ(view)) {
                eCSearchBarAssem.yp();
                SmartRouter.buildRoute(view.getContext(), UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageFilterPanelNew).buildUpon().appendQueryParameter("tab_name", "store").appendQueryParameter("height", "110").appendQueryParameter("status_bar_bg_color", "00000080").toString()).open();
            }
        }
    }

    public static final void LIZ$18(AjS65S0100000_10 ajS65S0100000_10, View view) {
        C674040QcE c674040QcE;
        InterfaceC671770QWp interfaceC671770QWpHh1;
        if (view != null && (c674040QcE = ((ECSearchBarAssem) ajS65S0100000_10.l0).LLLIIL) != null && c674040QcE.LIZIZ()) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) ajS65S0100000_10.l0;
            eCSearchBarAssem.getClass();
            ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(eCSearchBarAssem), ISearchBarContextAbility.class, null);
            if (iSearchBarContextAbility != null && (interfaceC671770QWpHh1 = iSearchBarContextAbility.Hh1()) != null) {
                interfaceC671770QWpHh1.vG();
            }
            C1357120lQ6 c1357120lQ6Hp = ((ECSearchBarAssem) ajS65S0100000_10.l0).hp();
            if (c1357120lQ6Hp != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZIZ(c1357120lQ6Hp);
            }
        }
    }

    public static final void LIZ$19(AjS65S0100000_10 ajS65S0100000_10, View view) {
        C1357120lQ6 c1357120lQ6Hp;
        if (view != null && (c1357120lQ6Hp = ((ECSearchBarAssem) ajS65S0100000_10.l0).hp()) != null) {
            c1357120lQ6Hp.setText("");
        }
    }

    public static final void LIZ$2(AjS65S0100000_10 ajS65S0100000_10, View view) {
        InterfaceC676690QgV interfaceC676690QgV;
        if (view != null && !C676280Qfq.LIZ((PhotoSearchSingleDetectionFragment) ajS65S0100000_10.l0)) {
            C128Y parentFragment = ((PhotoSearchSingleDetectionFragment) ajS65S0100000_10.l0).getParentFragment();
            if ((parentFragment instanceof InterfaceC676690QgV) && (interfaceC676690QgV = (InterfaceC676690QgV) parentFragment) != null) {
                interfaceC676690QgV.LLZLI();
            }
            PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchSingleDetectionFragment) ajS65S0100000_10.l0).LLJJJIL;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.BQ2();
            }
        }
    }

    public static final void LIZ$20(AjS65S0100000_10 ajS65S0100000_10, View view) {
        ECSearchBarAssem eCSearchBarAssem;
        EcSearchBarAsrHelper ecSearchBarAsrHelper;
        if (view != null && (ecSearchBarAsrHelper = (eCSearchBarAssem = (ECSearchBarAssem) ajS65S0100000_10.l0).LLLIILIL) != null) {
            ecSearchBarAsrHelper.LJ(C724240Sb0.LIZ(eCSearchBarAssem));
        }
    }

    public static final void LIZ$21(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((ECSearchBarAssem) ajS65S0100000_10.l0).LLZLL();
        }
    }

    public static final void LIZ$22(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((ECSearchBarAssem) ajS65S0100000_10.l0).LLZLL();
        }
    }

    public static final void LIZ$23(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            Function0<Unit> onClick = ((C671910QXd) ajS65S0100000_10.l0).getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
            C671910QXd c671910QXd = (C671910QXd) ajS65S0100000_10.l0;
            c671910QXd.getClass();
            C1018703yb.LIZIZ("trending_words_click", c671910QXd.LIZ().LIZ);
            C671910QXd c671910QXd2 = (C671910QXd) ajS65S0100000_10.l0;
            SmartRoute smartRouteLIZIZ = c671910QXd2.LIZIZ(c671910QXd2.getContext());
            if (smartRouteLIZIZ != null) {
                smartRouteLIZIZ.open();
            }
        }
    }

    public static final void LIZ$24(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            Function0<Unit> onClick = ((C672120QXy) ajS65S0100000_10.l0).getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
            C672120QXy c672120QXy = (C672120QXy) ajS65S0100000_10.l0;
            c672120QXy.getClass();
            C2344009Gk c2344009GkLIZ = c672120QXy.LIZ();
            c2344009GkLIZ.LJIIIIZZ("enter_from", c672120QXy.getEntranceModel().LIZ);
            c2344009GkLIZ.LJIIIIZZ("search_entrance", c672120QXy.getEntranceModel().LJIILIIL);
            c2344009GkLIZ.LJIIIIZZ("enter_method", "enter");
            c2344009GkLIZ.LJIIIIZZ("search_keyword", c672120QXy.getEntranceModel().LJIJ);
            C1018703yb.LIZIZ("enter_search_blankpage", c2344009GkLIZ.LIZ);
            C672120QXy c672120QXy2 = (C672120QXy) ajS65S0100000_10.l0;
            SmartRoute smartRouteLIZIZ = c672120QXy2.LIZIZ(c672120QXy2.getContext());
            if (smartRouteLIZIZ != null) {
                smartRouteLIZIZ.open();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$25(g1c.AjS65S0100000_10 r5, android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS65S0100000_10.LIZ$25(g1c.AjS65S0100000_10, android.view.View):void");
    }

    public static final void LIZ$26(AjS65S0100000_10 ajS65S0100000_10, View view) {
        Integer numE1;
        if (view != null) {
            ISearchSplitSheetBehaviorAbility iSearchSplitSheetBehaviorAbilityMR = ((SearchSevenSplitScreenFragment) ajS65S0100000_10.l0).MR();
            if (iSearchSplitSheetBehaviorAbilityMR != null) {
                numE1 = iSearchSplitSheetBehaviorAbilityMR.E1();
            } else {
                numE1 = null;
            }
            if (numE1 == null || numE1.intValue() != 5) {
                if (numE1 == null || (numE1.intValue() != 1 && numE1.intValue() != 2)) {
                    SearchSevenSplitScreenFragment searchSevenSplitScreenFragment = (SearchSevenSplitScreenFragment) ajS65S0100000_10.l0;
                    searchSevenSplitScreenFragment.LLIZLLLIL = EnumC670460QRo.CLICK_BLANK_AREA;
                    if (!searchSevenSplitScreenFragment.LLJILLL) {
                        searchSevenSplitScreenFragment.LLJILLL = true;
                        ISearchSplitSheetBehaviorAbility iSearchSplitSheetBehaviorAbilityMR2 = searchSevenSplitScreenFragment.MR();
                        if (iSearchSplitSheetBehaviorAbilityMR2 != null) {
                            iSearchSplitSheetBehaviorAbilityMR2.c(5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.String] */
    public static final void LIZ$27(AjS65S0100000_10 ajS65S0100000_10, View view) {
        C661010PwJ c661010PwJ;
        Aweme aweme;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase2;
        if (view != null && (c661010PwJ = ((EcStoreLiveAssem) ajS65S0100000_10.l0).LLJLL) != null && (aweme = c661010PwJ.LLILLJJLI) != null) {
            SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C1558520qew.LIZJ(C1558520qew.LJIIL((EcStoreLiveAssem) ajS65S0100000_10.l0), SearchServiceCenter$NavigateAbility.class);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            try {
                c259800zU.element = ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL((EcStoreLiveAssem) ajS65S0100000_10.l0), ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10((EcStoreLiveAssem) ajS65S0100000_10.l0, (EcStoreLiveAssem) c259800zU, (C259800zU<String>) 153);
            final Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b6880.c3812.d4738", PageFinder.via((View) ((EcStoreLiveAssem) ajS65S0100000_10.l0).sp()), null, 4, null);
            C661010PwJ c661010PwJ2 = ((EcStoreLiveAssem) ajS65S0100000_10.l0).LLJLL;
            AwemeRawAd awemeRawAd = null;
            if (c661010PwJ2 != null && (searchMixFeedBase2 = c661010PwJ2.LL) != null) {
                eComShopCardStruct = searchMixFeedBase2.shopCard;
            } else {
                eComShopCardStruct = null;
            }
            if (C662850PzH.LJ(eComShopCardStruct)) {
                aweme.setAd(true);
                C661010PwJ c661010PwJ3 = ((EcStoreLiveAssem) ajS65S0100000_10.l0).LLJLL;
                if (c661010PwJ3 != null && (searchMixFeedBase = c661010PwJ3.LL) != null && (eComShopCardStruct2 = searchMixFeedBase.shopCard) != null) {
                    awemeRawAd = eComShopCardStruct2.awemeRawAd;
                }
                aweme.setAwemeRawAd(awemeRawAd);
                InterfaceC662780PzA interfaceC662780PzA = ((EcStoreLiveAssem) ajS65S0100000_10.l0).LLJLLIL;
                if (interfaceC662780PzA != null) {
                    interfaceC662780PzA.LJIL(C0Q1G.LIVE_COVER);
                }
            }
            if (searchServiceCenter$NavigateAbility.zT1()) {
                C0Q3E.LIZJ(aweme).fe(new C655220Pmy(awS376S0200000_10));
                searchServiceCenter$NavigateAbility.GV0(C1558520qew.LJIIL((EcStoreLiveAssem) ajS65S0100000_10.l0), aweme, new InterfaceC645880PVa(mapCreateReportParams$default) { // from class: X.0PzF
                    public final C650430PfF LL;
                    public final boolean LLILLJJLI = true;

                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC645880PVa
                    public final C650430PfF LLIZLLLIL() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC645880PVa
                    public final boolean LLJJJIL() {
                        return this.LLILLJJLI;
                    }

                    {
                        this.LL = new C650430PfF(new AwS589S0100000_10(mapCreateReportParams$default, (Map<String, String>) 656));
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return Intrinsics.LJFF(interfaceC1891350zJl, this);
                    }
                }, false, null, null);
            } else {
                searchServiceCenter$NavigateAbility.hk0(C1558520qew.LJIIL((EcStoreLiveAssem) ajS65S0100000_10.l0), aweme, awS376S0200000_10);
            }
        }
    }

    public static final void LIZ$28(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            EcStoreLiveV2Assem ecStoreLiveV2Assem = (EcStoreLiveV2Assem) ajS65S0100000_10.l0;
            int i = EcStoreLiveV2Assem.LLLF;
            ecStoreLiveV2Assem.zp(false, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.vision.IPhotoSearchService] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ss.android.ugc.aweme.search.model.SearchResultParam] */
    public static final void LIZ$29(AjS65S0100000_10 ajS65S0100000_10, View view) {
        PhotoSearchEnterParams photoSearchEnterParamsCopy;
        HashMap<String, Object> map;
        Object obj;
        if (view != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C679720QlO c679720QlO = (C679720QlO) ajS65S0100000_10.l0;
            C675940QfI.LIZJ("photo_search_history_click", c679720QlO.LLILLJJLI.LLILZ, new AwS589S0100000_10(c679720QlO, 658));
            C679720QlO c679720QlO2 = (C679720QlO) ajS65S0100000_10.l0;
            C09HE c09he = c679720QlO2.LLILZIL;
            if (c09he != null) {
                HistoryRecordPageVM historyRecordPageVM = c679720QlO2.LLILLJJLI;
                Context context = view.getContext();
                C1A3S c1a3s = ((C679720QlO) ajS65S0100000_10.l0).LLILLL;
                Object obj2 = null;
                PhotoSearchEnterParams photoSearchEnterParams = historyRecordPageVM.LLILZ;
                String string = null;
                if (photoSearchEnterParams != null && (photoSearchEnterParamsCopy = photoSearchEnterParams.copy()) != null) {
                    Map<String, Object> extraParams = c09he.getExtraParams();
                    if (extraParams != null) {
                        map = new HashMap<>(extraParams);
                    } else {
                        map = null;
                    }
                    photoSearchEnterParamsCopy.setPhotoSearchExtra(map);
                    if (photoSearchEnterParamsCopy.toolsParams == null) {
                        obj2 = null;
                        photoSearchEnterParamsCopy.setToolsParams(new PhotoSearchToolsEnterParams(null, null, "", null, null, null, null));
                    }
                    ?? r11 = obj2;
                    if (photoSearchEnterParamsCopy.pdpParams == null) {
                        ?? r112 = obj2;
                        photoSearchEnterParamsCopy.setPdpParams(new PhotoSearchPdpEnterParams(r112, r112, r112, r112, r112, r112, r112));
                        r11 = r112;
                    }
                    ?? r113 = r11;
                    if (photoSearchEnterParamsCopy.logParams == null) {
                        ?? r114 = r11;
                        photoSearchEnterParamsCopy.setLogParams(new PhotoSearchLogEnterParams(r114, r114, r114, r114, r114, r114, r114, r114, r114, r114, r114, r114, r114));
                        r113 = r114;
                    }
                    if (photoSearchEnterParamsCopy.businessParams == null) {
                        photoSearchEnterParamsCopy.setBusinessParams(new PhotoSearchBusinessEnterParams(r113, r113, r113, r113, "", 0, "", "", "", r113, r113, r113, "", "", "", r113, r113, r113, r113, C0QXR.MALL.getValue(), r113, r113, r113, r113, r113, r113, r113, String.valueOf(System.currentTimeMillis())));
                    }
                    PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = photoSearchEnterParamsCopy.businessParams;
                    if (photoSearchBusinessEnterParams != null) {
                        photoSearchBusinessEnterParams.setEnterMethod("photo_search_history");
                    }
                    PhotoSearchLogEnterParams photoSearchLogEnterParams = photoSearchEnterParamsCopy.logParams;
                    if (photoSearchLogEnterParams != null) {
                        photoSearchLogEnterParams.setPhotoSearchTypeDetail(c1a3s.LIZ);
                    }
                    PhotoSearchToolsEnterParams photoSearchToolsEnterParams = photoSearchEnterParamsCopy.toolsParams;
                    if (photoSearchToolsEnterParams != null) {
                        photoSearchToolsEnterParams.setLocalFilePath(c09he.getImageUrl());
                    }
                    PhotoSearchToolsEnterParams photoSearchToolsEnterParams2 = photoSearchEnterParamsCopy.toolsParams;
                    if (photoSearchToolsEnterParams2 != null) {
                        photoSearchToolsEnterParams2.setSearchTime(Long.valueOf(jCurrentTimeMillis));
                    }
                    PhotoSearchPdpEnterParams photoSearchPdpEnterParams = photoSearchEnterParamsCopy.pdpParams;
                    if (photoSearchPdpEnterParams != null) {
                        photoSearchPdpEnterParams.setRawPhotoSource(c1a3s.LIZ);
                    }
                    PhotoSearchPdpEnterParams photoSearchPdpEnterParams2 = photoSearchEnterParamsCopy.pdpParams;
                    if (photoSearchPdpEnterParams2 != null) {
                        Map<String, Object> extraParams2 = c09he.getExtraParams();
                        if (extraParams2 != null && (obj = extraParams2.get("product_id")) != null) {
                            string = obj.toString();
                        }
                        photoSearchPdpEnterParams2.setEnterProductId(string);
                    }
                    PhotoSearchLogEnterParams photoSearchLogEnterParams2 = photoSearchEnterParamsCopy.logParams;
                    if (photoSearchLogEnterParams2 != null) {
                        photoSearchLogEnterParams2.setPhotoSearchModule("visual_search");
                    }
                    C675940QfI.LIZJ("photo_search_icon_click_return", photoSearchEnterParamsCopy, new AwS589S0100000_10(context, 680));
                    ((IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class)).LJIIIZ(context, photoSearchEnterParamsCopy, r113, r113, r113);
                    historyRecordPageVM.LLILZIL = true;
                }
            }
        }
    }

    public static final void LIZ$3(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((SearchHelpPostCardContentAssem) ajS65S0100000_10.l0).onClick(view);
        }
    }

    public static final void LIZ$30(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            EcHintInfoAssem ecHintInfoAssem = (EcHintInfoAssem) ajS65S0100000_10.l0;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(ecHintInfoAssem.getContext(), "aweme://webview");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://support.tiktok.com/");
            String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
            if (Intrinsics.LJFF(appLanguage, "he")) {
                appLanguage = "he_IL";
            } else if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
                appLanguage = "zh-Hant-TW";
            }
            sbLIZ.append(appLanguage);
            sbLIZ.append("/using-tiktok/exploring-videos/managing-personalization-on-tiktok");
            smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("use_spark", true);
            smartRouteBuildRoute.open();
            if (C00ZL.LIZ() == 1) {
                C662860PzI.LJIILIIL(C1558520qew.LJIIL(ecHintInfoAssem), "tiktokec_personalized_search_text_click");
            }
        }
    }

    public static final void LIZ$31(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((EcStoreInfoAssem) ajS65S0100000_10.l0).Ap(view, "click_info", "goods_click_photo");
        }
    }

    public static final void LIZ$32(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((EcStoreInfoAssem) ajS65S0100000_10.l0).Ap(view, "enter_shop_button", "goods_click_button");
        }
    }

    public static final void LIZ$33(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((EcStoreInfoV2Assem) ajS65S0100000_10.l0).zp(view, "click_info", "goods_click_photo");
        }
    }

    public static final void LIZ$34(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((EcStoreInfoV2Assem) ajS65S0100000_10.l0).zp(view, "enter_shop_button", "goods_click_button");
        }
    }

    public static final void LIZ$4(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((SearchHelpPostCardContentAssem) ajS65S0100000_10.l0).onClick(view);
        }
    }

    public static final void LIZ$5(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((SearchHelpPostCardContentAssem) ajS65S0100000_10.l0).onClick(view);
        }
    }

    public static final void LIZ$6(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((SearchHelpPostCardContentAssem) ajS65S0100000_10.l0).onClick(view);
        }
    }

    public static final void LIZ$7(AjS65S0100000_10 ajS65S0100000_10, View view) {
        if (view != null) {
            ((SearchHelpPostCardContentAssem) ajS65S0100000_10.l0).onClick(view);
        }
    }

    public static final void LIZ$8(AjS65S0100000_10 ajS65S0100000_10, View view) throws JSONException {
        Activity activityLIZ;
        IEventCenter iEventCenter;
        if (view != null) {
            ECSearchLynxFilterAssem eCSearchLynxFilterAssem = (ECSearchLynxFilterAssem) ajS65S0100000_10.l0;
            eCSearchLynxFilterAssem.getClass();
            Context context = eCSearchLynxFilterAssem.getContext();
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            String strLIZ = C676850Qgl.LIZ(activityLIZ, C724240Sb0.LJI(eCSearchLynxFilterAssem));
            if (strLIZ != null && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("containerUniqueId", strLIZ);
                jSONObject.put("container_unique_id", strLIZ);
                jSONObject.put("action", "openFilterPanel");
                iEventCenter.LIZ("ecSearchTabSortFilterAction", C786410Ut5.J3(jSONObject));
            }
        }
    }

    public static final void LIZ$9(AjS65S0100000_10 ajS65S0100000_10, View view) {
        SearchResultParam searchResultParam;
        if (view != null) {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
            if (iEcomSearchService != null) {
                C0QXE c0qxe = ((HalfDynamicSearchShopFragment) ajS65S0100000_10.l0).LLIZ;
                if (c0qxe != null) {
                    searchResultParam = c0qxe.searchResultParam;
                } else {
                    searchResultParam = null;
                }
                iEcomSearchService.LJJIL(null, searchResultParam, "close", AFwS241S0000000_10.get$arr$(414));
            }
            ((HalfDynamicSearchShopFragment) ajS65S0100000_10.l0).dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS65S0100000_10(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
