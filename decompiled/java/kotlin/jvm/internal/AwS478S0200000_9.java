package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.C05P0;
import X.C09AY;
import X.C0NW2;
import X.C1168070gVB;
import X.C1378605aS;
import X.C1679720toQ;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1685760tyA;
import X.C189200o6;
import X.C1909107dp;
import X.C20028913Yh;
import X.C23271099x;
import X.C2382909Vj;
import X.C2450909j1;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.C604030Nmb;
import X.C604060Nme;
import X.C604810Nnr;
import X.C604820Nns;
import X.C616980OHw;
import X.C631870OqP;
import X.EnumC604020Nma;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC497601wk;
import X.InterfaceC595010NVj;
import X.InterfaceC604040Nmc;
import X.InterfaceC634840OvC;
import android.content.Intent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.mix.choose.PlaylistChoosePanelViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.music.assem.MusicHeaderAssem;
import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightEllipsisAssem;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AwS478S0200000_9 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn2, PlaylistChoosePanelViewModel playlistChoosePanelViewModel) {
        super(3);
        this.$t = playlistChoosePanelViewModel;
        this.l0 = interfaceC1364105Vn;
        this.l1 = interfaceC1364105Vn2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS478S0200000_9(C616980OHw c616980OHw, C604810Nnr c604810Nnr, int i) {
        super(3);
        this.$t = i;
        this.l0 = c616980OHw;
        this.l1 = c604810Nnr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(CompletionBlock completionBlock, CompletionBlock<InterfaceC604040Nmc> completionBlock2, C604060Nme c604060Nme) {
        super(3);
        this.$t = c604060Nme;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(MusicListComposableAssem musicListComposableAssem, MusicListComposableAssem musicListComposableAssem2, C05P0<Boolean> c05p0) {
        super(3);
        this.$t = c05p0;
        this.l0 = musicListComposableAssem;
        this.l1 = musicListComposableAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(List list, List<MusicGroup> list2, MusicHeaderAssem musicHeaderAssem) {
        super(3);
        this.$t = musicHeaderAssem;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(List list, List<MusicGroup> list2, FanSpotlightEllipsisAssem fanSpotlightEllipsisAssem) {
        super(3);
        this.$t = fanSpotlightEllipsisAssem;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS478S0200000_9(Function1 function1, Function1<? super C1378605aS, Unit> function12, InterfaceC595010NVj interfaceC595010NVj) {
        super(3);
        this.$t = interfaceC595010NVj;
        this.l0 = function1;
        this.l1 = function12;
    }

    public static final Object invoke$0(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        EnumC604020Nma enumC604020Nma = (EnumC604020Nma) obj3;
        String containerID = null;
        int i = 0;
        if (((Boolean) obj).booleanValue()) {
            CompletionBlock completionBlock = (CompletionBlock) awS478S0200000_9.l0;
            InterfaceC634840OvC interfaceC634840OvC = ((C604060Nme) awS478S0200000_9.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC604040Nmc.class, containerID);
            InterfaceC604040Nmc interfaceC604040Nmc = (InterfaceC604040Nmc) xBaseModelLIZJ;
            if (enumC604020Nma != null && C604030Nmb.LIZ[enumC604020Nma.ordinal()] == 1) {
                i = 1;
            }
            interfaceC604040Nmc.setContainerType(Integer.valueOf(i));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            CompletionBlock completionBlock2 = (CompletionBlock) awS478S0200000_9.l0;
            if (str == null) {
                str = "";
            }
            C2382909Vj.LIZ(completionBlock2, 0, str, null, 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        List<MixStruct> list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        if (zBooleanValue) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS478S0200000_9.l0;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            List<C1168070gVB> listWQ2 = ((PlaylistChoosePanelViewModel) awS478S0200000_9.l1).wQ2(list);
            c317290CcB.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, lValueOf, listWQ2);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS478S0200000_9.l0;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            List<C1168070gVB> listWQ22 = ((PlaylistChoosePanelViewModel) awS478S0200000_9.l1).wQ2(list);
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listWQ22);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        List<MixStruct> list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        if (list.isEmpty()) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS478S0200000_9.l0;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<C1168070gVB> listWQ2 = ((PlaylistChoosePanelViewModel) awS478S0200000_9.l1).wQ2(list);
            c317290CcB.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listWQ2);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn.resumeWith(c316640Cb8);
        } else if (zBooleanValue) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS478S0200000_9.l0;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            List<C1168070gVB> listWQ22 = ((PlaylistChoosePanelViewModel) awS478S0200000_9.l1).wQ2(list);
            c317290CcB2.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, lValueOf, listWQ22);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn2.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) awS478S0200000_9.l0;
            C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
            List<C1168070gVB> listWQ23 = ((PlaylistChoosePanelViewModel) awS478S0200000_9.l1).wQ2(list);
            c317290CcB3.getClass();
            C316640Cb8 c316640Cb82 = new C316640Cb8(listWQ23);
            C189200o6.m2constructorimpl(c316640Cb82);
            interfaceC1364105Vn3.resumeWith(c316640Cb82);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        Serializable searchPinnedMusicList;
        SearchPinnedMusicList searchPinnedMusicList2;
        ((Number) obj).intValue();
        Intent intent = (Intent) obj3;
        if (((Number) obj2).intValue() == -1) {
            if (intent == null || (searchPinnedMusicList = intent.getSerializableExtra("pinned_music_list")) == null) {
                searchPinnedMusicList = new SearchPinnedMusicList();
            }
            if (!(searchPinnedMusicList instanceof SearchPinnedMusicList) || (searchPinnedMusicList2 = (SearchPinnedMusicList) searchPinnedMusicList) == null) {
                searchPinnedMusicList2 = new SearchPinnedMusicList();
            }
            if (!Intrinsics.LJFF((List) awS478S0200000_9.l0, searchPinnedMusicList2.getMusicGroups())) {
                ((MusicHeaderAssem) awS478S0200000_9.l1).hp().refresh();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            OriginMusicListViewModel originMusicListViewModelAp = ((MusicListComposableAssem) awS478S0200000_9.l0).Ap();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            C05P0 c05p0 = (C05P0) awS478S0200000_9.l1;
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS553S0100000_9(c05p0, (C05P0<Boolean>) 1134);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg.LJ();
            C631870OqP.LIZ(originMusicListViewModelAp, (Function0) objLJJ, interfaceC1680500tpg, 48);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        C2450909j1.LIZJ(new C604820Nns((C616980OHw) awS478S0200000_9.l0, (C604810Nnr) awS478S0200000_9.l1, ((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (String) obj3));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        Serializable searchPinnedMusicList;
        SearchPinnedMusicList searchPinnedMusicList2;
        ((Number) obj).intValue();
        Intent intent = (Intent) obj3;
        if (((Number) obj2).intValue() == -1) {
            if (intent == null || (searchPinnedMusicList = intent.getSerializableExtra("pinned_music_list")) == null) {
                searchPinnedMusicList = new SearchPinnedMusicList();
            }
            if (!(searchPinnedMusicList instanceof SearchPinnedMusicList) || (searchPinnedMusicList2 = (SearchPinnedMusicList) searchPinnedMusicList) == null) {
                searchPinnedMusicList2 = new SearchPinnedMusicList();
            }
            if (!Intrinsics.LJFF((List) awS478S0200000_9.l0, searchPinnedMusicList2.getMusicGroups())) {
                ((FanSpotlightEllipsisAssem) awS478S0200000_9.l1).cp().refresh();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS478S0200000_9 awS478S0200000_9, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-102778667);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = C20028913Yh.LJI(null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        final C05P0 c05p0 = (C05P0) objLJJ2;
        final C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ((Function1) awS478S0200000_9.l0, interfaceC1680500tpg);
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) awS478S0200000_9.l1;
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(interfaceC595010NVj);
        InterfaceC595010NVj interfaceC595010NVj2 = (InterfaceC595010NVj) awS478S0200000_9.l1;
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ3 == c1680520tpi) {
            objLJJ3 = new AwS375S0200000_9(c05p0, (C05P0<C0NW2>) interfaceC595010NVj2, (InterfaceC595010NVj) 175);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        C1680540tpk.LIZIZ(interfaceC595010NVj, (Function1) objLJJ3, interfaceC1680500tpg);
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        InterfaceC595010NVj interfaceC595010NVj3 = (InterfaceC595010NVj) awS478S0200000_9.l1;
        boolean zLJII = interfaceC1680500tpg.LJII(interfaceC497601wk) | interfaceC1680500tpg.LJJIIJ((InterfaceC595010NVj) awS478S0200000_9.l1) | interfaceC1680500tpg.LJJIIJ(c05p0LJIIIIZZ);
        final InterfaceC595010NVj interfaceC595010NVj4 = (InterfaceC595010NVj) awS478S0200000_9.l1;
        Object objLJJ4 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ4 == c1680520tpi) {
            objLJJ4 = new PointerInputEventHandler() { // from class: X.0NVq
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    Object objLIZLLL = C1374405Zm.LIZLLL(interfaceC1369205Xm, new C595060NVo(interfaceC497601wk, c05p0, interfaceC595010NVj4, null), new AwS588S0100000_9(c05p0LJIIIIZZ, (C05P1<? extends Function1<? super C1378605aS, Unit>>) 675), interfaceC1364105Vn);
                    if (objLIZLLL == C099R.LJFF()) {
                        return objLIZLLL;
                    }
                    return Unit.LIZ;
                }
            };
            interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
        }
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1679720toQ.LIZ(c1685760tyA, interfaceC595010NVj3, (PointerInputEventHandler) objLJJ4);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }
}
