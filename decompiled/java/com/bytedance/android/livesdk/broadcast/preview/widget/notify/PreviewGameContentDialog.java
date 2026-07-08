package com.bytedance.android.livesdk.broadcast.preview.widget.notify;

import X.C01GW;
import X.C16F5;
import X.C452501pT;
import X.C500980Jkm;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PreviewGameContentDialog extends BasePreviewDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZisjPSY1MWscOyolISA7Di4+LQYjJzs2JjEIIC4/JyI=";
    public View LL;
    public TuxIconView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public GameLiveConvertInfo LLIZLLLIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(69));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 172));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 171));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_g);
        c500980Jkm.LIZJ = R.style.ai5;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[PHI: r2
      0x0058: PHI (r2v6 android.view.View) = (r2v5 android.view.View), (r2v17 android.view.View) binds: [B:18:0x0045, B:23:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[PHI: r2
      0x0076: PHI (r2v8 android.view.View) = (r2v7 android.view.View), (r2v14 android.view.View) binds: [B:26:0x0063, B:31:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewGameContentDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
