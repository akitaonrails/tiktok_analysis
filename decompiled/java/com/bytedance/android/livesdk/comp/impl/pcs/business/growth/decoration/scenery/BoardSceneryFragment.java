package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C0JDJ;
import X.C0QSJ;
import X.C0TVI;
import X.C0ZP4;
import X.C1136704cX;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C13LP;
import X.C14K9;
import X.C1622206Wu;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C1777850wMh;
import X.C1817690xOx;
import X.C1818260xPs;
import X.C1818270xPt;
import X.C1818280xPu;
import X.C1818290xPv;
import X.C1818300xPw;
import X.C1818310xPx;
import X.C1818320xPy;
import X.C1818330xPz;
import X.C1818340xQ0;
import X.C1818350xQ1;
import X.C1818360xQ2;
import X.C1818370xQ3;
import X.C1818380xQ4;
import X.C1818390xQ5;
import X.C1818400xQ6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C465220IMe;
import X.C492810JUh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C780470UjV;
import X.C987103tV;
import X.DialogC780480UjW;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1814530xJr;
import X.InterfaceC1815490xLP;
import X.InterfaceC1815500xLQ;
import X.InterfaceC1815510xLR;
import X.InterfaceC1818450xQB;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.BackToEditPageEvent;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.ShowDecorationTopButtonsEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BoardSceneryFragment extends LiveDialogFragment implements InterfaceC724530SbT, C0JDJ, InterfaceC1815490xLP, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C1817690xOx LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiHELIOSA/OmE0Oio7PSd9LCAvJj0yPCwjJ2EgKyAiLD0qZgcjKD03GyYpJyohMQM+KCg+LSs4";
    public BoardItem LL;
    public DialogC780480UjW LLILZ;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public InterfaceC1815490xLP LLJ;
    public InterfaceC1815500xLQ LLJI;
    public InterfaceC1815510xLR LLJIJIL;
    public InterfaceC1818450xQB LLJILJIL;
    public int LLILLJJLI = 6;
    public String LLILLL = "";
    public final BoardSceneryFragment LLILZIL = this;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0xOx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BoardSceneryFragment.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BoardSceneryFragment.class, "sceneryLayoutTypeViewModel", "getSceneryLayoutTypeViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/typechunk/SceneryLayoutTypeViewModel;", 0), new C2217381BqS(BoardSceneryFragment.class, "sceneryModeOperationListViewModel", "getSceneryModeOperationListViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/operationbtm/viewmodel/SceneryModeOperationListViewModel;", 0)};
        LLJILJILJ = new Object() { // from class: X.0xOx
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1815490xLP.class) {
            this.LLJ = (InterfaceC1815490xLP) obj;
        } else if (cls == InterfaceC1815500xLQ.class) {
            this.LLJI = (InterfaceC1815500xLQ) obj;
        } else if (cls == InterfaceC1815510xLR.class) {
            this.LLJIJIL = (InterfaceC1815510xLR) obj;
        } else if (cls == InterfaceC1818450xQB.class) {
            this.LLJILJIL = (InterfaceC1818450xQB) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardSceneryScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1815490xLP.class) {
            return this.LLJ;
        }
        if (cls == InterfaceC1815500xLQ.class) {
            return this.LLJI;
        }
        if (cls == InterfaceC1815510xLR.class) {
            return this.LLJIJIL;
        }
        if (cls == InterfaceC1818450xQB.class) {
            return this.LLJILJIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSceneryScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSceneryScope.class);
        return arrayList;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1815490xLP.class) {
            this.LLJ = null;
        } else if (cls == InterfaceC1815500xLQ.class) {
            this.LLJI = null;
        } else if (cls == InterfaceC1815510xLR.class) {
            this.LLJIJIL = null;
        } else if (cls == InterfaceC1818450xQB.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public BoardSceneryFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryPictureViewModel.class);
        C1818270xPt c1818270xPt = new C1818270xPt(c19719912DlLIZ);
        C1818390xQ5 c1818390xQ5 = new C1818390xQ5();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1818270xPt, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1818330xPz(this), c1818390xQ5, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1818270xPt, new C1818340xQ0(this), c1818390xQ5, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1818270xPt, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1818350xQ1(this), c1818390xQ5, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SceneryLayoutTypeViewModel.class);
        C1818280xPu c1818280xPu = new C1818280xPu(c19719912DlLIZ2);
        C1818400xQ6 c1818400xQ6 = new C1818400xQ6();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1818280xPu, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new C1818360xQ2(this), c1818400xQ6, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1818280xPu, new C1818370xQ3(this), c1818400xQ6, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c1818280xPu, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1818290xPv(this), c1818400xQ6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SceneryModeOperationListViewModel.class);
        C1818260xPs c1818260xPs = new C1818260xPs(c19719912DlLIZ3);
        C1818380xQ4 c1818380xQ4 = new C1818380xQ4();
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c1818260xPs, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new C1818300xPw(this), c1818380xQ4, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c1818260xPs, new C1818310xPx(this), c1818380xQ4, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c1818260xPs, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1818320xPy(this), c1818380xQ4, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLIZLLLIL = assemVMLazy3;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g0t);
        c500980Jkm.LIZJ = R.style.ahl;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJFF = false;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        DialogC780480UjW dialogC780480UjW = this.LLILZ;
        if (dialogC780480UjW != null) {
            C500260Jjc.LJJLIIIJL(dialogC780480UjW);
        }
        Ek(this.LL, false);
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardSceneryScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLILZIL, InterfaceC1815490xLP.class);
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        c0qsjLIZIZ.unbindAbility(assemVMLazy.getValue(), InterfaceC1815500xLQ.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZ.getValue(), InterfaceC1815510xLR.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL.getValue(), InterfaceC1818450xQB.class);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardSceneryScope.class});
        c0qsjLIZIZ.bindAbility(this.LLILZIL, InterfaceC1815490xLP.class);
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        c0qsjLIZIZ.bindAbility(assemVMLazy.getValue(), InterfaceC1815500xLQ.class);
        c0qsjLIZIZ.bindAbility(this.LLIZ.getValue(), InterfaceC1815510xLR.class);
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL.getValue(), InterfaceC1818450xQB.class);
    }

    @Override // X.InterfaceC1815490xLP
    public final void qk(boolean z) {
        if (z) {
            if (this.LLILZ == null) {
                C780470UjV c780470UjV = new C780470UjV(getContext());
                c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
                this.LLILZ = c780470UjV.LIZ();
            }
            DialogC780480UjW dialogC780480UjW = this.LLILZ;
            if (dialogC780480UjW != null) {
                C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjW);
                return;
            }
            return;
        }
        DialogC780480UjW dialogC780480UjW2 = this.LLILZ;
        if (dialogC780480UjW2 == null) {
            return;
        }
        C500260Jjc.LJJLIIIJL(dialogC780480UjW2);
    }

    @Override // X.InterfaceC1815490xLP
    public final void Ek(BoardItem boardItem, boolean z) {
        boolean z2;
        SceneryContent sceneryContent;
        dismiss();
        if (z) {
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null) {
                if (boardItem != null && boardItem.boardItemType == 6 && ((sceneryContent = boardItem.sceneryContent) == null || sceneryContent.sceneryType == 0 || sceneryContent.imageContent == null)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boardsDisplayStateManager.LJIIJ(new C1777850wMh(false, z2, 1), boardItem);
            }
        } else {
            InterfaceC1814530xJr boardsDisplayStateManager2 = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager2 != null) {
                boardsDisplayStateManager2.LJIIJ(new C1777850wMh(false, false, 3), null);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(BackToEditPageEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(ShowDecorationTopButtonsEvent.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            final int paddingTop = view.getPaddingTop();
            final int paddingBottom = view.getPaddingBottom();
            final int paddingStart = view.getPaddingStart();
            final int paddingEnd = view.getPaddingEnd();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0xRH
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(paddingStart + c20244914JjLIZ.LIZ, paddingTop, paddingEnd + c20244914JjLIZ.LIZJ, paddingBottom + c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LJFF(-16777216);
        tuxImmersionBarLIZJ.LIZLLL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(ShowDecorationTopButtonsEvent.class, Boolean.FALSE);
        }
        C723850SaN.LIZ(this, false, null, new C1136704cX(this), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Context context;
        if (intent != null && i2 == 126 && i == 125 && (context = getContext()) != null) {
            AssemVMLazy assemVMLazy = this.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            SceneryPictureViewModel sceneryPictureViewModel = (SceneryPictureViewModel) assemVMLazy.getValue();
            LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) C13LP.LJJJLZIJ(0, ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).CA1(intent, "choose_photo"));
            if (liveSubMediaModel != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(sceneryPictureViewModel), null, null, new C492810JUh(sceneryPictureViewModel, context, liveSubMediaModel, null), 3);
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
