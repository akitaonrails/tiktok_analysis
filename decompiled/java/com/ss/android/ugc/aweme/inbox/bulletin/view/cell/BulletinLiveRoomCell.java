package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.AbstractC1623806Xk;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0OON;
import X.C0OPX;
import X.C0OV6;
import X.C0OVA;
import X.C11NZ;
import X.C1383370m6R;
import X.C13LE;
import X.C13LP;
import X.C1623606Xi;
import X.C1699360uK6;
import X.C1720106oR;
import X.C19719912Dl;
import X.C1ACD;
import X.C2095008Iq;
import X.C21568919b5;
import X.C21700719wL;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2229308oN;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C619660OSe;
import X.C622680Oba;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1913520ztW;
import X.InterfaceC1566880qsQ;
import X.InterfaceC1596830rej;
import X.InterfaceC20673515v3;
import X.InterfaceC2175541ACi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinLiveRoomCard;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinLiveRoomCell extends BulletinBaseCell<C0OON> implements InterfaceC1566880qsQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final AssemVMLazy LLJLLL;
    public final C01GW LLJZ;
    public C21700719wL LLJZIJLIL;
    public final AssemVMLazy LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinLiveRoomCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinAutoPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinLiveRoomCell.class, "_mediaVm", "get_mediaVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMediaViewModel;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void z6() {
        super.z6();
        AssemViewModel.asyncSubscribe$default(b7(), new C2217381BqS() { // from class: X.0qsP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618040OLy) obj).LL;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS612S0100000_33(this, 82), 24, null);
    }

    public BulletinLiveRoomCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinAutoPlayViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 671);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(189);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2526), awS568S0100000_24, AFwS224S0000000_33.get$arr$(355), new AwS577S0100000_33((C03K6) this, 2521), new AwS568S0100000_24((C03K6) this, 667), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2528), aFwS279S0000000_33, new AwS568S0100000_24((C03K6) this, 669), null, new AwS568S0100000_24((C03K6) this, 670));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 2517);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2519);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 2522);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 96));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 2524);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2525);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2527);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2529);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2531);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS568S0100000_24, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2533), awS568S0100000_24, AFwS224S0000000_33.get$arr$(354), new AwS577S0100000_33((C03K6) this, 2536), new AwS568S0100000_24((C03K6) this, 672), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2539), aFwS279S0000000_33, new AwS568S0100000_24((C03K6) this, 673), null, new AwS568S0100000_24((C03K6) this, 674));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2542), awS568S0100000_24, AFwS224S0000000_33.get$arr$(356), new AwS577S0100000_33((C03K6) this, 2544), new AwS568S0100000_24((C03K6) this, 675), new AwS568S0100000_24((C03K6) this, 657), aFwS279S0000000_33, null, null, new AwS568S0100000_24((C03K6) this, 658));
        }
        this.LLJLLL = assemVMLazy;
        this.LLJZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(207));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinMediaViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 660);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(190);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2516), awS568S0100000_242, AFwS224S0000000_33.get$arr$(353), new AwS577S0100000_33((C03K6) this, 2520), new AwS568S0100000_24((C03K6) this, 662), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2523), aFwS279S0000000_332, new AwS568S0100000_24((C03K6) this, 665), null, new AwS568S0100000_24((C03K6) this, 668));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33((C03K6) this, 2530);
            AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2532);
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33(c19719912DlLIZ2, 2534);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_339, 97));
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33(c01gwLIZIZ2, 2535);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c01gwLIZIZ2, 2537);
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 2538);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 2540);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 2541);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3311, awS568S0100000_242, new C452080Ho6(), awS577S0100000_3312, awS577S0100000_3313, awS577S0100000_3310, aFwS279S0000000_332, awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3316);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2543), awS568S0100000_242, AFwS224S0000000_33.get$arr$(357), new AwS577S0100000_33((C03K6) this, 2545), new AwS568S0100000_24((C03K6) this, 656), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2514), aFwS279S0000000_332, new AwS568S0100000_24((C03K6) this, 659), null, new AwS568S0100000_24((C03K6) this, 661));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 2515), awS568S0100000_242, AFwS224S0000000_33.get$arr$(352), new AwS577S0100000_33((C03K6) this, 2518), new AwS568S0100000_24((C03K6) this, 663), new AwS568S0100000_24((C03K6) this, 664), aFwS279S0000000_332, null, null, new AwS568S0100000_24((C03K6) this, 666));
        }
        this.LLL = assemVMLazy2;
    }

    @Override // X.InterfaceC1566880qsQ
    public final boolean B0() {
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            return c21700719wL.LJIILL();
        }
        return false;
    }

    @Override // X.InterfaceC1566880qsQ
    public final void LJJL() {
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIJ(null);
        }
    }

    public final BulletinAutoPlayViewModel b7() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (BulletinAutoPlayViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1566880qsQ
    public final void startPlay() {
        LiveRoomStruct liveRoomStruct;
        C2229308oN c2229308oN;
        final C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL == null || (liveRoomStruct = c21700719wL.LJJIIJZLJL) == null) {
            return;
        }
        if (c21700719wL.LJIILL()) {
            if (c21700719wL.LJJIII) {
                return;
            }
            c21700719wL.LJIJ("reset");
            BulletinMediaViewModel bulletinMediaViewModelInvoke = c21700719wL.LIZJ.invoke();
            if (bulletinMediaViewModelInvoke == null || (c2229308oN = bulletinMediaViewModelInvoke.LLILLJJLI) == null) {
                c21700719wL.LJJIJIIJI = null;
            } else {
                c21700719wL.LJJIJIIJI = new WeakReference<>(c2229308oN);
                c2229308oN.LIZJ(c21700719wL.LJJIJ);
            }
            c21700719wL.LJJIII = true;
            c21700719wL.LJJII = 0L;
            C1ACD c1acdGenerateLivePlayHelper = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.19wJ
                @Override // X.InterfaceC2175541ACi
                public final Integer Dk() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean LLILLIZIL() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLIL() {
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLLLLIL() {
                }

                @Override // X.InterfaceC2175541ACi
                public final Object Md() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final void T5() {
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean U1() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean We() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final Object Y7() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final void o() {
                }

                @Override // X.InterfaceC2175541ACi
                public final void oc(C945320ahu c945320ahu) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void oe(String str) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void v() {
                    C0DTR.LIZIZ(c21700719wL.LJ);
                    c21700719wL.LJJII = System.currentTimeMillis();
                }

                @Override // X.InterfaceC2175541ACi
                /* JADX INFO: renamed from: if */
                public final void mo29if(String str) {
                    C21700719wL c21700719wL2 = c21700719wL;
                    c21700719wL2.LJIJ = true;
                    c21700719wL2.LJFF();
                }

                @Override // X.InterfaceC2175541ACi
                public final void sk(String str) {
                    if (((InterfaceC1488720oqM) c21700719wL.LJIILJJIL.getValue()).LIZ(str)) {
                        C21700719wL c21700719wL2 = c21700719wL;
                        c21700719wL2.LJIJ = true;
                        c21700719wL2.LJIJ("subOnly");
                        int i = C2187451AjH.LIZ;
                    }
                }

                @Override // X.InterfaceC2175541ACi
                public final void w9(String str) {
                    C21700719wL c21700719wL2 = c21700719wL;
                    c21700719wL2.LJIJ = true;
                    c21700719wL2.LJFF();
                }

                @Override // X.InterfaceC2175541ACi
                public final void Th(int i, int i2, View view) {
                    int iLIZIZ;
                    Integer numLIZJ;
                    C21700719wL c21700719wL2 = c21700719wL;
                    c21700719wL2.getClass();
                    if (i > 0 && i2 > 0) {
                        if (i > i2) {
                            iLIZIZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(180.0f))) / (i / i2));
                            Context context = c21700719wL2.LJIIIIZZ.getContext();
                            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) != null) {
                                c21700719wL2.LJIIIIZZ.setBackgroundColor(numLIZJ.intValue());
                            }
                        } else {
                            c21700719wL2.LJIIIIZZ.setBackgroundColor(0);
                            iLIZIZ = -1;
                        }
                        C12ES.LJIIZILJ(-1, iLIZIZ, c21700719wL2.LJIIIZ);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onVideoSizeChange: width = ");
                        sbLIZ.append(i);
                        sbLIZ.append(", height = ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }, EnumC1913520ztW.SEARCH);
            c1acdGenerateLivePlayHelper.LJIILIIL(new C1699360uK6(c21700719wL.LJI(), c21700719wL.LJIIJ(), "", null, false, true, 40));
            c1acdGenerateLivePlayHelper.LJJIIJZLJL(true, liveRoomStruct, c21700719wL.LJIIIZ, false, null, "", false, null);
            c21700719wL.LJIILLIIL = c1acdGenerateLivePlayHelper;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playLive: reason = ");
            sbLIZ.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("play_fail: ,reason=");
        sbLIZ2.append((String) null);
        sbLIZ2.append(", Err=");
        sbLIZ2.append(c21700719wL.LJIJ);
        sbLIZ2.append(", RM=");
        sbLIZ2.append(c21700719wL.LJIJI);
        sbLIZ2.append(", InLive=");
        sbLIZ2.append(c21700719wL.LJIJJ);
        sbLIZ2.append(", isFinished=");
        sbLIZ2.append(c21700719wL.LJIJJLI);
        sbLIZ2.append(", errorCode =");
        sbLIZ2.append(c21700719wL.LJJIIZI);
        sbLIZ2.append(",  kickOut=");
        sbLIZ2.append(c21700719wL.LJJI);
        sbLIZ2.append(", isPrivate=");
        sbLIZ2.append(c21700719wL.LJJ);
        sbLIZ2.append(", isPaidEvent=");
        sbLIZ2.append(c21700719wL.LJIL);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJZIJLIL == null) {
            this.LLJZIJLIL = new C21700719wL((ViewStub) this.itemView.findViewById(R.id.d0c), a6(), b7(), new AwS553S0100000_9(this, 689));
            w6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a7() {
        C1623606Xi c1623606Xi;
        Integer num;
        AbstractC1623806Xk<Integer> abstractC1623806Xk = b7().getState().LL;
        if (!(abstractC1623806Xk instanceof C1623606Xi) || abstractC1623806Xk == null || !(abstractC1623806Xk instanceof C1623606Xi) || (c1623606Xi = (C1623606Xi) abstractC1623806Xk) == null || (num = (Integer) c1623606Xi.LIZ) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIJ("onDetached");
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIJ("unBind");
            InterfaceC420801kM interfaceC420801kM = c21700719wL.LJIIZILJ;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            c21700719wL.LJIIZILJ = null;
            c21700719wL.LJIJ = false;
            c21700719wL.LJIJI = false;
            c21700719wL.LJJIFFI = 0L;
            c21700719wL.LJJIII = false;
            c21700719wL.LJIJJ = false;
            c21700719wL.LJIJJLI = false;
            C622680Oba.LIZLLL(c21700719wL);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJZIJLIL == null) {
            this.LLJZIJLIL = new C21700719wL((ViewStub) this.itemView.findViewById(R.id.d0c), a6(), b7(), new AwS553S0100000_9(this, 688));
            w6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean U6(View view) {
        boolean z;
        String string;
        User user;
        Context context;
        BulletinLiveRoomCard bulletinLiveRoomCard;
        String secUid;
        User user2;
        User user3;
        C21700719wL c21700719wL;
        String uid;
        String strLJIIJ;
        User user4;
        Long l;
        Long l2;
        long id;
        long j;
        String string2;
        Long l3;
        Long l4;
        BulletinLiveRoomCard bulletinLiveRoomCard2;
        Room roomLJFF;
        BulletinCommonAbility bulletinCommonAbilityA6 = a6();
        if (bulletinCommonAbilityA6 != null && bulletinCommonAbilityA6.isLive()) {
            z = true;
        } else {
            z = false;
        }
        String uid2 = null;
        User user5 = null;
        String strLJI = null;
        uid2 = null;
        if (z) {
            InterfaceC1596830rej interfaceC1596830rej = (InterfaceC1596830rej) this.LLJZ.getValue();
            if (interfaceC1596830rej != null && (roomLJFF = interfaceC1596830rej.LJFF()) != null) {
                id = roomLJFF.getId();
            } else {
                id = 0;
            }
            C0OON c0oon = (C0OON) getItem();
            if (c0oon != null && (bulletinLiveRoomCard2 = c0oon.LLJI) != null) {
                j = bulletinLiveRoomCard2.roomId;
            } else {
                j = 0;
            }
            if (id == j && j > 0) {
                BulletinCommonAbility bulletinCommonAbilityA62 = a6();
                if (bulletinCommonAbilityA62 != null) {
                    bulletinCommonAbilityA62.B6();
                }
                BulletinListViewModel bulletinListViewModelF6 = f6();
                C0OON c0oon2 = (C0OON) getItem();
                if (c0oon2 != null && (l4 = c0oon2.LLJILJIL) != null) {
                    string2 = l4.toString();
                } else {
                    string2 = null;
                }
                BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) getItem();
                C0OON c0oon3 = (C0OON) getItem();
                if (c0oon3 != null) {
                    user5 = c0oon3.LLJJIJIL;
                }
                BulletinListViewModel.OQ2(bulletinListViewModelF6, string2, "live_card", bulletinBaseItem, user5, null, "click_live_card", null, null, 208);
                C0OON c0oon4 = (C0OON) getItem();
                if (c0oon4 != null && (l3 = c0oon4.LLJILJIL) != null) {
                    f6().WQ2(null, l3.longValue(), 9, null, null);
                }
                return true;
            }
        }
        if (super.U6(view)) {
            return true;
        }
        BulletinListViewModel bulletinListViewModelF62 = f6();
        C0OON c0oon5 = (C0OON) getItem();
        if (c0oon5 != null && (l2 = c0oon5.LLJILJIL) != null) {
            string = l2.toString();
        } else {
            string = null;
        }
        BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) getItem();
        C0OON c0oon6 = (C0OON) getItem();
        if (c0oon6 != null) {
            user = c0oon6.LLJJIJIL;
        } else {
            user = null;
        }
        BulletinListViewModel.OQ2(bulletinListViewModelF62, string, "live_card", bulletinBaseItem2, user, null, "click_live_card", null, null, 208);
        C0OON c0oon7 = (C0OON) getItem();
        if (c0oon7 != null && (l = c0oon7.LLJILJIL) != null) {
            f6().WQ2(null, l.longValue(), 9, null, null);
        }
        if (view == null || (context = view.getContext()) == null) {
            return true;
        }
        C0OON c0oon8 = (C0OON) getItem();
        if (c0oon8 != null) {
            bulletinLiveRoomCard = c0oon8.LLJI;
        } else {
            bulletinLiveRoomCard = null;
        }
        if (bulletinLiveRoomCard != null && bulletinLiveRoomCard.roomId > 0) {
            if (bulletinLiveRoomCard.isFinished() || ((c21700719wL = this.LLJZIJLIL) != null && c21700719wL.LJIJJLI)) {
                LiveRoomStruct liveRoomStruct = bulletinLiveRoomCard.roomStruct;
                if (liveRoomStruct != null && (user3 = liveRoomStruct.owner) != null) {
                    secUid = user3.getSecUid();
                } else {
                    secUid = null;
                }
                LiveRoomStruct liveRoomStruct2 = bulletinLiveRoomCard.roomStruct;
                if (liveRoomStruct2 != null && (user2 = liveRoomStruct2.owner) != null) {
                    uid2 = user2.getUid();
                }
                if ((secUid == null || secUid.length() == 0) && (uid2 == null || uid2.length() == 0)) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("BulletinBaseCell", "jumpToProfile: secUid and uid is null");
                    return true;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
                smartRouteBuildRoute.withParam("uid", uid2);
                smartRouteBuildRoute.withParam("sec_user_id", secUid);
                smartRouteBuildRoute.withParam("enter_from", "bulletin_board_page");
                smartRouteBuildRoute.open();
                return true;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            LiveRoomStruct liveRoomStruct3 = bulletinLiveRoomCard.roomStruct;
            if (liveRoomStruct3 == null || (user4 = liveRoomStruct3.owner) == null || (uid = user4.getUid()) == null) {
                uid = bulletinLiveRoomCard.uid;
            }
            roomsData.userId = uid;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.roomId = bulletinLiveRoomCard.roomId;
            C21700719wL c21700719wL2 = this.LLJZIJLIL;
            if (c21700719wL2 != null) {
                strLJI = c21700719wL2.LJI();
            }
            String str = "";
            if (strLJI == null) {
                strLJI = "";
            }
            roomsData2.enterFromMerge = strLJI;
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            C21700719wL c21700719wL3 = this.LLJZIJLIL;
            if (c21700719wL3 != null && (strLJIIJ = c21700719wL3.LJIIJ()) != null) {
                str = strLJIIJ;
            }
            roomsData3.enterMethod = str;
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            roomsData4.enterType = "click";
            enterRoomConfig.mLogData.anchorType = "click";
            roomsData4.windowMode = "full_screen";
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(context, enterRoomConfig, bulletinLiveRoomCard.roomData);
            return true;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("singleClick: room data exception, ");
        sbLIZ.append(bulletinLiveRoomCard);
        C1720106oR.LJI("BulletinBaseCell", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OON c0oon) {
        LiveRoomStruct liveRoomStruct;
        User user;
        long jLongValue;
        C11NZ<NewLiveRoomStruct> c11nzLJFF;
        super.onBindItemView(c0oon);
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIILJJIL(c0oon, a7());
        }
        BulletinLiveRoomCard bulletinLiveRoomCard = c0oon.LLJI;
        if (bulletinLiveRoomCard != null && (liveRoomStruct = bulletinLiveRoomCard.roomStruct) != null && (user = liveRoomStruct.owner) != null) {
            BulletinAutoPlayViewModel bulletinAutoPlayViewModelB7 = b7();
            String uid = user.getUid();
            String secUid = user.getSecUid();
            if (!bulletinAutoPlayViewModelB7.LL) {
                bulletinAutoPlayViewModelB7.LL = true;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(uid);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                InterfaceC20673515v3 interfaceC20673515v3 = (InterfaceC20673515v3) bulletinAutoPlayViewModelB7.LLILLJJLI.getValue();
                if (interfaceC20673515v3 != null && (c11nzLJFF = interfaceC20673515v3.LJFF(jLongValue, secUid)) != null) {
                    bulletinAutoPlayViewModelB7.disposeOnClear(c11nzLJFF.LJJLL(new AfS178S0100000_9(bulletinAutoPlayViewModelB7, 59), new AfS178S0100000_9(bulletinAutoPlayViewModelB7, 60)));
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C21700719wL c21700719wL = this.LLJZIJLIL;
        if (c21700719wL != null) {
            c21700719wL.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void N5(C0OVA c0ova, BulletinBaseItem bulletinBaseItem) {
        C21568919b5 c21568919b5R6 = r6();
        if (c21568919b5R6 != null) {
            C0OV6 c0ov6 = c0ova.LIZ;
            if (c0ov6 != null) {
                c21568919b5R6.setRoundingParams(c0ov6);
            }
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(c21568919b5R6);
            if (To()) {
                if (marginLayoutParamsLJI != null) {
                    marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            } else if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            C786410Ut5.j7(c21568919b5R6, marginLayoutParamsLJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OON c0oon, List<? extends Object> list) {
        C21700719wL c21700719wL;
        super.onBindItemView(c0oon, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payloads bind diff:");
        sbLIZ.append(objLJJJLZIJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (((C619660OSe) objLJJJLZIJ).LIZ && (c21700719wL = this.LLJZIJLIL) != null) {
            c21700719wL.LJIILJJIL(c0oon, a7());
        }
    }
}
