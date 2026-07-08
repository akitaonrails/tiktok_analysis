package com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic;

import X.C01GW;
import X.C0CHQ;
import X.C0E48;
import X.C0EFE;
import X.C0EGY;
import X.C19EG;
import X.C2188811AlT;
import X.C361980EHc;
import X.C452501pT;
import X.InterfaceC359850E8x;
import X.InterfaceC362350EIn;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class EffectAnimFuncItemController extends BaseFuncItemGuideController {
    public final C0E48 LLJIJIL;
    public final VideoPublishEditModel LLJILJIL;
    public final C0EGY LLJILJILJ;
    public final Keva LLJILLL;
    public final C01GW LLJJ;

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJ() {
        InterfaceC359850E8x interfaceC359850E8xLIZIZ;
        C361980EHc c361980EHc = (C361980EHc) this.LLJJ.getValue();
        if (c361980EHc == null || (interfaceC359850E8xLIZIZ = LIZIZ()) == null) {
            return;
        }
        interfaceC359850E8xLIZIZ.LIZJ("bottom_item_root_effects", c361980EHc, false);
    }

    public final boolean LJI(InterfaceC359850E8x interfaceC359850E8x) {
        if (interfaceC359850E8x != null && interfaceC359850E8x.LJII("root_item", "bottom_item_root_effects") == -1) {
            return false;
        }
        LIZ();
        C361980EHc c361980EHc = (C361980EHc) this.LLJJ.getValue();
        if (c361980EHc == null) {
            return false;
        }
        c361980EHc.LJIIJJI.put("key_lottie_anim", LIZLLL());
        c361980EHc.LJIIJJI.put("key_view_anim", LIZJ());
        VideoPublishEditModel videoPublishEditModel = this.LLJILJIL;
        if (videoPublishEditModel != null) {
            C0EFE c0efe = C0EFE.LIZ;
            C0E48 c0e48 = this.LLJIJIL;
            c0efe.getClass();
            C0EFE.LIZIZ(videoPublishEditModel, c0e48, false);
        }
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LLJILLL;
        if (keva != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ep_video_anim_guide_show_");
            sbLIZ.append(currentUserID);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        if (interfaceC359850E8x != null) {
            interfaceC359850E8x.LIZJ("bottom_item_root_effects", c361980EHc, true);
        }
        return true;
    }

    public EffectAnimFuncItemController(C19EG c19eg, Lifecycle lifecycle, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        super(c19eg, lifecycle, c0egy, interfaceC362350EIn);
        this.LLJIJIL = c0e48;
        this.LLJILJIL = videoPublishEditModel;
        this.LLJILJILJ = c0egy;
        this.LLJILLL = Keva.getRepo("ep_video_anim_guide_repo");
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1199));
    }
}
