package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.cell;

import X.AnonymousClass0956;
import X.C011Z;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C09JN;
import X.C0GZW;
import X.C1121670fIL;
import X.C1157020gDM;
import X.C11JF;
import X.C11S5;
import X.C1324610kZf;
import X.C13LE;
import X.C14KS;
import X.C1701940uOG;
import X.C1815180xKu;
import X.C1819620xS4;
import X.C1819890xSV;
import X.C1819900xSW;
import X.C1819910xSX;
import X.C1819920xSY;
import X.C1819930xSZ;
import X.C1819940xSa;
import X.C1819950xSb;
import X.C1819960xSc;
import X.C1819970xSd;
import X.C1819980xSe;
import X.C1819990xSf;
import X.C1820000xSg;
import X.C1820010xSh;
import X.C1820020xSi;
import X.C1820030xSj;
import X.C1820040xSk;
import X.C1820050xSl;
import X.C1820060xSm;
import X.C1820070xSn;
import X.C1820080xSo;
import X.C1820090xSp;
import X.C1820100xSq;
import X.C1820200xT0;
import X.C1820210xT1;
import X.C1820220xT2;
import X.C1820250xT5;
import X.C1820260xT6;
import X.C1820270xT7;
import X.C1820280xT8;
import X.C1820290xT9;
import X.C1820300xTA;
import X.C1825500xbY;
import X.C1825520xba;
import X.C197039127h;
import X.C19719912Dl;
import X.C19R6;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C344370Del;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentDecorationBoardForYouPowerCell extends PowerCell<C1157020gDM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public C19R6 LL;
    public RichTextPreviewView LLILLJJLI;
    public C11JF LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1820040xSk(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1820050xSl(this));
    public C19R6 LLILZLL;
    public C1157020gDM LLIZ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentDecorationBoardForYouPowerCell.class, "intelligentBoardTemplatesPageViewModel", "getIntelligentBoardTemplatesPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/templates/intelligent/assems/vm/IntelligentBoardTemplateForYouListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.g0m;
    }

    public final IntelligentBoardTemplateForYouListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (IntelligentBoardTemplateForYouListViewModel) assemVMLazy.getValue();
    }

    public final C0GZW L5() {
        return (C0GZW) this.LLILZIL.getValue();
    }

    public IntelligentDecorationBoardForYouPowerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IntelligentBoardTemplateForYouListViewModel.class);
        C1819890xSV c1819890xSV = new C1819890xSV(c19719912DlLIZ);
        C1820100xSq c1820100xSq = new C1820100xSq();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1820060xSm(c19719912DlLIZ), c1819890xSV, new C1820200xT0(), new C1819980xSe(this), new C1819990xSf(this), new C1820020xSi(this), c1820100xSq, new C1825520xba(this), null, new C1820000xSg(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1819960xSc c1819960xSc = new C1819960xSc(this);
            C1820010xSh c1820010xSh = new C1820010xSh(this);
            C1820070xSn c1820070xSn = new C1820070xSn(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1820300xTA((InterfaceC451590HnJ) obj, c1819960xSc));
            C1820250xT5 c1820250xT5 = new C1820250xT5(c01gwLIZIZ);
            C1820260xT6 c1820260xT6 = new C1820260xT6(c01gwLIZIZ);
            C1820280xT8 c1820280xT8 = new C1820280xT8(c01gwLIZIZ);
            C1820290xT9 c1820290xT9 = new C1820290xT9(c01gwLIZIZ);
            C1820270xT7 c1820270xT7 = new C1820270xT7(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1820070xSn, c1819890xSV, new C452080Ho6(), c1820250xT5, c1820260xT6, c1820010xSh, c1820100xSq, c1820280xT8, c1820290xT9, c1820270xT7);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1820080xSo(c19719912DlLIZ), c1819890xSV, new C1820210xT1(), new C1819970xSd(this), new C1819940xSa(this), new C1820030xSj(this), c1820100xSq, new C1825500xbY(this), null, new C1819930xSZ(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1820090xSp(c19719912DlLIZ), c1819890xSV, new C1820220xT2(), new C1819950xSb(this), new C1819920xSY(this), new C1819900xSW(this), c1820100xSq, null, null, new C1819910xSX(this));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        L5().setMaskEnabled(true);
        L5().setFadeStartPercent(0.5f);
        L5().LIZJ((int) C497740JfY.LIZIZ(28.0f), 0, (int) C497740JfY.LIZIZ(28.0f), 0);
        this.LL = (C19R6) this.itemView.findViewById(R.id.c6k);
        this.LLILZLL = (C19R6) this.itemView.findViewById(R.id.c6l);
        this.LLILLJJLI = (RichTextPreviewView) this.itemView.findViewById(R.id.fhj);
        ((C197039127h) this.LLILZ.getValue()).LJJJJL(new C344370Del(new ContextThemeWrapper(this.itemView.getContext(), C011Z.LIZ.LJIIIZ())));
        C500260Jjc.LJLIIIL(500L, (View) this.LLILZ.getValue(), new C1815180xKu(this));
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = I5().LLILLL;
            layoutParams.height = I5().LLILLJJLI;
            C786410Ut5.W5(this.itemView, layoutParams);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        RichTextPreviewView richTextPreviewView = this.LLILLJJLI;
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
        C1157020gDM c1157020gDM = (C1157020gDM) interfaceC1891350zJl;
        super.onBindItemView(c1157020gDM);
        this.LLIZ = c1157020gDM;
        Board board = c1157020gDM.LL;
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
            c1324610kZfLJIIIZ.LJJI(this.LL);
            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ((ImageModel) ListProtector.get(list, 1));
            c1324610kZfLJIIIZ2.LJJ = bool;
            c1324610kZfLJIIIZ2.LJJI(this.LLILZLL);
            if (C497740JfY.LJJ()) {
                C19R6 c19r6 = this.LL;
                if (c19r6 != null) {
                    C786410Ut5.ec(c19r6);
                }
                C19R6 c19r62 = this.LLILZLL;
                if (c19r62 != null) {
                    C786410Ut5.ec(c19r62);
                }
            }
        }
        RichTextPreviewView richTextPreviewView = this.LLILLJJLI;
        if (richTextPreviewView != null) {
            richTextPreviewView.h0(board, LifecycleOwnerKt.getLifecycleScope(this), (int) c1157020gDM.LLILLJJLI, c1157020gDM.LLILLL, "recommend_panel");
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
                C500260Jjc.LJJZ(this.itemView.getLayoutParams().height, L5());
                L5().LIZLLL(false);
            } else {
                L5().LIZLLL(true);
                C500260Jjc.LJJZ((int) (((double) this.itemView.getLayoutParams().height) * 0.25d), L5());
            }
            Bitmap bitmap = imageContent.LIZ;
            if (bitmap != null) {
                L5().setImageDrawable(new BitmapDrawable(L5().getResources(), bitmap));
            } else {
                C11JF c11jf = this.LLILLL;
                if (c11jf != null && !c11jf.isDisposed() && c11jf != null) {
                    c11jf.dispose();
                }
                this.LLILLL = (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xIH
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        BitmapDrawable bitmapDrawable;
                        C1C7U.LIZ("IntelligentDecorationBoardForYouPowerCell@330c.updateBackgroundImage$3");
                        imageContent.LIZ = (Bitmap) obj;
                        C0GZW c0gzwL5 = this.L5();
                        Bitmap bitmap2 = imageContent.LIZ;
                        if (bitmap2 != null) {
                            bitmapDrawable = new BitmapDrawable(this.L5().getResources(), bitmap2);
                        } else {
                            bitmapDrawable = null;
                        }
                        c0gzwL5.setImageDrawable(bitmapDrawable);
                        C1C7U.LIZIZ("IntelligentDecorationBoardForYouPowerCell@330c.updateBackgroundImage$3");
                    }
                }, new C09JN() { // from class: X.00M6
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("IntelligentDecorationBoardForYouPowerCell@330c.updateBackgroundImage$4");
                        C1C7U.LIZIZ("IntelligentDecorationBoardForYouPowerCell@330c.updateBackgroundImage$4");
                    }
                });
            }
            C0GZW c0gzwL5 = L5();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzwL5);
            c0gzwL5.setTranslationY(-((c1157020gDM.LLILLL / 100.0f) * C14KS.LIZLLL() * (I5().LLILLL / C497740JfY.LJIIZILJ())));
        }
    }
}
