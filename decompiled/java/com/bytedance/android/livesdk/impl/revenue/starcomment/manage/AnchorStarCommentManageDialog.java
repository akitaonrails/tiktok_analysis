package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.AbstractC21673619ry;
import X.C1548820qPI;
import X.C16F5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786220Usm;
import X.C786410Ut5;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.CancelStarCommentAdministratorEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorStarCommentManageDialog extends StarCommentManageDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2ZjY4KDHELIOS0wJyghLCEnZigtJy40LWsNJyw7JzcfPS4hCyohJCo9PAgtJy40LQElKCM8Lw==";
    public ConstraintLayout LLILZIL;
    public C16F5 LLILZLL;
    public LiveIconView LLIZ;
    public final C786220Usm LLIZLLLIL = new C786220Usm(this, 2);

    public final C16F5 PR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sd2) : null;
            this.LLILZLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LiveIconView RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uuu) : null;
            this.LLIZ = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            C1548820qPI.LJIIIIZZ("star_comment_setting_event", this.LLIZLLLIL);
        }
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void OR(boolean z) {
        AbstractC21673619ry adapter = NR().getAdapter();
        if (adapter != null && adapter.getItemCount() == 0) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILZIL;
        Object objGg0 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.uo2);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (ConstraintLayout) viewFindViewById;
        }
        C786410Ut5.LL(8, (ConstraintLayout) viewFindViewById);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                objGg0 = dataChannel2.gg0(LiveModeChannel.class);
            }
            if (objGg0 != LiveMode.LIVE_STUDIO) {
                C786410Ut5.LLJJJJ(PR(), 0);
                if (!C497740JfY.LJJ()) {
                    PR().setText(C497740JfY.LJIJI(2131844118));
                } else {
                    PR().setText(C497740JfY.LJIJI(2131844117));
                }
                C786410Ut5.LLJJIJIL(RR(), 0);
                C786410Ut5.g8(RR(), new ViewOnClickListenerC751210TdP(new ACListenerS147S0100000_12(this, 30)));
                C1548820qPI.LIZLLL("star_comment_setting_event", this.LLIZLLLIL);
                return;
            }
        }
        C786410Ut5.LLJJJJ(PR(), 8);
        C786410Ut5.LLJJIJIL(RR(), 8);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.BQ2(this, CancelStarCommentAdministratorEvent.class, new AwS591S0100000_12(this, 40));
    }
}
