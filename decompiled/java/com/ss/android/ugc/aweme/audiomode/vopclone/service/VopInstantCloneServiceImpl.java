package com.ss.android.ugc.aweme.audiomode.vopclone.service;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05HK;
import X.C098200Yq;
import X.C0SRQ;
import X.C11VK;
import X.C11VR;
import X.C13LQ;
import X.C189200o6;
import X.C19419110yD;
import X.C20589615hW;
import X.C2188811AlT;
import X.C2218181Brk;
import X.C2218381Bs4;
import X.C2218411Bs7;
import X.C2354709Kn;
import X.C452501pT;
import X.C786410Ut5;
import X.C837920Wty;
import X.EnumC2217951BrN;
import X.InterfaceC2218081Bra;
import X.InterfaceC2218401Bs6;
import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICoreVopInstantEngine;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.enums.SAMICoreVopLanguage;
import com.mammon.audiosdk.enums.SAMICoreVopProcessRecordAudioResult;
import com.mammon.audiosdk.enums.SAMICoreVopRecordingType;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.mammon.audiosdk.enums.SAMICoreVopTextType;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;
import com.mammon.audiosdk.structures.SAMICoreVopTextInfo;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopInstantCloneServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.privacy.CreativeCertService;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.gamora.recorder.vopclone.VopCameraClientService;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class VopInstantCloneServiceImpl implements IVopInstantCloneService {
    public static final /* synthetic */ int LJIIJ = 0;
    public SAMICoreVopInstantEngine LIZ;
    public C2218411Bs7 LIZLLL;
    public AnonymousClass0956 LJII;
    public boolean LJIIIIZZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(40));
    public final Cert LIZJ = CertProviderManagerKt.findCert("bpea-vop_instant_record_voice", 1476788486);
    public final Vector<byte[]> LJ = new Vector<>();
    public final C2218181Brk LJFF = new InterfaceC2218081Bra() { // from class: X.1Brk
        @Override // X.InterfaceC2218071BrZ
        public final void onError(int i, int i2, String str) {
        }

        @Override // X.InterfaceC2218081Bra
        public final void onReceive(VEAudioSample vEAudioSample) {
            byte[] bArr;
            if (vEAudioSample == null) {
                return;
            }
            C2218111Brd sampleBuffer = vEAudioSample.getSampleBuffer();
            if (sampleBuffer instanceof C2218091Brb) {
                bArr = ((C2218091Brb) vEAudioSample.getSampleBuffer()).LIZ;
            } else if (sampleBuffer instanceof C2218101Brc) {
                ByteBuffer byteBuffer = ((C2218101Brc) vEAudioSample.getSampleBuffer()).LIZ;
                byteBuffer.limit();
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.get(bArr);
                byteBuffer.clear();
            } else {
                bArr = null;
            }
            this.LIZ.LJ.add(bArr);
        }

        @Override // X.InterfaceC2218071BrZ
        public final void onInfo(int i, int i2, double d, Object obj) {
            if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
                if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
                    VopInstantCloneServiceImpl vopInstantCloneServiceImpl = this.LIZ;
                    vopInstantCloneServiceImpl.LJIIIIZZ = true;
                    C1DFH c1dfh = C0PEM.LIZ;
                    vopInstantCloneServiceImpl.LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C13029057z(vopInstantCloneServiceImpl, null), 3);
                    return;
                }
                if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                    return;
                }
                this.LIZ.LJIIIIZZ = false;
            }
        }
    };
    public final C20589615hW LJI = new C20589615hW();
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final String LJJIZ() {
        return "audio_metrics";
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int getCurrentState() {
        SAMICoreVopState[] sAMICoreVopStateArr = new SAMICoreVopState[1];
        int currentState = LIZJ().getCurrentState(sAMICoreVopStateArr);
        SAMICoreVopState sAMICoreVopState = (SAMICoreVopState) C13LQ.LJJIFFI(sAMICoreVopStateArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentState(): resCode is ");
        sbLIZ.append(currentState);
        sbLIZ.append(", curState is ");
        sbLIZ.append(sAMICoreVopState != null ? Integer.valueOf(sAMICoreVopState.getValue()) : "");
        C2188811AlT.LIZIZ(sbLIZ);
        if (sAMICoreVopState == null) {
            sAMICoreVopState = SAMICoreVopState.Error;
        }
        return sAMICoreVopState.getValue();
    }

    public static String LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("passport-auth", "session");
            jSONObject.put("x-tt-token", VopCameraClientService.LIZ().getUserTTToken());
            jSONObject.put("sdk-version", VopCameraClientService.LIZ().getSDKVersion());
            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
            if (localTestApi.enableBoe()) {
                String boeLane = localTestApi.getBoeLane();
                jSONObject.put("X-TT-ENV", boeLane != null ? boeLane : "prod");
                jSONObject.put("X-USE-PPE", "1");
            } else if (localTestApi.enablePpe()) {
                String pPELane = localTestApi.getPPELane();
                jSONObject.put("X-TT-ENV", pPELane != null ? pPELane : "prod");
                jSONObject.put("X-USE-PPE", "1");
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LIZ() {
        C2218411Bs7 c2218411Bs7;
        C20589615hW c20589615hW = this.LJI;
        C2218381Bs4.LJ = C2218381Bs4.LIZ();
        ArrayList<InterfaceC2218401Bs6> arrayList = C2218381Bs4.LJFF;
        if (!arrayList.contains(c20589615hW)) {
            if (C2218381Bs4.LJ) {
                c20589615hW.LIZLLL();
            }
            if (C2218381Bs4.LIZLLL) {
                c20589615hW.getClass();
            }
            arrayList.add(c20589615hW);
        }
        this.LJ.clear();
        if (this.LJIIIIZZ && (c2218411Bs7 = this.LIZLLL) != null && c2218411Bs7.LIZ) {
            return -2;
        }
        C2218411Bs7 c2218411Bs72 = new C2218411Bs7();
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
        builder.setSampleRate(44100);
        Integer num = ((VopCloneConfig) C19419110yD.LIZJ.getValue()).channel;
        builder.setChannel(num != null ? num.intValue() : 1);
        HashMap<EnumC2217951BrN, Cert> map = new HashMap<>();
        map.put(EnumC2217951BrN.EXCEPTION_CLOSE_MIC, CreativeCertService.LIZ().getExceptionCloseAudioCert());
        builder.setAudioPrivacyCertMap(map);
        c2218411Bs72.LIZIZ.init(builder.build());
        this.LIZLLL = c2218411Bs72;
        c2218411Bs72.LIZIZ.addCaptureListener(this.LJFF);
        C2218411Bs7 c2218411Bs73 = this.LIZLLL;
        if (c2218411Bs73 != null) {
            Cert cert = this.LIZJ;
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
            c2218411Bs73.LIZ = true;
            c2218411Bs73.LIZIZ.start(cert);
        }
        return 0;
    }

    public final SAMICoreVopInitContext LIZIZ() {
        return (SAMICoreVopInitContext) this.LIZIZ.getValue();
    }

    public final SAMICoreVopInstantEngine LIZJ() {
        SAMICoreVopInstantEngine sAMICoreVopInstantEngine = this.LIZ;
        if (sAMICoreVopInstantEngine != null) {
            return sAMICoreVopInstantEngine;
        }
        SAMICoreVopInstantEngine sAMICoreVopInstantEngine2 = new SAMICoreVopInstantEngine();
        this.LIZ = sAMICoreVopInstantEngine2;
        return sAMICoreVopInstantEngine2;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJIIJIL() {
        C2218411Bs7 c2218411Bs7;
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C2218381Bs4.LJFF.remove(this.LJI);
        if (!this.LJIIIIZZ && (c2218411Bs7 = this.LIZLLL) != null && !c2218411Bs7.LIZ) {
            return -1;
        }
        C2218411Bs7 c2218411Bs72 = this.LIZLLL;
        if (c2218411Bs72 != null) {
            Cert cert = this.LIZJ;
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZJ();
            c2218411Bs72.LIZ = false;
            c2218411Bs72.LIZIZ.stop(cert);
        }
        C2218411Bs7 c2218411Bs73 = this.LIZLLL;
        if (c2218411Bs73 != null) {
            c2218411Bs73.LIZIZ.release(this.LIZJ);
        }
        C2218411Bs7 c2218411Bs74 = this.LIZLLL;
        if (c2218411Bs74 != null) {
            c2218411Bs74.LIZIZ.removeCaptureListener(this.LJFF);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIL() {
        Iterator<byte[]> it2 = this.LJ.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += it2.next().length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : this.LJ) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        this.LJ.clear();
        SAMICoreVopProcessRecordAudioResult[] sAMICoreVopProcessRecordAudioResultArr = new SAMICoreVopProcessRecordAudioResult[1];
        LIZJ().processRecordAudio(bArr, length, sAMICoreVopProcessRecordAudioResultArr);
        SAMICoreVopProcessRecordAudioResult sAMICoreVopProcessRecordAudioResult = (SAMICoreVopProcessRecordAudioResult) C13LQ.LJJIFFI(sAMICoreVopProcessRecordAudioResultArr);
        Integer numValueOf = sAMICoreVopProcessRecordAudioResult != null ? Integer.valueOf(sAMICoreVopProcessRecordAudioResult.getValue()) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processRecordAudio(): resCode is ");
        sbLIZ.append(numValueOf != null ? numValueOf.intValue() : -1);
        C2188811AlT.LIZIZ(sbLIZ);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final String LJJJJ() {
        SAMICoreVopTextInfo sAMICoreVopTextInfo = new SAMICoreVopTextInfo();
        int nextTextInfo = LIZJ().getNextTextInfo(sAMICoreVopTextInfo);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTextInfo(): resCode is ");
        sbLIZ.append(nextTextInfo);
        sbLIZ.append(", text: ");
        String str = sAMICoreVopTextInfo.textJson;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        String str2 = sAMICoreVopTextInfo.textJson;
        return str2 != null ? str2 : "";
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final C05HK getSpeakerInfo() {
        SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo = new SAMICoreVopSpeakerInfo();
        LIZJ().getSpeakerInfo(sAMICoreVopSpeakerInfo);
        return new C05HK(sAMICoreVopSpeakerInfo.speakerId, sAMICoreVopSpeakerInfo.ttsId, Boolean.valueOf(sAMICoreVopSpeakerInfo.isPrivate == 1));
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJIL() {
        return LIZJ().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.DELETE);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJL() {
        return LIZJ().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.BIND_VOICE);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJ() {
        return LIZJ().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.START_RECORD_TASK);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJI() {
        return LIZJ().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.DISCARD_VOICE);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJIL() {
        return LIZJ().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.SIGN_AGREEMENT);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int init(String str) {
        String strLIZIZ;
        Locale countryLocale;
        Unit unit = null;
        if (this.LJIIIZ.get()) {
            if (Intrinsics.LJFF(LIZIZ().userId, VopCameraClientService.LIZ().getCurrentUserId()) && Intrinsics.LJFF(LIZIZ().token, LIZLLL())) {
                return 0;
            }
            try {
                SAMICoreVopInstantEngine sAMICoreVopInstantEngine = this.LIZ;
                if (sAMICoreVopInstantEngine != null) {
                    sAMICoreVopInstantEngine.destroyEngine();
                }
                this.LIZ = null;
                try {
                    Context context = C2218381Bs4.LIZ;
                    if (context != null) {
                        C786410Ut5.LJJIFFI(context, C2218381Bs4.LIZIZ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C2218381Bs4.LJFF.clear();
                C2218381Bs4.LIZIZ = null;
                C2218381Bs4.LIZ = null;
                C2218381Bs4.LIZLLL = false;
                C2218381Bs4.LJ = false;
                C2218381Bs4.LIZJ = false;
                this.LJIIIZ.set(false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity != null) {
                C2218381Bs4.LIZIZ(validTopActivity);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        String strGenVopSdkSavePath = VopCameraClientService.LIZ().genVopSdkSavePath();
        if (!C2354709Kn.LIZIZ(strGenVopSdkSavePath)) {
            C2354709Kn.LJFF(strGenVopSdkSavePath, false);
        }
        VopCameraClientService.LIZ().initVESdk();
        LIZIZ().language = SAMICoreVopLanguage.ENGLISH;
        LIZIZ().vopServerUrl = C11VR.LIZIZ().vopServerUrl;
        LIZIZ().ttsServerUrl = C11VR.LIZIZ().vopServerUrl;
        LIZIZ().appKey = "vXulscvzIx";
        LIZIZ().token = LIZLLL();
        LIZIZ().connectionTimeout = 50000;
        LIZIZ().tokenType = SAMICoreTokenType.TOKEN_TO_C_D;
        LIZIZ().snrModelPath = str;
        LIZIZ().saveFileDir = strGenVopSdkSavePath;
        LIZIZ().cutoffLength = C11VR.LIZIZ().cutOffLength;
        LIZIZ().snrThreshold = C11VR.LIZIZ().snrThreshold;
        LIZIZ().werThreshold = 0.2f;
        LIZIZ().werFailedMaxTimes = 3;
        LIZIZ().textType = SAMICoreVopTextType.PRIMARY;
        LIZIZ().resampleRate = 24000;
        LIZIZ().recordingType = SAMICoreVopRecordingType.PCM_S16;
        LIZIZ().sampleRate = 44100;
        LIZIZ().channel = 1;
        LIZIZ().maxBlockSize = 512;
        LIZIZ().sampleTextContent = "a";
        LIZIZ().userId = VopCameraClientService.LIZ().getCurrentUserId();
        SAMICoreVopInitContext sAMICoreVopInitContextLIZIZ = LIZIZ();
        IAVSettingService iAVSettingService = (IAVSettingService) ServiceManager.get().getService(IAVSettingService.class);
        if (iAVSettingService != null && (countryLocale = iAVSettingService.getCountryLocale()) != null) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            strLIZIZ = C837920Wty.LIZIZ(countryLocale);
        } else {
            strLIZIZ = "";
        }
        sAMICoreVopInitContextLIZIZ.userLocale = strLIZIZ;
        int iInit = LIZJ().init(LIZIZ());
        if (iInit == 0) {
            this.LJIIIZ.set(true);
        }
        return iInit;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final void LJJIJLIJ(Context context, String str) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(context)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//audiomode/instant_clone");
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.open();
            C11VK.LIZ.getClass();
            C11VK.LJ(str, "click", false);
        }
    }
}
