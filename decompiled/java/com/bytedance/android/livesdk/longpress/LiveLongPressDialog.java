package com.bytedance.android.livesdk.longpress;

import X.C0IJT;
import X.C0IMI;
import X.C474500IjA;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLongPressDialog extends LiveDialogFragment implements DialogInterface {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSJCoiLj8hLTY/ZwM6PiAAJiE0GDcpOjwXISQgJig=";
    public LinearLayout LL;
    public ConstraintLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public boolean LLILZ;
    public IHostLongPressCallback LLILZIL;
    public Room LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public ShareFromInfo LLJ;
    public String LLJI;
    public final AwS586S0100000_7 LLJIJIL = new AwS586S0100000_7(this, 157);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8d);
        c500980Jkm.LIZJ = R.style.ajl;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            try {
                ((Vibrator) C786410Ut5.H2(context, "vibrator")).vibrate(15L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Room room = this.LLILZLL;
        if (room != null) {
            String str = this.LLIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LLIZLLLIL;
            if (str3 != null) {
                str2 = str3;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0IMI.LIZ(linkedHashMap, room, str, str2, "long_press");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_report_icon_show");
            c474500IjALIZ.LJJII("long_press", "request_page");
            c474500IjALIZ.LJJII("long_press", "report_type");
            c474500IjALIZ.LJJII("long_press", "show_type");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(linkedHashMap);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.pc8);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS142S0100000_7(this.LLJIJIL, 80));
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.fy3);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (ConstraintLayout) viewFindViewById3;
        }
        C786410Ut5.Y7((ConstraintLayout) viewFindViewById3, new ACListenerS142S0100000_7(this.LLJIJIL, 80));
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.t8y);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (LinearLayout) viewFindViewById4;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById4, new ACListenerS142S0100000_7(this.LLJIJIL, 80));
        if (this.LLILZ) {
            View view5 = this.LL;
            if (view5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById2 = view6.findViewById(R.id.pc8);
                }
                this.LL = (LinearLayout) viewFindViewById2;
                view5 = viewFindViewById2;
            }
            C786410Ut5.LJZL(8, (LinearLayout) view5);
        }
    }
}
