package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0QSJ;
import X.C0RVE;
import X.C0RVS;
import X.C0S9L;
import X.C0SOB;
import X.C13LE;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C696790RUv;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696800RUw;
import Y.ARunnableS111S0100000_11;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ability.IPhotoAutoScrollAbility;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoScrollControlComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoScrollControlComponent extends BaseCellLogicComponent<PhotoScrollControlComponent> implements IPhotoAutoScrollAbility, C0SOB, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public C0RVS LLJJIJIIJIL;
    public C0RVE LLJJJJJIL;
    public volatile C0S9L LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(525));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1047));
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1046));
    public final C630740Ooa LLJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1045));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1044));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(232));
    public final ARunnableS111S0100000_11 LLJJL = new ARunnableS111S0100000_11(this, 57);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoScrollControlComponent.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0SOB
    public final void Aa() {
    }

    public final C0S9L Eo() {
        C0S9L c0s9l = this.LLJJLIIIJLLLLLLLZ;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLJJLIIIJLLLLLLLZ;
                if (c0s9l == null) {
                    C0S9L c0s9lBo = Bo();
                    this.LLJJLIIIJLLLLLLLZ = c0s9lBo;
                    return c0s9lBo;
                }
            }
        }
        return c0s9l;
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class, VideoCellScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJIJIIJIL = Co();
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RV6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(173), 4);
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RV8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(174), 4);
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RUr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9P) obj).LL);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(175), 4);
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RVA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLIZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(176), 6);
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RVB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(171), 6);
        C736680Sv4.LJIIIIZZ(this, Fo(), new C2217381BqS() { // from class: X.0RVJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(172), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    private C0S9L Bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJLIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
            this.LLJLIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C0S9L c0s9l = (C0S9L) c0qsjLIZLLL.getAbility(C0S9L.class);
        C687700QyG.LJ(c0s9l, C0S9L.class);
        return c0s9l;
    }

    public final PhotoViewModelV2 Fo() {
        return (PhotoViewModelV2) this.LLJJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoAutoScrollAbility
    public final void NE0() {
        C0RVS c0rvs = this.LLJJIJIIJIL;
        if (c0rvs != null) {
            c0rvs.LIZIZ.LIZIZ(null);
        }
        C0RVS c0rvs2 = this.LLJJIJIIJIL;
        if (c0rvs2 != null) {
            c0rvs2.LIZIZ();
        }
    }

    public C696790RUv Co() {
        return new C696790RUv(LifecycleOwnerKt.getLifecycleScope(this), new InterfaceC696800RUw() { // from class: X.0RV9
            @Override // X.InterfaceC696800RUw
            public final void LIZ() {
                C0RVE c0rve = this.LIZ.LLJJJJJIL;
                if (c0rve == null || !c0rve.LIZ() || c0rve.LJFF(c0rve.LJ()) == null) {
                    this.LIZ.Fo().QQ2(true);
                }
            }
        });
    }

    @Override // X.C0SOB
    public final void onPageSelected(int i) {
        C0RVE c0rve = this.LLJJJJJIL;
        if (c0rve != null) {
            c0rve.LJII(i, false);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0RVC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0RVD] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0RVI] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C0RVE c0rve;
        if (AwemeExtKt.isAdTraffic(videoItemParams.getAweme())) {
            c0rve = new C0RVE(this, this, Fo(), new C2217401BqU(this) { // from class: X.0RVC
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((PhotoScrollControlComponent) this.receiver).LLJJJ.getValue();
                }
            }, new C2217401BqU(this) { // from class: X.0RVD
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((PhotoScrollControlComponent) this.receiver).LLJJJIL.getValue();
                }
            }, new C2217401BqU(this) { // from class: X.0RVI
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((PhotoScrollControlComponent) this.receiver).LLJJJJ.getValue();
                }
            });
        } else {
            c0rve = null;
        }
        this.LLJJJJJIL = c0rve;
    }
}
