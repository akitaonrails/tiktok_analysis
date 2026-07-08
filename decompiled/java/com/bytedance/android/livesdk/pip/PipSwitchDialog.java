package com.bytedance.android.livesdk.pip;

import X.C0IJT;
import X.C0W78;
import X.C1954807lC;
import X.C20337914i1;
import X.C20744016Fi;
import X.C472950Igf;
import X.C474500IjA;
import X.C497740JfY;
import X.C500950Jkj;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1118490fDD;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PipSwitchDialog extends LiveDialogFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiHELIOSA/LSR9OCw8Zx86OBY7IDswIAElKCM8Lw==";
    public LinearLayout LL;
    public RelativeLayout LLILLJJLI;
    public C20744016Fi LLILLL;
    public RelativeLayout LLILZ;
    public C20744016Fi LLILZIL;
    public RelativeLayout LLILZLL;
    public C20744016Fi LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C20744016Fi MR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bav) : null;
            this.LLILZIL = (C20744016Fi) viewFindViewById;
        }
        return (C20744016Fi) viewFindViewById;
    }

    public final C20744016Fi NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pb8) : null;
            this.LLIZ = (C20744016Fi) viewFindViewById;
        }
        return (C20744016Fi) viewFindViewById;
    }

    public final RelativeLayout OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qhw) : null;
            this.LLILLJJLI = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final C20744016Fi PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qhx) : null;
            this.LLILLL = (C20744016Fi) viewFindViewById;
        }
        return (C20744016Fi) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC1118490fDD genLandscapeDialogProxy() {
        return new C500950Jkj(R.layout.hgf);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.pip.PipSwitchDialog.RR():void");
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
        int i3 = -1;
        if (zLJIL) {
            iLIZIZ = -1;
            if (zLJIL) {
                i3 = -2;
            } else if (zLJIL) {
                throw new C1954807lC();
            }
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(490.0f);
        }
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hgf);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = i2;
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = i3;
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
        this.LLIZ = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.d5;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_background_player_switch");
        c474500IjALIZ.LJIL();
        if (Intrinsics.LJFF(view, OR())) {
            InterfaceC1106030et7.c5.LJFF(bool);
            InterfaceC1106030et7.e5.LJFF(bool);
            if (!C472950Igf.LIZ(getContext())) {
                Context context = getContext();
                if (Build.VERSION.SDK_INT >= 28) {
                    C0W78.LJIIIIZZ(context, "android.settings.PICTURE_IN_PICTURE_SETTINGS");
                } else {
                    C0W78.LJII(context);
                }
                dismissAllowingStateLoss();
            }
            c474500IjALIZ.LJJII("pip", "select_type");
        } else {
            View viewFindViewById = this.LLILZ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.bal);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZ = (RelativeLayout) viewFindViewById;
            }
            if (Intrinsics.LJFF(view, viewFindViewById)) {
                InterfaceC1106030et7.c5.LJFF(Boolean.FALSE);
                InterfaceC1106030et7.e5.LJFF(bool);
                c474500IjALIZ.LJJII("audio", "select_type");
            } else {
                View view3 = this.LLILZLL;
                if (view3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById2 = view4.findViewById(R.id.pb6);
                    }
                    this.LLILZLL = (RelativeLayout) viewFindViewById2;
                    view3 = viewFindViewById2;
                }
                if (Intrinsics.LJFF(view, view3)) {
                    C20337914i1<Boolean> c20337914i12 = InterfaceC1106030et7.c5;
                    Boolean bool2 = Boolean.FALSE;
                    c20337914i12.LJFF(bool2);
                    InterfaceC1106030et7.e5.LJFF(bool2);
                    c474500IjALIZ.LJJII("none", "select_type");
                }
            }
        }
        c474500IjALIZ.LIZ();
        RR();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("enter_from", "unknown");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.S7(OR(), this);
        PR().setClickable(false);
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bal);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (RelativeLayout) viewFindViewById;
        }
        C786410Ut5.S7((RelativeLayout) viewFindViewById, this);
        MR().setClickable(false);
        View viewFindViewById3 = this.LLILZLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.pb6);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZLL = (RelativeLayout) viewFindViewById3;
        }
        C786410Ut5.S7((RelativeLayout) viewFindViewById3, this);
        NR().setClickable(false);
        RR();
        if (!C497740JfY.LJIL()) {
            View view4 = this.LL;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById2 = view5.findViewById(R.id.nuu);
                }
                this.LL = (LinearLayout) viewFindViewById2;
                view4 = viewFindViewById2;
            }
            view4.setBackgroundResource(R.drawable.dxf);
        }
    }
}
