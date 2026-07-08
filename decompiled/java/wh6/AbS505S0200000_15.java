package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C00UM;
import X.C09JN;
import X.C11S5;
import X.C1701940uOG;
import X.C1954807lC;
import X.C354001Za;
import X.C426160GnO;
import X.C465360IMs;
import X.C480460Ism;
import X.C936690aTz;
import X.C937150aUj;
import X.C937170aUl;
import X.C963060bAW;
import X.C963190bAj;
import X.C972020bOy;
import X.C972060bP2;
import X.C972220bPI;
import X.C972230bPJ;
import X.EnumC937180aUm;
import X.InterfaceC971990bOv;
import X.InterfaceC972070bP3;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS115S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.CancelOutRoomApplyParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AbS505S0200000_15 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS505S0200000_15 abS505S0200000_15, View view) {
        int i;
        if (view != null) {
            ((C972230bPJ) abS505S0200000_15.l0).LJ = !r1.LJ;
            C972220bPI c972220bPI = (C972220bPI) abS505S0200000_15.l1;
            C426160GnO c426160GnO = c972220bPI.LL;
            if (c426160GnO != null) {
                c426160GnO.addView(c972220bPI.LLILLL);
                if (((C972230bPJ) abS505S0200000_15.l0).LJ) {
                    i = 0;
                } else {
                    i = 2;
                }
                c426160GnO.setMaxTagLines(i);
            }
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS115S0100000_15((C972220bPI) abS505S0200000_15.l1, 136));
        }
    }

    public static final void LIZ$1(AbS505S0200000_15 abS505S0200000_15, View view) {
        int i;
        if (view != null) {
            ((C972230bPJ) abS505S0200000_15.l0).LJ = !r1.LJ;
            C972220bPI c972220bPI = (C972220bPI) abS505S0200000_15.l1;
            C426160GnO c426160GnO = c972220bPI.LL;
            if (c426160GnO != null) {
                View view2 = c972220bPI.LLILLL;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c426160GnO, view2);
                c426160GnO.removeView(view2);
                if (((C972230bPJ) abS505S0200000_15.l0).LJ) {
                    i = 0;
                } else {
                    i = 2;
                }
                c426160GnO.setMaxTagLines(i);
            }
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS115S0100000_15((C972220bPI) abS505S0200000_15.l1, 134));
        }
    }

    public static final void LIZ$2(AbS505S0200000_15 abS505S0200000_15, View view) {
        if (view != null) {
            C937150aUj c937150aUj = (C937150aUj) abS505S0200000_15.l0;
            C936690aTz c936690aTz = (C936690aTz) abS505S0200000_15.l1;
            c937150aUj.getClass();
            GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem = c936690aTz.LIZIZ;
            if (guestApplyItem != null) {
                C480460Ism.LIZ().getClass();
                MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                CancelOutRoomApplyParams cancelOutRoomApplyParams = new CancelOutRoomApplyParams();
                cancelOutRoomApplyParams.channelId = guestApplyItem.channelId;
                cancelOutRoomApplyParams.roomId = guestApplyItem.roomId;
                cancelOutRoomApplyParams.userId = UserService.getInstance().user().getCurrentUserId();
                multiLiveApi.cancelOutRoomApply(cancelOutRoomApplyParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS184S0100000_15(c937150aUj, 145), new C09JN() { // from class: X.0Jli
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("StillInLineViewHolder@9668.onCancelClick$1$disposable$3");
                        Throwable th = (Throwable) obj;
                        Context contextLIZ = C176600m4.LIZ();
                        if (contextLIZ != null) {
                            C501540Jlg.LIZLLL(contextLIZ, th, 2131853460);
                        }
                        C1C7U.LIZIZ("StillInLineViewHolder@9668.onCancelClick$1$disposable$3");
                    }
                });
            }
            ((C937150aUj) abS505S0200000_15.l0).P5("cancel", (C936690aTz) abS505S0200000_15.l1);
        }
    }

    public static final void LIZ$3(AbS505S0200000_15 abS505S0200000_15, View view) {
        Long lValueOf;
        String str;
        if (view != null) {
            int i = C937170aUl.LIZ[((C936690aTz) abS505S0200000_15.l0).LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem = ((C936690aTz) abS505S0200000_15.l0).LIZJ;
                    if (guestInvitedItem != null) {
                        lValueOf = Long.valueOf(guestInvitedItem.roomId);
                    } else {
                        return;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem = ((C936690aTz) abS505S0200000_15.l0).LIZIZ;
                if (guestApplyItem == null) {
                    return;
                } else {
                    lValueOf = Long.valueOf(guestApplyItem.roomId);
                }
            }
            if (lValueOf != null) {
                List listSingletonList = Collections.singletonList(Long.valueOf(lValueOf.longValue()));
                if (((C936690aTz) abS505S0200000_15.l0).LIZ == EnumC937180aUm.APPLY) {
                    str = "apply_room_in_line";
                } else {
                    str = "invite_room_in_line";
                }
                C465360IMs.LIZ(str, false, listSingletonList);
                ((C937150aUj) abS505S0200000_15.l1).P5("room_head", (C936690aTz) abS505S0200000_15.l0);
                Function0<Unit> function0 = ((C937150aUj) abS505S0200000_15.l1).LLILLJJLI;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final void LIZ$4(AbS505S0200000_15 abS505S0200000_15, View view) {
        if (view != null) {
            C963060bAW c963060bAW = (C963060bAW) abS505S0200000_15.l0;
            if (c963060bAW.LJI) {
                c963060bAW.LJ.clear();
            }
            C963060bAW c963060bAW2 = (C963060bAW) abS505S0200000_15.l0;
            c963060bAW2.LJI = !c963060bAW2.LJI;
            ((C963190bAj) abS505S0200000_15.l1).N5(c963060bAW2);
        }
    }

    public static final void LIZ$5(AbS505S0200000_15 abS505S0200000_15, View view) {
        InterfaceC971990bOv interfaceC971990bOv;
        if (view != null && (interfaceC971990bOv = ((C972020bOy) abS505S0200000_15.l0).LL) != null) {
            interfaceC971990bOv.Ed((C00UM) abS505S0200000_15.l1);
        }
    }

    public static final void LIZ$6(AbS505S0200000_15 abS505S0200000_15, View view) {
        InterfaceC972070bP3 interfaceC972070bP3;
        if (view != null && (interfaceC972070bP3 = ((C972060bP2) abS505S0200000_15.l0).LL) != null) {
            interfaceC972070bP3.qP((C354001Za) abS505S0200000_15.l1);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS505S0200000_15(X.C936690aTz r4, X.C937150aUj r5, int r6) {
        /*
            r3 = this;
            r3.$t = r6
            int r6 = 2 - r6
            if (r6 == 0) goto L11
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r0 = 300(0x12c, double:1.48E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS505S0200000_15.<init>(X.0aTz, X.0aUj, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS505S0200000_15(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
