package com.tiktok.ttf.network.depend;

import X.EnumC1495060p0a;
import X.EnumC588680N7a;
import com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultExpsDepend implements INetworkExpsDepend {
    @Override // com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend
    public final int getValue(EnumC588680N7a enumC588680N7a) {
        return enumC588680N7a.getDefaultVal();
    }

    @Override // com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend
    public final boolean getValue(EnumC1495060p0a enumC1495060p0a) {
        return enumC1495060p0a.getDefaultVal();
    }
}
