package com.ss.android.ugc.aweme.account.login.passkey.management;

import X.C01GW;
import X.C0TUI;
import X.C15438062q;
import X.C1559260qg8;
import X.C1886430zBp;
import X.C1887220zD6;
import X.C2097608Jq;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredential;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyManagementViewModel extends AssemViewModel<C1886430zBp> {
    public static final HashMap<String, Pair<Integer, Boolean>> LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0TUI.class, (Class<Object>) "passkey_management_hierarchy_data", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(86));
    public boolean LLILLL = true;

    static {
        Integer numValueOf = Integer.valueOf(R.raw.icon_start_with_uppercase);
        Boolean bool = Boolean.FALSE;
        Integer numValueOf2 = Integer.valueOf(R.raw.icon_color_apple);
        Boolean bool2 = Boolean.TRUE;
        LLILZ = C2097608Jq.LJI(new Pair("b93fd961f2e6462fb12282002247de78", new Pair(numValueOf, bool)), new Pair("d548826e79b4db40a3d811116f7e8349", new Pair(Integer.valueOf(R.raw.icon_color_bitwarden), bool)), new Pair("531126d6e717415c93203d9aa6981239", new Pair(Integer.valueOf(R.raw.icon_color_dashlane), bool)), new Pair("ea9b8d664d011d213ce4b6b48cb575d4", new Pair(Integer.valueOf(R.raw.icon_color_google), bool)), new Pair("dd4ec289e01d41c9bb8970fa845d4bf2", new Pair(numValueOf2, bool2)), new Pair("fbfc3007154e4ecc8c0b6e020557d7bd", new Pair(Integer.valueOf(R.raw.icon_color_apple), bool2)), new Pair("0ea242b443c44a1b8b17dd6d0b6baec6", new Pair(Integer.valueOf(R.raw.icon_color_keeper), bool)), new Pair("b78a0a556ef8d246a042ba0f6d55050c", new Pair(Integer.valueOf(R.raw.icon_bitmap_last_pass), bool)), new Pair("b84e404815dc4dd08640f4f60813c8af", new Pair(Integer.valueOf(R.raw.icon_bitmap_nordpass), bool)), new Pair("bada5566a7aa401fbd9645619a55120d", new Pair(Integer.valueOf(R.raw.icon_bitmap_1password), bool)), new Pair("50726f746f6e5061737350726f746f6e", new Pair(Integer.valueOf(R.raw.icon_color_proton_pass), bool)), new Pair("53414d53554e47000000000000000000", new Pair(Integer.valueOf(R.raw.icon_bitmap_samsung), bool)), new Pair("891494da2c904d31a9cd4eab0aed1309", new Pair(Integer.valueOf(R.raw.icon_bitmap_sesame), bool)), new Pair("08987058cadc4b81b6e130de50dcbe96", new Pair(Integer.valueOf(R.raw.icon_color_windows), bool)), new Pair("9ddd1817af5a4672a2b93e3dd95000a9", new Pair(Integer.valueOf(R.raw.icon_color_windows), bool)), new Pair("6028b017b1d44c02b4b3afcdafc96bb2", new Pair(Integer.valueOf(R.raw.icon_color_windows), bool)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1886430zBp(vQ2().LLILLJJLI, 29);
    }

    public final C0TUI vQ2() {
        return (C0TUI) this.LL.getValue();
    }

    public final List<C1887220zD6> wQ2(List<PasskeyCredential> list) {
        Long lValueOf;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (PasskeyCredential passkeyCredential : list) {
            long j = passkeyCredential.createdAt;
            Long lValueOf2 = null;
            if (j > 0) {
                lValueOf = Long.valueOf(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            } else {
                lValueOf = null;
            }
            long j2 = passkeyCredential.lastUsed;
            if (j2 > 0) {
                lValueOf2 = Long.valueOf(j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            Pair<Integer, Boolean> pair = LLILZ.get(passkeyCredential.providerId);
            if (pair == null) {
                pair = new Pair<>(Integer.valueOf(R.raw.icon_person_passkey_fill), Boolean.TRUE);
            }
            arrayList.add(new C1887220zD6(passkeyCredential.id, pair.getFirst().intValue(), pair.getSecond().booleanValue(), passkeyCredential.providerName, lValueOf, passkeyCredential.deviceType, lValueOf2, passkeyCredential.location, new AwS429S0200000_28(passkeyCredential, this, 13)));
        }
        return arrayList;
    }
}
