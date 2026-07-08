package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C13LP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C932090aMZ;
import X.C932420aN6;
import X.C938060aWC;
import X.C953190aub;
import X.C953400auw;
import X.C953470av3;
import X.C953540avA;
import X.C953550avB;
import X.C953610avH;
import X.C979070baL;
import X.EnumC975850bV9;
import X.EnumC980440bcY;
import X.EnumC980470bcb;
import X.InterfaceC921620a5g;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AwS67S0210000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        C979070baL.LIZ((DataChannel) awS67S0210000_15.l0);
        if (C915980Zwa.LJFF().co0()) {
            C979070baL.LIZIZ((DataChannel) awS67S0210000_15.l0, "");
        } else {
            C979070baL.LIZLLL((DataChannel) awS67S0210000_15.l0, (EnumC975850bV9) awS67S0210000_15.l1, 0L, awS67S0210000_15.z2, 4);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        EnumC980470bcb enumC980470bcb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFeatureSwitch success: ");
        sbLIZ.append(((EnumC980440bcY) awS67S0210000_15.l0).name());
        sbLIZ.append(" isMainThread ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C20441214yg.LJIIIZ("MatchOptionViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (((EnumC980440bcY) awS67S0210000_15.l0) == EnumC980440bcY.AI_COMMENTARY) {
            IMatchAICommentaryService iMatchAICommentaryServiceLJ = C915980Zwa.LJ();
            boolean z = awS67S0210000_15.z2;
            MatchOptionViewModel matchOptionViewModel = (MatchOptionViewModel) awS67S0210000_15.l1;
            DataChannel dataChannel = matchOptionViewModel.LLILZ;
            if (matchOptionViewModel.LLILLJJLI) {
                enumC980470bcb = EnumC980470bcb.ANCHOR_DURING_MATCH_SETTING_PANEL;
            } else {
                enumC980470bcb = EnumC980470bcb.ANCHOR_PRE_MATCH_SETTING_PANEL;
            }
            iMatchAICommentaryServiceLJ.iE1(z, dataChannel, enumC980470bcb);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFeatureSwitch failed: ");
        sbLIZ.append(((EnumC980440bcY) awS67S0210000_15.l0).name());
        sbLIZ.append(" isMainThread ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        C20441214yg.LJFF("MatchOptionViewModel", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        ((MatchOptionViewModel) awS67S0210000_15.l1).xQ2(awS67S0210000_15.z2, ((EnumC980440bcY) awS67S0210000_15.l0).getUiUpdater(), ((EnumC980440bcY) awS67S0210000_15.l0).getRepoUpdater());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        ((C062P) obj).LIZ = new C938060aWC(awS67S0210000_15.z2, ((LiveWidget) awS67S0210000_15.l0).dataChannel, (InterfaceC921620a5g) awS67S0210000_15.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        boolean zLJFF;
        String str;
        C953540avA c953540avA;
        C953550avB c953550avB;
        NoticeboardTemplate noticeboardTemplate;
        Object obj2 = null;
        Long lLJIIIZ = null;
        if (awS67S0210000_15.z2) {
            if (((C953190aub) awS67S0210000_15.l0).LLILZ != null) {
                C953610avH.LJJI.getClass();
                str = C953610avH.LJJII;
            } else {
                str = null;
            }
            if (((C953190aub) awS67S0210000_15.l0).LLILZ != null) {
                lLJIIIZ = C953400auw.LJIIIZ();
            }
            if ((obj instanceof C953540avA) && (c953540avA = (C953540avA) obj) != null && (c953550avB = c953540avA.LIZ) != null && (noticeboardTemplate = c953550avB.LIZ) != null) {
                C953470av3.LIZ.getClass();
                zLJFF = C953470av3.LIZIZ(noticeboardTemplate, str, lLJIIIZ);
            } else {
                zLJFF = false;
            }
        } else {
            if (obj instanceof C953540avA) {
                obj2 = obj;
            }
            zLJFF = Intrinsics.LJFF(obj2, C13LP.LJJJJZI((List) awS67S0210000_15.l1));
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$5(AwS67S0210000_15 awS67S0210000_15, Object obj) {
        ((C932090aMZ) awS67S0210000_15.l0).LIZIZ((View) obj, new AwS559S0100000_15((C932420aN6) awS67S0210000_15.l1, 979), awS67S0210000_15.z2);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS67S0210000_15(X.EnumC980440bcY r3, com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.z2 = r5
            r1.l1 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS67S0210000_15.<init>(X.0bcY, com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0210000_15(C932090aMZ c932090aMZ, boolean z, C932420aN6 c932420aN6, int i) {
        super(1);
        this.$t = i;
        this.l0 = c932090aMZ;
        this.z2 = z;
        this.l1 = c932420aN6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS67S0210000_15(boolean z, boolean z2, C953190aub c953190aub, List<C953540avA> list) {
        super(1);
        this.$t = list;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c953190aub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0210000_15(boolean z, DataChannel dataChannel, EnumC975850bV9 enumC975850bV9, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = dataChannel;
        this.l1 = enumC975850bV9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0210000_15(boolean z, LiveWidget liveWidget, InterfaceC921620a5g interfaceC921620a5g, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = liveWidget;
        this.l1 = interfaceC921620a5g;
    }
}
