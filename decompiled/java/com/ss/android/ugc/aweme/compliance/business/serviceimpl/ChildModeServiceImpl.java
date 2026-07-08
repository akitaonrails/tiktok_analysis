package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC841870X0v;
import X.C01GW;
import X.C08Q1;
import X.C0WG5;
import X.C0WGT;
import X.C0WZX;
import X.C0X0S;
import X.C0X0V;
import X.C0X1K;
import X.C0X1L;
import X.C0X1M;
import X.C0X1N;
import X.C0X4O;
import X.C102T;
import X.C102U;
import X.C10EU;
import X.C13BV;
import X.C13LQ;
import X.C1518550pcT;
import X.C15O7;
import X.C1701330uNH;
import X.C1914170zuZ;
import X.C19EG;
import X.C20144713rx;
import X.C2204961BRm;
import X.C23250099c;
import X.C346470Di9;
import X.C452501pT;
import X.C817503Hh;
import X.C826970WcJ;
import X.C826990WcL;
import X.C837720Wte;
import X.C842790X4j;
import X.C842820X4m;
import X.C844470XAv;
import X.C852050Xbf;
import X.InterfaceC1914220zue;
import X.InterfaceC842850X4p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService;
import com.ss.android.ugc.aweme.net.settings.PayLoadControl;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class ChildModeServiceImpl implements IChildModeService {
    public Boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0X1K());

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final List<String> LIZJ() {
        List<String> listLJIIL;
        IKidsSettingsService iKidsSettingsService = (IKidsSettingsService) PluggableExtentionKt.pluggableSpi$default(IKidsSettingsService.class, false, false, false, 14, null);
        return (iKidsSettingsService == null || (listLJIIL = iKidsSettingsService.LJIIL()) == null) ? C13BV.INSTANCE : listLJIIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LIZLLL() {
        if (this.LIZ == null) {
            this.LIZ = Boolean.valueOf(Keva.getRepo("compliance_setting").getBoolean("update_and_check_new_kids_mode", false));
        }
        Boolean bool = this.LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final C0X0V LJFF() {
        return (C0X0V) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJII() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        Boolean boolValueOf = c102t.LJFF;
        if (boolValueOf == null && (boolValueOf = Boolean.valueOf(c102t.LIZIZ.getBoolean("have_updated_and_checked", false))) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJIIIIZZ() {
        C842820X4m.LIZ.getClass();
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        return iPluginService != null && iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_kids_mode");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILIIL() {
        C102U.LIZ.getClass();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0WG5 c0wg5LIZ = C0WG5.LIZIZ.LIZ(contextLIZ);
        C20144713rx c20144713rx = new C20144713rx(939524361);
        C837720Wte.LIZ("Firebase", "setAnalyticsCollectionEnabled", c20144713rx, new C0WGT(true, c20144713rx, c0wg5LIZ));
        AppsFlyerLib.getInstance().stop(false, contextLIZ);
        AppsFlyerLib.getInstance().start(contextLIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILLIIL() {
        C102U.LIZ.getClass();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0WG5 c0wg5LIZ = C0WG5.LIZIZ.LIZ(contextLIZ);
        C20144713rx c20144713rx = new C20144713rx(939524360);
        C837720Wte.LIZ("Firebase", "setAnalyticsCollectionEnabled", c20144713rx, new C0WGT(false, c20144713rx, c0wg5LIZ));
        AppsFlyerLib.getInstance().stop(true, contextLIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final C0X0V LJIIZILJ() {
        return new C0X1L();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final C0X0V LJIJI() {
        return new C0X0S();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final Set<String> LJIJJ() {
        C102U.LIZ.getClass();
        return C102U.LJII;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final C0X0V LJIJJLI() {
        return new AbstractC841870X0v() { // from class: X.0X16
            public static final Charset LJ = Charset.forName("utf-8");
            public final Random LIZ = new Random();
            public final BlockingQueue<Long> LIZIZ;
            public final Map<String, String> LIZJ;
            public final C0X1A LIZLLL;

            {
                PayLoadControl payLoadControlLIZ = C0X15.LIZ();
                this.LIZIZ = new LinkedBlockingQueue(payLoadControlLIZ.flowControl);
                this.LIZLLL = new C0X1A(payLoadControlLIZ.maxSize);
                this.LIZJ = new ConcurrentHashMap(8);
            }

            public static boolean LJIIIZ(C1496690p3D c1496690p3D) {
                try {
                    C1496690p3D c1496690p3D2 = new C1496690p3D();
                    long j = c1496690p3D.LLILLJJLI;
                    if (j >= 64) {
                        j = 64;
                    }
                    c1496690p3D.LJFF(c1496690p3D2, 0L, j);
                    int i = 0;
                    while (!c1496690p3D2.LJJJJLL()) {
                        int iLJJJ = c1496690p3D2.LJJJ();
                        if (Character.isISOControl(iLJJJ) && !Character.isWhitespace(iLJJJ)) {
                            return false;
                        }
                        i++;
                        if (i >= 16) {
                            return true;
                        }
                    }
                    return true;
                } catch (EOFException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            public static boolean LJIIJ(String str) {
                if (!TextUtils.equals(str, "/service/2/app_log/") && !TextUtils.equals(str, "/monitor/collect/batch/") && !TextUtils.equals(str, "/monitor/collect/c/logcollect") && !TextUtils.equals(str, "/monitor/collect/c/exception") && !TextUtils.equals(str, "/monitor/collect/c/code_coverage")) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [X.0X17, java.io.ByteArrayOutputStream, java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r9v18, types: [R, X.0X52] */
            @Override // X.InterfaceC841900X0y
            public final C841880X0w<Request, C0X52<?>> LIZIZ(C841880X0w<Request, C0X52<?>> c841880X0w) {
                String url;
                TypedOutput body;
                String strMimeType;
                C0X0P c0x0pLIZJ;
                Charset charsetLIZ;
                if (!C0X15.LIZ().enable) {
                    return c841880X0w;
                }
                Request request = c841880X0w.LIZ;
                if (request != null) {
                    url = request.getUrl();
                } else {
                    url = null;
                }
                C0X18 c0x18 = new C0X18(false, url, 502);
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jIncrementAndGet = C0X19.LIZ.incrementAndGet();
                try {
                    try {
                        try {
                            Request request2 = c841880X0w.LIZ;
                            if (request2 != null && request2.getUrl() != null) {
                                URI uri = new URI(request2.getUrl());
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(uri.getScheme());
                                sbLIZ.append("://");
                                sbLIZ.append(uri.getHost());
                                sbLIZ.append(uri.getPath());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                if (!LJIIJ(uri.getPath()) && (body = request2.getBody()) != null && LJIIL(C0X15.LIZ().ttNetSampling, jIncrementAndGet) && (strMimeType = body.mimeType()) != null && (c0x0pLIZJ = C0X0P.LIZJ(strMimeType)) != null) {
                                    String str = c0x0pLIZJ.LIZIZ;
                                    if ((TextUtils.equals(str, "application") || TextUtils.equals(str, "text")) && (charsetLIZ = c0x0pLIZJ.LIZ(LJ)) != null) {
                                        final C0X1A c0x1a = this.LIZLLL;
                                        ?? r11 = new ByteArrayOutputStream(c0x1a) { // from class: X.0X17
                                            public final C0X1A LL;

                                            public final synchronized boolean LIZ() {
                                                boolean z = false;
                                                try {
                                                    C1496690p3D c1496690p3D = new C1496690p3D();
                                                    byte[] bArr = ((ByteArrayOutputStream) this).buf;
                                                    c1496690p3D.LJJJLL(0, bArr, bArr.length < 64 ? bArr.length : 64);
                                                    int i = 0;
                                                    while (!c1496690p3D.LJJJJLL()) {
                                                        int iLJJJ = c1496690p3D.LJJJ();
                                                        if (Character.isISOControl(iLJJJ) && !Character.isWhitespace(iLJJJ)) {
                                                            return false;
                                                        }
                                                        i++;
                                                        if (i >= 16) {
                                                            break;
                                                        }
                                                    }
                                                    z = true;
                                                } catch (EOFException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                }
                                                return z;
                                            }

                                            @Override // java.io.ByteArrayOutputStream
                                            public final void reset() {
                                            }

                                            @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                            public final void close() throws IOException {
                                                super.close();
                                                this.LL.LIZ(((ByteArrayOutputStream) this).count);
                                            }

                                            {
                                                this.LL = c0x1a;
                                            }

                                            @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
                                            public final void write(int i) {
                                                long jLIZIZ = this.LL.LIZIZ(1L);
                                                synchronized (this) {
                                                    if (jLIZIZ > 0) {
                                                        try {
                                                            super.write(i);
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }

                                            @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
                                            public final void write(byte[] bArr, int i, int i2) {
                                                long jLIZIZ = this.LL.LIZIZ(i2);
                                                synchronized (this) {
                                                    if (jLIZIZ > 0) {
                                                        try {
                                                            super.write(bArr, i, (int) jLIZIZ);
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        };
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(r11, 8192);
                                        body.writeTo(bufferedOutputStream);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        if (r11.LIZ()) {
                                            LJ(r11.toString(charsetLIZ.name()), C0X15.LIZ().checkList, c0x18);
                                        }
                                        if (c0x18.LIZ) {
                                            if (C0X15.LIZ().intercept && C0X15.LIZ().interceptApi.contains(strLIZIZ)) {
                                                c841880X0w.LIZLLL = EnumC841890X0x.INTERCEPT;
                                                String url2 = request2.getUrl();
                                                List<C080U> headers = request2.getHeaders();
                                                if (headers == null) {
                                                    headers = C13BV.INSTANCE;
                                                }
                                                C2175508fh c2175508fh = new C2175508fh(url2, 1001, "", headers, new TypedByteArray("application/json; charset=utf-8", "{\"status_code\": 1001}".getBytes(Charsets.UTF_8), new String[0]));
                                                c841880X0w.LIZIZ = C0X52.LIZIZ(c2175508fh.LJ, c2175508fh);
                                            }
                                            LJIIJJI(request2.getUrl(), "2", c0x18, jIncrementAndGet, SystemClock.uptimeMillis() - jUptimeMillis);
                                        }
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("handleTTNet id: ");
                                        sbLIZ2.append(jIncrementAndGet);
                                        sbLIZ2.append(", api: ");
                                        sbLIZ2.append(strLIZIZ);
                                        sbLIZ2.append(", cost: ");
                                        sbLIZ2.append(SystemClock.uptimeMillis() - jUptimeMillis);
                                        sbLIZ2.append("ms, method: ");
                                        sbLIZ2.append(request2.getMethod());
                                        sbLIZ2.append(", type: ");
                                        sbLIZ2.append(strMimeType);
                                        sbLIZ2.append(", size: ");
                                        sbLIZ2.append(body.length());
                                        sbLIZ2.append("-byte");
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                    }
                                }
                            }
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (URISyntaxException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                    return c841880X0w;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                    throw th;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
            
                r5 = X.C786410Ut5.J3(r7.LIZJ);
                r0 = r17.LIZLLL.LIZIZ(r5.getBytes(X.C0X16.LJ).length);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
            
                if (r0 <= 0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
            
                r17.LIZLLL.LIZ(r0);
                LJ(r5, X.C0X15.LIZ().checkList, r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
            
                if (r12.LIZ == false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
            
                if (X.C0X15.LIZ().intercept == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
            
                if (X.C0X15.LIZ().interceptApi.contains(r10) == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
            
                r18.LIZLLL = X.EnumC841890X0x.INTERCEPT;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
            
                LJIIJJI(r10, "7", r12, r13, android.os.SystemClock.uptimeMillis() - r8);
             */
            @Override // X.C0X11
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C841880X0w<X.C0V61, java.lang.Boolean> LIZJ(X.C841880X0w<X.C0V61, java.lang.Boolean> r18) {
                /*
                    Method dump skipped, instruction units count: 213
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0X16.LIZJ(X.0X0w):X.0X0w");
            }

            @Override // X.C0X10
            public final C841880X0w<C0X14, Boolean> LIZLLL(C841880X0w<C0X14, Boolean> c841880X0w) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                C0X14 c0x14 = c841880X0w.LIZ;
                if (c0x14 == null) {
                    return c841880X0w;
                }
                long jIncrementAndGet = C0X19.LIZ.incrementAndGet();
                try {
                    if (LJIIL(C0X15.LIZ().appLogSampling, jIncrementAndGet)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0x14.LIZ);
                        sbLIZ.append('/');
                        sbLIZ.append(c0x14.LIZIZ);
                        sbLIZ.append('/');
                        String str = c0x14.LIZJ;
                        if (str == null) {
                            str = "";
                        }
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C0X18 c0x18 = new C0X18(false, strLIZIZ, 502);
                        String strJ3 = C786410Ut5.J3(c0x14.LIZLLL);
                        long jLIZIZ = this.LIZLLL.LIZIZ(strJ3.getBytes(LJ).length);
                        if (jLIZIZ > 0) {
                            this.LIZLLL.LIZ(jLIZIZ);
                            LJ(strJ3, C0X15.LIZ().checkList, c0x18);
                            if (c0x18.LIZ) {
                                if (C0X15.LIZ().intercept && C0X15.LIZ().interceptApi.contains(strLIZIZ)) {
                                    c841880X0w.LIZLLL = EnumC841890X0x.INTERCEPT;
                                }
                                LJIIJJI(strLIZIZ, "6", c0x18, jIncrementAndGet, SystemClock.uptimeMillis() - jUptimeMillis);
                            }
                        }
                    }
                    ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                    return c841880X0w;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v51, types: [R, X.0XLY] */
            @Override // X.InterfaceC841910X0z
            public final C841880X0w<okhttp3.Request, C0XLY> LJFF(C841880X0w<okhttp3.Request, C0XLY> c841880X0w) {
                String str;
                C0X0P c0x0pLIZIZ;
                Charset charsetLIZ;
                C0XLQ c0xlqUrl;
                if (!C0X15.LIZ().enable) {
                    return c841880X0w;
                }
                okhttp3.Request request = c841880X0w.LIZ;
                if (request != null && (c0xlqUrl = request.url()) != null) {
                    str = c0xlqUrl.LJIIIIZZ;
                } else {
                    str = null;
                }
                if (C0X15.LIZ().enable && (!r2.checkList.isEmpty())) {
                    C0X18 c0x18 = new C0X18(false, str, 502);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    long jIncrementAndGet = C0X19.LIZ.incrementAndGet();
                    try {
                        try {
                            okhttp3.Request request2 = c841880X0w.LIZ;
                            if (request2 != null) {
                                C0XLQ c0xlqUrl2 = request2.url();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c0xlqUrl2.LIZ);
                                sbLIZ.append("://");
                                sbLIZ.append(c0xlqUrl2.LIZLLL);
                                sbLIZ.append(c0xlqUrl2.LJFF());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                if (!LJIIJ(c0xlqUrl2.LJFF())) {
                                    PayLoadControl payLoadControlLIZ = C0X15.LIZ();
                                    AbstractC842530X3j abstractC842530X3jBody = request2.body();
                                    if (abstractC842530X3jBody != null && LJIIL(payLoadControlLIZ.okHttpSampling, jIncrementAndGet) && (c0x0pLIZIZ = abstractC842530X3jBody.LIZIZ()) != null) {
                                        String str2 = c0x0pLIZIZ.LIZIZ;
                                        if ((TextUtils.equals(str2, "application") || TextUtils.equals(str2, "text")) && (charsetLIZ = c0x0pLIZIZ.LIZ(LJ)) != null) {
                                            for (Field field : abstractC842530X3jBody.getClass().getDeclaredFields()) {
                                                if (!field.isAccessible()) {
                                                    field.setAccessible(true);
                                                }
                                                field.get(abstractC842530X3jBody);
                                            }
                                            if (Intrinsics.LJFF("x-www-form-urlencoded", c0x0pLIZIZ.LIZJ)) {
                                                LJII(abstractC842530X3jBody, charsetLIZ, c0x18);
                                            } else {
                                                LJIIIIZZ(abstractC842530X3jBody, charsetLIZ, c0x18);
                                            }
                                            if (c0x18.LIZ) {
                                                if (payLoadControlLIZ.intercept && payLoadControlLIZ.interceptApi.contains(strLIZIZ)) {
                                                    c841880X0w.LIZLLL = EnumC841890X0x.INTERCEPT;
                                                    C0XLX c0xlx = new C0XLX();
                                                    c0xlx.LIZJ = 1001;
                                                    c0xlx.LIZIZ = EnumC847200XLi.HTTP_2;
                                                    c0xlx.LIZLLL = "";
                                                    c0xlx.LIZ = c841880X0w.LIZ;
                                                    c0xlx.LJI = AbstractC842510X3h.create(C0X0P.LIZJ("application/json; charset=utf-8"), "{\"status_code\": 1001}");
                                                    c841880X0w.LIZIZ = c0xlx.LIZ();
                                                }
                                                LJIIJJI(c0xlqUrl2.LJIIIIZZ, "4", c0x18, jIncrementAndGet, SystemClock.uptimeMillis() - jUptimeMillis);
                                            }
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("handleOkHttp id: ");
                                            sbLIZ2.append(jIncrementAndGet);
                                            sbLIZ2.append(", api: ");
                                            sbLIZ2.append(strLIZIZ);
                                            sbLIZ2.append(", cost: ");
                                            sbLIZ2.append(SystemClock.uptimeMillis() - jUptimeMillis);
                                            sbLIZ2.append("ms, method: ");
                                            sbLIZ2.append(request2.method());
                                            sbLIZ2.append(", type: ");
                                            sbLIZ2.append(c0x0pLIZIZ);
                                            sbLIZ2.append(", size: ");
                                            sbLIZ2.append(abstractC842530X3jBody.LIZ());
                                            sbLIZ2.append("-byte");
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                }
                            }
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        ((LinkedBlockingQueue) this.LIZIZ).remove(Long.valueOf(jIncrementAndGet));
                        throw th;
                    }
                }
                return c841880X0w;
            }

            public final boolean LJIIL(int i, long j) {
                if (this.LIZ.nextInt(10001) > i) {
                    return false;
                }
                return ((LinkedBlockingQueue) this.LIZIZ).offer(Long.valueOf(j));
            }

            public final void LJ(String str, Set<String> set, C0X18 c0x18) {
                int iLJJJ;
                int length;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                String lowerCase = str.toLowerCase(Locale.getDefault());
                Iterator<String> it2 = set.iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    String lowerCase2 = next.toLowerCase(Locale.ROOT);
                    if (a0.LJJIIZI(lowerCase, lowerCase2, false)) {
                        int i = C0X15.LIZ().count;
                        int length2 = 0;
                        do {
                            iLJJJ = a0.LJJJ(lowerCase, lowerCase2, length2, false, 4);
                            int i2 = iLJJJ - i;
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            if (lowerCase2.length() + iLJJJ + i > lowerCase.length()) {
                                length = lowerCase.length();
                            } else {
                                length = lowerCase2.length() + iLJJJ + i;
                            }
                            String strSubstring = lowerCase.substring(i2, length);
                            String str2 = (String) ((ConcurrentHashMap) this.LIZJ).get(lowerCase2);
                            if (str2 == null || a0.LJJJIL(str2)) {
                                String str3 = C0X15.LIZ().ruleRegex;
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = "^(.*)([^a-z0-9]+)([^\\/])%s([^a-z0-9]+)(.*)$";
                                }
                                ((ConcurrentHashMap) this.LIZJ).put(lowerCase2, C786410Ut5.j4(str3, Arrays.copyOf(new Object[]{lowerCase2}, 1)));
                            }
                            if (PatternProtector.compile((String) ((ConcurrentHashMap) this.LIZJ).get(lowerCase2)).matcher(strSubstring).find()) {
                                linkedHashSet2.add(strSubstring);
                                linkedHashSet.add(next);
                                break loop0;
                            }
                            length2 = lowerCase2.length() + iLJJJ;
                        } while (iLJJJ != -1);
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    c0x18.LIZ = true;
                    c0x18.LJ = linkedHashSet2;
                    c0x18.LJI = linkedHashSet;
                }
            }

            public final void LJII(AbstractC842530X3j abstractC842530X3j, Charset charset, C0X18 c0x18) {
                boolean z;
                if (abstractC842530X3j.LIZ() == -1) {
                    return;
                }
                C0X1A c0x1a = this.LIZLLL;
                long jLIZ = abstractC842530X3j.LIZ();
                synchronized (c0x1a) {
                    if (c0x1a.LIZ < jLIZ) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    C1496690p3D c1496690p3D = new C1496690p3D();
                    abstractC842530X3j.LJ(c1496690p3D);
                    this.LIZLLL.LIZ(c1496690p3D.LLILLJJLI);
                    if (LJIIIZ(c1496690p3D)) {
                        LJ(c1496690p3D.LJJLIIIJILLIZJL(charset), C0X15.LIZ().checkList, c0x18);
                    } else {
                        c1496690p3D.LIZ();
                    }
                }
            }

            public final void LJIIIIZZ(AbstractC842530X3j abstractC842530X3j, Charset charset, C0X18 c0x18) {
                C1496700p3E c1496700p3E = new C1496700p3E(C1496330p2d.LIZ(new ByteArrayOutputStream()), this.LIZLLL);
                abstractC842530X3j.LJ(c1496700p3E);
                if (LJIIIZ(c1496700p3E.LL)) {
                    LJ(c1496700p3E.LL.LJJLIIIJILLIZJL(charset), C0X15.LIZ().checkList, c0x18);
                } else {
                    c1496700p3E.LL.LIZ();
                }
            }

            public static void LJIIJJI(String str, String str2, C0X18 c0x18, long j, long j2) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str3 = c0x18.LIZIZ;
                if ((str3 != null && !a0.LJJJIL(str3)) || (str != null && !a0.LJJJIL(str))) {
                    String str4 = c0x18.LIZIZ;
                    if (str4 != null) {
                        str = str4;
                    }
                    c0x18.LIZIZ = str;
                    jSONObject.put("url", str);
                }
                Set<String> set = c0x18.LJ;
                if (set != null && !set.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<T> it2 = c0x18.LJ.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    jSONObject.put("payload_segment", jSONArray);
                }
                Set<String> set2 = c0x18.LJI;
                if (set2 != null && !set2.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<T> it3 = c0x18.LJI.iterator();
                    while (it3.hasNext()) {
                        jSONArray2.put(it3.next());
                    }
                    jSONObject.put("config_rules", jSONArray2);
                }
                jSONObject.put("net_type", str2);
                jSONObject.put("cost", j2);
                C793770VBv.LJ(EnumC841820X0q.COMPLIANCE_PAYLOAD_MONITOR_LOG.getLogType(), jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportMonitor id: ");
                sbLIZ.append(j);
                sbLIZ.append(", netType: ");
                sbLIZ.append(str2);
                sbLIZ.append(", data: ");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIL() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        Boolean bool = Boolean.TRUE;
        c102t.LJFF = bool;
        c102t.LIZIZ.storeBoolean("have_updated_and_checked", bool != null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJ() {
        return C08Q1.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final HeaderParamConfig LJIIJJI() {
        return C0X1M.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJI(boolean z) {
        C826970WcJ.LIZ.getClass();
        C826970WcJ.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIL(Context context) {
        if (context == null) {
            return;
        }
        C102U c102u = C102U.LIZ;
        c102u.getClass();
        C102T c102t = C102U.LIZJ;
        Boolean boolValueOf = c102t.LIZLLL;
        boolean z = false;
        if ((boolValueOf == null && (boolValueOf = Boolean.valueOf(c102t.LIZIZ.getBoolean("update_and_check_new_kids_mode", false))) == null) || !boolValueOf.booleanValue()) {
            c102u.getClass();
            Boolean bool = Boolean.TRUE;
            c102t.LIZLLL = bool;
            Keva keva = c102t.LIZIZ;
            if (bool != null) {
                z = true;
            }
            keva.storeBoolean("update_and_check_new_kids_mode", z);
            if (C10EU.LJIIIIZZ()) {
                ComplianceServiceProvider.LJII().LJJI(context);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILL(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            launchIntentForPackage.putExtra("is_passkey_wizard", ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIJJ());
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, launchIntentForPackage, "Context_startActivity_1");
            C1701330uNH.LIZ(launchIntentForPackage, context);
            C2204961BRm.LJJJJJL(context, launchIntentForPackage, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15PvPSN8eLzqDkyRIiO5YGFzPbMzMJ0pIxyxV54MkrMEA=", null));
            for (Activity activity : C13LQ.LJIJ(1, ActivityStack.getActivityStack())) {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Runtime.getRuntime().exit(0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Xbf] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIJ(final AwS557S0100000_13 awS557S0100000_13) {
        C1518550pcT c1518550pcTLJI;
        C1914170zuZ c1914170zuZLIZ;
        new Object() { // from class: X.0X1P
        }.getClass();
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
        if (tTKUserCommunicationService != null && (c1518550pcTLJI = tTKUserCommunicationService.LJI()) != null) {
            IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
            if (iPolicyNoticeService != null && (c1914170zuZLIZ = iPolicyNoticeService.LIZ()) != null) {
                C1518550pcT.LIZ(c1518550pcTLJI, "kids_creation_parent_messaging_v2", new AwS222S0300000_13(awS557S0100000_13, c1914170zuZLIZ, (C852050Xbf) new InterfaceC1914220zue() { // from class: X.0Xbf
                    @Override // X.InterfaceC1914220zue
                    public final void LIZ(C1519370pdn c1519370pdn) {
                    }

                    @Override // X.InterfaceC1914220zue
                    public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                    }

                    @Override // X.InterfaceC1914220zue
                    public final void LIZJ(Boolean bool, String str) {
                    }

                    @Override // X.InterfaceC1914220zue
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1914220zue
                    public final void LJFF(C1519370pdn c1519370pdn) {
                    }

                    @Override // X.InterfaceC1914220zue
                    public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                        if (Intrinsics.LJFF(universalPopupAction.actionId, "kids_account_creation_continue")) {
                            awS557S0100000_13.invoke();
                        }
                    }
                }, 9));
                return;
            } else {
                awS557S0100000_13.invoke();
                return;
            }
        }
        awS557S0100000_13.invoke();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJJ(C19EG c19eg) {
        C15O7.LIZJ(new Callable() { // from class: X.08Q3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ChildModeServiceImpl@bc79.closeChildModeAndRestart$1");
                Boolean boolValueOf = Boolean.valueOf(C08Q1.LIZ());
                C1C7U.LIZIZ("ChildModeServiceImpl@bc79.closeChildModeAndRestart$1");
                return boolValueOf;
            }
        }).LJ(new C346470Di9(this, c19eg, 0), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJJI(Context context) {
        C15O7.LIZJ(new Callable() { // from class: X.0COb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ChildModeServiceImpl@bc79.openChildModeAndRestart$1");
                Boolean boolValueOf = Boolean.valueOf(C08Q1.LIZLLL());
                C1C7U.LIZIZ("ChildModeServiceImpl@bc79.openChildModeAndRestart$1");
                return boolValueOf;
            }
        }).LJ(new C346470Di9(this, context, 1), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJJIFFI(C0X1N c0x1n) {
        C0X1M.LIZJ(c0x1n);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJIIIZ(HeaderParamConfig headerParamConfig, String str) {
        return C0X1M.LIZIZ(headerParamConfig, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILJJIL(C0X4O c0x4o, boolean z) {
        C826970WcJ.LIZ.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C826990WcL(z, c0x4o, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIJ(InterfaceC842850X4p interfaceC842850X4p, String str, boolean z) {
        C842790X4j c842790X4j;
        if (z) {
            c842790X4j = new C842790X4j(1, str, false, false, false, true);
        } else {
            c842790X4j = new C842790X4j(11, str, true, true, true, false);
        }
        C842820X4m.LIZ.getClass();
        C842820X4m.LIZIZ(c842790X4j, interfaceC842850X4p);
    }
}
