package com.bytedance.android.livesdk.profile.cell;

import X.AbstractC495800JcQ;
import X.C0JGY;
import X.C1087840ePm;
import X.C11JF;
import X.C16F5;
import X.C2188811AlT;
import X.C495920Jcc;
import X.C495980Jci;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC495780JcO;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class LikeCell extends AbstractC495800JcQ<Unit> implements GenericLifecycleObserver {
    public Context LLILZIL;
    public DataChannel LLILZLL;
    public LiveIconView LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public long LLJI;
    public C0JGY LLJIJIL;
    public boolean LLJILJIL;
    public final EnumC495780JcO LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.h0j;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        C11JF c11jf;
        C0JGY c0jgy = this.LLJIJIL;
        if (c0jgy != null) {
            C1087840ePm c1087840ePm = (C1087840ePm) c0jgy;
            c1087840ePm.LJIIL.LJ();
            C11JF c11jf2 = c1087840ePm.LJIILIIL;
            if ((c11jf2 == null || !c11jf2.isDisposed()) && (c11jf = c1087840ePm.LJIILIIL) != null) {
                c11jf.dispose();
            }
            c1087840ePm.LJFF = 0L;
        }
        this.LLJILJIL = true;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        C495980Jci c495980Jci = this.LL;
        this.LLILZIL = c495980Jci.LIZ;
        this.LLILZLL = ((C495920Jcc) c495980Jci).LJIIJJI;
        View view = this.LLILLL;
        this.LLIZ = view != null ? (LiveIconView) view.findViewById(R.id.mnv) : null;
        View view2 = this.LLILLL;
        this.LLIZLLLIL = view2 != null ? (C16F5) view2.findViewById(R.id.mo7) : null;
        View view3 = this.LLILLL;
        this.LLJ = view3 != null ? (C16F5) view3.findViewById(R.id.mnh) : null;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJII() {
        return this.LLJJ;
    }

    public LikeCell(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLJILJIL = true;
        c495920Jcc.LIZIZ.getLifecycle().addObserver(this);
        this.LLJILJILJ = EnumC495780JcO.LIKE;
        this.LLJILLL = c495920Jcc.LJ;
        this.LLJJ = true;
    }

    public final void LJIIZILJ(MotionEvent motionEvent) {
        LiveIconView liveIconView;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (liveIconView = this.LLIZ) != null) {
                liveIconView.setIconAttr(R.attr.dul);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLIZ;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.dus);
    }

    public final void LJIJ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z2;
        String strLJIJI;
        ViewGroup.LayoutParams layoutParams3;
        if (!z) {
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C16F5 c16f52 = this.LLIZLLLIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            C16F5 c16f53 = this.LLIZLLLIL;
            if (c16f53 != null) {
                c16f53.setText(2131842096);
            }
            View view = this.LLILLL;
            if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
                layoutParams3.width = (int) C497740JfY.LIZIZ(60.0f);
                View view2 = this.LLILLL;
                if (view2 != null) {
                    C786410Ut5.W5(view2, layoutParams3);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJI > 0) {
            C16F5 c16f54 = this.LLJ;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 0);
            }
            C16F5 c16f55 = this.LLIZLLLIL;
            if (c16f55 != null) {
                C786410Ut5.LLJJJJ(c16f55, 8);
            }
            C16F5 c16f56 = this.LLJ;
            if (c16f56 != null) {
                c16f56.setTypeface(c16f56.getTypeface(), 2);
            }
            C16F5 c16f57 = this.LLJ;
            if (c16f57 != null) {
                long j = this.LLJI;
                if (1 <= j && j < 10) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(this.LLJI);
                    sbLIZ.append("  ");
                    strLJIJI = C2188811AlT.LIZIZ(sbLIZ);
                } else if (10 <= j && j < 100) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(this.LLJI);
                    sbLIZ2.append(' ');
                    strLJIJI = C2188811AlT.LIZIZ(sbLIZ2);
                } else if (j > 99) {
                    strLJIJI = "+99 ";
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131842096);
                    if (strLJIJI == null) {
                        strLJIJI = "";
                    }
                }
                c16f57.setText(strLJIJI);
            }
            View view3 = this.LLILLL;
            if (view3 == null || (layoutParams2 = view3.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.width = (int) C497740JfY.LIZIZ(60.0f);
            View view4 = this.LLILLL;
            if (view4 == null) {
                return;
            }
            C786410Ut5.W5(view4, layoutParams2);
            return;
        }
        C16F5 c16f58 = this.LLJ;
        if (c16f58 != null) {
            C786410Ut5.LLJJJJ(c16f58, 8);
        }
        C16F5 c16f59 = this.LLIZLLLIL;
        if (c16f59 != null) {
            C786410Ut5.LLJJJJ(c16f59, 0);
        }
        C16F5 c16f510 = this.LLIZLLLIL;
        if (c16f510 != null) {
            c16f510.setText(2131842096);
        }
        View view5 = this.LLILLL;
        if (view5 == null || (layoutParams = view5.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
        View view6 = this.LLILLL;
        if (view6 == null) {
            return;
        }
        C786410Ut5.W5(view6, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r13, java.lang.Object r14) {
        /*
            r12 = this;
            boolean r0 = r12.LJIIIIZZ(r13)
            r3 = 0
            if (r0 != 0) goto Lb1
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            if (r0 == 0) goto Lae
            boolean r5 = r0.qW(r13)
        L15:
            X.0Jci r0 = r12.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF
            com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession r0 = r0.groupLiveSession
            r4 = 1
            if (r0 == 0) goto Lab
            boolean r0 = r0.isGroupLiveSession
            if (r0 != r4) goto Lab
            r0 = 1
        L23:
            r8 = 0
            if (r0 == 0) goto La8
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r12.LLILZLL
            if (r1 != 0) goto L2b
            r1 = r8
        L2b:
            java.lang.Class<com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList> r0 = com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList.class
            java.lang.Object r2 = r1.gg0(r0)
            X.00JH r2 = (X.C00JH) r2
            if (r2 == 0) goto La6
            long r0 = r13.getId()
            com.bytedance.android.livesdk.model.message.MemberInfo r0 = r2.LIZ(r0)
            if (r0 == 0) goto La4
            boolean r0 = r0.isStaged
            if (r0 != r4) goto La4
            r0 = 1
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L48:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto La8
            r5 = 1
        L4f:
            r12.LJIJ(r3)
            android.view.ViewGroup r11 = r12.LLILZ
            if (r11 == 0) goto L8d
            java.lang.Class<com.bytedance.android.livesdk.IBarrageService> r0 = com.bytedance.android.livesdk.IBarrageService.class
            X.006A r6 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.IBarrageService r6 = (com.bytedance.android.livesdk.IBarrageService) r6
            com.bytedance.ies.sdk.datachannel.DataChannel r7 = r12.LLILZLL
            if (r7 != 0) goto L63
            r7 = r8
        L63:
            android.content.Context r0 = r12.LLILZIL
            if (r0 == 0) goto L68
            r8 = r0
        L68:
            X.0Jci r0 = r12.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r0.LJFF
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r3 = r0.getCurrentUserId()
            X.0Jci r0 = r12.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            long r1 = r0.getId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La2
            r10 = 1
        L89:
            X.0ePm r8 = r6.AW(r7, r8, r9, r10, r11)
        L8d:
            r12.LLJIJIL = r8
            android.view.View r2 = r12.LLILLL
            if (r2 == 0) goto L9c
            Y.ATListenerS341S0200000_17 r1 = new Y.ATListenerS341S0200000_17
            r0 = 1
            r1.<init>(r12, r13, r0)
            r2.setOnTouchListener(r1)
        L9c:
            android.view.View r0 = r12.LLILLL
            X.C500260Jjc.LLFFF(r0)
        La1:
            return r5
        La2:
            r10 = 0
            goto L89
        La4:
            r0 = 0
            goto L44
        La6:
            r0 = r8
            goto L48
        La8:
            if (r5 == 0) goto La1
            goto L4f
        Lab:
            r0 = 0
            goto L23
        Lae:
            r5 = 0
            goto L15
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.profile.cell.LikeCell.LJIIIZ(com.bytedance.android.live.base.model.user.User, java.lang.Object):boolean");
    }
}
