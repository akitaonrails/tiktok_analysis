package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings;

import X.C069P;
import X.C0YAE;
import X.C1383370m6R;
import X.C1697810uHb;
import X.C19212010Ec;
import X.C20642515q3;
import X.C878730Ydb;
import X.C878970Ydz;
import X.C888970Yu7;
import X.C889010YuB;
import X.EnumC888990Yu9;
import X.InterfaceC0148002o;
import X.InterfaceC15516065q;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import java.util.List;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ArchiveSettingPageViewModel extends AssemViewModel<C889010YuB> {
    public static final C878970Ydz LL = new C878970Ydz();
    public static final InterfaceC15516065q LLILLJJLI;

    static {
        IMContactApi.LIZ.getClass();
        LLILLJJLI = C069P.LIZ().LIZJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C889010YuB(0);
    }

    public final void vQ2() {
        boolean z = true;
        boolean z2 = false;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C888970Yu7(EnumC888990Yu9.PIN_TO_TOP, C1383370m6R.LJIIJ(2131830301), null, C19212010Ec.LIZJ.LJJJIL(), true, true));
        LL.getClass();
        IMUserArchiveSettings iMUserArchiveSettingsLIZ = C878970Ydz.LIZ(false);
        if (iMUserArchiveSettingsLIZ != null) {
            Boolean bool = iMUserArchiveSettingsLIZ.keepConversationsArchived;
            if (bool != null) {
                listLJIILJJIL.add(new C888970Yu7(EnumC888990Yu9.KEEP_CHATS_ARCHIVED, C1383370m6R.LJIIJ(2131830300), C1383370m6R.LJIIJ(2131830298), bool.booleanValue(), z, z2, 32));
            }
            Boolean bool2 = iMUserArchiveSettingsLIZ.autoArchiveInactiveConversation;
            if (bool2 != null) {
                boolean zBooleanValue = bool2.booleanValue();
                int i = C878730Ydb.LIZ().expirationTimeToAutoArchiveDay;
                listLJIILJJIL.add(new C888970Yu7(EnumC888990Yu9.AUTO_ARCHIVE_INACTIVE_CHATS, C1383370m6R.LJIIJ(2131830297), C20642515q3.LJ(2131755210, i, String.valueOf(i)), zBooleanValue, false, true, 16));
            }
        }
        setState(new AwS593S0100000_14(listLJIILJJIL, (List<C0YAE>) 36));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.C888970Yu7 r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel.wQ2(X.0Yu7, X.05Vn):java.lang.Object");
    }
}
