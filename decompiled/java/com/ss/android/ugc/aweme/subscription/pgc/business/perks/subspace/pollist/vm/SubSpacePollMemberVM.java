package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.pollist.vm;

import X.C005Z;
import X.C01GW;
import X.C0JCK;
import X.C0K3N;
import X.C0K3O;
import X.C0K3U;
import X.C0K4J;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C452501pT;
import X.C516201zk;
import X.EnumC499440JiI;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC665370Q7z;
import Y.AfS143S0200000_7;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpacePollMemberVM extends AssemViewModel<C005Z> implements C0K3N {
    public static final /* synthetic */ int LLILZIL = 0;
    public InterfaceC665370Q7z LL;
    public C0K3U LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 517));
    public C0K3O LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C005Z(0);
    }

    public final C0K3U wQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0K3U.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C0K3U) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    @Override // X.C0K3N
    public final boolean LJIIJJI() {
        wQ2();
        return false;
    }

    @Override // X.C0K3N
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        vQ2(false, function0, function1);
    }

    public final void vQ2(boolean z, Function0 function0, Function1 function1) {
        SpacePost spacePost;
        SpacePost spacePost2;
        SpacePoll spacePoll;
        SpacePollOption spacePollOption;
        C11NZ c11nz;
        C0K3U c0k3uWQ2 = wQ2();
        if (c0k3uWQ2 != null && (spacePost = c0k3uWQ2.LL) != null) {
            long j = spacePost.postId;
            C0K3U c0k3uWQ22 = wQ2();
            if (c0k3uWQ22 != null && (spacePost2 = c0k3uWQ22.LL) != null && (spacePoll = spacePost2.pollInfo) != null) {
                long j2 = spacePoll.pollId;
                C0K3U c0k3uWQ23 = wQ2();
                if (c0k3uWQ23 != null && (spacePollOption = c0k3uWQ23.LLILLJJLI) != null) {
                    long j3 = spacePollOption.optionId;
                    wQ2();
                    C11NZ c11nzLIZJ = C0K4J.LIZ().LIZJ(j, j2, j3);
                    if (c11nzLIZJ != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzLIZJ, EnumC499440JiI.GENERAL, "SubSpacePollMemberVM", "sub/space/poll/user_list", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) != null) {
                        c11nz.LJJLL(new AfS143S0200000_7((Object) function0, (EmoteModel) this, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 3), new C516201zk(function1, 22));
                    }
                }
            }
        }
    }
}
