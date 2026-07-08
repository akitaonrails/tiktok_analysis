package com.ss.android.ugc.aweme.account.security;

import X.C0TUG;
import X.C0TVK;
import X.C1235470iFt;
import X.C1559260qg8;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityCheckUpViewModel extends AssemViewModel<C1235470iFt> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0TUG.class, (Class<Object>) "security_check_up_hierarchy_data_key", (String) 13), true);
    public final IAVSettingService LLILLJJLI = (IAVSettingService) ServiceManager.get().getService(IAVSettingService.class);
    public final IBindService LLILLL = (IBindService) ServiceManager.get().getService(IBindService.class);
    public final ICredentialManagerService LLILZ = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
    public C0TVK LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1235470iFt(0);
    }

    public final C0TUG vQ2() {
        return (C0TUG) this.LL.getValue();
    }

    public final String wQ2(long j) {
        String str;
        IAVSettingService iAVSettingService = this.LLILLJJLI;
        Locale locale = iAVSettingService.getLocale(iAVSettingService.getAppLanguage());
        if ((locale == null && (locale = Locale.getDefault()) == null) || (str = new SimpleDateFormat("MMM dd, yyyy", locale).format(new Date(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT)))) == null) {
            return "";
        }
        return str;
    }
}
