package com.bytedance.pia.core.plugins;

import X.C1287700jc8;
import X.C1BO6;
import X.C1BOW;
import X.C1BP4;
import X.C1BP9;
import X.C1BPD;
import X.C1BPP;
import X.C2188811AlT;
import X.C2203961BNq;
import X.C2204041BNy;
import X.C2204401BPi;
import X.InterfaceC1522160piI;
import X.InterfaceC1530550pvp;
import X.InterfaceC1532650pzD;
import X.InterfaceC1535470q3l;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.plugins.StreamingPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes35.dex */
public class StreamingPlugin extends C1BO6 {
    public final Map<String, String> LIZJ;
    public final CountDownLatch LIZLLL;
    public volatile String LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public final AtomicReference<WebMessagePort> LJII;
    public final C1BPD<String> LJIIIIZZ;

    @Override // X.C1BO6
    public final String LIZ() {
        return "streaming";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        C1BOW c1bow = new C1BOW();
        C2204041BNy c2204041BNy = this.LIZIZ;
        c1bow.LIZJ = c2204041BNy;
        c1bow.LJI = "streaming";
        c1bow.LIZ = c2204041BNy.LJ.toString();
        C2204041BNy c2204041BNy2 = this.LIZIZ;
        c1bow.LIZIZ = c2204041BNy2.LIZLLL.streaming;
        c1bow.LJII = c2204041BNy2.LJIIL;
        C1BP9 c1bp9LIZ = c1bow.LIZ();
        if (c1bp9LIZ == null) {
            return;
        }
        try {
            C1BP4 c1bp4 = new C1BP4(c1bp9LIZ);
            c1bp4.LIZIZ.LIZJ(new C2204401BPi(new InterfaceC1530550pvp() { // from class: X.1BPg
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj) {
                    StreamingPlugin streamingPlugin = this.LIZ;
                    streamingPlugin.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Streaming] js error: ");
                    sbLIZ.append((String) obj);
                    C1BPP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    synchronized (streamingPlugin) {
                        try {
                            streamingPlugin.LJI = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }, c1bp4));
            c1bp4.LJIILJJIL.LIZIZ("StreamingModule", Module.class, this);
            c1bp4.LJ();
            this.LIZIZ.LIZ(c1bp4, "streaming-worker");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1BPP.LIZJ(4, "[Streaming] create streaming worker error:", th);
        }
    }

    @Override // X.C1BO6
    public final void LJFF() {
        final View viewLJI = this.LIZIZ.LJI();
        if (viewLJI instanceof WebView) {
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BPK
                @Override // java.lang.Runnable
                public final void run() {
                    final StreamingPlugin streamingPlugin = this.LL;
                    View view = viewLJI;
                    streamingPlugin.getClass();
                    C1C7U.LIZ("StreamingPlugin@83bf.onLoadStarted$1L");
                    WebView webView = (WebView) view;
                    C1BPP.LJ("[Streaming] Evaluate render polyfill.");
                    C20190913zP.LIZIZ(webView, "(function(a){var t=function(e){if(e&&e.data&&\"streaming\"===e.data&&e.ports&&e.ports[0]){window.removeEventListener(\"message\",t);var n=e.ports[0];n.onmessage=function(t){t.data&&\"string\"==typeof t.data&&a(t.data)},n.postMessage(\"streaming_ack\")}};window.addEventListener(\"message\",t)})(function(_){function n(_){if(!window.__PAGE_FINISH__){window.__PIA_DEV__&&console.log(_);var n=document.createRange();n.selectNode(document.body);var e=n.createContextualFragment(_);document.body.appendChild(e)}}window.__pia_chunks__||(window.__pia_chunks__=[]),window.__pia_chunks__.push(_),function _(){if(\"undefined\"!=typeof document&&\"complete\"===document.readyState){if(window.__pia_chunks__)for(var e=0;e<window.__pia_chunks__.length;e++)n(window.__pia_chunks__[e]);window.__pia_chunks__=[]}else setTimeout(_,50)}()});", new InterfaceC1530550pvp() { // from class: X.1BPv
                        @Override // X.InterfaceC1530550pvp
                        public final void accept(Object obj) {
                            final StreamingPlugin streamingPlugin2 = streamingPlugin;
                            streamingPlugin2.LJIIIIZZ.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BPc
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(Object obj2) {
                                    final StreamingPlugin streamingPlugin3 = streamingPlugin2;
                                    final String str = (String) obj2;
                                    WebMessagePort webMessagePort = streamingPlugin3.LJII.get();
                                    if (webMessagePort != null) {
                                        C1BPP.LJ("[Streaming] appendChunkByBridge by port.");
                                        webMessagePort.postMessage(new WebMessage(str));
                                    } else {
                                        C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BOh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                StreamingPlugin streamingPlugin4 = streamingPlugin3;
                                                String str2 = str;
                                                streamingPlugin4.getClass();
                                                C1C7U.LIZ("StreamingPlugin@83bf.appendChunkByBridge$1L");
                                                View viewLJI2 = streamingPlugin4.LIZIZ.LJI();
                                                if (viewLJI2 instanceof WebView) {
                                                    C1BPP.LJ("[Streaming] appendChunkByBridge by evaluate JavaScript.");
                                                    StringBuilder sb = new StringBuilder("(function(_){function n(_){if(!window.__PAGE_FINISH__){window.__PIA_DEV__&&console.log(_);var n=document.createRange();n.selectNode(document.body);var e=n.createContextualFragment(_);document.body.appendChild(e)}}window.__pia_chunks__||(window.__pia_chunks__=[]),window.__pia_chunks__.push(_),function _(){if(\"undefined\"!=typeof document&&\"complete\"===document.readyState){if(window.__pia_chunks__)for(var e=0;e<window.__pia_chunks__.length;e++)n(window.__pia_chunks__[e]);window.__pia_chunks__=[]}else setTimeout(_,50)}()})");
                                                    C20190913zP.LIZ(str2, sb);
                                                    sb.append(";");
                                                    C20190913zP.LIZIZ((WebView) viewLJI2, sb.toString(), null);
                                                }
                                                C1C7U.LIZIZ("StreamingPlugin@83bf.appendChunkByBridge$1L");
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                    Uri uri = streamingPlugin.LIZIZ.LJ;
                    if (C20190913zP.LIZJ(webView) >= 66) {
                        final WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
                        webMessagePortArrCreateWebMessageChannel[0].setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: X.1BPk
                            @Override // android.webkit.WebMessagePort.WebMessageCallback
                            public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                                if (webMessage != null && "streaming_ack".equals(webMessage.getData())) {
                                    streamingPlugin.LJII.set(webMessagePortArrCreateWebMessageChannel[0]);
                                }
                            }
                        }, C1287700jc8.LIZ());
                        webView.postWebMessage(new WebMessage("streaming", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), uri);
                    }
                    C1C7U.LIZIZ("StreamingPlugin@83bf.onLoadStarted$1L");
                }
            });
        }
    }

    @Override // X.C1BO6, X.InterfaceC1542530qF9
    public final void release() {
        this.LIZLLL.countDown();
    }

    public static class Module extends JSModule {
        public String chunkCache;
        public final StreamingPlugin plugin;

        @InterfaceC1522160piI
        public void finish() {
        }

        @InterfaceC1522160piI
        public void appendBody(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iLastIndexOf = str.lastIndexOf("<!-- chunk end -->");
            if (iLastIndexOf == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.chunkCache);
                sbLIZ.append(str);
                this.chunkCache = C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            StreamingPlugin streamingPlugin = this.plugin;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.chunkCache);
            sbLIZ2.append(str.substring(0, iLastIndexOf));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            synchronized (streamingPlugin) {
                if (!streamingPlugin.LJI) {
                    if (streamingPlugin.LJFF) {
                        streamingPlugin.LJIIIIZZ.LIZ(strLIZIZ);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(streamingPlugin.LJ);
                        sbLIZ3.append(strLIZIZ);
                        streamingPlugin.LJ = C2188811AlT.LIZIZ(sbLIZ3);
                        streamingPlugin.LIZLLL.countDown();
                    }
                }
            }
            this.chunkCache = str.substring(iLastIndexOf + 18);
        }

        @InterfaceC1522160piI
        public void appendHeaders(ReadableMap readableMap) {
            if (readableMap == null) {
                return;
            }
            HashMap map = new HashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (readableMap.getType(strNextKey) == ReadableType.String) {
                    map.put(strNextKey, readableMap.getString(strNextKey));
                }
            }
            StreamingPlugin streamingPlugin = this.plugin;
            synchronized (streamingPlugin) {
                if (streamingPlugin.LJI) {
                    return;
                }
                if (streamingPlugin.LJFF) {
                    C1BPP.LIZ("[Streaming] Can't append headers after responded!");
                } else {
                    ((HashMap) streamingPlugin.LIZJ).putAll(map);
                }
            }
        }

        public Module(Context context, Object obj) {
            super(context, obj);
            this.chunkCache = "";
            this.plugin = (StreamingPlugin) obj;
        }
    }

    public StreamingPlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
        this.LIZJ = new HashMap();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = "";
        this.LJFF = false;
        this.LJI = false;
        this.LJII = new AtomicReference<>(null);
        this.LJIIIIZZ = new C1BPD<>();
    }

    @Override // X.C1BO6
    public final InterfaceC1532650pzD LIZJ(InterfaceC1535470q3l interfaceC1535470q3l) {
        boolean z;
        if (!interfaceC1535470q3l.isForMainFrame()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.LJI) {
                    return null;
                }
                if (TextUtils.isEmpty(this.LJ)) {
                    try {
                        z = !this.LIZLLL.await(C2203961BNq.LIZ().streamingInterceptTimeout, TimeUnit.SECONDS);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1BPP.LIZJ(4, "[Streaming] intercept html failed, error:", th);
                        synchronized (this) {
                            try {
                                this.LJI = true;
                                return null;
                            } finally {
                            }
                        }
                    }
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(this.LJ) && !z) {
                    synchronized (this) {
                        try {
                            this.LJFF = true;
                        } finally {
                        }
                    }
                    final Map<String, String> map = this.LIZJ;
                    final String str = this.LJ;
                    return new InterfaceC1532650pzD(map, str) { // from class: X.0q6R
                        public final Map<String, String> LIZ;
                        public final String LIZIZ;

                        @Override // X.InterfaceC1532650pzD
                        public final String LIZ() {
                            return "OK";
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final String LIZIZ() {
                            return "UTF-8";
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final String getMimeType() {
                            return "text/html";
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final int getStatusCode() {
                            return 200;
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final InputStream getData() {
                            return new ByteArrayInputStream(this.LIZIZ.getBytes());
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final EnumC1535440q3i LIZJ() {
                            return EnumC1535440q3i.Online;
                        }

                        @Override // X.InterfaceC1532650pzD
                        public final Map<String, String> getHeaders() {
                            return this.LIZ;
                        }

                        {
                            boolean z2;
                            if (map != null) {
                                this.LIZ = new HashMap(map);
                            } else {
                                this.LIZ = new HashMap();
                            }
                            if (str.lastIndexOf("</body>") != -1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z3 = str.lastIndexOf("</html>") != -1;
                            if (!z2) {
                                if (!z3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append("</body></html>");
                                    this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    return;
                                }
                            } else if (!z3) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str);
                                sbLIZ2.append("</html>");
                                this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                return;
                            }
                            this.LIZIZ = str;
                        }
                    };
                }
                synchronized (this) {
                    try {
                        this.LJI = true;
                    } finally {
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
