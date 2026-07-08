package com.ss.android.ugc.aweme.shortvideo.record;

import X.C1661490tL1;
import X.C1DKV;
import X.C1DKZ;
import X.C1DMJ;
import X.C2185991Agv;
import X.C2188811AlT;
import X.C2254221DKy;
import X.C579670MoP;
import X.InterfaceC2253521DIg;
import X.InterfaceC2253801DJi;
import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class k2 implements C1DKV {
    public final Context LIZ;
    public final CameraComponentModel LIZIZ;
    public final Function0<Workspace> LIZJ;
    public long LIZLLL;
    public C1661490tL1 LJ = new C1661490tL1();
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C579670MoP LJIIIZ;
    public final v1 LJIIJ;
    public final C2254221DKy LJIIJJI;
    public Pair<Integer, Integer> LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public Function0<Boolean> LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public Function0<? extends List<? extends C2185991Agv>> LJJIFFI;
    public Function0<Boolean> LJJII;
    public Function0<Boolean> LJJIII;

    @Override // X.C1DKV
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.C1DKV
    public final boolean LJII() {
        return false;
    }

    @Override // X.C1DKV
    public final boolean LJIILJJIL() {
        return false;
    }

    @Override // X.C1DKV
    public final int LJIJ() {
        return 0;
    }

    @Override // X.C1DKV
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.C1DKV
    public final boolean LJJ() {
        return false;
    }

    @Override // X.C1DKV
    public final boolean LJJIFFI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.LJFF(this.LIZ, k2Var.LIZ) && Intrinsics.LJFF(this.LIZIZ, k2Var.LIZIZ) && Intrinsics.LJFF(this.LIZJ, k2Var.LIZJ);
    }

    @Override // X.C1DKV
    public final int getRotation() {
        return 0;
    }

    @Override // X.C1DKV
    public final /* bridge */ /* synthetic */ SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecorderContext(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cameraComponentModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", workspaceAllocator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1DKV
    public final boolean LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.C1DKV
    public final boolean LIZIZ() {
        return this.LJII;
    }

    @Override // X.C1DKV
    public final boolean LIZLLL() {
        return this.LJIILLIIL;
    }

    @Override // X.C1DKV
    public final boolean LJ() {
        return this.LJIL;
    }

    @Override // X.C1DKV
    public final Function0<List<C2185991Agv>> LJFF() {
        return this.LJJIFFI;
    }

    @Override // X.C1DKV
    public final boolean LJI() {
        return this.LJIILL;
    }

    @Override // X.C1DKV
    public final int LJIIIIZZ() {
        return this.LJIJ;
    }

    @Override // X.C1DKV
    public final Function0<Boolean> LJIIIZ() {
        return this.LJJII;
    }

    @Override // X.C1DKV
    public final C1DMJ LJIIJ() {
        return this.LJIIIZ;
    }

    @Override // X.C1DKV
    public final boolean LJIIJJI() {
        return this.LJI;
    }

    @Override // X.C1DKV
    public final boolean LJIIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C1DKV
    public final boolean LJIILIIL() {
        return this.LJJI;
    }

    @Override // X.C1DKV
    public final boolean LJIILL() {
        return this.LJJ;
    }

    @Override // X.C1DKV
    public final /* bridge */ /* synthetic */ C1DKZ LJIILLIIL() {
        return this.LJIIJJI;
    }

    @Override // X.C1DKV
    public final /* bridge */ /* synthetic */ InterfaceC2253521DIg LJIIZILJ() {
        return this.LJ;
    }

    @Override // X.C1DKV
    public final boolean LJIJI() {
        return this.LJIJJLI;
    }

    @Override // X.C1DKV
    public final boolean LJIJJLI() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1DKV
    public final boolean LJIL() {
        return this.LJIJJ;
    }

    @Override // X.C1DKV
    public final long LJJI() {
        return this.LIZLLL;
    }

    @Override // X.C1DKV
    public final boolean LJJII() {
        return this.LJIILJJIL;
    }

    @Override // X.C1DKV
    public final /* bridge */ /* synthetic */ InterfaceC2253801DJi LJJIII() {
        return this.LJIIJ;
    }

    @Override // X.C1DKV
    public final Function0<Boolean> LJJIIJ() {
        return this.LJIJI;
    }

    @Override // X.C1DKV
    public final Pair<Integer, Integer> LJJIIJZLJL() {
        return this.LJIIL;
    }

    @Override // X.C1DKV
    public final Function0<Boolean> LJJIIZ() {
        return this.LJJIII;
    }

    @Override // X.C1DKV
    public final boolean LJJIIZI() {
        return this.LJFF;
    }

    public k2(Context context, CameraComponentModel cameraComponentModel, Function0<Workspace> function0) {
        this.LIZ = context;
        this.LIZIZ = cameraComponentModel;
        this.LIZJ = function0;
        Workspace workspace = cameraComponentModel.mWorkspace;
        this.LJIIIZ = new C579670MoP(workspace == null ? function0.invoke() : workspace);
        this.LJIIJ = new v1(cameraComponentModel);
        this.LJIIJJI = new C2254221DKy(cameraComponentModel);
        this.LJIIL = new Pair<>(Integer.valueOf(cameraComponentModel.mVideoWidth), Integer.valueOf(cameraComponentModel.mVideoHeight));
        cameraComponentModel.LJI();
        this.LJIILL = cameraComponentModel.LJIIJ();
        this.LJIILLIIL = cameraComponentModel.enableRecordingMp4;
        this.LJIJ = 5;
        this.LJIJI = AFwS214S0000000_25.get$arr$(149);
        this.LJJIFFI = AFwS214S0000000_25.get$arr$(150);
        this.LJJII = AFwS214S0000000_25.get$arr$(151);
        this.LJJIII = AFwS214S0000000_25.get$arr$(152);
    }
}
