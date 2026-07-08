package com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic;

import X.C0CHQ;
import X.C0E48;
import X.C0EGY;
import X.C0EJA;
import X.C19EG;
import X.C2188811AlT;
import X.C357540E0a;
import X.C361970EHb;
import X.C361980EHc;
import X.InterfaceC359850E8x;
import X.InterfaceC362350EIn;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes6.dex */
public final class EditVideoAnimFuncItemController extends BaseFuncItemGuideController {
    public final C19EG LLJIJIL;
    public final VideoPublishEditModel LLJILJIL;
    public final C0E48 LLJILJILJ;
    public final C0EGY LLJILLL;

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C361970EHb LJI() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = this.LLJIJIL.getString(2131833495);
        c361970EHb.LJ = "bottom_item_edit_video_anim";
        c361970EHb.LJIIIIZZ = "bottom_item_root_edit";
        c361970EHb.LIZJ = C357540E0a.LJJIL(this.LLJIJIL, C0EJA.LJI() ? R.raw.icon_color_triple_ellipse : R.raw.icon_color_triple_ellipse_fill, true);
        c361970EHb.LJI = 1000L;
        return c361970EHb;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJ() {
        C361980EHc c361980EHcLIZ = LJI().LIZ();
        InterfaceC359850E8x interfaceC359850E8xLIZIZ = LIZIZ();
        if (interfaceC359850E8xLIZIZ != null) {
            interfaceC359850E8xLIZIZ.LIZJ("bottom_item_edit_video_anim", c361980EHcLIZ, false);
        }
    }

    public final boolean LJII() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LLILZIL;
        if (keva == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_edit_video_anim_guide_show_");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public EditVideoAnimFuncItemController(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, C0E48 c0e48) {
        super(c19eg, lifecycle, c0egy, interfaceC362350EIn);
        this.LLJIJIL = c19eg;
        this.LLJILJIL = videoPublishEditModel;
        this.LLJILJILJ = c0e48;
        this.LLJILLL = c0egy;
    }
}
