package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C13LP;
import X.C20484615Do;
import X.C21578619ce;
import X.C356901a3;
import X.C499540JiS;
import X.C499550JiT;
import X.C499630Jib;
import X.C499690Jih;
import X.C499700Jii;
import X.C499990JjB;
import X.C5182020e;
import X.InterfaceC781810Ulf;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS105S0400000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewSettingsConfigBridge implements InterfaceC781810Ulf, GenericLifecycleObserver {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final C20484615Do LLILLL;
    public final LifecycleOwner LLILZ;
    public final BasePreviewSettingMainFragmentSheetInitializer LLILZIL;

    @Override // X.InterfaceC781810Ulf
    public final void init() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC781810Ulf
    public final void b42() {
        this.LLILZIL.LJJJIL();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZIL.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILZIL.onDestroy(lifecycleOwner);
    }

    @Override // X.InterfaceC781810Ulf
    public final void onHiddenChanged(boolean z) {
        this.LLILZIL.onHiddenChanged(z);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILZIL.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        this.LLILZIL.onStart(lifecycleOwner);
    }

    @Override // X.InterfaceC781810Ulf
    public final void onViewCreated(View view) {
        C21578619ce c21578619ce = this.LLILZIL.LLILZLL;
        if (c21578619ce == null) {
            if (view != null) {
                c21578619ce = (C21578619ce) view.findViewById(R.id.u3o);
            } else {
                c21578619ce = null;
            }
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLILZIL;
        basePreviewSettingMainFragmentSheetInitializer.LLILZLL = c21578619ce;
        basePreviewSettingMainFragmentSheetInitializer.onViewCreated(view);
        Fragment fragment = this.LL;
        DataChannel dataChannel = this.LLILLJJLI;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        SettingsViewModel settingsViewModel = (SettingsViewModel) new ViewModelProvider(fragment).get(SettingsViewModel.class);
        C499990JjB c499990JjB = new C499990JjB(settingsViewModel);
        c499990JjB.LIZ(R.id.mzl, new AwS373S0200000_7(fragment, this, dataChannel, 54));
        c499990JjB.LIZ(R.id.mzo, new AwS373S0200000_7(fragment, this, dataChannel, 48));
        c499990JjB.LIZ(R.id.mzn, new AwS373S0200000_7(fragment, this, dataChannel, 53));
        c499990JjB.LIZ(R.id.mzp, new AwS105S0400000_7(fragment, this, dataChannel, lifecycleOwner, 0));
        c499990JjB.LIZ(R.id.mzm, new AwS373S0200000_7(fragment, this, dataChannel, 49));
        c499990JjB.LIZ(R.id.mzk, new AwS373S0200000_7(fragment, this, dataChannel, 52));
        C499990JjB.LIZJ(c499990JjB, R.id.mz2, new C499630Jib(this), new C5182020e(dataChannel, 263), 24);
        C499990JjB.LIZIZ(c499990JjB, R.id.mzb, new C499540JiS(this), new AwS551S0100000_7(dataChannel, 624));
        C499990JjB.LIZIZ(c499990JjB, R.id.n0f, new C499690Jih(this), new AwS551S0100000_7(dataChannel, 625));
        C499990JjB.LIZIZ(c499990JjB, R.id.n09, new C499550JiT(this), new AwS551S0100000_7(dataChannel, 626));
        C499990JjB.LIZIZ(c499990JjB, R.id.mzf, new C499700Jii(this), new AwS551S0100000_7(fragment, dataChannel, 630));
        settingsViewModel.LLILZ = true;
        settingsViewModel.LLIZ.setValue(C13LP.LLIIII(settingsViewModel.LLILLL));
        settingsViewModel.vQ2();
    }

    public PreviewSettingsConfigBridge(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c20484615Do;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = new BasePreviewSettingMainFragmentSheetInitializer(fragment, dataChannel, c20484615Do, lifecycleOwner);
    }
}
