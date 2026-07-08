package com.bytedance.android.livesdk.broadcast.record;

import X.AbstractC1273900jFs;
import X.C01GW;
import X.C01QD;
import X.C09JN;
import X.C0IJT;
import X.C0TPX;
import X.C0UT9;
import X.C0UVW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11S5;
import X.C1283340jV6;
import X.C142V;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C356901a3;
import X.C465520INi;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C774850UaR;
import X.C774860UaS;
import X.C786410Ut5;
import X.C838130WuJ;
import X.EnumC771350UNp;
import X.InterfaceC1270540jAS;
import X.InterfaceC1283360jV8;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC465240IMg;
import X.InterfaceC769940UIe;
import X.InterfaceC774800UaM;
import X.InterfaceC774810UaN;
import X.InterfaceC774830UaP;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.livesdk.api.LiveRecordApi;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveRecordConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveRecordManager implements DefaultLifecycleObserver, InterfaceC465240IMg, InterfaceC19562711gH, GenericLifecycleObserver {
    public static WeakHandler LLILLJJLI;
    public static BaseBroadcastFragment LLILLL;
    public static volatile boolean LLILZ;
    public static volatile boolean LLILZIL;
    public static int LLIZ;
    public static Intent LLIZLLLIL;
    public static InterfaceC769940UIe LLJ;
    public static InterfaceC774800UaM LLJI;
    public static InterfaceC774830UaP LLJILJIL;
    public static C774860UaS LLJILJILJ;
    public static InterfaceC420801kM LLJILLL;
    public static boolean LLJJ;
    public static boolean LLJJI;
    public static int LLJJIII;
    public static final LiveRecordManager LL = new LiveRecordManager();
    public static boolean LLILZLL = true;
    public static final List<InterfaceC774810UaN> LLJIJIL = new ArrayList();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public static void LJI(int i) {
        Room roomPR;
        BaseBroadcastFragment baseBroadcastFragment = LLILLL;
        if (baseBroadcastFragment != null && (roomPR = baseBroadcastFragment.PR()) != null) {
            long id = roomPR.getId();
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C0UVW c0uvwLIZ = C01QD.LIZ();
            c0uvwLIZ.getClass();
            ((LiveRecordApi) c0uvwLIZ.LIZJ(LiveRecordApi.class)).updateRecordLiveState(id, i, LLJJIII).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0UaK
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecordManager@5f5e.updateLiveRecordState$1$1");
                    C1C7U.LIZIZ("LiveRecordManager@5f5e.updateLiveRecordState$1$1");
                }
            }, new C09JN() { // from class: X.0UaL
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveRecordManager@5f5e.updateLiveRecordState$1$2");
                    C1C7U.LIZIZ("LiveRecordManager@5f5e.updateLiveRecordState$1$2");
                }
            });
        }
    }

    public final void LIZIZ(boolean z) {
        LLILZ = z;
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        C465520INi.LIZ.v6(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0UaJ] */
    public final void LIZLLL(final DataChannel dataChannel) {
        final Context context;
        InterfaceC1270540jAS interfaceC1270540jASLJJIJ;
        long j;
        MediaProjectionManager mediaProjectionManager;
        C19EG activity;
        Room roomPR;
        LiveRecordConfig liveRecordConfig;
        AbstractC1273900jFs liveCore;
        if (LLILZ) {
            C766270U4b.LIZLLL(2131855981);
            return;
        }
        LIZIZ(true);
        BaseBroadcastFragment baseBroadcastFragment = LLILLL;
        Object objJ2 = null;
        if (baseBroadcastFragment != null) {
            context = baseBroadcastFragment.getContext();
        } else {
            context = null;
        }
        InterfaceC769940UIe interfaceC769940UIe = LLJ;
        if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
            interfaceC1270540jASLJJIJ = liveCore.LJJIJ();
        } else {
            interfaceC1270540jASLJJIJ = null;
        }
        if (context != null && interfaceC1270540jASLJJIJ != null) {
            BaseBroadcastFragment baseBroadcastFragment2 = LLILLL;
            if (baseBroadcastFragment2 != null && (roomPR = baseBroadcastFragment2.PR()) != null && (liveRecordConfig = roomPR.liveRecordConfig) != null) {
                j = liveRecordConfig.minStorageSize;
            } else {
                j = 20;
            }
            if (((float) ((Environment.getDataDirectory().getFreeSpace() * 1.0d) / ((double) 1048576))) < j) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131855974, Long.valueOf(j)));
                LIZIZ(false);
                C20441214yg.LJ("LiveRecord", "memory not enough!");
                return;
            }
            if (LLIZLLLIL == null) {
                BaseBroadcastFragment baseBroadcastFragment3 = LLILLL;
                if (baseBroadcastFragment3 != null && (activity = baseBroadcastFragment3.getActivity()) != null) {
                    objJ2 = C786410Ut5.J2(activity, "media_projection");
                }
                if ((objJ2 instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) objJ2) != null) {
                    try {
                        Intent intentLIZJ = C0TPX.LIZJ(mediaProjectionManager, CertProviderManagerKt.findCert("bpea-live_video_record_get_screen_capture_intent", 1476411395));
                        BaseBroadcastFragment baseBroadcastFragment4 = LLILLL;
                        if (baseBroadcastFragment4 != null) {
                            LIZ(baseBroadcastFragment4, intentLIZJ);
                        }
                        C774850UaR.LIZ(dataChannel, "show", "screen_capture");
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BPEAException: ");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    LIZIZ(false);
                    C20441214yg.LJ("LiveRecord", "try to get screen record intent!");
                    return;
                }
            }
            if (LLIZLLLIL == null) {
                LIZIZ(false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("finalIntent: ");
                sbLIZ2.append(LLIZLLLIL);
                C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            String fullPathWithoutPostSuffix = EnumC771350UNp.LIVE_RECORD.getFullPathWithoutPostSuffix();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("videoFilePath: ");
            sbLIZ3.append(fullPathWithoutPostSuffix);
            C20441214yg.LIZIZ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ3));
            if (fullPathWithoutPostSuffix == null) {
                LIZIZ(false);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("videoFilePath: ");
                sbLIZ4.append(fullPathWithoutPostSuffix);
                C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            InterfaceC774800UaM interfaceC774800UaM = LLJI;
            InterfaceC774800UaM c1283340jV6 = interfaceC774800UaM;
            if (interfaceC774800UaM == null) {
                c1283340jV6 = new C1283340jV6(LLIZLLLIL, context, interfaceC1270540jASLJJIJ);
            }
            c1283340jV6.LIZIZ(new InterfaceC1283360jV8() { // from class: X.0UaJ
                @Override // X.InterfaceC1283360jV8
                public final void LIZ() {
                    C20441214yg.LIZIZ("LiveRecord", "onRecorderStarted");
                    WeakHandler weakHandler = LiveRecordManager.LLILLJJLI;
                    if (weakHandler != null) {
                        weakHandler.sendMessage(weakHandler.obtainMessage(2, Long.valueOf(SystemClock.uptimeMillis())));
                    }
                    Iterator it2 = ((ArrayList) LiveRecordManager.LLJIJIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC774810UaN) it2.next()).LIZ();
                    }
                    InterfaceC774830UaP interfaceC774830UaP = LiveRecordManager.LLJILJIL;
                    if (interfaceC774830UaP != null) {
                        interfaceC774830UaP.LIZIZ(LiveRecordManager.LLJJIII);
                    }
                    LiveRecordManager.LL.getClass();
                    LiveRecordManager.LJI(0);
                }

                @Override // X.InterfaceC1283360jV8
                public final void LIZJ() {
                    C20441214yg.LIZIZ("LiveRecord", "onStartRecorder");
                    Iterator<InterfaceC774810UaN> it2 = LiveRecordManager.LLJIJIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZJ();
                    }
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [X.0U4o] */
                @Override // X.InterfaceC1283360jV8
                public final void LIZLLL(final String str) throws Throwable {
                    Long lValueOf;
                    String[] strArr;
                    Room roomPR2;
                    if (Build.VERSION.SDK_INT >= 34) {
                        LiveRecordManager.LLJI = null;
                        LiveRecordManager.LLIZLLLIL = null;
                    }
                    LiveRecordManager.LL.LIZIZ(false);
                    LiveRecordManager.LLILZIL = false;
                    Iterator it2 = ((ArrayList) LiveRecordManager.LLJIJIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC774810UaN) it2.next()).LIZLLL();
                    }
                    LiveRecordManager.LL.getClass();
                    LiveRecordManager.LJI(1);
                    if (!LiveRecordManager.LLILZLL) {
                        C2355009Kq.LJIILL(str);
                        return;
                    }
                    C20441214yg.LIZIZ("LiveRecord", "onRecorderStopped, " + str + " is exist: " + C2355009Kq.LIZ(str));
                    C0VSJ c0vsj = new C0VSJ(str);
                    C774820UaO c774820UaO = C774820UaO.LIZ;
                    String name = c0vsj.getName();
                    c774820UaO.getClass();
                    if (TextUtils.isEmpty(C774820UaO.LIZIZ)) {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                        if (externalStoragePublicDirectory != null) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(externalStoragePublicDirectory.getAbsolutePath());
                            String str2 = File.separator;
                            sbLIZ5.append(str2);
                            sbLIZ5.append("ttlive");
                            sbLIZ5.append(str2);
                            sbLIZ5.append("record");
                            C774820UaO.LIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                        } else {
                            return;
                        }
                    }
                    String str3 = C774820UaO.LIZIZ;
                    if (str3 != null) {
                        C0VSJ c0vsj2 = new C0VSJ(str3);
                        if ((c0vsj2.exists() && c0vsj2.isDirectory()) || ((!c0vsj2.exists() || c0vsj2.delete()) && c0vsj2.mkdirs())) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(C774820UaO.LIZIZ);
                            sbLIZ6.append(File.separator);
                            sbLIZ6.append(name);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                            if (strLIZIZ != null) {
                                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                                JSONObject jSONObject = new JSONObject();
                                BaseBroadcastFragment baseBroadcastFragment5 = LiveRecordManager.LLILLL;
                                if (baseBroadcastFragment5 != null && (roomPR2 = baseBroadcastFragment5.PR()) != null) {
                                    lValueOf = Long.valueOf(roomPR2.getId());
                                } else {
                                    lValueOf = null;
                                }
                                jSONObject.put("live_room_ids", String.valueOf(lValueOf));
                                String strJ3 = C786410Ut5.J3(jSONObject);
                                C20441214yg.LIZIZ("LiveRecord", "metadata value: " + strJ3);
                                C20441214yg.LIZIZ("LiveRecord", "setMetaData value: " + iHostAction.setMetaData(str, strLIZIZ, C2097908Jt.LIZJ(new Pair("live_info", strJ3))) + ", MetaData: " + ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getMetaData(strLIZIZ));
                                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension("mp4");
                                final Context context2 = context;
                                String[] strArr2 = {strLIZIZ};
                                if (mimeTypeFromExtension != null) {
                                    strArr = new String[]{mimeTypeFromExtension};
                                } else {
                                    strArr = null;
                                }
                                C2204961BRm.LJLJJI(context2, strArr2, strArr, new MediaScannerConnection.OnScanCompletedListener() { // from class: X.0U4o
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str4, Uri uri) {
                                        boolean z;
                                        if (uri == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        DataChannel dataChannel2 = null;
                                        if (z) {
                                            C473410IhP.LIZIZ(new ARunnableS112S0100000_12(context2, 94));
                                            C20441214yg.LJ("LiveRecord", "uri is null, scanFile failed!");
                                            BaseBroadcastFragment baseBroadcastFragment6 = LiveRecordManager.LLILLL;
                                            if (baseBroadcastFragment6 != null) {
                                                dataChannel2 = baseBroadcastFragment6.getDataChannel();
                                            }
                                            C774850UaR.LJFF(100, dataChannel2, false);
                                        } else {
                                            if (!LiveRecordManager.LLJJ) {
                                                C473410IhP.LIZIZ(new ARunnableS112S0100000_12(context2, 95));
                                            } else {
                                                LiveRecordManager.LLJJI = true;
                                            }
                                            BaseBroadcastFragment baseBroadcastFragment7 = LiveRecordManager.LLILLL;
                                            if (baseBroadcastFragment7 != null) {
                                                dataChannel2 = baseBroadcastFragment7.getDataChannel();
                                            }
                                            C774850UaR.LJFF(-1, dataChannel2, true);
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("onScanCompleted, ");
                                            sbLIZ7.append(uri);
                                            C20441214yg.LIZIZ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ7));
                                        }
                                        C2355009Kq.LJIILL(str);
                                    }
                                }, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+4DkP96fV6PW/i8AY9afZuUPHq7K+PW3A==", null));
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1283360jV8
                public final void LIZIZ(int i, Exception exc) {
                    LiveRecordManager liveRecordManager = LiveRecordManager.LL;
                    liveRecordManager.LIZIZ(false);
                    LiveRecordManager.LLILZIL = false;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("onRecorderError, errorCode: ");
                    sbLIZ5.append(i);
                    sbLIZ5.append(", Exception: ");
                    sbLIZ5.append(exc.getMessage());
                    C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ5));
                    InterfaceC774800UaM interfaceC774800UaM2 = LiveRecordManager.LLJI;
                    if (interfaceC774800UaM2 != null) {
                        interfaceC774800UaM2.LJJIJIIJIL();
                    }
                    DataChannel dataChannel2 = null;
                    if (Build.VERSION.SDK_INT >= 34) {
                        LiveRecordManager.LLJI = null;
                        LiveRecordManager.LLIZLLLIL = null;
                    }
                    WeakHandler weakHandler = LiveRecordManager.LLILLJJLI;
                    if (weakHandler != null) {
                        weakHandler.removeMessages(2);
                    }
                    if (i != -203 && i != -202) {
                        C766270U4b.LIZLLL(2131855976);
                        BaseBroadcastFragment baseBroadcastFragment5 = LiveRecordManager.LLILLL;
                        if (baseBroadcastFragment5 != null) {
                            dataChannel2 = baseBroadcastFragment5.getDataChannel();
                        }
                        C774850UaR.LJFF(i, dataChannel2, false);
                        Iterator it2 = ((ArrayList) LiveRecordManager.LLJIJIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC774810UaN) it2.next()).LJ();
                        }
                        LiveRecordManager.LL.getClass();
                        LiveRecordManager.LJI(1);
                        return;
                    }
                    LiveRecordManager.LLIZLLLIL = null;
                    liveRecordManager.LIZLLL(dataChannel);
                }
            });
            LLJI = c1283340jV6;
            try {
                InterfaceC774800UaM interfaceC774800UaM2 = LLJI;
                if (interfaceC774800UaM2 != null) {
                    interfaceC774800UaM2.LIZ(fullPathWithoutPostSuffix);
                    return;
                }
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LL.LIZIZ(false);
                return;
            }
        }
        LIZIZ(false);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("context: ");
        sbLIZ5.append(context);
        sbLIZ5.append(", recorderMgr: ");
        sbLIZ5.append(interfaceC1270540jASLJJIJ);
        C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ5));
    }

    @Override // X.InterfaceC19562711gH
    public final void LLF(Context context) {
        if (LLJJI) {
            LLJJI = false;
            C766270U4b.LIZLLL(2131855978);
        }
        LLJJ = false;
    }

    @Override // X.InterfaceC19562711gH
    public final void LLLLIILLL(Context context) {
        LLJJ = true;
        if (LLILZ) {
            getClass();
            LJ("others", true, false);
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Long l;
        long jLongValue;
        long j;
        Room roomPR;
        LiveRecordConfig liveRecordConfig;
        Room roomPR2;
        LiveRecordConfig liveRecordConfig2;
        if (LLILLL != null && message.what == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj instanceof Long) {
                l = (Long) messageObj;
            } else {
                l = null;
            }
            long j2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j3 = (jUptimeMillis - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            int i = (int) j3;
            LLIZ = i;
            long j4 = i;
            BaseBroadcastFragment baseBroadcastFragment = LLILLL;
            if (baseBroadcastFragment != null && (roomPR2 = baseBroadcastFragment.PR()) != null && (liveRecordConfig2 = roomPR2.liveRecordConfig) != null) {
                j = liveRecordConfig2.maxRecordDuration;
            } else {
                j = 300;
            }
            if (j4 >= j) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MaxRecordDuration: ");
                BaseBroadcastFragment baseBroadcastFragment2 = LLILLL;
                if (baseBroadcastFragment2 != null && (roomPR = baseBroadcastFragment2.PR()) != null && (liveRecordConfig = roomPR.liveRecordConfig) != null) {
                    j2 = liveRecordConfig.maxRecordDuration;
                }
                sbLIZ.append(j2);
                C20441214yg.LJ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ));
                int i2 = LLIZ / 60;
                C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755956, i2, Integer.valueOf(i2)));
                getClass();
                LJ("auto", true, false);
                return;
            }
            long j5 = 60;
            long j6 = j3 / j5;
            long j7 = j3 % j5;
            for (InterfaceC774810UaN interfaceC774810UaN : (ArrayList) LLJIJIL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                Locale locale = Locale.ENGLISH;
                sbLIZ2.append(C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6)}, 1)));
                sbLIZ2.append(':');
                sbLIZ2.append(C786410Ut5.k4(locale, "%02d ", Arrays.copyOf(new Object[]{Long.valueOf(j7)}, 1)));
                interfaceC774810UaN.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            }
            WeakHandler weakHandler = LLILLJJLI;
            if (weakHandler != null) {
                weakHandler.sendMessageDelayed(weakHandler.obtainMessage(2, HandlerHook.getMessageObj(message.obj)), 300L);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Boolean boolValueOf;
        InterfaceC420801kM interfaceC420801kM;
        C356901a3.LIZIZ(this, lifecycleOwner);
        lifecycleOwner.getLifecycle().removeObserver(this);
        LLJI = null;
        LLILLL = null;
        C774860UaS c774860UaS = LLJILJILJ;
        if (c774860UaS != null) {
            LL.getClass();
            ((ArrayList) LLJIJIL).remove(c774860UaS);
            c774860UaS.LLILLJJLI = null;
            c774860UaS.LLILLL = null;
            c774860UaS.LLILZ = null;
        }
        LLJILJILJ = null;
        InterfaceC420801kM interfaceC420801kM2 = LLJILLL;
        if (interfaceC420801kM2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC420801kM2.isDisposed());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (interfaceC420801kM = LLJILLL) != null) {
            interfaceC420801kM.dispose();
        }
        WeakHandler weakHandler = LLILLJJLI;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        LLILLJJLI = null;
        LIZIZ(false);
        LLILZIL = false;
        LLILZLL = true;
        LLIZ = 0;
        LLJ = null;
        LLJJ = false;
        LLJJI = false;
    }

    public static void LIZ(BaseBroadcastFragment baseBroadcastFragment, Intent intent) throws Throwable {
        Intent intent2;
        Fragment fragment;
        C1701330uNH.LIZ(intent, baseBroadcastFragment);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+4DkP96fV6PW/i8AY9afZuUPHq7K+PW3A==", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 30001;
        Object[] objArr = {intent, 30001};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/android/live/broadcast/BaseBroadcastFragment", "startActivityForResult", baseBroadcastFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/bytedance/android/live/broadcast/BaseBroadcastFragment", "startActivityForResult", null, objArr, baseBroadcastFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = baseBroadcastFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            fragment = baseBroadcastFragment;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/bytedance/android/live/broadcast/BaseBroadcastFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public static void LIZJ(int i, String str) {
        DataChannel dataChannel;
        LLJJIII = i;
        BaseBroadcastFragment baseBroadcastFragment = LLILLL;
        if (baseBroadcastFragment != null) {
            dataChannel = baseBroadcastFragment.getDataChannel();
        } else {
            dataChannel = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_start");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
        final BaseBroadcastFragment baseBroadcastFragment2 = LLILLL;
        if (baseBroadcastFragment2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                LL.LIZLLL(baseBroadcastFragment2.getDataChannel());
                return;
            }
            C0UT9 c0ut9 = new C0UT9(baseBroadcastFragment2.getActivity(), TokenCert.Companion.with("bpea-live_video_record_get_storage_permission"));
            c0ut9.LJ = new ARunnableS112S0100000_12(baseBroadcastFragment2, 413);
            c0ut9.LJFF = new ARunnableS112S0100000_12(baseBroadcastFragment2, 414);
            c0ut9.LIZ(new C142V() { // from class: X.0UZt
                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str2, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                    C766270U4b.LIZLLL(2131855976);
                    C774850UaR.LIZ(baseBroadcastFragment2.getDataChannel(), "click_not_allow", "access_photos");
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    LiveRecordManager.LL.LIZLLL(baseBroadcastFragment2.getDataChannel());
                }
            }, false, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public static void LJ(String str, boolean z, boolean z2) {
        DataChannel dataChannel;
        C774860UaS c774860UaS;
        Room roomPR;
        LiveRecordConfig liveRecordConfig;
        if (LLILZ && !LLILZIL) {
            BaseBroadcastFragment baseBroadcastFragment = LLILLL;
            Boolean boolValueOf = null;
            if (baseBroadcastFragment != null) {
                dataChannel = baseBroadcastFragment.getDataChannel();
            } else {
                dataChannel = null;
            }
            C774850UaR.LIZIZ = str;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_end");
            c474500IjALIZ.LJIJJLI(dataChannel);
            LL.getClass();
            c474500IjALIZ.LJJII(Integer.valueOf(LLIZ), "duration");
            c474500IjALIZ.LJJII(str, "end_method");
            c474500IjALIZ.LIZ();
            LLILZIL = true;
            LLILZLL = z;
            WeakHandler weakHandler = LLILLJJLI;
            if (weakHandler != null) {
                weakHandler.removeMessages(2);
            }
            InterfaceC774800UaM interfaceC774800UaM = LLJI;
            if (interfaceC774800UaM != null) {
                interfaceC774800UaM.LJJIJIIJIL();
            }
            if (z2) {
                BaseBroadcastFragment baseBroadcastFragment2 = LLILLL;
                if (baseBroadcastFragment2 != null && (roomPR = baseBroadcastFragment2.PR()) != null && (liveRecordConfig = roomPR.liveRecordConfig) != null) {
                    boolValueOf = Boolean.valueOf(liveRecordConfig.hasFixedFloatingBall);
                }
                if (C500260Jjc.LJJJI(boolValueOf) && (c774860UaS = LLJILJILJ) != null) {
                    c774860UaS.LIZIZ("live_end");
                }
            }
        }
    }
}
