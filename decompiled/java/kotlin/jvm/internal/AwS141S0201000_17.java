package kotlin.jvm.internal;

import X.AbstractC1098270egb;
import X.AbstractC1111600f26;
import X.C08D5;
import X.C09AY;
import X.C0IK5;
import X.C1095500ec8;
import X.C1098290egd;
import X.C1112390f3N;
import X.C1134410fct;
import X.C1134640fdG;
import X.C1143780fs0;
import X.C1146270fw1;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1134590fdB;
import X.InterfaceC2280931EPr;
import Y.ARunnableS86S0200000_17;
import android.os.Handler;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandShowSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdkapi.host.IHostResource;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS141S0201000_17 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS141S0201000_17 awS141S0201000_17) {
        AbstractC1098270egb abstractC1098270egb = ((NewTopRightBannerWidget) awS141S0201000_17.l0).LLIZLLLIL;
        if (abstractC1098270egb != null) {
            abstractC1098270egb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(106.0f))), Math.min(awS141S0201000_17.i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(72.0f)))), (C1098290egd) awS141S0201000_17.l1);
        }
        Handler handlerLIZ = C0IK5.LIZ();
        NewTopRightBannerWidget newTopRightBannerWidget = (NewTopRightBannerWidget) awS141S0201000_17.l0;
        C08D5.LIZIZ(handlerLIZ, new ARunnableS86S0200000_17(newTopRightBannerWidget, (C1098290egd) awS141S0201000_17.l1, 21), newTopRightBannerWidget, LiveMainFrameworkExpandShowSetting.INSTANCE.value());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS141S0201000_17 awS141S0201000_17) {
        List<TaskInfo> list;
        CopyOnWriteArrayList<C1134410fct> copyOnWriteArrayList = TaskManagerV2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[old] [load scene:");
        sbLIZ.append((EnumC1134590fdB) awS141S0201000_17.l0);
        sbLIZ.append("] [scene type:");
        sbLIZ.append(awS141S0201000_17.i2);
        sbLIZ.append("] ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20441214yg.LIZIZ("IncentiveDebug", "----------------------------------------");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('\n');
        C20441214yg.LJIIL("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ2));
        int i = 0;
        int i2 = 0;
        for (C1134410fct c1134410fct : copyOnWriteArrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('[');
                sbLIZ3.append(i2);
                sbLIZ3.append(']');
                C1134640fdG.LJ(c1134410fct, C2188811AlT.LIZIZ(sbLIZ3));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C20441214yg.LIZIZ("IncentiveDebug", "----------------------------------------");
        TaskInfoResponse.UserTaskInfo userTaskInfo = ((TaskInfoResponse.Data) awS141S0201000_17.l1).userTaskInfo;
        if (userTaskInfo != null) {
            list = userTaskInfo.taskInfos;
        } else {
            list = null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[new] [load scene:");
        sbLIZ4.append((EnumC1134590fdB) awS141S0201000_17.l0);
        sbLIZ4.append("] [scene type:");
        sbLIZ4.append(awS141S0201000_17.i2);
        sbLIZ4.append(']');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        C20441214yg.LIZIZ("IncentiveDebug", "----------------------------------------");
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append('\n');
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ5));
        if (list != null) {
            for (TaskInfo taskInfo : list) {
                int i4 = i + 1;
                if (i >= 0) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append('[');
                    sbLIZ6.append(i);
                    sbLIZ6.append(']');
                    C1134640fdG.LIZJ(taskInfo, C2188811AlT.LIZIZ(sbLIZ6));
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            C20441214yg.LJIIL("IncentiveDebug", "task info is null");
        }
        C20441214yg.LIZIZ("IncentiveDebug", "----------------------------------------");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS141S0201000_17 awS141S0201000_17) {
        IHostResource iHostResource;
        String str;
        C1095500ec8 c1095500ec8 = ((FansClubJoinDialog) awS141S0201000_17.l0).LLLF;
        boolean z = false;
        if (c1095500ec8 != null && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null && iHostResource.u61(c1095500ec8.LJ)) {
            FansClubJoinDialog fansClubJoinDialog = (FansClubJoinDialog) awS141S0201000_17.l0;
            final C1095500ec8 c1095500ec82 = fansClubJoinDialog.LLLF;
            if (c1095500ec82 != null) {
                if (awS141S0201000_17.i2 == 0) {
                    z = true;
                }
                final AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(fansClubJoinDialog, (FansClubJoinDialog) awS141S0201000_17.l1, (Function0<Unit>) 77);
                final AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17((FansClubJoinDialog) awS141S0201000_17.l0, 450);
                String str2 = c1095500ec82.LJ;
                if (!z) {
                    str = c1095500ec82.LJFF;
                } else {
                    str = c1095500ec82.LJI;
                }
                String strLJIIL = C1143780fs0.LJIIL(str2, str);
                C500260Jjc.LLFFF(c1095500ec82.LIZ);
                if (!Intrinsics.LJFF(strLJIIL, "")) {
                    if (c1095500ec82.LIZLLL == null) {
                        c1095500ec82.LIZLLL = c1095500ec82.LIZJ.createLiveGiftPlayController(c1095500ec82.LIZ.getContext(), c1095500ec82.LIZIZ, c1095500ec82.LIZJ.buildDelegateGiftPlayListener(new InterfaceC2280931EPr() { // from class: X.0ecB
                            @Override // X.InterfaceC2280931EPr
                            public final void LIZIZ() {
                            }

                            @Override // X.InterfaceC2280931EPr
                            public final void onStart() {
                            }

                            @Override // X.InterfaceC2280931EPr
                            public final void onStop() {
                            }

                            @Override // X.InterfaceC2280931EPr
                            public final void LJII() {
                                awS418S0200000_17.invoke();
                            }

                            @Override // X.InterfaceC2280931EPr
                            public final void onEnd() {
                                C500260Jjc.LJIILIIL(c1095500ec82.LIZ);
                                awS561S0100000_17.invoke();
                            }

                            @Override // X.InterfaceC2280931EPr
                            public final void LIZ(int i, String str3, boolean z2) {
                                C500260Jjc.LJIILIIL(c1095500ec82.LIZ);
                                awS561S0100000_17.invoke();
                            }
                        }), c1095500ec82.LIZ);
                    }
                    c1095500ec82.LIZJ.setKeepLastFrame(c1095500ec82.LIZLLL, true);
                    if (c1095500ec82.LIZJ.start(c1095500ec82.LIZLLL, strLJIIL, 0L) != null) {
                        awS418S0200000_17.invoke();
                        C500260Jjc.LJIILIIL(c1095500ec82.LIZ);
                        awS561S0100000_17.invoke();
                    }
                } else {
                    awS418S0200000_17.invoke();
                    C500260Jjc.LJIILIIL(c1095500ec82.LIZ);
                    awS561S0100000_17.invoke();
                }
            }
        } else {
            ((Function0) awS141S0201000_17.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS141S0201000_17 awS141S0201000_17) {
        AbstractC1111600f26 abstractC1111600f26 = ((C1112390f3N) awS141S0201000_17.l0).LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.notifyItemChanged(awS141S0201000_17.i2, awS141S0201000_17.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS141S0201000_17 awS141S0201000_17) {
        C1324720kZq c1324720kZq;
        Function0 function0 = (Function0) awS141S0201000_17.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1146270fw1 c1146270fw1 = (C1146270fw1) awS141S0201000_17.l1;
        if (c1146270fw1.LLJJ) {
            if (c1146270fw1.LLILLJJLI) {
                C1324720kZq c1324720kZq2 = c1146270fw1.LLILZ;
                if (c1324720kZq2 != null) {
                    C500260Jjc.LLFFF(c1324720kZq2);
                    C786410Ut5.h5(c1324720kZq2, 0.0f);
                }
            } else {
                C1324720kZq c1324720kZq3 = c1146270fw1.LLILZLL;
                if (c1324720kZq3 != null) {
                    int i = awS141S0201000_17.i2;
                    C500260Jjc.LLFFF(c1324720kZq3);
                    c1324720kZq3.setActualImageResource(c1146270fw1.LJI(i, c1146270fw1.LLJ));
                    C786410Ut5.h5(c1324720kZq3, 0.0f);
                }
            }
        }
        C1146270fw1 c1146270fw12 = (C1146270fw1) awS141S0201000_17.l1;
        if (!c1146270fw12.LLJJ && !c1146270fw12.LLILLJJLI && (c1324720kZq = c1146270fw12.LLILZLL) != null) {
            C500260Jjc.LLFFF(c1324720kZq);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0201000_17(C1112390f3N c1112390f3N, int i, Object obj, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1112390f3N;
        this.i2 = i;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0201000_17(EnumC1134590fdB enumC1134590fdB, int i, TaskInfoResponse.Data data, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = enumC1134590fdB;
        this.i2 = i;
        this.l1 = data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0201000_17(NewTopRightBannerWidget newTopRightBannerWidget, int i, C1098290egd c1098290egd, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = newTopRightBannerWidget;
        this.i2 = i;
        this.l1 = c1098290egd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS141S0201000_17(FansClubJoinDialog fansClubJoinDialog, int i, AwS561S0100000_17 awS561S0100000_17, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = fansClubJoinDialog;
        this.i2 = i;
        this.l1 = awS561S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS141S0201000_17(Function0 function0, Function0<Unit> function02, C1146270fw1 c1146270fw1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = function02;
        this.i2 = c1146270fw1;
    }
}
