package com.bytedance.android.livesdk.share;

import X.C1094360eaI;
import X.C1117580fBk;
import X.C1148060fyu;
import X.C1148070fyv;
import X.C1161920gLG;
import X.C16F5;
import X.C1954807lC;
import X.C20743716Ff;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C980510bcf;
import X.C980550bcj;
import X.EnumC1094410eaN;
import X.EnumC1117590fBl;
import X.EnumC980460bca;
import X.InterfaceC1118490fDD;
import Y.ACListenerS152S0100000_17;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ShareSettingsDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSHELIOSR9Oy0tOyp9Gy0tOyoALTE4ICE0OwElKCM8Lw==";
    public ConstraintLayout LL;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public C16F5 LLILZ;
    public C20743716Ff LLILZIL;
    public FrameLayout LLILZLL;
    public ConstraintLayout LLIZ;
    public C20743716Ff LLIZLLLIL;
    public FrameLayout LLJ;
    public ConstraintLayout LLJI;
    public C20743716Ff LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public C20743716Ff LLJILJILJ;
    public FrameLayout LLJILLL;
    public ConstraintLayout LLJJ;
    public C20743716Ff LLJJI;
    public ConstraintLayout LLJJIII;
    public C20743716Ff LLJJIJI;
    public FrameLayout LLJJIJIIJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public static EnumC980460bca NR() {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C980550bcj.class);
        EnumC980460bca.Companion.getClass();
        return C980510bcf.LIZ(l);
    }

    public static EnumC1117590fBl OR() {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148060fyu.class);
        EnumC1117590fBl.Companion.getClass();
        return C1117580fBk.LIZ(l);
    }

    public final C20743716Ff MR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.anc) : null;
            this.LLJJI = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff PR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hnq) : null;
            this.LLJILJILJ = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff RR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ixn) : null;
            this.LLJIJIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final ConstraintLayout SR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iyb) : null;
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C20743716Ff UR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wtw) : null;
            this.LLILZIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff VR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wvb) : null;
            this.LLIZLLLIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final void WR() {
        C1094360eaI c1094360eaIHP;
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            ConstraintLayout constraintLayout = this.LLJJIII;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
                return;
            }
            return;
        }
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148070fyv.class);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_HIDE.getValue()) {
                ConstraintLayout constraintLayout2 = this.LLJJIII;
                if (constraintLayout2 != null) {
                    C786410Ut5.LL(0, constraintLayout2);
                }
                C20743716Ff c20743716Ff = this.LLJJIJI;
                if (c20743716Ff != null) {
                    c20743716Ff.setChecked(jLongValue == EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_ON.getValue());
                }
            } else {
                IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
                if (iUserLevelService != null && (c1094360eaIHP = iUserLevelService.HP()) != null) {
                    ConstraintLayout constraintLayout3 = this.LLJJIII;
                    if (constraintLayout3 != null) {
                        C786410Ut5.LL(0, constraintLayout3);
                    }
                    int i = c1094360eaIHP.LJFF;
                    C20743716Ff c20743716Ff2 = this.LLJJIJI;
                    if (c20743716Ff2 != null) {
                        c20743716Ff2.setChecked(i != 2);
                    }
                }
            }
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS152S0100000_17(this, 71));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.hlv);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i;
        int i2;
        int iLIZIZ;
        boolean zLJIL = C497740JfY.LJIL();
        if (zLJIL) {
            i = R.style.uh;
            i2 = 80;
        } else {
            i = R.style.ui;
            i2 = 5;
        }
        int iLIZIZ2 = -1;
        if (zLJIL) {
            iLIZIZ = -1;
            if (zLJIL) {
                iLIZIZ2 = (int) C497740JfY.LIZIZ(359.0f);
            } else if (zLJIL) {
                throw new C1954807lC();
            }
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(490.0f);
        }
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hlv);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = i2;
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = iLIZIZ2;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        if (!SettingsManager.INSTANCE.getBooleanValue("live_match_ai_commentary_audience_enable", false) || C500260Jjc.LJIIZILJ(this.dataChannel)) {
            return;
        }
        ((IMatchAICommentaryService) C1161920gLG.LIZJ(IMatchAICommentaryService.class)).O92(this.dataChannel, "close");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0424  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instruction units count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.share.ShareSettingsDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
