package com.ss.android.ugc.gamora.editor.mixediting.resource.feature;

import X.AnonymousClass0206;
import X.C01GW;
import X.C090F;
import X.C099G;
import X.C0C64;
import X.C0CHQ;
import X.C0MJ8;
import X.C0PEM;
import X.C15438062q;
import X.C1634250sd5;
import X.C201955140j;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C2262108tf;
import X.C2262608tk;
import X.C2263508tt;
import X.C2267908ub;
import X.C2268108ud;
import X.C2268308uf;
import X.C2268408ug;
import X.C2268508uh;
import X.C2268608ui;
import X.C2268908ul;
import X.C2277408w8;
import X.C23250099c;
import X.C263180ATc;
import X.C452501pT;
import X.C844470XAv;
import X.InterfaceC1337805Lk;
import X.InterfaceC1364105Vn;
import X.InterfaceC1635390sev;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class MixEditingFeatureExtractionService implements IMixEditingFeatureExtractionService {
    public static final C01GW<String> LJIIJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(217));
    public Boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile C099G LJI;
    public List<C2262608tk> LJII;
    public volatile C099G LJIIIZ;
    public final ConcurrentHashMap<String, C2277408w8> LIZ = new ConcurrentHashMap<>();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(218));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(589));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(590));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(591));

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LIZ() {
        C099G c099g;
        C099G c099g2;
        C099G c099g3 = this.LJI;
        if ((c099g3 != null && c099g3.isActive()) && (c099g2 = this.LJI) != null) {
            c099g2.LIZIZ(null);
        }
        C099G c099g4 = this.LJIIIZ;
        if (c099g4 != null && c099g4.isActive() && (c099g = this.LJIIIZ) != null) {
            c099g.LIZIZ(null);
        }
        this.LJIIIZ = null;
        this.LJI = null;
        this.LJII = null;
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LIZIZ() {
        this.LIZJ = Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final List<Integer> LIZLLL() {
        return (List) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final boolean LJIIJJI() {
        return Intrinsics.LJFF(this.LIZJ, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJIIL() {
        try {
            for (Map.Entry<String, C2277408w8> entry : this.LIZ.entrySet()) {
                String key = entry.getKey();
                entry.getValue().LIZIZ();
                this.LIZ.remove(key);
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear ");
                sbLIZ.append(key);
                C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LIZ.clear();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "support_bach_cache_by_name", true, false)) {
                C2277408w8.LJIIJ.getValue().LIZ();
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJI() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_bach_result_cache_max_count", true) * 1024 * 1024 <= 0 || this.LIZJ != null) {
            return;
        }
        InterfaceC1635390sev interfaceC1635390sevLIZ = C1634250sd5.LIZ();
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        interfaceC1635390sevLIZ.LJJIJL("feature_extraction_algo", null, 0, null, new ICheckChannelListener() { // from class: X.08ua
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                this.LIZ.LIZJ = Boolean.FALSE;
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkUpdate -> checkChannelFailed: ");
                sbLIZ.append(exceptionResult);
                C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkUpdate -> checkChannelSuccess needUpdate: ");
                sbLIZ.append(z);
                C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZJ = Boolean.valueOf(z);
            }
        });
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final boolean LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJIIIZ(List<FeatureExtraction> list) {
        C2277408w8 c2277408w8;
        ArrayList arrayList;
        C2262608tk c2262608tk;
        for (FeatureExtraction featureExtraction : list) {
            C01GW c01gw = C2267908ub.LIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c2277408w8 = LJIIZILJ(featureExtraction.path, featureExtraction.uri);
            } else {
                c2277408w8 = this.LIZ.get(featureExtraction.path);
            }
            if (c2277408w8 == null) {
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    c2262608tk = new C2262608tk(featureExtraction.path, featureExtraction.duration, featureExtraction.isVideoType, null, featureExtraction.uri, featureExtraction.mediaSystemId, false, 72);
                } else {
                    c2262608tk = new C2262608tk(featureExtraction.path, featureExtraction.duration, null, null, null, null, false, 124);
                }
                c2277408w8 = new C2277408w8(c2262608tk);
                c2277408w8.LIZIZ = featureExtraction.width;
                c2277408w8.LIZJ = featureExtraction.height;
                this.LIZ.put(c2262608tk.LIZ, c2277408w8);
            }
            Map<String, ? extends List<String>> map = featureExtraction.algorithm;
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null && !c2277408w8.LIZLLL.contains(key)) {
                    ArrayList arrayList2 = new ArrayList();
                    if (Intrinsics.LJFF(key, "relation_recog")) {
                        List<String> list2 = map.get("relation_recog");
                        if (list2 != null) {
                            List<String> list3 = map.get("face");
                            if (list3 == null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                Iterator<String> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(new C2262108tf(it2.next(), 2));
                                }
                            } else if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_bach_combine_face_and_relation_result", true, false)) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                Iterator<String> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(new C2262108tf(it3.next(), 2));
                                }
                            } else {
                                arrayList = new ArrayList();
                                for (String str : list2) {
                                    Iterator<String> it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        arrayList.add(new C2262108tf(str, it4.next()));
                                    }
                                }
                            }
                            arrayList2.addAll(arrayList);
                        }
                    } else {
                        Iterator<String> it5 = value.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(new C2262108tf(it5.next(), 2));
                        }
                    }
                    C201955140j.LJIIIIZZ(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "restore " + key + ' ' + value);
                    c2277408w8.LIZLLL.put(key, C090F.LIZ(arrayList2));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJFF(String str, String str2) {
        C2277408w8 c2277408w8 = this.LIZ.get(str);
        if (c2277408w8 != null) {
            this.LIZ.put(str2, c2277408w8);
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJIIJ(String str, boolean z) {
        C2277408w8 c2277408w8 = this.LIZ.get(str);
        if (c2277408w8 != null) {
            c2277408w8.LIZIZ();
            if (z) {
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.remove(str);
            }
        }
    }

    public final C2277408w8 LJIIZILJ(String str, String str2) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_edit_page_without_album_bach_result_cache", true, false)) {
            return this.LIZ.get(str);
        }
        C2277408w8 c2277408w8 = this.LIZ.get(str);
        if (c2277408w8 != null) {
            return c2277408w8;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFeatureExtractionTaskCache ");
        sbLIZ.append(str);
        sbLIZ.append("; ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZ.get(str2);
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJ(C2262608tk c2262608tk, Set<String> set, C2263508tt c2263508tt) {
        boolean z;
        if (c2262608tk.LIZ.length() != 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_extract_visual_features", true, false) && !((Boolean) C2268508uh.LIZ.getValue()).booleanValue()) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_low_memory_device_mock", true, false)) {
                C0CHQ.LIZ().isDebugConfigOpen();
            }
            C844470XAv.LIZ.getClass();
            if (C2188561Al4.LJIIJ(C844470XAv.LIZ())) {
                z = true;
            } else {
                z = false;
            }
            if (z && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_skip_album_feature_extraction_on_low_memory_device", true, false)) {
                C201955140j.LIZLLL(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "skip pre-feature extraction on low memory device");
                return;
            }
            if (((Boolean) C2268408ug.LIZ.getValue()).booleanValue()) {
                C201955140j.LIZLLL(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "skip pre-feature extraction on low device");
                return;
            }
            if (((Boolean) C2268308uf.LIZ.getValue()).booleanValue() && C263180ATc.LIZ()) {
                C201955140j.LIZLLL(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "skip pre-feature extraction on weak net");
                return;
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "album_page_photo_execute_feature_extraction", true, false) && (c2262608tk.LIZLLL != null || c2262608tk.LIZIZ <= 0)) {
                return;
            }
            C2277408w8 c2277408w8 = this.LIZ.get(c2262608tk.LIZ);
            if (c2277408w8 == null) {
                c2277408w8 = new C2277408w8(c2262608tk);
                this.LIZ.put(c2262608tk.LIZ, c2277408w8);
            }
            c2277408w8.LJIIJ(set, (InterfaceC1337805Lk) this.LJ.getValue(), (InterfaceC1337805Lk) this.LJFF.getValue(), c2263508tt);
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJIIIIZZ(List<C2262608tk> list, Set<String> set, C2263508tt c2263508tt) {
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "start pre feature extraction");
        for (C2262608tk c2262608tk : list) {
            C2277408w8 c2277408w8 = this.LIZ.get(c2262608tk.LIZ);
            if (c2277408w8 == null) {
                c2277408w8 = new C2277408w8(c2262608tk);
                this.LIZ.put(c2262608tk.LIZ, c2277408w8);
            }
            c2277408w8.LJIIJ(set, (InterfaceC1337805Lk) this.LJ.getValue(), (InterfaceC1337805Lk) this.LJFF.getValue(), c2263508tt);
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final void LJIILJJIL(String str, String str2, String str3) {
        if (a0.LJJIIZI(str, str3, false)) {
            str.substring(a0.LJJJ(str, str3, 0, false, 6) + str3.length() + 1);
        }
        if (a0.LJJIIZI(str2, str3, false)) {
            str2.substring(a0.LJJJ(str2, str3, 0, false, 6) + str3.length() + 1);
        }
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final Object LJIILIIL(List list, int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2268908ul(this, str, i, list, null));
    }

    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    public final Object LJIILL(List<C2262608tk> list, String str, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2268608ui> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2268108ud(list, this, str, c2263508tt, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<X.C2262608tk> r16, java.util.Set<java.lang.String> r17, java.lang.String r18, X.C2263508tt r19, X.InterfaceC1364105Vn<? super java.util.List<kotlin.Pair<com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction, java.lang.Integer>>> r20) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService.LJII(java.util.List, java.util.Set, java.lang.String, X.08tt, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Object, java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C2268608ui r20, java.util.List<X.C2262608tk> r21, java.lang.String r22, X.C2263508tt r23, X.InterfaceC1364105Vn<? super X.C2268608ui> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService.LJIILLIIL(X.08ui, java.util.List, java.lang.String, X.08tt, X.05Vn):java.lang.Object");
    }
}
