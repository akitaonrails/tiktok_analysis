package com.ss.android.ugc.aweme.ecommerce.sec;

import X.C01GW;
import X.C035A;
import X.C0CGR;
import X.C13LK;
import X.C1497160p3y;
import X.C1515120pWw;
import X.C19304810fm;
import X.C20163313ux;
import X.C20163513uz;
import X.C2188811AlT;
import X.C452501pT;
import X.C927903jx;
import X.InterfaceC1497150p3x;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.sec.EcomSecApiImpl;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi;
import com.tts.mobsec.oecsec.ov.CSManagerUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomSecApiImpl implements IEcomSecApi {
    public static final Object LJIIL = new Object();
    public static final Object LJIILIIL = new Object();
    public static final Object LJIILJJIL = new Object();
    public boolean LJ;
    public boolean LJFF;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public boolean LJI = true;
    public final String LJII = (String) new C927903jx().invoke();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C035A());
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(136));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(137));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(138));

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi
    public final void LIZJ() {
        C20163513uz.LIZ.LJIIJJI();
    }

    public final int LIZLLL() {
        return ((Number) this.LJIIIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi
    public final void LIZ(final Context context) {
        C19304810fm.LIZ.getClass();
        EcomCsSdkModel ecomCsSdkModel = C19304810fm.LIZIZ;
        boolean z = ecomCsSdkModel.enableCsSdk;
        this.LJ = z;
        if (!z) {
            return;
        }
        if (ecomCsSdkModel.csPreInit) {
            if (ecomCsSdkModel.csGlueEv) {
                C20163513uz.LJFF(context, LIZLLL(), (String) this.LJIIJ.getValue());
            }
            C1515120pWw.LIZIZ(new EcomSecInterceptor());
            C1497160p3y.LIZ = new InterfaceC1497150p3x() { // from class: X.13v1
                @Override // X.InterfaceC1497150p3x
                public final long LIZ() {
                    try {
                        if (!this.LIZ.LIZIZ.get()) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Object obj = EcomSecApiImpl.LJIIL;
                            EcomSecApiImpl ecomSecApiImpl = this.LIZ;
                            Context context2 = context;
                            synchronized (obj) {
                                try {
                                    if (!ecomSecApiImpl.LIZIZ.get()) {
                                        C20163513uz.LJII(context2);
                                        if (C20163313ux.LIZ.abBtm) {
                                            CSManagerUtils.LIZLLL();
                                        }
                                        ecomSecApiImpl.LIZIZ.set(true);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C20163513uz.LJIIIZ(System.currentTimeMillis() - jCurrentTimeMillis, "si_lite_it");
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long nativeOecCallbackAddress = CSManagerUtils.getNativeOecCallbackAddress();
                        C20163513uz.LJIIIZ(System.currentTimeMillis() - jCurrentTimeMillis2, "si_lite_cb");
                        return nativeOecCallbackAddress;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C20163513uz.LIZIZ(104, th2.getClass().getSimpleName());
                        return 0L;
                    }
                }
            };
            System.currentTimeMillis();
            EcomCsSdkABModel ecomCsSdkABModel = C20163313ux.LIZ;
            if (ecomCsSdkABModel.abBtm) {
                C13LK c13lk = C20163513uz.LIZIZ;
                int i = ecomCsSdkABModel.btmChainLength;
                synchronized (c13lk) {
                    c13lk.LIZ = i;
                    while (c13lk.LIZIZ.size() > c13lk.LIZ) {
                        c13lk.LIZIZ.removeFirst();
                    }
                }
                C13LK c13lk2 = C20163513uz.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('E');
                sbLIZ.append(UUID.randomUUID());
                C20163513uz.LIZJ = c13lk2.LIZJ(C2188811AlT.LIZIZ(sbLIZ), C20163513uz.LIZJ());
                return;
            }
            return;
        }
        this.LJ = z;
        boolean z2 = ecomCsSdkModel.csEnableNewInterceptor;
        this.LJI = z2;
        if (z2) {
            if (ecomCsSdkModel.csGlueEv) {
                C20163513uz.LJFF(context, LIZLLL(), (String) this.LJIIJ.getValue());
            }
            C1515120pWw.LIZIZ(new EcomSecInterceptor());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: all -> 0x0240, TRY_ENTER, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:48:0x0094, B:50:0x00a5, B:54:0x00c2, B:56:0x00ca, B:57:0x00d2, B:60:0x00ec, B:63:0x0109, B:64:0x010e, B:66:0x0112, B:67:0x0117, B:69:0x011d, B:70:0x0122, B:72:0x0126, B:73:0x012b, B:75:0x012f, B:76:0x0134, B:78:0x0138, B:79:0x013d, B:81:0x0141, B:82:0x0146, B:84:0x014c, B:85:0x0170, B:86:0x017a, B:88:0x0180, B:90:0x0194, B:92:0x019f, B:94:0x01a5, B:95:0x01a9, B:99:0x01b6, B:101:0x01bc, B:103:0x01c2, B:104:0x01cf, B:106:0x01d5, B:110:0x01eb, B:111:0x01f7, B:112:0x020c, B:114:0x0212, B:116:0x0235, B:115:0x0231, B:59:0x00dd), top: B:192:0x0094 }] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r24) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sec.EcomSecApiImpl.LIZIZ(android.content.Context):void");
    }

    public final void LJ(Context context) {
        boolean z;
        if (C0CGR.LIZ.enableOecSdk == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        if (z && !this.LIZJ.get()) {
            synchronized (LJIILIIL) {
                try {
                    if (this.LIZJ.compareAndSet(false, true)) {
                        C20163513uz.LJ(context, this.LJII, (String) this.LJIIJJI.getValue(), LIZLLL(), (String) this.LJIIIIZZ.getValue(), (String) this.LJIIJ.getValue());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi
    public final void reportData(String str) {
        if (!this.LJ) {
            return;
        }
        C20163513uz.LJIIIIZZ(str);
    }
}
