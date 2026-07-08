package com.bytedance.bpea.net3rd.impl;

import X.C080U;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C1974107oJ;
import X.C837560WtO;
import X.C839620Wwi;
import X.InterfaceC1904907d9;
import X.InterfaceC837550WtN;
import X.InterfaceC837570WtP;
import X.InterfaceC837580WtQ;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class BPEAVerifyInterceptor implements InterfaceC1904907d9 {
    public final boolean LL;

    public BPEAVerifyInterceptor(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Method method;
        List<?> list;
        InterfaceC837580WtQ interfaceC837580WtQ;
        Object objValue;
        LinkedHashMap linkedHashMap;
        C0XLP c0xlpLJIIJ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C1974107oJ c1974107oJ = (C1974107oJ) request.tag(C1974107oJ.class);
        if (c1974107oJ != null) {
            method = c1974107oJ.LIZ;
        } else {
            method = null;
        }
        C1974107oJ c1974107oJ2 = (C1974107oJ) request.tag(C1974107oJ.class);
        if (c1974107oJ2 != null) {
            list = c1974107oJ2.LIZIZ;
        } else {
            list = null;
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        if (method != null && (interfaceC837580WtQ = (InterfaceC837580WtQ) method.getAnnotation(InterfaceC837580WtQ.class)) != null) {
            int iValue = interfaceC837580WtQ.value();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C080U("x-tt-dataflow-id", String.valueOf(iValue)));
            arrayList.add(new C080U("x-metasec-third-party-net-standard-api", "1"));
            if (C839620Wwi.LIZJ) {
                arrayList.add(new C080U("x-third-party-net-standard-api", "1"));
            }
            if (this.LL) {
                arrayList.addAll(request.getHeaders());
                arrayList.add(new C080U("x-metasec-network-zone", CardStruct.IStatusCode.DEFAULT));
            } else {
                for (C080U c080u : request.getHeaders()) {
                    if (!Intrinsics.LJFF(c080u.LIZ, "x-metasec-bypass-ttnet-features")) {
                        arrayList.add(c080u);
                    }
                }
                arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
                arrayList.add(new C080U("x-metasec-network-zone", "2"));
                arrayList.add(new C080U("x-metasec-bypass-api-log", "1"));
            }
            c0xmbNewBuilder.LIZJ = arrayList;
            InterfaceC837550WtN interfaceC837550WtN = (InterfaceC837550WtN) method.getAnnotation(InterfaceC837550WtN.class);
            if (interfaceC837550WtN != null) {
                objValue = interfaceC837550WtN.value();
            } else {
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                int length = parameterAnnotations.length;
                objValue = null;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Annotation[] annotationArr = parameterAnnotations[i];
                    int i3 = i2 + 1;
                    int length2 = annotationArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        if (annotationArr[i4] instanceof InterfaceC837550WtN) {
                            if (list != null) {
                                objValue = ListProtector.get(list, i2);
                            } else {
                                objValue = null;
                            }
                            if (!(objValue instanceof String)) {
                                throw new C837560WtO("The parameter type marked by the `RelativePath` annotation must be a string type.");
                            }
                        } else {
                            i4++;
                        }
                    }
                    i++;
                    i2 = i3;
                }
            }
            InterfaceC837570WtP interfaceC837570WtP = (InterfaceC837570WtP) method.getAnnotation(InterfaceC837570WtP.class);
            if (interfaceC837570WtP != null) {
                linkedHashMap = new LinkedHashMap();
                for (String str : interfaceC837570WtP.value()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() == 2) {
                        linkedHashMap.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                    } else {
                        throw new C837560WtO("FixedQuery value must contain one \"=\" character");
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (objValue != null || linkedHashMap != null) {
                C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
                if (c0xlqLJIIL != null && (c0xlpLJIIJ = c0xlqLJIIL.LJIIJ()) != null) {
                    String str2 = (String) objValue;
                    if (str2 != null) {
                        if (u.LJJIIJZLJL(str2, "/", false)) {
                            c0xlpLJIIJ.LJ(str2);
                        } else {
                            c0xlpLJIIJ.LJ("/".concat(str2));
                        }
                    }
                    if (linkedHashMap != null) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c0xlpLJIIJ.LIZ((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
                } else {
                    throw new C837560WtO("url build error:" + request.getUrl() + '.');
                }
            }
            return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        }
        throw new C837560WtO("must have a DataflowID annotation");
    }
}
