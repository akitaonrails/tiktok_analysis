package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C01GW;
import X.C1196320hEk;
import X.C452501pT;
import X.C720930SPr;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ReactionBaseCell<ITEM extends C720930SPr> extends PowerCell<ITEM> implements InterfaceC713360RyY {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(48));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11((ReactionBaseCell) this, 78));

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }
}
