package com.ss.android.ugc.aweme.vibefeed.feed;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1566140qrE;
import X.C299750Boz;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.vibefeed.ability.IVibeDataAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class VibeLikeHistoryPageComponent extends SimpleVibeDetailPageComponent implements IVibeDataAbility, InterfaceC1554640qYg {
    public final C01GW LLLJIL;
    public final C630740Ooa LLLJL;
    public final C736950SvV LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2116508635) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.ability.IVibeDataAbility
    public final String Pa2() {
        Aweme awemeLJIIIIZZ;
        String strOptString;
        if (Intrinsics.LJFF(this.LLLLIIL.getValue(), "click_chat_message")) {
            JSONObject jSONObject = (JSONObject) this.LLLLII.getValue();
            return (jSONObject == null || (strOptString = jSONObject.optString("shared_feed_refresh_time")) == null) ? "" : strOptString;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLLJL.getValue();
        if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null) {
            return null;
        }
        return String.valueOf(((VibeFeedDiggDetailListVM) this.LLLL.getValue()).GQ2(awemeLJIIIIZZ.getAid()));
    }

    public VibeLikeHistoryPageComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 631), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 23));
        }
        this.LLLJIL = c01gwLIZIZ;
        this.LLLJL = C628500Oky.LIZ(new AwS556S0100000_12(this, 634));
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(208);
        this.LLLL = new C736950SvV(C13LE.LIZ(VibeFeedDiggDetailListVM.class), aFwS199S0000000_12, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS245S0000000_12.get$arr$(91), new AwS556S0100000_12((AbstractC738140SxQ) this, 632), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLLII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 633));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 629));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 630));
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.feed.SimpleVibeDetailPageComponent, com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) throws IllegalAccessException {
        super.onViewCreated(view, bundle);
        C1558520qew.LIZLLL(this);
    }
}
