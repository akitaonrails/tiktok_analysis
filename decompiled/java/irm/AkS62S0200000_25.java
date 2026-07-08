package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1351210lGZ;
import X.C1640780snc;
import X.C1654400t9a;
import X.C1659140tHE;
import X.C1674810tgV;
import X.EnumC992740bwO;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightsListItem;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import iyl.i3;
import kotlin.jvm.internal.AwS674S0100000_25;
import oyl.d0;

/* JADX INFO: loaded from: classes26.dex */
public class AkS62S0200000_25 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS62S0200000_25 akS62S0200000_25, View view) {
        C1640780snc c1640780snc;
        StickerSetCategory stickerSetCategory;
        if (((C1640780snc) akS62S0200000_25.l0).getAdapterPosition() != -1 && (stickerSetCategory = (c1640780snc = (C1640780snc) akS62S0200000_25.l0).LL) != null) {
            ((InterfaceC1631620sYq) akS62S0200000_25.l1).invoke(stickerSetCategory, Integer.valueOf(c1640780snc.LLILLL), c1640780snc.LLILLJJLI);
        }
    }

    public static final void LIZ$1(AkS62S0200000_25 akS62S0200000_25, View view) {
        i3 i3VarLJIILLIIL = ((C1659140tHE) akS62S0200000_25.l0).LJIILLIIL();
        if (i3VarLJIILLIIL != null && !((C1659140tHE) akS62S0200000_25.l0).LLIZLLLIL.LIZJ((C1654400t9a) akS62S0200000_25.l1, i3VarLJIILLIIL)) {
            ((C1659140tHE) akS62S0200000_25.l0).LJIILIIL(1);
            ((C1659140tHE) akS62S0200000_25.l0).LLIZLLLIL.LIZ((C1654400t9a) akS62S0200000_25.l1, i3VarLJIILLIIL.LLIZLLLIL, i3VarLJIILLIIL);
        }
    }

    public static final void LIZ$2(AkS62S0200000_25 akS62S0200000_25, View view) {
        HighlightsListItem highlightsListItem = (HighlightsListItem) akS62S0200000_25.l0;
        if (!((HighlightsListItem.CollectionListItem) highlightsListItem).isSelected) {
            ((C1674810tgV) akS62S0200000_25.l1).LLILLL.invoke(((HighlightsListItem.CollectionListItem) highlightsListItem).storyHighlightCollection);
        } else {
            ((C1674810tgV) akS62S0200000_25.l1).LLILZ.invoke(((HighlightsListItem.CollectionListItem) highlightsListItem).storyHighlightCollection);
        }
    }

    public static final void LIZ$3(AkS62S0200000_25 akS62S0200000_25, View view) {
        if (((d0) akS62S0200000_25.l0).getBatchViewStateListener().LIZIZ()) {
            new C1351210lGZ((Context) akS62S0200000_25.l1).LIZIZ(12, 120);
            d0 d0Var = (d0) akS62S0200000_25.l0;
            if (d0Var.LLIZ == 0) {
                d0Var.LJI(EnumC992740bwO.USER_CLICK);
            } else {
                d0Var.LIZJ();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS62S0200000_25(C1640780snc c1640780snc, AwS674S0100000_25 awS674S0100000_25, int i) {
        super(800L);
        this.$t = i;
        this.l0 = c1640780snc;
        this.l1 = awS674S0100000_25;
    }

    public AkS62S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
