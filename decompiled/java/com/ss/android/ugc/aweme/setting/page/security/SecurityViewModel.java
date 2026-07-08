package com.ss.android.ugc.aweme.setting.page.security;

import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.cell.DividerCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SecurityViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData<Boolean> LLILLJJLI;
    public final Boolean LLILLL;
    public final Boolean LLILZ;

    public final List<Class<? extends PowerCell<? extends InterfaceC1891350zJl>>> vQ2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SecurityAlertsCell.class);
        if (Intrinsics.LJFF(this.LLILLJJLI.getValue(), Boolean.TRUE)) {
            arrayList.add(SecurityCheckUpCell.class);
        }
        arrayList.add(SecurityDeviceCell.class);
        if (!this.LLILLL.booleanValue()) {
            arrayList.add(SecurityVerificationCell.class);
            arrayList.add(SecuritySaveInfoCell.class);
        }
        arrayList.add(SecurityGSMACell.class);
        arrayList.add(SecurityIncomeCell.class);
        if (!this.LLILLL.booleanValue()) {
            arrayList.add(SecurityAccountRecoveryCell.class);
        }
        arrayList.add(SecurityPermissionsCell.class);
        if (this.LLILZ.booleanValue()) {
            arrayList.add(SecurityCrossEntityCell.class);
        }
        if (!this.LLILLL.booleanValue()) {
            arrayList.add(SecurityBrowserSettingCell.class);
        }
        arrayList.add(DividerCell.class);
        return arrayList;
    }

    public SecurityViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(bool);
        this.LLILLJJLI = mutableLiveData2;
        this.LLILLL = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF();
        this.LLILZ = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).isCurUserOrgAccount();
    }
}
