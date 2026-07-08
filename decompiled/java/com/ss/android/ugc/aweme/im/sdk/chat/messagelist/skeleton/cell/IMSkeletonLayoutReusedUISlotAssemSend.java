package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell;

import X.C03H5;
import X.C13IQ;
import X.EnumC461660I8m;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class IMSkeletonLayoutReusedUISlotAssemSend extends IMSkeletonLayoutReusedUISlotAssem<IMSkeletonLayoutReusedUISlotAssemSend> {
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LLLI;
    public final EnumC461660I8m LLLII = EnumC461660I8m.END;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
    public void op() {
        sp(new AwS593S0100000_14(this, 81));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return Fp().LL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
    public final EnumC461660I8m Jp() {
        return this.LLLII;
    }

    public IMSkeletonLayoutReusedUISlotAssemSend(C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iq) {
        this.LLLI = c13iq;
    }
}
