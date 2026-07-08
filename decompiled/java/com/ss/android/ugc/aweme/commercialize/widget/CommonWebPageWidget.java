package com.ss.android.ugc.aweme.commercialize.widget;

import X.C0RD4;
import X.C1025210cml;
import X.C1025890cnr;
import X.C1025930cnv;
import X.C1025960cny;
import X.C1483410ohn;
import X.C1976907ol;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C497820Jfg;
import X.C703302op;
import X.C735370Ssx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C828330WeV;
import X.C989830brh;
import X.C989840bri;
import X.C989860brk;
import X.C990230bsL;
import X.C990240bsM;
import X.InterfaceC1025940cnw;
import X.InterfaceC828360WeY;
import X.InterfaceC989850brj;
import X.InterfaceC990250bsN;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommonWebPageWidget extends AbsAdFeedWidget {
    public static boolean LLJJI;
    public C1025890cnr LLJIJIL;
    public long LLJILJIL;
    public final C989830brh LLJILJILJ = new InterfaceC1025940cnw() { // from class: X.0brh
        @Override // X.InterfaceC1025940cnw
        public final void LJJJIL() {
            if (CommonWebPageWidget.LLJJI) {
                C1483410ohn.LJLJJI().LJIILLIIL();
                CommonWebPageWidget.LLJJI = false;
            }
            CommonWebPageWidget commonWebPageWidget = this.LIZ;
            commonWebPageWidget.getClass();
            C1440005kM.LIZ(new C989800bre(false));
            DataCenter dataCenter = commonWebPageWidget.LLILZ;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "on_ad_pop_up_web_page_hide");
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - commonWebPageWidget.LLJILJIL;
            if (commonWebPageWidget.LLJIJIL != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
            }
        }

        @Override // X.InterfaceC1025940cnw
        public final void onShow() {
            CommonWebPageWidget commonWebPageWidget = this.LIZ;
            commonWebPageWidget.getClass();
            C1440005kM.LIZ(new C989800bre(true));
            DataCenter dataCenter = commonWebPageWidget.LLILZ;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "on_ad_pop_up_web_page_show");
            }
            commonWebPageWidget.LLJILJIL = System.currentTimeMillis();
        }
    };
    public final C989840bri LLJILLL = new InterfaceC989850brj() { // from class: X.0bri
        @Override // X.InterfaceC989850brj
        public final void LIZ() {
            if (CommonWebPageWidget.LLJJI) {
                C1483410ohn.LJLJJI().LJIILLIIL();
                CommonWebPageWidget.LLJJI = false;
            }
        }
    };
    public final C990240bsM LLJJ = new InterfaceC990250bsN() { // from class: X.0bsM
        @Override // X.InterfaceC990250bsN
        public final void onBackPress() {
        }
    };

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void LJIILL() {
        super.LJIILL();
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
            dataCenter.yQ2("ad_video_on_resume_play", this, false);
            dataCenter.yQ2("video_params", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        WeakReference<CommonWebPageWidget> weakReference = C990230bsL.LIZ;
        C990230bsL.LIZ = new WeakReference<>(this);
        if (C990230bsL.LIZIZ) {
            return;
        }
        SmartRouter.addInterceptor(new IInterceptor() { // from class: com.ss.android.ugc.aweme.commercialize.widget.OverlaySchemaProxy$setCurrentWidget$1
            @Override // com.bytedance.router.interceptor.IInterceptor
            public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
                return C1976907ol.LIZ(this, routeIntent);
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean matchInterceptRules(RouteIntent routeIntent) {
                String host;
                if (routeIntent != null) {
                    host = routeIntent.getHost();
                } else {
                    host = null;
                }
                if (Intrinsics.LJFF(host, "overlay_webview") && C990230bsL.LIZ.get() != null) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
                String originUrl;
                Bundle extras;
                String aid;
                C19EG activity;
                Fragment fragment;
                Context context2;
                String authorUid;
                Intent extra;
                if (routeIntent != null) {
                    originUrl = routeIntent.getOriginUrl();
                } else {
                    originUrl = null;
                }
                if (!C703302op.LIZ(originUrl)) {
                    originUrl = null;
                }
                if (originUrl == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(originUrl), "url");
                if (!C703302op.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    return false;
                }
                final HashMap map = new HashMap();
                if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                    try {
                        extras = extra.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        extras = null;
                    }
                } else {
                    extras = null;
                }
                String str = "";
                if (extras != null) {
                    for (String str2 : extras.keySet()) {
                        String string = extras.getString(str2);
                        if (string == null) {
                            string = "";
                        }
                        map.put(str2, string);
                    }
                }
                CommonWebPageWidget commonWebPageWidget = C990230bsL.LIZ.get();
                if (commonWebPageWidget != null) {
                    String str3 = commonWebPageWidget.LLJI;
                    if (str3 == null) {
                        str3 = "";
                    }
                    map.put("enter_from", str3);
                    Aweme aweme = commonWebPageWidget.LLIZLLLIL;
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    map.put("group_id", aid);
                    Aweme aweme2 = commonWebPageWidget.LLIZLLLIL;
                    if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
                        str = authorUid;
                    }
                    map.put("author_id", str);
                    map.put("music_id", C735370Ssx.LJIIL(commonWebPageWidget.LLIZLLLIL).toString());
                    Fragment fragment2 = commonWebPageWidget.LLJ;
                    if (fragment2 != null && (activity = fragment2.getActivity()) != null && (fragment = commonWebPageWidget.LLJ) != null && (context2 = fragment.getContext()) != null) {
                        C1025210cml c1025210cml = new C1025210cml();
                        c1025210cml.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        c1025210cml.LJ = commonWebPageWidget.LLJ;
                        c1025210cml.LIZIZ = C814420VxA.LIZ(C497820Jfg.LIZJ(context2));
                        c1025210cml.LIZJ = new Bundle();
                        C1025930cnv c1025930cnvLIZ = c1025210cml.LIZ();
                        C989830brh c989830brh = commonWebPageWidget.LLJILJILJ;
                        C990240bsM c990240bsM = commonWebPageWidget.LLJJ;
                        C1025890cnr c1025890cnrLIZ = C989860brk.LIZ(activity);
                        if (c1025890cnrLIZ == null) {
                            c1025890cnrLIZ = new C1025890cnr(activity);
                            c1025890cnrLIZ.setId(R.id.emv);
                            c1025890cnrLIZ.setParams(c1025930cnvLIZ);
                            c1025890cnrLIZ.setMBehaviorCallback(c989830brh);
                            c1025890cnrLIZ.setKeyDownCallBack(c990240bsM);
                            FrameLayout frameLayoutLIZIZ = C989860brk.LIZIZ(activity);
                            if (frameLayoutLIZIZ != null) {
                                frameLayoutLIZIZ.addView(c1025890cnrLIZ);
                            }
                        }
                        commonWebPageWidget.LLJIJIL = c1025890cnrLIZ;
                        c1025890cnrLIZ.setTitleBarCallback(commonWebPageWidget.LLJILLL);
                    }
                    if (context != null) {
                        new C828330WeV(new ThirdPartyBizCert(402673664)).LIZIZ(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new InterfaceC828360WeY() { // from class: X.0cmm
                            @Override // X.InterfaceC828360WeY
                            public final void LIZ(Context context3, String str4) {
                                Activity activityLIZ;
                                C1025890cnr c1025890cnrLIZ2;
                                int i;
                                C1025230cmn c1025230cmn = new C1025230cmn();
                                c1025230cmn.LIZ = context3;
                                c1025230cmn.LIZIZ = str4;
                                c1025230cmn.LIZJ.putAll(map);
                                Context context4 = c1025230cmn.LIZ;
                                C1025310cmv c1025310cmv = new C1025310cmv(context4, c1025230cmn.LIZIZ, c1025230cmn.LIZJ);
                                if (context4 != null && (activityLIZ = C1388190mED.LIZ(context4)) != null && (c1025890cnrLIZ2 = C989860brk.LIZ(activityLIZ)) != null) {
                                    C1025960cny popUpWebBottomSheetFromXml = c1025890cnrLIZ2.getPopUpWebBottomSheetFromXml();
                                    if (popUpWebBottomSheetFromXml != null && ((i = popUpWebBottomSheetFromXml.LLJJL.LJIIIIZZ) == 3 || i == 4)) {
                                        return;
                                    }
                                    AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(c1025890cnrLIZ2, c1025310cmv, 18);
                                    if (c1025890cnrLIZ2.getPaddingLayoutFromXml() == null) {
                                        c1025890cnrLIZ2.LLJJIJI = awS417S0200000_16;
                                    } else {
                                        awS417S0200000_16.invoke();
                                    }
                                }
                            }
                        }, null);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        C990230bsL.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJIL;
        if (this.LLJIJIL != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
        }
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.LLJILJIL = System.currentTimeMillis();
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* JADX INFO: renamed from: LJIILLIIL */
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        Fragment fragment;
        C19EG activity;
        Fragment fragment2;
        C19EG activity2;
        C1025890cnr c1025890cnrLIZ;
        C1025960cny popUpWebBottomSheetFromXml;
        super.onChanged(c0rd4);
        if (c0rd4 != null && (str = c0rd4.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1540531799) {
                if (iHashCode == 2040441990 && str.equals("ad_video_on_resume_play") && this.LLJIJIL != null && (fragment2 = this.LLJ) != null && (activity2 = fragment2.getActivity()) != null && (c1025890cnrLIZ = C989860brk.LIZ(activity2)) != null && (popUpWebBottomSheetFromXml = c1025890cnrLIZ.getPopUpWebBottomSheetFromXml()) != null) {
                    int i = popUpWebBottomSheetFromXml.LLJJL.LJIIIIZZ;
                    if ((i == 3 || i == 4) && C1483410ohn.LJLJJI().isPlaying()) {
                        C1483410ohn.LJLJJI().LIZ();
                        LLJJI = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("ad_feed_on_page_unselected") && this.LLJIJIL != null && (fragment = this.LLJ) != null && (activity = fragment.getActivity()) != null) {
                C1025890cnr c1025890cnrLIZ2 = C989860brk.LIZ(activity);
                if (c1025890cnrLIZ2 != null) {
                    c1025890cnrLIZ2.LLJJIJIIJIL.LIZJ();
                    FrameLayout frameLayoutLIZIZ = C989860brk.LIZIZ(activity);
                    if (frameLayoutLIZIZ != null) {
                        C786410Ut5.LJJJZ(c1025890cnrLIZ2, frameLayoutLIZIZ);
                    }
                }
                this.LLJIJIL = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C0RD4) obj);
    }
}
