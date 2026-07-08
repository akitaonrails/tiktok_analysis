package com.ss.android.ugc.profile.platform.standard.protocol;

import X.C01GW;
import X.C06KX;
import X.C09AY;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1251330ifT;
import X.C1558420qem;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC1248220iaS;
import X.EnumC1248260iaW;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ug.ProfileNavbarActivityProtocol;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfilePlatformProtocol<T extends BizBaseData> implements C06KX, InterfaceC713360RyY {
    public Fragment LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public View LLILZLL;
    public C1248950ibd LLIZ;
    public IProfilePlatformVM LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public C1251330ifT LLJIJIL;
    public T LLJILJIL;
    public ProfileComponents LLJILJILJ;
    public Lifecycle LLJILLL;
    public View LLJJI;
    public C09AY LLJJIII;
    public C09AY LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(578));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19((ProfilePlatformProtocol) this, 2567));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19((ProfilePlatformProtocol) this, 2568));
    public final EnumC1248220iaS LLJJ = EnumC1248220iaS.BOTH;
    public final EnumC1248260iaW LLJJIJIIJIL = EnumC1248260iaW.UNKONWN;
    public String LLJJIJIL = "others_homepage";
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19((ProfilePlatformProtocol) this, 2569));

    public void LIZLLL() {
    }

    public void LJI() {
    }

    public boolean LJII(View view) {
        return false;
    }

    public void LJIIJ(Map map) {
    }

    public View LJIIJJI() {
        return null;
    }

    public Integer LJIJJLI() {
        return null;
    }

    public Integer LJJ() {
        return null;
    }

    public Integer LJJI() {
        return null;
    }

    public String LJJIFFI() {
        return "";
    }

    public Integer LJJIIJ() {
        return null;
    }

    public Integer LJJIJIIJIL() {
        return null;
    }

    public Integer LJJIL() {
        return null;
    }

    public LifecycleObserver LJJIZ() {
        return null;
    }

    public TextUtils.TruncateAt LJJJJ() {
        return null;
    }

    public Integer LJJJJJ() {
        return null;
    }

    public String LJJJJJL() {
        return "";
    }

    public boolean LJJJLIIL() {
        return false;
    }

    public boolean LJJJZ() {
        return true;
    }

    public Boolean LJJLIIIJ() {
        return null;
    }

    public boolean LJJLIIIJILLIZJL() {
        return this instanceof ProfileNavbarActivityProtocol;
    }

    public boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        return false;
    }

    public abstract String getName();

    public Map<String, String> uP(int i, String str) {
        return null;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJJJ.getValue();
    }

    public final Context getContext() {
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            return fragment.getContext();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LLJILLL;
        return lifecycle == null ? (Lifecycle) this.LLILLJJLI.getValue() : lifecycle;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return (InterfaceC665370Q7z) this.LLILLL.getValue();
    }

    public final ProfileCommonInfo LJIILIIL() {
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            return iProfileBaseAbility.wG2();
        }
        return null;
    }

    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfilePlatformProtocol_");
        sbLIZ.append(getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EnumC1248220iaS LJIIZILJ() {
        return this.LLJJ;
    }

    public EnumC1248260iaW LJJIIZI() {
        return this.LLJJIJIIJIL;
    }

    public void LJJJLZIJ(n nVar) {
        T t;
        Object objLIZ;
        try {
            objLIZ = C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (objLIZ instanceof BizBaseData) {
            t = (T) objLIZ;
        } else {
            t = null;
        }
        this.LLJILJIL = t;
    }
}
