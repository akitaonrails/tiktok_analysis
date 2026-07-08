package kotlin.jvm.internal;

import X.C013C;
import X.C054G;
import X.C09AY;
import X.C11JF;
import X.C11NZ;
import X.C123100dR;
import X.C1729400v6Y;
import X.C1729570v6p;
import X.C1731300v9c;
import X.C1758140vqu;
import X.C1758310vrB;
import X.C1758370vrH;
import X.C1758380vrI;
import X.C1758390vrJ;
import X.C1776050wJn;
import X.C1909107dp;
import X.C19EG;
import X.C672920QaQ;
import X.InterfaceC1731320v9e;
import X.InterfaceC1731340v9g;
import X.InterfaceC1758450vrP;
import X.InterfaceC497601wk;
import X.InterfaceC634840OvC;
import Y.AfS0S0500100_26;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS7S0400100_26 extends C09AY implements Function0 {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S0400100_26 awS7S0400100_26) throws Throwable {
        boolean z;
        String str;
        ProductPackStruct productPackStruct = ((C1758370vrH) awS7S0400100_26.l0).LIZLLL;
        boolean z2 = false;
        if (productPackStruct != null) {
            if (TextUtils.isEmpty(((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).chainKey) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
                Map<String, Object> map = ((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).visitReportParams;
                if (map != null) {
                    map.put("chain_key", productPackStruct.chainKey);
                }
                ((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).setChainKey(productPackStruct.chainKey);
            }
            InterfaceC1758450vrP.LIZ.getClass();
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            C1758310vrB.LJJIL(((C1758370vrH) awS7S0400100_26.l0).LIZ);
            C1758380vrI c1758380vrI = (C1758380vrI) awS7S0400100_26.l2;
            C19EG c19eg = (C19EG) awS7S0400100_26.l3;
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) awS7S0400100_26.l1;
            long j = awS7S0400100_26.j4;
            int i = ((C1758370vrH) awS7S0400100_26.l0).LIZIZ;
            c1758380vrI.getClass();
            C1758380vrI.LIZLLL(c19eg, pdpEnterParam, productPackStruct, j, i, 0);
            C672920QaQ.LIZ("open 1", ((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).trackParams);
        } else {
            C013C c013c = new C013C();
            C1758380vrI c1758380vrI2 = (C1758380vrI) awS7S0400100_26.l2;
            String productId = ((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).getProductId();
            c1758380vrI2.getClass();
            C054G c054g = C1758140vqu.LIZ;
            if (C1758140vqu.LIZJ(productId) != null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = ((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).pdpCacheKey;
            if (str2 != null && C123100dR.LIZ(str2)) {
                z2 = true;
            }
            if (!((IPdpStarter.PdpEnterParam) awS7S0400100_26.l1).pdpPreParam.isEmpty()) {
                c013c.element = true;
            }
            if (z2 || z) {
                c013c.element = true;
            }
            C1758380vrI c1758380vrI3 = (C1758380vrI) awS7S0400100_26.l2;
            C1758370vrH c1758370vrH = (C1758370vrH) awS7S0400100_26.l0;
            C11NZ<ProductPackStruct> c11nz = c1758370vrH.LIZJ;
            IPdpStarter.PdpEnterParam pdpEnterParam2 = (IPdpStarter.PdpEnterParam) awS7S0400100_26.l1;
            C19EG c19eg2 = (C19EG) awS7S0400100_26.l3;
            long j2 = awS7S0400100_26.j4;
            c1758380vrI3.LIZIZ = (C11JF) c11nz.LJJZ(new AfS0S0500100_26(j2, c19eg2, c1758370vrH, pdpEnterParam2, c1758380vrI3, c013c, 0), new AfS0S0500100_26(j2, c19eg2, c1758370vrH, pdpEnterParam2, c1758380vrI3, c013c, 1), new C1776050wJn(c1758380vrI3, 0));
            if (c013c.element) {
                C1758380vrI c1758380vrI4 = (C1758380vrI) awS7S0400100_26.l2;
                C19EG c19eg3 = (C19EG) awS7S0400100_26.l3;
                IPdpStarter.PdpEnterParam pdpEnterParam3 = (IPdpStarter.PdpEnterParam) awS7S0400100_26.l1;
                long j3 = awS7S0400100_26.j4;
                int i2 = ((C1758370vrH) awS7S0400100_26.l0).LIZIZ;
                c1758380vrI4.getClass();
                C1758380vrI.LIZLLL(c19eg3, pdpEnterParam3, null, j3, i2, 0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S0400100_26 awS7S0400100_26) {
        String containerID;
        CompletionBlock completionBlock = (CompletionBlock) awS7S0400100_26.l0;
        InterfaceC634840OvC interfaceC634840OvC = ((C1731300v9c) awS7S0400100_26.l1).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1731340v9g.class, containerID), "");
        C1729570v6p.LJFF("success", ((InterfaceC1731320v9e) awS7S0400100_26.l2).getTrackParams().getEnterFrom(), ((InterfaceC1731320v9e) awS7S0400100_26.l2).getActivityId(), Integer.valueOf(((TemplateItem) awS7S0400100_26.l3).getType()), Long.valueOf(System.currentTimeMillis() - awS7S0400100_26.j4), null, 32);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS7S0400100_26 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0400100_26.invoke$2(kotlin.jvm.internal.AwS7S0400100_26):java.lang.Object");
    }

    public static final Object invoke$3(AwS7S0400100_26 awS7S0400100_26) {
        C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS7S0400100_26.l0;
        String str = ((RootData) awS7S0400100_26.l1).authorId;
        int iIntValue = ((Integer) awS7S0400100_26.l2).intValue();
        List list = (List) awS7S0400100_26.l3;
        c1729400v6Y.getClass();
        C1729400v6Y.LJIIIIZZ(interfaceC497601wk, str, iIntValue, list, true);
        C1729400v6Y.LJIIJ((RootData) awS7S0400100_26.l1, ((Integer) awS7S0400100_26.l2).intValue(), "enter_pre_live", awS7S0400100_26.j4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r2 I:kotlin.jvm.internal.AwS7S0400100_26) (LINE:100663296) kotlin.jvm.internal.AwS7S0400100_26.$t int, block:B:2:0x0000 */
    public AwS7S0400100_26(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, RootData rootData, Integer num, List<String> list, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = rootData;
        this.l3 = num;
        this.j4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0400100_26(C1758370vrH c1758370vrH, IPdpStarter.PdpEnterParam pdpEnterParam, C1758380vrI c1758380vrI, C19EG c19eg, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1758370vrH;
        this.l1 = pdpEnterParam;
        this.l2 = c1758380vrI;
        this.l3 = c19eg;
        this.j4 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0400100_26(C1758370vrH c1758370vrH, IPdpStarter.PdpEnterParam pdpEnterParam, C1758390vrJ c1758390vrJ, C19EG c19eg, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1758370vrH;
        this.l1 = pdpEnterParam;
        this.l2 = c1758390vrJ;
        this.l3 = c19eg;
        this.j4 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r2 I:kotlin.jvm.internal.AwS7S0400100_26) (LINE:100859904) kotlin.jvm.internal.AwS7S0400100_26.$t int, block:B:2:0x0000 */
    public AwS7S0400100_26(CompletionBlock completionBlock, CompletionBlock<InterfaceC1731340v9g> completionBlock2, C1731300v9c c1731300v9c, InterfaceC1731320v9e interfaceC1731320v9e, TemplateItem templateItem, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
        this.l2 = c1731300v9c;
        this.l3 = interfaceC1731320v9e;
        this.j4 = templateItem;
    }
}
