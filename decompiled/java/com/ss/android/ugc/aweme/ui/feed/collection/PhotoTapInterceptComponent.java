package com.ss.android.ugc.aweme.ui.feed.collection;

import X.AbstractC693100RGq;
import X.C01GW;
import X.C0S9P;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C426750GoL;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C693080RGo;
import X.C693090RGp;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.content.Context;
import com.ss.android.ugc.aweme.ability.IPhotoModeSwitchAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoTapInterceptComponent extends BaseSubVHTapTouchInterceptComponent<PhotoTapInterceptComponent> implements IPhotoModeSwitchAbility {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(499));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 984));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 981));
    public final C01GW LLJZIJLIL;

    public final float kp() {
        SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility = (SingleTapSwitchSubVHAbility) this.LLJLLL.getValue();
        return (singleTapSwitchSubVHAbility != null ? singleTapSwitchSubVHAbility.Wu0() : 0.0f) * LJJIJL().getWidth();
    }

    public final PhotoViewModelV2 lp() {
        return (PhotoViewModelV2) this.LLJLLIL.getValue();
    }

    public final float mp() {
        float fRu1;
        int width;
        float fRu12;
        if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue()) {
            Context context = getContext();
            if (context == null || !C426750GoL.LIZLLL(context)) {
                float f = 1;
                SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility = (SingleTapSwitchSubVHAbility) this.LLJLLL.getValue();
                fRu12 = f - (singleTapSwitchSubVHAbility != null ? singleTapSwitchSubVHAbility.Ru1() : 1.0f);
                fRu1 = LJJIJL().getWidth();
                return fRu1 * fRu12;
            }
            SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility2 = (SingleTapSwitchSubVHAbility) this.LLJLLL.getValue();
            fRu1 = singleTapSwitchSubVHAbility2 != null ? singleTapSwitchSubVHAbility2.Ru1() : 1.0f;
            width = LJJIJL().getWidth();
        } else {
            SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility3 = (SingleTapSwitchSubVHAbility) this.LLJLLL.getValue();
            fRu1 = singleTapSwitchSubVHAbility3 != null ? singleTapSwitchSubVHAbility3.Ru1() : 1.0f;
            width = LJJIJL().getWidth();
        }
        fRu12 = width;
        return fRu1 * fRu12;
    }

    public PhotoTapInterceptComponent() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 983));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 982));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.Vo();
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJZ.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IPhotoModeSwitchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        InterfaceC713360RyY interfaceC713360RyY = (InterfaceC713360RyY) this.LLJZ.getValue();
        if (interfaceC713360RyY == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IPhotoModeSwitchAbility.class, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent
    public final AbstractC693100RGq hp(float f, float f2, int i, long j) {
        boolean z;
        Context context;
        boolean z2;
        Context context2;
        Context context3 = getContext();
        if (context3 != null && C426750GoL.LIZLLL(context3)) {
            z = true;
        } else {
            z = false;
        }
        if ((z && f > kp()) || (((context = getContext()) != null && !C426750GoL.LIZLLL(context) && f < mp()) || lp().AQ2() < 2 || ((C0S9P) lp().getState()).LL == lp().AQ2() - 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            lp().wQ2();
            lp().QQ2(true);
            lp().xQ2();
            return new C693080RGo(false, false, 1, 3);
        }
        Context context4 = getContext();
        if ((context4 != null && !C426750GoL.LIZLLL(context4) && f > kp()) || (((context2 = getContext()) != null && C426750GoL.LIZLLL(context2) && f < mp()) || lp().AQ2() < 2 || ((C0S9P) lp().getState()).LL == 0)) {
            if (f >= kp() && f <= mp()) {
                lp().xQ2();
                return C693090RGp.LIZLLL;
            }
            return C693090RGp.LIZLLL;
        }
        lp().wQ2();
        PhotoViewModelV2 photoViewModelV2Lp = lp();
        int i2 = ((C0S9P) lp().getState()).LL - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        photoViewModelV2Lp.EQ2(i2);
        lp().xQ2();
        return new C693080RGo(false, false, 2, 3);
    }
}
