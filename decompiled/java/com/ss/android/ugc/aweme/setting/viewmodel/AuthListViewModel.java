package com.ss.android.ugc.aweme.setting.viewmodel;

import X.C004I;
import X.C1703770uRD;
import X.C1750000vdm;
import X.C1761680vwc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.EnumC1749980vdk;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.model.SecondPartyPartnerAuth;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import java.util.List;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthListViewModel extends JediViewModel<AuthInfoState> {
    public String LLIZ;
    public String LLIZLLLIL;
    public List<SecondPartyPartnerAuth> LLJI;
    public SecondPartyPartnerAuth LLJIJIL;
    public final C1703770uRD LLILZIL = new C1703770uRD();
    public final MutableLiveData<AuthorizedStruct> LLILZLL = new MutableLiveData<>();
    public EnumC1749980vdk LLJ = EnumC1749980vdk.FAMILY_PAIRING_ENUM_NO_PAIRING;
    public final ListMiddleware<AuthInfoState, AuthorizedStruct, C1761680vwc> LLJILJIL = new ListMiddleware<>(new AwS605S0100000_26(this, 418), null, AFwS313S0000000_26.get$arr$(19), AFwS285S0000000_2.get$arr$(50));

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AuthInfoState(new ListState(new C1761680vwc(3), null, null, null, null, 30, null));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<AuthInfoState, AuthorizedStruct, C1761680vwc> listMiddleware = this.LLJILJIL;
        C1750000vdm c1750000vdm = new C2217381BqS() { // from class: X.0vdm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AuthInfoState) obj).getListState();
            }
        };
        AFwS313S0000000_26 aFwS313S0000000_26 = AFwS313S0000000_26.get$arr$(38);
        listMiddleware.LLILLL = c1750000vdm;
        listMiddleware.LLILZ = aFwS313S0000000_26;
        xQ2(listMiddleware);
        this.LLJILJIL.refresh();
    }

    public final void hR2(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindData, scene:");
        sbLIZ.append(str2);
        sbLIZ.append(", teenSecUid:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }

    public final void iR2(AuthorizedStruct authorizedStruct, SecondPartyPartnerAuth secondPartyPartnerAuth) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSelectedApp, data:");
        sbLIZ.append(authorizedStruct);
        sbLIZ.append(", secondPartyPartnerAuth:");
        sbLIZ.append(secondPartyPartnerAuth);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL.setValue(authorizedStruct);
        this.LLJIJIL = secondPartyPartnerAuth;
    }
}
