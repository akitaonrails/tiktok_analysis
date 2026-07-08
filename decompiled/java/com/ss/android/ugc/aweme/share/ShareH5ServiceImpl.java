package com.ss.android.ugc.aweme.share;

import X.AbstractC1544900qIy;
import X.AbstractC1968807nS;
import X.AbstractC843560X7i;
import X.C1051660dTQ;
import X.C1054720dYM;
import X.C1054730dYN;
import X.C1075630e65;
import X.C1075640e66;
import X.C1378490lyZ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1968907nT;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C829480WgM;
import X.EnumC1055790da5;
import X.InterfaceC1037450d6V;
import X.InterfaceC1039110d9B;
import X.InterfaceC1055820da8;
import X.InterfaceC1063710dmr;
import X.InterfaceC1969407nY;
import Y.ARunnableS116S0100000_16;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod;
import com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness;
import com.ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.InJavaScriptLocalObj;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness;
import com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.ss.android.ugc.aweme.spark.business.AbsSparkShareBusiness;
import com.ss.android.ugc.aweme.spark.business.SparkShareBusiness;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class ShareH5ServiceImpl implements ShareH5Service {
    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map<String, Class<?>> LIZIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("share", ShareMethod.class), new Pair("shareSearch", ShareSearchMethod.class));
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final List<Class<? extends InterfaceC1063710dmr>> LJIIIIZZ() {
        return C1697810uHb.LJIIJJI(C1378490lyZ.class, C829480WgM.class);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJI(InterfaceC1039110d9B interfaceC1039110d9B) {
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) interfaceC1039110d9B.LIZIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(absShareBusiness, 155));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map<String, Object> LJII(InterfaceC1969407nY interfaceC1969407nY) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) interfaceC1969407nY.LIZIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            return C2097908Jt.LIZJ(new Pair("local_obj", absSparkShareBusiness.LJII));
        }
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final ShareMethod LJIIJ(C1051660dTQ c1051660dTQ) {
        return new ShareMethod(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final com.ss.android.ugc.aweme.fe.method.ShareMethod LJIJ(IESJsBridge iESJsBridge) {
        return new com.ss.android.ugc.aweme.fe.method.ShareMethod(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJJLI(AbstractC1968807nS abstractC1968807nS) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) abstractC1968807nS.LIZIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(absSparkShareBusiness, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final ShareSearchMethod LJIL(C1051660dTQ c1051660dTQ) {
        return new ShareSearchMethod(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LIZ(InterfaceC1039110d9B interfaceC1039110d9B, String str) {
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) interfaceC1039110d9B.LIZIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LIZJ(AbstractC1968807nS abstractC1968807nS, WebView webView) {
        AbstractC843560X7i abstractC843560X7i;
        if (abstractC1968807nS.LIZIZ(SparkShareBusiness.class) != null) {
            InterfaceC1055820da8 interfaceC1055820da8 = C1054720dYM.LIZ;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("GetSharedJSSwitch", false)) {
                abstractC843560X7i = new AbstractC843560X7i() { // from class: X.0X7j
                };
            } else {
                abstractC843560X7i = null;
            }
            Pair pair = new Pair("javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());", abstractC843560X7i);
            String str = (String) pair.getFirst();
            AbstractC1544900qIy abstractC1544900qIy = (AbstractC1544900qIy) pair.getSecond();
            if (webView != null) {
                if (abstractC1544900qIy != null && interfaceC1055820da8 != null) {
                    interfaceC1055820da8.LIZ(webView, str, null, EnumC1055790da5.LoadUrl, abstractC1544900qIy);
                } else {
                    C786410Ut5.ue(webView, str);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LIZLLL(InterfaceC1039110d9B interfaceC1039110d9B, String str) {
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) interfaceC1039110d9B.LIZIZ(ShareBusiness.class);
        if (absShareBusiness != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.LIZJ = null;
            absShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJ(InterfaceC1039110d9B interfaceC1039110d9B, boolean z) {
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) interfaceC1039110d9B.LIZIZ(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.LJFF = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJFF(InterfaceC1969407nY interfaceC1969407nY, WebView webView) {
        SparkShareBusiness sparkShareBusiness = (SparkShareBusiness) interfaceC1969407nY.LIZIZ(SparkShareBusiness.class);
        if (sparkShareBusiness != null) {
            sparkShareBusiness.LJIIIIZZ = webView;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIIZ(AbstractC1968807nS abstractC1968807nS, Map map) {
        Map<String, String> params;
        C1054730dYN c1054730dYNLIZIZ = abstractC1968807nS.LIZIZ(SparkShareBusiness.class);
        if (c1054730dYNLIZIZ != null && (params = c1054730dYNLIZIZ.LIZ.getParams()) != null) {
            params.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIJJI(InterfaceC1969407nY interfaceC1969407nY, boolean z) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) interfaceC1969407nY.LIZIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            absSparkShareBusiness.LJFF = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILIIL(InterfaceC1039110d9B interfaceC1039110d9B, WebKitView webKitView) {
        if (interfaceC1039110d9B.LIZIZ(ShareBusiness.class) != null && webKitView != null) {
            C786410Ut5.ue(webKitView, "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILJJIL(C1968907nT c1968907nT, int i) {
        GenericDeclaration genericDeclaration;
        if (c1968907nT != null) {
            if (i == 1 || i != 2) {
                genericDeclaration = com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness.class;
            } else {
                genericDeclaration = LandingShareBusiness.class;
            }
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) c1968907nT.LIZ(genericDeclaration);
            if (absShareBusiness != null) {
                C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(absShareBusiness, 9));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILL(InterfaceC1969407nY interfaceC1969407nY, String str) {
        AbsSparkShareBusiness absSparkShareBusiness = (AbsSparkShareBusiness) interfaceC1969407nY.LIZIZ(SparkShareBusiness.class);
        if (absSparkShareBusiness != null) {
            absSparkShareBusiness.LJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIILLIIL(C19EG c19eg, C1075640e66 c1075640e66) {
        SearchSharePackage.Companion.getClass();
        C1075630e65.LIZ(c19eg, c1075640e66);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJI(InterfaceC1039110d9B interfaceC1039110d9B, WebKitView webKitView) {
        ShareBusiness shareBusiness = (ShareBusiness) interfaceC1039110d9B.LIZIZ(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.LJII = webKitView;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIIL(C1968907nT c1968907nT, InterfaceC1037450d6V interfaceC1037450d6V, int i) {
        GenericDeclaration genericDeclaration;
        if (c1968907nT != null) {
            if (i == 1 || i != 2) {
                genericDeclaration = com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness.class;
            } else {
                genericDeclaration = LandingShareBusiness.class;
            }
            BusinessService.Business businessLIZ = c1968907nT.LIZ(genericDeclaration);
            if (businessLIZ != null && interfaceC1037450d6V != null) {
                businessLIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }");
                sbLIZ.append("window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC1037450d6V.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void LJIJJ(C1968907nT c1968907nT, InterfaceC1037450d6V interfaceC1037450d6V, int i) {
        GenericDeclaration genericDeclaration;
        if (c1968907nT != null) {
            if (i == 1 || i != 2) {
                genericDeclaration = com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness.class;
            } else {
                genericDeclaration = LandingShareBusiness.class;
            }
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) c1968907nT.LIZ(genericDeclaration);
            if (absShareBusiness != null && interfaceC1037450d6V != null) {
                if (absShareBusiness.LJIIIIZZ == null) {
                    absShareBusiness.LJIIIIZZ = absShareBusiness.new InJavaScriptLocalObj();
                }
                interfaceC1037450d6V.LIZLLL();
                interfaceC1037450d6V.LJI();
            }
        }
    }
}
