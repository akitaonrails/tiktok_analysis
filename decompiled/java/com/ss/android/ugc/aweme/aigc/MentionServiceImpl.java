package com.ss.android.ugc.aweme.aigc;

import X.AbstractC23140094w;
import X.C099R;
import X.C0C64;
import X.C0CHQ;
import X.C0PEM;
import X.C23250099c;
import X.C485660J2u;
import X.C555230Lq5;
import X.C555240Lq6;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckRequest;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionServiceImpl implements MentionService {
    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final boolean LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        if (currentUserID.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(currentUserID, str);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LJ(InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
        if (C555240Lq6.LIZ != null && Intrinsics.LJFF(C555240Lq6.LIZLLL, C555240Lq6.LIZ())) {
            return C555240Lq6.LIZ;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C485660J2u(null));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LJI(InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        Object objLIZIZ = C555240Lq6.LIZIZ(C555240Lq6.LIZ, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LJIIIIZZ(InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn) {
        return C555230Lq5.LIZ.LIZLLL(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LIZ(List<MentionDataItem> list, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
        return C555230Lq5.LIZ.LIZIZ(list, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LIZJ(List<String> list, InterfaceC1364105Vn<? super MentionCheckResult> interfaceC1364105Vn) {
        String str;
        if (list.isEmpty()) {
            return null;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_uikit_mention_add_libra_key", true, false)) {
            str = "ai_theater_profile_record_enable";
        } else {
            str = "";
        }
        return C555230Lq5.LIZ.LIZ(new MentionCheckRequest(list, str), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LJII(List<String> list, List<Long> list2, Boolean bool, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
        return C555230Lq5.LIZ.LJ(list, list2, bool, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LIZLLL(int i, int i2, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C555230Lq5.LIZ.LIZJ(i, i2, str, list, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
    public final Object LJFF(int i, String str, String str2, String str3, AbstractC23140094w abstractC23140094w, boolean z) {
        return C555230Lq5.LIZ.LJII(i, str, str2, str3, abstractC23140094w, z);
    }
}
