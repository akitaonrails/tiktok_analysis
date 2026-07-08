package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell;

import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C09JN;
import X.C09R3;
import X.C0GZW;
import X.C0ZP4;
import X.C1121670fIL;
import X.C1157010gDL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C11S5;
import X.C1324610kZf;
import X.C13LE;
import X.C14KS;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C1819620xS4;
import X.C1828330xg7;
import X.C1828340xg8;
import X.C1828350xg9;
import X.C1828360xgA;
import X.C1828370xgB;
import X.C1828380xgC;
import X.C1828390xgD;
import X.C1828400xgE;
import X.C1828410xgF;
import X.C1828420xgG;
import X.C1828430xgH;
import X.C1828440xgI;
import X.C1828450xgJ;
import X.C1828460xgK;
import X.C1828470xgL;
import X.C1828480xgM;
import X.C1828490xgN;
import X.C1828500xgO;
import X.C1828510xgP;
import X.C1828520xgQ;
import X.C1828530xgR;
import X.C1828540xgS;
import X.C1828550xgT;
import X.C1828560xgU;
import X.C1828570xgV;
import X.C1828580xgW;
import X.C1828590xgX;
import X.C1828600xgY;
import X.C1828610xgZ;
import X.C1828620xga;
import X.C1828630xgb;
import X.C1828640xgc;
import X.C1828650xgd;
import X.C1828660xge;
import X.C1828670xgf;
import X.C1828680xgg;
import X.C1828690xgh;
import X.C1828700xgi;
import X.C1828710xgj;
import X.C1828720xgk;
import X.C1828730xgl;
import X.C1828740xgm;
import X.C1828750xgn;
import X.C1828760xgo;
import X.C1828770xgp;
import X.C1828780xgq;
import X.C1828790xgr;
import X.C1828800xgs;
import X.C1828810xgt;
import X.C1828820xgu;
import X.C1828830xgv;
import X.C1828840xgw;
import X.C1828850xgx;
import X.C1828860xgy;
import X.C1828870xgz;
import X.C1828880xh0;
import X.C1828890xh1;
import X.C1828900xh2;
import X.C1828910xh3;
import X.C1828920xh4;
import X.C1828930xh5;
import X.C1828940xh6;
import X.C1828950xh7;
import X.C1828960xh8;
import X.C1828970xh9;
import X.C1828980xhA;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19R6;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
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
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouDecorationCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentTemplateForYouDecorationCell extends PowerCell<C1157010gDL> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public C11JF LLILZ;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public RichTextPreviewView LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(new C1828960xh8(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1828860xgy(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1828340xg8(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1828870xgz(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentTemplateForYouDecorationCell.class, "intelligentBoardTemplatePreviewViewModel", "getIntelligentBoardTemplatePreviewViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/intelligent/vm/IntelligentBoardTemplatePreviewViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IntelligentTemplateForYouDecorationCell.class, "boardsPageViewModel", "getBoardsPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public IntelligentTemplateForYouDecorationCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IntelligentBoardTemplatePreviewViewModel.class);
        C1828410xgF c1828410xgF = new C1828410xgF(c19719912DlLIZ);
        C1828970xh9 c1828970xh9 = new C1828970xh9();
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new C1828910xh3(c19719912DlLIZ), c1828410xgF, new C1828770xgp(), new C1828590xgX(this), new C1828440xgI(this), new C1828830xgv(this), c1828970xh9, new C1828370xgB(this), null, new C1828460xgK(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1828540xgS c1828540xgS = new C1828540xgS(this);
            C1828810xgt c1828810xgt = new C1828810xgt(this);
            C1828900xh2 c1828900xh2 = new C1828900xh2(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1828720xgk((InterfaceC451590HnJ) obj, c1828540xgS));
            C1828620xga c1828620xga = new C1828620xga(c01gwLIZIZ);
            C1828630xgb c1828630xgb = new C1828630xgb(c01gwLIZIZ);
            C1828640xgc c1828640xgc = new C1828640xgc(c01gwLIZIZ);
            C1828650xgd c1828650xgd = new C1828650xgd(c01gwLIZIZ);
            C1828660xge c1828660xge = new C1828660xge(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1828900xh2, c1828410xgF, new C452080Ho6(), c1828620xga, c1828630xgb, c1828810xgt, c1828970xh9, c1828640xgc, c1828650xgd, c1828660xge);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1828920xh4(c19719912DlLIZ), c1828410xgF, new C1828760xgo(), new C1828600xgY(this), new C1828530xgR(this), new C1828850xgx(this), c1828970xh9, new C1828350xg9(this), null, new C1828470xgL(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1828940xh6(c19719912DlLIZ), c1828410xgF, new C1828780xgq(), new C1828570xgV(this), new C1828510xgP(this), new C1828480xgM(this), c1828970xh9, null, null, new C1828380xgC(this));
        }
        this.LLILZLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LiveBoardsPageViewModel.class);
        C1828390xgD c1828390xgD = new C1828390xgD(c19719912DlLIZ2);
        C1828980xhA c1828980xhA = new C1828980xhA();
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new C1828890xh1(c19719912DlLIZ2), c1828390xgD, new C1828750xgn(), new C1828580xgW(this), new C1828430xgH(this), new C1828820xgu(this), c1828980xhA, new C1828360xgA(this), null, new C1828450xgJ(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1828560xgU c1828560xgU = new C1828560xgU(this);
            C1828840xgw c1828840xgw = new C1828840xgw(this);
            C1828930xh5 c1828930xh5 = new C1828930xh5(c19719912DlLIZ2);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C1828730xgl((InterfaceC451590HnJ) obj, c1828560xgU));
            C1828670xgf c1828670xgf = new C1828670xgf(c01gwLIZIZ2);
            C1828680xgg c1828680xgg = new C1828680xgg(c01gwLIZIZ2);
            C1828690xgh c1828690xgh = new C1828690xgh(c01gwLIZIZ2);
            C1828700xgi c1828700xgi = new C1828700xgi(c01gwLIZIZ2);
            C1828710xgj c1828710xgj = new C1828710xgj(c01gwLIZIZ2);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(c1828930xh5, c1828390xgD, new C452080Ho6(), c1828670xgf, c1828680xgg, c1828840xgw, c1828980xhA, c1828690xgh, c1828700xgi, c1828710xgj);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new C1828950xh7(c19719912DlLIZ2), c1828390xgD, new C1828790xgr(), new C1828610xgZ(this), new C1828520xgQ(this), new C1828800xgs(this), c1828980xhA, new C1828330xg7(this), null, new C1828420xgG(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new C1828880xh0(c19719912DlLIZ2), c1828390xgD, new C1828740xgm(), new C1828550xgT(this), new C1828490xgN(this), new C1828500xgO(this), c1828980xhA, null, null, new C1828400xgE(this));
        }
        this.LLIZ = assemVMLazy2;
    }

    public final IntelligentBoardTemplatePreviewViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (IntelligentBoardTemplatePreviewViewModel) assemVMLazy.getValue();
    }

    public final C0GZW L5() {
        return (C0GZW) this.LLILLL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewGroup.LayoutParams layoutParams = ((View) this.LL.getValue()).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = I5().LLILLJJLI;
            C786410Ut5.b7((RadiusLayout) this.LL.getValue(), layoutParams);
        }
        C500260Jjc.LJJZ((int) (((double) I5().LLILLJJLI) * 0.25d), L5());
        L5().LIZJ((int) C497740JfY.LIZIZ(12.0f), 0, (int) C497740JfY.LIZIZ(12.0f), 0);
        this.LLIZLLLIL = (RichTextPreviewView) this.itemView.findViewById(R.id.fhj);
        ((View) this.LLILLJJLI.getValue()).setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, this.itemView.getContext()));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xMQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1157010gDL item = this.LL.getItem();
                if (item != null) {
                    IntelligentTemplateForYouDecorationCell intelligentTemplateForYouDecorationCell = this.LL;
                    AssemVMLazy assemVMLazy = intelligentTemplateForYouDecorationCell.LLIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IntelligentTemplateForYouDecorationCell.LLJ;
                    assemVMLazy.getValue().setState(new C1816110xMP());
                    IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModelI5 = intelligentTemplateForYouDecorationCell.I5();
                    intelligentBoardTemplatePreviewViewModelI5.withState(new C1815570xLX(intelligentBoardTemplatePreviewViewModelI5, item));
                }
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        RichTextPreviewView richTextPreviewView = this.LLIZLLLIL;
        if (richTextPreviewView != null) {
            AnonymousClass0956 anonymousClass0956 = richTextPreviewView.LLILZLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            richTextPreviewView.LLIZ.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        BoardItem next;
        SceneryContent sceneryContent;
        SceneryContent sceneryContent2;
        C1157010gDL c1157010gDL = (C1157010gDL) interfaceC1891350zJl;
        super.onBindItemView(c1157010gDL);
        Board board = c1157010gDL.LL;
        List<ImageModel> list = board.previewImageList;
        if (list.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        final ImageContent imageContent = null;
        if (z) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 0));
            Boolean bool = Boolean.FALSE;
            c1324610kZfLJIIIZ.LJJ = bool;
            c1324610kZfLJIIIZ.LJJI((View) this.LLILLJJLI.getValue());
            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
            c1324610kZfLJIIIZ2.LJJ = bool;
            c1324610kZfLJIIIZ2.LJJI((View) this.LLILZIL.getValue());
            if (C497740JfY.LJJ()) {
                C19R6 c19r6 = (C19R6) this.LLILLJJLI.getValue();
                if (c19r6 != null) {
                    C786410Ut5.ec(c19r6);
                }
                C19R6 c19r62 = (C19R6) this.LLILZIL.getValue();
                if (c19r62 != null) {
                    C786410Ut5.ec(c19r62);
                }
            }
        }
        RichTextPreviewView richTextPreviewView = this.LLIZLLLIL;
        if (richTextPreviewView != null) {
            richTextPreviewView.h0(board, LifecycleOwnerKt.getLifecycleScope(this), -1, c1157010gDL.LLILLJJLI, "recommend_entrance");
        }
        Iterator<BoardItem> it2 = board.boardItemList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.boardItemType == 6) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BoardItem boardItem = next;
        if (boardItem != null && (sceneryContent2 = boardItem.sceneryContent) != null) {
            imageContent = sceneryContent2.imageContent;
        }
        C0GZW.LJIIIIZZ(L5());
        if (imageContent != null) {
            if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null && sceneryContent.sceneryType == 3) {
                C500260Jjc.LJJZ(((View) this.LL.getValue()).getLayoutParams().height, L5());
                L5().LIZLLL(false);
            } else {
                L5().LIZLLL(true);
                C500260Jjc.LJJZ((int) (((double) ((View) this.LL.getValue()).getLayoutParams().height) * 0.25d), L5());
            }
            Bitmap bitmap = imageContent.LIZ;
            if (bitmap != null) {
                L5().setImageDrawable(new BitmapDrawable(L5().getResources(), bitmap));
            } else {
                C11JF c11jf = this.LLILZ;
                if (c11jf != null && !c11jf.isDisposed() && c11jf != null) {
                    c11jf.dispose();
                }
                this.LLILZ = (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xII
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        BitmapDrawable bitmapDrawable;
                        C1C7U.LIZ("IntelligentTemplateForYouDecorationCell@2412.updateBackgroundImage$3");
                        imageContent.LIZ = (Bitmap) obj;
                        C0GZW c0gzwL5 = this.L5();
                        Bitmap bitmap2 = imageContent.LIZ;
                        if (bitmap2 != null) {
                            bitmapDrawable = new BitmapDrawable(this.L5().getResources(), bitmap2);
                        } else {
                            bitmapDrawable = null;
                        }
                        c0gzwL5.setImageDrawable(bitmapDrawable);
                        C1C7U.LIZIZ("IntelligentTemplateForYouDecorationCell@2412.updateBackgroundImage$3");
                    }
                }, new C09JN() { // from class: X.00M9
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("IntelligentTemplateForYouDecorationCell@2412.updateBackgroundImage$4");
                        C1C7U.LIZIZ("IntelligentTemplateForYouDecorationCell@2412.updateBackgroundImage$4");
                    }
                });
            }
            int iLJIIZILJ = I5().LLILLJJLI / C497740JfY.LJIIZILJ();
            C0GZW c0gzwL5 = L5();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzwL5);
            c0gzwL5.setTranslationY(-((c1157010gDL.LLILLJJLI / 100.0f) * C14KS.LIZLLL() * iLJIIZILJ));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h04, viewGroup, false);
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
