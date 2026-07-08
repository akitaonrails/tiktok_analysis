package com.ss.android.ugc.aweme.image;

import X.C098200Yq;
import X.C0C64;
import X.C0X52;
import X.C1172960gd4;
import X.C1186030gy9;
import X.C1336370ksd;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C189200o6;
import X.C2365509Or;
import X.C2371409Qy;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes19.dex */
public final class LsResBystander implements NetworkPartner.Bystander {
    public static final LsResBystander LIZ = new LsResBystander();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        String string;
        HashMap map;
        C1186030gy9.LIZ(new AwS562S0100000_18(request, 346));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_image_preload_enable", true) == 1 && c0x52 != null && c0x52.LIZJ() && !request.isResponseStreaming()) {
            C1336370ksd c1336370ksd = C1336370ksd.LIZ;
            if (C1336370ksd.LIZIZ(request.getPath(), null) != null) {
                Object obj = c0x52.LIZ.LJ;
                if (obj instanceof TypedByteArray) {
                    C1186030gy9.LIZ(new AwS562S0100000_18(request, 347));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AbsTypedOutput absTypedOutput = (AbsTypedOutput) obj;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            absTypedOutput.writeTo(byteArrayOutputStream);
                            string = byteArrayOutputStream.toString();
                            try {
                                byteArrayOutputStream.close();
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th2) {
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            try {
                                byteArrayOutputStream.close();
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                C189200o6.m2constructorimpl(new C098200Yq(th3));
                            }
                            string = null;
                        }
                        try {
                            Gson gsonLIZ = C2365509Or.LIZ();
                            C13JX c13jx = KTypeProjection.LIZJ;
                            C13JW c13jwLJII = C13LE.LJII(String.class);
                            c13jx.getClass();
                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLIZ, string, C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class)))));
                            if (!(objFromJson instanceof HashMap)) {
                                objFromJson = null;
                            }
                            map = (HashMap) objFromJson;
                        } catch (s e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            map = null;
                        }
                        String path = request.getPath();
                        C1186030gy9.LIZ(new AwS87S1000000_2(path, 15));
                        try {
                            LsResourcePreloadConfigModel lsResourcePreloadConfigModelLIZIZ = C1336370ksd.LIZIZ(path, null);
                            if (lsResourcePreloadConfigModelLIZIZ != null) {
                                C1336370ksd.LIZLLL(lsResourcePreloadConfigModelLIZIZ, map, path, null);
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                        }
                        C1186030gy9.LIZ(new C1172960gd4(System.currentTimeMillis(), jCurrentTimeMillis));
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        try {
                            byteArrayOutputStream.close();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                            throw th5;
                        } finally {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                }
            }
        }
    }
}
