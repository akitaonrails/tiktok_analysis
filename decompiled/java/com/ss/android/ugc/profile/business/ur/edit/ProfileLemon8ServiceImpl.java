package com.ss.android.ugc.profile.business.ur.edit;

import X.AbstractC848400XPy;
import X.AnonymousClass0203;
import X.C01GW;
import X.C08JS;
import X.C0OFE;
import X.C0TGX;
import X.C0WZX;
import X.C0XQ7;
import X.C1065190dpF;
import X.C11S5;
import X.C123100dR;
import X.C1242870iRp;
import X.C1254160ik2;
import X.C1254250ikB;
import X.C1254350ikL;
import X.C12ES;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C1720106oR;
import X.C178200mK;
import X.C19EG;
import X.C1ECB;
import X.C1ECC;
import X.C1ECD;
import X.C1EE0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2105908Mv;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2429209fW;
import X.C305720Byc;
import X.C340280DVq;
import X.C452501pT;
import X.C817410W4t;
import X.C817430W4v;
import X.C828330WeV;
import X.C844470XAv;
import X.C985403tE;
import X.InterfaceC1065250dpL;
import X.InterfaceC19474811He;
import X.InterfaceC817440W4w;
import X.InterfaceC828360WeY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.IProfileLemon8Service;
import com.ss.android.ugc.aweme.profile.model.Lemon8Struct;
import com.ss.android.ugc.profile.business.ur.edit.api.Lemon8API;
import com.ss.android.ugc.profile.business.ur.edit.api.Lemon8BindResponse;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS15S1210000_19;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLemon8ServiceImpl implements IProfileLemon8Service {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(421));

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJI() {
        Boolean boolValueOf;
        C1254250ikB.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!Intrinsics.LJFF(curUserId, C1254250ikB.LIZLLL)) {
            C1254250ikB.LIZLLL = curUserId;
        }
        Boolean bool = ((ProfileLemon8AccountTag) C1254250ikB.LIZJ.getValue()).isTTAuthorized;
        boolean zBooleanValue = ((Boolean) C305720Byc.LIZJ.getValue()).booleanValue();
        String lemon8OpenId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getLemon8OpenId();
        if (lemon8OpenId != null) {
            boolValueOf = Boolean.valueOf(lemon8OpenId.length() == 0);
        } else {
            boolValueOf = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) || !zBooleanValue || !Intrinsics.LJFF(boolValueOf, bool2)) {
            return false;
        }
        Keva kevaLIZ = C1254250ikB.LIZ();
        int i = kevaLIZ.getInt("key_show_count", 0);
        if (kevaLIZ.getBoolean("key_dismiss_forever", false)) {
            return false;
        }
        C01GW c01gw = C1254250ikB.LIZIZ;
        Integer num = ((ProfileLemon8BannerFreqParams) c01gw.getValue()).maxTime;
        if (i >= (num != null ? num.intValue() : 2)) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - kevaLIZ.getLong("key_last_show_time", 0L)) / 86400000;
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("profile lemon8 keva", String.valueOf(jCurrentTimeMillis));
        Integer num2 = ((ProfileLemon8BannerFreqParams) c01gw.getValue()).maxPerTimeRange;
        return jCurrentTimeMillis >= ((long) (num2 != null ? num2.intValue() : 14));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LIZIZ(C19EG c19eg) {
        return C817410W4t.LIZIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJ(C19EG c19eg) {
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            if (!C817410W4t.LIZLLL(c19eg, "com.bd.nproject") && !C817410W4t.LIZLLL(c19eg, "com.bd.nproject.private")) {
                return false;
            }
            return true;
        }
        return C817410W4t.LIZLLL(c19eg, "com.bd.nproject");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILJJIL(C19EG c19eg) {
        String str;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pid", "tiktok_connect"), new Pair("from_scene", "tiktok_edit_profile"), new Pair("client_key", "ley0x18l4s4en6er"), new Pair("response_type", "code"), new Pair("sdk_name", "tiktok_sdk_auth"));
        String str2 = (String) C1ECC.LIZLLL.getValue();
        if (!C123100dR.LIZ(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            mapLJIIJ.put("amp_extra", LJIIJ(str2, "", ""));
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            String str3 = C817410W4t.LIZIZ;
            if (Intrinsics.LJFF(str3, "com.bd.nproject")) {
                str = "2657";
            } else if (Intrinsics.LJFF(str3, "com.bd.nproject.private")) {
                str = "2657test";
            } else {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append("://integration_transit");
            Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon();
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJIIJ;
            String str4 = (String) linkedHashMap.get("amp_extra");
            if (str4 != null && str4.length() > 0) {
                builderBuildUpon.appendQueryParameter("amp_extra", str4);
                mapLJIIJ.remove("amp_extra");
            }
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(builderBuildUpon.build().toString()));
            intent.setPackage(C817410W4t.LIZIZ);
            intent.putExtra("auth_caller_entity", "com.ss.n_project.opensdk_tt.ui.Lemon8AuthActivity");
            intent.putExtra("auth_caller_package_name", c19eg.getPackageName());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("pns.sandbox.dataflow_id", 1207962113);
            C817410W4t.LIZ(c19eg, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJIILL(C19EG c19eg) {
        return C817410W4t.LIZJ(c19eg);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJ(java.lang.String r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl.LJIJ(java.lang.String, java.util.Map):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZJ(Context context, Map<String, String> map) {
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse("snssdk2657://user_profile").buildUpon();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            String str = (String) linkedHashMap.get("amp_extra");
            if (str != null && str.length() > 0) {
                builderBuildUpon.appendQueryParameter("amp_extra", str);
                map.remove("amp_extra");
            }
            String str2 = (String) linkedHashMap.get("tiktok_source_params");
            if (str2 != null && str2.length() > 0) {
                builderBuildUpon.appendQueryParameter("tiktok_source_params", str2);
                map.remove("tiktok_source_params");
            }
            String str3 = (String) linkedHashMap.get("profile_auto_action");
            if (str3 != null && str3.length() > 0) {
                builderBuildUpon.appendQueryParameter("profile_auto_action", str3);
                map.remove("profile_auto_action");
            }
            Intent intent = new Intent("android.intent.action.VIEW", builderBuildUpon.build());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
            C2429209fW.LIZ().appendDataFlowId(intent, 1207962113);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1akzVbaGIltgtWrHheu87rfU0k7Nz1bWP/s=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJFF(Context context, Lemon8Struct lemon8Struct) {
        String str;
        String str2;
        String str3 = "tiktok_selfhomepage_icon";
        if (C817410W4t.LIZIZ(context) && C817410W4t.LIZJ(context)) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("pid", "tiktok_connect");
            if (lemon8Struct == null || (str = lemon8Struct.id) == null) {
                str = "";
            }
            pairArr[1] = new Pair("open_id", str);
            if (lemon8Struct == null || !lemon8Struct.isMine) {
                str3 = "tiktok_otherhomepage_icon";
            }
            pairArr[2] = new Pair("from_scene", str3);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            String strLIZ = C1ECD.LIZ();
            if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
                mapLJIIJ.put("amp_extra", LJIIJ(strLIZ, "", ""));
            }
            C817410W4t.LJFF(context, mapLJIIJ);
            if (lemon8Struct != null && lemon8Struct.isMine) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            LJIILLIIL(str2, "jump", "", "", "", "");
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (((Boolean) C1ECD.LIZJ.getValue()).booleanValue() && activityLIZ != null) {
            Pair[] pairArr2 = new Pair[1];
            if (lemon8Struct == null || !lemon8Struct.isMine) {
                str3 = "tiktok_otherhomepage_icon";
            }
            pairArr2[0] = new Pair("from_scene", str3);
            LJIIJJI(activityLIZ, C2097608Jq.LJIIJ(pairArr2), new AwS420S0200000_19(this, lemon8Struct, 9), new AwS246S0300000_2(this, context, lemon8Struct, 0));
            return;
        }
        LJIJJ(context, lemon8Struct);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJII(ViewGroup viewGroup, C0TGX c0tgx) {
        PopupManager.LJIJI(new C1242870iRp(viewGroup, c0tgx), true);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIIIZZ(Context context, Map<String, String> map) {
        try {
            C817410W4t.LJ(context, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gotoAppStore exception: ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(' ');
            sbLIZ.append(e.getStackTrace());
            C1720106oR.LJI("ProfileLemon8ServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIIZ(int i, Activity activity) {
        ((Lemon8API) this.LIZ.getValue()).setUserSetting("lemon8_profile_settings", i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new AnonymousClass0203(activity, 0));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILIIL(final AwS563S0100000_19 awS563S0100000_19, final AwS385S0200000_19 awS385S0200000_19) {
        ((Lemon8API) this.LIZ.getValue()).unBind().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0hi4
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                if (th instanceof C0XIR) {
                    Function1<String, Unit> function1 = awS385S0200000_19;
                    if (function1 != null) {
                        function1.invoke(String.valueOf(((C23112093u) th).getErrorCode()));
                        return;
                    }
                    return;
                }
                Function1<String, Unit> function12 = awS385S0200000_19;
                if (function12 == null) {
                    return;
                }
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                function12.invoke(message);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(BaseResponse baseResponse) {
                Function0<Unit> function0 = awS563S0100000_19;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final String LJIIZILJ(String str, String str2) {
        String strLIZIZ = C178200mK.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "tiktok_connect"), new Pair("group_id", str), new Pair("previous_page_tt", str2)));
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }

    public final void LJIJJ(Context context, Lemon8Struct lemon8Struct) {
        String str;
        String str2;
        String str3;
        String str4;
        if (lemon8Struct != null && lemon8Struct.isMine) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        LJIILLIIL(str, "in_app_viewer", "", "", "", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ProfileLemon8AccountTag profileLemon8AccountTag = C1254350ikL.LIZ;
        ProfileLemon8AccountTag profileLemon8AccountTag2 = (ProfileLemon8AccountTag) settingsManagerLIZLLL.LJIIIIZZ("lemon8_info", ProfileLemon8AccountTag.class, profileLemon8AccountTag);
        if (profileLemon8AccountTag2 != null) {
            profileLemon8AccountTag = profileLemon8AccountTag2;
        }
        sbLIZ.append(profileLemon8AccountTag.lemon8ProfileLink);
        sbLIZ.append('/');
        if (lemon8Struct != null) {
            str2 = lemon8Struct.id;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("pid", "tiktok_connect");
        if (lemon8Struct != null) {
            str3 = lemon8Struct.region;
        } else {
            str3 = null;
        }
        pairArr[1] = new Pair("region", str3);
        pairArr[2] = new Pair("_r", "1");
        pairArr[3] = new Pair("share_platform", "tiktok_connect");
        if (lemon8Struct != null && lemon8Struct.isMine) {
            str4 = "tiktok_selfhomepage_icon";
        } else {
            str4 = "tiktok_otherhomepage_icon";
        }
        pairArr[4] = new Pair("from_scene", str4);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String strLIZ = C1ECD.LIZ();
        if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
            mapLJIIJ.put("tt_ab_version_id", strLIZ);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(((LinkedHashMap) mapLJIIJ).entrySet(), "&", null, null, 0, null, AFwS229S0000000_2.get$arr$(538), 30);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('?');
        sbLIZ2.append(strLJJLIIIJ);
        new C828330WeV(new ThirdPartyBizCert(402665476)).LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ2), new InterfaceC828360WeY() { // from class: X.0ikC
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context2, String str5) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = str5;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402665476);
                C1554300qY8.LIZIZ(context2, sparkThirdContext);
            }
        }, null);
    }

    public static void LJIJI(ProfileLemon8ServiceImpl profileLemon8ServiceImpl, Activity activity, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        profileLemon8ServiceImpl.getClass();
        C1254160ik2.LIZIZ.LJIIIIZZ(activity, C2097608Jq.LJIIJ(new Pair("pid", "tiktok_connect"), new Pair("amp_extra", LJIJ(str, linkedHashMap))));
    }

    public static void LJIJJLI(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("result", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("error_reason", str3);
        }
        C20684815ws.LJIILLIIL("bind_half_page_show_result", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZ(String str, final AwS133S1100000_19 awS133S1100000_19, final AwS126S1100000_12 awS126S1100000_12) {
        String strDecode = null;
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str2 = "";
        if (strDecode != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJJLIL(strDecode, "?", ""), new String[]{"&"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                if (listLJJLIIIJILLIZJL2.size() == 2) {
                    arrayList.add(new Pair(ListProtector.get(listLJJLIIIJILLIZJL2, 0), ListProtector.get(listLJJLIIIJILLIZJL2, 1)));
                }
            }
            String str3 = (String) C2097608Jq.LJIILLIIL(arrayList).get("code");
            if (str3 != null) {
                str2 = str3;
            }
        }
        ((Lemon8API) this.LIZ.getValue()).LIZ(str2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<Lemon8BindResponse>() { // from class: X.0hi5
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                if (th instanceof C0XIR) {
                    Function1<String, Unit> function1 = awS126S1100000_12;
                    if (function1 != null) {
                        function1.invoke(String.valueOf(((C23112093u) th).getErrorCode()));
                        return;
                    }
                    return;
                }
                Function1<String, Unit> function12 = awS126S1100000_12;
                if (function12 == null) {
                    return;
                }
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                function12.invoke(message);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Lemon8BindResponse lemon8BindResponse) {
                Lemon8BindResponse lemon8BindResponse2 = lemon8BindResponse;
                Function1<String, Unit> function1 = awS133S1100000_19;
                if (function1 != null) {
                    String str4 = lemon8BindResponse2.username;
                    if (str4 == null) {
                        str4 = "";
                    }
                    function1.invoke(str4);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZLLL(Activity activity, String str, boolean z) {
        int i;
        int i2;
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new TuxIconDrawable(activity, R.raw.icon_color_lemon8_radius));
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        C340280DVq c340280DVq = new C340280DVq(activity, imageView);
        c340280DVq.LJFF = (int) C12ES.LIZJ(72.0f, activity);
        c340280DVq.LJI = (int) C12ES.LIZJ(72.0f, activity);
        c1397580mTM.LJIIIZ = c340280DVq;
        if (z) {
            i = 2131822640;
        } else {
            i = 2131822643;
        }
        c1397580mTM.LJFF(i);
        if (z) {
            i2 = 2131822639;
        } else {
            i2 = 2131822642;
        }
        c1397580mTM.LIZ(i2);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS15S1210000_19(z, str, this, activity, 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final String LJIIJ(String str, String str2, String str3) {
        C844470XAv.LIZ.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("tt_ab_version_id", str), new Pair("app_id", String.valueOf(C844470XAv.LJIIJ)), new Pair("from_user_id", str3));
        if (!C2105908Mv.LIZ(str2)) {
            C0OFE.LIZ(((LinkedHashMap) mapLJIIJ).get("tt_ab_vids"), str2);
        }
        return C08JS.LIZLLL(mapLJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0dpW] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIJJI(Activity activity, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str = (String) linkedHashMap.get("from_scene");
        if (str == null) {
            str = "";
        }
        C1EE0 c1ee0 = C1EE0.LIZIZ;
        ?? r3 = new InterfaceC1065250dpL() { // from class: X.0dpW
            @Override // X.InterfaceC1065250dpL
            public final String LIZ() {
                return "tiktok_connect";
            }

            @Override // X.InterfaceC1065250dpL
            public final String getScene() {
                return "bind";
            }
        };
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pid", "tiktok_connect"), new Pair("amp_extra", LJIJ(str, map)));
        Object obj = linkedHashMap.get("lemon8_deep_link_value");
        if (obj != null) {
            mapLJIIJ.put("lemon8_deep_link_value", obj);
        }
        Object obj2 = linkedHashMap.get("entry");
        if (obj2 != null) {
            mapLJIIJ.put("entry", obj2);
        }
        Object obj3 = linkedHashMap.get("cpp_link");
        if (obj3 != null) {
            mapLJIIJ.put("cpp_link", obj3);
        }
        c1ee0.LIZ(activity, r3, mapLJIIJ, new C1065190dpF(this, str, function0, function02));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIL(C19EG c19eg, String str, final Function1 function1, final Function1 function12) {
        String str2;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pid", "tiktok_connect"), new Pair("from_scene", str), new Pair("client_key", "ley0x18l4s4en6er"), new Pair("response_type", "code"), new Pair("sdk_name", "tiktok_sdk_auth"), new Pair("auth_scope", C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("user_info", "user_posts"), ",", null, null, 0, null, null, 62)));
        ArrayList arrayList = new ArrayList();
        String str3 = (String) C1ECC.LIZLLL.getValue();
        if (C123100dR.LIZ(str3) && str3 != null) {
            arrayList.add(str3);
        }
        String str4 = (String) C1ECB.LIZLLL.getValue();
        if (C123100dR.LIZ(str4) && str4 != null) {
            arrayList.add(str4);
        }
        mapLJIIJ.put("amp_extra", LJIIJ(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), "", ""));
        try {
            C817410W4t.LIZ = new InterfaceC817440W4w() { // from class: X.0W4u
                @Override // X.InterfaceC817440W4w
                public final void LIZ(int i, String str5, boolean z) {
                    if (z) {
                        Function1<String, Unit> function13 = function1;
                        if (function13 != null) {
                            if (str5 == null) {
                                str5 = "";
                            }
                            function13.invoke(str5);
                            return;
                        }
                        return;
                    }
                    Function1<String, Unit> function14 = function12;
                    if (function14 == null) {
                        return;
                    }
                    function14.invoke(String.valueOf(i));
                }
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            String str5 = C817410W4t.LIZIZ;
            if (Intrinsics.LJFF(str5, "com.bd.nproject")) {
                str2 = "2657";
            } else if (Intrinsics.LJFF(str5, "com.bd.nproject.private")) {
                str2 = "2657test";
            } else {
                str2 = "";
            }
            sbLIZ.append(str2);
            sbLIZ.append("://auth_account");
            Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon();
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJIIJ;
            String str6 = (String) linkedHashMap.get("amp_extra");
            if (str6 != null && str6.length() > 0) {
                builderBuildUpon.appendQueryParameter("amp_extra", str6);
                mapLJIIJ.remove("amp_extra");
            }
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(builderBuildUpon.build().toString()));
            intent.setPackage(C817410W4t.LIZIZ);
            intent.putExtra("auth_caller_entity", "com.ss.n_project.opensdk_tt.ui.Lemon8AuthActivity");
            intent.putExtra("auth_caller_package_name", c19eg.getPackageName());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("pns.sandbox.dataflow_id", 1207962113);
            C817410W4t.LIZ(c19eg, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C817430W4v.LIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILLIIL(String str, String str2, String str3, String str4, String str5, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("result", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ("aweme_request_id", str5);
        c2344009Gk.LJIIIIZZ("to_user_id", str6);
        C20684815ws.LJIILLIIL("click_lemon8_entrance_result", c2344009Gk.LIZ);
    }
}
