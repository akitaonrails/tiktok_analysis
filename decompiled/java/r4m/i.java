package r4m;

import X.AbstractC1423390n8z;
import X.C01GW;
import X.C0CIJ;
import X.C0PEM;
import X.C13BV;
import X.C13LP;
import X.C1419580n2q;
import X.C1419590n2r;
import X.C1422880n8A;
import X.C1422890n8B;
import X.C1423260n8m;
import X.C1423300n8q;
import X.C1423440n94;
import X.C1423570n9H;
import X.C1423580n9I;
import X.C1423690n9T;
import X.C1423700n9U;
import X.C1423730n9X;
import X.C1423760n9a;
import X.C1423810n9f;
import X.C1423860n9k;
import X.C1429050nI7;
import X.C1449490np5;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C23250099c;
import X.C311170CHr;
import X.C311200CHu;
import X.C452501pT;
import X.EnumC1423060n8S;
import X.InterfaceC1423460n96;
import X.InterfaceC1635390sev;
import X.InterfaceC497601wk;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import r4m.i;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends AbstractC1423390n8z<TemplateCategoryData, C1419590n2r, C1422880n8A, Asset, C1423690n9T, C1422890n8B> {
    public InterfaceC497601wk LIZIZ;
    public C1423810n9f LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(459));
    public final Map<TemplateCategoryData, C1423700n9U> LJ = new LinkedHashMap(C2097608Jq.LJ());
    public final List<C1423730n9X> LJFF = new ArrayList(C13BV.INSTANCE);

    public static int LIZLLL(C1423690n9T c1423690n9T) {
        if (c1423690n9T.LIZJ) {
            return 10005;
        }
        if (c1423690n9T.LIZIZ) {
            return 10006;
        }
        return 10002;
    }

    public static EnumC1423060n8S LJ(C1423690n9T c1423690n9T) {
        if (c1423690n9T.LIZJ) {
            return EnumC1423060n8S.LOAD_MORE_TEMPLATES_ERROR;
        }
        if (c1423690n9T.LIZIZ) {
            return EnumC1423060n8S.REFRESH_TEMPLATES_ERROR;
        }
        return EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
    }

    public final synchronized void LJFF(TemplateCategoryData templateCategoryData, C1423700n9U c1423700n9U) {
        if (c1423700n9U == null) {
            this.LJ.remove(templateCategoryData);
        } else {
            this.LJ.put(templateCategoryData, c1423700n9U);
        }
    }

    @Override // X.InterfaceC1423430n93
    public final void LIZ(int i, Object obj, Object obj2) {
        int i2;
        Map mapLIZJ;
        TemplateCategoryData templateCategoryData = (TemplateCategoryData) obj;
        C1422890n8B c1422890n8B = (C1422890n8B) obj2;
        if (((LinkedHashMap) this.LJ).get(templateCategoryData) == null) {
            if (c1422890n8B.LIZ) {
                i2 = -1;
                mapLIZJ = C2097608Jq.LJIIIIZZ(new Pair(0, 0), new Pair(1, Integer.valueOf(i)));
            } else {
                i2 = 0;
                mapLIZJ = C2097908Jt.LIZJ(new Pair(0, 0));
            }
            LJFF(templateCategoryData, new C1423700n9U(i2, Collections.singletonList(0), mapLIZJ));
        }
    }

    @Override // X.InterfaceC1423430n93
    public final boolean LIZJ(Object obj, final C1423690n9T c1423690n9T, C1423260n8m c1423260n8m) {
        int i;
        int size;
        int i2;
        Pair pair;
        final TemplateCategoryData templateCategoryData = (TemplateCategoryData) obj;
        if ((!c1423690n9T.LIZIZ && !c1423690n9T.LIZJ && (!c1423690n9T.LJFF.isEmpty())) || (c1423690n9T.LIZJ && !c1423690n9T.LJ)) {
            return false;
        }
        if (!C1423570n9H.LIZJ(templateCategoryData)) {
            boolean z = c1423690n9T.LIZIZ;
            boolean z2 = c1423690n9T.LIZJ;
            C1423700n9U c1423700n9U = (C1423700n9U) ((LinkedHashMap) this.LJ).get(templateCategoryData);
            if (c1423700n9U == null) {
                pair = new Pair(0, 0);
            } else {
                List<Integer> list = c1423700n9U.LIZ;
                if (list.isEmpty()) {
                    pair = new Pair(0, 0);
                } else if (!z2 && !z) {
                    LJFF(templateCategoryData, null);
                    pair = new Pair(0, 0);
                } else {
                    int iIntValue = ((Number) C13LP.LJJLIIIJJI(list)).intValue();
                    int iIntValue2 = ((Number) C13LP.LJJJJZI(list)).intValue();
                    int i3 = c1423700n9U.LIZJ;
                    if (i3 == -1) {
                        int i4 = iIntValue + 1;
                        pair = new Pair(Integer.valueOf(i4), Integer.valueOf(c1423700n9U.LIZ(i4)));
                    } else {
                        int i5 = i3 + 1;
                        int i6 = (iIntValue + 1) % i5;
                        if (!z2 && i6 == iIntValue2) {
                            int i7 = (i6 + 1) % i5;
                            pair = new Pair(Integer.valueOf(i7), Integer.valueOf(c1423700n9U.LIZ(i7)));
                        } else {
                            pair = new Pair(Integer.valueOf(i6), Integer.valueOf(c1423700n9U.LIZ(i6)));
                        }
                    }
                }
            }
        } else {
            if ((!c1423690n9T.LIZJ && !c1423690n9T.LIZIZ) || c1423690n9T.LIZIZ) {
                size = 0;
            } else {
                List<Pair<C1419590n2r, Boolean>> list2 = c1423690n9T.LJII;
                if (list2 != null) {
                    Iterator<Pair<C1419590n2r, Boolean>> it2 = list2.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (it2.next().getSecond().booleanValue()) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        i += i2;
                    }
                } else {
                    i = 0;
                }
                size = c1423690n9T.LJFF.size() + i;
            }
            pair = new Pair(0, Integer.valueOf(size));
        }
        final int iIntValue3 = ((Number) pair.getFirst()).intValue();
        final int iIntValue4 = ((Number) pair.getSecond()).intValue();
        if (iIntValue3 >= 0) {
            final C1423730n9X c1423730n9X = new C1423730n9X(templateCategoryData, c1423690n9T);
            List<C1423730n9X> list3 = this.LJFF;
            if (!(list3 instanceof Collection) || !((ArrayList) list3).isEmpty()) {
                for (C1423730n9X c1423730n9X2 : (ArrayList) list3) {
                    if (Intrinsics.LJFF(c1423730n9X2.LIZ.key, c1423730n9X.LIZ.key)) {
                        C1423690n9T c1423690n9T2 = c1423730n9X2.LIZIZ;
                        boolean z3 = c1423690n9T2.LIZIZ;
                        C1423690n9T c1423690n9T3 = c1423730n9X.LIZIZ;
                        if (z3 == c1423690n9T3.LIZIZ && c1423690n9T2.LIZJ == c1423690n9T3.LIZJ && c1423690n9T2.LJ == c1423690n9T3.LJ && c1423690n9T2.LIZLLL == c1423690n9T3.LIZLLL && C1423860n9k.LIZIZ(c1423690n9T2.LJFF, c1423690n9T3.LJFF)) {
                            return false;
                        }
                    }
                }
            }
            ((ArrayList) this.LJFF).add(c1423730n9X);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(templateCategoryData, 1030);
            int i8 = c1423690n9T.LIZLLL;
            C1423760n9a c1423760n9a = c1423690n9T.LJI;
            c1419580n2q.getClass();
            C1423300n8q c1423300n8q = new C1423300n8q(iIntValue4, i8, jCurrentTimeMillis, c1423760n9a, awS566S0100000_22, false);
            InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B> interfaceC1423460n96 = new InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B>() { // from class: X.0n9W
                @Override // X.InterfaceC1423460n96
                public final void LIZ(C1422880n8A c1422880n8A) {
                    ((ArrayList) this.LIZ.LJFF).remove(c1423730n9X);
                }

                @Override // X.InterfaceC1423460n96
                public final void LIZIZ(C1422890n8B c1422890n8B, List list4) {
                    ((ArrayList) this.LIZ.LJFF).remove(c1423730n9X);
                }
            };
            if (C1423570n9H.LIZJ(templateCategoryData)) {
                C1423440n94 c1423440n94 = new C1423440n94(C1697810uHb.LJIIJJI(interfaceC1423460n96, c1423260n8m));
                InterfaceC497601wk interfaceC497601wk = this.LIZIZ;
                if (interfaceC497601wk != null) {
                    C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1423580n9I(this, templateCategoryData, c1423690n9T, iIntValue4, c1423440n94, null), 2);
                    return true;
                }
                return true;
            }
            final C1423440n94 c1423440n942 = new C1423440n94(C1697810uHb.LJIIJJI(interfaceC1423460n96, c1423300n8q, c1423260n8m));
            InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) this.LIZLLL.getValue();
            String str = templateCategoryData.key;
            int i9 = c1423690n9T.LIZLLL;
            C1423760n9a c1423760n9a2 = c1423690n9T.LJI;
            String str2 = c1423760n9a2.LIZ;
            C1449490np5 c1449490np5 = C1449490np5.LIZ;
            String str3 = c1423760n9a2.LIZIZ;
            c1449490np5.getClass();
            String strLJIIIZ = C1449490np5.LJIIIZ(str3);
            IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService != null) {
                iToolsDebugGpService.isOpen();
            }
            MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo = new MixedAssetsRequestBodyInfo("tt_template", null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, "", strLJIIIZ, "", null, null, null, null, Boolean.FALSE, null, "", null);
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            TemplateScene templateScene = TemplateScene.TEMPLATE_TAB;
            c1429050nI7.getClass();
            Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
            Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
            interfaceC1635390sev.LJIILL(new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", c1423690n9T.LJI.LIZIZ, null, null, false, null, null, false), "tt_template", str, iIntValue4, i9, mixedAssetsRequestBodyInfo, new IFetchAssetCategoryInfo() { // from class: X.0n9F
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    int iLIZLLL;
                    String msg;
                    String logId;
                    C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n943 = c1423440n942;
                    i iVar = this;
                    C1423690n9T c1423690n9T4 = c1423690n9T;
                    iVar.getClass();
                    EnumC1423060n8S enumC1423060n8SLJ = i.LJ(c1423690n9T4);
                    if (exceptionResult != null) {
                        iLIZLLL = exceptionResult.getErrorCode();
                    } else {
                        i iVar2 = this;
                        C1423690n9T c1423690n9T5 = c1423690n9T;
                        iVar2.getClass();
                        iLIZLLL = i.LIZLLL(c1423690n9T5);
                    }
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "";
                    }
                    TemplateCategoryData templateCategoryData2 = templateCategoryData;
                    boolean z4 = c1423690n9T.LIZ;
                    if (exceptionResult != null) {
                        logId = exceptionResult.getLogId();
                    } else {
                        logId = null;
                    }
                    c1423440n943.LIZ(new C1422880n8A(enumC1423060n8SLJ, iLIZLLL, msg, templateCategoryData2, z4, logId));
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(AssetCategoryResponse assetCategoryResponse) {
                    AssetCategoryModel data;
                    Pair pair2;
                    C1423700n9U c1423700n9U2;
                    C1419590n2r c1419590n2r;
                    AssetCategoryResponse assetCategoryResponse2 = assetCategoryResponse;
                    String logId = null;
                    if (assetCategoryResponse2 != null && (data = assetCategoryResponse2.getData()) != null) {
                        List<Asset> list4 = data.asset_list;
                        boolean z4 = true;
                        if (list4 != null && !list4.isEmpty()) {
                            i iVar = this;
                            int i10 = iIntValue4;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                            int i11 = 0;
                            for (Parcelable parcelable : list4) {
                                int i12 = i11 + 1;
                                if (i11 >= 0) {
                                    InterfaceC1423480n98<ORI_DATA, DATA> interfaceC1423480n98 = iVar.LIZ;
                                    if (interfaceC1423480n98 != 0 && (c1419590n2r = (C1419590n2r) interfaceC1423480n98.LIZ((ORI_DATA) parcelable)) != null) {
                                        c1419590n2r.LIZJ = i10;
                                        c1419590n2r.LIZLLL = i11;
                                    } else {
                                        c1419590n2r = null;
                                    }
                                    arrayList.add(c1419590n2r);
                                    i11 = i12;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            List listLJJJJLI = C13LP.LJJJJLI(arrayList);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (ArrayList) listLJJJJLI) {
                                if (hashSet.add(((C1419590n2r) obj2).LIZ.getAsset_id())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n943 = c1423440n942;
                                i iVar2 = this;
                                C1423690n9T c1423690n9T4 = c1423690n9T;
                                iVar2.getClass();
                                EnumC1423060n8S enumC1423060n8SLJ = i.LJ(c1423690n9T4);
                                i iVar3 = this;
                                C1423690n9T c1423690n9T5 = c1423690n9T;
                                iVar3.getClass();
                                c1423440n943.LIZ(new C1422880n8A(enumC1423060n8SLJ, i.LIZLLL(c1423690n9T5), "parsed templateList is empty", templateCategoryData, c1423690n9T.LIZ, assetCategoryResponse2.getLogId()));
                                return;
                            }
                            Boolean bool = data.has_more;
                            Integer num = data.next_position;
                            if (bool == null) {
                                C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n944 = c1423440n942;
                                i iVar4 = this;
                                C1423690n9T c1423690n9T6 = c1423690n9T;
                                iVar4.getClass();
                                EnumC1423060n8S enumC1423060n8SLJ2 = i.LJ(c1423690n9T6);
                                i iVar5 = this;
                                C1423690n9T c1423690n9T7 = c1423690n9T;
                                iVar5.getClass();
                                c1423440n944.LIZ(new C1422880n8A(enumC1423060n8SLJ2, i.LIZLLL(c1423690n9T7), "has_more is null", templateCategoryData, c1423690n9T.LIZ, assetCategoryResponse2.getLogId()));
                                return;
                            }
                            if (num == null) {
                                C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n945 = c1423440n942;
                                i iVar6 = this;
                                C1423690n9T c1423690n9T8 = c1423690n9T;
                                iVar6.getClass();
                                EnumC1423060n8S enumC1423060n8SLJ3 = i.LJ(c1423690n9T8);
                                i iVar7 = this;
                                C1423690n9T c1423690n9T9 = c1423690n9T;
                                iVar7.getClass();
                                c1423440n945.LIZ(new C1422880n8A(enumC1423060n8SLJ3, i.LIZLLL(c1423690n9T9), "next_position is null", templateCategoryData, c1423690n9T.LIZ, assetCategoryResponse2.getLogId()));
                                return;
                            }
                            i iVar8 = this;
                            TemplateCategoryData templateCategoryData2 = templateCategoryData;
                            boolean zBooleanValue = bool.booleanValue();
                            int i13 = iIntValue3;
                            int i14 = iIntValue4;
                            int iIntValue5 = num.intValue();
                            boolean z5 = c1423690n9T.LIZIZ;
                            C1423700n9U c1423700n9U3 = (C1423700n9U) ((LinkedHashMap) iVar8.LJ).get(templateCategoryData2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZJ(new Pair(Integer.valueOf(i13), Integer.valueOf(i14))));
                            if (zBooleanValue) {
                                linkedHashMap.put(Integer.valueOf(i13 + 1), Integer.valueOf(iIntValue5));
                            }
                            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap);
                            if (c1423700n9U3 == null) {
                                if (!zBooleanValue) {
                                    c1423700n9U2 = new C1423700n9U(i13, Collections.singletonList(Integer.valueOf(i13)), mapLJIIZILJ);
                                } else {
                                    c1423700n9U2 = new C1423700n9U(-1, Collections.singletonList(Integer.valueOf(i13)), mapLJIIZILJ);
                                }
                                pair2 = new Pair(c1423700n9U2, Boolean.valueOf(zBooleanValue));
                            } else {
                                ArrayList arrayList3 = new ArrayList(C13BV.INSTANCE);
                                if (!z5) {
                                    arrayList3.addAll(c1423700n9U3.LIZ);
                                }
                                arrayList3.add(Integer.valueOf(i13));
                                if (zBooleanValue) {
                                    i13 = c1423700n9U3.LIZJ;
                                }
                                if (i13 != -1 && arrayList3.size() >= i13 + 1) {
                                    z4 = false;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.putAll(c1423700n9U3.LIZIZ);
                                linkedHashMap2.putAll(mapLJIIZILJ);
                                pair2 = new Pair(new C1423700n9U(i13, arrayList3, linkedHashMap2), Boolean.valueOf(z4));
                            }
                            C1423700n9U c1423700n9U4 = (C1423700n9U) pair2.getFirst();
                            boolean zBooleanValue2 = ((Boolean) pair2.getSecond()).booleanValue();
                            this.LJFF(templateCategoryData, c1423700n9U4);
                            C1423690n9T c1423690n9T10 = c1423690n9T;
                            if (c1423690n9T10.LIZIZ) {
                                if (C1423860n9k.LIZIZ(arrayList2, c1423690n9T10.LJFF)) {
                                    c1423440n942.LIZ(new C1422880n8A(EnumC1423060n8S.REFRESH_SAME, 10003, "", templateCategoryData, c1423690n9T.LIZ, assetCategoryResponse2.getLogId()));
                                    return;
                                } else {
                                    c1423440n942.LIZIZ(new C1422890n8B(zBooleanValue2, assetCategoryResponse2.getLogId(), false, false, c1423690n9T.LIZJ, (List) null, (Integer) null, 220), arrayList2);
                                    return;
                                }
                            }
                            if (c1423690n9T10.LIZJ) {
                                ArrayList arrayList4 = new ArrayList(C13BV.INSTANCE);
                                arrayList4.addAll(c1423690n9T.LJFF);
                                arrayList4.addAll(arrayList2);
                                C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n946 = c1423440n942;
                                HashSet hashSet2 = new HashSet();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : arrayList4) {
                                    if (hashSet2.add(((C1419590n2r) obj3).LIZ.getAsset_id())) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                c1423440n946.LIZIZ(new C1422890n8B(zBooleanValue2, assetCategoryResponse2.getLogId(), false, false, c1423690n9T.LIZJ, (List) null, (Integer) null, 220), arrayList5);
                                return;
                            }
                            c1423440n942.LIZIZ(new C1422890n8B(zBooleanValue2, assetCategoryResponse2.getLogId(), false, false, c1423690n9T.LIZJ, (List) null, (Integer) null, 220), arrayList2);
                            return;
                        }
                        C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n947 = c1423440n942;
                        i iVar9 = this;
                        C1423690n9T c1423690n9T11 = c1423690n9T;
                        iVar9.getClass();
                        EnumC1423060n8S enumC1423060n8SLJ4 = i.LJ(c1423690n9T11);
                        i iVar10 = this;
                        C1423690n9T c1423690n9T12 = c1423690n9T;
                        iVar10.getClass();
                        c1423440n947.LIZ(new C1422880n8A(enumC1423060n8SLJ4, i.LIZLLL(c1423690n9T12), "templateList is empty", templateCategoryData, c1423690n9T.LIZ, assetCategoryResponse2.getLogId()));
                        return;
                    }
                    C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n948 = c1423440n942;
                    i iVar11 = this;
                    C1423690n9T c1423690n9T13 = c1423690n9T;
                    iVar11.getClass();
                    EnumC1423060n8S enumC1423060n8SLJ5 = i.LJ(c1423690n9T13);
                    i iVar12 = this;
                    C1423690n9T c1423690n9T14 = c1423690n9T;
                    iVar12.getClass();
                    int iLIZLLL = i.LIZLLL(c1423690n9T14);
                    TemplateCategoryData templateCategoryData3 = templateCategoryData;
                    boolean z6 = c1423690n9T.LIZ;
                    if (assetCategoryResponse2 != null) {
                        logId = assetCategoryResponse2.getLogId();
                    }
                    c1423440n948.LIZ(new C1422880n8A(enumC1423060n8SLJ5, iLIZLLL, "response is null", templateCategoryData3, z6, logId));
                }
            });
            return true;
        }
        return false;
    }
}
