package com.ss.android.ugc.aweme.notification;

import X.C019F;
import X.C01GW;
import X.C08A4;
import X.C123100dR;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Intent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notification.cell.SocialAvatarLikeListCell;
import com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState;
import com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialAvatarLikeListAssem extends UIListContentAssem<SocialAvatarLikeListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarLikeListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/notification/model/SocialAvatarLikeListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SocialAvatarLikeListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarLikeListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 798), AFwS264S0000000_24.get$arr$(233), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 796));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 799));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 795));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SocialAvatarLikeListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (SocialAvatarLikeListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Intent intent;
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
            Long lValueOf = Long.valueOf(intent.getLongExtra("avatar_id", 0L));
            String stringExtra = null;
            if (C08A4.LIZIZ(Long.valueOf(lValueOf.longValue()))) {
                ip().setAvatarId(lValueOf.longValue());
            }
            try {
                stringExtra = intent.getStringExtra("checksum");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C123100dR.LIZ(stringExtra) && stringExtra != null) {
                ip().setChecksum(stringExtra);
            }
        }
        Go().LJIILJJIL(SocialAvatarLikeListCell.class);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r2O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SocialAvatarLikeListState) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, 159), new AwS568S0100000_24(this, 797), new AwS603S0100000_24(this, 160), 2, null);
    }
}
