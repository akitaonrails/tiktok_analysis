package com.bytedance.assem.arch.reused.proxy;

import X.C03H5;
import X.C0RTC;
import X.C0SMO;
import X.C0SZL;
import X.C19EG;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;

/* JADX INFO: loaded from: classes12.dex */
public final class MixUseReusedContainer extends AssemReusedContainer<MixUseReusedContainer, InterfaceC1587906Jp> implements C0SMO<MixUseReusedContainer, InterfaceC1587906Jp>, C03H5 {
    public final C19EG LLJILJILJ;
    public final LifecycleOwner LLJILLL;
    public final View LLJJ;
    public final C0RTC<?> LLJJI;
    public final InterfaceC665370Q7z LLJJIII;

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        return new MixUseContainerAssem(this.LLJJI);
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJJIII;
    }

    public MixUseReusedContainer(C19EG c19eg, LifecycleOwner lifecycleOwner, View view, C0RTC<?> c0rtc, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(new C0SZL<MixUseReusedContainer, InterfaceC1587906Jp>() { // from class: X.0RSB
            @Override // X.C0SZL
            public final String LIZLLL(InterfaceC1587906Jp interfaceC1587906Jp) {
                return String.valueOf(interfaceC1587906Jp.hashCode());
            }
        });
        this.LLJILJILJ = c19eg;
        this.LLJILLL = lifecycleOwner;
        this.LLJJ = view;
        this.LLJJI = c0rtc;
        this.LLJJIII = interfaceC665370Q7z;
    }
}
