package com.ss.android.ugc.aweme.poi_api.service;

import X.AbstractC1189550h3p;
import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.C03D6;
import X.C03H5;
import X.C0OFL;
import X.C0RZE;
import X.C0TRR;
import X.C0WIY;
import X.C0ZYL;
import X.C1192360h8M;
import X.C1193880hAo;
import X.C1193900hAq;
import X.C1193920hAs;
import X.C1194010hB1;
import X.C1194020hB2;
import X.C1194040hB4;
import X.C1194050hB5;
import X.C1194060hB6;
import X.C1199450hJn;
import X.C13BV;
import X.C13IQ;
import X.C1711530udj;
import X.C1711540udk;
import X.C19EG;
import X.C2097608Jq;
import X.C2189821An6;
import X.C704070RjZ;
import X.EnumC1201990hNt;
import X.EnumC642080PGk;
import X.InterfaceC1186204kW;
import X.InterfaceC1188520h2A;
import X.InterfaceC1191270h6b;
import X.InterfaceC1192370h8N;
import X.InterfaceC1194100hBA;
import X.InterfaceC1197120hG2;
import X.InterfaceC1364105Vn;
import X.InterfaceC1393680mN4;
import X.InterfaceC1605290rsN;
import X.InterfaceC1631630sYr;
import X.InterfaceC691450RAh;
import X.InterfaceC702540Rh6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.anchor.IPoiTagComponent;
import com.ss.android.ugc.aweme.poi.collect.IPoiCollectService;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService;
import com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService;
import com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService;
import com.ss.android.ugc.aweme.poi.reviews.IReviewsService;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import j27.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS194S1100000_18;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS600S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiServiceEmptyImpl implements IPoiService, IPoiTagService, IPoiAnchorService, IPoiVideoPublishService, IPoiTransactionService, IPoiHybridService, IReviewsService, IPoiDetailPageService, IPoiCollectService, ILSFeedCardService, ILSFeedGPSCardService {
    public final /* synthetic */ C0RZE LIZ = new IPoiTagService() { // from class: X.0RZE
        @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
        public final void appendPoiTagParamsIfHave(String str, HashMap<String, String> map, Aweme aweme) {
        }

        @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
        public final VideoTagCategoryProtocol getPoiTagTrigger() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
        public final VideoTagCategoryProtocol getPoiTagTriggerV2() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
        public final C03D6 getPoiTagView(Context context) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
        public final boolean isPoiTagShow(String str, Aweme aweme) {
            return false;
        }
    };
    public final /* synthetic */ C704070RjZ LIZIZ = new IPoiAnchorService() { // from class: X.0RjZ
        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final int getIconResByABExp(boolean z) {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final PoiAnchorButtonInfo getPoiAnchorCta(Aweme aweme) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final BottomBarPriorityProtocol getPoiBottomBarAssem() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final VideoBottomLabelProtocol getPoiCreatorBottomLabelTrigger() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final IPoiTagComponent getPoiTagComponent() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final <T> Function1<T, InterfaceC702540Rh6> getPoiTagPolicyProvider() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> getPoiTagProvider() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final boolean isPoiAnchorView2(View view) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final void measureAnchorTexts(String str, TextView textView, String str2, TextView textView2, View view, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final Boolean shouldAddNearbyExplore() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
        public final boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
            return false;
        }
    };
    public final /* synthetic */ C1193880hAo LIZJ = new C1193880hAo();
    public final /* synthetic */ C1193920hAs LIZLLL = new IPoiTransactionService() { // from class: X.0hAs
        @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
        public final Function2<String, JSONObject, Unit> LIZLLL() {
            throw null;
        }

        @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
        public final Object LJJJJZ(String str, C1711530udj c1711530udj) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
        public final Object LLFZ(String str, C1711540udk c1711540udk) {
            return null;
        }
    };
    public final /* synthetic */ C1194060hB6 LJ = new IPoiHybridService() { // from class: X.0hB6
        @Override // com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService
        public final void registerSparkPlugin() {
        }
    };
    public final /* synthetic */ C1194040hB4 LJFF = new IReviewsService() { // from class: X.0hB4
        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void friendPageUnifyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final int getTightenFriendPageDailyFreqTimes() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final int getTightenFriendPageWeeklyFreqTimes() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final int getTightenProfilePageDailyFreqTimes() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final int getTightenProfilePageWeeklyFreqTimes() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isFriendPageUnifyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isProfileCloseUnifyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isProfilePageUnifyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isTightenCloseFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isTightenFriendPageDailyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isTightenFriendPageWeeklyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isTightenProfilePageDailyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final boolean isTightenProfilePageWeeklyFreqHit() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void profileCloseUnifyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void profilePageUnifyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenCloseFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenFriendPageDailyFreqClicked() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenFriendPageDailyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenFriendPageWeeklyFreqClicked() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenFriendPageWeeklyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenProfilePageDailyFreqClicked() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenProfilePageDailyFreqLog() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenProfilePageWeeklyFreqClicked() {
        }

        @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
        public final void tightenProfilePageWeeklyFreqLog() {
        }
    };
    public final /* synthetic */ C1194020hB2 LJI = new IPoiDetailPageService() { // from class: X.0hB2
        @Override // com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService
        public final Integer getPoiDetailFeedClickIndex(String str) {
            return null;
        }
    };
    public final /* synthetic */ C1194010hB1 LJII = new IPoiCollectService() { // from class: X.0hB1
        @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
        public final boolean canShowWantTogoCollection() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
        public final void onCollectionDelete(String str) {
        }

        @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
        public final void onVideoAddToCollection(Boolean bool, String str, String str2, String str3, String str4) {
        }

        @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
        public final void onWantToGoClick() {
        }

        @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
        public final void onWantToGoShow() {
        }
    };
    public final /* synthetic */ C1193900hAq LJIIIIZZ = new ILSFeedCardService() { // from class: X.0hAq
        @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
        public final Function2<String, JSONObject, Unit> getEventHandler() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
        public final List<C0TRR> getLSCardInsertExecutor() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
        public final void insertCardResultTrack(int i, String str, int i2) {
        }

        @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
        public final void requestInsertCardTrack(List<CardTypeRequest> list, int i) {
        }
    };
    public final /* synthetic */ C1194050hB5 LJIIIZ = new ILSFeedGPSCardService() { // from class: X.0hB5
        @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService
        public final void clearExploreNearbyBtnData() {
        }
    };

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C0ZYL LIZIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LIZJ(int i) {
    }

    @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
    public final Function2<String, JSONObject, Unit> LIZLLL() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final LynxUI<?> LJ(s sVar) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJFF(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJI(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1605290rsN LJIIIIZZ(Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIIIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIIJ(String str, AwS600S0100000_21 awS600S0100000_21) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final int LJIIJJI() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final IInterceptor LJIILIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIILL(Bundle bundle, View view, FragmentManager fragmentManager) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIILLIIL(ViewGroup viewGroup, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1194100hBA LJIIZILJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIJ(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIJI(Context context, String str, List<String> list, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIJJ(CreativeModel creativeModel) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJJ(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJI(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Boolean LJJIFFI(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJII(EnumC642080PGk enumC642080PGk) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIII(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIIJ(Context context, EnumC642080PGk enumC642080PGk) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJIIJZLJL(Context context, String str, List list) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIIZ(C19EG c19eg, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIJ(Integer num, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIJIIJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIJIIJIL(C2189821An6 c2189821An6) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1191270h6b LJJIJIL(PoiData poiData) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1605290rsN LJJIJL(Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIJLIJ(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C0OFL LJJIL(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJ(Aweme aweme, HashMap map) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Class<? extends AbstractC1549150qPp<?, ?>> LJJJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJIL(EnumC1201990hNt enumC1201990hNt, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJJJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1605290rsN LJJJJI(Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Object LJJJJIZL(String str, InterfaceC1364105Vn<? super PoiRevisitBannerRelatedResponse> interfaceC1364105Vn) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJJJ(Context context, Number number, String str, Boolean bool, Boolean bool2, AwS384S0200000_18 awS384S0200000_18, AwS562S0100000_18 awS562S0100000_18) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Object LJJJJJL(InterfaceC691450RAh interfaceC691450RAh) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJJL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C0WIY<Class<?>, IAVPublishExtension<?>> LJJJJLI(AVPublishPageScene aVPublishPageScene, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJJLL(PoiDataStruct poiDataStruct, ImageUrlModel imageUrlModel, SmartImageView smartImageView) {
    }

    @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
    public final Object LJJJJZ(String str, C1711530udj c1711530udj) {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final <T extends InterfaceC1188520h2A> T LJJJJZI(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Integer LJJJLZIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJL(Context context, Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLI(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1192370h8N LJJLIIIIJ(ViewGroup viewGroup) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Class<? extends AbstractC738140SxQ> LJJLIIIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Integer LJJLIIIJILLIZJL(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJJI(Integer num, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJL(SmartRoute smartRoute, Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJLJLI() {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJLLLLLLLZ(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLIIJ(C2189821An6 c2189821An6) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C13IQ<? extends AbstractC738140SxQ> LJJLIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLJ(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLL(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final AbstractC1189550h3p LJJZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJZZI(C19EG c19eg) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJZZIII(C1199450hJn c1199450hJn) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJL(String str, String str2, String str3, String str4, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJLI(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final float LJLIIIL() {
        return 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJLIL(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJLILLLLZI() {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJLJJI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLJJL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLJJLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJLJL(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLJLJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJLJLLL(String str, AwS194S1100000_18 awS194S1100000_18, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLL(Context context, Double d, Double d2, String str, String str2, Float f, String str3, String str4, PageFinder pageFinder) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJLLI(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C13IQ<? extends AbstractC738140SxQ> LJLLILLLL(C2189821An6 c2189821An6) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJLLJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C13IQ<? extends UIContentAssem> LJLLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Fragment LJLLLL(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJLLLLLL(PoiData poiData, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJLZ(Context context, Aweme aweme, String str, AwS255S0300000_11 awS255S0300000_11) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final CreateAnchorInfo LJZ(PoiData poiData) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJZI(Aweme aweme, C2189821An6 c2189821An6, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJZL(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LLD() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LLF(Context context, Aweme aweme, String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LLFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final <T> boolean LLFFF(T t, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final IInterceptor LLFII() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService
    public final Object LLFZ(String str, C1711540udk c1711540udk) {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LLI(ViewGroup viewGroup, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LLIFFJFJJ(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LLIIII(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final <T extends InterfaceC1188520h2A> void LLIIIJ(String str, T t) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final IInterceptor LLIIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final void appendPoiTagParamsIfHave(String str, HashMap<String, String> map, Aweme aweme) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final boolean canShowWantTogoCollection() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedGPSCardService
    public final void clearExploreNearbyBtnData() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean enableReadLocationMetaData() {
        this.LIZJ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void friendPageUnifyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final Function2<String, JSONObject, Unit> getEventHandler() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final int getIconResByABExp(boolean z) {
        getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final List<C0TRR> getLSCardInsertExecutor() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final PoiAnchorButtonInfo getPoiAnchorCta(Aweme aweme) {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final BottomBarPriorityProtocol getPoiBottomBarAssem() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final VideoBottomLabelProtocol getPoiCreatorBottomLabelTrigger() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final PoiData getPoiData(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        this.LIZJ.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Pair<PoiData, PoiMobParam> getPoiDataAndMobParams(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        return this.LIZJ.getPoiDataAndMobParams(function1);
    }

    @Override // com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService
    public final Integer getPoiDetailFeedClickIndex(String str) {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final IPoiTagComponent getPoiTagComponent() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final <T> Function1<T, InterfaceC702540Rh6> getPoiTagPolicyProvider() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> getPoiTagProvider() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTrigger() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTriggerV2() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final C03D6 getPoiTagView(Context context) {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final int getTightenFriendPageDailyFreqTimes() {
        getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final int getTightenFriendPageWeeklyFreqTimes() {
        getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final int getTightenProfilePageDailyFreqTimes() {
        getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final int getTightenProfilePageWeeklyFreqTimes() {
        getClass();
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitDraftPreloadPoiRecommendExp() {
        this.LIZJ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitPreloadPoiRecommendExp() {
        this.LIZJ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final void insertCardResultTrack(int i, String str, int i2) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isFriendPageUnifyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean isPoiAnchorView2(View view) {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final boolean isPoiTagShow(String str, Aweme aweme) {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isProfileCloseUnifyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isProfilePageUnifyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isTightenCloseFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isTightenFriendPageDailyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isTightenFriendPageWeeklyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isTightenProfilePageDailyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final boolean isTightenProfilePageWeeklyFreqHit() {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final void measureAnchorTexts(String str, TextView textView, String str2, TextView textView2, View view, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onCollectionDelete(String str) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onVideoAddToCollection(Boolean bool, String str, String str2, String str3, String str4) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onWantToGoClick() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onWantToGoShow() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void profileCloseUnifyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void profilePageUnifyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.hybrid.IPoiHybridService
    public final void registerSparkPlugin() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final void requestInsertCardTrack(List<CardTypeRequest> list, int i) {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void requestVideoUnderstand(String str, Long l, String str2, String str3) {
        this.LIZJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final Boolean shouldAddNearbyExplore() {
        getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void startExtractFrame(String str, String str2) {
        this.LIZJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenCloseFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenFriendPageDailyFreqClicked() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenFriendPageDailyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenFriendPageWeeklyFreqClicked() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenFriendPageWeeklyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenProfilePageDailyFreqClicked() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenProfilePageDailyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenProfilePageWeeklyFreqClicked() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.IReviewsService
    public final void tightenProfilePageWeeklyFreqLog() {
        getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataDuration(long j) {
        this.LIZJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataSuccessRate(boolean z) {
        this.LIZJ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1197120hG2 LJJJZ() {
        return new InterfaceC1197120hG2() { // from class: X.0hAn
            @Override // X.InterfaceC1197120hG2
            public final String LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC1197120hG2
            public final String LJJIZ() {
                return null;
            }

            @Override // X.InterfaceC1197120hG2
            public final void LJJLL(Aweme aweme, String str, String str2, boolean z, String str3, C2344009Gk c2344009Gk, PageFinder pageFinder, Function1<? super C2344009Gk, Unit> function1) {
            }

            @Override // X.InterfaceC1197120hG2
            public final String LLIL(int i) {
                return null;
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLJJIJI(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLJJJJ(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, String str4, C2344009Gk c2344009Gk, Function1<? super C2344009Gk, Unit> function1) {
            }

            @Override // X.InterfaceC1197120hG2
            public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LLJJJJLIIL(Aweme aweme, String str) {
                return null;
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLLFFI(int i, int i2, int i3, int i4, int i5, int i6) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLLIL(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLLILZLLLI(Aweme aweme, String str, String str2, boolean z) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLLIZZ(Aweme aweme) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLLLIIL(Context context, View view, Aweme aweme, String str, String str2, C2344009Gk c2344009Gk, boolean z, String str3, String str4, String str5, boolean z2, EnumC1188920h2o enumC1188920h2o, String str6, Function1<? super C2344009Gk, Unit> function1) {
            }

            @Override // X.InterfaceC1197120hG2
            public final void LLZ() {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C0WIY<Boolean, Integer> LJJLIIIJJIZ() {
        return new C0WIY<>(Boolean.FALSE, 0);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC1393680mN4 LLIIIILZ() {
        return new InterfaceC1393680mN4() { // from class: X.0hAv
            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                return false;
            }

            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map<String, String> LLII() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIIZI() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJIIL(Context context) {
        return new View(context);
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map<String, String> LL(Context context) {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJIILJJIL(Aweme aweme, String str) {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Map<String, Object> preloadPoiRecommend(MobParam mobParam, List<MediaLocationMetaDataModel> list) {
        this.LIZJ.getClass();
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLJLI(String str, String str2, C1192360h8M c1192360h8M, AFwS206S0000000_18 aFwS206S0000000_18) {
    }
}
