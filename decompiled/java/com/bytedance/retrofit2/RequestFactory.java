package com.bytedance.retrofit2;

import X.AbstractC842530X3j;
import X.C040J;
import X.C080U;
import X.C092G;
import X.C09SW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X06;
import X.C0X7B;
import X.C0X7C;
import X.C0X9N;
import X.C0X9O;
import X.C0X9P;
import X.C0X9Q;
import X.C0XLQ;
import X.C1494570ozn;
import X.C1500910pA1;
import X.C1974107oJ;
import X.C2188811AlT;
import X.C2395309a3;
import X.C2396109aB;
import X.InterfaceC1485505rh;
import X.InterfaceC1494860p0G;
import X.InterfaceC1501010pAB;
import X.InterfaceC1501020pAC;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501180pAS;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501210pAV;
import X.InterfaceC1501220pAW;
import X.InterfaceC1501230pAX;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501250pAZ;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import X.InterfaceC1501320pAg;
import X.InterfaceC1501330pAh;
import X.InterfaceC1501430pAr;
import X.InterfaceC1501660pBE;
import X.InterfaceC1904907d9;
import X.InterfaceC2174608fY;
import X.InterfaceC675040Qdq;
import X.InterfaceC844460XAu;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestFactory<T> {
    public final boolean addCommonParam;
    public final InterfaceC1501430pAr cacheServer;
    public final InterfaceC1494860p0G clientProvider;
    public final int commonParamLevel;
    public final String contentTypeHeader;
    public final boolean enableRecordFormFields;
    public final Object extraInfo;
    public final boolean hasBody;
    public final List<C080U> headers;
    public final Executor httpExecutor;
    public final String httpMethod;
    public final List<InterfaceC1904907d9> interceptors;
    public final boolean isFormEncoded;
    public final boolean isKotlinSuspendFunction;
    public final boolean isMultipart;
    public final boolean isResponseStreaming;
    public final int maxLength;
    public final Method method;
    public final ParameterHandler<?>[] parameterHandlers;
    public final int priorityLevel;
    public final String relativeUrl;
    public Object relativeUrl1;
    public final int requestPriorityLevel;
    public InterfaceC1501660pBE<TypedInput, T> responseConverter;
    public C1494570ozn retrofitMetrics;
    public final C0X06 server;
    public final String serviceType;

    public Request toRequest(C09SW c09sw, Object... objArr) {
        return com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toRequest(this, c09sw, objArr);
    }

    public Object toResponse(TypedInput typedInput) {
        return com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toResponse(this, typedInput);
    }

    public C1494570ozn getRetrofitMetrics() {
        return this.retrofitMetrics;
    }

    public RequestFactory(C1500910pA1 c1500910pA1) {
        Retrofit retrofit = c1500910pA1.LIZ;
        this.clientProvider = retrofit.LIZIZ;
        this.interceptors = retrofit.LJIIIIZZ;
        this.httpExecutor = retrofit.LJII;
        this.server = retrofit.LIZJ;
        this.responseConverter = null;
        this.httpMethod = c1500910pA1.LJIJJLI;
        this.relativeUrl = c1500910pA1.LJJIFFI;
        this.hasBody = c1500910pA1.LJIL;
        this.isFormEncoded = c1500910pA1.LJJ;
        this.isMultipart = c1500910pA1.LJJI;
        this.parameterHandlers = c1500910pA1.LJJIIZ;
        this.headers = c1500910pA1.LJJII;
        this.contentTypeHeader = c1500910pA1.LJJIII;
        this.priorityLevel = c1500910pA1.LJI;
        this.requestPriorityLevel = c1500910pA1.LJIIJJI;
        this.serviceType = c1500910pA1.LJII;
        this.isResponseStreaming = c1500910pA1.LJIIIIZZ;
        this.maxLength = -1;
        this.addCommonParam = true;
        this.commonParamLevel = c1500910pA1.LJIIIZ;
        this.extraInfo = null;
        this.method = c1500910pA1.LIZIZ;
        this.isKotlinSuspendFunction = c1500910pA1.LJJIIZI;
        C1494570ozn c1494570ozn = c1500910pA1.LJFF;
        this.retrofitMetrics = c1494570ozn;
        c1494570ozn.getClass();
        this.enableRecordFormFields = c1500910pA1.LJJIJ;
    }

    public T com_bytedance_retrofit2_RequestFactory__toResponse$___twin___(TypedInput typedInput) {
        return this.responseConverter.LIZ(typedInput);
    }

    public void setRetrofitMetrics(C1494570ozn c1494570ozn) {
        this.retrofitMetrics = c1494570ozn;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toResponse(com.bytedance.retrofit2.RequestFactory r14, com.bytedance.retrofit2.mime.TypedInput r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestFactory.com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toResponse(com.bytedance.retrofit2.RequestFactory, com.bytedance.retrofit2.mime.TypedInput):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput] */
    public Request com_bytedance_retrofit2_RequestFactory__toRequest$___twin___(C09SW c09sw, Object... objArr) throws Throwable {
        int length;
        C09SW c09sw2;
        StringBuilder sbLIZJ;
        TypedOutput mimeOverridingTypedOutput;
        AbstractC842530X3j abstractC842530X3j;
        ?? formUrlEncodedTypedOutput;
        String str;
        Object obj;
        RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.server, this.relativeUrl, this.headers, this.contentTypeHeader, this.priorityLevel, this.requestPriorityLevel, this.isResponseStreaming, this.maxLength, this.addCommonParam, this.commonParamLevel, this.extraInfo, this.hasBody, this.isFormEncoded, this.isMultipart, this.serviceType, this.enableRecordFormFields);
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        if (objArr != null) {
            length = objArr.length;
        } else {
            length = 0;
        }
        if (length == parameterHandlerArr.length) {
            if (this.isKotlinSuspendFunction) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                parameterHandlerArr[i].apply(requestBuilder, objArr[i]);
            }
            requestBuilder.LJJ.put(C1974107oJ.class, C1974107oJ.class.cast(new C1974107oJ(this.method, arrayList)));
            final AbstractC842530X3j abstractC842530X3j2 = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400206, "com/bytedance/retrofit2/RequestBuilder", "build", requestBuilder, new Object[]{c09sw}, "com.bytedance.retrofit2.client.Request", new C0WZW(false, "(Lcom/bytedance/retrofit2/ExpandCallback;)Lcom/bytedance/retrofit2/client/Request;", new C0WZX("dzBzEgAjS8/YVFkiQFyWY6+XRXBuTsTGjpVihs2XIHGIZo/4mfs=", null)));
            if (c0wsuLIZIZ.LIZ) {
                return (Request) c0wsuLIZIZ.LIZIZ;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                c09sw2 = (C09SW) obj;
            } else {
                c09sw2 = c09sw;
            }
            MultipartTypedOutput multipartTypedOutput = requestBuilder.LJIIJ;
            if (multipartTypedOutput != null && multipartTypedOutput.getPartCount() == 0 && !requestBuilder.LJIL) {
                throw new IllegalStateException("Multipart requests must contain at least one part.");
            }
            String url = requestBuilder.LIZIZ.getUrl();
            if (C2395309a3.LIZIZ) {
                C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(url);
                if (c0xlqLJIIL != null) {
                    if (c0xlqLJIIL.LJFF() != null && c0xlqLJIIL.LJFF().length() > 0 && "/".equals(requestBuilder.LIZLLL)) {
                        sbLIZJ = RequestBuilder.LIZJ(url, requestBuilder.LIZLLL);
                    } else {
                        C0XLQ c0xlqLJIJJLI = c0xlqLJIIL.LJIJJLI(requestBuilder.LIZLLL, false);
                        if (c0xlqLJIJJLI != null) {
                            sbLIZJ = new StringBuilder(c0xlqLJIJJLI.LJIIIIZZ);
                        } else {
                            throw new IllegalArgumentException("Malformed URL. Base: " + c0xlqLJIIL + ", Relative: " + requestBuilder.LIZLLL);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Malformed URL. Base: " + c0xlqLJIIL + ", Relative: " + requestBuilder.LIZLLL);
                }
            } else {
                try {
                    URI uriCreate = URI.create(url);
                    if (uriCreate.getPath() != null && uriCreate.getPath().length() >= 1 && "/".equals(requestBuilder.LIZLLL)) {
                        sbLIZJ = RequestBuilder.LIZJ(url, requestBuilder.LIZLLL);
                    } else {
                        sbLIZJ = new StringBuilder(uriCreate.resolve(requestBuilder.LIZLLL).toString());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    String str2 = requestBuilder.LIZLLL;
                    if (str2 != null && (str2.startsWith("http://") || requestBuilder.LIZLLL.startsWith("https://"))) {
                        sbLIZJ = new StringBuilder(requestBuilder.LIZLLL);
                    } else {
                        sbLIZJ = RequestBuilder.LIZJ(url, requestBuilder.LIZLLL);
                    }
                }
            }
            StringBuilder sb = requestBuilder.LJ;
            if (sb != null) {
                if ('?' == sb.charAt(0) && (str = requestBuilder.LIZLLL) != null && str.indexOf(63) != -1) {
                    sb.setCharAt(0, '&');
                }
                sbLIZJ.append((CharSequence) sb);
            }
            String str3 = requestBuilder.LJFF;
            if (str3 != null) {
                sbLIZJ.append(str3);
            }
            requestBuilder.LIZJ = sbLIZJ.toString();
            if (c09sw2 instanceof C09SW) {
                c09sw2.onAsyncPreRequest(requestBuilder);
            }
            TypedOutput typedOutput = requestBuilder.LJIIJJI;
            List<C080U> listSingletonList = requestBuilder.LJI;
            AbstractC842530X3j abstractC842530X3jLIZLLL = requestBuilder.LJIJJLI;
            if (requestBuilder.LJIL) {
                if (abstractC842530X3jLIZLLL == null) {
                    C0X7B c0x7b = requestBuilder.LJIJJ;
                    if (c0x7b != null) {
                        abstractC842530X3jLIZLLL = c0x7b.LIZLLL();
                    } else if (requestBuilder.LJIIIIZZ) {
                        abstractC842530X3jLIZLLL = AbstractC842530X3j.LIZLLL(null, new byte[0]);
                    }
                }
                abstractC842530X3j2 = abstractC842530X3jLIZLLL;
                mimeOverridingTypedOutput = typedOutput;
                if (abstractC842530X3jLIZLLL != null) {
                    final String str4 = requestBuilder.LJII;
                    mimeOverridingTypedOutput = typedOutput;
                    if (str4 != null) {
                        abstractC842530X3j = new AbstractC842530X3j(str4, abstractC842530X3j2) { // from class: X.0X7E
                            public final AbstractC842530X3j LIZ;
                            public final String LIZIZ;

                            @Override // X.AbstractC842530X3j
                            public final long LIZ() {
                                return this.LIZ.LIZ();
                            }

                            @Override // X.AbstractC842530X3j
                            public final C0X0P LIZIZ() {
                                return C0X0P.LIZJ(this.LIZIZ);
                            }

                            @Override // X.AbstractC842530X3j
                            public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
                                this.LIZ.LJ(interfaceC1496780p3M);
                            }

                            {
                                this.LIZ = abstractC842530X3j2;
                                this.LIZIZ = str4;
                            }
                        };
                        formUrlEncodedTypedOutput = typedOutput;
                    }
                }
                if (formUrlEncodedTypedOutput == 0 && C2396109aB.LJIILIIL(requestBuilder.LIZ) && !requestBuilder.LJIL) {
                    formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
                    formUrlEncodedTypedOutput.addField("body", "null");
                }
                return new Request(requestBuilder.LIZ, requestBuilder.LIZJ, listSingletonList, formUrlEncodedTypedOutput, abstractC842530X3j, requestBuilder.LJIIL, requestBuilder.LJIILIIL, requestBuilder.LJIILL, requestBuilder.LJIILLIIL, requestBuilder.LJIIZILJ, requestBuilder.LJIJ, requestBuilder.LJIJI, requestBuilder.LJIILJJIL, requestBuilder.LJJ);
            }
            String str5 = requestBuilder.LJII;
            mimeOverridingTypedOutput = typedOutput;
            if (str5 != null) {
                if (typedOutput != null) {
                    mimeOverridingTypedOutput = new RequestBuilder.MimeOverridingTypedOutput(typedOutput, str5);
                } else {
                    C080U c080u = new C080U("Content-Type", str5);
                    if (listSingletonList == null) {
                        listSingletonList = Collections.singletonList(c080u);
                        mimeOverridingTypedOutput = typedOutput;
                    } else {
                        listSingletonList.add(c080u);
                        mimeOverridingTypedOutput = typedOutput;
                    }
                }
            }
            abstractC842530X3j = abstractC842530X3j2;
            formUrlEncodedTypedOutput = mimeOverridingTypedOutput;
            if (formUrlEncodedTypedOutput == 0) {
                formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
                formUrlEncodedTypedOutput.addField("body", "null");
            }
            return new Request(requestBuilder.LIZ, requestBuilder.LIZJ, listSingletonList, formUrlEncodedTypedOutput, abstractC842530X3j, requestBuilder.LJIIL, requestBuilder.LJIILIIL, requestBuilder.LJIILL, requestBuilder.LJIILLIIL, requestBuilder.LJIIZILJ, requestBuilder.LJIJ, requestBuilder.LJIJI, requestBuilder.LJIILJJIL, requestBuilder.LJJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Argument count (");
        sbLIZ.append(length);
        sbLIZ.append(") doesn't match expected count (");
        sbLIZ.append(parameterHandlerArr.length);
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Request com_bytedance_retrofit2_RequestFactory_com_ss_android_ugc_aweme_net_lancet_ConvertLancet_toRequest(RequestFactory requestFactory, C09SW c09sw, Object[] objArr) throws Throwable {
        Request requestCom_bytedance_retrofit2_RequestFactory__toRequest$___twin___ = requestFactory.com_bytedance_retrofit2_RequestFactory__toRequest$___twin___(c09sw, objArr);
        requestFactory.relativeUrl1 = requestCom_bytedance_retrofit2_RequestFactory__toRequest$___twin___.getPath();
        return requestCom_bytedance_retrofit2_RequestFactory__toRequest$___twin___;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static RequestFactory parseAnnotations(Retrofit retrofit, Method method, C1494570ozn c1494570ozn) {
        boolean z;
        C1500910pA1 c1500910pA1 = new C1500910pA1(retrofit, method, c1494570ozn);
        Annotation[] annotationArr = c1500910pA1.LIZJ;
        int length = annotationArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            Annotation annotation = annotationArr[i2];
            if (annotation instanceof C0X9N) {
                c1500910pA1.LIZLLL("DELETE", ((C0X9N) annotation).value(), i);
            } else if (annotation instanceof InterfaceC1501160pAQ) {
                c1500910pA1.LIZLLL("GET", ((InterfaceC1501160pAQ) annotation).value(), i);
            } else if (annotation instanceof C0X9O) {
                c1500910pA1.LIZLLL("HEAD", ((C0X9O) annotation).value(), i);
            } else if (annotation instanceof C0X9P) {
                c1500910pA1.LIZLLL("PATCH", ((C0X9P) annotation).value(), true);
            } else if (annotation instanceof InterfaceC1501170pAR) {
                c1500910pA1.LIZLLL("POST", ((InterfaceC1501170pAR) annotation).value(), true);
            } else if (annotation instanceof C0X9Q) {
                c1500910pA1.LIZLLL("PUT", ((C0X9Q) annotation).value(), true);
            } else if (annotation instanceof C0X7C) {
                c1500910pA1.LIZLLL("OPTIONS", ((C0X7C) annotation).value(), false);
            } else if (annotation instanceof InterfaceC1501010pAB) {
                InterfaceC1501010pAB interfaceC1501010pAB = (InterfaceC1501010pAB) annotation;
                c1500910pA1.LIZLLL(interfaceC1501010pAB.method(), interfaceC1501010pAB.path(), interfaceC1501010pAB.hasBody());
            } else if (annotation instanceof InterfaceC1501310pAf) {
                String[] strArrValue = ((InterfaceC1501310pAf) annotation).value();
                if (strArrValue.length != 0) {
                    c1500910pA1.LJJII = c1500910pA1.LIZJ(strArrValue);
                } else {
                    throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "@Headers annotation is empty.", new Object[0]);
                }
            } else if (annotation instanceof C092G) {
                if (!c1500910pA1.LJJ) {
                    c1500910pA1.LJJI = true;
                } else {
                    throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
            } else if (annotation instanceof InterfaceC1501300pAe) {
                if (!c1500910pA1.LJJI) {
                    c1500910pA1.LJJ = true;
                    c1500910pA1.LJJIJ = ((InterfaceC1501300pAe) annotation).enableRecord();
                } else {
                    throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
            } else if (annotation instanceof InterfaceC2174608fY) {
                c1500910pA1.LJIIIIZZ = true;
            } else if (annotation instanceof InterfaceC1501320pAg) {
                c1500910pA1.LJI = ((InterfaceC1501320pAg) annotation).value();
            } else if (annotation instanceof InterfaceC844460XAu) {
                c1500910pA1.LJII = ((InterfaceC844460XAu) annotation).value();
            } else if (annotation instanceof InterfaceC1501290pAd) {
                c1500910pA1.LJIIJJI = ((InterfaceC1501290pAd) annotation).value();
            }
            if (C2395309a3.LIZIZ) {
                if (annotation instanceof InterfaceC1501180pAS) {
                    c1500910pA1.LIZLLL("DELETE", ((InterfaceC1501180pAS) annotation).value(), false);
                } else if (annotation instanceof InterfaceC1501200pAU) {
                    c1500910pA1.LIZLLL("GET", ((InterfaceC1501200pAU) annotation).value(), false);
                } else if (annotation instanceof InterfaceC1501210pAV) {
                    c1500910pA1.LIZLLL("HEAD", ((InterfaceC1501210pAV) annotation).value(), false);
                } else if (annotation instanceof InterfaceC1501230pAX) {
                    c1500910pA1.LIZLLL("PATCH", ((InterfaceC1501230pAX) annotation).value(), true);
                } else if (annotation instanceof InterfaceC1501240pAY) {
                    c1500910pA1.LIZLLL("POST", ((InterfaceC1501240pAY) annotation).value(), true);
                } else if (annotation instanceof InterfaceC1501250pAZ) {
                    c1500910pA1.LIZLLL("PUT", ((InterfaceC1501250pAZ) annotation).value(), true);
                } else if (annotation instanceof InterfaceC1501220pAW) {
                    c1500910pA1.LIZLLL("OPTIONS", ((InterfaceC1501220pAW) annotation).value(), false);
                } else if (annotation instanceof InterfaceC1501020pAC) {
                    InterfaceC1501020pAC interfaceC1501020pAC = (InterfaceC1501020pAC) annotation;
                    c1500910pA1.LIZLLL(interfaceC1501020pAC.method(), interfaceC1501020pAC.path(), interfaceC1501020pAC.hasBody());
                } else if (annotation instanceof InterfaceC1501330pAh) {
                    String[] strArrValue2 = ((InterfaceC1501330pAh) annotation).value();
                    if (strArrValue2.length != 0) {
                        c1500910pA1.LJJII = c1500910pA1.LIZJ(strArrValue2);
                    } else {
                        throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC675040Qdq) {
                    if (!c1500910pA1.LJJ) {
                        c1500910pA1.LJJI = true;
                    } else {
                        throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof InterfaceC1485505rh) {
                    if (!c1500910pA1.LJJI) {
                        c1500910pA1.LJJ = true;
                    } else {
                        throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C040J) {
                    c1500910pA1.LJIIIIZZ = true;
                }
            }
            i2++;
            i = 0;
        }
        if (c1500910pA1.LJIJJLI != null) {
            if (!c1500910pA1.LJIL && !c1500910pA1.LJIIJ) {
                if (!c1500910pA1.LJJI) {
                    if (c1500910pA1.LJJ) {
                        throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[i]);
                    }
                } else {
                    throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length2 = c1500910pA1.LIZLLL.length;
            c1500910pA1.LJJIIZ = new ParameterHandler[length2];
            int i3 = length2 - 1;
            for (int i4 = i; i4 < length2; i4++) {
                ParameterHandler<?>[] parameterHandlerArr = c1500910pA1.LJJIIZ;
                Type type = c1500910pA1.LJ[i4];
                Annotation[] annotationArr2 = c1500910pA1.LIZLLL[i4];
                if (i4 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                parameterHandlerArr[i4] = c1500910pA1.LJ(i4, type, annotationArr2, z);
            }
            if (c1500910pA1.LJJIFFI == null && !c1500910pA1.LJIJI) {
                throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Missing either @%s URL or @Url parameter.", c1500910pA1.LJIJJLI);
            }
            if (!c1500910pA1.LJJ) {
                if (!c1500910pA1.LJJI && !c1500910pA1.LJIL && !c1500910pA1.LJIIJ && c1500910pA1.LJIILJJIL) {
                    throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
            } else if (!c1500910pA1.LJIIL) {
                throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (c1500910pA1.LJJI && !c1500910pA1.LJIILIIL) {
                throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "Multipart method must contain at least one @Part.", new Object[0]);
            }
            return new RequestFactory(c1500910pA1);
        }
        throw C2396109aB.LJIIIZ(c1500910pA1.LIZIZ, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }
}
