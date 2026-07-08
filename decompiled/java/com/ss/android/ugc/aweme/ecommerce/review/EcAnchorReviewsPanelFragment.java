package com.ss.android.ugc.aweme.ecommerce.review;

import X.AbstractC1056160dag;
import X.AnonymousClass0317;
import X.C034S;
import X.C098200Yq;
import X.C1120604Zw;
import X.C1349800lEI;
import X.C13LP;
import X.C1507790pL7;
import X.C1548750qPB;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1735020vFc;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C189200o6;
import X.C18N9;
import X.C18PD;
import X.C19348710mr;
import X.C19374310qz;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C20642515q3;
import X.C2097608Jq;
import X.C21274818Nm;
import X.C21525119Lt;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C601990NjJ;
import X.C786410Ut5;
import X.EnumC19356310o5;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC1555100qZQ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorReviewsPanelFragment extends ECBaseFragment implements InterfaceC1344590l5t, InterfaceC1349750lED, ICommentPageReusedProtocol {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEhHELIOSLTMlLDh9DSYNJyw7JzceLDk6LTI/GS49LSkKOy40JSAiPQ==";
    public CommentContextSource LLILLL;
    public Aweme LLILZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZIL;
    public C1349800lEI LLILZLL;
    public EcAnchorReviewsBizData LLIZ;
    public final C1748770vbn LLIZLLLIL;

    @Override // X.InterfaceC1349750lED
    public final void B7() {
    }

    @Override // X.InterfaceC1349750lED
    public final void BC(boolean z) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable Cw(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Integer DJ() {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 11;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable aJ() {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "ec_reviews_tab";
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("comment_panel_review_tab_double_tap", new JSONObject());
        }
    }

    public final String VR() {
        String eventType;
        String authorUid;
        String aid;
        String requestId;
        String authorUid2;
        String aid2;
        String eventType2;
        String str;
        String str2;
        String str3;
        Object obj;
        String eventType3;
        String str4;
        String str5;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String string;
        String string2;
        String string3;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        AnchorProductInfo anchorProductInfo3;
        String str6 = ((EcAnchorCommentReviewsConfig) C18PD.LIZIZ.getValue()).singleAnchorSchema;
        if (str6 == null) {
            return null;
        }
        Uri uri = UriProtector.parse(str6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1349800lEI c1349800lEI = this.LLILZLL;
        String str7 = "";
        if (c1349800lEI == null || (eventType = c1349800lEI.getEventType()) == null) {
            eventType = "";
        }
        linkedHashMap.put("enter_from_info", eventType);
        linkedHashMap.put("entrance_form", "video_reviews_anchor");
        linkedHashMap.put("source_page_type", "video");
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        EcAnchorReviewsBizData ecAnchorReviewsBizData = this.LLIZ;
        String str8 = ecAnchorReviewsBizData != null ? ecAnchorReviewsBizData.productId : null;
        Aweme aweme2 = this.LLILZ;
        String aid3 = aweme2 != null ? aweme2.getAid() : null;
        Aweme aweme3 = this.LLILZ;
        HashMap<String, String> mobParams = aweme3 != null ? aweme3.getMobParams() : null;
        anchorBizUtils.getClass();
        linkedHashMap.put("track_id", AnchorBizUtils.LJJ(str8, aid3, mobParams));
        Aweme aweme4 = this.LLILZ;
        if (aweme4 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme4)) == null) {
            authorUid = "";
        }
        linkedHashMap.put("author_id", authorUid);
        Aweme aweme5 = this.LLILZ;
        if (aweme5 == null || (aid = aweme5.getAid()) == null) {
            aid = "";
        }
        linkedHashMap.put("source_content_id", aid);
        linkedHashMap.put("is_ad", Boolean.valueOf(AnchorBizUtils.LJJJLL(this.LLILZ)));
        Aweme aweme6 = this.LLILZ;
        if (aweme6 == null || (requestId = aweme6.getRequestId()) == null) {
            requestId = "";
        }
        linkedHashMap.put("request_id", requestId);
        linkedHashMap.put("search_entrance", "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("page_name", "comment_panel");
        Aweme aweme7 = this.LLILZ;
        if (aweme7 == null || (authorUid2 = AwemeExtKt.getAuthorUid(aweme7)) == null) {
            authorUid2 = "";
        }
        linkedHashMap2.put("author_id", authorUid2);
        linkedHashMap2.put("previous_page", "video");
        linkedHashMap2.put("source_page_type", "video");
        linkedHashMap2.put("entrance_form", "video_comment_single_anchor");
        Aweme aweme8 = this.LLILZ;
        if (aweme8 == null || (aid2 = aweme8.getAid()) == null) {
            aid2 = "";
        }
        linkedHashMap2.put("source_content_id", aid2);
        C1349800lEI c1349800lEI2 = this.LLILZLL;
        if (c1349800lEI2 == null || (eventType2 = c1349800lEI2.getEventType()) == null) {
            eventType2 = "";
        }
        linkedHashMap2.put("enter_from_info", eventType2);
        EcAnchorReviewsBizData ecAnchorReviewsBizData2 = this.LLIZ;
        if (ecAnchorReviewsBizData2 == null || (str = ecAnchorReviewsBizData2.productId) == null) {
            str = "";
        }
        linkedHashMap2.put("product_id", str);
        linkedHashMap2.put("entrance_info", linkedHashMap.toString());
        linkedHashMap2.put("page_show_type", "half_screen");
        Aweme aweme9 = this.LLILZ;
        linkedHashMap2.put("follow_status", Integer.valueOf(aweme9 != null ? AwemeExtKt.getFollowStatus(aweme9) : -1));
        EcAnchorReviewsBizData ecAnchorReviewsBizData3 = this.LLIZ;
        if (ecAnchorReviewsBizData3 == null || (anchorProductInfo3 = ecAnchorReviewsBizData3.productInfo) == null || (str2 = anchorProductInfo3.source) == null) {
            str2 = "";
        }
        linkedHashMap2.put("source", str2);
        EcAnchorReviewsBizData ecAnchorReviewsBizData4 = this.LLIZ;
        if (ecAnchorReviewsBizData4 == null || (anchorProductInfo2 = ecAnchorReviewsBizData4.productInfo) == null || (str3 = anchorProductInfo2.sourceFrom) == null) {
            str3 = "";
        }
        linkedHashMap2.put("source_from", str3);
        EcAnchorReviewsBizData ecAnchorReviewsBizData5 = this.LLIZ;
        if (ecAnchorReviewsBizData5 == null || (anchorProductInfo = ecAnchorReviewsBizData5.productInfo) == null || (obj = anchorProductInfo.platform) == null) {
            obj = "";
        }
        linkedHashMap2.put("product_source", obj);
        Aweme aweme10 = this.LLILZ;
        if (aweme10 != null && aweme10.isAd() && (aweme = this.LLILZ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Long adId = awemeRawAd.getAdId();
            if (adId == null || (string = adId.toString()) == null) {
                string = "";
            }
            linkedHashMap3.put("ad_id", string);
            Long creativeId = awemeRawAd.getCreativeId();
            if (creativeId == null || (string2 = creativeId.toString()) == null) {
                string2 = "";
            }
            linkedHashMap3.put("creative_id", string2);
            String logExtra = awemeRawAd.getLogExtra();
            if (logExtra == null) {
                logExtra = "";
            }
            linkedHashMap3.put("log_extra", logExtra);
            Long groupId = awemeRawAd.getGroupId();
            if (groupId == null || (string3 = groupId.toString()) == null) {
                string3 = "";
            }
            linkedHashMap3.put("group_id", string3);
            linkedHashMap2.put("ad_info", linkedHashMap3);
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        EcAnchorReviewsBizData ecAnchorReviewsBizData6 = this.LLIZ;
        if (ecAnchorReviewsBizData6 != null && (str5 = ecAnchorReviewsBizData6.sellerId) != null) {
            builderBuildUpon.appendQueryParameter("seller_id", str5);
        }
        EcAnchorReviewsBizData ecAnchorReviewsBizData7 = this.LLIZ;
        if (ecAnchorReviewsBizData7 != null && (str4 = ecAnchorReviewsBizData7.productId) != null) {
            builderBuildUpon.appendQueryParameter("product_id", str4);
        }
        C1349800lEI c1349800lEI3 = this.LLILZLL;
        if (c1349800lEI3 != null && (eventType3 = c1349800lEI3.getEventType()) != null) {
            str7 = eventType3;
        }
        builderBuildUpon.appendQueryParameter("enter_from", str7);
        builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap2));
        return builderBuildUpon.build().toString();
    }

    public EcAnchorReviewsPanelFragment() {
        if (this.LLILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", CommentContextSource.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        this.LLILZ = CommentContextSourceKt.aweme(this.LLILLL);
        this.LLIZLLLIL = new C1748770vbn();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS611S0100000_32(this, 67));
        c1748770vbn.LIZJ(this.LLIZLLLIL);
    }

    public final void WR(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        boolean z;
        List listLJJZZI;
        String str;
        AwemeRawAd awemeRawAd;
        EcommerceInfo ecommerceInfo;
        String string = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null) {
            anchorCommonStruct = ecommerceInfo.reviewsTabAnchor;
        } else {
            anchorCommonStruct = null;
        }
        int iIntValue = 0;
        if (anchorCommonStruct != null) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null && aweme.isAd() && z) {
            AnchorBizUtils.LIZ.getClass();
            listLJJZZI = AnchorBizUtils.LJJZ(aweme);
        } else {
            AnchorBizUtils.LIZ.getClass();
            listLJJZZI = AnchorBizUtils.LJJZZI(aweme);
        }
        if (listLJJZZI == null) {
            return;
        }
        AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLZIJ(0, listLJJZZI);
        if (anchorProductInfo != null) {
            str = anchorProductInfo.sellerId;
            Long l = anchorProductInfo.productId;
            if (l != null) {
                string = l.toString();
            }
            Integer num = anchorProductInfo.reviewNum;
            if (num != null) {
                iIntValue = num.intValue();
            }
        } else {
            str = null;
        }
        this.LLIZ = new EcAnchorReviewsBizData(string, str, Integer.valueOf(iIntValue), anchorProductInfo);
        C1748780vbo.LIZ(this.LLIZLLLIL, new C21274818Nm(string, str, iIntValue, anchorProductInfo));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        IPageActionBarAbility iPageActionBarAbility;
        String name;
        this.LLILZ = aweme;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ICommentDependencyService.class.getName();
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        if (((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).enableCommentRefactor() && (iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPageActionBarAbility.class, null)) != null) {
            iPageActionBarAbility.K01();
        }
        if (C18N9.LIZ(aweme)) {
            WR(aweme);
            String strVR = VR();
            if (strVR != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZIL) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, strVR, false);
            }
        }
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        long jLongValue;
        String strValueOf;
        Integer num;
        Long lLIZ;
        EcAnchorReviewsBizData ecAnchorReviewsBizData = this.LLIZ;
        if (ecAnchorReviewsBizData != null && (num = ecAnchorReviewsBizData.reviewCount) != null && (lLIZ = C601990NjJ.LIZ(num)) != null) {
            jLongValue = lLIZ.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C20642515q3.LJI(2131850910));
            sbLIZ.append(' ');
            C1735020vFc.LIZ.getClass();
            if (jLongValue < 10000) {
                strValueOf = NumberFormat.getNumberInstance(Locale.US).format(jLongValue);
            } else {
                strValueOf = String.valueOf(C19374310qz.LIZ(Long.valueOf(jLongValue), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
            }
            sbLIZ.append(strValueOf);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return C20642515q3.LJI(2131850910);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        Map<String, String> mapLJ;
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2;
        boolean z;
        boolean z2;
        String name;
        super.onViewCreated(view, bundle);
        String name2 = null;
        C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.thh);
        String strVR = VR();
        C1748780vbo.LIZ(this.LLIZLLLIL, new AwS82S1000000_32(strVR, 7));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ICommentDependencyService.class.getName();
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        if (((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).isCommentDarkModeOptExp()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = ICommentDependencyService.class.getName();
                if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null) {
                    name2 = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
            }
            mapLJ = ((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2).getCommentThemeSparkParams();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        C1548750qPB c1548750qPB = C1548750qPB.LIZ;
        Context contextRequireContext = requireContext();
        if (strVR == null) {
            strVR = "";
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C1548750qPB.LIZ(c1548750qPB, contextRequireContext, "ec_reviews_tab", strVR, null, null, null, mapLJ, new C21525119Lt(this, 0), 48);
        this.LLILZIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(this.LLILZIL, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        View viewTd;
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        C19GS c19gs = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ICommentDependencyService.class.getName();
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        if (((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).isCommentDarkModeOptExp()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = ICommentDependencyService.class.getName();
                if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null) {
                    name = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
            }
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2).getCommentThemeContext(layoutInflater.getContext())), R.layout.alf, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.alf, viewGroup, false);
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC1349750lED
    public final void u5(String str, String str2, boolean z) {
        String enterFrom;
        long jLongValue;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z2;
        Integer num;
        Long lLIZ;
        if (isViewValid() && isViewValid() && z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            c2344009Gk.LJIIIIZZ("page_name", "comment_panel");
            c2344009Gk.LJIIIIZZ("module_name", "review_tab");
            C1349800lEI c1349800lEI = this.LLILZLL;
            String name = null;
            if (c1349800lEI != null) {
                enterFrom = c1349800lEI.getEnterFrom();
            } else {
                enterFrom = null;
            }
            c2344009Gk.LJIIIIZZ("previous_page", enterFrom);
            EcAnchorReviewsBizData ecAnchorReviewsBizData = this.LLIZ;
            if (ecAnchorReviewsBizData != null && (num = ecAnchorReviewsBizData.reviewCount) != null && (lLIZ = C601990NjJ.LIZ(num)) != null) {
                jLongValue = lLIZ.longValue();
            } else {
                jLongValue = 0;
            }
            c2344009Gk.LIZLLL(jLongValue, "review_count");
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap(c2344009Gk.LIZ);
            c1507790pL7.getClass();
            C1507790pL7.LJFF("tiktokec_module_click", linkedHashMap);
            Aweme aweme2 = this.LLILZ;
            if (aweme2 != null && aweme2.isAd() && (aweme = this.LLILZ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("review_tab", "otherclick", awemeRawAd);
                abstractC1056160dagOnAdEvent.LIZ.put("refer", "review_tab_selection");
                abstractC1056160dagOnAdEvent.LIZIZ();
            }
        }
    }
}
