package com.bytedance.android.livesdk.hashtag;

import X.C01GW;
import X.C292401Bi;
import X.C500980Jkm;
import X.EnumC754690Tj1;
import X.InterfaceC754470Tif;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.game.gamelist.GameCategoryListFragmentV2;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewHashtagDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSICQ/ITsyL2scOyolISA7AS4gIDEtLgs6KSkjLg==";
    public final C01GW LL = C292401Bi.LIZ(new AwS556S0100000_12(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 301));
    public EnumC754690Tj1 LLILLL;
    public InterfaceC754470Tif LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public LiveMode LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final GameCategoryListFragmentV2 MR() {
        return (GameCategoryListFragmentV2) this.LL.getValue();
    }

    public final PreviewHashtagListFragment NR() {
        return (PreviewHashtagListFragment) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_h);
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJJI = 73;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC754470Tif interfaceC754470Tif = this.LLILZ;
        if (interfaceC754470Tif != null) {
            interfaceC754470Tif.LIZ(NR().LLILZ, MR().LL);
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
