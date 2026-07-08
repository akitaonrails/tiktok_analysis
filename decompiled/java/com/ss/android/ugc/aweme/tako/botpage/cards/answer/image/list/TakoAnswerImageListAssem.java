package com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list;

import X.C01GW;
import X.C05UQ;
import X.C09RD;
import X.C0Q4Y;
import X.C118300cf;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1683130ttv;
import X.C1697810uHb;
import X.C1856050yOp;
import X.C1856710yPt;
import X.C1856720yPu;
import X.C1864530ycV;
import X.C20600815jK;
import X.C2097608Jq;
import X.C306850C1b;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1856750yPx;
import X.InterfaceC1891350zJl;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewCellProtocol;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerImageListAssem extends ReusedUISlotAssem<TakoAnswerImageListAssem> implements InterfaceC712990Rxx<InterfaceC1856750yPx>, TakoContentPreviewCellProtocol, InterfaceC1146704e9 {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 708));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 709));
    public List<C1856720yPu> LLJLILLLLZIIL;
    public String LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fk0;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, this);
    }

    @Override // X.InterfaceC1361305Ul
    public final void W7(String str) {
        String str2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        RecyclerView.LayoutManager layoutManager;
        List<C1856720yPu> list = this.LLJLILLLLZIIL;
        if (list != null) {
            Iterator<C1856720yPu> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                BaseImage baseImage = it2.next().LLILLL;
                if (baseImage != null) {
                    str2 = baseImage.imageUuid;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    if (i >= 0 && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ) != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) != null) {
                        layoutManager.scrollToPosition(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // X.InterfaceC1361305Ul
    public final C05UQ Y8(String str) {
        return new C05UQ(16.0f, 16.0f, 16.0f, 16.0f);
    }

    @Override // X.InterfaceC1361305Ul
    public final C1683130ttv aa(String str) {
        PowerCell powerCell;
        String str2;
        BaseImage baseImage;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return null;
        }
        for (View view : new C09RD(viewOnAttachStateChangeListenerC20604515jv)) {
            RecyclerView.ViewHolder childViewHolder = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(view);
            if ((childViewHolder instanceof TakoAnswerImageListItemCell) && (powerCell = (PowerCell) childViewHolder) != null) {
                C1856720yPu c1856720yPu = (C1856720yPu) powerCell.getItem();
                if (c1856720yPu != null && (baseImage = c1856720yPu.LLILLL) != null) {
                    str2 = baseImage.imageUuid;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    View viewFindViewById = view.findViewById(R.id.x4h);
                    if (viewFindViewById != null) {
                        view = viewFindViewById;
                    }
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    return new C1683130ttv(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.x50);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoAnswerImageListItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864530ycV(this, 1));
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.bytedance.tux.icon.TuxIconView, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1856750yPx interfaceC1856750yPx) {
        ArrayList arrayList;
        C20600815jK<InterfaceC1891350zJl> state;
        Map<String, String> mapLJ;
        String str;
        C20600815jK<InterfaceC1891350zJl> state2;
        InterfaceC1856750yPx interfaceC1856750yPx2 = interfaceC1856750yPx;
        Pair pairLIZ = C306850C1b.LIZ(interfaceC1856750yPx2.LJJJJLI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(173)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(128)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            layoutParams.height = ((Number) pairLIZ.getSecond()).intValue();
            C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
        }
        List<BaseImage> imageData = interfaceC1856750yPx2.getImageData();
        ?? r9 = 0;
        if (imageData != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(imageData, 10));
            Iterator<BaseImage> it2 = imageData.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().imageId);
            }
        } else {
            arrayList = null;
        }
        String strValueOf = String.valueOf(arrayList);
        this.LLJLL = strValueOf;
        if (interfaceC1856750yPx2.LJLL()) {
            List<C1856720yPu> listOp = op(interfaceC1856750yPx2, interfaceC1856750yPx2.LJJJLZIJ());
            this.LLJLILLLLZIIL = listOp;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state2.LJIILL(listOp, null);
                return;
            }
            return;
        }
        if (interfaceC1856750yPx2.LL()) {
            List<BaseImage> imageData2 = interfaceC1856750yPx2.getImageData();
            if (imageData2 == null) {
                imageData2 = C13BV.INSTANCE;
            }
            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 429);
            int size = imageData2.size();
            if (size == 0) {
                awS606S0100000_27.invoke(C13BV.INSTANCE);
                return;
            }
            ArrayList arrayList2 = new ArrayList(size);
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(new C1856720yPu(interfaceC1856750yPx2, i2, (BaseImage) C1856050yOp.LIZ(i2, imageData2)));
            }
            C118300cf c118300cf = new C118300cf();
            for (BaseImage baseImage : imageData2) {
                int i3 = i + 1;
                if (i >= 0) {
                    BaseImage baseImage2 = baseImage;
                    ListProtector.set(arrayList2, i, new C1856720yPu(interfaceC1856750yPx2, i, baseImage2));
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLIL.getValue();
                    if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    List<String> list = baseImage2.thumbnailUrlList;
                    if (list == null || !(!list.isEmpty())) {
                        list = baseImage2.urlList;
                    }
                    String str2 = (String) C13LP.LJJJLL(list);
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                    if (Intrinsics.LJFF(list, baseImage2.thumbnailUrlList)) {
                        str = "tako_generate_multi_image_thumbnail";
                    } else {
                        str = "tako_generate_multi_image";
                    }
                    c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(str, mapLJ, (TuxIconView) r9, 12);
                    c1331670kl3LJIIIZ.LJJIIJ(new C1856710yPt(baseImage2, list, mapLJ, this, strValueOf, c118300cf, size, awS606S0100000_27, arrayList2));
                    i = i3;
                    r9 = 0;
                } else {
                    C1697810uHb.LJIJI();
                    throw r9;
                }
            }
            return;
        }
        List<C1856720yPu> listOp2 = op(interfaceC1856750yPx2, interfaceC1856750yPx2.LJJJLZIJ());
        this.LLJLILLLLZIIL = listOp2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null || (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) == null) {
            return;
        }
        state.LJIILL(listOp2, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1856750yPx interfaceC1856750yPx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1856750yPx interfaceC1856750yPx) {
    }

    public static final List<C1856720yPu> op(InterfaceC1856750yPx interfaceC1856750yPx, int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C1856720yPu(interfaceC1856750yPx, i2, new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null)));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1361305Ul
    public final void Of(String str, boolean z) {
        PowerCell powerCell;
        int i;
        BaseImage baseImage;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        for (View view : new C09RD(viewOnAttachStateChangeListenerC20604515jv)) {
            RecyclerView.ViewHolder childViewHolder = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(view);
            String str2 = null;
            if ((childViewHolder instanceof TakoAnswerImageListItemCell) && (powerCell = (PowerCell) childViewHolder) != null) {
                C1856720yPu c1856720yPu = (C1856720yPu) powerCell.getItem();
                if (c1856720yPu != null && (baseImage = c1856720yPu.LLILLL) != null) {
                    str2 = baseImage.imageUuid;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    C786410Ut5.LJLLLLLL(i, view);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
