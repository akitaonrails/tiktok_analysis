package com.ss.android.ugc.awemepushlib.interaction;

import X.C2188811AlT;
import X.C281990B3l;
import X.C818260W8a;
import X.C818310W8f;
import X.EnumC809870Vpp;
import X.EnumC818290W8d;
import X.EnumC818320W8g;
import com.ss.android.legoapi.IInitPushTaskApi;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class InitPushTaskImpl implements IInitPushTaskApi {
    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIILL() {
        C818310W8f.LIZ.LIZJ.LJ();
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LIZJ() {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZIZ.LJ();
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIJ() {
        if (C281990B3l.LIZ()) {
            C818260W8a.LIZ.LJFF();
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIILJJIL() {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZ.LJ();
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LIZ(long j) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZ.LIZLLL(j);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LIZLLL(String str) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZIZ.LIZJ(str, "", false);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJFF(String str) {
        C281990B3l.LIZ();
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJI(String str) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZ.LIZJ(str, "", false);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIIIZZ(String str) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZIZ.LIZ(str, true);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIIZ(String str) {
        C818260W8a c818260W8a = C818260W8a.LIZ;
        C818260W8a.LJI(str, null, EnumC818290W8d.INFO);
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIJJI(String str) {
        C281990B3l.LIZ();
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIL(String str) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZ.LIZ(str, true);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIILIIL(long j) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZIZ.LIZLLL(j);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIILLIIL(String str) {
        if (C281990B3l.LIZ() && !a0.LJJJIL(str)) {
            C818260W8a c818260W8a = C818260W8a.LIZ;
            EnumC818320W8g enumC818320W8gLJIIIZ = C818260W8a.LJIIIZ(str);
            synchronized (c818260W8a) {
                if (enumC818320W8gLJIIIZ != null) {
                    if (!((Set) C818260W8a.LJIIIZ.getValue()).contains(enumC818320W8gLJIIIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Step ");
                        sbLIZ.append(enumC818320W8gLJIIIZ);
                        sbLIZ.append(" is not a core init step");
                        C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ), EnumC809870Vpp.INIT, EnumC818290W8d.WARNING);
                        return;
                    }
                    if (!C818260W8a.LJFF.add(enumC818320W8gLJIIIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Step ");
                        sbLIZ2.append(enumC818320W8gLJIIIZ);
                        sbLIZ2.append(" already recorded, possible duplicate call");
                        C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ2), EnumC809870Vpp.INIT, EnumC818290W8d.WARNING);
                        return;
                    }
                    if (C818260W8a.LJ == 0) {
                        C818260W8a.LJ = System.currentTimeMillis();
                        c818260W8a.LJII();
                        c818260W8a.LJIIIIZZ();
                    }
                    c818260W8a.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("coreInitStepFinished() finished, step: ");
                    sbLIZ3.append(enumC818320W8gLJIIIZ);
                    C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ3), EnumC809870Vpp.INIT, EnumC818290W8d.INFO);
                }
            }
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIIZILJ(String str) {
        if (C281990B3l.LIZ()) {
            C818260W8a c818260W8a = C818260W8a.LIZ;
            EnumC818320W8g enumC818320W8gLJIIIZ = C818260W8a.LJIIIZ(str);
            synchronized (c818260W8a) {
                if (enumC818320W8gLJIIIZ != null) {
                    if (!((Set) C818260W8a.LJIIJ.getValue()).contains(enumC818320W8gLJIIIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Step ");
                        sbLIZ.append(enumC818320W8gLJIIIZ);
                        sbLIZ.append(" is not a core update step");
                        C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ), EnumC809870Vpp.UPDATE, EnumC818290W8d.WARNING);
                        return;
                    }
                    if (!C818260W8a.LJI.add(enumC818320W8gLJIIIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Step ");
                        sbLIZ2.append(enumC818320W8gLJIIIZ);
                        sbLIZ2.append(" already recorded, possible duplicate call");
                        C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ2), EnumC809870Vpp.UPDATE, EnumC818290W8d.WARNING);
                        return;
                    }
                    c818260W8a.LIZIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("coreUpdateStepFinished() finished, step: ");
                    sbLIZ3.append(enumC818320W8gLJIIIZ);
                    C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ3), EnumC809870Vpp.UPDATE, EnumC818290W8d.INFO);
                }
            }
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LIZIZ(String str, Throwable th) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZ.LJFF(str, th);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", t.msg: ");
            sbLIZ.append(th.getMessage());
            C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ), EnumC809870Vpp.INIT, EnumC818290W8d.ERROR);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJ(String str, boolean z) {
        C818310W8f.LIZ.LIZJ.LIZ(str, z);
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJII(String str, Throwable th) {
        if (C281990B3l.LIZ()) {
            C818310W8f.LIZ.LIZIZ.LJFF(str, th);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", t.msg: ");
            sbLIZ.append(th.getMessage());
            C818260W8a.LJI(C2188811AlT.LIZIZ(sbLIZ), EnumC809870Vpp.UPDATE, EnumC818290W8d.ERROR);
        }
    }

    @Override // com.ss.android.legoapi.IInitPushTaskApi
    public final void LJIJ(String str, String str2, boolean z) {
        C818310W8f.LIZ.LIZJ.LIZJ(str, str2, z);
    }
}
