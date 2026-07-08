package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.AbstractC1371000lmU;
import X.AbstractC19891512sD;
import X.AbstractC848400XPy;
import X.C087M;
import X.C08JS;
import X.C098200Yq;
import X.C0M7V;
import X.C0XPD;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1075270e5V;
import X.C1227904rF;
import X.C123100dR;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1374810lsd;
import X.C1376470lvJ;
import X.C1376480lvK;
import X.C1377100lwK;
import X.C1377110lwL;
import X.C1377200lwU;
import X.C1377230lwX;
import X.C1377340lwi;
import X.C1377380lwm;
import X.C1377420lwq;
import X.C1377440lws;
import X.C1377480lww;
import X.C1377850lxX;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C1537480q70;
import X.C1599690rjL;
import X.C1697810uHb;
import X.C189200o6;
import X.C2431009fo;
import X.C259800zU;
import X.C516560KNq;
import X.C621180OYa;
import X.C733420Spo;
import X.C786410Ut5;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC1210010hap;
import X.InterfaceC1364520lc2;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import X.InterfaceC1541990qEH;
import Y.AkS327S0200000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.Base64ImageSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.MultiImageSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareMethod extends BaseBridgeMethod {
    public static final C1377440lws Companion = new Object() { // from class: X.0lws
    };
    public EnumC1051570dTH access;
    public final InterfaceC1541990qEH kitView;
    public final ArrayList<String> mEnableShareLists;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public ShareMethod(C1051660dTQ c1051660dTQ) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        super(c1051660dTQ);
        C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        this.kitView = interfaceC1541990qEHLJIJJ;
        this.mEnableShareLists = new ArrayList<>(Arrays.asList("qrcode", "browser", "refresh"));
        this.name = "share";
        this.access = EnumC1051570dTH.PRIVATE;
    }

    private final void updateShareLists(String str) {
        Collection<? extends String> collection;
        if (TextUtils.isEmpty(str) || (collection = (Collection) GsonProtectorUtils.fromJson(new Gson(), str, new AbstractC19891512sD<List<? extends String>>() { // from class: X.0lwn
        }.getType())) == null) {
            return;
        }
        this.mEnableShareLists.clear();
        this.mEnableShareLists.addAll(collection);
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    public final boolean directlyShare(WeakReference<Context> weakReference, JSONObject jSONObject) {
        return directlyShare(weakReference, jSONObject, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        View viewE1;
        String url;
        WebView webView;
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        InterfaceC1541990qEH interfaceC1541990qEH = this.kitView;
        View viewE12 = null;
        if (interfaceC1541990qEH != null) {
            viewE1 = interfaceC1541990qEH.e1();
        } else {
            viewE1 = null;
        }
        if ((viewE1 instanceof WebView) && (webView = (WebView) viewE1) != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.kitView;
        if (interfaceC1541990qEH2 != null) {
            viewE12 = interfaceC1541990qEH2.e1();
        }
        boolean zDirectlyShare = directlyShare(weakReference, jSONObject, url, jSONObject2, interfaceC1019840ce6, viewE12);
        if (!jSONObject2.has("tricky_flag")) {
            if (!zDirectlyShare) {
                i = -1;
            }
            jSONObject2.put("code", i);
            interfaceC1019840ce6.LIZIZ(jSONObject2);
        }
    }

    public final void postJsEvent(int i, int i2) throws JSONException {
        if (i == 1) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("panel_height", i2);
            jSONObject.put("panel_frame", jSONObject2);
            InterfaceC1541990qEH interfaceC1541990qEH = this.kitView;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ("H5_sharePanelFrame", jSONObject);
            }
        }
    }

    private final void addImChannel(final SharePackage sharePackage, C1371600lnS c1371600lnS, final String str) {
        ShareDependService.LIZ.getClass();
        final ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL(sharePackage, "");
        if (imChannelLJJJIL != null) {
            c1371600lnS.LIZIZ(new AbstractC1371000lmU(imChannelLJJJIL) { // from class: X.0lqr
                @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
                public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
                    return this.doShareImAction(C2214201BlK.LJFF(), sharePackage, str);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getLinkShareResult(SharePackage sharePackage, InterfaceC1369790lkX interfaceC1369790lkX, Context context) {
        return ((Boolean) sharePackage.LJIIZILJ(interfaceC1369790lkX).LJIIJ(new AkS327S0200000_21(context, interfaceC1369790lkX, 2)).LIZLLL()).booleanValue();
    }

    public final boolean doShareImAction(Activity activity, SharePackage sharePackage, String str) {
        if (activity == null) {
            return false;
        }
        C786410Ut5.LJJJI("url_for_im_share", str, sharePackage.extras);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(activity, "", "click_shareim_button", null, null);
            return true;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "share_package", sharePackage);
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().LIZIZ().LJFF(activity, bundle);
        C733420Spo.LIZLLL("chat_merge");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.lang.Object] */
    private final boolean directlyShare(WeakReference<Context> weakReference, final JSONObject jSONObject, String str, final JSONObject jSONObject2, final InterfaceC1019840ce6 interfaceC1019840ce6, View view) throws JSONException {
        final JSONObject jSONObjectOptJSONObject;
        Activity activityLIZ;
        Object c098200Yq;
        String strOptString;
        String strLJI;
        WebShareInfo webShareInfo;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SharePackage sharePackageLIZJ;
        final ShareChannelProtocol shareChannelProtocolLIZJ;
        final SharePanelLogicProtocol sharePanelLogicProtocolLJ;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        Bundle bundle;
        InterfaceC1369790lkX interfaceC1369790lkXLIZ;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (jSONObject == null) {
            return false;
        }
        final String strOptString2 = jSONObject.optString("bizTag");
        final String strOptString3 = jSONObject.optString("bizSceneTag");
        int iOptInt = jSONObject.optInt("businessScene", 0);
        String strOptString4 = jSONObject.optString("title");
        String strOptString5 = jSONObject.optString("desc");
        String strOptString6 = jSONObject.optString("image");
        String strOptString7 = jSONObject.optString("panelMaskColor");
        int iOptInt2 = jSONObject.optInt("disableAppendParam", 0);
        final String strOptString8 = jSONObject.optString("url");
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strOptString8), "u_code") == null) {
            if (iOptInt2 == 0) {
                strOptString8 = UriProtector.parse(strOptString8).buildUpon().appendQueryParameter("u_code", C2431009fo.LJI(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())).build().toString();
            }
        }
        String strOptString9 = jSONObject.optString("innerUrl");
        String strOptString10 = jSONObject.optString("image_path");
        final String strOptString11 = jSONObject.optString("type");
        String strOptString12 = jSONObject.optString("shareitems");
        int iOptInt3 = jSONObject.optInt("hideContacts");
        int iOptInt4 = jSONObject.optInt("hideExternalShare");
        int iOptInt5 = jSONObject.optInt("enableCopyLinkDesc", 1);
        int iOptInt6 = jSONObject.optInt("hidesPanelMask");
        int iOptInt7 = jSONObject.optInt("hideShareItems");
        final int iOptInt8 = jSONObject.optInt("needPanelFrameInfo");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shareChannels");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("shareCustomChannels");
        String strOptString13 = jSONObject.optString("enter_from");
        String strOptString14 = jSONObject.optString("share_item_id");
        String strOptString15 = jSONObject.optString("referral_enter_from");
        String strOptString16 = jSONObject.optString("referral_page_enter_from");
        String strOptString17 = jSONObject.optString("message_type");
        updateShareLists(strOptString12);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("shareEntriesForbidList");
        boolean zOptBoolean = jSONObject.optBoolean("use_origin_link", false);
        List listLIZ = C087M.LIZ(jSONArrayOptJSONArray3);
        String strOptString18 = jSONObject.optString("image_paths", "[]");
        String strOptString19 = jSONObject.optString("share_datasource_scene", "");
        if (jSONObject.has("logArgs")) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("logArgs");
        } else {
            jSONObjectOptJSONObject = null;
        }
        int iOptInt9 = jSONObject.optInt("shareJsbMode");
        String strOptString20 = jSONObject.optString("imageData");
        final C259800zU c259800zU = new C259800zU();
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shareCustomPanel");
        if (jSONObjectOptJSONObject2 != null) {
            c259800zU.element = C08JS.LIZ(C786410Ut5.J3(jSONObjectOptJSONObject2), WebShareInfo.HybridContainerInfo.class);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("forceInsertConv");
        if (strOptString5 == null || strOptString5.length() == 0) {
            strOptString5 = strOptString4;
        }
        String strOptString21 = jSONObject.optString("platform");
        Context context = weakReference.get();
        if (TextUtils.isEmpty(strOptString21) || context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("share_dm_info");
        String strOptString22 = jSONObject.optString("bizTrackParams");
        try {
            c098200Yq = new JSONObject(strOptString22);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject3 = (JSONObject) c098200Yq;
        if (jSONObject3 != null) {
            strOptString = jSONObject3.optString("page_name");
        } else {
            strOptString = null;
        }
        C13DA c13da = new C13DA();
        if (C123100dR.LIZ(strOptString) && strOptString != null) {
            c13da.put("page_name", strOptString);
        }
        Map mapBuild = c13da.build();
        if (!mapBuild.isEmpty()) {
            C1227904rF.LIZ.getClass();
            strLJI = C1227904rF.LJI(mapBuild);
        } else {
            strLJI = null;
        }
        C1377340lwi.LIZ.getClass();
        Pair pairLIZ = C1377340lwi.LIZ(strOptString13, strLJI, jSONObjectOptJSONObject3);
        SendMessageTemplateTask sendMessageTemplateTask = (SendMessageTemplateTask) pairLIZ.getFirst();
        SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask = (SendMessageTemplateDynamicTask) pairLIZ.getSecond();
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJII(view);
        boolean z12 = false;
        c1371600lnS.LIZIZ(new CopyLinkChannel(false));
        C1377200lwU.LIZ(jSONArrayOptJSONArray2, c1371600lnS);
        if (iOptInt3 != 1) {
            z12 = true;
        }
        c1371600lnS.LJJIIJZLJL = z12;
        if (iOptInt9 != 1) {
            if (iOptInt9 != 2) {
                if (iOptInt9 != 3) {
                    C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activityLIZ, true);
                    if (iOptInt3 != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c1371600lnS.LJJIIJZLJL = z11;
                } else {
                    C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activityLIZ, true);
                    if (iOptInt3 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1371600lnS.LJJIIJZLJL = z10;
                }
            } else {
                C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activityLIZ, false);
                List listLJIILJJIL = C1697810uHb.LJIILJJIL("copy", "band");
                if (!C516560KNq.LIZ(activityLIZ, "com.facebook.katana")) {
                    listLJIILJJIL.add("facebook");
                }
                ((ArrayList) c1371600lnS.LJIILL).addAll(C13LP.LLIIJI(listLJIILJJIL));
                c1371600lnS.LJJIIJZLJL = false;
            }
        } else {
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activityLIZ, false);
            boolean z13 = true;
            if (iOptInt3 == 1) {
                z13 = false;
            }
            c1371600lnS.LJJIIJZLJL = z13;
        }
        if (strOptString9 == null || strOptString9.length() == 0) {
            if (str == null) {
                strOptString9 = "";
            } else {
                strOptString9 = str;
            }
        }
        C1376480lvK c1376480lvK = HybridImageSharePackage.Companion;
        WebShareInfo.HybridContainerInfo hybridContainerInfo = (WebShareInfo.HybridContainerInfo) c259800zU.element;
        c1376480lvK.getClass();
        if (C1376480lvK.LIZ(strOptString11, hybridContainerInfo)) {
            if (this.mEnableShareLists.contains("save_image")) {
                c1371600lnS.LIZJ(new C0M7V(strOptString20, strOptString11));
            }
            WebShareInfo.HybridContainerInfo hybridContainerInfo2 = (WebShareInfo.HybridContainerInfo) c259800zU.element;
            if (iOptInt5 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z8);
            if (iOptInt2 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            webShareInfo = new WebShareInfo(iOptInt9, strOptString6, strOptString8, strOptString4, strOptString5, hybridContainerInfo2, boolValueOf, Boolean.valueOf(z9));
        } else {
            Base64ImageSharePackage.Companion.getClass();
            if (C1376470lvJ.LIZIZ(iOptInt9, strOptString11, strOptString20)) {
                c1371600lnS.LIZLLL("copy");
                if (this.mEnableShareLists.contains("save_image")) {
                    c1371600lnS.LIZJ(new C0M7V(strOptString20, strOptString11));
                }
                c1371600lnS.LJJIIJZLJL = false;
                if (iOptInt5 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                if (iOptInt2 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                webShareInfo = new WebShareInfo(strOptString20, strOptString11, iOptInt9, strOptString4, strOptString5, strOptString8, boolValueOf2, Boolean.valueOf(z4));
            } else {
                if (iOptInt5 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                if (iOptInt2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                webShareInfo = new WebShareInfo(strOptString4, strOptString5, strOptString6, strOptString8, (String) null, strOptString10, boolValueOf3, Boolean.valueOf(z2));
            }
        }
        webShareInfo.setEnterFrom(strOptString13);
        webShareInfo.setReferralEnterFrom(strOptString15);
        webShareInfo.setReferralPageEnterFrom(strOptString16);
        webShareInfo.setShareItemId(strOptString14);
        if (C1376480lvK.LIZ(strOptString11, (WebShareInfo.HybridContainerInfo) c259800zU.element)) {
            sharePackageLIZJ = C1376480lvK.LIZIZ(context, webShareInfo, strOptString9, sendMessageTemplateTask, sendMessageTemplateDynamicTask);
            if (iOptInt9 != 2) {
                addImChannel(sharePackageLIZJ, c1371600lnS, strOptString9);
            }
        } else if (TextUtils.equals(strOptString11, "image")) {
            RemoteImageSharePackage.Companion.getClass();
            sharePackageLIZJ = C1377100lwK.LIZ(context, webShareInfo, strOptString6, strOptString9, sendMessageTemplateTask);
            c1371600lnS.LIZJ(new C1377480lww(strOptString6, null, 2));
        } else if (TextUtils.equals(strOptString11, "local_img")) {
            WebSharePackage.Companion.getClass();
            sharePackageLIZJ = C1377230lwX.LIZIZ(context, webShareInfo, strOptString9, sendMessageTemplateTask);
        } else if (TextUtils.equals(strOptString11, "multi_local_img")) {
            List list = (List) GsonProtectorUtils.fromJson(new Gson(), strOptString18, new AbstractC19891512sD<List<? extends String>>() { // from class: X.0lwl
            }.getType());
            MultiImageSharePackage.Companion.getClass();
            sharePackageLIZJ = C1377110lwL.LIZ(context, webShareInfo, list, strOptString9, zOptBoolean, sendMessageTemplateTask);
            c1371600lnS.LIZJ(new C1377480lww(null, list, 1));
            if (!C516560KNq.LIZ(activityLIZ, "com.facebook.katana")) {
                c1371600lnS.LIZLLL("facebook");
            }
        } else {
            Base64ImageSharePackage.Companion.getClass();
            if (C1376470lvJ.LIZIZ(iOptInt9, strOptString11, strOptString20)) {
                sharePackageLIZJ = C1376470lvJ.LIZ(context, webShareInfo, sendMessageTemplateTask);
            } else {
                WebSharePackage.Companion.getClass();
                sharePackageLIZJ = C1377230lwX.LIZJ(context, webShareInfo, strOptString9, zOptBoolean, sendMessageTemplateTask);
                addImChannel(sharePackageLIZJ, c1371600lnS, strOptString9);
            }
        }
        if (!TextUtils.isEmpty(strOptString13)) {
            C786410Ut5.LJJJI("enter_from", strOptString13, sharePackageLIZJ.extras);
        }
        if (!TextUtils.isEmpty(strOptString19)) {
            C786410Ut5.LJJJI("share_datasource_scene", strOptString19, sharePackageLIZJ.extras);
        }
        if (!TextUtils.isEmpty(strOptString17)) {
            C786410Ut5.LJJJI("message_type", strOptString17, sharePackageLIZJ.extras);
        }
        if (C123100dR.LIZ(strOptString22) && strOptString22 != null) {
            C786410Ut5.LJJJI("bizTrackParams", strOptString22, sharePackageLIZJ.extras);
        }
        if (C123100dR.LIZ(strOptString2) && strOptString2 != null) {
            C786410Ut5.LJJJI("bizTag", strOptString2, sharePackageLIZJ.extras);
        }
        if (jSONArrayOptJSONArray4 != null) {
            C786410Ut5.LJJJI("force_insert_conv", jSONArrayOptJSONArray4.toString(), sharePackageLIZJ.extras);
        }
        if (strOptString != null) {
            C786410Ut5.LJJJI("page_name", strOptString, sharePackageLIZJ.extras);
        }
        if (iOptInt > 0) {
            if (iOptInt <= 10000) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ("Invalid Params");
                c1389890mGx.LJIIJJI();
                return false;
            }
            sharePackageLIZJ.extras.putInt("web_biz_scene_num", iOptInt);
        }
        ShareConfiguration<BaseSharePackage> shareConfigurationLJJI = C621180OYa.LIZ.LJJI(new C1377380lwm(strOptString13, C13LE.LIZ(sharePackageLIZJ.getClass())));
        if (shareConfigurationLJJI != null) {
            shareChannelProtocolLIZJ = shareConfigurationLJJI.LIZJ(activityLIZ, sharePackageLIZJ);
            sharePanelLogicProtocolLJ = shareConfigurationLJJI.LJ(sharePackageLIZJ);
            if (shareChannelProtocolLIZJ != null) {
                String strJv0 = shareChannelProtocolLIZJ.jv0();
                Drawable drawableDC = shareChannelProtocolLIZJ.DC();
                if (C123100dR.LIZ(strJv0)) {
                    c1371600lnS.LJJJLL = strJv0;
                }
                if (drawableDC != null) {
                    c1371600lnS.LJJJJZI = drawableDC;
                }
            }
        } else {
            shareChannelProtocolLIZJ = null;
            sharePanelLogicProtocolLJ = null;
        }
        if (this.mEnableShareLists.contains("refresh")) {
            c1371600lnS.LIZJ(new InterfaceC1370310llN() { // from class: X.0har
                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return R.raw.icon_2pt_arrow_clockwise;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return R.raw.icon_2pt_arrow_clockwise;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view2, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view2, int i2) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context2, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return R.string.rvr;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "refresh";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context2, BaseSharePackage baseSharePackage) {
                    InterfaceC1541990qEH interfaceC1541990qEH = this.LL.kitView;
                    if (interfaceC1541990qEH != null) {
                        interfaceC1541990qEH.reload();
                    }
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view2, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view2, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context2, baseSharePackage, this);
                }
            });
        }
        if (this.mEnableShareLists.contains("browser")) {
            c1371600lnS.LIZJ(new C1075270e5V());
        }
        if (this.mEnableShareLists.contains("copylink")) {
            c1371600lnS.LIZJ(new C1377850lxX("fromWeb", false, 6));
        }
        InterfaceC1210010hap.LIZ.getClass();
        final InterfaceC1210010hap interfaceC1210010hap = (InterfaceC1210010hap) PluggableExtentionKt.pluggableSpi$default(InterfaceC1210010hap.class, false, false, false, 14, null);
        if (interfaceC1210010hap != null && interfaceC1210010hap.LIZIZ()) {
            c1371600lnS.LIZJ(new InterfaceC1370310llN() { // from class: X.0hao
                @Override // X.InterfaceC1370310llN
                public final float LIZLLL() {
                    return -1.0f;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJI() {
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIIZI(View view2, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJIJ(ImageView imageView, View view2, int i2) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJIL() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String LJJIZ() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJI(Context context2, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJI(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1370310llN
                public final Integer LJJJJIZL() {
                    return null;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJJL() {
                    return false;
                }

                @Override // X.InterfaceC1370450llb
                public final int LJJJJLI() {
                    return 100;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJJLZIJ() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean LJJLIIIJL() {
                    return false;
                }

                @Override // X.InterfaceC1370310llN
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1370310llN
                public final String key() {
                    return "boost_debug";
                }

                @Override // X.InterfaceC1370310llN
                public final String label() {
                    return "";
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIIIZZ() {
                    return interfaceC1210010hap.LIZJ();
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJLIIIJJIZ() {
                    return interfaceC1210010hap.LIZ();
                }

                @Override // X.InterfaceC1370310llN
                public final int LJII() {
                    return LJIIIIZZ();
                }

                @Override // X.InterfaceC1370310llN
                public final int LJIIJJI() {
                    return !enable() ? 1 : 0;
                }

                @Override // X.InterfaceC1370310llN
                public final C0M7Z LJIIJ() {
                    return C0M7Z.ShareButton;
                }

                @Override // X.InterfaceC1370310llN
                public final EnumC1216710hld LJJJZ() {
                    return EnumC1216710hld.NORMAL;
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIJJ(TextView textView) {
                    C1370320llO.LJ(this, textView);
                }

                @Override // X.InterfaceC1370310llN
                public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                    return C1370320llO.LIZJ(enumC1369720lkQ);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJIILIIL(Context context2, BaseSharePackage baseSharePackage) {
                    interfaceC1210010hap.LIZLLL();
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJJJLL(View view2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZ(this, view2, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIIJ(View view2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZIZ(this, view2, baseSharePackage);
                }

                @Override // X.InterfaceC1370310llN
                public final void LJJLIIIJILLIZJL(Context context2, BaseSharePackage baseSharePackage) {
                    C1370320llO.LIZLLL(context2, baseSharePackage, this);
                }
            });
        }
        Iterator it2 = ((ArrayList) listLIZ).iterator();
        while (it2.hasNext()) {
            c1371600lnS.LIZLLL((String) it2.next());
        }
        c1371600lnS.LJJIIJ = sharePackageLIZJ;
        if (!TextUtils.equals(strOptString21, "share_native")) {
            if (C621180OYa.LIZIZ.LJLIIIL().contains(strOptString21)) {
                interfaceC1369790lkXLIZ = C621180OYa.LIZIZ.LJJLIIIJ().get(strOptString21);
                if (interfaceC1369790lkXLIZ == null) {
                    return false;
                }
            } else {
                interfaceC1369790lkXLIZ = C1374810lsd.LIZ(strOptString21, activityLIZ, null, 4);
                if (interfaceC1369790lkXLIZ == null) {
                    return false;
                }
            }
            return getLinkShareResult(sharePackageLIZJ, interfaceC1369790lkXLIZ, context);
        }
        if (jSONObject2 != null) {
            jSONObject2.put("tricky_flag", "tricky_flag");
        }
        if (iOptInt6 == 1) {
            i = R.style.aca;
        } else {
            i = R.style.ac5;
        }
        c1371600lnS.LJJIZ = new InterfaceC1364520lc2() { // from class: X.0lwh
            @Override // X.InterfaceC1364520lc2
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJII(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJJI(BaseSharePackage baseSharePackage, String str2) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIILIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIIZZ(BaseSharePackage baseSharePackage) throws JSONException {
                if (Intrinsics.LJFF(baseSharePackage.extras.getString("share_platform"), "chat_merge")) {
                    JSONObject jSONObject4 = jSONObject2;
                    if (jSONObject4 != null) {
                        jSONObject4.put("share_code", 1);
                    }
                    JSONObject jSONObject5 = jSONObject2;
                    if (jSONObject5 != null) {
                        jSONObject5.put("share_channel", baseSharePackage.extras.getString("share_platform"));
                    }
                    InterfaceC1019840ce6 interfaceC1019840ce62 = interfaceC1019840ce6;
                    if (interfaceC1019840ce62 != null) {
                        interfaceC1019840ce62.LIZIZ(jSONObject2);
                    }
                }
            }
        };
        c1371600lnS.LJJIL = new InterfaceC1366490lfD() { // from class: X.0lwe
            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context2, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context2, BaseSharePackage baseSharePackage, List list2) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context2, BaseSharePackage baseSharePackage) {
                InterfaceC1371860lns interfaceC1371860lnsLK0;
                ShareChannelProtocol shareChannelProtocol = shareChannelProtocolLIZJ;
                if (shareChannelProtocol != null && (interfaceC1371860lnsLK0 = shareChannelProtocol.LK0()) != null) {
                    interfaceC1371860lnsLK0.LIZJ();
                }
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context2, BaseSharePackage baseSharePackage) {
                try {
                    JSONObject jSONObject4 = jSONObject2;
                    if (jSONObject4 != null) {
                        jSONObject4.put("code", 0);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context2, BaseSharePackage baseSharePackage) throws JSONException {
                boolean z14;
                AwS565S0100000_21 awS565S0100000_21;
                String string = baseSharePackage.extras.getString("share_platform");
                if (string != null && string.length() != 0) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14) {
                    JSONObject jSONObject4 = jSONObject2;
                    if (jSONObject4 != null) {
                        jSONObject4.put("share_code", 0);
                    }
                    JSONObject jSONObject5 = jSONObject2;
                    if (jSONObject5 != null) {
                        jSONObject5.put("button", "cancel");
                    }
                    InterfaceC1019840ce6 interfaceC1019840ce62 = interfaceC1019840ce6;
                    if (interfaceC1019840ce62 != null) {
                        interfaceC1019840ce62.LIZIZ(jSONObject2);
                    }
                } else if (Intrinsics.LJFF(baseSharePackage.extras.getString("share_platform"), "chat_more")) {
                    JSONObject jSONObject6 = jSONObject2;
                    if (jSONObject6 != null) {
                        jSONObject6.put("share_code", 1);
                    }
                    JSONObject jSONObject7 = jSONObject2;
                    if (jSONObject7 != null) {
                        jSONObject7.put("share_channel", baseSharePackage.extras.getString("share_platform"));
                    }
                    InterfaceC1019840ce6 interfaceC1019840ce63 = interfaceC1019840ce6;
                    if (interfaceC1019840ce63 != null) {
                        interfaceC1019840ce63.LIZIZ(jSONObject2);
                    }
                }
                C1376480lvK c1376480lvK2 = HybridImageSharePackage.Companion;
                String str2 = strOptString11;
                WebShareInfo.HybridContainerInfo hybridContainerInfo3 = c259800zU.element;
                c1376480lvK2.getClass();
                if (C1376480lvK.LIZ(str2, hybridContainerInfo3) && (awS565S0100000_21 = C1377420lwq.LJIIIIZZ) != null) {
                    awS565S0100000_21.invoke();
                }
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view2, C1371590lnR c1371590lnR, C1370190llB c1370190llB) throws JSONException {
                InterfaceC1366490lfD interfaceC1366490lfDT72;
                C1376480lvK c1376480lvK2 = HybridImageSharePackage.Companion;
                String str2 = strOptString11;
                WebShareInfo.HybridContainerInfo hybridContainerInfo3 = c259800zU.element;
                c1376480lvK2.getClass();
                if (C1376480lvK.LIZ(str2, hybridContainerInfo3)) {
                    C1377310lwf c1377310lwf = C1377420lwq.LJII;
                    if (c1377310lwf != null) {
                        c1377310lwf.invoke(view2, Integer.valueOf(c1370190llB.LIZ));
                    }
                } else {
                    C1377320lwg c1377320lwg = C1377320lwg.LIZ;
                    String str3 = strOptString2;
                    String str4 = strOptString3;
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    c1377320lwg.getClass();
                    C1377320lwg.LIZIZ(str3, str4, "webview", strJ3);
                    this.postJsEvent(iOptInt8, c1370190llB.LIZ);
                }
                SharePanelLogicProtocol sharePanelLogicProtocol = sharePanelLogicProtocolLJ;
                if (sharePanelLogicProtocol != null && (interfaceC1366490lfDT72 = sharePanelLogicProtocol.T72()) != null) {
                    interfaceC1366490lfDT72.LIZJ(view2, c1371590lnR, c1370190llB);
                }
            }

            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z14, BaseSharePackage baseSharePackage, Context context2) throws JSONException {
                InterfaceC1371860lns interfaceC1371860lnsLK0;
                String str2;
                if (jSONObjectOptJSONObject != null) {
                    MobClick mobClickObtain = MobClick.obtain();
                    mobClickObtain.setEventName(jSONObjectOptJSONObject.optString("tag"));
                    mobClickObtain.setLabelName(interfaceC1369790lkX.key());
                    mobClickObtain.setValue(jSONObjectOptJSONObject.optString("value"));
                    mobClickObtain.setJsonObject(jSONObjectOptJSONObject.optJSONObject("extras"));
                    C20684815ws.onEvent(mobClickObtain);
                }
                if (z14) {
                    String str3 = strOptString8;
                    if (baseSharePackage != null && (baseSharePackage instanceof HybridImageSharePackage)) {
                        HybridImageSharePackage hybridImageSharePackage = (HybridImageSharePackage) baseSharePackage;
                        str2 = "";
                        if (hybridImageSharePackage.shareMode == 2) {
                            str3 = "";
                        }
                        C1377320lwg.LIZ.getClass();
                        String str4 = C1377320lwg.LIZIZ.get(Integer.valueOf(hybridImageSharePackage.shareMode));
                        if (str4 != null) {
                            str2 = str4;
                        }
                    } else {
                        str2 = "url_form";
                    }
                    C1377320lwg c1377320lwg = C1377320lwg.LIZ;
                    String str5 = strOptString2;
                    String str6 = strOptString3;
                    String strKey = interfaceC1369790lkX.key();
                    c1377320lwg.getClass();
                    C1377320lwg.LIZ(str5, str6, "lynx", strKey, str2, str3);
                    JSONObject jSONObject4 = jSONObject2;
                    if (jSONObject4 != null) {
                        jSONObject4.put("share_code", 1);
                    }
                } else {
                    JSONObject jSONObject5 = jSONObject2;
                    if (jSONObject5 != null) {
                        jSONObject5.put("share_code", 0);
                    }
                }
                ShareChannelProtocol shareChannelProtocol = shareChannelProtocolLIZJ;
                if (shareChannelProtocol != null && (interfaceC1371860lnsLK0 = shareChannelProtocol.LK0()) != null) {
                    interfaceC1371860lnsLK0.LIZ(interfaceC1369790lkX, z14, baseSharePackage, context2);
                }
                JSONObject jSONObject6 = jSONObject2;
                if (jSONObject6 != null) {
                    jSONObject6.put("button", interfaceC1369790lkX.key());
                }
                InterfaceC1019840ce6 interfaceC1019840ce62 = interfaceC1019840ce6;
                if (interfaceC1019840ce62 != null) {
                    interfaceC1019840ce62.LIZIZ(jSONObject2);
                }
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context2, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                InterfaceC1366490lfD interfaceC1366490lfDT72;
                SharePanelLogicProtocol sharePanelLogicProtocol = sharePanelLogicProtocolLJ;
                if (sharePanelLogicProtocol != null && (interfaceC1366490lfDT72 = sharePanelLogicProtocol.T72()) != null) {
                    Object objLJII = interfaceC1366490lfDT72.LJII(context2, baseSharePackage, interfaceC1369790lkX, interfaceC1364105Vn);
                    if (objLJII == C099R.LJFF()) {
                        return objLJII;
                    }
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
        };
        if (iOptInt7 == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        c1371600lnS.LJJJJI = z5;
        if (iOptInt6 != 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        c1371600lnS.LJJJJJL = z6;
        c1371600lnS.LJJJJL = strOptString7;
        C1377200lwU.LIZLLL(jSONArrayOptJSONArray, c1371600lnS);
        if (iOptInt4 == 1) {
            c1371600lnS.LJIILLIIL = true;
        }
        ShareExtService shareExtService = C621180OYa.LIZIZ;
        if (iOptInt3 != 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        shareExtService.LJJIIZ(c1371600lnS, z7);
        C1376480lvK c1376480lvK2 = HybridImageSharePackage.Companion;
        WebShareInfo.HybridContainerInfo hybridContainerInfo3 = (WebShareInfo.HybridContainerInfo) c259800zU.element;
        c1376480lvK2.getClass();
        if (C1376480lvK.LIZ(strOptString11, hybridContainerInfo3)) {
            BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                bundle.putInt("referral_panel_style", i);
                bundle.putInt("need_pane_frame_info", iOptInt8);
                C786410Ut5.LJJJI("biz_tag", strOptString2, bundle);
                C786410Ut5.LJJJI("biz_scene_tag", strOptString3, bundle);
                C786410Ut5.LJJJI("page_type", "webview", bundle);
                C786410Ut5.LJJJI("params", C786410Ut5.J3(jSONObject), bundle);
            }
            new C1377420lwq(activityLIZ, null, this.kitView, c1371600lnS).LIZ();
            return true;
        }
        C1371590lnR c1371590lnR = new C1371590lnR(c1371600lnS);
        ShareDependService.LIZ.getClass();
        ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
        Integer.valueOf(i);
        shareDependServiceLJJJJI.LJII(activityLIZ, c1371590lnR, null);
        return true;
    }
}
