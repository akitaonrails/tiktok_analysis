package com.ss.android.ugc.aweme.ui.assem.feed;

import X.C01GW;
import X.C0SE6;
import X.C11JF;
import X.C1558520qew;
import X.C2153208c6;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C723850SaN;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.CollabFeedTagAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class CollabFeedTagAssem extends BaseCellSlotComponent<CollabFeedTagAssem> implements CollabFeedTagAbility, InterfaceC1554640qYg {
    public static final int LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public boolean LLJZIJLIL;
    public C11JF LLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 967));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 968));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 966));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(221));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.agf;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -916627069) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C11JF c11jf = this.LLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Bp(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r4 = 0
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
        Lb:
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = r6.getCollabInfo()
            if (r0 == 0) goto L42
            java.util.List<com.ss.android.ugc.aweme.feed.model.CollaboratorInfo> r1 = r0.collaborators
            if (r1 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.CollaboratorInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollaboratorInfo) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            r2.add(r0)
            goto L24
        L3a:
            r3 = r4
            goto Lb
        L3c:
            java.util.Set r1 = X.C13LP.LLIIJI(r2)
            if (r1 != 0) goto L44
        L42:
            X.08CX r1 = X.C08CX.INSTANCE
        L44:
            if (r3 == 0) goto L4a
            java.lang.String r4 = r3.getUid()
        L4a:
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = "author"
            return r0
        L57:
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L60
            java.lang.String r0 = "collaber"
            return r0
        L60:
            java.lang.String r0 = "user"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem.Bp(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0172 A[PHI: r0
      0x0172: PHI (r0v27 java.lang.String) = (r0v25 java.lang.String), (r0v39 java.lang.String) binds: [B:55:0x0168, B:43:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep(com.ss.android.ugc.aweme.feed.model.Aweme r16) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem.Ep(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.ability.CollabFeedTagAbility
    public final void Fr1(boolean z) {
        Object obj;
        this.LLJZIJLIL = z;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Ep(((VideoItemParams) obj).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        C384050F3z c384050F3z = new C384050F3z();
        Integer num = (Integer) C723850SaN.LJFF(this, "TAG_BACKGROUND_COLOR_RES");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.im;
        }
        c384050F3z.LIZIZ = Integer.valueOf(iIntValue);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        viewLJJIJL.setBackground(c384050F3z.LIZ(view.getContext()));
        C427690Gpr.LJI(LJJIJL(), null);
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 36), LJJIJL());
        TuxIconView tuxIconView = (TuxIconView) this.LLJLLIL.getValue();
        Integer num2 = (Integer) C723850SaN.LJFF(this, "TAG_CONTENT_COLOR_RES");
        int iIntValue3 = R.attr.ee;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = R.attr.ee;
        }
        tuxIconView.setTintColorRes(iIntValue2);
        TuxTextView tuxTextView = (TuxTextView) this.LLJLLL.getValue();
        Integer num3 = (Integer) C723850SaN.LJFF(this, "TAG_CONTENT_COLOR_RES");
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        }
        tuxTextView.setTextColorRes(iIntValue3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C2153208c6.LIZ().LIZJ, null, new C0SE6(this, null), 2);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Ep(videoItemParams.getAweme());
    }
}
