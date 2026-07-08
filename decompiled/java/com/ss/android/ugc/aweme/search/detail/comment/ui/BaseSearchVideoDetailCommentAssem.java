package com.ss.android.ugc.aweme.search.detail.comment.ui;

import X.AnonymousClass0956;
import X.C01GW;
import X.C03H5;
import X.C099F;
import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C0RD6;
import X.C0RDX;
import X.C0RQ4;
import X.C1339950kyP;
import X.C13LE;
import X.C14EU;
import X.C1524805y2;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C420860Geq;
import X.C436260H8u;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736490Sul;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448280Hhy;
import X.InterfaceC665370Q7z;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.comment.ability.SearchDetailCommentScope;
import com.ss.android.ugc.aweme.search.detail.comment.viewmodel.SearchDetailCommentVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS114S0101000_6;
import kotlin.jvm.internal.AwS475S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSearchVideoDetailCommentAssem<T extends C03H5> extends BaseCellSlotComponent<T> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6((BaseSearchVideoDetailCommentAssem) this, 550));
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public C436260H8u LLLFF;
    public C099F LLLFFI;
    public AnonymousClass0956 LLLFZ;
    public final C01GW LLLI;
    public boolean LLLII;
    public volatile InterfaceC448280Hhy LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseSearchVideoDetailCommentAssem.class, "ability", "getAbility()Lcom/ss/android/ugc/aweme/search/detail/comment/ability/SearchDetailCommentAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseSearchVideoDetailCommentAssem.class, "searchDetailCommentVM", "getSearchDetailCommentVM()Lcom/ss/android/ugc/aweme/search/detail/comment/viewmodel/SearchDetailCommentVM;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BaseSearchVideoDetailCommentAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchDetailCommentVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 553), null, AFwS236S0000000_6.get$arr$(269));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS236S0000000_6.get$arr$(270));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS236S0000000_6.get$arr$(271));
        this.LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(122));
        this.LLLI = C452501pT.LIZIZ(new AwS550S0100000_6((BaseSearchVideoDetailCommentAssem) this, 552));
    }

    public abstract void Gp(C420860Geq c420860Geq, int i);

    public abstract boolean Ip();

    public void Jp() {
    }

    public abstract void Qp(C420860Geq c420860Geq, int i);

    public abstract TuxTextView Tp(View view);

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchDetailCommentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailCommentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC448280Hhy Ep() {
        /*
            r4 = this;
            X.0Hhy r0 = r4.LLLIIII
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0Hhy r0 = r4.LLLIIII     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLIIIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLIIIIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIIIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.detail.comment.ability.SearchDetailCommentScope> r1 = com.ss.android.ugc.aweme.search.detail.comment.ability.SearchDetailCommentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLIIIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0Hhy> r0 = X.InterfaceC448280Hhy.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0Hhy r0 = (X.InterfaceC448280Hhy) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLIIII = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem.Ep():X.0Hhy");
    }

    public final SearchDetailCommentVM Fp() {
        return (SearchDetailCommentVM) this.LLJLLL.getValue(this, LLLIIL[1]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        SearchDetailCommentVM searchDetailCommentVMFp = Fp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C724270Sb3 c724270Sb32 = this.LLJI;
        searchDetailCommentVMFp.wQ2(aweme, System.currentTimeMillis(), fragmentLJI, (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLLF) {
            this.LLLF = false;
            if (LJJIJL().getVisibility() == 0) {
                C1524805y2.LIZIZ(0L, new AwS550S0100000_6((BaseSearchVideoDetailCommentAssem) this, 551));
            }
        }
    }

    public final void Bp() {
        C337180DJs.LIZ(LJJIJL());
        AnonymousClass0956 anonymousClass0956 = this.LLLFZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        SearchDetailCommentVM searchDetailCommentVMFp = Fp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C724270Sb3 c724270Sb32 = this.LLJI;
        searchDetailCommentVMFp.wQ2(aweme, System.currentTimeMillis(), fragmentLJI, (VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_legacy_internal_video_event", new AwS585S0100000_6((BaseSearchVideoDetailCommentAssem) this, 150));
    }

    @C14EU
    public final void onCommentDiggChangeEventNew(C1339950kyP c1339950kyP) {
        String cid;
        String str = c1339950kyP.LIZ;
        Comment comment = Fp().getState().LL;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        if (!Intrinsics.LJFF(str, cid)) {
            return;
        }
        SearchDetailCommentVM searchDetailCommentVMFp = Fp();
        int i = c1339950kyP.LIZJ;
        searchDetailCommentVMFp.getClass();
        searchDetailCommentVMFp.setState(new AwS114S0101000_6(searchDetailCommentVMFp, i, 1));
    }

    @C14EU
    public final void onScrolledToProfileTab(C736490Sul c736490Sul) {
        this.LLLF = false;
        Bp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, Fp(), new C2217381BqS() { // from class: X.0H9A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C448260Hhw) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Hhx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C448260Hhw) obj).LLILLJJLI);
            }
        }, null, new AwS475S0200000_6((BaseSearchVideoDetailCommentAssem) this, view, (View) 0), 12);
        setComponentClickStatusExperimental(view, EnumC700430Rdh.POSITIVE);
        C786410Ut5.I7(new ACListenerS115S0200000_11(this, view, 7), view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0His
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, null, new AwS620S0100000_6(this, 53), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0HC1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 54), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Hhz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS620S0100000_6(this, 52), 6);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C0RQ4.LIZ() == 0 && this.LLLF) {
            Object value = this.LLJLLIL.getValue();
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(value, aid)) {
                return;
            }
        }
        C337180DJs.LIZ(LJJIJL());
    }
}
