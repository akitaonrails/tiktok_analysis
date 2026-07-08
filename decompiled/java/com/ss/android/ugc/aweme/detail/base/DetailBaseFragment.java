package com.ss.android.ugc.aweme.detail.base;

import X.C19EG;
import X.InterfaceC21503819Do;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DetailBaseFragment extends BaseFragment implements InterfaceC21503819Do, DetailPageNameAbility {
    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    public void SR() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        SR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(AFwS240S0000000_9.get$arr$(69));
        NR(AFwS240S0000000_9.get$arr$(70));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }
}
