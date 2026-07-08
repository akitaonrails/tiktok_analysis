package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0CHQ;
import X.C0DHG;
import X.C0HMM;
import X.C0MJJ;
import X.C0PEM;
import X.C11U6;
import X.C1221610htX;
import X.C135Q;
import X.C1388190mED;
import X.C1390380mHk;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C20022113Vr;
import X.C20175213ws;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2207821Bb2;
import X.C2215191Bmv;
import X.C23250099c;
import X.C23260099m;
import X.C259800zU;
import X.C294130Bfv;
import X.C439800HMk;
import X.C448760Hik;
import X.C448800Hio;
import X.C452501pT;
import X.C632670Orh;
import X.C786410Ut5;
import X.C817503Hh;
import X.C985403tE;
import X.DialogC1390150mHN;
import X.EnumC1221320ht4;
import X.EnumC1221910hu1;
import X.EnumC1221920hu2;
import X.EnumC20175313wt;
import X.EnumC2215301Bn6;
import X.EnumC2272608vM;
import X.InterfaceC1364105Vn;
import X.InterfaceC1389630mGX;
import X.InterfaceC2207871Bb7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS128S0400000_34;
import lth.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGCPictureHandler implements C0HMM, OnActivityResultCallback {
    public static AIGCAvatarAuthConfig LLJI;
    public static boolean hasDownloadModel;
    public final EnumC1221320ht4 LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public Activity LLILZIL;
    public List<String> LLILZLL;
    public Function1<? super List<String>, Unit> LLIZ;
    public String LLIZLLLIL;
    public Function0<Unit> LLJ;
    public final boolean isFastPath;
    public final int minCount;
    public static final C448800Hio Companion = new C448800Hio();
    public static final int $stable = 8;
    public static final C01GW<C20022113Vr> pathService$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(121));
    public final Map<String, HandleResult> cacheCropResultMap = new LinkedHashMap();
    public final Map<String, String> tokenMap = new LinkedHashMap();

    @Override // X.C0HMM
    public void onSingleImageClicked(MediaModel mediaModel) {
    }

    public final String getAigcType() {
        return this.isFastPath ? "fast" : "slow";
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Object downloadModel(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (hasDownloadModel) {
            C189200o6.m2constructorimpl(true);
            c23260099m.resumeWith(true);
        } else {
            List list = (List) C294130Bfv.LIZ.getValue();
            if (list.isEmpty()) {
                C189200o6.m2constructorimpl(false);
                c23260099m.resumeWith(false);
            } else {
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"TikTokAIGC"}, C2097608Jq.LJIIJ(new Pair("TikTokAIGC", list)), new IFetchResourceListener() { // from class: X.1Bn3
                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onFailure(Exception exc) {
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn2.resumeWith(bool);
                    }

                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onSuccess(long j) {
                        AIGCPictureHandler.hasDownloadModel = true;
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn2.resumeWith(bool);
                    }
                });
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final String getGenerateParam(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            HandleResult handleResult = this.cacheCropResultMap.get(it2.next());
            if (handleResult != null) {
                if (this.isFastPath) {
                    String str = this.tokenMap.get(handleResult.bingoPath);
                    if (str != null) {
                        jSONArray.put(LIZ(handleResult.cropResult.getBoyProb(), str, handleResult.cropResult.getSkinTone()));
                    }
                    String str2 = this.tokenMap.get(handleResult.smashPath);
                    if (str2 != null) {
                        jSONArray.put(LIZ(handleResult.cropResult.getBoyProb(), str2, handleResult.cropResult.getSkinTone()));
                    }
                } else {
                    String str3 = this.tokenMap.get(handleResult.slowPath);
                    if (str3 != null) {
                        jSONArray.put(LIZ(handleResult.cropResult.getBoyProb(), str3, handleResult.cropResult.getSkinTone()));
                    }
                }
            }
        }
        return jSONArray.toString();
    }

    public final Object getUploadAuthKeyConfig(InterfaceC1364105Vn<? super AIGCAvatarAuthConfig> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ListenableFuture<VideoCreation> listenableFutureLIZIZ = C0CHQ.LIZ().getPublishService().LJJIJIIJIL().LIZIZ(C2097608Jq.LJII(new Pair("purpose", "aigc_avatar")), false);
        listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, new C11U6<VideoCreation>() { // from class: X.0nce
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                InterfaceC1364105Vn<AIGCAvatarAuthConfig> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }

            @Override // X.C11U6
            public final void onSuccess(VideoCreation videoCreation) {
                UploadAuthKeyConfig uploadAuthKeyConfig;
                VideoCreation videoCreation2 = videoCreation;
                InterfaceC1364105Vn<AIGCAvatarAuthConfig> interfaceC1364105Vn2 = c23260099m;
                AIGCAvatarAuthConfig aIGCAvatarAuthConfig = null;
                if ((videoCreation2 instanceof UploadAuthKeyConfig) && (uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation2) != null) {
                    aIGCAvatarAuthConfig = uploadAuthKeyConfig.aigcAvatarAuthConfig;
                }
                C189200o6.m2constructorimpl(aIGCAvatarAuthConfig);
                interfaceC1364105Vn2.resumeWith(aIGCAvatarAuthConfig);
            }
        }), EnumC2272608vM.LL);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void setFinishFlowCallback(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final JSONObject LIZ(float f, String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uri", str);
        jSONObject.put("gender", Float.valueOf(f));
        if (((Boolean) C294130Bfv.LIZIZ.getValue()).booleanValue()) {
            jSONObject.put("skin_color", String.valueOf(i));
        }
        return jSONObject;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = null;
        objINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get = null;
        Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get = null;
        Serializable serializableExtra = null;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5 = null;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra6 = null;
        if (i != 101) {
            if (i != 102 || i2 != 301 || this.LLILZIL == null || this.LLILZLL == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            if (intent != null && (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
                objINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "aigc_profile_style_result_list");
            }
            String[] strArr = (String[]) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            if (strArr != null) {
                for (String str : strArr) {
                    jSONArray.put(str);
                }
            }
            Activity activity = this.LLILZIL;
            if (activity != null) {
                List<String> list = this.LLILZLL;
                if (list != null) {
                    openProgressPage(activity, getGenerateParam(list), jSONArray.toString());
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        String str2 = "";
        switch (i2) {
            case 201:
                if (this.LLILZIL == null) {
                    return;
                }
                if (intent != null) {
                    serializableExtra = intent.getSerializableExtra("key_avatar_result");
                }
                C1221610htX c1221610htX = (C1221610htX) serializableExtra;
                if (c1221610htX == null) {
                    return;
                }
                IProfileAIGCService iProfileAIGCService = (IProfileAIGCService) ServiceManager.get().getService(IProfileAIGCService.class);
                Activity activity2 = this.LLILZIL;
                if (activity2 != null) {
                    iProfileAIGCService.LIZJ(activity2, EnumC1221910hu1.TOOLS_CREATION_FLOW, EnumC1221920hu2.AI_AVATAR_CREATING_PAGE, c1221610htX);
                    Activity activity3 = this.LLILZIL;
                    if (activity3 != null) {
                        activity3.finish();
                    }
                    Function0<Unit> function0 = this.LLJ;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            case 202:
            default:
                return;
            case 203:
                if (!this.LLILLL) {
                    if (intent != null) {
                        strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_from");
                        strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_method");
                    } else {
                        strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = null;
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILZIL, "//aivatar/intro/v2");
                    smartRouteBuildRoute.withParam("enter_from", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3);
                    smartRouteBuildRoute.withParam("enter_method", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra5);
                    smartRouteBuildRoute.withParam("intro_page_nav_bar", true);
                    smartRouteBuildRoute.open();
                }
                Activity activity4 = this.LLILZIL;
                if (activity4 != null) {
                    activity4.finish();
                    return;
                }
                return;
            case 204:
                if (intent != null) {
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_from");
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra6 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_method");
                } else {
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = null;
                }
                IAIGCAvatarService iAIGCAvatarServiceLIZIZ = AIGCAvatarServiceImpl.LIZIZ();
                EnumC1221320ht4 enumC1221320ht4 = this.LL;
                C19EG c19eg = (C19EG) this.LLILZIL;
                if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 == null) {
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = "";
                }
                if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra6 != null) {
                    str2 = strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra6;
                }
                iAIGCAvatarServiceLIZIZ.hr(enumC1221320ht4, c19eg, null, null, false, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2, str2);
                Activity activity5 = this.LLILZIL;
                if (activity5 != null) {
                    activity5.finish();
                    return;
                }
                return;
            case 205:
                if (this.LLILZIL == null) {
                    return;
                }
                if (intent != null) {
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_from");
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "enter_method");
                } else {
                    strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = null;
                }
                if (this.isFastPath) {
                    IAIGCAvatarService iAIGCAvatarServiceLIZIZ2 = AIGCAvatarServiceImpl.LIZIZ();
                    EnumC1221320ht4 enumC1221320ht42 = this.LL;
                    C19EG c19eg2 = (C19EG) this.LLILZIL;
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
                        strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
                    }
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 != null) {
                        str2 = strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4;
                    }
                    iAIGCAvatarServiceLIZIZ2.jr(c19eg2, enumC1221320ht42, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, str2, false);
                } else {
                    IAIGCAvatarService iAIGCAvatarServiceLIZIZ3 = AIGCAvatarServiceImpl.LIZIZ();
                    EnumC1221320ht4 enumC1221320ht43 = this.LL;
                    C19EG c19eg3 = (C19EG) this.LLILZIL;
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
                        strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
                    }
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 != null) {
                        str2 = strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4;
                    }
                    iAIGCAvatarServiceLIZIZ3.hr(enumC1221320ht43, c19eg3, null, null, false, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_mvtemplate_aigc_AIGCPictureHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, str2);
                }
                Activity activity6 = this.LLILZIL;
                if (activity6 != null) {
                    activity6.finish();
                }
                Function0<Unit> function02 = this.LLJ;
                if (function02 != null) {
                    function02.invoke();
                    return;
                }
                return;
            case 206:
                Activity activity7 = this.LLILZIL;
                if (activity7 != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131820651);
                    creativeToastBuilder.isTuxToast(true);
                    C1390380mHk.LIZ(activity7, 5013, creativeToastBuilder);
                    return;
                }
                return;
        }
    }

    public final void openProgressPage(Activity activity, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//aivatar/progress");
        smartRouteBuildRoute.withParam("path_mode", this.isFastPath);
        smartRouteBuildRoute.withParam("aigc_generate_param", str);
        smartRouteBuildRoute.withParam("enter_from_for_progress", this.LLIZLLLIL);
        if (str2 != null) {
            smartRouteBuildRoute.withParam("aigc_style_param", str2);
        }
        smartRouteBuildRoute.open(101, this);
    }

    public static final class HandleResult {
        public static final int $stable = 8;
        public final String bingoPath;
        public final VEFaceDetectCropResult cropResult;
        public final String slowPath;
        public final String smashPath;

        public HandleResult(VEFaceDetectCropResult vEFaceDetectCropResult, String str, String str2, String str3) {
            this.cropResult = vEFaceDetectCropResult;
            this.bingoPath = str;
            this.smashPath = str2;
            this.slowPath = str3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0956] */
    public static final void checkValidAndUpload$continueRun(final AIGCPictureHandler aIGCPictureHandler, Activity activity, List<String> list, Function1<? super List<String>, Unit> function1) {
        aIGCPictureHandler.LLILZIL = activity;
        aIGCPictureHandler.LLILZLL = list;
        aIGCPictureHandler.LLIZ = function1;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.TOTAL, EnumC20175313wt.START, null, aIGCPictureHandler.getAigcType(), null, null, 52);
        final C259800zU c259800zU = new C259800zU();
        DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(activity);
        dialogC1390150mHN.LJJLJLI(activity.getResources().getString(2131820645));
        dialogC1390150mHN.LJJLJ(false);
        dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.1Bn0
            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                C09AE c09ae = c259800zU.element;
                if (c09ae != null) {
                    c09ae.LIZIZ(new CancellationException("User click cancel button"));
                }
                C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.TOTAL, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), aIGCPictureHandler.getAigcType(), null, "User click cancel", 16);
            }
        };
        dialogC1390150mHN.LJJLL(0.0f, false);
        C786410Ut5.K4(dialogC1390150mHN);
        c259800zU.element = C23250099c.LIZLLL(C817503Hh.LL, C2107308Nj.LIZ, null, new C2215191Bmv(aIGCPictureHandler, jElapsedRealtime, activity, dialogC1390150mHN, list, function1, null), 2);
    }

    @Override // X.C0HMM
    public void checkValidAndUpload(Activity activity, List<String> list, String str, Function1<? super List<String>, Unit> function1) {
        String str2;
        if (!o.LJIIZILJ.isLogin()) {
            return;
        }
        C0MJJ c0mjj = C0MJJ.LIZ;
        String str3 = this.LLILLJJLI;
        String str4 = this.LLILZ;
        c0mjj.getClass();
        C0MJJ.LJ(str3, str4, "", false);
        this.LLIZLLLIL = str;
        if (this.isFastPath) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, new C19719212De(-1752983656, new C439800HMk(this, activity, list, function1), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LIZIZ(activity.getResources().getQuantityString(2131755013, 3, 3));
                C985403tE.LIZ(c1397580mTM, new AwS128S0400000_34(this, activity, list, function1, 1));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            if (this.isFastPath) {
                str2 = "fast";
            } else {
                str2 = "slow";
            }
            C0MJJ.LIZLLL("show", str2);
            return;
        }
        checkValidAndUpload$continueRun(this, activity, list, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadImage(java.util.List<java.lang.String> r11, java.util.Map<java.lang.String, java.lang.String> r12, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r10 = this;
            r5 = r11
            r6 = r12
            r8 = r13
            boolean r0 = r14 instanceof X.C2215261Bn2
            r4 = r10
            if (r0 == 0) goto L72
            r9 = r14
            X.1Bn2 r9 = (X.C2215261Bn2) r9
            int r2 = r9.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r9.LLILZLL = r2
        L16:
            java.lang.Object r7 = r9.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L50
            if (r0 != r2) goto L78
            X.C155000ia.LIZIZ(r7)
        L29:
            return r7
        L2a:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r0 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LLJI
            if (r0 == 0) goto L41
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r7 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LLJI
        L39:
            if (r7 != 0) goto L62
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L41:
            r9.LL = r5
            r9.LLILLJJLI = r6
            r9.LLILLL = r8
            r9.LLILZLL = r1
            java.lang.Object r7 = r4.getUploadAuthKeyConfig(r9)
            if (r7 != r3) goto L5d
            return r3
        L50:
            kotlin.jvm.functions.Function1 r8 = r9.LLILLL
            java.lang.Object r6 = r9.LLILLJJLI
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r5 = r9.LL
            java.util.List r5 = (java.util.List) r5
            X.C155000ia.LIZIZ(r7)
        L5d:
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r7 = (com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig) r7
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.LLJI = r7
            goto L39
        L62:
            r0 = 0
            r9.LL = r0
            r9.LLILLJJLI = r0
            r9.LLILLL = r0
            r9.LLILZLL = r2
            java.lang.Object r7 = r4.uploadImage(r5, r6, r7, r8, r9)
            if (r7 != r3) goto L29
            return r3
        L72:
            X.1Bn2 r9 = new X.1Bn2
            r9.<init>(r4, r14)
            goto L16
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler.uploadImage(java.util.List, java.util.Map, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public final Object cropAndGetInformation(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super VEFaceDetectCropResult> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C448760Hik(str, this, str2, str3, str4, null));
    }

    public final Object uploadImage(final List<String> list, final Map<String, String> map, AIGCAvatarAuthConfig aIGCAvatarAuthConfig, final Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C2207821Bb2 c2207821Bb2 = new C2207821Bb2(aIGCAvatarAuthConfig);
        c2207821Bb2.LIZIZ(list.size(), (String[]) list.toArray(new String[0]));
        c2207821Bb2.LIZJ(new InterfaceC2207871Bb7() { // from class: X.0LKx
            @Override // X.InterfaceC2207871Bb7
            public final void onLog(int i, int i2, String str) {
            }

            @Override // X.InterfaceC2207871Bb7
            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                Integer numValueOf;
                String str;
                float f;
                Integer numValueOf2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uploader notify: what = ");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                String str2 = null;
                if (imageUploadInfo != null) {
                    numValueOf = Integer.valueOf(imageUploadInfo.mFileIndex);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" - ");
                if (imageUploadInfo != null) {
                    str = imageUploadInfo.mImageToskey;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                if (i == 6) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("single file complete: ");
                    if (imageUploadInfo != null) {
                        numValueOf2 = Integer.valueOf(imageUploadInfo.mFileIndex);
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    sbLIZ2.append(" - ");
                    if (imageUploadInfo != null) {
                        str2 = imageUploadInfo.mImageToskey;
                    }
                    sbLIZ2.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (imageUploadInfo != null && Integer.valueOf(imageUploadInfo.mFileIndex) != null && imageUploadInfo.mImageToskey != null) {
                        Map<String, String> map2 = map;
                        Object obj = ListProtector.get(list, imageUploadInfo.mFileIndex);
                        String str3 = imageUploadInfo.mImageToskey;
                        if (str3 != null) {
                            map2.put((String) obj, str3);
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    return;
                }
                if (i == 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("upload file complete: ");
                    if (imageUploadInfo != null) {
                        str2 = imageUploadInfo.mImageToskey;
                    }
                    sbLIZ3.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                    return;
                }
                if (i != 2 && i != 7) {
                    if (i != 1) {
                        return;
                    }
                    Function1<Float, Unit> function12 = function1;
                    if (imageUploadInfo != null) {
                        f = imageUploadInfo.mProgress;
                    } else {
                        f = 0.0f;
                    }
                    function12.invoke(Float.valueOf(f));
                    return;
                }
                c2207821Bb2.LIZ();
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn3 = c23260099m;
                Boolean bool2 = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool2);
                interfaceC1364105Vn3.resumeWith(bool2);
            }
        });
        c2207821Bb2.LIZLLL();
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public AIGCPictureHandler(boolean z, EnumC1221320ht4 enumC1221320ht4, int i, String str, boolean z2, String str2) {
        this.isFastPath = z;
        this.LL = enumC1221320ht4;
        this.minCount = i;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = str2;
    }
}
