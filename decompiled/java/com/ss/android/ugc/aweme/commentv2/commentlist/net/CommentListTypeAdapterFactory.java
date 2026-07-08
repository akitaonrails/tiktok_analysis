package com.ss.android.ugc.aweme.commentv2.commentlist.net;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C21551419Vw;
import X.C2188811AlT;
import X.C2340909Ff;
import X.C2344809Gs;
import X.C844470XAv;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentListTypeAdapterFactory implements v {
    public static int LLILLJJLI = -1;
    public boolean LL;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> LIZ;
        public final boolean LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            Comment comment = null;
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            c09cu.LIZ();
            if (CommentListTypeAdapterFactory.LLILLJJLI == -1) {
                try {
                    try {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        int dimension = (int) contextLIZ.getResources().getDimension(R.dimen.jl);
                        CommentListTypeAdapterFactory.LLILLJJLI = ((C2340909Ff.LIZ(contextLIZ) - dimension) - ((int) contextLIZ.getResources().getDimension(R.dimen.jk))) / ((int) C21551419Vw.LIZIZ(85, contextLIZ));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CommentListTypeAdapterFactory MAX_PARSE_COUNT = ");
                        sbLIZ.append(CommentListTypeAdapterFactory.LLILLJJLI);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C2344809Gs.LIZ) {
                            C2344809Gs.LJI(e);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CommentListTypeAdapterFactory MAX_PARSE_COUNT = ");
                        sbLIZ2.append(CommentListTypeAdapterFactory.LLILLJJLI);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (CommentListTypeAdapterFactory.LLILLJJLI < 3) {
                        }
                    }
                    if (CommentListTypeAdapterFactory.LLILLJJLI < 3) {
                        CommentListTypeAdapterFactory.LLILLJJLI = 3;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("CommentListTypeAdapterFactory MAX_PARSE_COUNT = ");
                    sbLIZ3.append(CommentListTypeAdapterFactory.LLILLJJLI);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (CommentListTypeAdapterFactory.LLILLJJLI < 3) {
                        CommentListTypeAdapterFactory.LLILLJJLI = 3;
                    }
                    throw th;
                }
            }
            int i = CommentListTypeAdapterFactory.LLILLJJLI;
            int i2 = 0;
            boolean z = false;
            while (c09cu.LJIIZILJ()) {
                i2++;
                if (z && arrayList.size() >= i && this.LIZIZ) {
                    c09cu.LJJZ();
                } else {
                    E e2 = this.LIZ.read(c09cu);
                    if ((e2 instanceof Comment) && this.LIZIZ) {
                        if (comment == null) {
                            comment = e2;
                        }
                        if (i2 == i && c09cu.LJIIZILJ()) {
                            ((Comment) e2).isLastSplitItem = true;
                        }
                        z = true;
                    }
                    arrayList.add(e2);
                }
            }
            c09cu.LJI();
            return arrayList;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                c09dl.LJIJJ();
                return;
            }
            c09dl.LIZIZ();
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.LIZ.write(c09dl, it2.next());
            }
            c09dl.LJI();
        }

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, boolean z) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.LIZIZ = z;
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (gson == null || typeToken == null) {
            return null;
        }
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeLIZLLL = b.LIZLLL(type, rawType);
        if (!Comment.class.equals(typeLIZLLL)) {
            return null;
        }
        return new Adapter(gson, typeLIZLLL, gson.LJIIIZ(TypeToken.get(typeLIZLLL)), this.LL);
    }
}
