package com.ttnet.org.chromium.net.urlconnection;

import X.AbstractC1497310p4D;
import X.AbstractC1497330p4F;
import X.C1496600p34;
import X.C1496900p3Y;
import X.C1497220p44;
import X.C1497230p45;
import X.C1497240p46;
import X.C1497270p49;
import X.C2188811AlT;
import X.C2338309Ef;
import X.C786410Ut5;
import X.ExecutorC1497250p47;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import com.ttnet.org.chromium.net.urlconnection.Segment;
import com.ttnet.org.chromium.net.urlconnection.SegmentPool;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.TTCronetRequestFinishedInfoListener;

/* JADX INFO: loaded from: classes24.dex */
public class CronetHttpURLConnection extends HttpURLConnection {
    public final e LIZ;
    public final ExecutorC1497250p47 LIZIZ;
    public j LIZJ;
    public final List<Pair<String, String>> LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public final C1496900p3Y LJIIIIZZ;
    public AbstractC1497310p4D LJIIIZ;
    public AbstractC1497330p4F LJIIJ;
    public IOException LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public List<Map.Entry<String, String>> LJIILJJIL;
    public Map<String, List<String>> LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public TTCronetRequestFinishedInfoListener LJJ;
    public CookieHandler LJJI;
    public int LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public int LJJIIZ;
    public final AtomicBoolean LJJIIZI;
    public final AtomicBoolean LJJIJ;
    public boolean LJJIJIIJI;

    public void enableFixCancelRequestReport() {
        this.LJJIJIIJI = true;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            LJIIIZ();
            if (((C1497220p44) this.LJIIJ).LIZIZ >= 400) {
                return this.LJIIIIZZ;
            }
            return null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws ProtocolException {
        if (this.LJIIIZ == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (((HttpURLConnection) this).chunkLength > 0) {
                this.LJIIIZ = new C1497240p46(this, ((HttpURLConnection) this).chunkLength, this.LIZIZ);
                LJIIL();
            } else {
                long j = ((HttpURLConnection) this).fixedContentLength;
                long j2 = ((HttpURLConnection) this).fixedContentLengthLong;
                if (j2 != -1) {
                    j = j2;
                }
                if (j != -1) {
                    C1497230p45 c1497230p45 = new C1497230p45(this, j, this.LJIL, this.LIZIZ);
                    this.LJIIIZ = c1497230p45;
                    if (j == 0) {
                        setFixedLengthStreamingMode((int) c1497230p45.LLIZLLLIL.LL.LLILZLL);
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.LJIIIZ.LIZLLL().LIZ()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.LJIIIZ.LIZLLL().LIZ()));
                        }
                    }
                    LJIIL();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.LJIIIZ = new C1497270p49(this);
                    } else {
                        this.LJIIIZ = new C1497270p49(this, CastLongProtector.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.LJIIIZ;
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    public final Map<String, List<String>> LJII() {
        Map<String, List<String>> map = this.LJIILL;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : LJIIIIZZ()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> mapUnmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.LJIILL = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    public final List<Map.Entry<String, String>> LJIIIIZZ() {
        List<Map.Entry<String, String>> list = this.LJIILJJIL;
        if (list != null) {
            return list;
        }
        this.LJIILJJIL = new ArrayList();
        Iterator<Map.Entry<String, String>> it2 = ((C1497220p44) this.LJIIJ).LJII.LIZ.iterator();
        while (it2.hasNext()) {
            this.LJIILJJIL.add(new AbstractMap.SimpleImmutableEntry(it2.next()));
        }
        List<Map.Entry<String, String>> listUnmodifiableList = Collections.unmodifiableList(this.LJIILJJIL);
        this.LJIILJJIL = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public final void LJIIIZ() throws IOException {
        AbstractC1497310p4D abstractC1497310p4D = this.LJIIIZ;
        if (abstractC1497310p4D != null) {
            abstractC1497310p4D.LIZIZ();
            if (((HttpURLConnection) this).chunkLength > 0) {
                this.LJIIIZ.close();
            }
        }
        if (!this.LJIILIIL) {
            LJIIL();
            if (C1496600p34.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getResponse loop url = ");
                sbLIZ.append(getURL().toString());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            LJFF(getConnectTimeout() + getReadTimeout());
            this.LJIILIIL = true;
        }
        if (!this.LJIILIIL) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.LJIIJJI;
        if (iOException != null) {
            throw iOException;
        }
        if (this.LJIIJ == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0p43] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.LJIIL():void");
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        j jVar;
        if (!((HttpURLConnection) this).connected || (jVar = this.LIZJ) == null) {
            return;
        }
        jVar.LIZLLL();
        try {
            if (this.LJJIIZI.compareAndSet(false, true) && this.LJJIJIIJI && !this.LJJIJ.get()) {
                long j = this.LIZIZ.LLILZLL;
                if (j == -1 || j == C786410Ut5.u3().getId()) {
                    ExecutorC1497250p47 executorC1497250p47 = this.LIZIZ;
                    if (executorC1497250p47.LLILLJJLI) {
                        return;
                    }
                    executorC1497250p47.LIZ(50);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : (ArrayList) this.LIZLLL) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair.second);
            treeMap.put(pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final void connect() throws ProtocolException {
        getOutputStream();
        LJIIL();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        try {
            LJIIIZ();
            return LJII();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        LJIIIZ();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.LJIIL) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (((C1497220p44) this.LJIIJ).LIZIZ < 400) {
            return this.LJIIIIZZ;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        LJIIIZ();
        return ((C1497220p44) this.LJIIJ).LIZIZ;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        LJIIIZ();
        return ((C1497220p44) this.LJIIJ).LIZJ;
    }

    public static URI LJIILIIL(URL url) {
        if (url == null) {
            return null;
        }
        String string = url.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    return URI.create(string.substring(0, string.indexOf("?")));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final Map<String, String> LIZ(URI uri) {
        boolean z;
        Map<String, List<String>> map;
        CookieHandler cookieHandler;
        HashMap map2 = new HashMap();
        if ((this.LJJIII & 2) <= 0) {
            String requestProperty = getRequestProperty("x-ttnet-bypass-cookie");
            if (!TextUtils.isEmpty(requestProperty) && CardStruct.IStatusCode.DEFAULT.equals(requestProperty)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                HashMap map3 = new HashMap();
                List<Pair<String, String>> list = this.LIZLLL;
                if (list != null) {
                    for (Pair pair : (ArrayList) list) {
                        Object obj = pair.first;
                        Object obj2 = pair.second;
                        List linkedList = (List) map3.get(obj);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(obj2);
                        map3.put(obj, linkedList);
                    }
                }
                map3.put("x-tt-get-cookie-source", new LinkedList());
                try {
                    if (this.LJJI == null) {
                        this.LJJI = CookieHandler.getDefault();
                    }
                    cookieHandler = this.LJJI;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1496600p34.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Loading cookies failed for ");
                        sbLIZ.append(getURL().toString());
                        sbLIZ.append(" e = ");
                        sbLIZ.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                if (cookieHandler != null) {
                    map = cookieHandler.get(uri, map3);
                } else {
                    map = null;
                }
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if ("x-tt-get-cookie-source".equals(key) && !entry.getValue().isEmpty()) {
                            try {
                                this.LJJIIZ = CastIntegerProtector.parseInt(entry.getValue().get(0));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LJJIIZ = -1;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                            if (!entry.getValue().isEmpty()) {
                                int i = 0;
                                for (String str : entry.getValue()) {
                                    if (i > 0) {
                                        sb.append("; ");
                                    }
                                    sb.append(str);
                                    i++;
                                }
                                map2.put(key, sb.toString());
                            }
                        }
                    }
                }
                return map2;
            }
        }
        if (C1496600p34.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Do not read cookie from TTNet, url:");
            sbLIZ2.append(uri);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return map2;
    }

    public final void LJFF(int i) throws InterruptedIOException {
        try {
            this.LIZIZ.LIZ(i);
        } catch (SocketTimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            j jVar = this.LIZJ;
            if (jVar != null) {
                jVar.LIZJ();
                ExecutorC1497250p47 executorC1497250p47 = this.LIZIZ;
                executorC1497250p47.LLILLL = false;
                executorC1497250p47.LIZ(i / 2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            j jVar2 = this.LIZJ;
            if (jVar2 != null) {
                jVar2.LJ("Unexpected request usage, caught in CronetHttpURLConnection.", e2);
            }
            ExecutorC1497250p47 executorC1497250p472 = this.LIZIZ;
            executorC1497250p472.LLILLL = false;
            executorC1497250p472.LIZ(i / 2);
        }
    }

    public final int LJI(String str) {
        for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
            if (((String) ((Pair) ListProtector.get(this.LIZLLL, i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            LJIIIZ();
            Map<String, List<String>> mapLJII = LJII();
            if (!mapLJII.containsKey(str)) {
                return null;
            }
            return (String) ListProtector.get(mapLJII.get(str), r1.size() - 1);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry entry;
        List<Map.Entry<String, String>> listLJIIIIZZ;
        try {
            LJIIIZ();
            listLJIIIIZZ = LJIIIIZZ();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i >= listLJIIIIZZ.size()) {
            entry = null;
        } else {
            entry = (Map.Entry) ListProtector.get(listLJIIIIZZ, i);
        }
        if (entry == null) {
            return null;
        }
        return (String) entry.getKey();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int iLJI = LJI(str);
        if (iLJI >= 0) {
            return (String) ((Pair) ListProtector.get(this.LIZLLL, iLJI)).second;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setInputStreamBufferSize(int i) {
        this.LJIJJLI = i;
    }

    public void setOutputStreamBufferSize(int i) {
        this.LJIL = i;
    }

    public void setRequestFlag(int i) {
        this.LJJIFFI = i;
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        if ("PATCH".equals(str)) {
            if (!((HttpURLConnection) this).connected) {
                ((HttpURLConnection) this).method = str;
                return;
            }
            throw new ProtocolException("Can't reset method: already connected");
        }
        super.setRequestMethod(str);
    }

    public void setRequestPriority(int i) {
        this.LJIILLIIL = i;
    }

    public void setRequestTimeout(int i) {
        this.LJIJJ = i;
    }

    public void setRequestTypeFlags(int i) {
        this.LJJIII = i | this.LJJIII;
    }

    public void setSocketConnectTimeout(int i) {
        this.LJIIZILJ = i;
    }

    public void setSocketReadTimeout(int i) {
        this.LJIJ = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.LJIJI = i;
    }

    public void setThrottleNetSpeed(long j) {
        this.LJJII = j;
        j jVar = this.LIZJ;
        if (jVar != null) {
            jVar.LJIILIIL(j);
        }
    }

    public void setTrafficStatsTag(int i) {
        if (!((HttpURLConnection) this).connected) {
            this.LJ = true;
            this.LJFF = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public void setTrafficStatsUid(int i) {
        if (!((HttpURLConnection) this).connected) {
            this.LJI = true;
            this.LJII = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry entry;
        List<Map.Entry<String, String>> listLJIIIIZZ;
        try {
            LJIIIZ();
            listLJIIIIZZ = LJIIIIZZ();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i >= listLJIIIIZZ.size()) {
            entry = null;
        } else {
            entry = (Map.Entry) ListProtector.get(listLJIIIIZZ, i);
        }
        if (entry == null) {
            return null;
        }
        return (String) entry.getValue();
    }

    public final void LJIIJ(String str, Map<String, List<String>> map) {
        String string;
        String requestProperty = getRequestProperty("x-ttnet-bypass-cookie");
        if (!TextUtils.isEmpty(requestProperty) && CardStruct.IStatusCode.DEFAULT.equals(requestProperty)) {
            if (C1496600p34.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not write cookie from TTNet, url:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            return;
        }
        if (C1496600p34.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Saving cookies for url: ");
            if (TextUtils.isEmpty(str)) {
                string = getURL().toString();
            } else {
                string = str;
            }
            sbLIZ2.append(string);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        try {
            if (this.LJJI == null) {
                this.LJJI = CookieHandler.getDefault();
            }
            if (this.LJJI != null) {
                if (TextUtils.isEmpty(str)) {
                    this.LJJI.put(LJIILIIL(getURL()), map);
                    return;
                }
                URI uriLJIILIIL = LJIILIIL(new URL(str));
                if ((this.LJJIII & 1) == 1) {
                    TreeMap treeMap = new TreeMap(map);
                    treeMap.put("webview-origin-url", Collections.singletonList(getURL().getHost()));
                    this.LJJI.put(uriLJIILIIL, treeMap);
                    return;
                }
                this.LJJI.put(uriLJIILIIL, map);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1496600p34.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Saving cookies failed for ");
                if (TextUtils.isEmpty(str)) {
                    str = getURL().toString();
                }
                sbLIZ3.append(str);
                sbLIZ3.append(" e = ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        LJIIJJI(str, str2, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void configureConnection(String str, Object... objArr) {
        str.getClass();
        switch (str.hashCode()) {
            case -2098478356:
                if (str.equals("setSocketConnectTimeout")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIIZILJ = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case -1400774487:
                if (str.equals("setInputStreamBufferSize")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIJJLI = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case -1262337831:
                if (str.equals("setRequestFlag")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJJIFFI = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case -976756188:
                if (str.equals("setOutputStreamBufferSize")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIL = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case -722926986:
                if (str.equals("setThrottleNetSpeed")) {
                    C2338309Ef.LIZ(new Class[]{Long.TYPE}, objArr);
                    long jLongValue = ((Long) objArr[0]).longValue();
                    this.LJJII = jLongValue;
                    j jVar = this.LIZJ;
                    if (jVar != null) {
                        jVar.LJIILIIL(jLongValue);
                        return;
                    }
                    return;
                }
                break;
            case -534987466:
                if (str.equals("setSocketReadTimeout")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIJ = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case -107284268:
                if (str.equals("setRequestTimeout")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIJJ = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case 166051698:
                if (str.equals("setAuthCredentials")) {
                    C2338309Ef.LIZ(new Class[]{String.class, String.class}, objArr);
                    this.LJJIIJ = (String) objArr[0];
                    this.LJJIIJZLJL = (String) objArr[1];
                    return;
                }
                break;
            case 423591456:
                if (str.equals("setRequestTypeFlags")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJJIII = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case 1221363607:
                if (str.equals("setSocketWriteTimeout")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIJI = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case 1880243345:
                if (str.equals("setRequestPriority")) {
                    C2338309Ef.LIZ(new Class[]{Integer.TYPE}, objArr);
                    this.LJIILLIIL = ((Integer) objArr[0]).intValue();
                    return;
                }
                break;
            case 2141877079:
                if (str.equals("enableFixCancelRequestReport")) {
                    C2338309Ef.LIZ(new Class[0], objArr);
                    this.LJJIJIIJI = true;
                    return;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown method name: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setAuthCredentials(String str, String str2) {
        this.LJJIIJ = str;
        this.LJJIIJZLJL = str2;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        LJIIJJI(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, e eVar, boolean z) {
        super(url);
        this.LJJIIZI = new AtomicBoolean(false);
        this.LJJIJ = new AtomicBoolean(false);
        this.LJJIJIIJI = false;
        this.LIZ = eVar;
        this.LIZIZ = new ExecutorC1497250p47();
        if (z) {
            this.LJIIIIZZ = new C1496900p3Y(this) { // from class: X.0p3X
                public C1496880p3W LLILZIL;
                public boolean LLILZLL;

                public final void LIZLLL() throws IOException {
                    Segment segmentTake;
                    if (this.LLILZLL) {
                        return;
                    }
                    this.LLILZIL = new C1496880p3W();
                    while (true) {
                        C1496880p3W c1496880p3W = this.LLILZIL;
                        Segment segment = c1496880p3W.LIZ;
                        if (segment == null) {
                            segmentTake = SegmentPool.take();
                            c1496880p3W.LIZ = segmentTake;
                            segmentTake.prev = segmentTake;
                            segmentTake.next = segmentTake;
                        } else {
                            Segment segment2 = segment.prev;
                            if (!segment2.isWritable()) {
                                segment2.push(SegmentPool.take());
                            }
                            segmentTake = c1496880p3W.LIZ.prev;
                        }
                        ByteBuffer innerBuffer = segmentTake.getInnerBuffer();
                        int iPosition = innerBuffer.position();
                        CronetHttpURLConnection cronetHttpURLConnection = this.LL;
                        j jVar = cronetHttpURLConnection.LIZJ;
                        if (jVar != null) {
                            jVar.LJI(innerBuffer);
                            cronetHttpURLConnection.LJFF(cronetHttpURLConnection.getReadTimeout());
                        }
                        if (this.LLILZ == null) {
                            int iPosition2 = innerBuffer.position() - iPosition;
                            if (iPosition2 == 0) {
                                if (iPosition == 0) {
                                    if (C1496600p34.LIZ()) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("no new data, release empty segment ");
                                        sbLIZ.append(this.LLILZIL.LIZIZ);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    segmentTake.release();
                                } else {
                                    if (C1496600p34.LIZ()) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("no new data, save this segment ");
                                        sbLIZ2.append(this.LLILZIL.LIZIZ);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                    }
                                    segmentTake.completeRead();
                                }
                                this.LLILZLL = true;
                                return;
                            }
                            C1496880p3W c1496880p3W2 = this.LLILZIL;
                            int i = c1496880p3W2.LIZIZ + iPosition2;
                            c1496880p3W2.LIZIZ = i;
                            if (i > 5242880) {
                                while (true) {
                                    Segment segment3 = c1496880p3W2.LIZ;
                                    if (segment3 == null) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("Download too large ");
                                        sbLIZ3.append(this.LLILZIL.LIZIZ);
                                        sbLIZ3.append(" ");
                                        sbLIZ3.append(5242880);
                                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                    c1496880p3W2.LIZ = segment3.release();
                                }
                            } else if (!segmentTake.isWritable()) {
                                if (C1496600p34.LIZ()) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("new data but full, will use new segment next ");
                                    sbLIZ4.append(this.LLILZIL.LIZIZ);
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                }
                                segmentTake.completeRead();
                            } else if (C1496600p34.LIZ()) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("new data, continue read with this segment ");
                                sbLIZ5.append(this.LLILZIL.LIZIZ);
                                sbLIZ5.append(" remaining: ");
                                sbLIZ5.append(innerBuffer.remaining());
                                C2188811AlT.LIZIZ(sbLIZ5);
                            }
                        } else {
                            C1496880p3W c1496880p3W3 = this.LLILZIL;
                            while (true) {
                                Segment segment4 = c1496880p3W3.LIZ;
                                if (segment4 == null) {
                                    throw this.LLILZ;
                                }
                                c1496880p3W3.LIZ = segment4.release();
                            }
                        }
                    }
                }

                @Override // X.C1496900p3Y, java.io.InputStream
                public final int available() throws IOException {
                    LIZLLL();
                    C1496880p3W c1496880p3W = this.LLILZIL;
                    int i = c1496880p3W.LIZIZ;
                    if (i != 0) {
                        if (i > 0) {
                            return i;
                        }
                        return 0;
                    }
                    if (this.LLILZ == null) {
                        return 0;
                    }
                    while (true) {
                        Segment segment = c1496880p3W.LIZ;
                        if (segment == null) {
                            throw this.LLILZ;
                        }
                        c1496880p3W.LIZ = segment.release();
                    }
                }

                @Override // X.C1496900p3Y, java.io.InputStream
                public final int read() throws IOException {
                    LIZLLL();
                    C1496880p3W c1496880p3W = this.LLILZIL;
                    if (c1496880p3W.LIZIZ <= 0) {
                        return -1;
                    }
                    byte[] bArr = new byte[1];
                    c1496880p3W.LIZIZ(bArr, 0, 1);
                    return bArr[0] & 255;
                }

                {
                    super(this);
                }

                @Override // X.C1496900p3Y, java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
                    LIZLLL();
                    if (bArr.length == 0) {
                        return 0;
                    }
                    C1496880p3W c1496880p3W = this.LLILZIL;
                    if (c1496880p3W.LIZIZ <= 0) {
                        return -1;
                    }
                    c1496880p3W.getClass();
                    C1496880p3W.LIZ(bArr.length, i, i2);
                    int iMin = Math.min(c1496880p3W.LIZIZ, i2);
                    if (C1496600p34.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("start get buffer, size is ");
                        sbLIZ.append(c1496880p3W.LIZIZ);
                        sbLIZ.append(" byteCount is ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    int i3 = i;
                    while (iMin > 0) {
                        int iLIZIZ = c1496880p3W.LIZIZ(bArr, i3, iMin);
                        if (iLIZIZ != -1) {
                            i3 += iLIZIZ;
                            iMin -= iLIZIZ;
                            if (C1496600p34.LIZ()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("get segment buffer, n is ");
                                sbLIZ2.append(iLIZIZ);
                                sbLIZ2.append(" offset is ");
                                sbLIZ2.append(i3);
                                sbLIZ2.append(" bytesRead is ");
                                sbLIZ2.append(iMin);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                    return i3 - i;
                }
            };
        } else {
            this.LJIIIIZZ = new C1496900p3Y(this);
        }
        this.LIZLLL = new ArrayList();
        this.LJJI = CookieHandler.getDefault();
        this.LJJIIZ = -1;
    }

    public final void LJIIJJI(String str, String str2, boolean z) {
        if (!((HttpURLConnection) this).connected) {
            int iLJI = LJI(str);
            if (iLJI >= 0) {
                if (z) {
                    ListProtector.remove(this.LIZLLL, iLJI);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot add multiple headers of the same key, ");
                    sbLIZ.append(str);
                    sbLIZ.append(". crbug.com/432719.");
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            ((ArrayList) this.LIZLLL).add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
