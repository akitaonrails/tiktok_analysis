package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0IJT;
import X.C1143920fsE;
import X.C1324720kZq;
import X.C474500IjA;
import X.C500980Jkm;
import X.C930940aKi;
import X.InterfaceC978780bZs;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class CppUnlockGuideDialogV2 extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZikpPyo/PTViCj8jHSsgJiw4DzAlLSoXISQgJigFeg==";
    public String LLILLJJLI;
    public Function1<? super C474500IjA, C474500IjA> LLILLL;
    public WeakReference<InterfaceC978780bZs> LLILZIL;
    public String LL = "this feature";
    public boolean LLILZ = true;

    static {
        new Object() { // from class: X.0TSL
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5d);
        c500980Jkm.LIZJ = this.LLILZ ? R.style.ai7 : R.style.ai6;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialogV2.onViewCreated(android.view.View, android.os.Bundle):void");
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
        Function1<? super C474500IjA, C474500IjA> function1 = this.LLILLL;
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

    public static void MR(C1324720kZq c1324720kZq, String str, String str2) {
        C1143920fsE c1143920fsE = new C1143920fsE();
        if (c1324720kZq != null) {
            c1143920fsE.LIZJ = str;
            c1143920fsE.LIZ = c1324720kZq;
            c1143920fsE.LIZIZ = str2;
            c1143920fsE.LJI = 1;
            c1143920fsE.LJFF = true;
            c1143920fsE.LIZLLL();
        }
        c1143920fsE.LJFF();
    }
}
