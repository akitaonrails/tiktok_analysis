package com.bytedance.ies.foundation.fragment;

import X.C01GW;
import X.C06W2;
import X.C1594270rab;
import X.C19DB;
import X.C19EG;
import X.C1EK9;
import X.C452501pT;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class BaseFragment extends Fragment implements C19DB {
    public static final C1594270rab LLILZ = new Object() { // from class: X.0rab
    };
    public static Class<? extends BaseFragmentViewModel> LLILZIL = BaseFragmentViewModel.class;
    public static final C1EK9 LLILZLL = new C1EK9();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9Lio5JysyPCHELIOSwjJ2E1OiQrJCo9PGsOKDw2DjctLiI2JjE=";
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 69));
    public WeakReference<BaseFragment> LLILLL;
    public long mDestroyTime;

    public void MR() {
    }

    private final BaseFragmentViewModel OR() {
        return (BaseFragmentViewModel) this.LLILLJJLI.getValue();
    }

    public final BaseFragmentViewModel PR() {
        return (BaseFragmentViewModel) ViewModelProviders.of(this).get(LLILZIL);
    }

    @Override // X.C19DB
    /* JADX INFO: renamed from: RR, reason: merged with bridge method [inline-methods] */
    public BaseFragmentViewModel provideBaseViewModel() {
        return OR();
    }

    public final boolean isActive() {
        Lifecycle lifecycle = getLifecycle();
        return (lifecycle != null ? lifecycle.getCurrentState() : null) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mDestroyTime = System.currentTimeMillis();
        super.onDestroy();
        this.LL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LL = false;
    }

    public final boolean isViewValid() {
        return this.LL;
    }

    public void NR(Function1<? super C06W2, Unit> function1) {
        function1.invoke(PR());
    }

    public void activityConfiguration(Function1<? super C06W2, Unit> function1) {
        BaseActivity baseActivity;
        BaseActivityViewModel viewModel;
        C19EG activity = getActivity();
        if ((activity instanceof BaseActivity) && (baseActivity = (BaseActivity) activity) != null && (viewModel = baseActivity.getViewModel()) != null) {
            function1.invoke(viewModel);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        FragmentManager supportFragmentManager;
        super.onAttach(context);
        this.LLILLL = new WeakReference<>(this);
        BaseFragmentViewModel baseFragmentViewModelOR = OR();
        if (!baseFragmentViewModelOR.LLILLL) {
            MR();
            baseFragmentViewModelOR.init();
        }
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && getParentFragment() == null) {
            supportFragmentManager.LJZL(LLILZLL, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = true;
    }
}
