package com.ss.android.ugc.tiktok.pns.feedsafety.filtervideo;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C085L;
import X.C0C64;
import X.C0OXV;
import X.C0XQ7;
import X.C10FJ;
import X.C1541950qED;
import X.C1548820qPI;
import X.C1595430rcT;
import X.C20684815ws;
import X.C2344009Gk;
import X.C274580ApU;
import X.C343780Ddo;
import X.C452501pT;
import X.C596440NaM;
import X.C619480ORm;
import X.C635660OwW;
import X.EnumC1588660rRY;
import X.EnumC20537615Xy;
import X.InterfaceC1107590evd;
import X.InterfaceC1548390qOb;
import X.InterfaceC1871920yoQ;
import X.InterfaceC2217701Bqy;
import X.InterfaceC486620J6m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveIconOutService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class FilterVideoServiceImpl implements IFilterVideoService, InterfaceC1548390qOb {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(444));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(753));

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final List<Class<C0OXV>> LIZ() {
        return Collections.singletonList(C0OXV.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OwW] */
    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final C635660OwW LIZJ() {
        return new C10FJ() { // from class: X.0OwW
            @Override // X.C10FJ
            public final void onFailed(Exception exc) {
            }

            @Override // X.C10FJ
            public final void Hl(PushSettings pushSettings) {
                C619480ORm c619480ORm = C619480ORm.LIZ;
                int i = pushSettings.filteredWordsCount;
                c619480ORm.getClass();
                C596450NaN c596450NaN = C596440NaM.LIZ;
                c596450NaN.LIZJ(String.valueOf(i), "tns_filter_keyword_count");
                c596450NaN.LIZJ(String.valueOf(pushSettings.filteredWordsLimit), "tns_filter_keyword_limit");
                c596450NaN.LIZJ(String.valueOf(pushSettings.selfFilterWordsCount), "tns_filter_keyword_count_self");
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final int LJFF() {
        C619480ORm.LIZ.getClass();
        try {
            return CastIntegerProtector.parseInt(C596440NaM.LIZ.LIZIZ("tns_filter_keyword_count_self", CardStruct.IStatusCode.DEFAULT));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final String[] LIZIZ() {
        return C274580ApU.LIZ();
    }

    @Override // X.InterfaceC1548390qOb
    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
        InterfaceC1107590evd map;
        InterfaceC1871920yoQ array;
        List<Object> list;
        Integer num;
        EnumC1588660rRY enumC1588660rRY;
        if (Intrinsics.LJFF(str, "updateOrCreateWordList") && interfaceC1107590evd != null && (map = interfaceC1107590evd.getMap("word")) != null && (array = map.getArray("scenes")) != null && (list = array.toList()) != null) {
            for (Object obj : list) {
                if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                    int iIntValue = num.intValue();
                    EnumC1588660rRY.Companion.getClass();
                    EnumC1588660rRY[] enumC1588660rRYArrValues = EnumC1588660rRY.values();
                    int length = enumC1588660rRYArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC1588660rRY = enumC1588660rRYArrValues[i];
                            if (enumC1588660rRY.getType() == iIntValue) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            enumC1588660rRY = EnumC1588660rRY.UNKNOWN;
                            break;
                        }
                    }
                    if (enumC1588660rRY == EnumC1588660rRY.LIVE) {
                        enumC1588660rRY = EnumC1588660rRY.FOR_YOU;
                    }
                    ((Set) this.LLILLJJLI.getValue()).add(enumC1588660rRY);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final void LJI(Context context, String str) throws JSONException {
        String strI0;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z2;
        boolean z3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        ILiveIconOutService iLiveIconOutService;
        InterfaceC486620J6m interfaceC486620J6mI4;
        C20684815ws.onEventV3("filter_hashtag_settings_filter_video_keywords");
        boolean zShouldShowFriendsTab = C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab();
        boolean zIsOn = ComplianceServiceProvider.LJJI().LJJIJ().isOn();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC486620J6mI4 = iLiveOuterService.i4()) != null) {
            strI0 = interfaceC486620J6mI4.i0();
        } else {
            strI0 = null;
        }
        if (Intrinsics.LJFF(strI0, "live_tab_single") || Intrinsics.LJFF(strI0, "live_tab_double") || C343780Ddo.LIZIZ() || ((iLiveIconOutService = (ILiveIconOutService) this.LL.getValue()) != null && iLiveIconOutService.LIZIZ())) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJJJJZI = ComplianceServiceProvider.LJIL().LJJJJZI();
        EnumC20537615Xy enumC20537615XyLIZIZ = ComplianceServiceProvider.LJIIJJI().LIZIZ();
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=fp_keyword_list_h5").buildUpon();
        String str14 = "1";
        if (zShouldShowFriendsTab) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("friends_enable", str2);
        if (zIsOn) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("stem_enable", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("live_enable", str4);
        if (zLJJJJZI) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, builderAppendQueryParameter3.appendQueryParameter("restriction_mode_enable", str5).appendQueryParameter("enter_from", str).toString());
        if (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD) {
            z2 = false;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fp_kwf_list_android", true, false)) {
                smartRouteBuildRoute.open();
                return;
            }
        } else {
            z2 = false;
        }
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("keyword_filter_for_shop", z2);
        if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime() < 172800) {
            z3 = true;
        } else {
            z3 = false;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_smart_keyword_filter_android", true);
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_smart_keyword_filter_android_edit", true, false);
        if (iLJIJ == 1) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
            if (iLJIJ == 2) {
                str6 = "2";
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_kw_short_link", false)) {
            str7 = "aweme://roma_redirect/?spark_page=pns_lynx_filter_keywords&bdhm_bid=i18n_lynx_privacy_and_safety&channel=fe_tns_filter_keywords";
        } else {
            str7 = "aweme://lynxview/?channel=fe_tns_filter_keywords";
        }
        Uri.Builder builderAppendQueryParameter4 = UriProtector.parse(str7).buildUpon().appendQueryParameter("is_bulk_filter", "1").appendQueryParameter("bundle", "show-self-filter-keyword-list-v3/template.js").appendQueryParameter("use_spark", "1").appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("should_full_screen", "1");
        if (zShouldShowFriendsTab) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("friends_enable", str8);
        if (zIsOn) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("stem_enable", str9);
        if (z) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("live_enable", str10).appendQueryParameter("photo_content_enable", "1");
        if (zLJJJJZI) {
            str11 = "1";
        } else {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter("restriction_mode_enable", str11).appendQueryParameter("enter_from", str).appendQueryParameter("is_smart_filter", str6);
        if (z3) {
            str12 = "1";
        } else {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("is_new_user", str12);
        if (zLIZ) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter10 = builderAppendQueryParameter9.appendQueryParameter("shop_enable", str13).appendQueryParameter("should_full_screen", "1");
        if (!zLJIIIZ) {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        String strLIZ = DigitalWellbeingEntranceSettings.LIZ(builderAppendQueryParameter10.appendQueryParameter("enable_smart_filter_selection", str14).toString());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_kw_filtering_entrypoint", c2344009Gk.LIZ);
        final C085L c085l = new C085L("filter_keyword", System.currentTimeMillis(), this, null);
        C1548820qPI.LJI(c085l, "updateOrCreateWordList");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZ);
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0sFV
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z4) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z4) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
                C1440005kM.LIZ(new C1166680gSw());
                C1548820qPI.LJIIIZ(c085l, "updateOrCreateWordList");
                C1440005kM.LIZ(new C1588880rRu("filter_keyword_update", (Set) this.LLILLJJLI.getValue(), false));
                ((Set) this.LLILLJJLI.getValue()).clear();
            }
        });
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final void LJ(Context context, Aweme aweme, String str) {
        C619480ORm.LIZ.getClass();
        C619480ORm.LJII(context, aweme, str, "", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4, java.lang.String r5) {
        /*
            r1 = this;
            X.0ORm r0 = X.C619480ORm.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r3)
            if (r0 != 0) goto L1e
            java.util.Set<java.lang.String> r0 = com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem.LLLIIL
            boolean r0 = X.C20638515pP.LIZIZ(r3)
            if (r0 == 0) goto L1e
            r0 = 2131857835(0x7f1191ab, float:1.9349441E38)
        L16:
            java.lang.String r0 = r2.getString(r0)
            X.C619480ORm.LJII(r2, r3, r0, r4, r5)
            return
        L1e:
            r0 = 2131830707(0x7f1127b3, float:1.9294419E38)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.feedsafety.filtervideo.FilterVideoServiceImpl.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService
    public final void LJII(Context context, Aweme aweme, String str, String str2, Function0<Unit> function0) {
        C619480ORm.LIZ.getClass();
        C619480ORm.LJI(context, aweme, str, str2, function0);
    }
}
