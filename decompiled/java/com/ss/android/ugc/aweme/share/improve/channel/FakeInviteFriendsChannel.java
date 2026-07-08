package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C0R4F;
import X.C1720106oR;
import X.C20642515q3;
import X.C2187451AjH;
import X.C424540Gkm;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FakeInviteFriendsChannel extends PureLogicChannel {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJIJI(C424540Gkm c424540Gkm, boolean z) {
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "invitation";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131836224);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIJIL(View view, boolean z) {
        C786410Ut5.x3(view.getViewTreeObserver(), new C0R4F(view, AFwS259S0000000_21.get$arr$(218), 7));
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("Relation_Sharer", "fake invite friends channel show");
    }
}
