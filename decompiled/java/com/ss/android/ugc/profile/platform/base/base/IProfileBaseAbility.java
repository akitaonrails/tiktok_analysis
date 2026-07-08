package com.ss.android.ugc.profile.platform.base.base;

import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface IProfileBaseAbility extends InterfaceC494301wD {
    List<ProfilePlatformProtocol<BizBaseData>> AH2();

    void OJ1(ProfileCommonInfo profileCommonInfo);

    ProfileComponents ZE();

    View cP();

    List<ContentCellProtocol> lx2();

    String sa0();

    ProfileCommonInfo wG2();

    ProfileComponents yN0();

    void zl2(String str, boolean z, boolean z2);
}
