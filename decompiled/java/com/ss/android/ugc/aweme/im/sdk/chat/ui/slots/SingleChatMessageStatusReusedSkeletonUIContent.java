package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C019F;
import X.C0OBY;
import X.C1275104yr;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C897270ZHx;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem.ReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleChatMessageStatusReusedSkeletonUIContent extends ReusedSkeletonUISlotAssem<SingleChatMessageStatusReusedSkeletonUIContent, C1275104yr> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJLLIL;
    public final AssemVMLazy LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleChatMessageStatusReusedSkeletonUIContent.class, "readStatusViewModel", "getReadStatusViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/assem/ReadStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cqp;
    }

    public SingleChatMessageStatusReusedSkeletonUIContent() {
        super(C897270ZHx.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReadStatusViewModel.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 888), AFwS248S0000000_14.get$arr$(258), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(C869590Y9l c869590Y9l, C1275104yr c1275104yr) {
        if (c1275104yr.LIZ) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            AssemVMLazy assemVMLazy = this.LLJLLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
            ReadStatusViewModel readStatusViewModel = (ReadStatusViewModel) assemVMLazy.getValue();
            if (readStatusViewModel.LL.add(c869590Y9l.getUuid())) {
                C0OBY.LIZJ(((C457780HxI) this.LLJLLIL.getValue()).LL.getEnterFromForMob(), ((C457780HxI) this.LLJLLIL.getValue()).LL);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }
}
