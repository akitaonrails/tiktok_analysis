package com.bytedance.retrofit2.client;

import X.AbstractC842530X3j;
import X.C080U;
import X.C08I1;
import X.C0XMB;
import X.C0XMH;
import X.C1494570ozn;
import X.C304650Bwt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public int commonParamLevel;
    public Object extraInfo;
    public final List<C080U> headers;
    public boolean isBodyEncryptEnabled;
    public boolean isQueryEncryptEnabled;
    public final int maxLength;
    public final String method;
    public C1494570ozn metrics;
    public final int priorityLevel;
    public int queryFilterPriority;
    public final AbstractC842530X3j requestBody;
    public final int requestPriorityLevel;
    public final boolean responseStreaming;
    public final String serviceType;
    public final Map<Class<?>, Object> tags;
    public URI uri;
    public final String url;

    public static URI safeCreateUri(String str) {
        return com_bytedance_retrofit2_client_Request_com_ss_android_ugc_aweme_lancet_fluent_HighFreqFuncOptLancet_safeCreateUri(str);
    }

    private URI getUri() {
        return com_bytedance_retrofit2_client_Request_com_ss_android_ugc_aweme_lancet_fluent_HighFreqFuncOptLancet_safeCreateUri(this.url);
    }

    public TypedOutput getBody() {
        AbstractC842530X3j abstractC842530X3j = this.requestBody;
        return abstractC842530X3j != null ? new C0XMH(abstractC842530X3j) : this.body;
    }

    public C0XMB newBuilder() {
        return new C0XMB(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String getHost() {
        URI uri = getUri();
        if (uri == null) {
            return null;
        }
        return uri.getHost();
    }

    public String getPath() {
        URI uri = getUri();
        if (uri == null) {
            return null;
        }
        return uri.getPath();
    }

    public boolean isBypassDispatch() {
        List<C080U> listHeaders = headers("x-tt-bypass-dp");
        return listHeaders != null && listHeaders.size() > 0 && "1".equals(((C080U) ListProtector.get(listHeaders, 0)).LIZIZ);
    }

    public boolean isPureRequest() {
        List<C080U> listHeaders = headers("x-metasec-bypass-ttnet-features");
        return listHeaders != null && listHeaders.size() > 0 && "1".equals(((C080U) ListProtector.get(listHeaders, 0)).LIZIZ);
    }

    public int getCommonParamLevel() {
        return this.commonParamLevel;
    }

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public List<C080U> getHeaders() {
        return this.headers;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getMethod() {
        return this.method;
    }

    public C1494570ozn getMetrics() {
        return this.metrics;
    }

    public int getPriorityLevel() {
        return this.priorityLevel;
    }

    public int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public AbstractC842530X3j getRequestBody() {
        return this.requestBody;
    }

    public int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public boolean isBodyEncryptEnabled() {
        return this.isBodyEncryptEnabled;
    }

    public boolean isQueryEncryptEnabled() {
        return this.isQueryEncryptEnabled;
    }

    public boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    public Request(C0XMB c0xmb) {
        String str = c0xmb.LIZIZ;
        if (str != null) {
            this.url = str;
            String str2 = c0xmb.LIZ;
            if (str2 != null) {
                this.method = str2;
                if (c0xmb.LIZJ == null) {
                    this.headers = Collections.emptyList();
                } else {
                    this.headers = Collections.unmodifiableList(new ArrayList(c0xmb.LIZJ));
                }
                this.body = c0xmb.LIZLLL;
                this.requestBody = c0xmb.LJ;
                this.priorityLevel = c0xmb.LJFF;
                this.requestPriorityLevel = c0xmb.LJI;
                this.responseStreaming = c0xmb.LJII;
                this.maxLength = c0xmb.LJIIIIZZ;
                this.addCommonParam = c0xmb.LJIIIZ;
                this.commonParamLevel = c0xmb.LJIIJ;
                this.extraInfo = c0xmb.LJIIJJI;
                this.serviceType = c0xmb.LJIIL;
                this.metrics = c0xmb.LJIILIIL;
                this.tags = c0xmb.LJIILJJIL;
                this.isQueryEncryptEnabled = c0xmb.LJIILL;
                this.isBodyEncryptEnabled = c0xmb.LJIILLIIL;
                return;
            }
            throw new NullPointerException("Method must not be null.");
        }
        throw new NullPointerException("URL must not be null.");
    }

    public static URI com_bytedance_retrofit2_client_Request__safeCreateUri$___twin___(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return new URI(str);
            } catch (URISyntaxException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return createUriWithOutQuery(str);
                }
            }
        }
        return null;
    }

    public static URI com_bytedance_retrofit2_client_Request_com_ss_android_ugc_aweme_lancet_fluent_HighFreqFuncOptLancet_safeCreateUri(String str) {
        if (C304650Bwt.LIZ) {
            return com_bytedance_retrofit2_client_Request__safeCreateUri$___twin___(str);
        }
        C08I1<String, URI> c08i1 = C304650Bwt.LIZIZ;
        URI uri = c08i1.get(str);
        if (uri != null) {
            return uri;
        }
        URI uriCom_bytedance_retrofit2_client_Request__safeCreateUri$___twin___ = com_bytedance_retrofit2_client_Request__safeCreateUri$___twin___(str);
        c08i1.put(str, uriCom_bytedance_retrofit2_client_Request__safeCreateUri$___twin___);
        return uriCom_bytedance_retrofit2_client_Request__safeCreateUri$___twin___;
    }

    public static URI createUriWithOutQuery(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                int iIndexOf = str.indexOf("?");
                if (iIndexOf > 0) {
                    str = str.substring(0, iIndexOf);
                }
                return URI.create(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public C080U getFirstHeader(String str) {
        List<C080U> list;
        if (str != null && (list = this.headers) != null) {
            for (C080U c080u : list) {
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    return c080u;
                }
            }
        }
        return null;
    }

    public List<C080U> headers(String str) {
        List<C080U> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.headers) != null) {
            for (C080U c080u : list) {
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c080u);
                }
            }
        }
        return arrayList;
    }

    public void setBodyEncryptEnabled(boolean z) {
        this.isBodyEncryptEnabled = z;
    }

    public void setCommonParamLevel(int i) {
        this.commonParamLevel = i;
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public void setMetrics(C1494570ozn c1494570ozn) {
        this.metrics = c1494570ozn;
    }

    public void setQueryEncryptEnabled(boolean z) {
        this.isQueryEncryptEnabled = z;
    }

    public void setQueryFilterPriority(int i) {
        this.queryFilterPriority = i;
    }

    public <T> T tag(Class<? extends T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return cls.cast(map.get(cls));
    }

    public Request(String str, String str2, List<C080U> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i, 3, z, i2, z2, 0, obj, "", null);
    }

    public Request(String str, String str2, List<C080U> list, TypedOutput typedOutput, AbstractC842530X3j abstractC842530X3j, int i, int i2, boolean z, int i3, boolean z2, int i4, Object obj, String str3, Map<Class<?>, Object> map) {
        if (str != null) {
            if (str2 != null) {
                this.method = str;
                this.url = str2;
                if (list == null) {
                    this.headers = Collections.emptyList();
                } else {
                    this.headers = Collections.unmodifiableList(new ArrayList(list));
                }
                this.body = typedOutput;
                this.requestBody = abstractC842530X3j;
                this.priorityLevel = i;
                this.requestPriorityLevel = i2;
                this.responseStreaming = z;
                this.maxLength = i3;
                this.addCommonParam = z2;
                this.commonParamLevel = i4;
                this.extraInfo = obj;
                this.serviceType = str3;
                this.tags = map;
                return;
            }
            throw new NullPointerException("URL must not be null.");
        }
        throw new NullPointerException("Method must not be null.");
    }
}
