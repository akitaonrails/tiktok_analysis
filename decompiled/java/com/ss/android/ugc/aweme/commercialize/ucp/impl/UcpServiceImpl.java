package com.ss.android.ugc.aweme.commercialize.ucp.impl;

import X.AnonymousClass0956;
import X.C099V;
import X.C0D5Z;
import X.C0D8X;
import X.C0DHR;
import X.C0WZX;
import X.C1281004zo;
import X.C1281104zp;
import X.C1524305xx;
import X.C15433062l;
import X.C1701330uNH;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2252321DDq;
import X.C23250099c;
import X.C333500D5o;
import X.C335000DBi;
import X.EnumC12947054v;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.commercialize.model.ucp.AcShopData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS102S0400000_4;
import kotlin.jvm.internal.AwS19S0001000_4;
import kotlin.jvm.internal.AwS89S1200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpServiceImpl implements IUcpService {
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final void LIZIZ() {
        C15433062l.LIZIZ.clear();
        C15433062l.LIZJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LIZJ() {
        C1524305xx c1524305xx = C1524305xx.LIZ;
        EnumC12947054v enumC12947054v = EnumC12947054v.EXPANDED_PDP_SHEET;
        c1524305xx.getClass();
        C1524305xx.LJFF();
        Collection<C1281004zo> collectionValues = C1524305xx.LIZIZ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Set<C1281104zp> set = ((C1281004zo) it2.next()).LIZJ;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (((C1281104zp) it3.next()).LIZIZ == enumC12947054v) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final UcpRouterInterceptor getInterceptor() {
        return new UcpRouterInterceptor();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r3
      0x0011: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:24:0x004f, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set LJIILIIL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L4e
            java.lang.String r3 = r5.getItemId()
            if (r3 == 0) goto L4e
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4e
        L11:
            java.lang.String r1 = r5.getCreativeIdStr()
            if (r1 == 0) goto L20
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            r4 = r1
        L20:
            X.13DB r2 = new X.13DB
            r2.<init>()
            if (r3 == 0) goto L2a
            r2.add(r3)
        L2a:
            if (r4 == 0) goto L2f
            r2.add(r4)
        L2f:
            if (r3 == 0) goto L49
            if (r4 == 0) goto L49
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r0 = 35
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.add(r0)
        L49:
            java.util.Set r0 = r2.build()
            return r0
        L4e:
            r3 = r4
            if (r5 == 0) goto L20
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl.LJIILIIL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):java.util.Set");
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LIZLLL(AwemeRawAd awemeRawAd) {
        Set setLJIILIIL = LJIILIIL(awemeRawAd);
        if ((setLJIILIIL instanceof Collection) && setLJIILIIL.isEmpty()) {
            return false;
        }
        Iterator it2 = setLJIILIIL.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(this.LIZ.get(it2.next()), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LJII(Uri uri) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals("acshop", uri.getHost());
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final <T> T LJIIIZ(Class<T> cls) {
        T t = (T) C0D8X.LIZLLL(cls);
        if (t != null) {
            return t;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(cls.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final void LJIIJ(AwemeRawAd awemeRawAd) {
        for (Object obj : LJIILIIL(awemeRawAd)) {
            if (!Intrinsics.LJFF(this.LIZ.get(obj), Boolean.FALSE)) {
                this.LIZ.put((String) obj, Boolean.TRUE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final void LIZ(int i, CommonAdData commonAdData) {
        AwemeRawAd awemeRawAd;
        if (i == 4) {
            if (commonAdData instanceof AwemeRawAd) {
                awemeRawAd = (AwemeRawAd) commonAdData;
            } else {
                awemeRawAd = null;
            }
            Iterator it2 = LJIILIIL(awemeRawAd).iterator();
            while (it2.hasNext()) {
                this.LIZ.put((String) it2.next(), Boolean.FALSE);
            }
        }
        new C335000DBi(C2097608Jq.LJ(), new Object[0]).logAd(C0DHR.LIZ, commonAdData, new AwS19S0001000_4(i, 3));
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LJ(C19EG c19eg, Intent intent) {
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    C1524305xx.LIZ.getClass();
                    C1524305xx.LIZJ(extras);
                    C2252321DDq c2252321DDq = C0D5Z.LIZ;
                    Boolean bool = Boolean.FALSE;
                    c2252321DDq.setValue(bool);
                    AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, C099V.UNDISPATCHED, new C333500D5o(c19eg, this, extras, null), 1);
                    if (LJIIL(c19eg, intent)) {
                        return true;
                    }
                    c2252321DDq.setValue(bool);
                    anonymousClass0956LIZLLL.LIZIZ(null);
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LJFF(Uri uri, AwemeRawAd awemeRawAd) {
        if (LJII(uri) && !LJIIIIZZ(uri, awemeRawAd)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0230 A[PHI: r15
      0x0230: PHI (r15v1 boolean) = (r15v0 boolean), (r15v3 boolean) binds: [B:138:0x022e, B:39:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a A[PHI: r8
      0x018a: PHI (r8v6 boolean) = (r8v4 boolean), (r8v7 boolean) binds: [B:87:0x0186, B:70:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C19EG r18, android.content.Intent r19) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl.LJI(X.19EG, android.content.Intent):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LJIIIIZZ(Uri uri, AwemeRawAd awemeRawAd) {
        AcShopData acShopData;
        String openUrl;
        Integer num = null;
        if ((uri == null && (awemeRawAd == null || (openUrl = awemeRawAd.getOpenUrl()) == null || (uri = UriProtector.parse(openUrl)) == null)) || !LJII(uri)) {
            return false;
        }
        if (awemeRawAd != null && (acShopData = awemeRawAd.getAcShopData()) != null) {
            num = acShopData.clientSmartJudgment;
        }
        if (num == null || num.intValue() != 1) {
            return true;
        }
        return LIZLLL(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final void LJIIJJI(AwemeRawAd awemeRawAd, AwS89S1200000_4 awS89S1200000_4) {
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        IECommerceAddressService iECommerceAddressService = (IECommerceAddressService) PluggableExtentionKt.pluggableSpi$default(IECommerceAddressService.class, false, false, false, 14, null);
        if (iAdAutofillService != null && iECommerceAddressService != null) {
            iAdAutofillService.LJIILL(new AwS102S0400000_4(this, awemeRawAd, awS89S1200000_4, iECommerceAddressService, 1));
        } else {
            LIZ(3, awemeRawAd);
            awS89S1200000_4.invoke(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.ucp.IUcpService
    public final boolean LJIIL(C19EG c19eg, Intent intent) throws Throwable {
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    C1524305xx.LIZ.getClass();
                    C1524305xx.LIZJ(extras);
                    Intent intent2 = new Intent(c19eg, (Class<?>) OnestepCheckoutActivity.class);
                    intent2.putExtras(new Bundle(extras));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent2, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent2, c19eg);
                    C2204961BRm.LLJJJJ(c19eg, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclwz5uIhWRwyI53bike+eo=", null));
                    return true;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
