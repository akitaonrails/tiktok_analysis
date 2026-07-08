package kotlin.jvm.internal;

import X.AbstractC1906720ziY;
import X.C038N;
import X.C09AY;
import X.C0AMV;
import X.C1485060okS;
import X.C15L2;
import X.C15QK;
import X.C19EG;
import X.C20600815jK;
import X.C20673215v0;
import X.C2188811AlT;
import X.C371410EhH;
import X.C786410Ut5;
import X.C908703gr;
import X.EnumC586570MzX;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS35S1100000_31;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuTextViewMoreCell;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionSearchListAssem;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioPlayer;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AwS180S1100000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS180S1100000_31 awS180S1100000_31) {
        if (((Boolean) C0AMV.LIZ.getValue()).booleanValue()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).Go();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewOnAttachStateChangeListenerC20604515jvGo, null);
            viewOnAttachStateChangeListenerC20604515jvGo.removeAllViewsInLayout();
        }
        ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).Go().LJIJI();
        ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).Go().LJIJJ();
        C20600815jK<InterfaceC1891350zJl> state = ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).Go().getState();
        if (state != null) {
            state.LJFF(null);
        }
        ((AbstractC1906720ziY) ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).LLJJ.getValue()).LLILZLL.LJFF(null);
        ((AbstractC1906720ziY) ((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1).LLJJI.getValue()).LLILZLL.LJFF(new ARunnableS35S1100000_31((VideoCaptionMentionSearchListAssem) awS180S1100000_31.l1, awS180S1100000_31.s0, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS180S1100000_31 awS180S1100000_31) {
        ReuseAudioPlayer reuseAudioPlayer = ((ReuseAudioViewModel) awS180S1100000_31.l1).LLIZ;
        if (reuseAudioPlayer != null) {
            C1485060okS c1485060okS = new C1485060okS();
            String str = awS180S1100000_31.s0;
            c1485060okS.LJI = true;
            c1485060okS.LIZ = str;
            reuseAudioPlayer.LL.LIZIZ(c1485060okS);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS180S1100000_31 awS180S1100000_31) {
        ((C15QK) awS180S1100000_31.l1).LLLLLILLIL(awS180S1100000_31.s0);
        ((C15QK) awS180S1100000_31.l1).LLLLLLJ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS180S1100000_31 awS180S1100000_31) {
        Map<String, Object> mapLIZ;
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SeaSkuTextViewMoreCell seaSkuTextViewMoreCell = (SeaSkuTextViewMoreCell) awS180S1100000_31.l1;
        String str = awS180S1100000_31.s0;
        C908703gr c908703gr = seaSkuTextViewMoreCell.L5().LLJILJILJ;
        if (c908703gr != null && (mapLIZIZ = c908703gr.LIZIZ()) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("product_id", seaSkuTextViewMoreCell.L5().getProductId());
        C908703gr c908703gr2 = seaSkuTextViewMoreCell.L5().LLJILJILJ;
        if (c908703gr2 != null) {
            mapLIZ = c908703gr2.LIZ("c14181.d25116");
        } else {
            mapLIZ = null;
        }
        C038N.LIZ(linkedHashMap, mapLIZ);
        return linkedHashMap;
    }

    public static final Object invoke$4(AwS180S1100000_31 awS180S1100000_31) {
        Map<String, Object> mapLIZ;
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SeaSkuTextViewMoreCell seaSkuTextViewMoreCell = (SeaSkuTextViewMoreCell) awS180S1100000_31.l1;
        String str = awS180S1100000_31.s0;
        C908703gr c908703gr = seaSkuTextViewMoreCell.L5().LLJILJILJ;
        if (c908703gr != null && (mapLIZIZ = c908703gr.LIZIZ()) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("product_id", seaSkuTextViewMoreCell.L5().getProductId());
        C908703gr c908703gr2 = seaSkuTextViewMoreCell.L5().LLJILJILJ;
        if (c908703gr2 != null) {
            mapLIZ = c908703gr2.LIZ("c14181.d25116");
        } else {
            mapLIZ = null;
        }
        C038N.LIZ(linkedHashMap, mapLIZ);
        return linkedHashMap;
    }

    public static final Object invoke$5(AwS180S1100000_31 awS180S1100000_31) {
        MatchCountDownAssem matchCountDownAssem = (MatchCountDownAssem) awS180S1100000_31.l1;
        if (matchCountDownAssem.LLLF > 5) {
            MatchCountDownAssem.yp(matchCountDownAssem, awS180S1100000_31.s0, EnumC586570MzX.HIGH_SCORE, true, false, 8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS180S1100000_31 awS180S1100000_31) {
        ((Function2) awS180S1100000_31.l1).invoke(awS180S1100000_31.s0, null);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS180S1100000_31 awS180S1100000_31) {
        if (!((Activity) awS180S1100000_31.l1).isFinishing() && !((Activity) awS180S1100000_31.l1).isDestroyed()) {
            C371410EhH.LIZJ(AFwS221S0000000_31.get$arr$(523));
            View viewLIZJ = C20673215v0.LIZJ(R.layout.c2t, (Activity) awS180S1100000_31.l1);
            View viewFindViewById = viewLIZJ.findViewById(R.id.y55);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.bp1);
            }
            ((TextView) viewLIZJ.findViewById(R.id.y5a)).setText(awS180S1100000_31.s0);
            Toast toast = new Toast((Activity) awS180S1100000_31.l1);
            toast.setGravity(17, 0, 0);
            toast.setDuration(0);
            toast.setView(viewLIZJ);
            C786410Ut5.re(toast);
            C15L2.LIZ = toast;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS180S1100000_31 awS180S1100000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageShowCallback ");
        sbLIZ.append(((PageInfo) awS180S1100000_31.l1) instanceof BcmPageInfo);
        sbLIZ.append(", pre=");
        sbLIZ.append(awS180S1100000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS180S1100000_31 awS180S1100000_31) {
        ((StoryThoughtAvatarCreationFragment) awS180S1100000_31.l1).aS(awS180S1100000_31.s0);
        ((StoryThoughtAvatarCreationFragment) awS180S1100000_31.l1).WR().MQ2("discard");
        C19EG activity = ((StoryThoughtAvatarCreationFragment) awS180S1100000_31.l1).getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(C15QK c15qk, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c15qk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(Activity activity, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(PageInfo pageInfo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = pageInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(MatchCountDownAssem matchCountDownAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = matchCountDownAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(SeaSkuTextViewMoreCell seaSkuTextViewMoreCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seaSkuTextViewMoreCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(VideoCaptionMentionSearchListAssem videoCaptionMentionSearchListAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoCaptionMentionSearchListAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(ReuseAudioViewModel reuseAudioViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = reuseAudioViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS180S1100000_31(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyThoughtAvatarCreationFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S1100000_31(Function2 function2, Function2<? super String, ? super LiveEffect, Unit> function22, String str) {
        super(0);
        this.$t = str;
        this.l1 = function2;
        this.s0 = function22;
    }
}
