package com.bytedance.android.livesdk.debugtool;

import X.C0TZM;
import X.C11JF;
import X.C465640INu;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS138S0100000_3;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DebugInfoDetailFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LCHELIOSAuPCgnJyogZws2KjArACE1JwEpPS46JAM+KCg+LSs4";
    public View LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public String LLILZIL;
    public C11JF LLILZLL;
    public volatile boolean LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5g);
        c500980Jkm.LIZJ = R.style.f945aho;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJI = 0.0f;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        c500980Jkm.LJIIIZ = zLJJIJIL ? -1 : iLIZIZ;
        if (zLJJIJIL) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZ = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strSubstring;
        super.onViewCreated(view, bundle);
        this.LL = view.findViewById(R.id.lc0);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zf6);
        this.LLILLL = (TextView) view.findViewById(R.id.zfg);
        this.LLILZ = (TextView) view.findViewById(R.id.tv_send_lark);
        String str = this.LLILZIL;
        if (str != null && str.length() > 10000) {
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                String str2 = this.LLILZIL;
                if (str2 != null) {
                    strSubstring = str2.substring(0, 10000);
                } else {
                    strSubstring = null;
                }
                textView.setText(strSubstring);
            }
        } else {
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                textView2.setText(this.LLILZIL);
            }
        }
        View view2 = this.LL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS138S0100000_3(this, 7), view2);
        }
        TextView textView3 = this.LLILLL;
        if (textView3 != null) {
            C786410Ut5.T7(textView3, new ACListenerS138S0100000_3(this, 8));
        }
        TextView textView4 = this.LLILZ;
        if (textView4 != null) {
            C786410Ut5.T7(textView4, new ACListenerS138S0100000_3(this, 9));
        }
    }
}
