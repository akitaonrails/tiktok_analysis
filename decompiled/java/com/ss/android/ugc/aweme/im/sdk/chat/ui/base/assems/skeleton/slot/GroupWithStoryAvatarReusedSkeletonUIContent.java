package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0I6Y;
import X.C0QSJ;
import X.C0ZOF;
import X.C0ZP4;
import X.C127G;
import X.C13LE;
import X.C1434905jX;
import X.C14EU;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C462190IAn;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1146704e9;
import X.InterfaceC1398730mVD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC462200IAo;
import X.InterfaceC665370Q7z;
import X.InterfaceC911210Zot;
import Y.ACListenerS110S0200000_6;
import Y.AObjectS389S0100000_14;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AvatarState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS298S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupWithStoryAvatarReusedSkeletonUIContent extends ReusedSkeletonUISlotAssem<GroupWithStoryAvatarReusedSkeletonUIContent, AvatarState> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final C1559260qg8 LLJLLIL;
    public AnonymousClass0956 LLJLLL;
    public final C01GW LLJZ;
    public InterfaceC1398730mVD LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C0ZP4 LLLFFI;
    public C0ZP4 LLLFZ;
    public IMUser LLLI;
    public volatile InterfaceC911210Zot LLLII;
    public C127G LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupWithStoryAvatarReusedSkeletonUIContent.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupWithStoryAvatarReusedSkeletonUIContent.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cjq;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void sp() {
        Gp();
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        this.LLLFFI = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06eN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLIZLLLIL;
            }
        }, null, AFwS298S0000000_14.get$arr$(5), 6);
        this.LLLFZ = C736680Sv4.LJIIIIZZ(this, this.LLL.getValue(), new C2217381BqS() { // from class: X.06eM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1657506eL) obj).LLILZ);
            }
        }, null, AFwS298S0000000_14.get$arr$(6), 6);
    }

    public GroupWithStoryAvatarReusedSkeletonUIContent() {
        super(C0ZOF.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 809));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 812), AFwS248S0000000_14.get$arr$(232), null, true);
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 810));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 811));
    }

    public final C0QSJ Bp() {
        C0QSJ c0qsj = this.LLLIIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLLIIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final AvatarComponentView Ep() {
        return (AvatarComponentView) this.LLJZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void Gp() {
        Unit unit;
        Unit unit2;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C0ZP4 c0zp4 = this.LLLFFI;
        if (c0zp4 != null && !c0zp4.isDisposed()) {
            try {
                C0ZP4 c0zp42 = this.LLLFFI;
                if (c0zp42 != null) {
                    c0zp42.dispose();
                    unit2 = Unit.LIZ;
                } else {
                    unit2 = null;
                }
                C189200o6.m2constructorimpl(unit2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLLFFI = null;
        }
        C0ZP4 c0zp43 = this.LLLFZ;
        if (c0zp43 == null || c0zp43.isDisposed()) {
            return;
        }
        try {
            C0ZP4 c0zp44 = this.LLLFZ;
            if (c0zp44 != null) {
                c0zp44.dispose();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        this.LLLFFI = null;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GroupChatVM.class, new AObjectS389S0100000_14(this, 39)}, defaultViewModelProviderFactory);
                    this.LLLIIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Gp();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void yp() {
        Gp();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        this.LLJLLIL.getValue();
        Ep().getAvatar().setSize(28);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate(C1434905jX c1434905jX) {
        String uid;
        Object obj;
        try {
            String uid2 = c1434905jX.LIZJ.getUid();
            IMUser iMUser = this.LLLI;
            Object obj2 = null;
            if (iMUser != null) {
                uid = iMUser.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid2, uid) && this.LLLI != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) obj);
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                tp(c869590Y9lLIZ, (AvatarState) op());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    /* JADX INFO: renamed from: Fp, reason: merged with bridge method [inline-methods] */
    public final void tp(final C869590Y9l c869590Y9l, AvatarState avatarState) {
        if (!avatarState.avatarVisibility) {
            C786410Ut5.g(Ep(), 4);
            return;
        }
        InterfaceC462200IAo interfaceC462200IAo = new InterfaceC462200IAo() { // from class: X.0ZP1
            @Override // X.InterfaceC462200IAo
            public final void LIZ() {
                C427660Gpo.LJIIJJI(this.Ep().getAvatar(), Integer.valueOf(R.drawable.c5w), false, null, null, false, false, null, null, false, null, 1006);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:9:0x0044, B:11:0x0049, B:13:0x004d, B:15:0x005a, B:18:0x0061, B:20:0x0071, B:22:0x0077, B:23:0x0086, B:25:0x008c, B:26:0x009a, B:28:0x00a5, B:30:0x00ab, B:34:0x00c6, B:31:0x00bd, B:33:0x00c1), top: B:40:0x0044 }] */
            @Override // X.InterfaceC462200IAo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r13) {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0ZP1.LIZIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):void");
            }
        };
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLLL = C462190IAn.LIZ(((C457780HxI) this.LLJLLIL.getValue()).LL, c869590Y9l, interfaceC462200IAo, LifecycleOwnerKt.getLifecycleScope(this));
        C786410Ut5.g(Ep(), 0);
        C786410Ut5.y9(Ep(), new ACListenerS110S0200000_6(c869590Y9l, this, 31));
    }
}
