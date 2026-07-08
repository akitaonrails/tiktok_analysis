package com.bytedance.ext_power_list;

import X.C0SMO;
import X.C0SZT;
import X.C19EG;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class AssemReusedVHContainer<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> extends AssemReusedContainer<R, ITEM> {
    public final LifecycleOwner LLJILJILJ;
    public final ReusedUIAssem<?> LLJILLL;
    public final View LLJJ;
    public final C19EG LLJJI;
    public final Function0<InterfaceC665370Q7z> LLJJIII;
    public final LifecycleOwner LLJJIJI;
    public final LifecycleOwner LLJJIJIIJIL;

    public AssemReusedVHContainer() {
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJJIII.invoke();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJJ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LLILZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssemReusedVHContainer(LifecycleOwner lifecycleOwner, C0SZT c0szt, ReusedUIAssem reusedUIAssem, View view, Function0 function0) {
        super(c0szt);
        C19EG c19egLJ = C737910Sx3.LJ(view.getContext());
        this.LLJILJILJ = lifecycleOwner;
        this.LLJILLL = reusedUIAssem;
        this.LLJJ = view;
        this.LLJJI = c19egLJ;
        this.LLJJIII = function0;
        this.LLJJIJI = lifecycleOwner;
        this.LLJJIJIIJIL = lifecycleOwner;
    }
}
