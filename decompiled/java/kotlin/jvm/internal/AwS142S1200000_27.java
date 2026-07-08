package kotlin.jvm.internal;

import X.C07Q4;
import X.C09AY;
import X.C1802050wzj;
import X.C1863380yae;
import X.C1863400yag;
import X.C2196701AyC;
import X.C287310BNx;
import X.C289470BWf;
import X.C844420XAq;
import com.ss.android.ugc.aweme.tako.botpage.components.imagelist.TakoImageListNewAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEnhancedItemInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import defpackage.w2;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS142S1200000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS142S1200000_27 awS142S1200000_27) {
        ((C1802050wzj) awS142S1200000_27.l1).LIZJ.LIZIZ();
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        c2196701AyC.getClass();
        C2196701AyC.LJJIII(c2196701AyC, "tm_win_reward_floating_widget_click", null, null, false, 14);
        ((C1802050wzj) awS142S1200000_27.l1).LIZ();
        ((Function1) awS142S1200000_27.l2).invoke(awS142S1200000_27.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS142S1200000_27 awS142S1200000_27) {
        if (awS142S1200000_27.s0.length() > 0) {
            TakoImageListNewAssem takoImageListNewAssem = (TakoImageListNewAssem) awS142S1200000_27.l1;
            String str = awS142S1200000_27.s0;
            BaseImage baseImage = (BaseImage) awS142S1200000_27.l2;
            takoImageListNewAssem.up(str, baseImage.imageUuid, baseImage);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS142S1200000_27 awS142S1200000_27) {
        List<Message> list;
        List<TakoVideoItem> list2;
        List<Message> list3;
        w2 w2VarLJI = C1863380yae.LJJII.LJI((Integer) awS142S1200000_27.l2, (Long) awS142S1200000_27.l1, null);
        if (w2VarLJI != null && (list3 = w2VarLJI.LIZIZ) != null) {
            Iterator<Message> it2 = list3.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILIIL.clear();
            }
        }
        if (((Boolean) C287310BNx.LIZ.getValue()).booleanValue()) {
            C1863400yag c1863400yag = C1863400yag.LIZ;
            String str = awS142S1200000_27.s0;
            c1863400yag.getClass();
            C1863400yag.LIZ(str);
            C844420XAq.LIZ = null;
        }
        if (C289470BWf.LIZ()) {
            w2 w2VarLJI2 = C1863380yae.LJJII.LJI((Integer) awS142S1200000_27.l2, (Long) awS142S1200000_27.l1, null);
            if (w2VarLJI2 != null && (list = w2VarLJI2.LIZIZ) != null) {
                Iterator<Message> it3 = list.iterator();
                while (it3.hasNext()) {
                    TakoMixFeed takoMixFeedLJIIIZ = it3.next().LJIIIZ();
                    if (takoMixFeedLJIIIZ != null) {
                        List<TakoVideoItem> list4 = takoMixFeedLJIIIZ.videoList;
                        if (list4 != null) {
                            Iterator<TakoVideoItem> it4 = list4.iterator();
                            while (it4.hasNext()) {
                                it4.next().LIZ = null;
                            }
                        }
                        List<TakoSourceItem> list5 = takoMixFeedLJIIIZ.sources;
                        if (list5 != null) {
                            Iterator<TakoSourceItem> it5 = list5.iterator();
                            while (it5.hasNext()) {
                                TakoVideoItem takoVideoItem = it5.next().video;
                                if (takoVideoItem != null) {
                                    takoVideoItem.LIZ = null;
                                }
                            }
                        }
                        TakoEnhancedItemInfo takoEnhancedItemInfo = takoMixFeedLJIIIZ.enhancedVideoItemInfo;
                        if (takoEnhancedItemInfo != null && (list2 = takoEnhancedItemInfo.videoList) != null) {
                            Iterator<TakoVideoItem> it6 = list2.iterator();
                            while (it6.hasNext()) {
                                it6.next().LIZ = null;
                            }
                        }
                    }
                }
            }
        }
        if (C07Q4.LIZ()) {
            C1863380yae.LJJIIZ.remove(awS142S1200000_27.s0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS142S1200000_27(C1802050wzj c1802050wzj, C1802050wzj c1802050wzj2, Function1<? super String, Unit> function1, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1802050wzj;
        this.l2 = c1802050wzj2;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1200000_27(Long l, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = l;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S1200000_27(String str, TakoImageListNewAssem takoImageListNewAssem, BaseImage baseImage, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = takoImageListNewAssem;
        this.l2 = baseImage;
    }
}
