package com.ss.android.ugc.aweme.ad.feed.message;

import X.C098200Yq;
import X.C1024570clj;
import X.C1720106oR;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.InterfaceC1034470d1h;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LeadGenFormCardRoute implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        C19EG c19eg;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object c098200Yq;
        Fragment fragment;
        FragmentManager supportFragmentManager;
        int id;
        Object c098200Yq2;
        View view;
        List<Fragment> listLJJLIIIJL;
        Fragment next;
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Activity activityLJFF = C2214201BlK.LJFF();
        Fragment fragment2 = null;
        if (activityLJFF instanceof C19EG) {
            c19eg = (C19EG) activityLJFF;
        } else {
            c19eg = null;
        }
        if (c19eg == null) {
            return Boolean.FALSE;
        }
        if (!c19eg.isFinishing() && !c19eg.isDestroyed()) {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return Boolean.FALSE;
            }
            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("LeadGenFormRoute", "lynxUrl is empty");
                return Boolean.FALSE;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("close_fragment", true);
            String str2 = "";
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "track_params");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                    c098200Yq = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                } else {
                    c098200Yq = new JSONObject();
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse data fail, url:");
                sbLIZ.append(uri);
                C1720106oR.LIZ("LeadGenFormRoute", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                Uri uri2 = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "native_site_ad_info")) != null) {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                C189200o6.m2constructorimpl(jSONObject.put("pageData", str2));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            bundle2.putLong("ad_id", jSONObject.optLong("creativeId"));
            C786410Ut5.LJJJI("aweme_group_id", jSONObject.optString("groupId"), bundle2);
            C786410Ut5.LJJJI("bundle_download_app_log_extra", jSONObject.optString("logExtra"), bundle2);
            String strOptString = jSONObject.optString("pageData");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (jSONObject2.has("creative_id")) {
                        jSONObject.put("creativeId", jSONObject2.optString("creative_id"));
                    }
                    if (jSONObject2.has("ad_id")) {
                        jSONObject.put("adId", jSONObject2.optString("ad_id"));
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            String string = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon().appendQueryParameter("initialData", C786410Ut5.J3(jSONObject)).toString();
            FragmentManager supportFragmentManager2 = c19eg.getSupportFragmentManager();
            if (supportFragmentManager2 != null && (listLJJLIIIJL = supportFragmentManager2.LJJLIIIJL()) != null) {
                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Fragment fragment3 = next;
                        boolean z2 = false;
                        if (fragment3 instanceof DialogFragment) {
                            Dialog dialog = ((DialogFragment) fragment3).getDialog();
                            if (dialog != null && dialog.isShowing()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                fragment = next;
            } else {
                fragment = null;
            }
            if (fragment == null || fragment.getView() == null || (supportFragmentManager = fragment.getChildFragmentManager()) == null) {
                supportFragmentManager = c19eg.getSupportFragmentManager();
            }
            if (fragment != null && (view = fragment.getView()) != null) {
                id = view.getId();
            } else {
                id = R.id.content;
            }
            C1024570clj c1024570clj = new C1024570clj(c19eg, string, bundle2);
            if (supportFragmentManager.LJJJJZI("dm_form_card_spark") != null) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZ("DMFormCardSparkFragment", "target fragment already exit");
            } else {
                c1024570clj.LJ = supportFragmentManager;
                InterfaceC1034470d1h interfaceC1034470d1h = (InterfaceC1034470d1h) c1024570clj.LJI.getValue();
                if (interfaceC1034470d1h != null) {
                    fragment2 = interfaceC1034470d1h.getFragment();
                }
                if (fragment2 != null) {
                    try {
                        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                        c19ehLJIIJ.LIZJ(id, fragment2, "dm_form_card_spark");
                        c19ehLJIIJ.LJIIJ();
                        c1024570clj.LIZ(fragment2);
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        c098200Yq2 = new C098200Yq(th4);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    C189200o6.m1boximpl(c098200Yq2);
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
