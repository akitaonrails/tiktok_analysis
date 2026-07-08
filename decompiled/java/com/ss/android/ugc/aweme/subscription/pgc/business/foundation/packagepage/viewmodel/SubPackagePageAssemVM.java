package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel;

import X.C0KC4;
import X.C0KCH;
import X.C0KCP;
import X.C0KDT;
import X.C0KDU;
import X.C0KDZ;
import X.C0KF4;
import X.C0KFK;
import X.C0KL4;
import X.C0KLA;
import X.C0KLD;
import X.C1554960qZC;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C259800zU;
import X.C386801es;
import X.C511520K4g;
import X.C513800KDa;
import X.EnumC513480KBu;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS58S1000000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageAssemVM extends AssemViewModel<C513800KDa> implements ISubPackagePageAbility {
    public boolean LL;
    public boolean LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public final C0KFK LLILZ = new C0KFK();
    public C0KC4 LLILZIL;

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final C0KC4 Ku() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILZIL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
            C0KC4 c0kc4 = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0KC4.class, null)) != null) {
                c0kc4 = (C0KC4) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILZIL = c0kc4;
        }
        return this.LLILZIL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C513800KDa(0);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final PGCSubscriptionProductDetailWithTemplateInfo e7() {
        return getState().LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final C0KDZ hd() {
        return getState().LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Hc(String str) {
        setState(new AwS58S1000000_7(str, 3));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Io(Function1<? super C0KDT, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KF0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILZLL;
            }
        }, null, null, null, new AwS586S0100000_7(function1, (Function1<? super C0KCH, Unit>) 289), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void Z8(Function2<? super C0KCH, ? super Pair<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>>, Unit> function2) {
        AssemViewModel.selectSubscribe$default(this, null, new C2217381BqS() { // from class: X.0KEw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0KEy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILZ;
            }
        }, null, null, null, new AwS621S0100000_7((AwS621S0100000_7) function2, 40), 57, null);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void cu(Function1<? super Pair<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>>, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KEz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILZ;
            }
        }, null, null, null, new AwS586S0100000_7((AwS373S0200000_7) function1, 288), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void js1(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        setState(new AwS586S0100000_7(pGCSubscriptionProductDetailWithTemplateInfo, 290));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public final void vQ2(C0KLA c0kla) {
        int i;
        if (c0kla == null) {
            return;
        }
        setState(AFwS237S0000000_7.get$arr$(206));
        this.LL = true;
        final AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 286);
        C0KFK c0kfk = this.LLILZ;
        final AwS586S0100000_7 awS586S0100000_72 = new AwS586S0100000_7(this, 285);
        final C0KF4 c0kf4 = (C0KF4) c0kfk.LIZIZ.getValue();
        c0kf4.getClass();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = c0kla.LJIIIIZZ;
        if (C0KF4.LIZ(c0kla)) {
            if (c0kla.LIZ.length() == 0) {
                i = -1006;
            } else {
                i = C386801es.DEFAULT;
            }
            String strLJII = C511520K4g.LJII(2131839492);
            if (strLJII == null) {
                strLJII = "";
            }
            awS586S0100000_7.invoke(new C0KCH(C2097608Jq.LJ(), (String) c259800zU.element, new C0KCP(-1, i, strLJII), null));
        }
        C0KLD c0kld = new C0KLD() { // from class: X.0KEv
            @Override // X.C0KLD
            public final void LIZIZ() {
                awS586S0100000_72.invoke(C514350KFd.LIZ);
            }

            @Override // X.C0KLD
            public final void LIZJ(String str) {
                c0kf4.LIZ = str;
            }

            @Override // X.C0KLD
            public final void LIZ(int i2, String str) {
                awS586S0100000_72.invoke(C514370KFf.LIZ);
            }

            @Override // X.C0KLD
            public final void LIZLLL(long j, PGCTemplateListData pGCTemplateListData) {
                awS586S0100000_72.invoke(C514380KFg.LIZ);
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
            @Override // X.C0KLD
            public final void LJFF(Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C0KCK c0kck) {
                C0KCP c0kcp;
                awS586S0100000_72.invoke(C514360KFe.LIZ);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> entry : map.entrySet()) {
                    ArrayList arrayList = new ArrayList(entry.getValue());
                    if (arrayList.size() != 0) {
                        C513840KDe.LIZJ(arrayList, c0kck.LJ);
                        if (!arrayList.isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (c259800zU.element.length() == 0) {
                    c259800zU.element = c0kf4.LIZ;
                }
                if (map.isEmpty()) {
                    String strLJII2 = C511520K4g.LJII(2131839396);
                    if (strLJII2 == null) {
                        strLJII2 = "";
                    }
                    c0kcp = new C0KCP(-1, -1005, strLJII2);
                } else {
                    c0kcp = null;
                }
                awS586S0100000_7.invoke(new C0KCH(map, c259800zU.element, c0kcp, c0kck));
            }

            @Override // X.C0KLD
            public final void LJ(int i2, int i3, String str, C0KCK c0kck) {
                awS586S0100000_72.invoke(C514340KFc.LIZ);
                awS586S0100000_7.invoke(new C0KCH(C2097608Jq.LJ(), "", new C0KCP(i2, i3, str), c0kck));
            }
        };
        c0kla.LJIIIZ = null;
        c0kla.LJIIJ = c0kld;
        c0kla.LJI = true;
        c0kla.LJII = EnumC513480KBu.NORMAL_SUBSCRIPTION;
        c0kla.LJIILJJIL = true;
        C0KL4 c0kl4 = new C0KL4();
        c0kl4.LIZ();
        c0kl4.LJ(c0kla);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility
    public final void xa(Function1<? super C0KCH, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0KEx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS586S0100000_7(function1, (Function1<? super C0KCH, Unit>) 287), 14, null);
    }

    public static void wQ2(SubPackagePageAssemVM subPackagePageAssemVM, Boolean bool, Boolean bool2, String str, Boolean bool3, RefundInfo refundInfo, Integer num, Boolean bool4, String str2, PGCTipsInfo pGCTipsInfo, int i) {
        String str3;
        PGCTipsInfo pGCTipsInfo2 = pGCTipsInfo;
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
            pGCTipsInfo2 = null;
        }
        subPackagePageAssemVM.setState(new C0KDU(null, bool6, bool8, str5, bool7, str3, refundInfo2, num2, bool5, str4, pGCTipsInfo2, null));
    }
}
