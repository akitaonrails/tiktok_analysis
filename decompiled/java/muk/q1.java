package muk;

import X.C01GW;
import X.C091J;
import X.C0A1C;
import X.C11T4;
import X.C13LP;
import X.C1621730sIt;
import X.C1628830sUL;
import X.C1629150sUr;
import X.C1629320sV8;
import X.C1629640sVe;
import X.C1631810sZ9;
import X.C1633200sbO;
import X.C539900LFk;
import X.C579450Mo3;
import X.C703302op;
import X.InterfaceC1629550sVV;
import X.InterfaceC1635390sev;
import Y.AfS172S0100000_3;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import duk.p;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wuk.d0;
import wuk.f;

/* JADX INFO: loaded from: classes26.dex */
public final class q1 extends C1629150sUr {
    public final C1629320sV8 LJII;
    public final ShortVideoContext LJIIIIZZ;

    @Override // X.C1629150sUr, X.InterfaceC1628820sUK
    public final f LIZ(p pVar) {
        boolean z;
        String strLJJLIIIJ;
        f fVarLIZ = super.LIZ(pVar);
        ShortVideoContext shortVideoContext = this.LJIIIIZZ;
        if (shortVideoContext != null) {
            if (Intrinsics.LJFF(shortVideoContext.shootWay, "chat_shoot") && C0A1C.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            boolean zIsEnabled = EffectFullWidthHorizontalCarouselAB.isEnabled();
            if (C579450Mo3.LIZ(shortVideoContext) && (zIsEnabled || z)) {
                C1621730sIt.LIZ.getClass();
                if (C1621730sIt.LIZ()) {
                    List<String> listLIZLLL = C539900LFk.LIZLLL(shortVideoContext);
                    Effect effect = shortVideoContext.creativeModel.recordEffectModel.autoApplyEffect;
                    List<String> list = shortVideoContext.creativeModel.recordEffectModel.effectReuseFlowStickerIds;
                    String effectId = null;
                    if (list != null) {
                        strLJJLIIIJ = (String) C13LP.LJJJLL(list);
                    } else {
                        strLJJLIIIJ = null;
                    }
                    if (effect != null) {
                        effectId = effect.getEffectId();
                    }
                    String str = shortVideoContext.presetEffectId;
                    if (C703302op.LIZ(str)) {
                        strLJJLIIIJ = str;
                    } else if (!C703302op.LIZ(strLJJLIIIJ)) {
                        if (C703302op.LIZ(effectId)) {
                            strLJJLIIIJ = effectId;
                        } else if (!listLIZLLL.isEmpty()) {
                            strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZLLL, ",", null, null, 0, null, null, 62);
                        } else {
                            strLJJLIIIJ = "";
                        }
                    }
                    fVarLIZ.LJJIFFI(new C1633200sbO(listLIZLLL, -1, strLJJLIIIJ), shortVideoContext.getCreationId());
                }
            }
        }
        return fVarLIZ;
    }

    @Override // X.C1629150sUr
    public final C11T4<Unit, CategoryPageModel, C1631810sZ9, CategoryPageModel> LIZIZ(String str, InterfaceC1635390sev interfaceC1635390sev, C01GW<? extends C091J> c01gw) {
        if (this.LJII.LJ.LIZ) {
            return new C1628830sUL(str, interfaceC1635390sev, c01gw);
        }
        return super.LIZIZ(str, interfaceC1635390sev, c01gw);
    }

    public q1(C1629320sV8 c1629320sV8, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1629550sVV interfaceC1629550sVV, List<? extends EffectCategoryModel> list, ShortVideoContext shortVideoContext) {
        super(c1629320sV8, interfaceC1635390sev, interfaceC1629550sVV, list, false);
        this.LJII = c1629320sV8;
        this.LJIIIIZZ = shortVideoContext;
    }

    @Override // X.C1629150sUr
    public final d0 LIZJ(PropInfoData propInfoData, p pVar, final List list, final C01GW c01gw, final C01GW c01gw2, final C01GW c01gw3) {
        if (this.LJII.LJ.LIZ) {
            final C1629640sVe c1629640sVe = this.LJII.LJ;
            return new d0(c01gw, c01gw2, c01gw3, list, c1629640sVe) { // from class: X.091c
                public final C1629640sVe LJJIJIIJIL;

                @Override // wuk.d0
                public final void LJJI(InterfaceC23044091e interfaceC23044091e) {
                    this.LJIILLIIL.LIZ(interfaceC23044091e.LJIJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 88)));
                }

                @Override // wuk.d0, X.InterfaceC1625880sPa
                public final LiveData LJIIJ(String str, boolean z, boolean z2, boolean z3) {
                    if (z && LJJIIJZLJL()) {
                        this.LJIJI.getValue().setValue(C1641640sp0.LIZIZ());
                        InterfaceC23044091e interfaceC23044091e = this.LJIILL;
                        if (interfaceC23044091e != null) {
                            if (str == null) {
                                str = "";
                            }
                            interfaceC23044091e.LJIIIZ(new C1633080sbC(str, false, z3, 862));
                        }
                    }
                    return this.LJIJI.getValue();
                }

                @Override // wuk.d0, X.InterfaceC1625880sPa
                public final MutableLiveData LJIJJLI(String str, Map map, boolean z, boolean z2) {
                    return (MutableLiveData) LJIIJJI(z, z2, str, 0, 0, 0, map);
                }

                {
                    PropInfoData propInfoData2 = new PropInfoData(Boolean.FALSE, null, null, null, null, null, null);
                    this.LJJIJIIJIL = c1629640sVe;
                }

                @Override // wuk.d0, X.InterfaceC1625880sPa
                public final LiveData LJIIJJI(boolean z, boolean z2, String str, int i, int i2, int i3, Map map) {
                    List<Effect> effects;
                    CategoryEffectModel categoryEffectModel;
                    int i4 = i3;
                    MutableLiveData<C1641640sp0<CategoryEffectModel>> mutableLiveDataLJJIII = LJJIII(str);
                    if (i4 == 0) {
                        i4 = this.LJJIJIIJIL.LIZIZ;
                    }
                    if (mutableLiveDataLJJIII.getValue() != null) {
                        C1641640sp0<CategoryEffectModel> value = mutableLiveDataLJJIII.getValue();
                        if (value == null || (categoryEffectModel = value.LIZ) == null || (effects = categoryEffectModel.getEffects()) == null) {
                            effects = C13BV.INSTANCE;
                        }
                        effects.size();
                    }
                    if (mutableLiveDataLJJIII.getValue() != null) {
                        mutableLiveDataLJJIII.getValue();
                    }
                    if (z) {
                        mutableLiveDataLJJIII.setValue(C1641640sp0.LIZIZ());
                        InterfaceC23044091e interfaceC23044091e = this.LJIILL;
                        if (interfaceC23044091e != null) {
                            interfaceC23044091e.LIZIZ(new C1631810sZ9(str, i4, i, i2, z2, 0, map, 368));
                        }
                    }
                    return mutableLiveDataLJJIII;
                }
            };
        }
        return super.LIZJ(propInfoData, pVar, list, c01gw, c01gw2, c01gw3);
    }
}
