package com.ss.android.ugc.aweme.commentv2.headeranchor.common.bridge;

import X.C01GW;
import X.C1350630lFd;
import X.C452501pT;
import X.EnumC1350510lFR;
import X.InterfaceC1350330lF9;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class BgEcomTopBarServiceImpl extends BaseTopBarBridgeServiceImpl {
    public static final C01GW<C1350630lFd> LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(231));

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.bridge.BaseTopBarBridgeServiceImpl
    public final InterfaceC1350330lF9 bridgeTopBar() {
        return LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.bridge.BaseTopBarBridgeServiceImpl, com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return Collections.singletonList(Integer.valueOf(EnumC1350510lFR.TT_SHOWCASE_BG.getValue()));
    }
}
