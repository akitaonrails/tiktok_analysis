package com.facebook.internal;

import X.C0W7Q;
import X.C0WZX;
import X.C1389600mGU;
import X.C19EG;
import X.C1BI1;
import X.C1BI9;
import X.C1BIE;
import X.C1BJO;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC824980WXw;
import X.InterfaceC2202491BHz;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes35.dex */
public final class FacebookDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZiwiPSohJiQgZwHELIOSkyKyAuJiA4DCwtJSA0DjctLiI2JjE=";
    public WebDialog LL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        super.onResume();
        WebDialog webDialog = this.LL;
        if (webDialog instanceof WebDialog) {
            if (webDialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            webDialog.LJJLJ();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        if ((this.LL instanceof WebDialog) && isResumed()) {
            WebDialog webDialog = this.LL;
            if (webDialog != null) {
                webDialog.LJJLJ();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C19EG activity;
        boolean z;
        WebDialog c1bi1;
        String string;
        Bundle bundle2;
        super.onCreate(bundle);
        if (this.LL == null && (activity = getActivity()) != null) {
            Bundle bundleLJIIIIZZ = C1BIE.LJIIIIZZ(activity.getIntent());
            if (bundleLJIIIIZZ == null) {
                z = false;
            } else {
                z = bundleLJIIIIZZ.getBoolean("is_fallback", false);
            }
            String string2 = null;
            if (!z) {
                if (bundleLJIIIIZZ == null) {
                    string = null;
                    bundle2 = null;
                } else {
                    string = bundleLJIIIIZZ.getString("action");
                    bundle2 = bundleLJIIIIZZ.getBundle("params");
                }
                if (C0W7Q.LJIILL(string)) {
                    activity.finish();
                    return;
                }
                if (string != null) {
                    C1BI9 c1bi9 = new C1BI9(activity, string, bundle2);
                    c1bi9.LIZLLL = new InterfaceC2202491BHz() { // from class: X.1BI7
                        @Override // X.InterfaceC2202491BHz
                        public final void LIZ(Bundle bundle3, C1BJO c1bjo) throws Throwable {
                            this.LIZ.MR(bundle3, c1bjo);
                        }
                    };
                    AccessToken accessToken = c1bi9.LJFF;
                    if (accessToken != null) {
                        Bundle bundle3 = c1bi9.LJ;
                        if (bundle3 != null) {
                            C786410Ut5.LJJJI("app_id", accessToken.applicationId, bundle3);
                        }
                        Bundle bundle4 = c1bi9.LJ;
                        if (bundle4 != null) {
                            AccessToken accessToken2 = c1bi9.LJFF;
                            if (accessToken2 != null) {
                                string2 = accessToken2.token;
                            }
                            C786410Ut5.LJJJI("access_token", string2, bundle4);
                        }
                    } else {
                        Bundle bundle5 = c1bi9.LJ;
                        if (bundle5 != null) {
                            C786410Ut5.LJJJI("app_id", c1bi9.LIZIZ, bundle5);
                        }
                    }
                    Context context = c1bi9.LIZ;
                    if (context != null) {
                        String str = c1bi9.LIZJ;
                        Bundle bundle6 = c1bi9.LJ;
                        InterfaceC2202491BHz interfaceC2202491BHz = c1bi9.LIZLLL;
                        WebDialog.LJJLIIIJLLLLLLLZ(context);
                        c1bi1 = new WebDialog(context, str, bundle6, EnumC824980WXw.FACEBOOK, interfaceC2202491BHz);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (bundleLJIIIIZZ != null) {
                    string2 = bundleLJIIIIZZ.getString("url");
                }
                if (C0W7Q.LJIILL(string2)) {
                    activity.finish();
                    return;
                }
                String strJ4 = C786410Ut5.j4("fb%s://bridge/", Arrays.copyOf(new Object[]{FacebookSdk.LIZLLL()}, 1));
                if (string2 != null) {
                    WebDialog.LJJLIIIJLLLLLLLZ(activity);
                    c1bi1 = new C1BI1(activity, string2, strJ4);
                    c1bi1.LLILLL = new InterfaceC2202491BHz() { // from class: X.1BI6
                        @Override // X.InterfaceC2202491BHz
                        public final void LIZ(Bundle bundle7, C1BJO c1bjo) throws Throwable {
                            C19EG activity2 = this.LIZ.getActivity();
                            if (activity2 != null) {
                                Intent intent = new Intent();
                                if (bundle7 == null) {
                                    bundle7 = new Bundle();
                                }
                                intent.putExtras(bundle7);
                                C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWY7mSkI3SA4UB3o89nPsjhGAY7tMk=", new String[]{"019e5"}));
                                activity2.finish();
                            }
                        }
                    };
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.LL = c1bi1;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) throws Throwable {
        View decorView;
        Dialog dialogOnCreateDialog = this.LL;
        if (dialogOnCreateDialog == null) {
            MR(null, null);
            this.mShowsDialog = false;
            dialogOnCreateDialog = super.onCreateDialog(bundle);
        }
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    public final void MR(Bundle bundle, C1BJO c1bjo) throws Throwable {
        int i;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1BIE c1bie = C1BIE.LIZ;
        Intent intentLJ = C1BIE.LJ(activity.getIntent(), bundle, c1bjo);
        if (c1bjo == null) {
            i = -1;
        } else {
            i = 0;
        }
        C2204961BRm.LLJJIJIL(i, intentLJ, activity, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWY7mSkI3SA4UB3o89nPsjhGAY7tMk=", new String[]{"019e5"}));
        activity.finish();
    }
}
