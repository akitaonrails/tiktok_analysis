package lnn;

import X.AbstractC1557360qd4;
import X.C01S9;
import X.C05NX;
import X.C05YD;
import X.C0MZV;
import X.C11NZ;
import X.C1444900nhg;
import X.C1621190sI1;
import X.C1623620sLw;
import X.C1635820sfc;
import X.EnumC1159860gHw;
import X.EnumC1641370soZ;
import X.InterfaceC1157420gE0;
import X.InterfaceC1621080sHq;
import X.InterfaceC1621110sHt;
import X.InterfaceC1621550sIb;
import X.InterfaceC1622080sJS;
import X.InterfaceC1622600sKI;
import X.InterfaceC1623190sLF;
import X.InterfaceC1623780sMC;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625000sOA;
import X.InterfaceC1625410sOp;
import X.InterfaceC1626180sQ4;
import X.InterfaceC1628910sUT;
import X.InterfaceC1665180tQy;
import X.InterfaceC21358718iH;
import X.InterfaceC21363518j3;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public interface q extends InterfaceC1625000sOA {
    LiveEvent<Boolean> AD0();

    void AV();

    void Ac1(boolean z);

    void Aj2(InterfaceC21358718iH interfaceC21358718iH);

    C05YD<Boolean> BI2();

    void Bf1(InterfaceC1623780sMC interfaceC1623780sMC);

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1624480sNK C0();

    LiveEvent<C0MZV> C00();

    void DA1(boolean z);

    void EO1(boolean z);

    boolean Eh2();

    InterfaceC1621110sHt FV();

    void Gb1(InterfaceC1621550sIb interfaceC1621550sIb);

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1622570sKF
    /* synthetic */ InterfaceC1622080sJS I2(Function1<? super InterfaceC1622080sJS, Boolean> function1);

    LiveEvent<Boolean> IH0();

    void J80(boolean z);

    void KA1(boolean z);

    void Ku2(boolean z);

    void LLZLL();

    boolean Ln2();

    void Lx0();

    InterfaceC1628910sUT Mh0(Effect effect);

    boolean Mw1();

    void N32();

    void NJ(boolean z, boolean z2);

    LiveEvent<Unit> Na1();

    void O22(boolean z);

    void Ou1();

    void P20(C1623620sLw c1623620sLw);

    void PM(boolean z);

    LiveData<Pair<Boolean, Boolean>> QC0();

    void QG2();

    void RA(C0MZV c0mzv);

    boolean RB1();

    void RO(List<C1621190sI1> list);

    void RY1();

    LiveData<Effect> Ra0();

    LiveEvent<Unit> SO();

    LiveEvent<List<Effect>> SZ1();

    int T01();

    void T41(Bitmap bitmap);

    C1444900nhg TH();

    boolean Tw1(Effect effect);

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1623190sLF U();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ C11NZ<AbstractC1557360qd4> U6();

    void U72();

    InterfaceC1621080sHq Up2();

    LiveEvent<Unit> W40();

    void X90();

    LiveEvent<Effect> XE2();

    void Xd2(boolean z);

    C01S9<Long> Yg2();

    LiveEvent<Pair<Effect, Boolean>> ZL0();

    void aT0(InterfaceC1621550sIb interfaceC1621550sIb);

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    /* synthetic */ SafeHandler b1();

    InterfaceC1626180sQ4 bG0();

    void bM2();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ C11NZ<EnumC1159860gHw> dj();

    C05YD<InterfaceC1665180tQy> eK1();

    void eN();

    LiveEvent<Unit> f82();

    void fP();

    boolean g91();

    boolean gH1();

    LiveEvent<Unit> gO2();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ LifecycleOwner getLifecycleOwner();

    void h90(C1635820sfc c1635820sfc);

    List<String> i82();

    LiveEvent<Boolean> iF1();

    C05YD<InterfaceC1157420gE0> j00();

    LiveData<Boolean> j41();

    void jL(InterfaceC1622600sKI interfaceC1622600sKI);

    LiveEvent<InterfaceC1623780sMC> jN1();

    LiveEvent<Effect> jW1();

    void jt2(InterfaceC21358718iH interfaceC21358718iH);

    LiveEvent<Unit> mH1();

    void n00(Effect effect);

    void nE1(boolean z);

    LiveEvent<Unit> nP();

    String oT1();

    void om1(ArrayList<GreenScreenMaterial> arrayList);

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void qf();

    void rS(boolean z);

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void rf(InterfaceC1623190sLF interfaceC1623190sLF);

    boolean sJ();

    void sT0();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void sb(InterfaceC1622080sJS interfaceC1622080sJS);

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void sk(InterfaceC1622080sJS interfaceC1622080sJS);

    C05NX sx1();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void t8(Function1<? super InterfaceC1622080sJS, Boolean> function1);

    void vM0();

    void vT1(boolean z);

    void vY(InterfaceC1622080sJS interfaceC1622080sJS);

    LiveEvent<Unit> vb1();

    @Override // X.InterfaceC1625000sOA
    /* synthetic */ void vq(int i, int i2, int i3, String str);

    @Override // X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1625410sOp w4();

    void wC1(boolean z);

    InterfaceC21363518j3 wt2();

    void xC2();

    LiveEvent<Boolean> xJ();

    EnumC1641370soZ xe1();

    void y81(boolean z);
}
