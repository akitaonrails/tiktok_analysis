package com.ss.android.ugc.aweme.ecommerce.ug.vsa.service;

import X.AnonymousClass0185;
import X.C01GW;
import X.C1618390sDV;
import X.C1740930vP9;
import X.C18PZ;
import X.C2097608Jq;
import X.C21278418Ow;
import X.C21278818Pa;
import X.C21279218Pe;
import X.C823050WQl;
import X.InterfaceC584210Mvj;
import Y.ARunnableS104S0000000_31;
import Y.ARunnableS24S1300000_32;
import Y.ARunnableS34S1200000_32;
import Y.ARunnableS36S1100000_32;
import Y.ARunnableS3S1210000_32;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes33.dex */
public final class EcUgVSAService implements IEcUgVSAService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LIZLLL() {
        try {
            C01GW c01gw = C21278818Pa.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C21278818Pa.LIZIZ != null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final void LJII() {
        try {
            C18PZ.LIZ.getClass();
            try {
                C823050WQl.LIZJ().execute(new ARunnableS104S0000000_31(3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final Map LIZ(Context context) {
        try {
            C18PZ.LIZ.getClass();
            return C18PZ.LIZIZ(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LIZJ(String str) {
        C21278418Ow.LIZ.getClass();
        try {
            return Intrinsics.LJFF("1", AnonymousClass0185.LJ(UriProtector.parse(str), "is_ec_ug_popup"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJFF(String str) {
        C21278418Ow.LIZ.getClass();
        return C21278418Ow.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJIIIIZZ(String str) {
        try {
            C1618390sDV.LIZ.getClass();
            return C1618390sDV.LIZJ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final boolean LJIIIZ(String str) {
        return C1740930vP9.LIZIZ(str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.18Pe] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final C21279218Pe LJ(Aweme aweme, String str) {
        try {
            C18PZ.LIZ.getClass();
            if (C18PZ.LIZJ(str) && C21278818Pa.LJIIIZ(aweme, str)) {
                return new InterfaceC584210Mvj() { // from class: X.18Pe
                    public static final /* synthetic */ int LIZ = 0;

                    @Override // X.InterfaceC584210Mvj
                    public final void LIZ() {
                    }

                    @C14EU(threadMode = ThreadMode.BACKGROUND)
                    public final void onInboxPopupVisibilityChange(C1619070sEb c1619070sEb) {
                        C18PZ.LIZ.getClass();
                        if (c1619070sEb.LIZ == 0) {
                            C01GW c01gw = C21278818Pa.LIZ;
                            if (C21278818Pa.LIZIZ != null) {
                                C18PM.LJI(C18PM.LIZ, EnumC21279818Pk.INBOX_POPUP.getValue(), false, 0, "inbox to show", null, null, null, null, 244);
                            }
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final int LJIIIIZZ(Aweme aweme2, String str2) {
                        VSACardsResponse.VSACardData vSACardData;
                        Integer num;
                        int iIntValue = 2;
                        try {
                            C18PZ.LIZ.getClass();
                            C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(aweme2, str2);
                            if (c21279318PfLIZJ != null && (vSACardData = c21279318PfLIZJ.LJFF) != null && (num = vSACardData.delayShowTime) != null && num.intValue() >= 0) {
                                iIntValue = num.intValue();
                            }
                            iIntValue *= LSPassThroughRecordSizeConfig.DEFAULT;
                            return iIntValue;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return iIntValue;
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final boolean LJIIJ(Aweme aweme2, String str2) {
                        try {
                            return C21278818Pa.LJIIIZ(aweme2, str2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return false;
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJIIJJI(Context context, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS36S1100000_32(context, str2, 4));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LIZIZ(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS24S1300000_32(context, this, aweme2, str2, 4));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LIZJ(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            C01GW c01gw = C21278818Pa.LIZ;
                            C21278818Pa.LIZLLL = str2;
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS24S1300000_32(context, this, aweme2, str2, 3));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LIZLLL(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS34S1200000_32(context, aweme2, str2, 5));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJ(Fragment fragment, String str2, Aweme aweme2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS34S1200000_32(fragment, aweme2, str2, 3));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJI(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            C01GW c01gw = C21278818Pa.LIZ;
                            C21278818Pa.LIZLLL = str2;
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS34S1200000_32(context, aweme2, str2, 4));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJII(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS24S1300000_32(context, this, aweme2, str2, 1));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJIIL(Context context, Aweme aweme2, String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS24S1300000_32(context, this, aweme2, str2, 2));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJFF(Context context, String str2, Aweme aweme2, boolean z) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS3S1210000_32(context, aweme2, str2, z, 1));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJIIIZ(Context context, String str2, Aweme aweme2, boolean z) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new ARunnableS3S1210000_32(context, aweme2, str2, z, 0));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // X.InterfaceC584210Mvj
                    public final void LJIILIIL(final Context context, final Fragment fragment, final DataCenter dataCenter, final Aweme aweme2, final String str2) {
                        try {
                            C18PZ.LIZ.getClass();
                            try {
                                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18Pc
                                    public final void LIZ() {
                                        try {
                                            C01GW c01gw = C21278818Pa.LIZ;
                                            if (C21278818Pa.LJIIIZ(aweme2, str2)) {
                                                if (context == null) {
                                                    C18PZ c18pz = C18PZ.LIZ;
                                                    String str3 = str2;
                                                    c18pz.getClass();
                                                    C18PZ.LJ("context null", str3);
                                                    return;
                                                }
                                                C18PZ c18pz2 = C18PZ.LIZ;
                                                String str4 = str2;
                                                c18pz2.getClass();
                                                if (!C18PZ.LIZJ(str4)) {
                                                    C18PZ.LJ("not recommend", str2);
                                                    return;
                                                }
                                                final Aweme aweme3 = C21278818Pa.LIZIZ;
                                                if (aweme3 == null) {
                                                    Aweme aweme4 = C21278818Pa.LIZJ;
                                                    String aid = aweme4 != null ? aweme4.getAid() : null;
                                                    Aweme aweme5 = aweme2;
                                                    if (Intrinsics.LJFF(aid, aweme5 != null ? aweme5.getAid() : null)) {
                                                        C18PM.LJI(C18PM.LIZ, EnumC21279818Pk.UNEXPECTED.getValue(), false, 0, "show after unselected", null, null, null, null, 244);
                                                        return;
                                                    } else {
                                                        C18PZ.LJ("active aweme null", str2);
                                                        return;
                                                    }
                                                }
                                                String aid2 = aweme3.getAid();
                                                Aweme aweme6 = aweme2;
                                                if (!Intrinsics.LJFF(aid2, aweme6 != null ? aweme6.getAid() : null)) {
                                                    C18PZ.LJ("aid different", str2);
                                                    return;
                                                }
                                                C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                                                Context context2 = context;
                                                String str5 = str2;
                                                c21278918Pb.getClass();
                                                Pair pairLIZ = C21278918Pb.LIZ(context2, aweme3, str5);
                                                boolean zBooleanValue = ((Boolean) pairLIZ.getFirst()).booleanValue();
                                                int iIntValue = ((Number) pairLIZ.getSecond()).intValue();
                                                if (!zBooleanValue) {
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("can not show ");
                                                    sbLIZ.append(iIntValue);
                                                    C18PZ.LJ(C2188811AlT.LIZIZ(sbLIZ), str2);
                                                    return;
                                                }
                                                final C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(C21278818Pa.LIZIZ, str2);
                                                if (c21279318PfLIZJ == null) {
                                                    C18PZ.LJ("no cache", str2);
                                                    return;
                                                }
                                                final VSACardsResponse.VSACardData vSACardData = c21279318PfLIZJ.LJFF;
                                                final Bitmap bitmap = c21279318PfLIZJ.LJIIIIZZ;
                                                if (vSACardData == null) {
                                                    C18PZ.LJ("no product data", str2);
                                                    return;
                                                }
                                                c21279318PfLIZJ.LJIIJ = dataCenter;
                                                try {
                                                    ExecutorC1592406Li executorC1592406Li = ExecutorC1592406Li.LLILLJJLI;
                                                    final String str6 = str2;
                                                    final Context context3 = context;
                                                    final Fragment fragment2 = fragment;
                                                    final Aweme aweme7 = aweme2;
                                                    executorC1592406Li.execute(new Runnable() { // from class: X.18PY
                                                        /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0013, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:13:0x0037, B:15:0x003b, B:27:0x0076, B:16:0x004a, B:18:0x0050, B:19:0x0053, B:21:0x005b, B:23:0x0061, B:24:0x0065), top: B:32:0x0000 }] */
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public final void LIZ() {
                                                            /*
                                                                r8 = this;
                                                                X.18Pf r0 = r1     // Catch: java.lang.Throwable -> L7b
                                                                X.18PX r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L7b
                                                                r5 = 1
                                                                if (r0 == 0) goto L4a
                                                                X.01GW r0 = X.C21278818Pa.LIZ     // Catch: java.lang.Throwable -> L7b
                                                                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2     // Catch: java.lang.Throwable -> L7b
                                                                java.lang.String r0 = r3     // Catch: java.lang.Throwable -> L7b
                                                                boolean r0 = X.C21278818Pa.LJI(r1, r0)     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 == 0) goto L4a
                                                                X.18Pf r0 = r1     // Catch: java.lang.Throwable -> L7b
                                                                X.18PX r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 == 0) goto L4a
                                                                boolean r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 != r5) goto L4a
                                                            L1d:
                                                                X.18Pf r7 = r1     // Catch: java.lang.Throwable -> L7b
                                                                X.18PX r6 = r7.LJIIIZ     // Catch: java.lang.Throwable -> L7b
                                                                if (r6 == 0) goto L37
                                                                com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse$VSACardData r4 = r6     // Catch: java.lang.Throwable -> L7b
                                                                X.18PF r3 = new X.18PF     // Catch: java.lang.Throwable -> L7b
                                                                java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L7b
                                                                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8     // Catch: java.lang.Throwable -> L7b
                                                                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2     // Catch: java.lang.Throwable -> L7b
                                                                r3.<init>(r2, r7, r1, r0)     // Catch: java.lang.Throwable -> L7b
                                                                java.util.Map<java.lang.String, java.lang.String> r1 = r7.LJI     // Catch: java.lang.Throwable -> L7b
                                                                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r7.LJII     // Catch: java.lang.Throwable -> L7b
                                                                r6.LJ(r4, r3, r1, r0)     // Catch: java.lang.Throwable -> L7b
                                                            L37:
                                                                boolean r0 = X.C18PZ.LIZLLL     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 != 0) goto L76
                                                                X.18Pb r3 = X.C21278918Pb.LIZ     // Catch: java.lang.Throwable -> L7b
                                                                android.content.Context r2 = r4     // Catch: java.lang.Throwable -> L7b
                                                                X.18Pf r1 = r1     // Catch: java.lang.Throwable -> L7b
                                                                android.graphics.Bitmap r0 = r7     // Catch: java.lang.Throwable -> L7b
                                                                r3.getClass()     // Catch: java.lang.Throwable -> L7b
                                                                X.C21278918Pb.LIZLLL(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L7b
                                                                goto L75
                                                            L4a:
                                                                X.18Pf r0 = r1     // Catch: java.lang.Throwable -> L7b
                                                                X.18PX r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 == 0) goto L53
                                                                r0.LIZ()     // Catch: java.lang.Throwable -> L7b
                                                            L53:
                                                                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2     // Catch: java.lang.Throwable -> L7b
                                                                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 == 0) goto L73
                                                                com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r0 = r0.getLabel()     // Catch: java.lang.Throwable -> L7b
                                                                if (r0 == 0) goto L73
                                                                java.lang.String r4 = r0.getLabelName()     // Catch: java.lang.Throwable -> L7b
                                                            L65:
                                                                X.18Pf r3 = r1     // Catch: java.lang.Throwable -> L7b
                                                                X.18PX r2 = new X.18PX     // Catch: java.lang.Throwable -> L7b
                                                                android.content.Context r1 = r4     // Catch: java.lang.Throwable -> L7b
                                                                androidx.fragment.app.Fragment r0 = r5     // Catch: java.lang.Throwable -> L7b
                                                                r2.<init>(r1, r0, r4)     // Catch: java.lang.Throwable -> L7b
                                                                r3.LJIIIZ = r2     // Catch: java.lang.Throwable -> L7b
                                                                goto L1d
                                                            L73:
                                                                r4 = 0
                                                                goto L65
                                                            L75:
                                                                return
                                                            L76:
                                                                X.18Pf r0 = r1     // Catch: java.lang.Throwable -> L7b
                                                                r0.LJIILJJIL = r5     // Catch: java.lang.Throwable -> L7b
                                                                return
                                                            L7b:
                                                                r0 = move-exception
                                                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                                                return
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: X.C18PY.LIZ():void");
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean zLIZ;
                                                            C1C7U.LIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$lambda$22$lambda$20$$inlined$runOnMainThread$1");
                                                            try {
                                                                LIZ();
                                                            } finally {
                                                                if (!zLIZ) {
                                                                }
                                                            }
                                                            C1C7U.LIZIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$lambda$22$lambda$20$$inlined$runOnMainThread$1");
                                                        }
                                                    });
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                                C18PM.LJI(C18PM.LIZ, EnumC21279818Pk.SHOW.getValue(), true, 0, null, null, null, c21279318PfLIZJ.LJFF, c21279318PfLIZJ.LJI, 60);
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$$inlined$runOnWorkerThread$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$$inlined$runOnWorkerThread$1");
                                    }
                                });
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                };
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final void LJI(final String str, final List list) {
        try {
            C18PZ.LIZ.getClass();
            try {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18Ox
                    public final void LIZ() {
                        String strLJIIIIZZ;
                        AwemeRawAd awemeRawAd;
                        EcUgVSAData ecUgVSAData;
                        List<EcUgVSAData.EcUgVSAProductInfo> list2;
                        String str2;
                        try {
                            List list3 = list;
                            if (list3 == null || list3.isEmpty()) {
                                return;
                            }
                            ArrayList<Aweme> arrayList = new ArrayList();
                            arrayList.addAll(list);
                            ArrayList arrayList2 = new ArrayList();
                            for (Aweme aweme : arrayList) {
                                if (aweme != null && C21278818Pa.LJIIJJI(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && (list2 = ecUgVSAData.productInfoList) != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (EcUgVSAData.EcUgVSAProductInfo ecUgVSAProductInfo : list2) {
                                        if (ecUgVSAProductInfo != null && (str2 = ecUgVSAProductInfo.productId) != null) {
                                            arrayList3.add(str2);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        arrayList2.add(new VSACardsRequest.VSAInfoInfo(aweme.getAid(), arrayList3, ecUgVSAData.campaignName, ecUgVSAData.campaignId, ecUgVSAData.creativeId, C123500dV.LIZIZ(awemeRawAd.getAdId()), ecUgVSAData.previousPage, Integer.valueOf(C294640Bgk.LIZ())));
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                try {
                                    PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(EnumC1740810vOx.MALL.getPageCode(), null), null, null, 6);
                                    strLJIIIIZZ = pageSourceInfoLJFF != null ? C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF) : null;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    strLJIIIIZZ = "";
                                }
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZIZ, null, new C18PE(strLJIIIIZZ, str, arrayList2, arrayList, null), 2);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcUgVSAManager@aafd.preloadProductData$$inlined$runOnWorkerThread$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcUgVSAManager@aafd.preloadProductData$$inlined$runOnWorkerThread$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final String LJIIJ(Context context, Aweme aweme, int i) {
        try {
            return C18PZ.LIZLLL(C18PZ.LIZ, context, null, aweme, Integer.valueOf(i), null, 18);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService
    public final String LIZIZ(Context context, Aweme aweme, String str, String str2) {
        try {
            return C18PZ.LIZLLL(C18PZ.LIZ, context, str, aweme, null, str2, 8);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }
}
