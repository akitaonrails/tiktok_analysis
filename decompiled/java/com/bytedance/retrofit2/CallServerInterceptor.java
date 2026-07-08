package com.bytedance.retrofit2;

import X.AbstractC848400XPy;
import X.C080U;
import X.C0C64;
import X.C0X52;
import X.C0XIR;
import X.C0XMZ;
import X.C0XQ7;
import X.C1150504el;
import X.C1472750oQb;
import X.C1494420ozY;
import X.C1494570ozn;
import X.C1494580ozo;
import X.C1494670ozx;
import X.C1494760p06;
import X.C2175508fh;
import X.InterfaceC1339100kx2;
import X.InterfaceC1494830p0D;
import X.InterfaceC841770X0l;
import X.InterfaceC843230X6b;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.ttnet.TTInternalInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class CallServerInterceptor<T> implements TTInternalInterceptor, InterfaceC843230X6b, InterfaceC1339100kx2 {
    public volatile boolean mCanceled;
    public Throwable mCreationFailure;
    public volatile boolean mExecuted;
    public Request mOriginalRequest;
    public volatile InterfaceC1494830p0D mRawCall;
    public final RequestFactory<T> mRequestFactory;
    public volatile long mThrottleNetSpeed;

    private InterfaceC1494830p0D createRawCall(Request request) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(this, request);
    }

    private C2175508fh executeCall(InterfaceC1494830p0D interfaceC1494830p0D) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(this, interfaceC1494830p0D);
    }

    public void cancel() {
        this.mCanceled = true;
        if (this.mRawCall != null) {
            this.mRawCall.cancel();
        }
    }

    @Override // X.InterfaceC843230X6b
    public void doCollect() {
    }

    public synchronized boolean isExecuted() {
        return this.mExecuted;
    }

    public C0X52 parseResponse(C2175508fh c2175508fh, C1494570ozn c1494570ozn) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_parseResponse(this, c2175508fh, c1494570ozn);
    }

    public synchronized void resetExecuted() {
        this.mExecuted = false;
    }

    @Override // X.InterfaceC1339100kx2
    public Object getRequestInfo() {
        if (this.mRawCall instanceof InterfaceC1339100kx2) {
            return ((InterfaceC1339100kx2) this.mRawCall).getRequestInfo();
        }
        return null;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public Request request() {
        return this.mOriginalRequest;
    }

    public CallServerInterceptor(RequestFactory<T> requestFactory) {
        this.mRequestFactory = requestFactory;
    }

    public InterfaceC1494830p0D com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___(Request request) {
        return this.mRequestFactory.clientProvider.get().LIZ(request);
    }

    public C2175508fh com_bytedance_retrofit2_CallServerInterceptor__executeCall$___twin___(InterfaceC1494830p0D interfaceC1494830p0D) {
        return interfaceC1494830p0D.execute();
    }

    @Override // X.InterfaceC1904907d9
    public C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        Request request = interfaceC841770X0l.request();
        this.mOriginalRequest = request;
        C1494570ozn metrics = request.getMetrics();
        metrics.LJLILLLLZI.LJ.LIZIZ++;
        metrics.LJIILL = SystemClock.uptimeMillis();
        this.mOriginalRequest.getMetrics().LJJLIIIJJI = this.mOriginalRequest.getPriorityLevel();
        this.mOriginalRequest.getMetrics().LJJLIIIJJIZ = this.mOriginalRequest.getRequestPriorityLevel();
        synchronized (this) {
            try {
                if (!this.mExecuted) {
                    this.mExecuted = true;
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Throwable th = this.mCreationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new Exception(this.mCreationFailure);
        }
        this.mRequestFactory.getClass();
        try {
            this.mRawCall = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(this, this.mOriginalRequest);
            if (this.mThrottleNetSpeed > 0) {
                this.mRawCall.LIZ(this.mThrottleNetSpeed);
            }
            if (this.mCanceled) {
                this.mRawCall.cancel();
            }
            List<C080U> listHeaders = this.mOriginalRequest.headers("content-encoding");
            if (listHeaders != null && listHeaders.size() > 0) {
                this.mOriginalRequest.getMetrics().LJJLIIIJLJLI = ((C080U) ListProtector.get(this.mOriginalRequest.headers("content-encoding"), 0)).LIZIZ;
            }
            try {
                this.mOriginalRequest.getMetrics().LJJIJ();
                C1494570ozn metrics2 = this.mOriginalRequest.getMetrics();
                metrics2.getClass();
                long jNanoTime = System.nanoTime();
                C1494580ozo c1494580ozo = metrics2.LJLILLLLZI;
                c1494580ozo.LIZ.LJIILJJIL = jNanoTime;
                C1494760p06 c1494760p06 = (C1494760p06) ((ArrayDeque) c1494580ozo.LIZLLL.LIZ).peek();
                if (c1494760p06 != null) {
                    c1494760p06.LIZLLL = jNanoTime;
                }
                C1494570ozn metrics3 = this.mOriginalRequest.getMetrics();
                metrics3.LJLILLLLZI.LIZ.LJIILL = System.nanoTime();
                metrics3.LJJIJIIJIL = C1494420ozY.LIZIZ(metrics3.LJLILLLLZI.LIZ.LJIILL);
                metrics3.LJIILLIIL = metrics3.LIZ(metrics3.LJLILLLLZI.LIZ.LJIILL);
                C2175508fh c2175508fhCom_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(this, this.mRawCall);
                C1494570ozn metrics4 = this.mOriginalRequest.getMetrics();
                metrics4.LJLILLLLZI.LIZ.LJIILLIIL = System.nanoTime();
                metrics4.LJJIJIL = C1494420ozY.LIZIZ(metrics4.LJLILLLLZI.LIZ.LJIILLIIL);
                C1494570ozn metrics5 = this.mOriginalRequest.getMetrics();
                metrics5.getClass();
                long jNanoTime2 = System.nanoTime();
                C1494580ozo c1494580ozo2 = metrics5.LJLILLLLZI;
                c1494580ozo2.LIZ.LJIIZILJ = jNanoTime2;
                C1494760p06 c1494760p062 = (C1494760p06) ((ArrayDeque) c1494580ozo2.LIZLLL.LIZ).peek();
                if (c1494760p062 != null) {
                    c1494760p062.LJ = jNanoTime2;
                }
                this.mOriginalRequest.getMetrics().LJJIJIL(this);
                this.mOriginalRequest.getMetrics().LJLILLLLZI.LJ.LIZ = true;
                this.mRequestFactory.getClass();
                List<C080U> listLIZIZ = c2175508fhCom_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall.LIZIZ("content-encoding");
                if (listLIZIZ != null) {
                    this.mOriginalRequest.getMetrics().LJJLIIIJL = ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ;
                }
                return parseResponse(c2175508fhCom_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall, this.mOriginalRequest.getMetrics());
            } catch (Throwable th2) {
                C1494570ozn metrics6 = this.mOriginalRequest.getMetrics();
                metrics6.LJLILLLLZI.LIZ.LJIILLIIL = System.nanoTime();
                metrics6.LJJIJIL = C1494420ozY.LIZIZ(metrics6.LJLILLLLZI.LIZ.LJIILLIIL);
                C1494570ozn metrics7 = this.mOriginalRequest.getMetrics();
                metrics7.getClass();
                long jNanoTime3 = System.nanoTime();
                C1494580ozo c1494580ozo3 = metrics7.LJLILLLLZI;
                c1494580ozo3.LIZ.LJIIZILJ = jNanoTime3;
                C1494760p06 c1494760p063 = (C1494760p06) ((ArrayDeque) c1494580ozo3.LIZLLL.LIZ).peek();
                if (c1494760p063 != null) {
                    c1494760p063.LJ = jNanoTime3;
                }
                this.mOriginalRequest.getMetrics().LJJIJIL(this);
                throw th2;
            }
        } catch (IOException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            this.mCreationFailure = e;
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            this.mCreationFailure = e;
            throw e;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            this.mCreationFailure = th3;
            if (th3 instanceof Exception) {
                throw th3;
            }
            throw new Exception(th3);
        }
    }

    public boolean setThrottleNetSpeed(long j) {
        this.mThrottleNetSpeed = j;
        if (this.mRawCall != null) {
            return this.mRawCall.LIZ(j);
        }
        return false;
    }

    public static InterfaceC1494830p0D com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(CallServerInterceptor callServerInterceptor, Request request) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1494830p0D interfaceC1494830p0DCom_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___ = callServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___(request);
        if (C1150504el.LIZ().LJII && C1472750oQb.LIZ(request) != -1) {
            C1150504el.LIZ().LJ(System.currentTimeMillis() - jCurrentTimeMillis, "feed_create_sslcall");
        }
        return interfaceC1494830p0DCom_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[Catch: Exception -> 0x0187, TryCatch #1 {Exception -> 0x0187, blocks: (B:44:0x00d8, B:46:0x00dc, B:53:0x0161, B:47:0x0100, B:49:0x0104, B:50:0x0159), top: B:71:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100 A[Catch: Exception -> 0x0187, TryCatch #1 {Exception -> 0x0187, blocks: (B:44:0x00d8, B:46:0x00dc, B:53:0x0161, B:47:0x0100, B:49:0x0104, B:50:0x0159), top: B:71:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2175508fh com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(com.bytedance.retrofit2.CallServerInterceptor r5, X.InterfaceC1494830p0D r6) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.CallServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(com.bytedance.retrofit2.CallServerInterceptor, X.0p0D):X.08fh");
    }

    public C0X52<T> com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___(C2175508fh c2175508fh, C1494570ozn c1494570ozn) throws IOException {
        if (c2175508fh != null) {
            TypedInput typedInput = c2175508fh.LJ;
            int i = c2175508fh.LIZIZ;
            if (i >= 200 && i < 300) {
                if (i != 204 && i != 205) {
                    if (c1494570ozn != null) {
                        try {
                            c1494570ozn.LJLILLLLZI.LIZJ.LIZIZ();
                            c1494570ozn.LJJIJL = SystemClock.uptimeMillis();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (c1494570ozn != null) {
                                c1494570ozn.LJJLI = false;
                            }
                            throw th;
                        }
                    }
                    try {
                        Object response = this.mRequestFactory.toResponse(typedInput);
                        if (c1494570ozn != null) {
                            C1494670ozx c1494670ozx = c1494570ozn.LJLILLLLZI.LIZJ;
                            c1494670ozx.LJIIIZ = c1494670ozx.LIZ();
                            c1494570ozn.LJJIJLIJ = SystemClock.uptimeMillis();
                        }
                        return C0X52.LIZLLL(response, c2175508fh);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (c1494570ozn != null) {
                            C1494670ozx c1494670ozx2 = c1494570ozn.LJLILLLLZI.LIZJ;
                            c1494670ozx2.LJIIIZ = c1494670ozx2.LIZ();
                            c1494570ozn.LJJIJLIJ = SystemClock.uptimeMillis();
                        }
                        throw th2;
                    }
                }
                return C0X52.LIZLLL(null, c2175508fh);
            }
            return C0X52.LIZIZ(typedInput, c2175508fh);
        }
        throw new IOException("SsResponse is null");
    }

    public static C0X52 com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_parseResponse(CallServerInterceptor callServerInterceptor, C2175508fh c2175508fh, C1494570ozn c1494570ozn) {
        int iLIZ;
        List<C080U> headers;
        INetworkDebugService iNetworkDebugService;
        Request request = callServerInterceptor.mOriginalRequest;
        boolean z = C1150504el.LIZ().LJII;
        if (z) {
            iLIZ = C1472750oQb.LIZ(request);
            if (iLIZ != -1) {
                C1150504el.LIZ().LJI("feed_network_duration", true);
                if (!C1150504el.LIZ().LJIIIIZZ("feed_parse_duration")) {
                    C1150504el.LIZ().LIZLLL("feed_parse_duration", true);
                }
            }
        } else {
            iLIZ = -1;
        }
        try {
            C0X52<T> c0x52Com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___ = callServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___(c2175508fh, c1494570ozn);
            if (z && iLIZ != -1) {
                boolean zLJIIIIZZ = C1150504el.LIZ().LJIIIIZZ("feed_parse_duration");
                boolean zLJIIIZ = C1150504el.LIZ().LJIIIZ("feed_parse_duration");
                if (zLJIIIIZZ && !zLJIIIZ) {
                    C1150504el.LIZ().LJI("feed_parse_duration", true);
                    C1150504el.LIZ().LIZLLL("feed_parse_end_to_video_preload", false);
                }
                if (!C1150504el.LIZ().LJIIIIZZ("feed_parse_to_ui")) {
                    C1150504el.LIZ().LIZLLL("feed_parse_to_ui", true);
                }
                C1150504el.LIZ().LIZLLL("feed_net_api_to_feed_api", false);
                C1150504el.LIZ().LJ(iLIZ, "feed_api_type");
            }
            if (request != null) {
                ApiMonitorService.Companion.getInstance().addALog(request.getUrl(), c0x52Com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___);
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "mix_mall_parse_response_opt", true, false) && (iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class, false, false)) != null) {
                if (request != null) {
                    request.getPath();
                }
                iNetworkDebugService.LIZ();
            }
            return c0x52Com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if ((th instanceof C0XIR) && c2175508fh != null) {
                C0XIR c0xir = th;
                if (c0xir.getErrorCode() == 8) {
                    String str = c2175508fh.LIZ;
                    if (request == null) {
                        headers = null;
                    } else {
                        headers = request.getHeaders();
                    }
                    C0XMZ.LJII(str, ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin(), headers);
                }
                c0xir.setPath(request.getPath());
            } else {
                if (request != null) {
                }
                throw th;
            }
            ApiMonitorService.Companion.getInstance().addFailLog(request.getUrl(), th, c2175508fh);
            throw th;
        }
    }

    public void cancelNormalRequest(boolean z, Throwable th, boolean z2) {
        cancel();
        this.mCanceled = z;
    }
}
