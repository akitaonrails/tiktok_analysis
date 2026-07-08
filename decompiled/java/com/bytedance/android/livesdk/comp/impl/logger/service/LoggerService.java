package com.bytedance.android.livesdk.comp.impl.logger.service;

import X.AnonymousClass1584;
import X.C01HZ;
import X.C1097220eeu;
import X.C1149410g15;
import X.C1161920gLG;
import X.C1CC3;
import X.C20411014to;
import X.C473430IhR;
import X.C474560IjG;
import X.C978370bZD;
import X.C978380bZE;
import X.InterfaceC1106030et7;
import X.InterfaceC1766280w42;
import X.InterfaceC20441114yf;
import X.InterfaceC474510IjB;
import X.InterfaceC774000UXu;
import X.InterfaceC986020blY;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogForceOpenTestSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.common.utility.Logger;
import com.ss.android.agilelogger.ALog;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import qo2.w;

/* JADX INFO: loaded from: classes32.dex */
public class LoggerService implements ILoggerService {
    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final void Jx1() {
        if (((Boolean) AnonymousClass1584.LIZJ.getValue()).booleanValue()) {
            ((C1097220eeu) AnonymousClass1584.LJ.getValue()).LJ.clear();
        }
        if (((Boolean) AnonymousClass1584.LIZLLL.getValue()).booleanValue()) {
            ((C1097220eeu) AnonymousClass1584.LJFF.getValue()).LJ.clear();
        }
        AnonymousClass1584.LIZIZ = false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final C1CC3 MN2() {
        return new C1149410g15();
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final InterfaceC20441114yf Rp2() {
        return new InterfaceC20441114yf() { // from class: X.14yc
            public Boolean LIZ;

            @Override // X.InterfaceC20441114yf
            public final boolean LIZ() {
                return Logger.debug();
            }

            @Override // X.InterfaceC20441114yf
            public final void d(String str, String str2) {
                LIZLLL(3, str, str2);
            }

            @Override // X.InterfaceC20441114yf
            public final void e(String str, String str2) {
                LIZLLL(6, str, str2);
            }

            @Override // X.InterfaceC20441114yf
            public final void i(String str, String str2) {
                LIZLLL(4, str, str2);
            }

            @Override // X.InterfaceC20441114yf
            public final void v(String str, String str2) {
                LIZLLL(2, str, str2);
            }

            @Override // X.InterfaceC20441114yf
            public final void w(String str, String str2) {
                LIZLLL(5, str, str2);
            }

            public static final void LIZLLL(int i, final String str, String str2) {
                if (!LiveALogForceOpenTestSwitchSetting.INSTANCE.isEnable() && (LiveEnableALogSetting.INSTANCE.isDisable() || C1078850eBH.LIZ(str) || LiveInnerDowngradeAdaptExp.INSTANCE.isDisableAlog() || ScalableDowngradeSetting.disableAlog() || LiveHostAutoAdaptiveParams.disableALog())) {
                    return;
                }
                ExecutorService executorService = AnonymousClass1584.LIZ;
                if (AnonymousClass1584.LIZIZ && ((Boolean) AnonymousClass1584.LIZLLL.getValue()).booleanValue()) {
                    AnonymousClass1584.LIZ.execute(new Runnable() { // from class: X.0IjW
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveLogDensityMonitor@b08.onAlogSend$1");
                            try {
                                ((C1097220eeu) AnonymousClass1584.LJFF.getValue()).LIZ(str);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveLogDensityMonitor@b08.onAlogSend$1");
                        }
                    });
                }
                C1C7U.LIZ("ALogServiceImpl@fc40.print$1L");
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i == 6) {
                                    AbstractC827810Wdf.LIZIZ(str, str2);
                                }
                            } else {
                                AbstractC827810Wdf.LJ(str, str2);
                            }
                        } else {
                            AbstractC827810Wdf.LIZLLL(str, str2);
                        }
                    } else {
                        AbstractC827810Wdf.LIZ(str, str2);
                    }
                } else if (AbstractC827810Wdf.LIZ != null) {
                    AbstractC827810Wdf.LIZ.getClass();
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
                }
                C1C7U.LIZIZ("ALogServiceImpl@fc40.print$1L");
            }

            @Override // X.InterfaceC20441114yf
            public final void LIZIZ(int i, String str, StackTraceElement[] stackTraceElementArr) {
                if (LiveEnableALogSetting.INSTANCE.isEnable()) {
                    C1C7U.LIZ("ALogServiceImpl@fc40.stacktrace$1L");
                    if (AbstractC827810Wdf.LIZ != null) {
                        AbstractC827810Wdf.LIZ.getClass();
                        ALog.stacktrace(i, str, stackTraceElementArr);
                    }
                    C1C7U.LIZIZ("ALogServiceImpl@fc40.stacktrace$1L");
                }
            }

            @Override // X.InterfaceC20441114yf
            public final void LIZJ(EnumC20440914yd enumC20440914yd, String str, InterfaceC1456340o08<String> interfaceC1456340o08) {
                boolean z;
                if (this.LIZ == null) {
                    if (Math.random() > LiveRoomPerfOptSetting.getSampleRate()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LIZ = Boolean.valueOf(z);
                }
                if (this.LIZ.booleanValue()) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    return;
                }
                String str2 = interfaceC1456340o08.get();
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (enumC20440914yd == EnumC20440914yd.V) {
                    LIZLLL(2, str, str2);
                    return;
                }
                if (enumC20440914yd == EnumC20440914yd.D) {
                    LIZLLL(3, str, str2);
                    return;
                }
                if (enumC20440914yd == EnumC20440914yd.I) {
                    LIZLLL(4, str, str2);
                } else if (enumC20440914yd == EnumC20440914yd.W) {
                    LIZLLL(5, str, str2);
                } else {
                    if (enumC20440914yd != EnumC20440914yd.E) {
                        return;
                    }
                    LIZLLL(6, str, str2);
                }
            }

            @Override // X.InterfaceC20441114yf
            public final void e(String str, String str2, Throwable th) {
                LJ(6, str, str2, th);
            }

            @Override // X.InterfaceC20441114yf
            public final void w(String str, String str2, Throwable th) {
                LJ(5, str, str2, th);
            }

            public final void LJ(final int i, final String str, final String str2, final Throwable th) {
                if (!LiveEnableALogSetting.INSTANCE.isDisable() && !C1078850eBH.LIZ(str)) {
                    new Runnable() { // from class: X.0Wde
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20440814yc c20440814yc = this.LL;
                            int i2 = i;
                            String str3 = str;
                            String str4 = str2;
                            Throwable th2 = th;
                            c20440814yc.getClass();
                            C1C7U.LIZ("ALogServiceImpl@fc40.printWithThrowable$1L");
                            boolean zIsEmpty = TextUtils.isEmpty(str4);
                            if (i2 != 5) {
                                if (i2 == 6) {
                                    if (!zIsEmpty) {
                                        AbstractC827810Wdf.LIZJ(str3, str4, th2);
                                    } else if (AbstractC827810Wdf.LIZ != null) {
                                        AbstractC827810Wdf.LIZ.getClass();
                                        ALog.e(str3, th2);
                                    }
                                }
                            } else if (zIsEmpty) {
                                if (AbstractC827810Wdf.LIZ != null) {
                                    AbstractC827810Wdf.LIZ.getClass();
                                    ALog.w(str3, th2);
                                }
                            } else if (AbstractC827810Wdf.LIZ != null) {
                                AbstractC827810Wdf.LIZ.getClass();
                                ALog.w(str3, str4, th2);
                            }
                            C1C7U.LIZIZ("ALogServiceImpl@fc40.printWithThrowable$1L");
                        }
                    }.run();
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final InterfaceC1766280w42 ai1() {
        return new InterfaceC1766280w42() { // from class: X.0IXS
            @Override // X.InterfaceC1766280w42
            public final String LIZ() {
                return "";
            }

            @Override // X.InterfaceC1766280w42
            public final String LIZIZ() {
                return "";
            }

            @Override // X.InterfaceC1766280w42
            public final String LIZJ() {
                Room room;
                w.LIZ.getClass();
                C0IR5 c0ir5LJJIII = w.LJJIII();
                return (c0ir5LJJIII == null || (room = c0ir5LJJIII.LIZIZ) == null) ? "" : C354201Zc.LIZ(room.getStreamType());
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final Context getContext() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final boolean xK2() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && InterfaceC1106030et7.w8.LIZIZ().booleanValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final void xT1() {
        if (((Boolean) AnonymousClass1584.LIZJ.getValue()).booleanValue() || ((Boolean) AnonymousClass1584.LIZLLL.getValue()).booleanValue()) {
            AnonymousClass1584.LIZIZ = true;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final C01HZ ki1() {
        return C978380bZE.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final InterfaceC986020blY mb0() {
        return C20411014to.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final InterfaceC774000UXu G20(String str) {
        return new C978370bZD(str);
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final void setIsAnchor(boolean z) {
        C474560IjG.LJIJJ = z;
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final boolean QM0(String str, Double d) {
        return C473430IhR.LIZ(str, d);
    }

    @Override // com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService
    public final InterfaceC474510IjB WE0(String str, boolean z, Double d) {
        return new C474560IjG(str, z, d);
    }
}
