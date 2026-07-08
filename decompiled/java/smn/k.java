package smn;

import X.AbstractC1646210swN;
import X.C01GW;
import X.C09R3;
import X.C0ETY;
import X.C13LE;
import X.C1441190nbh;
import X.C1631190sY9;
import X.C1631200sYA;
import X.C1645380sv2;
import X.C1646260swS;
import X.C1646490swp;
import X.C1646620sx2;
import X.C1647410syJ;
import X.C1660530tJT;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1DRG;
import X.C2217381BqS;
import X.C330830Cy1;
import X.C385670FAf;
import X.C452501pT;
import X.EnumC1448590nnd;
import X.EnumC1660550tJV;
import X.InterfaceC1638550sk1;
import X.InterfaceC1649530t1j;
import X.InterfaceC1649820t2C;
import X.InterfaceC1650190t2n;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.component.e;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public final class k extends AbstractC1646210swN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1664740tQG LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(k.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(k.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(k.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(k.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(k.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(k.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(k.class, "recordAdapterComponent", "getRecordAdapterComponent()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(k.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final ShortVideoContext LIZLLL() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJI[0]);
    }

    @Override // X.AbstractC1646210swN
    public final int LIZ() {
        Boolean bool = LIZLLL().creativeModel.defaultEnableMP4Encoding;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (LIZLLL().cameraComponentModel.isEditorProRecordMode && LIZLLL().cameraComponentModel.enableRecordingMp4) {
            zBooleanValue = true;
        }
        return C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, (LIZLLL().LJJJJIZL() && LIZLLL().cameraComponentModel.enableRecordingMp4) ? true : zBooleanValue);
    }

    @Override // X.AbstractC1646210swN, X.InterfaceC1646450swl
    public final void m5(C1646490swp c1646490swp) {
        super.m5(c1646490swp);
    }

    @Override // X.AbstractC1646210swN, X.InterfaceC1646450swl
    public final void yf(C1646490swp c1646490swp) {
        int i;
        C1664750tQH c1664750tQH = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        ((a) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).mC(e.VIDEO);
        if (c1646490swp.LIZLLL || !C330830Cy1.LIZ()) {
            InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) this.LLJILJIL.getValue(this, interfaceC2217461BqaArr[5]);
            C1441190nbh c1441190nbh = LIZLLL().cameraComponentModel.mDurings;
            if (c1441190nbh != null && !c1441190nbh.isEmpty()) {
                i = 8;
            } else {
                i = 0;
            }
            interfaceC1638550sk1.us0(i);
            ((a) this.LLJ.getValue(this, interfaceC2217461BqaArr[2])).eP2(true);
            if (C1631200sYA.LIZ((C1631190sY9) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[4]))) {
                ((C0ETY) this.LLILLL.LJII(C0ETY.class, null)).Sd(InterfaceC1649820t2C.class, new AwS265S0000000_25(22));
            } else {
                InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) this.LLJI.getValue(this, interfaceC2217461BqaArr[3]);
                if (interfaceC1649820t2C != null) {
                    interfaceC1649820t2C.hF2(true, false);
                }
                InterfaceC1649820t2C interfaceC1649820t2C2 = (InterfaceC1649820t2C) this.LLJI.getValue(this, interfaceC2217461BqaArr[3]);
                if (interfaceC1649820t2C2 != null) {
                    interfaceC1649820t2C2.W9(true);
                }
            }
        }
        ((C1646260swS) this.LLJJ.getValue()).LIZ(c1646490swp);
        super.yf(c1646490swp);
    }

    @Override // X.AbstractC1646210swN
    public final void LIZJ(boolean z, EnumC1448590nnd enumC1448590nnd) {
        s sVarLJI;
        C385670FAf<InterfaceC1649530t1j> c385670FAfQR0;
        InterfaceC1649530t1j interfaceC1649530t1jLIZJ;
        LiveEvent<s> liveEventR7;
        super.LIZJ(z, enumC1448590nnd);
        C1664750tQH c1664750tQH = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        ((InterfaceC1650190t2n) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).u92().LIZIZ().LIZIZ.LJJJ.LJJIII("ClientState", 7);
        InterfaceC1650190t2n interfaceC1650190t2n = (InterfaceC1650190t2n) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[1]);
        C1647410syJ c1647410syJ = (C1647410syJ) this.LLJILJILJ.getValue(this, interfaceC2217461BqaArr[6]);
        if (c1647410syJ == null || (c385670FAfQR0 = c1647410syJ.qR0()) == null || (interfaceC1649530t1jLIZJ = c385670FAfQR0.LIZJ()) == null || (liveEventR7 = interfaceC1649530t1jLIZJ.R7()) == null || (sVarLJI = liveEventR7.LJI()) == null) {
            sVarLJI = s.NORMAL;
        }
        interfaceC1650190t2n.NF(sVarLJI);
    }

    public k(C1646620sx2 c1646620sx2, LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(c1646620sx2, lifecycleOwner, c1drg);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, a.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1638550sk1.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C1647410syJ.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
        this.LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1062));
    }
}
