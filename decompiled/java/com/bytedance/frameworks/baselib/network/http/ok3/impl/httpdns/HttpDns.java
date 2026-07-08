package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import X.AbstractC1493260oxg;
import X.C1493320oxm;
import X.C1493380oxs;
import X.C1493780oyW;
import X.C1493920oyk;
import X.C1493930oyl;
import X.C1494010oyt;
import X.C1494030oyv;
import X.C1915407eq;
import X.C1C7U;
import X.C2104008Mc;
import X.C2119508Sb;
import X.C786410Ut5;
import X.C790390UzV;
import X.C810670Vr7;
import X.CallableC1490540otI;
import X.CallableC1493910oyj;
import X.EnumC1493810oyZ;
import X.EnumC1493950oyn;
import X.InterfaceC1490320osw;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class HttpDns implements WeakHandler.IHandler {
    public static final ExecutorService LLJJIJI = C786410Ut5.d4(6);
    public static volatile HttpDns LLJJIJIIJIL;
    public static String LLJJIJIL;
    public static HandlerThread LLJJJ;
    public static WeakHandler LLJJJIL;
    public volatile String LLILLL;
    public final C1493920oyk LLJILJILJ;
    public volatile InterfaceC1490320osw LLJJ;
    public final AtomicBoolean LL = new AtomicBoolean(true);
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final ConcurrentSkipListSet<String> LLILZ = new ConcurrentSkipListSet<>();
    public final ConcurrentMap<String, CopyOnWriteArrayList<String>> LLILZIL = new ConcurrentHashMap();
    public final ConcurrentSkipListSet<String> LLILZLL = new ConcurrentSkipListSet<>();
    public final AtomicInteger LLIZ = new AtomicInteger(30);
    public final AtomicInteger LLIZLLLIL = new AtomicInteger(2000);
    public final AtomicInteger LLJ = new AtomicInteger(60);
    public final AtomicInteger LLJI = new AtomicInteger(0);
    public final AtomicInteger LLJIJIL = new AtomicInteger(5);
    public final AtomicInteger LLJILJIL = new AtomicInteger(5);
    public final C790390UzV LLJILLL = new C790390UzV();
    public boolean LLJJI = false;
    public final AnonymousClass1 LLJJIII = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("HttpDns@469f.<field>$1");
            super.handleMessage(message);
            if (message != null && (HandlerHook.getMessageObj(message.obj) instanceof HttpDns)) {
                Bundle data = message.getData();
                data.getSerializable("callback_dnsresult_key");
                if (data.getSerializable("callback_dnsresult_job_key") == null) {
                    Logger.debug();
                    C1C7U.LIZIZ("HttpDns@469f.<field>$1");
                    return;
                } else if (message.what != 1) {
                    C1C7U.LIZIZ("HttpDns@469f.<field>$1");
                    return;
                } else {
                    Logger.debug();
                    throw null;
                }
            }
            C1C7U.LIZIZ("HttpDns@469f.<field>$1");
        }
    };

    public static HttpDns LJ() {
        if (LLJJIJIIJIL == null) {
            synchronized (HttpDns.class) {
                try {
                    if (LLJJIJIIJIL == null) {
                        LLJJIJIIJIL = new HttpDns();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJJIJIIJIL;
    }

    public static void LJIIJ() {
        try {
            LLJJIJI.submit(new Callable<Void>() { // from class: X.0oym
                @Override // java.util.concurrent.Callable
                public final Void call() throws Throwable {
                    DatagramSocket datagramSocket;
                    C1C7U.LIZ("Ipv6DetectCall@ae13.call");
                    Logger.debug();
                    AtomicBoolean atomicBoolean = C1494040oyw.LIZ;
                    DatagramSocket datagramSocket2 = null;
                    boolean z = false;
                    try {
                        try {
                            datagramSocket = new DatagramSocket();
                        } catch (IOException e) {
                            e = e;
                            datagramSocket = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        try {
                            datagramSocket.connect(new InetSocketAddress("2001:4860:4860::8888", 53));
                            InetAddress localAddress = datagramSocket.getLocalAddress();
                            if (localAddress instanceof Inet6Address) {
                                boolean z2 = !localAddress.isLinkLocalAddress();
                                if (!localAddress.getHostAddress().startsWith("2001:0000")) {
                                    z = z2;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            if (datagramSocket != null) {
                            }
                            atomicBoolean.set(z);
                            C1C7U.LIZIZ("Ipv6DetectCall@ae13.call");
                            return null;
                        }
                        datagramSocket.close();
                        atomicBoolean.set(z);
                        C1C7U.LIZIZ("Ipv6DetectCall@ae13.call");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        datagramSocket2 = datagramSocket;
                        TryCatchGuardChecker.doCheck(th);
                        if (datagramSocket2 != null) {
                            datagramSocket2.close();
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns$1] */
    public HttpDns() {
        Logger.debug();
        HandlerThread handlerThread = new HandlerThread("TTOK-HTTPDNS");
        LLJJJ = handlerThread;
        handlerThread.start();
        LLJJJIL = new WeakHandler(C786410Ut5.W2(LLJJJ), this);
        LLJJIJIL = "4.2.243.57-tiktok";
        this.LLJILJILJ = new C1493920oyk(LLJJJIL);
    }

    public final synchronized void LIZIZ(EnumC1493810oyZ enumC1493810oyZ) {
        ConcurrentSkipListSet<String> concurrentSkipListSet;
        if (this.LLJJ != null) {
            ((C1493380oxs) this.LLJJ).getClass();
            if (C2104008Mc.LIZJ(C1493780oyW.LJIIIZ) && (concurrentSkipListSet = this.LLILZLL) != null && concurrentSkipListSet.size() != 0 && this.LLILZLL.size() <= 10) {
                Logger.debug();
                ArrayList arrayList = new ArrayList();
                for (String str : this.LLILZLL) {
                    if (!this.LLJILJILJ.LJFF(str)) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                Logger.debug();
                LJIIIIZZ(arrayList, enumC1493810oyZ, false);
            }
        }
    }

    public final C1494010oyt LIZJ(String str) {
        Logger.debug();
        if (((ConcurrentHashMap) this.LLILZIL).containsKey(str)) {
            C1494010oyt c1494010oyt = new C1494010oyt();
            for (String str2 : (CopyOnWriteArrayList) ((ConcurrentHashMap) this.LLILZIL).get(str)) {
                if (C2119508Sb.LIZIZ(str2)) {
                    c1494010oyt.ipv6List.add(str2);
                } else if (C2119508Sb.LIZ(str2)) {
                    c1494010oyt.ipv4List.add(str2);
                } else {
                    Logger.debug();
                }
            }
            c1494010oyt.source = EnumC1493950oyn.HARDCODE_IPS;
            return c1494010oyt;
        }
        return null;
    }

    public final void LJII(JSONArray jSONArray) {
        if (jSONArray.length() > 0) {
            this.LLILZ.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.LLILZ.add(strOptString);
                }
            }
            this.LLJJ.getClass();
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C1493780oyW.LJIIIZ, 0, "dispatchersdk_httpdns_hardcodeips").edit();
            editorEdit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            editorEdit.apply();
        }
    }

    public final void LJIIIZ(C1494030oyv c1494030oyv) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1494030oyv.getHost());
        LJIIIIZZ(arrayList, EnumC1493810oyZ.CACHE_UNSET, false);
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = this;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "dns_timeout_job_key", c1494030oyv);
        messageObtain.setData(bundle);
        LLJJJIL.sendMessageDelayed(messageObtain, ((long) this.LLJIJIL.get()) * 1000);
    }

    public final synchronized Future<Void> LJIIJJI(final String str) {
        Future<Void> futureSubmit = null;
        if (((ConcurrentHashMap) this.LLJILJILJ.LIZLLL).containsKey(str)) {
            Logger.debug();
            C1493920oyk c1493920oyk = this.LLJILJILJ;
            if (((ConcurrentHashMap) c1493920oyk.LIZLLL).containsKey(str)) {
                futureSubmit = (Future) ((ConcurrentHashMap) c1493920oyk.LIZLLL).get(str);
            }
            return futureSubmit;
        }
        Logger.debug();
        try {
            ExecutorService executorService = LLJJIJI;
            final C1493920oyk c1493920oyk2 = this.LLJILJILJ;
            final WeakHandler weakHandler = LLJJJIL;
            futureSubmit = executorService.submit(new Callable<Void>(str, c1493920oyk2, weakHandler) { // from class: X.0otI
                public final String LL;
                public final C1493920oyk LLILLJJLI;
                public final WeakHandler LLILLL;

                @Override // java.util.concurrent.Callable
                public final Void call() {
                    C1C7U.LIZ("LocalDnsResolveCall@1882.call");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (InetAddress inetAddress : InetAddress.getAllByName(this.LL)) {
                            if (inetAddress instanceof Inet4Address) {
                                arrayList.add(inetAddress.getHostAddress());
                            } else if (inetAddress instanceof Inet6Address) {
                                arrayList2.add(inetAddress.getHostAddress());
                            } else {
                                Logger.debug();
                            }
                        }
                        Logger.debug();
                        if (arrayList.size() > 0 || arrayList2.size() > 0) {
                            this.LLILLJJLI.LIZIZ(this.LL, new C1493930oyl(this.LL, System.currentTimeMillis(), arrayList, arrayList2, HttpDns.LJ().LLIZ.get()));
                        }
                    } catch (UnknownHostException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!HttpDns.LJ().LLILLJJLI.get()) {
                        Message messageObtain = Message.obtain();
                        messageObtain.obj = this;
                        messageObtain.what = 1;
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("localdns_completed_host", this.LL, bundle);
                        messageObtain.setData(bundle);
                        this.LLILLL.sendMessage(messageObtain);
                        Logger.debug();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("host", this.LL);
                            if (arrayList.size() == 0 && arrayList2.size() == 0) {
                                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                                jSONObject.put("result", "");
                            } else {
                                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "succeed");
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.addAll(arrayList2);
                                arrayList3.addAll(arrayList);
                                jSONObject.put("result", arrayList3);
                            }
                            jSONObject.put("rtt", jCurrentTimeMillis2);
                            Logger.debug();
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    ((ConcurrentHashMap) this.LLILLJJLI.LIZLLL).remove(this.LL);
                    C1C7U.LIZIZ("LocalDnsResolveCall@1882.call");
                    return null;
                }

                {
                    this.LL = str;
                    this.LLILLJJLI = c1493920oyk2;
                    this.LLILLL = weakHandler;
                }
            });
            ((ConcurrentHashMap) this.LLJILJILJ.LIZLLL).put(str, futureSubmit);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return futureSubmit;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C1493920oyk c1493920oyk;
        C1493930oyl c1493930oylLJ;
        Logger.debug();
        if (message != null) {
            if (!(HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && !(HandlerHook.getMessageObj(message.obj) instanceof CallableC1493910oyj) && !(HandlerHook.getMessageObj(message.obj) instanceof CallableC1490540otI) && !(HandlerHook.getMessageObj(message.obj) instanceof C1493930oyl) && !(HandlerHook.getMessageObj(message.obj) instanceof C1493920oyk)) {
                return;
            }
            try {
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 2) {
                    Logger.debug();
                    C1494030oyv c1494030oyv = (C1494030oyv) message.getData().getSerializable("httpdns_timeout_job_key");
                    if (c1494030oyv == null) {
                        Logger.debug();
                        return;
                    } else {
                        if (!this.LLJILJILJ.LJIIJ(c1494030oyv)) {
                            return;
                        }
                        Logger.debug();
                        LIZ(c1494030oyv, LJI(c1494030oyv.getHost(), c1494030oyv.isLocalDnsExpired()));
                        this.LLJILJILJ.LJIIIIZZ(c1494030oyv);
                        return;
                    }
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof CallableC1493910oyj) && message.what == 3) {
                    Logger.debug();
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                    if (stringArrayList == null) {
                        Logger.debug();
                        return;
                    }
                    for (String str : stringArrayList) {
                        if (((ConcurrentHashMap) this.LLJILJILJ.LJ).containsKey(str)) {
                            Logger.debug();
                            for (C1494030oyv c1494030oyv2 : (ConcurrentSkipListSet) ((ConcurrentHashMap) this.LLJILJILJ.LJ).get(str)) {
                                C1494010oyt c1494010oytLJFF = LJFF(str, true);
                                if (LJ().LLILLJJLI.get() && c1494010oytLJFF == null) {
                                    c1494010oytLJFF = LJI(str, c1494030oyv2.isLocalDnsExpired());
                                }
                                Logger.debug();
                                LIZ(c1494030oyv2, c1494010oytLJFF);
                                this.LLJILJILJ.LJIIIIZZ(c1494030oyv2);
                            }
                        }
                    }
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof CallableC1490540otI) && message.what == 1) {
                    Logger.debug();
                    String string = message.getData().getString("localdns_completed_host");
                    if (string == null) {
                        Logger.debug();
                        return;
                    }
                    if (!((ConcurrentHashMap) this.LLJILJILJ.LJFF).containsKey(string)) {
                        return;
                    }
                    Logger.debug();
                    for (C1494030oyv c1494030oyv3 : (ConcurrentSkipListSet) ((ConcurrentHashMap) this.LLJILJILJ.LJFF).get(string)) {
                        C1494010oyt c1494010oytLJI = LJI(string, true);
                        if (c1494010oytLJI == null) {
                            C1494010oyt c1494010oytLJFF2 = LJFF(string, false);
                            if (c1494010oytLJFF2 == null) {
                                LJIIIZ(c1494030oyv3);
                                this.LLJILJILJ.LIZ(c1494030oyv3.getHost(), c1494030oyv3);
                            } else {
                                LIZ(c1494030oyv3, c1494010oytLJFF2);
                            }
                        } else {
                            Logger.debug();
                            LIZ(c1494030oyv3, c1494010oytLJI);
                        }
                        this.LLJILJILJ.LJIIIZ(c1494030oyv3);
                    }
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 3) {
                    Logger.debug();
                    C1494030oyv c1494030oyv4 = (C1494030oyv) message.getData().getSerializable("dns_timeout_job_key");
                    if (c1494030oyv4 == null) {
                        Logger.debug();
                        return;
                    }
                    C1493920oyk c1493920oyk2 = this.LLJILJILJ;
                    if (!((ConcurrentHashMap) c1493920oyk2.LJFF).containsKey(c1494030oyv4.getHost())) {
                        return;
                    }
                    if (!((ConcurrentSkipListSet) ((ConcurrentHashMap) c1493920oyk2.LJFF).get(c1494030oyv4.getHost())).contains(c1494030oyv4)) {
                        return;
                    }
                    Logger.debug();
                    C1494010oyt c1494010oytLJFF3 = LJFF(c1494030oyv4.getHost(), false);
                    if (c1494010oytLJFF3 != null) {
                        LIZ(c1494030oyv4, c1494010oytLJFF3);
                    } else {
                        if (!this.LLJILJILJ.LJFF(c1494030oyv4.getHost())) {
                            LJIIIZ(c1494030oyv4);
                        }
                        this.LLJILJILJ.LIZ(c1494030oyv4.getHost(), c1494030oyv4);
                    }
                    this.LLJILJILJ.LJIIIZ(c1494030oyv4);
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 4) {
                    Logger.debug();
                    C1494030oyv c1494030oyv5 = (C1494030oyv) message.getData().getSerializable("dns_timeout_job_key");
                    if (c1494030oyv5 == null) {
                        Logger.debug();
                        return;
                    } else {
                        if (!this.LLJILJILJ.LJIIJ(c1494030oyv5)) {
                            return;
                        }
                        LIZ(c1494030oyv5, null);
                        this.LLJILJILJ.LJIIIIZZ(c1494030oyv5);
                        return;
                    }
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 5) {
                    Logger.debug();
                    ((C1493380oxs) this.LLJJ).getClass();
                    String string2 = C810670Vr7.LIZJ(C1493780oyW.LJIIIZ, 0, "dispatchersdk_httpdns_hardcodeips").getString("httpdns_hardcodeips", "");
                    if (!TextUtils.isEmpty(string2)) {
                        this.LLILZ.clear();
                        try {
                            JSONArray jSONArray = new JSONArray(string2);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String strOptString = jSONArray.optString(i);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    this.LLILZ.add(strOptString);
                                }
                            }
                            return;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Logger.debug();
                            return;
                        }
                    }
                    ((C1493380oxs) this.LLJJ).getClass();
                    if (C1493780oyW.LJIIIIZZ == null) {
                        return;
                    }
                    Object obj = ((C1493320oxm) C1493780oyW.LJIIIIZZ).LIZIZ;
                    if (!(obj instanceof AbstractC1493260oxg)) {
                        return;
                    }
                    ((AbstractC1493260oxg) obj).LJIILLIIL();
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 6) {
                    Logger.debug();
                    C1493920oyk c1493920oyk3 = this.LLJILJILJ;
                    ((C1493380oxs) LJ().LLJJ).getClass();
                    c1493920oyk3.LJI(C1493780oyW.LJIIIZ);
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof HttpDns) && message.what == 7) {
                    Logger.debug();
                    LJIIJ();
                    return;
                }
                if (HandlerHook.getMessageObj(message.obj) instanceof C1493930oyl) {
                    String string3 = message.getData().getString("dnsrecord_host");
                    if (TextUtils.isEmpty(string3)) {
                        Logger.debug();
                        return;
                    }
                    switch (message.what) {
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            Logger.debug();
                            HttpDns httpDnsLJ = LJ();
                            httpDnsLJ.getClass();
                            if (C1915407eq.LIZ(string3) && !httpDnsLJ.LLJILJILJ.LJFF(string3) && httpDnsLJ.LLILLJJLI.get()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(string3);
                                httpDnsLJ.LJIIIIZZ(arrayList, EnumC1493810oyZ.CACHE_STALE_EXPIRED, false);
                                break;
                            }
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            Logger.debug();
                            HttpDns httpDnsLJ2 = LJ();
                            httpDnsLJ2.getClass();
                            Logger.debug();
                            if (C1915407eq.LIZ(string3) && (c1493930oylLJ = (c1493920oyk = httpDnsLJ2.LLJILJILJ).LJ(string3)) != null) {
                                c1493930oylLJ.LJFF.removeMessages(11);
                                ((ConcurrentHashMap) c1493920oyk.LIZIZ).remove(string3);
                                break;
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            Logger.debug();
                            C1493920oyk c1493920oyk4 = LJ().LLJILJILJ;
                            c1493920oyk4.LJI.add(string3);
                            if (c1493920oyk4.LJI.size() >= 10) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(c1493920oyk4.LJI);
                                HttpDns httpDnsLJ3 = LJ();
                                httpDnsLJ3.getClass();
                                Logger.debug();
                                httpDnsLJ3.LJIIIIZZ(arrayList2, EnumC1493810oyZ.REFRESH_BATCH, false);
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            Logger.debug();
                            HttpDns httpDnsLJ4 = LJ();
                            httpDnsLJ4.getClass();
                            if (C1915407eq.LIZ(string3) && !httpDnsLJ4.LLJILJILJ.LJFF(string3)) {
                                httpDnsLJ4.LLJILJILJ.LJII(string3);
                                break;
                            }
                            break;
                    }
                    return;
                }
                if ((HandlerHook.getMessageObj(message.obj) instanceof C1493920oyk) && message.what == 20) {
                    Logger.debug();
                    this.LLJILJILJ.LJIIIIZZ.set(0);
                } else {
                    Logger.debug();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZ(C1494030oyv c1494030oyv, C1494010oyt c1494010oyt) {
        Logger.debug();
        Message messageObtain = Message.obtain();
        messageObtain.obj = this;
        messageObtain.what = 1;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "callback_dnsresult_job_key", c1494030oyv);
        C786410Ut5.LJJIZ(bundle, "callback_dnsresult_key", c1494010oyt);
        messageObtain.setData(bundle);
        C786410Ut5.LJLJJL(this.LLJJIII, messageObtain);
    }

    public final C1494010oyt LIZLLL(String str, boolean z) {
        Future<Void> futureLJIIIIZZ;
        C1494010oyt c1494010oytLJFF = null;
        if (z) {
            return null;
        }
        if (this.LLJILJILJ.LJFF(str)) {
            futureLJIIIIZZ = this.LLJILJILJ.LIZLLL(str);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            futureLJIIIIZZ = LJIIIIZZ(arrayList, EnumC1493810oyZ.CACHE_UNSET, true);
        }
        if (futureLJIIIIZZ == null) {
            return null;
        }
        if (futureLJIIIIZZ.isDone()) {
            return LJFF(str, true);
        }
        try {
            futureLJIIIIZZ.get(((long) this.LLJIJIL.get()) * 1000, TimeUnit.MILLISECONDS);
            c1494010oytLJFF = LJFF(str, true);
            return c1494010oytLJFF;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            return c1494010oytLJFF;
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return c1494010oytLJFF;
        } catch (TimeoutException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return c1494010oytLJFF;
        }
    }

    public final C1494010oyt LJFF(String str, boolean z) {
        Logger.debug();
        C1493930oyl c1493930oylLIZJ = this.LLJILJILJ.LIZJ(str);
        if (c1493930oylLIZJ == null) {
            return null;
        }
        C1494010oyt c1494010oyt = new C1494010oyt();
        c1494010oyt.ipv4List = c1493930oylLIZJ.LIZIZ;
        c1494010oyt.ipv6List = c1493930oylLIZJ.LIZJ;
        if (z) {
            if ((c1493930oylLIZJ.LIZLLL * 1000) + c1493930oylLIZJ.LJ <= System.currentTimeMillis()) {
                return null;
            }
            c1494010oyt.source = EnumC1493950oyn.HTTPDNS_REQUEST;
            return c1494010oyt;
        }
        if ((c1493930oylLIZJ.LIZLLL * 1000) + c1493930oylLIZJ.LJ > System.currentTimeMillis()) {
            c1494010oyt.source = EnumC1493950oyn.HTTPDNS_CACHE;
            return c1494010oyt;
        }
        c1494010oyt.source = EnumC1493950oyn.HTTPDNS_STALE_CACHE;
        return c1494010oyt;
    }

    public final C1494010oyt LJI(String str, boolean z) {
        Logger.debug();
        C1494010oyt c1494010oyt = new C1494010oyt();
        C1493930oyl c1493930oylLJ = this.LLJILJILJ.LJ(str);
        if (c1493930oylLJ == null) {
            return null;
        }
        c1494010oyt.ipv4List = c1493930oylLJ.LIZIZ;
        c1494010oyt.ipv6List = c1493930oylLJ.LIZJ;
        if (z) {
            c1494010oyt.source = EnumC1493950oyn.LOCALDNS_REQUEST;
            return c1494010oyt;
        }
        c1494010oyt.source = EnumC1493950oyn.LOCALDNS_CACHE;
        return c1494010oyt;
    }

    public final synchronized Future<Void> LJIIIIZZ(List<String> list, final EnumC1493810oyZ enumC1493810oyZ, boolean z) {
        ArrayList<String> arrayList = (ArrayList) list;
        Future<Void> futureSubmit = null;
        if (arrayList.size() == 0) {
            Logger.debug();
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (this.LLJILJILJ.LJFF((String) ListProtector.get(list, i))) {
                if (z && arrayList.size() == 1 && i == 0) {
                    futureSubmit = this.LLJILJILJ.LIZLLL((String) ListProtector.get(list, i));
                    Logger.debug();
                }
                arrayList.remove(ListProtector.get(list, i));
            }
        }
        if (arrayList.size() == 0) {
            return futureSubmit;
        }
        Logger.debug();
        try {
            ExecutorService executorService = LLJJIJI;
            final String strLIZIZ = C1915407eq.LIZIZ(list);
            final String str = LLJJIJIL;
            final C1493920oyk c1493920oyk = this.LLJILJILJ;
            final WeakHandler weakHandler = LLJJJIL;
            futureSubmit = executorService.submit(new Callable<Void>(strLIZIZ, str, c1493920oyk, enumC1493810oyZ, weakHandler) { // from class: X.0oyj
                public final String LL;
                public final C1493920oyk LLILLJJLI;
                public final String LLILLL;
                public final EnumC1493810oyZ LLILZLL;
                public final WeakHandler LLIZLLLIL;
                public final List<String> LLILZ = new ArrayList();
                public final List<String> LLILZIL = new ArrayList();
                public int LLIZ = 0;

                /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[EDGE_INSN: B:38:0x00b8->B:30:0x00b8 BREAK  A[LOOP:2: B:18:0x0084->B:43:0x0084], SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Void call() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 257
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1493910oyj.call():java.lang.Object");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[Catch: IOException -> 0x013c, TRY_ENTER, TryCatch #10 {IOException -> 0x013c, blocks: (B:38:0x0106, B:40:0x010b, B:59:0x0133, B:61:0x0138), top: B:95:0x0095 }] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0138 A[Catch: IOException -> 0x013c, TRY_LEAVE, TryCatch #10 {IOException -> 0x013c, blocks: (B:38:0x0106, B:40:0x010b, B:59:0x0133, B:61:0x0138), top: B:95:0x0095 }] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0187 A[Catch: IOException -> 0x018b, TRY_LEAVE, TryCatch #8 {IOException -> 0x018b, blocks: (B:81:0x0182, B:83:0x0187), top: B:91:0x0182 }] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r0v21 */
                /* JADX WARN: Type inference failed for: r0v22 */
                /* JADX WARN: Type inference failed for: r0v30 */
                /* JADX WARN: Type inference failed for: r0v33, types: [java.io.BufferedReader] */
                /* JADX WARN: Type inference failed for: r0v43 */
                /* JADX WARN: Type inference failed for: r0v45 */
                /* JADX WARN: Type inference failed for: r0v50 */
                /* JADX WARN: Type inference failed for: r0v66 */
                /* JADX WARN: Type inference failed for: r4v0, types: [org.json.JSONObject] */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.String LIZ(java.lang.String r13) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 400
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1493910oyj.LIZ(java.lang.String):java.lang.String");
                }

                public final void LIZIZ(String str2) {
                    Logger.debug();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(str2);
                        if (((ArrayList) this.LLILZ).size() > 1) {
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dns");
                            if (jSONArrayOptJSONArray == null) {
                                return;
                            }
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                LIZJ(jSONArrayOptJSONArray.optJSONObject(i2));
                            }
                        } else {
                            LIZJ(jSONObject);
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
                        if (jSONArrayOptJSONArray2 != null) {
                            HttpDns.LJ().LJII(jSONArrayOptJSONArray2);
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        Logger.debug();
                    }
                }

                public final void LIZJ(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        return;
                    }
                    String strOptString = jSONObject.optString("host");
                    Logger.debug();
                    int iOptInt = jSONObject.optInt("ttl");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            String strOptString2 = jSONArrayOptJSONArray.optString(i2);
                            if (C2119508Sb.LIZIZ(strOptString2)) {
                                arrayList3.add(strOptString2);
                            } else if (C2119508Sb.LIZ(strOptString2)) {
                                arrayList2.add(strOptString2);
                            } else {
                                Logger.debug();
                            }
                        }
                    }
                    if (((ArrayList) this.LLILZ).contains(strOptString)) {
                        if (arrayList2.size() > 0 || arrayList3.size() > 0) {
                            C1493930oyl c1493930oyl = new C1493930oyl(strOptString, System.currentTimeMillis(), arrayList2, arrayList3, iOptInt);
                            C1493920oyk c1493920oyk2 = this.LLILLJJLI;
                            C1493930oyl c1493930oylLIZJ = c1493920oyk2.LIZJ(strOptString);
                            if (c1493930oylLIZJ != null) {
                                if (HttpDns.LJ().LLILLJJLI.get()) {
                                    c1493930oylLIZJ.LJFF.removeMessages(10);
                                    c1493930oylLIZJ.LJFF.removeMessages(12);
                                } else {
                                    c1493930oylLIZJ.LJFF.removeMessages(13);
                                }
                            }
                            if (HttpDns.LJ().LLILLJJLI.get()) {
                                Message messageObtain = Message.obtain();
                                messageObtain.obj = c1493930oyl;
                                messageObtain.what = 12;
                                c1493930oyl.LIZ(messageObtain);
                                c1493930oyl.LJFF.sendMessageDelayed(messageObtain, c1493930oyl.LIZLLL * 1000);
                                Message messageObtain2 = Message.obtain();
                                messageObtain2.obj = c1493930oyl;
                                messageObtain2.what = 10;
                                c1493930oyl.LIZ(messageObtain2);
                                c1493930oyl.LJFF.sendMessageDelayed(messageObtain2, (c1493930oyl.LIZLLL * 1000) + (((long) HttpDns.LJ().LLJ.get()) * 1000));
                            } else {
                                Message messageObtain3 = Message.obtain();
                                messageObtain3.obj = c1493930oyl;
                                messageObtain3.what = 13;
                                c1493930oyl.LIZ(messageObtain3);
                                c1493930oyl.LJFF.sendMessageDelayed(messageObtain3, c1493930oyl.LIZLLL * 1000);
                            }
                            synchronized (c1493920oyk2.LIZ.LIZJ()) {
                                try {
                                    c1493920oyk2.LIZ.LIZLLL(strOptString, c1493930oyl);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            ((ConcurrentHashMap) this.LLILLJJLI.LIZJ).remove(strOptString);
                            ((ArrayList) this.LLILZ).remove(strOptString);
                        }
                    }
                }

                {
                    this.LLILLL = strLIZIZ;
                    this.LL = str;
                    this.LLILLJJLI = c1493920oyk;
                    this.LLILZLL = enumC1493810oyZ;
                    this.LLIZLLLIL = weakHandler;
                }
            });
            for (String str2 : arrayList) {
                ((ConcurrentHashMap) this.LLJILJILJ.LIZJ).put(str2, futureSubmit);
                if (this.LLILLJJLI.get()) {
                    C1493920oyk c1493920oyk2 = this.LLJILJILJ;
                    if (c1493920oyk2.LJI.contains(str2)) {
                        c1493920oyk2.LJI.remove(str2);
                    }
                }
            }
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.debug();
        }
        return futureSubmit;
    }
}
