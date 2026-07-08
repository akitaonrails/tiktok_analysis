package muk;

import X.C1621360sII;
import X.C1624340sN6;
import X.C1625320sOg;
import X.C1625920sPe;
import X.C1629320sV8;
import X.C19GS;
import X.InterfaceC1624480sNK;
import X.InterfaceC1628820sUK;
import X.InterfaceC1629370sVD;
import X.InterfaceC1629550sVV;
import X.InterfaceC1629750sVp;
import X.InterfaceC1635390sev;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.TiktokStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public class p1 extends C1625320sOg {
    public final ShortVideoContext LJIIJ;
    public final InterfaceC1635390sev LJIIJJI;

    @Override // X.C1625320sOg
    public InterfaceC1628820sUK LIZIZ(C1629320sV8 c1629320sV8, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1629550sVV interfaceC1629550sVV, List<? extends EffectCategoryModel> list, boolean z) {
        q1 q1Var = new q1(c1629320sV8, interfaceC1635390sev, interfaceC1629550sVV, list, this.LJIIJ);
        InterfaceC1629750sVp interfaceC1629750sVp = this.LJII;
        if (interfaceC1629750sVp != null) {
            q1Var.LJFF = interfaceC1629750sVp;
        }
        q1Var.LJI = new AwS569S0100000_25(this, 887);
        return q1Var;
    }

    public p1(C19GS c19gs, LifecycleOwner lifecycleOwner, ShortVideoContext shortVideoContext, C1629320sV8 c1629320sV8, InterfaceC1629550sVV interfaceC1629550sVV, InterfaceC1635390sev interfaceC1635390sev, List list) {
        super(c19gs, c1629320sV8, interfaceC1629550sVV, interfaceC1635390sev, list, lifecycleOwner, 32);
        this.LJIIJ = shortVideoContext;
        this.LJIIJJI = interfaceC1635390sev;
    }

    @Override // X.C1625320sOg
    public final InterfaceC1624480sNK LIZ(C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1628820sUK interfaceC1628820sUK, C1624340sN6 c1624340sN6, InterfaceC1629370sVD interfaceC1629370sVD, C1625920sPe c1625920sPe, LifecycleOwner lifecycleOwner) {
        ShortVideoContext shortVideoContext;
        int i = 0;
        if (C1621360sII.LIZ() && (shortVideoContext = this.LJIIJ) != null && shortVideoContext.LJJLL()) {
            i = 2;
        }
        return new TiktokStickerDataManager(c19gs, c1629320sV8, interfaceC1628820sUK, c1624340sN6, interfaceC1629370sVD, lifecycleOwner, i);
    }
}
