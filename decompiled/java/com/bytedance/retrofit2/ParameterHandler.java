package com.bytedance.retrofit2;

import X.C2396109aB;
import X.InterfaceC1501660pBE;
import com.bytedance.retrofit2.RequestBuilder;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ParameterHandler<T> {
    public abstract void apply(RequestBuilder requestBuilder, T t);

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: X.0p9I
            @Override // com.bytedance.retrofit2.ParameterHandler
            public final void apply(RequestBuilder requestBuilder, Object obj) {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.LIZ.apply(requestBuilder, Array.get(obj, i));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: X.0p9H
            @Override // com.bytedance.retrofit2.ParameterHandler
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final void apply(RequestBuilder requestBuilder, Iterable<T> iterable) {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    this.LIZ.apply(requestBuilder, it2.next());
                }
            }
        };
    }

    public static final class Field<T> extends ParameterHandler<T> {
        public final boolean encode;
        public final String name;
        public final InterfaceC1501660pBE<T, String> valueConverter;

        @Override // com.bytedance.retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t) {
            String strLIZ;
            if (t == null || (strLIZ = this.valueConverter.LIZ(t)) == null) {
                return;
            }
            String str = this.name;
            boolean z = this.encode;
            requestBuilder.LJIIIZ.addField(str, z, strLIZ, z);
        }

        public Field(String str, InterfaceC1501660pBE<T, String> interfaceC1501660pBE, boolean z) {
            C2396109aB.LIZ(str, "name == null");
            this.name = str;
            this.valueConverter = interfaceC1501660pBE;
            this.encode = z;
        }
    }
}
