package com.ss.android.ugc.aweme.challenge.ui;

import X.C786410Ut5;
import X.InterfaceC19369110q9;
import X.ProgressDialogC1397770mTf;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseDetailFragment extends AbstractDetailFragment implements WeakHandler.IHandler {
    public List<Integer> mFragmentTypes;
    public ProgressDialogC1397770mTf mLoadingDialog;
    public WeakHandler mWeakHandler = new WeakHandler(this);

    public String getLabel() {
        return "";
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onPreVideoRecord(Intent intent) {
    }

    private void dismissProgressDialog() {
        ProgressDialogC1397770mTf progressDialogC1397770mTf = this.mLoadingDialog;
        if (progressDialogC1397770mTf != null && progressDialogC1397770mTf.isShowing()) {
            C786410Ut5.LJIILL(this.mLoadingDialog);
        }
        this.mLoadingDialog = null;
    }

    public void hideStartRecord() {
        InterfaceC19369110q9 interfaceC19369110q9 = this.mAnimator;
        if (interfaceC19369110q9 != null) {
            interfaceC19369110q9.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dismissProgressDialog();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mWeakHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
