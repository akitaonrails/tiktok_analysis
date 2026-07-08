package com.ss.android.ugc.aweme.ecommerce.chunk;

import X.AbstractC2343909Gj;
import X.C1507110pK1;
import X.C1697810uHb;
import X.C7740030o;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.app.api.ICommonConvertFactoryProvider;
import com.ss.android.ugc.aweme.ecommerce.chunk.EcomExtendChunkConfig;
import com.ss.android.ugc.aweme.ecommerce.chunk.EcomParallelChunkConfig;
import com.ss.android.ugc.aweme.ecommerce.chunk.EcomParallelChunkPreferModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEcCustomGsonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcCommonConvertFactoryProvider implements ICommonConvertFactoryProvider {
    public final IEcChunkService LIZ = (IEcChunkService) PluggableExtentionKt.pluggableSpi$default(IEcChunkService.class, false, false, false, 14, null);

    @Override // com.ss.android.ugc.aweme.app.api.ICommonConvertFactoryProvider
    public final List<AbstractC2343909Gj> LIZ() {
        final Gson gson;
        AbstractC2343909Gj[] abstractC2343909GjArr = new AbstractC2343909Gj[2];
        final Gson gson2 = C7740030o.LIZ().getGson();
        abstractC2343909GjArr[0] = new AbstractC2343909Gj(gson2) { // from class: X.09Dg
            public static final /* synthetic */ int LIZIZ = 0;
            public final Gson LIZ;

            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
                return null;
            }

            {
                this.LIZ = gson2;
            }

            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                ParameterizedType parameterizedType;
                Class cls;
                Type type2;
                k kVar;
                k kVar2;
                if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType) type) == null) {
                    return null;
                }
                Type rawType = parameterizedType.getRawType();
                if (!(rawType instanceof Class) || (cls = (Class) rawType) == null || !C1515820pY4.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != null) {
                    if (type2 instanceof Class) {
                        Class cls2 = (Class) type2;
                        if (annotationArr != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Annotation annotation : annotationArr) {
                                if (annotation instanceof InterfaceC2336009Di) {
                                    arrayList.add(annotation);
                                }
                            }
                            if (C13LP.LJJJLL(arrayList) != null) {
                                C01GW c01gw = C1921007fk.LIZIZ;
                                if (((EcomParallelChunkConfig) c01gw.getValue()).enable && Intrinsics.LJFF(cls2, n.class)) {
                                    TypeAdapter typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(cls2));
                                    boolean z = ((EcomParallelChunkConfig) c01gw.getValue()).enableAsyncDataParse;
                                    boolean z2 = ((EcomParallelChunkConfig) c01gw.getValue()).enableAsyncDispatch;
                                    List<EcomParallelChunkPreferModel> list = ((EcomParallelChunkConfig) c01gw.getValue()).preferModels;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (EcomParallelChunkPreferModel ecomParallelChunkPreferModel : list) {
                                        EcomParallelChunkPreferModel ecomParallelChunkPreferModel2 = ecomParallelChunkPreferModel;
                                        if ((!a0.LJJJIL(ecomParallelChunkPreferModel2.path)) && (kVar = ecomParallelChunkPreferModel2.defer) != null && (kVar2 = ecomParallelChunkPreferModel2.prefer) != null && !Intrinsics.LJFF(kVar, kVar2) && ecomParallelChunkPreferModel2.timeout >= 0) {
                                            arrayList2.add(ecomParallelChunkPreferModel);
                                        }
                                    }
                                    int i = ((EcomParallelChunkConfig) C1921007fk.LIZIZ.getValue()).parallelism;
                                    if (i < 1) {
                                        i = 1;
                                    }
                                    return new C1516040pYQ(this.LIZ, typeAdapterLJIIIZ, z, z2, arrayList2, i);
                                }
                            }
                        }
                    }
                    return null;
                }
                "ChunkBundle should have one generic type.".toString();
                throw new IllegalStateException("ChunkBundle should have one generic type.");
            }
        };
        IEcCustomGsonService iEcCustomGsonService = (IEcCustomGsonService) PluggableExtentionKt.pluggableSpi$default(IEcCustomGsonService.class, false, false, false, 14, null);
        if (iEcCustomGsonService == null || (gson = iEcCustomGsonService.LIZ()) == null) {
            gson = C7740030o.LIZ().getGson();
        }
        IEcChunkService iEcChunkService = this.LIZ;
        final C1507110pK1 c1507110pK1 = iEcChunkService != null ? new C1507110pK1(iEcChunkService) : null;
        abstractC2343909GjArr[1] = new AbstractC2343909Gj(gson, c1507110pK1) { // from class: X.0pJt
            public static final /* synthetic */ int LIZJ = 0;
            public final Gson LIZ;
            public final Function2<byte[], String, Unit> LIZIZ;

            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
                return null;
            }

            {
                this.LIZ = gson;
                this.LIZIZ = c1507110pK1;
            }

            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                ParameterizedType parameterizedType;
                Class cls;
                Type type2;
                ParameterizedType parameterizedType2;
                String strValue = null;
                if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType) type) == null) {
                    return null;
                }
                Type rawType = parameterizedType.getRawType();
                if (!(rawType instanceof Class) || (cls = (Class) rawType) == null || !C1515820pY4.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != null) {
                    if (!(type2 instanceof ParameterizedType) || (parameterizedType2 = (ParameterizedType) type2) == null || !Intrinsics.LJFF(parameterizedType2.getRawType(), C1515870pY9.class)) {
                        return null;
                    }
                    TypeAdapter typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(parameterizedType2));
                    if (((EcomExtendChunkConfig) C1507040pJu.LIZIZ.getValue()).enable == 1) {
                        if (annotationArr != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Annotation annotation : annotationArr) {
                                if (annotation instanceof InterfaceC1501240pAY) {
                                    arrayList.add(annotation);
                                }
                            }
                            InterfaceC1501240pAY interfaceC1501240pAY = (InterfaceC1501240pAY) C13LP.LJJJLL(arrayList);
                            if (interfaceC1501240pAY != null) {
                                strValue = interfaceC1501240pAY.value();
                            }
                        }
                        return new C1515730pXv(this.LIZ, typeAdapterLJIIIZ, this.LIZIZ, strValue);
                    }
                    return new C09G9(this.LIZ, typeAdapterLJIIIZ);
                }
                "ChunkBundle should have one generic type.".toString();
                throw new IllegalStateException("ChunkBundle should have one generic type.");
            }
        };
        return C1697810uHb.LJIIJJI(abstractC2343909GjArr);
    }
}
