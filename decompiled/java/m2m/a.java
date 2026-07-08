package m2m;

import X.AbstractC1646530swt;
import X.AbstractC1653180t7c;
import X.C01GW;
import X.C13LE;
import X.C1453870nw9;
import X.C1637850sit;
import X.C1653330t7r;
import X.C1664740tQG;
import X.C19EG;
import X.C1DRG;
import X.C2217381BqS;
import X.C268110Af3;
import X.C452501pT;
import X.EnumC1641390sob;
import X.EnumC1647570syZ;
import X.InterfaceC1642740sqm;
import X.InterfaceC1646220swO;
import X.InterfaceC1653360t7u;
import X.InterfaceC1655090tAh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObjectS244S0100000_18;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import ln3.a;
import lnn.q;
import lth.o;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends AbstractC1646530swt implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public boolean LLILZ;
    public boolean LLILZLL;
    public boolean LLILZIL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 870));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 869));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(a.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public a(C1DRG c1drg) {
        this.LLILLJJLI = c1drg;
        this.LLILLL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1646220swO.class), InterfaceC1646220swO.class);
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a6n.a aVar) {
        EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.LIVE;
        return new C1653330t7r(((Context) this.LLILLJJLI.LJII(C19EG.class, null)).getString(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag(), "live", aVar.LIZLLL().mToLive, new InterfaceC1653360t7u() { // from class: X.0t2S
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC21363518j3 interfaceC21363518j3Wt2;
                InterfaceC21363518j3 interfaceC21363518j3Wt22;
                a aVarLIZJ;
                C385670FAf<a> c385670FAfEx;
                Object obj;
                String str;
                m2m.a aVar2 = this.LIZ;
                InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) aVar2.LLILLL.getValue(aVar2, m2m.a.LLJ[0]);
                if (interfaceC1646220swO != null) {
                    int iLJFF = C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
                    C1647390syH c1647390syH = c1646490swp.LIZJ;
                    if (c1647390syH != null) {
                        obj = c1647390syH.LIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    interfaceC1646220swO.uF2(iLJFF, str, c1646490swp.LJ, EnumC2008807tu.TAB_CHANGED);
                }
                C1638140sjM.LIZ(EnumC1647590syb.LIVE);
                a6n.a aVar3 = aVar;
                if (aVar3.LIZ) {
                    InterfaceC1646290swV interfaceC1646290swV = aVar3.LIZIZ;
                    if (interfaceC1646290swV != null) {
                        interfaceC1646290swV.n3("live");
                    }
                } else {
                    a aVar4 = aVar3.LIZLLL;
                    if (aVar4 != null) {
                        aVar4.n3("live");
                    }
                }
                ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ((ViewModelProvider) this.LIZ.LLILLJJLI.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
                ((com.ss.android.ugc.aweme.shortvideo.component.a) this.LIZ.LLILLJJLI.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null)).eP2(false);
                if (shortVideoContextViewModel.LL.cameraComponentModel.mDurings.isEmpty()) {
                    m2m.a aVar5 = this.LIZ;
                    a6n.a aVar6 = aVar;
                    aVar5.getClass();
                    AbstractC1646530swt.LIZIZ(c1646490swp, aVar6);
                    aVar.LIZIZ().qh(0);
                    shortVideoContextViewModel.LL.mToLive = true;
                    a6n.a aVar7 = aVar;
                    if (aVar7.LIZ) {
                        InterfaceC1647420syK interfaceC1647420syK = aVar7.LIZJ;
                        if (interfaceC1647420syK != null && (c385670FAfEx = interfaceC1647420syK.ex()) != null) {
                            aVarLIZJ = c385670FAfEx.LIZJ();
                        }
                    } else {
                        aVarLIZJ = aVar7.LIZLLL;
                    }
                    if (aVarLIZJ != null) {
                        aVarLIZJ.gn(false);
                    }
                }
                ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LIZIZ(aVar.LIZLLL(), aVar.LIZ());
                aVar.LIZIZ().St2().getMediaController().k5(null);
                if (shortVideoContextViewModel.LL.cameraComponentModel.curBackgroundVideo != null) {
                    q value = aVar.LJ().getValue();
                    if (value != null && (interfaceC21363518j3Wt22 = value.wt2()) != null) {
                        interfaceC21363518j3Wt22.LJ();
                    }
                    q value2 = aVar.LJ().getValue();
                    if (value2 != null && (interfaceC21363518j3Wt2 = value2.wt2()) != null) {
                        interfaceC21363518j3Wt2.LIZJ();
                    }
                }
                m2m.a aVar8 = this.LIZ;
                if (!aVar8.LLILZ || !aVar8.LLILZIL) {
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", C1653340t7s.LJ);
                    c0lab.LJ("live_entrance_name", C1653340t7s.LJ);
                    c0lab.LJ("live_tab_show_type", C1653340t7s.LIZLLL);
                    c0lab.LJI(C1653340t7s.LJFF);
                    C2341909Fp.LIZ("livesdk_live_entrance_click", c0lab.LIZ);
                }
                this.LIZ.LLILZIL = false;
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                C385670FAf<a> c385670FAfEx;
                a aVarLIZJ;
                ((ShortVideoContextViewModel) ((ViewModelProvider) this.LIZ.LLILLJJLI.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LL.mToLive = false;
                FrameLayout frameLayout = (FrameLayout) aVar.LIZ().findViewById(R.id.mg3);
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                m2m.a aVar2 = this.LIZ;
                a6n.a aVar3 = aVar;
                aVar2.getClass();
                AbstractC1646530swt.LIZ(c1646490swp, aVar3);
                a6n.a aVar4 = aVar;
                if (aVar4.LIZ) {
                    InterfaceC1646290swV interfaceC1646290swV = aVar4.LIZIZ;
                    if (interfaceC1646290swV != null) {
                        interfaceC1646290swV.n3("record");
                    }
                    InterfaceC1647420syK interfaceC1647420syK = aVar.LIZJ;
                    if (interfaceC1647420syK != null && (c385670FAfEx = interfaceC1647420syK.ex()) != null && (aVarLIZJ = c385670FAfEx.LIZJ()) != null) {
                        aVarLIZJ.Ec();
                    }
                } else {
                    a aVar5 = aVar4.LIZLLL;
                    if (aVar5 != null) {
                        aVar5.n3("record");
                    }
                    a aVar6 = aVar.LIZLLL;
                    if (aVar6 != null) {
                        aVar6.Ec();
                        return false;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
                m2m.a aVar2 = this.LIZ;
                if (!aVar2.LLILZLL && !aVar2.LLILZ) {
                    C01TT.LIZIZ(1500L, new AwS426S0200000_25(c1653300t7o, aVar2, 143));
                }
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a6n.a aVar) {
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) ((ViewModelProvider) this.LLILLJJLI.LJII(ViewModelProvider.class, null)).get(RecordLiveViewModel.class);
        IRecordingOperationPanel iRecordingOperationPanel = aVar.LJ;
        if (iRecordingOperationPanel == null) {
            iRecordingOperationPanel = null;
        }
        recordLiveViewModel.LL = iRecordingOperationPanel;
        recordLiveViewModel.LLILLJJLI = aVar.LIZIZ();
        recordLiveViewModel.LLILZ = aVar.LIZLLL();
        recordLiveViewModel.LLILLL = aVar.LIZJ();
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C19EG c19egLIZ = aVar.LIZ();
        interfaceC1655090tAh.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v5();
        C01GW c01gw = C268110Af3.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().preloadLiveTabLegacy(c19egLIZ);
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C19EG c19egLIZ2 = aVar.LIZ();
            AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25(this, aVar, 144);
            if (C1637850sit.LIZIZ(this)) {
                ((C1453870nw9) this.LLILLJJLI.LJII(C1453870nw9.class, null)).LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(c19egLIZ2, new AObjectS244S0100000_18(awS426S0200000_25, 26));
            } else {
                InterfaceC1642740sqm interfaceC1642740sqm = (InterfaceC1642740sqm) this.LLILLJJLI.LJIIL(null, InterfaceC1642740sqm.class);
                if (interfaceC1642740sqm != null) {
                    interfaceC1642740sqm.aa1().LIZ(c19egLIZ2, new AObjectS244S0100000_18(awS426S0200000_25, 11));
                } else {
                    awS426S0200000_25.invoke();
                }
            }
        }
        this.LLILZ = aVar.LIZLLL().mToLive;
    }
}
