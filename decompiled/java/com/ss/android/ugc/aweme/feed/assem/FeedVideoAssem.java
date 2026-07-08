package com.ss.android.ugc.aweme.feed.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C04UE;
import X.C0R95;
import X.C0RDX;
import X.C0REV;
import X.C0REW;
import X.C0REX;
import X.C0REY;
import X.C0REZ;
import X.C0S0L;
import X.C1009740cNo;
import X.C1017070cZd;
import X.C10IT;
import X.C1383760m74;
import X.C13LE;
import X.C1558520qew;
import X.C19719912Dl;
import X.C452501pT;
import X.C690870R8b;
import X.C692680RFa;
import X.C694070RKj;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C725080ScM;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import X.InterfaceC723720SaA;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.LongPressDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.longpressanim.LongPressEmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.contentclassification.TUCContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.general.TUCGeneralMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.photosensitive.TUCPhotosensitiveMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.report.TUCReportMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.IOnHolderSelectOwner;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVideoAssem extends BaseCellContentComponent<FeedVideoAssem> implements ILazyLoadAbility, IOnHolderSelectOwner, InterfaceC1554640qYg {
    public final BaseFeedPageParams LLJJJJLIIL;
    public final Function0<Long> LLJJL;
    public final Set<C0REZ> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0R95());
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(77));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C0REV());
    public final C692680RFa LLJLL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1368266133 || iHashCode == -959555912) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ILazyLoadAbility
    public void PV() {
        C723830SaL.LIZJ(this, C1383760m74.LIZIZ.LJJIIZI(), true);
    }

    public final void ip() {
        C723830SaL.LJ(this, C13LE.LIZ(EmojiAnimAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LongPressEmojiAnimAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LongPressDiggAssem.class), true, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
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
        C0REW c0rew = (C0REW) this.LLJLILLLLZIIL.getValue();
        c0rew.LIZ = false;
        c0rew.LIZIZ = -1;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public static C694070RKj ep(C694070RKj c694070RKj) {
        C694070RKj c694070RKj2 = C694070RKj.LIZIZ;
        if (!Intrinsics.LJFF(c694070RKj, c694070RKj2)) {
            return C694070RKj.LIZ;
        }
        return c694070RKj2;
    }

    @Override // com.ss.android.ugc.feed.platform.IOnHolderSelectOwner
    public final void DF1(C0REX c0rex) {
        Object obj;
        int i;
        C0REW c0rew = (C0REW) this.LLJLILLLLZIIL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        }
        if (!c0rew.LIZJ.contains(c0rex)) {
            c0rew.LIZJ.add(c0rex);
            if (c0rew.LIZ && (i = c0rew.LIZIZ) >= 0) {
                c0rex.J1(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
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

    @Override // com.ss.android.ugc.feed.platform.IOnHolderSelectOwner
    public final void LK2(C0REX c0rex) {
        C0REW c0rew = (C0REW) this.LLJLILLLLZIIL.getValue();
        if (c0rew.LIZJ.contains(c0rex)) {
            c0rew.LIZJ.remove(c0rex);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
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

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: hp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        boolean zLJFF;
        boolean z;
        IAdComponentService iAdComponentService;
        C19719912Dl c19719912DlLJIL;
        IAdAssemService iAdAssemService;
        C19719912Dl c19719912DlLIZIZ;
        VideoMaskInfo contentClassificationMaskInfo = videoItemParams.getAweme().getContentClassificationMaskInfo();
        if (contentClassificationMaskInfo != null) {
            zLJFF = Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            C723830SaL.LJ(this, C13LE.LIZ(TUCContentClassificationMaskAssem.class), true, null);
        }
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c10it.getClass();
        if (C10IT.LJIIL(aweme)) {
            C723830SaL.LJ(this, C13LE.LIZ(TUCGeneralMaskAssem.class), true, null);
        }
        if (C10IT.LJIILJJIL(videoItemParams.getAweme())) {
            C723830SaL.LJ(this, C13LE.LIZ(TUCReportMaskAssem.class), true, null);
        }
        if (C10IT.LJIILIIL(videoItemParams.getAweme())) {
            C723830SaL.LJ(this, C13LE.LIZ(TUCPhotosensitiveMaskAssem.class), true, null);
        }
        if (AwemeExtKt.isAdTraffic(videoItemParams.getAweme()) && (iAdAssemService = (IAdAssemService) ServiceManager.get().getService(IAdAssemService.class)) != null && (c19719912DlLIZIZ = iAdAssemService.LIZIZ()) != null) {
            C723830SaL.LJ(this, c19719912DlLIZIZ, true, null);
        }
        C0S0L c0s0l = C0S0L.LIZ;
        C690870R8b c690870R8bJm = jm();
        c0s0l.getClass();
        if (C0S0L.LJFF(c690870R8bJm)) {
            if (C1009740cNo.LIZJ(videoItemParams.getAweme()) && ((Boolean) C04UE.LIZ.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            Aweme aweme2 = videoItemParams.getAweme();
            if (((aweme2 != null && (C1017070cZd.LJZI(aweme2) || C1017070cZd.LJZL(aweme2))) || z) && (iAdComponentService = (IAdComponentService) this.LLJLIL.getValue()) != null && (c19719912DlLJIL = iAdComponentService.LJIL()) != null) {
                C723830SaL.LJ(this, c19719912DlLJIL, true, null);
            }
        }
        ip();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            interfaceC723720SaA.log("AssemList", "reusedUiSlotAssem onViewCreated");
        }
        C723830SaL.LIZ(this, null, new C0REY(this, view));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void J1(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
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
        C0REW c0rew = (C0REW) this.LLJLILLLLZIIL.getValue();
        c0rew.LIZ = true;
        c0rew.LIZIZ = i;
        Iterator<C0REX> it3 = c0rew.LIZJ.iterator();
        while (it3.hasNext()) {
            it3.next().J1(i, aweme);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
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

    /* JADX WARN: Multi-variable type inference failed */
    public FeedVideoAssem(BaseFeedPageParams baseFeedPageParams, Function0<Long> function0, int i, Set<? extends C0REZ> set) {
        this.LLJJJJLIIL = baseFeedPageParams;
        this.LLJJL = function0;
        this.LLJJLIIIJLLLLLLLZ = set;
        this.LLJLL = new C692680RFa(i);
    }
}
