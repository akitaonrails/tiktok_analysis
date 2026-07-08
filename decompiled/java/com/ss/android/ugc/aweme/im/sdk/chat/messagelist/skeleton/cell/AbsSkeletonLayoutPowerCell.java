package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell;

import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C899550ZQr;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AbsSkeletonLayoutPowerCell<ASSEM extends AbsSkeletonLayoutReusedUISlotAssem<? extends C03H5>, T extends InterfaceC461380I7k> extends AssemPowerCell<ASSEM, T> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14((AbsSkeletonLayoutPowerCell) this, 628));
    public volatile C899550ZQr LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbsSkeletonLayoutPowerCell.class, "skeletonLayoutConfig", "getSkeletonLayoutConfig()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/data/SkeletonLayoutConfig;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return (ReusedUIAssem) this.LLIZ.getValue();
    }
}
