package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.dialog;

import X.C092O;
import X.C0IJT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVerifiedIntroDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nHELIOSISoiZzw2OjMlKiojJDA/Zzk2OiwqICo3ISs4OyB9LCwtJSA0ZhUvOhk2OiwqICo3ASs4OyAXISQgJig=";
    public String LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLLF;
    public String LLLFF = "";
    public PcsVerifiedIntroItem[] LLLFFI = new PcsVerifiedIntroItem[0];
    public String LLLFZ = "";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 1;
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(getString(2131850965), R.style.a7j, new C092O() { // from class: X.0JM0
            @Override // X.C092O
            public final void accept(Object obj) {
                this.LIZ.uS("click");
                this.LIZ.close(1);
            }
        })));
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.draggable = true;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    public final void uS(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_verification_info_page");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(null, "anchor_id");
        c474500IjALIZ.LJJII(this.LLJLLL, "show_entrance");
        c474500IjALIZ.LJJII(String.valueOf(this.LLJZ ? 1 : 0), "has_kyb_verified");
        c474500IjALIZ.LJJII(String.valueOf(this.LLJZIJLIL ? 1 : 0), "has_kyc_verified");
        c474500IjALIZ.LJJII(this.LLL, "previous_page");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.dialog.PcsVerifiedIntroDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g_a, viewGroup, false);
    }
}
