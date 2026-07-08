package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C01GW;
import X.C0WZX;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C1559260qg8;
import X.C1572660r1k;
import X.C1637806bA;
import X.C197039127h;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C2201941BFw;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C298690BnH;
import X.C343970De7;
import X.C452501pT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS165S0100000_31;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS466S0200000_31;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SelectedWidgetAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public View LLJIJIL;
    public C197039127h LLJILJIL;
    public String LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectedWidgetAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectedWidgetAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1859), AFwS276S0000000_31.get$arr$(219), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1572660r1k.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1211));
        this.LLJILJILJ = "click_close";
    }

    public final void Ho() {
        this.LLJILJILJ = "click_done";
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        VideoTagFriendsListViewModel videoTagFriendsListViewModelJo = Jo();
        Intent intent = new Intent();
        boolean z = videoTagFriendsListViewModelJo.xQ2().size() != videoTagFriendsListViewModelJo.vQ2().getTagged().size();
        List<IMUser> listLLIIII = C13LP.LLIIII(videoTagFriendsListViewModelJo.xQ2());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        for (IMUser iMUser : listLLIIII) {
            if (!z && !videoTagFriendsListViewModelJo.vQ2().getTagged().contains(iMUser)) {
                z = true;
            }
            IMUser.Companion.getClass();
            arrayList.add(C2201941BFw.LJI(iMUser));
        }
        List<InteractionTagUserInfo> listLIZIZ = C19719512Dh.LIZIZ(arrayList);
        if (z) {
            Aweme aweme = videoTagFriendsListViewModelJo.vQ2().getAweme();
            if (aweme != null) {
                InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
                if (interactionTagInfo != null) {
                    interactionTagInfo.setTaggedUsers(listLIZIZ);
                } else {
                    aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", listLIZIZ));
                }
                C1440005kM.LIZ(new InteractionTagInfoEvent(aweme));
            }
            intent.putExtra("tagged_user_list", new ArrayList(listLIZIZ));
            intent.putExtra("need_update", z);
        }
        C2204961BRm.LLJJIJIL(-1, intent, c19egLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pZNHPzyEvNQsopSpSHfDh1hhUGZmpFJ/irwz5", null));
        c19egLIZ.finish();
    }

    public final VideoTagFriendsListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoTagFriendsListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
      0x002a: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v6 java.lang.String) binds: [B:8:0x0020, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel r5 = r6.Jo()
            java.lang.String r4 = r6.LLJILJILJ
            java.lang.String r0 = "click_done"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L10
            r5.LLJJI = r4
        L10:
            boolean r0 = X.C298690BnH.LIZJ()
            java.lang.String r3 = "close_tag_mention_page"
            if (r0 == 0) goto L48
            java.lang.String r2 = r5.LLJJI
            java.lang.String r1 = "other"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r0 != 0) goto L2a
            java.lang.String r1 = "click_close"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r0 == 0) goto L2b
        L2a:
            r4 = r1
        L2b:
            kotlin.jvm.internal.AwS145S1100000_31 r1 = new kotlin.jvm.internal.AwS145S1100000_31     // Catch: java.lang.Throwable -> L3b
            r0 = 10
            r1.<init>(r5, r4, r0)     // Catch: java.lang.Throwable -> L3b
            X.C737520SwQ.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L3b
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3b
            goto L64
        L3b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L64
        L48:
            kotlin.jvm.internal.AwS145S1100000_31 r1 = new kotlin.jvm.internal.AwS145S1100000_31     // Catch: java.lang.Throwable -> L58
            r0 = 11
            r1.<init>(r5, r4, r0)     // Catch: java.lang.Throwable -> L58
            X.C737520SwQ.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L58
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L58
            goto L64
        L58:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L64:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tag.assem.SelectedWidgetAssem.onDestroy():void");
    }

    public final void Go(boolean z) {
        if (z) {
            this.LLJILJILJ = "click_done";
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
        Jo().DQ2(z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        if (!C298690BnH.LIZJ()) {
            C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 312));
        }
        this.LLJIJIL = LJJIJL().findViewById(R.id.cgk);
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.g31);
        C786410Ut5.U8(c197039127h, new ACListenerS165S0100000_31(this, 88));
        this.LLJILJIL = c197039127h;
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            View view2 = this.LLJIJIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
        }
        VideoTagFriendsListViewModel videoTagFriendsListViewModelJo = Jo();
        subscribe(videoTagFriendsListViewModelJo, C736820SvI.LIZIZ(videoTagFriendsListViewModelJo.usedInReusedScene), null, new AwS645S0100000_31(this, 67));
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.15ND
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILZ;
            }
        }, null, new AwS466S0200000_31(this, c19egLIZ, 3), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.15NE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILZIL;
            }
        }, null, new AwS455S0200000_19(this, c19egLIZ, 24), 6);
    }

    public final void setLoading(boolean z) {
        C197039127h c197039127h = this.LLJILJIL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setLoading(z);
        Jo().LLJILJIL = z;
    }
}
