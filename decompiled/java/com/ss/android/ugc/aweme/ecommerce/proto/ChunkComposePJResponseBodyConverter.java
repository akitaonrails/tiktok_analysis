package com.ss.android.ugc.aweme.ecommerce.proto;

import X.C09CU;
import X.C09DL;
import X.C13LQ;
import X.C1515490pXX;
import X.C1515670pXp;
import X.C1515820pY4;
import X.C1515840pY6;
import X.C1515880pYA;
import X.C1516010pYN;
import X.InterfaceC1501660pBE;
import X.InterfaceC1515510pXZ;
import X.InterfaceC1515570pXf;
import X.InterfaceC644200POo;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class ChunkComposePJResponseBodyConverter implements InterfaceC1501660pBE<TypedInput, C1515820pY4<ComposePbAndJson<?, ?>>> {
    public final Gson LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Type LIZLLL;
    public final C1515490pXX LJ;
    public final IEcRaxService LJFF;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0pYC] */
    @Override // X.InterfaceC1501660pBE
    public final C1515820pY4<ComposePbAndJson<?, ?>> LIZ(TypedInput typedInput) {
        C1515820pY4<byte[]> c1515820pY4LIZ;
        TypedInput typedInput2 = typedInput;
        if (typedInput2 == null) {
            return null;
        }
        String strMimeType = typedInput2.mimeType();
        long length = typedInput2.length();
        C1515670pXp c1515670pXp = new C1515670pXp(typedInput2.in());
        if (this.LIZIZ) {
            final C1515820pY4<byte[]> c1515820pY4LIZ2 = c1515670pXp.LIZ();
            c1515820pY4LIZ = new C1515840pY6(new InterfaceC644200POo() { // from class: X.0pYD
                @Override // X.InterfaceC644200POo
                public final void LIZ(C0POE<T> c0poe) {
                    c1515820pY4LIZ2.LIZLLL(new C1515930pYF(c1515820pY4LIZ2, c0poe));
                }
            }, c1515820pY4LIZ2);
        } else {
            c1515820pY4LIZ = c1515670pXp.LIZ();
        }
        final C1515880pYA c1515880pYA = new C1515880pYA(this, strMimeType, length);
        if (this.LIZJ) {
            return new C1515840pY6(new C1516010pYN(c1515820pY4LIZ, new InterfaceC1515570pXf() { // from class: X.0pYC
                @Override // X.InterfaceC1515570pXf
                public final /* synthetic */ Object apply(Object obj) {
                    return c1515880pYA.invoke(obj);
                }
            }), c1515820pY4LIZ);
        }
        return c1515820pY4LIZ.LIZJ(new InterfaceC1515570pXf() { // from class: X.0pYC
            @Override // X.InterfaceC1515570pXf
            public final /* synthetic */ Object apply(Object obj) {
                return c1515880pYA.invoke(obj);
            }
        });
    }

    public ChunkComposePJResponseBodyConverter(ParameterizedType parameterizedType, Gson gson, InterfaceC1515510pXZ interfaceC1515510pXZ, boolean z, boolean z2) {
        this.LIZ = gson;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = (Type) C13LQ.LJJIIZ(1, parameterizedType.getActualTypeArguments());
        new TypeAdapter<ComposePbAndJson<?, ?>>(this) { // from class: com.ss.android.ugc.aweme.ecommerce.proto.ChunkComposePJResponseBodyConverter.1
            public final TypeAdapter<? extends Object> LIZ;

            {
                TypeAdapter typeAdapterLJIIIZ;
                Type type = this.LIZLLL;
                if (type != null) {
                    typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(type));
                } else {
                    typeAdapterLJIIIZ = null;
                }
                this.LIZ = typeAdapterLJIIIZ;
            }

            @Override // com.google.gson.TypeAdapter
            public final ComposePbAndJson<?, ?> read(C09CU c09cu) {
                Object obj;
                TypeAdapter<? extends Object> typeAdapter = this.LIZ;
                if (typeAdapter == null || (obj = typeAdapter.read(c09cu)) == null) {
                    return null;
                }
                return ComposePbAndJson.LIZ(obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(C09DL c09dl, ComposePbAndJson<?, ?> composePbAndJson) {
            }
        };
        this.LJ = new C1515490pXX(parameterizedType, gson, interfaceC1515510pXZ);
        this.LJFF = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new ExcludeEmptyTypeAdapterFactory());
        eVar.LIZ();
    }
}
