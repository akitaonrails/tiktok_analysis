package com.bytedance.android.livesdk.game.multidevicesdk.dualdevice;

import X.C0TE2;
import X.C0TE4;
import X.C0TE5;
import X.C0TEB;
import X.C0TED;
import X.C0TEM;
import X.C0TEO;
import X.C0TEX;
import X.C0TEY;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.EnumC743340TDw;
import android.util.Log;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePhoneAsCameraEnableSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS161S1100000_12;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class CastLinkerWrapper implements C0TEX, C0TED, C0TEB {
    public C0TE4 LIZ;

    private final native void nativeCreate();

    private final native void nativeRelease();

    private final native void onConnected(String str);

    private final native void onDisconnected(String str);

    private final native void onError(String str);

    private final native void updateParams(String str);

    public final native int checkConnection();

    public final native void onCastStart();

    public final native void onCastStop();

    public final native void onRevMirrorRequestMsg(String str);

    public final native void setCastSceneNative(int i);

    public final native void setReconnectInterval(double d);

    public final native void startStrategy(int i);

    public final void LJI() {
        GameLiveCrossPlatformSdk gameLiveCrossPlatformSdk = GameLiveCrossPlatformSdk.LIZIZ;
        C0TE5.LIZIZ(1001, this);
        C0TE5.LIZIZ(1002, this);
        C0TE5.LIZIZ(1003, this);
        C0TE5.LIZIZ(1004, this);
        C0TE5.LIZIZ(1007, this);
        GameLiveCrossPlatformSdk.LIZLLL.remove(1006);
        ((CopyOnWriteArrayList) GameLiveCrossPlatformSdk.LJ).remove(this);
        nativeRelease();
    }

    public CastLinkerWrapper() {
        GameLiveCrossPlatformSdk gameLiveCrossPlatformSdk = GameLiveCrossPlatformSdk.LIZIZ;
        C0TE5.LIZ(1001, this);
        C0TE5.LIZ(1002, this);
        C0TE5.LIZ(1003, this);
        C0TE5.LIZ(1004, this);
        C0TE5.LIZ(1007, this);
        ConcurrentHashMap<Integer, C0TED> concurrentHashMap = GameLiveCrossPlatformSdk.LIZLLL;
        if (!concurrentHashMap.containsKey(1006)) {
            concurrentHashMap.put(1006, this);
        }
        ((CopyOnWriteArrayList) GameLiveCrossPlatformSdk.LJ).add(this);
        nativeCreate();
    }

    @Override // X.C0TEB
    public final C474500IjA LIZ(C474500IjA c474500IjA) {
        C0TE4 c0te4 = this.LIZ;
        if (c0te4 != null) {
            C0TE2 c0te2 = c0te4.LIZ;
            c474500IjA.LJJII(c0te2.LIZ, "room_id");
            c474500IjA.LJJII(Long.valueOf(c0te2.LIZIZ), "user_id");
            c474500IjA.LJJII(Boolean.valueOf(c0te2.LJII), "is_in_background");
        }
        return c474500IjA;
    }

    public final void LIZLLL(ICastSource$CastConnectionMessage iCastSource$CastConnectionMessage) {
        String json;
        if (this.LIZ != null && (json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, iCastSource$CastConnectionMessage)) != null) {
            onConnected(json);
        }
    }

    public final void LJ(ICastSource$CastConnectionMessage iCastSource$CastConnectionMessage) {
        String json;
        if (this.LIZ != null && (json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, iCastSource$CastConnectionMessage)) != null) {
            onDisconnected(json);
        }
    }

    public final void LJFF(ICastSource$CastErrorMessage iCastSource$CastErrorMessage) {
        String json;
        if (this.LIZ != null && (json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, iCastSource$CastErrorMessage)) != null) {
            onDisconnected(json);
        }
    }

    public final void LJII(ICastSource$CastParams iCastSource$CastParams) {
        String json;
        if (this.LIZ != null && (json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, iCastSource$CastParams)) != null) {
            updateParams(json);
        }
    }

    @Override // X.C0TED
    public final String LIZIZ(int i, Object obj) {
        String string;
        Object objFromJson;
        boolean z;
        if (i == 1006 && obj != null && (string = obj.toString()) != null && this.LIZ != null) {
            String strLIZ = null;
            try {
                objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, string, (Class<Object>) ICastSource$CastSourceDetectParams.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString(e));
                objFromJson = null;
            }
            ICastSource$CastSourceDetectParams iCastSource$CastSourceDetectParams = (ICastSource$CastSourceDetectParams) objFromJson;
            if (iCastSource$CastSourceDetectParams != null) {
                boolean z2 = false;
                if (GamePhoneAsCameraEnableSetting.INSTANCE.enable()) {
                    C0TE4 c0te4 = this.LIZ;
                    if (c0te4 != null) {
                        strLIZ = c0te4.LIZ(iCastSource$CastSourceDetectParams);
                    }
                    if (strLIZ != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    strLIZ = String.valueOf(z);
                } else {
                    C0TE4 c0te42 = this.LIZ;
                    if (c0te42 != null) {
                        strLIZ = c0te42.LIZ(iCastSource$CastSourceDetectParams);
                    }
                }
                if (strLIZ == null || strLIZ.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    return "";
                }
                return strLIZ;
            }
        }
        return "";
    }

    @Override // X.C0TEX
    public final void LIZJ(int i, Object obj) {
        String string;
        Object objFromJson;
        C0TE4 c0te4;
        C0TE2 c0te2;
        ServiceInfo serviceInfo;
        C0TEO c0teo;
        C0TEO c0teo2;
        if (i != 1007) {
            switch (i) {
                case 1001:
                    C0TE4 c0te42 = this.LIZ;
                    if (c0te42 != null && (serviceInfo = (c0te2 = c0te42.LIZ).LJIILIIL) != null && (c0teo = c0te2.LJ) != null) {
                        C0TEM.LIZIZ(new AwS413S0200000_12(c0teo, serviceInfo, 39));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("connect() info = ");
                        sbLIZ.append(serviceInfo);
                        C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ));
                        break;
                    }
                    break;
                case 1002:
                    C0TE4 c0te43 = this.LIZ;
                    if (c0te43 != null) {
                        c0te43.LIZ.LIZIZ();
                    }
                    break;
                case 1003:
                    C0TE4 c0te44 = this.LIZ;
                    if (c0te44 != null) {
                        C0TE2 c0te22 = c0te44.LIZ;
                        if (c0te22.LJIIJJI != null) {
                            C0TEO c0teo3 = c0te22.LJ;
                            if (c0teo3 != null) {
                                c0teo3.LIZ(10013, "xxx-v-display");
                            }
                            C0TEO c0teo4 = c0te22.LJ;
                            if (c0teo4 != null) {
                                c0teo4.LIZ(10053, Boolean.TRUE);
                            }
                            C0TEO c0teo5 = c0te22.LJ;
                            if (c0teo5 != null) {
                                c0teo5.LIZ(10017, Boolean.FALSE);
                            }
                            ICastSource$CastParams iCastSource$CastParams = c0te22.LJIIJJI;
                            if (iCastSource$CastParams != null) {
                                MirrorInfo mirrorInfoLIZ = C0TEM.LIZ(c0te22.LJIIL, iCastSource$CastParams.videoWidth, iCastSource$CastParams.videoHeight, iCastSource$CastParams.fps, c0te22.LJ);
                                C0TEO c0teo6 = c0te22.LJ;
                                if (c0teo6 != null) {
                                    C0TEM.LIZIZ(new AwS413S0200000_12(c0teo6, mirrorInfoLIZ, 43));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("setMirrorInfo() mirrorInfo = ");
                                    sbLIZ2.append(mirrorInfoLIZ);
                                    C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                            C0TEO c0teo7 = c0te22.LJ;
                            if (c0teo7 != null) {
                                C0TEM.LIZIZ(new AwS161S1100000_12(c0teo7, 1));
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("startMirror() protocol = ");
                                sbLIZ3.append("ByteLink");
                                C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    }
                    break;
                case 1004:
                    C0TE4 c0te45 = this.LIZ;
                    if (c0te45 != null && (c0teo2 = c0te45.LIZ.LJ) != null) {
                        C0TEM.LIZIZ(new AwS161S1100000_12(c0teo2, 2));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("stopMirror() protocol = ");
                        sbLIZ4.append("ByteLink");
                        C20441214yg.LJIIIZ("ByteCastSourceWrapper", C2188811AlT.LIZIZ(sbLIZ4));
                        break;
                    }
                    break;
            }
            return;
        }
        if (obj == null || (string = obj.toString()) == null || this.LIZ == null) {
            return;
        }
        try {
            objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, string, (Class<Object>) ICastSource$StrategyFinishResult.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("GameDualDeviceSourceLink2", Log.getStackTraceString(e));
            objFromJson = null;
        }
        ICastSource$StrategyFinishResult iCastSource$StrategyFinishResult = (ICastSource$StrategyFinishResult) objFromJson;
        if (iCastSource$StrategyFinishResult == null || (c0te4 = this.LIZ) == null) {
            return;
        }
        int i2 = iCastSource$StrategyFinishResult.type;
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (iCastSource$StrategyFinishResult.status == 0) {
                        c0te4.LIZ.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_MIRRORING);
                    } else {
                        C0TE2.LJIIJ(c0te4.LIZ, 2, false, true, 2);
                    }
                }
            } else if (iCastSource$StrategyFinishResult.status == 0) {
                c0te4.LIZ.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_MIRRORING);
            } else {
                c0te4.LIZ.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_RECONNECT_FAILED);
            }
        } else {
            if (iCastSource$StrategyFinishResult.status == 0) {
                c0te4.LIZ.LJIIIZ.onNext(EnumC743340TDw.CAST_STATE_MIRRORING);
            } else {
                C0TE2.LJIIJ(c0te4.LIZ, 2, false, true, 2);
            }
            if (iCastSource$StrategyFinishResult.status == 0) {
                z = true;
            }
            C0TEY.LJIIIIZZ = z;
            C0TEY.LJIIIZ = z;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onStrategyFinishResult result.type = ");
        sbLIZ5.append(iCastSource$StrategyFinishResult.type);
        sbLIZ5.append(",result.status = ");
        sbLIZ5.append(iCastSource$StrategyFinishResult.status);
        C20441214yg.LJIIIZ("GameDualDeviceSourceLink2", C2188811AlT.LIZIZ(sbLIZ5));
    }
}
