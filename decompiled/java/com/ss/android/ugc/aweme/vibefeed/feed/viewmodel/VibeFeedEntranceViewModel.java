package com.ss.android.ugc.aweme.vibefeed.feed.viewmodel;

import X.AnonymousClass0956;
import X.C09R9;
import X.C0P30;
import X.C0PEM;
import X.C0YSQ;
import X.C13LE;
import X.C1575120r5i;
import X.C1575130r5j;
import X.C1575160r5m;
import X.C1575180r5o;
import X.C1575200r5q;
import X.C1575210r5r;
import X.C1575280r5y;
import X.C1575440r6E;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C23250099c;
import X.C299810Bp5;
import X.C628980Olk;
import X.C629300OmG;
import X.C866530Xz1;
import X.EnumC1575230r5t;
import X.EnumC897860ZKe;
import X.EnumC912680ZrG;
import X.InterfaceC876950Yaj;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS36S0010000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedEntranceViewModel extends IVibeFeedEntranceViewModel {
    public C866530Xz1 LLILZLL;
    public C1575160r5m LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public final C09R9 LLILZ = new C09R9(this, C13LE.LIZ(C628980Olk.class));
    public final C09R9 LLILZIL = new C09R9(this, C13LE.LIZ(C629300OmG.class));
    public EnumC912680ZrG LLJIJIL = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = false;
        this.LLILLJJLI = true;
        this.LLILLL.set(false);
        C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
        EnumC897860ZKe enumC897860ZKe = EnumC897860ZKe.CHAT_PAGE;
        String str = this.LLJI;
        if (str == null) {
            str = "";
        }
        c1575210r5r.LJI(enumC897860ZKe, str, false);
        C1575160r5m c1575160r5m = this.LLIZ;
        if (c1575160r5m != null) {
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(c1575160r5m);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepared toUserId:");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", conversationId:");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" ...");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void zQ2(VibeFeedInviteParam vibeFeedInviteParam, Function1<? super Integer, Unit> function1) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (AQ2(strLIZ, vibeFeedInviteParam.getToUserId(), vibeFeedInviteParam.getConversationId(), vibeFeedInviteParam.getMutualFeedScene())) {
            return;
        }
        C0P30.LIZ().LIZIZ(vibeFeedInviteParam.getConversationId(), "from invite");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mutualFeedScene: ");
        sbLIZ.append(vibeFeedInviteParam.getMutualFeedScene());
        sbLIZ.append(", inviteUser toUserId:");
        sbLIZ.append(vibeFeedInviteParam.getToUserId());
        sbLIZ.append(" conversationId:");
        sbLIZ.append(vibeFeedInviteParam.getConversationId());
        sbLIZ.append(" inviteComplete:");
        sbLIZ.append(function1);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1575280r5y(vibeFeedInviteParam, this, strLIZ, function1, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel
    public final void vQ2(String str, String str2, boolean z) {
        EnumC912680ZrG enumC912680ZrG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initChatData toUserId:");
        sbLIZ.append(str);
        sbLIZ.append(", conversationId:");
        sbLIZ.append(str2);
        sbLIZ.append(" ..., isGroup:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJ = str;
        this.LLJI = str2;
        if (z) {
            enumC912680ZrG = EnumC912680ZrG.MUTUAL_FEED_SCENE_GROUP;
        } else {
            enumC912680ZrG = EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
        }
        this.LLJIJIL = enumC912680ZrG;
        if (C299810Bp5.LIZ()) {
            boolean z2 = false;
            if (str2 != null && str2.length() != 0) {
                C1575200r5q c1575200r5q = C1575210r5r.LLILLJJLI.LL.LIZ.get(str2);
                if (c1575200r5q != null && c1575200r5q.LIZIZ) {
                    z2 = true;
                }
                setState(new AwS36S0010000_24(z2, 20));
            }
        }
        xQ2(str, str2, this.LLJIJIL, true, new C1575180r5o(this, z, str, str2));
    }

    public static boolean AQ2(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG) {
        if (enumC912680ZrG.isGroup()) {
            if (str3 != null && str3.length() != 0) {
                IMUser.Companion.getClass();
                if (!C2201941BFw.LJ(str)) {
                    return false;
                }
            }
        } else {
            IMUser.Companion.getClass();
            if (!C2201941BFw.LJ(str2) && !C2201941BFw.LJ(str)) {
                return false;
            }
        }
        return true;
    }

    public final void wQ2(String str, String str2, EnumC912680ZrG enumC912680ZrG, Function1<? super Boolean, Unit> function1) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (AQ2(strLIZ, str2, str, enumC912680ZrG)) {
            return;
        }
        if (str != null) {
            C0P30.LIZ().LIZIZ(str, "from accept");
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1575130r5j(str, str2, this, strLIZ, enumC912680ZrG, function1, null), 2);
    }

    public final void xQ2(String str, String str2, EnumC912680ZrG enumC912680ZrG, boolean z, Function1<? super EnumC1575230r5t, Unit> function1) {
        String strLIZ = C1575440r6E.LIZ();
        if (AQ2(strLIZ, str, str2, enumC912680ZrG)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchVibeFeedConfig toUserId:");
        sbLIZ.append(str);
        sbLIZ.append(" conversationId:");
        sbLIZ.append(str2);
        sbLIZ.append(" block:");
        sbLIZ.append(function1);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1575120r5i(str, str2, this, strLIZ, enumC912680ZrG, function1, z, null), 2);
    }
}
