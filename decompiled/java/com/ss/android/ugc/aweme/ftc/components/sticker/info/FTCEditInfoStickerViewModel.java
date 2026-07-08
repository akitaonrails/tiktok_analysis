package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.C01GW;
import X.C0IKQ;
import X.C121I;
import X.C121W;
import X.C121Y;
import X.C121Z;
import X.C122F;
import X.C122G;
import X.C194561119z;
import X.C196880121e;
import X.C352130DrH;
import X.C391130FVf;
import X.C452501pT;
import X.InterfaceC1444160ngU;
import X.InterfaceC1452170ntP;
import X.InterfaceC1460770o7H;
import Y.ARunnableS10S0202000_29;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditInfoStickerViewModel extends LifecycleAwareViewModel<FTCEditInfoStickerState> implements InterfaceC1460770o7H {
    public static final int LLIZLLLIL = 8;
    public C121Y LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 109));

    @Override // X.InterfaceC1460770o7H
    public void LJJJLZIJ() {
        setState(AFwS273S0000000_29.get$arr$(49));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditInfoStickerState zQ2() {
        return new FTCEditInfoStickerState(new C194561119z(), null, null, null, null, null, null);
    }

    public final C121Y kR2() {
        C121Y c121y = this.LLILZLL;
        if (c121y != null) {
            return c121y;
        }
        return null;
    }

    public final C121W lR2() {
        return (C121W) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1460770o7H
    public void show() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(51));
    }

    @Override // X.InterfaceC1460770o7H
    public void u1() {
        setStateImmediate(AFwS273S0000000_29.get$arr$(50));
    }

    @Override // X.InterfaceC1460770o7H
    public boolean B8() {
        C121Z c121z = kR2().LLLIILIL().LLILLL;
        if (c121z != null) {
            return c121z.LLJJIJI;
        }
        return false;
    }

    @Override // X.InterfaceC1460770o7H
    public InterfaceC1444160ngU LJJIFFI() {
        return kR2().LLLIILIL();
    }

    @Override // X.InterfaceC1460770o7H
    public void Nm() {
        C196880121e c196880121e;
        C121Z c121z = kR2().LLLIILIL().LLILLL;
        if (c121z == null || (c196880121e = c121z.LLILZIL) == null || C0IKQ.LIZ(c196880121e.LIZ)) {
            return;
        }
        Iterator it2 = ((ArrayList) c196880121e.LIZ).iterator();
        if (!it2.hasNext()) {
            c196880121e.LIZIZ = null;
            return;
        }
        Object next = it2.next();
        C352130DrH.LIZIZ(c196880121e.LIZJ).LJIIIZ();
        next.getClass();
        throw null;
    }

    @Override // X.InterfaceC1460770o7H
    public Object X7() {
        return kR2().LLLIILIL().LLL;
    }

    @Override // X.InterfaceC1460770o7H
    public void pausePlay() {
        C121W c121wLLLIILIL = kR2().LLLIILIL();
        if (c121wLLLIILIL.LLJJJJLIIL) {
            c121wLLLIILIL.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1460770o7H
    public boolean ub() {
        C121Z c121z = kR2().LLLIILIL().LLILLL;
        if (c121z != null) {
            return c121z.LLJJIJIIJIL;
        }
        return false;
    }

    public final void Ci1(StickerItemModel stickerItemModel) {
        setState(new AwS608S0100000_29(stickerItemModel, 89));
    }

    @Override // X.InterfaceC1460770o7H
    public void Qq(C121I<?> c121i) {
        kR2().LLLIILIL().LJII(true, c121i);
    }

    @Override // X.InterfaceC1460770o7H
    public void l0(Pair<Integer, Integer> pair) {
        setState(new AwS608S0100000_29(pair, (Pair<Integer, Integer>) 90));
    }

    @Override // X.InterfaceC1460770o7H
    public void l7(C121I<?> c121i) {
        kR2().LLLIILIL().LJIIIIZZ(c121i, 0);
    }

    public final void mR2(C121Y c121y) {
        this.LLILZLL = c121y;
    }

    @Override // X.InterfaceC1460770o7H
    public void v7(boolean z) {
        C196880121e c196880121e;
        C121Z c121z = kR2().LLLIILIL().LLILLL;
        if (c121z != null) {
            c121z.LLILZLL = z;
            if (!z && (c196880121e = c121z.LLILZIL) != null && c196880121e.LIZIZ != null) {
                c196880121e.LIZ();
                c121z.LLJJJIL.LJII();
                FTCStickerHintTextViewModel fTCStickerHintTextViewModel = c121z.LLILZIL.LIZLLL;
                if (fTCStickerHintTextViewModel != null) {
                    if (fTCStickerHintTextViewModel.LL == null) {
                        fTCStickerHintTextViewModel.LL = new MutableLiveData<>();
                    }
                    fTCStickerHintTextViewModel.LL.postValue(Boolean.TRUE);
                }
                c121z.invalidate();
            }
        }
    }

    public final void Oi2(float f, long j) {
        setState(new C122F(f, j));
    }

    @Override // X.InterfaceC1460770o7H
    public void v1(int i, boolean z) {
        C121Z c121z;
        C121W c121wLR2 = lR2();
        VideoPublishEditModel videoPublishEditModel = c121wLR2.LLJJIJIIJIL;
        if (videoPublishEditModel != null && videoPublishEditModel.getInfoStickerModel() != null && !C0IKQ.LIZ(c121wLR2.LLJJIJIIJIL.getInfoStickerModel().stickers)) {
            for (StickerItemModel stickerItemModel : c121wLR2.LLJJIJIIJIL.getInfoStickerModel().stickers) {
                Pair<Integer, Integer> pairLIZ = C391130FVf.LIZ(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i);
                stickerItemModel.uiStartTime = pairLIZ.getFirst().intValue();
                stickerItemModel.uiEndTime = pairLIZ.getSecond().intValue();
                InterfaceC1452170ntP interfaceC1452170ntP = c121wLR2.LLJJIII;
                if (interfaceC1452170ntP != null) {
                    stickerItemModel.startTime = interfaceC1452170ntP.Te(pairLIZ.getFirst().intValue());
                    stickerItemModel.endTime = c121wLR2.LLJJIII.Te(pairLIZ.getSecond().intValue());
                }
            }
        }
        if (z && (c121z = lR2().LLILLL) != null) {
            Iterator it2 = ((ArrayList) c121z.LLILZIL.LIZ).iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw null;
            }
        }
    }

    public final void Rg2(float f, float f2, float f3) {
        setState(new C122G(f, f2, f3));
    }

    @Override // X.InterfaceC1460770o7H
    public void a6(int i, int i2, int[] iArr) {
        C121W c121wLLLIILIL = kR2().LLLIILIL();
        if (c121wLLLIILIL.LLJJIII != null) {
            HandlerHook.viewPost(c121wLLLIILIL.LLJL, new ARunnableS10S0202000_29(c121wLLLIILIL, i, i2, iArr, 1));
        }
    }
}
