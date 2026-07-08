package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2277261EBo;
import X.InterfaceC2277271EBp;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S0201200_35 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0201200_35 awS0S0201200_35) {
        String message;
        String message2;
        String message3;
        InterfaceC2277271EBp interfaceC2277271EBp;
        String message4;
        int i = awS0S0201200_35.i2;
        String str = "";
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i == 405 && (interfaceC2277271EBp = ((C2277261EBo) awS0S0201200_35.l0).LIZ) != null) {
                        int i2 = (int) awS0S0201200_35.j3;
                        long j = awS0S0201200_35.j4;
                        Exception exc = (Exception) awS0S0201200_35.l1;
                        if (exc != null && (message4 = exc.getMessage()) != null) {
                            str = message4;
                        }
                        interfaceC2277271EBp.LIZ(i2, j, (Exception) awS0S0201200_35.l1, str);
                    }
                } else {
                    InterfaceC2277271EBp interfaceC2277271EBp2 = ((C2277261EBo) awS0S0201200_35.l0).LIZ;
                    if (interfaceC2277271EBp2 != null) {
                        int i3 = (int) awS0S0201200_35.j3;
                        long j2 = awS0S0201200_35.j4;
                        Exception exc2 = (Exception) awS0S0201200_35.l1;
                        if (exc2 != null && (message3 = exc2.getMessage()) != null) {
                            str = message3;
                        }
                        interfaceC2277271EBp2.LJIILL(i3, j2, (Exception) awS0S0201200_35.l1, str);
                    }
                }
            } else {
                InterfaceC2277271EBp interfaceC2277271EBp3 = ((C2277261EBo) awS0S0201200_35.l0).LIZ;
                if (interfaceC2277271EBp3 != null) {
                    int i4 = (int) awS0S0201200_35.j3;
                    long j3 = awS0S0201200_35.j4;
                    Exception exc3 = (Exception) awS0S0201200_35.l1;
                    if (exc3 != null && (message2 = exc3.getMessage()) != null) {
                        str = message2;
                    }
                    interfaceC2277271EBp3.LJFF(i4, j3, (Exception) awS0S0201200_35.l1, str);
                }
            }
        } else {
            InterfaceC2277271EBp interfaceC2277271EBp4 = ((C2277261EBo) awS0S0201200_35.l0).LIZ;
            if (interfaceC2277271EBp4 != null) {
                int i5 = (int) awS0S0201200_35.j3;
                long j4 = awS0S0201200_35.j4;
                Exception exc4 = (Exception) awS0S0201200_35.l1;
                if (exc4 != null && (message = exc4.getMessage()) != null) {
                    str = message;
                }
                interfaceC2277271EBp4.LIZ(i5, j4, (Exception) awS0S0201200_35.l1, str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0201200_35 awS0S0201200_35) {
        InterfaceC2277271EBp interfaceC2277271EBp;
        switch (awS0S0201200_35.i2) {
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                String str = C2277261EBo.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MSG_INFO_SINGLE_TO_MULTI_VIEW, code=");
                sbLIZ.append(awS0S0201200_35.j3);
                sbLIZ.append(", subCode=");
                sbLIZ.append(awS0S0201200_35.j4);
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                Object[] objArr = (Object[]) awS0S0201200_35.l0;
                if (objArr.length >= 2) {
                    Object obj = objArr[0];
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    boolean z = objArr[1] instanceof SurfaceView;
                    if (obj != null && (interfaceC2277271EBp = ((C2277261EBo) awS0S0201200_35.l1).LIZ) != null) {
                        interfaceC2277271EBp.LJJIJ();
                    }
                }
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                InterfaceC2277271EBp interfaceC2277271EBp2 = ((C2277261EBo) awS0S0201200_35.l1).LIZ;
                if (interfaceC2277271EBp2 != null) {
                    interfaceC2277271EBp2.LJIJJLI();
                }
                break;
            case 35:
                InterfaceC2277271EBp interfaceC2277271EBp3 = ((C2277261EBo) awS0S0201200_35.l1).LIZ;
                if (interfaceC2277271EBp3 != null) {
                    interfaceC2277271EBp3.LJ();
                }
                break;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0201200_35(int i, long j, long j2, Object[] objArr, C2277261EBo c2277261EBo, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.j3 = j;
        this.j4 = j2;
        this.l0 = objArr;
        this.l1 = c2277261EBo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0201200_35(int i, C2277261EBo c2277261EBo, long j, long j2, Exception exc, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2277261EBo;
        this.j3 = j;
        this.j4 = j2;
        this.l1 = exc;
    }
}
