package ttpobfuscated;

import X.C15438062q;
import X.C1954807lC;
import X.C2095008Iq;
import X.C2097908Jt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;
import ttp.orbu.sdk.Channel;
import ttp.orbu.sdk.ITTPOrbuAppToAppRequestPayload;
import ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload;
import ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload;
import ttp.orbu.sdk.ITTPOrbuLiveSEIRequestPayload;
import ttp.orbu.sdk.ITTPOrbuLiveVideoRequestPayload;
import ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload;
import ttp.orbu.sdk.ITTPOrbuRequest;
import ttp.orbu.sdk.ITTPOrbuRequestPayload;
import ttp.orbu.sdk.ITTPOrbuSDKRequestPayload;
import ttp.orbu.sdk.ITTPOrbuSettingsRequestPayload;
import ttp.orbu.sdk.ITTPOrbuSystemAPIRequestPayload;
import ttp.orbu.sdk.ITTPOrbuWebRequestPayload;
import ttp.orbu.sdk.ITTPOrbuWebRouterRequestPayload;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class dc {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[Channel.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[Channel.WEB_ROUTER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[Channel.APP_TO_APP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[Channel.SETTINGS.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[Channel.SDK.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[Channel.GECKO.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[Channel.SYSTEM_API.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[Channel.LIVE_VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr[Channel.LIVE_AUDIO.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                iArr[Channel.LIVE_SEI.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            a = iArr;
        }
    }

    public static final String a(Channel channel) {
        switch (a.a[channel.ordinal()]) {
            case 1:
                return "network";
            case 2:
                return "web";
            case 3:
                return "webrouter";
            case 4:
                return "apptoapp";
            case 5:
                return "settings";
            case 6:
                return "sdk";
            case 7:
                return "gecko";
            case 8:
                return "systemAPI";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "liveVideo";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "liveAudio";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "liveSei";
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final <T extends ITTPOrbuRequestPayload> cc a(ITTPOrbuRequest<? extends T> iTTPOrbuRequest, long j) throws h3 {
        ITTPOrbuLiveSEIRequestPayload iTTPOrbuLiveSEIRequestPayload;
        ITTPOrbuLiveAudioRequestPayload iTTPOrbuLiveAudioRequestPayload;
        ITTPOrbuLiveVideoRequestPayload iTTPOrbuLiveVideoRequestPayload;
        ITTPOrbuSystemAPIRequestPayload iTTPOrbuSystemAPIRequestPayload;
        ITTPOrbuGeckoRequestPayload iTTPOrbuGeckoRequestPayload;
        ITTPOrbuSDKRequestPayload iTTPOrbuSDKRequestPayload;
        ITTPOrbuSettingsRequestPayload iTTPOrbuSettingsRequestPayload;
        ITTPOrbuAppToAppRequestPayload iTTPOrbuAppToAppRequestPayload;
        ITTPOrbuWebRouterRequestPayload iTTPOrbuWebRouterRequestPayload;
        ITTPOrbuWebRequestPayload iTTPOrbuWebRequestPayload;
        ?? EmptyMap;
        Set<Map.Entry<String, String>> setEntrySet;
        ITTPOrbuNetworkRequestPayload iTTPOrbuNetworkRequestPayload;
        String str = iTTPOrbuRequest.metadata().get("x-tt-dataflow-id");
        Integer numLJIIJJI = null;
        if (str != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        String str2 = "";
        switch (a.a[iTTPOrbuRequest.channel().ordinal()]) {
            case 1:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload instanceof ITTPOrbuNetworkRequestPayload) && (iTTPOrbuNetworkRequestPayload = (ITTPOrbuNetworkRequestPayload) iTTPOrbuRequestPayloadPayload) != null) {
                    String strUrl = iTTPOrbuNetworkRequestPayload.url();
                    if (strUrl != null) {
                        String strMethod = iTTPOrbuNetworkRequestPayload.method();
                        byte[] bArrData = iTTPOrbuNetworkRequestPayload.data();
                        Map<String, List<String>> mapHeaders = iTTPOrbuNetworkRequestPayload.headers();
                        if (mapHeaders == null) {
                            mapHeaders = Collections.emptyMap();
                        }
                        return new cc(a(iTTPOrbuRequest.channel()), new Request.Http(numLJIIJJI, strUrl, strMethod, bArrData, mapHeaders, new Date()), j, iTTPOrbuRequest.metadata());
                    }
                    throw new h3("URL cannot be null");
                }
                throw new h3("Unexpected payload type, ITTPOrbuNetworkRequestPayload was expected");
            case 2:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload2 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload2 instanceof ITTPOrbuWebRequestPayload) && (iTTPOrbuWebRequestPayload = (ITTPOrbuWebRequestPayload) iTTPOrbuRequestPayloadPayload2) != null) {
                    Map<String, String> mapHeaders2 = iTTPOrbuWebRequestPayload.headers();
                    if (mapHeaders2 != null && (setEntrySet = mapHeaders2.entrySet()) != null) {
                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                        if (iLIZIZ < 16) {
                            iLIZIZ = 16;
                        }
                        EmptyMap = new LinkedHashMap(iLIZIZ);
                        for (Map.Entry<String, String> entry : setEntrySet) {
                            String key = entry.getKey();
                            List listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(entry.getValue(), new char[]{','}, false, 0, 6);
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                            Iterator it2 = listLJJLIIIJ.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(kotlin.text.a0.LJLIIIL((String) it2.next()).toString());
                            }
                            Pair pair = new Pair(key, arrayList);
                            EmptyMap.put(pair.getFirst(), pair.getSecond());
                        }
                    } else {
                        EmptyMap = Collections.emptyMap();
                    }
                    String strUrl2 = iTTPOrbuWebRequestPayload.url();
                    if (strUrl2 != null) {
                        return new cc(a(iTTPOrbuRequest.channel()), new Request.Http(numLJIIJJI, strUrl2, iTTPOrbuWebRequestPayload.method(), iTTPOrbuWebRequestPayload.data(), EmptyMap, new Date()), j, iTTPOrbuRequest.metadata());
                    }
                    throw new h3("URL cannot be null");
                }
                throw new h3("Unexpected payload type, ITTPOrbuWebRequestPayload was expected");
            case 3:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload3 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload3 instanceof ITTPOrbuWebRouterRequestPayload) && (iTTPOrbuWebRouterRequestPayload = (ITTPOrbuWebRouterRequestPayload) iTTPOrbuRequestPayloadPayload3) != null) {
                    String strUrl3 = iTTPOrbuWebRouterRequestPayload.url();
                    if (strUrl3 == null) {
                        strUrl3 = "";
                    }
                    String strWebviewRuntime = iTTPOrbuWebRouterRequestPayload.webviewRuntime();
                    if (strWebviewRuntime == null) {
                        strWebviewRuntime = "";
                    }
                    String strRouterString = iTTPOrbuWebRouterRequestPayload.routerString();
                    if (strRouterString == null) {
                        strRouterString = "";
                    }
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.WebRouter(numLJIIJJI, strUrl3, strWebviewRuntime, strRouterString, new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuWebRouterRequestPayload was expected");
            case 4:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload4 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload4 instanceof ITTPOrbuAppToAppRequestPayload) && (iTTPOrbuAppToAppRequestPayload = (ITTPOrbuAppToAppRequestPayload) iTTPOrbuRequestPayloadPayload4) != null) {
                    String strTargetAppName = iTTPOrbuAppToAppRequestPayload.targetAppName();
                    if (strTargetAppName != null) {
                        str2 = strTargetAppName;
                    }
                    JSONObject jSONObjectSharedData = iTTPOrbuAppToAppRequestPayload.sharedData();
                    if (jSONObjectSharedData == null) {
                        jSONObjectSharedData = new JSONObject();
                    }
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.AppToApp(numLJIIJJI, str2, jSONObjectSharedData, new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuAppToAppRequestPayload was expected");
            case 5:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload5 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload5 instanceof ITTPOrbuSettingsRequestPayload) && (iTTPOrbuSettingsRequestPayload = (ITTPOrbuSettingsRequestPayload) iTTPOrbuRequestPayloadPayload5) != null) {
                    StringBuilder sb = new StringBuilder("{settingsResponse:");
                    String str3 = iTTPOrbuSettingsRequestPayload.settingsResponse();
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.Configuration(numLJIIJJI, new JSONObject(n0.a(sb, str2, '}')), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuSettingsRequestPayload was expected");
            case 6:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload6 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload6 instanceof ITTPOrbuSDKRequestPayload) && (iTTPOrbuSDKRequestPayload = (ITTPOrbuSDKRequestPayload) iTTPOrbuRequestPayloadPayload6) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.SDK(numLJIIJJI, iTTPOrbuSDKRequestPayload.sdkDescriptor(), iTTPOrbuSDKRequestPayload.methodName(), iTTPOrbuSDKRequestPayload.params(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuSDKRequestPayload was expected");
            case 7:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload7 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload7 instanceof ITTPOrbuGeckoRequestPayload) && (iTTPOrbuGeckoRequestPayload = (ITTPOrbuGeckoRequestPayload) iTTPOrbuRequestPayloadPayload7) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.Gecko(numLJIIJJI, iTTPOrbuGeckoRequestPayload.temporaryPath(), iTTPOrbuGeckoRequestPayload.geckoFilePath(), iTTPOrbuGeckoRequestPayload.sourceChannel(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuGeckoRequestPayload was expected");
            case 8:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload8 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload8 instanceof ITTPOrbuSystemAPIRequestPayload) && (iTTPOrbuSystemAPIRequestPayload = (ITTPOrbuSystemAPIRequestPayload) iTTPOrbuRequestPayloadPayload8) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.SystemAPI(numLJIIJJI, iTTPOrbuSystemAPIRequestPayload.className(), iTTPOrbuSystemAPIRequestPayload.methodName(), iTTPOrbuSystemAPIRequestPayload.params(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuSystemAPIRequestPayload was expected");
            case BdTuring.TYPE_ECAF /* 9 */:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload9 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload9 instanceof ITTPOrbuLiveVideoRequestPayload) && (iTTPOrbuLiveVideoRequestPayload = (ITTPOrbuLiveVideoRequestPayload) iTTPOrbuRequestPayloadPayload9) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.LiveVideo(numLJIIJJI, iTTPOrbuLiveVideoRequestPayload.textureId(), iTTPOrbuLiveVideoRequestPayload.bitmap(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPLiveVideoRequestPayload was expected");
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload10 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload10 instanceof ITTPOrbuLiveAudioRequestPayload) && (iTTPOrbuLiveAudioRequestPayload = (ITTPOrbuLiveAudioRequestPayload) iTTPOrbuRequestPayloadPayload10) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.LiveAudio(numLJIIJJI, iTTPOrbuLiveAudioRequestPayload.buffer(), iTTPOrbuLiveAudioRequestPayload.samplesPerChannel(), iTTPOrbuLiveAudioRequestPayload.sampleRate(), iTTPOrbuLiveAudioRequestPayload.channel(), iTTPOrbuLiveAudioRequestPayload.timestamp(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPOrbuLiveAudioRequestPayload was expected");
            case BdTuring.TYPE_EMAIL /* 11 */:
                ITTPOrbuRequestPayload iTTPOrbuRequestPayloadPayload11 = iTTPOrbuRequest.payload();
                if ((iTTPOrbuRequestPayloadPayload11 instanceof ITTPOrbuLiveSEIRequestPayload) && (iTTPOrbuLiveSEIRequestPayload = (ITTPOrbuLiveSEIRequestPayload) iTTPOrbuRequestPayloadPayload11) != null) {
                    return new cc(a(iTTPOrbuRequest.channel()), new Request.LiveSEI(numLJIIJJI, iTTPOrbuLiveSEIRequestPayload.seiKey(), iTTPOrbuLiveSEIRequestPayload.seiValue(), new Date()), j, iTTPOrbuRequest.metadata());
                }
                throw new h3("Unexpected payload type, ITTPLiveSEIRequestPayload was expected");
            default:
                throw new C1954807lC();
        }
    }
}
