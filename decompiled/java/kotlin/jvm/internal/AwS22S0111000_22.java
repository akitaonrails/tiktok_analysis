package kotlin.jvm.internal;

import X.C09AY;
import X.C1412860ms0;
import X.C1413650mtH;
import X.C1413890mtf;
import X.C1727906ph;
import X.C375830EoP;
import X.C443120HZe;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS22S0111000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S0111000_22 awS22S0111000_22, Object obj) {
        StorySocialEventPrepareData storySocialEventPrepareData = (StorySocialEventPrepareData) obj;
        storySocialEventPrepareData.getEnterEditParam().setStoryStreakModel(new StoryStreakModel(awS22S0111000_22.i2, ((C1727906ph) awS22S0111000_22.l0).LIZLLL.getConversationId(), awS22S0111000_22.z1, true, 0, null, null, 0, 0));
        StorySocialEventStickerMobParam mobData = storySocialEventPrepareData.getEnterEditParam().getMobData();
        mobData.setShootWay("streaks_to_story");
        mobData.setEnterFrom("chat");
        mobData.setEnterMethod("milestone_popup_window");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S0111000_22 awS22S0111000_22, Object obj) {
        return C1413890mtf.LIZ((C1413890mtf) obj, null, null, null, false, null, null, null, null, null, new C1413650mtH(((C1412860ms0) awS22S0111000_22.l0).LIZ.getAsset_id(), ((C1412860ms0) awS22S0111000_22.l0).LIZ.getAsset_type()), new C375830EoP(new C443120HZe(Integer.valueOf(awS22S0111000_22.i2), (C1412860ms0) awS22S0111000_22.l0, Boolean.valueOf(awS22S0111000_22.z1))), null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, 134216191);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0111000_22(int i, C1412860ms0 c1412860ms0, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1412860ms0;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0111000_22(C1727906ph c1727906ph, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1727906ph;
        this.i2 = i;
        this.z1 = z;
    }
}
