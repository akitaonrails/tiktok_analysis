package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector;

import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C09R3;
import X.C0QSJ;
import X.C1121670fIL;
import X.C1134904cF;
import X.C11S5;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1701940uOG;
import X.C1815530xLT;
import X.C1818240xPq;
import X.C1818410xQ7;
import X.C1818480xQE;
import X.C1818530xQJ;
import X.C1818550xQL;
import X.C1818560xQM;
import X.C1818570xQN;
import X.C1818580xQO;
import X.C1818590xQP;
import X.C1818600xQQ;
import X.C1818610xQR;
import X.C1818640xQU;
import X.C1818650xQV;
import X.C1818660xQW;
import X.C1818670xQX;
import X.C1834150xpV;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.SceneryLayoutSelectorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryLayoutSelectorAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1818610xQR(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1818600xQQ(this));
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public C127G LLJJJIL;
    public InterfaceC665370Q7z LLJJJJ;
    public C0QSJ LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SceneryLayoutSelectorAssem.class, "operationListViewModel", "getOperationListViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/operationbtm/viewmodel/SceneryModeOperationListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SceneryLayoutSelectorAssem.class, "sceneryLayoutTypeViewModel", "getSceneryLayoutTypeViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/typechunk/SceneryLayoutTypeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SceneryLayoutSelectorAssem.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SceneryLayoutSelectorAssem.class, "sceneryApplyViewModel", "getSceneryApplyViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/SceneryApplyViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public SceneryLayoutSelectorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryModeOperationListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C1818560xQM(c19719912DlLIZ), new C1818640xQU(), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SceneryLayoutTypeViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C1818570xQN(c19719912DlLIZ2), new C1818650xQV(), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SceneryPictureViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new C1818580xQO(c19719912DlLIZ3), new C1818660xQW(), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SceneryApplyViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new C1818590xQP(c19719912DlLIZ4), new C1818670xQX(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ggj;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardSceneryScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSceneryScope.class);
        return arrayList;
    }

    public final C0QSJ hp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJJJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BoardSceneryScope.class});
        this.LLJJJJJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SceneryApplyViewModel.class, new Function0() { // from class: X.0xPr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() throws IllegalAccessException {
                            InterfaceC1815490xLP interfaceC1815490xLP;
                            InterfaceC1815510xLR interfaceC1815510xLR;
                            InterfaceC1815500xLQ interfaceC1815500xLQ;
                            SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem = this.LL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryLayoutSelectorAssem.LLJJJJLIIL;
                            C0QSJ c0qsjHp = sceneryLayoutSelectorAssem.hp();
                            InterfaceC1818450xQB interfaceC1818450xQB = null;
                            if (c0qsjHp != null) {
                                interfaceC1815490xLP = (InterfaceC1815490xLP) c0qsjHp.getAbility(InterfaceC1815490xLP.class);
                                C687700QyG.LJ(interfaceC1815490xLP, InterfaceC1815490xLP.class);
                            } else {
                                interfaceC1815490xLP = null;
                            }
                            C0QSJ c0qsjHp2 = sceneryLayoutSelectorAssem.hp();
                            if (c0qsjHp2 != null) {
                                interfaceC1815510xLR = (InterfaceC1815510xLR) c0qsjHp2.getAbility(InterfaceC1815510xLR.class);
                                C687700QyG.LJ(interfaceC1815510xLR, InterfaceC1815510xLR.class);
                            } else {
                                interfaceC1815510xLR = null;
                            }
                            C0QSJ c0qsjHp3 = sceneryLayoutSelectorAssem.hp();
                            if (c0qsjHp3 != null) {
                                interfaceC1815500xLQ = (InterfaceC1815500xLQ) c0qsjHp3.getAbility(InterfaceC1815500xLQ.class);
                                C687700QyG.LJ(interfaceC1815500xLQ, InterfaceC1815500xLQ.class);
                            } else {
                                interfaceC1815500xLQ = null;
                            }
                            C0QSJ c0qsjHp4 = sceneryLayoutSelectorAssem.hp();
                            if (c0qsjHp4 != null) {
                                interfaceC1818450xQB = (InterfaceC1818450xQB) c0qsjHp4.getAbility(InterfaceC1818450xQB.class);
                                C687700QyG.LJ(interfaceC1818450xQB, InterfaceC1818450xQB.class);
                            }
                            return new SceneryApplyViewModel(interfaceC1815490xLP, interfaceC1815510xLR, interfaceC1815500xLQ, interfaceC1818450xQB);
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final SceneryContent sceneryContent;
        ImageContent imageContent;
        Bitmap bitmap;
        SceneryContent sceneryContent2;
        ImageContent imageContent2;
        int i;
        super.onViewCreated(view);
        Context contextLJII = C1834150xpV.LJII(((View) this.LLJJIII.getValue()).getContext());
        View view2 = (View) this.LLJJIII.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ey_, contextLJII));
        view2.setBackground(gradientDrawable);
        C723850SaN.LIZLLL(this, new C1134904cF(this));
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xQS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1735840vGw) obj).LLILLJJLI);
            }
        }, null, new C1818240xPq(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0O1f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612620O1c) obj).LLILLJJLI;
            }
        }, null, new C1818410xQ7(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0xQr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1818830xQn) obj).LLILLJJLI;
            }
        }, null, new C1818530xQJ(this), 6);
        SceneryLayoutTypeViewModel sceneryLayoutTypeViewModel = (SceneryLayoutTypeViewModel) this.LLJJIJIIJIL.getValue();
        BoardItem boardItem = ((C1815530xLT) sceneryLayoutTypeViewModel.LL.getValue()).LL;
        ImageModel imageModel = null;
        if (boardItem != null && (sceneryContent2 = boardItem.sceneryContent) != null && (imageContent2 = sceneryContent2.imageContent) != null && imageContent2.image != null) {
            int i2 = sceneryContent2.sceneryType;
            if (i2 != 1 && i2 != 2) {
                i = 0;
            } else {
                i = 4;
            }
            sceneryContent2.imageTransition = i;
            sceneryLayoutTypeViewModel.setState(new C1818480xQE(sceneryContent2));
        }
        final SceneryPictureViewModel sceneryPictureViewModel = (SceneryPictureViewModel) this.LLJJIJIL.getValue();
        BoardItem boardItem2 = sceneryPictureViewModel.wQ2().LL;
        if (boardItem2 != null && (sceneryContent = boardItem2.sceneryContent) != null && (imageContent = sceneryContent.imageContent) != null && imageContent.image != null) {
            ImageContent imageContent3 = sceneryContent.imageContent;
            if (imageContent3 != null) {
                if (imageContent3.LIZ == null) {
                    if (imageContent3 != null) {
                        imageModel = imageContent3.image;
                    }
                } else {
                    if (imageContent3 == null || (bitmap = imageContent3.LIZ) == null) {
                        return;
                    }
                    sceneryPictureViewModel.withState(new C1818550xQL(sceneryPictureViewModel, bitmap));
                    return;
                }
            }
            C1121670fIL.LJ(imageModel).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xQK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SceneryPictureViewModel@1920.initialCurrentSceneryBoard$2$1");
                    Bitmap bitmap2 = (Bitmap) obj;
                    ImageContent imageContent4 = sceneryContent.imageContent;
                    if (imageContent4 != null) {
                        imageContent4.LIZ = bitmap2;
                    }
                    SceneryPictureViewModel sceneryPictureViewModel2 = sceneryPictureViewModel;
                    sceneryPictureViewModel2.getClass();
                    sceneryPictureViewModel2.withState(new C1818550xQL(sceneryPictureViewModel2, bitmap2));
                    C1C7U.LIZIZ("SceneryPictureViewModel@1920.initialCurrentSceneryBoard$2$1");
                }
            }, new C09JN() { // from class: X.00MN
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SceneryPictureViewModel@1920.initialCurrentSceneryBoard$2$2");
                    C1C7U.LIZIZ("SceneryPictureViewModel@1920.initialCurrentSceneryBoard$2$2");
                }
            });
        }
    }
}
