package com.ss.android.ugc.aweme.commercialize.cla.service;

import X.C04TD;
import X.C1055470dZZ;
import X.C161Q;
import X.C715570S5b;
import Y.AkS478S0100000_16;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.model.BatchTranslatableItem;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceCLAServiceImpl implements ICommerceCLAService {
    public static ICommerceCLAService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ICommerceCLAService.class, false);
        if (objLIZ != null) {
            return (ICommerceCLAService) objLIZ;
        }
        if (C04TD.LLJLLL == null) {
            synchronized (ICommerceCLAService.class) {
                if (C04TD.LLJLLL == null) {
                    C04TD.LLJLLL = new CommerceCLAServiceImpl();
                }
            }
        }
        return C04TD.LLJLLL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dZZ] */
    @Override // com.ss.android.ugc.aweme.commercialize.cla.service.ICommerceCLAService
    public final C1055470dZZ LIZ() {
        return new C161Q<C715570S5b>() { // from class: X.0dZZ
            @Override // X.C161Q
            public final void LIZ() {
            }

            @Override // X.C161Q
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.C161Q
            public final void LIZJ() {
            }

            @Override // X.C161Q
            public final C161R LIZLLL() {
                return new C715570S5b(null, false, false);
            }

            @Override // X.C161Q
            public final String LJ(Aweme aweme) {
                return aweme.getDescLanguage();
            }

            @Override // X.C161Q
            public final C11NZ<C715570S5b> LJFF(C1055500dZc c1055500dZc) {
                return C11NZ.LJIJJLI(new InterfaceC1478005qU<IAdTranslatableData>(c1055500dZc.LIZ) { // from class: X.0dZY
                    public final Aweme LIZ;

                    {
                        this.LIZ = aweme;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[PHI: r1
                      0x0039: PHI (r1v4 com.ss.android.ugc.aweme.feed.model.IAdTranslatableData) = 
                      (r1v3 com.ss.android.ugc.aweme.feed.model.IAdTranslatableData)
                      (r1v5 com.ss.android.ugc.aweme.feed.model.IAdTranslatableData)
                     binds: [B:11:0x0029, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1478005qU
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void subscribe(X.C09AJ<com.ss.android.ugc.aweme.feed.model.IAdTranslatableData> r4) {
                        /*
                            r3 = this;
                            java.lang.String r2 = "AdTranslatableDataObservableOnSubscribe@bcba.subscribe"
                            X.C1C7U.LIZ(r2)
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZ
                            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)
                            if (r0 == 0) goto L13
                            com.ss.android.ugc.aweme.feed.model.IAdTranslatableData r1 = r0.getTranslatableData()
                            if (r1 != 0) goto L39
                        L13:
                            X.0c8S r0 = X.C1000250c8V.LIZ
                            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.LIZ
                            boolean r0 = r1.isAd()
                            if (r0 == 0) goto L2b
                            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
                            if (r1 == 0) goto L2b
                            X.0c8S r0 = X.C1000250c8V.LIZ
                            com.ss.android.ugc.aweme.feed.model.IAdTranslatableData r1 = r0.LIZ(r1)
                            if (r1 != 0) goto L39
                        L2b:
                            java.lang.RuntimeException r1 = new java.lang.RuntimeException
                            java.lang.String r0 = "can not create ad translatable data from the aweme."
                            r1.<init>(r0)
                            r4.onError(r1)
                        L35:
                            X.C1C7U.LIZIZ(r2)
                            return
                        L39:
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZ
                            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)
                            if (r0 == 0) goto L44
                            r0.setTranslatableData(r1)
                        L44:
                            r4.onNext(r1)
                            r4.onComplete()
                            goto L35
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1055460dZY.subscribe(X.09AJ):void");
                    }
                }).LJJJ(new InterfaceC1487280oo2<IAdTranslatableData, C098D<C1041860dDc>>() { // from class: X.0dDb
                    @Override // X.InterfaceC1487280oo2
                    public final C098D<C1041860dDc> apply(IAdTranslatableData iAdTranslatableData) {
                        IAdTranslatableData iAdTranslatableData2 = iAdTranslatableData;
                        Iterator<InterfaceC1024290clH> it2 = C1024260clE.LIZ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            List<BatchTranslatableItem> listLIZ = it2.next().LIZ(iAdTranslatableData2);
                            if (listLIZ != null) {
                                ArrayList arrayList = new ArrayList();
                                for (BatchTranslatableItem batchTranslatableItem : listLIZ) {
                                    if (!a0.LJJJIL(batchTranslatableItem.srcContent)) {
                                        arrayList.add(batchTranslatableItem);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    return C11NZ.LJJJJZ(new C1041860dDc(iAdTranslatableData2, arrayList));
                                }
                            }
                        }
                        return C11NZ.LJJIJLIJ(new RuntimeException("can not convert IAdTranslatableData to BatchTranslatableItem List"));
                    }
                }, false).LJJJ(new InterfaceC1487280oo2<C1041860dDc, C098D<C1053040dVe>>(c1055500dZc.LIZIZ) { // from class: X.0dVd
                    public final String LL;

                    {
                        this.LL = str;
                    }

                    @Override // X.InterfaceC1487280oo2
                    public final C098D<C1053040dVe> apply(C1041860dDc c1041860dDc) {
                        C1041860dDc c1041860dDc2 = c1041860dDc;
                        ITranslationService iTranslationService = (ITranslationService) ServiceManager.get().getService(ITranslationService.class);
                        if (iTranslationService != null) {
                            C11NZ c11nzLJIIJJI = iTranslationService.LJIIJJI(this.LL, c1041860dDc2.LIZIZ);
                            if (c11nzLJIIJJI != null) {
                                return c11nzLJIIJJI.LJJJJZI(new AkS478S0100000_16(c1041860dDc2, 3));
                            }
                        }
                        return C11NZ.LJJIJLIJ(new RuntimeException("failed to call CLA batchTranslate"));
                    }
                }, false).LJJJJZI(new InterfaceC1487280oo2<C1053040dVe, C715570S5b>() { // from class: X.0dVc
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v14, types: [X.0c33] */
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
                    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
                    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
                    @Override // X.InterfaceC1487280oo2
                    public final C715570S5b apply(C1053040dVe c1053040dVe) {
                        ?? LJ;
                        IAdTranslationData iAdTranslationDataLIZ;
                        C1053040dVe c1053040dVe2 = c1053040dVe;
                        IAdTranslatableData iAdTranslatableData = c1053040dVe2.LIZ;
                        List<TranslationResult> list = c1053040dVe2.LIZIZ.results;
                        boolean z = false;
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            for (TranslationResult translationResult : list) {
                                String str = translationResult.srcContent;
                                if (str != null && !a0.LJJJIL(str)) {
                                    arrayList.add(translationResult);
                                }
                            }
                            ArrayList<TranslationResult> arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                String str2 = ((TranslationResult) obj).translatedContent;
                                if (str2 != null && !a0.LJJJIL(str2)) {
                                    arrayList2.add(obj);
                                }
                            }
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            LJ = new LinkedHashMap(iLIZIZ);
                            for (TranslationResult translationResult2 : arrayList2) {
                                String str3 = translationResult2.srcContent;
                                if (str3 != null) {
                                    String str4 = translationResult2.translatedContent;
                                    if (str4 != null) {
                                        Pair pair = new Pair(str3, str4);
                                        LJ.put(pair.getFirst(), pair.getSecond());
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            LJ = C2097608Jq.LJ();
                        }
                        Iterator<InterfaceC996870c33> it2 = C997670c4L.LIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                iAdTranslationDataLIZ = it2.next().LIZ(iAdTranslatableData, LJ);
                                if (iAdTranslationDataLIZ != null) {
                                    break;
                                }
                            } else {
                                iAdTranslationDataLIZ = null;
                                break;
                            }
                        }
                        List<TranslationResult> list2 = c1053040dVe2.LIZIZ.results;
                        if (list2 != null && !list2.isEmpty()) {
                            Iterator<TranslationResult> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                String str5 = it3.next().translatedContent;
                                if (str5 == null || str5.length() == 0) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (iAdTranslationDataLIZ != null) {
                            return new C715570S5b(iAdTranslationDataLIZ, true, z);
                        }
                        throw new RuntimeException("can not convert MultiTranslationResult to CommerceComponentTranslationData");
                    }
                }).LJJIJIIJI(new C09JN() { // from class: X.0dZa
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("CommerceComponentTranslator@7e6d.requestTranslation$1");
                        C1C7U.LIZIZ("CommerceComponentTranslator@7e6d.requestTranslation$1");
                    }
                }).LJJIJIIJIL(new C09JN() { // from class: X.0dZb
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("CommerceComponentTranslator@7e6d.requestTranslation$2");
                        C1C7U.LIZIZ("CommerceComponentTranslator@7e6d.requestTranslation$2");
                    }
                });
            }

            @Override // X.C161Q
            public final boolean LJI(Aweme aweme) {
                return C1017070cZd.LJJJJI(aweme);
            }

            @Override // X.C161Q
            public final boolean LJII(Aweme aweme) {
                if (!LJI(aweme) || !C123100dR.LIZ(LJ(aweme))) {
                    return false;
                }
                return C1017070cZd.LLJJ(aweme);
            }
        };
    }
}
