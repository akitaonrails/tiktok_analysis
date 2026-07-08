package com.bytedance.android.livesdk.drawerfeed;

import X.C01GW;
import X.C0IJT;
import X.C1161920gLG;
import X.C19EH;
import X.C426750GoL;
import X.C452501pT;
import X.C469460Ib2;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.InterfaceC1916410zyB;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNonPersonalizedDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LDctHELIOSPiohLiApLWEfITMpByA9GCA+OiA9KSklMyo3DCwtJSA0";
    public boolean LL;
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 47));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int i;
        Bundle arguments;
        Bundle arguments2 = getArguments();
        this.LLILLJJLI = arguments2 != null ? arguments2.getBoolean("is_in_sheet") : true;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9z);
        c500980Jkm.LJI = 0.0f;
        if (this.LLILLJJLI && ((Boolean) this.LLILLL.getValue()).booleanValue()) {
            c500980Jkm.LIZJ = R.style.ahb;
            c500980Jkm.LJII = 80;
            c500980Jkm.LJIIIZ = -1;
            c500980Jkm.LJIIJ = -2;
            return c500980Jkm;
        }
        Context context = getContext();
        if (context == null || !C426750GoL.LIZLLL(context)) {
            c500980Jkm.LIZJ = R.style.ahg;
            c500980Jkm.LJII = 8388613;
        } else {
            c500980Jkm.LIZJ = R.style.ahf;
            c500980Jkm.LJII = 8388611;
        }
        Bundle arguments3 = getArguments();
        if ((arguments3 != null && arguments3.getBoolean("is_from_drawer", false)) && (arguments = getArguments()) != null) {
            i = arguments.getInt("drawer_dialog_width", (int) C497740JfY.LIZIZ(375.0f));
            c500980Jkm.LJIIIZ = i;
            c500980Jkm.LJIIJ = -1;
            return c500980Jkm;
        }
        float fLIZIZ = C497740JfY.LIZIZ(375.0f);
        i = (int) fLIZIZ;
        c500980Jkm.LJIIIZ = i;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C469460Ib2.LIZ = "";
        C469460Ib2.LIZIZ = "";
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.LL) {
            C469460Ib2.LJFF(this.dataChannel, "exit");
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0Ib4] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment fragmentDs2;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        IHostPersonalized iHostPersonalized = (IHostPersonalized) C1161920gLG.LIZJ(IHostPersonalized.class);
        if (iHostPersonalized != 0) {
            boolean z = this.LLILLJJLI;
            getActivity();
            fragmentDs2 = iHostPersonalized.ds2(z, new InterfaceC1916410zyB() { // from class: X.0Ib4
                @Override // X.InterfaceC1916410zyB
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1916410zyB
                public final void LIZ() {
                    this.LIZ.dismiss();
                }

                @Override // X.InterfaceC1916410zyB
                public final void LIZLLL() {
                    C469460Ib2.LJFF(this.LIZ.dataChannel, "learn more");
                }

                @Override // X.InterfaceC1916410zyB
                public final void LJ() {
                    LiveNonPersonalizedDialog liveNonPersonalizedDialog = this.LIZ;
                    liveNonPersonalizedDialog.LL = true;
                    C469460Ib2.LJFF(liveNonPersonalizedDialog.dataChannel, "done");
                    this.LIZ.dismiss();
                }

                @Override // X.InterfaceC1916410zyB
                public final void LIZJ(boolean z2) {
                    String str;
                    if (z2) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    C469460Ib2.LJFF(this.LIZ.dataChannel, str);
                }
            });
        } else {
            fragmentDs2 = null;
        }
        if (fragmentDs2 != null) {
            View view2 = fragmentDs2.getView();
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.dz9);
            }
            DataChannel dataChannel = this.dataChannel;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manage_feeds_popup_show");
            c474500IjALIZ.LJJII(C469460Ib2.LIZ, "source");
            c474500IjALIZ.LJJII(C469460Ib2.LIZIZ, "from_page");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            c19ehLJIIJ.LIZIZ(R.id.q_h, fragmentDs2);
            c19ehLJIIJ.LJIIJ();
        }
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.q_h);
        int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
        if (this.LLILLJJLI && ((Boolean) this.LLILLL.getValue()).booleanValue()) {
            float f = iLIZIZ * 1.0f;
            radiusLayout.LIZ(f, f, 0.0f, 0.0f);
        } else {
            float f2 = iLIZIZ * 1.0f;
            radiusLayout.LIZ(f2, 0.0f, f2, 0.0f);
        }
    }
}
