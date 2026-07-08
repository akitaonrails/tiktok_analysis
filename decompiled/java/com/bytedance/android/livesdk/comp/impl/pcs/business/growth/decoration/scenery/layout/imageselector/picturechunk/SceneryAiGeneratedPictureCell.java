package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09JN;
import X.C09R3;
import X.C0ZP4;
import X.C1121670fIL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C11S5;
import X.C1322090kVb;
import X.C13LE;
import X.C13LP;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C1818760xQg;
import X.C1818790xQj;
import X.C1829000xhC;
import X.C1829010xhD;
import X.C1829020xhE;
import X.C1829030xhF;
import X.C1829040xhG;
import X.C1829050xhH;
import X.C1829060xhI;
import X.C1829070xhJ;
import X.C1829080xhK;
import X.C1829090xhL;
import X.C1829100xhM;
import X.C1829110xhN;
import X.C1829120xhO;
import X.C1829130xhP;
import X.C1829140xhQ;
import X.C1829150xhR;
import X.C1829160xhS;
import X.C1829170xhT;
import X.C1829180xhU;
import X.C1829190xhV;
import X.C1829200xhW;
import X.C1829210xhX;
import X.C1829220xhY;
import X.C1829230xhZ;
import X.C1829240xha;
import X.C1829250xhb;
import X.C1829260xhc;
import X.C1829270xhd;
import X.C1829280xhe;
import X.C1829290xhf;
import X.C1829300xhg;
import X.C1829310xhh;
import X.C1829320xhi;
import X.C1829330xhj;
import X.C1829340xhk;
import X.C1829350xhl;
import X.C1829360xhm;
import X.C1829370xhn;
import X.C1829380xho;
import X.C1829390xhp;
import X.C1829400xhq;
import X.C1829410xhr;
import X.C1829420xhs;
import X.C1829430xht;
import X.C1829440xhu;
import X.C1829450xhv;
import X.C1829460xhw;
import X.C1829470xhx;
import X.C1829480xhy;
import X.C1829490xhz;
import X.C1829500xi0;
import X.C1829510xi1;
import X.C1829520xi2;
import X.C1829530xi3;
import X.C1829540xi4;
import X.C1829550xi5;
import X.C1829560xi6;
import X.C1829570xi7;
import X.C1829580xi8;
import X.C1829590xi9;
import X.C1829600xiA;
import X.C1829610xiB;
import X.C1829620xiC;
import X.C1829630xiD;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryAiGeneratedPictureCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryAiGeneratedPictureCell extends PowerCell<C1818760xQg> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SceneryAiGeneratedPictureCell.class, "sceneryApplyViewModel", "getSceneryApplyViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/SceneryApplyViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SceneryAiGeneratedPictureCell.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SceneryAiGeneratedPictureCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryApplyViewModel.class);
        C1829070xhJ c1829070xhJ = new C1829070xhJ(c19719912DlLIZ);
        C1829630xiD c1829630xiD = new C1829630xiD();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new C1829550xi5(c19719912DlLIZ), c1829070xhJ, new C1829430xht(), new C1829250xhb(this), new C1829100xhM(this), new C1829480xhy(this), c1829630xiD, new C1829030xhF(this), null, new C1829120xhO(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1829200xhW c1829200xhW = new C1829200xhW(this);
            C1829460xhw c1829460xhw = new C1829460xhw(this);
            C1829540xi4 c1829540xi4 = new C1829540xi4(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1829380xho((InterfaceC451590HnJ) obj, c1829200xhW));
            C1829280xhe c1829280xhe = new C1829280xhe(c01gwLIZIZ);
            C1829290xhf c1829290xhf = new C1829290xhf(c01gwLIZIZ);
            C1829300xhg c1829300xhg = new C1829300xhg(c01gwLIZIZ);
            C1829310xhh c1829310xhh = new C1829310xhh(c01gwLIZIZ);
            C1829320xhi c1829320xhi = new C1829320xhi(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1829540xi4, c1829070xhJ, new C452080Ho6(), c1829280xhe, c1829290xhf, c1829460xhw, c1829630xiD, c1829300xhg, c1829310xhh, c1829320xhi);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1829560xi6(c19719912DlLIZ), c1829070xhJ, new C1829420xhs(), new C1829260xhc(this), new C1829180xhU(this), new C1829500xi0(this), c1829630xiD, new C1829010xhD(this), null, new C1829130xhP(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1829570xi7(c19719912DlLIZ), c1829070xhJ, new C1829440xhu(), new C1829230xhZ(this), new C1829160xhS(this), new C1829170xhT(this), c1829630xiD, null, null, new C1829040xhG(this));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SceneryPictureViewModel.class);
        C1829050xhH c1829050xhH = new C1829050xhH(c19719912DlLIZ2);
        C1829620xiC c1829620xiC = new C1829620xiC();
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new C1829590xi9(c19719912DlLIZ2), c1829050xhH, new C1829410xhr(), new C1829240xha(this), new C1829090xhL(this), new C1829470xhx(this), c1829620xiC, new C1829020xhE(this), null, new C1829110xhN(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1829220xhY c1829220xhY = new C1829220xhY(this);
            C1829490xhz c1829490xhz = new C1829490xhz(this);
            C1829600xiA c1829600xiA = new C1829600xiA(c19719912DlLIZ2);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C1829390xhp((InterfaceC451590HnJ) obj, c1829220xhY));
            C1829330xhj c1829330xhj = new C1829330xhj(c01gwLIZIZ2);
            C1829340xhk c1829340xhk = new C1829340xhk(c01gwLIZIZ2);
            C1829350xhl c1829350xhl = new C1829350xhl(c01gwLIZIZ2);
            C1829360xhm c1829360xhm = new C1829360xhm(c01gwLIZIZ2);
            C1829370xhn c1829370xhn = new C1829370xhn(c01gwLIZIZ2);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(c1829600xiA, c1829050xhH, new C452080Ho6(), c1829330xhj, c1829340xhk, c1829490xhz, c1829620xiC, c1829350xhl, c1829360xhm, c1829370xhn);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new C1829610xiB(c19719912DlLIZ2), c1829050xhH, new C1829450xhv(), new C1829270xhd(this), new C1829190xhV(this), new C1829510xi1(this), c1829620xiC, new C1829000xhC(this), null, new C1829080xhK(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new C1829580xi8(c19719912DlLIZ2), c1829050xhH, new C1829400xhq(), new C1829210xhX(this), new C1829140xhQ(this), new C1829150xhR(this), c1829620xiC, null, null, new C1829060xhI(this));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(new C1829520xi2(this));
        this.LLILZ = C452501pT.LIZIZ(new C1829530xi3(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.LLJJIJIL((LiveIconView) this.LLILLL.getValue(), 8);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xQY
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                C1818760xQg item;
                Bitmap bitmap;
                SceneryContent sceneryContent;
                ImageContent imageContent;
                if (view != null && (item = this.LLILZ.getItem()) != null && (bitmap = item.LLILLJJLI) != null) {
                    AssemVMLazy assemVMLazy = this.LLILZ.LLILLJJLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryAiGeneratedPictureCell.LLILZIL;
                    SceneryPictureViewModel sceneryPictureViewModel = (SceneryPictureViewModel) assemVMLazy.getValue();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_scenery_layout_editing_page");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(sceneryPictureViewModel.wQ2().LLILLL, "decoration_entrance");
                    c474500IjALIZ.LJJII("click", "action_type");
                    c474500IjALIZ.LJJII("picture", "click_position");
                    c474500IjALIZ.LJJII("recommend", "clicked_scenery_type");
                    c474500IjALIZ.LIZ();
                    SceneryPictureViewModel sceneryPictureViewModel2 = (SceneryPictureViewModel) this.LLILZ.LLILLJJLI.getValue();
                    sceneryPictureViewModel2.withState(new C1818550xQL(sceneryPictureViewModel2, bitmap));
                    BoardItem boardItem = ((SceneryApplyViewModel) this.LLILZ.LL.getValue()).vQ2().LL;
                    if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null && (imageContent = sceneryContent.imageContent) != null) {
                        imageContent.LIZ = bitmap;
                    }
                }
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SceneryContent sceneryContent;
        ImageContent imageContent;
        final C1818760xQg c1818760xQg = (C1818760xQg) interfaceC1891350zJl;
        if (c1818760xQg.LLILLJJLI != null) {
            ((C1322090kVb) this.LLILZ.getValue()).setImageDrawable(new BitmapDrawable(this.itemView.getContext().getResources(), c1818760xQg.LLILLJJLI));
            return;
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        final SceneryPictureViewModel sceneryPictureViewModel = (SceneryPictureViewModel) assemVMLazy.getValue();
        BoardItem boardItem = sceneryPictureViewModel.wQ2().LL;
        if (boardItem == null || boardItem.boardItemType != 6 || 1 == 0 || (sceneryContent = boardItem.sceneryContent) == null || (imageContent = sceneryContent.templateImageContent) == null) {
            return;
        }
        C11JF c11jf = sceneryPictureViewModel.LLILLJJLI;
        if (c11jf != null && (true ^ c11jf.isDisposed())) {
            c11jf.dispose();
        }
        sceneryPictureViewModel.LLILLJJLI = (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xQh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SceneryPictureViewModel@1920.loadAiGeneratedSceneryBoard$2$1$2");
                sceneryPictureViewModel.listRemoveItem(c1818760xQg);
                SceneryPictureViewModel sceneryPictureViewModel2 = sceneryPictureViewModel;
                C1818760xQg c1818760xQg2 = c1818760xQg;
                sceneryPictureViewModel2.listAddItem(new C1818760xQg(c1818760xQg2.LL, (Bitmap) obj, c1818760xQg2.LLILLL));
                C1C7U.LIZIZ("SceneryPictureViewModel@1920.loadAiGeneratedSceneryBoard$2$1$2");
            }
        }, new C09JN() { // from class: X.00MO
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SceneryPictureViewModel@1920.loadAiGeneratedSceneryBoard$2$1$3");
                C1C7U.LIZIZ("SceneryPictureViewModel@1920.loadAiGeneratedSceneryBoard$2$1$3");
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gy0, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1818760xQg c1818760xQg = (C1818760xQg) interfaceC1891350zJl;
        super.onBindItemView(c1818760xQg, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if ((objLJJJLZIJ instanceof C1818790xQj) && ((C1818790xQj) objLJJJLZIJ).LIZ && c1818760xQg.LLILLJJLI != null) {
            ((C1322090kVb) this.LLILZ.getValue()).setImageDrawable(new BitmapDrawable(this.itemView.getContext().getResources(), c1818760xQg.LLILLJJLI));
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
