package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C1143780fs0;
import X.C16FS;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC978780bZs;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class CppUnlockGuideDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hHELIOSLTMlLDh9PywoLionZikpPyo/PTViCj8jHSsgJiw4DzAlLSoXISQgJig=";
    public Function1<? super C474500IjA, C474500IjA> LLILLJJLI;
    public WeakReference<InterfaceC978780bZs> LLILZ;
    public String LL = "this feature";
    public boolean LLILLL = true;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5b);
        c500980Jkm.LIZJ = this.LLILLL ? R.style.ai7 : R.style.ai6;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        InterfaceC978780bZs interfaceC978780bZs;
        super.onViewCreated(view, bundle);
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.jzi), new ACListenerS147S0100000_12(this, 147));
        ((TextView) view.findViewById(R.id.title)).setText(C497740JfY.LJIJJ(2131841291, this.LL));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 148), view.findViewById(R.id.view_outter));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.cus), new ACListenerS147S0100000_12(this, 149));
        View view2 = getView();
        if (view2 != null) {
            viewFindViewById = view2.findViewById(R.id.ft6);
        } else {
            viewFindViewById = null;
        }
        C1143680frq.LJI(viewFindViewById, C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "cpp_unlock_guide_dialog_picture.png"), null, true);
        WeakReference<InterfaceC978780bZs> weakReference = this.LLILZ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        Long lValueOf;
        Long lValueOf2;
        LiveMode streamType;
        super.show(fragmentManager, str);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        String str2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getId());
        } else {
            lValueOf2 = null;
        }
        Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            str2 = streamType.logStreamingType;
        }
        Function1<? super C474500IjA, C474500IjA> function1 = this.LLILLJJLI;
        if (function1 != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cpp_gray_out_pop_up_show");
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            c474500IjALIZ.LJJII(lValueOf2, "room_id");
            c474500IjALIZ.LJJII(str2, "live_type");
            C474500IjA c474500IjAInvoke = function1.invoke(c474500IjALIZ);
            if (c474500IjAInvoke != null) {
                c474500IjAInvoke.LIZ();
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
