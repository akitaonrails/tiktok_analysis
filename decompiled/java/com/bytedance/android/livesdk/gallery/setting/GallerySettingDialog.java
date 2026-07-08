package com.bytedance.android.livesdk.gallery.setting;

import X.C1117580fBk;
import X.C1148060fyu;
import X.C1161920gLG;
import X.C1954807lC;
import X.C20743716Ff;
import X.C389001fE;
import X.C495520Jby;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.EnumC1117590fBl;
import Y.ACListenerS152S0100000_17;
import Y.ATListenerS450S0100000_17;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class GallerySettingDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQgHELIOSJSohMWs/LDsnISsrZwgyJCkpOzYALTE4ICE0DCwtJSA0";
    public TuxIconView LL;
    public C20743716Ff LLILLJJLI;
    public String LLILLL = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C20743716Ff MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uvv) : null;
            this.LLILLJJLI = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        boolean zLJIL = C497740JfY.LJIL();
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g74);
        c500980Jkm.LIZJ = zLJIL ? R.style.uh : R.style.ui;
        c500980Jkm.LJII = zLJIL ? 80 : 5;
        int i = -1;
        c500980Jkm.LJIIIZ = zLJIL ? -1 : (int) C497740JfY.LIZIZ(490.0f);
        if (zLJIL) {
            i = -2;
        } else if (zLJIL) {
            throw new C1954807lC();
        }
        c500980Jkm.LJIIJ = i;
        c500980Jkm.LJI = 0.5f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C389001fE.LIZ("gift_gallery_setting_close", null, System.currentTimeMillis(), false);
        String str = this.LLILLL;
        if (str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse(new C495520Jby(str).LIZLLL()));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bn2);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS152S0100000_17(this, 104));
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148060fyu.class);
        if (l != null) {
            long jLongValue = l.longValue();
            C20743716Ff c20743716FfMR = MR();
            C1117580fBk c1117580fBk = EnumC1117590fBl.Companion;
            Long lValueOf = Long.valueOf(jLongValue);
            c1117580fBk.getClass();
            c20743716FfMR.setChecked(C1117580fBk.LIZ(lValueOf).isOn());
        }
        MR().setOnTouchListener(new ATListenerS450S0100000_17(this, 9));
    }
}
