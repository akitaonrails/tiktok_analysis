package kotlin.jvm.internal;

import X.AbstractC928510aGn;
import X.C09AY;
import X.C0KVU;
import X.C1397620mTQ;
import X.C13LP;
import X.C334801Rq;
import X.C497740JfY;
import X.C766270U4b;
import X.C917920Zzi;
import X.C935770aSV;
import X.C948450amx;
import X.EnumC919910a2v;
import X.EnumC920250a3T;
import X.InterfaceC302401Fe;
import X.InterfaceC920110a3F;
import X.InterfaceC927510aFB;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.ExpandEntity;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class AwS22S2200000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S2200000_15 awS22S2200000_15, Object obj) {
        String str;
        InterfaceC927510aFB interfaceC927510aFB;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        C935770aSV c935770aSV = (C935770aSV) C13LP.LJJJLL((List) obj);
        if (c935770aSV != null && (str = c935770aSV.LIZIZ) != null) {
            final ExpandEntity expandEntity = (ExpandEntity) awS22S2200000_15.l2;
            C334801Rq c334801Rq = new C334801Rq(awS22S2200000_15.s0, (Long) awS22S2200000_15.l3, awS22S2200000_15.s1);
            expandEntity.getClass();
            C948450amx c948450amx = C948450amx.LIZIZ;
            Object objLJIIIZ = c948450amx.LJIIIZ("ZOOM_SERVICE");
            if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null) {
                final boolean z = true;
                final boolean z2 = false;
                if (interfaceC927510aFB.LJIL(str) == EnumC920250a3T.ZOOM_DISABLED) {
                    InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) c948450amx.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJIIZILJ(str)) != null && (user = linkPlayerInfo.mUser) != null) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843609, C0KVU.LIZ(user)));
                    }
                } else if (interfaceC927510aFB.LJIIIIZZ() && !Intrinsics.LJFF(interfaceC927510aFB.LJIILIIL(), str) && !C917920Zzi.LIZ()) {
                    interfaceC927510aFB.LJI(str, new InterfaceC920110a3F() { // from class: X.0aOO
                        @Override // X.InterfaceC920110a3F
                        public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZJ(String str2) {
                            if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                                if (z2) {
                                    C766270U4b.LIZLLL(2131843136);
                                } else {
                                    C766270U4b.LIZLLL(2131843134);
                                }
                            }
                            expandEntity.LJJIJ();
                            ExpandEntity expandEntity2 = expandEntity;
                            C20361214lm c20361214lm = expandEntity2.LLJJJJLIIL;
                            if (c20361214lm == null) {
                                return;
                            }
                            PlayEntityUtilKt.LIZJ(expandEntity2, "", c20361214lm, expandEntity2.LLJJL, true);
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZ(int i, String str2, String str3, Throwable th) {
                            ExpandEntity expandEntity2 = expandEntity;
                            C20361214lm c20361214lm = expandEntity2.LLJJJJLIIL;
                            if (c20361214lm == null) {
                                return;
                            }
                            PlayEntityUtilKt.LIZIZ(expandEntity2, c20361214lm, expandEntity2.LLJJL, str3, i, 8);
                        }
                    }, true, false, true, true, EnumC919910a2v.FROM_PLAYBOOK, c334801Rq);
                } else {
                    if (interfaceC927510aFB.LJIL(str) != EnumC920250a3T.CAN_ZOOM_TO_MIN) {
                        z = false;
                    }
                    interfaceC927510aFB.LJI(str, new InterfaceC920110a3F() { // from class: X.0aOO
                        @Override // X.InterfaceC920110a3F
                        public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZJ(String str2) {
                            if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                                if (z) {
                                    C766270U4b.LIZLLL(2131843136);
                                } else {
                                    C766270U4b.LIZLLL(2131843134);
                                }
                            }
                            expandEntity.LJJIJ();
                            ExpandEntity expandEntity2 = expandEntity;
                            C20361214lm c20361214lm = expandEntity2.LLJJJJLIIL;
                            if (c20361214lm == null) {
                                return;
                            }
                            PlayEntityUtilKt.LIZJ(expandEntity2, "", c20361214lm, expandEntity2.LLJJL, true);
                        }

                        @Override // X.InterfaceC920110a3F
                        public final void LIZ(int i, String str2, String str3, Throwable th) {
                            ExpandEntity expandEntity2 = expandEntity;
                            C20361214lm c20361214lm = expandEntity2.LLJJJJLIIL;
                            if (c20361214lm == null) {
                                return;
                            }
                            PlayEntityUtilKt.LIZIZ(expandEntity2, c20361214lm, expandEntity2.LLJJL, str3, i, 8);
                        }
                    }, true, false, true, true, EnumC919910a2v.FROM_PLAYBOOK, c334801Rq);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S2200000_15 awS22S2200000_15, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(2, awS22S2200000_15.s0, new AwS594S0100000_15((Function0) awS22S2200000_15.l2, (Function0<Unit>) 444));
        c1397620mTQ.LIZJ(1, awS22S2200000_15.s1, new AwS594S0100000_15((Function0) awS22S2200000_15.l3, (Function0<Unit>) 445));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S2200000_15(ExpandEntity expandEntity, String str, Long l, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = expandEntity;
        this.s0 = str;
        this.l3 = l;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S2200000_15(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = function0;
    }
}
