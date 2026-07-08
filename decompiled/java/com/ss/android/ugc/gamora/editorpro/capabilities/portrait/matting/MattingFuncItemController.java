package com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting;

import X.C0CHQ;
import X.C0E0S;
import X.C0EGY;
import X.C0EJA;
import X.C19EG;
import X.C2188811AlT;
import X.C355090Dw3;
import X.C357540E0a;
import X.C361970EHb;
import X.C361980EHc;
import X.InterfaceC359850E8x;
import X.InterfaceC362350EIn;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes6.dex */
public final class MattingFuncItemController extends BaseFuncItemGuideController {
    public final C19EG LLJIJIL;
    public NLETrackSlot LLJILJIL;
    public final VideoPublishEditModel LLJILJILJ;
    public boolean LLJILLL;
    public final C0EGY LLJJ;

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJ() {
        try {
            C361980EHc c361980EHcLIZ = LJI(this.LLJILLL).LIZ();
            InterfaceC359850E8x interfaceC359850E8xLIZIZ = LIZIZ();
            if (interfaceC359850E8xLIZIZ != null) {
                interfaceC359850E8xLIZIZ.LIZJ("bottom_item_edit_cutout", c361980EHcLIZ, false);
            }
            NLETrackSlot nLETrackSlot = this.LLJILJIL;
            if (nLETrackSlot != null) {
                C0E0S c0e0s = C0E0S.LIZ;
                C19EG c19eg = this.LLJIJIL;
                InterfaceC359850E8x interfaceC359850E8xLIZIZ2 = LIZIZ();
                c0e0s.getClass();
                C0E0S.LJFF(c19eg, interfaceC359850E8xLIZIZ2, nLETrackSlot, true);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onGuideAnimEnd =");
            sbLIZ.append(e.getMessage());
            C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJFF() {
        C0E0S c0e0s = C0E0S.LIZ;
        c0e0s.getClass();
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = C0E0S.LJI;
        if (keva != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ep_video_cutout_guide_start_");
            sbLIZ.append(currentUserID);
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
        }
        c0e0s.getClass();
        String currentUserID2 = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        if (keva != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ep_video_cutout_guide_show_");
            sbLIZ2.append(currentUserID2);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        }
    }

    public final C361970EHb LJI(boolean z) {
        String str;
        String str2;
        TuxIconDrawable tuxIconDrawableLJJIJL;
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = this.LLJIJIL.getString(2131834073);
        if (z) {
            str = "bottom_item_edit_cutout";
        } else {
            str = "bottom_item_overlay_edit_cutout";
        }
        c361970EHb.LJ = str;
        if (this.LLJILLL) {
            str2 = "bottom_item_root_edit";
        } else {
            str2 = "bottom_item_overlay_edit_";
        }
        c361970EHb.LJIIIIZZ = str2;
        if (C0EJA.LJI()) {
            tuxIconDrawableLJJIJL = C357540E0a.LJJIL(this.LLJIJIL, R.raw.icon_color_green_screen_fill, true);
        } else {
            tuxIconDrawableLJJIJL = C357540E0a.LJJIJL(R.raw.icon_person_cutout, this.LLJIJIL);
        }
        c361970EHb.LIZJ = tuxIconDrawableLJJIJL;
        return c361970EHb;
    }

    public MattingFuncItemController(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        super(c19eg, lifecycle, c0egy, interfaceC362350EIn);
        this.LLJIJIL = c19eg;
        this.LLJILJIL = null;
        this.LLJILJILJ = videoPublishEditModel;
        this.LLJILLL = false;
        this.LLJJ = c0egy;
    }
}
