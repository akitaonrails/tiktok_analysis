package com.facebook.login;

import X.C098200Yq;
import X.C0WZX;
import X.C1685300txQ;
import X.C168Q;
import X.C189200o6;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C1BIT;
import X.C1BIW;
import X.C1BJO;
import X.C1BK1;
import X.C21505619Eg;
import X.C2202721BIw;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC824980WXw;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS400S0200000_34;

/* JADX INFO: loaded from: classes35.dex */
public class LoginFragment extends Fragment {
    public static final String _pnsPageId = "KyohZykyKyAuJiA4ZikjLiHELIOSY9ZgkjLiY9DjctLiI2JjE=";
    public String LL;
    public LoginClient.Request LLILLJJLI;
    public LoginClient LLILLL;
    public C19F0<Intent> LLILZ;
    public View LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginClient loginClient = this.LLILLL;
        loginClient.getClass();
        LoginMethodHandler loginMethodHandlerLJI = loginClient.LJI();
        if (loginMethodHandlerLJI != null) {
            loginMethodHandlerLJI.LIZIZ();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View viewFindViewById;
        super.onPause();
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.e91)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LL == null) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        LoginClient loginClient = this.LLILLL;
        loginClient.getClass();
        LoginClient.Request request = this.LLILLJJLI;
        LoginClient.Request request2 = loginClient.pendingRequest;
        if ((request2 == null || loginClient.currentHandler < 0) && request != null) {
            if (request2 != null) {
                throw new C1BJO("Attempted to authorize while a request is pending.");
            }
            AccessToken.Companion.getClass();
            if (!C2202721BIw.LIZJ() || loginClient.LIZJ()) {
                loginClient.pendingRequest = request;
                ArrayList arrayList = new ArrayList();
                C1BIT c1bit = request.loginBehavior;
                EnumC824980WXw enumC824980WXw = request.loginTargetApp;
                EnumC824980WXw enumC824980WXw2 = EnumC824980WXw.INSTAGRAM;
                if (enumC824980WXw != enumC824980WXw2) {
                    if (c1bit.allowsGetTokenAuth()) {
                        arrayList.add(new GetTokenLoginMethodHandler(loginClient));
                    }
                    if (!FacebookSdk.LJIILIIL && c1bit.allowsKatanaAuth()) {
                        arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
                    }
                } else if (!FacebookSdk.LJIILIIL && c1bit.allowsInstagramAppAuth()) {
                    arrayList.add(new InstagramAppLoginMethodHandler(loginClient));
                }
                if (c1bit.allowsCustomTabAuth()) {
                    arrayList.add(new CustomTabLoginMethodHandler(loginClient));
                }
                if (c1bit.allowsWebViewAuth()) {
                    arrayList.add(new WebViewLoginMethodHandler(loginClient));
                }
                if (request.loginTargetApp != enumC824980WXw2 && c1bit.allowsDeviceAuth()) {
                    arrayList.add(new DeviceAuthMethodHandler(loginClient));
                }
                Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                loginClient.handlersToTry = (LoginMethodHandler[]) array;
                loginClient.LJIIJ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        LoginClient loginClient;
        Bundle bundleG3;
        super.onCreate(bundle);
        if (bundle != null && (loginClient = (LoginClient) bundle.getParcelable("loginClient")) != null) {
            if (loginClient.fragment == null) {
                loginClient.fragment = this;
            } else {
                throw new C1BJO("Can't set fragment once it is already set.");
            }
        } else {
            loginClient = new LoginClient(this);
        }
        this.LLILLL = loginClient;
        loginClient.onCompletedListener = new C1BIW(this);
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.LL = C2204961BRm.LJJIJIL(callingActivity, new C0WZX("dzBzEgQ7XM/eWlgqCx6LYVXDpcl0e9WVWkZ1lZfQd0I=", new String[]{"019e5"}));
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleG3 = C786410Ut5.g3(intent, "com.facebook.LoginFragment:Request")) != null) {
            this.LLILLJJLI = (LoginClient.Request) bundleG3.getParcelable("request");
        }
        C21505619Eg c21505619Eg = new C21505619Eg();
        final AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(this, activity, 46);
        this.LLILZ = registerForActivityResult(c21505619Eg, new C168Q() { // from class: X.1BIV
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                awS400S0200000_34.invoke(obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LoginClient loginClient = this.LLILLL;
        loginClient.getClass();
        C786410Ut5.LJJIJL(bundle, "loginClient", loginClient);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LoginClient loginClient = this.LLILLL;
        loginClient.getClass();
        loginClient.LJIIIZ(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.agm, viewGroup, false);
        this.LLILZIL = viewTd.findViewById(R.id.e91);
        LoginClient loginClient = this.LLILLL;
        loginClient.getClass();
        loginClient.backgroundProcessingListener = new C1BK1() { // from class: X.1BIU
            @Override // X.C1BK1
            public final void LIZ() {
                View view = this.LIZ.LLILZIL;
                view.getClass();
                C786410Ut5.LJLLLLLL(8, view);
            }

            @Override // X.C1BK1
            public final void LIZIZ() {
                View view = this.LIZ.LLILZIL;
                view.getClass();
                C786410Ut5.LJLLLLLL(0, view);
            }
        };
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
