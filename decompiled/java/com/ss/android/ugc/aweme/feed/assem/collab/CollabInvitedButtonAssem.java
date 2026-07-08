package com.ss.android.ugc.aweme.feed.assem.collab;

import X.C01GW;
import X.C13LE;
import X.C14EU;
import X.C197039127h;
import X.C214878197k;
import X.C2217381BqS;
import X.C622680Oba;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CollabUpdateStatusEvent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS68S0200000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public class CollabInvitedButtonAssem extends BaseCellSlotComponent<CollabInvitedButtonAssem> {
    public TuxTextView LLJLLIL;
    public C197039127h LLJLLL;
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(118));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9q;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C622680Oba.LIZLLL(this);
    }

    @C14EU
    public final void onCollabUpdateStatusEvent(CollabUpdateStatusEvent collabUpdateStatusEvent) {
        long j = collabUpdateStatusEvent.status;
        if (j == 1 || j == 2) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.ht0);
        this.LLJLLL = (C197039127h) view.findViewById(R.id.hsy);
        TuxTextView tuxTextView = this.LLJLLIL;
        C197039127h c197039127h = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(LJJIJL().getContext().getString(2131828905));
        C197039127h c197039127h2 = this.LLJLLL;
        if (c197039127h2 != null) {
            c197039127h = c197039127h2;
        }
        c197039127h.setText(LJJIJL().getContext().getString(2131828891));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.1654
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS319S0000000_31.get$arr$(10), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C197039127h c197039127h = this.LLJLLL;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        setComponentClickStatusExperimental(c197039127h, EnumC700430Rdh.POSITIVE);
        C197039127h c197039127h3 = this.LLJLLL;
        if (c197039127h3 != null) {
            c197039127h2 = c197039127h3;
        }
        C786410Ut5.I7(new AkS68S0200000_31(this, videoItemParams2, 0), c197039127h2);
    }

    public static void Bp(VideoItemParams videoItemParams, boolean z, String str) {
        String str2;
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str3 = videoItemParams.mEventType;
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        String authorUid = AwemeExtKt.getAuthorUid(videoItemParams.getAweme());
        if (z) {
            str2 = "click";
        } else {
            str2 = "show";
        }
        iCollabEventTrackingServiceLJII.reportCollabAuthorizePopup(str3, aid, authorUid, "banner_review", str2, "authorize", str);
    }
}
