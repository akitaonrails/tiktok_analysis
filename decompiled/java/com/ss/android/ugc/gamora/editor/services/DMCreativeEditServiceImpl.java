package com.ss.android.ugc.gamora.editor.services;

import X.C0LAB;
import X.C1402610mbT;
import X.C1408780mlQ;
import X.C1418900n1k;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C548590LfN;
import X.C573570MeZ;
import X.InterfaceC1444170ngV;
import X.InterfaceC1446740nke;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class DMCreativeEditServiceImpl implements IDMCreativeEditService {
    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LJIIJJI() {
        C1418900n1k.LIZ.getClass();
        return C1418900n1k.LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        return C1428520nHG.LJIILJJIL(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        return C1428520nHG.LJIILIIL(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        return C1428520nHG.LJIJ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        return C1428520nHG.LJIJI(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        C548590LfN.LIZ.getClass();
        return !C548590LfN.LIZIZ().LIZLLL(videoPublishEditModel.creativeModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final Map<String, String> LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZIZ().LIZJ(videoPublishEditModel.creativeModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final void LJFF(VideoPublishEditModel videoPublishEditModel, Map<String, String> map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(map);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJIIJJI(videoPublishEditModel.creativeModel, c0lab);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final void LJIIJ(VideoPublishEditModel videoPublishEditModel, Map<String, String> map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(map);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJIILIIL(videoPublishEditModel.creativeModel, c0lab);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, InterfaceC1444170ngV interfaceC1444170ngV, InterfaceC1446740nke interfaceC1446740nke) {
        return C1428520nHG.LJIJJ(videoPublishEditModel, interfaceC1444170ngV, interfaceC1446740nke);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final void LJIIIIZZ(int i, int i2, VideoPublishEditModel videoPublishEditModel) {
        C1418900n1k.LIZ.getClass();
        C1418900n1k.LIZ(i, i2, videoPublishEditModel, "dm");
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final void LJI(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str) {
        C1418900n1k.LIZ.getClass();
        C1418900n1k.LIZIZ(i, i2, videoPublishEditModel, "dm", str);
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final void LJIIL(VideoPublishEditModel videoPublishEditModel, boolean z, Integer num, Integer num2) {
        C1402610mbT.LJJIIJ(videoPublishEditModel, z, "dm", num, num2, "default");
    }

    @Override // com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService
    public final TuxSheet LIZJ(Context context, VideoPublishEditModel videoPublishEditModel, Function0 function0, Function0 function02, Function2 function2, Function1 function1) {
        boolean z;
        C1418900n1k.LIZ.getClass();
        if (C1428470nHB.LJLIIL(videoPublishEditModel) && (!C573570MeZ.LIZ() || !C1428470nHB.LIZIZ(videoPublishEditModel))) {
            z = true;
        } else {
            z = false;
        }
        return C1418900n1k.LJFF(context, new C1408780mlQ(!z, z), function0, function02, function2, function1);
    }
}
