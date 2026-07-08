package mn3;

import X.C1655760tBm;
import X.C1660560tJW;
import X.C385670FAf;
import X.EnumC1448590nnd;
import X.InterfaceC1650230t2r;
import X.InterfaceC2177841ALe;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public interface e0 extends InterfaceC1650230t2r {
    void CT(int i, int i2, boolean z);

    InterfaceC2177841ALe Gz0();

    void Hi2(int i, int i2, long j);

    boolean J61();

    void Mu0(Boolean bool, Boolean bool2);

    void OG2(int i, EnumC1448590nnd enumC1448590nnd);

    void QN2(boolean z);

    void VE(int i, int i2);

    void XB();

    LiveEvent<Unit> XJ2();

    LiveEvent<Unit> cI();

    LiveData<Boolean> ci0();

    C385670FAf<EnumC1448590nnd> dk();

    C1660560tJW dq2();

    void eZ1(FilterBean filterBean);

    boolean fU1();

    LiveEvent<Unit> j42();

    EnumC1448590nnd kR1();

    void lo1(int i, int i2);

    C1655760tBm qd1();

    void rM(FilterBean filterBean, Float f);

    void vg(boolean z);

    void wb2(float f, float f2);

    int wn1(int i, VETrackParams vETrackParams);

    int zA2();

    void zr1(int i, int i2, Function1<? super VECameraSettings.Builder, Unit> function1, VEVideoEncodeSettings vEVideoEncodeSettings, Cert cert, Function0<Unit> function0, Function1<? super Boolean, Unit> function12);
}
