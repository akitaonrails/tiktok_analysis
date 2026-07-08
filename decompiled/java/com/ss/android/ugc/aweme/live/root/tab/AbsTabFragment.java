package com.ss.android.ugc.aweme.live.root.tab;

import X.C19EH;
import X.C2097608Jq;
import X.C475260IkO;
import X.EnumC475180IkG;
import X.InterfaceC475150IkD;
import X.InterfaceC479810Irj;
import X.InterfaceC479830Irl;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsTabFragment extends Fragment implements InterfaceC479810Irj {
    public InterfaceC475150IkD LL;

    public void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<?> interfaceC479830Irl, C19EH c19eh) {
    }

    @Override // X.InterfaceC479810Irj
    public void LLLILZLLLI() {
    }

    @Override // X.InterfaceC479810Irj
    public void al() {
    }

    public void eP(C475260IkO c475260IkO) {
    }

    @Override // X.InterfaceC479810Irj
    public void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC479810Irj
    public void onPageSelected() {
    }

    @Override // X.InterfaceC479810Irj
    public Map<String, String> Z() {
        return C2097608Jq.LJ();
    }

    public final void Ah(EnumC475180IkG enumC475180IkG) {
        InterfaceC475150IkD interfaceC475150IkD = this.LL;
        if (interfaceC475150IkD != null) {
            interfaceC475150IkD.Ah(enumC475180IkG);
        }
    }
}
