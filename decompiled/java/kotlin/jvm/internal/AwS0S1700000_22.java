package kotlin.jvm.internal;

import X.C09AY;
import X.C1444870nhd;
import X.C1DRG;
import android.app.Activity;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS0S1700000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1700000_22 awS0S1700000_22) {
        EditEffectAnchorManager editEffectAnchorManager = (EditEffectAnchorManager) awS0S1700000_22.l5;
        C1DRG c1drg = (C1DRG) awS0S1700000_22.l6;
        Boolean bool = (Boolean) awS0S1700000_22.l7;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS0S1700000_22.l1;
        String str = awS0S1700000_22.s0;
        C1444870nhd.LIZLLL(c1drg, (ComposerBeautyBuriedInfo) awS0S1700000_22.l3, (MBeautyStateInfo) awS0S1700000_22.l4, editEffectAnchorManager, shortVideoContext, bool, (Integer) awS0S1700000_22.l2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1700000_22 awS0S1700000_22) {
        EditEffectAnchorManager editEffectAnchorManager = (EditEffectAnchorManager) awS0S1700000_22.l5;
        C1DRG c1drg = (C1DRG) awS0S1700000_22.l6;
        Boolean bool = (Boolean) awS0S1700000_22.l7;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS0S1700000_22.l1;
        String str = awS0S1700000_22.s0;
        C1444870nhd.LIZLLL(c1drg, (ComposerBeautyBuriedInfo) awS0S1700000_22.l3, (MBeautyStateInfo) awS0S1700000_22.l4, editEffectAnchorManager, shortVideoContext, bool, (Integer) awS0S1700000_22.l2, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1700000_22(Activity activity, C1DRG c1drg, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo, EditEffectAnchorManager editEffectAnchorManager, ShortVideoContext shortVideoContext, Boolean bool, Integer num, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l1 = shortVideoContext;
        this.s0 = str2;
        this.l2 = num;
        this.l3 = composerBeautyBuriedInfo;
        this.l4 = mBeautyStateInfo;
        this.l5 = editEffectAnchorManager;
        this.l6 = c1drg;
        this.l7 = bool;
    }
}
