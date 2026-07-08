package com.bytedance.pia.core.utils;

import X.C080U;
import X.C098200Yq;
import X.C09SW;
import X.C0X0P;
import X.C0X52;
import X.C0X9S;
import X.C1515120pWw;
import X.C1535550q3t;
import X.C1535560q3u;
import X.C1542560qFC;
import X.C15438062q;
import X.C189200o6;
import X.C1BPP;
import X.C2088908Gh;
import X.C2097908Jt;
import X.C2175508fh;
import X.C2188811AlT;
import X.EnumC1535440q3i;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1503700pEW;
import X.InterfaceC1530550pvp;
import X.InterfaceC1532650pzD;
import X.InterfaceC1535470q3l;
import X.InterfaceC1535500q3o;
import X.InterfaceC1537230q6b;
import X.InterfaceC1542530qF9;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC820680WHi;
import android.text.TextUtils;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultResourceLoader implements InterfaceC1535500q3o {
    public final InterfaceC1535500q3o LIZ;

    /* JADX INFO: loaded from: classes4.dex */
    public interface ResourceApi {
        @InterfaceC2174608fY
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list);
    }

    public DefaultResourceLoader() {
        this(null);
    }

    public DefaultResourceLoader(InterfaceC1535500q3o interfaceC1535500q3o) {
        this.LIZ = interfaceC1535500q3o instanceof DefaultResourceLoader ? null : interfaceC1535500q3o;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0q3t] */
    public static C1535550q3t LJ(C0X52 c0x52) {
        final String strLIZIZ;
        final String string;
        final String str;
        Charset charsetLIZ;
        List<C080U> list = c0x52.LIZ.LIZLLL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C080U c080u : list) {
            Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C0X0P c0x0pLIZJ = C0X0P.LIZJ(C1515120pWw.LJIIJJI("Content-Type", c0x52.LIZ.LIZLLL));
        if (c0x0pLIZJ == null) {
            strLIZIZ = "text/html";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0x0pLIZJ.LIZIZ);
            sbLIZ.append('/');
            sbLIZ.append(c0x0pLIZJ.LIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c0x0pLIZJ == null || (charsetLIZ = c0x0pLIZJ.LIZ(null)) == null || (string = charsetLIZ.toString()) == null) {
            string = "UTF-8";
        }
        C2175508fh c2175508fh = c0x52.LIZ;
        final int i = c2175508fh.LIZIZ;
        if (TextUtils.isEmpty(c2175508fh.LIZJ)) {
            str = "OK";
        } else {
            str = c0x52.LIZ.LIZJ;
        }
        final InputStream inputStreamIn = ((TypedInput) c0x52.LIZIZ).in();
        return new InterfaceC1532650pzD() { // from class: X.0q3t
            @Override // X.InterfaceC1532650pzD
            public final String LIZ() {
                return str;
            }

            @Override // X.InterfaceC1532650pzD
            public final String LIZIZ() {
                return string;
            }

            @Override // X.InterfaceC1532650pzD
            public final EnumC1535440q3i LIZJ() {
                return EnumC1535440q3i.Online;
            }

            @Override // X.InterfaceC1532650pzD
            public final InputStream getData() {
                return inputStreamIn;
            }

            @Override // X.InterfaceC1532650pzD
            public final Map<String, String> getHeaders() {
                return linkedHashMap;
            }

            @Override // X.InterfaceC1532650pzD
            public final String getMimeType() {
                return strLIZIZ;
            }

            @Override // X.InterfaceC1532650pzD
            public final int getStatusCode() {
                return i;
            }
        };
    }

    public static C0X9S LIZLLL(String str, Map map) throws IOException {
        ResourceApi resourceApi;
        InterfaceC1503700pEW interfaceC1503700pEWCreate;
        HashMap map2 = new HashMap();
        android.util.Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, map2);
        ArrayList arrayList = null;
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        InterfaceC1537230q6b<InterfaceC1503700pEW> interfaceC1537230q6b = C1542560qFC.LJFF;
        if (interfaceC1537230q6b == null || (interfaceC1503700pEWCreate = interfaceC1537230q6b.create()) == null || (resourceApi = (ResourceApi) interfaceC1503700pEWCreate.LIZ(ResourceApi.class, (String) pairLIZJ.first)) == null) {
            resourceApi = (ResourceApi) C1515120pWw.LJIIIZ(ResourceApi.class, (String) pairLIZJ.first);
        }
        return resourceApi.doGet(false, (String) pairLIZJ.second, map2, arrayList);
    }

    @Override // X.InterfaceC1535500q3o
    public final InterfaceC1532650pzD LIZ(EnumC1535440q3i enumC1535440q3i, C1535560q3u c1535560q3u) {
        Object c098200Yq;
        C1535550q3t c1535550q3tLJ = null;
        try {
            InterfaceC1535500q3o interfaceC1535500q3o = this.LIZ;
            if (interfaceC1535500q3o != null) {
                c098200Yq = interfaceC1535500q3o.LIZ(enumC1535440q3i, c1535560q3u);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InterfaceC1532650pzD interfaceC1532650pzD = (InterfaceC1532650pzD) c098200Yq;
        if (interfaceC1532650pzD != null) {
            C1BPP.LJFF(6, "[Resource] Custom resource loader load success.", null);
            return interfaceC1532650pzD;
        }
        C1BPP.LJFF(6, "[Resource] Custom resource loader load failed, fallback to default resource loader.", null);
        try {
            c1535550q3tLJ = LJ(LIZLLL(c1535560q3u.getUrl().toString(), null).execute());
            return c1535550q3tLJ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl != null) {
                C1BPP.LJFF(4, "[Resource] Load online failed:", thM5exceptionOrNullimpl);
            }
            return c1535550q3tLJ;
        }
    }

    public final InterfaceC1542530qF9 LIZJ(InterfaceC1535470q3l interfaceC1535470q3l, final InterfaceC1530550pvp<InterfaceC1532650pzD> interfaceC1530550pvp, final InterfaceC1530550pvp<Throwable> interfaceC1530550pvp2) {
        C1BPP.LJFF(6, "[Resource] Custom resource loader load failed, fallback to default resource loader.", null);
        try {
            final C0X9S c0x9sLIZLLL = LIZLLL(interfaceC1535470q3l.getUrl().toString(), interfaceC1535470q3l.getRequestHeaders());
            c0x9sLIZLLL.enqueue(new C09SW<TypedInput>() { // from class: X.0q3p
                @Override // X.C09SW
                public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                }

                @Override // X.C09SW
                public final void onAsyncResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                    Object c098200Yq;
                    InterfaceC1530550pvp<InterfaceC1532650pzD> interfaceC1530550pvp3;
                    C1BPP.LJFF(6, "[Resource] response start.", null);
                    if (c0x52 == null) {
                        InterfaceC1530550pvp<Throwable> interfaceC1530550pvp4 = interfaceC1530550pvp2;
                        if (interfaceC1530550pvp4 != null) {
                            interfaceC1530550pvp4.accept(new NullPointerException("Response is null!"));
                            return;
                        }
                        return;
                    }
                    try {
                        this.getClass();
                        c098200Yq = DefaultResourceLoader.LJ(c0x52);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    InterfaceC1530550pvp<Throwable> interfaceC1530550pvp5 = interfaceC1530550pvp2;
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null && interfaceC1530550pvp5 != null) {
                        interfaceC1530550pvp5.accept(thM5exceptionOrNullimpl);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null || (interfaceC1530550pvp3 = interfaceC1530550pvp) == null) {
                        return;
                    }
                    interfaceC1530550pvp3.accept((InterfaceC1532650pzD) c098200Yq);
                }

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                    InterfaceC1530550pvp<Throwable> interfaceC1530550pvp3 = interfaceC1530550pvp2;
                    if (interfaceC1530550pvp3 != null) {
                        interfaceC1530550pvp3.accept(th);
                    }
                }
            });
            return new InterfaceC1542530qF9() { // from class: X.0q3s
                @Override // X.InterfaceC1542530qF9
                public final void release() {
                    c0x9sLIZLLL.cancel();
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null && interfaceC1530550pvp2 != null) {
                interfaceC1530550pvp2.accept(thM5exceptionOrNullimpl);
            }
            return new InterfaceC1542530qF9() { // from class: X.0q3v
                @Override // X.InterfaceC1542530qF9
                public final void release() {
                }
            };
        }
    }

    @Override // X.InterfaceC1535500q3o
    public final InterfaceC1542530qF9 LIZIZ(EnumC1535440q3i enumC1535440q3i, final InterfaceC1535470q3l interfaceC1535470q3l, final InterfaceC1530550pvp<InterfaceC1532650pzD> interfaceC1530550pvp, final InterfaceC1530550pvp<Throwable> interfaceC1530550pvp2) {
        InterfaceC1535500q3o interfaceC1535500q3o = this.LIZ;
        if (interfaceC1535500q3o != null) {
            return interfaceC1535500q3o.LIZIZ(enumC1535440q3i, interfaceC1535470q3l, new InterfaceC1530550pvp() { // from class: X.0q3q
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj) {
                    if (obj != null) {
                        C1BPP.LJFF(6, "[Resource] Custom resource loader load success.", null);
                        InterfaceC1530550pvp<InterfaceC1532650pzD> interfaceC1530550pvp3 = interfaceC1530550pvp;
                        if (interfaceC1530550pvp3 != null) {
                            interfaceC1530550pvp3.accept(obj);
                            return;
                        }
                        return;
                    }
                    this.LIZJ(interfaceC1535470q3l, interfaceC1530550pvp, interfaceC1530550pvp2);
                }
            }, new InterfaceC1530550pvp() { // from class: X.0q3r
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj) {
                    this.LIZJ(interfaceC1535470q3l, interfaceC1530550pvp, interfaceC1530550pvp2);
                }
            });
        }
        return LIZJ(interfaceC1535470q3l, interfaceC1530550pvp, interfaceC1530550pvp2);
    }
}
