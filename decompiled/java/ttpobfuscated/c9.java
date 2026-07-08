package ttpobfuscated;

import X.C08FF;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
public enum c9 {
    UserId(1),
    DeviceId(2),
    Region(4),
    Activation(8),
    Platform(16),
    AppVersion(32),
    ConfigVersion(64),
    OrbuHash(128),
    ExtraInfo(256),
    OsVersion(512),
    ClientId(1024),
    TtpVersion(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);

    public static final a b = new a();
    public final int a;

    public static final class a {

        /* JADX INFO: renamed from: ttpobfuscated.c9$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0048a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c9.values().length];
                try {
                    iArr[c9.Activation.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[c9.UserId.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[c9.DeviceId.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                try {
                    iArr[c9.Region.ordinal()] = 4;
                } catch (NoSuchFieldError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                try {
                    iArr[c9.Platform.ordinal()] = 5;
                } catch (NoSuchFieldError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                try {
                    iArr[c9.AppVersion.ordinal()] = 6;
                } catch (NoSuchFieldError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                try {
                    iArr[c9.ConfigVersion.ordinal()] = 7;
                } catch (NoSuchFieldError e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                try {
                    iArr[c9.OrbuHash.ordinal()] = 8;
                } catch (NoSuchFieldError e8) {
                    TryCatchGuardChecker.doCheck(e8);
                }
                try {
                    iArr[c9.OsVersion.ordinal()] = 9;
                } catch (NoSuchFieldError e9) {
                    TryCatchGuardChecker.doCheck(e9);
                }
                try {
                    iArr[c9.ExtraInfo.ordinal()] = 10;
                } catch (NoSuchFieldError e10) {
                    TryCatchGuardChecker.doCheck(e10);
                }
                try {
                    iArr[c9.TtpVersion.ordinal()] = 11;
                } catch (NoSuchFieldError e11) {
                    TryCatchGuardChecker.doCheck(e11);
                }
                try {
                    iArr[c9.ClientId.ordinal()] = 12;
                } catch (NoSuchFieldError e12) {
                    TryCatchGuardChecker.doCheck(e12);
                }
                a = iArr;
            }
        }

        public final List<c9> a(int i) {
            c9[] c9VarArrValues = c9.values();
            ArrayList arrayList = new ArrayList();
            for (c9 c9Var : c9VarArrValues) {
                if ((c9Var.a & i) != 0) {
                    arrayList.add(c9Var);
                }
            }
            return arrayList;
        }

        public final Map<String, String> a(List<? extends c9> list, jg jgVar, GeneralConfig generalConfig, OrbuCodeConfig orbuCodeConfig, v3 v3Var) {
            String str;
            String str2;
            String str3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (c9 c9Var : list) {
                String strValueOf = String.valueOf(c9Var.a);
                switch (C0048a.a[c9Var.ordinal()]) {
                    case 1:
                        linkedHashMap.put(strValueOf, new z5.a(v3Var).a());
                        break;
                    case 2:
                        if (jgVar != null && (str3 = jgVar.a) != null) {
                            linkedHashMap.put(strValueOf, str3);
                        }
                        break;
                    case 3:
                        if (jgVar != null && (str2 = jgVar.b) != null) {
                            linkedHashMap.put(strValueOf, str2);
                        }
                        break;
                    case 4:
                        if (jgVar != null && (str = jgVar.c) != null) {
                            linkedHashMap.put(strValueOf, str);
                        }
                        break;
                    case 5:
                        z5.j.b.getClass();
                        linkedHashMap.put(strValueOf, z5.j.c);
                        break;
                    case 6:
                        linkedHashMap.put(strValueOf, new z5.b(v3Var.h()).c.getValue());
                        break;
                    case 7:
                        linkedHashMap.put(strValueOf, String.valueOf(generalConfig.getVersion()));
                        break;
                    case 8:
                        linkedHashMap.put(strValueOf, orbuCodeConfig.getOrbuHash());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        z5.i.b.getClass();
                        linkedHashMap.put(strValueOf, z5.i.c);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkedHashMap.put(strValueOf, new z5.f(v3Var.y()).a());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        z5.l.b.getClass();
                        linkedHashMap.put(strValueOf, z5.l.c);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        if (jgVar != null) {
                            linkedHashMap.put(strValueOf, new z5.c(jgVar).b);
                        }
                        break;
                }
            }
            return linkedHashMap;
        }

        public static Map a(a aVar, List list, jg jgVar, GeneralConfig generalConfig, OrbuCodeConfig orbuCodeConfig, v3 v3Var, int i, Object obj) {
            if ((i & 16) != 0) {
                v3.s.getClass();
                v3Var = v3.u;
            }
            return aVar.a(list, jgVar, generalConfig, orbuCodeConfig, v3Var);
        }
    }

    public final int b() {
        return this.a;
    }

    public static c9 valueOf(String str) {
        return (c9) C08FF.LIZ(c9.class, str);
    }

    c9(int i) {
        this.a = i;
    }
}
