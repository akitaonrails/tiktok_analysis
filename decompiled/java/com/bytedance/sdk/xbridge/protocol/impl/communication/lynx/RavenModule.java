package com.bytedance.sdk.xbridge.protocol.impl.communication.lynx;

import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161780gL2;
import X.C1162700gMW;
import X.C1165930gRj;
import X.C1297720jsI;
import X.C1298830ju5;
import X.C1543190qGD;
import X.C189200o6;
import X.C2097908Jt;
import X.C2348609Ie;
import X.C786410Ut5;
import X.InterfaceC1063790dmz;
import android.content.Context;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.lynx.RavenModule;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.PiperData;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class RavenModule extends LynxModule {
    public static final C1298830ju5 Companion = new Object() { // from class: X.0ju5
    };
    public final String TAG;
    public final C1543190qGD bridgeContext;
    public final Context context;
    public final Object params;
    public final C1165930gRj ravenModuleParams;

    public final boolean checkContext() {
        return (this.bridgeContext == null || this.ravenModuleParams == null) ? false : true;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getParams() {
        return this.params;
    }

    private final Object getData(ReadableMap readableMap) {
        ReadableType type;
        if (readableMap != null && (type = readableMap.getType("data")) != null) {
            switch (C1297720jsI.LIZ[type.ordinal()]) {
                case 2:
                    return Boolean.valueOf(readableMap.getBoolean("data"));
                case 3:
                    return Integer.valueOf(readableMap.getInt("data"));
                case 4:
                    return Long.valueOf(readableMap.getLong("data"));
                case 5:
                    return Double.valueOf(readableMap.getDouble("data"));
                case 6:
                    return readableMap.getString("data");
                case 7:
                    return readableMap.getMap("data");
                case 8:
                    return readableMap.getArray("data");
                case BdTuring.TYPE_ECAF /* 9 */:
                    return readableMap.getByteArray("data");
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return readableMap.getPiperData("data");
            }
        }
        return null;
    }

    @InterfaceC1063790dmz
    public final PiperData getRavenData(String str) throws Throwable {
        String strJ3;
        IRavenDataAbility iRavenDataAbility;
        RavenData<Object> ravenDataNH;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "getRavenData", this, new Object[]{str}, "com.lynx.react.bridge.PiperData", new C0WZW(false, "(Ljava/lang/String;)Lcom/lynx/react/bridge/PiperData;", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (PiperData) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj == null || (iRavenDataAbility = c1165930gRj.LIZ) == null || (ravenDataNH = iRavenDataAbility.nH(str)) == null || (strJ3 = C2348609Ie.LJ(ravenDataNH)) == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) null);
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        PiperData piperDataLIZIZ = PiperData.LIZIZ(strJ3);
        if (piperDataLIZIZ.LIZJ()) {
            return new PiperData(C2097908Jt.LIZJ(new Pair("data", "data format error")));
        }
        return piperDataLIZIZ;
    }

    public RavenModule(Context context, Object obj) {
        C1165930gRj c1165930gRj;
        super(context, obj);
        this.context = context;
        this.params = obj;
        this.TAG = "raven";
        C1543190qGD c1543190qGD = (C1543190qGD) obj;
        this.bridgeContext = c1543190qGD;
        if (c1543190qGD != null) {
            c1165930gRj = c1543190qGD.LJIILLIIL;
        } else {
            c1165930gRj = null;
        }
        this.ravenModuleParams = c1165930gRj;
    }

    @InterfaceC1063790dmz
    public final void sendRavenEvent(String str, ReadableMap readableMap) throws Throwable {
        Object objValueOf;
        long jCurrentTimeMillis;
        IRavenEventAbility iRavenEventAbility;
        Object obj = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "sendRavenEvent", this, new Object[]{str, readableMap}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj2 = objArr[0];
            if (obj2 != null) {
                str = (String) obj2;
            }
            Object obj3 = objArr[1];
            if (obj3 != null) {
                readableMap = (ReadableMap) obj3;
            }
        }
        checkContext();
        if (readableMap == null) {
            objValueOf = null;
        } else {
            try {
                objValueOf = Long.valueOf(readableMap.getLong("timestamp"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objValueOf = new C098200Yq(th);
                C189200o6.m2constructorimpl(objValueOf);
            }
        }
        C189200o6.m2constructorimpl(objValueOf);
        if (!C189200o6.m7isFailureimpl(objValueOf)) {
            obj = objValueOf;
        }
        Long l = (Long) obj;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        RavenEvent ravenEvent = new RavenEvent(str, jCurrentTimeMillis, getData(readableMap));
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenEventAbility = c1165930gRj.LIZIZ) != null) {
            iRavenEventAbility.dZ1(ravenEvent);
        }
    }

    @InterfaceC1063790dmz
    public final void setRavenData(String str, ReadableMap readableMap) throws Throwable {
        C1165930gRj c1165930gRj;
        IRavenDataAbility iRavenDataAbility;
        long j;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "setRavenData", this, new Object[]{str, readableMap}, "void", new C0WZW(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                readableMap = (ReadableMap) obj2;
            }
        }
        checkContext();
        try {
            Object data = getData(readableMap);
            if (data != null && (c1165930gRj = this.ravenModuleParams) != null && (iRavenDataAbility = c1165930gRj.LIZ) != null) {
                if (readableMap != null) {
                    j = readableMap.getLong("timestamp");
                } else {
                    j = 0;
                }
                iRavenDataAbility.uJ(str, new RavenData<>(data, j));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @InterfaceC1063790dmz
    public final void subscribeRavenData(final String str, final String str2) throws Throwable {
        IRavenDataAbility iRavenDataAbility;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "subscribeRavenData", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenDataAbility = c1165930gRj.LIZ) != null) {
            iRavenDataAbility.kU0(str, new C1161780gL2(str, str2, this) { // from class: X.0ju2
                public final /* synthetic */ String LIZJ;
                public final /* synthetic */ RavenModule LIZLLL;

                @Override // X.C1161780gL2
                public final void LIZ(RavenData<Object> ravenData) {
                    LynxView lynxView;
                    LynxBackgroundRuntime lynxBackgroundRuntime;
                    PiperData piperDataLIZIZ = PiperData.LIZIZ(C2348609Ie.LJ(ravenData));
                    if (!piperDataLIZIZ.LIZJ()) {
                        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                        String str3 = this.LIZJ;
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        javaOnlyMap.put("key", str3);
                        javaOnlyMap.put("data", piperDataLIZIZ);
                        javaOnlyArray.pushMap(javaOnlyMap);
                        C1543190qGD c1543190qGD = this.LIZLLL.bridgeContext;
                        if (c1543190qGD != null) {
                            lynxView = c1543190qGD.LJFF;
                        } else {
                            lynxView = null;
                        }
                        if (lynxView != null) {
                            lynxView.sendGlobalEvent("raven_data_update", javaOnlyArray);
                        } else {
                            if (c1543190qGD == null || (lynxBackgroundRuntime = c1543190qGD.LJI) == null) {
                                return;
                            }
                            lynxBackgroundRuntime.LJ("raven_data_update", javaOnlyArray);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str, str2);
                    this.LIZJ = str;
                    this.LIZLLL = this;
                }
            });
        }
    }

    @InterfaceC1063790dmz
    public final void subscribeRavenEvent(String str, String str2) throws Throwable {
        IRavenEventAbility iRavenEventAbility;
        final String str3 = str2;
        final String str4 = str;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "subscribeRavenEvent", this, new Object[]{str4, str3}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str4 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str3 = (String) obj2;
            }
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenEventAbility = c1165930gRj.LIZIZ) != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            iRavenEventAbility.Lp0(str4, new C1162700gMW(jCurrentTimeMillis, str4, str3) { // from class: X.0ju3
                @Override // X.C1162700gMW
                public final void LIZ(RavenEvent ravenEvent) {
                    LynxBackgroundRuntime lynxBackgroundRuntime;
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    WritableMap writableMapLIZJ = ravenEvent.LIZJ();
                    LynxView lynxView = null;
                    if ((writableMapLIZJ instanceof JavaOnlyMap) && writableMapLIZJ != null) {
                        javaOnlyArray.pushMap(writableMapLIZJ);
                    }
                    C1543190qGD c1543190qGD = this.bridgeContext;
                    if (c1543190qGD != null) {
                        lynxView = c1543190qGD.LJFF;
                    }
                    if (lynxView != null) {
                        lynxView.sendGlobalEvent("raven_event", javaOnlyArray);
                    } else {
                        if (c1543190qGD == null || (lynxBackgroundRuntime = c1543190qGD.LJI) == null) {
                            return;
                        }
                        lynxBackgroundRuntime.LJ("raven_event", javaOnlyArray);
                    }
                }
            });
        }
    }

    @InterfaceC1063790dmz
    public final void unsubscribeRavenData(String str, String str2) throws Throwable {
        IRavenDataAbility iRavenDataAbility;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "unsubscribeRavenData", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenDataAbility = c1165930gRj.LIZ) != null) {
            iRavenDataAbility.Df2(str, str2);
        }
    }

    @InterfaceC1063790dmz
    public final void unsubscribeRavenEvent(String str, String str2) throws Throwable {
        IRavenEventAbility iRavenEventAbility;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "unsubscribeRavenEvent", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenEventAbility = c1165930gRj.LIZIZ) != null) {
            iRavenEventAbility.Fk2(str, str2);
        }
    }

    @InterfaceC1063790dmz
    public final void subscribeRavenEventWithTimestamp(String str, String str2, long j) throws Throwable {
        IRavenEventAbility iRavenEventAbility;
        final long jLongValue = j;
        String str3 = str2;
        String str4 = str;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/sdk/xbridge/protocol/impl/communication/lynx/RavenModule", "subscribeRavenEventWithTimestamp", this, new Object[]{str4, str3, Long.valueOf(jLongValue)}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;J)V", new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrbsQmXIWPxXF6pkoyD1jZGpWUDmNWs++2WkvAQb8u/Ti6y1oAxe8hXle4JPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str4 = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str3 = (String) obj2;
            }
            Object obj3 = objArr[2];
            if (obj3 != null) {
                jLongValue = ((Long) obj3).longValue();
            }
        }
        checkContext();
        C1165930gRj c1165930gRj = this.ravenModuleParams;
        if (c1165930gRj != null && (iRavenEventAbility = c1165930gRj.LIZIZ) != null) {
            final String str5 = str4;
            final String str6 = str3;
            iRavenEventAbility.Lp0(str4, new C1162700gMW(jLongValue, str5, str6) { // from class: X.0ju4
                @Override // X.C1162700gMW
                public final void LIZ(RavenEvent ravenEvent) {
                    LynxBackgroundRuntime lynxBackgroundRuntime;
                    WritableMap writableMapLIZJ = ravenEvent.LIZJ();
                    LynxView lynxView = null;
                    if (!(writableMapLIZJ instanceof ReadableMap)) {
                        writableMapLIZJ = null;
                    }
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    if (writableMapLIZJ != null) {
                        javaOnlyArray.pushMap(writableMapLIZJ);
                    }
                    C1543190qGD c1543190qGD = this.bridgeContext;
                    if (c1543190qGD != null) {
                        lynxView = c1543190qGD.LJFF;
                    }
                    if (lynxView != null) {
                        lynxView.sendGlobalEvent("raven_event", javaOnlyArray);
                    } else {
                        if (c1543190qGD == null || (lynxBackgroundRuntime = c1543190qGD.LJI) == null) {
                            return;
                        }
                        lynxBackgroundRuntime.LJ("raven_event", javaOnlyArray);
                    }
                }
            });
        }
    }
}
