package com.ss.android.ugc.aweme.commercialize.hybrid.impl.share.service;

import X.AbstractC1968807nS;
import X.C08JS;
import X.C0OM1;
import X.C0T8R;
import X.C0XI4;
import X.C1035880d3y;
import X.C1037200d66;
import X.C1038660d8S;
import X.C1038780d8e;
import X.C1054770dYR;
import X.C1075100e5E;
import X.C1075110e5F;
import X.C1075210e5P;
import X.C1075240e5S;
import X.C1075250e5T;
import X.C1075280e5W;
import X.C1075290e5X;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127K;
import X.C1308910kAL;
import X.C131800eq;
import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import X.C1AF0;
import X.C306390Bzh;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C621180OYa;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogInterfaceOnCancelListenerC1075200e5O;
import X.InterfaceC1036110d4L;
import X.InterfaceC1364520lc2;
import X.InterfaceC1370310llN;
import X.InterfaceC1541990qEH;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.share.AdWebSharePackage;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS33S0600000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebShareService implements IAdWebShareService {
    public TuxSheet LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService
    public final void LIZ(SparkContext sparkContext) {
        String strTtclid;
        C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        if (c1035880d3y != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("first_page", String.valueOf(c1035880d3y.getFirstPage()));
            String awemeId = c1035880d3y.getAwemeId();
            if (awemeId != null) {
                linkedHashMap.put("aweme_id", awemeId);
            }
            linkedHashMap.put("spark_container_id", sparkContext.containerId);
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd != null) {
                linkedHashMap.put("show_report", String.valueOf(awemeRawAd.isReportEnable()));
            }
            linkedHashMap.put("anchor_type", String.valueOf(c1035880d3y.getAnchorType()));
            NonAdWebModel nonAdWebModel = c1035880d3y.getNonAdWebModel();
            if (nonAdWebModel != null) {
                linkedHashMap.put("non_ad_model", C08JS.LIZLLL(nonAdWebModel));
                linkedHashMap.put("non_ad_model", String.valueOf(nonAdWebModel.getShowReport()));
            }
            if (c1035880d3y.enableClickIdAttach() && (strTtclid = c1035880d3y.ttclid()) != null && strTtclid.length() != 0) {
                String strTtclid2 = c1035880d3y.ttclid();
                if (strTtclid2 == null) {
                    strTtclid2 = "";
                }
                linkedHashMap.put("ttclid", strTtclid2);
            }
            AbstractC1968807nS abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class);
            if (abstractC1968807nS != null) {
                ShareH5Service.LIZ.getClass();
                C1038660d8S.LIZ().LJIIIZ(abstractC1968807nS, linkedHashMap);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService
    public final boolean LIZIZ(AbstractC1968807nS abstractC1968807nS) {
        if (abstractC1968807nS != null) {
            String str = ((C1054770dYR) abstractC1968807nS).getParams().get("show_report");
            if (str != null && Boolean.parseBoolean(str)) {
                return true;
            }
            String str2 = ((C1054770dYR) abstractC1968807nS).getParams().get("anchor_type");
            if (str2 != null && CastIntegerProtector.parseInt(str2) > 0 && CastIntegerProtector.parseInt(str2) != 59) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService
    public final void LIZJ(SparkContext sparkContext, InterfaceC1541990qEH interfaceC1541990qEH) {
        Activity activity;
        C1371600lnS c1371600lnS = new C1371600lnS();
        boolean z = interfaceC1541990qEH.e1() instanceof WebView;
        AbstractC1968807nS abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class);
        if (abstractC1968807nS != null) {
            activity = ((C1054770dYR) abstractC1968807nS).getActivity();
        } else {
            activity = null;
        }
        C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        if (c1035880d3y == null) {
            return;
        }
        LJ(sparkContext, c1371600lnS, c1035880d3y, activity, true);
        if (c1371600lnS.LJJIIJ != null && activity != null) {
            try {
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJII(activity, new C1371590lnR(c1371600lnS), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService
    public final void LIZLLL(SparkContext sparkContext, InterfaceC1541990qEH interfaceC1541990qEH) {
        View viewE1;
        WebView webView;
        Activity activity;
        FragmentManager supportFragmentManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        Context context;
        C19EG c19egLIZIZ;
        C1371600lnS c1371600lnS = new C1371600lnS();
        AttributeSet attributeSet = null;
        if (interfaceC1541990qEH != null) {
            viewE1 = interfaceC1541990qEH.e1();
        } else {
            viewE1 = null;
        }
        if (viewE1 instanceof WebView) {
            webView = (WebView) viewE1;
        } else {
            webView = null;
        }
        AbstractC1968807nS abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class);
        if (abstractC1968807nS != null) {
            activity = ((C1054770dYR) abstractC1968807nS).getActivity();
        } else {
            activity = null;
        }
        C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        if (c1035880d3y == null) {
            return;
        }
        if (webView != null && (context = webView.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        int i = 0;
        LJ(sparkContext, c1371600lnS, c1035880d3y, activity, false);
        C1075210e5P c1075210e5P = new C1075210e5P(webView, sparkContext);
        boolean zLIZIZ = LIZIZ(abstractC1968807nS);
        boolean zLIZ = C306390Bzh.LIZ();
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils != null) {
            iAdWebUIUtils.LIZ(sparkContext, null);
        }
        IAdWebUIUtils iAdWebUIUtils2 = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils2 != null && iAdWebUIUtils2.LIZ(sparkContext, null)) {
            C1038780d8e c1038780d8e = C1038780d8e.LIZ;
            C1035880d3y c1035880d3y2 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            c1038780d8e.getClass();
            h hVarLIZ = C1038780d8e.LIZ(c1035880d3y2, abstractC1968807nS);
            if (hVarLIZ != null) {
                Iterator<k> it2 = hVarLIZ.iterator();
                while (it2.hasNext()) {
                    Iterator<k> it3 = it2.next().LJIIL().iterator();
                    while (it3.hasNext()) {
                        InterfaceC1370310llN interfaceC1370310llNLIZ = C1075100e5E.LIZ(c1075210e5P, it3.next().LJIL());
                        if (interfaceC1370310llNLIZ != null) {
                            c1371600lnS.LIZJ(interfaceC1370310llNLIZ);
                        }
                    }
                }
            }
        } else {
            if (zLIZIZ && sparkContext.LJFF(C1035880d3y.class) != null) {
                c1371600lnS.LIZJ(new C1075240e5S(c1075210e5P));
            }
            c1371600lnS.LIZJ(new C1075110e5F(c1075210e5P));
            c1371600lnS.LIZJ(new C1075290e5X(c1075210e5P));
            c1371600lnS.LIZJ(new C1075250e5T(c1075210e5P));
            if (zLIZ) {
                c1371600lnS.LIZJ(new C1075280e5W(c1075210e5P));
            }
        }
        IAdWebUIUtils iAdWebUIUtils3 = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils3 != null && iAdWebUIUtils3.LIZ(sparkContext, null) && activity != null && supportFragmentManager != null) {
            C0T8R c0t8r = new C0T8R(activity);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = activity.getString(R.string.loy);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS560S0100000_16(this, 173));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = false;
            c0om1.LIZJ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, activity);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            tuxSheet2.LLJJIII = c0t8r;
            tuxSheet2.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(0);
            DialogInterfaceOnCancelListenerC1075200e5O dialogInterfaceOnCancelListenerC1075200e5O = new DialogInterface.OnCancelListener() { // from class: X.0e5O
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                }
            };
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LL = dialogInterfaceOnCancelListenerC1075200e5O;
            this.LIZ = tuxSheet3;
            c0t8r.LL = (LinearLayout) c0t8r.findViewById(R.id.a6t);
            C1038780d8e c1038780d8e2 = C1038780d8e.LIZ;
            C1035880d3y c1035880d3y3 = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            c1038780d8e2.getClass();
            h hVarLIZ2 = C1038780d8e.LIZ(c1035880d3y3, abstractC1968807nS);
            if (hVarLIZ2 != null) {
                List<InterfaceC1370310llN> list = c1371600lnS.LJFF;
                Iterator<k> it4 = hVarLIZ2.iterator();
                while (it4.hasNext()) {
                    h hVarLJIIL = it4.next().LJIIL();
                    int size = hVarLJIIL.size();
                    int i2 = 1;
                    for (k kVar : hVarLJIIL) {
                        if (i < list.size()) {
                            C127K c127k = new C127K(c0t8r.getContext(), attributeSet, 6);
                            InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) ListProtector.get(list, i);
                            c127k.setTitle(c127k.getContext().getString(interfaceC1370310llN.LJJLIIIJJIZ()));
                            InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class);
                            if (interfaceC1036110d4L != null) {
                                interfaceC1036110d4L.LJJIII(kVar.LJIL());
                            }
                            c127k.setOnClickListener(new AwS33S0600000_16(c1371600lnS, tuxSheet3, interfaceC1370310llN, c127k, sparkContext, kVar, 0));
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = interfaceC1370310llN.LJIIIIZZ();
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
                            c127k.setIcon(c419910GdJ);
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1f);
                            if (size == 1) {
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                            } else if (i2 == 1) {
                                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                            } else if (i2 == size) {
                                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
                            }
                            c127k.setBackground(c384050F3z.LIZ(c127k.getContext()));
                            LinearLayout linearLayout = c0t8r.LL;
                            if (linearLayout != null) {
                                linearLayout.addView(c127k);
                            }
                            if (i2 != size) {
                                View view = new View(c0t8r.getContext());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(-0.5d)));
                                C786410Ut5.W5(view, layoutParams);
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
                                if (numLIZJ2 != null) {
                                    iIntValue = numLIZJ2.intValue();
                                } else {
                                    iIntValue = -12303292;
                                }
                                view.setBackground(new ColorDrawable(iIntValue));
                                LinearLayout linearLayout2 = c0t8r.LL;
                                if (linearLayout2 != null) {
                                    linearLayout2.addView(view);
                                }
                            } else {
                                ViewGroup.LayoutParams layoutParams2 = c127k.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    if (marginLayoutParams != null) {
                                        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                    }
                                } else {
                                    marginLayoutParams = null;
                                }
                                C786410Ut5.Y6(c127k, marginLayoutParams);
                            }
                            i2++;
                            i++;
                            attributeSet = null;
                        }
                    }
                    attributeSet = null;
                }
            }
            TuxSheet tuxSheet4 = this.LIZ;
            if (tuxSheet4 != null) {
                tuxSheet4.show(supportFragmentManager, "IAB_more_sheet");
                return;
            }
            return;
        }
        if (c1371600lnS.LJJIIJ != null && activity != null) {
            try {
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJII(activity, new C1371590lnR(c1371600lnS), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    public static void LJ(SparkContext sparkContext, C1371600lnS c1371600lnS, final C1035880d3y c1035880d3y, final Activity activity, boolean z) {
        String string;
        String strTtclid;
        String host;
        String currentUrl = c1035880d3y.getCurrentUrl();
        if (currentUrl != null) {
            if (c1035880d3y.enableClickIdAttach() && (strTtclid = c1035880d3y.ttclid()) != null && strTtclid.length() != 0 && !a0.LJJIIZI(currentUrl, "ttclid=", false) && (host = UriProtector.parse(currentUrl).getHost()) != null && host.length() != 0) {
                Iterator<String> it2 = C131800eq.LIZ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (PatternProtector.compile(it2.next()).matcher(host).matches()) {
                            break;
                        }
                    } else {
                        C0XI4 c0xi4 = new C0XI4(currentUrl);
                        c0xi4.LJ("ttclid", c1035880d3y.ttclid());
                        currentUrl = c0xi4.LJFF();
                        break;
                    }
                }
            }
            String strLIZIZ = C1037200d66.LIZIZ(c1035880d3y, currentUrl);
            if (strLIZIZ != null) {
                C1370940lmO c1370940lmO = new C1370940lmO();
                c1370940lmO.LIZ = "web";
                c1370940lmO.LJFF = strLIZIZ;
                AdWebSharePackage adWebSharePackage = new AdWebSharePackage(c1370940lmO);
                Bundle bundle = adWebSharePackage.extras;
                if (activity == null || (string = activity.getString(R.string.drg)) == null) {
                    string = "";
                }
                C786410Ut5.LJJJI("app_name", string, bundle);
                C786410Ut5.LJJJI("aweme_id", c1035880d3y.getAwemeId(), adWebSharePackage.extras);
                C786410Ut5.LJJJI("current_url", strLIZIZ, adWebSharePackage.extras);
                adWebSharePackage.extras.putInt("first_page", c1035880d3y.getFirstPage());
                adWebSharePackage.extras.putInt("anchor_type", c1035880d3y.getAnchorType());
                if (c1035880d3y.getNonAdWebModel() != null) {
                    C786410Ut5.LJJJI("non_ad_model", C08JS.LIZLLL(c1035880d3y.getNonAdWebModel()), adWebSharePackage.extras);
                }
                C786410Ut5.LJJJI("spark_container_id", sparkContext.containerId, adWebSharePackage.extras);
                C786410Ut5.LJJJI("enter_from", "", adWebSharePackage.extras);
                c1371600lnS.LJJIIJ = adWebSharePackage;
                IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
                if (iAdWebUIUtils != null && iAdWebUIUtils.LIZ(sparkContext, null) && !z) {
                    return;
                }
                ShareDependService.LIZ.getClass();
                ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL(adWebSharePackage, "");
                if (imChannelLJJJIL != null) {
                    c1371600lnS.LIZIZ(imChannelLJJJIL);
                    C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, true);
                    InterfaceC1364520lc2 interfaceC1364520lc2 = new InterfaceC1364520lc2(activity, c1035880d3y) { // from class: X.0e5J
                        public final C1035880d3y LIZ;

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
                        public final void LJIIJJI(BaseSharePackage baseSharePackage, String str) {
                        }

                        @Override // X.InterfaceC1364520lc2
                        public final void LJIIL(BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1364520lc2
                        public final void LJIILIIL(BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1364520lc2
                        public final void LJIIJ() {
                            ShareDependService.LIZ.getClass();
                            ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
                            this.LIZ.getAwemeId();
                            shareDependServiceLJJJJI.LIZLLL();
                        }

                        @Override // X.InterfaceC1364520lc2
                        public final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
                            ShareDependService.LIZ.getClass();
                            ShareDependServiceImpl.LJJJJI().LJIIJ(this.LIZ.getAwemeId(), baseSharePackage);
                        }

                        {
                            this.LIZ = c1035880d3y;
                        }
                    };
                    c1371600lnS.LJJIIJZLJL = true;
                    c1371600lnS.LJJIZ = interfaceC1364520lc2;
                }
                c1371600lnS.LJIILLIIL = true;
            }
        }
    }
}
