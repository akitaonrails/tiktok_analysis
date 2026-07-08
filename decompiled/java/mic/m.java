package mic;

import X.C0CHQ;
import com.bef.effectsdk.GeneralParam;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IGeneralParam;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public final class m implements IEffectSDKGeneralParamService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService
    public final String getEffectSdkVersion() {
        return C0CHQ.LIZ().LJJJ().getEffectSDKVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService
    public final IGeneralParam generalParam() {
        return new IGeneralParam() { // from class: X.0jaM
            @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
            public final void setNetWorkInfoCallback() {
                GeneralParam.setNetWorkInfoCallback(new GeneralParam.GetNetWorkInfo() { // from class: X.14Li
                    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
                    public final int checkUrl(String str) {
                        int iCheckUrlValid = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().checkUrlValid(str);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkUrl, url=");
                        sbLIZ.append(str);
                        sbLIZ.append(", result=");
                        sbLIZ.append(iCheckUrlValid);
                        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                        return iCheckUrlValid;
                    }

                    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
                    public final HashMap<String, String> getHeader(String str) {
                        HashMap<String, String> map = new HashMap<>();
                        if (C123100dR.LIZ(str)) {
                            C844470XAv.LIZ.getClass();
                            map.put("X-App-Id", String.valueOf(C844470XAv.LJIIJ));
                            map.put("X-Device-Id", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
                            String userTTToken = C0CHQ.LIZ().getAccountService().getUserTTToken();
                            if (userTTToken == null) {
                                userTTToken = "";
                            }
                            map.put("X-Tt-Token", userTTToken);
                            C0CHQ.LIZ().getAccountService().getSDKVersion();
                            map.put("Sdk-Version", "2");
                            C0CHQ.LIZ().getAccountService().LJ();
                            map.put("Passport-Sdk-Version", "1");
                            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
                            INetworkDebugService iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class, false, false);
                            if (iNetworkDebugService != null) {
                                iNetworkDebugService.LIZIZ();
                            }
                            String str2 = "prod";
                            if (localTestApi.enablePpe()) {
                                String pPELane = localTestApi.getPPELane();
                                if (pPELane != null) {
                                    str2 = pPELane;
                                }
                                map.put("x-tt-env", str2);
                                map.put("x-use-ppe", "1");
                            } else if (localTestApi.enableBoe()) {
                                String boeLane = localTestApi.getBoeLane();
                                if (boeLane != null) {
                                    str2 = boeLane;
                                }
                                map.put("x-tt-env", str2);
                                map.put("x-use-boe", "1");
                                return map;
                            }
                        }
                        return map;
                    }

                    @Override // com.bef.effectsdk.GeneralParam.GetNetWorkInfo
                    public final HashMap<String, String> getParam(String str) {
                        HashMap<String, String> map = new HashMap<>();
                        if (C123100dR.LIZ(str)) {
                            C0XDN.LIZJ(map, true);
                        }
                        return map;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
            public final String getParamByKey(String str) {
                return GeneralParam.nativeGetParamByKey(str);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
            public final void setParams(HashMap<String, String> map) {
                GeneralParam.nativeSetParams(map);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IGeneralParam
            public final void setParamWithKey(String str, String str2) {
                GeneralParam.nativeSetParamWithKey(str, str2);
            }
        };
    }
}
