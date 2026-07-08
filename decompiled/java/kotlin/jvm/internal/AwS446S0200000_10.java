package kotlin.jvm.internal;

import X.C09AY;
import X.C0BY8;
import X.C0C1B;
import X.C0P7X;
import X.C0P9Q;
import X.C0PEM;
import X.C0PFY;
import X.C0PGH;
import X.C0PGM;
import X.C0PRC;
import X.C0PRV;
import X.C0Q3E;
import X.C0QQA;
import X.C0SY7;
import X.C0VSJ;
import X.C1227904rF;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C138500fv;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C15438062q;
import X.C1546210qL5;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1909107dp;
import X.C1954807lC;
import X.C197039127h;
import X.C1ER1;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C2382909Vj;
import X.C238400w2;
import X.C291001Au;
import X.C291290BbL;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C423890Gjj;
import X.C425150Gll;
import X.C430110Gtl;
import X.C467860IWi;
import X.C588260N5k;
import X.C639430P6f;
import X.C639440P6g;
import X.C640510PAj;
import X.C641860PFo;
import X.C643400PLm;
import X.C652590Pij;
import X.C654050Pl5;
import X.C654210PlL;
import X.C657910PrJ;
import X.C658230Prp;
import X.C658240Prq;
import X.C658270Prt;
import X.C658280Pru;
import X.C658700Psa;
import X.C659020Pt6;
import X.C661350Pwr;
import X.C661440Px0;
import X.C661890Pxj;
import X.C665840Q9u;
import X.C683070Qqn;
import X.C683080Qqo;
import X.C689680R3m;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import X.C844470XAv;
import X.EnumC654440Pli;
import X.InterfaceC634840OvC;
import X.InterfaceC644870PRd;
import X.InterfaceC656470Poz;
import X.InterfaceC665890Q9z;
import X.InterfaceC676520QgE;
import X.InterfaceC683020Qqi;
import X.InterfaceC689340R2e;
import X.InterfaceC689370R2h;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.user.NimbleUserAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.ecommerce.IECMixContentPlayAbility;
import com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui.LynxShopSearchLive;
import com.ss.android.ugc.aweme.search.ecommerce.lynx.core.ui.LynxShopSearchVideo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchHubEntityContext;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoSubCardScrollProtocol;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public class AwS446S0200000_10 extends C09AY implements Function2 {
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
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C0PRV c0prv, C425150Gll c425150Gll, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0prv;
        this.l1 = c425150Gll;
    }

    public static final Object invoke$0(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        String containerID;
        List<? extends Object> list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        C665840Q9u c665840Q9u = (C665840Q9u) awS446S0200000_10.l0;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        CompletionBlock completionBlock = (CompletionBlock) awS446S0200000_10.l1;
        c665840Q9u.getClass();
        try {
            InterfaceC634840OvC interfaceC634840OvC = c665840Q9u.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC665890Q9z.class, containerID);
            InterfaceC665890Q9z interfaceC665890Q9z = (InterfaceC665890Q9z) xBaseModelLIZJ;
            interfaceC665890Q9z.setStatusCode(0);
            interfaceC665890Q9z.setHasMore(Integer.valueOf(iIntValue));
            interfaceC665890Q9z.setItems(list);
            completionBlock.onSuccess((InterfaceC665890Q9z) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        int iLIZIZ;
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        InterfaceC683020Qqi interfaceC683020Qqi = (InterfaceC683020Qqi) obj2;
        if (interfaceC683020Qqi == null) {
            C661350Pwr.LIZJ(reusedUIAssem.LJJIJL());
        } else {
            C661350Pwr.LJIIL(reusedUIAssem.LJJIJL());
            if (interfaceC683020Qqi instanceof C683070Qqn) {
                C661350Pwr.LJIIL((C197039127h) awS446S0200000_10.l0);
                C661350Pwr.LIZJ((FrameLayout) awS446S0200000_10.l1);
                C197039127h c197039127h = (C197039127h) awS446S0200000_10.l0;
                C683070Qqn c683070Qqn = (C683070Qqn) interfaceC683020Qqi;
                c197039127h.setButtonStartIcon(c683070Qqn.LIZ);
                c197039127h.setText(c683070Qqn.LIZIZ);
                int i = C683080Qqo.LIZ[c683070Qqn.LIZJ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                }
                c197039127h.setMinWidth(iLIZIZ);
            } else if (interfaceC683020Qqi instanceof C423890Gjj) {
                C661350Pwr.LIZJ((C197039127h) awS446S0200000_10.l0);
                C661350Pwr.LJIIL((FrameLayout) awS446S0200000_10.l1);
                FrameLayout frameLayout = (FrameLayout) awS446S0200000_10.l1;
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView(((C423890Gjj) interfaceC683020Qqi).LIZ);
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(obj, (ViewGroup) awS446S0200000_10.l0)) {
            return ((SearchVideoPhotoCommentAnchorAssem) awS446S0200000_10.l1).hp(c643400PLm);
        }
        return c643400PLm;
    }

    public static final Object invoke$11(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(obj, (ViewGroup) awS446S0200000_10.l0)) {
            return ((SearchVideoPhotoCommentAnchorAssem) awS446S0200000_10.l1).hp(c643400PLm);
        }
        return c643400PLm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        DynamicPatch dynamicPatch = (DynamicPatch) ((C291001Au) obj2).LIZ;
        if (dynamicPatch != null) {
            SearchHubVM searchHubVM = (SearchHubVM) awS446S0200000_10.l0;
            FrameLayout frameLayout = (FrameLayout) awS446S0200000_10.l1;
            C641860PFo.LIZ.getClass();
            C641860PFo.LJ(dynamicPatch, searchHubVM, frameLayout);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        MotionEvent motionEvent = (MotionEvent) obj2;
        if (motionEvent.getAction() == 0) {
            ((C238400w2) awS446S0200000_10.l0).element = System.currentTimeMillis();
            C1ER1.LIZIZ.LLIIJI(((C0QQA) awS446S0200000_10.l1).getContext(), ((C0QQA) awS446S0200000_10.l1).getSearchParams());
        } else if (motionEvent.getAction() == 3) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.LLJJJJJIL(((C238400w2) awS446S0200000_10.l0).element, "comment_related_search", true);
            c1er1.LLLJ("cancel", ((C0QQA) awS446S0200000_10.l1).LLJJIJIIJIL, "ACTION_CANCEL");
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$14(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        EntityCardTitle entityCardTitle;
        List<SearchLabel> list;
        int i;
        Integer num;
        int iIntValue;
        Integer num2;
        C0PRV c0prv;
        View view;
        C291001Au c291001Au = (C291001Au) obj2;
        SearchTopBarStruct searchTopBarStruct = (SearchTopBarStruct) c291001Au.LIZ;
        if (searchTopBarStruct != null && (entityCardTitle = searchTopBarStruct.topCardInfo) != null) {
            EntityCardLabel entityCardLabel = entityCardTitle.labelInfo;
            if (entityCardLabel == null || (list = entityCardLabel.labelList) == null) {
                list = C13BV.INSTANCE;
            }
            ((C0PRV) awS446S0200000_10.l0).getClass();
            boolean zLIZJ = C0PRV.LIZJ(entityCardTitle);
            C425150Gll c425150Gll = (C425150Gll) awS446S0200000_10.l1;
            int i2 = 8;
            int i3 = 0;
            if (!zLIZJ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c425150Gll);
            if (C0BY8.LIZ() && (view = (c0prv = (C0PRV) awS446S0200000_10.l0).LLJ) != null) {
                InterfaceC644870PRd interfaceC644870PRd = c0prv.getHeaderViewHelper().LLILZIL;
                if (interfaceC644870PRd != null && interfaceC644870PRd.LJI(zLIZJ, entityCardTitle)) {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view);
            }
            SearchTopBarStruct searchTopBarStruct2 = (SearchTopBarStruct) c291001Au.LIZ;
            if (searchTopBarStruct2 != null) {
                C0PRV c0prv2 = (C0PRV) awS446S0200000_10.l0;
                C425150Gll c425150Gll2 = (C425150Gll) awS446S0200000_10.l1;
                c0prv2.getClass();
                if (C0PRV.LIZJ(entityCardTitle)) {
                    TopBarDisplay topBarDisplay = searchTopBarStruct2.topBarDisplay;
                    if (topBarDisplay == null || (num2 = topBarDisplay.fixedHeight) == null || num2.intValue() != 0) {
                        c0prv2.getTopBarAssemVM().vQ2(C0PFY.LIZ(searchTopBarStruct2, 0, true));
                    }
                } else {
                    AwS254S0300000_10 awS254S0300000_10 = new AwS254S0300000_10(c425150Gll2, c0prv2, searchTopBarStruct2, 18);
                    if (c425150Gll2.getHeight() == 0) {
                        C430110Gtl.LIZ(c0prv2, new AwS554S0100000_10(awS254S0300000_10, 1046));
                    } else {
                        awS254S0300000_10.invoke();
                    }
                }
            }
            SearchHubNativeViewModel searchHubNativeViewModel = ((C0PRV) awS446S0200000_10.l0).LLILLL;
            if (searchHubNativeViewModel == null || !Intrinsics.LJFF(searchHubNativeViewModel.LLILLL, list)) {
                SearchHubNativeViewModel searchHubNativeViewModel2 = ((C0PRV) awS446S0200000_10.l0).LLILLL;
                if (searchHubNativeViewModel2 != null) {
                    searchHubNativeViewModel2.LLILLL = list;
                }
                ArrayList arrayList = new ArrayList();
                for (SearchLabel searchLabel : list) {
                    if (searchLabel.labelText != null) {
                        arrayList.add(searchLabel);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((SearchLabel) it2.next()).labelText);
                }
                List<String> listLLIIII = C13LP.LLIIII(arrayList2);
                C425150Gll c425150Gll3 = (C425150Gll) awS446S0200000_10.l1;
                if ((listLLIIII instanceof List) && listLLIIII != null) {
                    c425150Gll3.setTabsData(listLLIIII);
                }
                EntityCardLabel entityCardLabel2 = entityCardTitle.labelInfo;
                if (entityCardLabel2 != null && (num = entityCardLabel2.labelIndex) != null && (iIntValue = num.intValue()) >= 0) {
                    i3 = iIntValue;
                }
                ((C425150Gll) awS446S0200000_10.l1).setSelectedIndex(i3);
                SearchHubNativeViewModel searchHubNativeViewModel3 = ((C0PRV) awS446S0200000_10.l0).LLILLL;
                if (searchHubNativeViewModel3 != null) {
                    searchHubNativeViewModel3.vQ2(i3);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static final Object invoke$15(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        EntityCardTitle entityCardTitle;
        List<SearchLabel> list;
        String str;
        String str2;
        GameInfo gameInfo;
        SearchLabel searchLabel;
        String str3;
        SearchLabel searchLabel2;
        String str4;
        ?? arrayList;
        String str5;
        SearchLabel searchLabel3;
        SearchLabel searchLabel4;
        EntityCardLabel entityCardLabel;
        SearchComponentCenter.TopBarComponent.ISearchTopBarAbility iSearchTopBarAbility;
        String str6 = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        SearchHubNativeViewModel searchHubNativeViewModel = ((C0PRV) awS446S0200000_10.l0).LLILLL;
        if (searchHubNativeViewModel != null) {
            searchHubNativeViewModel.vQ2(iIntValue);
        }
        C425150Gll c425150Gll = (C425150Gll) awS446S0200000_10.l1;
        Integer num = null;
        if (c425150Gll != null && (iSearchTopBarAbility = (SearchComponentCenter.TopBarComponent.ISearchTopBarAbility) C1558520qew.LIZ(C1558360qeg.LJ(c425150Gll, null), SearchComponentCenter.TopBarComponent.ISearchTopBarAbility.class, null)) != null) {
            iSearchTopBarAbility.We2(false);
        }
        SearchTopBarStruct searchTopBarStruct = ((C0PRV) awS446S0200000_10.l0).getTopBarAssemVM().getState().LLILLL;
        if (searchTopBarStruct != null) {
            entityCardTitle = searchTopBarStruct.topCardInfo;
        } else {
            entityCardTitle = null;
        }
        if (((C0PRV) awS446S0200000_10.l0).LLILLL != null) {
            if (entityCardTitle != null && (entityCardLabel = entityCardTitle.labelInfo) != null) {
                list = entityCardLabel.labelList;
            } else {
                list = null;
            }
            Context context = ((C425150Gll) awS446S0200000_10.l1).getContext();
            if (entityCardTitle != null) {
                str = entityCardTitle.entityTitle;
                str2 = entityCardTitle.entityName;
            } else {
                str = null;
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (entityCardTitle != null) {
                gameInfo = entityCardTitle.gameInfo;
            } else {
                gameInfo = null;
            }
            C654050Pl5 c654050Pl5 = C654050Pl5.LIZ;
            if (list != null) {
                searchLabel = (SearchLabel) C13LP.LJJJLZIJ(iIntValue, list);
            } else {
                searchLabel = null;
            }
            EnumC654440Pli enumC654440Pli = EnumC654440Pli.COMMON;
            c654050Pl5.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0PGM(str2, iIntValue, searchLabel, gameInfo, enumC654440Pli, null), 2);
            C639430P6f c639430P6fLIZ = C639440P6g.LIZ(context);
            SearchResultParam searchResultParam = new SearchResultParam();
            if (list != null && (searchLabel4 = (SearchLabel) C13LP.LJJJLZIJ(iIntValue, list)) != null) {
                str3 = searchLabel4.jumpQuery;
            } else {
                str3 = null;
            }
            searchResultParam.setKeyword(str3);
            searchResultParam.setEnterMethod("entity_switch");
            searchResultParam.setEntityTabIndex(iIntValue);
            searchResultParam.setShouldRecordInHistory(1);
            C844470XAv.LIZ.getClass();
            String str7 = C844470XAv.LJ;
            if (str7 == null) {
                str7 = null;
            }
            searchResultParam.setAppName(str7);
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            double d = c639430P6fLIZ.LIZ;
            c1546210qL5.getClass();
            searchResultParam.setScreenWidth(C1546210qL5.LJIIL(d, context));
            searchResultParam.setScreenHeight(C1546210qL5.LJIIL(c639430P6fLIZ.LIZIZ, context));
            if (list != null) {
                searchLabel2 = (SearchLabel) C13LP.LJJJLZIJ(iIntValue, list);
            } else {
                searchLabel2 = null;
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (str == null) {
                str = "";
            }
            if (list == null || (searchLabel3 = (SearchLabel) C13LP.LJJJLL(list)) == null || (str4 = searchLabel3.jumpQuery) == null) {
                str4 = "";
            }
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<SearchLabel> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str8 = it2.next().labelText;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList.add(str8);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (searchLabel2 != null) {
                num = searchLabel2.attachCardSource;
                str5 = searchLabel2.attachCardKey;
            } else {
                str5 = null;
            }
            SearchHubEntityContext searchHubEntityContext = new SearchHubEntityContext(str6, str, str4, arrayList, num, str5);
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(searchHubEntityContext);
            if (strLJI == null) {
                strLJI = "";
            }
            C0P7X.LIZ(new C0P9Q(C2097908Jt.LIZJ(new Pair("entity_context", strLJI))), searchResultParam);
            C1440005kM.LIZ(new C588260N5k(searchResultParam));
        }
        SearchHubNativeViewModel searchHubNativeViewModel2 = ((C0PRV) awS446S0200000_10.l0).LLILLL;
        if (searchHubNativeViewModel2 != null) {
            searchHubNativeViewModel2.LLILZIL = str6;
            C0Q3E.LJI().fe(new C640510PAj(str6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C658280Pru c658280Pru;
        Aweme aweme;
        View view = (View) obj;
        ((C658280Pru) awS446S0200000_10.l0).LLLFZ = false;
        if (view != null && view.isShown() && (aweme = (c658280Pru = (C658280Pru) awS446S0200000_10.l0).LLJJJIL) != null) {
            InterfaceC656470Poz interfaceC656470Poz = c658280Pru.LLIZLLLIL;
            int i = c658280Pru.LLJJJ;
            new ArrayList();
            interfaceC656470Poz.LIZ(i, aweme);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C658270Prt c658270Prt;
        Aweme aweme;
        View view = (View) obj;
        ((C658270Prt) awS446S0200000_10.l0).LLJJJIL = false;
        if (view != null && view.isShown() && (aweme = (c658270Prt = (C658270Prt) awS446S0200000_10.l0).LLJJIJI) != null) {
            InterfaceC656470Poz interfaceC656470Poz = c658270Prt.LLJ;
            int i = c658270Prt.LLJJIJIL;
            new ArrayList();
            interfaceC656470Poz.LIZ(i, aweme);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        UserPhotoHolder userPhotoHolder;
        Aweme aweme;
        View view = (View) obj;
        ((UserPhotoHolder) awS446S0200000_10.l0).LLJJIJIL = false;
        if (view != null && view.isShown() && (aweme = (userPhotoHolder = (UserPhotoHolder) awS446S0200000_10.l0).LLJILJIL) != null) {
            InterfaceC656470Poz interfaceC656470Poz = userPhotoHolder.LLIZLLLIL;
            int i = userPhotoHolder.LLJJIJI;
            new ArrayList();
            interfaceC656470Poz.LIZ(i, aweme);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        User user = (User) obj;
        int iIntValue = ((Number) obj2).intValue();
        NimbleUserAssem nimbleUserAssem = (NimbleUserAssem) awS446S0200000_10.l0;
        if (iIntValue == nimbleUserAssem.LLJLILLLLZIIL) {
            INimbleUserDependAbility iNimbleUserDependAbilityTp = nimbleUserAssem.tp();
            if (iNimbleUserDependAbilityTp != null) {
                iNimbleUserDependAbilityTp.JP(user);
            }
            ((NimbleUserAssem) awS446S0200000_10.l0).sp(user, ((InterfaceC689370R2h) awS446S0200000_10.l1).LJ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        TopBarDisplay topBarDisplay;
        int iIntValue;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        ViewGroup.MarginLayoutParams marginLayoutParams8;
        ViewGroup.MarginLayoutParams marginLayoutParams9;
        int i7;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        int i8 = 0;
        if (C291290BbL.LIZ()) {
            SearchTopBarAssem searchTopBarAssem = (SearchTopBarAssem) awS446S0200000_10.l0;
            T t = c291001Au.LIZ;
            View viewLJJIJL = uIAssem.LJJIJL();
            RecyclerView recyclerView = (RecyclerView) awS446S0200000_10.l1;
            int iHp = searchTopBarAssem.hp();
            if (Intrinsics.LJFF(t, Boolean.TRUE) && (i7 = -((int) viewLJJIJL.getTranslationY())) > 0) {
                C786410Ut5.ed(viewLJJIJL, -iHp);
                if (recyclerView != null) {
                    recyclerView.scrollBy(0, i7);
                }
                searchTopBarAssem.ip().wQ2(0, iHp);
            }
        } else {
            final SearchTopBarAssem searchTopBarAssem2 = (SearchTopBarAssem) awS446S0200000_10.l0;
            Object obj3 = c291001Au.LIZ;
            final View viewLJJIJL2 = uIAssem.LJJIJL();
            final RecyclerView recyclerView2 = (RecyclerView) awS446S0200000_10.l1;
            SearchTopBarStruct searchTopBarStruct = searchTopBarAssem2.ip().getState().LLILLL;
            if (searchTopBarStruct != null && (topBarDisplay = searchTopBarStruct.topBarDisplay) != null) {
                Integer num = topBarDisplay.scrollAnimationType;
                int value = C0PGH.IMAGE_REFINE_TYPE.getValue();
                if ((num == null || num.intValue() != value) && viewLJJIJL2.getVisibility() == 0) {
                    Integer num2 = topBarDisplay.fixedHeight;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    if (!Intrinsics.LJFF(topBarDisplay.fixedHeight, topBarDisplay.totalHeight)) {
                        final int iHp2 = searchTopBarAssem2.hp();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("return from detail page:");
                        sbLIZ.append(obj3);
                        sbLIZ.append(", marginTop: [");
                        ViewGroup.LayoutParams layoutParams = viewLJJIJL2.getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            i = marginLayoutParams9.topMargin;
                        } else {
                            i = 0;
                        }
                        sbLIZ.append(i);
                        sbLIZ.append("] height: [");
                        sbLIZ.append(iHp2);
                        sbLIZ.append("] tab: ");
                        sbLIZ.append(iLIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        ViewGroup.LayoutParams layoutParams2 = viewLJJIJL2.getLayoutParams();
                        if (((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams2) != null && marginLayoutParams8.topMargin != 0) || Intrinsics.LJFF(obj3, Boolean.TRUE)) {
                            ViewGroup.LayoutParams layoutParams3 = viewLJJIJL2.getLayoutParams();
                            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                i2 = marginLayoutParams7.topMargin;
                            } else {
                                i2 = 0;
                            }
                            if (i2 + searchTopBarAssem2.hp() >= iLIZIZ) {
                                if (recyclerView2 != null) {
                                    if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                                        int i9 = iHp2 - iLIZIZ;
                                        ViewGroup.LayoutParams layoutParams4 = viewLJJIJL2.getLayoutParams();
                                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                                            i5 = marginLayoutParams6.topMargin;
                                        } else {
                                            i5 = 0;
                                        }
                                        int i10 = i5 + i9;
                                        if (i10 != 0) {
                                            recyclerView2.scrollBy(0, i10);
                                            ViewGroup.LayoutParams layoutParams5 = viewLJJIJL2.getLayoutParams();
                                            if (layoutParams5 != null) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                                marginLayoutParams10.topMargin = -i9;
                                                C786410Ut5.W5(viewLJJIJL2, marginLayoutParams10);
                                                SearchTopBarAssemViewModel searchTopBarAssemViewModelIp = searchTopBarAssem2.ip();
                                                ViewGroup.LayoutParams layoutParams6 = viewLJJIJL2.getLayoutParams();
                                                if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                                                    i6 = marginLayoutParams5.topMargin;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11 = iHp2 + i6;
                                                ViewGroup.LayoutParams layoutParams7 = viewLJJIJL2.getLayoutParams();
                                                if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                                                    i8 = marginLayoutParams4.topMargin;
                                                }
                                                searchTopBarAssemViewModelIp.wQ2(i11, -i8);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            }
                                        }
                                    } else {
                                        recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0PGK
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams11;
                                                int i20;
                                                int i21;
                                                ViewGroup.MarginLayoutParams marginLayoutParams12;
                                                ViewGroup.MarginLayoutParams marginLayoutParams13;
                                                view.removeOnLayoutChangeListener(this);
                                                int i22 = iHp2 - iLIZIZ;
                                                ViewGroup.LayoutParams layoutParams8 = viewLJJIJL2.getLayoutParams();
                                                if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                                                    marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams8;
                                                } else {
                                                    marginLayoutParams11 = null;
                                                }
                                                int i23 = 0;
                                                if (marginLayoutParams11 != null) {
                                                    i20 = marginLayoutParams11.topMargin;
                                                } else {
                                                    i20 = 0;
                                                }
                                                int i24 = i20 + i22;
                                                if (i24 != 0) {
                                                    recyclerView2.scrollBy(0, i24);
                                                    View view2 = viewLJJIJL2;
                                                    ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                                                    if (layoutParams9 != null) {
                                                        ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams9;
                                                        marginLayoutParams14.topMargin = -i22;
                                                        C786410Ut5.W5(view2, marginLayoutParams14);
                                                        SearchTopBarAssemViewModel searchTopBarAssemViewModelIp2 = searchTopBarAssem2.ip();
                                                        int i25 = iHp2;
                                                        ViewGroup.LayoutParams layoutParams10 = viewLJJIJL2.getLayoutParams();
                                                        if ((layoutParams10 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                                                            i21 = marginLayoutParams13.topMargin;
                                                        } else {
                                                            i21 = 0;
                                                        }
                                                        int i26 = i25 + i21;
                                                        ViewGroup.LayoutParams layoutParams11 = viewLJJIJL2.getLayoutParams();
                                                        if ((layoutParams11 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams11) != null) {
                                                            i23 = marginLayoutParams12.topMargin;
                                                        }
                                                        searchTopBarAssemViewModelIp2.wQ2(i26, -i23);
                                                        return;
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                }
                                            }
                                        });
                                    }
                                }
                            } else if (recyclerView2 != null) {
                                if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                                    ViewGroup.LayoutParams layoutParams8 = viewLJJIJL2.getLayoutParams();
                                    if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                                        i3 = marginLayoutParams3.topMargin;
                                    } else {
                                        i3 = 0;
                                    }
                                    recyclerView2.scrollBy(0, i3 + iHp2);
                                    ViewGroup.LayoutParams layoutParams9 = viewLJJIJL2.getLayoutParams();
                                    if (layoutParams9 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams9;
                                        marginLayoutParams11.topMargin = -iHp2;
                                        C786410Ut5.W5(viewLJJIJL2, marginLayoutParams11);
                                        SearchTopBarAssemViewModel searchTopBarAssemViewModelIp2 = searchTopBarAssem2.ip();
                                        ViewGroup.LayoutParams layoutParams10 = viewLJJIJL2.getLayoutParams();
                                        if ((layoutParams10 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                                            i4 = marginLayoutParams2.topMargin;
                                        } else {
                                            i4 = 0;
                                        }
                                        int i12 = iHp2 + i4;
                                        ViewGroup.LayoutParams layoutParams11 = viewLJJIJL2.getLayoutParams();
                                        if ((layoutParams11 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams11) != null) {
                                            i8 = marginLayoutParams.topMargin;
                                        }
                                        searchTopBarAssemViewModelIp2.wQ2(i12, -i8);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    }
                                } else {
                                    recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0PGL
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams12;
                                            int i21;
                                            int i22;
                                            ViewGroup.MarginLayoutParams marginLayoutParams13;
                                            ViewGroup.MarginLayoutParams marginLayoutParams14;
                                            view.removeOnLayoutChangeListener(this);
                                            ViewGroup.LayoutParams layoutParams12 = viewLJJIJL2.getLayoutParams();
                                            if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams12;
                                            } else {
                                                marginLayoutParams12 = null;
                                            }
                                            int i23 = 0;
                                            if (marginLayoutParams12 != null) {
                                                i21 = marginLayoutParams12.topMargin;
                                            } else {
                                                i21 = 0;
                                            }
                                            recyclerView2.scrollBy(0, i21 + iHp2);
                                            View view2 = viewLJJIJL2;
                                            ViewGroup.LayoutParams layoutParams13 = view2.getLayoutParams();
                                            if (layoutParams13 != null) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams15 = (ViewGroup.MarginLayoutParams) layoutParams13;
                                                marginLayoutParams15.topMargin = -iHp2;
                                                C786410Ut5.W5(view2, marginLayoutParams15);
                                                SearchTopBarAssemViewModel searchTopBarAssemViewModelIp3 = searchTopBarAssem2.ip();
                                                int i24 = iHp2;
                                                ViewGroup.LayoutParams layoutParams14 = viewLJJIJL2.getLayoutParams();
                                                if ((layoutParams14 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams14) != null) {
                                                    i22 = marginLayoutParams14.topMargin;
                                                } else {
                                                    i22 = 0;
                                                }
                                                int i25 = i24 + i22;
                                                ViewGroup.LayoutParams layoutParams15 = viewLJJIJL2.getLayoutParams();
                                                if ((layoutParams15 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams15) != null) {
                                                    i23 = marginLayoutParams13.topMargin;
                                                }
                                                searchTopBarAssemViewModelIp3.wQ2(i25, -i23);
                                                return;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C658230Prp c658230Prp;
        Aweme aweme;
        View view = (View) obj;
        ((C658230Prp) awS446S0200000_10.l0).LLJILJILJ = false;
        if (view != null && view.isShown() && (aweme = (c658230Prp = (C658230Prp) awS446S0200000_10.l0).LLJ) != null) {
            InterfaceC656470Poz interfaceC656470Poz = c658230Prp.LL;
            int i = c658230Prp.LLJIJIL;
            new ArrayList();
            interfaceC656470Poz.LIZ(i, aweme);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        C658240Prq c658240Prq;
        Aweme aweme;
        View view = (View) obj;
        ((C658240Prq) awS446S0200000_10.l0).LLIZLLLIL = false;
        if (view != null && view.isShown() && (aweme = (c658240Prq = (C658240Prq) awS446S0200000_10.l0).LLILZIL) != null) {
            InterfaceC656470Poz interfaceC656470Poz = c658240Prq.LL;
            int i = c658240Prq.LLILZLL;
            new ArrayList();
            interfaceC656470Poz.LIZ(i, aweme);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$3(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        LynxView lynxViewLJIILJJIL;
        IECMixContentPlayAbility iECMixContentPlayAbility;
        InterfaceC676520QgE interfaceC676520QgEPC1;
        InterfaceC676520QgE interfaceC676520QgEPC12;
        IECMixContentPlayAbility iECMixContentPlayAbility2;
        C661440Px0 c661440Px0;
        InterfaceC676520QgE autoPlayHandler;
        IECMixContentPlayAbility iECMixContentPlayAbility3;
        String str = (String) obj;
        Map map = (Map) obj2;
        int iIntValue = 0;
        switch (str.hashCode()) {
            case 96651962:
                if (str.equals("ended") && (c661440Px0 = (C661440Px0) ((LynxShopSearchVideo) awS446S0200000_10.l0).mView) != null) {
                    c661440Px0.LJJI(0, false);
                }
                break;
            case 538738084:
                if (str.equals("attached")) {
                    LynxView lynxViewLJIILJJIL2 = ((LynxShopSearchVideo) awS446S0200000_10.l0).mContext.LJIILJJIL();
                    if (lynxViewLJIILJJIL2 != null && (iECMixContentPlayAbility2 = (IECMixContentPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(lynxViewLJIILJJIL2, null), IECMixContentPlayAbility.class, null)) != null) {
                        interfaceC676520QgEPC12 = iECMixContentPlayAbility2.pC1();
                    } else {
                        interfaceC676520QgEPC12 = null;
                    }
                    ((C661890Pxj) awS446S0200000_10.l1).setAutoPlayHandler(interfaceC676520QgEPC12);
                    if (C138500fv.LIZ()) {
                        ((LynxShopSearchVideo) awS446S0200000_10.l0).LJJIJ();
                    } else if (interfaceC676520QgEPC12 != null) {
                        interfaceC676520QgEPC12.LIZIZ((C661890Pxj) awS446S0200000_10.l1);
                    }
                }
                break;
            case 1044548466:
                if (str.equals("detached") && (lynxViewLJIILJJIL = ((LynxShopSearchVideo) awS446S0200000_10.l0).mContext.LJIILJJIL()) != null && (iECMixContentPlayAbility = (IECMixContentPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(lynxViewLJIILJJIL, null), IECMixContentPlayAbility.class, null)) != null && (interfaceC676520QgEPC1 = iECMixContentPlayAbility.pC1()) != null) {
                    interfaceC676520QgEPC1.LIZJ((C661890Pxj) awS446S0200000_10.l1);
                }
                break;
            case 1762557398:
                if (str.equals("timeupdate")) {
                    HashMap map2 = (HashMap) map;
                    Integer num = (Integer) map2.get("progress");
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    map2.put("playTime", Integer.valueOf(iIntValue / LSPassThroughRecordSizeConfig.DEFAULT));
                }
                break;
        }
        if (C659020Pt6.LIZ(str)) {
            LynxShopSearchVideo lynxShopSearchVideo = (LynxShopSearchVideo) awS446S0200000_10.l0;
            C1298720jtu c1298720jtu = lynxShopSearchVideo.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxShopSearchVideo.getSign(), str);
            for (Map.Entry entry : map.entrySet()) {
                c1289960jfm.LIZIZ(entry.getValue(), (String) entry.getKey());
            }
            c1298720jtu.LIZIZ(c1289960jfm);
            LynxView lynxViewLJIILJJIL3 = ((LynxShopSearchVideo) awS446S0200000_10.l0).mContext.LJIILJJIL();
            if ((lynxViewLJIILJJIL3 != null && (iECMixContentPlayAbility3 = (IECMixContentPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(lynxViewLJIILJJIL3, null), IECMixContentPlayAbility.class, null)) != null && (autoPlayHandler = iECMixContentPlayAbility3.pC1()) != null) || (autoPlayHandler = ((C661890Pxj) awS446S0200000_10.l1).getAutoPlayHandler()) != null) {
                autoPlayHandler.LJFF((C661890Pxj) awS446S0200000_10.l1, str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        IECMixContentPlayAbility iECMixContentPlayAbility;
        String str = (String) obj;
        Map map = (Map) obj2;
        LynxView lynxViewLJIILJJIL = ((LynxShopSearchLive) awS446S0200000_10.l0).mContext.LJIILJJIL();
        InterfaceC676520QgE autoPlayHandler = null;
        if (lynxViewLJIILJJIL != null && (iECMixContentPlayAbility = (IECMixContentPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(lynxViewLJIILJJIL, null), IECMixContentPlayAbility.class, null)) != null) {
            autoPlayHandler = iECMixContentPlayAbility.pC1();
        }
        if (Intrinsics.LJFF(str, "attached")) {
            if (autoPlayHandler != null) {
                autoPlayHandler.LIZIZ((C658700Psa) awS446S0200000_10.l1);
            }
            ((C658700Psa) awS446S0200000_10.l1).setAutoPlayHandler(autoPlayHandler);
        } else if (Intrinsics.LJFF(str, "detached") && autoPlayHandler != null) {
            autoPlayHandler.LIZJ((C658700Psa) awS446S0200000_10.l1);
        }
        if (C13LQ.LJLIIL(new String[]{"play", "stop", "ended", "error", "loading"}).contains(str)) {
            LynxShopSearchLive lynxShopSearchLive = (LynxShopSearchLive) awS446S0200000_10.l0;
            C1298720jtu c1298720jtu = lynxShopSearchLive.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxShopSearchLive.getSign(), str);
            for (Map.Entry entry : map.entrySet()) {
                c1289960jfm.LIZIZ(entry.getValue(), (String) entry.getKey());
            }
            c1298720jtu.LIZIZ(c1289960jfm);
            if (autoPlayHandler != null || (autoPlayHandler = ((C658700Psa) awS446S0200000_10.l1).getAutoPlayHandler()) != null) {
                autoPlayHandler.LJFF((C658700Psa) awS446S0200000_10.l1, str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0140: IGET (r1 I:java.lang.Object) = (r2 I:kotlin.jvm.internal.AwS446S0200000_10) (LINE:50331968) kotlin.jvm.internal.AwS446S0200000_10.l0 java.lang.Object, block:B:31:0x013d */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.AwS446S0200000_10] */
    public static final Object invoke$5(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        ?? r2;
        String str;
        ((Boolean) obj).booleanValue();
        String str2 = (String) obj2;
        try {
            SmartImageView smartImageView = ((SearchTakoCardAssem) awS446S0200000_10.l0).LLL;
            SmartImageView smartImageView2 = null;
            Integer numValueOf = null;
            if (smartImageView == null) {
                smartImageView = null;
            }
            C339190DRl.LIZLLL(smartImageView);
            if (C0C1B.LIZ()) {
                Uri uriFromFile = Uri.fromFile(new C0VSJ(str2));
                SmartImageView smartImageView3 = ((SearchTakoCardAssem) awS446S0200000_10.l0).LLL;
                if (smartImageView3 == null) {
                    smartImageView3 = null;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                C419910GdJ c419910GdJLIZJ = ((ITakoService) ((SearchTakoCardAssem) awS446S0200000_10.l0).LLJLLL.getValue()).LJJLIIIJ().LIZJ(null, null, C467860IWi.LIZ(((SearchTakoCardAssem) awS446S0200000_10.l0).getContext()));
                SmartImageView smartImageView4 = ((SearchTakoCardAssem) awS446S0200000_10.l0).LLL;
                if (smartImageView4 == null) {
                    smartImageView4 = null;
                }
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJLIZJ.LIZ(smartImageView4.getContext());
                int rank = ((C652590Pij) awS446S0200000_10.l1).LL.getRank();
                Aweme aweme = ((C652590Pij) awS446S0200000_10.l1).LL.getAweme();
                C0PRC c0prcZp = ((SearchTakoCardAssem) awS446S0200000_10.l0).zp();
                if (c0prcZp != null) {
                    numValueOf = Integer.valueOf(c0prcZp.LL);
                }
                C0PRC c0prcZp2 = ((SearchTakoCardAssem) awS446S0200000_10.l0).zp();
                if (c0prcZp2 == null || (str = c0prcZp2.LLILLL) == null) {
                    str = "";
                }
                C657910PrJ.LIZ(uriFromFile, null, smartImageView3, tuxIconDrawableLIZ, iLIZIZ, iLIZIZ2, str, rank, aweme, numValueOf, new C689680R3m((SearchTakoCardAssem) awS446S0200000_10.l0, 2), null, null, 27650);
            } else {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(new C0VSJ(str2)));
                SmartImageView smartImageView5 = ((SearchTakoCardAssem) awS446S0200000_10.l0).LLL;
                if (smartImageView5 == null) {
                    smartImageView5 = null;
                }
                c1331670kl3LJI.LJJ(smartImageView5);
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                c1331670kl3LJI.LJIIIIZZ = iLIZIZ3;
                c1331670kl3LJI.LJIIIZ = iLIZIZ4;
                C419910GdJ c419910GdJLIZJ2 = ((ITakoService) ((SearchTakoCardAssem) awS446S0200000_10.l0).LLJLLL.getValue()).LJJLIIIJ().LIZJ(null, null, C467860IWi.LIZ(((SearchTakoCardAssem) awS446S0200000_10.l0).getContext()));
                SmartImageView smartImageView6 = ((SearchTakoCardAssem) awS446S0200000_10.l0).LLL;
                if (smartImageView6 != null) {
                    smartImageView2 = smartImageView6;
                }
                c1331670kl3LJI.LJIL(c419910GdJLIZJ2.LIZ(smartImageView2.getContext()));
                c1331670kl3LJI.LJIIJ(new C689680R3m((SearchTakoCardAssem) awS446S0200000_10.l0, 3));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((SearchTakoCardAssem) r2.l0).Fp(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        if (((C654210PlL) awS446S0200000_10.l0).LLILLJJLI) {
            ((Function1) awS446S0200000_10.l1).invoke(obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        int i;
        User user = (User) obj;
        int iIntValue = ((Number) obj2).intValue();
        TakoUserAssem takoUserAssem = (TakoUserAssem) awS446S0200000_10.l0;
        if (takoUserAssem.LLJLLL == iIntValue) {
            TakoBlockInfo takoBlockInfo = new TakoBlockInfo(user.isBlock, user.isBlocked());
            if (takoBlockInfo.isBlock) {
                if (takoBlockInfo.isBlocked) {
                    i = 4;
                } else {
                    i = 1;
                }
            } else if (takoBlockInfo.isBlocked) {
                i = 2;
            } else {
                i = 0;
            }
            user.setBlockStatus(i);
            takoUserAssem.op(user, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS446S0200000_10 awS446S0200000_10, Object obj, Object obj2) {
        Integer num;
        ITakoSubCardScrollProtocol iTakoSubCardScrollProtocol;
        if (obj2 == C0SY7.FOLLOWED && (num = (Integer) awS446S0200000_10.l0) != null) {
            TakoUserAssem takoUserAssem = (TakoUserAssem) awS446S0200000_10.l1;
            int iIntValue = num.intValue();
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(takoUserAssem), ITakoSubCardScrollProtocol.class, false);
            if (listLIZIZ != null && (iTakoSubCardScrollProtocol = (ITakoSubCardScrollProtocol) C13LP.LJJJLL(listLIZIZ)) != null) {
                iTakoSubCardScrollProtocol.at0(iIntValue);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r0
      0x0028: PHI (r0v10 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v6 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v14 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:13:0x0026, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS446S0200000_10 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem r0 = (com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem) r0
            java.lang.Object r1 = X.C631370Opb.LIZ(r0)
            boolean r0 = r1 instanceof X.C659520Ptu
            if (r0 == 0) goto L14
            X.0Ptu r1 = (X.C659520Ptu) r1
            if (r1 == 0) goto L14
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LL
            if (r0 != 0) goto L28
        L14:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem r0 = (com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem) r0
            java.lang.Object r1 = X.C631370Opb.LIZ(r0)
            boolean r0 = r1 instanceof X.C659750PuH
            if (r0 == 0) goto L45
            X.0PuH r1 = (X.C659750PuH) r1
            if (r1 == 0) goto L45
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LL
            if (r0 == 0) goto L45
        L28:
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r3 = X.C0Q3E.LIZJ(r0)
            if (r3 == 0) goto L45
            X.0PnM r2 = new X.0PnM
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.comment.model.Comment r0 = (com.ss.android.ugc.aweme.comment.model.Comment) r0
            if (r0 == 0) goto L3c
            java.lang.String r1 = r0.getCid()
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = ""
        L3e:
            r0 = 1
            r2.<init>(r1, r0)
            r3.fe(r2)
        L45:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem r0 = (com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem) r0
            r0.yp()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS446S0200000_10.invoke$9(kotlin.jvm.internal.AwS446S0200000_10, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS446S0200000_10(C654210PlL c654210PlL, C654210PlL c654210PlL2, Function1<Object, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c654210PlL;
        this.l1 = c654210PlL2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C658230Prp c658230Prp, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c658230Prp;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C658240Prq c658240Prq, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c658240Prq;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C658270Prt c658270Prt, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c658270Prt;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C658280Pru c658280Pru, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c658280Pru;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS446S0200000_10(C665840Q9u c665840Q9u, C665840Q9u c665840Q9u2, CompletionBlock<InterfaceC665890Q9z> completionBlock) {
        super(2);
        this.$t = completionBlock;
        this.l0 = c665840Q9u;
        this.l1 = c665840Q9u2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C0QQA c0qqa, C238400w2 c238400w2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c0qqa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(C197039127h c197039127h, FrameLayout frameLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = c197039127h;
        this.l1 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS446S0200000_10(ViewGroup viewGroup, ViewGroup viewGroup2, SearchVideoPhotoCommentAnchorAssem<Object> searchVideoPhotoCommentAnchorAssem) {
        super(2);
        this.$t = searchVideoPhotoCommentAnchorAssem;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(NimbleUserAssem nimbleUserAssem, InterfaceC689370R2h interfaceC689370R2h, int i) {
        super(2);
        this.$t = i;
        this.l0 = nimbleUserAssem;
        this.l1 = interfaceC689370R2h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(SearchTopBarAssem searchTopBarAssem, RecyclerView recyclerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchTopBarAssem;
        this.l1 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(LynxShopSearchLive lynxShopSearchLive, C658700Psa c658700Psa, int i) {
        super(2);
        this.$t = i;
        this.l0 = lynxShopSearchLive;
        this.l1 = c658700Psa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(LynxShopSearchVideo lynxShopSearchVideo, C661890Pxj c661890Pxj, int i) {
        super(2);
        this.$t = i;
        this.l0 = lynxShopSearchVideo;
        this.l1 = c661890Pxj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(SearchTakoCardAssem searchTakoCardAssem, C652590Pij c652590Pij, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchTakoCardAssem;
        this.l1 = c652590Pij;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS446S0200000_10(SearchVideoPhotoCommentAnchorAssem searchVideoPhotoCommentAnchorAssem, SearchVideoPhotoCommentAnchorAssem<Object> searchVideoPhotoCommentAnchorAssem2, Comment comment) {
        super(2);
        this.$t = comment;
        this.l0 = searchVideoPhotoCommentAnchorAssem;
        this.l1 = searchVideoPhotoCommentAnchorAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(UserPhotoHolder userPhotoHolder, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = userPhotoHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(SearchHubVM searchHubVM, FrameLayout frameLayout, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchHubVM;
        this.l1 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(TakoUserAssem takoUserAssem, InterfaceC689340R2e interfaceC689340R2e, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoUserAssem;
        this.l1 = interfaceC689340R2e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS446S0200000_10(Integer num, TakoUserAssem takoUserAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = num;
        this.l1 = takoUserAssem;
    }
}
