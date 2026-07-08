package com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer;

import X.C1191704lP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubContentFragmentSheetDialog extends LiveSheetFragment implements IFragmentContainerAbility {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2EwJyHELIOSghJiEmIWsqOy40JSAiPSw8JjEtICE2OmsfPC0QJys4LCEnDjctLiI2JjEfISo2PAElKCM8Lw==";
    public String LLJLLL = "";
    public boolean LLJZ;

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.IFragmentContainerAbility
    public final void ow() {
        close(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFragmentContainerAbility.class, null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        int i;
        SheetOptions sheetOptions = new SheetOptions();
        if (this.LLJZ) {
            i = 1;
        } else {
            i = 2;
        }
        sheetOptions.LIZ(i, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            android.os.Bundle r1 = r5.getArguments()
            r4 = 0
            if (r1 == 0) goto L6e
            java.lang.String r0 = "is_super_fans"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L6e
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L13:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L3b
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r1 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r1
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r0 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLI()
            if (r0 == 0) goto L6c
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L6c
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L6c
            webcast.data.SubSplitStatus r0 = r0.subSplitStatus
        L35:
            boolean r0 = r1.pY1(r0)
            if (r0 == 0) goto L3c
        L3b:
            r4 = 1
        L3c:
            r5.LLJZ = r4
            super.onCreate(r6)
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L4f
            java.lang.String r0 = "fragment_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L51
        L4f:
            java.lang.String r0 = ""
        L51:
            r5.LLJLLL = r0
            boolean r0 = r5.LLJZ
            if (r0 == 0) goto L62
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L62
            java.lang.String r0 = "is_super_fan"
            r1.putBoolean(r0, r3)
        L62:
            X.0Q7z r1 = X.C1558360qeg.LJFF(r5, r2)
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.IFragmentContainerAbility> r0 = com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.IFragmentContainerAbility.class
            X.C1558520qew.LJII(r1, r5, r0, r2, r2)
            return
        L6c:
            r0 = r2
            goto L35
        L6e:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.SubContentFragmentSheetDialog.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1191704lP.LIZ(this, this.LLJLLL);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hnb, viewGroup, false);
    }
}
