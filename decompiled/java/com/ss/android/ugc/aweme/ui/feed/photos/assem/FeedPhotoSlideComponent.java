package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C098200Yq;
import X.C0N3Z;
import X.C0QSJ;
import X.C0RDX;
import X.C0RF0;
import X.C0RFL;
import X.C0RJN;
import X.C0S9D;
import X.C0S9H;
import X.C0S9J;
import X.C0S9L;
import X.C0SAB;
import X.C0SAH;
import X.C0SKV;
import X.C0SKX;
import X.C0SKY;
import X.C0SLJ;
import X.C0SLS;
import X.C0VA1;
import X.C0VAA;
import X.C0X35;
import X.C1220000hqw;
import X.C1389300mG0;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C189200o6;
import X.C1EE2;
import X.C2188571Al5;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2367709Pn;
import X.C298410Bmp;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C512801zC;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C716550S8v;
import X.C721190SQr;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C798360VTm;
import X.C844470XAv;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC696720RUo;
import X.InterfaceC717030SAr;
import X.InterfaceC717040SAs;
import X.InterfaceC737790Swr;
import Y.ARunnableS111S0100000_11;
import android.graphics.Bitmap;
import android.os.Debug;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.FeedPhotoSlideConfigurationProtocol;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotoSlideComponent extends BasePhotoSlidesAssem<FeedPhotoSlideComponent> implements InterfaceC696720RUo, IPhotoModeAbility, PauseTimeAbility, InterfaceC1554640qYg, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILL;
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(513));
    public final C736950SvV LLLFZ;
    public final FeedPhotoSlideComponent LLLI;
    public final FeedPhotoSlideComponent LLLII;
    public final FeedPhotoSlideComponent LLLIIII;
    public final C01GW LLLIIIIL;
    public final C630740Ooa LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public volatile C0S9L LLLIL;
    public InterfaceC717040SAs LLLILZ;
    public C0SLJ LLLILZJ;
    public C0SKX LLLILZLLLI;
    public InterfaceC717030SAr LLLIZZ;
    public C0SKY LLLJ;
    public InterfaceC696720RUo LLLJIL;
    public C0SKV LLLJL;
    public C0S9L LLLL;
    public C0SLS LLLLII;
    public InterfaceC665370Q7z LLLLIIIILLL;
    public C0QSJ LLLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedPhotoSlideComponent.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLIILL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void Ip() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.e_h;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC717040SAs.class) {
            this.LLLILZ = (InterfaceC717040SAs) obj;
        } else if (cls == C0SLJ.class) {
            this.LLLILZJ = (C0SLJ) obj;
        } else if (cls == C0SKX.class) {
            this.LLLILZLLLI = (C0SKX) obj;
        } else if (cls == InterfaceC717030SAr.class) {
            this.LLLIZZ = (InterfaceC717030SAr) obj;
        } else if (cls == C0SKY.class) {
            this.LLLJ = (C0SKY) obj;
        } else if (cls == InterfaceC696720RUo.class) {
            this.LLLJIL = (InterfaceC696720RUo) obj;
        } else if (cls == C0SKV.class) {
            this.LLLJL = (C0SKV) obj;
        } else if (cls == C0S9L.class) {
            this.LLLL = (C0S9L) obj;
        } else if (cls == C0SLS.class) {
            this.LLLLII = (C0SLS) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class, PhotoSlideScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC717040SAs.class) {
            return this.LLLILZ;
        }
        if (cls == C0SLJ.class) {
            return this.LLLILZJ;
        }
        if (cls == C0SKX.class) {
            return this.LLLILZLLLI;
        }
        if (cls == InterfaceC717030SAr.class) {
            return this.LLLIZZ;
        }
        if (cls == C0SKY.class) {
            return this.LLLJ;
        }
        if (cls == InterfaceC696720RUo.class) {
            return this.LLLJIL;
        }
        if (cls == C0SKV.class) {
            return this.LLLJL;
        }
        if (cls == C0S9L.class) {
            return this.LLLL;
        }
        if (cls == C0SLS.class) {
            return this.LLLLII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public boolean ie() {
        return false;
    }

    public boolean ke() {
        return false;
    }

    public boolean le() {
        return false;
    }

    public InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 1493204508 || iHashCode == 1649553494) {
            return this;
        }
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC717040SAs.class) {
            this.LLLILZ = null;
        } else if (cls == C0SLJ.class) {
            this.LLLILZJ = null;
        } else if (cls == C0SKX.class) {
            this.LLLILZLLLI = null;
        } else if (cls == InterfaceC717030SAr.class) {
            this.LLLIZZ = null;
        } else if (cls == C0SKY.class) {
            this.LLLJ = null;
        } else if (cls == InterfaceC696720RUo.class) {
            this.LLLJIL = null;
        } else if (cls == C0SKV.class) {
            this.LLLJL = null;
        } else if (cls == C0S9L.class) {
            this.LLLL = null;
        } else if (cls == C0SLS.class) {
            this.LLLLII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoModeAbility
    public final boolean Av2() {
        return ((PhotoSharedViewModel) this.LLLFZ.getValue()).LLILZLL;
    }

    public final C0S9D Ep() {
        return (C0S9D) this.LLLIILIL.getValue();
    }

    public FeedPhotoSlideConfigurationProtocol Fp() {
        return (FeedPhotoSlideConfigurationProtocol) this.LLLIIL.getValue();
    }

    public final PhotoViewModelV2 Gp() {
        return (PhotoViewModelV2) this.LLLFFI.getValue();
    }

    public final void Jp() {
        if (C1EE2.LIZIZ.LIZLLL()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
            if (videoItemParams != null) {
                videoItemParams.setIsEnterGraphicDetail(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoModeAbility
    public final Bitmap e61() {
        PhotosViewHolderV3 photosViewHolderV3LLJLLL;
        C0S9L c0s9l = this.LLLIL;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLLIL;
                if (c0s9l == null) {
                    C0QSJ c0qsjLIZLLL = this.LLLLIIL;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLIIIILLL;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                            this.LLLLIIIILLL = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
                        this.LLLLIIL = c0qsjLIZLLL;
                    }
                    c0s9l = c0qsjLIZLLL != null ? (C0S9L) c0qsjLIZLLL.getAbility(C0S9L.class) : null;
                    this.LLLIL = c0s9l;
                }
            }
        }
        if (c0s9l == null || (photosViewHolderV3LLJLLL = c0s9l.LLJLLL()) == null) {
            return null;
        }
        return photosViewHolderV3LLJLLL.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoModeAbility
    public final int fj1() {
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIL.getValue();
        if (iPhotoSlidesAbility != null) {
            return iPhotoSlidesAbility.xt0();
        }
        return -1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        C0X35.LIZ("ui_to_video_photomode_assem_bind", false);
        C0N3Z c0n3z = C0N3Z.LIZ;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        String strLIZ = c0rjnLIZIZ != null ? C1389300mG0.LIZ(c0rjnLIZIZ) : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        int i = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).currentPosition;
        c0n3z.getClass();
        if (C0N3Z.LJII) {
            return;
        }
        if (C0N3Z.LJIIIIZZ != 0 && C0N3Z.LJIIJ == 0) {
            C0N3Z.LJIIJ = System.currentTimeMillis() - C0N3Z.LJIIIIZZ;
        }
        C0N3Z.LJIIJJI = strLIZ;
        C0N3Z.LJIIL = i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        C0X35.LJIIJJI("ui_to_video_photomode_assem_bind", false);
    }

    public FeedPhotoSlideComponent() {
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1011);
        this.LLLFZ = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(514), new AwS555S0100000_11((AbstractC738140SxQ) this, 1012), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLI = this;
        this.LLLII = this;
        this.LLLIIII = this;
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1013));
        this.LLLIIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1010));
        this.LLLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(228));
        this.LLLIILIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(227));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Integer numValueOf;
        C0S9D c0s9dEp = Ep();
        if (c0s9dEp.LIZJ) {
            try {
                C844470XAv.LIZ.getClass();
                long jLIZIZ = C2188571Al5.LIZIZ(C844470XAv.LIZ());
                Long lValueOf = Long.valueOf(C2188571Al5.LIZ(C844470XAv.LIZ()));
                c0s9dEp.LJIIJ = lValueOf;
                if (lValueOf != null) {
                    c0s9dEp.LJI = Float.valueOf(1 - ((lValueOf.longValue() * 1.0f) / jLIZIZ));
                }
                Long lValueOf2 = Long.valueOf(C2367709Pn.LIZLLL());
                c0s9dEp.LJIIIZ = lValueOf2;
                if (lValueOf2 != null) {
                    c0s9dEp.LJII = Float.valueOf((lValueOf2.longValue() * 1.0f) / Runtime.getRuntime().maxMemory());
                }
                String runtimeStat = Debug.getRuntimeStat("art.gc.blocking-gc-count");
                if (runtimeStat != null) {
                    try {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(runtimeStat));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        numValueOf = null;
                    }
                    c0s9dEp.LJIIIIZZ = numValueOf;
                } else {
                    numValueOf = null;
                    c0s9dEp.LJIIIIZZ = numValueOf;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0S9D c0s9dEp2 = Ep();
        c0s9dEp2.getClass();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c0s9dEp2.LIZIZ && c0s9dEp2.LJ) {
                c0s9dEp2.LJ = false;
                ((C798360VTm) c0s9dEp2.LJIIJJI.getValue()).LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cpu rate ");
                sbLIZ.append(((C798360VTm) c0s9dEp2.LJIIJJI.getValue()).LJI);
                sbLIZ.append(", cost = ");
                sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                sbLIZ.append(" ms");
                C0S9H.LIZ(c0s9dEp2, C2188811AlT.LIZIZ(sbLIZ));
                c0s9dEp2.LJFF = Double.valueOf(((C798360VTm) c0s9dEp2.LJIIJJI.getValue()).LJI.LIZ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C0S9D c0s9dEp3 = Ep();
        c0s9dEp3.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("enter_from", c0s9dEp3.LIZLLL).putOpt("cpu_usage", c0s9dEp3.LJFF).putOpt("device_memory_ratio", c0s9dEp3.LJI).putOpt("java_heap_ratio", c0s9dEp3.LJII).putOpt("block_gc_count", c0s9dEp3.LJIIIIZZ).putOpt("java_heap_size", c0s9dEp3.LJIIIZ).putOpt("device_available_memory_size", c0s9dEp3.LJIIJ);
            C786410Ut5.f3(new C512801zC(new AwS412S0200000_11(c0s9dEp3, jSONObject, 104), 1), Looper.getMainLooper().getQueue());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0s9dEp3.LIZ);
            sbLIZ2.append(" ---> ");
            sbLIZ2.append(jSONObject);
            C0S9H.LIZ(c0s9dEp3, C2188811AlT.LIZIZ(sbLIZ2));
            c0s9dEp3.LIZLLL = null;
            c0s9dEp3.LJFF = null;
            c0s9dEp3.LJI = null;
            c0s9dEp3.LJII = null;
            c0s9dEp3.LJIIIIZZ = null;
            c0s9dEp3.LJIIIZ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Jp();
        ((PhotoSharedViewModel) this.LLLFZ.getValue()).vQ2();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).LJLLLL();
        }
    }

    @Override // X.InterfaceC696720RUo
    public final String Ze() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSlide_");
        sbLIZ.append(hashCode());
        String strLIZ = C0S9J.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), 1);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getPhotoSharedVMKey: ");
        sbLIZ2.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        c721190SQr.getClass();
        return strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility
    public final long dM0() {
        return Gp().LLJI;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (!C298410Bmp.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            if (aweme != null) {
                ((VideoFavoriteVM) this.LLJLLL.getValue(this, BasePhotoSlidesAssem.LLLFF[0])).DQ2(aweme.getAid(), false, false);
            }
        }
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    public void g2() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Jp();
        ((PhotoSharedViewModel) this.LLLFZ.getValue()).vQ2();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        PhotoViewModelV2.JQ2(Gp());
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C0X35.LJIIJJI("ui_to_video_photomode_assem_init", false);
        C0X35.LIZ("ui_to_video_photomode_assem_view_created", false);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C0RFL.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        PhotoViewModelV2.JQ2(Gp());
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Gp().PQ2();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLLI, InterfaceC696720RUo.class);
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLLII, IPhotoModeAbility.class);
        c0qsjLIZIZ.unbindAbility(this.LLLIIII, PauseTimeAbility.class);
    }

    @C14EU
    public final void cancelVideoMaskEvent(C716550S8v c716550S8v) {
        HandlerHook.viewPostDelay(getContentView(), new ARunnableS111S0100000_11(this, 54), 200L);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoModeAbility
    public final void kH0(int i) {
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIL.getValue();
        if (iPhotoSlidesAbility != null) {
            iPhotoSlidesAbility.G91(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility
    public final void l20(long j) {
        Gp().LLJI = j;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C0N3Z.LIZ.getClass();
        if (!C0N3Z.LJII && C0N3Z.LJIIIIZZ != 0) {
            C0N3Z.LJIIIZ = System.currentTimeMillis() - C0N3Z.LJIIIIZZ;
        }
        super.onViewCreated(view);
        FeedPhotoSlideConfigurationProtocol feedPhotoSlideConfigurationProtocolFp = Fp();
        FeedPhotoSlideComponent feedPhotoSlideComponent = this.LLLI;
        feedPhotoSlideConfigurationProtocolFp.d81(view, this);
        feedPhotoSlideConfigurationProtocolFp.gw1(view, feedPhotoSlideComponent, this);
        feedPhotoSlideConfigurationProtocolFp.hk1(feedPhotoSlideComponent, this);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0S9E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZLL);
            }
        }, null, AFwS294S0000000_11.get$arr$(155), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0Rje
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(156), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0S9F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJJI;
            }
        }, null, AFwS294S0000000_11.get$arr$(157), 6);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0RV5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(158), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0RV7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(154), 4);
        C0X35.LJIIJJI("ui_to_video_photomode_assem_view_created", false);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLLI, InterfaceC696720RUo.class);
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class});
        c0qsjLIZIZ.bindAbility(this.LLLII, IPhotoModeAbility.class);
        c0qsjLIZIZ.bindAbility(this.LLLIIII, PauseTimeAbility.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C1EE2.LIZIZ.LIZLLL()) {
            videoItemParams2.setIsEnterGraphicDetail(0);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C0S9D c0s9dEp = Ep();
        String str = null;
        c0s9dEp.LIZLLL = null;
        c0s9dEp.LJFF = null;
        c0s9dEp.LJI = null;
        c0s9dEp.LJII = null;
        c0s9dEp.LJIIIIZZ = null;
        c0s9dEp.LJIIIZ = null;
        C0S9D c0s9dEp2 = Ep();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        c0s9dEp2.LIZLLL = str;
        C0S9D c0s9dEp3 = Ep();
        if (c0s9dEp3.LIZIZ && !c0s9dEp3.LJ) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C844470XAv.LIZ.getClass();
                C0VA1 c0va1LIZ = C0VAA.LIZ(C844470XAv.LIZ());
                if (c0va1LIZ != null && c0va1LIZ.LIZIZ.LIZLLL) {
                    C0S9H.LIZ(c0s9dEp3, "device is charging, skip cpu monitor");
                    c0va1LIZ.LIZ();
                } else {
                    ((C798360VTm) c0s9dEp3.LJIIJJI.getValue()).LIZ();
                    c0s9dEp3.LJ = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start monitor cpu, cost = ");
                    sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    sbLIZ.append(" ms");
                    C0S9H.LIZ(c0s9dEp3, C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Jp();
        ((PhotoSharedViewModel) this.LLLFZ.getValue()).vQ2();
        C0SAH c0sah = Gp().LLILLJJLI;
        c0sah.LIZLLL = 0;
        ((LinkedHashMap) c0sah.LJIIJJI).clear();
        ((LinkedHashMap) c0sah.LJ).clear();
        ((LinkedHashMap) c0sah.LJII).clear();
        ((LinkedHashMap) c0sah.LJFF).clear();
        ((LinkedHashMap) c0sah.LJI).clear();
        ((LinkedHashMap) c0sah.LJIIIIZZ).clear();
        ((LinkedHashMap) c0sah.LJIIIZ).clear();
        ((LinkedHashMap) c0sah.LJIIJ).clear();
        c0sah.LJIILJJIL = false;
        c0sah.LJIILL = new C0SAB();
        c0sah.LIZJ = "";
        c0sah.LIZIZ = null;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }
}
