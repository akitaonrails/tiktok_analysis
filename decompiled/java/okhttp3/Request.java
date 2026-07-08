package okhttp3;

import X.AbstractC842530X3j;
import X.C0X1U;
import X.C0X1V;
import X.C0X31;
import X.C0X33;
import X.C0XLQ;
import X.C2188811AlT;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xlp.c;

/* JADX INFO: loaded from: classes14.dex */
public final class Request {
    public final AbstractC842530X3j body;
    public volatile C0X31 cacheControl;
    public final C0X1V headers;
    public final String method;
    public final C0XLQ originUrl;
    public final Map<Class<?>, Object> tags;
    public final C0XLQ url;

    public C0X31 cacheControl() {
        C0X31 c0x31 = this.cacheControl;
        if (c0x31 != null) {
            return c0x31;
        }
        C0X31 c0x31LIZ = C0X31.LIZ(this.headers);
        this.cacheControl = c0x31LIZ;
        return c0x31LIZ;
    }

    public boolean isHttps() {
        return this.url.LIZ.equals("https");
    }

    public C0X33 newBuilder() {
        return new C0X33(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request{method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC842530X3j body() {
        return this.body;
    }

    public C0X1V headers() {
        return this.headers;
    }

    public String method() {
        return this.method;
    }

    public C0XLQ originUrl() {
        return this.originUrl;
    }

    public C0XLQ url() {
        return this.url;
    }

    public Request(C0X33 c0x33) {
        Map<Class<?>, Object> mapUnmodifiableMap;
        this.url = c0x33.LIZ;
        this.originUrl = c0x33.LIZIZ;
        this.method = c0x33.LIZJ;
        C0X1U c0x1u = c0x33.LIZLLL;
        c0x1u.getClass();
        this.headers = new C0X1V(c0x1u);
        this.body = c0x33.LJ;
        Map<Class<?>, Object> map = c0x33.LJFF;
        byte[] bArr = c.LIZ;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.tags = mapUnmodifiableMap;
    }

    public String header(String str) {
        return this.headers.LIZLLL(str);
    }

    public List<String> headers(String str) {
        return this.headers.LJIIJJI(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}
