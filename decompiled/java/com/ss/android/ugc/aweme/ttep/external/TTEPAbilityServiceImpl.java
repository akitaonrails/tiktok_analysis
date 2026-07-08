package com.ss.android.ugc.aweme.ttep.external;

import X.C0C64;
import X.C0CHQ;
import X.C0WZX;
import X.C13RH;
import X.C15O7;
import X.C1701330uNH;
import X.C19712912At;
import X.C19774512Yl;
import X.C19EG;
import X.C20308614dI;
import X.C20598415iw;
import X.C20598515ix;
import X.C20598915j1;
import X.C2204961BRm;
import X.C356901a3;
import X.C580820MqG;
import X.C786410Ut5;
import X.InterfaceC19305710fv;
import X.InterfaceC2385309Wh;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS19S0101000_8;
import Y.ARunnableS72S0200000_3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import com.ss.android.ugc.aweme.ttep.external.TTEPAbilityServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes32.dex */
public final class TTEPAbilityServiceImpl implements ITTEPAbilityService {
    public static final TTEPAbilityServiceImpl LIZ = new TTEPAbilityServiceImpl();

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final boolean enablePreviewByDeeplink() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ttep_preview_by_deeplink_enable", true, true);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ttep.external.TTEPAbilityServiceImpl$jumpShootPageAndPreview$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes9.dex */
    public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ Activity LL;
        public final /* synthetic */ String LLILLJJLI = "scan";
        public final /* synthetic */ RecordConfig.Builder LLILLL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
            TTEPAbilityServiceImpl tTEPAbilityServiceImpl = TTEPAbilityServiceImpl.LIZ;
            Activity activity = this.LL;
            String str = this.LLILLJJLI;
            RecordConfig.Builder builder = this.LLILLL;
            tTEPAbilityServiceImpl.getClass();
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(str, new C580820MqG(activity, builder, 14));
            ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
        }

        public AnonymousClass2(Activity activity, RecordConfig.Builder builder) {
            this.LL = activity;
            this.LLILLL = builder;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final C15O7<Effect> downloadPreviewEffectAndResourceWithoutLoginTask(String str, String str2) {
        return ((EffectFetchApi) C0CHQ.LIZ().getNetworkService().createRetrofit(str, true, EffectFetchApi.class)).getEffectMetaWithoutLogin(str2, C13RH.LIZJ(), "android").LJI(new InterfaceC2385309Wh() { // from class: X.13vd
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Object objLJIIIZ;
                String[] strArr;
                C1C7U.LIZ("TTEPAbilityServiceImpl@9eb0.downloadPreviewEffectAndResourceWithoutLoginTask$1");
                if (AnonymousClass1186.LIZIZ(c15o7)) {
                    if (((EffectFetchApiResBean) c15o7.LJIIL()).status != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed: download status code is ");
                        sbLIZ.append(((EffectFetchApiResBean) c15o7.LJIIL()).status);
                        objLJIIIZ = C15O7.LJIIIZ(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                    } else {
                        TTEPAbilityServiceImpl.LIZ.getClass();
                        if (C0UER.LIZ == null) {
                            C1633850scR.LIZ(o.LIZ, null);
                        }
                        try {
                            final Effect effect = (Effect) GsonProtectorUtils.fromJson(o.LIZIZ, ((EffectFetchApiResBean) c15o7.LJIIL()).data, Effect.class);
                            if (effect == null) {
                                objLJIIIZ = C15O7.LJIIIZ(new Exception("fail to parse effect, and effect is null"));
                            } else {
                                List<String> requirements = effect.getRequirements();
                                if (requirements == null || (strArr = (String[]) requirements.toArray(new String[0])) == null) {
                                    strArr = new String[0];
                                }
                                if (effect.getRequirements() == null) {
                                    effect.setRequirements(new ArrayList());
                                }
                                Map<String, List<String>> mapLIZ = AnonymousClass1186.LIZ(effect.getModel_names());
                                final v7.o oVar = new v7.o();
                                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr, mapLIZ, new IFetchResourceListener() { // from class: X.13vf
                                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                                    public final void onFailure(Exception exc) {
                                        oVar.LIZIZ(exc);
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                                    public final void onSuccess(long j) {
                                        Effect effect2 = effect;
                                        effect2.setVerifySignatureExemptionEnabled(true, "TTEH QR code preview");
                                        C1633850scR.LIZ(o.LIZ, null).LIZJ(effect2, new C20308014dC(oVar, 2));
                                    }
                                });
                                objLJIIIZ = oVar.LIZ;
                            }
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                            objLJIIIZ = C15O7.LJIIIZ(e);
                        }
                    }
                } else {
                    Exception excLJIIJJI = c15o7.LJIIJJI();
                    if (excLJIIJJI == null) {
                        excLJIIJJI = new Exception("fail to fetch effect info with null error");
                    }
                    objLJIIIZ = C15O7.LJIIIZ(excLJIIJJI);
                }
                C1C7U.LIZIZ("TTEPAbilityServiceImpl@9eb0.downloadPreviewEffectAndResourceWithoutLoginTask$1");
                return objLJIIIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void fetchTTEPMaterials(String str, Function2<Object, ? super Exception, Unit> function2) {
        try {
            ((EffectFetchApi) C0CHQ.LIZ().getNetworkService().createRetrofit(str, true, EffectFetchApi.class)).fetchTTEPMaterials().LIZLLL(new C19774512Yl(function2, 12));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            function2.invoke(null, e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback) {
        new C20598515ix(C20598915j1.LIZ).invoke(str, str2, C13RH.LIZJ()).LIZLLL(new C20308614dI(iDownloadCallback, 2));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback) {
        new C20598415iw(C20598915j1.LIZ).invoke(str, str2, C13RH.LIZJ()).LIZLLL(new C20308614dI(iDownloadCallback, 2));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void jumpShootPageAndPreview(Activity activity, String str, boolean z) {
        if (!o.LJIIZILJ.isLogin()) {
            C786410Ut5.re(Toast.makeText(activity, 2131821494, 0));
            o.LJIIZILJ.LJIIIIZZ(activity, "", "schema_record", null, new InterfaceC19305710fv() { // from class: X.15iz
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                }
            });
            return;
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(UUID.randomUUID().toString());
        builder.setEnterTTEPPageMode(1);
        builder.setTTEPPreviewEffectId(str);
        builder.interceptBackground(false);
        builder.shootWay("scan");
        if (z) {
            if (C19712912At.LIZ.LIZJ()) {
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new AnonymousClass2(activity, builder));
                return;
            } else {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("scan", new C580820MqG(activity, builder, 14));
                return;
            }
        }
        Intent intent = new Intent();
        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        new Bundle();
        intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
        intent.putExtras(intent.putExtra("enter_record_from_other_platform", true));
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP68Zo+A2SrINMgjwtrR6mY26fVuamCZpXCnINj3wbCzW85t7w==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadEffectAndJumpShootPage(final C19EG c19eg, Function0<Boolean> function0, String str, final Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (!function0.invoke().booleanValue()) {
            return;
        }
        if (!o.LJIIZILJ.isLogin()) {
            C786410Ut5.LJLIIL(0L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS72S0200000_3(function1, c19eg, 15));
            o.LJIIZILJ.LJIIIIZZ(c19eg, "", "schema_record", null, new InterfaceC19305710fv() { // from class: X.15iy
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                }
            });
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creator_preview_enable", true, false)) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(function1, 52));
            return;
        }
        function12.invoke(Boolean.TRUE);
        try {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "object_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                downloadPreviewEffectAndResource("https://effecthouse.tiktok.com", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new IDownloadCallback() { // from class: X.0L10
                    @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
                    public final void onSuccess(Effect effect) {
                        RecordConfig.Builder builder = new RecordConfig.Builder();
                        builder.creationId(UUID.randomUUID().toString());
                        builder.setEnterTTEPPageMode(1);
                        builder.setTTEPPreviewEffect(effect);
                        builder.shootWay("scan");
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("scan", new C580830MqH(function1, c19eg, builder, 2));
                    }

                    @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
                    public final void onFail(int i, String str2, Exception exc) {
                        int i2;
                        if (i != 0) {
                            if (Intrinsics.LJFF(str2, "exceed limit")) {
                                i2 = 2131833829;
                            } else if (Intrinsics.LJFF(str2, "no permission")) {
                                i2 = 2131821495;
                            } else {
                                i2 = 2131848597;
                            }
                            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS19S0101000_8(i2, c19eg, 3));
                        }
                        function1.invoke(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                    }
                });
            }
        }
    }
}
