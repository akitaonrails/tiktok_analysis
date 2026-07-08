package wh6;

import X.AbstractC329610Cw3;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C07CS;
import X.C0PRC;
import X.C0PXJ;
import X.C0Q09;
import X.C0Q3E;
import X.C0Q9J;
import X.C0QCC;
import X.C0R2I;
import X.C1394830mOv;
import X.C1558520qew;
import X.C19EG;
import X.C2097608Jq;
import X.C293680BfC;
import X.C607880Nso;
import X.C631370Opb;
import X.C651970Phj;
import X.C651980Phk;
import X.C654210PlL;
import X.C656290Poh;
import X.C657980PrQ;
import X.C665230Q7l;
import X.C682270QpV;
import X.C683220Qr2;
import X.C684120QsU;
import X.C684840Qte;
import X.C684870Qth;
import X.C684910Qtl;
import X.C684920Qtm;
import X.C684930Qtn;
import X.C689140R1k;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC435460H5s;
import X.InterfaceC436740HAq;
import X.InterfaceC665370Q7z;
import X.InterfaceC685020Qtw;
import X.InterfaceC689210R1r;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoShootAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.SearchTop1CardToolbarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.SearchNimbleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.markdown.SearchNimbleMarkdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.fixedcell.SearchNimbleTakoButtonCell;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.Top1NimbleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.IMarkdownTextClickAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovMarkdownAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.IPovLandingPageFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.SearchPovInteractionPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.markdown.SearchMarkDownContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchVideoDocItemAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.expand.ITop1AnswerExpandAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchSingleDocAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchTextWithFoldDocAssem;
import com.ss.android.ugc.aweme.search.pages.result.weakentity.WeakEntityAbility;
import com.ss.android.ugc.aweme.search.pages.result.weakentity.ui.SearchWeakEntityAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoAwemeReferenceAssem;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class AbS692S0100000_10 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
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
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS692S0100000_10(TakoAwemeReferenceAssem takoAwemeReferenceAssem, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = takoAwemeReferenceAssem;
    }

    public static final void LIZ$0(AbS692S0100000_10 abS692S0100000_10, View view) {
        Object obj;
        View view2;
        String docId;
        Object obj2;
        String docId2;
        Object obj3;
        Object obj4;
        Object obj5;
        String alasrc;
        if (view != null) {
            SearchCardVideoShootAssem searchCardVideoShootAssem = (SearchCardVideoShootAssem) abS692S0100000_10.l0;
            C19EG c19egLIZ = C724240Sb0.LIZ(searchCardVideoShootAssem);
            Fragment fragmentLJI = C724240Sb0.LJI((SearchCardVideoShootAssem) abS692S0100000_10.l0);
            Aweme aweme = ((InterfaceC435460H5s) C631370Opb.LIZ((SearchCardVideoShootAssem) abS692S0100000_10.l0)).getAweme();
            searchCardVideoShootAssem.getClass();
            if (c19egLIZ != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(c19egLIZ)) {
                C786410Ut5.re(Toast.makeText(c19egLIZ, c19egLIZ.getString(2131832497), 0));
                return;
            }
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C724270Sb3 c724270Sb3 = searchCardVideoShootAssem.LLJI;
            Object obj6 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str = "";
            if (((InterfaceC436740HAq) obj).LIZ().getEntityType() != null) {
                C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
                linkedHashMap.put("search_id", c0prc.LLILLL);
                linkedHashMap.put("search_keyword", c0prc.LLIZLLLIL);
                C724270Sb3 c724270Sb32 = searchCardVideoShootAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                SearchCardInfo searchCardInfo = ((InterfaceC436740HAq) obj2).LIZ().getSearchCardInfo();
                if (searchCardInfo == null || (docId2 = searchCardInfo.getDocId()) == null) {
                    docId2 = "";
                }
                linkedHashMap.put("search_result_id", docId2);
                C724270Sb3 c724270Sb33 = searchCardVideoShootAssem.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                String aid = ((InterfaceC435460H5s) obj3).getAweme().getAid();
                if (aid == null) {
                    aid = "";
                }
                linkedHashMap.put("list_item_id", aid);
                linkedHashMap.put("search_type", "general");
                linkedHashMap.put("is_entity", "1");
                C724270Sb3 c724270Sb34 = searchCardVideoShootAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                String entityType = ((InterfaceC436740HAq) obj4).LIZ().getEntityType();
                if (entityType == null) {
                    entityType = "";
                }
                linkedHashMap.put("entity_type", entityType);
                C724270Sb3 c724270Sb35 = searchCardVideoShootAssem.LLJI;
                if (c724270Sb35 != null) {
                    obj5 = c724270Sb35.LL;
                } else {
                    obj5 = null;
                }
                SearchCardInfo searchCardInfo2 = ((InterfaceC436740HAq) obj5).LIZ().getSearchCardInfo();
                if (searchCardInfo2 == null || (alasrc = searchCardInfo2.getAlasrc()) == null) {
                    alasrc = "";
                }
                linkedHashMap.put("token_type", alasrc);
                linkedHashMap.put("search_enter_position", "entity_video_outer");
            }
            C651970Phj.LLILLL.getClass();
            C651980Phk.LJFF(linkedHashMap, false);
            if (fragmentLJI != null && (view2 = fragmentLJI.getView()) != null && C293680BfC.LIZ()) {
                C0PRC c0prc2 = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("search_id", c0prc2.LLILLL);
                C724270Sb3 c724270Sb36 = searchCardVideoShootAssem.LLJI;
                if (c724270Sb36 != null) {
                    obj6 = c724270Sb36.LL;
                }
                SearchCardInfo searchCardInfo3 = ((InterfaceC436740HAq) obj6).LIZ().getSearchCardInfo();
                if (searchCardInfo3 != null && (docId = searchCardInfo3.getDocId()) != null) {
                    str = docId;
                }
                pairArr[1] = new Pair("search_result_id", str);
                iEcomSearchService.LJJLIIJ(view2, "c0", "d0", C2097608Jq.LJIIJ(pairArr), null);
            }
            C1394830mOv.LIZ(C1394830mOv.LIZ, c19egLIZ, fragmentLJI, aweme, "general_search");
        }
    }

    public static final void LIZ$1(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((Function0) abS692S0100000_10.l0).invoke();
        }
    }

    public static final void LIZ$10(AbS692S0100000_10 abS692S0100000_10, View view) {
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ((InterfaceC665370Q7z) ((Top1NimbleCardAssem) abS692S0100000_10.l0).LLJL.getValue(), ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.be2(((C684930Qtn) C631370Opb.LIZ((Top1NimbleCardAssem) abS692S0100000_10.l0)).LLILLL, "click_words", null);
        }
    }

    public static final void LIZ$11(AbS692S0100000_10 abS692S0100000_10, View view) {
        C683220Qr2 c683220Qr2Invoke;
        C682270QpV c682270QpV;
        Function0<C683220Qr2> function0;
        if (view != null) {
            boolean z = C0Q9J.LIZ;
            C684910Qtl c684910Qtl = ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LL;
            if (c684910Qtl != null && (c682270QpV = c684910Qtl.LLILLJJLI) != null && (function0 = c682270QpV.buildFeedbackModel) != null) {
                c683220Qr2Invoke = function0.invoke();
            } else {
                c683220Qr2Invoke = null;
            }
            C684120QsU.LIZIZ(view, c683220Qr2Invoke, false, null, null, 28);
        }
    }

    public static final void LIZ$12(AbS692S0100000_10 abS692S0100000_10, View view) {
        String str;
        if (view != null) {
            C0PXJ c0pxj = C0PXJ.LIZ;
            Map<String, String> mapLLLFZ = ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LLLFZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("button_type", "click_bottom_button");
            linkedHashMap.put("is_page", "1");
            C684910Qtl c684910Qtl = ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LL;
            if (c684910Qtl != null && (str = c684910Qtl.LL) != null) {
                linkedHashMap.put("unique_id", str);
            }
            c0pxj.getClass();
            C0PXJ.LJIIL(mapLLLFZ, linkedHashMap);
            ITop1AnswerExpandAbility iTop1AnswerExpandAbility = (ITop1AnswerExpandAbility) ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LLJ.getValue();
            if (iTop1AnswerExpandAbility != null) {
                iTop1AnswerExpandAbility.mq();
            }
        }
    }

    public static final void LIZ$13(AbS692S0100000_10 abS692S0100000_10, View view) {
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(((SearchMarkDownContentAssem) abS692S0100000_10.l0).LLIIJLIL(), ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.be2(((SearchMarkDownContentAssem) abS692S0100000_10.l0).tp(), "click_words", null);
        }
    }

    public static final void LIZ$14(AbS692S0100000_10 abS692S0100000_10, View view) {
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(((SearchMarkDownContentAssem) abS692S0100000_10.l0).LLIIJLIL(), ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.be2(((SearchMarkDownContentAssem) abS692S0100000_10.l0).tp(), "click_words", null);
        }
    }

    public static final void LIZ$15(AbS692S0100000_10 abS692S0100000_10, View view) {
        SearchPovCardDocAssem searchPovCardDocAssem;
        C607880Nso c607880Nso;
        Aweme aweme;
        ISearchPovCardAbility iSearchPovCardAbility;
        if (view != null && (c607880Nso = (searchPovCardDocAssem = (SearchPovCardDocAssem) abS692S0100000_10.l0).LLL) != null && (aweme = c607880Nso.LL) != null && (iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ((InterfaceC665370Q7z) searchPovCardDocAssem.LLJZIJLIL.getValue(), ISearchPovCardAbility.class, null)) != null) {
            iSearchPovCardAbility.V11(aweme, null, "click_video_link", "video_link");
        }
    }

    public static final void LIZ$16(AbS692S0100000_10 abS692S0100000_10, View view) {
        SearchVideoDocItemAssem searchVideoDocItemAssem;
        C684840Qte c684840Qte;
        Aweme aweme;
        ISearchPovCardAbility iSearchPovCardAbility;
        if (view != null && (c684840Qte = (searchVideoDocItemAssem = (SearchVideoDocItemAssem) abS692S0100000_10.l0).LLJLLIL) != null && (aweme = c684840Qte.LL) != null && (iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ((InterfaceC665370Q7z) searchVideoDocItemAssem.LLJLLL.getValue(), ISearchPovCardAbility.class, null)) != null) {
            iSearchPovCardAbility.V11(aweme, null, "click_video", "video");
        }
    }

    public static final void LIZ$17(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            Aweme aweme = ((InterfaceC435460H5s) C631370Opb.LIZ((SearchSingleDocAssem) abS692S0100000_10.l0)).getAweme();
            ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchSingleDocAssem) abS692S0100000_10.l0), ISearchPovCardAbility.class, null);
            if (iSearchPovCardAbility != null) {
                iSearchPovCardAbility.V11(aweme, null, "click_video", "video");
                return;
            }
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbility = (IPovLandingPageFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchSingleDocAssem) abS692S0100000_10.l0), IPovLandingPageFragmentAbility.class, null);
            if (iPovLandingPageFragmentAbility == null) {
                return;
            }
            iPovLandingPageFragmentAbility.fh2(((SearchSingleDocAssem) abS692S0100000_10.l0).getContentView(), aweme, "click_video");
        }
    }

    public static final void LIZ$18(AbS692S0100000_10 abS692S0100000_10, View view) {
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ((InterfaceC665370Q7z) ((SearchTextWithFoldDocAssem) abS692S0100000_10.l0).LLLFFI.getValue(), ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.be2(((C684870Qth) C631370Opb.LIZ((SearchTextWithFoldDocAssem) abS692S0100000_10.l0)).LLILZIL, "click_words", null);
        }
    }

    public static final void LIZ$19(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((SearchWeakEntityAssem) abS692S0100000_10.l0).Ht2(view, "click_info_picture");
        }
    }

    public static final void LIZ$2(AbS692S0100000_10 abS692S0100000_10, View view) {
        Function1<? super View, Unit> function1;
        String strOp = ((SearchTop1CardToolbarAssem) abS692S0100000_10.l0).op();
        if (strOp != null) {
            SmartRouter.buildRoute(((SearchTop1CardToolbarAssem) abS692S0100000_10.l0).getContext(), strOp).open();
        }
        C665230Q7l c665230Q7lSp = ((SearchTop1CardToolbarAssem) abS692S0100000_10.l0).sp();
        if (c665230Q7lSp != null && (function1 = c665230Q7lSp.LLILZ) != null) {
            function1.invoke(view);
        }
    }

    public static final void LIZ$20(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((SearchWeakEntityAssem) abS692S0100000_10.l0).Ht2(view, "click_info_title");
        }
    }

    public static final void LIZ$21(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((SearchWeakEntityAssem) abS692S0100000_10.l0).Ht2(view, "click_info_abstract");
        }
    }

    public static final void LIZ$22(AbS692S0100000_10 abS692S0100000_10, View view) {
        C0R2I c0r2i;
        List<Aweme> listLIZIZ;
        TakoCardAbility takoCardAbility;
        List listLIZIZ2;
        if (view != null) {
            if (((((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLJZIJLIL != null && (!r0.isEmpty())) || ((c0r2i = ((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLJJLIIIJLLLLLLLZ) != null && (listLIZIZ = c0r2i.LIZIZ()) != null && (!listLIZIZ.isEmpty()))) && (takoCardAbility = (TakoCardAbility) ((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLJLL.getValue()) != null) {
                if (C07CS.LIZ()) {
                    listLIZIZ2 = ((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLJZ;
                } else {
                    C0R2I c0r2i2 = ((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLJJLIIIJLLLLLLLZ;
                    if (c0r2i2 != null) {
                        listLIZIZ2 = c0r2i2.LIZIZ();
                    } else {
                        listLIZIZ2 = null;
                    }
                }
                takoCardAbility.e02(view, listLIZIZ2, (AbstractC329610Cw3) ((TakoAwemeReferenceAssem) abS692S0100000_10.l0).LLL.getValue(), new AwS589S0100000_10((TakoAwemeReferenceAssem) abS692S0100000_10.l0, 363), new AwS554S0100000_10((TakoAwemeReferenceAssem) abS692S0100000_10.l0, 854));
            }
        }
    }

    public static final void LIZ$23(AbS692S0100000_10 abS692S0100000_10, View view) {
        ISearchPovCardAbility iSearchPovCardAbility;
        if (view != null && (iSearchPovCardAbility = (ISearchPovCardAbility) ((SearchNimbleTakoButtonCell) abS692S0100000_10.l0).LL.getValue()) != null) {
            iSearchPovCardAbility.mU1(null);
        }
    }

    public static final void LIZ$24(AbS692S0100000_10 abS692S0100000_10, View view) {
        ((C0QCC) abS692S0100000_10.l0).LIZJ.invoke(view);
    }

    public static final void LIZ$25(AbS692S0100000_10 abS692S0100000_10, View view) {
        TextView textView;
        if (view != null) {
            C654210PlL c654210PlL = (C654210PlL) abS692S0100000_10.l0;
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            c654210PlL.LJIIJJI(textView);
        }
    }

    public static final void LIZ$26(AbS692S0100000_10 abS692S0100000_10, View view) {
        TextView textView;
        if (view != null) {
            C654210PlL c654210PlL = (C654210PlL) abS692S0100000_10.l0;
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            c654210PlL.LJIIJJI(textView);
        }
    }

    public static final void LIZ$27(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((Function1) abS692S0100000_10.l0).invoke(view);
        }
    }

    public static final void LIZ$28(AbS692S0100000_10 abS692S0100000_10, View view) {
        ISearchPhotoHolderAbility iSearchPhotoHolderAbility;
        if (view != null && (iSearchPhotoHolderAbility = (ISearchPhotoHolderAbility) ((SearchVideoPhotoCommentAnchorAssem) abS692S0100000_10.l0).LLLF.getValue()) != null) {
            iSearchPhotoHolderAbility.TB0(view);
        }
    }

    public static final void LIZ$29(AbS692S0100000_10 abS692S0100000_10, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL;
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (interfaceC665370Q7zLLIIJLIL = ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LLIIJLIL()) != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.Gz();
        }
    }

    public static final void LIZ$3(AbS692S0100000_10 abS692S0100000_10, View view) {
        SearchTop1CardToolbarAssem searchTop1CardToolbarAssem;
        C665230Q7l c665230Q7lSp;
        Function0<Boolean> function0;
        Function1<? super View, Unit> function1;
        Function0<C683220Qr2> function02;
        C683220Qr2 c683220Qr2Invoke;
        String str;
        if (view != null && (c665230Q7lSp = (searchTop1CardToolbarAssem = (SearchTop1CardToolbarAssem) abS692S0100000_10.l0).sp()) != null && (function0 = c665230Q7lSp.LL) != null && function0.invoke().booleanValue()) {
            C665230Q7l c665230Q7lSp2 = searchTop1CardToolbarAssem.sp();
            C683220Qr2 c683220Qr2 = null;
            if (c665230Q7lSp2 != null && (function02 = c665230Q7lSp2.LLILLJJLI) != null && (c683220Qr2Invoke = function02.invoke()) != null && (str = c683220Qr2Invoke.LIZ) != null) {
                if (c683220Qr2Invoke.LIZLLL == null) {
                    boolean z = C0Q9J.LIZ;
                    c683220Qr2Invoke.LIZLLL = C684120QsU.LIZLLL(str);
                }
                c683220Qr2 = c683220Qr2Invoke;
            }
            TuxIconView tuxIconView = searchTop1CardToolbarAssem.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                boolean z2 = C0Q9J.LIZ;
                C684120QsU.LIZIZ(tuxIconView, c683220Qr2, false, null, null, 28);
            }
            C665230Q7l c665230Q7lSp3 = searchTop1CardToolbarAssem.sp();
            if (c665230Q7lSp3 != null && (function1 = c665230Q7lSp3.LLILLL) != null) {
                function1.invoke(view);
            }
        }
    }

    public static final void LIZ$30(AbS692S0100000_10 abS692S0100000_10, View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL;
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (interfaceC665370Q7zLLIIJLIL = ((SearchPovInteractionPowerCell) abS692S0100000_10.l0).LLIIJLIL()) != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.h22();
        }
    }

    public static final void LIZ$31(AbS692S0100000_10 abS692S0100000_10, View view) {
        InterfaceC689210R1r onMarkdownClickListener;
        if (view != null && (onMarkdownClickListener = ((C689140R1k) abS692S0100000_10.l0).getOnMarkdownClickListener()) != null) {
            onMarkdownClickListener.LIZJ();
        }
    }

    public static final void LIZ$32(AbS692S0100000_10 abS692S0100000_10, View view) {
        InterfaceC689210R1r onMarkdownClickListener;
        if (view != null && (onMarkdownClickListener = ((C689140R1k) abS692S0100000_10.l0).getOnMarkdownClickListener()) != null) {
            onMarkdownClickListener.LIZJ();
        }
    }

    public static final void LIZ$33(AbS692S0100000_10 abS692S0100000_10, View view) {
        WeakEntityAbility weakEntityAbility;
        if (view != null && (weakEntityAbility = (WeakEntityAbility) C1558520qew.LIZ((InterfaceC665370Q7z) abS692S0100000_10.l0, WeakEntityAbility.class, null)) != null) {
            weakEntityAbility.Ht2(view, "click_info_sub_title");
        }
    }

    public static final void LIZ$34(AbS692S0100000_10 abS692S0100000_10, View view) {
        WeakEntityAbility weakEntityAbility;
        if (view != null && (weakEntityAbility = (WeakEntityAbility) C1558520qew.LIZ((InterfaceC665370Q7z) abS692S0100000_10.l0, WeakEntityAbility.class, null)) != null) {
            weakEntityAbility.Ht2(view, "click_info_structual_information");
        }
    }

    public static final void LIZ$35(AbS692S0100000_10 abS692S0100000_10, View view) {
        WeakEntityAbility weakEntityAbility;
        if (view != null && (weakEntityAbility = (WeakEntityAbility) C1558520qew.LIZ((InterfaceC665370Q7z) abS692S0100000_10.l0, WeakEntityAbility.class, null)) != null) {
            weakEntityAbility.Ht2(view, "click_info_structual_information");
        }
    }

    public static final void LIZ$36(AbS692S0100000_10 abS692S0100000_10, View view) {
        WeakEntityAbility weakEntityAbility;
        if (view != null && (weakEntityAbility = (WeakEntityAbility) C1558520qew.LIZ((InterfaceC665370Q7z) abS692S0100000_10.l0, WeakEntityAbility.class, null)) != null) {
            weakEntityAbility.Ht2(view, "click_info_sub_title");
        }
    }

    public static final void LIZ$37(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            ((Function0) abS692S0100000_10.l0).invoke();
        }
    }

    public static final void LIZ$4(AbS692S0100000_10 abS692S0100000_10, View view) {
        Function1<? super View, Unit> function1;
        String strOp = ((SearchTop1CardLabelAssem) abS692S0100000_10.l0).op();
        if (strOp != null) {
            SmartRouter.buildRoute(((SearchTop1CardLabelAssem) abS692S0100000_10.l0).getContext(), strOp).open();
        }
        C657980PrQ c657980PrQSp = ((SearchTop1CardLabelAssem) abS692S0100000_10.l0).sp();
        if (c657980PrQSp != null && (function1 = c657980PrQSp.LLJILJILJ) != null) {
            function1.invoke(view);
        }
    }

    public static final void LIZ$5(AbS692S0100000_10 abS692S0100000_10, View view) {
        SearchTop1CardLabelAssem searchTop1CardLabelAssem;
        C657980PrQ c657980PrQSp;
        Function0<Boolean> function0;
        Function1<? super View, Unit> function1;
        Function0<C683220Qr2> function02;
        C683220Qr2 c683220Qr2Invoke;
        String str;
        if (view != null && (c657980PrQSp = (searchTop1CardLabelAssem = (SearchTop1CardLabelAssem) abS692S0100000_10.l0).sp()) != null && (function0 = c657980PrQSp.LLIZLLLIL) != null && function0.invoke().booleanValue()) {
            C657980PrQ c657980PrQSp2 = searchTop1CardLabelAssem.sp();
            C683220Qr2 c683220Qr2 = null;
            if (c657980PrQSp2 != null && (function02 = c657980PrQSp2.LLIZ) != null && (c683220Qr2Invoke = function02.invoke()) != null && (str = c683220Qr2Invoke.LIZ) != null) {
                if (c683220Qr2Invoke.LIZLLL == null) {
                    boolean z = C0Q9J.LIZ;
                    c683220Qr2Invoke.LIZLLL = C684120QsU.LIZLLL(str);
                }
                c683220Qr2 = c683220Qr2Invoke;
            }
            TuxIconView tuxIconView = searchTop1CardLabelAssem.LLL;
            if (tuxIconView != null) {
                boolean z2 = C0Q9J.LIZ;
                C684120QsU.LIZIZ(tuxIconView, c683220Qr2, false, null, null, 28);
            }
            C657980PrQ c657980PrQSp3 = searchTop1CardLabelAssem.sp();
            if (c657980PrQSp3 != null && (function1 = c657980PrQSp3.LLJILJIL) != null) {
                function1.invoke(view);
            }
        }
    }

    public static final void LIZ$6(AbS692S0100000_10 abS692S0100000_10, View view) {
        IMarkdownTextClickAbility iMarkdownTextClickAbility;
        if (view != null && (iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ((InterfaceC665370Q7z) ((SearchNimbleCardAssem) abS692S0100000_10.l0).LLJL.getValue(), ISearchPovMarkdownAbility.class, null)) != null) {
            iMarkdownTextClickAbility.be2(((C684920Qtm) C631370Opb.LIZ((SearchNimbleCardAssem) abS692S0100000_10.l0)).LLILLL, "click_words", null);
        }
    }

    public static final void LIZ$7(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            Object obj = null;
            IMarkdownTextClickAbility iMarkdownTextClickAbility = (IMarkdownTextClickAbility) C1558520qew.LIZ(((SearchNimbleMarkdownAssem) abS692S0100000_10.l0).LLIIJLIL(), ISearchPovMarkdownAbility.class, null);
            if (iMarkdownTextClickAbility != null) {
                C724270Sb3 c724270Sb3 = ((SearchNimbleMarkdownAssem) abS692S0100000_10.l0).LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                iMarkdownTextClickAbility.be2(((InterfaceC685020Qtw) obj).LJLJLJ(), "click_words", null);
            }
        }
    }

    public static final void LIZ$8(AbS692S0100000_10 abS692S0100000_10, View view) {
        if (view != null) {
            Aweme aweme = ((C656290Poh) C631370Opb.LIZ((SearchNimbleDocBaseAssem) abS692S0100000_10.l0)).LL;
            ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchNimbleDocBaseAssem) abS692S0100000_10.l0), ISearchPovCardAbility.class, null);
            if (iSearchPovCardAbility != null) {
                iSearchPovCardAbility.V11(aweme, null, "click_video", "video");
                return;
            }
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbility = (IPovLandingPageFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchNimbleDocBaseAssem) abS692S0100000_10.l0), IPovLandingPageFragmentAbility.class, null);
            if (iPovLandingPageFragmentAbility == null) {
                return;
            }
            iPovLandingPageFragmentAbility.fh2(((SearchNimbleDocBaseAssem) abS692S0100000_10.l0).getContentView(), aweme, "click_video");
        }
    }

    public static final void LIZ$9(AbS692S0100000_10 abS692S0100000_10, View view) {
        IImageLandingPageAbility iImageLandingPageAbility;
        if (view != null && (iImageLandingPageAbility = (IImageLandingPageAbility) ((ImageLandingItemBaseAssem) abS692S0100000_10.l0).LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            iImageLandingPageAbility.oy1(((C0Q09) C631370Opb.LIZ((ImageLandingItemBaseAssem) abS692S0100000_10.l0)).getImageData());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS692S0100000_10(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
