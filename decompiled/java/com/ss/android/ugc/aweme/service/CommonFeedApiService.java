package com.ss.android.ugc.aweme.service;

import X.AbstractC1386130mAt;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C64;
import X.C0NET;
import X.C0O0X;
import X.C0XQ7;
import X.C128Y;
import X.C1355510lNV;
import X.C1355520lNW;
import X.C1387610mDH;
import X.C1387690mDP;
import X.C1393420mMe;
import X.C1393430mMf;
import X.C1393460mMi;
import X.C13IQ;
import X.C13LE;
import X.C1400160mXW;
import X.C14LC;
import X.C1594680rbG;
import X.C19EG;
import X.C20550115b9;
import X.C2093608Ic;
import X.C2174741A9g;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2547509yb;
import X.C309690CBz;
import X.C582170MsR;
import X.C582330Msh;
import X.C588430N6b;
import X.C692910RFx;
import X.C737030Svd;
import X.C740370T2l;
import X.C813960VwQ;
import X.C828030We1;
import X.InterfaceC1017450caF;
import X.InterfaceC1566480qrm;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1603190roz;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.assem.mainactivityobserver.CommonFeedActivityAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.sound.AutoAdjustVolumeTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommonFeedApiService implements ICommonFeedApiService {
    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIILJJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIL() {
        C692910RFx.LJFF = 0;
        C692910RFx.LJI = 0;
        boolean z = C14LC.LJIIIZ;
        C309690CBz.LIZ.LIZJ = 0;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final C13IQ<? extends AbstractC738140SxQ> LJJII() {
        return C13LE.LIZ(CommonFeedActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LIZJ() {
        C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
        C582330Msh.LIZ().getClass();
        C740370T2l.LIZ();
        C1387610mDH.LIZ.getClass();
        C1387610mDH.LJ();
        C2174741A9g.LIZIZ.LJIIIIZZ();
        C20550115b9.LIZ.getClass();
        C20550115b9.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJ() {
        C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
        C582330Msh.LIZ().getClass();
        C740370T2l.LIZ();
        C1387610mDH.LIZ.getClass();
        C1387610mDH.LJ();
        C2174741A9g.LIZIZ.LJIIIIZZ();
        C20550115b9.LIZ.getClass();
        C20550115b9.LIZIZ = "";
        C588430N6b.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIIIZ() {
        C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
        C582330Msh.LIZ().getClass();
        C740370T2l.LIZ();
        C1387610mDH.LIZ.getClass();
        C1387610mDH.LJ();
        C2174741A9g.LIZIZ.LJIIIIZZ();
        C20550115b9.LIZ.getClass();
        C20550115b9.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C588430N6b.LIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIIJ() {
        C1387610mDH.LIZ.getClass();
        String strLIZJ = C2179771ASp.LIZJ();
        float fLJIIIIZZ = (float) C2179771ASp.LJIIIIZZ();
        Keva keva = AutoAdjustVolumeTask.LL;
        keva.getFloat(strLIZJ, Float.MIN_VALUE);
        if (C582170MsR.LIZ && Intrinsics.LJFF("homepage_hot", "homepage_hot") && !Intrinsics.LJFF(strLIZJ, "none")) {
            keva.storeFloat(strLIZJ, fLJIIIIZZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIJJI() {
        C1387610mDH.LIZ.getClass();
        return C1387610mDH.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIZILJ() {
        return C2174741A9g.LIZIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIJJLI() {
        C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
        C582330Msh.LIZ().getClass();
        C740370T2l.LIZ();
        C1387610mDH.LIZ.getClass();
        C1387610mDH.LJ();
        C2174741A9g.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIII() {
        C1387610mDH.LIZ.getClass();
        if (C2547509yb.LIZ && Intrinsics.LJFF("homepage_hot", "homepage_hot")) {
            String strLIZJ = C2179771ASp.LIZJ();
            float fLJIIIIZZ = (float) C2179771ASp.LJIIIIZZ();
            Keva keva = AutoAdjustVolumeTask.LL;
            float f = keva.getFloat(strLIZJ, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE && !Intrinsics.LJFF(strLIZJ, "none")) {
                keva.storeFloat(strLIZJ, fLJIIIIZZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAudioDeviceChanged: enter_from=");
            sbLIZ.append("homepage_hot");
            sbLIZ.append(", deviceName=");
            sbLIZ.append(strLIZJ);
            sbLIZ.append(", curVolume=");
            sbLIZ.append(fLJIIIIZZ);
            sbLIZ.append(", recoverVolume=");
            sbLIZ.append(f);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJIIJZLJL() {
        C1387610mDH.LIZ.getClass();
        return C1387610mDH.LIZIZ() && !C1387610mDH.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJJIIZI() {
        C0NET.LIZ.getClass();
        return C0NET.LJI();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "allow_3m_to_10m_video_duet_and_stitch_consumer", true, false);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIJJ() {
        return C0XQ7.LJFF().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIILL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final String LJIJ() {
        return C1594680rbG.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean LJIJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final Map<String, Object> LJII(Aweme aweme) {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final List<AnchorCommonStruct> LJIIIIZZ(Aweme aweme) {
        return C1393420mMe.LIZIZ().LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJ(boolean z) {
        C2174741A9g.LIZIZ.LJIILIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final int LJJIFFI(String str) {
        C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
        C0O0X.LIZ().LIZ(str);
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIIJ(boolean z) {
        C1387610mDH.LIZ.getClass();
        Keva.getRepo("repo_auto_volume").storeBoolean("auto_volume_state", z);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJFF(C2344009Gk c2344009Gk, Aweme aweme) {
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJFF(c2344009Gk, aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJI(Bundle bundle, Aweme aweme) {
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJI(bundle, aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIILIIL(boolean z, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (C813960VwQ.LIZ(uri)) {
            C1355510lNV c1355510lNVLIZ = C1355510lNV.LIZ();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            ArrayList<String> arrayList = new ArrayList();
            if (uri != null) {
                String path = uri.getPath();
                if (C813960VwQ.LIZ(uri)) {
                    if (!C2093608Ic.LJ(path) && path.startsWith("/detail/")) {
                        arrayList.add(uri.getLastPathSegment());
                    } else if (!C2093608Ic.LJ(path) && path.startsWith("/detail_list")) {
                        try {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gids");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        int i = 0;
                        if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                            String[] strArrSplit = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.split(",");
                            int length = strArrSplit.length;
                            while (i < length) {
                                arrayList.add(strArrSplit[i]);
                                i++;
                            }
                        } else {
                            try {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "push_params");
                            } catch (Throwable e) {
                            }
                            if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                                try {
                                    String strOptString = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).optString("gids");
                                    if (!C2093608Ic.LJ(strOptString)) {
                                        String[] strArrSplit2 = strOptString.split(",");
                                        int length2 = strArrSplit2.length;
                                        while (i < length2) {
                                            arrayList.add(strArrSplit2[i]);
                                            i++;
                                        }
                                    }
                                } catch (JSONException e2) {
                                } catch (Exception e22) {
                                }
                            }
                        }
                    }
                }
            }
            c1355510lNVLIZ.getClass();
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    C1355520lNW c1355520lNW = new C1355520lNW();
                    c1355520lNW.LIZ = str;
                    synchronized (c1355510lNVLIZ) {
                        try {
                            if (!((ArrayList) c1355510lNVLIZ.LIZ).contains(c1355520lNW)) {
                                ((ArrayList) c1355510lNVLIZ.LIZ).add(c1355520lNW);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(e22);
                        }
                    }
                }
            }
            C1355510lNV.LIZ().getClass();
            try {
                if (C828030We1.LIZ && z) {
                    String lastPathSegment = "";
                    if (uri != null) {
                        String path2 = uri.getPath();
                        if (C813960VwQ.LIZ(uri) && !C2093608Ic.LJ(path2) && path2.startsWith("/detail/")) {
                            lastPathSegment = uri.getLastPathSegment();
                        }
                    }
                    C1393460mMi.LJFF.LIZIZ().LIZ(lastPathSegment);
                }
            } catch (Throwable e222) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJIILLIIL(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        Map<String, Object> mapLJII = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
        if (mapLJII != null) {
            for (Map.Entry<String, Object> entry : mapLJII.entrySet()) {
                abstractC1386130mAt.LJ(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJI(C19EG c19eg, C737030Svd c737030Svd) {
        InterfaceC1017450caF interfaceC1017450caF;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        InterfaceC1566480qrm interfaceC1566480qrm;
        BaseListFragmentPanel baseListFragmentPanelOs;
        InterfaceC1603190roz interfaceC1603190roz;
        if (c737030Svd == null) {
            return;
        }
        C128Y curFragment = null;
        if (!(c19eg instanceof InterfaceC1017450caF) || (interfaceC1017450caF = (InterfaceC1017450caF) c19eg) == null || !interfaceC1017450caF.mainPageOnFeed()) {
            return;
        }
        if ((c19eg instanceof InterfaceC1603190roz) && (interfaceC1603190roz = (InterfaceC1603190roz) c19eg) != null) {
            curFragment = interfaceC1603190roz.getCurFragment();
        }
        if ((curFragment instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment) != null) {
            ComponentCallbacks componentCallbacksUx = interfaceC1593630rZZ.ux();
            if ((componentCallbacksUx instanceof InterfaceC1566480qrm) && (interfaceC1566480qrm = (InterfaceC1566480qrm) componentCallbacksUx) != null && (baseListFragmentPanelOs = interfaceC1566480qrm.Os()) != null) {
                baseListFragmentPanelOs.LLIIL(c737030Svd);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void LJJIIZ(Uri uri, Intent intent, boolean z) {
        C1393430mMf.LIZ.getClass();
        INewUserApi iNewUserApi = (INewUserApi) PluggableExtentionKt.pluggableSpi$default(INewUserApi.class, false, false, false, 14, null);
        if (iNewUserApi != null) {
            iNewUserApi.LIZ();
        }
        if (z) {
            String strLIZJ = C1393430mMf.LIZJ(uri);
            if (strLIZJ != null) {
                ArrayList arrayList = (ArrayList) C1393430mMf.LIZIZ;
                arrayList.add(new Pair("gid", strLIZJ));
                C1393430mMf.LIZJ = strLIZJ;
                arrayList.add(new Pair("push:gid", strLIZJ));
            }
            C1393430mMf.LIZLLL = false;
            C1393430mMf.LIZ(uri, "gids", "gids");
            C1393430mMf.LIZ(uri, "gids", "push:gids");
            C1393430mMf.LIZ(uri, "keyword", "push:keyword");
            C1393430mMf.LIZ(uri, "relation_type", "push:relation_type");
            C1393430mMf.LIZ(uri, "relation_tag", "push:relation_tag");
            ((ArrayList) C1393430mMf.LIZIZ).add(new Pair("push:reflow_timestamp", String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
            try {
                String stringExtra = intent.getStringExtra("message_extra");
                if (stringExtra != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        C1393430mMf.LIZ.getClass();
                        C1393430mMf.LIZIZ("push_type", jSONObject);
                        C1393430mMf.LIZIZ("item_type", jSONObject);
                        C1393430mMf.LIZIZ("author_id", jSONObject);
                        C1393430mMf.LIZIZ("diversity_tier3_tag", jSONObject);
                        C1393430mMf.LIZIZ("hash_tag", jSONObject);
                        C1393430mMf.LIZIZ("group_id", jSONObject);
                        C1393430mMf.LIZIZ("textnet_id", jSONObject);
                        C1393430mMf.LIZIZ("friend_type", jSONObject);
                        C1393430mMf.LIZIZ("relation_type", jSONObject);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        String strLIZJ2 = C1393430mMf.LIZJ(uri);
        if (strLIZJ2 != null || (strLIZJ2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "share_item_id")) != null) {
            ArrayList arrayList2 = (ArrayList) C1393430mMf.LIZIZ;
            arrayList2.add(new Pair("gid", strLIZJ2));
            C1393430mMf.LIZJ = strLIZJ2;
            arrayList2.add(new Pair("sharing:gid", strLIZJ2));
        }
        C1400160mXW.LIZ.getClass();
        C1393430mMf.LIZLLL = C1400160mXW.LIZIZ(uri, "utm_campaign", "client_share");
        C1393430mMf.LIZ(uri, "gids", "gids");
        C1393430mMf.LIZ(uri, "gids", "sharing:gids");
        ((ArrayList) C1393430mMf.LIZIZ).add(new Pair("sharing:reflow_timestamp", String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C1393430mMf.LIZ(uri2, "user_id", "sharing:user_id");
            C1393430mMf.LIZ(uri2, "utm_source", "sharing:utm_source");
            C1393430mMf.LIZ(uri2, "timestamp", "sharing:timestamp");
            C1393430mMf.LIZ(uri2, "region", "sharing:region");
            C1393430mMf.LIZ(uri2, "comment_author_id", "sharing:comment_author_id");
            C1393430mMf.LIZ(uri2, "share_comment_id", "sharing:share_comment_id");
        }
    }
}
