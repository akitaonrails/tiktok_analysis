package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C09AY;
import X.C13LE;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C444200HbO;
import X.C645520PTq;
import X.C649470Pdh;
import X.C651830PhV;
import X.C653450Pk7;
import X.C677830QiL;
import X.EnumC645530PTr;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.imagelist.SearchNimbleImageListAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS150S0101000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachBTM: ");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append(", ");
        sbLIZ.append((LifecycleOwner) awS150S0101000_10.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: Mix-Page-Scroll: onScrolled-dy=");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append("-offset=");
        sbLIZ.append(((MixFloatingLayerAssem) awS150S0101000_10.l0).LLJLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS150S0101000_10 awS150S0101000_10) {
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) awS150S0101000_10.l0;
        searchTakoCardAssem.LLLLII = false;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) searchTakoCardAssem.LLJLL.getValue();
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.kC0(awS150S0101000_10.i1);
        }
        ((SearchTakoCardAssem) awS150S0101000_10.l0).yp();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS150S0101000_10 awS150S0101000_10) {
        AbstractC21673619ry<?> abstractC21673619ry = ((C653450Pk7) awS150S0101000_10.l0).LIZ;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.notifyItemChanged(awS150S0101000_10.i1);
        }
        AwS589S0100000_10 awS589S0100000_10 = ((C653450Pk7) awS150S0101000_10.l0).LIZLLL;
        if (awS589S0100000_10 != null) {
            awS589S0100000_10.invoke(Integer.valueOf(awS150S0101000_10.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] widgetsMap PUT (add): biz_type=");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append(", item_id=");
        sbLIZ.append(((SearchBffItem) awS150S0101000_10.l0).id);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] widgetsMap REMOVE: biz_type=");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append(", item_id=");
        sbLIZ.append(((SearchBffItem) awS150S0101000_10.l0).id);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS150S0101000_10 awS150S0101000_10) {
        String imageSource;
        ImageData imageData = (ImageData) C444200HbO.LIZ(awS150S0101000_10.i1, ((SearchNimbleImageListAssem) awS150S0101000_10.l0).tp());
        if (imageData == null || (imageSource = imageData.getImageSource()) == null) {
            imageSource = "";
        }
        return C2097908Jt.LIZJ(new Pair("image_source", imageSource));
    }

    public static final Object invoke$5(AwS150S0101000_10 awS150S0101000_10) {
        C645520PTq value = ((ClickSearchViewModel) awS150S0101000_10.l0).xQ2().getValue();
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value.LIZIZ == EnumC645530PTr.DATA_FETCHING && awS150S0101000_10.i1 == value.LIZ) {
            ((ClickSearchViewModel) awS150S0101000_10.l0).xQ2().setValue(new C645520PTq(awS150S0101000_10.i1, EnumC645530PTr.FINISHED));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$6(AwS150S0101000_10 awS150S0101000_10) {
        C645520PTq value = ((ClickSearchViewModel) awS150S0101000_10.l0).xQ2().getValue();
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value.LIZIZ == EnumC645530PTr.DATA_FETCHING && awS150S0101000_10.i1 == value.LIZ) {
            ((ClickSearchViewModel) awS150S0101000_10.l0).xQ2().setValue(new C645520PTq(awS150S0101000_10.i1, EnumC645530PTr.FINISHED));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$7(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: onComplete: unexpected state ");
        sbLIZ.append(C13LE.LIZ(((C677830QiL) awS150S0101000_10.l0).getClass()).LJI());
        sbLIZ.append(" with chunkIndex=");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append(", update to Success");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS150S0101000_10 awS150S0101000_10) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: onComplete fallback: state=");
        sbLIZ.append(C13LE.LIZ(((C677830QiL) awS150S0101000_10.l0).getClass()).LJI());
        sbLIZ.append(" with chunkIndex=");
        sbLIZ.append(awS150S0101000_10.i1);
        sbLIZ.append(", update to Success");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS150S0101000_10 awS150S0101000_10) {
        int i;
        if (!C649470Pdh.LJIJ(awS150S0101000_10.i1) && (i = awS150S0101000_10.i1) != 16 && i != 15 && !C649470Pdh.LJJII(i) && !C651830PhV.LJI(Integer.valueOf(awS150S0101000_10.i1))) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) awS150S0101000_10.l0;
            if (viewHolder instanceof SearchCardViewHolder) {
                return ((SearchCardViewHolder) viewHolder).LLILZLL.getClass().getSimpleName();
            }
            return Integer.valueOf(awS150S0101000_10.i1);
        }
        return "lynx";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(int i, LifecycleOwner lifecycleOwner, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(int i, SearchBffItem searchBffItem, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchBffItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(int i, MixFloatingLayerAssem mixFloatingLayerAssem, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = mixFloatingLayerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS150S0101000_10(C653450Pk7 c653450Pk7, C653450Pk7<Object> c653450Pk72, int i) {
        super(0);
        this.$t = i;
        this.l0 = c653450Pk7;
        this.i1 = c653450Pk72;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(C677830QiL c677830QiL, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c677830QiL;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = viewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(SearchTakoCardAssem searchTakoCardAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = searchTakoCardAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(SearchNimbleImageListAssem searchNimbleImageListAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = searchNimbleImageListAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0101000_10(ClickSearchViewModel clickSearchViewModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = clickSearchViewModel;
        this.i1 = i;
    }
}
