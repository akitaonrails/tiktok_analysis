package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C1161920gLG;
import X.C16FS;
import X.C16FZ;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C745220TLc;
import X.C745260TLg;
import X.C786410Ut5;
import Y.ACListenerS116S0200000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MuteConfirmDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICHELIOSEgLTE4ICE0Zgg5PSoQJysqID0+DCwtJSA0DjctLiI2JjE=";
    public RecyclerView LL;
    public C16FZ LLILLJJLI;
    public C16FS LLILLL;
    public Function2<? super C745220TLc, ? super C745220TLc, Unit> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 139));
    public C745220TLc LLILZLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(fu() ? R.layout.gai : R.layout.gaj);
        c500980Jkm.LIZJ = fu() ? R.style.ahk : R.style.ahn;
        c500980Jkm.LIZLLL = fu();
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = fu() ? 80 : 8388613;
        c500980Jkm.LJIIIZ = fu() ? -1 : (int) C497740JfY.LIZIZ(375.0f);
        c500980Jkm.LJIIJ = fu() ? -2 : -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    public final boolean fu() {
        return ((Boolean) this.LLILZIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.gci);
            } else {
                viewFindViewById = null;
            }
            this.LL = (RecyclerView) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C745260TLg c745260TLg = new C745260TLg(getContext(), fu());
        View viewFindViewById3 = this.LL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.gci);
            } else {
                viewFindViewById3 = null;
            }
            this.LL = (RecyclerView) viewFindViewById3;
        }
        ((RecyclerView) viewFindViewById3).setAdapter(c745260TLg);
        View viewFindViewById4 = this.LLILLJJLI;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.nnp);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLJJLI = (C16FZ) viewFindViewById4;
        }
        C500260Jjc.LLFFF(viewFindViewById4);
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).OP1(new AwS378S0200000_12(this, c745260TLg, 18));
        View view5 = this.LLILLL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.eow);
            }
            this.LLILLL = (C16FS) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C786410Ut5.h8((C16FS) view5, new ACListenerS116S0200000_12(c745260TLg, this, 13));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndDismissDialogEvent.class, new AwS591S0100000_12(this, 155));
        }
    }
}
