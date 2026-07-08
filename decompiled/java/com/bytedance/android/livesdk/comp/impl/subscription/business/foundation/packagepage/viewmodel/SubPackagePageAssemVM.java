package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel;

import X.C0KBL;
import X.C0KGF;
import X.C0KGP;
import X.C0KIF;
import X.C0KIU;
import X.C0KIW;
import X.C0KJJ;
import X.C0KJX;
import X.C0KKG;
import X.C0KKO;
import X.C1554960qZC;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C259800zU;
import X.C386801es;
import X.C497740JfY;
import X.C513700KCq;
import X.C514600KGc;
import X.C514690KGl;
import X.C514770KGt;
import X.C515100KIa;
import X.C515110KIb;
import X.C515130KId;
import X.C515190KIj;
import X.C515200KIk;
import X.C515220KIm;
import X.C515280KIs;
import X.C515430KJh;
import X.EnumC513490KBv;
import X.EnumC513810KDb;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.TemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageAssemVM extends AssemViewModel<C0KGF> implements ISubPackagePageAbility {
    public boolean LL;
    public boolean LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public final C0KJJ LLILZ = new C0KJJ();
    public C513700KCq LLILZIL;

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final C513700KCq Ku() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILZIL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
            C513700KCq c513700KCq = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C513700KCq.class, null)) != null) {
                c513700KCq = (C513700KCq) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILZIL = c513700KCq;
        }
        return this.LLILZIL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0KGF(0);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final SubscriptionProductDetailWithTemplateInfo e7() {
        return getState().LLILZIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final EnumC513810KDb hd() {
        return getState().LLIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Hc(String str) {
        setState(new C0KIF(str));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Io(Function1<? super C514770KGt, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KIi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILZLL;
            }
        }, null, null, null, new C515200KIk(function1), 14, null);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void WA(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        setState(new C0KIW(subscriptionProductDetailWithTemplateInfo));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Z8(Function2<? super C514600KGc, ? super Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> function2) {
        AssemViewModel.selectSubscribe$default(this, null, new C2217381BqS() { // from class: X.0KIe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0KIf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILZ;
            }
        }, null, null, null, new C515100KIa((C0KBL) function2), 57, null);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void cu(Function1<? super Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KIh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILZ;
            }
        }, null, null, null, new C515130KId((C514690KGl) function1), 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public final void vQ2(C0KJX c0kjx) {
        boolean z;
        int i;
        if (c0kjx == null) {
            return;
        }
        setState(new C0KIU());
        this.LL = true;
        final C515110KIb c515110KIb = new C515110KIb(this);
        C0KJJ c0kjj = this.LLILZ;
        final C515220KIm c515220KIm = new C515220KIm(this);
        final C515280KIs c515280KIs = (C515280KIs) c0kjj.LIZIZ.getValue();
        c515280KIs.getClass();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = c0kjx.LJIIIIZZ;
        if (C515280KIs.LIZ(c0kjx)) {
            if (c0kjx.LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1006;
            } else {
                i = C386801es.DEFAULT;
            }
            c515110KIb.invoke(new C514600KGc(C2097608Jq.LJ(), (String) c259800zU.element, new C515430KJh(C386801es.DEFAULT, i, C497740JfY.LJIJI(2131856510)), null));
        }
        C0KKO c0kko = new C0KKO() { // from class: X.0KIn
            @Override // X.C0KKO
            public final void LIZIZ() {
                c515220KIm.invoke(C515380KJc.LIZ);
            }

            @Override // X.C0KKO
            public final void LIZJ(String str) {
                c515280KIs.LIZ = str;
            }

            @Override // X.C0KKO
            public final void LIZ(int i2, String str) {
                c515220KIm.invoke(C515400KJe.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tpl list api failed, error code: ");
                sbLIZ.append(i2);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
            @Override // X.C0KKO
            public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
                C515430KJh c515430KJh;
                c515220KIm.invoke(C515390KJd.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch sku success, fromCache = ");
                sbLIZ.append(c0kh1.LIZIZ);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> entry : map.entrySet()) {
                    ArrayList arrayList = new ArrayList(entry.getValue());
                    if (arrayList.size() != 0) {
                        C513940KDo.LIZJ(arrayList, c0kh1.LJ);
                        if (!arrayList.isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (c259800zU.element.length() == 0) {
                    c259800zU.element = c515280KIs.LIZ;
                }
                if (map.isEmpty()) {
                    c515430KJh = new C515430KJh(C386801es.DEFAULT, -1005, C497740JfY.LJIJI(2131855022));
                } else {
                    c515430KJh = null;
                }
                c515110KIb.invoke(new C514600KGc(map, c259800zU.element, c515430KJh, c0kh1));
            }

            @Override // X.C0KKO
            public final void LJFF(long j, TemplateListData templateListData) {
                c515220KIm.invoke(C515410KJf.LIZ);
            }

            @Override // X.C0KKO
            public final void LIZLLL(int i2, int i3, int i4, String str, C0KH1 c0kh1) {
                c515220KIm.invoke(C515370KJb.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Query sku failed, error code: ");
                sbLIZ.append(i3);
                sbLIZ.append('-');
                sbLIZ.append(i4);
                sbLIZ.append("; error message: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                c515110KIb.invoke(new C514600KGc(C2097608Jq.LJ(), "", new C515430KJh(i3, i4, str), c0kh1));
            }
        };
        c0kjx.LJIIIZ = null;
        c0kjx.LJIIJ = c0kko;
        c0kjx.LJI = true;
        c0kjx.LJII = EnumC513490KBv.NORMAL_SUBSCRIPTION;
        c0kjx.LJIILJJIL = true;
        C0KKG c0kkg = new C0KKG();
        c0kkg.LIZ();
        c0kkg.LJ(c0kjx);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void xa(Function1<? super C514600KGc, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KIg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, null, null, new C515190KIj(function1), 14, null);
    }

    public static void wQ2(SubPackagePageAssemVM subPackagePageAssemVM, Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num, Boolean bool4, String str2, List list, int i) {
        String str3;
        List list2 = list;
        String str4 = str2;
        Boolean bool5 = bool4;
        Integer num2 = num;
        Boolean bool6 = bool;
        RefundInfo refundInfo2 = refundInfo;
        Boolean bool7 = bool3;
        String str5 = str;
        Boolean bool8 = bool2;
        if ((i & 2) != 0) {
            bool6 = null;
        }
        if ((i & 4) != 0) {
            bool8 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            bool7 = null;
        }
        if ((i & 32) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 64) != 0) {
            refundInfo2 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            bool5 = null;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            list2 = null;
        }
        subPackagePageAssemVM.setState(new C0KGP(null, bool6, bool8, str5, bool7, str3, refundInfo2, num2, bool5, str4, list2));
    }
}
