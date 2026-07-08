package com.ss.android.ugc.aweme.series.commonfeed.holder;

import X.C0C64;
import X.C0RF0;
import X.C0SFV;
import X.C1611550s2T;
import X.C1612650s4F;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C485680J2w;
import X.C705680RmA;
import X.C718180SFc;
import X.C718190SFd;
import X.C786410Ut5;
import X.InterfaceC704770Rkh;
import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import irm.AkS56S0200000_11;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentImmersiveViewHolder extends PaidContentVideoViewHolder {
    public static final List<String> z1 = Collections.singletonList("high_tag_drama_reservation_fyp_tag");
    public SmartImageView h1;
    public TuxTextView i1;
    public TuxTextView j1;
    public TuxTextView k1;
    public View l1;
    public SmartImageView m1;
    public TuxTextView n1;
    public C705680RmA o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public TuxTextView f403p1;
    public String q1;
    public View r1;
    public TuxTextView s1;
    public TuxTextView t1;
    public View u1;
    public InterfaceC704770Rkh v1;
    public boolean w1;
    public View x1;
    public View y1;

    public final void C1() {
        C485680J2w c485680J2w;
        View view = this.x1;
        if (view == null) {
            return;
        }
        this.h1 = (SmartImageView) view.findViewById(R.id.v8u);
        this.i1 = (TuxTextView) view.findViewById(R.id.v90);
        this.j1 = (TuxTextView) view.findViewById(R.id.v8z);
        this.k1 = (TuxTextView) view.findViewById(R.id.v8v);
        this.r1 = view.findViewById(R.id.v8x);
        this.s1 = (TuxTextView) view.findViewById(R.id.v8w);
        this.f403p1 = (TuxTextView) view.findViewById(R.id.v8y);
        this.l1 = view.findViewById(R.id.b2j);
        this.m1 = (SmartImageView) view.findViewById(R.id.b2h);
        this.n1 = (TuxTextView) view.findViewById(R.id.b2n);
        View view2 = this.l1;
        if ((view2 instanceof C485680J2w) && (c485680J2w = (C485680J2w) view2) != null) {
            c485680J2w.setOnBeforeClick(new AwS555S0100000_11(this, 542));
        }
        View view3 = this.l1;
        this.o1 = view3 != null ? new C705680RmA(view3, this.m1, this.n1) : null;
    }

    public final void F1() {
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        View view = this.l1;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612650s4F.LIZ(c2344009Gk, this.LLJJ);
        c2344009Gk.LJFF("enter_from", this.LLJILJILJ.LJIIIZ);
        c2344009Gk.LJFF("group_id", this.LLJJ.getAid());
        c2344009Gk.LJFF("component_key", "anchor_pine_drama");
        c2344009Gk.LJFF("component_type", "anchor");
        Aweme aweme = this.LLJJ;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
            c2344009Gk.LJII(logExtra);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_core_fdmt_component", c2344009Gk.LIZ);
        }
    }

    public final void H1() {
        String uid;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612650s4F.LIZ(c2344009Gk, this.LLJJ);
        c2344009Gk.LJFF("series_feed_type", C718180SFc.LIZLLL(this.LLJJ, this.LLJILJILJ.LJIIIZ));
        String strLJ = C718180SFc.LJ(this.LLJJ);
        String str2 = "";
        if (strLJ == null) {
            strLJ = "";
        }
        c2344009Gk.LJFF("series_video_type", strLJ);
        c2344009Gk.LJFF("series_component_type", C718180SFc.LIZJ(this.LLJJ, this.LLJILJILJ.LJIIIZ));
        c2344009Gk.LJFF("enter_from", this.LLJILJILJ.LJIIIZ);
        c2344009Gk.LJFF("component_key", "bottom_button_drama");
        c2344009Gk.LJFF("component_type", "bottom_button");
        User author = this.LLJJ.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = null;
        }
        c2344009Gk.LJFF("anchor_author_id", uid);
        c2344009Gk.LJFF("group_id", this.LLJJ.getAid());
        HashMap<String, String> mobParams = this.LLJJ.getMobParams();
        if (mobParams != null && (str = mobParams.get("is_from_series_dnu_insertion")) != null) {
            str2 = str;
        }
        c2344009Gk.LJFF("is_from_series_dnu_insertion", str2);
        Aweme aweme = this.LLJJ;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
            c2344009Gk.LJII(logExtra);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_core_fdmt_component", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIIJ() {
        InterfaceC704770Rkh interfaceC704770Rkh = this.v1;
        if (interfaceC704770Rkh != null) {
            interfaceC704770Rkh.onDestroy();
        }
        long jLIZ = C0SFV.LIZ(this.LLJJ.mPaidContentInfo.getPaidCollectionId());
        if (jLIZ > 0) {
            I1(jLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onResume() {
        super.onResume();
        long jLIZ = C0SFV.LIZ(this.LLJJ.mPaidContentInfo.getPaidCollectionId());
        if (jLIZ > 0) {
            I1(jLIZ);
        }
    }

    public PaidContentImmersiveViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        Context context = this.LLLLLLLLLL;
        if (context != null) {
            D1(context);
        }
    }

    public final void D1(Context context) {
        if (this.u1 == null) {
            this.u1 = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bgu, null, false);
            View view = this.u1;
            if (view != null) {
                C2211631BhB.LJ(view, new AwS590S0100000_11(this, 171));
            }
            View view2 = this.u1;
            if (view2 != null) {
                C786410Ut5.I7(new AkS56S0200000_11(this, context, 4), view2);
            }
        }
    }

    public final void I1(long j) {
        String uid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612650s4F.LIZ(c2344009Gk, this.LLJJ);
        c2344009Gk.LJFF("series_feed_type", C718180SFc.LIZLLL(this.LLJJ, this.LLJILJILJ.LJIIIZ));
        String strLJ = C718180SFc.LJ(this.LLJJ);
        if (strLJ == null) {
            strLJ = "";
        }
        c2344009Gk.LJFF("series_video_type", strLJ);
        c2344009Gk.LJFF("series_component_type", C718180SFc.LIZJ(this.LLJJ, this.LLJILJILJ.LJIIIZ));
        c2344009Gk.LJFF("enter_from", this.LLJILJILJ.LJIIIZ);
        c2344009Gk.LJFF("component_key", "bottom_button_drama");
        c2344009Gk.LJFF("component_type", "bottom_button");
        c2344009Gk.LJFF("series_click_content", "breathing_light");
        User author = this.LLJJ.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = null;
        }
        c2344009Gk.LJFF("anchor_author_id", uid);
        c2344009Gk.LJFF("group_id", this.LLJJ.getAid());
        c2344009Gk.LJFF("duration", String.valueOf(j));
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("core_fdmt_component_stay_time", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.ForwardFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        VideoControl videoControl;
        if (aweme != null && (videoControl = aweme.getVideoControl()) != null) {
            videoControl.showProgressBar = 0;
        }
        super.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        InterfaceC704770Rkh interfaceC704770Rkh;
        TuxTextView tuxTextView;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        Aweme aweme;
        super.LJJIJIIJIL(i);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "short_drama_immersive_exposure_repeated_when_back", true, false) && (aweme = this.LLJJ) != null && C718190SFd.LIZLLL(aweme, this.LLJILJILJ.LJIIIZ)) {
            H1();
            F1();
        }
        String str = this.q1;
        if (str != null && (tuxTextView = this.f403p1) != null && tuxTextView.getVisibility() == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1612650s4F.LIZ(c2344009Gk, this.LLJJ);
            c2344009Gk.LJFF("enter_from", this.LLJILJILJ.LJIIIZ);
            c2344009Gk.LJFF("group_id", this.LLJJ.getAid());
            c2344009Gk.LJFF("component_key", str);
            c2344009Gk.LJFF("component_type", "high_tag");
            Aweme aweme2 = this.LLJJ;
            if (aweme2 != null && (paidContentInfo = aweme2.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
                c2344009Gk.LJII(logExtra);
            }
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("show_core_fdmt_component", c2344009Gk.LIZ);
            }
        }
        C705680RmA c705680RmA = this.o1;
        if (c705680RmA == null || (interfaceC704770Rkh = this.v1) == null) {
            return;
        }
        interfaceC704770Rkh.LJJL(c705680RmA);
    }

    @Override // com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LLLI(int i) {
        super.LLLI(i);
        VideoControl videoControl = this.LLJJ.getVideoControl();
        if (videoControl != null) {
            videoControl.showProgressBar = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        InterfaceC704770Rkh interfaceC704770Rkh = this.v1;
        if (interfaceC704770Rkh != null) {
            interfaceC704770Rkh.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b A[PHI: r5 r6
      0x012b: PHI (r5v11 boolean) = (r5v8 boolean), (r5v0 boolean) binds: [B:199:0x0279, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r6v10 int) = (r6v7 int), (r6v16 int) binds: [B:199:0x0279, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    @Override // com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(com.ss.android.ugc.aweme.feed.model.Aweme r21) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentImmersiveViewHolder.z1(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
