package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C09AY;
import X.C13LP;
import X.C1656670tDF;
import X.C1656680tDG;
import X.C1676560tjK;
import X.C1682380tsi;
import X.C1697810uHb;
import X.C189200o6;
import X.C201955140j;
import X.C201962140q;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23260099m;
import X.C2344009Gk;
import X.EnumC1671200tag;
import X.InterfaceC1364105Vn;
import X.InterfaceC1668050tVb;
import X.InterfaceC1672350tcX;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.gamora.editor.music.effect.MusicInfoAndEffectUseCount;
import com.ss.android.ugc.gamora.editor.music.effect.RecommendMusic;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS33S0200100_25 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS33S0200100_25 awS33S0200100_25, Object obj) {
        InterfaceC1668050tVb interfaceC1668050tVb = ((C1676560tjK) awS33S0200100_25.l0).LLJJIII.LIZIZ;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS33S0200100_25.l1;
        AbstractC1683310tuD.LJ((AbstractC1683310tuD) obj, (AbstractC1686530tzP) awS33S0200100_25.l1, interfaceC1668050tVb.LIZ((((long) abstractC1686530tzP.LL) << 32) | (((long) abstractC1686530tzP.LLILLJJLI) & 4294967295L), awS33S0200100_25.j2, EnumC1671200tag.Ltr));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS33S0200100_25 awS33S0200100_25, Object obj) {
        List<MusicInfoAndEffectUseCount> musicList;
        C1656680tDG c1656680tDG = (C1656680tDG) obj;
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMusicByEffectManager getRecommendMusicWithSoftLined.");
        sbLIZ.append(c1656680tDG);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis() - awS33S0200100_25.j2;
        if (Intrinsics.LJFF(c1656680tDG, C1656680tDG.LIZIZ)) {
            C1656670tDF c1656670tDF = C1656670tDF.LIZ;
            IMusicRequestParam iMusicRequestParam = (IMusicRequestParam) awS33S0200100_25.l0;
            c1656670tDF.getClass();
            C2344009Gk c2344009GkLIZ = C1656670tDF.LIZ(jCurrentTimeMillis, iMusicRequestParam);
            c2344009GkLIZ.LIZJ(-1, "error_code");
            C20684815ws.LJIILLIIL("tools_mix_material_request_effect_music", c2344009GkLIZ.LIZ);
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS33S0200100_25.l1;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn.resumeWith(null);
        } else {
            RecommendMusic recommendMusic = c1656680tDG.LIZ;
            if (recommendMusic != null) {
                musicList = recommendMusic.getMusicList();
            } else {
                musicList = null;
            }
            if (musicList != null && !musicList.isEmpty()) {
                InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS33S0200100_25.l1;
                C189200o6.m2constructorimpl(c1656680tDG);
                interfaceC1364105Vn2.resumeWith(c1656680tDG);
            } else {
                C1656670tDF c1656670tDF2 = C1656670tDF.LIZ;
                IMusicRequestParam iMusicRequestParam2 = (IMusicRequestParam) awS33S0200100_25.l0;
                c1656670tDF2.getClass();
                C2344009Gk c2344009GkLIZ2 = C1656670tDF.LIZ(jCurrentTimeMillis, iMusicRequestParam2);
                c2344009GkLIZ2.LIZJ(0, "error_code");
                C20684815ws.LJIILLIIL("tools_mix_material_request_effect_music", c2344009GkLIZ2.LIZ);
                InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) awS33S0200100_25.l1;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn3.resumeWith(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S0200100_25 awS33S0200100_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        List<List> list = (List) awS33S0200100_25.l0;
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) awS33S0200100_25.l1;
        long j = awS33S0200100_25.j2;
        int iLJJL = 0;
        for (List list2 : list) {
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) obj2;
                    Iterator it2 = C13LP.LL(list2, i).iterator();
                    int iLJIIIIZZ = 0;
                    while (it2.hasNext()) {
                        iLJIIIIZZ += ((AbstractC1686530tzP) it2.next()).LJJLI();
                    }
                    if (interfaceC1672350tcX.getLayoutDirection() != EnumC1671200tag.Ltr) {
                        iLJIIIIZZ = (C1682380tsi.LJIIIIZZ(j) - iLJIIIIZZ) - abstractC1686530tzP.LJJLI();
                    }
                    abstractC1683310tuD.LIZLLL(abstractC1686530tzP, iLJIIIIZZ, iLJJL, 0.0f);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            iLJJL += ((AbstractC1686530tzP) C13LP.LJJJJZI(list2)).LJJL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0200100_25(long j, IMusicRequestParam iMusicRequestParam, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = iMusicRequestParam;
        this.l1 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS33S0200100_25) (LINE:67174400) kotlin.jvm.internal.AwS33S0200100_25.$t int, block:B:2:0x0000 */
    public AwS33S0200100_25(C1676560tjK c1676560tjK, C1676560tjK<S> c1676560tjK2, AbstractC1686530tzP abstractC1686530tzP, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = c1676560tjK;
        this.l1 = c1676560tjK2;
        this.j2 = abstractC1686530tzP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS33S0200100_25) (LINE:67239936) kotlin.jvm.internal.AwS33S0200100_25.$t int, block:B:2:0x0000 */
    public AwS33S0200100_25(List list, List<List<AbstractC1686530tzP>> list2, InterfaceC1672350tcX interfaceC1672350tcX, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.j2 = interfaceC1672350tcX;
    }
}
