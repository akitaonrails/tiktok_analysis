package com.ss.android.ugc.aweme.services;

import X.C01TT;
import X.C0CHQ;
import X.C0FGC;
import X.C1463670oBx;
import X.C1780100wQK;
import X.C1DOU;
import X.C201955140j;
import X.C2188811AlT;
import X.C571670MbV;
import X.EnumC1442010nd1;
import X.EnumC1464030oCX;
import X.InterfaceC574560MgA;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.AwS30S0202000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class SDKServiceImpl implements ISDKService {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private final void splitWithNLE(int i, String str, String str2, String str3, String str4, final ISDKService.SplitCallback splitCallback) {
        final int i2;
        final int i3;
        try {
            C0CHQ.LIZ().LJJIZ();
            C0FGC.LIZ(2);
            final C1463670oBx c1463670oBx = new C1463670oBx(str, EnumC1464030oCX.DUET, EnumC1442010nd1.UPLOAD_OTHER, false, null, 0 == true ? 1 : 0, 1016);
            int i4 = 0;
            C571670MbV.LIZ(new C1DOU(new String[]{str2}), c1463670oBx.LIZLLL().LIZ);
            if (c1463670oBx.prepare() != 0) {
                splitCallback.onFail();
            }
            if (c1463670oBx.getDuration() < i) {
                splitCallback.onFail();
            }
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
            if (videoFileInfo != null) {
                i2 = videoFileInfo.width;
                i3 = videoFileInfo.height;
            } else {
                i2 = 0;
                i3 = 0;
            }
            C1780100wQK c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LJIIJ(i2, i3);
            if (videoFileInfo != null) {
                i4 = videoFileInfo.fps;
            }
            c1780100wQK.LJII(i4);
            c1463670oBx.Qe(str4, str3, c1780100wQK.LIZ(), new InterfaceC574560MgA() { // from class: com.ss.android.ugc.aweme.services.SDKServiceImpl.splitWithNLE.1
                @Override // X.InterfaceC574560MgA
                public void onCompileDone() {
                    C01TT.LIZLLL(new AwS30S0202000_8(splitCallback, i2, i3, c1463670oBx, 0));
                }

                @Override // X.InterfaceC574560MgA
                public void onCompileProgress(float f) {
                    if (splitCallback.checkIsCanceled()) {
                        c1463670oBx.destroy();
                    }
                }

                @Override // X.InterfaceC574560MgA
                public void onCompileError(int i5, int i6, float f, String str5) {
                    C01TT.LIZLLL(new AwS409S0200000_8(splitCallback, c1463670oBx, 16));
                }
            });
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            splitCallback.onFail();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEEditor compile failed, ret = ");
            sbLIZ.append(e.getRetCd());
            sbLIZ.append(", e: ");
            sbLIZ.append(e.getMsgDes());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0053 -> B:22:0x004d). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.services.ISDKService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void split(android.content.Context r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.ss.android.ugc.aweme.services.ISDKService.SplitCallback r14) throws java.lang.Throwable {
        /*
            r7 = this;
            r4 = r12
            boolean r0 = X.C2354709Kn.LIZIZ(r4)
            r6 = r14
            r5 = r13
            if (r0 == 0) goto L5b
            boolean r0 = X.C2354709Kn.LIZIZ(r5)
            if (r0 == 0) goto L5b
            r3 = 0
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r2.setDataSource(r5)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            java.lang.String r0 = X.C20144413ru.LJII(r2)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            java.lang.String r0 = X.C20144413ru.LJFF(r2)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            r6.onSuccess(r1, r0)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L4c
            r2.release()
            return
        L2f:
            r1 = move-exception
            goto L35
        L31:
            r0 = move-exception
            goto L4e
        L33:
            r1 = move-exception
            r2 = r3
        L35:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4c
            X.C2354709Kn.LJIJJLI(r4)     // Catch: java.lang.Throwable -> L4c
            X.C2354709Kn.LJIJJLI(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "SDKServiceImpl.split error"
            X.C201955140j.LJI(r0, r1)     // Catch: java.lang.Throwable -> L4c
            r6.onFail()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4b
            r2.release()
        L4b:
            return
        L4c:
            r0 = move-exception
        L4d:
            r3 = r2
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r0 = move-exception
            r2 = r3
            goto L4d
        L55:
            if (r3 == 0) goto L5a
            r3.release()
        L5a:
            throw r0
        L5b:
            r3 = r11
            r2 = r10
            r1 = r9
            r0 = r7
            r0.splitWithNLE(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.SDKServiceImpl.split(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.services.ISDKService$SplitCallback):void");
    }
}
