package com.ss.android.ugc.gamora.editorpro.creationflow.scheme;

import X.C0MUM;
import X.C0MVZ;
import X.C14DK;
import X.C14DT;
import X.C14DU;
import X.C19719612Di;
import X.C1976907ol;
import X.C2188811AlT;
import X.C2241308qJ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import com.ss.android.ugc.aweme.tools.IReplaceMusicWithMovieHelperService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class EditorProUriRootHandler extends C14DU implements IInterceptor {
    public final Set<C14DU> LLILLJJLI;
    public final C2241308qJ LLILLL;

    @Override // X.C14DU
    public final boolean LIZ(String str) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.08qJ] */
    public EditorProUriRootHandler() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LLILLJJLI = linkedHashSet;
        C19719612Di.LJJII(this.LL, new C0MVZ[]{new C0MVZ() { // from class: X.14Da
            @Override // X.C0MVZ
            public final void LIZ(Context context, RouteIntent routeIntent, C14DZ c14dz) {
                if (a0.LJJJIL(C0MUM.LIZ(routeIntent))) {
                    c14dz.LIZ(new C1897107bt(400, routeIntent, "The required field \"scene\" is empty."));
                } else {
                    c14dz.LIZIZ();
                }
            }
        }, new C0MVZ() { // from class: X.14DY
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C0MVZ
            public final void LIZ(Context context, RouteIntent routeIntent, C14DZ c14dz) {
                String strLIZ = C0MUM.LIZ(routeIntent);
                switch (strLIZ.hashCode()) {
                    case -2135285342:
                        if (strLIZ.equals("open_captions")) {
                        }
                        c14dz.LIZIZ();
                    case 982374617:
                        if (strLIZ.equals("open_ai_image")) {
                        }
                        c14dz.LIZIZ();
                    case 994264057:
                        if (strLIZ.equals("open_ai_video")) {
                        }
                        c14dz.LIZIZ();
                    case 1284582254:
                        if (strLIZ.equals("open_ep_magic")) {
                        }
                        c14dz.LIZIZ();
                    case 1544803905:
                        if (strLIZ.equals("default")) {
                        }
                        c14dz.LIZIZ();
                    default:
                        c14dz.LIZIZ();
                }
                if (C0CHQ.LIZ().getAccountService().LIZ()) {
                    c14dz.LIZ(new C1897107bt(402, routeIntent, "disallow by account: child mode"));
                    return;
                }
                c14dz.LIZIZ();
            }
        }, new C0MVZ() { // from class: X.0MWJ
            @Override // X.C0MVZ
            public final void LIZ(Context context, RouteIntent routeIntent, C14DZ c14dz) {
                C198H c198hLC;
                if (C0MUM.LIZIZ(routeIntent) && !C0BTN.LIZ()) {
                    Activity[] activityArrLIZ = C19713312Ax.LIZ();
                    if (activityArrLIZ != null) {
                        for (Activity activity : activityArrLIZ) {
                            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                            if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null) {
                                C0MWI c0mwiLJIJJ = C0CHQ.LIZ().LJIJJ();
                                if (c0mwiLJIJJ.LIZ(c198hLC) || c0mwiLJIJJ.LJIILIIL(c198hLC) || c0mwiLJIJJ.LJIILL(c198hLC) || c0mwiLJIJJ.LIZIZ(c198hLC)) {
                                    interfaceC20597015iiLIZJ.finish();
                                    C20622515mp.LIZ(activity, 0);
                                }
                            }
                        }
                    }
                    c14dz.LIZIZ();
                    return;
                }
                c14dz.LIZIZ();
            }
        }});
        C19719612Di.LJJII(linkedHashSet, new C14DU[]{new C14DU() { // from class: X.14DV
            public static final Set<String> LLILLJJLI = C093Y.LJ("default", "open_captions", "open_ep_magic", "open_lyric_effect");

            {
                C19719612Di.LJJII(this.LL, new C0MVZ[]{new C0MVZ() { // from class: X.14DW
                    public static void LIZIZ(Context context, RouteIntent routeIntent, C14DZ c14dz) {
                        if (C338630DPh.LIZ()) {
                            c14dz.LIZIZ();
                            return;
                        }
                        c14dz.LIZ(new C1896807bq(routeIntent));
                        String strLIZJ = C0MUM.LIZJ(routeIntent, "shoot_way");
                        if (strLIZJ == null) {
                            if (C0MUM.LIZIZ(routeIntent)) {
                                strLIZJ = "ep_deeplink";
                            } else {
                                strLIZJ = "scheme";
                            }
                        }
                        Uri.Builder builderAuthority = new Uri.Builder().scheme("aweme").authority("openShoot");
                        String strLIZJ2 = C0MUM.LIZJ(routeIntent, "enter_from");
                        if (strLIZJ2 == null) {
                            strLIZJ2 = "";
                        }
                        SmartRouter.buildRoute(context, builderAuthority.appendQueryParameter("enter_from", strLIZJ2).appendQueryParameter("shoot_way", strLIZJ).appendQueryParameter("intercept_background", CardStruct.IStatusCode.DEFAULT).build().toString()).open();
                    }

                    @Override // X.C0MVZ
                    public final void LIZ(Context context, RouteIntent routeIntent, C14DZ c14dz) {
                        String strLIZ = C0MUM.LIZ(routeIntent);
                        int iHashCode = strLIZ.hashCode();
                        if (iHashCode != -2135285342) {
                            if (iHashCode != 1284582254) {
                                if (iHashCode == 1544803905 && strLIZ.equals("default")) {
                                    LIZIZ(context, routeIntent, c14dz);
                                    return;
                                }
                            } else if (strLIZ.equals("open_ep_magic")) {
                                LIZIZ(context, routeIntent, c14dz);
                                return;
                            }
                        } else if (strLIZ.equals("open_captions")) {
                            if (!((Boolean) C273580Ans.LIZ.getValue()).booleanValue() || !C0MUM.LIZIZ(routeIntent)) {
                                C391040FUw.LIZ.getClass();
                                Keva keva = C391040FUw.LIZIZ;
                                if (!keva.getBoolean("text_caption_landing_page_show", false)) {
                                    c14dz.LIZ(new C1896807bq(routeIntent));
                                    keva.storeBoolean("text_caption_landing_page_show", true);
                                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//studio/editor_pro_anchor_guide");
                                    smartRouteBuildRoute.withParam("prev_url", routeIntent.getUrl());
                                    smartRouteBuildRoute.open();
                                    return;
                                }
                            }
                            c14dz.LIZIZ();
                            return;
                        }
                        c14dz.LIZIZ();
                    }
                }, new C0MVZ() { // from class: X.0MU0
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:108:0x04b8  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x04ba  */
                    /* JADX WARN: Removed duplicated region for block: B:113:0x04d6  */
                    /* JADX WARN: Removed duplicated region for block: B:133:0x0545  */
                    /* JADX WARN: Removed duplicated region for block: B:141:0x053a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x044d  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x045c  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x046c  */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x0471  */
                    @Override // X.C0MVZ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.content.Context r253, com.bytedance.router.RouteIntent r254, X.C14DZ r255) throws org.json.JSONException {
                        /*
                            Method dump skipped, instruction units count: 1430
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0MU0.LIZ(android.content.Context, com.bytedance.router.RouteIntent, X.14DZ):void");
                    }
                }});
            }

            @Override // X.C14DU
            public final boolean LIZ(String str) {
                return LLILLJJLI.contains(str);
            }

            @Override // X.C14DU
            public final void LIZIZ(Context context, RouteIntent routeIntent, C14DK c14dk) {
                Bundle bundleG3;
                Intent extra = routeIntent.getExtra();
                if (extra != null && (bundleG3 = C786410Ut5.g3(extra, "album_bundle_page_data")) != null) {
                    CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                    if (creativeToolsPluginService != null && !creativeToolsPluginService.LIZJ(context, "AlbumEditorProUriHandler.handleUriInternal", true)) {
                        c14dk.LIZ(new C1897107bt(406, routeIntent, "ve plugin not ready"));
                        return;
                    } else {
                        C0MWH.LIZLLL(context, bundleG3, 1, null);
                        c14dk.LIZ(new C1896907br(routeIntent));
                        return;
                    }
                }
                c14dk.LIZ(new C1897107bt(401, routeIntent, "album bundle null"));
            }
        }, new C14DU() { // from class: X.14DI
            public static final Set<String> LLILLJJLI = C093Y.LJ("change_ban_music");

            @Override // X.C14DU
            public final boolean LIZ(String str) {
                return LLILLJJLI.contains(str);
            }

            @Override // X.C14DU
            public final void LIZIZ(Context context, RouteIntent routeIntent, C14DK c14dk) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                IReplaceMusicWithMovieHelperService replaceMusicWithMovieHelper;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                Uri uri = routeIntent.getUri();
                Activity activityLIZIZ = null;
                if (uri != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aweme_id");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                Uri uri2 = routeIntent.getUri();
                String str = "";
                if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "enter_from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                Uri uri3 = routeIntent.getUri();
                if (uri3 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "enter_method")) != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    Activity activityLIZ = C06MM.LIZ(context);
                    if (activityLIZ == null) {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null) {
                            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                        }
                        activityLIZ = C06MM.LIZ(activityLIZIZ);
                        if (activityLIZ == null) {
                            c14dk.LIZ(new C1897107bt(403, routeIntent, "underlying activity is needed"));
                            return;
                        }
                    }
                    Object objLIZ = C04TD.LIZ(IReplaceMusicWithMovieHelperService.class, false);
                    if (objLIZ != null) {
                        replaceMusicWithMovieHelper = (IReplaceMusicWithMovieHelperService) objLIZ;
                    } else {
                        replaceMusicWithMovieHelper = new ReplaceMusicWithMovieHelper();
                    }
                    replaceMusicWithMovieHelper.LIZ(activityLIZ, new C1510705vl(EnumC20226614Ci.EDITOR_PRO, false));
                    replaceMusicWithMovieHelper.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, str);
                }
            }
        }, new C14DU() { // from class: X.14DX
            public static final Set<String> LLILLJJLI = C093Y.LJ("open_ai_image", "open_ai_video");

            @Override // X.C14DU
            public final boolean LIZ(String str) {
                return LLILLJJLI.contains(str);
            }

            @Override // X.C14DU
            public final void LIZIZ(Context context, RouteIntent routeIntent, C14DK c14dk) {
                boolean z = true;
                if (C286460BKq.LIZ() && C286470BKr.LIZ()) {
                    String strLIZ = C0MUM.LIZ(routeIntent);
                    String strLIZJ = C0MUM.LIZJ(routeIntent, "enter_source");
                    if (strLIZJ != null && strLIZJ.length() != 0) {
                        z = false;
                    }
                    if (z) {
                        strLIZJ = "ep_ai_link";
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//editor_pro/loading");
                    smartRouteBuildRoute.withParam("type", "ep_ai_link");
                    smartRouteBuildRoute.withParam("ep_ai_scene", strLIZ);
                    smartRouteBuildRoute.withParam("ep_ai_enter_source", strLIZJ);
                    smartRouteBuildRoute.open();
                    c14dk.LIZ(new C1896907br(routeIntent));
                    return;
                }
                c14dk.LIZ(new C1897107bt(405, routeIntent, "AB_SWITCH_ERROR"));
            }
        }});
        this.LLILLL = new C14DK() { // from class: X.08qJ
            @Override // X.C14DK
            public final void LIZIZ() {
            }

            @Override // X.C14DK
            public final void LIZ(AbstractC1897007bs abstractC1897007bs) {
                Bundle extras;
                boolean z;
                RouteIntent routeIntent = abstractC1897007bs.LIZ;
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("open url: ");
                sbLIZ.append(routeIntent.getUrl());
                sbLIZ.append(" params: ");
                Intent extra = routeIntent.getExtra();
                if (extra != null) {
                    try {
                        extras = extra.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                } else {
                    extras = null;
                }
                sbLIZ.append(extras);
                sbLIZ.append(", is success: ");
                if (!(abstractC1897007bs instanceof C1896907br) && !(abstractC1897007bs instanceof C1896807bq)) {
                    z = false;
                } else {
                    z = true;
                }
                sbLIZ.append(z);
                sbLIZ.append(" result: ");
                sbLIZ.append(abstractC1897007bs);
                C201955140j.LJIILJJIL(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "studio/editor_pro");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context == null || routeIntent == null) {
            return false;
        }
        LIZJ(((ArrayList) this.LL).iterator(), context, routeIntent, new C14DT(this, context, routeIntent, this.LLILLL));
        return true;
    }

    @Override // X.C14DU
    public final void LIZIZ(Context context, RouteIntent routeIntent, C14DK c14dk) {
        for (C14DU c14du : this.LLILLJJLI) {
            if (c14du.LIZ(C0MUM.LIZ(routeIntent))) {
                c14du.LIZJ(((ArrayList) c14du.LL).iterator(), context, routeIntent, new C14DT(c14du, context, routeIntent, c14dk));
                return;
            }
        }
    }
}
