package com.ss.android.ugc.aweme.feed.assem.base;

import X.C23250099c;
import X.C297270Bkz;
import X.C734760Sry;
import X.C734770Srz;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedRightBtnBaseViewModel<S extends InterfaceC0148002o> extends FeedBaseViewModel<S> {
    public static final int $stable = 8;
    public int businessOriginVisibility;
    public boolean forceHideTextFlag = ComplianceServiceProvider.LJIIJJI().showEngagementCount();
    public final C734760Sry listener = new C734760Sry(this);

    public String getZeroNumReplaceString() {
        return null;
    }

    public abstract void onForceHideTextFlagChange();

    public final int getForceTextVisible() {
        if (this.forceHideTextFlag) {
            return 4;
        }
        return this.businessOriginVisibility;
    }

    public final boolean getForceTextShow() {
        return getForceTextVisible() == 0;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (C297270Bkz.LIZ()) {
            return;
        }
        ComplianceServiceProvider.LJIIJJI().LJIIL(this.listener);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public void onPrepared() {
        super.onPrepared();
        if (C297270Bkz.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C734770Srz(this, null), 3);
        } else {
            ComplianceServiceProvider.LJIIJJI().LJI(this.listener);
        }
    }

    public final boolean getForceHideTextFlag() {
        return this.forceHideTextFlag;
    }

    public final String mapZeroNumToString(String str) {
        String zeroNumReplaceString = getZeroNumReplaceString();
        if (zeroNumReplaceString != null && Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return zeroNumReplaceString;
        }
        return str;
    }

    public final FeedRightBtnBaseViewModel<S> updateOrigin(int i) {
        this.businessOriginVisibility = i;
        return this;
    }
}
