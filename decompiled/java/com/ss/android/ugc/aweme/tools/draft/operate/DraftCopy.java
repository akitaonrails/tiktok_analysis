package com.ss.android.ugc.aweme.tools.draft.operate;

import X.C09CU;
import X.C09DL;
import X.C0CHQ;
import X.C0MAY;
import X.C201955140j;
import X.C2188811AlT;
import X.C265220AaO;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftCopy {
    public static final DraftCopy LIZ = new DraftCopy();

    public static AwemeDraft LIZ(AwemeDraft awemeDraft) {
        Gson gson = C0CHQ.LIZ().getGson();
        if (((Boolean) C265220AaO.LIZ.getValue()).booleanValue()) {
            gson.getClass();
            e eVar = new e(gson);
            ((ArrayList) eVar.LJ).add(new DepthLimitTypeAdapterFactory());
            gson = eVar.LIZ();
        }
        return (AwemeDraft) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, awemeDraft), AwemeDraft.class);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DepthLimitTypeAdapterFactory implements v {
        public final int LL = 64;
        public final ThreadLocal<Integer> LLILLJJLI = new ThreadLocal<>();

        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, final TypeToken<T> typeToken) {
            final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
            return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy$DepthLimitTypeAdapterFactory$create$1
                @Override // com.google.gson.TypeAdapter
                public final T read(C09CU c09cu) {
                    return typeAdapterLJIIJJI.read(c09cu);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C09DL c09dl, T t) {
                    int iIntValue;
                    if (t == null) {
                        c09dl.LJIJJ();
                        return;
                    }
                    Integer num = this.LIZ.LLILLJJLI.get();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    DraftCopy.DepthLimitTypeAdapterFactory depthLimitTypeAdapterFactory = this.LIZ;
                    if (iIntValue >= depthLimitTypeAdapterFactory.LL) {
                        C0MAY c0may = C0MAY.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DraftCopy.clone: serialization depth limit (");
                        sbLIZ.append(this.LIZ.LL);
                        sbLIZ.append(") exceeded for type ");
                        sbLIZ.append(typeToken.getRawType().getSimpleName());
                        sbLIZ.append(", skipping to prevent StackOverflow");
                        C201955140j.LJII(c0may, C2188811AlT.LIZIZ(sbLIZ));
                        c09dl.LJIJJ();
                        return;
                    }
                    depthLimitTypeAdapterFactory.LLILLJJLI.set(Integer.valueOf(iIntValue + 1));
                    try {
                        typeAdapterLJIIJJI.write(c09dl, t);
                        this.LIZ.LLILLJJLI.set(Integer.valueOf(iIntValue));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LLILLJJLI.set(Integer.valueOf(iIntValue));
                        throw th;
                    }
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r24, com.ss.android.ugc.aweme.draft.model.AwemeDraft r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft, kotlin.Unit> r30, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r31, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft> r32) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.operate.DraftCopy.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.draft.model.AwemeDraft, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
