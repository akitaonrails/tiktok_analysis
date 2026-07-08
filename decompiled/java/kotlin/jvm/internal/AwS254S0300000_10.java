package kotlin.jvm.internal;

import X.AbstractC19875512pd;
import X.AbstractC642900PJo;
import X.AbstractC652910PjF;
import X.AbstractC683590Qrd;
import X.C01GW;
import X.C05XL;
import X.C07IQ;
import X.C098200Yq;
import X.C09AY;
import X.C0BRN;
import X.C0I7D;
import X.C0P5I;
import X.C0PCY;
import X.C0PDP;
import X.C0PDQ;
import X.C0PFY;
import X.C0PGB;
import X.C0PHT;
import X.C0PHX;
import X.C0PI3;
import X.C0PI7;
import X.C0PJH;
import X.C0PN8;
import X.C0PRC;
import X.C0PRV;
import X.C0PXE;
import X.C0PXJ;
import X.C0PYD;
import X.C0Q3E;
import X.C0QGB;
import X.C0QL8;
import X.C0QWU;
import X.C0QWV;
import X.C118300cf;
import X.C123100dR;
import X.C1388190mED;
import X.C1440005kM;
import X.C1515820pY4;
import X.C1533950q1J;
import X.C15O7;
import X.C1603960rqE;
import X.C1740600vOc;
import X.C1860130yVP;
import X.C189200o6;
import X.C19720512Dr;
import X.C19721212Dy;
import X.C19EG;
import X.C2036707yP;
import X.C20742916Ex;
import X.C2188811AlT;
import X.C274980Aq8;
import X.C293510Bev;
import X.C301530Brr;
import X.C306840C1a;
import X.C418440Gaw;
import X.C425150Gll;
import X.C427110Gov;
import X.C430890Gv1;
import X.C631370Opb;
import X.C640020P8m;
import X.C642250PHb;
import X.C642860PJk;
import X.C642880PJm;
import X.C643200PKs;
import X.C643390PLl;
import X.C645130PSd;
import X.C645920PVe;
import X.C645930PVf;
import X.C646370PWx;
import X.C647380PaK;
import X.C650410PfD;
import X.C651580Ph6;
import X.C652320PiI;
import X.C652390PiP;
import X.C653660PkS;
import X.C654210PlL;
import X.C654760PmE;
import X.C659280PtW;
import X.C660840Pw2;
import X.C661350Pwr;
import X.C665580Q8u;
import X.C670090QQd;
import X.C671720QWk;
import X.C672910QaP;
import X.C675200Qe6;
import X.C676280Qfq;
import X.C679280Qkg;
import X.C683700Qro;
import X.C686850Qwt;
import X.C686940Qx2;
import X.C688690Qzr;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1876780ywG;
import X.InterfaceC1019840ce6;
import X.InterfaceC1541990qEH;
import X.InterfaceC641090PCp;
import X.InterfaceC657510Pqf;
import X.InterfaceC665370Q7z;
import X.InterfaceC683720Qrq;
import X.InterfaceC685060Qu0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance.ECMiddleEntranceData;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardMobAbilityImpl;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.SearchDetailRelatedSearchCellComponent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.SearchOpenSchemaMethod;
import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.config.ShowFixConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoBottomAnchorManagerAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.markdown.SearchNimbleMarkdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.Top1NimbleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.markdown.SearchMarkDownContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.ISearchExposureAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS254S0300000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS254S0300000_10 awS254S0300000_10) {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C686850Qwt c686850Qwt = (C686850Qwt) awS254S0300000_10.l0;
        SearchRootFragment searchRootFragment = c686850Qwt.LJFF;
        C19EG c19eg = c686850Qwt.LJ;
        sAFHelper.getClass();
        if (!SAFHelper.LJJJJJ(searchRootFragment, c19eg)) {
            try {
                C686940Qx2 c686940Qx2 = (C686940Qx2) awS254S0300000_10.l1;
                C686850Qwt c686850Qwt2 = (C686850Qwt) awS254S0300000_10.l0;
                Context context = (Context) awS254S0300000_10.l2;
                for (Pair pair : (ArrayList) c686940Qx2.LIZ) {
                    Object first = pair.getFirst();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    int iIntValue2 = ((Number) first).intValue();
                    LinkedList<View> linkedList = c686850Qwt2.LIZIZ.get(Integer.valueOf(iIntValue2));
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        c686850Qwt2.LIZIZ.put(Integer.valueOf(iIntValue2), linkedList);
                    }
                    for (int i = 0; i < iIntValue; i++) {
                        View viewLIZ = C20742916Ex.LIZ(context, iIntValue2, new FrameLayout(context), false, -1);
                        synchronized (linkedList) {
                            try {
                                linkedList.offer(viewLIZ);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                }
            } catch (Exception th) {
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS254S0300000_10 awS254S0300000_10) {
        C19EG c19eg = (C19EG) awS254S0300000_10.l0;
        if (c19eg != null) {
            C672910QaP.LIZIZ(c19eg, (ECMiddleEntranceData) awS254S0300000_10.l1, (C1740600vOc) awS254S0300000_10.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS254S0300000_10 awS254S0300000_10) {
        C0PXJ c0pxj = C0PXJ.LIZ;
        View view = (View) awS254S0300000_10.l0;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((SearchMarkDownContentAssem) awS254S0300000_10.l2, 640);
        AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10((SearchMarkDownContentAssem) awS254S0300000_10.l2, 641);
        AwS554S0100000_10 awS554S0100000_103 = new AwS554S0100000_10((SearchMarkDownContentAssem) awS254S0300000_10.l2, 642);
        c0pxj.getClass();
        C0PXJ.LJ(view, awS554S0100000_10, awS554S0100000_102, awS554S0100000_103);
        WeakReference weakReference = new WeakReference((C1860130yVP) awS254S0300000_10.l1);
        View view2 = (View) awS254S0300000_10.l0;
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL = ((SearchMarkDownContentAssem) awS254S0300000_10.l2).LLIIJLIL();
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10((SearchMarkDownContentAssem) awS254S0300000_10.l2, (SearchMarkDownContentAssem) weakReference, (WeakReference<C1860130yVP>) 48);
        c0pxj.getClass();
        C0PXJ.LJFF(view2, interfaceC665370Q7zLLIIJLIL, awS411S0200000_10);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS254S0300000_10 awS254S0300000_10) {
        Object next;
        AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10((C0PI7) awS254S0300000_10.l1, 303);
        AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10((Function1) awS254S0300000_10.l2, (Function1<? super SearchMixFeed, Boolean>) awS254S0300000_10.l1, (C0PI7) 63);
        Iterator it2 = ((List) awS254S0300000_10.l0).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Boolean) awS589S0100000_10.invoke(next)).booleanValue() || ((Boolean) awS376S0200000_10.invoke(next)).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) next;
        if (searchMixFeedBase == null) {
            return null;
        }
        Aweme aweme = searchMixFeedBase.getAweme();
        if (aweme == null) {
            SingleLive singleLive = searchMixFeedBase.singleLive;
            if (singleLive == null) {
                return null;
            }
            return singleLive.aweme;
        }
        return aweme;
    }

    public static final Object invoke$12(AwS254S0300000_10 awS254S0300000_10) {
        Integer num;
        C0PDP c0pdp;
        ArrayList arrayList;
        C645130PSd c645130PSd;
        C642250PHb c642250PHb;
        Pair<C0PHX, Aweme> pairLIZIZ;
        List<Aweme> awemeList;
        C645130PSd c645130PSd2;
        C0PDQ c0pdq = C0PDQ.LIZ;
        String strDS = ((SearchJediMixFeedFragment) awS254S0300000_10.l0).dS();
        String aid = ((Aweme) awS254S0300000_10.l1).getAid();
        C0PN8 c0pn8HU = ((SearchJediMixFeedFragment) awS254S0300000_10.l0).HU(false);
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) awS254S0300000_10.l0;
        C0PI3 c0pi3 = searchJediMixFeedFragment.LLZIL;
        C0P5I c0p5i = searchJediMixFeedFragment.r;
        C0PN8 c0pn8HU2 = searchJediMixFeedFragment.HU(false);
        SearchJediMixFeedFragment searchJediMixFeedFragment2 = (SearchJediMixFeedFragment) awS254S0300000_10.l0;
        C0PHT c0pht = searchJediMixFeedFragment2.LLZILL;
        AbstractC683590Qrd<SearchMixFeed> abstractC683590QrdNS = searchJediMixFeedFragment2.NS();
        Integer num2 = null;
        if ((abstractC683590QrdNS instanceof C645130PSd) && (c645130PSd2 = (C645130PSd) abstractC683590QrdNS) != null) {
            num = c645130PSd2.LLJLILLLLZIIL;
        } else {
            num = null;
        }
        C0PJH c0pjhLJ = c0pdq.LJ(strDS, aid, c0pn8HU, c0pi3, c0p5i, c0pn8HU2, c0pht, num, ((SearchJediMixFeedFragment) awS254S0300000_10.l0).LLLLLL);
        if (c0pjhLJ != null) {
            ((SearchJediMixFeedFragment) awS254S0300000_10.l0).LLZIL = c0pjhLJ;
            C1603960rqE.LIZ = c0pjhLJ;
            c0pdp = c0pjhLJ;
        } else {
            SearchJediMixFeedFragment searchJediMixFeedFragment3 = (SearchJediMixFeedFragment) awS254S0300000_10.l0;
            searchJediMixFeedFragment3.LLLLZI.LJJIJ(searchJediMixFeedFragment3.LLZLI);
            C0PN8 c0pn8HU3 = searchJediMixFeedFragment3.HU(true);
            C1603960rqE.LIZ = c0pn8HU3;
            c0pdp = c0pn8HU3;
        }
        if (C293510Bev.LIZ()) {
            if (c0pdp != null && (awemeList = c0pdp.getAwemeList()) != null) {
                arrayList = new ArrayList(awemeList);
            } else {
                arrayList = new ArrayList();
            }
            if (arrayList.size() < C07IQ.LIZ() && c0pjhLJ != null && (c642250PHb = c0pjhLJ.LLJLILLLLZIIL) != null && (pairLIZIZ = c642250PHb.LIZIZ()) != null) {
                arrayList.add(pairLIZIZ.getSecond());
            }
            InterfaceC657510Pqf interfaceC657510Pqf = (InterfaceC657510Pqf) awS254S0300000_10.l2;
            if (interfaceC657510Pqf != null) {
                AbstractC683590Qrd<SearchMixFeed> abstractC683590QrdNS2 = ((SearchJediMixFeedFragment) awS254S0300000_10.l0).NS();
                if ((abstractC683590QrdNS2 instanceof C645130PSd) && (c645130PSd = (C645130PSd) abstractC683590QrdNS2) != null) {
                    num2 = c645130PSd.LLJLILLLLZIIL;
                }
                interfaceC657510Pqf.LJJ(num2, arrayList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS254S0300000_10 awS254S0300000_10) {
        int height;
        View view = ((C654210PlL) awS254S0300000_10.l0).LLIZLLLIL;
        int height2 = 0;
        if (view != null) {
            height = view.getHeight();
        } else {
            height = 0;
        }
        if (((C430890Gv1) awS254S0300000_10.l1).LLJLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isTextExpand() expandHeaderHeight = ");
            View view2 = ((C654210PlL) awS254S0300000_10.l0).LLIZLLLIL;
            if (view2 != null) {
                height2 = view2.getHeight();
            }
            sbLIZ.append(height2);
            C2188811AlT.LIZIZ(sbLIZ);
            ((C654210PlL) awS254S0300000_10.l0).LLJI = height;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isTextExpand().not foldHeaderHeight = ");
            View view3 = ((C654210PlL) awS254S0300000_10.l0).LLIZLLLIL;
            if (view3 != null) {
                height2 = view3.getHeight();
            }
            sbLIZ2.append(height2);
            C2188811AlT.LIZIZ(sbLIZ2);
            ((C654210PlL) awS254S0300000_10.l0).LLJ = height;
        }
        Function0 function0 = (Function0) awS254S0300000_10.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS254S0300000_10 awS254S0300000_10) {
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        AbstractC642900PJo abstractC642900PJo;
        C642880PJm c642880PJm;
        SearchMixFeedList searchMixFeedList;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) awS254S0300000_10.l0;
        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
            int iIntValue = num.intValue();
            if (((C0PHT) awS254S0300000_10.l1).LJ()) {
                abstractC642900PJo = (AbstractC642900PJo) ((LinkedHashMap) C642860PJk.LIZIZ).get(Integer.valueOf(iIntValue));
            } else if (((C0PHT) awS254S0300000_10.l1).LJI()) {
                abstractC642900PJo = (AbstractC642900PJo) ((LinkedHashMap) C642860PJk.LIZJ).get(Integer.valueOf(iIntValue));
            }
            if (abstractC642900PJo != null) {
                if (!((C15O7) awS254S0300000_10.l2).LJIILL() && !((C15O7) awS254S0300000_10.l2).LJIILIIL()) {
                    Object objLJIIL = ((C15O7) awS254S0300000_10.l2).LJIIL();
                    if ((objLJIIL instanceof SearchMixFeedList) && (searchMixFeedList = (SearchMixFeedList) objLJIIL) != null && ((C0PHT) awS254S0300000_10.l1).LJ()) {
                        List<SearchMixFeed> list = searchMixFeedList.mItems;
                        if (list != null && list.isEmpty()) {
                            abstractC642900PJo.LIZJ = "empty";
                        } else {
                            abstractC642900PJo.LIZJ = "success";
                        }
                    }
                } else {
                    if (((C0PHT) awS254S0300000_10.l1).LJ()) {
                        abstractC642900PJo.LIZJ = "error";
                        abstractC642900PJo.LIZIZ();
                    }
                    if (((C0PHT) awS254S0300000_10.l1).LJI() && (abstractC642900PJo instanceof C642880PJm) && (c642880PJm = (C642880PJm) abstractC642900PJo) != null && c642880PJm.LJII) {
                        C642880PJm c642880PJm2 = (C642880PJm) abstractC642900PJo;
                        c642880PJm2.LJFF = Long.valueOf(SystemClock.elapsedRealtime());
                        if (c642880PJm2.LJI == C0PGB.OUT_DATA_START) {
                            c642880PJm2.LJI = C0PGB.OUT_DATA_END;
                            c642880PJm2.LIZLLL();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS254S0300000_10 awS254S0300000_10) {
        ValueAnimator valueAnimator = ((SearchVideoBottomAnchorManagerAssem) awS254S0300000_10.l0).LLJJL;
        int currentTotalHeight = 0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            Function1 function1 = (Function1) awS254S0300000_10.l1;
            C660840Pw2 c660840Pw2 = (C660840Pw2) awS254S0300000_10.l2;
            if (c660840Pw2 != null) {
                currentTotalHeight = c660840Pw2.getCurrentTotalHeight();
            }
            function1.invoke(Integer.valueOf(currentTotalHeight));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS254S0300000_10 awS254S0300000_10) {
        C683700Qro c683700Qro = (C683700Qro) awS254S0300000_10.l0;
        InterfaceC683720Qrq interfaceC683720Qrq = (InterfaceC683720Qrq) awS254S0300000_10.l1;
        View view = (View) awS254S0300000_10.l2;
        EnumC1876780ywG enumC1876780ywG = EnumC1876780ywG.APPROVE;
        c683700Qro.getClass();
        C683700Qro.LIZJ(interfaceC683720Qrq, "consentApproved", view, enumC1876780ywG);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS254S0300000_10 awS254S0300000_10) {
        C683700Qro c683700Qro = (C683700Qro) awS254S0300000_10.l0;
        InterfaceC683720Qrq interfaceC683720Qrq = (InterfaceC683720Qrq) awS254S0300000_10.l1;
        View view = (View) awS254S0300000_10.l2;
        EnumC1876780ywG enumC1876780ywG = EnumC1876780ywG.REJECT;
        c683700Qro.getClass();
        C683700Qro.LIZJ(interfaceC683720Qrq, "consentRejected", view, enumC1876780ywG);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS254S0300000_10 awS254S0300000_10) {
        Integer num;
        int iMax = Math.max(48, C679280Qkg.LIZIZ(Integer.valueOf(((C425150Gll) awS254S0300000_10.l0).getHeight())));
        SearchTopBarStruct searchTopBarStruct = ((C0PRV) awS254S0300000_10.l1).getTopBarAssemVM().getState().LLILLL;
        if (searchTopBarStruct == null) {
            searchTopBarStruct = (SearchTopBarStruct) awS254S0300000_10.l2;
        }
        TopBarDisplay topBarDisplay = searchTopBarStruct.topBarDisplay;
        if (topBarDisplay == null || (num = topBarDisplay.fixedHeight) == null || num.intValue() != iMax) {
            ((C0PRV) awS254S0300000_10.l1).getTopBarAssemVM().vQ2(C0PFY.LIZ(searchTopBarStruct, iMax, false));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS254S0300000_10 r20) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS254S0300000_10.invoke$19(kotlin.jvm.internal.AwS254S0300000_10):java.lang.Object");
    }

    public static final Object invoke$2(AwS254S0300000_10 awS254S0300000_10) {
        boolean z;
        C0QL8 c0ql8;
        Object c098200Yq;
        String string;
        int iMeasureText;
        C0QL8 c0ql82;
        int iLIZIZ;
        int iLIZIZ2;
        int measuredWidth;
        int measuredWidth2;
        C0I7D c0i7dBp;
        TextPaint paint;
        CharSequence hint;
        int measuredWidth3 = 0;
        C671720QWk c671720QWk = null;
        Object obj = null;
        if (((Boolean) C274980Aq8.LIZ.getValue()).booleanValue()) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) awS254S0300000_10.l0;
            eCSearchBarAssem.getClass();
            try {
                if (eCSearchBarAssem.LLLIIII == null) {
                    C0I7D c0i7dBp2 = eCSearchBarAssem.Bp();
                    if (c0i7dBp2 != null && (hint = c0i7dBp2.getHint()) != null) {
                        string = hint.toString();
                    } else {
                        string = null;
                    }
                    if (C123100dR.LIZ(string) && (c0i7dBp = eCSearchBarAssem.Bp()) != null && (paint = c0i7dBp.getPaint()) != null) {
                        iMeasureText = (int) paint.measureText(string);
                    } else {
                        iMeasureText = 0;
                    }
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
                    int iXQ2 = eCSearchBarAssem.yp().xQ2();
                    if (iXQ2 != 1) {
                        if (iXQ2 == 2) {
                            c0ql82 = C0QL8.SHOW_ICON_START;
                        } else {
                            c0ql82 = C0QL8.GONE;
                        }
                    } else {
                        c0ql82 = C0QL8.SHOW_ICON_END;
                    }
                    if (c0ql82 == C0QL8.GONE) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    }
                    if (eCSearchBarAssem.lp()) {
                        C427110Gov c427110GovEp = eCSearchBarAssem.Ep();
                        if (c427110GovEp != null) {
                            measuredWidth2 = c427110GovEp.getMeasuredWidth();
                        } else {
                            measuredWidth2 = 0;
                        }
                        iLIZIZ2 = measuredWidth2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    } else {
                        iLIZIZ2 = 0;
                    }
                    View viewZp = eCSearchBarAssem.zp();
                    if (viewZp != null) {
                        measuredWidth = viewZp.getMeasuredWidth();
                    } else {
                        measuredWidth = 0;
                    }
                    C0I7D c0i7dBp3 = eCSearchBarAssem.Bp();
                    if (c0i7dBp3 != null) {
                        measuredWidth3 = c0i7dBp3.getMeasuredWidth();
                    }
                    eCSearchBarAssem.LLLIIII = new C671720QWk(measuredWidth, measuredWidth3, iMeasureText, iLIZIZ3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) + iLIZIZ + iLIZIZ2);
                }
                c098200Yq = eCSearchBarAssem.LLLIIII;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            c671720QWk = (C671720QWk) obj;
            z = true;
        } else {
            z = false;
        }
        ECSearchBarAssem eCSearchBarAssem2 = (ECSearchBarAssem) awS254S0300000_10.l0;
        Context context = eCSearchBarAssem2.LLLIIIL;
        if (context != null || (context = eCSearchBarAssem2.getContext()) != null) {
            C0QWU c0qwu = (C0QWU) awS254S0300000_10.l1;
            ECSearchBarAssem eCSearchBarAssem3 = (ECSearchBarAssem) awS254S0300000_10.l0;
            C670090QQd c670090QQd = (C670090QQd) awS254S0300000_10.l2;
            int i = C306840C1a.LIZLLL;
            ViewGroup viewGroupMp = eCSearchBarAssem3.mp();
            C0I7D c0i7dBp4 = eCSearchBarAssem3.Bp();
            int iXQ22 = eCSearchBarAssem3.yp().xQ2();
            if (iXQ22 != 1) {
                if (iXQ22 != 2) {
                    c0ql8 = C0QL8.GONE;
                } else {
                    c0ql8 = C0QL8.SHOW_ICON_START;
                }
            } else {
                c0ql8 = C0QL8.SHOW_ICON_END;
            }
            C0QWV.LJ(c0qwu, context, viewGroupMp, c0i7dBp4, c0ql8, false, true, c670090QQd, z, c671720QWk);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS254S0300000_10 awS254S0300000_10) {
        Fragment fragmentLIZ;
        InterfaceC641090PCp interfaceC641090PCp = (InterfaceC641090PCp) awS254S0300000_10.l0;
        C19EG c19egLIZIZ = null;
        if (interfaceC641090PCp != null) {
            fragmentLIZ = interfaceC641090PCp.LIZ();
        } else {
            fragmentLIZ = null;
        }
        Fragment fragmentLJ = C651580Ph6.LJ(fragmentLIZ);
        if (fragmentLJ == null) {
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(((C652390PiP) awS254S0300000_10.l1).itemView);
            if (fragmentLIZLLL == null) {
                SAFHelper sAFHelper = SAFHelper.LIZ;
                View view = ((AbstractC652910PjF) awS254S0300000_10.l2).LL.itemView;
                Context context = ((C652390PiP) awS254S0300000_10.l1).itemView.getContext();
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                }
                sAFHelper.getClass();
                return SAFHelper.LJJIIZI(view, c19egLIZIZ);
            }
            return fragmentLIZLLL;
        }
        return fragmentLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS254S0300000_10 r6) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS254S0300000_10.invoke$21(kotlin.jvm.internal.AwS254S0300000_10):java.lang.Object");
    }

    public static final Object invoke$22(AwS254S0300000_10 awS254S0300000_10) {
        C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
        DynamicPatch dynamicPatch = (DynamicPatch) awS254S0300000_10.l0;
        Map map = (Map) awS254S0300000_10.l1;
        SparkContext sparkContext = (SparkContext) awS254S0300000_10.l2;
        c647380PaK.getClass();
        TemplateData templateDataLIZIZ = C647380PaK.LIZIZ(dynamicPatch, map, sparkContext);
        templateDataLIZIZ.LJIILIIL("lynxRealLoadUpdateTime", String.valueOf(System.currentTimeMillis()));
        return templateDataLIZIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS254S0300000_10 awS254S0300000_10) {
        C1440005kM.LIZ(new C2036707yP(String.valueOf(((Map) awS254S0300000_10.l0).get("currentRoomId"))));
        ((Bundle) awS254S0300000_10.l1).putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
        C786410Ut5.LJJJI("video_from", "from_search_mix", (Bundle) awS254S0300000_10.l1);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Activity) awS254S0300000_10.l2, "//aweme/detail");
        smartRouteBuildRoute.withParam((Bundle) awS254S0300000_10.l1);
        smartRouteBuildRoute.withParam("search_detail", C301530Brr.LIZ());
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS254S0300000_10 awS254S0300000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("REMOVE path=concurrent domain=");
        sbLIZ.append(((C675200Qe6) awS254S0300000_10.l0).LIZ);
        sbLIZ.append(" reason=removeIfSame removed=");
        sbLIZ.append(((C118300cf) awS254S0300000_10.l1).element);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode((C05XL) awS254S0300000_10.l2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$25(AwS254S0300000_10 awS254S0300000_10) {
        int iLIZIZ;
        C0PXE c0pxe;
        View view = (View) ((SearchDetailRelatedSearchCellComponent) awS254S0300000_10.l0).LLLIILIL.getValue();
        if (view != null) {
            iLIZIZ = view.getHeight();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        }
        int height = (int) ((((double) iLIZIZ) + (((double) (((SearchDetailRelatedSearchCellComponent) awS254S0300000_10.l0).LJJIJL().getHeight() - iLIZIZ)) * 0.4d)) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166))));
        if (height > 0) {
            iLIZIZ = Math.max(iLIZIZ, height);
        }
        C661350Pwr.LJIIJJI(iLIZIZ, (View) awS254S0300000_10.l1);
        if (height > 0) {
            C0PCY<C0PYD> c0pcyY30 = C0Q3E.LIZJ(((VideoItemParams) C631370Opb.LIZ((SearchDetailRelatedSearchCellComponent) awS254S0300000_10.l0)).getAweme()).Y30();
            C0PXE c0pxe2 = (C0PXE) awS254S0300000_10.l2;
            if (c0pxe2 != null) {
                c0pxe = new C0PXE(c0pxe2.LIZIZ, c0pxe2.LIZJ, c0pxe2.LIZLLL, Integer.valueOf(height), c0pxe2.LIZ);
            } else {
                c0pxe = null;
            }
            c0pcyY30.LIZ(new C640020P8m(c0pxe));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS254S0300000_10 awS254S0300000_10) {
        ((AbstractSearchIntermediateFragmentNew) awS254S0300000_10.l0).uS((SearchSugResponse) awS254S0300000_10.l1, (Map) awS254S0300000_10.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$27(AwS254S0300000_10 awS254S0300000_10) {
        ViewParent parent = ((View) ((InterfaceC1541990qEH) awS254S0300000_10.l0)).getParent();
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            C786410Ut5.LJJJJI((ViewGroup) parent2);
        }
        ViewGroup viewGroup = (ViewGroup) awS254S0300000_10.l1;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) awS254S0300000_10.l1;
        if (viewGroup2 != null) {
            viewGroup2.addView((View) parent, new ViewGroup.LayoutParams(-1, -1));
        }
        Object obj = (InterfaceC1541990qEH) awS254S0300000_10.l0;
        if (obj instanceof LynxView) {
            for (TemplateData templateData : ((C0QGB) awS254S0300000_10.l2).LLILLL) {
                if (templateData != null) {
                    ((LynxView) obj).updateData(templateData);
                }
            }
            C0QGB c0qgb = (C0QGB) awS254S0300000_10.l2;
            c0qgb.LLILLJJLI = null;
            c0qgb.LLILLL.clear();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS254S0300000_10 awS254S0300000_10) {
        if (!C676280Qfq.LIZ((PhotoSearchSingleDetectionFragment) awS254S0300000_10.l0)) {
            ((C19EG) awS254S0300000_10.l1).finish();
            PhotoSearchBaseVM photoSearchBaseVM = (PhotoSearchBaseVM) awS254S0300000_10.l2;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.BQ2();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS254S0300000_10 awS254S0300000_10) {
        int iIntValue;
        C654760PmE c654760PmE = new C654760PmE(null);
        SearchCardMobAbilityImpl searchCardMobAbilityImpl = (SearchCardMobAbilityImpl) awS254S0300000_10.l0;
        Map map = (Map) awS254S0300000_10.l1;
        Integer num = (Integer) awS254S0300000_10.l2;
        C0PRC c0prc = (C0PRC) searchCardMobAbilityImpl.LLILZ.Ph1().LIZJ();
        c654760PmE.LJJIIZI(c0prc.LLILLL);
        c654760PmE.LJJIJ(c0prc.LLIZLLLIL);
        c654760PmE.LJJII(c0prc.LLLFZ);
        if (C1533950q1J.LJ(c0prc.LLJLL)) {
            c654760PmE.LJIJJLI(c0prc.LLJLL);
        }
        String str = c0prc.LLLIIIIL;
        if (str != null) {
            c654760PmE.LJ("enter_group_id", str);
        }
        String str2 = c0prc.LLLIIL;
        if (str2 != null) {
            c654760PmE.LJ("req_search_enter_from", str2);
        }
        String str3 = c0prc.LLLIIIL;
        if (str3 != null) {
            c654760PmE.LJ("req_search_enter_method", str3);
        }
        C646370PWx c646370PWx = (C646370PWx) searchCardMobAbilityImpl.LLILZ.wO2().LIZJ();
        c654760PmE.LJIJJ(c646370PWx.LLILLL);
        c654760PmE.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
        C665580Q8u.LIZIZ.LIZ(c654760PmE);
        C643200PKs.LIZ(c654760PmE, c646370PWx, null);
        Map<String, String> map2 = searchCardMobAbilityImpl.LLIZLLLIL;
        if (map2 != null) {
            c654760PmE.LJIILLIIL.putAll(map2);
        } else {
            Map<String, String> map3 = searchCardMobAbilityImpl.LLILZLL;
            if (map3 != null) {
                c654760PmE.LJIILLIIL.putAll(map3);
            }
        }
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654760PmE, searchCardMobAbilityImpl.LLILLJJLI, c654760PmE.LJIILLIIL.get("search_result_id"), c654760PmE.LJIILLIIL.get("list_item_id"));
        }
        C645930PVf.LIZ(c654760PmE);
        c654760PmE.LJIJ(map);
        if (C650410PfD.LIZ()) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c654760PmE.LIZLLL(iIntValue, "actual_rank");
        }
        c654760PmE.LJIILJJIL();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS254S0300000_10 awS254S0300000_10) {
        ((SearchOpenSchemaMethod) awS254S0300000_10.l0).putExtraData((JSONObject) awS254S0300000_10.l1);
        ((SearchOpenSchemaMethod) awS254S0300000_10.l0).openSchemaWithOpt((JSONObject) awS254S0300000_10.l1, (InterfaceC1019840ce6) awS254S0300000_10.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS254S0300000_10 awS254S0300000_10) {
        boolean z;
        boolean z2;
        String aid;
        ISearchExposureAbility iSearchExposureAbility;
        SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM;
        boolean z3 = false;
        if (((SearchPhotoHolder) awS254S0300000_10.l0).LLLILZ || (!((ShowFixConfig) C659280PtW.LIZIZ.getValue()).opt ? !((iSearchExposureAbility = (ISearchExposureAbility) ((C01GW) awS254S0300000_10.l2).getValue()) == null || !iSearchExposureAbility.a32()) : !((searchRefreshPredictMobCanShowVM = (SearchRefreshPredictMobCanShowVM) ((SearchPhotoHolder) awS254S0300000_10.l0).LLLLII.getValue()) == null || !searchRefreshPredictMobCanShowVM.a32()))) {
            z = true;
        } else {
            z = false;
        }
        Rect rect = new Rect();
        if (((View) awS254S0300000_10.l1).getGlobalVisibleRect(rect) && rect.height() > 0 && rect.width() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && ((SearchPhotoHolder) awS254S0300000_10.l0).LLLL && z2) {
            z3 = true;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("photo partial isCurRealShow=false, realShow=");
            sbLIZ.append(z);
            sbLIZ.append(", canShowPartialMob=");
            sbLIZ.append(((SearchPhotoHolder) awS254S0300000_10.l0).LLLL);
            sbLIZ.append(", onScreen=");
            sbLIZ.append(z2);
            sbLIZ.append(", aid=");
            Aweme aweme = ((SearchPhotoHolder) awS254S0300000_10.l0).LL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Boolean.valueOf(z3);
    }

    public static final Object invoke$7(AwS254S0300000_10 awS254S0300000_10) {
        ((Assembler) awS254S0300000_10.l0).LQ2((SearchRootAssem) awS254S0300000_10.l1, new AwS589S0100000_10((View) awS254S0300000_10.l2, 230));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[PHI: r3
      0x0092: PHI (r3v5 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v6 java.lang.Integer) binds: [B:60:0x0174, B:21:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS254S0300000_10 r14) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS254S0300000_10.invoke$8(kotlin.jvm.internal.AwS254S0300000_10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$9(kotlin.jvm.internal.AwS254S0300000_10 r8) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS254S0300000_10.invoke$9(kotlin.jvm.internal.AwS254S0300000_10):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C425150Gll c425150Gll, C0PRV c0prv, SearchTopBarStruct searchTopBarStruct, int i) {
        super(0);
        this.$t = i;
        this.l0 = c425150Gll;
        this.l1 = c0prv;
        this.l2 = searchTopBarStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(InterfaceC641090PCp interfaceC641090PCp, C652390PiP c652390PiP, AbstractC652910PjF abstractC652910PjF, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC641090PCp;
        this.l1 = c652390PiP;
        this.l2 = abstractC652910PjF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C652320PiI c652320PiI, C653660PkS c653660PkS, SearchMixFeed searchMixFeed, int i) {
        super(0);
        this.$t = i;
        this.l0 = c652320PiI;
        this.l1 = c653660PkS;
        this.l2 = searchMixFeed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(C654210PlL c654210PlL, C654210PlL c654210PlL2, C430890Gv1 c430890Gv1, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c654210PlL;
        this.l1 = c654210PlL2;
        this.l2 = c430890Gv1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(C675200Qe6 c675200Qe6, C675200Qe6<Object> c675200Qe62, C118300cf c118300cf, C05XL<C1515820pY4<Object>> c05xl) {
        super(0);
        this.$t = c05xl;
        this.l0 = c675200Qe6;
        this.l1 = c675200Qe62;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C683700Qro c683700Qro, InterfaceC683720Qrq interfaceC683720Qrq, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c683700Qro;
        this.l1 = interfaceC683720Qrq;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C686850Qwt c686850Qwt, C686940Qx2 c686940Qx2, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c686850Qwt;
        this.l1 = c686940Qx2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(InterfaceC1541990qEH interfaceC1541990qEH, ViewGroup viewGroup, C0QGB c0qgb, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1541990qEH;
        this.l1 = viewGroup;
        this.l2 = c0qgb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C19720512Dr c19720512Dr, C19721212Dy c19721212Dy, AwS395S0200000_29 awS395S0200000_29, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19720512Dr;
        this.l1 = c19721212Dy;
        this.l2 = awS395S0200000_29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(AbstractC19875512pd abstractC19875512pd, C0PI7 c0pi7, AFwS241S0000000_10 aFwS241S0000000_10, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC19875512pd;
        this.l1 = c0pi7;
        this.l2 = aFwS241S0000000_10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(C19EG c19eg, ECMiddleEntranceData eCMiddleEntranceData, C1740600vOc c1740600vOc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = eCMiddleEntranceData;
        this.l2 = c1740600vOc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(View view, C1860130yVP c1860130yVP, SearchMarkDownContentAssem searchMarkDownContentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c1860130yVP;
        this.l2 = searchMarkDownContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(Assembler assembler, SearchRootAssem searchRootAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = searchRootAssem;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(DynamicPatch dynamicPatch, DynamicPatch dynamicPatch2, Map<String, ? extends Object> map, SparkContext sparkContext) {
        super(0);
        this.$t = sparkContext;
        this.l0 = dynamicPatch;
        this.l1 = dynamicPatch2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(ECSearchBarAssem eCSearchBarAssem, C0QWU c0qwu, C670090QQd c670090QQd, int i) {
        super(0);
        this.$t = i;
        this.l0 = eCSearchBarAssem;
        this.l1 = c0qwu;
        this.l2 = c670090QQd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(PhotoSearchSingleDetectionFragment photoSearchSingleDetectionFragment, C19EG c19eg, PhotoSearchBaseVM photoSearchBaseVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = photoSearchSingleDetectionFragment;
        this.l1 = c19eg;
        this.l2 = photoSearchBaseVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(SearchCardMobAbilityImpl searchCardMobAbilityImpl, SearchCardMobAbilityImpl searchCardMobAbilityImpl2, Map<String, String> map, Integer num) {
        super(0);
        this.$t = num;
        this.l0 = searchCardMobAbilityImpl;
        this.l1 = searchCardMobAbilityImpl2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(SearchDetailRelatedSearchCellComponent searchDetailRelatedSearchCellComponent, View view, C0PXE c0pxe, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchDetailRelatedSearchCellComponent;
        this.l1 = view;
        this.l2 = c0pxe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(SearchOpenSchemaMethod searchOpenSchemaMethod, JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchOpenSchemaMethod;
        this.l1 = jSONObject;
        this.l2 = interfaceC1019840ce6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew2, SearchSugResponse searchSugResponse, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = abstractSearchIntermediateFragmentNew;
        this.l1 = abstractSearchIntermediateFragmentNew2;
        this.l2 = searchSugResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(SearchPhotoHolder searchPhotoHolder, SearchPhotoHolder searchPhotoHolder2, View view, C01GW<? extends SearchTopFragmentAbility> c01gw) {
        super(0);
        this.$t = c01gw;
        this.l0 = searchPhotoHolder;
        this.l1 = searchPhotoHolder2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(SearchVideoBottomAnchorManagerAssem searchVideoBottomAnchorManagerAssem, AwS96S0201000_10 awS96S0201000_10, C660840Pw2 c660840Pw2, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchVideoBottomAnchorManagerAssem;
        this.l1 = awS96S0201000_10;
        this.l2 = c660840Pw2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(SearchNimbleMarkdownAssem searchNimbleMarkdownAssem, C688690Qzr c688690Qzr, InterfaceC685060Qu0 interfaceC685060Qu0, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchNimbleMarkdownAssem;
        this.l1 = c688690Qzr;
        this.l2 = interfaceC685060Qu0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(Top1NimbleCardAssem top1NimbleCardAssem, Top1NimbleCardAssem top1NimbleCardAssem2, View view, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = top1NimbleCardAssem;
        this.l1 = top1NimbleCardAssem2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(ISearchContextAbility iSearchContextAbility, ISearchContextAbility iSearchContextAbility2, C0PHT c0pht, C15O7<?> c15o7) {
        super(0);
        this.$t = c15o7;
        this.l0 = iSearchContextAbility;
        this.l1 = iSearchContextAbility2;
        this.l2 = c0pht;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS254S0300000_10(Map map, Map<String, ? extends Object> map2, Bundle bundle, Activity activity) {
        super(0);
        this.$t = activity;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS254S0300000_10(SearchJediMixFeedFragment searchJediMixFeedFragment, Aweme aweme, C643390PLl c643390PLl, InterfaceC657510Pqf interfaceC657510Pqf, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
        this.l1 = aweme;
        this.l2 = interfaceC657510Pqf;
    }
}
