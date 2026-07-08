package com.ss.android.ugc.feed.platform.cell.component.stickermanager;

import X.C01GW;
import X.C0R9I;
import X.C0R9L;
import X.C1483410ohn;
import X.C299630Bon;
import X.C452501pT;
import X.C690230R5p;
import X.C692910RFx;
import X.C705920RmY;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CellStickerManagerTemp implements CellStickerComponentAbility {
    public final String LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public final C0R9I LLILLL;
    public final C692910RFx LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C690230R5p(this));
    public final C705920RmY LLILZLL;
    public Context LLIZ;
    public Fragment LLIZLLLIL;
    public C0R9L LLJ;
    public Aweme LLJI;
    public BaseFeedPageParams LLJIJIL;
    public ViewGroup LLJILJIL;

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void BT() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void LLLLIL(Aweme aweme) {
    }

    public final boolean LIZIZ() {
        BaseFeedPageParams baseFeedPageParams = this.LLJIJIL;
        return (baseFeedPageParams == null || baseFeedPageParams.isPlayListCleanMode() || this.LLILZLL == null) ? false : true;
    }

    public final void LIZ() {
        if (C299630Bon.LIZ() || Intrinsics.LJFF("cell_story", this.LL) || !LIZIZ()) {
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY != null) {
            c705920RmY.LJIIJ(this.LLJI);
        }
        C705920RmY c705920RmY2 = this.LLILZLL;
        if (c705920RmY2 != null) {
            c705920RmY2.LJFF = C1483410ohn.LJLJJI();
        }
        C705920RmY c705920RmY3 = this.LLILZLL;
        if (c705920RmY3 != null) {
            c705920RmY3.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void PQ() {
        AbsInteractStickerWidget absInteractStickerWidget;
        if (C299630Bon.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLILZIL.getValue();
            if (cellStickerComponentAbility != null) {
                cellStickerComponentAbility.PQ();
                return;
            }
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null || (absInteractStickerWidget = c705920RmY.LJIIJJI) == null) {
            return;
        }
        absInteractStickerWidget.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void Es(boolean z) {
        InteractStickerViewModel interactStickerViewModel;
        if (C299630Bon.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLILZIL.getValue();
            if (cellStickerComponentAbility != null) {
                cellStickerComponentAbility.Es(z);
                return;
            }
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null || c705920RmY.LJIIJJI == null || (interactStickerViewModel = c705920RmY.LJIIIIZZ) == null) {
            return;
        }
        interactStickerViewModel.wQ2(Boolean.valueOf(z), "interact_text_translate_status");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final boolean mZ1(long j) {
        Aweme aweme;
        List<InteractStickerStruct> interactStickerStructs;
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null || (aweme = c705920RmY.LIZIZ) == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
            return false;
        }
        Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
        while (it2.hasNext()) {
            List<NormalTrackTimeStamp> trackTimeStampCache = it2.next().getTrackTimeStampCache();
            if (trackTimeStampCache != null) {
                for (NormalTrackTimeStamp normalTrackTimeStamp : trackTimeStampCache) {
                    if (normalTrackTimeStamp.timeIsValid()) {
                        float f = j;
                        if (f >= normalTrackTimeStamp.getStartTime() && f <= normalTrackTimeStamp.getEndTime()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void tP(float f) {
        AbsInteractStickerWidget absInteractStickerWidget;
        if (C299630Bon.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLILZIL.getValue();
            if (cellStickerComponentAbility != null) {
                cellStickerComponentAbility.tP(f);
                return;
            }
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null || (absInteractStickerWidget = c705920RmY.LJIIJJI) == null) {
            return;
        }
        absInteractStickerWidget.LJIILL(f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void td(HashMap<String, String> map) {
        InteractStickerViewModel interactStickerViewModel;
        if (C299630Bon.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLILZIL.getValue();
            if (cellStickerComponentAbility != null) {
                cellStickerComponentAbility.td(map);
                return;
            }
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null || c705920RmY.LJIIJJI == null || (interactStickerViewModel = c705920RmY.LJIIIIZZ) == null) {
            return;
        }
        interactStickerViewModel.wQ2(map, "interact_text_translate_data");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility
    public final void UG(float f, float f2, int i) {
        if (C299630Bon.LIZ()) {
            CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLILZIL.getValue();
            if (cellStickerComponentAbility != null) {
                cellStickerComponentAbility.UG(f, f2, i);
                return;
            }
            return;
        }
        C705920RmY c705920RmY = this.LLILZLL;
        if (c705920RmY == null) {
            return;
        }
        c705920RmY.LJI(f, f2, i);
    }

    public CellStickerManagerTemp(String str, InterfaceC665370Q7z interfaceC665370Q7z, C0R9I c0r9i, C692910RFx c692910RFx) {
        this.LL = str;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = c0r9i;
        this.LLILZ = c692910RFx;
        this.LLILZLL = new C705920RmY(c0r9i);
    }
}
