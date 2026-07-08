package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C0N2Z;
import X.C0N52;
import X.C0WZX;
import X.C1022820ciu;
import X.C1035730d3j;
import X.C1036130d4N;
import X.C1036610d59;
import X.C1039000d90;
import X.C1039180d9I;
import X.C1041540dD6;
import X.C1041550dD7;
import X.C1041610dDD;
import X.C1041660dDI;
import X.C1041740dDQ;
import X.C1041780dDU;
import X.C1041800dDW;
import X.C1041810dDX;
import X.C1041920dDi;
import X.C1043690dGZ;
import X.C1051980dTw;
import X.C11JF;
import X.C11N2;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1286830jaj;
import X.C12ES;
import X.C1365870leD;
import X.C1388190mED;
import X.C1440005kM;
import X.C14EU;
import X.C1524340plo;
import X.C1550010qRD;
import X.C1602160rnK;
import X.C18N0;
import X.C18OR;
import X.C1968907nT;
import X.C19724912Fj;
import X.C19EG;
import X.C19LH;
import X.C20684815ws;
import X.C2093608Ic;
import X.C21566519ah;
import X.C21566919al;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C484220Iyq;
import X.C484240Iys;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1041630dDF;
import X.InterfaceC1037450d6V;
import X.InterfaceC1037470d6X;
import X.InterfaceC1038630d8P;
import X.InterfaceC1038710d8X;
import X.InterfaceC1969007nU;
import X.InterfaceC342470Dbh;
import X.InterfaceC500500Jk0;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC1041980dDo;
import Y.AObjectS291S0200000_16;
import Y.ARunnableS116S0100000_16;
import Y.AfS185S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class MixActivityContainer extends AbsActivityContainer {
    public final Activity LL;
    public C1041660dDI LLILLJJLI;
    public Bundle LLILLL;
    public C1036130d4N LLILZ;
    public final C1968907nT LLILZIL;
    public InterfaceC1038630d8P LLILZLL;
    public String LLIZ;
    public Runnable LLIZLLLIL;
    public boolean LLJ;
    public long LLJI = -1;
    public C11JF LLJIJIL;
    public final C1035730d3j LLJILJIL;
    public ViewOnClickListenerC1041980dDo LLJILJILJ;
    public String LLJILLL;
    public long LLJJ;
    public C1039000d90 LLJJI;
    public C1041540dD6 LLJJIII;
    public Space LLJJIJI;
    public final Set<InterfaceC342470Dbh> LLJJIJIIJIL;

    public void LJJIII() {
    }

    public void LJJIIJZLJL() {
    }

    public void LJJIIZ() {
    }

    public void LJJIJ(Boolean bool) {
    }

    public void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC1038990d8z
    public final String getTitle() {
        return null;
    }

    @C14EU
    public void onEvent(C1039180d9I c1039180d9I) {
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LLJ = false;
    }

    @Override // X.InterfaceC1037490d6Z
    public final boolean LJI() {
        return this.LLILZLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIJ() {
        this.LL.finish();
    }

    public final void LJJ() {
        Runnable runnable = this.LLIZLLLIL;
        if (runnable != null) {
            runnable.run();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LLILLJJLI.LIZ.LIZIZ), "__spark_session_id");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return;
        }
        C1051980dTw.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
    }

    public final InterfaceC1037450d6V LJJIFFI() {
        InterfaceC1037470d6X interfaceC1037470d6X;
        InterfaceC1038630d8P interfaceC1038630d8P = this.LLILZLL;
        if (interfaceC1038630d8P == null || (interfaceC1037470d6X = (InterfaceC1037470d6X) interfaceC1038630d8P.LJIIJJI(InterfaceC1037470d6X.class)) == null) {
            return null;
        }
        return interfaceC1037470d6X.LIZ();
    }

    public final boolean LJJIIJ() {
        return this.LLILLJJLI.LIZIZ.LL > 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        dispose();
        InterfaceC1038630d8P interfaceC1038630d8P = this.LLILZLL;
        if (interfaceC1038630d8P != null) {
            interfaceC1038630d8P.LIZJ();
            this.LLILZIL.getClass();
        }
        if (!TextUtils.isEmpty(this.LLILLJJLI.LIZ.LJIIJ)) {
            ReportBusinessProxy reportBusinessProxy = (ReportBusinessProxy) this.LLILZIL.LIZ(ReportBusinessProxy.class);
            if (TextUtils.equals(reportBusinessProxy.LIZLLL, "bio_link")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(System.currentTimeMillis() - reportBusinessProxy.LJFF.longValue(), "duration");
                C20684815ws.LJIILLIIL("biolink_session_duration", c2344009Gk.LIZ);
            }
        }
        EventBus.LIZLLL().LJJI(this);
        LJJIJIIJI(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC1038630d8P interfaceC1038630d8P;
        if (this.LLILZIL.LIZ(PassBackWebInfoBusiness.class) != null) {
            ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ();
        }
        this.LLILZLL.LJII(this.LL);
        this.LLJI = System.currentTimeMillis() - this.LLJJ;
        this.LLJJ = 0L;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(this.LLJI, "duration");
        C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
        this.LLILZIL.getClass();
        LJJIJIIJIL();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LLILZIL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null && (interfaceC1038630d8P = this.LLILZLL) != null) {
            adWebStatBusiness.LIZIZ(false, interfaceC1038630d8P.LJIILJJIL(), null, this.LLIZ);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LLILZIL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            boolean z = playableBusiness.LIZLLL;
        }
        this.LLJIJIL = (C11JF) C11NZ.LJLLILLLL(C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()), C2214201BlK.LIZJ(), new InterfaceC500500Jk0() { // from class: X.0dDV
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new C1041680dDK((ITpcConsentService) obj, (Activity) obj2);
            }
        }).LJL(C11S5.LIZ()).LJJLJLI(new AfS185S0100000_16(this, 0));
    }

    @Override // X.InterfaceC1037490d6Z
    public final void refresh() {
        this.LLILZLL.refresh();
    }

    public final void LJJIIZI() {
        C1041610dDD c1041610dDD;
        this.LLJILJILJ = (ViewOnClickListenerC1041980dDo) LJJI(R.id.f_l);
        View viewLJJI = LJJI(R.id.ndj);
        int i = this.LLILLJJLI.LIZJ.LJI;
        if (i != -2) {
            viewLJJI.setBackgroundColor(i);
        } else {
            viewLJJI.setBackgroundColor(C960203pA.LIZ(R.attr.bx, this.LL));
        }
        int i2 = this.LLILLJJLI.LIZJ.LJIILJJIL;
        if (i2 != -2) {
            this.LLJILJILJ.setBackgroundColor(i2);
            this.LL.getWindow().setBackgroundDrawableResource(R.color.dr);
            C1286830jaj.LIZ(this.LL);
        }
        this.LLJJIII = (C1041540dD6) LJJI(R.id.f_m);
        this.LLJJIJI = (Space) LJJI(R.id.p1c);
        this.LLJJIII.setCrossPlatformParams(this.LLILLJJLI);
        this.LLJJIII.setTitleWrap(new C1041810dDX(this));
        HandlerHook.viewPost(this.LLJJIII, new ARunnableS116S0100000_16(this, 0));
        this.LLJJI = new C1039000d90(this.LL, this);
        LJJIJ(Boolean.valueOf(C1041780dDU.LIZ(this.LLILLJJLI)));
        if (this.LLILLJJLI.LIZJ.LJIJJLI) {
            C21566919al c21566919al = new C21566919al(this.LL);
            c21566919al.LIZ(2131838250);
            c21566919al.LJII(2131829423, null, false);
            new C21566519ah(c21566919al).LIZLLL();
        }
        if (this.LLILLJJLI.LIZJ.LJIIL) {
            C1039000d90 c1039000d90 = this.LLJJI;
            c1039000d90.getClass();
            if (!C2093608Ic.LJ("copylink")) {
                EnumC1041630dDF[] enumC1041630dDFArrValues = EnumC1041630dDF.values();
                int length = enumC1041630dDFArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    EnumC1041630dDF enumC1041630dDF = enumC1041630dDFArrValues[i3];
                    if (TextUtils.equals("copylink", enumC1041630dDF.key)) {
                        int i4 = enumC1041630dDF.id;
                        if (i4 > 0) {
                            C12ES.LJIILL(8, c1039000d90.LJFF.findViewById(i4));
                            if (c1039000d90.LJ == null) {
                                c1039000d90.LJ = new ArrayList();
                            }
                            if (!((ArrayList) c1039000d90.LJ).contains(Integer.valueOf(i4))) {
                                ((ArrayList) c1039000d90.LJ).add(Integer.valueOf(i4));
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
        }
        BusinessService.Business businessLIZ = this.LLILZIL.LIZ(OpenUrlHintBusiness.class);
        ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo = this.LLJILJILJ;
        String str = this.LLILLJJLI.LIZ.LJI;
        businessLIZ.getClass();
        viewOnClickListenerC1041980dDo.LIZIZ(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str));
        this.LLILZLL.LJIIIZ();
        if (this.LLILLJJLI.LIZJ.LJIJ) {
            C1041540dD6 c1041540dD6 = this.LLJJIII;
            int visibility = c1041540dD6.getVisibility();
            c1041540dD6.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1041540dD6);
            C786410Ut5.LLIIZ(this.LLJJIJI, 8);
        }
        C1041610dDD c1041610dDD2 = this.LLILLJJLI.LIZJ;
        if (!c1041610dDD2.LJIILL) {
            C786410Ut5.LLIIZ(this.LLJJIJI, 8);
            ((C1041920dDi) LJJI(R.id.ndj)).setGradualChangeMode(false);
            C1041540dD6 c1041540dD62 = this.LLJJIII;
            c1041540dD62.setBackgroundColor(0);
            C786410Ut5.LJLLLLLL(8, c1041540dD62.getBgBrowserTitleFromXml());
            C1041660dDI c1041660dDI = c1041540dD62.LLJIJIL;
            if (c1041660dDI != null && (c1041610dDD = c1041660dDI.LIZJ) != null && c1041610dDD.LJJIIJ) {
                C786410Ut5.LJLLLLLL(8, c1041540dD62.getBgBrowserTitleFromXml());
            }
            C786410Ut5.LLLLZLL(c1041540dD62.getTitleFromXml(), 8);
            c1041540dD62.getCloseCustomFromXml().setIconRes(R.raw.icon_arrow_left_ltr);
            c1041540dD62.getCloseCustomFromXml().setTintColorRes(R.attr.bx);
            c1041540dD62.getCloseCustomFromXml().LIZJ(true);
            c1041540dD62.getCloseAllWebpageFromXml().setIconRes(R.raw.icon_x_mark);
            c1041540dD62.getBtnShareFromXml().setIconRes(R.raw.icon_arrow_turn_up_right);
            c1041540dD62.getReportAdsFromXml().setIconRes(R.raw.icon_flag);
            c1041540dD62.getReportAdsFromXml().setTintColorRes(R.attr.bx);
            c1041540dD62.getReportAdsFromXml().LIZJ(true);
            c1041540dD62.getRightMenuFromXml().setIconRes(R.raw.icon_ellipsis_vertical);
            C1041540dD6 c1041540dD63 = this.LLJJIII;
            int visibility2 = c1041540dD63.getVisibility();
            c1041540dD63.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c1041540dD63);
        } else if (c1041610dDD2.LJIJ) {
            C1041540dD6 c1041540dD64 = this.LLJJIII;
            int visibility3 = c1041540dD64.getVisibility();
            c1041540dD64.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c1041540dD64);
            C786410Ut5.LLIIZ(this.LLJJIJI, 8);
        } else {
            ((C1041920dDi) LJJI(R.id.ndj)).setGradualChangeMode(false);
            C786410Ut5.LLIIZ(this.LLJJIJI, 0);
            C1041540dD6 c1041540dD65 = this.LLJJIII;
            C1041660dDI c1041660dDI2 = c1041540dD65.LLJIJIL;
            if (c1041660dDI2 != null) {
                int i5 = c1041660dDI2.LIZJ.LJFF;
                if (i5 != -2) {
                    c1041540dD65.setBackgroundColor(i5);
                } else {
                    c1041540dD65.setBackgroundResource(R.drawable.cf9);
                }
                if (c1041660dDI2.LIZJ.LJII != -2) {
                    c1041540dD65.getTitleFromXml().setTextColor(c1041660dDI2.LIZJ.LJII);
                    Context context = c1041540dD65.getContext();
                    if (context != null) {
                        C19LH c19lhLIZ = C19LH.LIZ(context.getResources(), R.drawable.bfx, context.getTheme());
                        if (c19lhLIZ != null) {
                            c19lhLIZ.setTint(c1041660dDI2.LIZJ.LJII);
                        }
                        c1041540dD65.getCloseCustomFromXml().setImageDrawable(c19lhLIZ);
                    }
                } else {
                    c1041540dD65.getCloseCustomFromXml().setIconRes(R.raw.icon_arrow_left_ltr);
                }
                C786410Ut5.LJLLLLLL(8, c1041540dD65.getBgBrowserTitleFromXml());
                C786410Ut5.LLLLZLL(c1041540dD65.getTitleFromXml(), 0);
                c1041540dD65.getCloseAllWebpageFromXml().setIconRes(R.raw.icon_x_mark);
                c1041540dD65.getBtnShareFromXml().setIconRes(R.raw.icon_arrow_turn_up_right);
                c1041540dD65.getReportAdsFromXml().setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
                c1041540dD65.getRightMenuFromXml().setIconRes(R.raw.icon_ellipsis_vertical);
            }
        }
        if (this.LLILLJJLI.LIZJ.LJIILLIIL) {
            LJJI(R.id.f_l).setPadding(0, C497820Jfg.LIZJ(this.LL), 0, 0);
        }
        if (this.LLILLJJLI.LIZJ.LJJIIJ) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJJIII.getLayoutParams();
            int iLIZJ = this.LLILLJJLI.LIZJ.LJJIIJZLJL;
            if (iLIZJ < 0) {
                iLIZJ = C497820Jfg.LIZJ(this.LL);
            }
            marginLayoutParams.setMargins(0, iLIZJ, 0, 0);
            C1041540dD6 c1041540dD66 = this.LLJJIII;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1041540dD66);
            c1041540dD66.setLayoutParams(marginLayoutParams);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        System.currentTimeMillis();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC1038710d8X interfaceC1038710d8X;
        System.currentTimeMillis();
        this.LLILZLL.LJIILLIIL();
        this.LLILZIL.LIZIZ.LIZ(WalletBusiness.class).getClass();
        this.LLJJ = System.currentTimeMillis();
        LJJIII();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LLILZIL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null && C1388190mED.LIZ(adWebStatBusiness.LIZ.getContext()) != null && adWebStatBusiness.LIZ() && (interfaceC1038710d8X = adWebStatBusiness.LIZLLL) != null) {
            interfaceC1038710d8X.LJIILJJIL();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LLILZIL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            boolean z = playableBusiness.LIZLLL;
        }
        this.LLJIJIL = (C11JF) C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()).LJL(C11S5.LIZ()).LJJLJLI(new AfS185S0100000_16(this, 1));
        this.LLJ = true;
        if (C1036610d59.LIZJ == 0 || !LJJIIJ()) {
            return;
        }
        C1041550dD7 c1041550dD7 = this.LLILLJJLI.LIZIZ;
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "ad_web_fragment_created", String.valueOf(c1041550dD7.LL), c1041550dD7.LLJ, null);
        c1022820ciuLJ.LIZIZ(Long.valueOf(System.currentTimeMillis() - C1036610d59.LIZJ), "created_duration");
        c1022820ciuLJ.LIZIZ(c1041550dD7.LLLLIL, "web_url");
        c1022820ciuLJ.LIZIZ(0, "is_spark");
        c1022820ciuLJ.LIZIZ(Integer.valueOf(C1036610d59.LIZIZ), "is_pre_create");
        c1022820ciuLJ.LJII();
        C1036610d59.LIZJ = 0L;
        C1036610d59.LIZIZ = 0;
    }

    @Override // X.InterfaceC1037490d6Z
    public final C1041660dDI LJIIIIZZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1038990d8z
    public final InterfaceC1038630d8P LJIILIIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1037490d6Z
    public final InterfaceC1969007nU LJIILL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1037490d6Z
    public final /* bridge */ /* synthetic */ Context getContext() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIIZILJ(C1043690dGZ c1043690dGZ) {
        synchronized (this.LLJJIJIIJIL) {
            try {
                ((HashSet) this.LLJJIJIIJIL).add(c1043690dGZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIJJ(InterfaceC342470Dbh interfaceC342470Dbh) {
        if (interfaceC342470Dbh != null) {
            synchronized (this.LLJJIJIIJIL) {
                try {
                    ((HashSet) this.LLJJIJIIJIL).remove(interfaceC342470Dbh);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final <T extends View> T LJJI(int i) {
        return (T) this.LL.findViewById(i);
    }

    public final void LJJII(boolean z) {
        if (LJJIIJ() || !this.LLILZLL.LIZIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("method", this.LLJILLL);
            C20684815ws.LJIILLIIL("h5_leave_detail", c2344009Gk.LIZ);
            Runnable runnable = this.LLIZLLLIL;
            if (runnable != null) {
                runnable.run();
                if (z) {
                    this.LLIZ = "full_screen_page_click";
                } else {
                    this.LLIZ = "full_screen_system_click";
                }
            }
        }
    }

    public final void LJJIJIIJI(boolean z) {
        C1041550dD7 c1041550dD7 = this.LLILLJJLI.LIZIZ;
        if (c1041550dD7.LL > 0) {
            if (z) {
                IAdLandPageSurveyService iAdLandPageSurveyService = (IAdLandPageSurveyService) ServiceManager.get().getService(IAdLandPageSurveyService.class);
                String str = c1041550dD7.LLLF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1041550dD7.LLLJIL);
                sbLIZ.append("");
                iAdLandPageSurveyService.LJII(str, C2188811AlT.LIZIZ(sbLIZ), c1041550dD7.LLJILLL, c1041550dD7.LLLJ, c1041550dD7.LLJ, c1041550dD7.LLLIZZ, c1041550dD7.LLLILZ, c1041550dD7.LLLILZJ, c1041550dD7.LLLILZLLLI);
                return;
            }
            ((IAdLandPageSurveyService) ServiceManager.get().getService(IAdLandPageSurveyService.class)).LIZ();
        }
    }

    @C14EU
    public final void invokeRenderTimeEvent(C484220Iyq c484220Iyq) {
        JSONObject jSONObject;
        if (this.LLJ && (jSONObject = c484220Iyq.LIZ) != null) {
            if (TextUtils.equals("goods_rn_page_monitor", jSONObject.optString("eventName"))) {
                try {
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data");
                    C18N0 c18n0 = new C18N0();
                    CastLongProtector.valueOf(jSONObject2.optString("interact_render_ts")).longValue();
                    jSONObject2.optString("page_id");
                    CastLongProtector.valueOf(jSONObject2.optString("ender_render_ts")).longValue();
                    jSONObject2.optString("session_id");
                    C18OR.LIZ().logCommerceEvents("commerce_page_render_time", c18n0);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            if (TextUtils.equals("hybrid_prefetch_duration_monitor", c484220Iyq.LIZ.optString("eventName"))) {
                C1041740dDQ c1041740dDQ = new C1041740dDQ();
                try {
                    JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data");
                    c1041740dDQ.LJIIZILJ.put("duration", CastLongProtector.valueOf(jSONObject3.optString("duration")).longValue());
                    c1041740dDQ.LJIILLIIL.put("duration_type", jSONObject3.optString("duration_type"));
                    c1041740dDQ.LJIILLIIL.put("is_cache", jSONObject3.optString("is_cache"));
                    c1041740dDQ.LJIILLIIL.put("page_id", jSONObject3.optString("page_id"));
                    InterfaceC1038630d8P interfaceC1038630d8P = this.LLILZLL;
                    if (interfaceC1038630d8P != null) {
                        c1041740dDQ.LJIJ = interfaceC1038630d8P.LIZ();
                    }
                    C1524340plo value = C1524340plo.LJI.getValue();
                    C1550010qRD c1550010qRD = c1041740dDQ.LJIJ;
                    value.getClass();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    @C14EU
    public void onEvent(C0N2Z c0n2z) throws JSONException {
        InterfaceC1037450d6V interfaceC1037450d6VLIZ;
        View view;
        PreRenderWebViewBusiness preRenderWebViewBusinessLIZ = PreRenderWebViewBusiness.LIZ(this);
        int iHashCode = 0;
        if (preRenderWebViewBusinessLIZ != null) {
            InterfaceC1038630d8P interfaceC1038630d8P = this.LLILZLL;
            if (c0n2z != null && c0n2z.LIZIZ != null) {
                int i = c0n2z.LIZ;
                InterfaceC1037450d6V interfaceC1037450d6VLIZ2 = ((InterfaceC1037470d6X) interfaceC1038630d8P.LJIIJJI(InterfaceC1037470d6X.class)).LIZ();
                if (interfaceC1037450d6VLIZ2 != null && (view = interfaceC1037450d6VLIZ2.getView()) != null) {
                    iHashCode = view.hashCode();
                }
                if (i == iHashCode) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appearanceState", preRenderWebViewBusinessLIZ.LIZLLL);
                    jSONObject.put("code", 1);
                    jSONObject.put("preloadType", 1);
                    jSONObject.put("clickFrom", preRenderWebViewBusinessLIZ.LJ);
                    String str = preRenderWebViewBusinessLIZ.LIZIZ.LIZIZ.LLLF;
                    if (Intrinsics.LJFF("splash", str)) {
                        jSONObject.put(Scene.SCENE_SERVICE, 2);
                    } else if (Intrinsics.LJFF("feedad", str)) {
                        jSONObject.put(Scene.SCENE_SERVICE, 1);
                    }
                    c0n2z.LIZIZ.LIZIZ(jSONObject);
                    return;
                }
                return;
            }
            return;
        }
        if (c0n2z == null || c0n2z.LIZIZ == null || c0n2z.LIZ == 0 || (interfaceC1037450d6VLIZ = ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ()) == null || interfaceC1037450d6VLIZ.hashCode() != c0n2z.LIZ) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("preloadType", 0);
            String str2 = this.LLILLJJLI.LIZIZ.LLLF;
            if ("splash".equals(str2)) {
                jSONObject2.put(Scene.SCENE_SERVICE, 2);
            } else if ("feedad".equals(str2)) {
                jSONObject2.put(Scene.SCENE_SERVICE, 1);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c0n2z.LIZIZ.LIZIZ(jSONObject2);
    }

    @C14EU
    public void onEvent(C0N52 c0n52) {
        InterfaceC1038630d8P interfaceC1038630d8P;
        InterfaceC1037470d6X interfaceC1037470d6X;
        InterfaceC1037450d6V interfaceC1037450d6VLIZ;
        if (c0n52 == null || c0n52.LIZ == 0 || (interfaceC1038630d8P = this.LLILZLL) == null || (interfaceC1037470d6X = (InterfaceC1037470d6X) interfaceC1038630d8P.LJIIJJI(InterfaceC1037470d6X.class)) == null || (interfaceC1037450d6VLIZ = interfaceC1037470d6X.LIZ()) == null || this.LLIZLLLIL == null || interfaceC1037450d6VLIZ.hashCode() != c0n52.LIZ || LJIL(null, false)) {
            return;
        }
        this.LLIZLLLIL.run();
        this.LLIZ = "full_screen_page_click";
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        if (TextUtils.equals("web", c1365870leD.LIZLLL)) {
            C1041800dDW.LIZ().getShareService().LJIL(this.LL, this.LLJJIII, c1365870leD);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0d3j] */
    public MixActivityContainer(C19EG c19eg, C1041660dDI c1041660dDI) {
        new C11NJ();
        this.LLJIJIL = null;
        this.LLJILJIL = new C11N2<Boolean>() { // from class: X.0d3j
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "appEnterBackgroundEvent"));
                } else {
                    C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "appEnterForegroundEvent"));
                }
            }
        };
        this.LLJJIJIIJIL = new HashSet();
        this.LL = c19eg;
        this.LLILLJJLI = c1041660dDI;
        this.LLILZIL = new C1968907nT(this);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final boolean LJIJI(int i, String str) {
        return C19724912Fj.LIZLLL().LJIIIIZZ(i, this.LL, str);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIJJLI(int i, Intent intent) throws Throwable {
        C2204961BRm.LJIIL(50000, this.LL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6bIzdzD6hCjxGKRHDngedbmgwrQg8X/X+OTgUyUOQ6+oreTAzh13R8uQ=", null));
    }

    public final boolean LJIL(Runnable runnable, boolean z) {
        boolean zCanGoBack;
        if (((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ() != null) {
            zCanGoBack = ((InterfaceC1037470d6X) this.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).canGoBack();
        } else {
            zCanGoBack = false;
        }
        if (!LJJIIJ() || (zCanGoBack && !z)) {
            return false;
        }
        return ((IAdLandPageSurveyService) ServiceManager.get().getService(IAdLandPageSurveyService.class)).LIZIZ(this.LL, new AObjectS291S0200000_16(this, runnable, 0));
    }

    @Override // X.InterfaceC342470Dbh
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        BusinessService.Business businessLIZ = this.LLILZIL.LIZ(WalletBusiness.class);
        String strLJFF = this.LLILZLL.LJFF();
        businessLIZ.getClass();
        if (strLJFF != null && strLJFF.contains("wallet/home")) {
            C1440005kM.LIZ(new C484240Iys());
        }
        HashSet hashSet = new HashSet();
        synchronized (this.LLJJIJIIJIL) {
            try {
                hashSet.addAll(this.LLJJIJIIJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC342470Dbh) it2.next()).onActivityResult(i, i2, intent);
            }
            return false;
        }
        return false;
    }
}
