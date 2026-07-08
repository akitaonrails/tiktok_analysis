package com.bytedance.creativex.recorder.sticker.types.ar.arcore;

import X.AbstractC1622390sJx;
import X.C1524705y1;
import X.C1623370sLX;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1AIX;
import X.C1AIY;
import X.C1AIZ;
import X.C1DPV;
import X.C1DPW;
import X.C201955140j;
import X.C2177021AIa;
import X.C2253191DGz;
import X.EnumC21630319kz;
import X.EnumC2176441AFu;
import X.EnumC2176451AFv;
import X.EnumC2176461AFw;
import X.InterfaceC1623110sL7;
import X.InterfaceC1650230t2r;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS434S0200000_33;
import mn3.e0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class ARCoreStickerHandler extends AbstractC1622390sJx implements InterfaceC1623110sL7, GenericLifecycleObserver {
    public final InterfaceC1650230t2r LLILLJJLI;

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        C2253191DGz c2253191DGzZd1 = this.LLILLJJLI.Zd1();
        C1AIY c1aiy = new C1AIY();
        Cert certLIZIZ = C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_PROP_CANCEL, null);
        c2253191DGzZd1.getClass();
        C2253191DGz.LIZIZ(c2253191DGzZd1, "action_name_switch_ar_mode", certLIZIZ, new C2177021AIa(c1aiy, false));
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        if (!C1624570sNT.LJFF(effect)) {
            return false;
        }
        return effect.getTypes().contains("ARCore");
    }

    public ARCoreStickerHandler(LifecycleOwner lifecycleOwner, e0 e0Var) {
        this.LLILLJJLI = e0Var;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 80) {
            C201955140j.LJIIL("ARCoreStickerHandler received msg");
            if (TextUtils.isEmpty(str)) {
                C201955140j.LJIIL("ARCoreStickerHandler arg3 is empty");
                return;
            }
            try {
                C1AIY c1aiy = new C1AIY();
                JSONObject jSONObject = new JSONObject(str);
                c1aiy.LIZ = EnumC2176441AFu.values()[jSONObject.optInt("augmentedFaceMode", 0)];
                c1aiy.LIZIZ = EnumC2176451AFv.values()[jSONObject.optInt("cloudAnchorMode", 0)];
                c1aiy.LIZJ = C1AIZ.values()[jSONObject.optInt("depthMode", 0)];
                c1aiy.LIZLLL = EnumC21630319kz.values()[jSONObject.optInt("focusMode", 0)];
                c1aiy.LJ = EnumC2176461AFw.values()[jSONObject.optInt("lightEstimationMode", 0)];
                c1aiy.LJFF = C1AIX.values()[jSONObject.optInt("planeFindingMode", 0)];
                C1524705y1.LIZJ(new AwS434S0200000_33(this, c1aiy, 12));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
