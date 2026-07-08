package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.story.StoryEditFilterIndicatorState;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS14S0120000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS14S0120000_35 awS14S0120000_35, Object obj) {
        StoryEditFilterIndicatorState storyEditFilterIndicatorState = (StoryEditFilterIndicatorState) obj;
        return storyEditFilterIndicatorState.copy(awS14S0120000_35.z1, awS14S0120000_35.z2, (FilterBean) awS14S0120000_35.l0, storyEditFilterIndicatorState.ui);
    }

    public static final Object invoke$1(AwS14S0120000_35 awS14S0120000_35, Object obj) {
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return editFilterIndicatorState.copy(awS14S0120000_35.z1, awS14S0120000_35.z2, (FilterBean) awS14S0120000_35.l0, editFilterIndicatorState.ui);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0120000_35(FilterBean filterBean, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = filterBean;
    }
}
