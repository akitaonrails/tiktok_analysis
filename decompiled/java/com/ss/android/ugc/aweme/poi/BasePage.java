package com.ss.android.ugc.aweme.poi;

import X.C01GW;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC1602960roc;
import X.InterfaceC21503819Do;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class BasePage extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiHELIOSQ7LCI2ZjUjIGERKTYpGS40LQ==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 752));

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public /* synthetic */ void Q9(Activity activity) {
    }

    public String SR() {
        return null;
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

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (SR() != null) {
            ((InterfaceC1602960roc) this.LLIZ.getValue()).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (SR() != null) {
            ((InterfaceC1602960roc) this.LLIZ.getValue()).stop();
        }
    }

    @Override // X.InterfaceC21503819Do
    public void tv() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(AFwS256S0000000_18.get$arr$(240));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }
}
