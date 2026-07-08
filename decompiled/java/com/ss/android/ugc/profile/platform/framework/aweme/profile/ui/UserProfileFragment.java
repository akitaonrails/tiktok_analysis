package com.ss.android.ugc.profile.platform.framework.aweme.profile.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0OGM;
import X.C0QFS;
import X.C0SSX;
import X.C0SSZ;
import X.C0VPL;
import X.C0WZX;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1254740iky;
import X.C1254970ilL;
import X.C12ES;
import X.C13LE;
import X.C14KI;
import X.C1619690sFb;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1749280vcc;
import X.C189200o6;
import X.C19406010w6;
import X.C19DJ;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C20734216Bo;
import X.C2204961BRm;
import X.C2211631BhB;
import X.C2371409Qy;
import X.C520650KbP;
import X.C786410Ut5;
import X.InterfaceC1254750ikz;
import X.InterfaceC1254990ilN;
import X.InterfaceC1586310rNl;
import X.InterfaceC1740760vOs;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.business.ur.ui.UserProfileSafeFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.arg.UserProfileArg;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class UserProfileFragment extends UserProfileSafeFragment implements InterfaceC1254750ikz, InterfaceC21503819Do, C19DJ, InterfaceC1586310rNl, InterfaceC1740760vOs, C0QFS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiOSMyPCMjOyJ9LjctJCokHELIOSJzcnZy4kLSgpZz8hJyMlJSp9PSxiHDw2OhU+Jik6JCAKOy40JSAiPQ==";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.navArg(this, AFwS207S0000000_19.get$arr$(573));
    public Aweme LLJ;
    public C1254740iky LLJI;
    public LinearLayout LLJIJIL;
    public C20734216Bo LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public C1254970ilL LLJILLL;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b5836";
    }

    @Override // X.InterfaceC1586310rNl
    public final String getEnterMethod() {
        return "notification_page";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "others_homepage";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.C19DJ
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    @Override // X.C19DJ
    public final boolean xM() {
        return true;
    }

    @Override // X.InterfaceC1254750ikz
    public final void DB0() {
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 4);
        try {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            finish();
        }
    }

    public final Bundle ZR() {
        int[] iArr;
        int[] intArray;
        Bundle bundle = new Bundle();
        String profileFromSceneV2 = TextUtils.isEmpty(aS().getProfileFromScene()) ? aS().getProfileFromSceneV2() : aS().getProfileFromScene();
        C786410Ut5.LJJJI("uid", aS().getUserId(), bundle);
        C786410Ut5.LJJJI("sec_user_id", aS().getSecUid(), bundle);
        C786410Ut5.LJJJI("profile_from", aS().getLabel(), bundle);
        C786410Ut5.LJJJI("video_id", aS().getAid(), bundle);
        C786410Ut5.LJJJI("source_aid", aS().getSourceAid(), bundle);
        C786410Ut5.LJJJI("profile_from", "other_user", bundle);
        C786410Ut5.LJJJI("type", aS().getType(), bundle);
        C786410Ut5.LJJJI("enter_method", aS().getEnterMethod(), bundle);
        C786410Ut5.LJJJI("enter_from", aS().getEnterFrom(), bundle);
        C786410Ut5.LJJJI("position", aS().getPosition(), bundle);
        C786410Ut5.LJJJI("profile_from_scene", profileFromSceneV2, bundle);
        C786410Ut5.LJJIZ(bundle, "inbox_log_extra", aS().getLogExtra());
        C786410Ut5.LJJJI("notice_type", aS().getNoticeType(), bundle);
        C786410Ut5.LJJJI("teen_sec_user_id", aS().getTeenSecUserId(), bundle);
        if (!TextUtils.isEmpty(aS().getPreviousPage())) {
            C786410Ut5.LJJJI("extra_previous_page", aS().getPreviousPage(), bundle);
        }
        if (aS().isFromPush() == 1) {
            bundle.putInt("is_from_push", 1);
            C786410Ut5.LJJJI("push_type", aS().getPushType(), bundle);
            C786410Ut5.LJJJI("push_id", aS().getPushId(), bundle);
        }
        C786410Ut5.LJJJI("request_id", aS().getLiveRequestId(), bundle);
        C786410Ut5.LJJJI("room_id", aS().getLiveRoomId(), bundle);
        C786410Ut5.LJJJI("from_request_id", aS().getFromRequestId(), bundle);
        C786410Ut5.LJJJI("return_live", aS().getReturnLive(), bundle);
        C786410Ut5.LJJJI("room_owner_id", aS().getLiveRoomOwnerId(), bundle);
        C786410Ut5.LJJJI("user_type", aS().getLiveType(), bundle);
        C786410Ut5.LJJJI("af_c_id", aS().getAfCampaignId(), bundle);
        C786410Ut5.LJJJI("af_adset_id", aS().getAfAdsetId(), bundle);
        C786410Ut5.LJJJI("media_source", aS().getMediaSource(), bundle);
        bundle.putBoolean("is_ddl", aS().isDDL());
        String trackParams = aS().getTrackParams();
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                JSONObject jSONObject = new JSONObject(trackParams);
                String strOptString = jSONObject.optString("show_window_source");
                C786410Ut5.LJJJI("source_content_id", jSONObject.optString("source_content_id"), bundle);
                C786410Ut5.LJJJI("show_window_source", strOptString, bundle);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("traffic_source_list");
                String string = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.toString() : null;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII ? C2371409Qy.LIZJ(C13LE.LJ(int[].class)) : new TypeToken<int[]>() { // from class: X.0ilM
                    }.getType());
                    if (!(objFromJson instanceof int[])) {
                        objFromJson = null;
                    }
                    iArr = (int[]) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    iArr = null;
                }
                if (iArr == null) {
                    iArr = new int[]{3};
                }
                bundle.putIntArray("traffic_source_list", iArr);
                C786410Ut5.LJJJI("trackParams", trackParams, bundle);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        String strIsFromSocialAvatarPage = aS().isFromSocialAvatarPage();
        if (strIsFromSocialAvatarPage != null) {
            if (!(!a0.LJJJIL(strIsFromSocialAvatarPage))) {
                strIsFromSocialAvatarPage = null;
            }
            if (strIsFromSocialAvatarPage != null) {
                C786410Ut5.LJJJI("extra_from_social_avatar_download_page", strIsFromSocialAvatarPage, bundle);
            }
        }
        bundle.putBoolean("is_live_record", aS().isFromLiveRecord());
        C786410Ut5.LJJJI("search_request_id", aS().getSearchRequestId(), bundle);
        bundle.putBoolean("isFromFeed", false);
        Bundle bundleSR = SR();
        C786410Ut5.LJJJI("extra_previous_page_position", bundleSR != null ? bundleSR.getString("extra_previous_page_position") : null, bundle);
        Bundle bundleSR2 = SR();
        if (bundleSR2 == null) {
            bundleSR2 = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from_request_id", bundleSR2.getString("enter_from_request_id"), bundle);
        C786410Ut5.LJJJI("scene_id", aS().getSceneId(), bundle);
        bundle.putInt("need_track_compare_recommend_reason", bundleSR2.getInt("need_track_compare_recommend_reason", 0));
        C786410Ut5.LJJJI("video_gid", bundleSR2.getString("video_gid"), bundle);
        C786410Ut5.LJJJI("previous_recommend_reason", bundleSR2.getString("previous_recommend_reason"), bundle);
        C786410Ut5.LJJJI("recommend_from_type", bundleSR2.getString("recommend_from_type"), bundle);
        bundle.putInt("is_cold_launch", bundleSR2.getInt("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", bundleSR2.getInt("from_recommend_card", 0));
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, bundleSR2.getString(FollowStatusChangeMethod.PARAM_UID), bundle);
        bundle.putInt("general_search_card_type", bundleSR2.getInt("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", bundleSR2.getBoolean("is_notify_miniapp_follow_status", false));
        C786410Ut5.LJJIZ(bundle, "recommend_enter_profile_params", bundleSR2.getSerializable("recommend_enter_profile_params"));
        C786410Ut5.LJJIZ(bundle, "extra_mutual_relation", bundleSR2.getSerializable("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", bundleSR2.getBoolean("extra_from_mutual", false));
        bundle.putBoolean("sticky_content", Intrinsics.LJFF("1", bundleSR2.getString("sticky_content")));
        String string2 = bundleSR2.getString("event_keys");
        String strJ3 = "";
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundleSR2.getString("inbox_position");
        if (string3 == null) {
            string3 = "";
        }
        if (string2.length() > 0) {
            if (string3.length() > 0) {
                try {
                    JSONObject jSONObject2 = string2.length() == 0 ? new JSONObject() : new JSONObject(string2);
                    jSONObject2.put("position", string3);
                    strJ3 = C786410Ut5.J3(jSONObject2);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                string2 = strJ3;
            }
        }
        C786410Ut5.LJJJI("event_keys", string2, bundle);
        bundle.putBoolean("is_response_home_feed_scroll", false);
        C786410Ut5.LJJJI("source_page", bundleSR2.getString("source_page"), bundle);
        C786410Ut5.LJJJI("now_card_type", bundleSR2.getString("now_card_type"), bundle);
        C786410Ut5.LJJJI("is_now_clear", bundleSR2.getString("is_now_clear"), bundle);
        bundle.putInt("has_small_window", bundleSR2.getInt("has_small_window"));
        C786410Ut5.LJJJI("now_type", bundleSR2.getString("now_type"), bundle);
        Bundle bundleSR3 = SR();
        if (bundleSR3 != null && (intArray = bundleSR3.getIntArray("traffic_source_list")) != null) {
            bundle.putIntArray("traffic_source_list", intArray);
        }
        C786410Ut5.LJJIIZI(bundle, aS().getBundle(), "bundle");
        C786410Ut5.LJJIZ(bundle, "LIVE_FOLLOW_REPORT_PARAMS", aS().getLiveFollowReportParams());
        C786410Ut5.LJJJI("source_btm_token", bundleSR2.getString("source_btm_token"), bundle);
        bundle.putBoolean("auto_transfer_to_enlarge_avatar", bundleSR2.getBoolean("auto_transfer_to_enlarge_avatar", false));
        bundle.putBoolean("from_repost_avatar_sticker", bundleSR2.getBoolean("from_repost_avatar_sticker", false));
        return bundle;
    }

    public final UserProfileArg aS() {
        return (UserProfileArg) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WR() {
        C0OGM c0ogm;
        if (getContext() == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI("userprofilefragment");
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new I18nUserProfileFragment();
            if (fragmentLJJJJZI instanceof InterfaceC1254990ilN) {
                InterfaceC1254990ilN interfaceC1254990ilN = (InterfaceC1254990ilN) new I18nUserProfileFragment();
                interfaceC1254990ilN.LIZIZ();
                Aweme aweme = this.LLJ;
                if (aweme != null && aweme.isAd() && TextUtils.equals("general_search", aS().getEnterFrom())) {
                    interfaceC1254990ilN.LIZ();
                }
                fragmentLJJJJZI = (Fragment) interfaceC1254990ilN;
            }
            fragmentLJJJJZI.setArguments(ZR());
        }
        C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.view_profile, fragmentLJJJJZI, "userprofilefragment");
        c19ehLJIIJ.LJIIJ();
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        Object context = getContext();
        Integer numValueOf = null;
        if ((context instanceof C0OGM) && (c0ogm = (C0OGM) context) != null) {
            numValueOf = Integer.valueOf(c0ogm.getPageType());
        }
        iCommercePageTrackingServiceLIZLLL.LIZJ(new C19406010w6(numValueOf, this.LLJ, "homepage_ad", "page_visit", (String) null, 32));
    }

    public final void finish() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
        C1619690sFb.LIZ(activity, null);
        C520650KbP.LIZ(activity);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1254970ilL c1254970ilL = this.LLJILLL;
        if (c1254970ilL != null) {
            c1254970ilL.LIZ.getViewModel().vQ2().LIZ().remove(c1254970ilL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2211631BhB.LJIIL(this, null);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        BaseActivity baseActivity;
        if ((activity instanceof BaseActivity) && (baseActivity = (BaseActivity) activity) != null) {
            baseActivity.activityConfiguration(new AwS385S0200000_19(activity, this, 73));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[PHI: r1
      0x003b: PHI (r1v9 java.lang.String) = (r1v3 java.lang.String), (r1v10 java.lang.String) binds: [B:15:0x0039, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1586310rNl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zu(java.lang.String r7) {
        /*
            r6 = this;
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.put(r0, r7)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_inbox"
            r3.put(r1, r0)
            X.1D0F r5 = X.C1D0F.LIZ
            java.lang.String r4 = ""
            if (r5 == 0) goto L1d
            java.lang.String r1 = r5.LIZ()
            if (r1 != 0) goto L1e
        L1d:
            r1 = r4
        L1e:
            r2 = 0
            if (r5 == 0) goto L88
            boolean r0 = r5.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L29:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r1, r0)
            if (r5 == 0) goto L38
            java.lang.String r1 = r5.LIZIZ()
            if (r1 != 0) goto L3b
        L38:
            r1 = r4
            if (r5 == 0) goto L42
        L3b:
            java.lang.String r0 = r5.LIZJ()
            if (r0 == 0) goto L42
            r4 = r0
        L42:
            r3.put(r1, r4)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "profile_entrance_id"
            r3.put(r0, r1)
            android.os.Bundle r1 = r6.SR()
            if (r1 == 0) goto L5e
            java.lang.String r0 = "recommend_enter_profile_params"
            java.io.Serializable r2 = r1.getSerializable(r0)
        L5e:
            boolean r0 = r2 instanceof X.C1252610ihX
            if (r0 == 0) goto L82
            X.0ihX r2 = (X.C1252610ihX) r2
            if (r2 == 0) goto L82
            java.lang.String r0 = r2.getToUserId()
            if (r0 == 0) goto L82
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L82
            java.lang.String r0 = r2.getToUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r3.put(r0, r1)
        L82:
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r3)
            return
        L88:
            r0 = r2
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment.Zu(java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        int iLIZJ;
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = this.LLJIJIL;
        if (linearLayout != null) {
            if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(getContext())) {
                iLIZJ = C14KI.LIZLLL(getContext());
            } else {
                iLIZJ = (int) C12ES.LIZJ(configuration.screenWidthDp, linearLayout.getContext());
            }
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(iLIZJ, -1));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS257S0000000_19.get$arr$(500));
    }

    public static String VR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c5  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC1254750ikz
    public final void so2(String str, String str2) {
        aS().setUserId(str);
        aS().setSecUid(str2);
        WR();
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 4);
    }

    @Override // X.C19DJ
    public final void u1(int i, Intent intent) {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C0VPL.LIZ(i, activity);
        if (-1 == i && intent != null) {
            String strVR = VR(intent, "feed_share_element_aid");
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager.LJJJJZI("userprofilefragment") instanceof C0SSX) {
                ((C0SSX) childFragmentManager.LJJJJZI("userprofilefragment")).LLIZ(strVR);
            } else {
                if (!(childFragmentManager.LJJJJZI("myprofilefragment") instanceof C0SSZ)) {
                    return;
                }
                ((C0SSZ) childFragmentManager.LJJJJZI("myprofilefragment")).LLIZ(strVR);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        if (i == 1) {
            if (i2 == 2) {
                C20734216Bo c20734216Bo = this.LLJILJIL;
                if (c20734216Bo != null) {
                    c20734216Bo.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i == 10086 && i2 == -1) {
            C19EG activity = getActivity();
            if (activity != null) {
                C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mc5PPyDR0YS/W4tNR7d3eDWYJLHJF0jXFoPO/kpXD3cFfbydfUTFkX74QEdodrbzhaZxL+X6vIw==", null));
            }
            activityConfiguration(AFwS257S0000000_19.get$arr$(499));
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eb2, viewGroup, false);
        C19GS c19gs = null;
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
}
