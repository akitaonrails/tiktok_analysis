package com.google.gson;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TypeAdapter<T> {
    public abstract T read(C09CU c09cu);

    public abstract void write(C09DL c09dl, T t);

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                return (T) TypeAdapter.this.read(c09cu);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    c09dl.LJIJJ();
                } else {
                    TypeAdapter.this.write(c09dl, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) {
        return read(new C09CU(reader));
    }

    public final T fromJsonTree(k kVar) {
        try {
            return read(new com.google.gson.internal.bind.a(kVar));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l(e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final k toJsonTree(T t) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t);
            return bVar.LJJJZ();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l(e);
        }
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, T t) {
        write(new C09DL(writer), t);
    }
}
