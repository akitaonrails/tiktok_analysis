package com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim;

import X.C0CHQ;
import X.C0EGY;
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
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes6.dex */
public final class MainSmartTrimFuncItemController extends BaseFuncItemGuideController {
    public final C19EG LLJIJIL;
    public final C0EGY LLJILJIL;

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C361970EHb LJI() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = this.LLJIJIL.getString(2131848555);
        c361970EHb.LJ = "bottom_item_root_smart_trim";
        c361970EHb.LIZJ = C357540E0a.LJJIJL(R.raw.icon_split_half_star_fill, this.LLJIJIL);
        return c361970EHb;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController
    public final void LJ() {
        C361980EHc c361980EHcLIZ = LJI().LIZ();
        InterfaceC359850E8x interfaceC359850E8xLIZIZ = LIZIZ();
        if (interfaceC359850E8xLIZIZ != null) {
            interfaceC359850E8xLIZIZ.LIZJ("bottom_item_root_smart_trim", c361980EHcLIZ, false);
        }
    }

    public final boolean LJII() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LLILZIL;
        if (keva == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_main_smart_trim_guide_show_");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public MainSmartTrimFuncItemController(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        super(c19eg, lifecycle, c0egy, interfaceC362350EIn);
        this.LLJIJIL = c19eg;
        this.LLJILJIL = c0egy;
    }
}
