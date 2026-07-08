package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.C01GW;
import X.C0HGL;
import X.C452501pT;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ManifestAndImageCachingElementsRepository implements ElementsRepository {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(549));
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Map<Integer, C0HGL> LIZJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository
    public final Map<Integer, C0HGL> LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C2165008e0
            if (r0 == 0) goto L70
            r3 = r9
            X.08e0 r3 = (X.C2165008e0) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r6 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 != r1) goto L9e
            X.C155000ia.LIZIZ(r6)
        L22:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi$MixStudioElementsResponse r6 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi.MixStudioElementsResponse) r6
            java.util.List<com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi$MixStudioElementListWithType> r0 = r6.elementsWithType
            if (r0 == 0) goto L76
            java.util.Iterator r7 = r0.iterator()
        L2c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r5 = r7.next()
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi$MixStudioElementListWithType r5 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi.MixStudioElementListWithType) r5
            java.lang.Integer r4 = r5.idType
            if (r4 == 0) goto L2c
            java.util.List<com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement> r0 = r5.elements
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.Integer, X.0HGL> r3 = r8.LIZJ
            X.0HGL r2 = new X.0HGL
            int r1 = r4.intValue()
            java.util.List<com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkElement> r0 = r5.elements
            r2.<init>(r1, r0)
            r3.put(r4, r2)
            goto L2c
        L51:
            X.C155000ia.LIZIZ(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.LIZIZ
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L5f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            X.01GW r0 = r8.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioElementsApi) r0
            r3.LLILLL = r1
            java.lang.Object r6 = r0.getMixStudioElements(r3)
            if (r6 != r2) goto L22
            return r2
        L70:
            X.08e0 r3 = new X.08e0
            r3.<init>(r8, r9)
            goto L12
        L76:
            java.lang.String r3 = r6.version
            X.0HSG r0 = X.C0HSG.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C0HSG.LIZIZ()
            java.lang.String r2 = "elements_manifest_version"
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r2, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L92
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L92:
            java.lang.String r1 = r6.version
            com.bytedance.keva.Keva r0 = X.C0HSG.LIZIZ()
            r0.storeString(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ManifestAndImageCachingElementsRepository.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository
    public final C0HGL LIZJ(int i) {
        return (C0HGL) ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(i));
    }
}
