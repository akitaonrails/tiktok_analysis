package ttpobfuscated;

import X.C08FF;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public enum f9 {
    Host(1),
    Scheme(2),
    Port(4),
    Method(8),
    Path(16),
    FullUrl(32),
    DataFlowId(64),
    Header(128),
    QueryParams(256),
    RouterString(512),
    WebViewRuntime(1024),
    Sdk(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE),
    Function(SpeechEngineDefines.TTS_WORK_MODE_BOTH),
    SdkParams(8192),
    SystemApi(16384),
    SystemParams(32768),
    LiveSei(65536),
    TargetApp(131072),
    Json(262144);

    public static final a b = new a();
    public final int a;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class a {

        /* JADX INFO: renamed from: ttpobfuscated.f9$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes24.dex */
        public /* synthetic */ class C0053a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[f9.values().length];
                try {
                    iArr[f9.FullUrl.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[f9.Host.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[f9.Scheme.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                try {
                    iArr[f9.Port.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                try {
                    iArr[f9.Method.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                try {
                    iArr[f9.Path.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                try {
                    iArr[f9.DataFlowId.ordinal()] = 7;
                } catch (NoSuchFieldError e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                try {
                    iArr[f9.Header.ordinal()] = 8;
                } catch (NoSuchFieldError e8) {
                    TryCatchGuardChecker.doCheck(e8);
                }
                try {
                    iArr[f9.QueryParams.ordinal()] = 9;
                } catch (NoSuchFieldError e9) {
                    TryCatchGuardChecker.doCheck(e9);
                }
                try {
                    iArr[f9.Sdk.ordinal()] = 10;
                } catch (NoSuchFieldError e10) {
                    TryCatchGuardChecker.doCheck(e10);
                }
                try {
                    iArr[f9.Function.ordinal()] = 11;
                } catch (NoSuchFieldError e11) {
                    TryCatchGuardChecker.doCheck(e11);
                }
                try {
                    iArr[f9.SdkParams.ordinal()] = 12;
                } catch (NoSuchFieldError e12) {
                    TryCatchGuardChecker.doCheck(e12);
                }
                try {
                    iArr[f9.RouterString.ordinal()] = 13;
                } catch (NoSuchFieldError e13) {
                    TryCatchGuardChecker.doCheck(e13);
                }
                try {
                    iArr[f9.WebViewRuntime.ordinal()] = 14;
                } catch (NoSuchFieldError e14) {
                    TryCatchGuardChecker.doCheck(e14);
                }
                try {
                    iArr[f9.SystemApi.ordinal()] = 15;
                } catch (NoSuchFieldError e15) {
                    TryCatchGuardChecker.doCheck(e15);
                }
                try {
                    iArr[f9.SystemParams.ordinal()] = 16;
                } catch (NoSuchFieldError e16) {
                    TryCatchGuardChecker.doCheck(e16);
                }
                try {
                    iArr[f9.TargetApp.ordinal()] = 17;
                } catch (NoSuchFieldError e17) {
                    TryCatchGuardChecker.doCheck(e17);
                }
                try {
                    iArr[f9.Json.ordinal()] = 18;
                } catch (NoSuchFieldError e18) {
                    TryCatchGuardChecker.doCheck(e18);
                }
                try {
                    iArr[f9.LiveSei.ordinal()] = 19;
                } catch (NoSuchFieldError e19) {
                    TryCatchGuardChecker.doCheck(e19);
                }
                a = iArr;
            }
        }

        public final List<f9> a(int i) {
            f9[] f9VarArrValues = f9.values();
            ArrayList arrayList = new ArrayList();
            for (f9 f9Var : f9VarArrValues) {
                if ((f9Var.a & i) != 0) {
                    arrayList.add(f9Var);
                }
            }
            return arrayList;
        }

        public final Map<String, String> a(List<? extends f9> list, Request request) throws JSONException {
            Map<String, Object> map;
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (request instanceof Request.Http) {
                for (f9 f9Var : list) {
                    String strValueOf = String.valueOf(f9Var.a);
                    switch (C0053a.a[f9Var.ordinal()]) {
                        case 1:
                            linkedHashMap.put(strValueOf, ((Request.Http) request).c);
                            break;
                        case 2:
                            String strB = ((ng) ((Request.Http) request).h.getValue()).b();
                            if (strB != null) {
                                linkedHashMap.put(strValueOf, strB);
                            }
                            break;
                        case 3:
                            String strK = ((ng) ((Request.Http) request).h.getValue()).k();
                            if (strK != null) {
                                linkedHashMap.put(strValueOf, strK);
                            }
                            break;
                        case 4:
                            Integer numC = ((ng) ((Request.Http) request).h.getValue()).c();
                            if (numC != null) {
                                linkedHashMap.put(strValueOf, String.valueOf(numC.intValue()));
                            }
                            break;
                        case 5:
                            String strH = ((ng) ((Request.Http) request).h.getValue()).h();
                            if (strH != null) {
                                linkedHashMap.put(strValueOf, strH);
                            }
                            break;
                        case 6:
                            ((ng) ((Request.Http) request).h.getValue()).getPath();
                            break;
                        case 7:
                            request.c();
                            break;
                        case 8:
                            linkedHashMap.put(strValueOf, ze.a(((ng) ((Request.Http) request).h.getValue()).l(), ",", ":"));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            Map<String, List<String>> mapA = ((ng) ((Request.Http) request).h.getValue()).a();
                            if (mapA != null) {
                                linkedHashMap.put(strValueOf, ze.a(mapA, "&", "="));
                            }
                            break;
                    }
                }
            } else if (request instanceof Request.SDK) {
                for (f9 f9Var2 : list) {
                    String strValueOf2 = String.valueOf(f9Var2.a);
                    int i = C0053a.a[f9Var2.ordinal()];
                    if (i != 7) {
                        switch (i) {
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                linkedHashMap.put(strValueOf2, ((Request.SDK) request).c);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                linkedHashMap.put(strValueOf2, ((Request.SDK) request).d);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                Map<String, Object> map2 = ((Request.SDK) request).e;
                                if (map2 != null) {
                                    linkedHashMap.put(strValueOf2, ze.a(map2));
                                }
                                break;
                        }
                    } else {
                        linkedHashMap.put(strValueOf2, String.valueOf(request.c()));
                    }
                }
            } else if (request instanceof Request.WebRouter) {
                for (f9 f9Var3 : list) {
                    String strValueOf3 = String.valueOf(f9Var3.a);
                    int i2 = C0053a.a[f9Var3.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 7) {
                            if (i2 != 13) {
                                if (i2 == 14 && (str = ((Request.WebRouter) request).d) != null) {
                                    linkedHashMap.put(strValueOf3, str);
                                }
                            } else {
                                String str2 = ((Request.WebRouter) request).e;
                                if (str2 != null) {
                                    linkedHashMap.put(strValueOf3, str2);
                                }
                            }
                        } else {
                            linkedHashMap.put(strValueOf3, String.valueOf(request.c()));
                        }
                    } else {
                        String str3 = ((Request.WebRouter) request).c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedHashMap.put(strValueOf3, str3);
                    }
                }
            } else if (request instanceof Request.SystemAPI) {
                for (f9 f9Var4 : list) {
                    String strValueOf4 = String.valueOf(f9Var4.a);
                    int i3 = C0053a.a[f9Var4.ordinal()];
                    if (i3 != 7) {
                        if (i3 != 11) {
                            if (i3 != 15) {
                                if (i3 == 16 && (map = ((Request.SystemAPI) request).e) != null) {
                                    linkedHashMap.put(strValueOf4, ze.a(map));
                                }
                            } else {
                                linkedHashMap.put(strValueOf4, ((Request.SystemAPI) request).c);
                            }
                        } else {
                            linkedHashMap.put(strValueOf4, ((Request.SystemAPI) request).d);
                        }
                    } else {
                        linkedHashMap.put(strValueOf4, String.valueOf(request.c()));
                    }
                }
            } else if (request instanceof Request.AppToApp) {
                for (f9 f9Var5 : list) {
                    String strValueOf5 = String.valueOf(f9Var5.a);
                    int i4 = C0053a.a[f9Var5.ordinal()];
                    if (i4 != 7) {
                        if (i4 != 17) {
                            if (i4 == 18) {
                                JSONObject jSONObject = ((Request.AppToApp) request).d;
                                if (jSONObject == null) {
                                    jSONObject = new JSONObject();
                                }
                                linkedHashMap.put(strValueOf5, C786410Ut5.J3(jSONObject));
                            }
                        } else {
                            String str4 = ((Request.AppToApp) request).c;
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put(strValueOf5, str4);
                        }
                    } else {
                        linkedHashMap.put(strValueOf5, String.valueOf(request.c()));
                    }
                }
            } else if (request instanceof Request.LiveSEI) {
                for (f9 f9Var6 : list) {
                    String strValueOf6 = String.valueOf(f9Var6.a);
                    int i5 = C0053a.a[f9Var6.ordinal()];
                    if (i5 != 7) {
                        if (i5 == 19) {
                            JSONObject jSONObject2 = new JSONObject();
                            Request.LiveSEI liveSEI = (Request.LiveSEI) request;
                            String str5 = liveSEI.c;
                            Object obj = liveSEI.d;
                            if (obj == null) {
                                obj = "";
                            }
                            jSONObject2.put(str5, obj);
                            linkedHashMap.put(strValueOf6, C786410Ut5.J3(jSONObject2));
                        }
                    } else {
                        linkedHashMap.put(strValueOf6, String.valueOf(request.c()));
                    }
                }
            } else if ((request instanceof Request.Configuration) || (request instanceof Request.Gecko) || (request instanceof Request.PreDefinedFlow) || (request instanceof Request.LiveVideo) || (request instanceof Request.LiveAudio)) {
                for (f9 f9Var7 : list) {
                    String strValueOf7 = String.valueOf(f9Var7.a);
                    if (C0053a.a[f9Var7.ordinal()] == 7) {
                        linkedHashMap.put(strValueOf7, String.valueOf(request.c()));
                    }
                }
            }
            return linkedHashMap;
        }
    }

    public final int b() {
        return this.a;
    }

    public static f9 valueOf(String str) {
        return (f9) C08FF.LIZ(f9.class, str);
    }

    f9(int i) {
        this.a = i;
    }
}
