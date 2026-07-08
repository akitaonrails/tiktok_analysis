package kotlin.jvm.internal;

import X.AbstractC1198100hHc;
import X.C09AY;
import X.C1178200glW;
import X.C1180880gpq;
import X.C1188890h2l;
import X.C1198120hHe;
import X.C1198150hHh;
import X.C1198190hHl;
import X.C1198230hHp;
import X.C13LE;
import X.C1584506Ih;
import X.C2344009Gk;
import X.C712710RxV;
import X.C723850SaN;
import X.EnumC1198390hI5;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.content.poicampaign.FullPageStatusAssem;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment;
import com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader;
import com.ss.android.ugc.aweme.search.detail.bottombar.ui.SearchDetailPoiBottomAssem;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS194S1100000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS194S1100000_18(PoiCampaignMainFragment poiCampaignMainFragment, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = poiCampaignMainFragment;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS194S1100000_18 awS194S1100000_18, Object obj, Object obj2) {
        MyMomentsData myMomentsData;
        Integer num;
        AbstractC1198100hHc abstractC1198100hHc = (AbstractC1198100hHc) obj2;
        if (abstractC1198100hHc instanceof C1198120hHe) {
            ((PoiCampaignMainFragment) awS194S1100000_18.l1).ZR(EnumC1198390hI5.LOADING);
        } else if (abstractC1198100hHc instanceof C1198150hHh) {
            C1584506Ih.LIZIZ(((PoiCampaignMainFragment) awS194S1100000_18.l1).LLJJIII);
            C1584506Ih.LIZIZ(((PoiCampaignMainFragment) awS194S1100000_18.l1).LLJJIJIIJIL);
            C1584506Ih.LIZIZ(((PoiCampaignMainFragment) awS194S1100000_18.l1).LLJJIJI);
            PoiCampaignMainFragment poiCampaignMainFragment = (PoiCampaignMainFragment) awS194S1100000_18.l1;
            C1198230hHp c1198230hHp = (C1198230hHp) ((C1198150hHh) abstractC1198100hHc).LIZ;
            if (c1198230hHp != null) {
                myMomentsData = c1198230hHp.LIZIZ;
            } else {
                myMomentsData = null;
            }
            String str = awS194S1100000_18.s0;
            poiCampaignMainFragment.getClass();
            C1180880gpq c1180880gpq = C1180880gpq.LIZ;
            String str2 = (String) poiCampaignMainFragment.LLJ.getValue();
            String str3 = poiCampaignMainFragment.LLJILLL;
            if (myMomentsData != null) {
                num = myMomentsData.userType;
            } else {
                num = null;
            }
            c1180880gpq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("from_user_id", str3);
            c2344009Gk.LJ(num, "is_poi_publish_new_user");
            C1180880gpq.LIZLLL(c2344009Gk);
            C1180880gpq.LJ(poiCampaignMainFragment, "ttls_my_year_campaign_landing_page_enter", c2344009Gk.LIZ);
            poiCampaignMainFragment.aS(poiCampaignMainFragment.LLJJ, Collections.singletonList(C13LE.LIZ(FullPageStatusAssem.class)));
            C723850SaN.LIZ(poiCampaignMainFragment, false, null, new AwS102S1200000_18(poiCampaignMainFragment, myMomentsData, str, 9), 3);
        } else if (abstractC1198100hHc instanceof C1198190hHl) {
            C1584506Ih.LIZIZ(((PoiCampaignMainFragment) awS194S1100000_18.l1).LLJJIII);
            ((PoiCampaignMainFragment) awS194S1100000_18.l1).ZR(((C1198190hHl) abstractC1198100hHc).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS194S1100000_18 awS194S1100000_18, Object obj, Object obj2) {
        Object next;
        Bitmap bitmap = (Bitmap) obj2;
        Iterable data = ((PoiQuizMapClusterPicLoader) awS194S1100000_18.l1).LLILLJJLI.getData();
        if (data != null) {
            String str = awS194S1100000_18.s0;
            Iterator it2 = data.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1178200glW) next).LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1178200glW c1178200glW = (C1178200glW) next;
            if (c1178200glW != null) {
                PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader = (PoiQuizMapClusterPicLoader) awS194S1100000_18.l1;
                poiQuizMapClusterPicLoader.LLILLJJLI.LJ(c1178200glW, C1178200glW.LIZJ(c1178200glW, bitmap, false, false, false, 2045));
                poiQuizMapClusterPicLoader.LLILLJJLI.LJIIIIZZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS194S1100000_18 awS194S1100000_18, Object obj, Object obj2) {
        PoiDataStruct poiDataStructCopy;
        Aweme aweme;
        PoiDataStruct poiDataStructCopy2;
        ((Boolean) obj).booleanValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        SearchDetailPoiBottomAssem searchDetailPoiBottomAssem = (SearchDetailPoiBottomAssem) awS194S1100000_18.l1;
        if (!searchDetailPoiBottomAssem.LLJJIII) {
            searchDetailPoiBottomAssem.Ho(zBooleanValue, true);
        } else {
            searchDetailPoiBottomAssem.LLJJI = new AwS136S0110000_18(searchDetailPoiBottomAssem, zBooleanValue, 3);
        }
        String str = awS194S1100000_18.s0;
        if (str != null && str.length() != 0) {
            ((Map) C712710RxV.LIZ.getValue()).put(str, Boolean.valueOf(zBooleanValue));
        }
        C1188890h2l c1188890h2l = ((SearchDetailPoiBottomAssem) awS194S1100000_18.l1).LLJ;
        Aweme aweme2 = null;
        if (c1188890h2l != null && (aweme = c1188890h2l.LIZ) != null) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct != null) {
                poiDataStructCopy2 = poiDataStruct.copy(poiDataStruct.poiName, poiDataStruct.poiId, poiDataStruct.poiType, poiDataStruct.infoSource, poiDataStruct.collectInfo, poiDataStruct.poiMapkitCollect, poiDataStruct.videoCount, poiDataStruct.addressInfo, poiDataStruct.videoAnchor, poiDataStruct.commentAnchor, poiDataStruct.videoTag, poiDataStruct.nearbyTag, poiDataStruct.poiClaimStatus, poiDataStruct.icon, poiDataStruct.thumbnail, poiDataStruct.typeLevel, poiDataStruct.poiPostPageAnchor, poiDataStruct.poiAmusement, poiDataStruct.anchorSubjectType, poiDataStruct.productIds, poiDataStruct.extra, poiDataStruct.headImgUrl, poiDataStruct.favCnt, Boolean.valueOf(zBooleanValue), poiDataStruct.locationDesc, poiDataStruct.productGuidanceInfo, poiDataStruct.aiSubSummary, poiDataStruct.anchorPassThroughInfo, poiDataStruct.poiAwemeConfig, poiDataStruct.poiAwemePictureInfo, poiDataStruct.reviewSummary, poiDataStruct.categoryName, poiDataStruct.buttonGroup, poiDataStruct.poiRequestExtraParams);
            } else {
                poiDataStructCopy2 = null;
            }
            aweme.setPoiDataStruct(poiDataStructCopy2);
        }
        C1188890h2l c1188890h2l2 = ((SearchDetailPoiBottomAssem) awS194S1100000_18.l1).LLJ;
        if (c1188890h2l2 != null) {
            PoiDataStruct poiDataStruct2 = c1188890h2l2.LIZLLL;
            if (poiDataStruct2 != null) {
                poiDataStructCopy = poiDataStruct2.copy(poiDataStruct2.poiName, poiDataStruct2.poiId, poiDataStruct2.poiType, poiDataStruct2.infoSource, poiDataStruct2.collectInfo, poiDataStruct2.poiMapkitCollect, poiDataStruct2.videoCount, poiDataStruct2.addressInfo, poiDataStruct2.videoAnchor, poiDataStruct2.commentAnchor, poiDataStruct2.videoTag, poiDataStruct2.nearbyTag, poiDataStruct2.poiClaimStatus, poiDataStruct2.icon, poiDataStruct2.thumbnail, poiDataStruct2.typeLevel, poiDataStruct2.poiPostPageAnchor, poiDataStruct2.poiAmusement, poiDataStruct2.anchorSubjectType, poiDataStruct2.productIds, poiDataStruct2.extra, poiDataStruct2.headImgUrl, poiDataStruct2.favCnt, Boolean.valueOf(zBooleanValue), poiDataStruct2.locationDesc, poiDataStruct2.productGuidanceInfo, poiDataStruct2.aiSubSummary, poiDataStruct2.anchorPassThroughInfo, poiDataStruct2.poiAwemeConfig, poiDataStruct2.poiAwemePictureInfo, poiDataStruct2.reviewSummary, poiDataStruct2.categoryName, poiDataStruct2.buttonGroup, poiDataStruct2.poiRequestExtraParams);
            } else {
                poiDataStructCopy = null;
            }
            c1188890h2l2.LIZLLL = poiDataStructCopy;
        }
        IAwemeService iAwemeService = (IAwemeService) ((SearchDetailPoiBottomAssem) awS194S1100000_18.l1).LLJJJIL.getValue();
        if (iAwemeService != null) {
            C1188890h2l c1188890h2l3 = ((SearchDetailPoiBottomAssem) awS194S1100000_18.l1).LLJ;
            if (c1188890h2l3 != null) {
                aweme2 = c1188890h2l3.LIZ;
            }
            iAwemeService.LLILLL(aweme2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS194S1100000_18(PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = poiQuizMapClusterPicLoader;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS194S1100000_18(SearchDetailPoiBottomAssem searchDetailPoiBottomAssem, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = searchDetailPoiBottomAssem;
        this.s0 = str;
    }
}
