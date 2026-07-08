package com.ss.android.ugc.aweme.ml.tars.processor;

import X.C0Z1Y;
import X.InterfaceC892650Z0d;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ml.api.BertTokenizerService;
import com.ss.android.ugc.aweme.tars.core.TarsProcessorSpi;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import com.tiktok.clientai.android.bytenn.bridge.TarsPostProcesserNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class TarsProcessorImpl implements TarsProcessorSpi {
    @Override // com.ss.android.ugc.aweme.tars.core.TarsProcessorSpi
    public final InterfaceC892650Z0d LIZ(String str, final TarsConfig.Processor processor) {
        if (Intrinsics.LJFF(str, "vit_image_processor")) {
            return new C0Z1Y(processor);
        }
        if (Intrinsics.LJFF(str, "tokenizer")) {
            return new InterfaceC892650Z0d(processor) { // from class: X.0Yjj
                public final TarsConfig.Processor LIZ;

                @Override // X.InterfaceC892650Z0d
                public final void LIZIZ(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
                }

                {
                    this.LIZ = processor;
                }

                @Override // X.InterfaceC892650Z0d
                public final Unit LIZ(C0Z09 c0z09) {
                    BertTokenizerService.LIZ.getClass();
                    C882500Yjg.LIZ().LIZ(new AwS593S0100000_14(c0z09, 233));
                    return Unit.LIZ;
                }

                @Override // X.InterfaceC892650Z0d
                public final void LIZJ(Map<String, Object> map) throws C892820Z0u {
                    String str2;
                    int iIntValue;
                    int iIntValue2;
                    Integer numLJIIJJI;
                    Integer numLJIIJJI2;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Object obj = linkedHashMap.get("text");
                    if ((obj instanceof String) && (str2 = (String) obj) != null) {
                        BertTokenizerService.LIZ.getClass();
                        List<Integer> listLIZIZ = C882500Yjg.LIZ().LIZIZ(str2);
                        if (listLIZIZ != null) {
                            BertTokenizerService bertTokenizerServiceLIZ = C882500Yjg.LIZ();
                            String str3 = this.LIZ.config.get("input_length");
                            if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                                iIntValue = numLJIIJJI2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            List listLJI = bertTokenizerServiceLIZ.LJI(iIntValue, listLIZIZ);
                            BertTokenizerService bertTokenizerServiceLIZ2 = C882500Yjg.LIZ();
                            String str4 = this.LIZ.config.get("input_length");
                            if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                                iIntValue2 = numLJIIJJI.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("input_feature", listLJI), new Pair("attention_mask", bertTokenizerServiceLIZ2.LIZJ(iIntValue2, listLIZIZ)), new Pair("input_ids", listLJI)));
                            return;
                        }
                        throw new C892820Z0u("bert tokenizer service is not ready", "runtime");
                    }
                }
            };
        }
        if (Intrinsics.LJFF(str, "YoloXProcessor")) {
            return new InterfaceC892650Z0d(processor) { // from class: X.0Z0n
                public final TarsConfig.Processor LIZ;

                @Override // X.InterfaceC892650Z0d
                public final void LIZJ(Map<String, Object> map) {
                }

                {
                    this.LIZ = processor;
                }

                @Override // X.InterfaceC892650Z0d
                public final Unit LIZ(C0Z09 c0z09) {
                    c0z09.onSuccess(null);
                    return Unit.LIZ;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v31 */
                /* JADX WARN: Type inference failed for: r0v52, types: [float] */
                /* JADX WARN: Type inference failed for: r0v53, types: [float] */
                /* JADX WARN: Type inference failed for: r0v55, types: [float] */
                /* JADX WARN: Type inference failed for: r0v57, types: [float] */
                /* JADX WARN: Type inference failed for: r0v62, types: [float] */
                /* JADX WARN: Type inference failed for: r0v63, types: [float] */
                /* JADX WARN: Type inference failed for: r0v64, types: [float] */
                /* JADX WARN: Type inference failed for: r0v65, types: [float] */
                /* JADX WARN: Type inference failed for: r11v3 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v5 */
                /* JADX WARN: Type inference failed for: r11v6 */
                /* JADX WARN: Type inference failed for: r11v9 */
                /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v4 */
                /* JADX WARN: Type inference failed for: r15v0, types: [float] */
                /* JADX WARN: Type inference failed for: r17v0 */
                /* JADX WARN: Type inference failed for: r1v17, types: [float] */
                /* JADX WARN: Type inference failed for: r1v18, types: [float] */
                /* JADX WARN: Type inference failed for: r1v19, types: [float] */
                /* JADX WARN: Type inference failed for: r1v20, types: [float] */
                /* JADX WARN: Type inference failed for: r1v23, types: [float] */
                /* JADX WARN: Type inference failed for: r1v25, types: [float] */
                /* JADX WARN: Type inference failed for: r1v29, types: [float] */
                /* JADX WARN: Type inference failed for: r25v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
                /* JADX WARN: Type inference failed for: r26v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
                /* JADX WARN: Type inference failed for: r2v7, types: [float] */
                /* JADX WARN: Type inference failed for: r7v4, types: [float[][], java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v10, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r8v6, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
                @Override // X.InterfaceC892650Z0d
                public final void LIZIZ(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) throws C892820Z0u {
                    int iIntValue;
                    int iIntValue2;
                    float fFloatValue;
                    float fFloatValue2;
                    float[] fArr;
                    Float f;
                    boolean zBooleanValue;
                    ?? arrayList;
                    float f2;
                    Integer numValueOf;
                    Boolean boolLJLI;
                    Float fLJIIIIZZ;
                    Float fLJIIIIZZ2;
                    Integer numLJIIJJI;
                    Integer numLJIIJJI2;
                    String str2 = this.LIZ.config.get("dimension");
                    if (str2 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    } else {
                        iIntValue = 24;
                    }
                    String str3 = this.LIZ.config.get("topN");
                    if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
                        iIntValue2 = numLJIIJJI.intValue();
                    } else {
                        iIntValue2 = 32;
                    }
                    String str4 = this.LIZ.config.get("config_threshold");
                    if (str4 != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str4)) != null) {
                        fFloatValue = fLJIIIIZZ2.floatValue();
                    } else {
                        fFloatValue = 0.4f;
                    }
                    String str5 = this.LIZ.config.get("nms_threshold");
                    if (str5 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str5)) != null) {
                        fFloatValue2 = fLJIIIIZZ.floatValue();
                    } else {
                        fFloatValue2 = 0.4f;
                    }
                    Object obj = map2.get("float_array_output");
                    if ((obj instanceof float[]) && (fArr = (float[]) obj) != null) {
                        Object obj2 = map.get("scale_ratio");
                        if ((obj2 instanceof Float) && (f = (Float) obj2) != null) {
                            float fFloatValue3 = f.floatValue();
                            String str6 = this.LIZ.config.get("native_process");
                            char c = 0;
                            if (str6 != null && (boolLJLI = a0.LJLI(str6)) != null) {
                                zBooleanValue = boolLJLI.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                float[][] fArrObjectDetectionBox = TarsPostProcesserNative.LIZ.objectDetectionBox(fArr, iIntValue, fFloatValue3, iIntValue2, fFloatValue, fFloatValue2);
                                if (fArrObjectDetectionBox != null) {
                                    map2.put("yolox_ret", C13LQ.LJJLL(fArrObjectDetectionBox));
                                    map3.put("yolox_ret", C13LQ.LJJLL(fArrObjectDetectionBox));
                                    return;
                                }
                                return;
                            }
                            int length = fArr.length / iIntValue;
                            ArrayList arrayList2 = new ArrayList();
                            float[][] fArr2 = new float[length][];
                            for (int i = 0; i < length; i++) {
                                fArr2[i] = new float[iIntValue];
                            }
                            for (int i2 = 0; i2 < iIntValue; i2++) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    fArr2[i3][i2] = fArr[(i2 * length) + i3];
                                }
                            }
                            int i4 = 0;
                            while (i4 < length) {
                                float[] fArr3 = fArr2[i4];
                                float f3 = fArr3[c] / fFloatValue3;
                                float f4 = fArr3[1] / fFloatValue3;
                                float f5 = fArr3[2] / fFloatValue3;
                                float f6 = fArr3[3] / fFloatValue3;
                                float f7 = 2;
                                float f8 = f5 / f7;
                                fArr3[0] = f3 - f8;
                                float f9 = f6 / f7;
                                fArr3[1] = f4 - f9;
                                fArr3[2] = f3 + f8;
                                fArr3[3] = f4 + f9;
                                float f10 = 0.0f;
                                for (int i5 = 5; i5 < iIntValue; i5++) {
                                    float f11 = fArr3[i5];
                                    if (f11 > f10) {
                                        f10 = f11;
                                    }
                                }
                                arrayList2.add(new Pair(fArr3, Float.valueOf(f10)));
                                i4++;
                                c = 0;
                            }
                            List listLJLLLL = C13LP.LJLLLL(new C512401z8(34), arrayList2);
                            int iMin = Math.min(iIntValue2, listLJLLLL.size());
                            ?? r7 = new float[iMin][];
                            for (int i6 = 0; i6 < iMin; i6++) {
                                r7[i6] = ((Pair) ListProtector.get(listLJLLLL, i6)).getFirst();
                            }
                            if (iMin == 0) {
                                arrayList = C13BV.INSTANCE;
                            } else {
                                int length2 = r7[c].length - 5;
                                ArrayList arrayList3 = new ArrayList(iMin);
                                for (int i7 = 0; i7 < iMin; i7++) {
                                    ?? r13 = r7[i7];
                                    int i8 = 0;
                                    int i9 = 0;
                                    ?? r11 = 0;
                                    while (i8 < length2) {
                                        ?? r1 = r13[i8 + 5];
                                        if (r1 > (r11 == true ? 1.0f : 0.0f)) {
                                            i9 = i8;
                                            r11 = r1;
                                        }
                                        i8++;
                                        r11 = r11;
                                    }
                                    arrayList3.add(new Pair(Float.valueOf(r11 == true ? 1.0f : 0.0f), Integer.valueOf(i9)));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                int i10 = 0;
                                for (Object obj3 : arrayList3) {
                                    int i11 = i10 + 1;
                                    if (i10 >= 0) {
                                        if (((Number) ((Pair) obj3).getFirst()).floatValue() >= fFloatValue && (numValueOf = Integer.valueOf(i10)) != null) {
                                            arrayList4.add(numValueOf);
                                        }
                                        i10 = i11;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList = C13BV.INSTANCE;
                                } else {
                                    List listLJLLLL2 = C13LP.LJLLLL(new C512501z9(arrayList3, 8), arrayList4);
                                    arrayList = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList(listLJLLLL2);
                                    while (!arrayList5.isEmpty()) {
                                        ?? r12 = r7[((Number) ListProtector.remove(arrayList5, 0)).intValue()];
                                        arrayList.add(r12);
                                        ArrayList arrayList6 = new ArrayList();
                                        int size = arrayList5.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ?? r17 = r7[((Number) ListProtector.get(arrayList5, i12)).intValue()];
                                            float fMax = Math.max((float) r12[0], (float) r17[0]);
                                            float fMax2 = Math.max((float) r12[1], (float) r17[1]);
                                            float fMin = Math.min((float) r12[2], (float) r17[2]);
                                            float fMin2 = Math.min((float) r12[3], (float) r17[3]);
                                            if (fMin >= fMax && fMin2 >= fMax2) {
                                                float f12 = (fMin - fMax) * (fMin2 - fMax2);
                                                f2 = f12 / ((((r12[2] - r12[0]) * (r12[3] - r12[1])) + ((r17[2] - r17[0]) * (r17[3] - r17[1]))) - f12);
                                            } else {
                                                f2 = 0.0f;
                                            }
                                            if (f2 > fFloatValue2) {
                                                arrayList6.add(Integer.valueOf(i12));
                                            }
                                        }
                                        Iterator it2 = C13LP.LJLLL(arrayList6).iterator();
                                        while (it2.hasNext()) {
                                            ListProtector.remove(arrayList5, ((Number) it2.next()).intValue());
                                        }
                                    }
                                }
                            }
                            map2.put("yolox_ret", arrayList);
                            map2.put("origin_ret", r7);
                            map3.put("yolox_ret", arrayList);
                            map3.put("origin_ret", r7);
                            return;
                        }
                        throw new C892820Z0u("cannot get scale_ratios smart output data", "runtime");
                    }
                    throw new C892820Z0u("cannot get float_array_output from previous output data", "runtime");
                }
            };
        }
        return null;
    }
}
