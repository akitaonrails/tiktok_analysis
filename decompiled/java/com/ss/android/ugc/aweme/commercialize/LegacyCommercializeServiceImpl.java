package com.ss.android.ugc.aweme.commercialize;

import X.C0SQ9;
import X.C1019040cco;
import X.C1024910cmH;
import X.C1024920cmI;
import X.C1024930cmJ;
import X.C1045340dJE;
import X.C1064210dnf;
import X.C588810N7n;
import X.C998440c5a;
import X.InterfaceC1024940cmK;
import X.InterfaceC1029580cto;
import X.InterfaceC1035050d2d;
import X.InterfaceC1050810dS3;
import X.InterfaceC582800MtS;
import X.InterfaceC705900RmW;
import X.InterfaceC718140SEy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchInflowProductShopCardService;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.CommerceDataServiceImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {
    public C1019040cco LIZ;
    public CommerceDataServiceImpl LIZIZ;
    public C0SQ9 LIZJ;
    public C998440c5a LIZLLL;
    public C1024930cmJ LJ;
    public C1024920cmI LJFF;
    public C1024910cmH LJI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0cmI] */
    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC582800MtS LIZIZ() {
        if (this.LJFF == null) {
            this.LJFF = new InterfaceC582800MtS() { // from class: X.0cmI
            };
        }
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC718140SEy LJ() {
        if (this.LIZJ == null) {
            this.LIZJ = new C0SQ9();
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC1029580cto LJFF() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new CommerceDataServiceImpl();
        }
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0cmJ] */
    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC1024940cmK LJI() {
        if (this.LJ == null) {
            this.LJ = new InterfaceC1024940cmK() { // from class: X.0cmJ
            };
        }
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC705900RmW LJII() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C998440c5a();
        }
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0cmH] */
    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC1050810dS3 LJIIIIZZ() {
        if (this.LJI == null) {
            this.LJI = new InterfaceC1050810dS3() { // from class: X.0cmH
                @Override // X.InterfaceC1050810dS3
                public final boolean LIZJ(Uri uri) {
                    return C1024900cmG.LIZIZ(uri);
                }

                @Override // X.InterfaceC1050810dS3
                public final boolean LIZLLL(Context context) {
                    return C1024900cmG.LIZ(context);
                }

                @Override // X.InterfaceC1050810dS3
                public final boolean LIZIZ(Context context, String str) {
                    return C1024900cmG.LJFF(context, str, null);
                }

                @Override // X.InterfaceC1050810dS3
                public final boolean LJ(Context context, Uri uri) {
                    return C1024900cmG.LJI(context, uri);
                }

                @Override // X.InterfaceC1050810dS3
                public final boolean LJFF(Context context, String str) {
                    Intent intentLIZLLL;
                    Object c098200Yq;
                    Activity activityLIZ;
                    Activity activityLIZIZ;
                    if (context != null && (intentLIZLLL = C1022030chd.LIZLLL(context, str)) != null) {
                        try {
                            if (C1388190mED.LIZ(context) == null) {
                                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                                    activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                                } else {
                                    activityLIZ = null;
                                }
                            } else {
                                activityLIZ = C1388190mED.LIZ(context);
                            }
                            C1022030chd.LIZ.getClass();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C1022030chd.LJIILJJIL(activityLIZ, intentLIZLLL) && activityLIZ != null) {
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intentLIZLLL, "Activity_startActivityForResult_2");
                            C1701330uNH.LIZ(intentLIZLLL, activityLIZ);
                            C2204961BRm.LJIIZILJ(0, activityLIZ, intentLIZLLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+LM3HwC7QQ==", null));
                            return true;
                        }
                        if (!C1024900cmG.LIZ(context)) {
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC1050810dS3
                public final boolean LIZ(Context context, Aweme aweme, Boolean bool, Boolean bool2) {
                    return C1024900cmG.LJII(context, 40, null, aweme, bool.booleanValue(), bool2.booleanValue());
                }
            };
        }
        return this.LJI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0cco] */
    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC1035050d2d LJIIIZ() {
        if (this.LIZ == null) {
            this.LIZ = new InterfaceC1035050d2d() { // from class: X.0cco
                @Override // X.InterfaceC1035050d2d
                public final void LJII(Collection collection) {
                    C846580XIy.LIZ(null, collection);
                }

                @Override // X.InterfaceC1035050d2d
                public final long LJJIJIL(AwemeRawAd awemeRawAd) {
                    List<String> list = C1019030ccn.LIZ;
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId == null) {
                        return 0L;
                    }
                    return groupId.longValue();
                }

                @Override // X.InterfaceC1035050d2d
                public final void LIZ(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJ(context, "play_failed", aweme, C1019030ccn.LJIIJJI(context, aweme, false, null));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LIZLLL(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJ(context, "challenge_click", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJ(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJ(context, "like", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJFF(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJ(context, "like_cancel", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIJJI(Context context, Aweme aweme) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZ = "homepage_ad";
                    c1020020ceOLIZ.LIZIZ = "click_download";
                    c1020020ceOLIZ.LJ(aweme);
                    c1020020ceOLIZ.LJIIJ(context);
                    if (aweme != null) {
                        C2184171Adz.LIZLLL("homepage_ad", "click_download", aweme.getAwemeRawAd()).LJIIIIZZ();
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIILIIL(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJIZL(context, "click_button", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIILJJIL(Context context, Aweme aweme) {
                    if (aweme != null && C1017180cZo.LJIJJ(aweme.getAwemeRawAd())) {
                        SearchInflowProductShopCardService.LJII().LIZIZ(aweme.getAwemeRawAd());
                    } else {
                        C1019030ccn.LJJIJ(context, aweme);
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIILL(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJIZL(context, "click_redpacket", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIILLIIL(Context context, Aweme aweme) {
                    C1019030ccn.LJJIII(context, aweme, null, "plus_sign");
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIZILJ(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJIZL(context, "click_call", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIJ(Context context, Aweme aweme) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZ = "homepage_ad";
                    c1020020ceOLIZ.LIZIZ = "click_website";
                    c1020020ceOLIZ.LJ(aweme);
                    c1020020ceOLIZ.LJIIJ(context);
                    if (aweme != null) {
                        C2184171Adz.LIZLLL("homepage_ad", "click_website", aweme.getAwemeRawAd()).LJIIIIZZ();
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIJJ(Context context, Aweme aweme) {
                    C1019030ccn.LJJIJL(context, aweme, null);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIL(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJIZL(context, "follow_cancel", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIII(Context context, Aweme aweme) {
                    C1019030ccn.LJJIIZ(context, aweme, null);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIIJ(Context context, Aweme aweme) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZ = "draw_ad";
                    c1020020ceOLIZ.LIZIZ = "otherclick";
                    c1020020ceOLIZ.LJ(aweme);
                    c1020020ceOLIZ.LJIIIZ("comment_sign");
                    c1020020ceOLIZ.LIZ(C1019030ccn.LJIILL(aweme));
                    c1020020ceOLIZ.LJIIJ(context);
                    if (aweme != null) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
                        c1022820ciuLIZLLL.LIZJ("comment_sign", "refer");
                        c1022820ciuLIZLLL.LIZ(C1019030ccn.LJIILL(aweme));
                        c1022820ciuLIZLLL.LJIIIIZZ();
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIIJZLJL(Context context, Aweme aweme) {
                    JSONObject jSONObjectLJIIIZ = C1019030ccn.LJIIIZ(context, aweme);
                    if (C1019030ccn.LJIJI(context, aweme)) {
                        C1019030ccn.LJJJJJ(context, aweme.getAwemeRawAd(), "receive_ad", "receive", jSONObjectLJIIIZ);
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIIZ(Context context, Aweme aweme) {
                    C1019030ccn.LJJIJIL(context, aweme, "button", null);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIJIIJI(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJ(context, "button_show", aweme, C1019030ccn.LJIIIZ(context, aweme));
                    C1019030ccn.LJJJJ(context, "othershow", aweme, C1019030ccn.LJIIJ(context, aweme, "button"));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIJIIJIL(Context context, Aweme aweme) {
                    C1019030ccn.LJJJJIZL(context, "homepagelink_click", aweme, C1019030ccn.LJIIIZ(context, aweme));
                }

                @Override // X.InterfaceC1035050d2d
                public final void LIZIZ(Context context, Aweme aweme, FollowStatus followStatus) {
                    JSONObject jSONObjectLJIIIZ;
                    int i;
                    List<String> list = C1019030ccn.LIZ;
                    if (C1017070cZd.LLF(aweme)) {
                        HashMap map = new HashMap();
                        int followStatus2 = 1;
                        if (followStatus != null && followStatus.isCheating()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        map.put("is_cheated_follow", Integer.valueOf(i));
                        if (followStatus != null) {
                            followStatus2 = followStatus.getFollowStatus();
                        }
                        map.put("follow_status", Integer.valueOf(followStatus2));
                        jSONObjectLJIIIZ = C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJFF(map));
                    } else {
                        jSONObjectLJIIIZ = C1019030ccn.LJIIIZ(context, aweme);
                    }
                    C1019030ccn.LJJJJIZL(context, "follow", aweme, jSONObjectLJIIIZ);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LIZJ(Context context, Banner banner, int i) {
                    List<String> list = C1019030ccn.LIZ;
                    HashMap map = new HashMap();
                    map.put("banner_order", Integer.valueOf(i));
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "click";
                    c1020020ceOLIZ.LJIIIIZZ(banner.getLogExtra());
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("banner");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(banner.getCreativeId()));
                    c1020020ceOLIZ.LIZ(map);
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "click", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ("banner", "refer");
                    c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "banner_order");
                    c1022820ciuLJ.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    List<String> clickTrackUrlList = banner.getClickTrackUrlList();
                    Long lValueOf = Long.valueOf(banner.getCreativeId());
                    String logExtra = banner.getLogExtra();
                    JSONObject jSONObject = new JSONObject(map);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZIZ("click", clickTrackUrlList, lValueOf, logExtra, jSONObject);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIIIZZ(Context context, Banner banner, int i) {
                    List<String> list = C1019030ccn.LIZ;
                    HashMap map = new HashMap();
                    map.put("banner_order", Integer.valueOf(i));
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "show";
                    c1020020ceOLIZ.LJIIIIZZ(banner.getLogExtra());
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("banner");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(banner.getCreativeId()));
                    c1020020ceOLIZ.LIZ(map);
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "show", String.valueOf(banner.getCreativeId()), banner.getLogExtra(), CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ("banner", "refer");
                    c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "banner_order");
                    c1022820ciuLJ.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    List<String> trackUrlList = banner.getTrackUrlList();
                    Long lValueOf = Long.valueOf(banner.getCreativeId());
                    String logExtra = banner.getLogExtra();
                    JSONObject jSONObject = new JSONObject(map);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZIZ("show", trackUrlList, lValueOf, logExtra, jSONObject);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIIZ(Context context, AwemeRawAd awemeRawAd, String str) {
                    List<String> list = C1019030ccn.LIZ;
                    if (context != null && awemeRawAd != null && !TextUtils.isEmpty(str)) {
                        C1019030ccn.LJJJJJ(context, awemeRawAd, str, "hide_app", C1019030ccn.LJIIL(context, awemeRawAd, false, null));
                    }
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIL(Context context, JSONObject jSONObject, Aweme aweme) {
                    C1019030ccn.LJIILIIL(context, jSONObject, aweme);
                    C1019030ccn.LJJJJ(context, "show_failed", aweme, jSONObject);
                }

                @Override // X.InterfaceC1035050d2d
                public final JSONObject LJIJI(Context context, String str, JSONObject jSONObject) throws JSONException {
                    C1019030ccn.LJJJJJL(context, str, jSONObject);
                    return jSONObject;
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJ(Context context, Aweme aweme, FollowStatus followStatus) {
                    C1019030ccn.LJJIIZ(context, aweme, followStatus);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJII(Context context, Aweme aweme, Map<String, String> map) {
                    C1019030ccn.LJJIJL(context, aweme, map);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJI(String str, String str2, JSONObject jSONObject, long j) {
                    List<String> list = C1019030ccn.LIZ;
                    C1022500ciO.LIZJ(str, str2, jSONObject, j);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIIJ(Context context, long j, String str, UrlModel urlModel) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "video_slide";
                    c1020020ceOLIZ.LJIIIIZZ(str);
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("video");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(j));
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "video_slide", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ("video", "refer");
                    c1022820ciuLJ.LJIIIIZZ();
                    C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
                    c1020020ceOLIZ2.LIZIZ = "click";
                    c1020020ceOLIZ2.LJIIIIZZ(str);
                    c1020020ceOLIZ2.LIZ = "discovery_ad";
                    c1020020ceOLIZ2.LJIIIZ("video");
                    c1020020ceOLIZ2.LIZLLL(Long.valueOf(j));
                    c1020020ceOLIZ2.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ("discovery_ad", "click", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ2.LIZJ("video", "refer");
                    c1022820ciuLJ2.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    Long lValueOf = Long.valueOf(j);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZ("click", urlModel, lValueOf, str);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIIZI(Context context, long j, String str, UrlModel urlModel) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "click";
                    c1020020ceOLIZ.LJIIIIZZ(str);
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("title");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(j));
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "click", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ("title", "refer");
                    c1022820ciuLJ.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    Long lValueOf = Long.valueOf(j);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZ("click", urlModel, lValueOf, str);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIJ(Context context, long j, String str, UrlModel urlModel) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "show";
                    c1020020ceOLIZ.LJIIIIZZ(str);
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("hashtag");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(j));
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "show", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ("hashtag", "refer");
                    c1022820ciuLJ.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    Long lValueOf = Long.valueOf(j);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZ("show", urlModel, lValueOf, str);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJIJJLI(Context context, long j, String str, UrlModel urlModel, String str2) {
                    List<String> list = C1019030ccn.LIZ;
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZIZ = "auto_full_screen";
                    c1020020ceOLIZ.LIZ = "discovery_ad";
                    c1020020ceOLIZ.LJIIIZ("video");
                    c1020020ceOLIZ.LIZLLL(Long.valueOf(j));
                    c1020020ceOLIZ.LJIIIIZZ(str);
                    c1020020ceOLIZ.LJ.LIZIZ("item_id", str2);
                    c1020020ceOLIZ.LJIIJ(context);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("discovery_ad", "auto_full_screen", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
                    c1022820ciuLJ.LIZJ(str2, "item_id");
                    c1022820ciuLJ.LIZJ("video", "refer");
                    c1022820ciuLJ.LJIIIIZZ();
                    C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                    Long lValueOf = Long.valueOf(j);
                    c2201701BEy.getClass();
                    C2201701BEy.LIZ("click", urlModel, lValueOf, str);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJI(Context context, Aweme aweme, Map<String, Object> map, String str, String str2) {
                    C1019030ccn.LJJIIJ(context, aweme, map, str, str2);
                }

                @Override // X.InterfaceC1035050d2d
                public final void LJJIFFI(long j, Context context, String str, String str2, String str3, JSONObject jSONObject) {
                    C1019030ccn.LIZJ(j, context, str, str2, str3, jSONObject);
                }
            };
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final C1045340dJE LIZJ() {
        return C1045340dJE.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final C1064210dnf LIZLLL() {
        return C1064210dnf.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final C588810N7n LIZ() {
        return C588810N7n.LIZ;
    }
}
