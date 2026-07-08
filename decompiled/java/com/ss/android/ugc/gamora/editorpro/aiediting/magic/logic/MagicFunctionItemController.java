package com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic;

import X.C01GW;
import X.C0EGY;
import X.C19EG;
import X.C353560Dta;
import X.C361970EHb;
import X.C361980EHc;
import X.C452501pT;
import X.InterfaceC359850E8x;
import X.InterfaceC362350EIn;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class MagicFunctionItemController extends BaseFuncItemGuideController {
    public final C19EG LLJIJIL;
    public final C01GW LLJILJIL;
    public final Keva LLJILJILJ;

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C361970EHb LJI() {
        String string = this.LLJIJIL.getString(2131829754);
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = string;
        c361970EHb.LJ = "bottom_item_root_magic";
        c361970EHb.LIZJ = (Drawable) this.LLJILJIL.getValue();
        return c361970EHb;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJ() {
        C361980EHc c361980EHcLIZ = LJI().LIZ();
        InterfaceC359850E8x interfaceC359850E8xLIZIZ = LIZIZ();
        if (interfaceC359850E8xLIZIZ != null) {
            interfaceC359850E8xLIZIZ.LIZJ("bottom_item_root_magic", c361980EHcLIZ, false);
        }
    }

    public final void LJII(InterfaceC359850E8x interfaceC359850E8x, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        EditorProSchemeModel editorProSchemeModel;
        EPAnchorData ePAnchorData;
        if (interfaceC359850E8x != null && interfaceC359850E8x.LJ("bottom_item_root_magic") != null) {
            if (videoPublishEditModel != null && (editorProSchemeModel = videoPublishEditModel.creativeModel.editorProSchemeModel) != null && (ePAnchorData = editorProSchemeModel.anchorData) != null) {
                str = ePAnchorData.editorProAnchorType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "magic")) {
                return;
            }
            LIZ();
            C361970EHb c361970EHbLJI = LJI();
            c361970EHbLJI.LIZIZ(LIZLLL(), "key_lottie_anim");
            c361970EHbLJI.LIZIZ(LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLJI.LIZ();
            Keva keva = this.LLJILJILJ;
            C353560Dta.LIZ.getClass();
            if (C353560Dta.LJFF()) {
                str2 = "editor_pro_magic_guide_add_tab";
            } else {
                str2 = "editor_pro_magic_guide_init";
            }
            keva.storeBoolean(str2, true);
            interfaceC359850E8x.LIZJ("bottom_item_root_magic", c361980EHcLIZ, true);
        }
    }

    public MagicFunctionItemController(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        super(c19eg, lifecycle, c0egy, interfaceC362350EIn);
        this.LLJIJIL = c19eg;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 347));
        this.LLJILJILJ = Keva.getRepo("magic_guide_repo");
    }
}
