package com.ss.videoarch.liveplayer.retry;

import X.C1284740jXM;
import X.C1470430oMr;
import X.C1698490uIh;
import X.C1698510uIj;
import X.C1698620uIu;
import X.C1698940uJQ;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1487690ooh;
import X.InterfaceC1698710uJ3;
import X.InterfaceC1699130uJj;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class RetryProcessor {
    public static final SparseArray<String> LJIILL;
    public final InterfaceC1699130uJj LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ = 5000;
    public int LJFF = 50;
    public final AtomicInteger LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final LiveLoggerService LJIIL;
    public int LJIILIIL;
    public final AnonymousClass1 LJIILJJIL;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<String> sparseArray = new SparseArray<>();
        LJIILL = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        SparseArray sparseArray3 = new SparseArray();
        sparseIntArray.put(-100002, 3);
        sparseIntArray.put(-100006, 3);
        sparseIntArray.put(-100007, 3);
        sparseIntArray.put(-100008, 3);
        sparseIntArray.put(-100009, 3);
        sparseIntArray.put(-100013, 3);
        sparseIntArray.put(-100014, 3);
        sparseArray.put(-499988, "media player: setting uri is null error");
        sparseArray.put(-499987, "media player: setting uri is error");
        sparseArray.put(-499986, "media player: url is not mp4 error");
        sparseArray.put(-499985, "media player: invalid data error");
        sparseArray.put(-499899, "media player: http bad request error");
        sparseArray.put(-499898, "media player: http unauthorized error");
        sparseArray.put(-499897, "media player: http forbidden error");
        sparseArray.put(-499896, "media player: http not found error");
        sparseArray.put(-499894, "media player: http other 4xx error");
        sparseArray.put(-499893, "media player: http server error");
        sparseArray.put(-499891, "media player: http content type invalid");
        sparseArray.put(251658241, "media info http redirect");
        sparseArray.put(-499799, "media player: tcp failed to resolve hostname");
        sparseArray.put(-499795, "media player: tcp send data failed");
        sparseArray.put(-499794, "media player: tcp receive data failed");
        sparseArray.put(-499793, "media player: tcp read network timeout");
        sparseArray.put(-499792, "media player: tcp write network timeout");
        sparseArray2.put(-499999, "media player setting is null");
        sparseArray2.put(-499997, "media player start decoder error");
        sparseArray2.put(-499996, "media player open decoder error");
        sparseArray2.put(-499992, "media player open outlet error");
        sparseArray2.put(-499991, "media player start outputer error");
        sparseArray2.put(-499990, "media player start outlet error");
        sparseArray2.put(-499989, "media player open device error");
        sparseArray2.put(1, "android media player unknown");
        sparseArray3.put(-1, "not retry, report to application");
        sparseArray3.put(1, "try next url from live info");
        sparseArray3.put(2, "reset player");
    }

    public final void LIZLLL() {
        this.LJI.set(0);
        this.LIZJ = 0L;
        this.LJII = 7;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0L;
        this.LJIIJ = false;
        this.LJIILIIL = 2;
        removeCallbacksAndMessages(null);
    }

    public final void LJ(int i) {
        VideoLiveManager videoLiveManager;
        if (!this.LJIIIIZZ || System.currentTimeMillis() - this.LJIIIZ >= 1000) {
            this.LJIIL.LJJJLZIJ(i);
            LiveLoggerService liveLoggerService = this.LJIIL;
            if (!liveLoggerService.LLLZLZ && (videoLiveManager = liveLoggerService.LLILZ) != null) {
                videoLiveManager.LLFZ(liveLoggerService.LLILLL, 2, false);
                JSONObject jSONObjectLJIIJJI = liveLoggerService.LJIIJJI("first_frame_failed");
                if (jSONObjectLJIIJJI != null) {
                    try {
                        jSONObjectLJIIJJI.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                        liveLoggerService.LJJLL(jSONObjectLJIIJJI);
                        liveLoggerService.LJJJJIZL(jSONObjectLJIIJJI);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            this.LJIIIIZZ = true;
            this.LJIIIZ = System.currentTimeMillis();
        }
    }

    public final void LIZ(int i, C1284740jXM c1284740jXM) {
        String strLLILIL;
        String strLLILIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRetryForError action=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (i != -1) {
            String strLJIIJJI = null;
            long j = 0;
            if (i != 9) {
                int i2 = 0;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 5) {
                                if (i == 6) {
                                    C1698940uJQ.LIZJ();
                                    if (!hasMessages(10004)) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("start ");
                                        sbLIZ2.append(this.LJI);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        C1698940uJQ.LIZJ();
                                        AnonymousClass1 anonymousClass1 = this.LJIILJJIL;
                                        if (this.LJI.get() > 3) {
                                            j = this.LJ;
                                        }
                                        C786410Ut5.LJLJJI(10004, j, anonymousClass1);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("ACTION_RTC_RESET_LATER start ");
                            sbLIZ3.append(this.LJI);
                            sbLIZ3.append(", max retry count ");
                            sbLIZ3.append(this.LJIIL.B3);
                            sbLIZ3.append(", retry interval:");
                            sbLIZ3.append(this.LJIIL.C3);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C1698940uJQ.LIZJ();
                            C786410Ut5.LJLJJI(10003, this.LJIIL.C3, this.LJIILJJIL);
                            return;
                        }
                        C1698940uJQ.LIZJ();
                        if (hasMessages(10002)) {
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("start ");
                        sbLIZ4.append(this.LJI);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C1698940uJQ.LIZJ();
                        AnonymousClass1 anonymousClass12 = this.LJIILJJIL;
                        if (this.LJI.get() > 3) {
                            j = this.LJ;
                        }
                        C786410Ut5.LJLJJI(10002, j, anonymousClass12);
                        return;
                    }
                    C1698940uJQ.LIZJ();
                    ((C1698620uIu) this.LIZ).LIZ(false);
                    return;
                }
                C1698940uJQ.LIZJ();
                VideoLiveManager videoLiveManager = ((C1698620uIu) this.LIZ).LIZ.get();
                if (videoLiveManager == null || videoLiveManager.LIZLLL == null) {
                    return;
                }
                C1698940uJQ.LIZJ();
                videoLiveManager.LLLLZLL();
                videoLiveManager.LLD();
                videoLiveManager.LLLLJ(true);
                ((C1470430oMr) videoLiveManager.LIZLLL).LIZJ(1349, 1);
                C1698510uIj c1698510uIj = videoLiveManager.LJJII;
                int i3 = c1698510uIj.LIZLLL;
                if (i3 == 1) {
                    int i4 = c1698510uIj.LJ + 1;
                    c1698510uIj.LJ = i4;
                    String[] strArr = c1698510uIj.LIZJ;
                    if (strArr != null && strArr.length != 0) {
                        if (i4 < strArr.length) {
                            i2 = i4;
                        }
                        strLJIIJJI = strArr[i2];
                    }
                } else if (i3 == 2) {
                    if (videoLiveManager.LLJILJIL.equals("auto")) {
                        strLLILIL2 = videoLiveManager.LLILIL();
                    } else {
                        strLLILIL2 = videoLiveManager.LLJILJIL;
                    }
                    strLJIIJJI = videoLiveManager.LJJII.LJIIJJI(strLLILIL2, videoLiveManager.LLJJ, videoLiveManager.LLJILLL, videoLiveManager.LLJZIJLIL);
                }
                LiveLoggerService liveLoggerService = videoLiveManager.LJIILLIIL;
                liveLoggerService.LLJJIJIIJIL = strLJIIJJI;
                if (!videoLiveManager.LJJJJ) {
                    videoLiveManager.LJJJJ = true;
                    long jLJIIJ = ((C1470430oMr) videoLiveManager.LIZLLL).LJIIJ(314, 0L);
                    C1698490uIh c1698490uIh = liveLoggerService.LLILLL;
                    if (c1698490uIh != null) {
                        c1698490uIh.LJLLI = jLJIIJ;
                    }
                }
                videoLiveManager.LJJJJ();
                if (videoLiveManager.LJIIIZ == EnumC1487690ooh.PREPARED) {
                    videoLiveManager.LLLFF(strLJIIJJI);
                    return;
                } else {
                    videoLiveManager.LJJIJLIJ();
                    videoLiveManager.LLLFF(strLJIIJJI);
                    return;
                }
            }
            C1698940uJQ.LIZJ();
            VideoLiveManager videoLiveManager2 = ((C1698620uIu) this.LIZ).LIZ.get();
            if (videoLiveManager2 == null || videoLiveManager2.LIZLLL == null) {
                return;
            }
            videoLiveManager2.LLLLZLL();
            videoLiveManager2.LLD();
            videoLiveManager2.LLLLJ(true);
            ((C1470430oMr) videoLiveManager2.LIZLLL).LIZJ(1349, 1);
            if (videoLiveManager2.LLJJJ()) {
                videoLiveManager2.LJIILLIIL.S1 = 2;
            }
            if (!videoLiveManager2.LJJJJ) {
                videoLiveManager2.LJJJJ = true;
                LiveLoggerService liveLoggerService2 = videoLiveManager2.LJIILLIIL;
                long jLJIIJ2 = ((C1470430oMr) videoLiveManager2.LIZLLL).LJIIJ(314, 0L);
                C1698490uIh c1698490uIh2 = liveLoggerService2.LLILLL;
                if (c1698490uIh2 != null) {
                    c1698490uIh2.LJLLI = jLJIIJ2;
                }
            }
            videoLiveManager2.LJJJJ();
            C1698510uIj c1698510uIj2 = videoLiveManager2.LJJII;
            int i5 = c1698510uIj2.LIZLLL;
            if (i5 == 1) {
                if (c1698510uIj2.LJIIJ() != null) {
                    strLJIIJJI = videoLiveManager2.LJJII.LJIIJ().LIZ;
                }
            } else if (i5 == 2) {
                if (videoLiveManager2.LLJILJIL.equals("auto")) {
                    strLLILIL = videoLiveManager2.LLILIL();
                } else {
                    strLLILIL = videoLiveManager2.LLJILJIL;
                }
                strLJIIJJI = videoLiveManager2.LJJII.LJIIJJI(strLLILIL, videoLiveManager2.LLJJ, videoLiveManager2.LLJILLL, videoLiveManager2.LLJZIJLIL);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("retry url: ");
            sbLIZ5.append(strLJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ5);
            C1698940uJQ.LIZJ();
            videoLiveManager2.LJIILLIIL.LLJJIJIIJIL = strLJIIJJI;
            if (videoLiveManager2.LJIIIZ == EnumC1487690ooh.PREPARED) {
                videoLiveManager2.LLLFF(strLJIIJJI);
                return;
            } else {
                videoLiveManager2.LJJIJLIJ();
                videoLiveManager2.LLLFF(strLJIIJJI);
                return;
            }
        }
        C1698940uJQ.LIZ();
        VideoLiveManager videoLiveManager3 = ((C1698620uIu) this.LIZ).LIZ.get();
        if (videoLiveManager3 == null || videoLiveManager3.LIZLLL == null) {
            return;
        }
        C1698940uJQ.LIZJ();
        InterfaceC1698710uJ3 interfaceC1698710uJ3 = videoLiveManager3.LJIJJ;
        if (interfaceC1698710uJ3 != null) {
            interfaceC1698710uJ3.LJJJLL(c1284740jXM);
        }
        videoLiveManager3.LJJ.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1284740jXM r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.retry.RetryProcessor.LIZIZ(X.0jXM, boolean):void");
    }

    public final void LIZJ(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStall ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (z) {
            this.LIZJ = System.currentTimeMillis();
            if (z2) {
                ((C1698620uIu) this.LIZ).LIZ(true);
                LJ(-100018);
            }
            if (!hasMessages(10001)) {
                C786410Ut5.LJLJJI(10001, this.LIZLLL, this.LJIILJJIL);
                return;
            }
            return;
        }
        LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.videoarch.liveplayer.retry.RetryProcessor$1] */
    public RetryProcessor(C1698620uIu c1698620uIu, int i, long j, LiveLoggerService liveLoggerService) {
        this.LIZLLL = 10000L;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.LJI = atomicInteger;
        this.LJII = 7;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0L;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIILIIL = 2;
        this.LJIILJJIL = new BPEAHandler(Looper.myLooper()) { // from class: com.ss.videoarch.liveplayer.retry.RetryProcessor.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("RetryProcessor@bc4e.<field>$1");
                switch (message.what) {
                    case 10001:
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        RetryProcessor retryProcessor = RetryProcessor.this;
                        if (jCurrentTimeMillis - retryProcessor.LIZJ < retryProcessor.LIZIZ) {
                            retryProcessor.LJ(-100015);
                            ((C1698620uIu) RetryProcessor.this.LIZ).LIZ(false);
                            RetryProcessor retryProcessor2 = RetryProcessor.this;
                            C786410Ut5.LJLJJI(10001, retryProcessor2.LIZLLL, retryProcessor2.LJIILJJIL);
                        } else {
                            HashMap map = new HashMap();
                            map.put("stallTime", Long.valueOf(jCurrentTimeMillis - RetryProcessor.this.LIZJ));
                            RetryProcessor.this.LIZ(-1, new C1284740jXM(-100007, "Stall retry timeout", map, false));
                        }
                        break;
                    case 10002:
                    case 10003:
                        RetryProcessor.this.LIZ(2, null);
                        break;
                    case 10004:
                        RetryProcessor.this.LIZ(1, null);
                        break;
                    case 10006:
                        RetryProcessor.this.LIZ(9, null);
                        break;
                }
                C1C7U.LIZIZ("RetryProcessor@bc4e.<field>$1");
            }
        };
        this.LIZ = c1698620uIu;
        this.LIZIZ = i * LSPassThroughRecordSizeConfig.DEFAULT;
        this.LIZLLL = j;
        atomicInteger.set(0);
        this.LJIIL = liveLoggerService;
    }
}
