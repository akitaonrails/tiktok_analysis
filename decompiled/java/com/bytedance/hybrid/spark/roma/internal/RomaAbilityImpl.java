package com.bytedance.hybrid.spark.roma.internal;

import X.C01GW;
import X.C13EL;
import X.C13EM;
import X.C13LP;
import X.C1545830qKT;
import X.C1550250qRb;
import X.C1550290qRf;
import X.C1550300qRg;
import X.C1550340qRk;
import X.C1550350qRl;
import X.C1550360qRm;
import X.C1550380qRo;
import X.C189200o6;
import X.C1946007jm;
import X.C2188811AlT;
import X.C2281108wj;
import X.C2281508wn;
import X.C2282208wu;
import X.C2282908x1;
import X.C313460CQm;
import X.C512401z8;
import X.EnumC1160910gJd;
import X.EnumC2281308wl;
import X.InterfaceC1546060qKq;
import Y.ARunnableS28S1100000_23;
import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.bytedance.hybrid.spark.roma.IRomaAbility;
import com.bytedance.hybrid.spark.roma.RomaFreezeConfigGlobal;
import com.bytedance.hybrid.spark.roma.SparkPageSampleRatioConfig;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaAbilityImpl implements IRomaAbility, IRomaInternalAbility {
    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void initialize() {
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void LIZ() {
        String str;
        C2281508wn c2281508wn = C2282908x1.LIZIZ.LIZ;
        c2281508wn.LIZ.set(true);
        c2281508wn.LIZIZ();
        c2281508wn.LIZJ();
        C01GW c01gw = C1550250qRb.LIZ;
        if (C1550250qRb.LIZLLL.compareAndSet(false, true)) {
            String string = C1550250qRb.LIZ().getString("__internal__version__", "");
            C01GW c01gw2 = C1550250qRb.LIZJ;
            RomaFreezeConfigGlobal romaFreezeConfigGlobal = (RomaFreezeConfigGlobal) c01gw2.getValue();
            if (Intrinsics.LJFF(string, romaFreezeConfigGlobal != null ? romaFreezeConfigGlobal.version : null)) {
                C1550250qRb.LIZJ(0L, 0L, string, string);
                return;
            }
            IResourceServiceX iResourceServiceX = (IResourceServiceX) C1550250qRb.LIZIZ.getValue();
            if (iResourceServiceX == null) {
                C1550250qRb.LIZIZ(-100003, "The resource loader is null.");
                return;
            }
            RomaFreezeConfigGlobal romaFreezeConfigGlobal2 = (RomaFreezeConfigGlobal) c01gw2.getValue();
            if (romaFreezeConfigGlobal2 == null || (str = romaFreezeConfigGlobal2.url) == null || a0.LJJJIL(str)) {
                C1550250qRb.LIZIZ(-100004, "The url is null or blank.");
            } else {
                ExecutorService executorService = C2281108wj.LIZ;
                C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new ARunnableS28S1100000_23(iResourceServiceX, str, 5));
            }
        }
    }

    public static boolean LJI(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1550300qRg.LIZIZ.getClass();
        if (!C1550300qRg.LIZIZ().enable || !a0.LJJIIZI(str, "spark_page", false)) {
            return false;
        }
        Uri uriLJ = C1946007jm.LJ(str);
        if (!uriLJ.isHierarchical() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "spark_page")) == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "spark_page_session");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final boolean LIZLLL(String str) {
        ((IRomaDebugService) C1550380qRo.LIZ.getValue()).LIZ();
        if (!LJI(str) && !C1550300qRg.LIZIZ.ki(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final InterfaceC1546060qKq LJ(String str) {
        int iLJJIZ;
        C2282208wu.LIZ.getClass();
        if (str.length() > 1000) {
            str = str.substring(0, LSPassThroughRecordSizeConfig.DEFAULT);
        }
        LruCache<String, InterfaceC1546060qKq> lruCache = C2282208wu.LIZJ;
        InterfaceC1546060qKq interfaceC1546060qKq = lruCache.get(str);
        if (interfaceC1546060qKq == null) {
            int iLJJJ = a0.LJJJ(str, "spark_page_session", 0, false, 6);
            if (iLJJJ != -1 && (iLJJIZ = a0.LJJIZ(str, '&', iLJJJ, false, 4)) != -1) {
                return lruCache.get(str.substring(0, iLJJIZ));
            }
            return null;
        }
        return interfaceC1546060qKq;
    }

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final C1545830qKT LJFF(C1550360qRm c1550360qRm) {
        String strLJIL;
        Pair pair;
        boolean z;
        String strLJIL2;
        C1550300qRg.LIZIZ.getClass();
        Object obj = null;
        if (!C1550300qRg.LIZIZ().enableSchemeMatch) {
            return new C1545830qKT(EnumC1160910gJd.NO_MATCHED_NAME, (String) null, (String) null, 14);
        }
        Object obj2 = ((C313460CQm) C1550300qRg.LJFF.getValue()).get((Object) c1550360qRm.LIZIZ);
        int i = 1;
        if (obj2 != null) {
            pair = new Pair(c1550360qRm.LIZIZ, obj2);
        } else {
            n nVar = new n();
            Object value = C1550300qRg.LJI.getValue();
            String str = c1550360qRm.LIZJ;
            String str2 = c1550360qRm.LIZLLL;
            if (str.length() == 0 && str2.length() == 0) {
                pair = new Pair("", "");
            } else {
                char c = '/';
                List listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{'/'}, false, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listLJJLIIIJ) {
                    if (((String) obj3).length() > 0) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        k kVarLJJIIZ = nVar.LJJIIZ((String) it2.next());
                        if (kVarLJJIIZ == null) {
                            break;
                        }
                        nVar = C1550340qRk.LIZ(kVarLJJIIZ);
                    } else {
                        k kVarLJJIIZ2 = nVar.LJJIIZ("!!");
                        if (kVarLJJIIZ2 == null || !(kVarLJJIIZ2 instanceof q) || (strLJIL = kVarLJJIIZ2.LJIL()) == null) {
                            break;
                        }
                        pair = new Pair(str2, strLJIL);
                    }
                }
                char c2 = '.';
                C13EL c13el = new C13EL(a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6));
                ArrayList arrayList2 = new ArrayList();
                Object it3 = c13el.iterator();
                while (true) {
                    C13EM c13em = (C13EM) it3;
                    if (!c13em.hasNext()) {
                        break;
                    }
                    Object next = c13em.next();
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                List listLJLIL = arrayList;
                if (!z) {
                    listLJLIL = C13LP.LJLIL(arrayList, C13LP.LJLILLLLZI("$$", arrayList2));
                }
                if (!listLJLIL.isEmpty()) {
                    Stack stack = new Stack();
                    stack.push(new Pair(value, 0));
                    C1550350qRl c1550350qRl = new C1550350qRl(listLJLIL.size());
                    int i2 = -1;
                    while (!stack.isEmpty()) {
                        Pair pair2 = (Pair) stack.pop();
                        n nVar2 = (n) pair2.getFirst();
                        int iIntValue = ((Number) pair2.getSecond()).intValue();
                        if (iIntValue <= i2) {
                            int i3 = iIntValue - 1;
                            Object[] objArr = c1550350qRl.LIZ;
                            Object obj4 = objArr[i3];
                            if (obj4 instanceof Stack) {
                                ((Stack) obj4).pop();
                            } else {
                                objArr[i3] = obj;
                            }
                        }
                        if (iIntValue == listLJLIL.size()) {
                            k kVarLJJIIZ3 = nVar2.LJJIIZ("!!");
                            if (kVarLJJIIZ3 != null && (kVarLJJIIZ3 instanceof q) && (strLJIL2 = kVarLJJIIZ3.LJIL()) != null) {
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr2 = c1550350qRl.LIZ;
                                ArrayList<String> arrayList3 = new ArrayList(objArr2.length);
                                int length = objArr2.length;
                                boolean z2 = false;
                                for (int i4 = 0; i4 < length; i4++) {
                                    Object objPeek = objArr2[i4];
                                    if (!(objPeek instanceof String)) {
                                        objPeek = ((Stack) objPeek).peek();
                                    }
                                    if (Intrinsics.LJFF(objPeek, "$$")) {
                                        z2 = true;
                                    }
                                    arrayList3.add(objPeek);
                                }
                                for (String str3 : arrayList3) {
                                    if (Intrinsics.LJFF(str3, "$$")) {
                                        if (sb.length() > 0) {
                                            sb.replace(sb.length() - i, sb.length(), "/");
                                        }
                                        z2 = false;
                                    } else if (z2) {
                                        sb.append(str3);
                                        sb.append(c2);
                                    } else {
                                        if (sb.length() > 0 && !a0.LJJIJIIJIL(sb, c)) {
                                            sb.append(c);
                                        }
                                        sb.append(str3);
                                    }
                                }
                                pair = new Pair(sb.toString(), strLJIL2);
                                if (pair == null) {
                                }
                            }
                        } else {
                            String str4 = (String) ListProtector.get(listLJLIL, iIntValue);
                            k kVarLJJIIZ4 = nVar2.LJJIIZ("*");
                            if (kVarLJJIIZ4 != null && (kVarLJJIIZ4 instanceof n) == i) {
                                n nVarLJIILIIL = kVarLJJIIZ4.LJIILIIL();
                                for (String str5 : C13LP.LJLLLL(new C512401z8(78), nVarLJIILIIL.LJJIJIL())) {
                                    if (Intrinsics.LJFF(str5, "!!") || u.LJJIIJZLJL(str4, str5, false)) {
                                        stack.push(new Pair(C1550340qRk.LIZ(nVarLJIILIIL.LJJIIZ(str5)), Integer.valueOf(iIntValue + 1)));
                                        if (!Intrinsics.LJFF(str5, "!!")) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append('*');
                                            sbLIZ.append(str5);
                                            c1550350qRl.LIZ(iIntValue, C2188811AlT.LIZIZ(sbLIZ));
                                        } else {
                                            c1550350qRl.LIZ(iIntValue, "*");
                                        }
                                    }
                                }
                            }
                            k kVarLJJIIZ5 = nVar2.LJJIIZ(str4);
                            if (kVarLJJIIZ5 != null) {
                                c1550350qRl.LIZ(iIntValue, str4);
                                stack.push(new Pair(C1550340qRk.LIZ(kVarLJJIIZ5), Integer.valueOf(iIntValue + 1)));
                            }
                        }
                        i2 = iIntValue;
                        obj = null;
                        i = 1;
                        c2 = '.';
                        c = '/';
                    }
                }
                pair = new Pair("", "");
            }
        }
        String str6 = (String) pair.getFirst();
        String str7 = (String) pair.getSecond();
        C1550300qRg.LIZIZ.getClass();
        if (!C1550300qRg.LIZIZ().enableMatchShortLink) {
            return new C1545830qKT(EnumC1160910gJd.DISABLED, str7, str6, 4);
        }
        if (!a0.LJJJIL(str6) && !a0.LJJJIL(str7) && !Intrinsics.LJFF(str7, CardStruct.IStatusCode.DEFAULT)) {
            C1550290qRf.LIZ.getClass();
            Object objLIZ = C1550290qRf.LIZ(str7);
            if (C189200o6.m7isFailureimpl(objLIZ)) {
                objLIZ = null;
            }
            ShortLinkConfig shortLinkConfig = (ShortLinkConfig) objLIZ;
            if (shortLinkConfig == null) {
                return new C1545830qKT(EnumC1160910gJd.NO_CONFIG, str7, (String) null, str6);
            }
            C2282208wu c2282208wu = C2282208wu.LIZ;
            String str8 = c1550360qRm.LIZ;
            Map<String, String> map = c1550360qRm.LJ;
            c2282208wu.getClass();
            return new C1545830qKT(EnumC1160910gJd.SUCCESS, str7, C2282208wu.LIZJ(str8, true, false, map, str7, shortLinkConfig), str6);
        }
        EnumC1160910gJd enumC1160910gJd = EnumC1160910gJd.NO_MATCHED_NAME;
        if (!(!Intrinsics.LJFF(str7, CardStruct.IStatusCode.DEFAULT))) {
            str7 = null;
        }
        return new C1545830qKT(enumC1160910gJd, str7, str6, 4);
    }

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final double getSampleRatio(String str) {
        C01GW<SparkPageSampleRatioConfig> c01gw = SparkPageSampleRatioConfig.LIZ;
        if (!c01gw.getValue().enable) {
            return 0.0d;
        }
        for (SparkPageSampleRatioConfig.SampleRateGroup sampleRateGroup : c01gw.getValue().groups) {
            if (sampleRateGroup.pages.contains(str)) {
                return sampleRateGroup.sampleRate;
            }
        }
        return SparkPageSampleRatioConfig.LIZ.getValue().defaultSampleRate;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242  */
    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.roma.internal.RomaAbilityImpl.LIZIZ(java.lang.String, java.util.Map):java.lang.String");
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void LIZJ(Context context, String str, Map<String, String> map) throws JSONException {
        C1550300qRg.LIZIZ.LIZ(context, LIZIZ(str, map));
    }
}
